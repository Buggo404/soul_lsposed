package okhttp3;

/* loaded from: classes.dex */
public final class Cache implements java.io.Closeable, java.io.Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final okhttp3.internal.cache.DiskLruCache cache;
    private int hitCount;
    final okhttp3.internal.cache.InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;



    private final class CacheRequestImpl implements okhttp3.internal.cache.CacheRequest {
        private okio.Sink body;
        private okio.Sink cacheOut;
        boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Editor editor;
        final /* synthetic */ okhttp3.Cache this$0;


        CacheRequestImpl(okhttp3.Cache r3, okhttp3.internal.cache.DiskLruCache.Editor r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r2.editor = r4
                r0 = 1
                okio.Sink r0 = r4.newSink(r0)
                r2.cacheOut = r0
                okhttp3.Cache$CacheRequestImpl$1 r0 = new okhttp3.Cache$CacheRequestImpl$1
                okio.Sink r1 = r2.cacheOut
                r0.<init>(r2, r1, r3, r4)
                r2.body = r0
                return
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
                r4 = this;
                okhttp3.Cache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch: java.lang.Throwable -> L1f
                if (r1 == 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                return
            L9:
                r1 = 1
                r4.done = r1     // Catch: java.lang.Throwable -> L1f
                okhttp3.Cache r2 = r4.this$0     // Catch: java.lang.Throwable -> L1f
                int r3 = r2.writeAbortCount     // Catch: java.lang.Throwable -> L1f
                int r3 = r3 + r1
                r2.writeAbortCount = r3     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                okio.Sink r0 = r4.cacheOut
                okhttp3.internal.Util.closeQuietly(r0)
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r4.editor     // Catch: java.io.IOException -> L1e
                r0.abort()     // Catch: java.io.IOException -> L1e
            L1e:
                return
            L1f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                throw r1
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public okio.Sink body() {
                r1 = this;
                okio.Sink r0 = r1.body
                return r0
        }
    }

    private static class CacheResponseBody extends okhttp3.ResponseBody {
        private final okio.BufferedSource bodySource;

        @javax.annotation.Nullable
        private final java.lang.String contentLength;

        @javax.annotation.Nullable
        private final java.lang.String contentType;
        final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot;


        CacheResponseBody(okhttp3.internal.cache.DiskLruCache.Snapshot r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.snapshot = r1
                r0.contentType = r2
                r0.contentLength = r3
                r2 = 1
                okio.Source r2 = r1.getSource(r2)
                okhttp3.Cache$CacheResponseBody$1 r3 = new okhttp3.Cache$CacheResponseBody$1
                r3.<init>(r0, r2, r1)
                okio.BufferedSource r1 = okio.Okio.buffer(r3)
                r0.bodySource = r1
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r3 = this;
                r0 = -1
                java.lang.String r2 = r3.contentLength     // Catch: java.lang.NumberFormatException -> La
                if (r2 == 0) goto La
                long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> La
            La:
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
                r1 = this;
                java.lang.String r0 = r1.contentType
                if (r0 == 0) goto L9
                okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
                r1 = this;
                okio.BufferedSource r0 = r1.bodySource
                return r0
        }
    }

    private static final class Entry {
        private static final java.lang.String RECEIVED_MILLIS = null;
        private static final java.lang.String SENT_MILLIS = null;
        private final int code;

        @javax.annotation.Nullable
        private final okhttp3.Handshake handshake;
        private final java.lang.String message;
        private final okhttp3.Protocol protocol;
        private final long receivedResponseMillis;
        private final java.lang.String requestMethod;
        private final okhttp3.Headers responseHeaders;
        private final long sentRequestMillis;
        private final java.lang.String url;
        private final okhttp3.Headers varyHeaders;

        static {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.get()
                java.lang.String r1 = r1.getPrefix()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-Sent-Millis"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.SENT_MILLIS = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.get()
                java.lang.String r1 = r1.getPrefix()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-Received-Millis"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.RECEIVED_MILLIS = r0
                return
        }

        Entry(okhttp3.Response r3) {
                r2 = this;
                r2.<init>()
                okhttp3.Request r0 = r3.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.toString()
                r2.url = r0
                okhttp3.Headers r0 = okhttp3.internal.http.HttpHeaders.varyHeaders(r3)
                r2.varyHeaders = r0
                okhttp3.Request r0 = r3.request()
                java.lang.String r0 = r0.method()
                r2.requestMethod = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Headers r0 = r3.headers()
                r2.responseHeaders = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseMillis = r0
                return
        }

        Entry(okio.Source r9) throws java.io.IOException {
                r8 = this;
                r8.<init>()
                okio.BufferedSource r0 = okio.Okio.buffer(r9)     // Catch: java.lang.Throwable -> Le3
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                r8.url = r1     // Catch: java.lang.Throwable -> Le3
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                r8.requestMethod = r1     // Catch: java.lang.Throwable -> Le3
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> Le3
                r1.<init>()     // Catch: java.lang.Throwable -> Le3
                int r2 = okhttp3.Cache.readInt(r0)     // Catch: java.lang.Throwable -> Le3
                r3 = 0
                r4 = r3
            L1e:
                if (r4 >= r2) goto L2a
                java.lang.String r5 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                r1.addLenient(r5)     // Catch: java.lang.Throwable -> Le3
                int r4 = r4 + 1
                goto L1e
            L2a:
                okhttp3.Headers r1 = r1.build()     // Catch: java.lang.Throwable -> Le3
                r8.varyHeaders = r1     // Catch: java.lang.Throwable -> Le3
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                okhttp3.internal.http.StatusLine r1 = okhttp3.internal.http.StatusLine.parse(r1)     // Catch: java.lang.Throwable -> Le3
                okhttp3.Protocol r2 = r1.protocol     // Catch: java.lang.Throwable -> Le3
                r8.protocol = r2     // Catch: java.lang.Throwable -> Le3
                int r2 = r1.code     // Catch: java.lang.Throwable -> Le3
                r8.code = r2     // Catch: java.lang.Throwable -> Le3
                java.lang.String r1 = r1.message     // Catch: java.lang.Throwable -> Le3
                r8.message = r1     // Catch: java.lang.Throwable -> Le3
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> Le3
                r1.<init>()     // Catch: java.lang.Throwable -> Le3
                int r2 = okhttp3.Cache.readInt(r0)     // Catch: java.lang.Throwable -> Le3
            L4d:
                if (r3 >= r2) goto L59
                java.lang.String r4 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                r1.addLenient(r4)     // Catch: java.lang.Throwable -> Le3
                int r3 = r3 + 1
                goto L4d
            L59:
                java.lang.String r2 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> Le3
                java.lang.String r3 = r1.get(r2)     // Catch: java.lang.Throwable -> Le3
                java.lang.String r4 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> Le3
                java.lang.String r5 = r1.get(r4)     // Catch: java.lang.Throwable -> Le3
                r1.removeAll(r2)     // Catch: java.lang.Throwable -> Le3
                r1.removeAll(r4)     // Catch: java.lang.Throwable -> Le3
                r6 = 0
                if (r3 == 0) goto L74
                long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> Le3
                goto L75
            L74:
                r2 = r6
            L75:
                r8.sentRequestMillis = r2     // Catch: java.lang.Throwable -> Le3
                if (r5 == 0) goto L7d
                long r6 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> Le3
            L7d:
                r8.receivedResponseMillis = r6     // Catch: java.lang.Throwable -> Le3
                okhttp3.Headers r1 = r1.build()     // Catch: java.lang.Throwable -> Le3
                r8.responseHeaders = r1     // Catch: java.lang.Throwable -> Le3
                boolean r1 = r8.isHttps()     // Catch: java.lang.Throwable -> Le3
                if (r1 == 0) goto Ldc
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                int r2 = r1.length()     // Catch: java.lang.Throwable -> Le3
                if (r2 > 0) goto Lbd
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                okhttp3.CipherSuite r1 = okhttp3.CipherSuite.forJavaName(r1)     // Catch: java.lang.Throwable -> Le3
                java.util.List r2 = r8.readCertificateList(r0)     // Catch: java.lang.Throwable -> Le3
                java.util.List r3 = r8.readCertificateList(r0)     // Catch: java.lang.Throwable -> Le3
                boolean r4 = r0.exhausted()     // Catch: java.lang.Throwable -> Le3
                if (r4 != 0) goto Lb4
                java.lang.String r0 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Le3
                okhttp3.TlsVersion r0 = okhttp3.TlsVersion.forJavaName(r0)     // Catch: java.lang.Throwable -> Le3
                goto Lb6
            Lb4:
                okhttp3.TlsVersion r0 = okhttp3.TlsVersion.SSL_3_0     // Catch: java.lang.Throwable -> Le3
            Lb6:
                okhttp3.Handshake r0 = okhttp3.Handshake.get(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Le3
                r8.handshake = r0     // Catch: java.lang.Throwable -> Le3
                goto Ldf
            Lbd:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Le3
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
                r2.<init>()     // Catch: java.lang.Throwable -> Le3
                java.lang.String r3 = "expected \"\" but was \""
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Le3
                java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> Le3
                java.lang.String r2 = "\""
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le3
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le3
                r0.<init>(r1)     // Catch: java.lang.Throwable -> Le3
                throw r0     // Catch: java.lang.Throwable -> Le3
            Ldc:
                r0 = 0
                r8.handshake = r0     // Catch: java.lang.Throwable -> Le3
            Ldf:
                r9.close()
                return
            Le3:
                r0 = move-exception
                r9.close()
                throw r0
        }

        private boolean isHttps() {
                r2 = this;
                java.lang.String r0 = r2.url
                java.lang.String r1 = "https://"
                boolean r0 = r0.startsWith(r1)
                return r0
        }

        private java.util.List<java.security.cert.Certificate> readCertificateList(okio.BufferedSource r7) throws java.io.IOException {
                r6 = this;
                int r0 = okhttp3.Cache.readInt(r7)
                r1 = -1
                if (r0 != r1) goto Lc
                java.util.List r7 = java.util.Collections.emptyList()
                return r7
            Lc:
                java.lang.String r1 = "X.509"
                java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L39
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.security.cert.CertificateException -> L39
                r2.<init>(r0)     // Catch: java.security.cert.CertificateException -> L39
                r3 = 0
            L18:
                if (r3 >= r0) goto L38
                java.lang.String r4 = r7.readUtf8LineStrict()     // Catch: java.security.cert.CertificateException -> L39
                okio.Buffer r5 = new okio.Buffer     // Catch: java.security.cert.CertificateException -> L39
                r5.<init>()     // Catch: java.security.cert.CertificateException -> L39
                okio.ByteString r4 = okio.ByteString.decodeBase64(r4)     // Catch: java.security.cert.CertificateException -> L39
                r5.write(r4)     // Catch: java.security.cert.CertificateException -> L39
                java.io.InputStream r4 = r5.inputStream()     // Catch: java.security.cert.CertificateException -> L39
                java.security.cert.Certificate r4 = r1.generateCertificate(r4)     // Catch: java.security.cert.CertificateException -> L39
                r2.add(r4)     // Catch: java.security.cert.CertificateException -> L39
                int r3 = r3 + 1
                goto L18
            L38:
                return r2
            L39:
                r7 = move-exception
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r7 = r7.getMessage()
                r0.<init>(r7)
                throw r0
        }

        private void writeCertList(okio.BufferedSink r5, java.util.List<java.security.cert.Certificate> r6) throws java.io.IOException {
                r4 = this;
                int r0 = r6.size()     // Catch: java.security.cert.CertificateEncodingException -> L32
                long r0 = (long) r0     // Catch: java.security.cert.CertificateEncodingException -> L32
                okio.BufferedSink r0 = r5.writeDecimalLong(r0)     // Catch: java.security.cert.CertificateEncodingException -> L32
                r1 = 10
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L32
                int r0 = r6.size()     // Catch: java.security.cert.CertificateEncodingException -> L32
                r2 = 0
            L13:
                if (r2 >= r0) goto L31
                java.lang.Object r3 = r6.get(r2)     // Catch: java.security.cert.CertificateEncodingException -> L32
                java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3     // Catch: java.security.cert.CertificateEncodingException -> L32
                byte[] r3 = r3.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L32
                okio.ByteString r3 = okio.ByteString.m96of(r3)     // Catch: java.security.cert.CertificateEncodingException -> L32
                java.lang.String r3 = r3.base64()     // Catch: java.security.cert.CertificateEncodingException -> L32
                okio.BufferedSink r3 = r5.writeUtf8(r3)     // Catch: java.security.cert.CertificateEncodingException -> L32
                r3.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L32
                int r2 = r2 + 1
                goto L13
            L31:
                return
            L32:
                r5 = move-exception
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r5 = r5.getMessage()
                r6.<init>(r5)
                throw r6
        }

        public boolean matches(okhttp3.Request r3, okhttp3.Response r4) {
                r2 = this;
                java.lang.String r0 = r2.url
                okhttp3.HttpUrl r1 = r3.url()
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L26
                java.lang.String r0 = r2.requestMethod
                java.lang.String r1 = r3.method()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L26
                okhttp3.Headers r0 = r2.varyHeaders
                boolean r3 = okhttp3.internal.http.HttpHeaders.varyMatches(r4, r0, r3)
                if (r3 == 0) goto L26
                r3 = 1
                goto L27
            L26:
                r3 = 0
            L27:
                return r3
        }

        public okhttp3.Response response(okhttp3.internal.cache.DiskLruCache.Snapshot r6) {
                r5 = this;
                okhttp3.Headers r0 = r5.responseHeaders
                java.lang.String r1 = "Content-Type"
                java.lang.String r0 = r0.get(r1)
                okhttp3.Headers r1 = r5.responseHeaders
                java.lang.String r2 = "Content-Length"
                java.lang.String r1 = r1.get(r2)
                okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
                r2.<init>()
                java.lang.String r3 = r5.url
                okhttp3.Request$Builder r2 = r2.url(r3)
                java.lang.String r3 = r5.requestMethod
                r4 = 0
                okhttp3.Request$Builder r2 = r2.method(r3, r4)
                okhttp3.Headers r3 = r5.varyHeaders
                okhttp3.Request$Builder r2 = r2.headers(r3)
                okhttp3.Request r2 = r2.build()
                okhttp3.Response$Builder r3 = new okhttp3.Response$Builder
                r3.<init>()
                okhttp3.Response$Builder r2 = r3.request(r2)
                okhttp3.Protocol r3 = r5.protocol
                okhttp3.Response$Builder r2 = r2.protocol(r3)
                int r3 = r5.code
                okhttp3.Response$Builder r2 = r2.code(r3)
                java.lang.String r3 = r5.message
                okhttp3.Response$Builder r2 = r2.message(r3)
                okhttp3.Headers r3 = r5.responseHeaders
                okhttp3.Response$Builder r2 = r2.headers(r3)
                okhttp3.Cache$CacheResponseBody r3 = new okhttp3.Cache$CacheResponseBody
                r3.<init>(r6, r0, r1)
                okhttp3.Response$Builder r6 = r2.body(r3)
                okhttp3.Handshake r0 = r5.handshake
                okhttp3.Response$Builder r6 = r6.handshake(r0)
                long r0 = r5.sentRequestMillis
                okhttp3.Response$Builder r6 = r6.sentRequestAtMillis(r0)
                long r0 = r5.receivedResponseMillis
                okhttp3.Response$Builder r6 = r6.receivedResponseAtMillis(r0)
                okhttp3.Response r6 = r6.build()
                return r6
        }

        public void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r8) throws java.io.IOException {
                r7 = this;
                r0 = 0
                okio.Sink r8 = r8.newSink(r0)
                okio.BufferedSink r8 = okio.Okio.buffer(r8)
                java.lang.String r1 = r7.url
                okio.BufferedSink r1 = r8.writeUtf8(r1)
                r2 = 10
                r1.writeByte(r2)
                java.lang.String r1 = r7.requestMethod
                okio.BufferedSink r1 = r8.writeUtf8(r1)
                r1.writeByte(r2)
                okhttp3.Headers r1 = r7.varyHeaders
                int r1 = r1.size()
                long r3 = (long) r1
                okio.BufferedSink r1 = r8.writeDecimalLong(r3)
                r1.writeByte(r2)
                okhttp3.Headers r1 = r7.varyHeaders
                int r1 = r1.size()
                r3 = r0
            L32:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L54
                okhttp3.Headers r5 = r7.varyHeaders
                java.lang.String r5 = r5.name(r3)
                okio.BufferedSink r5 = r8.writeUtf8(r5)
                okio.BufferedSink r4 = r5.writeUtf8(r4)
                okhttp3.Headers r5 = r7.varyHeaders
                java.lang.String r5 = r5.value(r3)
                okio.BufferedSink r4 = r4.writeUtf8(r5)
                r4.writeByte(r2)
                int r3 = r3 + 1
                goto L32
            L54:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
                okhttp3.Protocol r3 = r7.protocol
                int r5 = r7.code
                java.lang.String r6 = r7.message
                r1.<init>(r3, r5, r6)
                java.lang.String r1 = r1.toString()
                okio.BufferedSink r1 = r8.writeUtf8(r1)
                r1.writeByte(r2)
                okhttp3.Headers r1 = r7.responseHeaders
                int r1 = r1.size()
                int r1 = r1 + 2
                long r5 = (long) r1
                okio.BufferedSink r1 = r8.writeDecimalLong(r5)
                r1.writeByte(r2)
                okhttp3.Headers r1 = r7.responseHeaders
                int r1 = r1.size()
            L80:
                if (r0 >= r1) goto La0
                okhttp3.Headers r3 = r7.responseHeaders
                java.lang.String r3 = r3.name(r0)
                okio.BufferedSink r3 = r8.writeUtf8(r3)
                okio.BufferedSink r3 = r3.writeUtf8(r4)
                okhttp3.Headers r5 = r7.responseHeaders
                java.lang.String r5 = r5.value(r0)
                okio.BufferedSink r3 = r3.writeUtf8(r5)
                r3.writeByte(r2)
                int r0 = r0 + 1
                goto L80
            La0:
                java.lang.String r0 = okhttp3.Cache.Entry.SENT_MILLIS
                okio.BufferedSink r0 = r8.writeUtf8(r0)
                okio.BufferedSink r0 = r0.writeUtf8(r4)
                long r5 = r7.sentRequestMillis
                okio.BufferedSink r0 = r0.writeDecimalLong(r5)
                r0.writeByte(r2)
                java.lang.String r0 = okhttp3.Cache.Entry.RECEIVED_MILLIS
                okio.BufferedSink r0 = r8.writeUtf8(r0)
                okio.BufferedSink r0 = r0.writeUtf8(r4)
                long r3 = r7.receivedResponseMillis
                okio.BufferedSink r0 = r0.writeDecimalLong(r3)
                r0.writeByte(r2)
                boolean r0 = r7.isHttps()
                if (r0 == 0) goto L103
                r8.writeByte(r2)
                okhttp3.Handshake r0 = r7.handshake
                okhttp3.CipherSuite r0 = r0.cipherSuite()
                java.lang.String r0 = r0.javaName()
                okio.BufferedSink r0 = r8.writeUtf8(r0)
                r0.writeByte(r2)
                okhttp3.Handshake r0 = r7.handshake
                java.util.List r0 = r0.peerCertificates()
                r7.writeCertList(r8, r0)
                okhttp3.Handshake r0 = r7.handshake
                java.util.List r0 = r0.localCertificates()
                r7.writeCertList(r8, r0)
                okhttp3.Handshake r0 = r7.handshake
                okhttp3.TlsVersion r0 = r0.tlsVersion()
                java.lang.String r0 = r0.javaName()
                okio.BufferedSink r0 = r8.writeUtf8(r0)
                r0.writeByte(r2)
            L103:
                r8.close()
                return
        }
    }

    public Cache(java.io.File r2, long r3) {
            r1 = this;
            okhttp3.internal.io.FileSystem r0 = okhttp3.internal.p002io.FileSystem.SYSTEM
            r1.<init>(r2, r3, r0)
            return
    }

    Cache(java.io.File r8, long r9, okhttp3.internal.p002io.FileSystem r11) {
            r7 = this;
            r7.<init>()
            okhttp3.Cache$1 r0 = new okhttp3.Cache$1
            r0.<init>(r7)
            r7.internalCache = r0
            r3 = 201105(0x31191, float:2.81808E-40)
            r4 = 2
            r1 = r11
            r2 = r8
            r5 = r9
            okhttp3.internal.cache.DiskLruCache r8 = okhttp3.internal.cache.DiskLruCache.create(r1, r2, r3, r4, r5)
            r7.cache = r8
            return
    }

    private void abortQuietly(@javax.annotation.Nullable okhttp3.internal.cache.DiskLruCache.Editor r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.abort()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static java.lang.String key(okhttp3.HttpUrl r0) {
            java.lang.String r0 = r0.toString()
            okio.ByteString r0 = okio.ByteString.encodeUtf8(r0)
            okio.ByteString r0 = r0.md5()
            java.lang.String r0 = r0.hex()
            return r0
    }

    static int readInt(okio.BufferedSource r5) throws java.io.IOException {
            java.lang.String r0 = "expected an int but was \""
            long r1 = r5.readDecimalLong()     // Catch: java.lang.NumberFormatException -> L3c
            java.lang.String r5 = r5.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L3c
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L1f
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L1f
            boolean r3 = r5.isEmpty()     // Catch: java.lang.NumberFormatException -> L3c
            if (r3 == 0) goto L1f
            int r5 = (int) r1     // Catch: java.lang.NumberFormatException -> L3c
            return r5
        L1f:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L3c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L3c
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L3c
            java.lang.StringBuilder r0 = r4.append(r1)     // Catch: java.lang.NumberFormatException -> L3c
            java.lang.StringBuilder r5 = r0.append(r5)     // Catch: java.lang.NumberFormatException -> L3c
            java.lang.String r0 = "\""
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.NumberFormatException -> L3c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.NumberFormatException -> L3c
            r3.<init>(r5)     // Catch: java.lang.NumberFormatException -> L3c
            throw r3     // Catch: java.lang.NumberFormatException -> L3c
        L3c:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r5)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.close()
            return
    }

    public void delete() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.delete()
            return
    }

    public java.io.File directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            java.io.File r0 = r0.getDirectory()
            return r0
    }

    public void evictAll() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.evictAll()
            return
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.flush()
            return
    }

    @javax.annotation.Nullable
    okhttp3.Response get(okhttp3.Request r5) {
            r4 = this;
            okhttp3.HttpUrl r0 = r5.url()
            java.lang.String r0 = key(r0)
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r4.cache     // Catch: java.io.IOException -> L32
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.get(r0)     // Catch: java.io.IOException -> L32
            if (r0 != 0) goto L12
            return r1
        L12:
            okhttp3.Cache$Entry r2 = new okhttp3.Cache$Entry     // Catch: java.io.IOException -> L2f
            r3 = 0
            okio.Source r3 = r0.getSource(r3)     // Catch: java.io.IOException -> L2f
            r2.<init>(r3)     // Catch: java.io.IOException -> L2f
            okhttp3.Response r0 = r2.response(r0)
            boolean r5 = r2.matches(r5, r0)
            if (r5 != 0) goto L2e
            okhttp3.ResponseBody r5 = r0.body()
            okhttp3.internal.Util.closeQuietly(r5)
            return r1
        L2e:
            return r0
        L2f:
            okhttp3.internal.Util.closeQuietly(r0)
        L32:
            return r1
    }

    public synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public void initialize() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.initialize()
            return
    }

    public boolean isClosed() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            boolean r0 = r0.isClosed()
            return r0
    }

    public long maxSize() {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.getMaxSize()
            return r0
    }

    public synchronized int networkCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.networkCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @javax.annotation.Nullable
    okhttp3.internal.cache.CacheRequest put(okhttp3.Response r4) {
            r3 = this;
            okhttp3.Request r0 = r4.request()
            java.lang.String r0 = r0.method()
            okhttp3.Request r1 = r4.request()
            java.lang.String r1 = r1.method()
            boolean r1 = okhttp3.internal.http.HttpMethod.invalidatesCache(r1)
            r2 = 0
            if (r1 == 0) goto L1f
            okhttp3.Request r4 = r4.request()     // Catch: java.io.IOException -> L1e
            r3.remove(r4)     // Catch: java.io.IOException -> L1e
        L1e:
            return r2
        L1f:
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            return r2
        L28:
            boolean r0 = okhttp3.internal.http.HttpHeaders.hasVaryAll(r4)
            if (r0 == 0) goto L2f
            return r2
        L2f:
            okhttp3.Cache$Entry r0 = new okhttp3.Cache$Entry
            r0.<init>(r4)
            okhttp3.internal.cache.DiskLruCache r1 = r3.cache     // Catch: java.io.IOException -> L52
            okhttp3.Request r4 = r4.request()     // Catch: java.io.IOException -> L52
            okhttp3.HttpUrl r4 = r4.url()     // Catch: java.io.IOException -> L52
            java.lang.String r4 = key(r4)     // Catch: java.io.IOException -> L52
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r1.edit(r4)     // Catch: java.io.IOException -> L52
            if (r4 != 0) goto L49
            return r2
        L49:
            r0.writeTo(r4)     // Catch: java.io.IOException -> L53
            okhttp3.Cache$CacheRequestImpl r0 = new okhttp3.Cache$CacheRequestImpl     // Catch: java.io.IOException -> L53
            r0.<init>(r3, r4)     // Catch: java.io.IOException -> L53
            return r0
        L52:
            r4 = r2
        L53:
            r3.abortQuietly(r4)
            return r2
    }

    void remove(okhttp3.Request r2) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = key(r2)
            r0.remove(r2)
            return
    }

    public synchronized int requestCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public long size() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.size()
            return r0
    }

    synchronized void trackConditionalCacheHit() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    synchronized void trackResponse(okhttp3.internal.cache.CacheStrategy r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 1
            r1.requestCount = r0     // Catch: java.lang.Throwable -> L1e
            okhttp3.Request r0 = r2.networkRequest     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L12
            int r2 = r1.networkCount     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + 1
            r1.networkCount = r2     // Catch: java.lang.Throwable -> L1e
            goto L1c
        L12:
            okhttp3.Response r2 = r2.cacheResponse     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1c
            int r2 = r1.hitCount     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + 1
            r1.hitCount = r2     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    void update(okhttp3.Response r2, okhttp3.Response r3) {
            r1 = this;
            okhttp3.Cache$Entry r0 = new okhttp3.Cache$Entry
            r0.<init>(r3)
            okhttp3.ResponseBody r2 = r2.body()
            okhttp3.Cache$CacheResponseBody r2 = (okhttp3.Cache.CacheResponseBody) r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.snapshot
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r2.edit()     // Catch: java.io.IOException -> L1a
            if (r2 == 0) goto L1e
            r0.writeTo(r2)     // Catch: java.io.IOException -> L1b
            r2.commit()     // Catch: java.io.IOException -> L1b
            goto L1e
        L1a:
            r2 = 0
        L1b:
            r1.abortQuietly(r2)
        L1e:
            return
    }

    public java.util.Iterator<java.lang.String> urls() throws java.io.IOException {
            r1 = this;
            okhttp3.Cache$2 r0 = new okhttp3.Cache$2
            r0.<init>(r1)
            return r0
    }

    public synchronized int writeAbortCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeAbortCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized int writeSuccessCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeSuccessCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
