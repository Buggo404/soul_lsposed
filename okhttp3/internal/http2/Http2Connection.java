package okhttp3.internal.http2;

/* loaded from: classes.dex */
public final class Http2Connection implements java.io.Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int AWAIT_PING = 3;
    static final int DEGRADED_PING = 2;
    static final long DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    static final int INTERVAL_PING = 1;
    static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private static final java.util.concurrent.ExecutorService listenerExecutor = null;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    long bytesLeftInWriteWindow;
    final boolean client;
    final java.lang.String connectionName;
    final java.util.Set<java.lang.Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    int lastGoodStreamId;
    final okhttp3.internal.http2.Http2Connection.Listener listener;
    int nextStreamId;
    okhttp3.internal.http2.Settings okHttpSettings;
    final okhttp3.internal.http2.Settings peerSettings;
    private final java.util.concurrent.ExecutorService pushExecutor;
    final okhttp3.internal.http2.PushObserver pushObserver;
    final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;
    private boolean shutdown;
    final java.net.Socket socket;
    final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams;
    long unacknowledgedBytesRead;
    final okhttp3.internal.http2.Http2Writer writer;
    private final java.util.concurrent.ScheduledExecutorService writerExecutor;








    public static class Builder {
        boolean client;
        java.lang.String connectionName;
        okhttp3.internal.http2.Http2Connection.Listener listener;
        int pingIntervalMillis;
        okhttp3.internal.http2.PushObserver pushObserver;
        okio.BufferedSink sink;
        java.net.Socket socket;
        okio.BufferedSource source;

        public Builder(boolean r2) {
                r1 = this;
                r1.<init>()
                okhttp3.internal.http2.Http2Connection$Listener r0 = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS
                r1.listener = r0
                okhttp3.internal.http2.PushObserver r0 = okhttp3.internal.http2.PushObserver.CANCEL
                r1.pushObserver = r0
                r1.client = r2
                return
        }

        public okhttp3.internal.http2.Http2Connection build() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection r0 = new okhttp3.internal.http2.Http2Connection
                r0.<init>(r1)
                return r0
        }

        public okhttp3.internal.http2.Http2Connection.Builder listener(okhttp3.internal.http2.Http2Connection.Listener r1) {
                r0 = this;
                r0.listener = r1
                return r0
        }

        public okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return r0
        }

        public okhttp3.internal.http2.Http2Connection.Builder pushObserver(okhttp3.internal.http2.PushObserver r1) {
                r0 = this;
                r0.pushObserver = r1
                return r0
        }

        public okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r4) throws java.io.IOException {
                r3 = this;
                java.net.SocketAddress r0 = r4.getRemoteSocketAddress()
                boolean r1 = r0 instanceof java.net.InetSocketAddress
                if (r1 == 0) goto Lf
                java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
                java.lang.String r0 = r0.getHostName()
                goto L13
            Lf:
                java.lang.String r0 = r0.toString()
            L13:
                okio.Source r1 = okio.Okio.source(r4)
                okio.BufferedSource r1 = okio.Okio.buffer(r1)
                okio.Sink r2 = okio.Okio.sink(r4)
                okio.BufferedSink r2 = okio.Okio.buffer(r2)
                okhttp3.internal.http2.Http2Connection$Builder r4 = r3.socket(r4, r0, r1, r2)
                return r4
        }

        public okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r1, java.lang.String r2, okio.BufferedSource r3, okio.BufferedSink r4) {
                r0 = this;
                r0.socket = r1
                r0.connectionName = r2
                r0.source = r3
                r0.sink = r4
                return r0
        }
    }

    final class IntervalPingRunnable extends okhttp3.internal.NamedRunnable {
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        IntervalPingRunnable(okhttp3.internal.http2.Http2Connection r3) {
                r2 = this;
                r2.this$0 = r3
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                java.lang.String r3 = r3.connectionName
                r0[r1] = r3
                java.lang.String r3 = "OkHttp %s ping"
                r2.<init>(r3, r0)
                return
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
                r5 = this;
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch: java.lang.Throwable -> L2d
                long r1 = okhttp3.internal.http2.Http2Connection.access$100(r1)     // Catch: java.lang.Throwable -> L2d
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0     // Catch: java.lang.Throwable -> L2d
                long r3 = okhttp3.internal.http2.Http2Connection.access$200(r3)     // Catch: java.lang.Throwable -> L2d
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 >= 0) goto L17
                r1 = r2
                goto L1d
            L17:
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch: java.lang.Throwable -> L2d
                okhttp3.internal.http2.Http2Connection.access$208(r1)     // Catch: java.lang.Throwable -> L2d
                r1 = r3
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L27
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                r1 = 0
                okhttp3.internal.http2.Http2Connection.access$000(r0, r1)
                goto L2c
            L27:
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                r0.writePing(r3, r2, r3)
            L2c:
                return
            L2d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r1
        }
    }

    public static abstract class Listener {
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = null;


        static {
                okhttp3.internal.http2.Http2Connection$Listener$1 r0 = new okhttp3.internal.http2.Http2Connection$Listener$1
                r0.<init>()
                okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS = r0
                return
        }

        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onSettings(okhttp3.internal.http2.Http2Connection r1) {
                r0 = this;
                return
        }

        public abstract void onStream(okhttp3.internal.http2.Http2Stream r1) throws java.io.IOException;
    }

    final class PingRunnable extends okhttp3.internal.NamedRunnable {
        final int payload1;
        final int payload2;
        final boolean reply;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        PingRunnable(okhttp3.internal.http2.Http2Connection r3, boolean r4, int r5, int r6) {
                r2 = this;
                r2.this$0 = r3
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                java.lang.String r3 = r3.connectionName
                r0[r1] = r3
                r3 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0[r3] = r1
                r3 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                r0[r3] = r1
                java.lang.String r3 = "OkHttp %s ping %08x%08x"
                r2.<init>(r3, r0)
                r2.reply = r4
                r2.payload1 = r5
                r2.payload2 = r6
                return
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
                r4 = this;
                okhttp3.internal.http2.Http2Connection r0 = r4.this$0
                boolean r1 = r4.reply
                int r2 = r4.payload1
                int r3 = r4.payload2
                r0.writePing(r1, r2, r3)
                return
        }
    }

    class ReaderRunnable extends okhttp3.internal.NamedRunnable implements okhttp3.internal.http2.Http2Reader.Handler {
        final okhttp3.internal.http2.Http2Reader reader;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;




        ReaderRunnable(okhttp3.internal.http2.Http2Connection r3, okhttp3.internal.http2.Http2Reader r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                java.lang.String r3 = r3.connectionName
                r0[r1] = r3
                java.lang.String r3 = "OkHttp %s"
                r2.<init>(r3, r0)
                r2.reader = r4
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int r1, java.lang.String r2, okio.ByteString r3, java.lang.String r4, int r5, long r6) {
                r0 = this;
                return
        }

        void applyAndAckSettings(boolean r6, okhttp3.internal.http2.Settings r7) {
                r5 = this;
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                okhttp3.internal.http2.Http2Writer r0 = r0.writer
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch: java.lang.Throwable -> L99
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Settings r2 = r2.peerSettings     // Catch: java.lang.Throwable -> L96
                int r2 = r2.getInitialWindowSize()     // Catch: java.lang.Throwable -> L96
                if (r6 == 0) goto L19
                okhttp3.internal.http2.Http2Connection r6 = r5.this$0     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Settings r6 = r6.peerSettings     // Catch: java.lang.Throwable -> L96
                r6.clear()     // Catch: java.lang.Throwable -> L96
            L19:
                okhttp3.internal.http2.Http2Connection r6 = r5.this$0     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Settings r6 = r6.peerSettings     // Catch: java.lang.Throwable -> L96
                r6.merge(r7)     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Http2Connection r6 = r5.this$0     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Settings r6 = r6.peerSettings     // Catch: java.lang.Throwable -> L96
                int r6 = r6.getInitialWindowSize()     // Catch: java.lang.Throwable -> L96
                r7 = -1
                r3 = 0
                if (r6 == r7) goto L54
                if (r6 == r2) goto L54
                int r6 = r6 - r2
                long r6 = (long) r6     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch: java.lang.Throwable -> L96
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r2.streams     // Catch: java.lang.Throwable -> L96
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L96
                if (r2 != 0) goto L56
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch: java.lang.Throwable -> L96
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r2.streams     // Catch: java.lang.Throwable -> L96
                java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0     // Catch: java.lang.Throwable -> L96
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r3.streams     // Catch: java.lang.Throwable -> L96
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Http2Stream[] r3 = new okhttp3.internal.http2.Http2Stream[r3]     // Catch: java.lang.Throwable -> L96
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Http2Stream[] r2 = (okhttp3.internal.http2.Http2Stream[]) r2     // Catch: java.lang.Throwable -> L96
                r3 = r2
                goto L56
            L54:
                r6 = 0
            L56:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Writer r1 = r1.writer     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
                okhttp3.internal.http2.Settings r2 = r2.peerSettings     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
                r1.applyAndAckSettings(r2)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L99
                goto L69
            L63:
                r1 = move-exception
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch: java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Connection.access$000(r2, r1)     // Catch: java.lang.Throwable -> L99
            L69:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
                r0 = 0
                if (r3 == 0) goto L7e
                int r1 = r3.length
                r2 = r0
            L6f:
                if (r2 >= r1) goto L7e
                r4 = r3[r2]
                monitor-enter(r4)
                r4.addBytesToWriteWindow(r6)     // Catch: java.lang.Throwable -> L7b
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L7b
                int r2 = r2 + 1
                goto L6f
            L7b:
                r6 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L7b
                throw r6
            L7e:
                java.util.concurrent.ExecutorService r6 = okhttp3.internal.http2.Http2Connection.access$400()
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$3 r7 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$3
                java.lang.String r1 = "OkHttp %s settings"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0
                java.lang.String r3 = r3.connectionName
                r2[r0] = r3
                r7.<init>(r5, r1, r2)
                r6.execute(r7)
                return
            L96:
                r6 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
                throw r6     // Catch: java.lang.Throwable -> L99
            L99:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
                throw r6
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean r3, int r4, okio.BufferedSource r5, int r6) throws java.io.IOException {
                r2 = this;
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                boolean r0 = r0.pushedStream(r4)
                if (r0 == 0) goto Le
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                r0.pushDataLater(r4, r5, r6, r3)
                return
            Le:
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                okhttp3.internal.http2.Http2Stream r0 = r0.getStream(r4)
                if (r0 != 0) goto L27
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
                r3.writeSynResetLater(r4, r0)
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                long r0 = (long) r6
                r3.updateConnectionFlowControl(r0)
                r5.skip(r0)
                return
            L27:
                r0.receiveData(r5, r6)
                if (r3 == 0) goto L32
                okhttp3.Headers r3 = okhttp3.internal.Util.EMPTY_HEADERS
                r4 = 1
                r0.receiveHeaders(r3, r4)
            L32:
                return
        }

        @Override // okhttp3.internal.NamedRunnable
        protected void execute() {
                r5 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                r2 = 0
                okhttp3.internal.http2.Http2Reader r3 = r5.reader     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                r3.readConnectionPreface(r5)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            La:
                okhttp3.internal.http2.Http2Reader r3 = r5.reader     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                r4 = 0
                boolean r3 = r3.nextFrame(r4, r5)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                if (r3 == 0) goto L14
                goto La
            L14:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                goto L20
            L19:
                r3 = move-exception
                goto L2b
            L1b:
                r2 = move-exception
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L19
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L19
            L20:
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0
                r3.close(r0, r1, r2)
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal.Util.closeQuietly(r0)
                return
            L2b:
                okhttp3.internal.http2.Http2Connection r4 = r5.this$0
                r4.close(r0, r1, r2)
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal.Util.closeQuietly(r0)
                throw r3
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int r4, okhttp3.internal.http2.ErrorCode r5, okio.ByteString r6) {
                r3 = this;
                r6.size()
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0
                monitor-enter(r5)
                okhttp3.internal.http2.Http2Connection r6 = r3.this$0     // Catch: java.lang.Throwable -> L49
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r6 = r6.streams     // Catch: java.lang.Throwable -> L49
                java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L49
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0     // Catch: java.lang.Throwable -> L49
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r0.streams     // Catch: java.lang.Throwable -> L49
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L49
                okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L49
                java.lang.Object[] r6 = r6.toArray(r0)     // Catch: java.lang.Throwable -> L49
                okhttp3.internal.http2.Http2Stream[] r6 = (okhttp3.internal.http2.Http2Stream[]) r6     // Catch: java.lang.Throwable -> L49
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0     // Catch: java.lang.Throwable -> L49
                r1 = 1
                okhttp3.internal.http2.Http2Connection.access$302(r0, r1)     // Catch: java.lang.Throwable -> L49
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
                int r5 = r6.length
                r0 = 0
            L27:
                if (r0 >= r5) goto L48
                r1 = r6[r0]
                int r2 = r1.getId()
                if (r2 <= r4) goto L45
                boolean r2 = r1.isLocallyInitiated()
                if (r2 == 0) goto L45
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
                r1.receiveRstStream(r2)
                okhttp3.internal.http2.Http2Connection r2 = r3.this$0
                int r1 = r1.getId()
                r2.removeStream(r1)
            L45:
                int r0 = r0 + 1
                goto L27
            L48:
                return
            L49:
                r4 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
                throw r4
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean r10, int r11, int r12, java.util.List<okhttp3.internal.http2.Header> r13) {
                r9 = this;
                okhttp3.internal.http2.Http2Connection r12 = r9.this$0
                boolean r12 = r12.pushedStream(r11)
                if (r12 == 0) goto Le
                okhttp3.internal.http2.Http2Connection r12 = r9.this$0
                r12.pushHeadersLater(r11, r13, r10)
                return
            Le:
                okhttp3.internal.http2.Http2Connection r12 = r9.this$0
                monitor-enter(r12)
                okhttp3.internal.http2.Http2Connection r0 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Stream r0 = r0.getStream(r11)     // Catch: java.lang.Throwable -> L7e
                if (r0 != 0) goto L75
                okhttp3.internal.http2.Http2Connection r0 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                boolean r0 = okhttp3.internal.http2.Http2Connection.access$300(r0)     // Catch: java.lang.Throwable -> L7e
                if (r0 == 0) goto L23
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7e
                return
            L23:
                okhttp3.internal.http2.Http2Connection r0 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                int r0 = r0.lastGoodStreamId     // Catch: java.lang.Throwable -> L7e
                if (r11 > r0) goto L2b
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7e
                return
            L2b:
                int r0 = r11 % 2
                okhttp3.internal.http2.Http2Connection r1 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                int r1 = r1.nextStreamId     // Catch: java.lang.Throwable -> L7e
                r2 = 2
                int r1 = r1 % r2
                if (r0 != r1) goto L37
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7e
                return
            L37:
                okhttp3.Headers r8 = okhttp3.internal.Util.toHeaders(r13)     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Stream r13 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Connection r5 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Connection r10 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                r10.lastGoodStreamId = r11     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Connection r10 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r10 = r10.streams     // Catch: java.lang.Throwable -> L7e
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L7e
                r10.put(r0, r13)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ExecutorService r10 = okhttp3.internal.http2.Http2Connection.access$400()     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$1 r0 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$1     // Catch: java.lang.Throwable -> L7e
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Connection r3 = r9.this$0     // Catch: java.lang.Throwable -> L7e
                java.lang.String r3 = r3.connectionName     // Catch: java.lang.Throwable -> L7e
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.Throwable -> L7e
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L7e
                r3 = 1
                r2[r3] = r11     // Catch: java.lang.Throwable -> L7e
                r0.<init>(r9, r1, r2, r13)     // Catch: java.lang.Throwable -> L7e
                r10.execute(r0)     // Catch: java.lang.Throwable -> L7e
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7e
                return
            L75:
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7e
                okhttp3.Headers r11 = okhttp3.internal.Util.toHeaders(r13)
                r0.receiveHeaders(r11, r10)
                return
            L7e:
                r10 = move-exception
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7e
                throw r10
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean r4, int r5, int r6) {
                r3 = this;
                r0 = 1
                if (r4 == 0) goto L2a
                okhttp3.internal.http2.Http2Connection r4 = r3.this$0
                monitor-enter(r4)
                if (r5 != r0) goto L10
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0     // Catch: java.lang.Throwable -> Le
                okhttp3.internal.http2.Http2Connection.access$108(r5)     // Catch: java.lang.Throwable -> Le
                goto L26
            Le:
                r5 = move-exception
                goto L28
            L10:
                r6 = 2
                if (r5 != r6) goto L19
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0     // Catch: java.lang.Throwable -> Le
                okhttp3.internal.http2.Http2Connection.access$608(r5)     // Catch: java.lang.Throwable -> Le
                goto L26
            L19:
                r6 = 3
                if (r5 != r6) goto L26
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0     // Catch: java.lang.Throwable -> Le
                okhttp3.internal.http2.Http2Connection.access$708(r5)     // Catch: java.lang.Throwable -> Le
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0     // Catch: java.lang.Throwable -> Le
                r5.notifyAll()     // Catch: java.lang.Throwable -> Le
            L26:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
                goto L3a
            L28:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
                throw r5
            L2a:
                okhttp3.internal.http2.Http2Connection r4 = r3.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
                java.util.concurrent.ScheduledExecutorService r4 = okhttp3.internal.http2.Http2Connection.access$500(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
                okhttp3.internal.http2.Http2Connection$PingRunnable r1 = new okhttp3.internal.http2.Http2Connection$PingRunnable     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
                okhttp3.internal.http2.Http2Connection r2 = r3.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
                r1.<init>(r2, r0, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
                r4.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            L3a:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int r1, int r2, java.util.List<okhttp3.internal.http2.Header> r3) {
                r0 = this;
                okhttp3.internal.http2.Http2Connection r1 = r0.this$0
                r1.pushRequestLater(r2, r3)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int r2, okhttp3.internal.http2.ErrorCode r3) {
                r1 = this;
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                boolean r0 = r0.pushedStream(r2)
                if (r0 == 0) goto Le
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                r0.pushResetLater(r2, r3)
                return
            Le:
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream r2 = r0.removeStream(r2)
                if (r2 == 0) goto L19
                r2.receiveRstStream(r3)
            L19:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean r9, okhttp3.internal.http2.Settings r10) {
                r8 = this;
                okhttp3.internal.http2.Http2Connection r0 = r8.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                java.util.concurrent.ScheduledExecutorService r0 = okhttp3.internal.http2.Http2Connection.access$500(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$2 r7 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$2     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                java.lang.String r3 = "OkHttp %s ACK Settings"
                r1 = 1
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                okhttp3.internal.http2.Http2Connection r1 = r8.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                java.lang.String r1 = r1.connectionName     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                r2 = 0
                r4[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                r1 = r7
                r2 = r8
                r5 = r9
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
                r0.execute(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            L1e:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int r4, long r5) {
                r3 = this;
                if (r4 != 0) goto L16
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Connection r4 = r3.this$0     // Catch: java.lang.Throwable -> L13
                long r1 = r4.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L13
                long r1 = r1 + r5
                r4.bytesLeftInWriteWindow = r1     // Catch: java.lang.Throwable -> L13
                okhttp3.internal.http2.Http2Connection r4 = r3.this$0     // Catch: java.lang.Throwable -> L13
                r4.notifyAll()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                goto L27
            L13:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r4
            L16:
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0
                okhttp3.internal.http2.Http2Stream r4 = r0.getStream(r4)
                if (r4 == 0) goto L27
                monitor-enter(r4)
                r4.addBytesToWriteWindow(r5)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
                goto L27
            L24:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
                throw r5
            L27:
                return
        }
    }

    static {
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r6 = new java.util.concurrent.SynchronousQueue
            r6.<init>()
            java.lang.String r0 = "OkHttp Http2Connection"
            r7 = 1
            java.util.concurrent.ThreadFactory r7 = okhttp3.internal.Util.threadFactory(r0, r7)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            okhttp3.internal.http2.Http2Connection.listenerExecutor = r8
            return
    }

    Http2Connection(okhttp3.internal.http2.Http2Connection.Builder r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            r23.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.streams = r2
            r2 = 0
            r0.intervalPingsSent = r2
            r0.intervalPongsReceived = r2
            r0.degradedPingsSent = r2
            r0.degradedPongsReceived = r2
            r0.awaitPingsSent = r2
            r0.awaitPongsReceived = r2
            r0.degradedPongDeadlineNs = r2
            r0.unacknowledgedBytesRead = r2
            okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings
            r2.<init>()
            r0.okHttpSettings = r2
            okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings
            r2.<init>()
            r0.peerSettings = r2
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r0.currentPushRequests = r3
            okhttp3.internal.http2.PushObserver r3 = r1.pushObserver
            r0.pushObserver = r3
            boolean r3 = r1.client
            r0.client = r3
            okhttp3.internal.http2.Http2Connection$Listener r4 = r1.listener
            r0.listener = r4
            boolean r4 = r1.client
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L49
            r4 = r6
            goto L4a
        L49:
            r4 = r5
        L4a:
            r0.nextStreamId = r4
            boolean r4 = r1.client
            if (r4 == 0) goto L55
            int r4 = r0.nextStreamId
            int r4 = r4 + r5
            r0.nextStreamId = r4
        L55:
            boolean r4 = r1.client
            r5 = 7
            if (r4 == 0) goto L61
            okhttp3.internal.http2.Settings r4 = r0.okHttpSettings
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r4.set(r5, r7)
        L61:
            java.lang.String r4 = r1.connectionName
            r0.connectionName = r4
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = new java.util.concurrent.ScheduledThreadPoolExecutor
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r14 = 0
            r8[r14] = r4
            java.lang.String r9 = "OkHttp %s Writer"
            java.lang.String r8 = okhttp3.internal.Util.format(r9, r8)
            java.util.concurrent.ThreadFactory r8 = okhttp3.internal.Util.threadFactory(r8, r14)
            r7.<init>(r6, r8)
            r0.writerExecutor = r7
            int r8 = r1.pingIntervalMillis
            if (r8 == 0) goto L8f
            okhttp3.internal.http2.Http2Connection$IntervalPingRunnable r8 = new okhttp3.internal.http2.Http2Connection$IntervalPingRunnable
            r8.<init>(r0)
            int r9 = r1.pingIntervalMillis
            long r9 = (long) r9
            int r11 = r1.pingIntervalMillis
            long r11 = (long) r11
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.scheduleAtFixedRate(r8, r9, r11, r13)
        L8f:
            java.util.concurrent.ThreadPoolExecutor r7 = new java.util.concurrent.ThreadPoolExecutor
            r16 = 0
            r17 = 1
            r18 = 60
            java.util.concurrent.TimeUnit r20 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r21 = new java.util.concurrent.LinkedBlockingQueue
            r21.<init>()
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r14] = r4
            java.lang.String r4 = "OkHttp %s Push Observer"
            java.lang.String r4 = okhttp3.internal.Util.format(r4, r8)
            java.util.concurrent.ThreadFactory r22 = okhttp3.internal.Util.threadFactory(r4, r6)
            r15 = r7
            r15.<init>(r16, r17, r18, r20, r21, r22)
            r0.pushExecutor = r7
            r4 = 65535(0xffff, float:9.1834E-41)
            r2.set(r5, r4)
            r4 = 5
            r5 = 16384(0x4000, float:2.2959E-41)
            r2.set(r4, r5)
            int r2 = r2.getInitialWindowSize()
            long r4 = (long) r2
            r0.bytesLeftInWriteWindow = r4
            java.net.Socket r2 = r1.socket
            r0.socket = r2
            okhttp3.internal.http2.Http2Writer r2 = new okhttp3.internal.http2.Http2Writer
            okio.BufferedSink r4 = r1.sink
            r2.<init>(r4, r3)
            r0.writer = r2
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r2 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable
            okhttp3.internal.http2.Http2Reader r4 = new okhttp3.internal.http2.Http2Reader
            okio.BufferedSource r1 = r1.source
            r4.<init>(r1, r3)
            r2.<init>(r0, r4)
            r0.readerRunnable = r2
            return
    }

    static /* synthetic */ void access$000(okhttp3.internal.http2.Http2Connection r0, java.io.IOException r1) {
            r0.failConnection(r1)
            return
    }

    static /* synthetic */ long access$100(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPongsReceived
            return r0
    }

    static /* synthetic */ long access$108(okhttp3.internal.http2.Http2Connection r4) {
            long r0 = r4.intervalPongsReceived
            r2 = 1
            long r2 = r2 + r0
            r4.intervalPongsReceived = r2
            return r0
    }

    static /* synthetic */ long access$200(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPingsSent
            return r0
    }

    static /* synthetic */ long access$208(okhttp3.internal.http2.Http2Connection r4) {
            long r0 = r4.intervalPingsSent
            r2 = 1
            long r2 = r2 + r0
            r4.intervalPingsSent = r2
            return r0
    }

    static /* synthetic */ boolean access$300(okhttp3.internal.http2.Http2Connection r0) {
            boolean r0 = r0.shutdown
            return r0
    }

    static /* synthetic */ boolean access$302(okhttp3.internal.http2.Http2Connection r0, boolean r1) {
            r0.shutdown = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.ExecutorService access$400() {
            java.util.concurrent.ExecutorService r0 = okhttp3.internal.http2.Http2Connection.listenerExecutor
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledExecutorService access$500(okhttp3.internal.http2.Http2Connection r0) {
            java.util.concurrent.ScheduledExecutorService r0 = r0.writerExecutor
            return r0
    }

    static /* synthetic */ long access$608(okhttp3.internal.http2.Http2Connection r4) {
            long r0 = r4.degradedPongsReceived
            r2 = 1
            long r2 = r2 + r0
            r4.degradedPongsReceived = r2
            return r0
    }

    static /* synthetic */ long access$708(okhttp3.internal.http2.Http2Connection r4) {
            long r0 = r4.awaitPongsReceived
            r2 = 1
            long r2 = r2 + r0
            r4.awaitPongsReceived = r2
            return r0
    }

    private void failConnection(@javax.annotation.Nullable java.io.IOException r3) {
            r2 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r2.close(r0, r1, r3)
            return
    }

    private okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L76
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L73
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L73
            r10.shutdown(r0)     // Catch: java.lang.Throwable -> L73
        L13:
            boolean r0 = r10.shutdown     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6d
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L73
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L73
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L73
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L3a
            long r0 = r10.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L73
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3a
            long r0 = r9.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L73
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L38
            goto L3a
        L38:
            r13 = 0
            goto L3b
        L3a:
            r13 = 1
        L3b:
            boolean r0 = r9.isOpen()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L4a
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r10.streams     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L73
        L4a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L53
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch: java.lang.Throwable -> L76
            r11.headers(r6, r8, r12)     // Catch: java.lang.Throwable -> L76
            goto L5c
        L53:
            boolean r0 = r10.client     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L65
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L76
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L76
        L5c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L64
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L64:
            return r9
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L76
        L6d:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L73
            r11.<init>()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L76
        L76:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r11
    }

    private synchronized void pushExecutorExecute(okhttp3.internal.NamedRunnable r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.shutdown     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            java.util.concurrent.ExecutorService r0 = r1.pushExecutor     // Catch: java.lang.Throwable -> Lc
            r0.execute(r2)     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    synchronized void awaitPong() throws java.lang.InterruptedException {
            r4 = this;
            monitor-enter(r4)
        L1:
            long r0 = r4.awaitPongsReceived     // Catch: java.lang.Throwable -> Lf
            long r2 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> Lf
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Ld
            r4.wait()     // Catch: java.lang.Throwable -> Lf
            goto L1
        Ld:
            monitor-exit(r4)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2 = 0
            r3.close(r0, r1, r2)
            return
    }

    void close(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, @javax.annotation.Nullable java.io.IOException r6) {
            r3 = this;
            r3.shutdown(r4)     // Catch: java.io.IOException -> L3
        L3:
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L26
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L4b
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L4b
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch: java.lang.Throwable -> L4b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4     // Catch: java.lang.Throwable -> L4b
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch: java.lang.Throwable -> L4b
            r0.clear()     // Catch: java.lang.Throwable -> L4b
            goto L27
        L26:
            r4 = 0
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L36
            int r0 = r4.length
            r1 = 0
        L2c:
            if (r1 >= r0) goto L36
            r2 = r4[r1]
            r2.close(r5, r6)     // Catch: java.io.IOException -> L33
        L33:
            int r1 = r1 + 1
            goto L2c
        L36:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch: java.io.IOException -> L3b
            r4.close()     // Catch: java.io.IOException -> L3b
        L3b:
            java.net.Socket r4 = r3.socket     // Catch: java.io.IOException -> L40
            r4.close()     // Catch: java.io.IOException -> L40
        L40:
            java.util.concurrent.ScheduledExecutorService r4 = r3.writerExecutor
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.pushExecutor
            r4.shutdown()
            return
        L4b:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4b
            throw r4
    }

    public void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.flush()
            return
    }

    synchronized okhttp3.internal.http2.Http2Stream getStream(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized boolean isHealthy(long r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.shutdown     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            long r2 = r6.degradedPongsReceived     // Catch: java.lang.Throwable -> L1b
            long r4 = r6.degradedPingsSent     // Catch: java.lang.Throwable -> L1b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L18
            long r2 = r6.degradedPongDeadlineNs     // Catch: java.lang.Throwable -> L1b
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L18
            monitor-exit(r6)
            return r1
        L18:
            monitor-exit(r6)
            r7 = 1
            return r7
        L1b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public synchronized int maxConcurrentStreams() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Settings r0 = r2.peerSettings     // Catch: java.lang.Throwable -> Lc
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0.getMaxConcurrentStreams(r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public okhttp3.internal.http2.Http2Stream newStream(java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r0, r2, r3)
            return r2
    }

    public synchronized int openStreamCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    void pushDataLater(int r9, okio.BufferedSource r10, int r11, boolean r12) throws java.io.IOException {
            r8 = this;
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            long r0 = (long) r11
            r10.require(r0)
            r10.read(r5, r0)
            long r2 = r5.size()
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L33
            okhttp3.internal.http2.Http2Connection$6 r10 = new okhttp3.internal.http2.Http2Connection$6
            java.lang.String r2 = "OkHttp %s Push Data[%s]"
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            java.lang.String r1 = r8.connectionName
            r3[r0] = r1
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r3[r0] = r1
            r0 = r10
            r1 = r8
            r4 = r9
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.pushExecutorExecute(r10)
            return
        L33:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            long r0 = r5.size()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r12 = " != "
            java.lang.StringBuilder r10 = r10.append(r12)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    void pushHeadersLater(int r9, java.util.List<okhttp3.internal.http2.Header> r10, boolean r11) {
            r8 = this;
            okhttp3.internal.http2.Http2Connection$5 r7 = new okhttp3.internal.http2.Http2Connection$5     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            java.lang.String r2 = "OkHttp %s Push Headers[%s]"
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            java.lang.String r0 = r8.connectionName     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            r1 = 0
            r3[r1] = r0     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            r1 = 1
            r3[r1] = r0     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            r8.pushExecutorExecute(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
        L1e:
            return
    }

    void pushRequestLater(int r9, java.util.List<okhttp3.internal.http2.Header> r10) {
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.currentPushRequests     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L14
            okhttp3.internal.http2.ErrorCode r10 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L3c
            r8.writeSynResetLater(r9, r10)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            return
        L14:
            java.util.Set<java.lang.Integer> r0 = r8.currentPushRequests     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            r0.add(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            okhttp3.internal.http2.Http2Connection$4 r0 = new okhttp3.internal.http2.Http2Connection$4     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            java.lang.String r1 = r8.connectionName     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r2 = 0
            r5[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r2 = 1
            r5[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r2 = r0
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r8.pushExecutorExecute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
        L3b:
            return
        L3c:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            throw r9
    }

    void pushResetLater(int r8, okhttp3.internal.http2.ErrorCode r9) {
            r7 = this;
            okhttp3.internal.http2.Http2Connection$7 r6 = new okhttp3.internal.http2.Http2Connection$7
            java.lang.String r2 = "OkHttp %s Push Reset[%s]"
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            java.lang.String r1 = r7.connectionName
            r3[r0] = r1
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r3[r0] = r1
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.pushExecutorExecute(r6)
            return
    }

    public okhttp3.internal.http2.Http2Stream pushStream(int r2, java.util.List<okhttp3.internal.http2.Header> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.client
            if (r0 != 0) goto L9
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r2, r3, r4)
            return r2
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Client cannot push requests."
            r2.<init>(r3)
            throw r2
    }

    boolean pushedStream(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 1
            r2 = r2 & r0
            if (r2 != 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    synchronized okhttp3.internal.http2.Http2Stream removeStream(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    void sendDegradedPingLater() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.degradedPongsReceived     // Catch: java.lang.Throwable -> L30
            long r2 = r6.degradedPingsSent     // Catch: java.lang.Throwable -> L30
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L30
            return
        Lb:
            r0 = 1
            long r2 = r2 + r0
            r6.degradedPingsSent = r2     // Catch: java.lang.Throwable -> L30
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L30
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 + r2
            r6.degradedPongDeadlineNs = r0     // Catch: java.lang.Throwable -> L30
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.ScheduledExecutorService r0 = r6.writerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
            okhttp3.internal.http2.Http2Connection$3 r1 = new okhttp3.internal.http2.Http2Connection$3     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
            java.lang.String r2 = "OkHttp %s ping"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
            java.lang.String r4 = r6.connectionName     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
            r5 = 0
            r3[r5] = r4     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
            r1.<init>(r6, r2, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L2f
        L2f:
            return
        L30:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    public void setSettings(okhttp3.internal.http2.Settings r3) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Writer r0 = r2.writer
            monitor-enter(r0)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L15
            okhttp3.internal.http2.Settings r1 = r2.okHttpSettings     // Catch: java.lang.Throwable -> L1b
            r1.merge(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.http2.Http2Writer r1 = r2.writer     // Catch: java.lang.Throwable -> L1e
            r1.settings(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L15:
            okhttp3.internal.http2.ConnectionShutdownException r3 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    public void shutdown(okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r4 = this;
            okhttp3.internal.http2.Http2Writer r0 = r4.writer
            monitor-enter(r0)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r4.shutdown     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Lb
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        Lb:
            r1 = 1
            r4.shutdown = r1     // Catch: java.lang.Throwable -> L1a
            int r1 = r4.lastGoodStreamId     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.http2.Http2Writer r2 = r4.writer     // Catch: java.lang.Throwable -> L1d
            byte[] r3 = okhttp3.internal.Util.EMPTY_BYTE_ARRAY     // Catch: java.lang.Throwable -> L1d
            r2.goAway(r1, r5, r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r5     // Catch: java.lang.Throwable -> L1d
        L1d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r5
    }

    public void start() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.start(r0)
            return
    }

    void start(boolean r5) throws java.io.IOException {
            r4 = this;
            if (r5 == 0) goto L21
            okhttp3.internal.http2.Http2Writer r5 = r4.writer
            r5.connectionPreface()
            okhttp3.internal.http2.Http2Writer r5 = r4.writer
            okhttp3.internal.http2.Settings r0 = r4.okHttpSettings
            r5.settings(r0)
            okhttp3.internal.http2.Settings r5 = r4.okHttpSettings
            int r5 = r5.getInitialWindowSize()
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r5 == r0) goto L21
            okhttp3.internal.http2.Http2Writer r1 = r4.writer
            int r5 = r5 - r0
            long r2 = (long) r5
            r5 = 0
            r1.windowUpdate(r5, r2)
        L21:
            java.lang.Thread r5 = new java.lang.Thread
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r0 = r4.readerRunnable
            r5.<init>(r0)
            r5.start()
            return
    }

    synchronized void updateConnectionFlowControl(long r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> L1f
            long r0 = r0 + r3
            r2.unacknowledgedBytesRead = r0     // Catch: java.lang.Throwable -> L1f
            okhttp3.internal.http2.Settings r3 = r2.okHttpSettings     // Catch: java.lang.Throwable -> L1f
            int r3 = r3.getInitialWindowSize()     // Catch: java.lang.Throwable -> L1f
            int r3 = r3 / 2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L1f
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L1d
            long r3 = r2.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            r2.writeWindowUpdateLater(r0, r3)     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r2.unacknowledgedBytesRead = r3     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public void writeData(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L56
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L56
            okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L56
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.bytesLeftInWriteWindow = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
    }

    void writeHeaders(int r2, boolean r3, java.util.List<okhttp3.internal.http2.Header> r4) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.headers(r3, r2, r4)
            return
    }

    void writePing() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> L12
            r2 = 1
            long r0 = r0 + r2
            r4.awaitPingsSent = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r0 = 3
            r1 = 1330343787(0x4f4b6f6b, float:3.41307674E9)
            r2 = 0
            r4.writePing(r2, r0, r1)
            return
        L12:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    void writePing(boolean r2, int r3, int r4) {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.io.IOException -> L6
            r0.ping(r2, r3, r4)     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r2 = move-exception
            r1.failConnection(r2)
        La:
            return
    }

    void writePingAndAwaitPong() throws java.lang.InterruptedException {
            r0 = this;
            r0.writePing()
            r0.awaitPong()
            return
    }

    void writeSynReset(int r2, okhttp3.internal.http2.ErrorCode r3) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.rstStream(r2, r3)
            return
    }

    void writeSynResetLater(int r9, okhttp3.internal.http2.ErrorCode r10) {
            r8 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r8.writerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            okhttp3.internal.http2.Http2Connection$1 r7 = new okhttp3.internal.http2.Http2Connection$1     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.lang.String r3 = "OkHttp %s stream %d"
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.lang.String r1 = r8.connectionName     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r2 = 0
            r4[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r2 = 1
            r4[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r0.execute(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
        L1f:
            return
    }

    void writeWindowUpdateLater(int r10, long r11) {
            r9 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r9.writerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            okhttp3.internal.http2.Http2Connection$2 r8 = new okhttp3.internal.http2.Http2Connection$2     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.lang.String r3 = "OkHttp Window Update %s stream %d"
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.lang.String r1 = r9.connectionName     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r2 = 0
            r4[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r2 = 1
            r4[r2] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r1 = r8
            r2 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            r0.execute(r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
        L1f:
            return
    }
}
