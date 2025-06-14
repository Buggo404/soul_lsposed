package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableWindowBoundary<T, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int capacityHint;
    final io.reactivex.ObservableSource<B> other;

    static final class WindowBoundaryInnerObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> parent;

        WindowBoundaryInnerObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
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
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> r0 = r1.parent
                r0.innerComplete()
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
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(B r1) {
                r0 = this;
                boolean r1 = r0.done
                if (r1 == 0) goto L5
                return
            L5:
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> r1 = r0.parent
                r1.innerNext()
                return
        }
    }

    static final class WindowBoundaryMainObserver<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final java.lang.Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 2233020065421370272L;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryInnerObserver<T, B> boundaryObserver;
        final int capacityHint;
        volatile boolean done;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> downstream;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicBoolean stopWindows;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;
        io.reactivex.subjects.UnicastSubject<T> window;
        final java.util.concurrent.atomic.AtomicInteger windows;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver.NEXT_WINDOW = r0
                return
        }

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.capacityHint = r2
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver r1 = new io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver
                r1.<init>(r0)
                r0.boundaryObserver = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.windows = r1
                io.reactivex.internal.queue.MpscLinkedQueue r1 = new io.reactivex.internal.queue.MpscLinkedQueue
                r1.<init>()
                r0.queue = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.stopWindows = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.stopWindows
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L1c
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver<T, B> r0 = r3.boundaryObserver
                r0.dispose()
                java.util.concurrent.atomic.AtomicInteger r0 = r3.windows
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1c
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L1c:
                return
        }

        void drain() {
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r0 = r10.downstream
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r1 = r10.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r10.errors
                r3 = 1
                r4 = r3
            Lf:
                java.util.concurrent.atomic.AtomicInteger r5 = r10.windows
                int r5 = r5.get()
                r6 = 0
                if (r5 != 0) goto L1e
                r1.clear()
                r10.window = r6
                return
            L1e:
                io.reactivex.subjects.UnicastSubject<T> r5 = r10.window
                boolean r7 = r10.done
                if (r7 == 0) goto L3c
                java.lang.Object r8 = r2.get()
                if (r8 == 0) goto L3c
                r1.clear()
                java.lang.Throwable r1 = r2.terminate()
                if (r5 == 0) goto L38
                r10.window = r6
                r5.onError(r1)
            L38:
                r0.onError(r1)
                return
            L3c:
                java.lang.Object r8 = r1.poll()
                if (r8 != 0) goto L44
                r9 = r3
                goto L45
            L44:
                r9 = 0
            L45:
                if (r7 == 0) goto L65
                if (r9 == 0) goto L65
                java.lang.Throwable r1 = r2.terminate()
                if (r1 != 0) goto L5a
                if (r5 == 0) goto L56
                r10.window = r6
                r5.onComplete()
            L56:
                r0.onComplete()
                goto L64
            L5a:
                if (r5 == 0) goto L61
                r10.window = r6
                r5.onError(r1)
            L61:
                r0.onError(r1)
            L64:
                return
            L65:
                if (r9 == 0) goto L6f
                int r4 = -r4
                int r4 = r10.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            L6f:
                java.lang.Object r7 = io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver.NEXT_WINDOW
                if (r8 == r7) goto L77
                r5.onNext(r8)
                goto Lf
            L77:
                if (r5 == 0) goto L7e
                r10.window = r6
                r5.onComplete()
            L7e:
                java.util.concurrent.atomic.AtomicBoolean r5 = r10.stopWindows
                boolean r5 = r5.get()
                if (r5 != 0) goto Lf
                int r5 = r10.capacityHint
                io.reactivex.subjects.UnicastSubject r5 = io.reactivex.subjects.UnicastSubject.create(r5, r10)
                r10.window = r5
                java.util.concurrent.atomic.AtomicInteger r6 = r10.windows
                r6.getAndIncrement()
                r0.onNext(r5)
                goto Lf
        }

        void innerComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        void innerError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L14
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L17
            L14:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L17:
                return
        }

        void innerNext() {
                r2 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r0 = r2.queue
                java.lang.Object r1 = io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver.NEXT_WINDOW
                r0.offer(r1)
                r2.drain()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.stopWindows
                boolean r0 = r0.get()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver<T, B> r0 = r1.boundaryObserver
                r0.dispose()
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver<T, B> r0 = r1.boundaryObserver
                r0.dispose()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L14
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L17
            L14:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L17:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                if (r2 == 0) goto Lb
                r1.innerNext()
            Lb:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.windows
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Ld
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            Ld:
                return
        }
    }

    public ObservableWindowBoundary(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<B> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.capacityHint = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver r0 = new io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver
            int r1 = r2.capacityHint
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            io.reactivex.ObservableSource<B> r3 = r2.other
            io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver<T, B> r1 = r0.boundaryObserver
            r3.subscribe(r1)
            io.reactivex.ObservableSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
