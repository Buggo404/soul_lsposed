package androidx.core.net;

/* loaded from: classes.dex */
public final class UriCompat {
    private UriCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String toSafeString(android.net.Uri r7) {
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = r7.getSchemeSpecificPart()
            r2 = 58
            r3 = 64
            if (r0 == 0) goto Ld5
            java.lang.String r4 = "tel"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La1
            java.lang.String r4 = "sip"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La1
            java.lang.String r4 = "sms"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La1
            java.lang.String r4 = "smsto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La1
            java.lang.String r4 = "mailto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La1
            java.lang.String r4 = "nfc"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3f
            goto La1
        L3f:
            java.lang.String r4 = "http"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "https"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "ftp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "rtsp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto Ld5
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "//"
            r1.<init>(r4)
            java.lang.String r4 = r7.getHost()
            java.lang.String r5 = ""
            if (r4 == 0) goto L73
            java.lang.String r4 = r7.getHost()
            goto L74
        L73:
            r4 = r5
        L74:
            java.lang.StringBuilder r1 = r1.append(r4)
            int r4 = r7.getPort()
            r6 = -1
            if (r4 == r6) goto L92
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ":"
            r4.<init>(r5)
            int r7 = r7.getPort()
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r5 = r7.toString()
        L92:
            java.lang.StringBuilder r7 = r1.append(r5)
            java.lang.String r1 = "/..."
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r1 = r7.toString()
            goto Ld5
        La1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r0)
            r7.append(r2)
            if (r1 == 0) goto Ld0
            r0 = 0
        Laf:
            int r2 = r1.length()
            if (r0 >= r2) goto Ld0
            char r2 = r1.charAt(r0)
            r4 = 45
            if (r2 == r4) goto Lca
            if (r2 == r3) goto Lca
            r4 = 46
            if (r2 != r4) goto Lc4
            goto Lca
        Lc4:
            r2 = 120(0x78, float:1.68E-43)
            r7.append(r2)
            goto Lcd
        Lca:
            r7.append(r2)
        Lcd:
            int r0 = r0 + 1
            goto Laf
        Ld0:
            java.lang.String r7 = r7.toString()
            return r7
        Ld5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            if (r0 == 0) goto Le2
            r7.append(r0)
            r7.append(r2)
        Le2:
            if (r1 == 0) goto Le7
            r7.append(r1)
        Le7:
            java.lang.String r7 = r7.toString()
            return r7
    }
}
