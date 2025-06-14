package okhttp3.internal.tls;

/* loaded from: classes.dex */
public abstract class CertificateChainCleaner {
    public CertificateChainCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    public static okhttp3.internal.tls.CertificateChainCleaner get(javax.net.ssl.X509TrustManager r1) {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            okhttp3.internal.tls.CertificateChainCleaner r1 = r0.buildCertificateChainCleaner(r1)
            return r1
    }

    public static okhttp3.internal.tls.CertificateChainCleaner get(java.security.cert.X509Certificate... r2) {
            okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
            okhttp3.internal.tls.BasicTrustRootIndex r1 = new okhttp3.internal.tls.BasicTrustRootIndex
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public abstract java.util.List<java.security.cert.Certificate> clean(java.util.List<java.security.cert.Certificate> r1, java.lang.String r2) throws javax.net.ssl.SSLPeerUnverifiedException;
}
