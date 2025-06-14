package okhttp3;

/* loaded from: classes.dex */
public class OkHttpClient implements java.lang.Cloneable, okhttp3.Call.Factory, okhttp3.WebSocket.Factory {
    static final java.util.List<okhttp3.ConnectionSpec> DEFAULT_CONNECTION_SPECS = null;
    static final java.util.List<okhttp3.Protocol> DEFAULT_PROTOCOLS = null;
    final okhttp3.Authenticator authenticator;

    @javax.annotation.Nullable
    final okhttp3.Cache cache;
    final int callTimeout;
    final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    final okhttp3.CertificatePinner certificatePinner;
    final int connectTimeout;
    final okhttp3.ConnectionPool connectionPool;
    final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    final okhttp3.CookieJar cookieJar;
    final okhttp3.Dispatcher dispatcher;
    final okhttp3.Dns dns;
    final okhttp3.EventListener.Factory eventListenerFactory;
    final boolean followRedirects;
    final boolean followSslRedirects;
    final javax.net.ssl.HostnameVerifier hostnameVerifier;
    final java.util.List<okhttp3.Interceptor> interceptors;

    @javax.annotation.Nullable
    final okhttp3.internal.cache.InternalCache internalCache;
    final java.util.List<okhttp3.Interceptor> networkInterceptors;
    final int pingInterval;
    final java.util.List<okhttp3.Protocol> protocols;

    @javax.annotation.Nullable
    final java.net.Proxy proxy;
    final okhttp3.Authenticator proxyAuthenticator;
    final java.net.ProxySelector proxySelector;
    final int readTimeout;
    final boolean retryOnConnectionFailure;
    final javax.net.SocketFactory socketFactory;
    final javax.net.ssl.SSLSocketFactory sslSocketFactory;
    final int writeTimeout;


    public static final class Builder {
        okhttp3.Authenticator authenticator;

        @javax.annotation.Nullable
        okhttp3.Cache cache;
        int callTimeout;

        @javax.annotation.Nullable
        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
        okhttp3.CertificatePinner certificatePinner;
        int connectTimeout;
        okhttp3.ConnectionPool connectionPool;
        java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
        okhttp3.CookieJar cookieJar;
        okhttp3.Dispatcher dispatcher;
        okhttp3.Dns dns;
        okhttp3.EventListener.Factory eventListenerFactory;
        boolean followRedirects;
        boolean followSslRedirects;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        final java.util.List<okhttp3.Interceptor> interceptors;

        @javax.annotation.Nullable
        okhttp3.internal.cache.InternalCache internalCache;
        final java.util.List<okhttp3.Interceptor> networkInterceptors;
        int pingInterval;
        java.util.List<okhttp3.Protocol> protocols;

        @javax.annotation.Nullable
        java.net.Proxy proxy;
        okhttp3.Authenticator proxyAuthenticator;
        java.net.ProxySelector proxySelector;
        int readTimeout;
        boolean retryOnConnectionFailure;
        javax.net.SocketFactory socketFactory;

        @javax.annotation.Nullable
        javax.net.ssl.SSLSocketFactory sslSocketFactory;
        int writeTimeout;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.interceptors = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.networkInterceptors = r0
                okhttp3.Dispatcher r0 = new okhttp3.Dispatcher
                r0.<init>()
                r2.dispatcher = r0
                java.util.List<okhttp3.Protocol> r0 = okhttp3.OkHttpClient.DEFAULT_PROTOCOLS
                r2.protocols = r0
                java.util.List<okhttp3.ConnectionSpec> r0 = okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS
                r2.connectionSpecs = r0
                okhttp3.EventListener r0 = okhttp3.EventListener.NONE
                okhttp3.EventListener$Factory r0 = okhttp3.EventListener.factory(r0)
                r2.eventListenerFactory = r0
                java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
                r2.proxySelector = r0
                if (r0 != 0) goto L37
                okhttp3.internal.proxy.NullProxySelector r0 = new okhttp3.internal.proxy.NullProxySelector
                r0.<init>()
                r2.proxySelector = r0
            L37:
                okhttp3.CookieJar r0 = okhttp3.CookieJar.NO_COOKIES
                r2.cookieJar = r0
                javax.net.SocketFactory r0 = javax.net.SocketFactory.getDefault()
                r2.socketFactory = r0
                okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
                r2.hostnameVerifier = r0
                okhttp3.CertificatePinner r0 = okhttp3.CertificatePinner.DEFAULT
                r2.certificatePinner = r0
                okhttp3.Authenticator r0 = okhttp3.Authenticator.NONE
                r2.proxyAuthenticator = r0
                okhttp3.Authenticator r0 = okhttp3.Authenticator.NONE
                r2.authenticator = r0
                okhttp3.ConnectionPool r0 = new okhttp3.ConnectionPool
                r0.<init>()
                r2.connectionPool = r0
                okhttp3.Dns r0 = okhttp3.Dns.SYSTEM
                r2.dns = r0
                r0 = 1
                r2.followSslRedirects = r0
                r2.followRedirects = r0
                r2.retryOnConnectionFailure = r0
                r0 = 0
                r2.callTimeout = r0
                r1 = 10000(0x2710, float:1.4013E-41)
                r2.connectTimeout = r1
                r2.readTimeout = r1
                r2.writeTimeout = r1
                r2.pingInterval = r0
                return
        }

