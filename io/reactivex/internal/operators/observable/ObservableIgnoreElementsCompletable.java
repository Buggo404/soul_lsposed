package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableIgnoreElementsCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final io.reactivex.ObservableSource<T> source;

    static final class IgnoreObservable<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f416d;

        IgnoreObservable(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f416d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f416d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
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
                r0.f416d = r1
                io.reactivex.CompletableObserver r1 = r0.actual
                r1.onSubscribe(r0)
                return
        }
    }

    public ObservableIgnoreElementsCompletable(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableIgnoreElements r0 = new io.reactivex.internal.operators.observable.ObservableIgnoreElements
            io.reactivex.ObservableSource<T> r1 = r2.source
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable$IgnoreObservable r1 = new io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable$IgnoreObservable
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
