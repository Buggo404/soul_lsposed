package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleUsing<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super U> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<U> resourceSupplier;
    final io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> singleFunction;

    static final class UsingSingleObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5331524057054083935L;
        final io.reactivex.SingleObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f519d;
        final io.reactivex.functions.Consumer<? super U> disposer;
        final boolean eager;

        UsingSingleObserver(io.reactivex.SingleObserver<? super T> r1, U r2, boolean r3, io.reactivex.functions.Consumer<? super U> r4) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                r0.eager = r3
                r0.disposer = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f519d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f519d = r0
                r1.disposeAfter()
                return
        }

        void disposeAfter() {
                r2 = this;
                java.lang.Object r0 = r2.getAndSet(r2)
                if (r0 == r2) goto L13
                io.reactivex.functions.Consumer<? super U> r1 = r2.disposer     // Catch: java.lang.Throwable -> Lc
                r1.accept(r0)     // Catch: java.lang.Throwable -> Lc
                goto L13
            Lc:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L13:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f519d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r4.f519d = r0
                boolean r0 = r4.eager
                if (r0 == 0) goto L29
                java.lang.Object r0 = r4.getAndSet(r4)
                if (r0 == r4) goto L28
                io.reactivex.functions.Consumer<? super U> r1 = r4.disposer     // Catch: java.lang.Throwable -> L14
                r1.accept(r0)     // Catch: java.lang.Throwable -> L14
                goto L29
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r1.<init>(r2)
                r5 = r1
                goto L29
            L28:
                return
            L29:
                io.reactivex.SingleObserver<? super T> r0 = r4.actual
                r0.onError(r5)
                boolean r5 = r4.eager
                if (r5 != 0) goto L35
                r4.disposeAfter()
            L35:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f519d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f519d = r2
                io.reactivex.SingleObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f519d = r0
                boolean r0 = r2.eager
                if (r0 == 0) goto L1e
                java.lang.Object r0 = r2.getAndSet(r2)
                if (r0 == r2) goto L1d
                io.reactivex.functions.Consumer<? super U> r1 = r2.disposer     // Catch: java.lang.Throwable -> L14
                r1.accept(r0)     // Catch: java.lang.Throwable -> L14
                goto L1e
            L14:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onError(r3)
            L1d:
                return
            L1e:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
                boolean r3 = r2.eager
                if (r3 != 0) goto L2a
                r2.disposeAfter()
            L2a:
                return
        }
    }

    public SingleUsing(java.util.concurrent.Callable<U> r1, io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> r2, io.reactivex.functions.Consumer<? super U> r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.resourceSupplier = r1
            r0.singleFunction = r2
            r0.disposer = r3
            r0.eager = r4
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r7) {
            r6 = this;
            java.util.concurrent.Callable<U> r0 = r6.resourceSupplier     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L57
            io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> r1 = r6.singleFunction     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "The singleFunction returned a null SingleSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L21
            io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1     // Catch: java.lang.Throwable -> L21
            io.reactivex.internal.operators.single.SingleUsing$UsingSingleObserver r2 = new io.reactivex.internal.operators.single.SingleUsing$UsingSingleObserver
            boolean r3 = r6.eager
            io.reactivex.functions.Consumer<? super U> r4 = r6.disposer
            r2.<init>(r7, r0, r3, r4)
            r1.subscribe(r2)
            return
        L21:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r2 = r6.eager
            if (r2 == 0) goto L42
            io.reactivex.functions.Consumer<? super U> r2 = r6.disposer     // Catch: java.lang.Throwable -> L2f
            r2.accept(r0)     // Catch: java.lang.Throwable -> L2f
            goto L42
        L2f:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r3.<init>(r4)
            r1 = r3
        L42:
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r7)
            boolean r7 = r6.eager
            if (r7 != 0) goto L56
            io.reactivex.functions.Consumer<? super U> r7 = r6.disposer     // Catch: java.lang.Throwable -> L4f
            r7.accept(r0)     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r7 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
            io.reactivex.plugins.RxJavaPlugins.onError(r7)
        L56:
            return
        L57:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
    }
}
