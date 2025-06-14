package okhttp3.internal.p003ws;

/* loaded from: classes.dex */
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;
    private okhttp3.Call call;
    private java.util.concurrent.ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private java.util.concurrent.ScheduledExecutorService executor;
    private boolean failed;
    private final java.lang.String key;
    final okhttp3.WebSocketListener listener;
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue;
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;
    private final java.util.ArrayDeque<okio.ByteString> pongQueue;
    private long queueSize;
    private final java.util.Random random;
    private okhttp3.internal.p003ws.WebSocketReader reader;
    private int receivedCloseCode;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.p003ws.WebSocketWriter writer;
    private final java.lang.Runnable writerRunnable;


    final class CancelRunnable implements java.lang.Runnable {
        final /* synthetic */ okhttp3.internal.p003ws.RealWebSocket this$0;

        CancelRunnable(okhttp3.internal.p003ws.RealWebSocket r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r1.this$0
                r0.cancel()
                return
        }
    }

    static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final okio.ByteString reason;

        Close(int r1, okio.ByteString r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.reason = r2
                r0.cancelAfterCloseMillis = r3
                return
        }
    }

    static final class Message {
        final okio.ByteString data;
        final int formatOpcode;

        Message(int r1, okio.ByteString r2) {
                r0 = this;
                r0.<init>()
                r0.formatOpcode = r1
                r0.data = r2
                return
        }
    }

    private final class PingRunnable implements java.lang.Runnable {
        final /* synthetic */ okhttp3.internal.p003ws.RealWebSocket this$0;

        PingRunnable(okhttp3.internal.p003ws.RealWebSocket r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r1.this$0
                r0.writePingFrame()
                return
        }
    }

    public static abstract class Streams implements java.io.Closeable {
        public final boolean client;
        public final okio.BufferedSink sink;
        public final okio.BufferedSource source;

        public Streams(boolean r1, okio.BufferedSource r2, okio.BufferedSink r3) {
                r0 = this;
                r0.<init>()
                r0.client = r1
                r0.source = r2
                r0.sink = r3
                return
        }
    }

    static {
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.util.List r0 = java.util.Collections.singletonList(r0)
            okhttp3.internal.p003ws.RealWebSocket.ONLY_HTTP1 = r0
            return
    }

    public RealWebSocket(okhttp3.Request r3, okhttp3.WebSocketListener r4, java.util.Random r5, long r6) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.pongQueue = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.messageAndCloseQueue = r0
            r0 = -1
            r2.receivedCloseCode = r0
            java.lang.String r0 = "GET"
            java.lang.String r1 = r3.method()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            r2.originalRequest = r3
            r2.listener = r4
            r2.random = r5
            r2.pingIntervalMillis = r6
            r3 = 16
            byte[] r3 = new byte[r3]
            r5.nextBytes(r3)
            okio.ByteString r3 = okio.ByteString.m96of(r3)
            java.lang.String r3 = r3.base64()
            r2.key = r3
            okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0 r3 = new okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0
            r3.<init>(r2)
            r2.writerRunnable = r3
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Request must be GET: "
            r5.<init>(r6)
            java.lang.String r3 = r3.method()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private void runWriter() {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.executor
            if (r0 == 0) goto L9
            java.lang.Runnable r1 = r2.writerRunnable
            r0.execute(r1)
        L9:
            return
    }

    private synchronized boolean send(okio.ByteString r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L3c
            boolean r0 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Lb
            goto L3c
        Lb:
            long r2 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L22
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return r1
        L22:
            long r0 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            r6.runWriter()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            r7 = 1
            return r7
        L3c:
            monitor-exit(r6)
            return r1
        L3e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    void awaitTermination(int r4, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r3 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r3.executor
            long r1 = (long) r4
            r0.awaitTermination(r1, r5)
            return
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            r0.cancel()
            return
    }

    void checkUpgradeSuccess(okhttp3.Response r5, @javax.annotation.Nullable okhttp3.internal.connection.Exchange r6) throws java.io.IOException {
            r4 = this;
            int r0 = r5.code()
            r1 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = "'"
            if (r0 != r1) goto Lb1
            java.lang.String r0 = "Connection"
            java.lang.String r0 = r5.header(r0)
            java.lang.String r1 = "Upgrade"
            boolean r3 = r1.equalsIgnoreCase(r0)
            if (r3 == 0) goto L98
            java.lang.String r0 = r5.header(r1)
            java.lang.String r1 = "websocket"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L7f
            java.lang.String r0 = "Sec-WebSocket-Accept"
            java.lang.String r5 = r5.header(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.key
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            okio.ByteString r0 = okio.ByteString.encodeUtf8(r0)
            okio.ByteString r0 = r0.sha1()
            java.lang.String r0 = r0.base64()
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L5c
            if (r6 == 0) goto L54
            return
        L54:
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.String r6 = "Web Socket exchange missing: bad interceptor?"
            r5.<init>(r6)
            throw r5
        L5c:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected 'Sec-WebSocket-Accept' header value '"
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "' but was '"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L7f:
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Upgrade' header value 'websocket' but was '"
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L98:
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Connection' header value 'Upgrade' but was '"
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lb1:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected HTTP 101 response but was '"
            r0.<init>(r1)
            int r1 = r5.code()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r5 = r5.message()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okhttp3.WebSocket
    public boolean close(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r3 = r2.close(r3, r4, r0)
            return r3
    }

    synchronized boolean close(int r7, java.lang.String r8, long r9) {
            r6 = this;
            java.lang.String r0 = "reason.size() > 123: "
            monitor-enter(r6)
            okhttp3.internal.p003ws.WebSocketProtocol.validateCloseCode(r7)     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L2b
            okio.ByteString r1 = okio.ByteString.encodeUtf8(r8)     // Catch: java.lang.Throwable -> L4a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L4a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4a
            r4 = 123(0x7b, double:6.1E-322)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L18
            goto L2c
        L18:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r8 = r9.append(r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L4a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L4a
            throw r7     // Catch: java.lang.Throwable -> L4a
        L2b:
            r1 = 0
        L2c:
            boolean r8 = r6.failed     // Catch: java.lang.Throwable -> L4a
            if (r8 != 0) goto L47
            boolean r8 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L35
            goto L47
        L35:
            r8 = 1
            r6.enqueuedClose = r8     // Catch: java.lang.Throwable -> L4a
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.ws.RealWebSocket$Close r2 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r7, r1, r9)     // Catch: java.lang.Throwable -> L4a
            r0.add(r2)     // Catch: java.lang.Throwable -> L4a
            r6.runWriter()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r6)
            return r8
        L47:
            monitor-exit(r6)
            r7 = 0
            return r7
        L4a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public void connect(okhttp3.OkHttpClient r4) {
            r3 = this;
            okhttp3.OkHttpClient$Builder r4 = r4.newBuilder()
            okhttp3.EventListener r0 = okhttp3.EventListener.NONE
            okhttp3.OkHttpClient$Builder r4 = r4.eventListener(r0)
            java.util.List<okhttp3.Protocol> r0 = okhttp3.internal.p003ws.RealWebSocket.ONLY_HTTP1
            okhttp3.OkHttpClient$Builder r4 = r4.protocols(r0)
            okhttp3.OkHttpClient r4 = r4.build()
            okhttp3.Request r0 = r3.originalRequest
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r1 = "websocket"
            java.lang.String r2 = "Upgrade"
            okhttp3.Request$Builder r0 = r0.header(r2, r1)
            java.lang.String r1 = "Connection"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            java.lang.String r1 = "Sec-WebSocket-Key"
            java.lang.String r2 = r3.key
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            java.lang.String r1 = "Sec-WebSocket-Version"
            java.lang.String r2 = "13"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.internal.Internal r1 = okhttp3.internal.Internal.instance
            okhttp3.Call r4 = r1.newWebSocketCall(r4, r0)
            r3.call = r4
            okhttp3.internal.ws.RealWebSocket$1 r1 = new okhttp3.internal.ws.RealWebSocket$1
            r1.<init>(r3, r0)
            r4.enqueue(r1)
            return
    }

    public void failWebSocket(java.lang.Exception r4, @javax.annotation.Nullable okhttp3.Response r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            return
        L7:
            r0 = 1
            r3.failed = r0     // Catch: java.lang.Throwable -> L2d
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r3.streams = r1     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L17
            r2 = 0
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L2d
        L17:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L1e
            r1.shutdown()     // Catch: java.lang.Throwable -> L2d
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            okhttp3.WebSocketListener r1 = r3.listener     // Catch: java.lang.Throwable -> L28
            r1.onFailure(r3, r4, r5)     // Catch: java.lang.Throwable -> L28
            okhttp3.internal.Util.closeQuietly(r0)
            return
        L28:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly(r0)
            throw r4
        L2d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    public void initReaderAndWriter(java.lang.String r12, okhttp3.internal.ws.RealWebSocket.Streams r13) throws java.io.IOException {
            r11 = this;
            monitor-enter(r11)
            r11.streams = r13     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.ws.WebSocketWriter r0 = new okhttp3.internal.ws.WebSocketWriter     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r13.client     // Catch: java.lang.Throwable -> L4a
            okio.BufferedSink r2 = r13.sink     // Catch: java.lang.Throwable -> L4a
            java.util.Random r3 = r11.random     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L4a
            r11.writer = r0     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            java.util.concurrent.ThreadFactory r12 = okhttp3.internal.Util.threadFactory(r12, r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 1
            r4.<init>(r0, r12)     // Catch: java.lang.Throwable -> L4a
            r11.executor = r4     // Catch: java.lang.Throwable -> L4a
            long r0 = r11.pingIntervalMillis     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L32
            okhttp3.internal.ws.RealWebSocket$PingRunnable r5 = new okhttp3.internal.ws.RealWebSocket$PingRunnable     // Catch: java.lang.Throwable -> L4a
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L4a
            long r8 = r11.pingIntervalMillis     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4a
            r6 = r8
            r4.scheduleAtFixedRate(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L4a
        L32:
            java.util.ArrayDeque<java.lang.Object> r12 = r11.messageAndCloseQueue     // Catch: java.lang.Throwable -> L4a
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r12 != 0) goto L3d
            r11.runWriter()     // Catch: java.lang.Throwable -> L4a
        L3d:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.ws.WebSocketReader r12 = new okhttp3.internal.ws.WebSocketReader
            boolean r0 = r13.client
            okio.BufferedSource r13 = r13.source
            r12.<init>(r0, r13, r11)
            r11.reader = r12
            return
        L4a:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4a
            throw r12
    }

    /* renamed from: lambda$new$0$okhttp3-internal-ws-RealWebSocket, reason: not valid java name */
    /* synthetic */ void m356lambda$new$0$okhttp3internalwsRealWebSocket() {
            r2 = this;
        L0:
            boolean r0 = r2.writeOneFrame()     // Catch: java.io.IOException -> L7
            if (r0 == 0) goto Lc
            goto L0
        L7:
            r0 = move-exception
            r1 = 0
            r2.failWebSocket(r0, r1)
        Lc:
            return
    }

    public void loopReader() throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r2.receivedCloseCode
            r1 = -1
            if (r0 != r1) goto Lb
            okhttp3.internal.ws.WebSocketReader r0 = r2.reader
            r0.processNextFrame()
            goto L0
        Lb:
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int r4, java.lang.String r5) {
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L4c
            monitor-enter(r3)
            int r1 = r3.receivedCloseCode     // Catch: java.lang.Throwable -> L49
            if (r1 != r0) goto L41
            r3.receivedCloseCode = r4     // Catch: java.lang.Throwable -> L49
            r3.receivedCloseReason = r5     // Catch: java.lang.Throwable -> L49
            boolean r0 = r3.enqueuedClose     // Catch: java.lang.Throwable -> L49
            r1 = 0
            if (r0 == 0) goto L2b
            java.util.ArrayDeque<java.lang.Object> r0 = r3.messageAndCloseQueue     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L2b
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch: java.lang.Throwable -> L49
            r3.streams = r1     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L25
            r2 = 0
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L49
        L25:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch: java.lang.Throwable -> L49
            r1.shutdown()     // Catch: java.lang.Throwable -> L49
            r1 = r0
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            okhttp3.WebSocketListener r0 = r3.listener     // Catch: java.lang.Throwable -> L3c
            r0.onClosing(r3, r4, r5)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L38
            okhttp3.WebSocketListener r0 = r3.listener     // Catch: java.lang.Throwable -> L3c
            r0.onClosed(r3, r4, r5)     // Catch: java.lang.Throwable -> L3c
        L38:
            okhttp3.internal.Util.closeQuietly(r1)
            return
        L3c:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly(r1)
            throw r4
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "already closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            throw r4     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r4
        L4c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L22
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L12
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L12
            goto L22
        L12:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L24
            r0.add(r2)     // Catch: java.lang.Throwable -> L24
            r1.runWriter()     // Catch: java.lang.Throwable -> L24
            int r2 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return
        L22:
            monitor-exit(r1)
            return
        L24:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(okio.ByteString r1) {
            r0 = this;
            monitor-enter(r0)
            int r1 = r0.receivedPongCount     // Catch: java.lang.Throwable -> Lc
            int r1 = r1 + 1
            r0.receivedPongCount = r1     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r0.awaitingPong = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    synchronized boolean pong(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L1d
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            goto L1d
        L12:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L20
            r0.add(r2)     // Catch: java.lang.Throwable -> L20
            r1.runWriter()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)
            r2 = 1
            return r2
        L1d:
            monitor-exit(r1)
            r2 = 0
            return r2
        L20:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    boolean processNextFrame() throws java.io.IOException {
            r3 = this;
            r0 = 0
            okhttp3.internal.ws.WebSocketReader r1 = r3.reader     // Catch: java.lang.Exception -> Ld
            r1.processNextFrame()     // Catch: java.lang.Exception -> Ld
            int r1 = r3.receivedCloseCode     // Catch: java.lang.Exception -> Ld
            r2 = -1
            if (r1 != r2) goto Lc
            r0 = 1
        Lc:
            return r0
        Ld:
            r1 = move-exception
            r2 = 0
            r3.failWebSocket(r1, r2)
            return r0
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.queueSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    synchronized int receivedPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    synchronized int receivedPongCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // okhttp3.WebSocket
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    @Override // okhttp3.WebSocket
    public boolean send(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            okio.ByteString r2 = okio.ByteString.encodeUtf8(r2)
            r0 = 1
            boolean r2 = r1.send(r2, r0)
            return r2
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "text == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // okhttp3.WebSocket
    public boolean send(okio.ByteString r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = 2
            boolean r2 = r1.send(r2, r0)
            return r2
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "bytes == null"
            r2.<init>(r0)
            throw r2
    }

    synchronized int sentPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.sentPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    void tearDown() throws java.lang.InterruptedException {
            r4 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r4.cancelFuture
            if (r0 == 0) goto L8
            r1 = 0
            r0.cancel(r1)
        L8:
            java.util.concurrent.ScheduledExecutorService r0 = r4.executor
            r0.shutdown()
            java.util.concurrent.ScheduledExecutorService r0 = r4.executor
            r1 = 10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0.awaitTermination(r1, r3)
            return
    }

    boolean writeOneFrame() throws java.io.IOException {
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.failed     // Catch: java.lang.Throwable -> Lad
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lad
            return r1
        L8:
            okhttp3.internal.ws.WebSocketWriter r0 = r11.writer     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayDeque<okio.ByteString> r2 = r11.pongQueue     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> Lad
            okio.ByteString r2 = (okio.ByteString) r2     // Catch: java.lang.Throwable -> Lad
            r3 = 0
            r4 = -1
            if (r2 != 0) goto L4f
            java.util.ArrayDeque<java.lang.Object> r5 = r11.messageAndCloseQueue     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r5.poll()     // Catch: java.lang.Throwable -> Lad
            boolean r6 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> Lad
            if (r6 == 0) goto L46
            int r1 = r11.receivedCloseCode     // Catch: java.lang.Throwable -> Lad
            java.lang.String r6 = r11.receivedCloseReason     // Catch: java.lang.Throwable -> Lad
            if (r1 == r4) goto L30
            okhttp3.internal.ws.RealWebSocket$Streams r4 = r11.streams     // Catch: java.lang.Throwable -> Lad
            r11.streams = r3     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ScheduledExecutorService r3 = r11.executor     // Catch: java.lang.Throwable -> Lad
            r3.shutdown()     // Catch: java.lang.Throwable -> Lad
            goto L4d
        L30:
            java.util.concurrent.ScheduledExecutorService r4 = r11.executor     // Catch: java.lang.Throwable -> Lad
            okhttp3.internal.ws.RealWebSocket$CancelRunnable r7 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable     // Catch: java.lang.Throwable -> Lad
            r7.<init>(r11)     // Catch: java.lang.Throwable -> Lad
            r8 = r5
            okhttp3.internal.ws.RealWebSocket$Close r8 = (okhttp3.internal.ws.RealWebSocket.Close) r8     // Catch: java.lang.Throwable -> Lad
            long r8 = r8.cancelAfterCloseMillis     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r7, r8, r10)     // Catch: java.lang.Throwable -> Lad
            r11.cancelFuture = r4     // Catch: java.lang.Throwable -> Lad
            r4 = r3
            goto L4d
        L46:
            if (r5 != 0) goto L4a
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lad
            return r1
        L4a:
            r6 = r3
            r1 = r4
            r4 = r6
        L4d:
            r3 = r5
            goto L52
        L4f:
            r6 = r3
            r1 = r4
            r4 = r6
        L52:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L59
            r0.writePong(r2)     // Catch: java.lang.Throwable -> La8
            goto L9d
        L59:
            boolean r2 = r3 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L89
            r1 = r3
            okhttp3.internal.ws.RealWebSocket$Message r1 = (okhttp3.internal.ws.RealWebSocket.Message) r1     // Catch: java.lang.Throwable -> La8
            okio.ByteString r1 = r1.data     // Catch: java.lang.Throwable -> La8
            okhttp3.internal.ws.RealWebSocket$Message r3 = (okhttp3.internal.ws.RealWebSocket.Message) r3     // Catch: java.lang.Throwable -> La8
            int r2 = r3.formatOpcode     // Catch: java.lang.Throwable -> La8
            int r3 = r1.size()     // Catch: java.lang.Throwable -> La8
            long r5 = (long) r3     // Catch: java.lang.Throwable -> La8
            okio.Sink r0 = r0.newMessageSink(r2, r5)     // Catch: java.lang.Throwable -> La8
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> La8
            r0.write(r1)     // Catch: java.lang.Throwable -> La8
            r0.close()     // Catch: java.lang.Throwable -> La8
            monitor-enter(r11)     // Catch: java.lang.Throwable -> La8
            long r2 = r11.queueSize     // Catch: java.lang.Throwable -> L86
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L86
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L86
            long r2 = r2 - r0
            r11.queueSize = r2     // Catch: java.lang.Throwable -> L86
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L86
            goto L9d
        L86:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> La8
        L89:
            boolean r2 = r3 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto La2
            okhttp3.internal.ws.RealWebSocket$Close r3 = (okhttp3.internal.ws.RealWebSocket.Close) r3     // Catch: java.lang.Throwable -> La8
            int r2 = r3.code     // Catch: java.lang.Throwable -> La8
            okio.ByteString r3 = r3.reason     // Catch: java.lang.Throwable -> La8
            r0.writeClose(r2, r3)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L9d
            okhttp3.WebSocketListener r0 = r11.listener     // Catch: java.lang.Throwable -> La8
            r0.onClosed(r11, r1, r6)     // Catch: java.lang.Throwable -> La8
        L9d:
            okhttp3.internal.Util.closeQuietly(r4)
            r0 = 1
            return r0
        La2:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> La8
            r0.<init>()     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            okhttp3.internal.Util.closeQuietly(r4)
            throw r0
        Lad:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lad
            throw r0
    }

    void writePingFrame() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L7
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L54
            return
        L7:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch: java.lang.Throwable -> L54
            boolean r1 = r7.awaitingPong     // Catch: java.lang.Throwable -> L54
            r2 = -1
            if (r1 == 0) goto L11
            int r1 = r7.sentPingCount     // Catch: java.lang.Throwable -> L54
            goto L12
        L11:
            r1 = r2
        L12:
            int r3 = r7.sentPingCount     // Catch: java.lang.Throwable -> L54
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch: java.lang.Throwable -> L54
            r7.awaitingPong = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L54
            r3 = 0
            if (r1 == r2) goto L49
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.<init>(r5)
            long r5 = r7.pingIntervalMillis
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r5 = "ms (after "
            java.lang.StringBuilder r2 = r2.append(r5)
            int r1 = r1 - r4
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " successful ping/pongs)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L49:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch: java.io.IOException -> L4f
            r0.writePing(r1)     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
        L53:
            return
        L54:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L54
            throw r0
    }
}
