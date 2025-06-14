package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class ObservableConcatMapMaybe<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
    final int prefetch;
    final io.reactivex.Observable<T> source;

    static final class ConcatMapMaybeMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver.ConcatMapMaybeObserver<R> inner;
        R item;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        volatile int state;
        io.reactivex.disposables.Disposable upstream;

        static final class ConcatMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> parent;

            ConcatMapMaybeObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> r1) {
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

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> r0 = r1.parent
                    r0.innerError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> r0 = r1.parent
                    r0.innerSuccess(r2)
                    return
            }
        }

        ConcatMapMaybeMainObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, int r3, io.reactivex.internal.util.ErrorMode r4) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.mapper = r2
                r0.errorMode = r4
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver r1 = new io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver
                r1.<init>(r0)
                r0.inner = r1
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r3)
                r0.queue = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.upstream
                r0.dispose()
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver<R> r0 = r1.inner
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1b
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                r0.clear()
                r0 = 0
                r1.item = r0
            L1b:
                return
        }

        void drain() {
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super R> r0 = r10.downstream
                io.reactivex.internal.util.ErrorMode r1 = r10.errorMode
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r2 = r10.queue
                io.reactivex.internal.util.AtomicThrowable r3 = r10.errors
                r4 = 1
                r5 = r4
            L11:
                boolean r6 = r10.cancelled
                r7 = 0
                if (r6 == 0) goto L1d
                r2.clear()
                r10.item = r7
                goto L98
            L1d:
                int r6 = r10.state
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3c
                io.reactivex.internal.util.ErrorMode r8 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r1 == r8) goto L2f
                io.reactivex.internal.util.ErrorMode r8 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r1 != r8) goto L3c
                if (r6 != 0) goto L3c
            L2f:
                r2.clear()
                r10.item = r7
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L3c:
                r8 = 0
                if (r6 != 0) goto L8a
                boolean r6 = r10.done
                java.lang.Object r7 = r2.poll()
                if (r7 != 0) goto L48
                r8 = r4
            L48:
                if (r6 == 0) goto L5a
                if (r8 == 0) goto L5a
                java.lang.Throwable r1 = r3.terminate()
                if (r1 != 0) goto L56
                r0.onComplete()
                goto L59
            L56:
                r0.onError(r1)
            L59:
                return
            L5a:
                if (r8 == 0) goto L5d
                goto L98
            L5d:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r6 = r10.mapper     // Catch: java.lang.Throwable -> L73
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L73
                java.lang.String r7 = "The mapper returned a null MaybeSource"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L73
                io.reactivex.MaybeSource r6 = (io.reactivex.MaybeSource) r6     // Catch: java.lang.Throwable -> L73
                r10.state = r4
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver<R> r7 = r10.inner
                r6.subscribe(r7)
                goto L98
            L73:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.disposables.Disposable r4 = r10.upstream
                r4.dispose()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L8a:
                r9 = 2
                if (r6 != r9) goto L98
                R r6 = r10.item
                r10.item = r7
                r0.onNext(r6)
                r10.state = r8
                goto L11
            L98:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L11
                return
        }

        void innerComplete() {
                r1 = this;
                r0 = 0
                r1.state = r0
                r1.drain()
                return
        }

        void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1a
                io.reactivex.internal.util.ErrorMode r2 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.END
                if (r2 == r0) goto L13
                io.reactivex.disposables.Disposable r2 = r1.upstream
                r2.dispose()
            L13:
                r2 = 0
                r1.state = r2
                r1.drain()
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1d:
                return
        }

        void innerSuccess(R r1) {
                r0 = this;
                r0.item = r1
                r1 = 2
                r0.state = r1
                r0.drain()
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
                if (r0 == 0) goto L1a
                io.reactivex.internal.util.ErrorMode r2 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r2 != r0) goto L13
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver<R> r2 = r1.inner
                r2.dispose()
            L13:
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1d:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
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

    public ObservableConcatMapMaybe(io.reactivex.Observable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, io.reactivex.internal.util.ErrorMode r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.errorMode = r3
            r0.prefetch = r4
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r6) {
            r5 = this;
            io.reactivex.Observable<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsMaybe(r0, r1, r6)
            if (r0 != 0) goto L1a
            io.reactivex.Observable<T> r0 = r5.source
            io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver r1 = new io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2 = r5.mapper
            int r3 = r5.prefetch
            io.reactivex.internal.util.ErrorMode r4 = r5.errorMode
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
        L1a:
            return
    }
}
