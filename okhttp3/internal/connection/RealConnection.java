package okhttp3.internal.connection;

/* loaded from: classes.dex */
public final class RealConnection extends okhttp3.internal.http2.Http2Connection.Listener implements okhttp3.Connection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final java.lang.String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    public final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private okhttp3.Handshake handshake;
    private okhttp3.internal.http2.Http2Connection http2Connection;
    long idleAtNanos;
    boolean noNewExchanges;
    private okhttp3.Protocol protocol;
    private java.net.Socket rawSocket;
    private int refusedStreamCount;
    private final okhttp3.Route route;
    int routeFailureCount;
    private okio.BufferedSink sink;
    private java.net.Socket socket;
    private okio.BufferedSource source;
    int successCount;
    final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> transmitters;


    static {
            return
    }

    public RealConnection(okhttp3.internal.connection.RealConnectionPool r3, okhttp3.Route r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allocationLimit = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.transmitters = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.idleAtNanos = r0
            r2.connectionPool = r3
            r2.route = r4
            return
    }

    private void connectSocket(int r5, int r6, okhttp3.Call r7, okhttp3.EventListener r8) throws java.io.IOException {
            r4 = this;
            okhttp3.Route r0 = r4.route
            java.net.Proxy r0 = r0.proxy()
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            java.net.Proxy$Type r2 = r0.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.DIRECT
            if (r2 == r3) goto L23
            java.net.Proxy$Type r2 = r0.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r2 != r3) goto L1d
            goto L23
        L1d:
            java.net.Socket r1 = new java.net.Socket
            r1.<init>(r0)
            goto L2b
        L23:
            javax.net.SocketFactory r1 = r1.socketFactory()
            java.net.Socket r1 = r1.createSocket()
        L2b:
            r4.rawSocket = r1
            okhttp3.Route r1 = r4.route
            java.net.InetSocketAddress r1 = r1.socketAddress()
            r8.connectStart(r7, r1, r0)
            java.net.Socket r7 = r4.rawSocket
            r7.setSoTimeout(r6)
            okhttp3.internal.platform.Platform r6 = okhttp3.internal.platform.Platform.get()     // Catch: java.net.ConnectException -> L77
            java.net.Socket r7 = r4.rawSocket     // Catch: java.net.ConnectException -> L77
            okhttp3.Route r8 = r4.route     // Catch: java.net.ConnectException -> L77
            java.net.InetSocketAddress r8 = r8.socketAddress()     // Catch: java.net.ConnectException -> L77
            r6.connectSocket(r7, r8, r5)     // Catch: java.net.ConnectException -> L77
            java.net.Socket r5 = r4.rawSocket     // Catch: java.lang.NullPointerException -> L63
            okio.Source r5 = okio.Okio.source(r5)     // Catch: java.lang.NullPointerException -> L63
            okio.BufferedSource r5 = okio.Okio.buffer(r5)     // Catch: java.lang.NullPointerException -> L63
            r4.source = r5     // Catch: java.lang.NullPointerException -> L63
            java.net.Socket r5 = r4.rawSocket     // Catch: java.lang.NullPointerException -> L63
            okio.Sink r5 = okio.Okio.sink(r5)     // Catch: java.lang.NullPointerException -> L63
            okio.BufferedSink r5 = okio.Okio.buffer(r5)     // Catch: java.lang.NullPointerException -> L63
            r4.sink = r5     // Catch: java.lang.NullPointerException -> L63
            goto L70
        L63:
            r5 = move-exception
            java.lang.String r6 = "throw with null exception"
            java.lang.String r7 = r5.getMessage()
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L71
        L70:
            return
        L71:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L77:
            r5 = move-exception
            java.net.ConnectException r6 = new java.net.ConnectException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to connect to "
            r7.<init>(r8)
            okhttp3.Route r8 = r4.route
            java.net.InetSocketAddress r8 = r8.socketAddress()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            r6.initCause(r5)
            throw r6
    }

    private void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r8) throws java.io.IOException {
            r7 = this;
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory()
            r2 = 0
            java.net.Socket r3 = r7.rawSocket     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            okhttp3.HttpUrl r4 = r0.url()     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            java.lang.String r4 = r4.host()     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            okhttp3.HttpUrl r5 = r0.url()     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            int r5 = r5.port()     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch: java.lang.Throwable -> L131 java.lang.AssertionError -> L133
            okhttp3.ConnectionSpec r8 = r8.configureSecureSocket(r1)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            boolean r3 = r8.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            if (r3 == 0) goto L41
            okhttp3.internal.platform.Platform r3 = okhttp3.internal.platform.Platform.get()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okhttp3.HttpUrl r4 = r0.url()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r4 = r4.host()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.util.List r5 = r0.protocols()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r3.configureTlsExtensions(r1, r4, r5)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
        L41:
            r1.startHandshake()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okhttp3.Handshake r4 = okhttp3.Handshake.get(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okhttp3.HttpUrl r6 = r0.url()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r6 = r6.host()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            boolean r3 = r5.verify(r6, r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            if (r3 != 0) goto Ldb
            java.util.List r8 = r4.peerCertificates()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            boolean r2 = r8.isEmpty()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto Lba
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r3 = " not verified:\n    certificate: "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r3 = okhttp3.CertificatePinner.pin(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r3 = "\n    DN: "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.security.Principal r3 = r8.getSubjectDN()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r3 = "\n    subjectAltNames: "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.util.List r8 = okhttp3.internal.tls.OkHostnameVerifier.allSubjectAltNames(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r8 = r0.append(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            throw r2     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
        Lba:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r2 = " not verified (no certificates)"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            throw r8     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
        Ldb:
            okhttp3.CertificatePinner r3 = r0.certificatePinner()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.util.List r5 = r4.peerCertificates()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r3.check(r0, r5)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            boolean r8 = r8.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            if (r8 == 0) goto Lfc
            okhttp3.internal.platform.Platform r8 = okhttp3.internal.platform.Platform.get()     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.lang.String r2 = r8.getSelectedProtocol(r1)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
        Lfc:
            r7.socket = r1     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okio.Source r8 = okio.Okio.source(r1)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okio.BufferedSource r8 = okio.Okio.buffer(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r7.source = r8     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            java.net.Socket r8 = r7.socket     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okio.Sink r8 = okio.Okio.sink(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            okio.BufferedSink r8 = okio.Okio.buffer(r8)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r7.sink = r8     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            r7.handshake = r4     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            if (r2 == 0) goto L11d
            okhttp3.Protocol r8 = okhttp3.Protocol.get(r2)     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            goto L11f
        L11d:
            okhttp3.Protocol r8 = okhttp3.Protocol.HTTP_1_1     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
        L11f:
            r7.protocol = r8     // Catch: java.lang.Throwable -> L12b java.lang.AssertionError -> L12e
            if (r1 == 0) goto L12a
            okhttp3.internal.platform.Platform r8 = okhttp3.internal.platform.Platform.get()
            r8.afterHandshake(r1)
        L12a:
            return
        L12b:
            r8 = move-exception
            r2 = r1
            goto L141
        L12e:
            r8 = move-exception
            r2 = r1
            goto L134
        L131:
            r8 = move-exception
            goto L141
        L133:
            r8 = move-exception
        L134:
            boolean r0 = okhttp3.internal.Util.isAndroidGetsocknameError(r8)     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L140
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L131
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L131
            throw r0     // Catch: java.lang.Throwable -> L131
        L140:
            throw r8     // Catch: java.lang.Throwable -> L131
        L141:
            if (r2 == 0) goto L14a
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            r0.afterHandshake(r2)
        L14a:
            okhttp3.internal.Util.closeQuietly(r2)
            throw r8
    }

    private void connectTunnel(int r7, int r8, int r9, okhttp3.Call r10, okhttp3.EventListener r11) throws java.io.IOException {
            r6 = this;
            okhttp3.Request r0 = r6.createTunnelRequest()
            okhttp3.HttpUrl r1 = r0.url()
            r2 = 0
        L9:
            r3 = 21
            if (r2 >= r3) goto L35
            r6.connectSocket(r7, r8, r10, r11)
            okhttp3.Request r0 = r6.createTunnel(r8, r9, r0, r1)
            if (r0 != 0) goto L17
            goto L35
        L17:
            java.net.Socket r3 = r6.rawSocket
            okhttp3.internal.Util.closeQuietly(r3)
            r3 = 0
            r6.rawSocket = r3
            r6.sink = r3
            r6.source = r3
            okhttp3.Route r4 = r6.route
            java.net.InetSocketAddress r4 = r4.socketAddress()
            okhttp3.Route r5 = r6.route
            java.net.Proxy r5 = r5.proxy()
            r11.connectEnd(r10, r4, r5, r3)
            int r2 = r2 + 1
            goto L9
        L35:
            return
    }

    private okhttp3.Request createTunnel(int r7, int r8, okhttp3.Request r9, okhttp3.HttpUrl r10) throws java.io.IOException {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CONNECT "
            r0.<init>(r1)
            r1 = 1
            java.lang.String r10 = okhttp3.internal.Util.hostHeader(r10, r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r0 = " HTTP/1.1"
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
        L1a:
            okhttp3.internal.http1.Http1ExchangeCodec r0 = new okhttp3.internal.http1.Http1ExchangeCodec
            okio.BufferedSource r1 = r6.source
            okio.BufferedSink r2 = r6.sink
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            okio.BufferedSource r1 = r6.source
            okio.Timeout r1 = r1.timeout()
            long r4 = (long) r7
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.timeout(r4, r2)
            okio.BufferedSink r1 = r6.sink
            okio.Timeout r1 = r1.timeout()
            long r4 = (long) r8
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.timeout(r4, r2)
            okhttp3.Headers r1 = r9.headers()
            r0.writeRequest(r1, r10)
            r0.finishRequest()
            r1 = 0
            okhttp3.Response$Builder r1 = r0.readResponseHeaders(r1)
            okhttp3.Response$Builder r9 = r1.request(r9)
            okhttp3.Response r9 = r9.build()
            r0.skipConnectBody(r9)
            int r0 = r9.code()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto La6
            r1 = 407(0x197, float:5.7E-43)
            if (r0 != r1) goto L8d
            okhttp3.Route r0 = r6.route
            okhttp3.Address r0 = r0.address()
            okhttp3.Authenticator r0 = r0.proxyAuthenticator()
            okhttp3.Route r1 = r6.route
            okhttp3.Request r0 = r0.authenticate(r1, r9)
            if (r0 == 0) goto L85
            java.lang.String r1 = "Connection"
            java.lang.String r9 = r9.header(r1)
            java.lang.String r1 = "close"
            boolean r9 = r1.equalsIgnoreCase(r9)
            if (r9 == 0) goto L83
            return r0
        L83:
            r9 = r0
            goto L1a
        L85:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Failed to authenticate with proxy"
            r7.<init>(r8)
            throw r7
        L8d:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Unexpected response code for CONNECT: "
            r8.<init>(r10)
            int r9 = r9.code()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        La6:
            okio.BufferedSource r7 = r6.source
            okio.Buffer r7 = r7.getBuffer()
            boolean r7 = r7.exhausted()
            if (r7 == 0) goto Lbf
            okio.BufferedSink r7 = r6.sink
            okio.Buffer r7 = r7.buffer()
            boolean r7 = r7.exhausted()
            if (r7 == 0) goto Lbf
            return r3
        Lbf:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "TLS tunnel buffered too many bytes!"
            r7.<init>(r8)
            throw r7
    }

    private okhttp3.Request createTunnelRequest() throws java.io.IOException {
            r4 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            okhttp3.Request$Builder r0 = r0.url(r1)
            java.lang.String r1 = "CONNECT"
            r2 = 0
            okhttp3.Request$Builder r0 = r0.method(r1, r2)
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            r2 = 1
            java.lang.String r1 = okhttp3.internal.Util.hostHeader(r1, r2)
            java.lang.String r2 = "Host"
            okhttp3.Request$Builder r0 = r0.header(r2, r1)
            java.lang.String r1 = "Proxy-Connection"
            java.lang.String r2 = "Keep-Alive"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = okhttp3.internal.Version.userAgent()
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder
            r1.<init>()
            okhttp3.Response$Builder r1 = r1.request(r0)
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r1 = r1.protocol(r2)
            r2 = 407(0x197, float:5.7E-43)
            okhttp3.Response$Builder r1 = r1.code(r2)
            java.lang.String r2 = "Preemptive Authenticate"
            okhttp3.Response$Builder r1 = r1.message(r2)
            okhttp3.ResponseBody r2 = okhttp3.internal.Util.EMPTY_RESPONSE
            okhttp3.Response$Builder r1 = r1.body(r2)
            r2 = -1
            okhttp3.Response$Builder r1 = r1.sentRequestAtMillis(r2)
            okhttp3.Response$Builder r1 = r1.receivedResponseAtMillis(r2)
            java.lang.String r2 = "Proxy-Authenticate"
            java.lang.String r3 = "OkHttp-Preemptive"
            okhttp3.Response$Builder r1 = r1.header(r2, r3)
            okhttp3.Response r1 = r1.build()
            okhttp3.Route r2 = r4.route
            okhttp3.Address r2 = r2.address()
            okhttp3.Authenticator r2 = r2.proxyAuthenticator()
            okhttp3.Route r3 = r4.route
            okhttp3.Request r1 = r2.authenticate(r3, r1)
            if (r1 == 0) goto L8f
            r0 = r1
        L8f:
            return r0
    }

    private void establishProtocol(okhttp3.internal.connection.ConnectionSpecSelector r2, int r3, okhttp3.Call r4, okhttp3.EventListener r5) throws java.io.IOException {
            r1 = this;
            okhttp3.Route r0 = r1.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 != 0) goto L33
            okhttp3.Route r2 = r1.route
            okhttp3.Address r2 = r2.address()
            java.util.List r2 = r2.protocols()
            okhttp3.Protocol r4 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L2a
            java.net.Socket r2 = r1.rawSocket
            r1.socket = r2
            okhttp3.Protocol r2 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            r1.protocol = r2
            r1.startHttp2(r3)
            return
        L2a:
            java.net.Socket r2 = r1.rawSocket
            r1.socket = r2
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            r1.protocol = r2
            return
        L33:
            r5.secureConnectStart(r4)
            r1.connectTls(r2)
            okhttp3.Handshake r2 = r1.handshake
            r5.secureConnectEnd(r4, r2)
            okhttp3.Protocol r2 = r1.protocol
            okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_2
            if (r2 != r4) goto L47
            r1.startHttp2(r3)
        L47:
            return
    }

    private boolean routeMatchesAny(java.util.List<okhttp3.Route> r7) {
            r6 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L3d
            java.lang.Object r3 = r7.get(r2)
            okhttp3.Route r3 = (okhttp3.Route) r3
            java.net.Proxy r4 = r3.proxy()
            java.net.Proxy$Type r4 = r4.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.DIRECT
            if (r4 != r5) goto L3a
            okhttp3.Route r4 = r6.route
            java.net.Proxy r4 = r4.proxy()
            java.net.Proxy$Type r4 = r4.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.DIRECT
            if (r4 != r5) goto L3a
            okhttp3.Route r4 = r6.route
            java.net.InetSocketAddress r4 = r4.socketAddress()
            java.net.InetSocketAddress r3 = r3.socketAddress()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3a
            r7 = 1
            return r7
        L3a:
            int r2 = r2 + 1
            goto L6
        L3d:
            return r1
    }

    private void startHttp2(int r6) throws java.io.IOException {
            r5 = this;
            java.net.Socket r0 = r5.socket
            r1 = 0
            r0.setSoTimeout(r1)
            okhttp3.internal.http2.Http2Connection$Builder r0 = new okhttp3.internal.http2.Http2Connection$Builder
            r1 = 1
            r0.<init>(r1)
            java.net.Socket r1 = r5.socket
            okhttp3.Route r2 = r5.route
            okhttp3.Address r2 = r2.address()
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = r2.host()
            okio.BufferedSource r3 = r5.source
            okio.BufferedSink r4 = r5.sink
            okhttp3.internal.http2.Http2Connection$Builder r0 = r0.socket(r1, r2, r3, r4)
            okhttp3.internal.http2.Http2Connection$Builder r0 = r0.listener(r5)
            okhttp3.internal.http2.Http2Connection$Builder r6 = r0.pingIntervalMillis(r6)
            okhttp3.internal.http2.Http2Connection r6 = r6.build()
            r5.http2Connection = r6
            r6.start()
            return
    }

    static okhttp3.internal.connection.RealConnection testConnection(okhttp3.internal.connection.RealConnectionPool r1, okhttp3.Route r2, java.net.Socket r3, long r4) {
            okhttp3.internal.connection.RealConnection r0 = new okhttp3.internal.connection.RealConnection
            r0.<init>(r1, r2)
            r0.socket = r3
            r0.idleAtNanos = r4
            return r0
    }

    public void cancel() {
            r1 = this;
            java.net.Socket r0 = r1.rawSocket
            okhttp3.internal.Util.closeQuietly(r0)
            return
    }

    public void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            okhttp3.Protocol r0 = r7.protocol
            if (r0 != 0) goto L14f
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r10 = new okhttp3.internal.connection.ConnectionSpecSelector
            r10.<init>(r0)
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L73
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L66
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L46
            goto L85
        L46:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " not permitted by network security policy"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L66:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L73:
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L142
        L85:
            r11 = 0
            r12 = r11
        L87:
            okhttp3.Route r0 = r7.route     // Catch: java.io.IOException -> Lf8
            boolean r0 = r0.requiresTunnel()     // Catch: java.io.IOException -> Lf8
            if (r0 == 0) goto La8
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> Lf8
            java.net.Socket r0 = r7.rawSocket     // Catch: java.io.IOException -> Lf8
            if (r0 != 0) goto La3
            goto Lc5
        La3:
            r13 = r17
            r14 = r18
            goto Laf
        La8:
            r13 = r17
            r14 = r18
            r7.connectSocket(r13, r14, r8, r9)     // Catch: java.io.IOException -> Lf6
        Laf:
            r15 = r20
            r7.establishProtocol(r10, r15, r8, r9)     // Catch: java.io.IOException -> Lf4
            okhttp3.Route r0 = r7.route     // Catch: java.io.IOException -> Lf4
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch: java.io.IOException -> Lf4
            okhttp3.Route r1 = r7.route     // Catch: java.io.IOException -> Lf4
            java.net.Proxy r1 = r1.proxy()     // Catch: java.io.IOException -> Lf4
            okhttp3.Protocol r2 = r7.protocol     // Catch: java.io.IOException -> Lf4
            r9.connectEnd(r8, r0, r1, r2)     // Catch: java.io.IOException -> Lf4
        Lc5:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto Ldf
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto Ld2
            goto Ldf
        Ld2:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        Ldf:
            okhttp3.internal.http2.Http2Connection r0 = r7.http2Connection
            if (r0 == 0) goto Lf3
            okhttp3.internal.connection.RealConnectionPool r1 = r7.connectionPool
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Connection r0 = r7.http2Connection     // Catch: java.lang.Throwable -> Lf0
            int r0 = r0.maxConcurrentStreams()     // Catch: java.lang.Throwable -> Lf0
            r7.allocationLimit = r0     // Catch: java.lang.Throwable -> Lf0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf0
            goto Lf3
        Lf0:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf0
            throw r0
        Lf3:
            return
        Lf4:
            r0 = move-exception
            goto Lff
        Lf6:
            r0 = move-exception
            goto Lfd
        Lf8:
            r0 = move-exception
            r13 = r17
            r14 = r18
        Lfd:
            r15 = r20
        Lff:
            java.net.Socket r1 = r7.socket
            okhttp3.internal.Util.closeQuietly(r1)
            java.net.Socket r1 = r7.rawSocket
            okhttp3.internal.Util.closeQuietly(r1)
            r7.socket = r11
            r7.rawSocket = r11
            r7.source = r11
            r7.sink = r11
            r7.handshake = r11
            r7.protocol = r11
            r7.http2Connection = r11
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L134
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L137
        L134:
            r12.addConnectException(r0)
        L137:
            if (r21 == 0) goto L141
            boolean r0 = r10.connectionFailed(r0)
            if (r0 == 0) goto L141
            goto L87
        L141:
            throw r12
        L142:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L14f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.Connection
    public okhttp3.Handshake handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    boolean isEligible(okhttp3.Address r4, @javax.annotation.Nullable java.util.List<okhttp3.Route> r5) {
            r3 = this;
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> r0 = r3.transmitters
            int r0 = r0.size()
            int r1 = r3.allocationLimit
            r2 = 0
            if (r0 >= r1) goto L79
            boolean r0 = r3.noNewExchanges
            if (r0 == 0) goto L10
            goto L79
        L10:
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance
            okhttp3.Route r1 = r3.route
            okhttp3.Address r1 = r1.address()
            boolean r0 = r0.equalsNonHost(r1, r4)
            if (r0 != 0) goto L1f
            return r2
        L1f:
            okhttp3.HttpUrl r0 = r4.url()
            java.lang.String r0 = r0.host()
            okhttp3.Route r1 = r3.route()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L3f
            return r1
        L3f:
            okhttp3.internal.http2.Http2Connection r0 = r3.http2Connection
            if (r0 != 0) goto L44
            return r2
        L44:
            if (r5 == 0) goto L79
            boolean r5 = r3.routeMatchesAny(r5)
            if (r5 != 0) goto L4d
            goto L79
        L4d:
            javax.net.ssl.HostnameVerifier r5 = r4.hostnameVerifier()
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            if (r5 == r0) goto L56
            return r2
        L56:
            okhttp3.HttpUrl r5 = r4.url()
            boolean r5 = r3.supportsUrl(r5)
            if (r5 != 0) goto L61
            return r2
        L61:
            okhttp3.CertificatePinner r5 = r4.certificatePinner()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L79
            okhttp3.HttpUrl r4 = r4.url()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L79
            java.lang.String r4 = r4.host()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L79
            okhttp3.Handshake r0 = r3.handshake()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L79
            java.util.List r0 = r0.peerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L79
            r5.check(r4, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L79
            return r1
        L79:
            return r2
    }

    public boolean isHealthy(boolean r5) {
            r4 = this;
            java.net.Socket r0 = r4.socket
            boolean r0 = r0.isClosed()
            r1 = 0
            if (r0 != 0) goto L52
            java.net.Socket r0 = r4.socket
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L52
            java.net.Socket r0 = r4.socket
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L1a
            goto L52
        L1a:
            okhttp3.internal.http2.Http2Connection r0 = r4.http2Connection
            if (r0 == 0) goto L27
            long r1 = java.lang.System.nanoTime()
            boolean r5 = r0.isHealthy(r1)
            return r5
        L27:
            r0 = 1
            if (r5 == 0) goto L51
            java.net.Socket r5 = r4.socket     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            int r5 = r5.getSoTimeout()     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            java.net.Socket r2 = r4.socket     // Catch: java.lang.Throwable -> L49
            r2.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L49
            okio.BufferedSource r2 = r4.source     // Catch: java.lang.Throwable -> L49
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L43
            java.net.Socket r2 = r4.socket     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            r2.setSoTimeout(r5)     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            return r1
        L43:
            java.net.Socket r2 = r4.socket     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            r2.setSoTimeout(r5)     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            return r0
        L49:
            r2 = move-exception
            java.net.Socket r3 = r4.socket     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            r3.setSoTimeout(r5)     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
            throw r2     // Catch: java.io.IOException -> L50 java.net.SocketTimeoutException -> L51
        L50:
            return r1
        L51:
            return r0
        L52:
            return r1
    }

    public boolean isMultiplexed() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    okhttp3.internal.http.ExchangeCodec newCodec(okhttp3.OkHttpClient r5, okhttp3.Interceptor.Chain r6) throws java.net.SocketException {
            r4 = this;
            okhttp3.internal.http2.Http2Connection r0 = r4.http2Connection
            if (r0 == 0) goto Lc
            okhttp3.internal.http2.Http2ExchangeCodec r0 = new okhttp3.internal.http2.Http2ExchangeCodec
            okhttp3.internal.http2.Http2Connection r1 = r4.http2Connection
            r0.<init>(r5, r4, r6, r1)
            return r0
        Lc:
            java.net.Socket r0 = r4.socket
            int r1 = r6.readTimeoutMillis()
            r0.setSoTimeout(r1)
            okio.BufferedSource r0 = r4.source
            okio.Timeout r0 = r0.timeout()
            int r1 = r6.readTimeoutMillis()
            long r1 = (long) r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.timeout(r1, r3)
            okio.BufferedSink r0 = r4.sink
            okio.Timeout r0 = r0.timeout()
            int r6 = r6.writeTimeoutMillis()
            long r1 = (long) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.timeout(r1, r6)
            okhttp3.internal.http1.Http1ExchangeCodec r6 = new okhttp3.internal.http1.Http1ExchangeCodec
            okio.BufferedSource r0 = r4.source
            okio.BufferedSink r1 = r4.sink
            r6.<init>(r5, r4, r0, r1)
            return r6
    }

    okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams(okhttp3.internal.connection.Exchange r9) throws java.net.SocketException {
            r8 = this;
            java.net.Socket r0 = r8.socket
            r1 = 0
            r0.setSoTimeout(r1)
            r8.noNewExchanges()
            okhttp3.internal.connection.RealConnection$1 r0 = new okhttp3.internal.connection.RealConnection$1
            r4 = 1
            okio.BufferedSource r5 = r8.source
            okio.BufferedSink r6 = r8.sink
            r2 = r0
            r3 = r8
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }

    public void noNewExchanges() {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            r1 = 1
            r2.noNewExchanges = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(okhttp3.internal.http2.Http2Connection r2) {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool
            monitor-enter(r0)
            int r2 = r2.maxConcurrentStreams()     // Catch: java.lang.Throwable -> Lb
            r1.allocationLimit = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(okhttp3.internal.http2.Http2Stream r3) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            r1 = 0
            r3.close(r0, r1)
            return
    }

    @Override // okhttp3.Connection
    public okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    @Override // okhttp3.Connection
    public okhttp3.Route route() {
            r1 = this;
            okhttp3.Route r0 = r1.route
            return r0
    }

    @Override // okhttp3.Connection
    public java.net.Socket socket() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            return r0
    }

    public boolean supportsUrl(okhttp3.HttpUrl r5) {
            r4 = this;
            int r0 = r5.port()
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
            r2 = 0
            if (r0 == r1) goto L16
            return r2
        L16:
            java.lang.String r0 = r5.host()
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L4d
            okhttp3.Handshake r0 = r4.handshake
            if (r0 == 0) goto L4c
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            java.lang.String r5 = r5.host()
            okhttp3.Handshake r3 = r4.handshake
            java.util.List r3 = r3.peerCertificates()
            java.lang.Object r3 = r3.get(r2)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r5 = r0.verify(r5, r3)
            if (r5 == 0) goto L4c
            r2 = r1
        L4c:
            return r2
        L4d:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection{"
            r0.<init>(r1)
            okhttp3.Route r1 = r2.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", proxy="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            java.net.Proxy r1 = r1.proxy()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " hostAddress="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            java.net.InetSocketAddress r1 = r1.socketAddress()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Handshake r1 = r2.handshake
            if (r1 == 0) goto L60
            okhttp3.CipherSuite r1 = r1.cipherSuite()
            goto L62
        L60:
            java.lang.String r1 = "none"
        L62:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " protocol="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Protocol r1 = r2.protocol
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void trackFailure(@javax.annotation.Nullable java.io.IOException r5) {
            r4 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r4.connectionPool
            monitor-enter(r0)
            boolean r1 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4b
            r2 = 1
            if (r1 == 0) goto L2b
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.ErrorCode r5 = r5.errorCode     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L4b
            if (r5 != r1) goto L1f
            int r5 = r4.refusedStreamCount     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + r2
            r4.refusedStreamCount = r5     // Catch: java.lang.Throwable -> L4b
            if (r5 <= r2) goto L49
            r4.noNewExchanges = r2     // Catch: java.lang.Throwable -> L4b
            int r5 = r4.routeFailureCount     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + r2
            r4.routeFailureCount = r5     // Catch: java.lang.Throwable -> L4b
            goto L49
        L1f:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L4b
            if (r5 == r1) goto L49
            r4.noNewExchanges = r2     // Catch: java.lang.Throwable -> L4b
            int r5 = r4.routeFailureCount     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + r2
            r4.routeFailureCount = r5     // Catch: java.lang.Throwable -> L4b
            goto L49
        L2b:
            boolean r1 = r4.isMultiplexed()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L35
            boolean r1 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L49
        L35:
            r4.noNewExchanges = r2     // Catch: java.lang.Throwable -> L4b
            int r1 = r4.successCount     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L49
            if (r5 == 0) goto L44
            okhttp3.internal.connection.RealConnectionPool r1 = r4.connectionPool     // Catch: java.lang.Throwable -> L4b
            okhttp3.Route r3 = r4.route     // Catch: java.lang.Throwable -> L4b
            r1.connectFailed(r3, r5)     // Catch: java.lang.Throwable -> L4b
        L44:
            int r5 = r4.routeFailureCount     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + r2
            r4.routeFailureCount = r5     // Catch: java.lang.Throwable -> L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r5
    }
}
