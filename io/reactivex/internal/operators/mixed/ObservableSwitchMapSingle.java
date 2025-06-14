package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class ObservableSwitchMapSingle<T, R> extends io.reactivex.Observable<R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final io.reactivex.Observable<T> source;

    static final class SwitchMapSingleMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<java.lang.Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R>> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
        io.reactivex.disposables.Disposable upstream;

        static final class SwitchMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver<?, R> parent;

            SwitchMapSingleObserver(io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver<?, R> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver<?, R> r0 = r1.parent
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r1) {
                    r0 = this;
                    r0.item = r1
                    io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver<?, R> r1 = r0.parent
                    r1.drain()
                    return
            }
        }

        static {
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver
                r1 = 0
                r0.<init>(r1)
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.INNER_DISPOSED = r0
                return
        }

        SwitchMapSingleMainObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.mapper = r2
                r0.delayErrors = r3
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.inner = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.upstream
                r0.dispose()
                r1.disposeInner()
                return
        }

        void disposeInner() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r0 = r2.inner
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<java.lang.Object> r1 = io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.INNER_DISPOSED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver r0 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver) r0
                if (r0 == 0) goto L11
                if (r0 == r1) goto L11
                r0.dispose()
            L11:
                return
        }

        void drain() {
                r8 = this;
                int r0 = r8.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super R> r0 = r8.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r8.errors
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r2 = r8.inner
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r8.cancelled
                if (r5 == 0) goto L14
                return
            L14:
                java.lang.Object r5 = r1.get()
                if (r5 == 0) goto L26
                boolean r5 = r8.delayErrors
                if (r5 != 0) goto L26
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L26:
                boolean r5 = r8.done
                java.lang.Object r6 = r2.get()
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver r6 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver) r6
                if (r6 != 0) goto L32
                r7 = r3
                goto L33
            L32:
                r7 = 0
            L33:
                if (r5 == 0) goto L45
                if (r7 == 0) goto L45
                java.lang.Throwable r1 = r1.terminate()
                if (r1 == 0) goto L41
                r0.onError(r1)
                goto L44
            L41:
                r0.onComplete()
            L44:
                return
            L45:
                if (r7 != 0) goto L56
                R r5 = r6.item
                if (r5 != 0) goto L4c
                goto L56
            L4c:
                r5 = 0
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r6, r5)
                R r5 = r6.item
                r0.onNext(r5)
                goto Lf
            L56:
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
        }

        void innerError(io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R> r3, java.lang.Throwable r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r0 = r2.inner
                r1 = 0
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r3, r1)
                if (r3 == 0) goto L21
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                boolean r3 = r3.addThrowable(r4)
                if (r3 == 0) goto L21
                boolean r3 = r2.delayErrors
                if (r3 != 0) goto L1d
                io.reactivex.disposables.Disposable r3 = r2.upstream
                r3.dispose()
                r2.disposeInner()
            L1d:
                r2.drain()
                return
            L21:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L16
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto Lf
                r1.disposeInner()
            Lf:
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L19
            L16:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L19:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r0 = r3.inner
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver r0 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver) r0
                if (r0 == 0) goto Ld
                r0.dispose()
            Ld:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r0 = r3.mapper     // Catch: java.lang.Throwable -> L39
                java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = "The mapper returned a null SingleSource"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L39
                io.reactivex.SingleSource r4 = (io.reactivex.SingleSource) r4     // Catch: java.lang.Throwable -> L39
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver
                r0.<init>(r3)
            L20:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r1 = r3.inner
                java.lang.Object r1 = r1.get()
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver r1 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver) r1
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<java.lang.Object> r2 = io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.INNER_DISPOSED
                if (r1 != r2) goto L2d
                goto L38
            L2d:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r2 = r3.inner
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r1, r0)
                if (r1 == 0) goto L20
                r4.subscribe(r0)
            L38:
                return
            L39:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.disposables.Disposable r0 = r3.upstream
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> r0 = r3.inner
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<java.lang.Object> r1 = io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.INNER_DISPOSED
                r0.getAndSet(r1)
                r3.onError(r4)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.upstream = r2
                io.reactivex.Observer<? super R> r2 = r1.downstream
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSwitchMapSingle(io.reactivex.Observable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r5) {
            r4 = this;
            io.reactivex.Observable<T> r0 = r4.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r1 = r4.mapper
            boolean r0 = io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsSingle(r0, r1, r5)
            if (r0 != 0) goto L18
            io.reactivex.Observable<T> r0 = r4.source
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver r1 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2 = r4.mapper
            boolean r3 = r4.delayErrors
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
        L18:
            return
    }
}
