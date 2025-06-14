package okhttp3.internal.connection;

/* loaded from: classes.dex */
public final class Transmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final okhttp3.Call call;

    @javax.annotation.Nullable
    private java.lang.Object callStackTrace;
    private boolean canceled;
    private final okhttp3.OkHttpClient client;
    public okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private final okhttp3.EventListener eventListener;

    @javax.annotation.Nullable
    private okhttp3.internal.connection.Exchange exchange;
    private okhttp3.internal.connection.ExchangeFinder exchangeFinder;
    private boolean exchangeRequestDone;
    private boolean exchangeResponseDone;
    private boolean noMoreExchanges;
    private okhttp3.Request request;
    private final okio.AsyncTimeout timeout;
    private boolean timeoutEarlyExit;


    static final class TransmitterReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.Transmitter> {
        final java.lang.Object callStackTrace;

        TransmitterReference(okhttp3.internal.connection.Transmitter r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1)
                r0.callStackTrace = r2
                return
        }
    }

    static {
            return
    }

    public Transmitter(okhttp3.OkHttpClient r4, okhttp3.Call r5) {
            r3 = this;
            r3.<init>()
            okhttp3.internal.connection.Transmitter$1 r0 = new okhttp3.internal.connection.Transmitter$1
            r0.<init>(r3)
            r3.timeout = r0
            r3.client = r4
            okhttp3.internal.Internal r1 = okhttp3.internal.Internal.instance
            okhttp3.ConnectionPool r2 = r4.connectionPool()
            okhttp3.internal.connection.RealConnectionPool r1 = r1.realConnectionPool(r2)
            r3.connectionPool = r1
            r3.call = r5
            okhttp3.EventListener$Factory r1 = r4.eventListenerFactory()
            okhttp3.EventListener r5 = r1.create(r5)
            r3.eventListener = r5
            int r4 = r4.callTimeoutMillis()
            long r4 = (long) r4
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.timeout(r4, r1)
            return
    }

    private okhttp3.Address createAddress(okhttp3.HttpUrl r15) {
            r14 = this;
            boolean r0 = r15.isHttps()
            if (r0 == 0) goto L1c
            okhttp3.OkHttpClient r0 = r14.client
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            okhttp3.OkHttpClient r1 = r14.client
            javax.net.ssl.HostnameVerifier r1 = r1.hostnameVerifier()
            okhttp3.OkHttpClient r2 = r14.client
            okhttp3.CertificatePinner r2 = r2.certificatePinner()
            r6 = r0
            r7 = r1
            r8 = r2
            goto L20
        L1c:
            r0 = 0
            r6 = r0
            r7 = r6
            r8 = r7
        L20:
            okhttp3.Address r0 = new okhttp3.Address
            java.lang.String r2 = r15.host()
            int r3 = r15.port()
            okhttp3.OkHttpClient r15 = r14.client
            okhttp3.Dns r4 = r15.dns()
            okhttp3.OkHttpClient r15 = r14.client
            javax.net.SocketFactory r5 = r15.socketFactory()
            okhttp3.OkHttpClient r15 = r14.client
            okhttp3.Authenticator r9 = r15.proxyAuthenticator()
            okhttp3.OkHttpClient r15 = r14.client
            java.net.Proxy r10 = r15.proxy()
            okhttp3.OkHttpClient r15 = r14.client
            java.util.List r11 = r15.protocols()
            okhttp3.OkHttpClient r15 = r14.client
            java.util.List r12 = r15.connectionSpecs()
            okhttp3.OkHttpClient r15 = r14.client
            java.net.ProxySelector r13 = r15.proxySelector()
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    @javax.annotation.Nullable
    private java.io.IOException maybeReleaseConnection(@javax.annotation.Nullable java.io.IOException r6, boolean r7) {
            r5 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r5.connectionPool
            monitor-enter(r0)
            if (r7 == 0) goto L12
            okhttp3.internal.connection.Exchange r1 = r5.exchange     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto La
            goto L12
        La:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = "cannot release connection while it is in use"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L12:
            okhttp3.internal.connection.RealConnection r1 = r5.connection     // Catch: java.lang.Throwable -> L62
            r2 = 0
            if (r1 == 0) goto L26
            okhttp3.internal.connection.Exchange r3 = r5.exchange     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L26
            if (r7 != 0) goto L21
            boolean r7 = r5.noMoreExchanges     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L26
        L21:
            java.net.Socket r7 = r5.releaseConnectionNoEvents()     // Catch: java.lang.Throwable -> L62
            goto L27
        L26:
            r7 = r2
        L27:
            okhttp3.internal.connection.RealConnection r3 = r5.connection     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L2c
            r1 = r2
        L2c:
            boolean r2 = r5.noMoreExchanges     // Catch: java.lang.Throwable -> L62
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            okhttp3.internal.connection.Exchange r2 = r5.exchange     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L38
            r2 = r3
            goto L39
        L38:
            r2 = r4
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            okhttp3.internal.Util.closeQuietly(r7)
            if (r1 == 0) goto L46
            okhttp3.EventListener r7 = r5.eventListener
            okhttp3.Call r0 = r5.call
            r7.connectionReleased(r0, r1)
        L46:
            if (r2 == 0) goto L61
            if (r6 == 0) goto L4b
            goto L4c
        L4b:
            r3 = r4
        L4c:
            java.io.IOException r6 = r5.timeoutExit(r6)
            if (r3 == 0) goto L5a
            okhttp3.EventListener r7 = r5.eventListener
            okhttp3.Call r0 = r5.call
            r7.callFailed(r0, r6)
            goto L61
        L5a:
            okhttp3.EventListener r7 = r5.eventListener
            okhttp3.Call r0 = r5.call
            r7.callEnd(r0)
        L61:
            return r6
        L62:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r6
    }

    @javax.annotation.Nullable
    private java.io.IOException timeoutExit(@javax.annotation.Nullable java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 == 0) goto L5
            return r3
        L5:
            okio.AsyncTimeout r0 = r2.timeout
            boolean r0 = r0.exit()
            if (r0 != 0) goto Le
            return r3
        Le:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L1a
            r0.initCause(r3)
        L1a:
            return r0
    }

    void acquireConnectionNoEvents(okhttp3.internal.connection.RealConnection r3) {
            r2 = this;
            okhttp3.internal.connection.RealConnection r0 = r2.connection
            if (r0 != 0) goto L13
            r2.connection = r3
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> r3 = r3.transmitters
            okhttp3.internal.connection.Transmitter$TransmitterReference r0 = new okhttp3.internal.connection.Transmitter$TransmitterReference
            java.lang.Object r1 = r2.callStackTrace
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    public void callStart() {
            r2 = this;
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.getStackTraceForCloseable(r1)
            r2.callStackTrace = r0
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.callStart(r1)
            return
    }

    public boolean canRetry() {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.exchangeFinder
            boolean r0 = r0.hasStreamFailure()
            if (r0 == 0) goto L12
            okhttp3.internal.connection.ExchangeFinder r0 = r1.exchangeFinder
            boolean r0 = r0.hasRouteToTry()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public void cancel() {
            r3 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r3.connectionPool
            monitor-enter(r0)
            r1 = 1
            r3.canceled = r1     // Catch: java.lang.Throwable -> L28
            okhttp3.internal.connection.Exchange r1 = r3.exchange     // Catch: java.lang.Throwable -> L28
            okhttp3.internal.connection.ExchangeFinder r2 = r3.exchangeFinder     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L19
            okhttp3.internal.connection.RealConnection r2 = r2.connectingConnection()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L19
            okhttp3.internal.connection.ExchangeFinder r2 = r3.exchangeFinder     // Catch: java.lang.Throwable -> L28
            okhttp3.internal.connection.RealConnection r2 = r2.connectingConnection()     // Catch: java.lang.Throwable -> L28
            goto L1b
        L19:
            okhttp3.internal.connection.RealConnection r2 = r3.connection     // Catch: java.lang.Throwable -> L28
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L22
            r1.cancel()
            goto L27
        L22:
            if (r2 == 0) goto L27
            r2.cancel()
        L27:
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public void exchangeDoneDueToException() {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            boolean r1 = r2.noMoreExchanges     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Lc
            r1 = 0
            r2.exchange = r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @javax.annotation.Nullable
    java.io.IOException exchangeMessageDone(okhttp3.internal.connection.Exchange r4, boolean r5, boolean r6, @javax.annotation.Nullable java.io.IOException r7) {
            r3 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r3.connectionPool
            monitor-enter(r0)
            okhttp3.internal.connection.Exchange r1 = r3.exchange     // Catch: java.lang.Throwable -> L3d
            if (r4 == r1) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return r7
        L9:
            r4 = 1
            r2 = 0
            if (r5 == 0) goto L13
            boolean r5 = r3.exchangeRequestDone     // Catch: java.lang.Throwable -> L3d
            r5 = r5 ^ r4
            r3.exchangeRequestDone = r4     // Catch: java.lang.Throwable -> L3d
            goto L14
        L13:
            r5 = r2
        L14:
            if (r6 == 0) goto L1d
            boolean r6 = r3.exchangeResponseDone     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto L1b
            r5 = r4
        L1b:
            r3.exchangeResponseDone = r4     // Catch: java.lang.Throwable -> L3d
        L1d:
            boolean r6 = r3.exchangeRequestDone     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L34
            boolean r6 = r3.exchangeResponseDone     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L34
            if (r5 == 0) goto L34
            okhttp3.internal.connection.RealConnection r5 = r1.connection()     // Catch: java.lang.Throwable -> L3d
            int r6 = r5.successCount     // Catch: java.lang.Throwable -> L3d
            int r6 = r6 + r4
            r5.successCount = r6     // Catch: java.lang.Throwable -> L3d
            r5 = 0
            r3.exchange = r5     // Catch: java.lang.Throwable -> L3d
            goto L35
        L34:
            r4 = r2
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L3c
            java.io.IOException r7 = r3.maybeReleaseConnection(r7, r2)
        L3c:
            return r7
        L3d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
    }

    public boolean hasExchange() {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            okhttp3.internal.connection.Exchange r1 = r2.exchange     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public boolean isCanceled() {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            boolean r1 = r2.canceled     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    okhttp3.internal.connection.Exchange newExchange(okhttp3.Interceptor.Chain r9, boolean r10) {
            r8 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r8.connectionPool
            monitor-enter(r0)
            boolean r1 = r8.noMoreExchanges     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L38
            okhttp3.internal.connection.Exchange r1 = r8.exchange     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            okhttp3.internal.connection.ExchangeFinder r0 = r8.exchangeFinder
            okhttp3.OkHttpClient r1 = r8.client
            okhttp3.internal.http.ExchangeCodec r7 = r0.find(r1, r9, r10)
            okhttp3.internal.connection.Exchange r9 = new okhttp3.internal.connection.Exchange
            okhttp3.Call r4 = r8.call
            okhttp3.EventListener r5 = r8.eventListener
            okhttp3.internal.connection.ExchangeFinder r6 = r8.exchangeFinder
            r2 = r9
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            okhttp3.internal.connection.RealConnectionPool r10 = r8.connectionPool
            monitor-enter(r10)
            r8.exchange = r9     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            r8.exchangeRequestDone = r0     // Catch: java.lang.Throwable -> L2d
            r8.exchangeResponseDone = r0     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2d
            return r9
        L2d:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2d
            throw r9
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r10 = "cannot make a new request because the previous response is still open: please call response.close()"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L40
            throw r9     // Catch: java.lang.Throwable -> L40
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r10 = "released"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L40
            throw r9     // Catch: java.lang.Throwable -> L40
        L40:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r9
    }

    @javax.annotation.Nullable
    public java.io.IOException noMoreExchanges(@javax.annotation.Nullable java.io.IOException r3) {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            r1 = 1
            r2.noMoreExchanges = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            java.io.IOException r3 = r2.maybeReleaseConnection(r3, r0)
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void prepareToConnect(okhttp3.Request r8) {
            r7 = this;
            okhttp3.Request r0 = r7.request
            if (r0 == 0) goto L31
            okhttp3.HttpUrl r0 = r0.url()
            okhttp3.HttpUrl r1 = r8.url()
            boolean r0 = okhttp3.internal.Util.sameConnection(r0, r1)
            if (r0 == 0) goto L1b
            okhttp3.internal.connection.ExchangeFinder r0 = r7.exchangeFinder
            boolean r0 = r0.hasRouteToTry()
            if (r0 == 0) goto L1b
            return
        L1b:
            okhttp3.internal.connection.Exchange r0 = r7.exchange
            if (r0 != 0) goto L2b
            okhttp3.internal.connection.ExchangeFinder r0 = r7.exchangeFinder
            if (r0 == 0) goto L31
            r0 = 1
            r1 = 0
            r7.maybeReleaseConnection(r1, r0)
            r7.exchangeFinder = r1
            goto L31
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L31:
            r7.request = r8
            okhttp3.internal.connection.ExchangeFinder r6 = new okhttp3.internal.connection.ExchangeFinder
            okhttp3.internal.connection.RealConnectionPool r2 = r7.connectionPool
            okhttp3.HttpUrl r8 = r8.url()
            okhttp3.Address r3 = r7.createAddress(r8)
            okhttp3.Call r4 = r7.call
            okhttp3.EventListener r5 = r7.eventListener
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r7.exchangeFinder = r6
            return
    }

    @javax.annotation.Nullable
    java.net.Socket releaseConnectionNoEvents() {
            r4 = this;
            okhttp3.internal.connection.RealConnection r0 = r4.connection
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> r0 = r0.transmitters
            int r0 = r0.size()
            r1 = 0
        L9:
            r2 = -1
            if (r1 >= r0) goto L20
            okhttp3.internal.connection.RealConnection r3 = r4.connection
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> r3 = r3.transmitters
            java.lang.Object r3 = r3.get(r1)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L1d
            goto L21
        L1d:
            int r1 = r1 + 1
            goto L9
        L20:
            r1 = r2
        L21:
            if (r1 == r2) goto L49
            okhttp3.internal.connection.RealConnection r0 = r4.connection
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> r2 = r0.transmitters
            r2.remove(r1)
            r1 = 0
            r4.connection = r1
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.Transmitter>> r2 = r0.transmitters
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L48
            long r2 = java.lang.System.nanoTime()
            r0.idleAtNanos = r2
            okhttp3.internal.connection.RealConnectionPool r2 = r4.connectionPool
            boolean r2 = r2.connectionBecameIdle(r0)
            if (r2 == 0) goto L48
            java.net.Socket r0 = r0.socket()
            return r0
        L48:
            return r1
        L49:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public okio.Timeout timeout() {
            r1 = this;
            okio.AsyncTimeout r0 = r1.timeout
            return r0
    }

    public void timeoutEarlyExit() {
            r1 = this;
            boolean r0 = r1.timeoutEarlyExit
            if (r0 != 0) goto Ld
            r0 = 1
            r1.timeoutEarlyExit = r0
            okio.AsyncTimeout r0 = r1.timeout
            r0.exit()
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public void timeoutEnter() {
            r1 = this;
            okio.AsyncTimeout r0 = r1.timeout
            r0.enter()
            return
    }
}
