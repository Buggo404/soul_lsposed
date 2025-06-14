package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableWindowTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    static final class WindowExactBoundedObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f472s;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.subjects.UnicastSubject<T> window;
        final io.reactivex.Scheduler.Worker worker;

        static final class ConsumerIndexHolder implements java.lang.Runnable {
            final long index;
            final io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> parent;

            ConsumerIndexHolder(long r1, io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.index = r1
                    r0.parent = r3
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver<?> r0 = r2.parent
                    boolean r1 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.access$000(r0)
                    if (r1 != 0) goto L10
                    io.reactivex.internal.fuseable.SimplePlainQueue r1 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.access$100(r0)
                    r1.offer(r2)
                    goto L16
                L10:
                    r1 = 1
                    r0.terminated = r1
                    r0.disposeTimer()
                L16:
                    boolean r1 = r0.enter()
                    if (r1 == 0) goto L1f
                    r0.drainLoop()
                L1f:
                    return
            }
        }

        WindowExactBoundedObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6, int r7, long r8, boolean r10) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.timer = r2
                r1.timespan = r3
                r1.unit = r5
                r1.scheduler = r6
                r1.bufferSize = r7
                r1.maxSize = r8
                r1.restartTimerOnMaxSize = r10
                if (r10 == 0) goto L24
                io.reactivex.Scheduler$Worker r2 = r6.createWorker()
                r1.worker = r2
                goto L27
            L24:
                r2 = 0
                r1.worker = r2
            L27:
                return
        }

        static /* synthetic */ boolean access$000(io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver r0) {
                boolean r0 = r0.cancelled
                return r0
        }

        static /* synthetic */ io.reactivex.internal.fuseable.SimplePlainQueue access$100(io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver r0) {
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r0.queue
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void disposeTimer() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                if (r0 == 0) goto Lc
                r0.dispose()
            Lc:
                return
        }

        void drainLoop() {
                r13 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r13.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r13.actual
                io.reactivex.subjects.UnicastSubject<T> r2 = r13.window
                r3 = 1
                r4 = r3
            La:
                boolean r5 = r13.terminated
                if (r5 == 0) goto L1a
                io.reactivex.disposables.Disposable r1 = r13.f472s
                r1.dispose()
                r0.clear()
                r13.disposeTimer()
                return
            L1a:
                boolean r5 = r13.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L24
                r7 = r3
                goto L25
            L24:
                r7 = 0
            L25:
                boolean r8 = r6 instanceof io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder
                if (r5 == 0) goto L42
                if (r7 != 0) goto L2d
                if (r8 == 0) goto L42
            L2d:
                r1 = 0
                r13.window = r1
                r0.clear()
                r13.disposeTimer()
                java.lang.Throwable r0 = r13.error
                if (r0 == 0) goto L3e
                r2.onError(r0)
                goto L41
            L3e:
                r2.onComplete()
            L41:
                return
            L42:
                if (r7 == 0) goto L4c
                int r4 = -r4
                int r4 = r13.leave(r4)
                if (r4 != 0) goto La
                return
            L4c:
                r9 = 0
                if (r8 == 0) goto L6f
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder r6 = (io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder) r6
                boolean r5 = r13.restartTimerOnMaxSize
                if (r5 != 0) goto L5e
                long r7 = r13.producerIndex
                long r5 = r6.index
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r5 != 0) goto La
            L5e:
                r2.onComplete()
                r13.count = r9
                int r2 = r13.bufferSize
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.create(r2)
                r13.window = r2
                r1.onNext(r2)
                goto La
            L6f:
                java.lang.Object r5 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r5)
                long r5 = r13.count
                r7 = 1
                long r5 = r5 + r7
                long r11 = r13.maxSize
                int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r11 < 0) goto Lc6
                long r5 = r13.producerIndex
                long r5 = r5 + r7
                r13.producerIndex = r5
                r13.count = r9
                r2.onComplete()
                int r2 = r13.bufferSize
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.create(r2)
                r13.window = r2
                io.reactivex.Observer<? super V> r5 = r13.actual
                r5.onNext(r2)
                boolean r5 = r13.restartTimerOnMaxSize
                if (r5 == 0) goto La
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r5 = r13.timer
                java.lang.Object r5 = r5.get()
                io.reactivex.disposables.Disposable r5 = (io.reactivex.disposables.Disposable) r5
                r5.dispose()
                io.reactivex.Scheduler$Worker r6 = r13.worker
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder r7 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder
                long r8 = r13.producerIndex
                r7.<init>(r8, r13)
                long r10 = r13.timespan
                java.util.concurrent.TimeUnit r12 = r13.unit
                r8 = r10
                io.reactivex.disposables.Disposable r6 = r6.schedulePeriodically(r7, r8, r10, r12)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r7 = r13.timer
                boolean r5 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r7, r5, r6)
                if (r5 != 0) goto La
                r6.dispose()
                goto La
            Lc6:
                r13.count = r5
                goto La
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
                boolean r0 = r1.enter()
                if (r0 == 0) goto Lc
                r1.drainLoop()
            Lc:
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onComplete()
                r1.disposeTimer()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Le
                r1.drainLoop()
            Le:
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                r1.disposeTimer()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r8) {
                r7 = this;
                boolean r0 = r7.terminated
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r7.fastEnter()
                if (r0 == 0) goto L65
                io.reactivex.subjects.UnicastSubject<T> r0 = r7.window
                r0.onNext(r8)
                long r1 = r7.count
                r3 = 1
                long r1 = r1 + r3
                long r5 = r7.maxSize
                int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r8 < 0) goto L5b
                long r1 = r7.producerIndex
                long r1 = r1 + r3
                r7.producerIndex = r1
                r1 = 0
                r7.count = r1
                r0.onComplete()
                int r8 = r7.bufferSize
                io.reactivex.subjects.UnicastSubject r8 = io.reactivex.subjects.UnicastSubject.create(r8)
                r7.window = r8
                io.reactivex.Observer<? super V> r0 = r7.actual
                r0.onNext(r8)
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L5d
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r8 = r7.timer
                java.lang.Object r8 = r8.get()
                io.reactivex.disposables.Disposable r8 = (io.reactivex.disposables.Disposable) r8
                r8.dispose()
                io.reactivex.Scheduler$Worker r0 = r7.worker
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder r1 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder
                long r2 = r7.producerIndex
                r1.<init>(r2, r7)
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r8)
                goto L5d
            L5b:
                r7.count = r1
            L5d:
                r8 = -1
                int r8 = r7.leave(r8)
                if (r8 != 0) goto L75
                return
            L65:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r7.queue
                java.lang.Object r8 = io.reactivex.internal.util.NotificationLite.next(r8)
                r0.offer(r8)
                boolean r8 = r7.enter()
                if (r8 != 0) goto L75
                return
            L75:
                r7.drainLoop()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r9) {
                r8 = this;
                io.reactivex.disposables.Disposable r0 = r8.f472s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r9)
                if (r0 == 0) goto L46
                r8.f472s = r9
                io.reactivex.Observer<? super V> r9 = r8.actual
                r9.onSubscribe(r8)
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L14
                return
            L14:
                int r0 = r8.bufferSize
                io.reactivex.subjects.UnicastSubject r0 = io.reactivex.subjects.UnicastSubject.create(r0)
                r8.window = r0
                r9.onNext(r0)
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder r2 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder
                long r0 = r8.producerIndex
                r2.<init>(r0, r8)
                boolean r9 = r8.restartTimerOnMaxSize
                if (r9 == 0) goto L36
                io.reactivex.Scheduler$Worker r1 = r8.worker
                long r5 = r8.timespan
                java.util.concurrent.TimeUnit r7 = r8.unit
                r3 = r5
                io.reactivex.disposables.Disposable r9 = r1.schedulePeriodically(r2, r3, r5, r7)
                goto L41
            L36:
                io.reactivex.Scheduler r1 = r8.scheduler
                long r5 = r8.timespan
                java.util.concurrent.TimeUnit r7 = r8.unit
                r3 = r5
                io.reactivex.disposables.Disposable r9 = r1.schedulePeriodicallyDirect(r2, r3, r5, r7)
            L41:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r8.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r9)
            L46:
                return
        }
    }

    static final class WindowExactUnboundedObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final java.lang.Object NEXT = null;
        final int bufferSize;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f473s;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.subjects.UnicastSubject<T> window;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.NEXT = r0
                return
        }

        WindowExactUnboundedObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6, int r7) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.timer = r2
                r1.timespan = r3
                r1.unit = r5
                r1.scheduler = r6
                r1.bufferSize = r7
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void disposeTimer() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void drainLoop() {
                r7 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r7.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r7.actual
                io.reactivex.subjects.UnicastSubject<T> r2 = r7.window
                r3 = 1
            L9:
                boolean r4 = r7.terminated
                boolean r5 = r7.done
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L2e
                if (r6 == 0) goto L19
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.NEXT
                if (r6 != r5) goto L2e
            L19:
                r1 = 0
                r7.window = r1
                r0.clear()
                r7.disposeTimer()
                java.lang.Throwable r0 = r7.error
                if (r0 == 0) goto L2a
                r2.onError(r0)
                goto L2d
            L2a:
                r2.onComplete()
            L2d:
                return
            L2e:
                if (r6 != 0) goto L38
                int r3 = -r3
                int r3 = r7.leave(r3)
                if (r3 != 0) goto L9
                return
            L38:
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.NEXT
                if (r6 != r5) goto L53
                r2.onComplete()
                if (r4 != 0) goto L4d
                int r2 = r7.bufferSize
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.create(r2)
                r7.window = r2
                r1.onNext(r2)
                goto L9
            L4d:
                io.reactivex.disposables.Disposable r4 = r7.f473s
                r4.dispose()
                goto L9
            L53:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L9
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
                boolean r0 = r1.enter()
                if (r0 == 0) goto Lc
                r1.drainLoop()
            Lc:
                r1.disposeTimer()
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Le
                r1.drainLoop()
            Le:
                r1.disposeTimer()
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.terminated
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r1.fastEnter()
                if (r0 == 0) goto L18
                io.reactivex.subjects.UnicastSubject<T> r0 = r1.window
                r0.onNext(r2)
                r2 = -1
                int r2 = r1.leave(r2)
                if (r2 != 0) goto L28
                return
            L18:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
                r0.offer(r2)
                boolean r2 = r1.enter()
                if (r2 != 0) goto L28
                return
            L28:
                r1.drainLoop()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.f473s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L31
                r7.f473s = r8
                int r8 = r7.bufferSize
                io.reactivex.subjects.UnicastSubject r8 = io.reactivex.subjects.UnicastSubject.create(r8)
                r7.window = r8
                io.reactivex.Observer<? super V> r8 = r7.actual
                r8.onSubscribe(r7)
                io.reactivex.subjects.UnicastSubject<T> r0 = r7.window
                r8.onNext(r0)
                boolean r8 = r7.cancelled
                if (r8 != 0) goto L31
                io.reactivex.Scheduler r0 = r7.scheduler
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r8)
            L31:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto La
                r0 = 1
                r2.terminated = r0
                r2.disposeTimer()
            La:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                java.lang.Object r1 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.NEXT
                r0.offer(r1)
                boolean r0 = r2.enter()
                if (r0 == 0) goto L1a
                r2.drainLoop()
            L1a:
                return
        }
    }

    static final class WindowSkipObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        final int bufferSize;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f474s;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        final java.util.List<io.reactivex.subjects.UnicastSubject<T>> windows;
        final io.reactivex.Scheduler.Worker worker;

        final class CompletionTask implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver this$0;

            /* renamed from: w */
            private final io.reactivex.subjects.UnicastSubject<T> f475w;

            CompletionTask(io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver r1, io.reactivex.subjects.UnicastSubject<T> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.f475w = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver r0 = r2.this$0
                    io.reactivex.subjects.UnicastSubject<T> r1 = r2.f475w
                    r0.complete(r1)
                    return
            }
        }

        static final class SubjectWork<T> {
            final boolean open;

            /* renamed from: w */
            final io.reactivex.subjects.UnicastSubject<T> f476w;

            SubjectWork(io.reactivex.subjects.UnicastSubject<T> r1, boolean r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f476w = r1
                    r0.open = r2
                    return
            }
        }

        WindowSkipObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r2, long r3, long r5, java.util.concurrent.TimeUnit r7, io.reactivex.Scheduler.Worker r8, int r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.timespan = r3
                r1.timeskip = r5
                r1.unit = r7
                r1.worker = r8
                r1.bufferSize = r9
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.windows = r2
                return
        }

        void complete(io.reactivex.subjects.UnicastSubject<T> r4) {
                r3 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$SubjectWork r1 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$SubjectWork
                r2 = 0
                r1.<init>(r4, r2)
                r0.offer(r1)
                boolean r4 = r3.enter()
                if (r4 == 0) goto L14
                r3.drainLoop()
            L14:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void disposeWorker() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        void drainLoop() {
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r10.actual
                java.util.List<io.reactivex.subjects.UnicastSubject<T>> r2 = r10.windows
                r3 = 1
                r4 = r3
            La:
                boolean r5 = r10.terminated
                if (r5 == 0) goto L1d
                io.reactivex.disposables.Disposable r1 = r10.f474s
                r1.dispose()
                r10.disposeWorker()
                r0.clear()
                r2.clear()
                return
            L1d:
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L27
                r7 = r3
                goto L28
            L27:
                r7 = 0
            L28:
                boolean r8 = r6 instanceof io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork
                if (r5 == 0) goto L66
                if (r7 != 0) goto L30
                if (r8 == 0) goto L66
            L30:
                r0.clear()
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L4b
                java.util.Iterator r1 = r2.iterator()
            L3b:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r1.next()
                io.reactivex.subjects.UnicastSubject r3 = (io.reactivex.subjects.UnicastSubject) r3
                r3.onError(r0)
                goto L3b
            L4b:
                java.util.Iterator r0 = r2.iterator()
            L4f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5f
                java.lang.Object r1 = r0.next()
                io.reactivex.subjects.UnicastSubject r1 = (io.reactivex.subjects.UnicastSubject) r1
                r1.onComplete()
                goto L4f
            L5f:
                r10.disposeWorker()
                r2.clear()
                return
            L66:
                if (r7 == 0) goto L70
                int r4 = -r4
                int r4 = r10.leave(r4)
                if (r4 != 0) goto La
                return
            L70:
                if (r8 == 0) goto Lb1
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$SubjectWork r6 = (io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork) r6
                boolean r5 = r6.open
                if (r5 == 0) goto L99
                boolean r5 = r10.cancelled
                if (r5 == 0) goto L7d
                goto La
            L7d:
                int r5 = r10.bufferSize
                io.reactivex.subjects.UnicastSubject r5 = io.reactivex.subjects.UnicastSubject.create(r5)
                r2.add(r5)
                r1.onNext(r5)
                io.reactivex.Scheduler$Worker r6 = r10.worker
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$CompletionTask r7 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$CompletionTask
                r7.<init>(r10, r5)
                long r8 = r10.timespan
                java.util.concurrent.TimeUnit r5 = r10.unit
                r6.schedule(r7, r8, r5)
                goto La
            L99:
                io.reactivex.subjects.UnicastSubject<T> r5 = r6.f476w
                r2.remove(r5)
                io.reactivex.subjects.UnicastSubject<T> r5 = r6.f476w
                r5.onComplete()
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto La
                boolean r5 = r10.cancelled
                if (r5 == 0) goto La
                r10.terminated = r3
                goto La
            Lb1:
                java.util.Iterator r5 = r2.iterator()
            Lb5:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto La
                java.lang.Object r7 = r5.next()
                io.reactivex.subjects.UnicastSubject r7 = (io.reactivex.subjects.UnicastSubject) r7
                r7.onNext(r6)
                goto Lb5
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
                boolean r0 = r1.enter()
                if (r0 == 0) goto Lc
                r1.drainLoop()
            Lc:
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onComplete()
                r1.disposeWorker()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Le
                r1.drainLoop()
            Le:
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                r1.disposeWorker()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.fastEnter()
                if (r0 == 0) goto L24
                java.util.List<io.reactivex.subjects.UnicastSubject<T>> r0 = r2.windows
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
                if (r3 != 0) goto L30
                return
            L24:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                r0.offer(r3)
                boolean r3 = r2.enter()
                if (r3 != 0) goto L30
                return
            L30:
                r2.drainLoop()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r12) {
                r11 = this;
                io.reactivex.disposables.Disposable r0 = r11.f474s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r12)
                if (r0 == 0) goto L3d
                r11.f474s = r12
                io.reactivex.Observer<? super V> r12 = r11.actual
                r12.onSubscribe(r11)
                boolean r12 = r11.cancelled
                if (r12 == 0) goto L14
                return
            L14:
                int r12 = r11.bufferSize
                io.reactivex.subjects.UnicastSubject r12 = io.reactivex.subjects.UnicastSubject.create(r12)
                java.util.List<io.reactivex.subjects.UnicastSubject<T>> r0 = r11.windows
                r0.add(r12)
                io.reactivex.Observer<? super V> r0 = r11.actual
                r0.onNext(r12)
                io.reactivex.Scheduler$Worker r0 = r11.worker
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$CompletionTask r1 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$CompletionTask
                r1.<init>(r11, r12)
                long r2 = r11.timespan
                java.util.concurrent.TimeUnit r12 = r11.unit
                r0.schedule(r1, r2, r12)
                io.reactivex.Scheduler$Worker r4 = r11.worker
                long r8 = r11.timeskip
                java.util.concurrent.TimeUnit r10 = r11.unit
                r5 = r11
                r6 = r8
                r4.schedulePeriodically(r5, r6, r8, r10)
            L3d:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                int r0 = r3.bufferSize
                io.reactivex.subjects.UnicastSubject r0 = io.reactivex.subjects.UnicastSubject.create(r0)
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$SubjectWork r1 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver$SubjectWork
                r2 = 1
                r1.<init>(r0, r2)
                boolean r0 = r3.cancelled
                if (r0 != 0) goto L15
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                r0.offer(r1)
            L15:
                boolean r0 = r3.enter()
                if (r0 == 0) goto L1e
                r3.drainLoop()
            L1e:
                return
        }
    }

    public ObservableWindowTimed(io.reactivex.ObservableSource<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, long r8, int r10, boolean r11) {
            r0 = this;
            r0.<init>(r1)
            r0.timespan = r2
            r0.timeskip = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.maxSize = r8
            r0.bufferSize = r10
            r0.restartTimerOnMaxSize = r11
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> r12) {
            r11 = this;
            io.reactivex.observers.SerializedObserver r1 = new io.reactivex.observers.SerializedObserver
            r1.<init>(r12)
            long r2 = r11.timespan
            long r4 = r11.timeskip
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 != 0) goto L44
            long r2 = r11.maxSize
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 != 0) goto L2c
            io.reactivex.ObservableSource<T> r12 = r11.source
            io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactUnboundedObserver r7 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactUnboundedObserver
            long r2 = r11.timespan
            java.util.concurrent.TimeUnit r4 = r11.unit
            io.reactivex.Scheduler r5 = r11.scheduler
            int r6 = r11.bufferSize
            r0 = r7
            r0.<init>(r1, r2, r4, r5, r6)
            r12.subscribe(r7)
            return
        L2c:
            io.reactivex.ObservableSource<T> r12 = r11.source
            io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver r10 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver
            long r2 = r11.timespan
            java.util.concurrent.TimeUnit r4 = r11.unit
            io.reactivex.Scheduler r5 = r11.scheduler
            int r6 = r11.bufferSize
            long r7 = r11.maxSize
            boolean r9 = r11.restartTimerOnMaxSize
            r0 = r10
            r0.<init>(r1, r2, r4, r5, r6, r7, r9)
            r12.subscribe(r10)
            return
        L44:
            io.reactivex.ObservableSource<T> r12 = r11.source
            io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver r9 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowSkipObserver
            long r2 = r11.timespan
            long r4 = r11.timeskip
            java.util.concurrent.TimeUnit r6 = r11.unit
            io.reactivex.Scheduler r0 = r11.scheduler
            io.reactivex.Scheduler$Worker r7 = r0.createWorker()
            int r8 = r11.bufferSize
            r0 = r9
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r12.subscribe(r9)
            return
    }
}
