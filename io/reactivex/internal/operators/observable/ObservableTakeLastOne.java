package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableTakeLastOne<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {

    static final class TakeLastOneObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f456s;
        T value;

        TakeLastOneObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1.value = r0
                io.reactivex.disposables.Disposable r0 = r1.f456s
                r0.dispose()
                return
        }

        void emit() {
                r2 = this;
                T r0 = r2.value
                if (r0 == 0) goto Lc
                r1 = 0
                r2.value = r1
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            Lc:
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f456s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r0 = this;
                r0.emit()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.value = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                r0.value = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f456s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f456s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableTakeLastOne(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableTakeLastOne$TakeLastOneObserver r1 = new io.reactivex.internal.operators.observable.ObservableTakeLastOne$TakeLastOneObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
