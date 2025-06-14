package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;

    static final class SwitchMapInnerObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<R> queue;

        SwitchMapInnerObserver(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                r0.bufferSize = r4
                return
        }

        public void cancel() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                long r0 = r4.index
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r2 = r4.parent
                long r2 = r2.unique
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L12
                r0 = 1
                r4.done = r0
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r0 = r4.parent
                r0.drain()
            L12:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r0 = r1.parent
                r0.innerError(r1, r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(R r5) {
                r4 = this;
                long r0 = r4.index
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r2 = r4.parent
                long r2 = r2.unique
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L16
                if (r5 == 0) goto L11
                io.reactivex.internal.fuseable.SimpleQueue<R> r0 = r4.queue
                r0.offer(r5)
            L11:
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r5 = r4.parent
                r5.drain()
            L16:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r2, r3)
                if (r0 == 0) goto L2d
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L24
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 7
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L1e
                r2.queue = r3
                r2.done = r1
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r3 = r2.parent
                r3.drain()
                return
            L1e:
                r1 = 2
                if (r0 != r1) goto L24
                r2.queue = r3
                return
            L24:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.bufferSize
                r3.<init>(r0)
                r2.queue = r3
            L2d:
                return
        }
    }

    static final class SwitchMapObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>> active;
        final io.reactivex.Observer<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f454s;
        volatile long unique;

        static {
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver
                r1 = -1
                r3 = 1
                r4 = 0
                r0.<init>(r4, r1, r3)
                io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.CANCELLED = r0
                r0.cancel()
                return
        }

        SwitchMapObserver(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, int r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.active = r0
                r1.actual = r2
                r1.mapper = r3
                r1.bufferSize = r4
                r1.delayErrors = r5
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.errors = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lf
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f454s
                r0.dispose()
                r1.disposeInner()
            Lf:
                return
        }

        void disposeInner() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r0 = r2.active
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r0
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<java.lang.Object, java.lang.Object> r1 = io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.CANCELLED
                if (r0 == r1) goto L1b
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r0 = r2.active
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r0
                if (r0 == r1) goto L1b
                if (r0 == 0) goto L1b
                r0.cancel()
            L1b:
                return
        }

        void drain() {
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super R> r0 = r13.actual
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r1 = r13.active
                boolean r2 = r13.delayErrors
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r13.cancelled
                if (r5 == 0) goto L14
                return
            L14:
                boolean r5 = r13.done
                r6 = 0
                if (r5 == 0) goto L52
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L21
                r5 = r3
                goto L22
            L21:
                r5 = r6
            L22:
                if (r2 == 0) goto L38
                if (r5 == 0) goto L52
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L34
                r0.onError(r1)
                goto L37
            L34:
                r0.onComplete()
            L37:
                return
            L38:
                io.reactivex.internal.util.AtomicThrowable r7 = r13.errors
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L4c
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L4c:
                if (r5 == 0) goto L52
                r0.onComplete()
                return
            L52:
                java.lang.Object r5 = r1.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r5 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r5
                if (r5 == 0) goto Le9
                io.reactivex.internal.fuseable.SimpleQueue<R> r7 = r5.queue
                if (r7 == 0) goto Le9
                boolean r8 = r5.done
                r9 = 0
                if (r8 == 0) goto L89
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L6f
                if (r8 == 0) goto L89
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r5, r9)
                goto Lf
            L6f:
                io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L83
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L83:
                if (r8 == 0) goto L89
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r5, r9)
                goto Lf
            L89:
                r8 = r6
            L8a:
                boolean r10 = r13.cancelled
                if (r10 == 0) goto L8f
                return
            L8f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L97
            L95:
                r8 = r3
                goto Le1
            L97:
                if (r2 != 0) goto Lad
                io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto Lad
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lad:
                boolean r10 = r5.done
                java.lang.Object r11 = r7.poll()     // Catch: java.lang.Throwable -> Lb4
                goto Ld2
            Lb4:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                io.reactivex.internal.util.AtomicThrowable r11 = r13.errors
                r11.addThrowable(r8)
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r5, r9)
                if (r2 != 0) goto Lcd
                r13.disposeInner()
                io.reactivex.disposables.Disposable r8 = r13.f454s
                r8.dispose()
                r13.done = r3
                goto Ld0
            Lcd:
                r5.cancel()
            Ld0:
                r8 = r3
                r11 = r9
            Ld2:
                if (r11 != 0) goto Ld6
                r12 = r3
                goto Ld7
            Ld6:
                r12 = r6
            Ld7:
                if (r10 == 0) goto Ldf
                if (r12 == 0) goto Ldf
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r5, r9)
                goto L95
            Ldf:
                if (r12 == 0) goto Le5
            Le1:
                if (r8 == 0) goto Le9
                goto Lf
            Le5:
                r0.onNext(r11)
                goto L8a
            Le9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
        }

        void innerError(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> r5, java.lang.Throwable r6) {
                r4 = this;
                long r0 = r5.index
                long r2 = r4.unique
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L20
                io.reactivex.internal.util.AtomicThrowable r0 = r4.errors
                boolean r0 = r0.addThrowable(r6)
                if (r0 == 0) goto L20
                boolean r6 = r4.delayErrors
                if (r6 != 0) goto L19
                io.reactivex.disposables.Disposable r6 = r4.f454s
                r6.dispose()
            L19:
                r6 = 1
                r5.done = r6
                r4.drain()
                goto L23
            L20:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L23:
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
                if (r0 != 0) goto La
                r0 = 1
                r1.done = r0
                r1.drain()
            La:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L1a
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1a
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto L13
                r1.disposeInner()
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
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.unique
                r2 = 1
                long r0 = r0 + r2
                r4.unique = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r2 = r4.active
                java.lang.Object r2 = r2.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r2 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r2
                if (r2 == 0) goto L14
                r2.cancel()
            L14:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2 = r4.mapper     // Catch: java.lang.Throwable -> L42
                java.lang.Object r5 = r2.apply(r5)     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = "The ObservableSource returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r2)     // Catch: java.lang.Throwable -> L42
                io.reactivex.ObservableSource r5 = (io.reactivex.ObservableSource) r5     // Catch: java.lang.Throwable -> L42
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r2 = new io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver
                int r3 = r4.bufferSize
                r2.<init>(r4, r0, r3)
            L29:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r0 = r4.active
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r0
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<java.lang.Object, java.lang.Object> r1 = io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.CANCELLED
                if (r0 != r1) goto L36
                goto L41
            L36:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r1 = r4.active
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
                if (r0 == 0) goto L29
                r5.subscribe(r2)
            L41:
                return
            L42:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                io.reactivex.disposables.Disposable r0 = r4.f454s
                r0.dispose()
                r4.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f454s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f454s = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSwitchMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.bufferSize = r3
            r0.delayErrors = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(r0, r6, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver r1 = new io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2 = r5.mapper
            int r3 = r5.bufferSize
            boolean r4 = r5.delayErrors
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
