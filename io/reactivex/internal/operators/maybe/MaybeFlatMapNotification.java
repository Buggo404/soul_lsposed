package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFlatMapNotification<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> onCompleteSupplier;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> onErrorMapper;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> onSuccessMapper;

    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.MaybeObserver<? super R> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f349d;
        final java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> onCompleteSupplier;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> onErrorMapper;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> onSuccessMapper;

        final class InnerObserver implements io.reactivex.MaybeObserver<R> {
            final /* synthetic */ io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver this$0;

            InnerObserver(io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver r0 = r1.this$0
                    io.reactivex.MaybeObserver<? super R> r0 = r0.actual
                    r0.onSuccess(r2)
                    return
            }
        }

        FlatMapMaybeObserver(io.reactivex.MaybeObserver<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onSuccessMapper = r2
                r0.onErrorMapper = r3
                r0.onCompleteSupplier = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.disposables.Disposable r0 = r1.f349d
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
                r2 = this;
                java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> r0 = r2.onCompleteSupplier     // Catch: java.lang.Exception -> L17
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L17
                java.lang.String r1 = "The onCompleteSupplier returned a null MaybeSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Exception -> L17
                io.reactivex.MaybeSource r0 = (io.reactivex.MaybeSource) r0     // Catch: java.lang.Exception -> L17
                io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$InnerObserver r1 = new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$InnerObserver
                r1.<init>(r2)
                r0.subscribe(r1)
                return
            L17:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.MaybeObserver<? super R> r1 = r2.actual
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> r0 = r5.onErrorMapper     // Catch: java.lang.Exception -> L17
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Exception -> L17
                java.lang.String r1 = "The onErrorMapper returned a null MaybeSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Exception -> L17
                io.reactivex.MaybeSource r0 = (io.reactivex.MaybeSource) r0     // Catch: java.lang.Exception -> L17
                io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$InnerObserver r6 = new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$InnerObserver
                r6.<init>(r5)
                r0.subscribe(r6)
                return
            L17:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.MaybeObserver<? super R> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f349d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f349d = r2
                io.reactivex.MaybeObserver<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r0 = r1.onSuccessMapper     // Catch: java.lang.Exception -> L17
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Exception -> L17
                java.lang.String r0 = "The onSuccessMapper returned a null MaybeSource"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Exception -> L17
                io.reactivex.MaybeSource r2 = (io.reactivex.MaybeSource) r2     // Catch: java.lang.Exception -> L17
                io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$InnerObserver r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$InnerObserver
                r0.<init>(r1)
                r2.subscribe(r0)
                return
            L17:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }
    }

    public MaybeFlatMapNotification(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.onSuccessMapper = r2
            r0.onErrorMapper = r3
            r0.onCompleteSupplier = r4
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r6) {
            r5 = this;
            io.reactivex.MaybeSource<T> r0 = r5.source
            io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2 = r5.onSuccessMapper
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> r3 = r5.onErrorMapper
            java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> r4 = r5.onCompleteSupplier
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
