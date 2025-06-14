package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableConcatMapEager<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    static final class ConcatMapEagerMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.observers.InnerQueuedObserverSupport<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        io.reactivex.internal.observers.InnerQueuedObserver<R> current;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f388d;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final int maxConcurrency;
        final java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> observers;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;

        ConcatMapEagerMainObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, int r4, io.reactivex.internal.util.ErrorMode r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.maxConcurrency = r3
                r0.prefetch = r4
                r0.errorMode = r5
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.observers = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L11
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
                r1.disposeAll()
            L11:
                return
        }

        void disposeAll() {
                r1 = this;
                io.reactivex.internal.observers.InnerQueuedObserver<R> r0 = r1.current
                if (r0 == 0) goto L7
                r0.dispose()
            L7:
                java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> r0 = r1.observers
                java.lang.Object r0 = r0.poll()
                io.reactivex.internal.observers.InnerQueuedObserver r0 = (io.reactivex.internal.observers.InnerQueuedObserver) r0
                if (r0 != 0) goto L12
                return
            L12:
                r0.dispose()
                goto L7
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void drain() {
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r13.queue
                java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> r1 = r13.observers
                io.reactivex.Observer<? super R> r2 = r13.actual
                io.reactivex.internal.util.ErrorMode r3 = r13.errorMode
                r4 = 1
                r5 = r4
            L11:
                int r6 = r13.activeCount
            L13:
                int r7 = r13.maxConcurrency
                if (r6 == r7) goto L83
                boolean r7 = r13.cancelled
                if (r7 == 0) goto L22
                r0.clear()
                r13.disposeAll()
                return
            L22:
                io.reactivex.internal.util.ErrorMode r7 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r7) goto L40
                io.reactivex.internal.util.AtomicThrowable r7 = r13.error
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L40
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L40:
                java.lang.Object r7 = r0.poll()     // Catch: java.lang.Throwable -> L65
                if (r7 != 0) goto L47
                goto L83
            L47:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r8 = r13.mapper     // Catch: java.lang.Throwable -> L65
                java.lang.Object r7 = r8.apply(r7)     // Catch: java.lang.Throwable -> L65
                java.lang.String r8 = "The mapper returned a null ObservableSource"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L65
                io.reactivex.ObservableSource r7 = (io.reactivex.ObservableSource) r7     // Catch: java.lang.Throwable -> L65
                io.reactivex.internal.observers.InnerQueuedObserver r8 = new io.reactivex.internal.observers.InnerQueuedObserver
                int r9 = r13.prefetch
                r8.<init>(r13, r9)
                r1.offer(r8)
                r7.subscribe(r8)
                int r6 = r6 + 1
                goto L13
            L65:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.disposables.Disposable r3 = r13.f388d
                r3.dispose()
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                r0.addThrowable(r1)
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L83:
                r13.activeCount = r6
                boolean r6 = r13.cancelled
                if (r6 == 0) goto L90
                r0.clear()
                r13.disposeAll()
                return
            L90:
                io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r6) goto Lae
                io.reactivex.internal.util.AtomicThrowable r6 = r13.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lae
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Lae:
                io.reactivex.internal.observers.InnerQueuedObserver<R> r6 = r13.current
                r7 = 0
                if (r6 != 0) goto L105
                io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r3 != r6) goto Ld1
                io.reactivex.internal.util.AtomicThrowable r6 = r13.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Ld1
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Ld1:
                boolean r6 = r13.done
                java.lang.Object r8 = r1.poll()
                io.reactivex.internal.observers.InnerQueuedObserver r8 = (io.reactivex.internal.observers.InnerQueuedObserver) r8
                if (r8 != 0) goto Ldd
                r9 = r4
                goto Lde
            Ldd:
                r9 = r7
            Lde:
                if (r6 == 0) goto L100
                if (r9 == 0) goto L100
                io.reactivex.internal.util.AtomicThrowable r1 = r13.error
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto Lfc
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                goto Lff
            Lfc:
                r2.onComplete()
            Lff:
                return
            L100:
                if (r9 != 0) goto L104
                r13.current = r8
            L104:
                r6 = r8
            L105:
                if (r6 == 0) goto L168
                io.reactivex.internal.fuseable.SimpleQueue r8 = r6.queue()
            L10b:
                boolean r9 = r13.cancelled
                if (r9 == 0) goto L116
                r0.clear()
                r13.disposeAll()
                return
            L116:
                boolean r9 = r6.isDone()
                io.reactivex.internal.util.ErrorMode r10 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r10) goto L138
                io.reactivex.internal.util.AtomicThrowable r10 = r13.error
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L138
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L138:
                r10 = 0
                java.lang.Object r11 = r8.poll()     // Catch: java.lang.Throwable -> L156
                if (r11 != 0) goto L141
                r12 = r4
                goto L142
            L141:
                r12 = r7
            L142:
                if (r9 == 0) goto L14f
                if (r12 == 0) goto L14f
                r13.current = r10
                int r6 = r13.activeCount
                int r6 = r6 - r4
                r13.activeCount = r6
                goto L11
            L14f:
                if (r12 == 0) goto L152
                goto L168
            L152:
                r2.onNext(r11)
                goto L10b
            L156:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.internal.util.AtomicThrowable r7 = r13.error
                r7.addThrowable(r6)
                r13.current = r10
                int r6 = r13.activeCount
                int r6 = r6 - r4
                r13.activeCount = r6
                goto L11
            L168:
                int r5 = -r5
                int r5 = r13.addAndGet(r5)
                if (r5 != 0) goto L11
                return
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerComplete(io.reactivex.internal.observers.InnerQueuedObserver<R> r1) {
                r0 = this;
                r1.setDone()
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerError(io.reactivex.internal.observers.InnerQueuedObserver<R> r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto L1a
                io.reactivex.internal.util.ErrorMode r3 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L13
                io.reactivex.disposables.Disposable r3 = r1.f388d
                r3.dispose()
            L13:
                r2.setDone()
                r1.drain()
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L1d:
                return
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerNext(io.reactivex.internal.observers.InnerQueuedObserver<R> r1, R r2) {
                r0 = this;
                io.reactivex.internal.fuseable.SimpleQueue r1 = r1.queue()
                r1.offer(r2)
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
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lf
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L12
            Lf:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L12:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                int r0 = r1.sourceMode
                if (r0 != 0) goto L9
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.offer(r2)
            L9:
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f388d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L42
                r2.f388d = r3
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L34
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 3
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L27
                r2.sourceMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
                r2.drain()
                return
            L27:
                r1 = 2
                if (r0 != r1) goto L34
                r2.sourceMode = r0
                r2.queue = r3
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
                return
            L34:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.prefetch
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
            L42:
                return
        }
    }

    public ObservableConcatMapEager(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, io.reactivex.internal.util.ErrorMode r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.errorMode = r3
            r0.maxConcurrency = r4
            r0.prefetch = r5
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r9) {
            r8 = this;
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver r7 = new io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3 = r8.mapper
            int r4 = r8.maxConcurrency
            int r5 = r8.prefetch
            io.reactivex.internal.util.ErrorMode r6 = r8.errorMode
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