        Builder(okhttp3.OkHttpClient r4) {
                r3 = this;
                r3.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.interceptors = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.networkInterceptors = r1
                okhttp3.Dispatcher r2 = r4.dispatcher
                r3.dispatcher = r2
                java.net.Proxy r2 = r4.proxy
                r3.proxy = r2
                java.util.List<okhttp3.Protocol> r2 = r4.protocols
                r3.protocols = r2
                java.util.List<okhttp3.ConnectionSpec> r2 = r4.connectionSpecs
                r3.connectionSpecs = r2
                java.util.List<okhttp3.Interceptor> r2 = r4.interceptors
                r0.addAll(r2)
                java.util.List<okhttp3.Interceptor> r0 = r4.networkInterceptors
                r1.addAll(r0)
                okhttp3.EventListener$Factory r0 = r4.eventListenerFactory
                r3.eventListenerFactory = r0
                java.net.ProxySelector r0 = r4.proxySelector
                r3.proxySelector = r0
                okhttp3.CookieJar r0 = r4.cookieJar
                r3.cookieJar = r0
                okhttp3.internal.cache.InternalCache r0 = r4.internalCache
                r3.internalCache = r0
                okhttp3.Cache r0 = r4.cache
                r3.cache = r0
                javax.net.SocketFactory r0 = r4.socketFactory
                r3.socketFactory = r0
                javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactory
                r3.sslSocketFactory = r0
                okhttp3.internal.tls.CertificateChainCleaner r0 = r4.certificateChainCleaner
                r3.certificateChainCleaner = r0
                javax.net.ssl.HostnameVerifier r0 = r4.hostnameVerifier
                r3.hostnameVerifier = r0
                okhttp3.CertificatePinner r0 = r4.certificatePinner
                r3.certificatePinner = r0
                okhttp3.Authenticator r0 = r4.proxyAuthenticator
                r3.proxyAuthenticator = r0
                okhttp3.Authenticator r0 = r4.authenticator
                r3.authenticator = r0
                okhttp3.ConnectionPool r0 = r4.connectionPool
                r3.connectionPool = r0
                okhttp3.Dns r0 = r4.dns
                r3.dns = r0
                boolean r0 = r4.followSslRedirects
                r3.followSslRedirects = r0
                boolean r0 = r4.followRedirects
                r3.followRedirects = r0
                boolean r0 = r4.retryOnConnectionFailure
                r3.retryOnConnectionFailure = r0
                int r0 = r4.callTimeout
                r3.callTimeout = r0
                int r0 = r4.connectTimeout
                r3.connectTimeout = r0
                int r0 = r4.readTimeout
                r3.readTimeout = r0
                int r0 = r4.writeTimeout
                r3.writeTimeout = r0
                int r4 = r4.pingInterval
                r3.pingInterval = r4
                return
        }

