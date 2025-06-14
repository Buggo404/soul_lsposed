package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
final class ResultObservable<T> extends io.reactivex.Observable<retrofit2.adapter.rxjava2.Result<T>> {
    private final io.reactivex.Observable<retrofit2.Response<T>> upstream;

    private static class ResultObserver<R> implements io.reactivex.Observer<retrofit2.Response<R>> {
        private final io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> observer;

        ResultObserver(io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r0 = r1.observer
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r0 = r4.observer     // Catch: java.lang.Throwable -> Lf
                retrofit2.adapter.rxjava2.Result r5 = retrofit2.adapter.rxjava2.Result.error(r5)     // Catch: java.lang.Throwable -> Lf
                r0.onNext(r5)     // Catch: java.lang.Throwable -> Lf
                io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r5 = r4.observer
                r5.onComplete()
                return
            Lf:
                r5 = move-exception
                io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r0 = r4.observer     // Catch: java.lang.Throwable -> L16
                r0.onError(r5)     // Catch: java.lang.Throwable -> L16
                goto L2b
            L16:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r1.<init>(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
            L2b:
                return
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                retrofit2.Response r1 = (retrofit2.Response) r1
                r0.onNext(r1)
                return
        }

        public void onNext(retrofit2.Response<R> r2) {
                r1 = this;
                io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r0 = r1.observer
                retrofit2.adapter.rxjava2.Result r2 = retrofit2.adapter.rxjava2.Result.response(r2)
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> r0 = r1.observer
                r0.onSubscribe(r2)
                return
        }
    }

    ResultObservable(io.reactivex.Observable<retrofit2.Response<T>> r1) {
            r0 = this;
            r0.<init>()
            r0.upstream = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<T>> r3) {
            r2 = this;
            io.reactivex.Observable<retrofit2.Response<T>> r0 = r2.upstream
            retrofit2.adapter.rxjava2.ResultObservable$ResultObserver r1 = new retrofit2.adapter.rxjava2.ResultObservable$ResultObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
