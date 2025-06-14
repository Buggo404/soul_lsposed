package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
final class CallExecuteObservable<T> extends io.reactivex.Observable<retrofit2.Response<T>> {
    private final retrofit2.Call<T> originalCall;

    private static final class CallDisposable implements io.reactivex.disposables.Disposable {
        private final retrofit2.Call<?> call;
        private volatile boolean disposed;

        CallDisposable(retrofit2.Call<?> r1) {
                r0 = this;
                r0.<init>()
                r0.call = r1
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
    }

    CallExecuteObservable(retrofit2.Call<T> r1) {
            r0 = this;
            r0.<init>()
            r0.originalCall = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super retrofit2.Response<T>> r6) {
            r5 = this;
            retrofit2.Call<T> r0 = r5.originalCall
            retrofit2.Call r0 = r0.mo371clone()
            retrofit2.adapter.rxjava2.CallExecuteObservable$CallDisposable r1 = new retrofit2.adapter.rxjava2.CallExecuteObservable$CallDisposable
            r1.<init>(r0)
            r6.onSubscribe(r1)
            boolean r2 = r1.isDisposed()
            if (r2 == 0) goto L15
            return
        L15:
            r2 = 1
            r3 = 0
            retrofit2.Response r0 = r0.execute()     // Catch: java.lang.Throwable -> L31
            boolean r4 = r1.isDisposed()     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L24
            r6.onNext(r0)     // Catch: java.lang.Throwable -> L31
        L24:
            boolean r0 = r1.isDisposed()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L59
            r6.onComplete()     // Catch: java.lang.Throwable -> L2e
            goto L59
        L2e:
            r0 = move-exception
            r4 = r2
            goto L33
        L31:
            r0 = move-exception
            r4 = r3
        L33:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            if (r4 == 0) goto L3c
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            goto L59
        L3c:
            boolean r1 = r1.isDisposed()
            if (r1 != 0) goto L59
            r6.onError(r0)     // Catch: java.lang.Throwable -> L46
            goto L59
        L46:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r3] = r0
            r4[r2] = r6
            r1.<init>(r4)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L59:
            return
    }
}