        public okhttp3.OkHttpClient.Builder addInterceptor(okhttp3.Interceptor r2) {
                r1 = this;
                if (r2 == 0) goto L8
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                r0.add(r2)
                return r1
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "interceptor == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder addNetworkInterceptor(okhttp3.Interceptor r2) {
                r1 = this;
                if (r2 == 0) goto L8
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                r0.add(r2)
                return r1
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "interceptor == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder authenticator(okhttp3.Authenticator r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.authenticator = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "authenticator == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient build() {
                r1 = this;
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
                r0.<init>(r1)
                return r0
        }

        public okhttp3.OkHttpClient.Builder cache(@javax.annotation.Nullable okhttp3.Cache r1) {
                r0 = this;
                r0.cache = r1
                r1 = 0
                r0.internalCache = r1
                return r0
        }

        public okhttp3.OkHttpClient.Builder callTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.callTimeout = r2
                return r1
        }

        public okhttp3.OkHttpClient.Builder callTimeout(java.time.Duration r4) {
                r3 = this;
                long r0 = r4.toMillis()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r2 = "timeout"
                int r4 = okhttp3.internal.Util.checkDuration(r2, r0, r4)
                r3.callTimeout = r4
                return r3
        }

        public okhttp3.OkHttpClient.Builder certificatePinner(okhttp3.CertificatePinner r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.certificatePinner = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "certificatePinner == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder connectTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.connectTimeout = r2
                return r1
        }

        public okhttp3.OkHttpClient.Builder connectTimeout(java.time.Duration r4) {
                r3 = this;
                long r0 = r4.toMillis()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r2 = "timeout"
                int r4 = okhttp3.internal.Util.checkDuration(r2, r0, r4)
                r3.connectTimeout = r4
                return r3
        }

        public okhttp3.OkHttpClient.Builder connectionPool(okhttp3.ConnectionPool r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.connectionPool = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "connectionPool == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder connectionSpecs(java.util.List<okhttp3.ConnectionSpec> r1) {
                r0 = this;
                java.util.List r1 = okhttp3.internal.Util.immutableList(r1)
                r0.connectionSpecs = r1
                return r0
        }

        public okhttp3.OkHttpClient.Builder cookieJar(okhttp3.CookieJar r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.cookieJar = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "cookieJar == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder dispatcher(okhttp3.Dispatcher r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.dispatcher = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "dispatcher == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder dns(okhttp3.Dns r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.dns = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "dns == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder eventListener(okhttp3.EventListener r2) {
                r1 = this;
                if (r2 == 0) goto L9
                okhttp3.EventListener$Factory r2 = okhttp3.EventListener.factory(r2)
                r1.eventListenerFactory = r2
                return r1
            L9:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "eventListener == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder eventListenerFactory(okhttp3.EventListener.Factory r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.eventListenerFactory = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "eventListenerFactory == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder followRedirects(boolean r1) {
                r0 = this;
                r0.followRedirects = r1
                return r0
        }

        public okhttp3.OkHttpClient.Builder followSslRedirects(boolean r1) {
                r0 = this;
                r0.followSslRedirects = r1
                return r0
        }

        public okhttp3.OkHttpClient.Builder hostnameVerifier(javax.net.ssl.HostnameVerifier r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.hostnameVerifier = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "hostnameVerifier == null"
                r2.<init>(r0)
                throw r2
        }

        public java.util.List<okhttp3.Interceptor> interceptors() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                return r0
        }

        public java.util.List<okhttp3.Interceptor> networkInterceptors() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                return r0
        }

        public okhttp3.OkHttpClient.Builder pingInterval(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "interval"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.pingInterval = r2
                return r1
        }

        public okhttp3.OkHttpClient.Builder pingInterval(java.time.Duration r4) {
                r3 = this;
                long r0 = r4.toMillis()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r2 = "timeout"
                int r4 = okhttp3.internal.Util.checkDuration(r2, r0, r4)
                r3.pingInterval = r4
                return r3
        }

