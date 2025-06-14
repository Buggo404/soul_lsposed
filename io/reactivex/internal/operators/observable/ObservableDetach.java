package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDetach<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {

    static final class DetachObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.Observer<? super T> actual;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f397s;

        DetachObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f397s
                io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
                r2.f397s = r1
                io.reactivex.Observer r1 = io.reactivex.internal.util.EmptyComponent.asObserver()
                r2.actual = r1
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f397s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
                r2.f397s = r1
                io.reactivex.Observer r1 = io.reactivex.internal.util.EmptyComponent.asObserver()
                r2.actual = r1
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
                r2.f397s = r1
                io.reactivex.Observer r1 = io.reactivex.internal.util.EmptyComponent.asObserver()
                r2.actual = r1
                r0.onError(r3)
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
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f397s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f397s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableDetach(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableDetach$DetachObserver r1 = new io.reactivex.internal.operators.observable.ObservableDetach$DetachObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
