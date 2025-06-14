package okhttp3.internal.connection;

/* loaded from: classes.dex */
final class ExchangeFinder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final okhttp3.Address address;
    private final okhttp3.Call call;
    private okhttp3.internal.connection.RealConnection connectingConnection;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private final okhttp3.EventListener eventListener;
    private boolean hasStreamFailure;
    private okhttp3.Route nextRouteToTry;
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;
    private final okhttp3.internal.connection.RouteSelector routeSelector;
    private final okhttp3.internal.connection.Transmitter transmitter;

    static {
            return
    }

    ExchangeFinder(okhttp3.internal.connection.Transmitter r1, okhttp3.internal.connection.RealConnectionPool r2, okhttp3.Address r3, okhttp3.Call r4, okhttp3.EventListener r5) {
            r0 = this;
            r0.<init>()
            r0.transmitter = r1
            r0.connectionPool = r2
            r0.address = r3
            r0.call = r4
            r0.eventListener = r5
            okhttp3.internal.connection.RouteSelector r1 = new okhttp3.internal.connection.RouteSelector
            okhttp3.internal.connection.RouteDatabase r2 = r2.routeDatabase
            r1.<init>(r3, r2, r4, r5)
            r0.routeSelector = r1
            return
    }

    private okhttp3.internal.connection.RealConnection findConnection(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
            r18 = this;
            r1 = r18
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            boolean r0 = r0.isCanceled()     // Catch: java.lang.Throwable -> L147
            if (r0 != 0) goto L13f
            r0 = 0
            r1.hasStreamFailure = r0     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r3 = r3.connection     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r4 = r4.connection     // Catch: java.lang.Throwable -> L147
            r5 = 0
            if (r4 == 0) goto L2a
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r4 = r4.connection     // Catch: java.lang.Throwable -> L147
            boolean r4 = r4.noNewExchanges     // Catch: java.lang.Throwable -> L147
            if (r4 == 0) goto L2a
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            java.net.Socket r4 = r4.releaseConnectionNoEvents()     // Catch: java.lang.Throwable -> L147
            goto L2b
        L2a:
            r4 = r5
        L2b:
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r6 = r6.connection     // Catch: java.lang.Throwable -> L147
            if (r6 == 0) goto L37
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r3 = r3.connection     // Catch: java.lang.Throwable -> L147
            r6 = r5
            goto L39
        L37:
            r6 = r3
            r3 = r5
        L39:
            r7 = 1
            if (r3 != 0) goto L66
            okhttp3.internal.connection.RealConnectionPool r8 = r1.connectionPool     // Catch: java.lang.Throwable -> L147
            okhttp3.Address r9 = r1.address     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.Transmitter r10 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            boolean r8 = r8.transmitterAcquirePooledConnection(r9, r10, r5, r0)     // Catch: java.lang.Throwable -> L147
            if (r8 == 0) goto L4f
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r3 = r3.connection     // Catch: java.lang.Throwable -> L147
            r8 = r5
            r9 = r7
            goto L68
        L4f:
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch: java.lang.Throwable -> L147
            if (r8 == 0) goto L57
            r1.nextRouteToTry = r5     // Catch: java.lang.Throwable -> L147
        L55:
            r9 = r0
            goto L68
        L57:
            boolean r8 = r18.retryCurrentRoute()     // Catch: java.lang.Throwable -> L147
            if (r8 == 0) goto L66
            okhttp3.internal.connection.Transmitter r8 = r1.transmitter     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.connection.RealConnection r8 = r8.connection     // Catch: java.lang.Throwable -> L147
            okhttp3.Route r8 = r8.route()     // Catch: java.lang.Throwable -> L147
            goto L55
        L66:
            r9 = r0
            r8 = r5
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L147
            okhttp3.internal.Util.closeQuietly(r4)
            if (r6 == 0) goto L75
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.Call r4 = r1.call
            r2.connectionReleased(r4, r6)
        L75:
            if (r9 == 0) goto L7e
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.Call r4 = r1.call
            r2.connectionAcquired(r4, r3)
        L7e:
            if (r3 == 0) goto L81
            return r3
        L81:
            if (r8 != 0) goto L97
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection
            if (r2 == 0) goto L8d
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L97
        L8d:
            okhttp3.internal.connection.RouteSelector r2 = r1.routeSelector
            okhttp3.internal.connection.RouteSelector$Selection r2 = r2.next()
            r1.routeSelection = r2
            r2 = r7
            goto L98
        L97:
            r2 = r0
        L98:
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool
            monitor-enter(r4)
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch: java.lang.Throwable -> L13c
            boolean r6 = r6.isCanceled()     // Catch: java.lang.Throwable -> L13c
            if (r6 != 0) goto L134
            if (r2 == 0) goto Lbd
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection     // Catch: java.lang.Throwable -> L13c
            java.util.List r2 = r2.getAll()     // Catch: java.lang.Throwable -> L13c
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool     // Catch: java.lang.Throwable -> L13c
            okhttp3.Address r10 = r1.address     // Catch: java.lang.Throwable -> L13c
            okhttp3.internal.connection.Transmitter r11 = r1.transmitter     // Catch: java.lang.Throwable -> L13c
            boolean r0 = r6.transmitterAcquirePooledConnection(r10, r11, r2, r0)     // Catch: java.lang.Throwable -> L13c
            if (r0 == 0) goto Lbe
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch: java.lang.Throwable -> L13c
            okhttp3.internal.connection.RealConnection r3 = r0.connection     // Catch: java.lang.Throwable -> L13c
            r9 = r7
            goto Lbe
        Lbd:
            r2 = r5
        Lbe:
            if (r9 != 0) goto Ld1
            if (r8 != 0) goto Lc8
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection     // Catch: java.lang.Throwable -> L13c
            okhttp3.Route r8 = r0.next()     // Catch: java.lang.Throwable -> L13c
        Lc8:
            okhttp3.internal.connection.RealConnection r3 = new okhttp3.internal.connection.RealConnection     // Catch: java.lang.Throwable -> L13c
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L13c
            r3.<init>(r0, r8)     // Catch: java.lang.Throwable -> L13c
            r1.connectingConnection = r3     // Catch: java.lang.Throwable -> L13c
        Ld1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13c
            if (r9 == 0) goto Ldc
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            r0.connectionAcquired(r2, r3)
            return r3
        Ldc:
            okhttp3.Call r0 = r1.call
            okhttp3.EventListener r4 = r1.eventListener
            r10 = r3
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r4
            r10.connect(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool
            okhttp3.internal.connection.RouteDatabase r0 = r0.routeDatabase
            okhttp3.Route r4 = r3.route()
            r0.connected(r4)
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            monitor-enter(r6)
            r1.connectingConnection = r5     // Catch: java.lang.Throwable -> L131
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L131
            okhttp3.Address r4 = r1.address     // Catch: java.lang.Throwable -> L131
            okhttp3.internal.connection.Transmitter r9 = r1.transmitter     // Catch: java.lang.Throwable -> L131
            boolean r0 = r0.transmitterAcquirePooledConnection(r4, r9, r2, r7)     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L11b
            r3.noNewExchanges = r7     // Catch: java.lang.Throwable -> L131
            java.net.Socket r5 = r3.socket()     // Catch: java.lang.Throwable -> L131
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch: java.lang.Throwable -> L131
            okhttp3.internal.connection.RealConnection r3 = r0.connection     // Catch: java.lang.Throwable -> L131
            r1.nextRouteToTry = r8     // Catch: java.lang.Throwable -> L131
            goto L125
        L11b:
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L131
            r0.put(r3)     // Catch: java.lang.Throwable -> L131
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch: java.lang.Throwable -> L131
            r0.acquireConnectionNoEvents(r3)     // Catch: java.lang.Throwable -> L131
        L125:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L131
            okhttp3.internal.Util.closeQuietly(r5)
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            r0.connectionAcquired(r2, r3)
            return r3
        L131:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L131
            throw r0
        L134:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L13c
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13c
            throw r0     // Catch: java.lang.Throwable -> L13c
        L13c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13c
            throw r0
        L13f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L147
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L147
            throw r0     // Catch: java.lang.Throwable -> L147
        L147:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L147
            throw r0
    }

    private okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
            r3 = this;
        L0:
            okhttp3.internal.connection.RealConnection r0 = r3.findConnection(r4, r5, r6, r7, r8)
            okhttp3.internal.connection.RealConnectionPool r1 = r3.connectionPool
            monitor-enter(r1)
            int r2 = r0.successCount     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L13
            boolean r2 = r0.isMultiplexed()     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            return r0
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r0.isHealthy(r9)
            if (r1 != 0) goto L1e
            r0.noNewExchanges()
            goto L0
        L1e:
            return r0
        L1f:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    private boolean retryCurrentRoute() {
            r2 = this;
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            if (r0 == 0) goto L2c
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            int r0 = r0.routeFailureCount
            if (r0 != 0) goto L2c
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            okhttp3.Route r0 = r0.route()
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            okhttp3.Address r1 = r2.address
            okhttp3.HttpUrl r1 = r1.url()
            boolean r0 = okhttp3.internal.Util.sameConnection(r0, r1)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    okhttp3.internal.connection.RealConnection connectingConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connectingConnection
            return r0
    }

    public okhttp3.internal.http.ExchangeCodec find(okhttp3.OkHttpClient r8, okhttp3.Interceptor.Chain r9, boolean r10) {
            r7 = this;
            int r1 = r9.connectTimeoutMillis()
            int r2 = r9.readTimeoutMillis()
            int r3 = r9.writeTimeoutMillis()
            int r4 = r8.pingIntervalMillis()
            boolean r5 = r8.retryOnConnectionFailure()
            r0 = r7
            r6 = r10
            okhttp3.internal.connection.RealConnection r10 = r0.findHealthyConnection(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L1f okhttp3.internal.connection.RouteException -> L29
            okhttp3.internal.http.ExchangeCodec r8 = r10.newCodec(r8, r9)     // Catch: java.io.IOException -> L1f okhttp3.internal.connection.RouteException -> L29
            return r8
        L1f:
            r8 = move-exception
            r7.trackFailure()
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            r9.<init>(r8)
            throw r9
        L29:
            r8 = move-exception
            r7.trackFailure()
            throw r8
    }

    boolean hasRouteToTry() {
            r3 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r3.connectionPool
            monitor-enter(r0)
            okhttp3.Route r1 = r3.nextRouteToTry     // Catch: java.lang.Throwable -> L32
            r2 = 1
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r2
        La:
            boolean r1 = r3.retryCurrentRoute()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L1c
            okhttp3.internal.connection.Transmitter r1 = r3.transmitter     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.connection.RealConnection r1 = r1.connection     // Catch: java.lang.Throwable -> L32
            okhttp3.Route r1 = r1.route()     // Catch: java.lang.Throwable -> L32
            r3.nextRouteToTry = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r2
        L1c:
            okhttp3.internal.connection.RouteSelector$Selection r1 = r3.routeSelection     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L26
            boolean r1 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L30
        L26:
            okhttp3.internal.connection.RouteSelector r1 = r3.routeSelector     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r2 = 0
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r2
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    boolean hasStreamFailure() {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            boolean r1 = r2.hasStreamFailure     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    void trackFailure() {
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            r1 = 1
            r2.hasStreamFailure = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }
}
