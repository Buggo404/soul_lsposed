package okhttp3.internal.platform;

/* loaded from: classes.dex */
public class ConscryptPlatform extends okhttp3.internal.platform.Platform {
    private ConscryptPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static okhttp3.internal.platform.ConscryptPlatform buildIfSupported() {
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt"
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L13
            boolean r1 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.ClassNotFoundException -> L13
            if (r1 != 0) goto Ld
            return r0
        Ld:
            okhttp3.internal.platform.ConscryptPlatform r1 = new okhttp3.internal.platform.ConscryptPlatform     // Catch: java.lang.ClassNotFoundException -> L13
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L13
            return r1
        L13:
            return r0
    }

    private java.security.Provider getProvider() {
            r1 = this;
            org.conscrypt.Conscrypt$ProviderBuilder r0 = org.conscrypt.Conscrypt.newProviderBuilder()
            org.conscrypt.Conscrypt$ProviderBuilder r0 = r0.provideTrustManager()
            java.security.Provider r0 = r0.build()
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureSslSocketFactory(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto La
            r0 = 1
            org.conscrypt.Conscrypt.setUseEngineSocket(r2, r0)
        La:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<okhttp3.Protocol> r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto L20
            if (r3 == 0) goto Lf
            r0 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r2, r0)
            org.conscrypt.Conscrypt.setHostname(r2, r3)
        Lf:
            java.util.List r3 = okhttp3.internal.platform.Platform.alpnProtocolNames(r4)
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            org.conscrypt.Conscrypt.setApplicationProtocols(r2, r3)
            goto L23
        L20:
            super.configureTlsExtensions(r2, r3, r4)
        L23:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext getSSLContext() {
            r3 = this;
            java.lang.String r0 = "TLSv1.3"
            java.security.Provider r1 = r3.getProvider()     // Catch: java.security.NoSuchAlgorithmException -> Lb
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0, r1)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.String r1 = "TLS"
            java.security.Provider r2 = r3.getProvider()     // Catch: java.security.NoSuchAlgorithmException -> L17
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1, r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            return r0
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            return r2
        Lb:
            java.lang.String r2 = super.getSelectedProtocol(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r3) {
            r2 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r3)
            if (r0 != 0) goto Lb
            javax.net.ssl.X509TrustManager r3 = super.trustManager(r3)
            return r3
        Lb:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "sslParameters"
            java.lang.Object r3 = readFieldOrNull(r3, r0, r1)     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L20
            java.lang.Class<javax.net.ssl.X509TrustManager> r0 = javax.net.ssl.X509TrustManager.class
            java.lang.String r1 = "x509TrustManager"
            java.lang.Object r3 = readFieldOrNull(r3, r0, r1)     // Catch: java.lang.Exception -> L22
            javax.net.ssl.X509TrustManager r3 = (javax.net.ssl.X509TrustManager) r3     // Catch: java.lang.Exception -> L22
            return r3
        L20:
            r3 = 0
            return r3
        L22:
            r3 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt"
            r0.<init>(r1, r3)
            throw r0
    }
}
