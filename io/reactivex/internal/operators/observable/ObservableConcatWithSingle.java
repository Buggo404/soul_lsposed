package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableConcatWithSingle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> other;

    static final class ConcatWithObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        final io.reactivex.Observer<? super T> actual;
        boolean inSingle;
        io.reactivex.SingleSource<? extends T> other;

        ConcatWithObserver(io.reactivex.Observer<? super T> r1, io.reactivex.SingleSource<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.other = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                r0 = 1
                r2.inSingle = r0
                r0 = 0
                io.reactivex.internal.disposables.DisposableHelper.replace(r2, r0)
                io.reactivex.SingleSource<? extends T> r1 = r2.other
                r2.other = r0
                r1.subscribe(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lf
                boolean r1 = r0.inSingle
                if (r1 != 0) goto Lf
                io.reactivex.Observer<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onComplete()
                return
        }
    }

    public ObservableConcatWithSingle(io.reactivex.Observable<T> r1, io.reactivex.SingleSource<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableConcatWithSingle$ConcatWithObserver r1 = new io.reactivex.internal.operators.observable.ObservableConcatWithSingle$ConcatWithObserver
            io.reactivex.SingleSource<? extends T> r2 = r3.other
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
