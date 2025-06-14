package okhttp3.internal.platform;

/* loaded from: classes.dex */
class AndroidPlatform extends okhttp3.internal.platform.Platform {
    private static final int MAX_LOG_LENGTH = 4000;
    private final okhttp3.internal.platform.AndroidPlatform.CloseGuard closeGuard;
    private final java.lang.reflect.Method getAlpnSelectedProtocol;
    private final java.lang.reflect.Method setAlpnProtocols;
    private final java.lang.reflect.Method setHostname;
    private final java.lang.reflect.Method setUseSessionTickets;
    private final java.lang.Class<?> sslParametersClass;
    private final java.lang.Class<?> sslSocketClass;

    static final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
        private final java.lang.reflect.Method checkServerTrusted;
        private final java.lang.Object x509TrustManagerExtensions;

        AndroidCertificateChainCleaner(java.lang.Object r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.x509TrustManagerExtensions = r1
                r0.checkServerTrusted = r2
                return
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public java.util.List<java.security.cert.Certificate> clean(java.util.List<java.security.cert.Certificate> r5, java.lang.String r6) throws javax.net.ssl.SSLPeerUnverifiedException {
                r4 = this;
                int r0 = r5.size()     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object[] r5 = r5.toArray(r0)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.security.cert.X509Certificate[] r5 = (java.security.cert.X509Certificate[]) r5     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.reflect.Method r0 = r4.checkServerTrusted     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object r1 = r4.x509TrustManagerExtensions     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.String r5 = "RSA"
                r3 = 1
                r2[r3] = r5     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r5 = 2
                r2[r5] = r6     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object r5 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                return r5
            L25:
                r5 = move-exception
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>(r5)
                throw r6
            L2c:
                r5 = move-exception
                javax.net.ssl.SSLPeerUnverifiedException r6 = new javax.net.ssl.SSLPeerUnverifiedException
                java.lang.String r0 = r5.getMessage()
                r6.<init>(r0)
                r6.initCause(r5)
                throw r6
        }

        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r1 instanceof okhttp3.internal.platform.AndroidPlatform.AndroidCertificateChainCleaner
                return r1
        }

        public int hashCode() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static final class CloseGuard {
        private final java.lang.reflect.Method getMethod;
        private final java.lang.reflect.Method openMethod;
        private final java.lang.reflect.Method warnIfOpenMethod;

        CloseGuard(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
                r0 = this;
                r0.<init>()
                r0.getMethod = r1
                r0.openMethod = r2
                r0.warnIfOpenMethod = r3
                return
        }

        static okhttp3.internal.platform.AndroidPlatform.CloseGuard get() {
                java.lang.String r0 = "dalvik.system.CloseGuard"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L25
                java.lang.String r1 = "get"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L25
                java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L25
                java.lang.String r3 = "open"
                r4 = 1
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L25
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r2] = r5     // Catch: java.lang.Exception -> L25
                java.lang.reflect.Method r3 = r0.getMethod(r3, r4)     // Catch: java.lang.Exception -> L25
                java.lang.String r4 = "warnIfOpen"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L25
                java.lang.reflect.Method r0 = r0.getMethod(r4, r2)     // Catch: java.lang.Exception -> L25
                goto L28
            L25:
                r1 = 0
                r0 = r1
                r3 = r0
            L28:
                okhttp3.internal.platform.AndroidPlatform$CloseGuard r2 = new okhttp3.internal.platform.AndroidPlatform$CloseGuard
                r2.<init>(r1, r3, r0)
                return r2
        }

        java.lang.Object createAndOpen(java.lang.String r6) {
                r5 = this;
                java.lang.reflect.Method r0 = r5.getMethod
                r1 = 0
                if (r0 == 0) goto L17
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L17
                java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L17
                java.lang.reflect.Method r3 = r5.openMethod     // Catch: java.lang.Exception -> L17
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L17
                r4[r2] = r6     // Catch: java.lang.Exception -> L17
                r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L17
                return r0
            L17:
                return r1
        }