        public okhttp3.OkHttpClient.Builder protocols(java.util.List<okhttp3.Protocol> r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
                okhttp3.Protocol r4 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                boolean r4 = r0.contains(r4)
                if (r4 != 0) goto L2b
                okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_1_1
                boolean r4 = r0.contains(r4)
                if (r4 == 0) goto L16
                goto L2b
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "protocols must contain h2_prior_knowledge or http/1.1: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L2b:
                okhttp3.Protocol r4 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                boolean r4 = r0.contains(r4)
                if (r4 == 0) goto L50
                int r4 = r0.size()
                r1 = 1
                if (r4 > r1) goto L3b
                goto L50
            L3b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "protocols containing h2_prior_knowledge cannot use other protocols: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L50:
                okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_1_0
                boolean r4 = r0.contains(r4)
                if (r4 != 0) goto L73
                r4 = 0
                boolean r4 = r0.contains(r4)
                if (r4 != 0) goto L6b
                okhttp3.Protocol r4 = okhttp3.Protocol.SPDY_3
                r0.remove(r4)
                java.util.List r4 = java.util.Collections.unmodifiableList(r0)
                r3.protocols = r4
                return r3
            L6b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "protocols must not contain null"
                r4.<init>(r0)
                throw r4
            L73:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "protocols must not contain http/1.0: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        public okhttp3.OkHttpClient.Builder proxy(@javax.annotation.Nullable java.net.Proxy r1) {
                r0 = this;
                r0.proxy = r1
                return r0
        }

        public okhttp3.OkHttpClient.Builder proxyAuthenticator(okhttp3.Authenticator r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.proxyAuthenticator = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "proxyAuthenticator == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder proxySelector(java.net.ProxySelector r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.proxySelector = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "proxySelector == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder readTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.readTimeout = r2
                return r1
        }

        public okhttp3.OkHttpClient.Builder readTimeout(java.time.Duration r4) {
                r3 = this;
                long r0 = r4.toMillis()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r2 = "timeout"
                int r4 = okhttp3.internal.Util.checkDuration(r2, r0, r4)
                r3.readTimeout = r4
                return r3
        }

        public okhttp3.OkHttpClient.Builder retryOnConnectionFailure(boolean r1) {
                r0 = this;
                r0.retryOnConnectionFailure = r1
                return r0
        }

        public okhttp3.OkHttpClient.Builder socketFactory(javax.net.SocketFactory r2) {
                r1 = this;
                if (r2 == 0) goto L11
                boolean r0 = r2 instanceof javax.net.ssl.SSLSocketFactory
                if (r0 != 0) goto L9
                r1.socketFactory = r2
                return r1
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "socketFactory instanceof SSLSocketFactory"
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "socketFactory == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                r1.sslSocketFactory = r2
                okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
                okhttp3.internal.tls.CertificateChainCleaner r2 = r0.buildCertificateChainCleaner(r2)
                r1.certificateChainCleaner = r2
                return r1
            Lf:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "sslSocketFactory == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory r1, javax.net.ssl.X509TrustManager r2) {
                r0 = this;
                if (r1 == 0) goto L15
                if (r2 == 0) goto Ld
                r0.sslSocketFactory = r1
                okhttp3.internal.tls.CertificateChainCleaner r1 = okhttp3.internal.tls.CertificateChainCleaner.get(r2)
                r0.certificateChainCleaner = r1
                return r0
            Ld:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "trustManager == null"
                r1.<init>(r2)
                throw r1
            L15:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "sslSocketFactory == null"
                r1.<init>(r2)
                throw r1
        }

