package okhttp3;

/* loaded from: classes.dex */
final class RealCall implements okhttp3.Call {
    final okhttp3.OkHttpClient client;
    private boolean executed;
    final boolean forWebSocket;
    final okhttp3.Request originalRequest;
    private okhttp3.internal.connection.Transmitter transmitter;

    final class AsyncCall extends okhttp3.internal.NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.RealCall this$0;

        static {
                java.lang.Class<okhttp3.RealCall> r0 = okhttp3.RealCall.class
                return
        }

        AsyncCall(okhttp3.RealCall r3, okhttp3.Callback r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = r3.redactedUrl()
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "OkHttp %s"
                r2.<init>(r3, r0)
                java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                r3.<init>(r1)
                r2.callsPerHost = r3
                r2.responseCallback = r4
                return
        }

        java.util.concurrent.atomic.AtomicInteger callsPerHost() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.callsPerHost
                return r0
        }

        @Override // okhttp3.internal.NamedRunnable
        protected void execute() {
                r6 = this;
                java.lang.String r0 = "canceled due to "
                java.lang.String r1 = "Callback failure for "
                okhttp3.RealCall r2 = r6.this$0
                okhttp3.internal.connection.Transmitter r2 = okhttp3.RealCall.access$000(r2)
                r2.timeoutEnter()
                r2 = 0
                okhttp3.RealCall r3 = r6.this$0     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L55
                okhttp3.Response r2 = r3.getResponseWithInterceptorChain()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L55
                r3 = 1
                okhttp3.Callback r4 = r6.responseCallback     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
                okhttp3.RealCall r5 = r6.this$0     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
                r4.onResponse(r5, r2)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            L1c:
                okhttp3.RealCall r0 = r6.this$0
                okhttp3.OkHttpClient r0 = r0.client
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r0.finished(r6)
                goto L7c
            L28:
                r1 = move-exception
                r2 = r3
                goto L2f
            L2b:
                r0 = move-exception
                r2 = r3
                goto L56
            L2e:
                r1 = move-exception
            L2f:
                okhttp3.RealCall r3 = r6.this$0     // Catch: java.lang.Throwable -> L53
                r3.cancel()     // Catch: java.lang.Throwable -> L53
                if (r2 != 0) goto L52
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L53
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L53
                java.lang.StringBuilder r0 = r3.append(r1)     // Catch: java.lang.Throwable -> L53
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L53
                r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L53
                okhttp3.Callback r0 = r6.responseCallback     // Catch: java.lang.Throwable -> L53
                okhttp3.RealCall r3 = r6.this$0     // Catch: java.lang.Throwable -> L53
                r0.onFailure(r3, r2)     // Catch: java.lang.Throwable -> L53
            L52:
                throw r1     // Catch: java.lang.Throwable -> L53
            L53:
                r0 = move-exception
                goto L7d
            L55:
                r0 = move-exception
            L56:
                if (r2 == 0) goto L74
                okhttp3.internal.platform.Platform r2 = okhttp3.internal.platform.Platform.get()     // Catch: java.lang.Throwable -> L53
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L53
                okhttp3.RealCall r1 = r6.this$0     // Catch: java.lang.Throwable -> L53
                java.lang.String r1 = r1.toLoggableString()     // Catch: java.lang.Throwable -> L53
                java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L53
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L53
                r3 = 4
                r2.log(r3, r1, r0)     // Catch: java.lang.Throwable -> L53
                goto L1c
            L74:
                okhttp3.Callback r1 = r6.responseCallback     // Catch: java.lang.Throwable -> L53
                okhttp3.RealCall r2 = r6.this$0     // Catch: java.lang.Throwable -> L53
                r1.onFailure(r2, r0)     // Catch: java.lang.Throwable -> L53
                goto L1c
            L7c:
                return
            L7d:
                okhttp3.RealCall r1 = r6.this$0
                okhttp3.OkHttpClient r1 = r1.client
                okhttp3.Dispatcher r1 = r1.dispatcher()
                r1.finished(r6)
                throw r0
        }

        void executeOn(java.util.concurrent.ExecutorService r3) {
                r2 = this;
                r3.execute(r2)     // Catch: java.lang.Throwable -> L4 java.util.concurrent.RejectedExecutionException -> L6
                goto L2c
            L4:
                r3 = move-exception
                goto L2d
            L6:
                r3 = move-exception
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4
                java.lang.String r1 = "executor rejected"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L4
                r0.initCause(r3)     // Catch: java.lang.Throwable -> L4
                okhttp3.RealCall r3 = r2.this$0     // Catch: java.lang.Throwable -> L4
                okhttp3.internal.connection.Transmitter r3 = okhttp3.RealCall.access$000(r3)     // Catch: java.lang.Throwable -> L4
                r3.noMoreExchanges(r0)     // Catch: java.lang.Throwable -> L4
                okhttp3.Callback r3 = r2.responseCallback     // Catch: java.lang.Throwable -> L4
                okhttp3.RealCall r1 = r2.this$0     // Catch: java.lang.Throwable -> L4
                r3.onFailure(r1, r0)     // Catch: java.lang.Throwable -> L4
                okhttp3.RealCall r3 = r2.this$0
                okhttp3.OkHttpClient r3 = r3.client
                okhttp3.Dispatcher r3 = r3.dispatcher()
                r3.finished(r2)
            L2c:
                return
            L2d:
                okhttp3.RealCall r0 = r2.this$0
                okhttp3.OkHttpClient r0 = r0.client
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r0.finished(r2)
                throw r3
        }

        okhttp3.RealCall get() {
                r1 = this;
                okhttp3.RealCall r0 = r1.this$0
                return r0
        }

        java.lang.String host() {
                r1 = this;
                okhttp3.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.originalRequest
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.host()
                return r0
        }

        okhttp3.Request request() {
                r1 = this;
                okhttp3.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.originalRequest
                return r0
        }

        void reuseCallsPerHostFrom(okhttp3.RealCall.AsyncCall r1) {
                r0 = this;
                java.util.concurrent.atomic.AtomicInteger r1 = r1.callsPerHost
                r0.callsPerHost = r1
                return
        }
    }

    private RealCall(okhttp3.OkHttpClient r1, okhttp3.Request r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.client = r1
            r0.originalRequest = r2
            r0.forWebSocket = r3
            return
    }

    static /* synthetic */ okhttp3.internal.connection.Transmitter access$000(okhttp3.RealCall r0) {
            okhttp3.internal.connection.Transmitter r0 = r0.transmitter
            return r0
    }

    static okhttp3.RealCall newRealCall(okhttp3.OkHttpClient r1, okhttp3.Request r2, boolean r3) {
            okhttp3.RealCall r0 = new okhttp3.RealCall
            r0.<init>(r1, r2, r3)
            okhttp3.internal.connection.Transmitter r2 = new okhttp3.internal.connection.Transmitter
            r2.<init>(r1, r0)
            r0.transmitter = r2
            return r0
    }

    @Override // okhttp3.Call
    public void cancel() {
            r1 = this;
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter
            r0.cancel()
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            okhttp3.RealCall r0 = r1.clone()
            return r0
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ okhttp3.Call clone() {
            r1 = this;
            okhttp3.RealCall r0 = r1.clone()
            return r0
    }

    @Override // okhttp3.Call
    public okhttp3.RealCall clone() {
            r3 = this;
            okhttp3.OkHttpClient r0 = r3.client
            okhttp3.Request r1 = r3.originalRequest
            boolean r2 = r3.forWebSocket
            okhttp3.RealCall r0 = newRealCall(r0, r1, r2)
            return r0
    }

    @Override // okhttp3.Call
    public void enqueue(okhttp3.Callback r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.executed     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1d
            r0 = 1
            r2.executed = r0     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            r0.callStart()
            okhttp3.OkHttpClient r0 = r2.client
            okhttp3.Dispatcher r0 = r0.dispatcher()
            okhttp3.RealCall$AsyncCall r1 = new okhttp3.RealCall$AsyncCall
            r1.<init>(r2, r3)
            r0.enqueue(r1)
            return
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "Already Executed"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L25
            throw r3     // Catch: java.lang.Throwable -> L25
        L25:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    @Override // okhttp3.Call
    public okhttp3.Response execute() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.executed     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L35
            r0 = 1
            r2.executed = r0     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            r0.timeoutEnter()
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            r0.callStart()
            okhttp3.OkHttpClient r0 = r2.client     // Catch: java.lang.Throwable -> L2a
            okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L2a
            r0.executed(r2)     // Catch: java.lang.Throwable -> L2a
            okhttp3.Response r0 = r2.getResponseWithInterceptorChain()     // Catch: java.lang.Throwable -> L2a
            okhttp3.OkHttpClient r1 = r2.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished(r2)
            return r0
        L2a:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r2.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished(r2)
            throw r0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "Already Executed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
            throw r0
    }

    okhttp3.Response getResponseWithInterceptorChain() throws java.io.IOException {
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            okhttp3.OkHttpClient r0 = r12.client
            java.util.List r0 = r0.interceptors()
            r1.addAll(r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            okhttp3.CookieJar r2 = r2.cookieJar()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            okhttp3.internal.cache.InternalCache r2 = r2.internalCache()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = new okhttp3.internal.connection.ConnectInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r12.forWebSocket
            if (r0 != 0) goto L4b
            okhttp3.OkHttpClient r0 = r12.client
            java.util.List r0 = r0.networkInterceptors()
            r1.addAll(r0)
        L4b:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r2 = r12.forWebSocket
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.RealInterceptorChain r10 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.Transmitter r2 = r12.transmitter
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r12.originalRequest
            okhttp3.OkHttpClient r0 = r12.client
            int r7 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r12.client
            int r8 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r12.client
            int r9 = r0.writeTimeoutMillis()
            r0 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r12.originalRequest     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            okhttp3.Response r2 = r10.proceed(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            okhttp3.internal.connection.Transmitter r3 = r12.transmitter     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.isCanceled()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            okhttp3.internal.connection.Transmitter r1 = r12.transmitter
            r1.noMoreExchanges(r0)
            return r2
        L8a:
            okhttp3.internal.Util.closeQuietly(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La4
        L97:
            r1 = move-exception
            r2 = 1
            okhttp3.internal.connection.Transmitter r3 = r12.transmitter     // Catch: java.lang.Throwable -> La0
            java.io.IOException r1 = r3.noMoreExchanges(r1)     // Catch: java.lang.Throwable -> La0
            throw r1     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        La4:
            if (r1 != 0) goto Lab
            okhttp3.internal.connection.Transmitter r1 = r12.transmitter
            r1.noMoreExchanges(r0)
        Lab:
            throw r2
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
            r1 = this;
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter
            boolean r0 = r0.isCanceled()
            return r0
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.executed     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    java.lang.String redactedUrl() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            return r0
    }

    @Override // okhttp3.Call
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    @Override // okhttp3.Call
    public okio.Timeout timeout() {
            r1 = this;
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    java.lang.String toLoggableString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.isCanceled()
            if (r1 == 0) goto Le
            java.lang.String r1 = "canceled "
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.forWebSocket
            if (r1 == 0) goto L1b
            java.lang.String r1 = "web socket"
            goto L1d
        L1b:
            java.lang.String r1 = "call"
        L1d:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.redactedUrl()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
