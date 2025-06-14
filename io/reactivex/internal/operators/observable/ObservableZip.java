package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableZip<T, R> extends io.reactivex.Observable<R> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        final boolean delayError;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] observers;
        final T[] row;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.zipper = r2
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver[] r1 = new io.reactivex.internal.operators.observable.ObservableZip.ZipObserver[r3]
                r0.observers = r1
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.row = r1
                r0.delayError = r4
                return
        }

        void cancel() {
                r0 = this;
                r0.clear()
                r0.cancelSources()
                return
        }

        void cancelSources() {
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r4.observers
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

        boolean checkTerminated(boolean r3, boolean r4, io.reactivex.Observer<? super R> r5, boolean r6, io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<?, ?> r7) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto L9
                r2.cancel()
                return r1
            L9:
                if (r3 == 0) goto L32
                if (r6 == 0) goto L1e
                if (r4 == 0) goto L32
                java.lang.Throwable r3 = r7.error
                r2.cancel()
                if (r3 == 0) goto L1a
                r5.onError(r3)
                goto L1d
            L1a:
                r5.onComplete()
            L1d:
                return r1
            L1e:
                java.lang.Throwable r3 = r7.error
                if (r3 == 0) goto L29
                r2.cancel()
                r5.onError(r3)
                return r1
            L29:
                if (r4 == 0) goto L32
                r2.cancel()
                r5.onComplete()
                return r1
            L32:
                r3 = 0
                return r3
        }

        void clear() {
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r4.observers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L10
                r3 = r0[r2]
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r3 = r3.queue
                r3.clear()
                int r2 = r2 + 1
                goto L4
            L10:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L13
                r0 = 1
                r1.cancelled = r0
                r1.cancelSources()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L13
                r1.clear()
            L13:
                return
        }

        public void drain() {
                r20 = this;
                r7 = r20
                int r0 = r20.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r7.observers
                io.reactivex.Observer<? super R> r8 = r7.actual
                T[] r9 = r7.row
                boolean r10 = r7.delayError
                r11 = 1
                r12 = r11
            L13:
                int r13 = r0.length
                r14 = 0
                r15 = r14
                r16 = r15
                r17 = r16
            L1a:
                if (r15 >= r13) goto L5c
                r6 = r0[r15]
                r1 = r9[r17]
                if (r1 != 0) goto L46
                boolean r2 = r6.done
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r1 = r6.queue
                java.lang.Object r18 = r1.poll()
                if (r18 != 0) goto L2f
                r19 = r11
                goto L31
            L2f:
                r19 = r14
            L31:
                r1 = r20
                r3 = r19
                r4 = r8
                r5 = r10
                boolean r1 = r1.checkTerminated(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L3e
                return
            L3e:
                if (r19 != 0) goto L43
                r9[r17] = r18
                goto L57
            L43:
                int r16 = r16 + 1
                goto L57
            L46:
                boolean r1 = r6.done
                if (r1 == 0) goto L57
                if (r10 != 0) goto L57
                java.lang.Throwable r1 = r6.error
                if (r1 == 0) goto L57
                r20.cancel()
                r8.onError(r1)
                return
            L57:
                int r17 = r17 + 1
                int r15 = r15 + 1
                goto L1a
            L5c:
                if (r16 == 0) goto L66
                int r1 = -r12
                int r12 = r7.addAndGet(r1)
                if (r12 != 0) goto L13
                return
            L66:
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1 = r7.zipper     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r9.clone()     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r1 = r1.apply(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.String r2 = "The zipper returned a null value"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L7e
                r8.onNext(r1)
                r1 = 0
                java.util.Arrays.fill(r9, r1)
                goto L13
            L7e:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r20.cancel()
                r8.onError(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] r6, int r7) {
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r5.observers
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto L11
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver r4 = new io.reactivex.internal.operators.observable.ObservableZip$ZipObserver
                r4.<init>(r5, r7)
                r0[r3] = r4
                int r3 = r3 + 1
                goto L5
            L11:
                r5.lazySet(r2)
                io.reactivex.Observer<? super R> r7 = r5.actual
                r7.onSubscribe(r5)
            L19:
                if (r2 >= r1) goto L2a
                boolean r7 = r5.cancelled
                if (r7 == 0) goto L20
                return
            L20:
                r7 = r6[r2]
                r3 = r0[r2]
                r7.subscribe(r3)
                int r2 = r2 + 1
                goto L19
            L2a:
                return
        }
    }

    static final class ZipObserver<T, R> implements io.reactivex.Observer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f479s;

        ZipObserver(io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.f479s = r0
                r1.parent = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r3)
                r1.queue = r2
                return
        }

        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f479s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator<T, R> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator<T, R> r1 = r0.parent
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator<T, R> r2 = r1.parent
                r2.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f479s
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }
    }

    public ObservableZip(io.reactivex.ObservableSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            r0.zipper = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r7) {
            r6 = this;
            io.reactivex.ObservableSource<? extends T>[] r0 = r6.sources
            if (r0 != 0) goto L2e
            r0 = 8
            io.reactivex.Observable[] r0 = new io.reactivex.Observable[r0]
            java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1 = r6.sourcesIterable
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
            if (r3 != 0) goto L35
            io.reactivex.internal.disposables.EmptyDisposable.complete(r7)
            return
        L35:
            io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator r1 = new io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2 = r6.zipper
            boolean r4 = r6.delayError
            r1.<init>(r7, r2, r3, r4)
            int r7 = r6.bufferSize
            r1.subscribe(r0, r7)
            return
    }
}
