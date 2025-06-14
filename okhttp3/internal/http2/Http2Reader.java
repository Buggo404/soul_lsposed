package okhttp3.internal.http2;

/* loaded from: classes.dex */
final class Http2Reader implements java.io.Closeable {
    static final java.util.logging.Logger logger = null;
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    final okhttp3.internal.http2.Hpack.Reader hpackReader;
    private final okio.BufferedSource source;

    static final class ContinuationSource implements okio.Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final okio.BufferedSource source;
        int streamId;

        ContinuationSource(okio.BufferedSource r1) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                return
        }

        private void readContinuationHeader() throws java.io.IOException {
                r7 = this;
                int r0 = r7.streamId
                okio.BufferedSource r1 = r7.source
                int r1 = okhttp3.internal.http2.Http2Reader.readMedium(r1)
                r7.left = r1
                r7.length = r1
                okio.BufferedSource r1 = r7.source
                byte r1 = r1.readByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                byte r1 = (byte) r1
                okio.BufferedSource r2 = r7.source
                byte r2 = r2.readByte()
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r7.flags = r2
                java.util.logging.Logger r2 = okhttp3.internal.http2.Http2Reader.logger
                java.util.logging.Level r3 = java.util.logging.Level.FINE
                boolean r2 = r2.isLoggable(r3)
                r3 = 1
                if (r2 == 0) goto L3a
                java.util.logging.Logger r2 = okhttp3.internal.http2.Http2Reader.logger
                int r4 = r7.streamId
                int r5 = r7.length
                byte r6 = r7.flags
                java.lang.String r4 = okhttp3.internal.http2.Http2.frameLog(r3, r4, r5, r1, r6)
                r2.fine(r4)
            L3a:
                okio.BufferedSource r2 = r7.source
                int r2 = r2.readInt()
                r4 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r4
                r7.streamId = r2
                r4 = 9
                r5 = 0
                if (r1 != r4) goto L57
                if (r2 != r0) goto L4e
                return
            L4e:
                java.lang.String r0 = "TYPE_CONTINUATION streamId changed"
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.io.IOException r0 = okhttp3.internal.http2.Http2.ioException(r0, r1)
                throw r0
            L57:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
                r0[r5] = r1
                java.lang.String r1 = "%s != TYPE_CONTINUATION"
                java.io.IOException r0 = okhttp3.internal.http2.Http2.ioException(r1, r0)
                throw r0
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r0 = this;
                return
        }

        @Override // okio.Source
        public long read(okio.Buffer r7, long r8) throws java.io.IOException {
                r6 = this;
            L0:
                int r0 = r6.left
                r1 = -1
                if (r0 != 0) goto L1c
                okio.BufferedSource r0 = r6.source
                short r3 = r6.padding
                long r3 = (long) r3
                r0.skip(r3)
                r0 = 0
                r6.padding = r0
                byte r0 = r6.flags
                r0 = r0 & 4
                if (r0 == 0) goto L18
                return r1
            L18:
                r6.readContinuationHeader()
                goto L0
            L1c:
                okio.BufferedSource r3 = r6.source
                long r4 = (long) r0
                long r8 = java.lang.Math.min(r8, r4)
                long r7 = r3.read(r7, r8)
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 != 0) goto L2c
                return r1
            L2c:
                int r9 = r6.left
                long r0 = (long) r9
                long r0 = r0 - r7
                int r9 = (int) r0
                r6.left = r9
                return r7
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                okio.Timeout r0 = r0.timeout()
                return r0
        }
    }

    interface Handler {
        void ackSettings();

        void alternateService(int r1, java.lang.String r2, okio.ByteString r3, java.lang.String r4, int r5, long r6);

        void data(boolean r1, int r2, okio.BufferedSource r3, int r4) throws java.io.IOException;

        void goAway(int r1, okhttp3.internal.http2.ErrorCode r2, okio.ByteString r3);

        void headers(boolean r1, int r2, int r3, java.util.List<okhttp3.internal.http2.Header> r4);

        void ping(boolean r1, int r2, int r3);

        void priority(int r1, int r2, int r3, boolean r4);

        void pushPromise(int r1, int r2, java.util.List<okhttp3.internal.http2.Header> r3) throws java.io.IOException;

        void rstStream(int r1, okhttp3.internal.http2.ErrorCode r2);

        void settings(boolean r1, okhttp3.internal.http2.Settings r2);

        void windowUpdate(int r1, long r2);
    }

    static {
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.http2.Http2Reader.logger = r0
            return
    }

    Http2Reader(okio.BufferedSource r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.source = r2
            r1.client = r3
            okhttp3.internal.http2.Http2Reader$ContinuationSource r3 = new okhttp3.internal.http2.Http2Reader$ContinuationSource
            r3.<init>(r2)
            r1.continuation = r3
            okhttp3.internal.http2.Hpack$Reader r2 = new okhttp3.internal.http2.Hpack$Reader
            r0 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r0, r3)
            r1.hpackReader = r2
            return
    }

    static int lengthWithoutPadding(int r1, byte r2, short r3) throws java.io.IOException {
            r2 = r2 & 8
            if (r2 == 0) goto L6
            int r1 = r1 + (-1)
        L6:
            if (r3 > r1) goto Lb
            int r1 = r1 - r3
            short r1 = (short) r1
            return r1
        Lb:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r2[r0] = r3
            r3 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "PROTOCOL_ERROR padding %s > remaining length %s"
            java.io.IOException r1 = okhttp3.internal.http2.Http2.ioException(r1, r2)
            throw r1
    }

    private void readData(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, byte r7, int r8) throws java.io.IOException {
            r4 = this;
            r0 = 0
            if (r8 == 0) goto L39
            r1 = r7 & 1
            r2 = 1
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r0
        Lb:
            r3 = r7 & 32
            if (r3 == 0) goto L10
            goto L11
        L10:
            r2 = r0
        L11:
            if (r2 != 0) goto L30
            r2 = r7 & 8
            if (r2 == 0) goto L20
            okio.BufferedSource r0 = r4.source
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L20:
            int r6 = lengthWithoutPadding(r6, r7, r0)
            okio.BufferedSource r7 = r4.source
            r5.data(r1, r8, r7, r6)
            okio.BufferedSource r5 = r4.source
            long r6 = (long) r0
            r5.skip(r6)
            return
        L30:
            java.lang.String r5 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r5, r6)
            throw r5
        L39:
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r5, r6)
            throw r5
    }

    private void readGoAway(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, byte r7, int r8) throws java.io.IOException {
            r4 = this;
            r7 = 1
            r0 = 0
            r1 = 8
            if (r6 < r1) goto L42
            if (r8 != 0) goto L39
            okio.BufferedSource r8 = r4.source
            int r8 = r8.readInt()
            okio.BufferedSource r2 = r4.source
            int r2 = r2.readInt()
            int r6 = r6 - r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.fromHttp2(r2)
            if (r1 == 0) goto L2a
            okio.ByteString r7 = okio.ByteString.EMPTY
            if (r6 <= 0) goto L26
            okio.BufferedSource r7 = r4.source
            long r2 = (long) r6
            okio.ByteString r7 = r7.readByteString(r2)
        L26:
            r5.goAway(r8, r1, r7)
            return
        L2a:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5[r0] = r6
            java.lang.String r6 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r6, r5)
            throw r5
        L39:
            java.lang.String r5 = "TYPE_GOAWAY streamId != 0"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r5, r6)
            throw r5
        L42:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r0] = r6
            java.lang.String r6 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r6, r5)
            throw r5
    }

    private java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int r2, short r3, byte r4, int r5) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r1.continuation
            r0.left = r2
            r0.length = r2
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.padding = r3
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.flags = r4
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.streamId = r5
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            r2.readHeaders()
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            java.util.List r2 = r2.getAndResetHeaderList()
            return r2
    }

    private void readHeaders(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, byte r6, int r7) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r7 == 0) goto L2d
            r1 = r6 & 1
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r0
        La:
            r2 = r6 & 8
            if (r2 == 0) goto L17
            okio.BufferedSource r0 = r3.source
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L17:
            r2 = r6 & 32
            if (r2 == 0) goto L20
            r3.readPriority(r4, r7)
            int r5 = r5 + (-5)
        L20:
            int r5 = lengthWithoutPadding(r5, r6, r0)
            java.util.List r5 = r3.readHeaderBlock(r5, r0, r6, r7)
            r6 = -1
            r4.headers(r1, r7, r6, r5)
            return
        L2d:
            java.lang.String r4 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.io.IOException r4 = okhttp3.internal.http2.Http2.ioException(r4, r5)
            throw r4
    }

    static int readMedium(okio.BufferedSource r2) throws java.io.IOException {
            byte r0 = r2.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r2.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    private void readPing(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, byte r6, int r7) throws java.io.IOException {
            r3 = this;
            r0 = 8
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L25
            if (r7 != 0) goto L1c
            okio.BufferedSource r5 = r3.source
            int r5 = r5.readInt()
            okio.BufferedSource r7 = r3.source
            int r7 = r7.readInt()
            r6 = r6 & r2
            if (r6 == 0) goto L18
            r1 = r2
        L18:
            r4.ping(r1, r5, r7)
            return
        L1c:
            java.lang.String r4 = "TYPE_PING streamId != 0"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.io.IOException r4 = okhttp3.internal.http2.Http2.ioException(r4, r5)
            throw r4
        L25:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.String r5 = "TYPE_PING length != 8: %s"
            java.io.IOException r4 = okhttp3.internal.http2.Http2.ioException(r5, r4)
            throw r4
    }

    private void readPriority(okhttp3.internal.http2.Http2Reader.Handler r5, int r6) throws java.io.IOException {
            r4 = this;
            okio.BufferedSource r0 = r4.source
            int r0 = r0.readInt()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r2 = 1
            if (r1 == 0) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            okio.BufferedSource r3 = r4.source
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r5.priority(r6, r0, r3, r1)
            return
    }

    private void readPriority(okhttp3.internal.http2.Http2Reader.Handler r2, int r3, byte r4, int r5) throws java.io.IOException {
            r1 = this;
            r4 = 5
            r0 = 0
            if (r3 != r4) goto L13
            if (r5 == 0) goto La
            r1.readPriority(r2, r5)
            return
        La:
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.io.IOException r2 = okhttp3.internal.http2.Http2.ioException(r2, r3)
            throw r2
        L13:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.String r3 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r2 = okhttp3.internal.http2.Http2.ioException(r3, r2)
            throw r2
    }

    private void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, byte r6, int r7) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r7 == 0) goto L28
            r1 = r6 & 8
            if (r1 == 0) goto L10
            okio.BufferedSource r0 = r3.source
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L10:
            okio.BufferedSource r1 = r3.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            int r5 = r5 + (-4)
            int r5 = lengthWithoutPadding(r5, r6, r0)
            java.util.List r5 = r3.readHeaderBlock(r5, r0, r6, r7)
            r4.pushPromise(r7, r1, r5)
            return
        L28:
            java.lang.String r4 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.io.IOException r4 = okhttp3.internal.http2.Http2.ioException(r4, r5)
            throw r4
    }

    private void readRstStream(okhttp3.internal.http2.Http2Reader.Handler r3, int r4, byte r5, int r6) throws java.io.IOException {
            r2 = this;
            r5 = 4
            r0 = 1
            r1 = 0
            if (r4 != r5) goto L2f
            if (r6 == 0) goto L26
            okio.BufferedSource r4 = r2.source
            int r4 = r4.readInt()
            okhttp3.internal.http2.ErrorCode r5 = okhttp3.internal.http2.ErrorCode.fromHttp2(r4)
            if (r5 == 0) goto L17
            r3.rstStream(r6, r5)
            return
        L17:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r3 = okhttp3.internal.http2.Http2.ioException(r4, r3)
            throw r3
        L26:
            java.lang.String r3 = "TYPE_RST_STREAM streamId == 0"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.io.IOException r3 = okhttp3.internal.http2.Http2.ioException(r3, r4)
            throw r3
        L2f:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r3 = okhttp3.internal.http2.Http2.ioException(r4, r3)
            throw r3
    }

    private void readSettings(okhttp3.internal.http2.Http2Reader.Handler r7, int r8, byte r9, int r10) throws java.io.IOException {
            r6 = this;
            r0 = 0
            if (r10 != 0) goto L8e
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L16
            if (r8 != 0) goto Ld
            r7.ackSettings()
            return
        Ld:
            java.lang.String r7 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r7, r8)
            throw r7
        L16:
            int r9 = r8 % 6
            if (r9 != 0) goto L7f
            okhttp3.internal.http2.Settings r9 = new okhttp3.internal.http2.Settings
            r9.<init>()
            r1 = r0
        L20:
            if (r1 >= r8) goto L7b
            okio.BufferedSource r2 = r6.source
            short r2 = r2.readShort()
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            okio.BufferedSource r3 = r6.source
            int r3 = r3.readInt()
            r4 = 2
            if (r2 == r4) goto L67
            r4 = 3
            r5 = 4
            if (r2 == r4) goto L65
            if (r2 == r5) goto L58
            r4 = 5
            if (r2 == r4) goto L3f
            goto L75
        L3f:
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 < r4) goto L49
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 > r4) goto L49
            goto L75
        L49:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7[r0] = r8
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r8, r7)
            throw r7
        L58:
            if (r3 < 0) goto L5c
            r2 = 7
            goto L75
        L5c:
            java.lang.String r7 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r7, r8)
            throw r7
        L65:
            r2 = r5
            goto L75
        L67:
            if (r3 == 0) goto L75
            if (r3 != r10) goto L6c
            goto L75
        L6c:
            java.lang.String r7 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r7, r8)
            throw r7
        L75:
            r9.set(r2, r3)
            int r1 = r1 + 6
            goto L20
        L7b:
            r7.settings(r0, r9)
            return
        L7f:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r0] = r8
            java.lang.String r8 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r8, r7)
            throw r7
        L8e:
            java.lang.String r7 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r7, r8)
            throw r7
    }

    private void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, byte r7, int r8) throws java.io.IOException {
            r4 = this;
            r7 = 4
            r0 = 0
            r1 = 1
            if (r6 != r7) goto L29
            okio.BufferedSource r6 = r4.source
            int r6 = r6.readInt()
            long r6 = (long) r6
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 & r2
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r5.windowUpdate(r8, r6)
            return
        L1a:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r0] = r6
            java.lang.String r6 = "windowSizeIncrement was 0"
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r6, r5)
            throw r5
        L29:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r0] = r6
            java.lang.String r6 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r5 = okhttp3.internal.http2.Http2.ioException(r6, r5)
            throw r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public boolean nextFrame(boolean r7, okhttp3.internal.http2.Http2Reader.Handler r8) throws java.io.IOException {
            r6 = this;
            r0 = 0
            okio.BufferedSource r1 = r6.source     // Catch: java.io.EOFException -> L94
            r2 = 9
            r1.require(r2)     // Catch: java.io.EOFException -> L94
            okio.BufferedSource r1 = r6.source
            int r1 = readMedium(r1)
            r2 = 1
            if (r1 < 0) goto L85
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r3) goto L85
            okio.BufferedSource r3 = r6.source
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r7 == 0) goto L33
            r7 = 4
            if (r3 != r7) goto L24
            goto L33
        L24:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Byte r8 = java.lang.Byte.valueOf(r3)
            r7[r0] = r8
            java.lang.String r8 = "Expected a SETTINGS frame but was %s"
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r8, r7)
            throw r7
        L33:
            okio.BufferedSource r7 = r6.source
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            okio.BufferedSource r0 = r6.source
            int r0 = r0.readInt()
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r4
            java.util.logging.Logger r4 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r5 = r4.isLoggable(r5)
            if (r5 == 0) goto L57
            java.lang.String r5 = okhttp3.internal.http2.Http2.frameLog(r2, r0, r1, r3, r7)
            r4.fine(r5)
        L57:
            switch(r3) {
                case 0: goto L81;
                case 1: goto L7d;
                case 2: goto L79;
                case 3: goto L75;
                case 4: goto L71;
                case 5: goto L6d;
                case 6: goto L69;
                case 7: goto L65;
                case 8: goto L61;
                default: goto L5a;
            }
        L5a:
            okio.BufferedSource r7 = r6.source
            long r0 = (long) r1
            r7.skip(r0)
            goto L84
        L61:
            r6.readWindowUpdate(r8, r1, r7, r0)
            goto L84
        L65:
            r6.readGoAway(r8, r1, r7, r0)
            goto L84
        L69:
            r6.readPing(r8, r1, r7, r0)
            goto L84
        L6d:
            r6.readPushPromise(r8, r1, r7, r0)
            goto L84
        L71:
            r6.readSettings(r8, r1, r7, r0)
            goto L84
        L75:
            r6.readRstStream(r8, r1, r7, r0)
            goto L84
        L79:
            r6.readPriority(r8, r1, r7, r0)
            goto L84
        L7d:
            r6.readHeaders(r8, r1, r7, r0)
            goto L84
        L81:
            r6.readData(r8, r1, r7, r0)
        L84:
            return r2
        L85:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7[r0] = r8
            java.lang.String r8 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r7 = okhttp3.internal.http2.Http2.ioException(r8, r7)
            throw r7
        L94:
            return r0
    }

    public void readConnectionPreface(okhttp3.internal.http2.Http2Reader.Handler r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.client
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            boolean r6 = r5.nextFrame(r2, r6)
            if (r6 == 0) goto Ld
            goto L46
        Ld:
            java.lang.String r6 = "Required SETTINGS preface not received"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.io.IOException r6 = okhttp3.internal.http2.Http2.ioException(r6, r0)
            throw r6
        L16:
            okio.BufferedSource r6 = r5.source
            okio.ByteString r0 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            int r0 = r0.size()
            long r3 = (long) r0
            okio.ByteString r6 = r6.readByteString(r3)
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r0.isLoggable(r3)
            if (r3 == 0) goto L3e
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r6.hex()
            r3[r1] = r4
            java.lang.String r4 = "<< CONNECTION %s"
            java.lang.String r3 = okhttp3.internal.Util.format(r4, r3)
            r0.fine(r3)
        L3e:
            okio.ByteString r0 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L47
        L46:
            return
        L47:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r6 = r6.utf8()
            r0[r1] = r6
            java.lang.String r6 = "Expected a connection header but was %s"
            java.io.IOException r6 = okhttp3.internal.http2.Http2.ioException(r6, r0)
            throw r6
    }
}
