package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {
    private final okhttp3.Call call;
    private int calls;
    private final int connectTimeout;

    @javax.annotation.Nullable
    private final okhttp3.internal.connection.Exchange exchange;
    private final int index;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final int readTimeout;
    private final okhttp3.Request request;
    private final okhttp3.internal.connection.Transmitter transmitter;
    private final int writeTimeout;

    public RealInterceptorChain(java.util.List<okhttp3.Interceptor> r1, okhttp3.internal.connection.Transmitter r2, @javax.annotation.Nullable okhttp3.internal.connection.Exchange r3, int r4, okhttp3.Request r5, okhttp3.Call r6, int r7, int r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.interceptors = r1
            r0.transmitter = r2
            r0.exchange = r3
            r0.index = r4
            r0.request = r5
            r0.call = r6
            r0.connectTimeout = r7
            r0.readTimeout = r8
            r0.writeTimeout = r9
            return
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Call call() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeout
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    @javax.annotation.Nullable
    public okhttp3.Connection connection() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L9
            okhttp3.internal.connection.RealConnection r0 = r0.connection()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public okhttp3.internal.connection.Exchange exchange() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Response proceed(okhttp3.Request r3) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.connection.Transmitter r0 = r2.transmitter
            okhttp3.internal.connection.Exchange r1 = r2.exchange
            okhttp3.Response r3 = r2.proceed(r3, r0, r1)
            return r3
    }

    public okhttp3.Response proceed(okhttp3.Request r16, okhttp3.internal.connection.Transmitter r17, @javax.annotation.Nullable okhttp3.internal.connection.Exchange r18) throws java.io.IOException {
            r15 = this;
            r0 = r15
            int r1 = r0.index
            java.util.List<okhttp3.Interceptor> r2 = r0.interceptors
            int r2 = r2.size()
            if (r1 >= r2) goto L101
            int r1 = r0.calls
            r2 = 1
            int r1 = r1 + r2
            r0.calls = r1
            okhttp3.internal.connection.Exchange r1 = r0.exchange
            java.lang.String r3 = "network interceptor "
            if (r1 == 0) goto L48
            okhttp3.internal.connection.RealConnection r1 = r1.connection()
            okhttp3.HttpUrl r4 = r16.url()
            boolean r1 = r1.supportsUrl(r4)
            if (r1 == 0) goto L26
            goto L48
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.util.List<okhttp3.Interceptor> r3 = r0.interceptors
            int r5 = r0.index
            int r5 = r5 - r2
            java.lang.Object r2 = r3.get(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r3 = " must retain the same host and port"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L48:
            okhttp3.internal.connection.Exchange r1 = r0.exchange
            java.lang.String r4 = " must call proceed() exactly once"
            if (r1 == 0) goto L73
            int r1 = r0.calls
            if (r1 > r2) goto L53
            goto L73
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.util.List<okhttp3.Interceptor> r3 = r0.interceptors
            int r6 = r0.index
            int r6 = r6 - r2
            java.lang.Object r2 = r3.get(r6)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L73:
            okhttp3.internal.http.RealInterceptorChain r1 = new okhttp3.internal.http.RealInterceptorChain
            java.util.List<okhttp3.Interceptor> r6 = r0.interceptors
            int r5 = r0.index
            int r9 = r5 + 1
            okhttp3.Call r11 = r0.call
            int r12 = r0.connectTimeout
            int r13 = r0.readTimeout
            int r14 = r0.writeTimeout
            r5 = r1
            r7 = r17
            r8 = r18
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.List<okhttp3.Interceptor> r5 = r0.interceptors
            int r6 = r0.index
            java.lang.Object r5 = r5.get(r6)
            okhttp3.Interceptor r5 = (okhttp3.Interceptor) r5
            okhttp3.Response r6 = r5.intercept(r1)
            if (r18 == 0) goto Lc4
            int r7 = r0.index
            int r7 = r7 + r2
            java.util.List<okhttp3.Interceptor> r8 = r0.interceptors
            int r8 = r8.size()
            if (r7 >= r8) goto Lc4
            int r1 = r1.calls
            if (r1 != r2) goto Lad
            goto Lc4
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lc4:
            java.lang.String r1 = "interceptor "
            if (r6 == 0) goto Le8
            okhttp3.ResponseBody r2 = r6.body()
            if (r2 == 0) goto Lcf
            return r6
        Lcf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.StringBuilder r1 = r3.append(r5)
            java.lang.String r3 = " returned a response with no body"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Le8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.StringBuilder r1 = r3.append(r5)
            java.lang.String r3 = " returned null"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L101:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeout
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public okhttp3.internal.connection.Transmitter transmitter() {
            r1 = this;
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withConnectTimeout(int r14, java.util.concurrent.TimeUnit r15) {
            r13 = this;
            java.lang.String r0 = "timeout"
            long r1 = (long) r14
            int r10 = okhttp3.internal.Util.checkDuration(r0, r1, r15)
            okhttp3.internal.http.RealInterceptorChain r14 = new okhttp3.internal.http.RealInterceptorChain
            java.util.List<okhttp3.Interceptor> r4 = r13.interceptors
            okhttp3.internal.connection.Transmitter r5 = r13.transmitter
            okhttp3.internal.connection.Exchange r6 = r13.exchange
            int r7 = r13.index
            okhttp3.Request r8 = r13.request
            okhttp3.Call r9 = r13.call
            int r11 = r13.readTimeout
            int r12 = r13.writeTimeout
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withReadTimeout(int r14, java.util.concurrent.TimeUnit r15) {
            r13 = this;
            java.lang.String r0 = "timeout"
            long r1 = (long) r14
            int r11 = okhttp3.internal.Util.checkDuration(r0, r1, r15)
            okhttp3.internal.http.RealInterceptorChain r14 = new okhttp3.internal.http.RealInterceptorChain
            java.util.List<okhttp3.Interceptor> r4 = r13.interceptors
            okhttp3.internal.connection.Transmitter r5 = r13.transmitter
            okhttp3.internal.connection.Exchange r6 = r13.exchange
            int r7 = r13.index
            okhttp3.Request r8 = r13.request
            okhttp3.Call r9 = r13.call
            int r10 = r13.connectTimeout
            int r12 = r13.writeTimeout
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withWriteTimeout(int r14, java.util.concurrent.TimeUnit r15) {
            r13 = this;
            java.lang.String r0 = "timeout"
            long r1 = (long) r14
            int r12 = okhttp3.internal.Util.checkDuration(r0, r1, r15)
            okhttp3.internal.http.RealInterceptorChain r14 = new okhttp3.internal.http.RealInterceptorChain
            java.util.List<okhttp3.Interceptor> r4 = r13.interceptors
            okhttp3.internal.connection.Transmitter r5 = r13.transmitter
            okhttp3.internal.connection.Exchange r6 = r13.exchange
            int r7 = r13.index
            okhttp3.Request r8 = r13.request
            okhttp3.Call r9 = r13.call
            int r10 = r13.connectTimeout
            int r11 = r13.readTimeout
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeout
            return r0
    }
}
