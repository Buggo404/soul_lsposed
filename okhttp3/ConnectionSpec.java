package okhttp3;

/* loaded from: classes.dex */
public final class ConnectionSpec {
    private static final okhttp3.CipherSuite[] APPROVED_CIPHER_SUITES = null;
    public static final okhttp3.ConnectionSpec CLEARTEXT = null;
    public static final okhttp3.ConnectionSpec COMPATIBLE_TLS = null;
    public static final okhttp3.ConnectionSpec MODERN_TLS = null;
    private static final okhttp3.CipherSuite[] RESTRICTED_CIPHER_SUITES = null;
    public static final okhttp3.ConnectionSpec RESTRICTED_TLS = null;

    @javax.annotation.Nullable
    final java.lang.String[] cipherSuites;
    final boolean supportsTlsExtensions;
    final boolean tls;

    @javax.annotation.Nullable
    final java.lang.String[] tlsVersions;

    public static final class Builder {

        @javax.annotation.Nullable
        java.lang.String[] cipherSuites;
        boolean supportsTlsExtensions;
        boolean tls;

        @javax.annotation.Nullable
        java.lang.String[] tlsVersions;

        public Builder(okhttp3.ConnectionSpec r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = r2.tls
                r1.tls = r0
                java.lang.String[] r0 = r2.cipherSuites
                r1.cipherSuites = r0
                java.lang.String[] r0 = r2.tlsVersions
                r1.tlsVersions = r0
                boolean r2 = r2.supportsTlsExtensions
                r1.supportsTlsExtensions = r2
                return
        }

        Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.tls = r1
                return
        }

