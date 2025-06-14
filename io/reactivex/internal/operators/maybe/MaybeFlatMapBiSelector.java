package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> mapper;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> resultSelector;

    static final class FlatMapBiMainObserver<T, U, R> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector.FlatMapBiMainObserver.InnerObserver<T, U, R> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> mapper;

        static final class InnerObserver<T, U, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<U> {
            private static final long serialVersionUID = -2897979525538174559L;
            final io.reactivex.MaybeObserver<? super R> actual;
            final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> resultSelector;
            T value;

            InnerObserver(io.reactivex.MaybeObserver<? super R> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.resultSelector = r2
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(U r3) {
                    r2 = this;
                    T r0 = r2.value
                    r1 = 0
                    r2.value = r1
                    io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1 = r2.resultSelector     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L17
                    java.lang.String r0 = "The resultSelector returned a null value"
                    java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L17
                    io.reactivex.MaybeObserver<? super R> r0 = r2.actual
                    r0.onSuccess(r3)
                    return
                L17:
                    r3 = move-exception
                    io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                    io.reactivex.MaybeObserver<? super R> r0 = r2.actual
                    r0.onError(r3)
                    return
            }
        }

        FlatMapBiMainObserver(io.reactivex.MaybeObserver<? super R> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> r3, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r4) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver
                r0.<init>(r2, r4)
                r1.inner = r0
                r1.mapper = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r0 = r1.inner
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r0 = r1.inner
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r0 = r1.inner
                io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r0 = r1.inner
                io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r0 = r1.inner
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                if (r2 == 0) goto Lf
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r2 = r1.inner
                io.reactivex.MaybeObserver<? super R> r2 = r2.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r4) {
                r3 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> r0 = r3.mapper     // Catch: java.lang.Throwable -> L21
                java.lang.Object r0 = r0.apply(r4)     // Catch: java.lang.Throwable -> L21
                java.lang.String r1 = "The mapper returned a null MaybeSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L21
                io.reactivex.MaybeSource r0 = (io.reactivex.MaybeSource) r0     // Catch: java.lang.Throwable -> L21
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r1 = r3.inner
                r2 = 0
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.replace(r1, r2)
                if (r1 == 0) goto L20
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r1 = r3.inner
                r1.value = r4
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r4 = r3.inner
                r0.subscribe(r4)
            L20:
                return
            L21:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> r0 = r3.inner
                io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                r0.onError(r4)
                return
        }
    }

    public MaybeFlatMapBiSelector(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.resultSelector = r3
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r5) {
            r4 = this;
            io.reactivex.MaybeSource<T> r0 = r4.source
            io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver r1 = new io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> r2 = r4.mapper
            io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3 = r4.resultSelector
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
