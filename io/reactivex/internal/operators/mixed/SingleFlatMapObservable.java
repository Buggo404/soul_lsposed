package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class SingleFlatMapObservable<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
    final io.reactivex.SingleSource<T> source;

    static final class FlatMapObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R>, io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8948264376121066672L;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;

        FlatMapObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.mapper = r2
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
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.downstream
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.downstream
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(R r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.downstream
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r0 = r1.mapper     // Catch: java.lang.Throwable -> L12
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = "The mapper returned a null Publisher"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L12
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2     // Catch: java.lang.Throwable -> L12
                r2.subscribe(r1)
                return
            L12:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.Observer<? super R> r0 = r1.downstream
                r0.onError(r2)
                return
        }
    }

    public SingleFlatMapObservable(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r3) {
            r2 = this;
            io.reactivex.internal.operators.mixed.SingleFlatMapObservable$FlatMapObserver r0 = new io.reactivex.internal.operators.mixed.SingleFlatMapObservable$FlatMapObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r1 = r2.mapper
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            io.reactivex.SingleSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
