package okhttp3.internal.platform;

/* loaded from: classes.dex */
public class Platform {
    public static final int INFO = 4;
    private static final okhttp3.internal.platform.Platform PLATFORM = null;
    public static final int WARN = 5;
    private static final java.util.logging.Logger logger = null;

    static {
            okhttp3.internal.platform.Platform r0 = findPlatform()
            okhttp3.internal.platform.Platform.PLATFORM = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.platform.Platform.logger = r0
            return
    }

    public Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.lang.String> alpnProtocolNames(java.util.List<okhttp3.Protocol> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L25
            java.lang.Object r3 = r5.get(r2)
            okhttp3.Protocol r3 = (okhttp3.Protocol) r3
            okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_1_0
            if (r3 != r4) goto L1b
            goto L22
        L1b:
            java.lang.String r3 = r3.toString()
            r0.add(r3)
        L22:
            int r2 = r2 + 1
            goto Le
        L25:
            return r0
    }

    static byte[] concatLengthPrefixed(java.util.List<okhttp3.Protocol> r5) {
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            int r1 = r5.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2c
            java.lang.Object r3 = r5.get(r2)
            okhttp3.Protocol r3 = (okhttp3.Protocol) r3
            okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_1_0
            if (r3 != r4) goto L17
            goto L29
        L17:
            java.lang.String r4 = r3.toString()
            int r4 = r4.length()
            r0.writeByte(r4)
            java.lang.String r3 = r3.toString()
            r0.writeUtf8(r3)
        L29:
            int r2 = r2 + 1
            goto La
        L2c:
            byte[] r5 = r0.readByteArray()
            return r5
    }

    private static okhttp3.internal.platform.Platform findAndroidPlatform() {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Android10Platform.buildIfSupported()
            if (r0 == 0) goto L7
            return r0
        L7:
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.AndroidPlatform.buildIfSupported()
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "No platform found on Android"
            r0.<init>(r1)
            throw r0
    }

    private static okhttp3.internal.platform.Platform findJvmPlatform() {
            boolean r0 = isConscryptPreferred()
            if (r0 == 0) goto Ld
            okhttp3.internal.platform.ConscryptPlatform r0 = okhttp3.internal.platform.ConscryptPlatform.buildIfSupported()
            if (r0 == 0) goto Ld
            return r0
        Ld:
            okhttp3.internal.platform.Jdk9Platform r0 = okhttp3.internal.platform.Jdk9Platform.buildIfSupported()
            if (r0 == 0) goto L14
            return r0
        L14:
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Jdk8WithJettyBootPlatform.buildIfSupported()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            okhttp3.internal.platform.Platform r0 = new okhttp3.internal.platform.Platform
            r0.<init>()
            return r0
    }

    private static okhttp3.internal.platform.Platform findPlatform() {
            boolean r0 = isAndroid()
            if (r0 == 0) goto Lb
            okhttp3.internal.platform.Platform r0 = findAndroidPlatform()
            return r0
        Lb:
            okhttp3.internal.platform.Platform r0 = findJvmPlatform()
            return r0
    }

    public static okhttp3.internal.platform.Platform get() {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.PLATFORM
            return r0
    }

    public static boolean isAndroid() {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public static boolean isConscryptPreferred() {
            java.lang.String r0 = "okhttp.platform"
            r1 = 0
            java.lang.String r0 = okhttp3.internal.Util.getSystemProperty(r0, r1)
            java.lang.String r1 = "conscrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
            return r0
    }

    @javax.annotation.Nullable
    static <T> T readFieldOrNull(java.lang.Object r4, java.lang.Class<T> r5, java.lang.String r6) {
            java.lang.Class r0 = r4.getClass()
        L4:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r0 == r1) goto L2c
            java.lang.reflect.Field r1 = r0.getDeclaredField(r6)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L27
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L27
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L27
            boolean r3 = r5.isInstance(r1)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L27
            if (r3 != 0) goto L1c
            return r2
        L1c:
            java.lang.Object r4 = r5.cast(r1)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L27
            return r4
        L21:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L27:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L2c:
            java.lang.String r0 = "delegate"
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L41
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r4 = readFieldOrNull(r4, r1, r0)
            if (r4 == 0) goto L41
            java.lang.Object r4 = readFieldOrNull(r4, r5, r6)
            return r4
        L41:
            return r2
    }

    public void afterHandshake(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            return
    }

    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.SSLSocketFactory r4) {
            r3 = this;
            javax.net.ssl.X509TrustManager r0 = r3.trustManager(r4)
            if (r0 == 0) goto Lb
            okhttp3.internal.tls.CertificateChainCleaner r4 = r3.buildCertificateChainCleaner(r0)
            return r4
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to extract the trust manager on "
            r1.<init>(r2)
            okhttp3.internal.platform.Platform r2 = get()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", sslSocketFactory is "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
            okhttp3.internal.tls.TrustRootIndex r2 = r1.buildTrustRootIndex(r2)
            r0.<init>(r2)
            return r0
    }

    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            okhttp3.internal.tls.BasicTrustRootIndex r0 = new okhttp3.internal.tls.BasicTrustRootIndex
            java.security.cert.X509Certificate[] r2 = r2.getAcceptedIssuers()
            r0.<init>(r2)
            return r0
    }

    public void configureSslSocketFactory(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            return
    }

    public void configureTlsExtensions(javax.net.ssl.SSLSocket r1, @javax.annotation.Nullable java.lang.String r2, java.util.List<okhttp3.Protocol> r3) throws java.io.IOException {
            r0 = this;
            return
    }

    public void connectSocket(java.net.Socket r1, java.net.InetSocketAddress r2, int r3) throws java.io.IOException {
            r0 = this;
            r1.connect(r2, r3)
            return
    }

    public java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = "OkHttp"
            return r0
    }

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

    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @javax.annotation.Nullable
    public java.lang.Object getStackTraceForCloseable(java.lang.String r3) {
            r2 = this;
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            return r0
        L10:
            r3 = 0
            return r3
    }

    public boolean isCleartextTrafficPermitted(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void log(int r2, java.lang.String r3, @javax.annotation.Nullable java.lang.Throwable r4) {
            r1 = this;
            r0 = 5
            if (r2 != r0) goto L6
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            goto L8
        L6:
            java.util.logging.Level r2 = java.util.logging.Level.INFO
        L8:
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            r0.log(r2, r3, r4)
            return
    }

    public void logCloseableLeak(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
        L15:
            r0 = 5
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.log(r0, r2, r3)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @javax.annotation.Nullable
    protected javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L1b
            java.lang.String r2 = "context"
            java.lang.Object r4 = readFieldOrNull(r4, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1b
            if (r4 != 0) goto L10
            return r0
        L10:
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.String r2 = "trustManager"
            java.lang.Object r4 = readFieldOrNull(r4, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1b
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4     // Catch: java.lang.ClassNotFoundException -> L1b
            return r4
        L1b:
            return r0
    }
}
