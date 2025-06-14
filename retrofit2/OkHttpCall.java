package retrofit2;

/* loaded from: classes.dex */
final class OkHttpCall<T> implements retrofit2.Call<T> {
    private final java.lang.Object[] args;
    private final okhttp3.Call.Factory callFactory;
    private volatile boolean canceled;

    @javax.annotation.Nullable
    private java.lang.Throwable creationFailure;
    private boolean executed;

    @javax.annotation.Nullable
    private okhttp3.Call rawCall;
    private final retrofit2.RequestFactory requestFactory;
    private final retrofit2.Converter<okhttp3.ResponseBody, T> responseConverter;


    static final class ExceptionCatchingResponseBody extends okhttp3.ResponseBody {
        private final okhttp3.ResponseBody delegate;
        private final okio.BufferedSource delegateSource;

        @javax.annotation.Nullable
        java.io.IOException thrownException;


        ExceptionCatchingResponseBody(okhttp3.ResponseBody r2) {
                r1 = this;
                r1.<init>()
                r1.delegate = r2
                retrofit2.OkHttpCall$ExceptionCatchingResponseBody$1 r0 = new retrofit2.OkHttpCall$ExceptionCatchingResponseBody$1
                okio.BufferedSource r2 = r2.source()
                r0.<init>(r1, r2)
                okio.BufferedSource r2 = okio.Okio.buffer(r0)
                r1.delegateSource = r2
                return
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.delegate
                r0.close()
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r2 = this;
                okhttp3.ResponseBody r0 = r2.delegate
                long r0 = r0.contentLength()
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.delegate
                okhttp3.MediaType r0 = r0.contentType()
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
                r1 = this;
                okio.BufferedSource r0 = r1.delegateSource
                return r0
        }

        void throwIfCaught() throws java.io.IOException {
                r1 = this;
                java.io.IOException r0 = r1.thrownException
                if (r0 != 0) goto L5
                return
            L5:
                throw r0
        }
    }

    static final class NoContentResponseBody extends okhttp3.ResponseBody {
        private final long contentLength;

        @javax.annotation.Nullable
        private final okhttp3.MediaType contentType;

        NoContentResponseBody(@javax.annotation.Nullable okhttp3.MediaType r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.contentType = r1
                r0.contentLength = r2
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r2 = this;
                long r0 = r2.contentLength
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
                r1 = this;
                okhttp3.MediaType r0 = r1.contentType
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot read raw response body of a converted body."
                r0.<init>(r1)
                throw r0
        }
    }

    OkHttpCall(retrofit2.RequestFactory r1, java.lang.Object[] r2, okhttp3.Call.Factory r3, retrofit2.Converter<okhttp3.ResponseBody, T> r4) {
            r0 = this;
            r0.<init>()
            r0.requestFactory = r1
            r0.args = r2
            r0.callFactory = r3
            r0.responseConverter = r4
            return
    }

    private okhttp3.Call createRawCall() throws java.io.IOException {
            r3 = this;
            okhttp3.Call$Factory r0 = r3.callFactory
            retrofit2.RequestFactory r1 = r3.requestFactory
            java.lang.Object[] r2 = r3.args
            okhttp3.Request r1 = r1.create(r2)
            okhttp3.Call r0 = r0.newCall(r1)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Call.Factory returned null."
            r0.<init>(r1)
            throw r0
    }

    private okhttp3.Call getRawCall() throws java.io.IOException {
            r2 = this;
            okhttp3.Call r0 = r2.rawCall
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Throwable r0 = r2.creationFailure
            if (r0 == 0) goto L1a
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L14
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L14:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L17:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L1a:
            okhttp3.Call r0 = r2.createRawCall()     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            r2.rawCall = r0     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            return r0
        L21:
            r0 = move-exception
            goto L26
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            retrofit2.Utils.throwIfFatal(r0)
            r2.creationFailure = r0
            throw r0
    }