        public okhttp3.OkHttpClient.Builder writeTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.writeTimeout = r2
                return r1
        }

        public okhttp3.OkHttpClient.Builder writeTimeout(java.time.Duration r4) {
                r3 = this;
                long r0 = r4.toMillis()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r2 = "timeout"
                int r4 = okhttp3.internal.Util.checkDuration(r2, r0, r4)
                r3.writeTimeout = r4
                return r3
        }
    }

    static {
            r0 = 2
            okhttp3.Protocol[] r1 = new okhttp3.Protocol[r0]
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_2
            r3 = 0
            r1[r3] = r2
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            r4 = 1
            r1[r4] = r2
            java.util.List r1 = okhttp3.internal.Util.immutableList(r1)
            okhttp3.OkHttpClient.DEFAULT_PROTOCOLS = r1
            okhttp3.ConnectionSpec[] r0 = new okhttp3.ConnectionSpec[r0]
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.MODERN_TLS
            r0[r3] = r1
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            r0[r4] = r1
            java.util.List r0 = okhttp3.internal.Util.immutableList(r0)
            okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS = r0
            okhttp3.OkHttpClient$1 r0 = new okhttp3.OkHttpClient$1
            r0.<init>()
            okhttp3.internal.Internal.instance = r0
            return
    }

    public OkHttpClient() {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    OkHttpClient(okhttp3.OkHttpClient.Builder r5) {
            r4 = this;
            r4.<init>()
            okhttp3.Dispatcher r0 = r5.dispatcher
            r4.dispatcher = r0
            java.net.Proxy r0 = r5.proxy
            r4.proxy = r0
            java.util.List<okhttp3.Protocol> r0 = r5.protocols
            r4.protocols = r0
            java.util.List<okhttp3.ConnectionSpec> r0 = r5.connectionSpecs
            r4.connectionSpecs = r0
            java.util.List<okhttp3.Interceptor> r1 = r5.interceptors
            java.util.List r1 = okhttp3.internal.Util.immutableList(r1)
            r4.interceptors = r1
            java.util.List<okhttp3.Interceptor> r1 = r5.networkInterceptors
            java.util.List r1 = okhttp3.internal.Util.immutableList(r1)
            r4.networkInterceptors = r1
            okhttp3.EventListener$Factory r1 = r5.eventListenerFactory
            r4.eventListenerFactory = r1
            java.net.ProxySelector r1 = r5.proxySelector
            r4.proxySelector = r1
            okhttp3.CookieJar r1 = r5.cookieJar
            r4.cookieJar = r1
            okhttp3.Cache r1 = r5.cache
            r4.cache = r1
            okhttp3.internal.cache.InternalCache r1 = r5.internalCache
            r4.internalCache = r1
            javax.net.SocketFactory r1 = r5.socketFactory
            r4.socketFactory = r1
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L40:
            r2 = r1
        L41:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r0.next()
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            if (r2 != 0) goto L55
            boolean r2 = r3.isTls()
            if (r2 == 0) goto L40
        L55:
            r2 = 1
            goto L41
        L57:
            javax.net.ssl.SSLSocketFactory r0 = r5.sslSocketFactory
            if (r0 != 0) goto L6f
            if (r2 != 0) goto L5e
            goto L6f
        L5e:
            javax.net.ssl.X509TrustManager r0 = okhttp3.internal.Util.platformTrustManager()
            javax.net.ssl.SSLSocketFactory r1 = newSslSocketFactory(r0)
            r4.sslSocketFactory = r1
            okhttp3.internal.tls.CertificateChainCleaner r0 = okhttp3.internal.tls.CertificateChainCleaner.get(r0)
            r4.certificateChainCleaner = r0
            goto L77
        L6f:
            javax.net.ssl.SSLSocketFactory r0 = r5.sslSocketFactory
            r4.sslSocketFactory = r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r5.certificateChainCleaner
            r4.certificateChainCleaner = r0
        L77:
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactory
            if (r0 == 0) goto L84
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            javax.net.ssl.SSLSocketFactory r1 = r4.sslSocketFactory
            r0.configureSslSocketFactory(r1)
        L84:
            javax.net.ssl.HostnameVerifier r0 = r5.hostnameVerifier
            r4.hostnameVerifier = r0
            okhttp3.CertificatePinner r0 = r5.certificatePinner
            okhttp3.internal.tls.CertificateChainCleaner r1 = r4.certificateChainCleaner
            okhttp3.CertificatePinner r0 = r0.withCertificateChainCleaner(r1)
            r4.certificatePinner = r0
            okhttp3.Authenticator r0 = r5.proxyAuthenticator
            r4.proxyAuthenticator = r0
            okhttp3.Authenticator r0 = r5.authenticator
            r4.authenticator = r0
            okhttp3.ConnectionPool r0 = r5.connectionPool
            r4.connectionPool = r0
            okhttp3.Dns r0 = r5.dns
            r4.dns = r0
            boolean r0 = r5.followSslRedirects
            r4.followSslRedirects = r0
            boolean r0 = r5.followRedirects
            r4.followRedirects = r0
            boolean r0 = r5.retryOnConnectionFailure
            r4.retryOnConnectionFailure = r0
            int r0 = r5.callTimeout
            r4.callTimeout = r0
            int r0 = r5.connectTimeout
            r4.connectTimeout = r0
            int r0 = r5.readTimeout
            r4.readTimeout = r0
            int r0 = r5.writeTimeout
            r4.writeTimeout = r0
            int r5 = r5.pingInterval
            r4.pingInterval = r5
            java.util.List<okhttp3.Interceptor> r5 = r4.interceptors
            r0 = 0
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto Leb
            java.util.List<okhttp3.Interceptor> r5 = r4.networkInterceptors
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto Ld4
            return
        Ld4:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Null network interceptor: "
            r0.<init>(r1)
            java.util.List<okhttp3.Interceptor> r1 = r4.networkInterceptors
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Leb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Null interceptor: "
            r0.<init>(r1)
            java.util.List<okhttp3.Interceptor> r1 = r4.interceptors
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private static javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager r3) {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()     // Catch: java.security.GeneralSecurityException -> L17
            javax.net.ssl.SSLContext r0 = r0.getSSLContext()     // Catch: java.security.GeneralSecurityException -> L17
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.GeneralSecurityException -> L17
            r2 = 0
            r1[r2] = r3     // Catch: java.security.GeneralSecurityException -> L17
            r3 = 0
            r0.init(r3, r1, r3)     // Catch: java.security.GeneralSecurityException -> L17
            javax.net.ssl.SSLSocketFactory r3 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L17
            return r3
        L17:
            r3 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No System TLS"
            r0.<init>(r1, r3)
            throw r0
    }

    public okhttp3.Authenticator authenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.authenticator
            return r0
    }

    @javax.annotation.Nullable
    public okhttp3.Cache cache() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    public int callTimeoutMillis() {
            r1 = this;
            int r0 = r1.callTimeout
            return r0
    }

    public okhttp3.CertificatePinner certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    public int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeout
            return r0
    }

    public okhttp3.ConnectionPool connectionPool() {
            r1 = this;
            okhttp3.ConnectionPool r0 = r1.connectionPool
            return r0
    }

    public java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    public okhttp3.CookieJar cookieJar() {
            r1 = this;
            okhttp3.CookieJar r0 = r1.cookieJar
            return r0
    }

    public okhttp3.Dispatcher dispatcher() {
            r1 = this;
            okhttp3.Dispatcher r0 = r1.dispatcher
            return r0
    }

    public okhttp3.Dns dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    public okhttp3.EventListener.Factory eventListenerFactory() {
            r1 = this;
            okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
            return r0
    }

    public boolean followRedirects() {
            r1 = this;
            boolean r0 = r1.followRedirects
            return r0
    }

    public boolean followSslRedirects() {
            r1 = this;
            boolean r0 = r1.followSslRedirects
            return r0
    }

    public javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    public java.util.List<okhttp3.Interceptor> interceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
            return r0
    }

    @javax.annotation.Nullable
    okhttp3.internal.cache.InternalCache internalCache() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            if (r0 == 0) goto L7
            okhttp3.internal.cache.InternalCache r0 = r0.internalCache
            goto L9
        L7:
            okhttp3.internal.cache.InternalCache r0 = r1.internalCache
        L9:
            return r0
    }

    public java.util.List<okhttp3.Interceptor> networkInterceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
            return r0
    }

    public okhttp3.OkHttpClient.Builder newBuilder() {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>(r1)
            return r0
    }

    @Override // okhttp3.Call.Factory
    public okhttp3.Call newCall(okhttp3.Request r2) {
            r1 = this;
            r0 = 0
            okhttp3.RealCall r2 = okhttp3.RealCall.newRealCall(r1, r2, r0)
            return r2
    }

    @Override // okhttp3.WebSocket.Factory
    public okhttp3.WebSocket newWebSocket(okhttp3.Request r8, okhttp3.WebSocketListener r9) {
            r7 = this;
            okhttp3.internal.ws.RealWebSocket r6 = new okhttp3.internal.ws.RealWebSocket
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            int r0 = r7.pingInterval
            long r4 = (long) r0
            r0 = r6
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4)
            r6.connect(r7)
            return r6
    }

    public int pingIntervalMillis() {
            r1 = this;
            int r0 = r1.pingInterval
            return r0
    }

    public java.util.List<okhttp3.Protocol> protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @javax.annotation.Nullable
    public java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public okhttp3.Authenticator proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    public java.net.ProxySelector proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    public int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeout
            return r0
    }

    public boolean retryOnConnectionFailure() {
            r1 = this;
            boolean r0 = r1.retryOnConnectionFailure
            return r0
    }

    public javax.net.SocketFactory socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    public javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory
            return r0
    }

    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeout
            return r0
    }
}
