package okhttp3.internal.tls;

/* loaded from: classes.dex */
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
    private static final int MAX_SIGNERS = 9;
    private final okhttp3.internal.tls.TrustRootIndex trustRootIndex;

    public BasicCertificateChainCleaner(okhttp3.internal.tls.TrustRootIndex r1) {
            r0 = this;
            r0.<init>()
            r0.trustRootIndex = r1
            return
    }

    private boolean verifySignature(java.security.cert.X509Certificate r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.security.Principal r0 = r3.getIssuerDN()
            java.security.Principal r1 = r4.getSubjectDN()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.security.PublicKey r4 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L19
            r3.verify(r4)     // Catch: java.security.GeneralSecurityException -> L19
            r3 = 1
            return r3
        L19:
            return r1
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public java.util.List<java.security.cert.Certificate> clean(java.util.List<java.security.cert.Certificate> r7, java.lang.String r8) throws javax.net.ssl.SSLPeerUnverifiedException {
            r6 = this;
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r0 = r8.removeFirst()
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            r7.add(r0)
            r0 = 0
            r1 = r0
        L15:
            r2 = 9
            if (r0 >= r2) goto L7c
            int r2 = r7.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r7.get(r2)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            okhttp3.internal.tls.TrustRootIndex r4 = r6.trustRootIndex
            java.security.cert.X509Certificate r4 = r4.findByIssuerAndSignature(r2)
            if (r4 == 0) goto L45
            int r1 = r7.size()
            if (r1 > r3) goto L39
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L3c
        L39:
            r7.add(r4)
        L3c:
            boolean r1 = r6.verifySignature(r4, r4)
            if (r1 == 0) goto L43
            return r7
        L43:
            r1 = r3
            goto L61
        L45:
            java.util.Iterator r3 = r8.iterator()
        L49:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            boolean r5 = r6.verifySignature(r2, r4)
            if (r5 == 0) goto L49
            r3.remove()
            r7.add(r4)
        L61:
            int r0 = r0 + 1
            goto L15
        L64:
            if (r1 == 0) goto L67
            return r7
        L67:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L7c:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof okhttp3.internal.tls.BasicCertificateChainCleaner
            if (r1 == 0) goto L15
            okhttp3.internal.tls.BasicCertificateChainCleaner r3 = (okhttp3.internal.tls.BasicCertificateChainCleaner) r3
            okhttp3.internal.tls.TrustRootIndex r3 = r3.trustRootIndex
            okhttp3.internal.tls.TrustRootIndex r1 = r2.trustRootIndex
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int hashCode() {
            r1 = this;
            okhttp3.internal.tls.TrustRootIndex r0 = r1.trustRootIndex
            int r0 = r0.hashCode()
            return r0
    }
}
