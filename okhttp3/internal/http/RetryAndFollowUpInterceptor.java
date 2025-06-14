package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final okhttp3.OkHttpClient client;

    public RetryAndFollowUpInterceptor(okhttp3.OkHttpClient r1) {
            r0 = this;
            r0.<init>()
            r0.client = r1
            return
    }

    private okhttp3.Request followUpRequest(okhttp3.Response r7, @javax.annotation.Nullable okhttp3.Route r8) throws java.io.IOException {
            r6 = this;
            if (r7 == 0) goto L15d
            int r0 = r7.code()
            okhttp3.Request r1 = r7.request()
            java.lang.String r1 = r1.method()
            r2 = 307(0x133, float:4.3E-43)
            java.lang.String r3 = "GET"
            r4 = 0
            if (r0 == r2) goto Lb8
            r2 = 308(0x134, float:4.32E-43)
            if (r0 == r2) goto Lb8
            r2 = 401(0x191, float:5.62E-43)
            if (r0 == r2) goto Lad
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L8d
            r2 = 407(0x197, float:5.7E-43)
            if (r0 == r2) goto L65
            r8 = 408(0x198, float:5.72E-43)
            if (r0 == r8) goto L2d
            switch(r0) {
                case 300: goto Lc7;
                case 301: goto Lc7;
                case 302: goto Lc7;
                case 303: goto Lc7;
                default: goto L2c;
            }
        L2c:
            return r4
        L2d:
            okhttp3.OkHttpClient r0 = r6.client
            boolean r0 = r0.retryOnConnectionFailure()
            if (r0 != 0) goto L36
            return r4
        L36:
            okhttp3.Request r0 = r7.request()
            okhttp3.RequestBody r0 = r0.body()
            if (r0 == 0) goto L47
            boolean r0 = r0.isOneShot()
            if (r0 == 0) goto L47
            return r4
        L47:
            okhttp3.Response r0 = r7.priorResponse()
            if (r0 == 0) goto L58
            okhttp3.Response r0 = r7.priorResponse()
            int r0 = r0.code()
            if (r0 != r8) goto L58
            return r4
        L58:
            r8 = 0
            int r8 = r6.retryAfter(r7, r8)
            if (r8 <= 0) goto L60
            return r4
        L60:
            okhttp3.Request r7 = r7.request()
            return r7
        L65:
            if (r8 == 0) goto L6c
            java.net.Proxy r0 = r8.proxy()
            goto L72
        L6c:
            okhttp3.OkHttpClient r0 = r6.client
            java.net.Proxy r0 = r0.proxy()
        L72:
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L85
            okhttp3.OkHttpClient r0 = r6.client
            okhttp3.Authenticator r0 = r0.proxyAuthenticator()
            okhttp3.Request r7 = r0.authenticate(r8, r7)
            return r7
        L85:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.String r8 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r7.<init>(r8)
            throw r7
        L8d:
            okhttp3.Response r8 = r7.priorResponse()
            if (r8 == 0) goto L9e
            okhttp3.Response r8 = r7.priorResponse()
            int r8 = r8.code()
            if (r8 != r2) goto L9e
            return r4
        L9e:
            r8 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r6.retryAfter(r7, r8)
            if (r8 != 0) goto Lac
            okhttp3.Request r7 = r7.request()
            return r7
        Lac:
            return r4
        Lad:
            okhttp3.OkHttpClient r0 = r6.client
            okhttp3.Authenticator r0 = r0.authenticator()
            okhttp3.Request r7 = r0.authenticate(r8, r7)
            return r7
        Lb8:
            boolean r8 = r1.equals(r3)
            if (r8 != 0) goto Lc7
            java.lang.String r8 = "HEAD"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto Lc7
            return r4
        Lc7:
            okhttp3.OkHttpClient r8 = r6.client
            boolean r8 = r8.followRedirects()
            if (r8 != 0) goto Ld0
            return r4
        Ld0:
            java.lang.String r8 = "Location"
            java.lang.String r8 = r7.header(r8)
            if (r8 != 0) goto Ld9
            return r4
        Ld9:
            okhttp3.Request r0 = r7.request()
            okhttp3.HttpUrl r0 = r0.url()
            okhttp3.HttpUrl r8 = r0.resolve(r8)
            if (r8 != 0) goto Le8
            return r4
        Le8:
            java.lang.String r0 = r8.scheme()
            okhttp3.Request r2 = r7.request()
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = r2.scheme()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L107
            okhttp3.OkHttpClient r0 = r6.client
            boolean r0 = r0.followSslRedirects()
            if (r0 != 0) goto L107
            return r4
        L107:
            okhttp3.Request r0 = r7.request()
            okhttp3.Request$Builder r0 = r0.newBuilder()
            boolean r2 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r1)
            if (r2 == 0) goto L141
            boolean r2 = okhttp3.internal.http.HttpMethod.redirectsWithBody(r1)
            boolean r5 = okhttp3.internal.http.HttpMethod.redirectsToGet(r1)
            if (r5 == 0) goto L123
            r0.method(r3, r4)
            goto L130
        L123:
            if (r2 == 0) goto L12d
            okhttp3.Request r3 = r7.request()
            okhttp3.RequestBody r4 = r3.body()
        L12d:
            r0.method(r1, r4)
        L130:
            if (r2 != 0) goto L141
            java.lang.String r1 = "Transfer-Encoding"
            r0.removeHeader(r1)
            java.lang.String r1 = "Content-Length"
            r0.removeHeader(r1)
            java.lang.String r1 = "Content-Type"
            r0.removeHeader(r1)
        L141:
            okhttp3.Request r7 = r7.request()
            okhttp3.HttpUrl r7 = r7.url()
            boolean r7 = okhttp3.internal.Util.sameConnection(r7, r8)
            if (r7 != 0) goto L154
            java.lang.String r7 = "Authorization"
            r0.removeHeader(r7)
        L154:
            okhttp3.Request$Builder r7 = r0.url(r8)
            okhttp3.Request r7 = r7.build()
            return r7
        L15d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
    }

    private boolean isRecoverable(java.io.IOException r4, boolean r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.net.ProtocolException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            r2 = 1
            if (r0 == 0) goto L13
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L12
            if (r5 != 0) goto L12
            r1 = r2
        L12:
            return r1
        L13:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L20
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L20
            return r1
        L20:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L25
            return r1
        L25:
            return r2
    }

    private boolean recover(java.io.IOException r3, okhttp3.internal.connection.Transmitter r4, boolean r5, okhttp3.Request r6) {
            r2 = this;
            okhttp3.OkHttpClient r0 = r2.client
            boolean r0 = r0.retryOnConnectionFailure()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r5 == 0) goto L13
            boolean r6 = r2.requestIsOneShot(r3, r6)
            if (r6 == 0) goto L13
            return r1
        L13:
            boolean r3 = r2.isRecoverable(r3, r5)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            boolean r3 = r4.canRetry()
            if (r3 != 0) goto L21
            return r1
        L21:
            r3 = 1
            return r3
    }

    private boolean requestIsOneShot(java.io.IOException r1, okhttp3.Request r2) {
            r0 = this;
            okhttp3.RequestBody r2 = r2.body()
            if (r2 == 0) goto Lc
            boolean r2 = r2.isOneShot()
            if (r2 != 0) goto L10
        Lc:
            boolean r1 = r1 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private int retryAfter(okhttp3.Response r2, int r3) {
            r1 = this;
            java.lang.String r0 = "Retry-After"
            java.lang.String r2 = r2.header(r0)
            if (r2 != 0) goto L9
            return r3
        L9:
            java.lang.String r3 = "\\d+"
            boolean r3 = r2.matches(r3)
            if (r3 == 0) goto L1a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            return r2
        L1a:
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
            r8 = this;
            okhttp3.Request r0 = r9.request()
            okhttp3.internal.http.RealInterceptorChain r9 = (okhttp3.internal.http.RealInterceptorChain) r9
            okhttp3.internal.connection.Transmitter r1 = r9.transmitter()
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = r3
        Le:
            r1.prepareToConnect(r0)
            boolean r6 = r1.isCanceled()
            if (r6 != 0) goto Lbf
            okhttp3.Response r0 = r9.proceed(r0, r1, r3)     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96 okhttp3.internal.connection.RouteException -> La6
            if (r4 == 0) goto L35
            okhttp3.Response$Builder r0 = r0.newBuilder()
            okhttp3.Response$Builder r4 = r4.newBuilder()
            okhttp3.Response$Builder r4 = r4.body(r3)
            okhttp3.Response r4 = r4.build()
            okhttp3.Response$Builder r0 = r0.priorResponse(r4)
            okhttp3.Response r0 = r0.build()
        L35:
            r4 = r0
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance
            okhttp3.internal.connection.Exchange r0 = r0.exchange(r4)
            if (r0 == 0) goto L47
            okhttp3.internal.connection.RealConnection r6 = r0.connection()
            okhttp3.Route r6 = r6.route()
            goto L48
        L47:
            r6 = r3
        L48:
            okhttp3.Request r6 = r8.followUpRequest(r4, r6)
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L59
            boolean r9 = r0.isDuplex()
            if (r9 == 0) goto L59
            r1.timeoutEarlyExit()
        L59:
            return r4
        L5a:
            okhttp3.RequestBody r7 = r6.body()
            if (r7 == 0) goto L67
            boolean r7 = r7.isOneShot()
            if (r7 == 0) goto L67
            return r4
        L67:
            okhttp3.ResponseBody r7 = r4.body()
            okhttp3.internal.Util.closeQuietly(r7)
            boolean r7 = r1.hasExchange()
            if (r7 == 0) goto L77
            r0.detachWithViolence()
        L77:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L7f
            r0 = r6
            goto Le
        L7f:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Too many follow-up requests: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L94:
            r9 = move-exception
            goto Lbb
        L96:
            r6 = move-exception
            boolean r7 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L9d
            r7 = 1
            goto L9e
        L9d:
            r7 = r2
        L9e:
            boolean r7 = r8.recover(r6, r1, r7, r0)     // Catch: java.lang.Throwable -> L94
            if (r7 == 0) goto La5
            goto Lb1
        La5:
            throw r6     // Catch: java.lang.Throwable -> L94
        La6:
            r6 = move-exception
            java.io.IOException r7 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L94
            boolean r7 = r8.recover(r7, r1, r2, r0)     // Catch: java.lang.Throwable -> L94
            if (r7 == 0) goto Lb6
        Lb1:
            r1.exchangeDoneDueToException()
            goto Le
        Lb6:
            java.io.IOException r9 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L94
            throw r9     // Catch: java.lang.Throwable -> L94
        Lbb:
            r1.exchangeDoneDueToException()
            throw r9
        Lbf:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
    }
}
