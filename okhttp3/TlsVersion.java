package okhttp3;

/* loaded from: classes.dex */
public enum TlsVersion extends java.lang.Enum<okhttp3.TlsVersion> {
    private static final /* synthetic */ okhttp3.TlsVersion[] $VALUES = null;
    public static final okhttp3.TlsVersion SSL_3_0 = null;
    public static final okhttp3.TlsVersion TLS_1_0 = null;
    public static final okhttp3.TlsVersion TLS_1_1 = null;
    public static final okhttp3.TlsVersion TLS_1_2 = null;
    public static final okhttp3.TlsVersion TLS_1_3 = null;
    final java.lang.String javaName;

    static {
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            java.lang.String r1 = "TLSv1.3"
            java.lang.String r2 = "TLS_1_3"
            r3 = 0
            r0.<init>(r2, r3, r1)
            okhttp3.TlsVersion.TLS_1_3 = r0
            okhttp3.TlsVersion r1 = new okhttp3.TlsVersion
            java.lang.String r2 = "TLSv1.2"
            java.lang.String r4 = "TLS_1_2"
            r5 = 1
            r1.<init>(r4, r5, r2)
            okhttp3.TlsVersion.TLS_1_2 = r1
            okhttp3.TlsVersion r2 = new okhttp3.TlsVersion
            java.lang.String r4 = "TLSv1.1"
            java.lang.String r6 = "TLS_1_1"
            r7 = 2
            r2.<init>(r6, r7, r4)
            okhttp3.TlsVersion.TLS_1_1 = r2
            okhttp3.TlsVersion r4 = new okhttp3.TlsVersion
            java.lang.String r6 = "TLSv1"
            java.lang.String r8 = "TLS_1_0"
            r9 = 3
            r4.<init>(r8, r9, r6)
            okhttp3.TlsVersion.TLS_1_0 = r4
            okhttp3.TlsVersion r6 = new okhttp3.TlsVersion
            java.lang.String r8 = "SSLv3"
            java.lang.String r10 = "SSL_3_0"
            r11 = 4
            r6.<init>(r10, r11, r8)
            okhttp3.TlsVersion.SSL_3_0 = r6
            r8 = 5
            okhttp3.TlsVersion[] r8 = new okhttp3.TlsVersion[r8]
            r8[r3] = r0
            r8[r5] = r1
            r8[r7] = r2
            r8[r9] = r4
            r8[r11] = r6
            okhttp3.TlsVersion.$VALUES = r8
            return
    }

    TlsVersion(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.javaName = r3
            return
    }

    public static okhttp3.TlsVersion forJavaName(java.lang.String r3) {
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -503070503: goto L38;
                case -503070502: goto L2d;
                case -503070501: goto L22;
                case 79201641: goto L17;
                case 79923350: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L42
        Lc:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L15
            goto L42
        L15:
            r1 = 4
            goto L42
        L17:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L20
            goto L42
        L20:
            r1 = 3
            goto L42
        L22:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2b
            goto L42
        L2b:
            r1 = 2
            goto L42
        L2d:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L36
            goto L42
        L36:
            r1 = 1
            goto L42
        L38:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto L42
        L41:
            r1 = 0
        L42:
            switch(r1) {
                case 0: goto L66;
                case 1: goto L63;
                case 2: goto L60;
                case 3: goto L5d;
                case 4: goto L5a;
                default: goto L45;
            }
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected TLS version: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L5a:
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_0
            return r3
        L5d:
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.SSL_3_0
            return r3
        L60:
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_3
            return r3
        L63:
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_2
            return r3
        L66:
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_1
            return r3
    }

    static java.util.List<okhttp3.TlsVersion> forJavaNames(java.lang.String... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            okhttp3.TlsVersion r3 = forJavaName(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            return r4
    }

    public static okhttp3.TlsVersion valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.TlsVersion> r0 = okhttp3.TlsVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.TlsVersion r1 = (okhttp3.TlsVersion) r1
            return r1
    }

    public static okhttp3.TlsVersion[] values() {
            okhttp3.TlsVersion[] r0 = okhttp3.TlsVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.TlsVersion[] r0 = (okhttp3.TlsVersion[]) r0
            return r0
    }

    public java.lang.String javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }
}
