package okhttp3;

/* loaded from: classes.dex */
public abstract class ResponseBody implements java.io.Closeable {

    @javax.annotation.Nullable
    private java.io.Reader reader;


    static final class BomAwareReader extends java.io.Reader {
        private final java.nio.charset.Charset charset;
        private boolean closed;

        @javax.annotation.Nullable
        private java.io.Reader delegate;
        private final okio.BufferedSource source;

        BomAwareReader(okio.BufferedSource r1, java.nio.charset.Charset r2) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                r0.charset = r2
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.closed = r0
                java.io.Reader r0 = r1.delegate
                if (r0 == 0) goto Lb
                r0.close()
                goto L10
            Lb:
                okio.BufferedSource r0 = r1.source
                r0.close()
            L10:
                return
        }

        @Override // java.io.Reader
        public int read(char[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 != 0) goto L23
                java.io.Reader r0 = r3.delegate
                if (r0 != 0) goto L1e
                okio.BufferedSource r0 = r3.source
                java.nio.charset.Charset r1 = r3.charset
                java.nio.charset.Charset r0 = okhttp3.internal.Util.bomAwareCharset(r0, r1)
                java.io.InputStreamReader r1 = new java.io.InputStreamReader
                okio.BufferedSource r2 = r3.source
                java.io.InputStream r2 = r2.inputStream()
                r1.<init>(r2, r0)
                r3.delegate = r1
                r0 = r1
            L1e:
                int r4 = r0.read(r4, r5, r6)
                return r4
            L23:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r5 = "Stream closed"
                r4.<init>(r5)
                throw r4
        }
    }

    private static /* synthetic */ void $closeResource(java.lang.Throwable r0, java.lang.AutoCloseable r1) {
            if (r0 == 0) goto Lb
            r1.close()     // Catch: java.lang.Throwable -> L6
            goto Le
        L6:
            r1 = move-exception
            r0.addSuppressed(r1)
            goto Le
        Lb:
            r1.close()
        Le:
            return
    }

    public ResponseBody() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.nio.charset.Charset charset() {
            r2 = this;
            okhttp3.MediaType r0 = r2.contentType()
            if (r0 == 0) goto Ld
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r0 = r0.charset(r1)
            goto Lf
        Ld:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
        Lf:
            return r0
    }

    public static okhttp3.ResponseBody create(@javax.annotation.Nullable okhttp3.MediaType r1, long r2, okio.BufferedSource r4) {
            if (r4 == 0) goto L8
            okhttp3.ResponseBody$1 r0 = new okhttp3.ResponseBody$1
            r0.<init>(r1, r2, r4)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "source == null"
            r1.<init>(r2)
            throw r1
    }

    public static okhttp3.ResponseBody create(@javax.annotation.Nullable okhttp3.MediaType r2, java.lang.String r3) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r2 == 0) goto L23
            java.nio.charset.Charset r0 = r2.charset()
            if (r0 != 0) goto L23
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = "; charset=utf-8"
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            okhttp3.MediaType r2 = okhttp3.MediaType.parse(r2)
        L23:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r3 = r1.writeString(r3, r0)
            long r0 = r3.size()
            okhttp3.ResponseBody r2 = create(r2, r0, r3)
            return r2
    }

    public static okhttp3.ResponseBody create(@javax.annotation.Nullable okhttp3.MediaType r3, okio.ByteString r4) {
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.write(r4)
            int r4 = r4.size()
            long r1 = (long) r4
            okhttp3.ResponseBody r3 = create(r3, r1, r0)
            return r3
    }

    public static okhttp3.ResponseBody create(@javax.annotation.Nullable okhttp3.MediaType r3, byte[] r4) {
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.write(r4)
            int r4 = r4.length
            long r1 = (long) r4
            okhttp3.ResponseBody r3 = create(r3, r1, r0)
            return r3
    }

    public final java.io.InputStream byteStream() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            java.io.InputStream r0 = r0.inputStream()
            return r0
    }

    public final byte[] bytes() throws java.io.IOException {
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L56
            okio.BufferedSource r2 = r6.source()
            byte[] r3 = r2.readByteArray()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L19
            r4 = 0
            $closeResource(r4, r2)
        L19:
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L4c
            int r2 = r3.length
            long r4 = (long) r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L26
            goto L4c
        L26:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Content-Length ("
            r4.<init>(r5)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r1 = ") and stream length ("
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") disagree"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L4c:
            return r3
        L4d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r1 = move-exception
            if (r2 == 0) goto L55
            $closeResource(r0, r2)
        L55:
            throw r1
        L56:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public final java.io.Reader charStream() {
            r3 = this;
            java.io.Reader r0 = r3.reader
            if (r0 == 0) goto L5
            goto L14
        L5:
            okhttp3.ResponseBody$BomAwareReader r0 = new okhttp3.ResponseBody$BomAwareReader
            okio.BufferedSource r1 = r3.source()
            java.nio.charset.Charset r2 = r3.charset()
            r0.<init>(r1, r2)
            r3.reader = r0
        L14:
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            okhttp3.internal.Util.closeQuietly(r0)
            return
    }

    public abstract long contentLength();

    @javax.annotation.Nullable
    public abstract okhttp3.MediaType contentType();

    public abstract okio.BufferedSource source();

    public final java.lang.String string() throws java.io.IOException {
            r3 = this;
            okio.BufferedSource r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch: java.lang.Throwable -> L17
            java.nio.charset.Charset r1 = okhttp3.internal.Util.bomAwareCharset(r0, r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r0.readString(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L16
            r2 = 0
            $closeResource(r2, r0)
        L16:
            return r1
        L17:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L19
        L19:
            r2 = move-exception
            if (r0 == 0) goto L1f
            $closeResource(r1, r0)
        L1f:
            throw r2
    }
}
