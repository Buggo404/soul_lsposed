package okhttp3.internal.tls;

/* loaded from: classes.dex */
public final class BasicTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(java.security.cert.X509Certificate... r7) {
            r6 = this;
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.subjectToCaCerts = r0
            int r0 = r7.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L2f
            r2 = r7[r1]
            javax.security.auth.x500.X500Principal r3 = r2.getSubjectX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r4 = r6.subjectToCaCerts
            java.lang.Object r4 = r4.get(r3)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L29
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r5 = 1
            r4.<init>(r5)
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r5 = r6.subjectToCaCerts
            r5.put(r3, r4)
        L29:
            r4.add(r2)
            int r1 = r1 + 1
            goto Lc
        L2f:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof okhttp3.internal.tls.BasicTrustRootIndex
            if (r1 == 0) goto L15
            okhttp3.internal.tls.BasicTrustRootIndex r3 = (okhttp3.internal.tls.BasicTrustRootIndex) r3
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r3 = r3.subjectToCaCerts
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r2.subjectToCaCerts
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r5) {
            r4 = this;
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.subjectToCaCerts
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.PublicKey r3 = r2.getPublicKey()
            r5.verify(r3)     // Catch: java.lang.Exception -> L14
            return r2
        L28:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.subjectToCaCerts
            int r0 = r0.hashCode()
            return r0
    }
}
