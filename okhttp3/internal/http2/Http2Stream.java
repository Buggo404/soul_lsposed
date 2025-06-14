package okhttp3.internal.http2;

/* loaded from: classes.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final okhttp3.internal.http2.Http2Connection connection;

    @javax.annotation.Nullable
    okhttp3.internal.http2.ErrorCode errorCode;

    @javax.annotation.Nullable
    java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.Deque<okhttp3.Headers> headersQueue;

    /* renamed from: id */
    final int f612id;
    final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;
    final okhttp3.internal.http2.Http2Stream.FramingSink sink;
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    long unacknowledgedBytesRead;
    final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

    final class FramingSink implements okio.Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final okio.Buffer sendBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        static {
                java.lang.Class<okhttp3.internal.http2.Http2Stream> r0 = okhttp3.internal.http2.Http2Stream.class
                return
        }

        FramingSink(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.sendBuffer = r1
                return
        }

        static /* synthetic */ okhttp3.Headers access$302(okhttp3.internal.http2.Http2Stream.FramingSink r0, okhttp3.Headers r1) {
                r0.trailers = r1
                return r1
        }

        private void emitFrame(boolean r12) throws java.io.IOException {
                r11 = this;
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.writeTimeout     // Catch: java.lang.Throwable -> L89
                r1.enter()     // Catch: java.lang.Throwable -> L89
            La:
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L80
                long r1 = r1.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L80
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L28
                boolean r1 = r11.finished     // Catch: java.lang.Throwable -> L80
                if (r1 != 0) goto L28
                boolean r1 = r11.closed     // Catch: java.lang.Throwable -> L80
                if (r1 != 0) goto L28
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L80
                okhttp3.internal.http2.ErrorCode r1 = r1.errorCode     // Catch: java.lang.Throwable -> L80
                if (r1 != 0) goto L28
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L80
                r1.waitForIo()     // Catch: java.lang.Throwable -> L80
                goto La
            L28:
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.writeTimeout     // Catch: java.lang.Throwable -> L89
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L89
                r1.checkOutNotClosed()     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L89
                long r1 = r1.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L89
                okio.Buffer r3 = r11.sendBuffer     // Catch: java.lang.Throwable -> L89
                long r3 = r3.size()     // Catch: java.lang.Throwable -> L89
                long r9 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L89
                long r2 = r1.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L89
                long r2 = r2 - r9
                r1.bytesLeftInWriteWindow = r2     // Catch: java.lang.Throwable -> L89
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.writeTimeout
                r0.enter()
                if (r12 == 0) goto L61
                okio.Buffer r12 = r11.sendBuffer     // Catch: java.lang.Throwable -> L5f
                long r0 = r12.size()     // Catch: java.lang.Throwable -> L5f
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L61
                r12 = 1
                goto L62
            L5f:
                r12 = move-exception
                goto L78
            L61:
                r12 = 0
            L62:
                r7 = r12
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0     // Catch: java.lang.Throwable -> L5f
                okhttp3.internal.http2.Http2Connection r5 = r12.connection     // Catch: java.lang.Throwable -> L5f
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0     // Catch: java.lang.Throwable -> L5f
                int r6 = r12.f612id     // Catch: java.lang.Throwable -> L5f
                okio.Buffer r8 = r11.sendBuffer     // Catch: java.lang.Throwable -> L5f
                r5.writeData(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5f
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.writeTimeout
                r12.exitAndThrowIfTimedOut()
                return
            L78:
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.writeTimeout
                r0.exitAndThrowIfTimedOut()
                throw r12
            L80:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.writeTimeout     // Catch: java.lang.Throwable -> L89
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L89
                throw r12     // Catch: java.lang.Throwable -> L89
            L89:
                r12 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
                throw r12
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r8 = this;
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch: java.lang.Throwable -> L81
                if (r1 == 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
                return
            L9:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.sink
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L6b
                okio.Buffer r0 = r8.sendBuffer
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r2 = 0
                if (r0 <= 0) goto L22
                r0 = r1
                goto L23
            L22:
                r0 = r2
            L23:
                okhttp3.Headers r3 = r8.trailers
                if (r3 == 0) goto L29
                r3 = r1
                goto L2a
            L29:
                r3 = r2
            L2a:
                if (r3 == 0) goto L4c
            L2c:
                okio.Buffer r0 = r8.sendBuffer
                long r6 = r0.size()
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 <= 0) goto L3a
                r8.emitFrame(r2)
                goto L2c
            L3a:
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                okhttp3.internal.http2.Http2Stream r2 = r8.this$0
                int r2 = r2.f612id
                okhttp3.Headers r3 = r8.trailers
                java.util.List r3 = okhttp3.internal.Util.toHeaderBlock(r3)
                r0.writeHeaders(r2, r1, r3)
                goto L6b
            L4c:
                if (r0 == 0) goto L5c
            L4e:
                okio.Buffer r0 = r8.sendBuffer
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L6b
                r8.emitFrame(r1)
                goto L4e
            L5c:
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                okhttp3.internal.http2.Http2Connection r2 = r0.connection
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                int r3 = r0.f612id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L6b:
                okhttp3.internal.http2.Http2Stream r2 = r8.this$0
                monitor-enter(r2)
                r8.closed = r1     // Catch: java.lang.Throwable -> L7e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = r8.this$0
                r0.cancelStreamIfNecessary()
                return
            L7e:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
                throw r0
            L81:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream r1 = r4.this$0     // Catch: java.lang.Throwable -> L22
                r1.checkOutNotClosed()     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            L9:
                okio.Buffer r0 = r4.sendBuffer
                long r0 = r0.size()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L21
                r0 = 0
                r4.emitFrame(r0)
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                goto L9
            L21:
                return
            L22:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                throw r1
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.writeTimeout
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r3, long r4) throws java.io.IOException {
                r2 = this;
                okio.Buffer r0 = r2.sendBuffer
                r0.write(r3, r4)
            L5:
                okio.Buffer r3 = r2.sendBuffer
                long r3 = r3.size()
                r0 = 16384(0x4000, double:8.0948E-320)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 < 0) goto L16
                r3 = 0
                r2.emitFrame(r3)
                goto L5
            L16:
                return
        }
    }

    private final class FramingSource implements okio.Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final okio.Buffer readBuffer;
        private final okio.Buffer receiveBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        static {
                java.lang.Class<okhttp3.internal.http2.Http2Stream> r0 = okhttp3.internal.http2.Http2Stream.class
                return
        }

        FramingSource(okhttp3.internal.http2.Http2Stream r1, long r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.receiveBuffer = r1
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.readBuffer = r1
                r0.maxByteCount = r2
                return
        }

        static /* synthetic */ okio.Buffer access$000(okhttp3.internal.http2.Http2Stream.FramingSource r0) {
                okio.Buffer r0 = r0.receiveBuffer
                return r0
        }

        static /* synthetic */ okio.Buffer access$100(okhttp3.internal.http2.Http2Stream.FramingSource r0) {
                okio.Buffer r0 = r0.readBuffer
                return r0
        }

        static /* synthetic */ okhttp3.Headers access$200(okhttp3.internal.http2.Http2Stream.FramingSource r0) {
                okhttp3.Headers r0 = r0.trailers
                return r0
        }

        static /* synthetic */ okhttp3.Headers access$202(okhttp3.internal.http2.Http2Stream.FramingSource r0, okhttp3.Headers r1) {
                r0.trailers = r1
                return r1
        }

        private void updateConnectionFlowControl(long r2) {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.updateConnectionFlowControl(r2)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                r1 = 1
                r5.closed = r1     // Catch: java.lang.Throwable -> L26
                okio.Buffer r1 = r5.readBuffer     // Catch: java.lang.Throwable -> L26
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L26
                okio.Buffer r3 = r5.readBuffer     // Catch: java.lang.Throwable -> L26
                r3.clear()     // Catch: java.lang.Throwable -> L26
                okhttp3.internal.http2.Http2Stream r3 = r5.this$0     // Catch: java.lang.Throwable -> L26
                r3.notifyAll()     // Catch: java.lang.Throwable -> L26
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                r3 = 0
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L20
                r5.updateConnectionFlowControl(r1)
            L20:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r0.cancelStreamIfNecessary()
                return
            L26:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                throw r1
        }

        @Override // okio.Source
        public long read(okio.Buffer r12, long r13) throws java.io.IOException {
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Lba
            L6:
                okhttp3.internal.http2.Http2Stream r2 = r11.this$0
                monitor-enter(r2)
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Lb7
                okhttp3.internal.http2.Http2Stream$StreamTimeout r3 = r3.readTimeout     // Catch: java.lang.Throwable -> Lb7
                r3.enter()     // Catch: java.lang.Throwable -> Lb7
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.ErrorCode r3 = r3.errorCode     // Catch: java.lang.Throwable -> Lae
                if (r3 == 0) goto L2b
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                java.io.IOException r3 = r3.errorException     // Catch: java.lang.Throwable -> Lae
                if (r3 == 0) goto L21
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                java.io.IOException r3 = r3.errorException     // Catch: java.lang.Throwable -> Lae
                goto L2c
            L21:
                okhttp3.internal.http2.StreamResetException r3 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r4 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.ErrorCode r4 = r4.errorCode     // Catch: java.lang.Throwable -> Lae
                r3.<init>(r4)     // Catch: java.lang.Throwable -> Lae
                goto L2c
            L2b:
                r3 = 0
            L2c:
                boolean r4 = r11.closed     // Catch: java.lang.Throwable -> Lae
                if (r4 != 0) goto La6
                okio.Buffer r4 = r11.readBuffer     // Catch: java.lang.Throwable -> Lae
                long r4 = r4.size()     // Catch: java.lang.Throwable -> Lae
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r5 = -1
                if (r4 <= 0) goto L7c
                okio.Buffer r4 = r11.readBuffer     // Catch: java.lang.Throwable -> Lae
                long r7 = r4.size()     // Catch: java.lang.Throwable -> Lae
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> Lae
                long r12 = r4.read(r12, r13)     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r14 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                long r7 = r14.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> Lae
                long r7 = r7 + r12
                r14.unacknowledgedBytesRead = r7     // Catch: java.lang.Throwable -> Lae
                if (r3 != 0) goto L92
                okhttp3.internal.http2.Http2Stream r14 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                long r7 = r14.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r14 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Connection r14 = r14.connection     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Settings r14 = r14.okHttpSettings     // Catch: java.lang.Throwable -> Lae
                int r14 = r14.getInitialWindowSize()     // Catch: java.lang.Throwable -> Lae
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> Lae
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L92
                okhttp3.internal.http2.Http2Stream r14 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Connection r14 = r14.connection     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r4 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                int r4 = r4.f612id     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r7 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                long r7 = r7.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> Lae
                r14.writeWindowUpdateLater(r4, r7)     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r14 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                r14.unacknowledgedBytesRead = r0     // Catch: java.lang.Throwable -> Lae
                goto L92
            L7c:
                boolean r4 = r11.finished     // Catch: java.lang.Throwable -> Lae
                if (r4 != 0) goto L91
                if (r3 != 0) goto L91
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Lae
                r3.waitForIo()     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Lb7
                okhttp3.internal.http2.Http2Stream$StreamTimeout r3 = r3.readTimeout     // Catch: java.lang.Throwable -> Lb7
                r3.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb7
                goto L6
            L91:
                r12 = r5
            L92:
                okhttp3.internal.http2.Http2Stream r14 = r11.this$0     // Catch: java.lang.Throwable -> Lb7
                okhttp3.internal.http2.Http2Stream$StreamTimeout r14 = r14.readTimeout     // Catch: java.lang.Throwable -> Lb7
                r14.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb7
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto La2
                r11.updateConnectionFlowControl(r12)
                return r12
            La2:
                if (r3 != 0) goto La5
                return r5
            La5:
                throw r3
            La6:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> Lae
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> Lae
                throw r12     // Catch: java.lang.Throwable -> Lae
            Lae:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream r13 = r11.this$0     // Catch: java.lang.Throwable -> Lb7
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.readTimeout     // Catch: java.lang.Throwable -> Lb7
                r13.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb7
                throw r12     // Catch: java.lang.Throwable -> Lb7
            Lb7:
                r12 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb7
                throw r12
            Lba:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                java.lang.StringBuilder r13 = r0.append(r13)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
        }

        void receive(okio.BufferedSource r10, long r11) throws java.io.IOException {
                r9 = this;
            L0:
                r0 = 0
                int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r2 <= 0) goto L81
                okhttp3.internal.http2.Http2Stream r2 = r9.this$0
                monitor-enter(r2)
                boolean r3 = r9.finished     // Catch: java.lang.Throwable -> L7e
                okio.Buffer r4 = r9.readBuffer     // Catch: java.lang.Throwable -> L7e
                long r4 = r4.size()     // Catch: java.lang.Throwable -> L7e
                long r4 = r4 + r11
                long r6 = r9.maxByteCount     // Catch: java.lang.Throwable -> L7e
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r5 = 1
                r6 = 0
                if (r4 <= 0) goto L1c
                r4 = r5
                goto L1d
            L1c:
                r4 = r6
            L1d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
                if (r4 == 0) goto L2b
                r10.skip(r11)
                okhttp3.internal.http2.Http2Stream r10 = r9.this$0
                okhttp3.internal.http2.ErrorCode r11 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                r10.closeLater(r11)
                return
            L2b:
                if (r3 == 0) goto L31
                r10.skip(r11)
                return
            L31:
                okio.Buffer r2 = r9.receiveBuffer
                long r2 = r10.read(r2, r11)
                r7 = -1
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 == 0) goto L78
                long r11 = r11 - r2
                okhttp3.internal.http2.Http2Stream r2 = r9.this$0
                monitor-enter(r2)
                boolean r3 = r9.closed     // Catch: java.lang.Throwable -> L75
                if (r3 == 0) goto L51
                okio.Buffer r3 = r9.receiveBuffer     // Catch: java.lang.Throwable -> L75
                long r3 = r3.size()     // Catch: java.lang.Throwable -> L75
                okio.Buffer r5 = r9.receiveBuffer     // Catch: java.lang.Throwable -> L75
                r5.clear()     // Catch: java.lang.Throwable -> L75
                goto L6c
            L51:
                okio.Buffer r3 = r9.readBuffer     // Catch: java.lang.Throwable -> L75
                long r3 = r3.size()     // Catch: java.lang.Throwable -> L75
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L5c
                goto L5d
            L5c:
                r5 = r6
            L5d:
                okio.Buffer r3 = r9.readBuffer     // Catch: java.lang.Throwable -> L75
                okio.Buffer r4 = r9.receiveBuffer     // Catch: java.lang.Throwable -> L75
                r3.writeAll(r4)     // Catch: java.lang.Throwable -> L75
                if (r5 == 0) goto L6b
                okhttp3.internal.http2.Http2Stream r3 = r9.this$0     // Catch: java.lang.Throwable -> L75
                r3.notifyAll()     // Catch: java.lang.Throwable -> L75
            L6b:
                r3 = r0
            L6c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 <= 0) goto L0
                r9.updateConnectionFlowControl(r3)
                goto L0
            L75:
                r10 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
                throw r10
            L78:
                java.io.EOFException r10 = new java.io.EOFException
                r10.<init>()
                throw r10
            L7e:
                r10 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
                throw r10
            L81:
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.readTimeout
                return r0
        }
    }

    class StreamTimeout extends okio.AsyncTimeout {
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        StreamTimeout(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void exitAndThrowIfTimedOut() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.exit()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 0
                java.io.IOException r0 = r1.newTimeoutException(r0)
                throw r0
        }

        @Override // okio.AsyncTimeout
        protected java.io.IOException newTimeoutException(java.io.IOException r3) {
                r2 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                if (r3 == 0) goto Lc
                r0.initCause(r3)
            Lc:
                return r0
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
                r0.closeLater(r1)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.sendDegradedPingLater()
                return
        }
    }

    static {
            return
    }

    Http2Stream(int r4, okhttp3.internal.http2.Http2Connection r5, boolean r6, boolean r7, @javax.annotation.Nullable okhttp3.Headers r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.unacknowledgedBytesRead = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.headersQueue = r0
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r1.<init>(r3)
            r3.readTimeout = r1
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r1.<init>(r3)
            r3.writeTimeout = r1
            if (r5 == 0) goto L6c
            r3.f612id = r4
            r3.connection = r5
            okhttp3.internal.http2.Settings r4 = r5.peerSettings
            int r4 = r4.getInitialWindowSize()
            long r1 = (long) r4
            r3.bytesLeftInWriteWindow = r1
            okhttp3.internal.http2.Http2Stream$FramingSource r4 = new okhttp3.internal.http2.Http2Stream$FramingSource
            okhttp3.internal.http2.Settings r5 = r5.okHttpSettings
            int r5 = r5.getInitialWindowSize()
            long r1 = (long) r5
            r4.<init>(r3, r1)
            r3.source = r4
            okhttp3.internal.http2.Http2Stream$FramingSink r5 = new okhttp3.internal.http2.Http2Stream$FramingSink
            r5.<init>(r3)
            r3.sink = r5
            r4.finished = r7
            r5.finished = r6
            if (r8 == 0) goto L49
            r0.add(r8)
        L49:
            boolean r4 = r3.isLocallyInitiated()
            if (r4 == 0) goto L5a
            if (r8 != 0) goto L52
            goto L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "locally-initiated streams shouldn't have headers yet"
            r4.<init>(r5)
            throw r4
        L5a:
            boolean r4 = r3.isLocallyInitiated()
            if (r4 != 0) goto L6b
            if (r8 == 0) goto L63
            goto L6b
        L63:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "remotely-initiated streams should have headers"
            r4.<init>(r5)
            throw r4
        L6b:
            return
        L6c:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "connection == null"
            r4.<init>(r5)
            throw r4
    }

    private boolean closeInternal(okhttp3.internal.http2.ErrorCode r3, @javax.annotation.Nullable java.io.IOException r4) {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L27
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            return r1
        L8:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L16
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            return r1
        L16:
            r2.errorCode = r3     // Catch: java.lang.Throwable -> L27
            r2.errorException = r4     // Catch: java.lang.Throwable -> L27
            r2.notifyAll()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f612id
            r3.removeStream(r4)
            r3 = 1
            return r3
        L27:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    void addBytesToWriteWindow(long r3) {
            r2 = this;
            long r0 = r2.bytesLeftInWriteWindow
            long r0 = r0 + r3
            r2.bytesLeftInWriteWindow = r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto Le
            r2.notifyAll()
        Le:
            return
    }

    void cancelStreamIfNecessary() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L1b
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.closed     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L1b
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L19
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.closed     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L1b
        L19:
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.isOpen()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2a
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.close(r0, r1)
            goto L33
        L2a:
            if (r1 != 0) goto L33
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.f612id
            r0.removeStream(r1)
        L33:
            return
        L34:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    void checkOutNotClosed() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.closed
            if (r0 != 0) goto L26
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.finished
            if (r0 != 0) goto L1e
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode
            if (r0 == 0) goto L1d
            java.io.IOException r0 = r2.errorException
            if (r0 == 0) goto L15
            goto L1c
        L15:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode
            r0.<init>(r1)
        L1c:
            throw r0
        L1d:
            return
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream finished"
            r0.<init>(r1)
            throw r0
        L26:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)
            throw r0
    }

    public void close(okhttp3.internal.http2.ErrorCode r2, @javax.annotation.Nullable java.io.IOException r3) throws java.io.IOException {
            r1 = this;
            boolean r3 = r1.closeInternal(r2, r3)
            if (r3 != 0) goto L7
            return
        L7:
            okhttp3.internal.http2.Http2Connection r3 = r1.connection
            int r0 = r1.f612id
            r3.writeSynReset(r0, r2)
            return
    }

    public void closeLater(okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            r0 = 0
            boolean r0 = r2.closeInternal(r3, r0)
            if (r0 != 0) goto L8
            return
        L8:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.f612id
            r0.writeSynResetLater(r1, r3)
            return
    }

    public void enqueueTrailers(okhttp3.Headers r2) {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L1c
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L14
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.http2.Http2Stream.FramingSink.access$302(r0, r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "trailers.size() == 0"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L24
        L1c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "already finished"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L24
        L24:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2
    }

    public okhttp3.internal.http2.Http2Connection getConnection() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.connection
            return r0
    }

    public synchronized okhttp3.internal.http2.ErrorCode getErrorCode() {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.f612id
            return r0
    }

    public okio.Sink getSink() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L14
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "reply before requesting the sink"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public okio.Source getSource() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            return r0
    }

    public boolean isLocallyInitiated() {
            r4 = this;
            int r0 = r4.f612id
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            okhttp3.internal.http2.Http2Connection r3 = r4.connection
            boolean r3 = r3.client
            if (r3 != r0) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            return r1
    }

    public synchronized boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L29
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r2)
            return r1
        L8:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L14
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.closed     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
        L14:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L20
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.closed     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
        L20:
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)
            r0 = 1
            return r0
        L29:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public okio.Timeout readTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    void receiveData(okio.BufferedSource r4, int r5) throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source
            long r1 = (long) r5
            r0.receive(r4, r1)
            return
    }

    void receiveHeaders(okhttp3.Headers r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2e
            okhttp3.internal.http2.Http2Stream.FramingSource.access$202(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L2e
            r3.finished = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f612id
            r3.removeStream(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
    }

    synchronized void receiveRstStream(okhttp3.internal.http2.ErrorCode r2) {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            r1.errorCode = r2     // Catch: java.lang.Throwable -> Lc
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L41
            r0.enter()     // Catch: java.lang.Throwable -> L41
        L6:
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L16
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L16
            r2.waitForIo()     // Catch: java.lang.Throwable -> L3a
            goto L6
        L16:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L41
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L41
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L2d
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L41
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch: java.lang.Throwable -> L41
            monitor-exit(r2)
            return r0
        L2d:
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L32
            goto L39
        L32:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L41
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L41
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L41
        L39:
            throw r0     // Catch: java.lang.Throwable -> L41
        L3a:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L41
            r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized okhttp3.Headers trailers() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L12
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto La
            goto L11
        La:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
        L11:
            throw r0     // Catch: java.lang.Throwable -> L4b
        L12:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.finished     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L43
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okio.Buffer r0 = okhttp3.internal.http2.Http2Stream.FramingSource.access$000(r0)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L43
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okio.Buffer r0 = okhttp3.internal.http2.Http2Stream.FramingSource.access$100(r0)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L43
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okhttp3.Headers r0 = okhttp3.internal.http2.Http2Stream.FramingSource.access$200(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L3f
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okhttp3.Headers r0 = okhttp3.internal.http2.Http2Stream.FramingSource.access$200(r0)     // Catch: java.lang.Throwable -> L4b
            goto L41
        L3f:
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS     // Catch: java.lang.Throwable -> L4b
        L41:
            monitor-exit(r2)
            return r0
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "too early; can't read the trailers yet"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    void waitForIo() throws java.io.InterruptedIOException {
            r1 = this;
            r1.wait()     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    public void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r7, boolean r8, boolean r9) throws java.io.IOException {
            r6 = this;
            if (r7 == 0) goto L36
            monitor-enter(r6)
            r0 = 1
            r6.hasResponseHeaders = r0     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto Lc
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r6.sink     // Catch: java.lang.Throwable -> L33
            r1.finished = r0     // Catch: java.lang.Throwable -> L33
        Lc:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            if (r9 != 0) goto L24
            okhttp3.internal.http2.Http2Connection r1 = r6.connection
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Connection r9 = r6.connection     // Catch: java.lang.Throwable -> L21
            long r2 = r9.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L21
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L1e
            r9 = r0
            goto L1f
        L1e:
            r9 = 0
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r7
        L24:
            okhttp3.internal.http2.Http2Connection r0 = r6.connection
            int r1 = r6.f612id
            r0.writeHeaders(r1, r8, r7)
            if (r9 == 0) goto L32
            okhttp3.internal.http2.Http2Connection r7 = r6.connection
            r7.flush()
        L32:
            return
        L33:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            throw r7
        L36:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "headers == null"
            r7.<init>(r8)
            throw r7
    }

    public okio.Timeout writeTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }
}