    @Override // retrofit2.Call
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.canceled = r0
            monitor-enter(r1)
            okhttp3.Call r0 = r1.rawCall     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.cancel()
        Lc:
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            retrofit2.OkHttpCall r0 = r1.mo371clone()
            return r0
    }

    @Override // retrofit2.Call
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ retrofit2.Call mo371clone() {
            r1 = this;
            retrofit2.OkHttpCall r0 = r1.mo371clone()
            return r0
    }

    @Override // retrofit2.Call
    /* renamed from: clone */
    public retrofit2.OkHttpCall<T> mo371clone() {
            r5 = this;
            retrofit2.OkHttpCall r0 = new retrofit2.OkHttpCall
            retrofit2.RequestFactory r1 = r5.requestFactory
            java.lang.Object[] r2 = r5.args
            okhttp3.Call$Factory r3 = r5.callFactory
            retrofit2.Converter<okhttp3.ResponseBody, T> r4 = r5.responseConverter
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // retrofit2.Call
    public void enqueue(retrofit2.Callback<T> r4) {
            r3 = this;
            java.lang.String r0 = "callback == null"
            java.util.Objects.requireNonNull(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.executed     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L3a
            r0 = 1
            r3.executed = r0     // Catch: java.lang.Throwable -> L42
            okhttp3.Call r0 = r3.rawCall     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r1 = r3.creationFailure     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L23
            if (r1 != 0) goto L23
            okhttp3.Call r2 = r3.createRawCall()     // Catch: java.lang.Throwable -> L1d
            r3.rawCall = r2     // Catch: java.lang.Throwable -> L1d
            r0 = r2
            goto L23
        L1d:
            r1 = move-exception
            retrofit2.Utils.throwIfFatal(r1)     // Catch: java.lang.Throwable -> L42
            r3.creationFailure = r1     // Catch: java.lang.Throwable -> L42
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2a
            r4.onFailure(r3, r1)
            return
        L2a:
            boolean r1 = r3.canceled
            if (r1 == 0) goto L31
            r0.cancel()
        L31:
            retrofit2.OkHttpCall$1 r1 = new retrofit2.OkHttpCall$1
            r1.<init>(r3, r4)
            r0.enqueue(r1)
            return
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Already executed."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L42:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r4
    }

    @Override // retrofit2.Call
    public retrofit2.Response<T> execute() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.executed     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1d
            r0 = 1
            r2.executed = r0     // Catch: java.lang.Throwable -> L25
            okhttp3.Call r0 = r2.getRawCall()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r2.canceled
            if (r1 == 0) goto L14
            r0.cancel()
        L14:
            okhttp3.Response r0 = r0.execute()
            retrofit2.Response r0 = r2.parseResponse(r0)
            return r0
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "Already executed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L25:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
            r2 = this;
            boolean r0 = r2.canceled
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            okhttp3.Call r0 = r2.rawCall     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            boolean r0 = r0.isCanceled()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // retrofit2.Call
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

    retrofit2.Response<T> parseResponse(okhttp3.Response r6) throws java.io.IOException {
            r5 = this;
            okhttp3.ResponseBody r0 = r6.body()
            okhttp3.Response$Builder r6 = r6.newBuilder()
            retrofit2.OkHttpCall$NoContentResponseBody r1 = new retrofit2.OkHttpCall$NoContentResponseBody
            okhttp3.MediaType r2 = r0.contentType()
            long r3 = r0.contentLength()
            r1.<init>(r2, r3)
            okhttp3.Response$Builder r6 = r6.body(r1)
            okhttp3.Response r6 = r6.build()
            int r1 = r6.code()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L51
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 < r2) goto L2a
            goto L51
        L2a:
            r2 = 204(0xcc, float:2.86E-43)
            if (r1 == r2) goto L48
            r2 = 205(0xcd, float:2.87E-43)
            if (r1 != r2) goto L33
            goto L48
        L33:
            retrofit2.OkHttpCall$ExceptionCatchingResponseBody r1 = new retrofit2.OkHttpCall$ExceptionCatchingResponseBody
            r1.<init>(r0)
            retrofit2.Converter<okhttp3.ResponseBody, T> r0 = r5.responseConverter     // Catch: java.lang.RuntimeException -> L43
            java.lang.Object r0 = r0.convert(r1)     // Catch: java.lang.RuntimeException -> L43
            retrofit2.Response r6 = retrofit2.Response.success(r0, r6)     // Catch: java.lang.RuntimeException -> L43
            return r6
        L43:
            r6 = move-exception
            r1.throwIfCaught()
            throw r6
        L48:
            r0.close()
            r0 = 0
            retrofit2.Response r6 = retrofit2.Response.success(r0, r6)
            return r6
        L51:
            okhttp3.ResponseBody r1 = retrofit2.Utils.buffer(r0)     // Catch: java.lang.Throwable -> L5d
            retrofit2.Response r6 = retrofit2.Response.error(r1, r6)     // Catch: java.lang.Throwable -> L5d
            r0.close()
            return r6
        L5d:
            r6 = move-exception
            r0.close()
            throw r6
    }

    @Override // retrofit2.Call
    public synchronized okhttp3.Request request() {
            r3 = this;
            monitor-enter(r3)
            okhttp3.Call r0 = r3.getRawCall()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            okhttp3.Request r0 = r0.request()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            monitor-exit(r3)
            return r0
        Lb:
            r0 = move-exception
            goto L16
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "Unable to create request."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L16:
            monitor-exit(r3)
            throw r0
    }

    @Override // retrofit2.Call
    public synchronized okio.Timeout timeout() {
            r3 = this;
            monitor-enter(r3)
            okhttp3.Call r0 = r3.getRawCall()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            okio.Timeout r0 = r0.timeout()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            monitor-exit(r3)
            return r0
        Lb:
            r0 = move-exception
            goto L16
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "Unable to create call."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L16:
            monitor-exit(r3)
            throw r0
    }
}
