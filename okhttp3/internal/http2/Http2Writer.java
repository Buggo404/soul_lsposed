package okhttp3.internal.http2;

/* loaded from: classes.dex */
final class Http2Writer implements java.io.Closeable {
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private boolean closed;
    private final okio.Buffer hpackBuffer;
    final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final okio.BufferedSink sink;

    static {
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.http2.Http2Writer.logger = r0
            return
    }

    Http2Writer(okio.BufferedSink r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.sink = r1
            r0.client = r2
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.hpackBuffer = r1
            okhttp3.internal.http2.Hpack$Writer r2 = new okhttp3.internal.http2.Hpack$Writer
            r2.<init>(r1)
            r0.hpackWriter = r2
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.maxFrameSize = r1
            return
    }

    private void writeContinuationFrames(int r6, long r7) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L24
            int r2 = r5.maxFrameSize
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r7)
            int r2 = (int) r2
            long r3 = (long) r2
            long r7 = r7 - r3
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 0
        L17:
            r1 = 9
            r5.frameHeader(r6, r2, r1, r0)
            okio.BufferedSink r0 = r5.sink
            okio.Buffer r1 = r5.hpackBuffer
            r0.write(r1, r3)
            goto L0
        L24:
            return
    }

    private static void writeMedium(okio.BufferedSink r1, int r2) throws java.io.IOException {
            int r0 = r2 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            int r0 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r2)
            return
    }

    public synchronized void applyAndAckSettings(okhttp3.internal.http2.Settings r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2a
            int r0 = r2.maxFrameSize     // Catch: java.lang.Throwable -> L32
            int r0 = r3.getMaxFrameSize(r0)     // Catch: java.lang.Throwable -> L32
            r2.maxFrameSize = r0     // Catch: java.lang.Throwable -> L32
            int r0 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L32
            r1 = -1
            if (r0 == r1) goto L1d
            okhttp3.internal.http2.Hpack$Writer r0 = r2.hpackWriter     // Catch: java.lang.Throwable -> L32
            int r3 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L32
            r0.setHeaderTableSizeSetting(r3)     // Catch: java.lang.Throwable -> L32
        L1d:
            r3 = 4
            r0 = 1
            r1 = 0
            r2.frameHeader(r1, r1, r3, r0)     // Catch: java.lang.Throwable -> L32
            okio.BufferedSink r3 = r2.sink     // Catch: java.lang.Throwable -> L32
            r3.flush()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return
        L2a:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "closed"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L32
        L32:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.closed = r0     // Catch: java.lang.Throwable -> Lb
            okio.BufferedSink r0 = r1.sink     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void connectionPreface() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.closed     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L3c
            boolean r0 = r5.client     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L44
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L44
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L2a
            java.lang.String r1 = ">> CONNECTION %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L44
            okio.ByteString r3 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.hex()     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = okhttp3.internal.Util.format(r1, r2)     // Catch: java.lang.Throwable -> L44
            r0.fine(r1)     // Catch: java.lang.Throwable -> L44
        L2a:
            okio.BufferedSink r0 = r5.sink     // Catch: java.lang.Throwable -> L44
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L44
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L44
            r0.write(r1)     // Catch: java.lang.Throwable -> L44
            okio.BufferedSink r0 = r5.sink     // Catch: java.lang.Throwable -> L44
            r0.flush()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r5)
            return
        L3c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public synchronized void data(boolean r2, int r3, okio.Buffer r4, int r5) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L10
            if (r2 == 0) goto La
            r2 = 1
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L18
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.dataFrame(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return
        L10:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    void dataFrame(int r3, byte r4, okio.Buffer r5, int r6) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.frameHeader(r3, r6, r0, r4)
            if (r6 <= 0) goto Lc
            okio.BufferedSink r3 = r2.sink
            long r0 = (long) r6
            r3.write(r5, r0)
        Lc:
            return
    }

    public synchronized void flush() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lc
            okio.BufferedSink r0 = r2.sink     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public void frameHeader(int r4, int r5, byte r6, byte r7) throws java.io.IOException {
            r3 = this;
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.String r1 = okhttp3.internal.http2.Http2.frameLog(r2, r4, r5, r6, r7)
            r0.fine(r1)
        L12:
            int r0 = r3.maxFrameSize
            r1 = 1
            if (r5 > r0) goto L48
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r4
            if (r0 != 0) goto L39
            okio.BufferedSink r0 = r3.sink
            writeMedium(r0, r5)
            okio.BufferedSink r5 = r3.sink
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5.writeByte(r6)
            okio.BufferedSink r5 = r3.sink
            r6 = r7 & 255(0xff, float:3.57E-43)
            r5.writeByte(r6)
            okio.BufferedSink r5 = r3.sink
            r6 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r6
            r5.writeInt(r4)
            return
        L39:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r2] = r4
            java.lang.String r4 = "reserved bit set: %s"
            java.lang.IllegalArgumentException r4 = okhttp3.internal.http2.Http2.illegalArgument(r4, r5)
            throw r4
        L48:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r4[r2] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.String r5 = "FRAME_SIZE_ERROR length > %d: %d"
            java.lang.IllegalArgumentException r4 = okhttp3.internal.http2.Http2.illegalArgument(r5, r4)
            throw r4
    }

    public synchronized void goAway(int r4, okhttp3.internal.http2.ErrorCode r5, byte[] r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L36
            int r0 = r5.httpCode     // Catch: java.lang.Throwable -> L3e
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L2d
            int r0 = r6.length     // Catch: java.lang.Throwable -> L3e
            int r0 = r0 + 8
            r1 = 7
            r3.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L3e
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L3e
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L3e
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L3e
            int r5 = r5.httpCode     // Catch: java.lang.Throwable -> L3e
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L3e
            int r4 = r6.length     // Catch: java.lang.Throwable -> L3e
            if (r4 <= 0) goto L26
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L3e
            r4.write(r6)     // Catch: java.lang.Throwable -> L3e
        L26:
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L3e
            r4.flush()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)
            return
        L2d:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3e
            java.lang.IllegalArgumentException r4 = okhttp3.internal.http2.Http2.illegalArgument(r4, r5)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L36:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void headers(boolean r7, int r8, java.util.List<okhttp3.internal.http2.Header> r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L38
            okhttp3.internal.http2.Hpack$Writer r0 = r6.hpackWriter     // Catch: java.lang.Throwable -> L40
            r0.writeHeaders(r9)     // Catch: java.lang.Throwable -> L40
            okio.Buffer r9 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L40
            long r0 = r9.size()     // Catch: java.lang.Throwable -> L40
            int r9 = r6.maxFrameSize     // Catch: java.lang.Throwable -> L40
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L40
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L40
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L40
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L40
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1f
            r5 = 4
            goto L20
        L1f:
            r5 = 0
        L20:
            if (r7 == 0) goto L25
            r7 = r5 | 1
            byte r5 = (byte) r7     // Catch: java.lang.Throwable -> L40
        L25:
            r7 = 1
            r6.frameHeader(r8, r9, r7, r5)     // Catch: java.lang.Throwable -> L40
            okio.BufferedSink r7 = r6.sink     // Catch: java.lang.Throwable -> L40
            okio.Buffer r9 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L40
            r7.write(r9, r2)     // Catch: java.lang.Throwable -> L40
            if (r4 <= 0) goto L36
            long r0 = r0 - r2
            r6.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L40
        L36:
            monitor-exit(r6)
            return
        L38:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L40
            java.lang.String r8 = "closed"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L40
            throw r7     // Catch: java.lang.Throwable -> L40
        L40:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public int maxDataLength() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    public synchronized void ping(boolean r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L22
            r0 = 0
            if (r4 == 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = r0
        Lb:
            r1 = 8
            r2 = 6
            r3.frameHeader(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2a
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2a
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2a
            r4.flush()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L22:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Throwable -> L2a
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void pushPromise(int r8, int r9, java.util.List<okhttp3.internal.http2.Header> r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L3f
            okhttp3.internal.http2.Hpack$Writer r0 = r7.hpackWriter     // Catch: java.lang.Throwable -> L47
            r0.writeHeaders(r10)     // Catch: java.lang.Throwable -> L47
            okio.Buffer r10 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L47
            long r0 = r10.size()     // Catch: java.lang.Throwable -> L47
            int r10 = r7.maxFrameSize     // Catch: java.lang.Throwable -> L47
            r2 = 4
            int r10 = r10 - r2
            long r3 = (long) r10     // Catch: java.lang.Throwable -> L47
            long r3 = java.lang.Math.min(r3, r0)     // Catch: java.lang.Throwable -> L47
            int r10 = (int) r3     // Catch: java.lang.Throwable -> L47
            long r3 = (long) r10     // Catch: java.lang.Throwable -> L47
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            r6 = r2
            goto L22
        L21:
            r6 = 0
        L22:
            int r10 = r10 + r2
            r2 = 5
            r7.frameHeader(r8, r10, r2, r6)     // Catch: java.lang.Throwable -> L47
            okio.BufferedSink r10 = r7.sink     // Catch: java.lang.Throwable -> L47
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r2
            r10.writeInt(r9)     // Catch: java.lang.Throwable -> L47
            okio.BufferedSink r9 = r7.sink     // Catch: java.lang.Throwable -> L47
            okio.Buffer r10 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L47
            r9.write(r10, r3)     // Catch: java.lang.Throwable -> L47
            if (r5 <= 0) goto L3d
            long r0 = r0 - r3
            r7.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L47
        L3d:
            monitor-exit(r7)
            return
        L3f:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = "closed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L47
            throw r8     // Catch: java.lang.Throwable -> L47
        L47:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public synchronized void rstStream(int r4, okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L24
            int r0 = r5.httpCode     // Catch: java.lang.Throwable -> L2c
            r1 = -1
            if (r0 == r1) goto L1e
            r0 = 3
            r1 = 0
            r2 = 4
            r3.frameHeader(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L2c
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2c
            int r5 = r5.httpCode     // Catch: java.lang.Throwable -> L2c
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L2c
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2c
            r4.flush()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            r4.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L24:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void settings(okhttp3.internal.http2.Settings r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L3d
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L45
            int r0 = r0 * 6
            r1 = 0
            r2 = 4
            r4.frameHeader(r1, r0, r2, r1)     // Catch: java.lang.Throwable -> L45
        L10:
            r0 = 10
            if (r1 >= r0) goto L36
            boolean r0 = r5.isSet(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L1b
            goto L33
        L1b:
            if (r1 != r2) goto L1f
            r0 = 3
            goto L25
        L1f:
            r0 = 7
            if (r1 != r0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            okio.BufferedSink r3 = r4.sink     // Catch: java.lang.Throwable -> L45
            r3.writeShort(r0)     // Catch: java.lang.Throwable -> L45
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L45
            int r3 = r5.get(r1)     // Catch: java.lang.Throwable -> L45
            r0.writeInt(r3)     // Catch: java.lang.Throwable -> L45
        L33:
            int r1 = r1 + 1
            goto L10
        L36:
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L45
            r5.flush()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            return
        L3d:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "closed"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L45
            throw r5     // Catch: java.lang.Throwable -> L45
        L45:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized void windowUpdate(int r5, long r6) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L36
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L26
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L26
            r0 = 4
            r2 = 8
            r4.frameHeader(r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L3e
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L3e
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L3e
            r5.writeInt(r6)     // Catch: java.lang.Throwable -> L3e
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L3e
            r5.flush()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)
            return
        L26:
            java.lang.String r5 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L3e
            r0[r1] = r6     // Catch: java.lang.Throwable -> L3e
            java.lang.IllegalArgumentException r5 = okhttp3.internal.http2.Http2.illegalArgument(r5, r0)     // Catch: java.lang.Throwable -> L3e
            throw r5     // Catch: java.lang.Throwable -> L3e
        L36:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3e
            throw r5     // Catch: java.lang.Throwable -> L3e
        L3e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
