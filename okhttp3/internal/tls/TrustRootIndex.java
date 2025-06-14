package okhttp3.internal.tls;

/* loaded from: classes.dex */
public interface TrustRootIndex {
    java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r1);
}
