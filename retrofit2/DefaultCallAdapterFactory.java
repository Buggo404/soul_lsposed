package retrofit2;

/* loaded from: classes.dex */
final class DefaultCallAdapterFactory extends retrofit2.CallAdapter.Factory {

    @javax.annotation.Nullable
    private final java.util.concurrent.Executor callbackExecutor;


    static final class ExecutorCallbackCall<T> implements retrofit2.Call<T> {
        final java.util.concurrent.Executor callbackExecutor;
        final retrofit2.Call<T> delegate;

        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1 */
        class C12491 implements retrofit2.Callback<T> {
            final /* synthetic */ retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall this$0;
            final /* synthetic */ retrofit2.Callback val$callback;

            C12491(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall r1, retrofit2.Callback r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.val$callback = r2
                    r0.<init>()
                    return
            }

            /* renamed from: lambda$onFailure$1$retrofit2-DefaultCallAdapterFactory$ExecutorCallbackCall$1 */
            /* synthetic */ void m123x714e864(retrofit2.Callback r2, java.lang.Throwable r3) {
                    r1 = this;
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r0 = r1.this$0
                    r2.onFailure(r0, r3)
                    return
            }

            /* renamed from: lambda$onResponse$0$retrofit2-DefaultCallAdapterFactory$ExecutorCallbackCall$1 */
            /* synthetic */ void m124xddacc936(retrofit2.Callback r3, retrofit2.Response r4) {
                    r2 = this;
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r0 = r2.this$0
                    retrofit2.Call<T> r0 = r0.delegate
                    boolean r0 = r0.isCanceled()
                    if (r0 == 0) goto L17
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r4 = r2.this$0
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.String r1 = "Canceled"
                    r0.<init>(r1)
                    r3.onFailure(r4, r0)
                    goto L1c
                L17:
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r0 = r2.this$0
                    r3.onResponse(r0, r4)
                L1c:
                    return
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> r3, java.lang.Throwable r4) {
                    r2 = this;
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r3 = r2.this$0
                    java.util.concurrent.Executor r3 = r3.callbackExecutor
                    retrofit2.Callback r0 = r2.val$callback
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda1 r1 = new retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda1
                    r1.<init>(r2, r0, r4)
                    r3.execute(r1)
                    return
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> r3, retrofit2.Response<T> r4) {
                    r2 = this;
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r3 = r2.this$0
                    java.util.concurrent.Executor r3 = r3.callbackExecutor
                    retrofit2.Callback r0 = r2.val$callback
                    retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda0 r1 = new retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda0
                    r1.<init>(r2, r0, r4)
                    r3.execute(r1)
                    return
            }
        }

        ExecutorCallbackCall(java.util.concurrent.Executor r1, retrofit2.Call<T> r2) {
                r0 = this;
                r0.<init>()
                r0.callbackExecutor = r1
                r0.delegate = r2
                return
        }

        @Override // retrofit2.Call
        public void cancel() {
                r1 = this;
                retrofit2.Call<T> r0 = r1.delegate
                r0.cancel()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                retrofit2.Call r0 = r1.mo371clone()
                return r0
        }

        @Override // retrofit2.Call
        /* renamed from: clone, reason: collision with other method in class */
        public retrofit2.Call<T> mo371clone() {
                r3 = this;
                retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall r0 = new retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall
                java.util.concurrent.Executor r1 = r3.callbackExecutor
                retrofit2.Call<T> r2 = r3.delegate
                retrofit2.Call r2 = r2.mo371clone()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // retrofit2.Call
        public void enqueue(retrofit2.Callback<T> r3) {
                r2 = this;
                java.lang.String r0 = "callback == null"
                java.util.Objects.requireNonNull(r3, r0)
                retrofit2.Call<T> r0 = r2.delegate
                retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1 r1 = new retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1
                r1.<init>(r2, r3)
                r0.enqueue(r1)
                return
        }

        @Override // retrofit2.Call
        public retrofit2.Response<T> execute() throws java.io.IOException {
                r1 = this;
                retrofit2.Call<T> r0 = r1.delegate
                retrofit2.Response r0 = r0.execute()
                return r0
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
                r1 = this;
                retrofit2.Call<T> r0 = r1.delegate
                boolean r0 = r0.isCanceled()
                return r0
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
                r1 = this;
                retrofit2.Call<T> r0 = r1.delegate
                boolean r0 = r0.isExecuted()
                return r0
        }

        @Override // retrofit2.Call
        public okhttp3.Request request() {
                r1 = this;
                retrofit2.Call<T> r0 = r1.delegate
                okhttp3.Request r0 = r0.request()
                return r0
        }

        @Override // retrofit2.Call
        public okio.Timeout timeout() {
                r1 = this;
                retrofit2.Call<T> r0 = r1.delegate
                okio.Timeout r0 = r0.timeout()
                return r0
        }
    }

    DefaultCallAdapterFactory(@javax.annotation.Nullable java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.callbackExecutor = r1
            return
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, retrofit2.Retrofit r5) {
            r2 = this;
            java.lang.Class r5 = getRawType(r3)
            java.lang.Class<retrofit2.Call> r0 = retrofit2.Call.class
            r1 = 0
            if (r5 == r0) goto La
            return r1
        La:
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L26
            r5 = 0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = retrofit2.Utils.getParameterUpperBound(r5, r3)
            java.lang.Class<retrofit2.SkipCallbackExecutor> r5 = retrofit2.SkipCallbackExecutor.class
            boolean r4 = retrofit2.Utils.isAnnotationPresent(r4, r5)
            if (r4 == 0) goto L1e
            goto L20
        L1e:
            java.util.concurrent.Executor r1 = r2.callbackExecutor
        L20:
            retrofit2.DefaultCallAdapterFactory$1 r4 = new retrofit2.DefaultCallAdapterFactory$1
            r4.<init>(r2, r3, r1)
            return r4
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Call return type must be parameterized as Call<Foo> or Call<? extends Foo>"
            r3.<init>(r4)
            throw r3
    }
}
