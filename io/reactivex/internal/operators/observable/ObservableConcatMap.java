package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableConcatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final io.reactivex.internal.util.ErrorMode delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;

    static final class ConcatMapDelayErrorObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final io.reactivex.Observer<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f386d;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver.DelayErrorInnerObserver<R> observer;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        final boolean tillTheEnd;

        static final class DelayErrorInnerObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final io.reactivex.Observer<? super R> actual;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> parent;

            DelayErrorInnerObserver(io.reactivex.Observer<? super R> r1, io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.parent = r2
                    return
            }

            void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> r0 = r2.parent
                    r1 = 0
                    r0.active = r1
                    r0.drain()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r3) {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> r0 = r2.parent
                    io.reactivex.internal.util.AtomicThrowable r1 = r0.error
                    boolean r1 = r1.addThrowable(r3)
                    if (r1 == 0) goto L1a
                    boolean r3 = r0.tillTheEnd
                    if (r3 != 0) goto L13
                    io.reactivex.disposables.Disposable r3 = r0.f386d
                    r3.dispose()
                L13:
                    r3 = 0
                    r0.active = r3
                    r0.drain()
                    goto L1d
                L1a:
                    io.reactivex.plugins.RxJavaPlugins.onError(r3)
                L1d:
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(R r2) {
                    r1 = this;
                    io.reactivex.Observer<? super R> r0 = r1.actual
                    r0.onNext(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                    return
            }
        }

        ConcatMapDelayErrorObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.bufferSize = r3
                r0.tillTheEnd = r4
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r0.error = r2
                io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver r2 = new io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver
                r2.<init>(r1, r0)
                r0.observer = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f386d
                r0.dispose()
                io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver<R> r0 = r1.observer
                r0.dispose()
                return
        }

        void drain() {
                r7 = this;
                int r0 = r7.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super R> r0 = r7.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r7.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r7.error
            Ld:
                boolean r3 = r7.active
                if (r3 != 0) goto Lb5
                boolean r3 = r7.cancelled
                if (r3 == 0) goto L19
                r1.clear()
                return
            L19:
                boolean r3 = r7.tillTheEnd
                r4 = 1
                if (r3 != 0) goto L33
                java.lang.Object r3 = r2.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L33
                r1.clear()
                r7.cancelled = r4
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L33:
                boolean r3 = r7.done
                java.lang.Object r5 = r1.poll()     // Catch: java.lang.Throwable -> L9f
                if (r5 != 0) goto L3d
                r6 = r4
                goto L3e
            L3d:
                r6 = 0
            L3e:
                if (r3 == 0) goto L52
                if (r6 == 0) goto L52
                r7.cancelled = r4
                java.lang.Throwable r1 = r2.terminate()
                if (r1 == 0) goto L4e
                r0.onError(r1)
                goto L51
            L4e:
                r0.onComplete()
            L51:
                return
            L52:
                if (r6 != 0) goto Lb5
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3 = r7.mapper     // Catch: java.lang.Throwable -> L86
                java.lang.Object r3 = r3.apply(r5)     // Catch: java.lang.Throwable -> L86
                java.lang.String r5 = "The mapper returned a null ObservableSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r5)     // Catch: java.lang.Throwable -> L86
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L86
                boolean r5 = r3 instanceof java.util.concurrent.Callable
                if (r5 == 0) goto L7e
                java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3     // Catch: java.lang.Throwable -> L76
                java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L76
                if (r3 == 0) goto Ld
                boolean r4 = r7.cancelled
                if (r4 != 0) goto Ld
                r0.onNext(r3)
                goto Ld
            L76:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.addThrowable(r3)
                goto Ld
            L7e:
                r7.active = r4
                io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver<R> r4 = r7.observer
                r3.subscribe(r4)
                goto Lb5
            L86:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r7.cancelled = r4
                io.reactivex.disposables.Disposable r4 = r7.f386d
                r4.dispose()
                r1.clear()
                r2.addThrowable(r3)
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L9f:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r7.cancelled = r4
                io.reactivex.disposables.Disposable r3 = r7.f386d
                r3.dispose()
                r2.addThrowable(r1)
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            Lb5:
                int r3 = r7.decrementAndGet()
                if (r3 != 0) goto Ld
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
                io.reactivex.disposables.Disposable r0 = r2.f386d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L42
                r2.f386d = r3
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
                int r0 = r2.bufferSize
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
            L42:
                return
        }
    }

    static final class SourceObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final io.reactivex.Observer<? super U> actual;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        int fusionMode;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.InnerObserver<U> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f387s;

        static final class InnerObserver<U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final io.reactivex.Observer<? super U> actual;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> parent;

            InnerObserver(io.reactivex.Observer<? super U> r1, io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.parent = r2
                    return
            }

            void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver<?, ?> r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver<?, ?> r0 = r1.parent
                    r0.dispose()
                    io.reactivex.Observer<? super U> r0 = r1.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(U r2) {
                    r1 = this;
                    io.reactivex.Observer<? super U> r0 = r1.actual
                    r0.onNext(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
                    return
            }
        }

        SourceObserver(io.reactivex.Observer<? super U> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.bufferSize = r3
                io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver r2 = new io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver
                r2.<init>(r1, r0)
                r0.inner = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver<U> r0 = r1.inner
                r0.dispose()
                io.reactivex.disposables.Disposable r0 = r1.f387s
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L18
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
            L18:
                return
        }

        void drain() {
                r4 = this;
                int r0 = r4.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r4.disposed
                if (r0 == 0) goto L11
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r4.queue
                r0.clear()
                return
            L11:
                boolean r0 = r4.active
                if (r0 != 0) goto L6b
                boolean r0 = r4.done
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r4.queue     // Catch: java.lang.Throwable -> L59
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L59
                r2 = 1
                if (r1 != 0) goto L22
                r3 = r2
                goto L23
            L22:
                r3 = 0
            L23:
                if (r0 == 0) goto L2f
                if (r3 == 0) goto L2f
                r4.disposed = r2
                io.reactivex.Observer<? super U> r0 = r4.actual
                r0.onComplete()
                return
            L2f:
                if (r3 != 0) goto L6b
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r0 = r4.mapper     // Catch: java.lang.Throwable -> L47
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "The mapper returned a null ObservableSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L47
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L47
                r4.active = r2
                io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver<U> r1 = r4.inner
                r0.subscribe(r1)
                goto L6b
            L47:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.dispose()
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r4.queue
                r1.clear()
                io.reactivex.Observer<? super U> r1 = r4.actual
                r1.onError(r0)
                return
            L59:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.dispose()
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r4.queue
                r1.clear()
                io.reactivex.Observer<? super U> r1 = r4.actual
                r1.onError(r0)
                return
            L6b:
                int r0 = r4.decrementAndGet()
                if (r0 != 0) goto L7
                return
        }

        void innerComplete() {
                r1 = this;
                r0 = 0
                r1.active = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
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
                r0 = 1
                r1.done = r0
                r1.dispose()
                io.reactivex.Observer<? super U> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.fusionMode
                if (r0 != 0) goto Le
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.offer(r2)
            Le:
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f387s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L42
                r2.f387s = r3
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L34
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 3
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L27
                r2.fusionMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.Observer<? super U> r3 = r2.actual
                r3.onSubscribe(r2)
                r2.drain()
                return
            L27:
                r1 = 2
                if (r0 != r1) goto L34
                r2.fusionMode = r0
                r2.queue = r3
                io.reactivex.Observer<? super U> r3 = r2.actual
                r3.onSubscribe(r2)
                return
            L34:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.bufferSize
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.Observer<? super U> r3 = r2.actual
                r3.onSubscribe(r2)
            L42:
                return
        }
    }

    public ObservableConcatMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, int r3, io.reactivex.internal.util.ErrorMode r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r4
            r1 = 8
            int r1 = java.lang.Math.max(r1, r3)
            r0.bufferSize = r1
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> r7) {
            r6 = this;
            io.reactivex.ObservableSource<T> r0 = r6.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r1 = r6.mapper
            boolean r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(r0, r7, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.internal.util.ErrorMode r0 = r6.delayErrors
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            if (r0 != r1) goto L25
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r7)
            io.reactivex.ObservableSource<T> r7 = r6.source
            io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver r1 = new io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2 = r6.mapper
            int r3 = r6.bufferSize
            r1.<init>(r0, r2, r3)
            r7.subscribe(r1)
            goto L3c
        L25:
            io.reactivex.ObservableSource<T> r0 = r6.source
            io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver r1 = new io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2 = r6.mapper
            int r3 = r6.bufferSize
            io.reactivex.internal.util.ErrorMode r4 = r6.delayErrors
            io.reactivex.internal.util.ErrorMode r5 = io.reactivex.internal.util.ErrorMode.END
            if (r4 != r5) goto L35
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            r1.<init>(r7, r2, r3, r4)
            r0.subscribe(r1)
        L3c:
            return
    }
}
