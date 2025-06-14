package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class ObservableBufferBoundary<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> bufferClose;
    final io.reactivex.ObservableSource<? extends Open> bufferOpen;
    final java.util.concurrent.Callable<U> bufferSupplier;

    static final class BufferBoundaryObserver<T, C extends java.util.Collection<? super T>, Open, Close> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8466418554264089604L;
        final io.reactivex.Observer<? super C> actual;
        final io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> bufferClose;
        final io.reactivex.ObservableSource<? extends Open> bufferOpen;
        final java.util.concurrent.Callable<C> bufferSupplier;
        java.util.Map<java.lang.Long, C> buffers;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        long index;
        final io.reactivex.disposables.CompositeDisposable observers;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<C> queue;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;

        static final class BufferOpenObserver<Open> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<Open>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> parent;

            BufferOpenObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                    r2 = this;
                    java.lang.Object r0 = r2.get()
                    io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                    if (r0 != r1) goto La
                    r0 = 1
                    goto Lb
                La:
                    r0 = 0
                Lb:
                    return r0
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                    r1.lazySet(r0)
                    io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> r0 = r1.parent
                    r0.openComplete(r1)
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                    r1.lazySet(r0)
                    io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> r0 = r1.parent
                    r0.boundaryError(r1, r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(Open r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> r0 = r1.parent
                    r0.open(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        BufferBoundaryObserver(io.reactivex.Observer<? super C> r1, io.reactivex.ObservableSource<? extends Open> r2, io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r3, java.util.concurrent.Callable<C> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.bufferSupplier = r4
                r0.bufferOpen = r2
                r0.bufferClose = r3
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r2 = io.reactivex.Observable.bufferSize()
                r1.<init>(r2)
                r0.queue = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.observers = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                r0.buffers = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                return
        }

        void boundaryError(io.reactivex.disposables.Disposable r2, java.lang.Throwable r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.disposables.CompositeDisposable r0 = r1.observers
                r0.delete(r2)
                r1.onError(r3)
                return
        }

        void close(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferCloseObserver<T, C> r4, long r5) {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.observers
                r0.delete(r4)
                io.reactivex.disposables.CompositeDisposable r4 = r3.observers
                int r4 = r4.size()
                r0 = 1
                if (r4 != 0) goto L15
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r4 = r3.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r4)
                r4 = r0
                goto L16
            L15:
                r4 = 0
            L16:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch: java.lang.Throwable -> L33
                if (r1 != 0) goto L1d
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                return
            L1d:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r2 = r3.queue     // Catch: java.lang.Throwable -> L33
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r1.remove(r5)     // Catch: java.lang.Throwable -> L33
                r2.offer(r5)     // Catch: java.lang.Throwable -> L33
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L2f
                r3.done = r0
            L2f:
                r3.drain()
                return
            L33:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                throw r4
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                if (r0 == 0) goto L24
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.observers
                r0.dispose()
                monitor-enter(r1)
                r0 = 0
                r1.buffers = r0     // Catch: java.lang.Throwable -> L21
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L24
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r0 = r1.queue
                r0.clear()
                goto L24
            L21:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
                throw r0
            L24:
                return
        }

        void drain() {
                r7 = this;
                int r0 = r7.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super C extends java.util.Collection<? super T>> r0 = r7.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r1 = r7.queue
                r2 = 1
                r3 = r2
            Ld:
                boolean r4 = r7.cancelled
                if (r4 == 0) goto L15
                r1.clear()
                return
            L15:
                boolean r4 = r7.done
                if (r4 == 0) goto L2e
                io.reactivex.internal.util.AtomicThrowable r5 = r7.errors
                java.lang.Object r5 = r5.get()
                if (r5 == 0) goto L2e
                r1.clear()
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L2e:
                java.lang.Object r5 = r1.poll()
                java.util.Collection r5 = (java.util.Collection) r5
                if (r5 != 0) goto L38
                r6 = r2
                goto L39
            L38:
                r6 = 0
            L39:
                if (r4 == 0) goto L41
                if (r6 == 0) goto L41
                r0.onComplete()
                return
            L41:
                if (r6 == 0) goto L4b
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto Ld
                return
            L4b:
                r0.onNext(r5)
                goto Ld
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.observers
                r0.dispose()
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r0 = r3.buffers     // Catch: java.lang.Throwable -> L31
                if (r0 != 0) goto Lc
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                return
            Lc:
                java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L31
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31
            L14:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L26
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L31
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L31
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r2 = r3.queue     // Catch: java.lang.Throwable -> L31
                r2.offer(r1)     // Catch: java.lang.Throwable -> L31
                goto L14
            L26:
                r0 = 0
                r3.buffers = r0     // Catch: java.lang.Throwable -> L31
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                r0 = 1
                r3.done = r0
                r3.drain()
                return
            L31:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1c
                io.reactivex.disposables.CompositeDisposable r2 = r1.observers
                r2.dispose()
                monitor-enter(r1)
                r2 = 0
                r1.buffers = r2     // Catch: java.lang.Throwable -> L19
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1f
            L19:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
                throw r2
            L1c:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1f:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
                return
            L7:
                java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L21
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
            Lf:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L21
                r1.add(r3)     // Catch: java.lang.Throwable -> L21
                goto Lf
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
                throw r3
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                if (r2 == 0) goto L17
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver r2 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver
                r2.<init>(r1)
                io.reactivex.disposables.CompositeDisposable r0 = r1.observers
                r0.add(r2)
                io.reactivex.ObservableSource<? extends Open> r0 = r1.bufferOpen
                r0.subscribe(r2)
            L17:
                return
        }

        void open(Open r6) {
                r5 = this;
                java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r0 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L43
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = "The bufferSupplier returned a null Collection"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L43
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L43
                io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r1 = r5.bufferClose     // Catch: java.lang.Throwable -> L43
                java.lang.Object r6 = r1.apply(r6)     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = "The bufferClose returned a null ObservableSource"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r1)     // Catch: java.lang.Throwable -> L43
                io.reactivex.ObservableSource r6 = (io.reactivex.ObservableSource) r6     // Catch: java.lang.Throwable -> L43
                long r1 = r5.index
                r3 = 1
                long r3 = r3 + r1
                r5.index = r3
                monitor-enter(r5)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r3 = r5.buffers     // Catch: java.lang.Throwable -> L40
                if (r3 != 0) goto L2a
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
                return
            L2a:
                java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L40
                r3.put(r4, r0)     // Catch: java.lang.Throwable -> L40
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver r0 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver
                r0.<init>(r5, r1)
                io.reactivex.disposables.CompositeDisposable r1 = r5.observers
                r1.add(r0)
                r6.subscribe(r0)
                return
            L40:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
                throw r6
            L43:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r5.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                r5.onError(r6)
                return
        }

        void openComplete(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver.BufferOpenObserver<Open> r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.observers
                r0.delete(r2)
                io.reactivex.disposables.CompositeDisposable r2 = r1.observers
                int r2 = r2.size()
                if (r2 != 0) goto L18
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                r2 = 1
                r1.done = r2
                r1.drain()
            L18:
                return
        }
    }

    static final class BufferCloseObserver<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, C, ?, ?> parent;

        BufferCloseObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, C, ?, ?> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L14
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r3.lazySet(r0)
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, C extends java.util.Collection<? super T>, ?, ?> r0 = r3.parent
                long r1 = r3.index
                r0.close(r3, r1)
            L14:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L13
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.lazySet(r0)
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, C extends java.util.Collection<? super T>, ?, ?> r0 = r2.parent
                r0.boundaryError(r2, r3)
                goto L16
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L16:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r3 = r2.get()
                io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r3 == r0) goto L19
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.lazySet(r0)
                r3.dispose()
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, C extends java.util.Collection<? super T>, ?, ?> r3 = r2.parent
                long r0 = r2.index
                r3.close(r2, r0)
            L19:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableBufferBoundary(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<? extends Open> r2, io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r3, java.util.concurrent.Callable<U> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferOpen = r2
            r0.bufferClose = r3
            r0.bufferSupplier = r4
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r5) {
            r4 = this;
            io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver r0 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver
            io.reactivex.ObservableSource<? extends Open> r1 = r4.bufferOpen
            io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r2 = r4.bufferClose
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r4.bufferSupplier
            r0.<init>(r5, r1, r2, r3)
            r5.onSubscribe(r0)
            io.reactivex.ObservableSource<T> r5 = r4.source
            r5.subscribe(r0)
            return
    }
}
