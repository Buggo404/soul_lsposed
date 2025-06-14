package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableCombineLatest<T, R> extends io.reactivex.Observable<R> {
    final int bufferSize;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
    final boolean delayError;
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;

    static final class CombinerObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> parent;

        CombinerObserver(io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> r1, int r2) {
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

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r2.parent
                int r1 = r2.index
                r0.innerComplete(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r2.parent
                int r1 = r2.index
                r0.innerError(r1, r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r2.parent
                int r1 = r2.index
                r0.innerNext(r1, r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    static final class LatestCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        java.lang.Object[] latest;
        final io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] observers;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> queue;

        LatestCoordinator(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, int r5, boolean r6) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r1.errors = r0
                r1.actual = r2
                r1.combiner = r3
                r1.delayError = r6
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r1.latest = r2
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver[] r2 = new io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver[r4]
                r3 = 0
            L17:
                if (r3 >= r4) goto L23
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver r6 = new io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver
                r6.<init>(r1, r3)
                r2[r3] = r6
                int r3 = r3 + 1
                goto L17
            L23:
                r1.observers = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r5)
                r1.queue = r2
                return
        }

        void cancelSources() {
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver<T, R>[] r0 = r4.observers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        void clear(io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.latest = r0     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                r2.clear()
                return
            L9:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L15
                r0 = 1
                r1.cancelled = r0
                r1.cancelSources()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L15
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> r0 = r1.queue
                r1.clear(r0)
            L15:
                return
        }

        void drain() {
                r8 = this;
                int r0 = r8.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> r0 = r8.queue
                io.reactivex.Observer<? super R> r1 = r8.actual
                boolean r2 = r8.delayError
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r8.cancelled
                if (r5 == 0) goto L17
                r8.clear(r0)
                return
            L17:
                if (r2 != 0) goto L31
                io.reactivex.internal.util.AtomicThrowable r5 = r8.errors
                java.lang.Object r5 = r5.get()
                if (r5 == 0) goto L31
                r8.cancelSources()
                r8.clear(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r8.errors
                java.lang.Throwable r0 = r0.terminate()
                r1.onError(r0)
                return
            L31:
                boolean r5 = r8.done
                java.lang.Object r6 = r0.poll()
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                if (r6 != 0) goto L3d
                r7 = r3
                goto L3e
            L3d:
                r7 = 0
            L3e:
                if (r5 == 0) goto L55
                if (r7 == 0) goto L55
                r8.clear(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r8.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 != 0) goto L51
                r1.onComplete()
                goto L54
            L51:
                r1.onError(r0)
            L54:
                return
            L55:
                if (r7 == 0) goto L5f
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            L5f:
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r5 = r8.combiner     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r5 = r5.apply(r6)     // Catch: java.lang.Throwable -> L6f
                java.lang.String r6 = "The combiner returned a null value"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r6)     // Catch: java.lang.Throwable -> L6f
                r1.onNext(r5)
                goto Lf
            L6f:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.internal.util.AtomicThrowable r3 = r8.errors
                r3.addThrowable(r2)
                r8.cancelSources()
                r8.clear(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r8.errors
                java.lang.Throwable r0 = r0.terminate()
                r1.onError(r0)
                return
        }

        void innerComplete(int r4) {
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch: java.lang.Throwable -> L25
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                return
            L7:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L25
                r1 = 1
                if (r4 != 0) goto Le
                r4 = r1
                goto Lf
            Le:
                r4 = 0
            Lf:
                if (r4 != 0) goto L19
                int r2 = r3.complete     // Catch: java.lang.Throwable -> L25
                int r2 = r2 + r1
                r3.complete = r2     // Catch: java.lang.Throwable -> L25
                int r0 = r0.length     // Catch: java.lang.Throwable -> L25
                if (r2 != r0) goto L1b
            L19:
                r3.done = r1     // Catch: java.lang.Throwable -> L25
            L1b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                if (r4 == 0) goto L21
                r3.cancelSources()
            L21:
                r3.drain()
                return
            L25:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r4
        }

        void innerError(int r3, java.lang.Throwable r4) {
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L36
                boolean r4 = r2.delayError
                r0 = 1
                if (r4 == 0) goto L2d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.latest     // Catch: java.lang.Throwable -> L2a
                if (r4 != 0) goto L14
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                return
            L14:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L1a
                r3 = r0
                goto L1b
            L1a:
                r3 = 0
            L1b:
                if (r3 != 0) goto L25
                int r1 = r2.complete     // Catch: java.lang.Throwable -> L2a
                int r1 = r1 + r0
                r2.complete = r1     // Catch: java.lang.Throwable -> L2a
                int r4 = r4.length     // Catch: java.lang.Throwable -> L2a
                if (r1 != r4) goto L27
            L25:
                r2.done = r0     // Catch: java.lang.Throwable -> L2a
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r0 = r3
                goto L2d
            L2a:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                throw r3
            L2d:
                if (r0 == 0) goto L32
                r2.cancelSources()
            L32:
                r2.drain()
                goto L39
            L36:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L39:
                return
        }

        void innerNext(int r4, T r5) {
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch: java.lang.Throwable -> L29
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
                return
            L7:
                r1 = r0[r4]     // Catch: java.lang.Throwable -> L29
                int r2 = r3.active     // Catch: java.lang.Throwable -> L29
                if (r1 != 0) goto L11
                int r2 = r2 + 1
                r3.active = r2     // Catch: java.lang.Throwable -> L29
            L11:
                r0[r4] = r5     // Catch: java.lang.Throwable -> L29
                int r4 = r0.length     // Catch: java.lang.Throwable -> L29
                if (r2 != r4) goto L21
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> r4 = r3.queue     // Catch: java.lang.Throwable -> L29
                java.lang.Object r5 = r0.clone()     // Catch: java.lang.Throwable -> L29
                r4.offer(r5)     // Catch: java.lang.Throwable -> L29
                r4 = 1
                goto L22
            L21:
                r4 = 0
            L22:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
                if (r4 == 0) goto L28
                r3.drain()
            L28:
                return
            L29:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
                throw r4
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] r6) {
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver<T, R>[] r0 = r5.observers
                int r1 = r0.length
                io.reactivex.Observer<? super R> r2 = r5.actual
                r2.onSubscribe(r5)
                r2 = 0
            L9:
                if (r2 >= r1) goto L1e
                boolean r3 = r5.done
                if (r3 != 0) goto L1e
                boolean r3 = r5.cancelled
                if (r3 == 0) goto L14
                goto L1e
            L14:
                r3 = r6[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L9
            L1e:
                return
        }
    }

    public ObservableCombineLatest(io.reactivex.ObservableSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            r0.combiner = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r9) {
            r8 = this;
            io.reactivex.ObservableSource<? extends T>[] r0 = r8.sources
            if (r0 != 0) goto L2e
            r0 = 8
            io.reactivex.Observable[] r0 = new io.reactivex.Observable[r0]
            java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1 = r8.sourcesIterable
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r1.next()
            io.reactivex.ObservableSource r4 = (io.reactivex.ObservableSource) r4
            int r5 = r0.length
            if (r3 != r5) goto L28
            int r5 = r3 >> 2
            int r5 = r5 + r3
            io.reactivex.ObservableSource[] r5 = new io.reactivex.ObservableSource[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            r0 = r5
        L28:
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
            goto L10
        L2e:
            int r3 = r0.length
        L2f:
            r4 = r3
            if (r4 != 0) goto L36
            io.reactivex.internal.disposables.EmptyDisposable.complete(r9)
            return
        L36:
            io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator r7 = new io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3 = r8.combiner
            int r5 = r8.bufferSize
            boolean r6 = r8.delayError
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.subscribe(r0)
            return
    }
}
