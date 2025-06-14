package retrofit2;

/* loaded from: classes.dex */
final class CompletableFutureCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    static final retrofit2.CallAdapter.Factory INSTANCE = null;

    private static final class BodyCallAdapter<R> implements retrofit2.CallAdapter<R, java.util.concurrent.CompletableFuture<R>> {
        private final java.lang.reflect.Type responseType;

        private class BodyCallback implements retrofit2.Callback<R> {
            private final java.util.concurrent.CompletableFuture<R> future;
            final /* synthetic */ retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter this$0;

            public BodyCallback(retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter r1, java.util.concurrent.CompletableFuture<R> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.future = r2
                    return
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<R> r1, java.lang.Throwable r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<R> r1 = r0.future
                    r1.completeExceptionally(r2)
                    return
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<R> r2, retrofit2.Response<R> r3) {
                    r1 = this;
                    boolean r2 = r3.isSuccessful()
                    if (r2 == 0) goto L10
                    java.util.concurrent.CompletableFuture<R> r2 = r1.future
                    java.lang.Object r3 = r3.body()
                    r2.complete(r3)
                    goto L1a
                L10:
                    java.util.concurrent.CompletableFuture<R> r2 = r1.future
                    retrofit2.HttpException r0 = new retrofit2.HttpException
                    r0.<init>(r3)
                    r2.completeExceptionally(r0)
                L1a:
                    return
            }
        }

        BodyCallAdapter(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.responseType = r1
                return
        }

        @Override // retrofit2.CallAdapter
        public /* bridge */ /* synthetic */ java.lang.Object adapt(retrofit2.Call r1) {
                r0 = this;
                java.util.concurrent.CompletableFuture r1 = r0.adapt(r1)
                return r1
        }

        @Override // retrofit2.CallAdapter
        public java.util.concurrent.CompletableFuture<R> adapt(retrofit2.Call<R> r3) {
                r2 = this;
                retrofit2.CompletableFutureCallAdapterFactory$CallCancelCompletableFuture r0 = new retrofit2.CompletableFutureCallAdapterFactory$CallCancelCompletableFuture
                r0.<init>(r3)
                retrofit2.CompletableFutureCallAdapterFactory$BodyCallAdapter$BodyCallback r1 = new retrofit2.CompletableFutureCallAdapterFactory$BodyCallAdapter$BodyCallback
                r1.<init>(r2, r0)
                r3.enqueue(r1)
                return r0
        }

        @Override // retrofit2.CallAdapter
        public java.lang.reflect.Type responseType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.responseType
                return r0
        }
    }

    private static final class CallCancelCompletableFuture<T> extends java.util.concurrent.CompletableFuture<T> {
        private final retrofit2.Call<?> call;

        CallCancelCompletableFuture(retrofit2.Call<?> r1) {
                r0 = this;
                r0.<init>()
                r0.call = r1
                return
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L7
                retrofit2.Call<?> r0 = r1.call
                r0.cancel()
            L7:
                boolean r2 = super.cancel(r2)
                return r2
        }
    }

    private static final class ResponseCallAdapter<R> implements retrofit2.CallAdapter<R, java.util.concurrent.CompletableFuture<retrofit2.Response<R>>> {
        private final java.lang.reflect.Type responseType;

        private class ResponseCallback implements retrofit2.Callback<R> {
            private final java.util.concurrent.CompletableFuture<retrofit2.Response<R>> future;
            final /* synthetic */ retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter this$0;

            public ResponseCallback(retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter r1, java.util.concurrent.CompletableFuture<retrofit2.Response<R>> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.future = r2
                    return
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<R> r1, java.lang.Throwable r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<retrofit2.Response<R>> r1 = r0.future
                    r1.completeExceptionally(r2)
                    return
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<R> r1, retrofit2.Response<R> r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<retrofit2.Response<R>> r1 = r0.future
                    r1.complete(r2)
                    return
            }
        }

        ResponseCallAdapter(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.responseType = r1
                return
        }

        @Override // retrofit2.CallAdapter
        public /* bridge */ /* synthetic */ java.lang.Object adapt(retrofit2.Call r1) {
                r0 = this;
                java.util.concurrent.CompletableFuture r1 = r0.adapt(r1)
                return r1
        }

        @Override // retrofit2.CallAdapter
        public java.util.concurrent.CompletableFuture<retrofit2.Response<R>> adapt(retrofit2.Call<R> r3) {
                r2 = this;
                retrofit2.CompletableFutureCallAdapterFactory$CallCancelCompletableFuture r0 = new retrofit2.CompletableFutureCallAdapterFactory$CallCancelCompletableFuture
                r0.<init>(r3)
                retrofit2.CompletableFutureCallAdapterFactory$ResponseCallAdapter$ResponseCallback r1 = new retrofit2.CompletableFutureCallAdapterFactory$ResponseCallAdapter$ResponseCallback
                r1.<init>(r2, r0)
                r3.enqueue(r1)
                return r0
        }

        @Override // retrofit2.CallAdapter
        public java.lang.reflect.Type responseType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.responseType
                return r0
        }
    }

    static {
            retrofit2.CompletableFutureCallAdapterFactory r0 = new retrofit2.CompletableFutureCallAdapterFactory
            r0.<init>()
            retrofit2.CompletableFutureCallAdapterFactory.INSTANCE = r0
            return
    }

    CompletableFutureCallAdapterFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, retrofit2.Retrofit r4) {
            r1 = this;
            java.lang.Class r3 = getRawType(r2)
            java.lang.Class<java.util.concurrent.CompletableFuture> r4 = java.util.concurrent.CompletableFuture.class
            if (r3 == r4) goto La
            r2 = 0
            return r2
        La:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3b
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            r3 = 0
            java.lang.reflect.Type r2 = getParameterUpperBound(r3, r2)
            java.lang.Class r4 = getRawType(r2)
            java.lang.Class<retrofit2.Response> r0 = retrofit2.Response.class
            if (r4 == r0) goto L23
            retrofit2.CompletableFutureCallAdapterFactory$BodyCallAdapter r3 = new retrofit2.CompletableFutureCallAdapterFactory$BodyCallAdapter
            r3.<init>(r2)
            return r3
        L23:
            boolean r4 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L33
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = getParameterUpperBound(r3, r2)
            retrofit2.CompletableFutureCallAdapterFactory$ResponseCallAdapter r3 = new retrofit2.CompletableFutureCallAdapterFactory$ResponseCallAdapter
            r3.<init>(r2)
            return r3
        L33:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Response must be parameterized as Response<Foo> or Response<? extends Foo>"
            r2.<init>(r3)
            throw r2
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>"
            r2.<init>(r3)
            throw r2
    }
}
