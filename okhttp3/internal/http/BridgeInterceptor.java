package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class BridgeInterceptor implements okhttp3.Interceptor {
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(okhttp3.CookieJar r1) {
            r0 = this;
            r0.<init>()
            r0.cookieJar = r1
            return
    }

    private java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L31
            if (r2 <= 0) goto L13
            java.lang.String r3 = "; "
            r0.append(r3)
        L13:
            java.lang.Object r3 = r7.get(r2)
            okhttp3.Cookie r3 = (okhttp3.Cookie) r3
            java.lang.String r4 = r3.name()
            java.lang.StringBuilder r4 = r0.append(r4)
            r5 = 61
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r3 = r3.value()
            r4.append(r3)
            int r2 = r2 + 1
            goto La
        L31:
            java.lang.String r7 = r0.toString()
            return r7
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) throws java.io.IOException {
            r10 = this;
            okhttp3.Request r0 = r11.request()
            okhttp3.Request$Builder r1 = r0.newBuilder()
            okhttp3.RequestBody r2 = r0.body()
            java.lang.String r3 = "Content-Type"
            r4 = -1
            java.lang.String r6 = "Content-Length"
            if (r2 == 0) goto L3e
            okhttp3.MediaType r7 = r2.contentType()
            if (r7 == 0) goto L21
            java.lang.String r7 = r7.toString()
            r1.header(r3, r7)
        L21:
            long r7 = r2.contentLength()
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            java.lang.String r9 = "Transfer-Encoding"
            if (r2 == 0) goto L36
            java.lang.String r2 = java.lang.Long.toString(r7)
            r1.header(r6, r2)
            r1.removeHeader(r9)
            goto L3e
        L36:
            java.lang.String r2 = "chunked"
            r1.header(r9, r2)
            r1.removeHeader(r6)
        L3e:
            java.lang.String r2 = "Host"
            java.lang.String r7 = r0.header(r2)
            r8 = 0
            if (r7 != 0) goto L52
            okhttp3.HttpUrl r7 = r0.url()
            java.lang.String r7 = okhttp3.internal.Util.hostHeader(r7, r8)
            r1.header(r2, r7)
        L52:
            java.lang.String r2 = "Connection"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto L5f
            java.lang.String r7 = "Keep-Alive"
            r1.header(r2, r7)
        L5f:
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r7 = r0.header(r2)
            java.lang.String r9 = "gzip"
            if (r7 != 0) goto L75
            java.lang.String r7 = "Range"
            java.lang.String r7 = r0.header(r7)
            if (r7 != 0) goto L75
            r1.header(r2, r9)
            r8 = 1
        L75:
            okhttp3.CookieJar r2 = r10.cookieJar
            okhttp3.HttpUrl r7 = r0.url()
            java.util.List r2 = r2.loadForRequest(r7)
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L8e
            java.lang.String r7 = "Cookie"
            java.lang.String r2 = r10.cookieHeader(r2)
            r1.header(r7, r2)
        L8e:
            java.lang.String r2 = "User-Agent"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto L9d
            java.lang.String r7 = okhttp3.internal.Version.userAgent()
            r1.header(r2, r7)
        L9d:
            okhttp3.Request r1 = r1.build()
            okhttp3.Response r11 = r11.proceed(r1)
            okhttp3.CookieJar r1 = r10.cookieJar
            okhttp3.HttpUrl r2 = r0.url()
            okhttp3.Headers r7 = r11.headers()
            okhttp3.internal.http.HttpHeaders.receiveHeaders(r1, r2, r7)
            okhttp3.Response$Builder r1 = r11.newBuilder()
            okhttp3.Response$Builder r0 = r1.request(r0)
            if (r8 == 0) goto L102
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r2 = r11.header(r1)
            boolean r2 = r9.equalsIgnoreCase(r2)
            if (r2 == 0) goto L102
            boolean r2 = okhttp3.internal.http.HttpHeaders.hasBody(r11)
            if (r2 == 0) goto L102
            okio.GzipSource r2 = new okio.GzipSource
            okhttp3.ResponseBody r7 = r11.body()
            okio.BufferedSource r7 = r7.source()
            r2.<init>(r7)
            okhttp3.Headers r7 = r11.headers()
            okhttp3.Headers$Builder r7 = r7.newBuilder()
            okhttp3.Headers$Builder r1 = r7.removeAll(r1)
            okhttp3.Headers$Builder r1 = r1.removeAll(r6)
            okhttp3.Headers r1 = r1.build()
            r0.headers(r1)
            java.lang.String r11 = r11.header(r3)
            okhttp3.internal.http.RealResponseBody r1 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r1.<init>(r11, r4, r2)
            r0.body(r1)
        L102:
            okhttp3.Response r11 = r0.build()
            return r11
    }
}
