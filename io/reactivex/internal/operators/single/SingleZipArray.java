package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleZipArray<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleSource<? extends T>[] sources;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        final /* synthetic */ io.reactivex.internal.operators.single.SingleZipArray this$0;

        SingletonArrayFunc(io.reactivex.internal.operators.single.SingleZipArray r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(T r4) throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.operators.single.SingleZipArray r0 = r3.this$0
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r0.zipper
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
                return r4
        }
    }

    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final io.reactivex.SingleObserver<? super R> actual;
        final io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver<T>[] observers;
        final java.lang.Object[] values;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(io.reactivex.SingleObserver<? super R> r2, int r3, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r4) {
                r1 = this;
                r1.<init>(r3)
                r1.actual = r2
                r1.zipper = r4
                io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver[] r2 = new io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver[r3]
                r4 = 0
            La:
                if (r4 >= r3) goto L16
                io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver r0 = new io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver
                r0.<init>(r1, r4)
                r2[r4] = r0
                int r4 = r4 + 1
                goto La
            L16:
                r1.observers = r2
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r1.values = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r4 = this;
                r0 = 0
                int r1 = r4.getAndSet(r0)
                if (r1 <= 0) goto L14
                io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver<T>[] r1 = r4.observers
                int r2 = r1.length
            La:
                if (r0 >= r2) goto L14
                r3 = r1[r0]
                r3.dispose()
                int r0 = r0 + 1
                goto La
            L14:
                return
        }

        void disposeExcept(int r5) {
                r4 = this;
                io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver<T>[] r0 = r4.observers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r5) goto Le
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L4
            Le:
                int r5 = r5 + 1
                if (r5 >= r1) goto L18
                r2 = r0[r5]
                r2.dispose()
                goto Le
            L18:
                return
        }

        void innerError(java.lang.Throwable r2, int r3) {
                r1 = this;
                r0 = 0
                int r0 = r1.getAndSet(r0)
                if (r0 <= 0) goto L10
                r1.disposeExcept(r3)
                io.reactivex.SingleObserver<? super R> r3 = r1.actual
                r3.onError(r2)
                goto L13
            L10:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L13:
                return
        }

        void innerSuccess(T r2, int r3) {
                r1 = this;
                java.lang.Object[] r0 = r1.values
                r0[r3] = r2
                int r2 = r1.decrementAndGet()
                if (r2 != 0) goto L27
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2 = r1.zipper     // Catch: java.lang.Throwable -> L1e
                java.lang.Object[] r3 = r1.values     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r2 = r2.apply(r3)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r3 = "The zipper returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L1e
                io.reactivex.SingleObserver<? super R> r3 = r1.actual
                r3.onSuccess(r2)
                goto L27
            L1e:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.SingleObserver<? super R> r3 = r1.actual
                r3.onError(r2)
            L27:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                int r0 = r1.get()
                if (r0 > 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static final class ZipSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator<T, ?> parent;

        ZipSingleObserver(io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator<T, ?> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator<T, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerError(r3, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator<T, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerSuccess(r3, r1)
                return
        }
    }

    public SingleZipArray(io.reactivex.SingleSource<? extends T>[] r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.zipper = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r6) {
            r5 = this;
            io.reactivex.SingleSource<? extends T>[] r0 = r5.sources
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L17
            r0 = r0[r3]
            io.reactivex.internal.operators.single.SingleMap$MapSingleObserver r1 = new io.reactivex.internal.operators.single.SingleMap$MapSingleObserver
            io.reactivex.internal.operators.single.SingleZipArray$SingletonArrayFunc r2 = new io.reactivex.internal.operators.single.SingleZipArray$SingletonArrayFunc
            r2.<init>(r5)
            r1.<init>(r6, r2)
            r0.subscribe(r1)
            return
        L17:
            io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator r2 = new io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r4 = r5.zipper
            r2.<init>(r6, r1, r4)
            r6.onSubscribe(r2)
        L21:
            if (r3 >= r1) goto L43
            boolean r6 = r2.isDisposed()
            if (r6 == 0) goto L2a
            return
        L2a:
            r6 = r0[r3]
            if (r6 != 0) goto L39
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "One of the sources is null"
            r6.<init>(r0)
            r2.innerError(r6, r3)
            return
        L39:
            io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver<T>[] r4 = r2.observers
            r4 = r4[r3]
            r6.subscribe(r4)
            int r3 = r3 + 1
            goto L21
        L43:
            return
    }
}
