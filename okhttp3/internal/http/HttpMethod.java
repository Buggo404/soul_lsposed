package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class HttpMethod {
    private HttpMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean invalidatesCache(java.lang.String r1) {
            java.lang.String r0 = "POST"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "PATCH"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "PUT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "DELETE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "MOVE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }

    public static boolean permitsRequestBody(java.lang.String r1) {
            java.lang.String r0 = "GET"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            java.lang.String r0 = "HEAD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static boolean redirectsToGet(java.lang.String r1) {
            java.lang.String r0 = "PROPFIND"
            boolean r1 = r1.equals(r0)
            r1 = r1 ^ 1
            return r1
    }

    public static boolean redirectsWithBody(java.lang.String r1) {
            java.lang.String r0 = "PROPFIND"
            boolean r1 = r1.equals(r0)
            return r1
    }

    public static boolean requiresRequestBody(java.lang.String r1) {
            java.lang.String r0 = "POST"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "PUT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "PATCH"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "REPORT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }
}
