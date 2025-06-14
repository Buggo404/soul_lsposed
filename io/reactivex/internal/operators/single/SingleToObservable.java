package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleToObservable<T> extends io.reactivex.Observable<T> {
    final io.reactivex.SingleSource<? extends T> source;

    static final class SingleToObservableObserver<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f517d;

        SingleToObservableObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                super.dispose()
                io.reactivex.disposables.Disposable r0 = r1.f517d
                r0.dispose()
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error(r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f517d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f517d = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public SingleToObservable(io.reactivex.SingleSource<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    public static <T> io.reactivex.SingleObserver<T> create(io.reactivex.Observer<? super T> r1) {
            io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver r0 = new io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.SingleSource<? extends T> r0 = r1.source
            io.reactivex.SingleObserver r2 = create(r2)
            r0.subscribe(r2)
            return
    }
}
