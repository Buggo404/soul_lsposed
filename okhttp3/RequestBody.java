package okhttp3;

/* loaded from: classes.dex */
public abstract class RequestBody {




    public RequestBody() {
            r0 = this;
            r0.<init>()
            return
    }

    public static okhttp3.RequestBody create(@javax.annotation.Nullable okhttp3.MediaType r1, java.io.File r2) {
            if (r2 == 0) goto L8
            okhttp3.RequestBody$3 r0 = new okhttp3.RequestBody$3
            r0.<init>(r1, r2)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "file == null"
            r1.<init>(r2)
            throw r1
    }

    public static okhttp3.RequestBody create(@javax.annotation.Nullable okhttp3.MediaType r2, java.lang.String r3) {
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
            byte[] r3 = r3.getBytes(r0)
            okhttp3.RequestBody r2 = create(r2, r3)
            return r2
    }

    public static okhttp3.RequestBody create(@javax.annotation.Nullable okhttp3.MediaType r1, okio.ByteString r2) {
            okhttp3.RequestBody$1 r0 = new okhttp3.RequestBody$1
            r0.<init>(r1, r2)
            return r0
    }

    public static okhttp3.RequestBody create(@javax.annotation.Nullable okhttp3.MediaType r2, byte[] r3) {
            r0 = 0
            int r1 = r3.length
            okhttp3.RequestBody r2 = create(r2, r3, r0, r1)
            return r2
    }

    public static okhttp3.RequestBody create(@javax.annotation.Nullable okhttp3.MediaType r7, byte[] r8, int r9, int r10) {
            if (r8 == 0) goto Lf
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okhttp3.internal.Util.checkOffsetAndCount(r1, r3, r5)
            okhttp3.RequestBody$2 r0 = new okhttp3.RequestBody$2
            r0.<init>(r7, r10, r8, r9)
            return r0
        Lf:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "content == null"
            r7.<init>(r8)
            throw r7
    }

    public long contentLength() throws java.io.IOException {
            r2 = this;
            r0 = -1
            return r0
    }

    @javax.annotation.Nullable
    public abstract okhttp3.MediaType contentType();

    public boolean isDuplex() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isOneShot() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void writeTo(okio.BufferedSink r1) throws java.io.IOException;
}
