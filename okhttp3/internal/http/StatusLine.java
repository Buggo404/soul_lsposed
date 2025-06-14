package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class StatusLine {
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final java.lang.String message;
    public final okhttp3.Protocol protocol;

    public StatusLine(okhttp3.Protocol r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.protocol = r1
            r0.code = r2
            r0.message = r3
            return
    }

    public static okhttp3.internal.http.StatusLine get(okhttp3.Response r3) {
            okhttp3.internal.http.StatusLine r0 = new okhttp3.internal.http.StatusLine
            okhttp3.Protocol r1 = r3.protocol()
            int r2 = r3.code()
            java.lang.String r3 = r3.message()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static okhttp3.internal.http.StatusLine parse(java.lang.String r8) throws java.io.IOException {
            java.lang.String r0 = "HTTP/1."
            boolean r0 = r8.startsWith(r0)
            r1 = 32
            r2 = 4
            java.lang.String r3 = "Unexpected status line: "
            if (r0 == 0) goto L55
            int r0 = r8.length()
            r4 = 9
            if (r0 < r4) goto L42
            r0 = 8
            char r0 = r8.charAt(r0)
            if (r0 != r1) goto L42
            r0 = 7
            char r0 = r8.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 != 0) goto L29
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
            goto L60
        L29:
            r5 = 1
            if (r0 != r5) goto L2f
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            goto L60
        L2f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L42:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L55:
            java.lang.String r0 = "ICY "
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lc3
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
            r4 = r2
        L60:
            int r5 = r8.length()
            int r6 = r4 + 3
            if (r5 < r6) goto Lb0
            java.lang.String r5 = r8.substring(r4, r6)     // Catch: java.lang.NumberFormatException -> L9d
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L9d
            int r7 = r8.length()
            if (r7 <= r6) goto L95
            char r6 = r8.charAt(r6)
            if (r6 != r1) goto L82
            int r4 = r4 + r2
            java.lang.String r8 = r8.substring(r4)
            goto L97
        L82:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L95:
            java.lang.String r8 = ""
        L97:
            okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
            r1.<init>(r0, r5, r8)
            return r1
        L9d:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Lb0:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Lc3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Protocol r1 = r4.protocol
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_0
            if (r1 != r2) goto Le
            java.lang.String r1 = "HTTP/1.0"
            goto L10
        Le:
            java.lang.String r1 = "HTTP/1.1"
        L10:
            r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r2 = r0.append(r1)
            int r3 = r4.code
            r2.append(r3)
            java.lang.String r2 = r4.message
            if (r2 == 0) goto L2b
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r4.message
            r1.append(r2)
        L2b:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
