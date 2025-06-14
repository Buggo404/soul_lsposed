package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
final class BodyObservable<T> extends io.reactivex.Observable<T> {
    private final io.reactivex.Observable<retrofit2.Response<T>> upstream;

    private static class BodyObserver<R> implements io.reactivex.Observer<retrofit2.Response<R>> {
        private final io.reactivex.Observer<? super R> observer;
        private boolean terminated;

        BodyObserver(io.reactivex.Observer<? super R> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.terminated
                if (r0 != 0) goto L9
                io.reactivex.Observer<? super R> r0 = r1.observer
                r0.onComplete()
            L9:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.terminated
                if (r0 != 0) goto La
                io.reactivex.Observer<? super R> r0 = r2.observer
                r0.onError(r3)
                goto L17
            La:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "This should never happen! Report as a bug with the full stacktrace."
                r0.<init>(r1)
                r0.initCause(r3)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L17:
                return
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                retrofit2.Response r1 = (retrofit2.Response) r1
                r0.onNext(r1)
                return
        }

        public void onNext(retrofit2.Response<R> r6) {
                r5 = this;
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L10
                io.reactivex.Observer<? super R> r0 = r5.observer
                java.lang.Object r6 = r6.body()
                r0.onNext(r6)
                goto L32
            L10:
                r0 = 1
                r5.terminated = r0
                retrofit2.adapter.rxjava2.HttpException r1 = new retrofit2.adapter.rxjava2.HttpException
                r1.<init>(r6)
                io.reactivex.Observer<? super R> r6 = r5.observer     // Catch: java.lang.Throwable -> L1e
                r6.onError(r1)     // Catch: java.lang.Throwable -> L1e
                goto L32
            L1e:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r1
                r3[r0] = r6
                r2.<init>(r3)
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L32:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.observer
                r0.onSubscribe(r2)
                return
        }
    }

    BodyObservable(io.reactivex.Observable<retrofit2.Response<T>> r1) {
            r0 = this;
            r0.<init>()
            r0.upstream = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.Observable<retrofit2.Response<T>> r0 = r2.upstream
            retrofit2.adapter.rxjava2.BodyObservable$BodyObserver r1 = new retrofit2.adapter.rxjava2.BodyObservable$BodyObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
