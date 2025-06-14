package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableIgnoreElements<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {

    static final class IgnoreObservable<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f415d;

        IgnoreObservable(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f415d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f415d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
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
        public void onNext(T r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                r0.f415d = r1
                io.reactivex.Observer<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
                return
        }
    }

    public ObservableIgnoreElements(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableIgnoreElements$IgnoreObservable r1 = new io.reactivex.internal.operators.observable.ObservableIgnoreElements$IgnoreObservable
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
