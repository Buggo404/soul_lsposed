package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
final class CallEnqueueObservable<T> extends io.reactivex.Observable<retrofit2.Response<T>> {
    private final retrofit2.Call<T> originalCall;

    private static final class CallCallback<T> implements io.reactivex.disposables.Disposable, retrofit2.Callback<T> {
        private final retrofit2.Call<?> call;
        private volatile boolean disposed;
        private final io.reactivex.Observer<? super retrofit2.Response<T>> observer;
        boolean terminated;

        CallCallback(retrofit2.Call<?> r2, io.reactivex.Observer<? super retrofit2.Response<T>> r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.terminated = r0
                r1.call = r2
                r1.observer = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                retrofit2.Call<?> r0 = r1.call
                r0.cancel()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // retrofit2.Callback
        public void onFailure(retrofit2.Call<T> r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r4 = r4.isCanceled()
                if (r4 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super retrofit2.Response<T>> r4 = r3.observer     // Catch: java.lang.Throwable -> Ld
                r4.onError(r5)     // Catch: java.lang.Throwable -> Ld
                goto L22
            Ld:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
                r1 = 2
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                r2 = 0
                r1[r2] = r5
                r5 = 1
                r1[r5] = r4
                r0.<init>(r1)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L22:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(retrofit2.Call<T> r5, retrofit2.Response<T> r6) {
                r4 = this;
                boolean r5 = r4.disposed
                if (r5 == 0) goto L5
                return
            L5:
                r5 = 1
                io.reactivex.Observer<? super retrofit2.Response<T>> r0 = r4.observer     // Catch: java.lang.Throwable -> L17
                r0.onNext(r6)     // Catch: java.lang.Throwable -> L17
                boolean r6 = r4.disposed     // Catch: java.lang.Throwable -> L17
                if (r6 != 0) goto L41
                r4.terminated = r5     // Catch: java.lang.Throwable -> L17
                io.reactivex.Observer<? super retrofit2.Response<T>> r6 = r4.observer     // Catch: java.lang.Throwable -> L17
                r6.onComplete()     // Catch: java.lang.Throwable -> L17
                goto L41
            L17:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                boolean r0 = r4.terminated
                if (r0 == 0) goto L23
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
                goto L41
            L23:
                boolean r0 = r4.disposed
                if (r0 != 0) goto L41
                io.reactivex.Observer<? super retrofit2.Response<T>> r0 = r4.observer     // Catch: java.lang.Throwable -> L2d
                r0.onError(r6)     // Catch: java.lang.Throwable -> L2d
                goto L41
            L2d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r6
                r2[r5] = r0
                r1.<init>(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
            L41:
                return
        }
    }

    CallEnqueueObservable(retrofit2.Call<T> r1) {
            r0 = this;
            r0.<init>()
            r0.originalCall = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super retrofit2.Response<T>> r3) {
            r2 = this;
            retrofit2.Call<T> r0 = r2.originalCall
            retrofit2.Call r0 = r0.mo371clone()
            retrofit2.adapter.rxjava2.CallEnqueueObservable$CallCallback r1 = new retrofit2.adapter.rxjava2.CallEnqueueObservable$CallCallback
            r1.<init>(r0, r3)
            r3.onSubscribe(r1)
            boolean r3 = r1.isDisposed()
            if (r3 != 0) goto L17
            r0.enqueue(r1)
        L17:
            return
    }
}
