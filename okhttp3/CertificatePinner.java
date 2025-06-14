package okhttp3;

/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final okhttp3.CertificatePinner DEFAULT = null;

    @javax.annotation.Nullable
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    public static final class Builder {
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pins = r0
                return
        }

        public okhttp3.CertificatePinner.Builder add(java.lang.String r6, java.lang.String... r7) {
                r5 = this;
                if (r6 == 0) goto L16
                int r0 = r7.length
                r1 = 0
            L4:
                if (r1 >= r0) goto L15
                r2 = r7[r1]
                java.util.List<okhttp3.CertificatePinner$Pin> r3 = r5.pins
                okhttp3.CertificatePinner$Pin r4 = new okhttp3.CertificatePinner$Pin
                r4.<init>(r6, r2)
                r3.add(r4)
                int r1 = r1 + 1
                goto L4
            L15:
                return r5
            L16:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "pattern == null"
                r6.<init>(r7)
                throw r6
        }

        public okhttp3.CertificatePinner build() {
                r3 = this;
                okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                java.util.List<okhttp3.CertificatePinner$Pin> r2 = r3.pins
                r1.<init>(r2)
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    static final class Pin {
        private static final java.lang.String WILDCARD = "*.";
        final java.lang.String canonicalHostname;
        final okio.ByteString hash;
        final java.lang.String hashAlgorithm;
        final java.lang.String pattern;

        Pin(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                r2.pattern = r3
                java.lang.String r0 = "*."
                boolean r0 = r3.startsWith(r0)
                java.lang.String r1 = "http://"
                if (r0 == 0) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r1 = 2
                java.lang.String r3 = r3.substring(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                okhttp3.HttpUrl r3 = okhttp3.HttpUrl.get(r3)
                java.lang.String r3 = r3.host()
                goto L3f
            L2a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                okhttp3.HttpUrl r3 = okhttp3.HttpUrl.get(r3)
                java.lang.String r3 = r3.host()
            L3f:
                r2.canonicalHostname = r3
                java.lang.String r3 = "sha1/"
                boolean r0 = r4.startsWith(r3)
                if (r0 == 0) goto L57
                r2.hashAlgorithm = r3
                r3 = 5
                java.lang.String r3 = r4.substring(r3)
                okio.ByteString r3 = okio.ByteString.decodeBase64(r3)
                r2.hash = r3
                goto L6c
            L57:
                java.lang.String r3 = "sha256/"
                boolean r0 = r4.startsWith(r3)
                if (r0 == 0) goto L86
                r2.hashAlgorithm = r3
                r3 = 7
                java.lang.String r3 = r4.substring(r3)
                okio.ByteString r3 = okio.ByteString.decodeBase64(r3)
                r2.hash = r3
            L6c:
                okio.ByteString r3 = r2.hash
                if (r3 == 0) goto L71
                return
            L71:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "pins must be base64: "
                r0.<init>(r1)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L86:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "pins must start with 'sha256/' or 'sha1/': "
                r0.<init>(r1)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof okhttp3.CertificatePinner.Pin
                if (r0 == 0) goto L26
                java.lang.String r0 = r2.pattern
                okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
                java.lang.String r1 = r3.pattern
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L26
                java.lang.String r0 = r2.hashAlgorithm
                java.lang.String r1 = r3.hashAlgorithm
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L26
                okio.ByteString r0 = r2.hash
                okio.ByteString r3 = r3.hash
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L26
                r3 = 1
                goto L27
            L26:
                r3 = 0
            L27:
                return r3
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.pattern
                int r0 = r0.hashCode()
                r1 = 527(0x20f, float:7.38E-43)
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r2.hashAlgorithm
                int r0 = r0.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                okio.ByteString r0 = r2.hash
                int r0 = r0.hashCode()
                int r1 = r1 + r0
                return r1
        }

        boolean matches(java.lang.String r11) {
                r10 = this;
                java.lang.String r0 = r10.pattern
                java.lang.String r1 = "*."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L33
                r0 = 46
                int r0 = r11.indexOf(r0)
                int r1 = r11.length()
                int r1 = r1 - r0
                r2 = 1
                int r1 = r1 - r2
                java.lang.String r3 = r10.canonicalHostname
                int r3 = r3.length()
                if (r1 != r3) goto L31
                r5 = 0
                int r6 = r0 + 1
                java.lang.String r7 = r10.canonicalHostname
                r8 = 0
                int r9 = r7.length()
                r4 = r11
                boolean r11 = r4.regionMatches(r5, r6, r7, r8, r9)
                if (r11 == 0) goto L31
                goto L32
            L31:
                r2 = 0
            L32:
                return r2
            L33:
                java.lang.String r0 = r10.canonicalHostname
                boolean r11 = r11.equals(r0)
                return r11
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.hashAlgorithm
                java.lang.StringBuilder r0 = r0.append(r1)
                okio.ByteString r1 = r2.hash
                java.lang.String r1 = r1.base64()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            okhttp3.CertificatePinner$Builder r0 = new okhttp3.CertificatePinner$Builder
            r0.<init>()
            okhttp3.CertificatePinner r0 = r0.build()
            okhttp3.CertificatePinner.DEFAULT = r0
            return
    }

    CertificatePinner(java.util.Set<okhttp3.CertificatePinner.Pin> r1, @javax.annotation.Nullable okhttp3.internal.tls.CertificateChainCleaner r2) {
            r0 = this;
            r0.<init>()
            r0.pins = r1
            r0.certificateChainCleaner = r2
            return
    }

    public static java.lang.String pin(java.security.cert.Certificate r2) {
            boolean r0 = r2 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sha256/"
            r0.<init>(r1)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            okio.ByteString r2 = sha256(r2)
            java.lang.String r2 = r2.base64()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Certificate pinning requires X509 certificates"
            r2.<init>(r0)
            throw r2
    }

    static okio.ByteString sha1(java.security.cert.X509Certificate r0) {
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            okio.ByteString r0 = okio.ByteString.m96of(r0)
            okio.ByteString r0 = r0.sha1()
            return r0
    }

    static okio.ByteString sha256(java.security.cert.X509Certificate r0) {
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            okio.ByteString r0 = okio.ByteString.m96of(r0)
            okio.ByteString r0 = r0.sha256()
            return r0
    }

    public void check(java.lang.String r13, java.util.List<java.security.cert.Certificate> r14) throws javax.net.ssl.SSLPeerUnverifiedException {
            r12 = this;
            java.util.List r0 = r12.findMatchingPins(r13)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            return
        Lb:
            okhttp3.internal.tls.CertificateChainCleaner r1 = r12.certificateChainCleaner
            if (r1 == 0) goto L13
            java.util.List r14 = r1.clean(r14, r13)
        L13:
            int r1 = r14.size()
            r2 = 0
            r3 = r2
        L19:
            if (r3 >= r1) goto L7f
            java.lang.Object r4 = r14.get(r3)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            int r5 = r0.size()
            r6 = 0
            r8 = r2
            r7 = r6
        L28:
            if (r8 >= r5) goto L7c
            java.lang.Object r9 = r0.get(r8)
            okhttp3.CertificatePinner$Pin r9 = (okhttp3.CertificatePinner.Pin) r9
            java.lang.String r10 = r9.hashAlgorithm
            java.lang.String r11 = "sha256/"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L49
            if (r6 != 0) goto L40
            okio.ByteString r6 = sha256(r4)
        L40:
            okio.ByteString r9 = r9.hash
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L62
            return
        L49:
            java.lang.String r10 = r9.hashAlgorithm
            java.lang.String r11 = "sha1/"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L65
            if (r7 != 0) goto L59
            okio.ByteString r7 = sha1(r4)
        L59:
            okio.ByteString r9 = r9.hash
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto L62
            return
        L62:
            int r8 = r8 + 1
            goto L28
        L65:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "unsupported hashAlgorithm: "
            r14.<init>(r0)
            java.lang.String r0 = r9.hashAlgorithm
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L7c:
            int r3 = r3 + 1
            goto L19
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Certificate pinning failure!\n  Peer certificate chain:"
            r1.<init>(r3)
            int r3 = r14.size()
            r4 = r2
        L8b:
            java.lang.String r5 = "\n    "
            if (r4 >= r3) goto Lb5
            java.lang.Object r6 = r14.get(r4)
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r7 = pin(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.security.Principal r6 = r6.getSubjectDN()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            int r4 = r4 + 1
            goto L8b
        Lb5:
            java.lang.String r14 = "\n  Pinned certificates for "
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.StringBuilder r13 = r14.append(r13)
            java.lang.String r14 = ":"
            r13.append(r14)
            int r13 = r0.size()
        Lc8:
            if (r2 >= r13) goto Lda
            java.lang.Object r14 = r0.get(r2)
            okhttp3.CertificatePinner$Pin r14 = (okhttp3.CertificatePinner.Pin) r14
            java.lang.StringBuilder r3 = r1.append(r5)
            r3.append(r14)
            int r2 = r2 + 1
            goto Lc8
        Lda:
            javax.net.ssl.SSLPeerUnverifiedException r13 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r14 = r1.toString()
            r13.<init>(r14)
            throw r13
    }

    public void check(java.lang.String r1, java.security.cert.Certificate... r2) throws javax.net.ssl.SSLPeerUnverifiedException {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.check(r1, r2)
            return
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof okhttp3.CertificatePinner
            if (r1 == 0) goto L1f
            okhttp3.internal.tls.CertificateChainCleaner r1 = r3.certificateChainCleaner
            okhttp3.CertificatePinner r4 = (okhttp3.CertificatePinner) r4
            okhttp3.internal.tls.CertificateChainCleaner r2 = r4.certificateChainCleaner
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L1f
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r3.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r4 = r4.pins
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(java.lang.String r5) {
            r4 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r4.pins
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            okhttp3.CertificatePinner$Pin r2 = (okhttp3.CertificatePinner.Pin) r2
            boolean r3 = r2.matches(r5)
            if (r3 == 0) goto La
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L27:
            r0.add(r2)
            goto La
        L2b:
            return r0
    }

    public int hashCode() {
            r2 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 * 31
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    okhttp3.CertificatePinner withCertificateChainCleaner(@javax.annotation.Nullable okhttp3.internal.tls.CertificateChainCleaner r3) {
            r2 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r0 = java.util.Objects.equals(r0, r3)
            if (r0 == 0) goto La
            r0 = r2
            goto L11
        La:
            okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            r0.<init>(r1, r3)
        L11:
            return r0
    }
}
