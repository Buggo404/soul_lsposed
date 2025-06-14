package okhttp3;

/* loaded from: classes.dex */
public final class Credentials {
    private Credentials() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String basic(java.lang.String r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r1 = basic(r1, r2, r0)
            return r1
    }

    public static java.lang.String basic(java.lang.String r1, java.lang.String r2, java.nio.charset.Charset r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = ":"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            okio.ByteString r1 = okio.ByteString.encodeString(r1, r3)
            java.lang.String r1 = r1.base64()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Basic "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
