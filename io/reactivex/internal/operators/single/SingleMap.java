package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleMap<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.Function<? super T, ? extends R> mapper;
    final io.reactivex.SingleSource<? extends T> source;

    static final class MapSingleObserver<T, R> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;

        /* renamed from: t */
        final io.reactivex.SingleObserver<? super R> f515t;

        MapSingleObserver(io.reactivex.SingleObserver<? super R> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.f515t = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super R> r0 = r1.f515t
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super R> r0 = r1.f515t
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r1.mapper     // Catch: java.lang.Throwable -> L12
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = "The mapper function returned a null value."
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L12
                io.reactivex.SingleObserver<? super R> r0 = r1.f515t
                r0.onSuccess(r2)
                return
            L12:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r1.onError(r2)
                return
        }
    }

    public SingleMap(io.reactivex.SingleSource<? extends T> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r4) {
            r3 = this;
            io.reactivex.SingleSource<? extends T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleMap$MapSingleObserver r1 = new io.reactivex.internal.operators.single.SingleMap$MapSingleObserver
            io.reactivex.functions.Function<? super T, ? extends R> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
