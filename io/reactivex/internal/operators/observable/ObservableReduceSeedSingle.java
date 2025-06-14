package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableReduceSeedSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
    final R seed;
    final io.reactivex.ObservableSource<T> source;

    static final class ReduceSeedObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super R> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f427d;
        final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
        R value;

        ReduceSeedObserver(io.reactivex.SingleObserver<? super R> r1, io.reactivex.functions.BiFunction<R, ? super T, R> r2, R r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.value = r3
                r0.reducer = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f427d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f427d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                R r0 = r2.value
                if (r0 == 0) goto Lc
                r1 = 0
                r2.value = r1
                io.reactivex.SingleObserver<? super R> r1 = r2.actual
                r1.onSuccess(r0)
            Lc:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                R r0 = r1.value
                if (r0 == 0) goto Ld
                r0 = 0
                r1.value = r0
                io.reactivex.SingleObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                goto L10
            Ld:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L10:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                R r0 = r2.value
                if (r0 == 0) goto L1f
                io.reactivex.functions.BiFunction<R, ? super T, R> r1 = r2.reducer     // Catch: java.lang.Throwable -> L13
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L13
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L13
                r2.value = r3     // Catch: java.lang.Throwable -> L13
                goto L1f
            L13:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.f427d
                r0.dispose()
                r2.onError(r3)
            L1f:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f427d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f427d = r2
                io.reactivex.SingleObserver<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableReduceSeedSingle(io.reactivex.ObservableSource<T> r1, R r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.seed = r2
            r0.reducer = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableReduceSeedSingle$ReduceSeedObserver r1 = new io.reactivex.internal.operators.observable.ObservableReduceSeedSingle$ReduceSeedObserver
            io.reactivex.functions.BiFunction<R, ? super T, R> r2 = r4.reducer
            R r3 = r4.seed
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
