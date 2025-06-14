package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeToObservable<T> extends io.reactivex.Observable<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> source;

    static final class MaybeToObservableObserver<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f364d;

        MaybeToObservableObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                super.dispose()
                io.reactivex.disposables.Disposable r0 = r1.f364d
                r0.dispose()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r0 = this;
                r0.complete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error(r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f364d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f364d = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public MaybeToObservable(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    public static <T> io.reactivex.MaybeObserver<T> create(io.reactivex.Observer<? super T> r1) {
            io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToObservableObserver r0 = new io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToObservableObserver
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            io.reactivex.MaybeObserver r2 = create(r2)
            r0.subscribe(r2)
            return
    }
}
