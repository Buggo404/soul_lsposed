package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeMap<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends R> mapper;

    static final class MapMaybeObserver<T, R> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super R> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f358d;
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;

        MapMaybeObserver(io.reactivex.MaybeObserver<? super R> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f358d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f358d = r1
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f358d
                boolean r0 = r0.isDisposed()
                return r0
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
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f358d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f358d = r2
                io.reactivex.MaybeObserver<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r1.mapper     // Catch: java.lang.Throwable -> L12
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = "The mapper returned a null item"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L12
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onSuccess(r2)
                return
            L12:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }
    }

    public MaybeMap(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeMap$MapMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeMap$MapMaybeObserver
            io.reactivex.functions.Function<? super T, ? extends R> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
