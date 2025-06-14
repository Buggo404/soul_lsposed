package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFlatten<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;

    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.MaybeObserver<? super R> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f350d;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;

        final class InnerObserver implements io.reactivex.MaybeObserver<R> {
            final /* synthetic */ io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver this$0;

            InnerObserver(io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                    r0.onSuccess(r2)
                    return
            }
        }

        FlatMapMaybeObserver(io.reactivex.MaybeObserver<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.disposables.Disposable r0 = r1.f350d
                r0.dispose()
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
                io.reactivex.disposables.Disposable r0 = r1.f350d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f350d = r2
                io.reactivex.MaybeObserver<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r0 = r1.mapper     // Catch: java.lang.Exception -> L1d
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Exception -> L1d
                java.lang.String r0 = "The mapper returned a null MaybeSource"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Exception -> L1d
                io.reactivex.MaybeSource r2 = (io.reactivex.MaybeSource) r2     // Catch: java.lang.Exception -> L1d
                boolean r0 = r1.isDisposed()
                if (r0 != 0) goto L1c
                io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver$InnerObserver r0 = new io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver$InnerObserver
                r0.<init>(r1)
                r2.subscribe(r0)
            L1c:
                return
            L1d:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }
    }

    public MaybeFlatten(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
