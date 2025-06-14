package okhttp3;

/* loaded from: classes.dex */
public interface Dns {
    public static final okhttp3.Dns SYSTEM = null;

    static {
            okhttp3.Dns$$ExternalSyntheticLambda0 r0 = new okhttp3.Dns$$ExternalSyntheticLambda0
            r0.<init>()
            okhttp3.Dns.SYSTEM = r0
            return
    }

    static /* synthetic */ java.util.List lambda$static$0(java.lang.String r4) throws java.net.UnknownHostException {
            if (r4 == 0) goto L24
            java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r4)     // Catch: java.lang.NullPointerException -> Lb
            java.util.List r4 = java.util.Arrays.asList(r0)     // Catch: java.lang.NullPointerException -> Lb
            return r4
        Lb:
            r0 = move-exception
            java.net.UnknownHostException r1 = new java.net.UnknownHostException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Broken system behaviour for dns lookup of "
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
        L24:
            java.net.UnknownHostException r4 = new java.net.UnknownHostException
            java.lang.String r0 = "hostname == null"
            r4.<init>(r0)
            throw r4
    }

    java.util.List<java.net.InetAddress> lookup(java.lang.String r1) throws java.net.UnknownHostException;
}