        boolean warnIfOpen(java.lang.Object r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto Lb
                java.lang.reflect.Method r1 = r3.warnIfOpenMethod     // Catch: java.lang.Exception -> Lb
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb
                r1.invoke(r4, r2)     // Catch: java.lang.Exception -> Lb
                r0 = 1
            Lb:
                return r0
        }
    }

    static final class CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
        private final java.lang.reflect.Method findByIssuerAndSignatureMethod;
        private final javax.net.ssl.X509TrustManager trustManager;

        CustomTrustRootIndex(javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.findByIssuerAndSignatureMethod = r2
                r0.trustManager = r1
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r5 = (okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex) r5
                javax.net.ssl.X509TrustManager r1 = r4.trustManager
                javax.net.ssl.X509TrustManager r3 = r5.trustManager
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                java.lang.reflect.Method r1 = r4.findByIssuerAndSignatureMethod
                java.lang.reflect.Method r5 = r5.findByIssuerAndSignatureMethod
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r6) {
                r5 = this;
                r0 = 0
                java.lang.reflect.Method r1 = r5.findByIssuerAndSignatureMethod     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
                javax.net.ssl.X509TrustManager r2 = r5.trustManager     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
                r4 = 0
                r3[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
                java.lang.Object r6 = r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
                java.security.cert.TrustAnchor r6 = (java.security.cert.TrustAnchor) r6     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
                if (r6 == 0) goto L17
                java.security.cert.X509Certificate r0 = r6.getTrustedCert()     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L18
            L17:
                return r0
            L18:
                r6 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unable to get issues and signature"
                r0.<init>(r1, r6)
                throw r0
        }

        public int hashCode() {
                r2 = this;
                javax.net.ssl.X509TrustManager r0 = r2.trustManager
                int r0 = r0.hashCode()
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                int r1 = r1.hashCode()
                int r1 = r1 * 31
                int r0 = r0 + r1
                return r0
        }
    }

    AndroidPlatform(java.lang.Class<?> r2, java.lang.Class<?> r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6, java.lang.reflect.Method r7) {
            r1 = this;
            r1.<init>()
            okhttp3.internal.platform.AndroidPlatform$CloseGuard r0 = okhttp3.internal.platform.AndroidPlatform.CloseGuard.get()
            r1.closeGuard = r0
            r1.sslParametersClass = r2
            r1.sslSocketClass = r3
            r1.setUseSessionTickets = r4
            r1.setHostname = r5
            r1.getAlpnSelectedProtocol = r6
            r1.setAlpnProtocols = r7
            return
    }

    private boolean api23IsCleartextTrafficPermitted(java.lang.String r4, java.lang.Class<?> r5, java.lang.Object r6) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r3 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.reflect.Method r5 = r5.getMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.Object r5 = r5.invoke(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.NoSuchMethodException -> L16
            boolean r4 = r5.booleanValue()     // Catch: java.lang.NoSuchMethodException -> L16
            return r4
        L16:
            boolean r4 = super.isCleartextTrafficPermitted(r4)
            return r4
    }

    private boolean api24IsCleartextTrafficPermitted(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r5 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.reflect.Method r0 = r7.getMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L1d
            r1[r4] = r6     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.Object r0 = r0.invoke(r8, r1)     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.NoSuchMethodException -> L1d
            boolean r6 = r0.booleanValue()     // Catch: java.lang.NoSuchMethodException -> L1d
            return r6
        L1d:
            boolean r6 = r5.api23IsCleartextTrafficPermitted(r6, r7, r8)
            return r6
    }

    @javax.annotation.Nullable
    public static okhttp3.internal.platform.Platform buildIfSupported() {
            boolean r0 = okhttp3.internal.platform.Platform.isAndroid()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L61
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L61
            java.lang.String r0 = "setUseSessionTickets"
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L4a
            r6 = 0
            r2[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r0 = "setHostname"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2[r6] = r7     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r4.getMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r2 = "getAlpnSelectedProtocol"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r7 = r4.getMethod(r2, r7)     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r2 = "setAlpnProtocols"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<byte[]> r8 = byte[].class
            r1[r6] = r8     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r8 = r4.getMethod(r2, r1)     // Catch: java.lang.NoSuchMethodException -> L4a
            okhttp3.internal.platform.AndroidPlatform r1 = new okhttp3.internal.platform.AndroidPlatform     // Catch: java.lang.NoSuchMethodException -> L4a
            r2 = r1
            r6 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.NoSuchMethodException -> L4a
            return r1
        L4a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected Android API level 21+ but was "
            r1.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L61:
            return r1
    }

    static int getSdkInt() {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager r8) {
            r7 = this;
            java.lang.String r0 = "android.net.http.X509TrustManagerExtensions"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L36
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L36
            java.lang.Class<javax.net.ssl.X509TrustManager> r3 = javax.net.ssl.X509TrustManager.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L36
            java.lang.reflect.Constructor r2 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L36
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L36
            r3[r4] = r8     // Catch: java.lang.Exception -> L36
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "checkServerTrusted"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L36
            java.lang.Class<java.security.cert.X509Certificate[]> r6 = java.security.cert.X509Certificate[].class
            r5[r4] = r6     // Catch: java.lang.Exception -> L36
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5[r1] = r4     // Catch: java.lang.Exception -> L36
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r4 = 2
            r5[r4] = r1     // Catch: java.lang.Exception -> L36
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch: java.lang.Exception -> L36
            okhttp3.internal.platform.AndroidPlatform$AndroidCertificateChainCleaner r1 = new okhttp3.internal.platform.AndroidPlatform$AndroidCertificateChainCleaner     // Catch: java.lang.Exception -> L36
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L36
            return r1
        L36:
            okhttp3.internal.tls.CertificateChainCleaner r8 = super.buildCertificateChainCleaner(r8)
            return r8
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager r7) {
            r6 = this;
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.String r1 = "findTrustAnchorByIssuerAndSignature"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class<java.security.cert.X509Certificate> r4 = java.security.cert.X509Certificate.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L1b
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L1b
            okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r1 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex     // Catch: java.lang.NoSuchMethodException -> L1b
            r1.<init>(r7, r0)     // Catch: java.lang.NoSuchMethodException -> L1b
            return r1
        L1b:
            okhttp3.internal.tls.TrustRootIndex r7 = super.buildTrustRootIndex(r7)
            return r7
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<okhttp3.Protocol> r8) throws java.io.IOException {
            r5 = this;
            java.lang.Class<?> r0 = r5.sslSocketClass
            boolean r0 = r0.isInstance(r6)
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L23
            java.lang.reflect.Method r2 = r5.setUseSessionTickets     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r3[r0] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r2.invoke(r6, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.reflect.Method r2 = r5.setHostname     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r3[r0] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r2.invoke(r6, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
        L23:
            java.lang.reflect.Method r7 = r5.setAlpnProtocols     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            byte[] r8 = concatLengthPrefixed(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r1[r0] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r7.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            return
        L31:
            r6 = move-exception
            goto L34
        L33:
            r6 = move-exception
        L34:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(java.net.Socket r1, java.net.InetSocketAddress r2, int r3) throws java.io.IOException {
            r0 = this;
            r1.connect(r2, r3)     // Catch: java.lang.ClassCastException -> L4 java.lang.AssertionError -> L14
            return
        L4:
            r1 = move-exception
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 != r3) goto L13
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Exception in connect"
            r2.<init>(r3, r1)
            throw r2
        L13:
            throw r1
        L14:
            r1 = move-exception
            boolean r2 = okhttp3.internal.Util.isAndroidGetsocknameError(r1)
            if (r2 == 0) goto L21
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r1)
            throw r2
        L21:
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext getSSLContext() {
            r3 = this;
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.Class<?> r0 = r3.sslSocketClass
            boolean r0 = r0.isInstance(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.reflect.Method r0 = r3.getAlpnSelectedProtocol     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            byte[] r4 = (byte[]) r4     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            if (r4 == 0) goto L1e
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            r1.<init>(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
        L1e:
            return r1
        L1f:
            r4 = move-exception
            goto L22
        L21:
            r4 = move-exception
        L22:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.Object getStackTraceForCloseable(java.lang.String r2) {
            r1 = this;
            okhttp3.internal.platform.AndroidPlatform$CloseGuard r0 = r1.closeGuard
            java.lang.Object r2 = r0.createAndOpen(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "android.security.NetworkSecurityPolicy"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalArgumentException -> L1d java.lang.IllegalAccessException -> L1f java.lang.Throwable -> L28
            java.lang.String r1 = "getInstance"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalArgumentException -> L1d java.lang.IllegalAccessException -> L1f java.lang.Throwable -> L28
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalArgumentException -> L1d java.lang.IllegalAccessException -> L1f java.lang.Throwable -> L28
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalArgumentException -> L1d java.lang.IllegalAccessException -> L1f java.lang.Throwable -> L28
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalArgumentException -> L1d java.lang.IllegalAccessException -> L1f java.lang.Throwable -> L28
            boolean r5 = r4.api24IsCleartextTrafficPermitted(r5, r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalArgumentException -> L1d java.lang.IllegalAccessException -> L1f java.lang.Throwable -> L28
            return r5
        L1b:
            r5 = move-exception
            goto L20
        L1d:
            r5 = move-exception
            goto L20
        L1f:
            r5 = move-exception
        L20:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "unable to determine cleartext support"
            r0.<init>(r1, r5)
            throw r0
        L28:
            boolean r5 = super.isCleartextTrafficPermitted(r5)
            return r5
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(int r6, java.lang.String r7, @javax.annotation.Nullable java.lang.Throwable r8) {
            r5 = this;
            r0 = 5
            if (r6 != r0) goto L4
            goto L5
        L4:
            r0 = 3
        L5:
            r6 = 10
            if (r8 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
        L22:
            int r8 = r7.length()
            r1 = 0
        L27:
            if (r1 >= r8) goto L48
            int r2 = r7.indexOf(r6, r1)
            r3 = -1
            if (r2 == r3) goto L31
            goto L32
        L31:
            r2 = r8
        L32:
            int r3 = r1 + 4000
            int r3 = java.lang.Math.min(r2, r3)
            java.lang.String r4 = "OkHttp"
            java.lang.String r1 = r7.substring(r1, r3)
            android.util.Log.println(r0, r4, r1)
            if (r3 < r2) goto L46
            int r1 = r3 + 1
            goto L27
        L46:
            r1 = r3
            goto L32
        L48:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            okhttp3.internal.platform.AndroidPlatform$CloseGuard r0 = r1.closeGuard
            boolean r3 = r0.warnIfOpen(r3)
            if (r3 != 0) goto Ld
            r3 = 5
            r0 = 0
            r1.log(r3, r2, r0)
        Ld:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    protected javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            java.lang.Class<?> r0 = r4.sslParametersClass
            java.lang.String r1 = "sslParameters"
            java.lang.Object r0 = readFieldOrNull(r5, r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "com.google.android.gms.org.conscrypt.SSLParametersImpl"
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1e
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Object r0 = readFieldOrNull(r5, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L1e
            goto L23
        L1e:
            javax.net.ssl.X509TrustManager r5 = super.trustManager(r5)
            return r5
        L23:
            java.lang.Class<javax.net.ssl.X509TrustManager> r5 = javax.net.ssl.X509TrustManager.class
            java.lang.String r1 = "x509TrustManager"
            java.lang.Object r5 = readFieldOrNull(r0, r5, r1)
            javax.net.ssl.X509TrustManager r5 = (javax.net.ssl.X509TrustManager) r5
            if (r5 == 0) goto L30
            return r5
        L30:
            java.lang.Class<javax.net.ssl.X509TrustManager> r5 = javax.net.ssl.X509TrustManager.class
            java.lang.String r1 = "trustManager"
            java.lang.Object r5 = readFieldOrNull(r0, r5, r1)
            javax.net.ssl.X509TrustManager r5 = (javax.net.ssl.X509TrustManager) r5
            return r5
    }
}