        public okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
                r2 = this;
                boolean r0 = r2.tls
                if (r0 == 0) goto L8
                r0 = 0
                r2.cipherSuites = r0
                return r2
            L8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "no cipher suites for cleartext connections"
                r0.<init>(r1)
                throw r0
        }

        public okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
                r2 = this;
                boolean r0 = r2.tls
                if (r0 == 0) goto L8
                r0 = 0
                r2.tlsVersions = r0
                return r2
            L8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "no TLS versions for cleartext connections"
                r0.<init>(r1)
                throw r0
        }

        public okhttp3.ConnectionSpec build() {
                r1 = this;
                okhttp3.ConnectionSpec r0 = new okhttp3.ConnectionSpec
                r0.<init>(r1)
                return r0
        }

        public okhttp3.ConnectionSpec.Builder cipherSuites(java.lang.String... r2) {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L18
                int r0 = r2.length
                if (r0 == 0) goto L10
                java.lang.Object r2 = r2.clone()
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.cipherSuites = r2
                return r1
            L10:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one cipher suite is required"
                r2.<init>(r0)
                throw r2
            L18:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.ConnectionSpec.Builder cipherSuites(okhttp3.CipherSuite... r4) {
                r3 = this;
                boolean r0 = r3.tls
                if (r0 == 0) goto L19
                int r0 = r4.length
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
            L8:
                int r2 = r4.length
                if (r1 >= r2) goto L14
                r2 = r4[r1]
                java.lang.String r2 = r2.javaName
                r0[r1] = r2
                int r1 = r1 + 1
                goto L8
            L14:
                okhttp3.ConnectionSpec$Builder r4 = r3.cipherSuites(r0)
                return r4
            L19:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                r4.<init>(r0)
                throw r4
        }

        public okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean r2) {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L7
                r1.supportsTlsExtensions = r2
                return r1
            L7:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "no TLS extensions for cleartext connections"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.ConnectionSpec.Builder tlsVersions(java.lang.String... r2) {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L18
                int r0 = r2.length
                if (r0 == 0) goto L10
                java.lang.Object r2 = r2.clone()
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.tlsVersions = r2
                return r1
            L10:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one TLS version is required"
                r2.<init>(r0)
                throw r2
            L18:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.ConnectionSpec.Builder tlsVersions(okhttp3.TlsVersion... r4) {
                r3 = this;
                boolean r0 = r3.tls
                if (r0 == 0) goto L19
                int r0 = r4.length
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
            L8:
                int r2 = r4.length
                if (r1 >= r2) goto L14
                r2 = r4[r1]
                java.lang.String r2 = r2.javaName
                r0[r1] = r2
                int r1 = r1 + 1
                goto L8
            L14:
                okhttp3.ConnectionSpec$Builder r4 = r3.tlsVersions(r0)
                return r4
            L19:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                r4.<init>(r0)
                throw r4
        }
    }

    static {
            r0 = 9
            okhttp3.CipherSuite[] r1 = new okhttp3.CipherSuite[r0]
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            r3 = 0
            r1[r3] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            r4 = 1
            r1[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            r5 = 2
            r1[r5] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            r6 = 3
            r1[r6] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            r7 = 4
            r1[r7] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            r8 = 5
            r1[r8] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            r9 = 6
            r1[r9] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            r10 = 7
            r1[r10] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            r11 = 8
            r1[r11] = r2
            okhttp3.ConnectionSpec.RESTRICTED_CIPHER_SUITES = r1
            r2 = 16
            okhttp3.CipherSuite[] r2 = new okhttp3.CipherSuite[r2]
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            r2[r3] = r12
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            r2[r4] = r12
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            r2[r5] = r12
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            r2[r6] = r12
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            r2[r7] = r12
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            r2[r8] = r12
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            r2[r9] = r8
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            r2[r10] = r8
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            r2[r11] = r8
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
            r2[r0] = r8
            r0 = 10
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
            r2[r0] = r8
            r0 = 11
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256
            r2[r0] = r8
            r0 = 12
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384
            r2[r0] = r8
            r0 = 13
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA
            r2[r0] = r8
            r0 = 14
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA
            r2[r0] = r8
            r0 = 15
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA
            r2[r0] = r8
            okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES = r2
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r4)
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r1)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r5]
            okhttp3.TlsVersion r8 = okhttp3.TlsVersion.TLS_1_3
            r1[r3] = r8
            okhttp3.TlsVersion r8 = okhttp3.TlsVersion.TLS_1_2
            r1[r4] = r8
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r4)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.RESTRICTED_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r4)
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r2)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r5]
            okhttp3.TlsVersion r8 = okhttp3.TlsVersion.TLS_1_3
            r1[r3] = r8
            okhttp3.TlsVersion r8 = okhttp3.TlsVersion.TLS_1_2
            r1[r4] = r8
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r4)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.MODERN_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r4)
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r2)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r7]
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_3
            r1[r3] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_2
            r1[r4] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_1
            r1[r5] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_0
            r1[r6] = r2
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r4)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.COMPATIBLE_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r3)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.CLEARTEXT = r0
            return
    }

    ConnectionSpec(okhttp3.ConnectionSpec.Builder r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.tls
            r1.tls = r0
            java.lang.String[] r0 = r2.cipherSuites
            r1.cipherSuites = r0
            java.lang.String[] r0 = r2.tlsVersions
            r1.tlsVersions = r0
            boolean r2 = r2.supportsTlsExtensions
            r1.supportsTlsExtensions = r2
            return
    }

    private okhttp3.ConnectionSpec supportedSpec(javax.net.ssl.SSLSocket r5, boolean r6) {
            r4 = this;
            java.lang.String[] r0 = r4.cipherSuites
            if (r0 == 0) goto L11
            java.util.Comparator<java.lang.String> r0 = okhttp3.CipherSuite.ORDER_BY_NAME
            java.lang.String[] r1 = r5.getEnabledCipherSuites()
            java.lang.String[] r2 = r4.cipherSuites
            java.lang.String[] r0 = okhttp3.internal.Util.intersect(r0, r1, r2)
            goto L15
        L11:
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
        L15:
            java.lang.String[] r1 = r4.tlsVersions
            if (r1 == 0) goto L26
            java.util.Comparator<java.lang.String> r1 = okhttp3.internal.Util.NATURAL_ORDER
            java.lang.String[] r2 = r5.getEnabledProtocols()
            java.lang.String[] r3 = r4.tlsVersions
            java.lang.String[] r1 = okhttp3.internal.Util.intersect(r1, r2, r3)
            goto L2a
        L26:
            java.lang.String[] r1 = r5.getEnabledProtocols()
        L2a:
            java.lang.String[] r5 = r5.getSupportedCipherSuites()
            java.util.Comparator<java.lang.String> r2 = okhttp3.CipherSuite.ORDER_BY_NAME
            java.lang.String r3 = "TLS_FALLBACK_SCSV"
            int r2 = okhttp3.internal.Util.indexOf(r2, r5, r3)
            if (r6 == 0) goto L41
            r6 = -1
            if (r2 == r6) goto L41
            r5 = r5[r2]
            java.lang.String[] r0 = okhttp3.internal.Util.concat(r0, r5)
        L41:
            okhttp3.ConnectionSpec$Builder r5 = new okhttp3.ConnectionSpec$Builder
            r5.<init>(r4)
            okhttp3.ConnectionSpec$Builder r5 = r5.cipherSuites(r0)
            okhttp3.ConnectionSpec$Builder r5 = r5.tlsVersions(r1)
            okhttp3.ConnectionSpec r5 = r5.build()
            return r5
    }

    void apply(javax.net.ssl.SSLSocket r2, boolean r3) {
            r1 = this;
            okhttp3.ConnectionSpec r3 = r1.supportedSpec(r2, r3)
            java.lang.String[] r0 = r3.tlsVersions
            if (r0 == 0) goto Lb
            r2.setEnabledProtocols(r0)
        Lb:
            java.lang.String[] r3 = r3.cipherSuites
            if (r3 == 0) goto L12
            r2.setEnabledCipherSuites(r3)
        L12:
            return
    }

    @javax.annotation.Nullable
    public java.util.List<okhttp3.CipherSuite> cipherSuites() {
            r1 = this;
            java.lang.String[] r0 = r1.cipherSuites
            if (r0 == 0) goto L9
            java.util.List r0 = okhttp3.CipherSuite.forJavaNames(r0)
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof okhttp3.ConnectionSpec
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            okhttp3.ConnectionSpec r5 = (okhttp3.ConnectionSpec) r5
            boolean r2 = r4.tls
            boolean r3 = r5.tls
            if (r2 == r3) goto L13
            return r1
        L13:
            if (r2 == 0) goto L32
            java.lang.String[] r2 = r4.cipherSuites
            java.lang.String[] r3 = r5.cipherSuites
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r2 = r4.tlsVersions
            java.lang.String[] r3 = r5.tlsVersions
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r4.supportsTlsExtensions
            boolean r5 = r5.supportsTlsExtensions
            if (r2 == r5) goto L32
            return r1
        L32:
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.tls
            if (r0 == 0) goto L1e
            java.lang.String[] r0 = r2.cipherSuites
            int r0 = java.util.Arrays.hashCode(r0)
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String[] r0 = r2.tlsVersions
            int r0 = java.util.Arrays.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.supportsTlsExtensions
            r0 = r0 ^ 1
            int r1 = r1 + r0
            goto L20
        L1e:
            r1 = 17
        L20:
            return r1
    }

    public boolean isCompatible(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            boolean r0 = r4.tls
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String[] r0 = r4.tlsVersions
            if (r0 == 0) goto L19
            java.util.Comparator<java.lang.String> r0 = okhttp3.internal.Util.NATURAL_ORDER
            java.lang.String[] r2 = r4.tlsVersions
            java.lang.String[] r3 = r5.getEnabledProtocols()
            boolean r0 = okhttp3.internal.Util.nonEmptyIntersection(r0, r2, r3)
            if (r0 != 0) goto L19
            return r1
        L19:
            java.lang.String[] r0 = r4.cipherSuites
            if (r0 == 0) goto L2c
            java.util.Comparator<java.lang.String> r0 = okhttp3.CipherSuite.ORDER_BY_NAME
            java.lang.String[] r2 = r4.cipherSuites
            java.lang.String[] r5 = r5.getEnabledCipherSuites()
            boolean r5 = okhttp3.internal.Util.nonEmptyIntersection(r0, r2, r5)
            if (r5 != 0) goto L2c
            return r1
        L2c:
            r5 = 1
            return r5
    }

    public boolean isTls() {
            r1 = this;
            boolean r0 = r1.tls
            return r0
    }

    public boolean supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @javax.annotation.Nullable
    public java.util.List<okhttp3.TlsVersion> tlsVersions() {
            r1 = this;
            java.lang.String[] r0 = r1.tlsVersions
            if (r0 == 0) goto L9
            java.util.List r0 = okhttp3.TlsVersion.forJavaNames(r0)
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.tls
            if (r0 != 0) goto L7
            java.lang.String r0 = "ConnectionSpec()"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectionSpec(cipherSuites="
            r0.<init>(r1)
            java.util.List r1 = r3.cipherSuites()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", tlsVersions="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.tlsVersions()
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", supportsTlsExtensions="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r3.supportsTlsExtensions
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
