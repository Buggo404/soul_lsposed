package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int bufferSize;
    final io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> close;
    final io.reactivex.ObservableSource<B> open;

    static final class OperatorWindowBoundaryCloseObserver<T, V> extends io.reactivex.observers.DisposableObserver<V> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> parent;

        /* renamed from: w */
        final io.reactivex.subjects.UnicastSubject<T> f468w;

        OperatorWindowBoundaryCloseObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> r1, io.reactivex.subjects.UnicastSubject<T> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.f468w = r2
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
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver<T, ?, V> r0 = r1.parent
                r0.close(r1)
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
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver<T, ?, V> r0 = r1.parent
                r0.error(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(V r1) {
                r0 = this;
                r0.dispose()
                r0.onComplete()
                return
        }
    }

    static final class OperatorWindowBoundaryOpenObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> parent;

        OperatorWindowBoundaryOpenObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver<T, B, ?> r0 = r1.parent
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver<T, B, ?> r0 = r1.parent
                r0.error(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(B r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver<T, B, ?> r0 = r1.parent
                r0.open(r2)
                return
        }
    }

    static final class WindowBoundaryMainObserver<T, B, V> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> boundary;
        final int bufferSize;
        final io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> close;
        final io.reactivex.ObservableSource<B> open;
        final io.reactivex.disposables.CompositeDisposable resources;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f469s;
        final java.util.concurrent.atomic.AtomicLong windows;

        /* renamed from: ws */
        final java.util.List<io.reactivex.subjects.UnicastSubject<T>> f470ws;

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r2, io.reactivex.ObservableSource<B> r3, io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> r4, int r5) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.boundary = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.windows = r2
                r1.open = r3
                r1.close = r4
                r1.bufferSize = r5
                io.reactivex.disposables.CompositeDisposable r3 = new io.reactivex.disposables.CompositeDisposable
                r3.<init>()
                r1.resources = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f470ws = r3
                r3 = 1
                r2.lazySet(r3)
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public void accept(io.reactivex.Observer<? super io.reactivex.Observable<T>> r1, java.lang.Object r2) {
                r0 = this;
                return
        }

        void close(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryCloseObserver<T, V> r4) {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.resources
                r0.delete(r4)
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowOperation r1 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowOperation
                io.reactivex.subjects.UnicastSubject<T> r4 = r4.f468w
                r2 = 0
                r1.<init>(r4, r2)
                r0.offer(r1)
                boolean r4 = r3.enter()
                if (r4 == 0) goto L1b
                r3.drainLoop()
            L1b:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void disposeBoundary() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void drainLoop() {
                r9 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r9.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r9.actual
                java.util.List<io.reactivex.subjects.UnicastSubject<T>> r2 = r9.f470ws
                r3 = 1
                r4 = r3
            La:
                boolean r5 = r9.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L14
                r7 = r3
                goto L15
            L14:
                r7 = 0
            L15:
                if (r5 == 0) goto L4c
                if (r7 == 0) goto L4c
                r9.disposeBoundary()
                java.lang.Throwable r0 = r9.error
                if (r0 == 0) goto L34
                java.util.Iterator r1 = r2.iterator()
            L24:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L48
                java.lang.Object r3 = r1.next()
                io.reactivex.subjects.UnicastSubject r3 = (io.reactivex.subjects.UnicastSubject) r3
                r3.onError(r0)
                goto L24
            L34:
                java.util.Iterator r0 = r2.iterator()
            L38:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L48
                java.lang.Object r1 = r0.next()
                io.reactivex.subjects.UnicastSubject r1 = (io.reactivex.subjects.UnicastSubject) r1
                r1.onComplete()
                goto L38
            L48:
                r2.clear()
                return
            L4c:
                if (r7 == 0) goto L56
                int r4 = -r4
                int r4 = r9.leave(r4)
                if (r4 != 0) goto La
                return
            L56:
                boolean r5 = r6 instanceof io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation
                if (r5 == 0) goto Lc0
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowOperation r6 = (io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation) r6
                io.reactivex.subjects.UnicastSubject<T> r5 = r6.f471w
                if (r5 == 0) goto L7d
                io.reactivex.subjects.UnicastSubject<T> r5 = r6.f471w
                boolean r5 = r2.remove(r5)
                if (r5 == 0) goto La
                io.reactivex.subjects.UnicastSubject<T> r5 = r6.f471w
                r5.onComplete()
                java.util.concurrent.atomic.AtomicLong r5 = r9.windows
                long r5 = r5.decrementAndGet()
                r7 = 0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 != 0) goto La
                r9.disposeBoundary()
                return
            L7d:
                boolean r5 = r9.cancelled
                if (r5 == 0) goto L82
                goto La
            L82:
                int r5 = r9.bufferSize
                io.reactivex.subjects.UnicastSubject r5 = io.reactivex.subjects.UnicastSubject.create(r5)
                r2.add(r5)
                r1.onNext(r5)
                io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> r7 = r9.close     // Catch: java.lang.Throwable -> Lb5
                B r6 = r6.open     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r6 = r7.apply(r6)     // Catch: java.lang.Throwable -> Lb5
                java.lang.String r7 = "The ObservableSource supplied is null"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> Lb5
                io.reactivex.ObservableSource r6 = (io.reactivex.ObservableSource) r6     // Catch: java.lang.Throwable -> Lb5
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$OperatorWindowBoundaryCloseObserver r7 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$OperatorWindowBoundaryCloseObserver
                r7.<init>(r9, r5)
                io.reactivex.disposables.CompositeDisposable r5 = r9.resources
                boolean r5 = r5.add(r7)
                if (r5 == 0) goto La
                java.util.concurrent.atomic.AtomicLong r5 = r9.windows
                r5.getAndIncrement()
                r6.subscribe(r7)
                goto La
            Lb5:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                r9.cancelled = r3
                r1.onError(r5)
                goto La
            Lc0:
                java.util.Iterator r5 = r2.iterator()
            Lc4:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto La
                java.lang.Object r7 = r5.next()
                io.reactivex.subjects.UnicastSubject r7 = (io.reactivex.subjects.UnicastSubject) r7
                java.lang.Object r8 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r7.onNext(r8)
                goto Lc4
        }

        void error(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f469s
                r0.dispose()
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                r0.dispose()
                r1.onError(r2)
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
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L11
                r4.drainLoop()
            L11:
                java.util.concurrent.atomic.AtomicLong r0 = r4.windows
                long r0 = r0.decrementAndGet()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L22
                io.reactivex.disposables.CompositeDisposable r0 = r4.resources
                r0.dispose()
            L22:
                io.reactivex.Observer<? super V> r0 = r4.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
                return
            L8:
                r4.error = r5
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L16
                r4.drainLoop()
            L16:
                java.util.concurrent.atomic.AtomicLong r0 = r4.windows
                long r0 = r0.decrementAndGet()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L27
                io.reactivex.disposables.CompositeDisposable r0 = r4.resources
                r0.dispose()
            L27:
                io.reactivex.Observer<? super V> r0 = r4.actual
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.fastEnter()
                if (r0 == 0) goto L24
                java.util.List<io.reactivex.subjects.UnicastSubject<T>> r0 = r2.f470ws
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                io.reactivex.subjects.UnicastSubject r1 = (io.reactivex.subjects.UnicastSubject) r1
                r1.onNext(r3)
                goto Lc
            L1c:
                r3 = -1
                int r3 = r2.leave(r3)
                if (r3 != 0) goto L34
                return
            L24:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.next(r3)
                r0.offer(r3)
                boolean r3 = r2.enter()
                if (r3 != 0) goto L34
                return
            L34:
                r2.drainLoop()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f469s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L2c
                r2.f469s = r3
                io.reactivex.Observer<? super V> r3 = r2.actual
                r3.onSubscribe(r2)
                boolean r3 = r2.cancelled
                if (r3 == 0) goto L14
                return
            L14:
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$OperatorWindowBoundaryOpenObserver r3 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$OperatorWindowBoundaryOpenObserver
                r3.<init>(r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.boundary
                r1 = 0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r3)
                if (r0 == 0) goto L2c
                java.util.concurrent.atomic.AtomicLong r0 = r2.windows
                r0.getAndIncrement()
                io.reactivex.ObservableSource<B> r0 = r2.open
                r0.subscribe(r3)
            L2c:
                return
        }

        void open(B r4) {
                r3 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowOperation r1 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowOperation
                r2 = 0
                r1.<init>(r2, r4)
                r0.offer(r1)
                boolean r4 = r3.enter()
                if (r4 == 0) goto L14
                r3.drainLoop()
            L14:
                return
        }
    }

    static final class WindowOperation<T, B> {
        final B open;

        /* renamed from: w */
        final io.reactivex.subjects.UnicastSubject<T> f471w;

        WindowOperation(io.reactivex.subjects.UnicastSubject<T> r1, B r2) {
                r0 = this;
                r0.<init>()
                r0.f471w = r1
                r0.open = r2
                return
        }
    }

    public ObservableWindowBoundarySelector(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<B> r2, io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.open = r2
            r0.close = r3
            r0.bufferSize = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver r1 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$WindowBoundaryMainObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r6)
            io.reactivex.ObservableSource<B> r6 = r5.open
            io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> r3 = r5.close
            int r4 = r5.bufferSize
            r1.<init>(r2, r6, r3, r4)
            r0.subscribe(r1)
            return
    }
}
