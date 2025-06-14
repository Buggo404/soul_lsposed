package okhttp3.internal.http1;

/* loaded from: classes.dex */
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final okhttp3.OkHttpClient client;
    private long headerLimit;
    private final okhttp3.internal.connection.RealConnection realConnection;
    private final okio.BufferedSink sink;
    private final okio.BufferedSource source;
    private int state;
    private okhttp3.Headers trailers;

    /* renamed from: okhttp3.internal.http1.Http1ExchangeCodec$1 */
    static /* synthetic */ class C11831 {
    }

    private abstract class AbstractSource implements okio.Source {
        protected boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        protected final okio.ForwardingTimeout timeout;

        private AbstractSource(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSource r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$500(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        /* synthetic */ AbstractSource(okhttp3.internal.http1.Http1ExchangeCodec r1, okhttp3.internal.http1.Http1ExchangeCodec.C11831 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // okio.Source
        public long read(okio.Buffer r2, long r3) throws java.io.IOException {
                r1 = this;
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.io.IOException -> Lb
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$500(r0)     // Catch: java.io.IOException -> Lb
                long r2 = r0.read(r2, r3)     // Catch: java.io.IOException -> Lb
                return r2
            Lb:
                r2 = move-exception
                okhttp3.internal.http1.Http1ExchangeCodec r3 = r1.this$0
                okhttp3.internal.connection.RealConnection r3 = okhttp3.internal.http1.Http1ExchangeCodec.access$600(r3)
                r3.noNewExchanges()
                r1.responseBodyComplete()
                throw r2
        }

        final void responseBodyComplete() {
                r3 = this;
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$400(r0)
                r1 = 6
                if (r0 != r1) goto La
                return
            La:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$400(r0)
                r2 = 5
                if (r0 != r2) goto L20
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okio.ForwardingTimeout r2 = r3.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$300(r0, r2)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okhttp3.internal.http1.Http1ExchangeCodec.access$402(r0, r1)
                return
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "state: "
                r1.<init>(r2)
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r3.this$0
                int r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$400(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }
    }

    private final class ChunkedSink implements okio.Sink {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        ChunkedSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSink r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws java.io.IOException {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L7
                monitor-exit(r2)
                return
            L7:
                r0 = 1
                r2.closed = r0     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)     // Catch: java.lang.Throwable -> L24
                java.lang.String r1 = "0\r\n\r\n"
                r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                okio.ForwardingTimeout r1 = r2.timeout     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec.access$300(r0, r1)     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$402(r0, r1)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r2)
                return
            L24:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() throws java.io.IOException {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L7
                monitor-exit(r1)
                return
            L7:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.lang.Throwable -> L12
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)     // Catch: java.lang.Throwable -> L12
                r0.flush()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)
                return
            L12:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r3, long r4) throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 != 0) goto L32
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 != 0) goto Lb
                return
            Lb:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)
                r0.writeHexadecimalUnsignedLong(r4)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)
                java.lang.String r1 = "\r\n"
                r0.writeUtf8(r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)
                r0.write(r3, r4)
                okhttp3.internal.http1.Http1ExchangeCodec r3 = r2.this$0
                okio.BufferedSink r3 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r3)
                r3.writeUtf8(r1)
                return
            L32:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "closed"
                r3.<init>(r4)
                throw r3
        }
    }

    private class ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okhttp3.HttpUrl url;

        ChunkedSource(okhttp3.internal.http1.Http1ExchangeCodec r3, okhttp3.HttpUrl r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 0
                r2.<init>(r3, r0)
                r0 = -1
                r2.bytesRemainingInChunk = r0
                r3 = 1
                r2.hasMoreChunks = r3
                r2.url = r4
                return
        }

        private void readChunkSize() throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "expected chunk size and optional extensions but was \""
                long r1 = r6.bytesRemainingInChunk
                r3 = -1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L13
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0
                okio.BufferedSource r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$500(r1)
                r1.readUtf8LineStrict()
            L13:
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0     // Catch: java.lang.NumberFormatException -> L8d
                okio.BufferedSource r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$500(r1)     // Catch: java.lang.NumberFormatException -> L8d
                long r1 = r1.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> L8d
                r6.bytesRemainingInChunk = r1     // Catch: java.lang.NumberFormatException -> L8d
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0     // Catch: java.lang.NumberFormatException -> L8d
                okio.BufferedSource r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$500(r1)     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.String r1 = r1.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.String r1 = r1.trim()     // Catch: java.lang.NumberFormatException -> L8d
                long r2 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L8d
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L6e
                boolean r2 = r1.isEmpty()     // Catch: java.lang.NumberFormatException -> L8d
                if (r2 != 0) goto L43
                java.lang.String r2 = ";"
                boolean r2 = r1.startsWith(r2)     // Catch: java.lang.NumberFormatException -> L8d
                if (r2 == 0) goto L6e
            L43:
                long r0 = r6.bytesRemainingInChunk
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 != 0) goto L6d
                r0 = 0
                r6.hasMoreChunks = r0
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.Headers r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$900(r0)
                okhttp3.internal.http1.Http1ExchangeCodec.access$802(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$1000(r0)
                okhttp3.CookieJar r0 = r0.cookieJar()
                okhttp3.HttpUrl r1 = r6.url
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r6.this$0
                okhttp3.Headers r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$800(r2)
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r2)
                r6.responseBodyComplete()
            L6d:
                return
            L6e:
                java.net.ProtocolException r2 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8d
                r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> L8d
                long r4 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.StringBuilder r0 = r3.append(r4)     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.String r1 = "\""
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NumberFormatException -> L8d
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8d
                r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L8d
                throw r2     // Catch: java.lang.NumberFormatException -> L8d
            L8d:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r2.hasMoreChunks
                if (r0 == 0) goto L1f
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal.Util.discard(r2, r0, r1)
                if (r0 != 0) goto L1f
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okhttp3.internal.connection.RealConnection r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$600(r0)
                r0.noNewExchanges()
                r2.responseBodyComplete()
            L1f:
                r0 = 1
                r2.closed = r0
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer r8, long r9) throws java.io.IOException {
                r7 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L53
                boolean r2 = r7.closed
                if (r2 != 0) goto L4b
                boolean r2 = r7.hasMoreChunks
                r3 = -1
                if (r2 != 0) goto L11
                return r3
            L11:
                long r5 = r7.bytesRemainingInChunk
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 == 0) goto L1b
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L23
            L1b:
                r7.readChunkSize()
                boolean r0 = r7.hasMoreChunks
                if (r0 != 0) goto L23
                return r3
            L23:
                long r0 = r7.bytesRemainingInChunk
                long r9 = java.lang.Math.min(r9, r0)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 == 0) goto L37
                long r0 = r7.bytesRemainingInChunk
                long r0 = r0 - r8
                r7.bytesRemainingInChunk = r0
                return r8
            L37:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.connection.RealConnection r8 = okhttp3.internal.http1.Http1ExchangeCodec.access$600(r8)
                r8.noNewExchanges()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                r7.responseBodyComplete()
                throw r8
            L4b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
            L53:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                java.lang.StringBuilder r9 = r0.append(r9)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    private class FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        FixedLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r3, long r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 0
                r2.<init>(r3, r0)
                r2.bytesRemaining = r4
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 != 0) goto L11
                r2.responseBodyComplete()
            L11:
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.closed
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.bytesRemaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L23
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal.Util.discard(r4, r0, r1)
                if (r0 != 0) goto L23
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r4.this$0
                okhttp3.internal.connection.RealConnection r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$600(r0)
                r0.noNewExchanges()
                r4.responseBodyComplete()
            L23:
                r0 = 1
                r4.closed = r0
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer r8, long r9) throws java.io.IOException {
                r7 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L48
                boolean r2 = r7.closed
                if (r2 != 0) goto L40
                long r2 = r7.bytesRemaining
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                r5 = -1
                if (r4 != 0) goto L13
                return r5
            L13:
                long r9 = java.lang.Math.min(r2, r9)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r10 == 0) goto L2c
                long r2 = r7.bytesRemaining
                long r2 = r2 - r8
                r7.bytesRemaining = r2
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r10 != 0) goto L2b
                r7.responseBodyComplete()
            L2b:
                return r8
            L2c:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.connection.RealConnection r8 = okhttp3.internal.http1.Http1ExchangeCodec.access$600(r8)
                r8.noNewExchanges()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                r7.responseBodyComplete()
                throw r8
            L40:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
            L48:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                java.lang.StringBuilder r9 = r0.append(r9)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    private final class KnownLengthSink implements okio.Sink {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        private KnownLengthSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSink r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        /* synthetic */ KnownLengthSink(okhttp3.internal.http1.Http1ExchangeCodec r1, okhttp3.internal.http1.Http1ExchangeCodec.C11831 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.closed = r0
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.ForwardingTimeout r1 = r2.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$300(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$402(r0, r1)
                return
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)
                r0.flush()
                return
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r8, long r9) throws java.io.IOException {
                r7 = this;
                boolean r0 = r7.closed
                if (r0 != 0) goto L18
                long r1 = r8.size()
                r3 = 0
                r5 = r9
                okhttp3.internal.Util.checkOffsetAndCount(r1, r3, r5)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$200(r0)
                r0.write(r8, r9)
                return
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
        }
    }

    private class UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        private UnknownLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ UnknownLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r1, okhttp3.internal.http1.Http1ExchangeCodec.C11831 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r1.inputExhausted
                if (r0 != 0) goto Lc
                r1.responseBodyComplete()
            Lc:
                r0 = 1
                r1.closed = r0
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer r4, long r5) throws java.io.IOException {
                r3 = this;
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L29
                boolean r0 = r3.closed
                if (r0 != 0) goto L21
                boolean r0 = r3.inputExhausted
                r1 = -1
                if (r0 == 0) goto L11
                return r1
            L11:
                long r4 = super.read(r4, r5)
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 != 0) goto L20
                r4 = 1
                r3.inputExhausted = r4
                r3.responseBodyComplete()
                return r1
            L20:
                return r4
            L21:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "closed"
                r4.<init>(r5)
                throw r4
            L29:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                java.lang.StringBuilder r5 = r0.append(r5)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }
    }

    public Http1ExchangeCodec(okhttp3.OkHttpClient r3, okhttp3.internal.connection.RealConnection r4, okio.BufferedSource r5, okio.BufferedSink r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.state = r0
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.headerLimit = r0
            r2.client = r3
            r2.realConnection = r4
            r2.source = r5
            r2.sink = r6
            return
    }

    static /* synthetic */ okhttp3.OkHttpClient access$1000(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.OkHttpClient r0 = r0.client
            return r0
    }

    static /* synthetic */ okio.BufferedSink access$200(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okio.BufferedSink r0 = r0.sink
            return r0
    }

    static /* synthetic */ void access$300(okhttp3.internal.http1.Http1ExchangeCodec r0, okio.ForwardingTimeout r1) {
            r0.detachTimeout(r1)
            return
    }

    static /* synthetic */ int access$400(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            int r0 = r0.state
            return r0
    }

    static /* synthetic */ int access$402(okhttp3.internal.http1.Http1ExchangeCodec r0, int r1) {
            r0.state = r1
            return r1
    }

    static /* synthetic */ okio.BufferedSource access$500(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    static /* synthetic */ okhttp3.internal.connection.RealConnection access$600(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.internal.connection.RealConnection r0 = r0.realConnection
            return r0
    }

    static /* synthetic */ okhttp3.Headers access$800(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.Headers r0 = r0.trailers
            return r0
    }

    static /* synthetic */ okhttp3.Headers access$802(okhttp3.internal.http1.Http1ExchangeCodec r0, okhttp3.Headers r1) {
            r0.trailers = r1
            return r1
    }

    static /* synthetic */ okhttp3.Headers access$900(okhttp3.internal.http1.Http1ExchangeCodec r0) throws java.io.IOException {
            okhttp3.Headers r0 = r0.readHeaders()
            return r0
    }

    private void detachTimeout(okio.ForwardingTimeout r3) {
            r2 = this;
            okio.Timeout r0 = r3.delegate()
            okio.Timeout r1 = okio.Timeout.NONE
            r3.setDelegate(r1)
            r0.clearDeadline()
            r0.clearTimeout()
            return
    }

    private okio.Sink newChunkedSink() {
            r3 = this;
            int r0 = r3.state
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 2
            r3.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink
            r0.<init>(r3)
            return r0
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state: "
            r1.<init>(r2)
            int r2 = r3.state
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private okio.Source newChunkedSource(okhttp3.HttpUrl r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource
            r0.<init>(r2, r3)
            return r0
        Le:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "state: "
            r0.<init>(r1)
            int r1 = r2.state
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    private okio.Source newFixedLengthSource(long r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource
            r0.<init>(r2, r3)
            return r0
        Le:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "state: "
            r4.<init>(r0)
            int r0 = r2.state
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private okio.Sink newKnownLengthSink() {
            r3 = this;
            int r0 = r3.state
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 2
            r3.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state: "
            r1.<init>(r2)
            int r2 = r3.state
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private okio.Source newUnknownLengthSource() {
            r3 = this;
            int r0 = r3.state
            r1 = 4
            if (r0 != r1) goto L14
            r0 = 5
            r3.state = r0
            okhttp3.internal.connection.RealConnection r0 = r3.realConnection
            r0.noNewExchanges()
            okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state: "
            r1.<init>(r2)
            int r2 = r3.state
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String readHeaderLine() throws java.io.IOException {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            long r1 = r5.headerLimit
            java.lang.String r0 = r0.readUtf8LineStrict(r1)
            long r1 = r5.headerLimit
            int r3 = r0.length()
            long r3 = (long) r3
            long r1 = r1 - r3
            r5.headerLimit = r1
            return r0
    }

    private okhttp3.Headers readHeaders() throws java.io.IOException {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
        L5:
            java.lang.String r1 = r3.readHeaderLine()
            int r2 = r1.length()
            if (r2 == 0) goto L15
            okhttp3.internal.Internal r2 = okhttp3.internal.Internal.instance
            r2.addLenient(r0, r1)
            goto L5
        L15:
            okhttp3.Headers r0 = r0.build()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.realConnection
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.internal.connection.RealConnection connection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.realConnection
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Sink createRequestBody(okhttp3.Request r3, long r4) throws java.io.IOException {
            r2 = this;
            okhttp3.RequestBody r0 = r3.body()
            if (r0 == 0) goto L19
            okhttp3.RequestBody r0 = r3.body()
            boolean r0 = r0.isDuplex()
            if (r0 != 0) goto L11
            goto L19
        L11:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r4 = "Duplex connections are not supported for HTTP/1"
            r3.<init>(r4)
            throw r3
        L19:
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r3 = r3.header(r0)
            java.lang.String r0 = "chunked"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L2c
            okio.Sink r3 = r2.newChunkedSink()
            return r3
        L2c:
            r0 = -1
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L37
            okio.Sink r3 = r2.newKnownLengthSink()
            return r3
        L37:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot stream a request body without chunked encoding or a known content length!"
            r3.<init>(r4)
            throw r3
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws java.io.IOException {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws java.io.IOException {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    public boolean isClosed() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Source openResponseBodySource(okhttp3.Response r5) {
            r4 = this;
            boolean r0 = okhttp3.internal.http.HttpHeaders.hasBody(r5)
            if (r0 != 0) goto Ld
            r0 = 0
            okio.Source r5 = r4.newFixedLengthSource(r0)
            return r5
        Ld:
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r0 = r5.header(r0)
            java.lang.String r1 = "chunked"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L28
            okhttp3.Request r5 = r5.request()
            okhttp3.HttpUrl r5 = r5.url()
            okio.Source r5 = r4.newChunkedSource(r5)
            return r5
        L28:
            long r0 = okhttp3.internal.http.HttpHeaders.contentLength(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L37
            okio.Source r5 = r4.newFixedLengthSource(r0)
            return r5
        L37:
            okio.Source r5 = r4.newUnknownLengthSource()
            return r5
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Response.Builder readResponseHeaders(boolean r5) throws java.io.IOException {
            r4 = this;
            int r0 = r4.state
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L20
            if (r0 != r2) goto L9
            goto L20
        L9:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "state: "
            r0.<init>(r1)
            int r1 = r4.state
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L20:
            java.lang.String r0 = r4.readHeaderLine()     // Catch: java.io.EOFException -> L5c
            okhttp3.internal.http.StatusLine r0 = okhttp3.internal.http.StatusLine.parse(r0)     // Catch: java.io.EOFException -> L5c
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder     // Catch: java.io.EOFException -> L5c
            r1.<init>()     // Catch: java.io.EOFException -> L5c
            okhttp3.Protocol r3 = r0.protocol     // Catch: java.io.EOFException -> L5c
            okhttp3.Response$Builder r1 = r1.protocol(r3)     // Catch: java.io.EOFException -> L5c
            int r3 = r0.code     // Catch: java.io.EOFException -> L5c
            okhttp3.Response$Builder r1 = r1.code(r3)     // Catch: java.io.EOFException -> L5c
            java.lang.String r3 = r0.message     // Catch: java.io.EOFException -> L5c
            okhttp3.Response$Builder r1 = r1.message(r3)     // Catch: java.io.EOFException -> L5c
            okhttp3.Headers r3 = r4.readHeaders()     // Catch: java.io.EOFException -> L5c
            okhttp3.Response$Builder r1 = r1.headers(r3)     // Catch: java.io.EOFException -> L5c
            r3 = 100
            if (r5 == 0) goto L51
            int r5 = r0.code     // Catch: java.io.EOFException -> L5c
            if (r5 != r3) goto L51
            r5 = 0
            return r5
        L51:
            int r5 = r0.code     // Catch: java.io.EOFException -> L5c
            if (r5 != r3) goto L58
            r4.state = r2     // Catch: java.io.EOFException -> L5c
            return r1
        L58:
            r5 = 4
            r4.state = r5     // Catch: java.io.EOFException -> L5c
            return r1
        L5c:
            r5 = move-exception
            okhttp3.internal.connection.RealConnection r0 = r4.realConnection
            if (r0 == 0) goto L72
            okhttp3.Route r0 = r0.route()
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            goto L74
        L72:
            java.lang.String r0 = "unknown"
        L74:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "unexpected end of stream on "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0, r5)
            throw r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(okhttp3.Response r3) {
            r2 = this;
            boolean r0 = okhttp3.internal.http.HttpHeaders.hasBody(r3)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r0 = r3.header(r0)
            java.lang.String r1 = "chunked"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1a
            r0 = -1
            return r0
        L1a:
            long r0 = okhttp3.internal.http.HttpHeaders.contentLength(r3)
            return r0
    }

    public void skipConnectBody(okhttp3.Response r5) throws java.io.IOException {
            r4 = this;
            long r0 = okhttp3.internal.http.HttpHeaders.contentLength(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Lb
            return
        Lb:
            okio.Source r5 = r4.newFixedLengthSource(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.internal.Util.skipAll(r5, r0, r1)
            r5.close()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Headers trailers() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto Ld
            okhttp3.Headers r0 = r2.trailers
            if (r0 == 0) goto La
            goto Lc
        La:
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS
        Lc:
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "too early; can't read the trailers yet"
            r0.<init>(r1)
            throw r0
    }

    public void writeRequest(okhttp3.Headers r5, java.lang.String r6) throws java.io.IOException {
            r4 = this;
            int r0 = r4.state
            if (r0 != 0) goto L3d
            okio.BufferedSink r0 = r4.sink
            okio.BufferedSink r6 = r0.writeUtf8(r6)
            java.lang.String r0 = "\r\n"
            r6.writeUtf8(r0)
            int r6 = r5.size()
            r1 = 0
        L14:
            if (r1 >= r6) goto L34
            okio.BufferedSink r2 = r4.sink
            java.lang.String r3 = r5.name(r1)
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            java.lang.String r3 = ": "
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            java.lang.String r3 = r5.value(r1)
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            r2.writeUtf8(r0)
            int r1 = r1 + 1
            goto L14
        L34:
            okio.BufferedSink r5 = r4.sink
            r5.writeUtf8(r0)
            r5 = 1
            r4.state = r5
            return
        L3d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "state: "
            r6.<init>(r0)
            int r0 = r4.state
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(okhttp3.Request r2) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.realConnection
            okhttp3.Route r0 = r0.route()
            java.net.Proxy r0 = r0.proxy()
            java.net.Proxy$Type r0 = r0.type()
            java.lang.String r0 = okhttp3.internal.http.RequestLine.get(r2, r0)
            okhttp3.Headers r2 = r2.headers()
            r1.writeRequest(r2, r0)
            return
    }
}
