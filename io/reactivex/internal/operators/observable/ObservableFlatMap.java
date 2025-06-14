package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
    final int maxConcurrency;

    static final class InnerObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id */
        final long f404id;
        final io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> queue;

        InnerObserver(io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.f404id = r2
                r0.parent = r1
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r1.parent
                io.reactivex.internal.util.AtomicThrowable r0 = r0.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1e
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                boolean r2 = r2.delayErrors
                if (r2 != 0) goto L15
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                r2.disposeAll()
            L15:
                r2 = 1
                r1.done = r2
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                r2.drain()
                goto L21
            L1e:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L21:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(U r2) {
                r1 = this;
                int r0 = r1.fusionMode
                if (r0 != 0) goto La
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r1.parent
                r0.tryEmit(r2, r1)
                goto Lf
            La:
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                r2.drain()
            Lf:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r2, r3)
                if (r0 == 0) goto L27
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L27
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 7
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L20
                r2.fusionMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r3 = r2.parent
                r3.drain()
                return
            L20:
                r1 = 2
                if (r0 != r1) goto L27
                r2.fusionMode = r0
                r2.queue = r3
            L27:
                return
        }
    }

    static final class MergeObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.Observer<T> {
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] CANCELLED = null;
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        final io.reactivex.Observer<? super U> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        long lastId;
        int lastIndex;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[]> observers;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f405s;
        java.util.Queue<io.reactivex.ObservableSource<? extends U>> sources;
        long uniqueId;
        int wip;

        static {
                r0 = 0
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r1 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r0]
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.EMPTY = r1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r0]
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.CANCELLED = r0
                return
        }

        MergeObserver(io.reactivex.Observer<? super U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r3, boolean r4, int r5, int r6) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r1.errors = r0
                r1.actual = r2
                r1.mapper = r3
                r1.delayErrors = r4
                r1.maxConcurrency = r5
                r1.bufferSize = r6
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r2) goto L20
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r2.<init>(r5)
                r1.sources = r2
            L20:
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r3 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.EMPTY
                r2.<init>(r3)
                r1.observers = r2
                return
        }

        boolean addInner(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.CANCELLED
                r2 = 0
                if (r0 != r1) goto L11
                r5.dispose()
                return r2
            L11:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r3 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r1 = r4.observers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        boolean checkTerminate() {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                boolean r2 = r3.delayErrors
                if (r2 != 0) goto L27
                if (r0 == 0) goto L27
                r3.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errors
                java.lang.Throwable r0 = r0.terminate()
                java.lang.Throwable r2 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r2) goto L26
                io.reactivex.Observer<? super U> r2 = r3.actual
                r2.onError(r0)
            L26:
                return r1
            L27:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L1c
                r0 = 1
                r2.cancelled = r0
                boolean r0 = r2.disposeAll()
                if (r0 == 0) goto L1c
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L1c
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r1) goto L1c
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L1c:
                return
        }

        boolean disposeAll() {
                r4 = this;
                io.reactivex.disposables.Disposable r0 = r4.f405s
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.CANCELLED
                r2 = 0
                if (r0 == r1) goto L29
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r4.observers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                if (r0 == r1) goto L29
                int r1 = r0.length
            L1d:
                if (r2 >= r1) goto L27
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L1d
            L27:
                r0 = 1
                return r0
            L29:
                return r2
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r13 = this;
                io.reactivex.Observer<? super U> r0 = r13.actual
                r1 = 1
                r2 = r1
            L4:
                boolean r3 = r13.checkTerminate()
                if (r3 == 0) goto Lb
                return
            Lb:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r3 = r13.queue
                if (r3 == 0) goto L23
            Lf:
                boolean r4 = r13.checkTerminate()
                if (r4 == 0) goto L16
                return
            L16:
                java.lang.Object r4 = r3.poll()
                if (r4 != 0) goto L1f
                if (r4 != 0) goto Lf
                goto L23
            L1f:
                r0.onNext(r4)
                goto Lf
            L23:
                boolean r3 = r13.done
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r4 = r13.queue
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r5 = r13.observers
                java.lang.Object r5 = r5.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r5
                int r6 = r5.length
                int r7 = r13.maxConcurrency
                r8 = 2147483647(0x7fffffff, float:NaN)
                r9 = 0
                if (r7 == r8) goto L44
                monitor-enter(r13)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r7 = r13.sources     // Catch: java.lang.Throwable -> L41
                int r7 = r7.size()     // Catch: java.lang.Throwable -> L41
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L41
                goto L45
            L41:
                r0 = move-exception
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L41
                throw r0
            L44:
                r7 = r9
            L45:
                if (r3 == 0) goto L67
                if (r4 == 0) goto L4f
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L67
            L4f:
                if (r6 != 0) goto L67
                if (r7 != 0) goto L67
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                java.lang.Throwable r2 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r1 == r2) goto L66
                if (r1 != 0) goto L63
                r0.onComplete()
                goto L66
            L63:
                r0.onError(r1)
            L66:
                return
            L67:
                if (r6 == 0) goto L104
                long r3 = r13.lastId
                int r7 = r13.lastIndex
                if (r6 <= r7) goto L77
                r10 = r5[r7]
                long r10 = r10.f404id
                int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r10 == 0) goto L96
            L77:
                if (r6 > r7) goto L7a
                r7 = r9
            L7a:
                r10 = r9
            L7b:
                if (r10 >= r6) goto L8e
                r11 = r5[r7]
                long r11 = r11.f404id
                int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r11 != 0) goto L86
                goto L8e
            L86:
                int r7 = r7 + 1
                if (r7 != r6) goto L8b
                r7 = r9
            L8b:
                int r10 = r10 + 1
                goto L7b
            L8e:
                r13.lastIndex = r7
                r3 = r5[r7]
                long r3 = r3.f404id
                r13.lastId = r3
            L96:
                r3 = r9
                r4 = r3
            L98:
                if (r3 >= r6) goto Lfb
                boolean r10 = r13.checkTerminate()
                if (r10 == 0) goto La1
                return
            La1:
                r10 = r5[r7]
            La3:
                boolean r11 = r13.checkTerminate()
                if (r11 == 0) goto Laa
                return
            Laa:
                io.reactivex.internal.fuseable.SimpleQueue<U> r11 = r10.queue
                if (r11 != 0) goto Laf
                goto Lb7
            Laf:
                java.lang.Object r12 = r11.poll()     // Catch: java.lang.Throwable -> Le0
                if (r12 != 0) goto Ld6
                if (r12 != 0) goto La3
            Lb7:
                boolean r11 = r10.done
                io.reactivex.internal.fuseable.SimpleQueue<U> r12 = r10.queue
                if (r11 == 0) goto Ld0
                if (r12 == 0) goto Lc5
                boolean r11 = r12.isEmpty()
                if (r11 == 0) goto Ld0
            Lc5:
                r13.removeInner(r10)
                boolean r4 = r13.checkTerminate()
                if (r4 == 0) goto Lcf
                return
            Lcf:
                r4 = r1
            Ld0:
                int r7 = r7 + 1
                if (r7 != r6) goto Lf9
                r7 = r9
                goto Lf9
            Ld6:
                r0.onNext(r12)
                boolean r12 = r13.checkTerminate()
                if (r12 == 0) goto Laf
                return
            Le0:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r10.dispose()
                io.reactivex.internal.util.AtomicThrowable r11 = r13.errors
                r11.addThrowable(r4)
                boolean r4 = r13.checkTerminate()
                if (r4 == 0) goto Lf3
                return
            Lf3:
                r13.removeInner(r10)
                int r3 = r3 + 1
                r4 = r1
            Lf9:
                int r3 = r3 + r1
                goto L98
            Lfb:
                r13.lastIndex = r7
                r3 = r5[r7]
                long r5 = r3.f404id
                r13.lastId = r5
                r9 = r4
            L104:
                if (r9 == 0) goto L126
                int r3 = r13.maxConcurrency
                if (r3 == r8) goto L4
                monitor-enter(r13)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r3 = r13.sources     // Catch: java.lang.Throwable -> L123
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L123
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L123
                if (r3 != 0) goto L11d
                int r3 = r13.wip     // Catch: java.lang.Throwable -> L123
                int r3 = r3 - r1
                r13.wip = r3     // Catch: java.lang.Throwable -> L123
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L123
                goto L4
            L11d:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L123
                r13.subscribeInner(r3)
                goto L4
            L123:
                r0 = move-exception
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L123
                throw r0
            L126:
                int r2 = -r2
                int r2 = r13.addAndGet(r2)
                if (r2 != 0) goto L4
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
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L17
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1a
            L17:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1a:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L35
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L35
                java.lang.String r0 = "The mapper returned a null ObservableSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L35
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L35
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L31
                monitor-enter(r2)
                int r0 = r2.wip     // Catch: java.lang.Throwable -> L2e
                int r1 = r2.maxConcurrency     // Catch: java.lang.Throwable -> L2e
                if (r0 != r1) goto L28
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r0 = r2.sources     // Catch: java.lang.Throwable -> L2e
                r0.offer(r3)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                return
            L28:
                int r0 = r0 + 1
                r2.wip = r0     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                goto L31
            L2e:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                throw r3
            L31:
                r2.subscribeInner(r3)
                return
            L35:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.f405s
                r0.dispose()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f405s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f405s = r2
                io.reactivex.Observer<? super U> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        void removeInner(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r6.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                return
            Lc:
                r2 = 0
                r3 = r2
            Le:
                if (r3 >= r1) goto L18
                r4 = r0[r3]
                if (r4 != r7) goto L15
                goto L19
            L15:
                int r3 = r3 + 1
                goto Le
            L18:
                r3 = -1
            L19:
                if (r3 >= 0) goto L1c
                return
            L1c:
                r4 = 1
                if (r1 != r4) goto L22
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.EMPTY
                goto L31
            L22:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L31:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r2 = r6.observers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                if (r0 == 0) goto L0
                return
        }

        void subscribeInner(io.reactivex.ObservableSource<? extends U> r6) {
                r5 = this;
            L0:
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L30
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                boolean r6 = r5.tryEmitScalar(r6)
                if (r6 == 0) goto L45
                int r6 = r5.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L45
                monitor-enter(r5)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r6 = r5.sources     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r6 = r6.poll()     // Catch: java.lang.Throwable -> L2d
                io.reactivex.ObservableSource r6 = (io.reactivex.ObservableSource) r6     // Catch: java.lang.Throwable -> L2d
                if (r6 != 0) goto L25
                int r0 = r5.wip     // Catch: java.lang.Throwable -> L2d
                r1 = 1
                int r0 = r0 - r1
                r5.wip = r0     // Catch: java.lang.Throwable -> L2d
                goto L26
            L25:
                r1 = 0
            L26:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L0
                r5.drain()
                goto L45
            L2d:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
                throw r6
            L30:
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver
                long r1 = r5.uniqueId
                r3 = 1
                long r3 = r3 + r1
                r5.uniqueId = r3
                r0.<init>(r5, r1)
                boolean r1 = r5.addInner(r0)
                if (r1 == 0) goto L45
                r6.subscribe(r0)
            L45:
                return
        }

        void tryEmit(U r3, io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> r4) {
                r2 = this;
                int r0 = r2.get()
                if (r0 != 0) goto L1a
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1a
                io.reactivex.Observer<? super U> r4 = r2.actual
                r4.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L31
                return
            L1a:
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r4.queue
                if (r0 != 0) goto L27
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                r4.queue = r0
            L27:
                r0.offer(r3)
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L31
                return
            L31:
                r2.drainLoop()
                return
        }

        boolean tryEmitScalar(java.util.concurrent.Callable<? extends U> r5) {
                r4 = this;
                r0 = 1
                java.lang.Object r5 = r5.call()     // Catch: java.lang.Throwable -> L59
                if (r5 != 0) goto L8
                return r0
            L8:
                int r1 = r4.get()
                r2 = 0
                if (r1 != 0) goto L21
                boolean r1 = r4.compareAndSet(r2, r0)
                if (r1 == 0) goto L21
                io.reactivex.Observer<? super U> r1 = r4.actual
                r1.onNext(r5)
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L55
                return r0
            L21:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r4.queue
                if (r1 != 0) goto L3d
                int r1 = r4.maxConcurrency
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r1 != r3) goto L34
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r3 = r4.bufferSize
                r1.<init>(r3)
                goto L3b
            L34:
                io.reactivex.internal.queue.SpscArrayQueue r1 = new io.reactivex.internal.queue.SpscArrayQueue
                int r3 = r4.maxConcurrency
                r1.<init>(r3)
            L3b:
                r4.queue = r1
            L3d:
                boolean r5 = r1.offer(r5)
                if (r5 != 0) goto L4e
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r1 = "Scalar queue full?!"
                r5.<init>(r1)
                r4.onError(r5)
                return r0
            L4e:
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L55
                return r2
            L55:
                r4.drainLoop()
                return r0
            L59:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                io.reactivex.internal.util.AtomicThrowable r1 = r4.errors
                r1.addThrowable(r5)
                r4.drain()
                return r0
        }
    }

    public ObservableFlatMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            r0.bufferSize = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> r9) {
            r8 = this;
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r1 = r8.mapper
            boolean r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(r0, r9, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver r7 = new io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r3 = r8.mapper
            boolean r4 = r8.delayErrors
            int r5 = r8.maxConcurrency
            int r6 = r8.bufferSize
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
