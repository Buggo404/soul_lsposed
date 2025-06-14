package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class RequestLine {
    private RequestLine() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String get(okhttp3.Request r2, java.net.Proxy.Type r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.method()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            boolean r3 = includeAuthorityInRequestLine(r2, r3)
            if (r3 == 0) goto L1f
            okhttp3.HttpUrl r2 = r2.url()
            r0.append(r2)
            goto L2a
        L1f:
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = requestPath(r2)
            r0.append(r2)
        L2a:
            java.lang.String r2 = " HTTP/1.1"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static boolean includeAuthorityInRequestLine(okhttp3.Request r0, java.net.Proxy.Type r1) {
            boolean r0 = r0.isHttps()
            if (r0 != 0) goto Lc
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r1 != r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static java.lang.String requestPath(okhttp3.HttpUrl r2) {
            java.lang.String r0 = r2.encodedPath()
            java.lang.String r2 = r2.encodedQuery()
            if (r2 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            r1 = 63
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = r2.toString()
        L21:
            return r0
    }
}
