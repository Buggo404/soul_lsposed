package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class ObservableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    static final class BufferExactBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f376s;
        io.reactivex.disposables.Disposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f377w;

        BufferExactBoundedObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, int r7, boolean r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.maxSize = r7
                r1.restartTimerOnMaxSize = r8
                r1.f377w = r9
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1a
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f376s
                r0.dispose()
                io.reactivex.Scheduler$Worker r0 = r1.f377w
                r0.dispose()
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L17
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
                throw r0
            L1a:
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
                r3 = this;
                io.reactivex.Scheduler$Worker r0 = r3.f377w
                r0.dispose()
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.buffer     // Catch: java.lang.Throwable -> L23
                r1 = 0
                r3.buffer = r1     // Catch: java.lang.Throwable -> L23
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L22
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.Observer<? super V> r1 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r2, r3, r3)
            L22:
                return
            L23:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.f377w
                r2.dispose()
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onNext(T r8) {
                r7 = this;
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r0 = r7.buffer     // Catch: java.lang.Throwable -> L66
                if (r0 != 0) goto L7
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
                return
            L7:
                r0.add(r8)     // Catch: java.lang.Throwable -> L66
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L66
                int r1 = r7.maxSize     // Catch: java.lang.Throwable -> L66
                if (r8 >= r1) goto L14
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
                return
            L14:
                r8 = 0
                r7.buffer = r8     // Catch: java.lang.Throwable -> L66
                long r1 = r7.producerIndex     // Catch: java.lang.Throwable -> L66
                r3 = 1
                long r1 = r1 + r3
                r7.producerIndex = r1     // Catch: java.lang.Throwable -> L66
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L28
                io.reactivex.disposables.Disposable r8 = r7.timer
                r8.dispose()
            L28:
                r8 = 0
                r7.fastPathOrderedEmit(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L59
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L59
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L59
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L59
                monitor-enter(r7)
                r7.buffer = r8     // Catch: java.lang.Throwable -> L56
                long r0 = r7.consumerIndex     // Catch: java.lang.Throwable -> L56
                long r0 = r0 + r3
                r7.consumerIndex = r0     // Catch: java.lang.Throwable -> L56
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L55
                io.reactivex.Scheduler$Worker r0 = r7.f377w
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r7.timer = r8
            L55:
                return
            L56:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
                throw r8
            L59:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                io.reactivex.Observer<? super V> r0 = r7.actual
                r0.onError(r8)
                r7.dispose()
                return
            L66:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
                throw r8
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.f376s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L3f
                r7.f376s = r8
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2e
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2e
                r7.buffer = r0
                io.reactivex.Observer<? super V> r8 = r7.actual
                r8.onSubscribe(r7)
                io.reactivex.Scheduler$Worker r0 = r7.f377w
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r7.timer = r8
                goto L3f
            L2e:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r8.dispose()
                io.reactivex.Observer<? super V> r8 = r7.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r8)
                io.reactivex.Scheduler$Worker r8 = r7.f377w
                r8.dispose()
            L3f:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r6.bufferSupplier     // Catch: java.lang.Throwable -> L29
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L29
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L29
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L29
                monitor-enter(r6)
                U extends java.util.Collection<? super T> r1 = r6.buffer     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L24
                long r2 = r6.producerIndex     // Catch: java.lang.Throwable -> L26
                long r4 = r6.consumerIndex     // Catch: java.lang.Throwable -> L26
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L1c
                goto L24
            L1c:
                r6.buffer = r0     // Catch: java.lang.Throwable -> L26
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L26
                r0 = 0
                r6.fastPathOrderedEmit(r1, r0, r6)
                return
            L24:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L26
                return
            L26:
                r0 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L26
                throw r0
            L29:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r6.dispose()
                io.reactivex.Observer<? super V> r1 = r6.actual
                r1.onError(r0)
                return
        }
    }

    static final class BufferExactUnboundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f378s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        BufferExactUnboundedObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.timer = r2
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.scheduler = r7
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                io.reactivex.Observer<? super V> r1 = r0.actual
                r1.onNext(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.disposables.Disposable r0 = r1.f378s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                monitor-enter(r4)
                U extends java.util.Collection<? super T> r0 = r4.buffer     // Catch: java.lang.Throwable -> L25
                r1 = 0
                r4.buffer = r1     // Catch: java.lang.Throwable -> L25
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L1f
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r2 = r4.queue
                r2.offer(r0)
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L1f
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r4.queue
                io.reactivex.Observer<? super V> r2 = r4.actual
                r3 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r2, r3, r1, r4)
            L1f:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L25:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                U extends java.util.Collection<? super T> r0 = r1.buffer     // Catch: java.lang.Throwable -> Lc
                if (r0 != 0) goto L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                return
            L7:
                r0.add(r2)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.f378s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L48
                r7.f378s = r8
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L3c
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L3c
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L3c
                r7.buffer = r8
                io.reactivex.Observer<? super V> r8 = r7.actual
                r8.onSubscribe(r7)
                boolean r8 = r7.cancelled
                if (r8 != 0) goto L48
                io.reactivex.Scheduler r0 = r7.scheduler
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.timer
                r1 = 0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r8)
                if (r0 != 0) goto L48
                r8.dispose()
                goto L48
            L3c:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r7.dispose()
                io.reactivex.Observer<? super V> r0 = r7.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r8, r0)
            L48:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L26
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L26
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L26
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L26
                monitor-enter(r2)
                U extends java.util.Collection<? super T> r1 = r2.buffer     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L15
                r2.buffer = r0     // Catch: java.lang.Throwable -> L23
            L15:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
                if (r1 != 0) goto L1e
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L1e:
                r0 = 0
                r2.fastPathEmit(r1, r0, r2)
                return
            L23:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
                throw r0
            L26:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super V> r1 = r2.actual
                r1.onError(r0)
                r2.dispose()
                return
        }
    }

    static final class BufferSkipBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f379s;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f380w;

        final class RemoveFromBuffer implements java.lang.Runnable {

            /* renamed from: b */
            private final U f381b;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver this$0;

            RemoveFromBuffer(io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver r1, U r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.f381b = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r0 = r4.this$0
                    monitor-enter(r0)
                    io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r1 = r4.this$0     // Catch: java.lang.Throwable -> L18
                    java.util.List<U extends java.util.Collection<? super T>> r1 = r1.buffers     // Catch: java.lang.Throwable -> L18
                    U extends java.util.Collection<? super T> r2 = r4.f381b     // Catch: java.lang.Throwable -> L18
                    r1.remove(r2)     // Catch: java.lang.Throwable -> L18
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r0 = r4.this$0
                    U extends java.util.Collection<? super T> r1 = r4.f381b
                    r2 = 0
                    io.reactivex.Scheduler$Worker r3 = r0.f380w
                    io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.access$000(r0, r1, r2, r3)
                    return
                L18:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    throw r1
            }
        }

        final class RemoveFromBufferEmit implements java.lang.Runnable {
            private final U buffer;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver this$0;

            RemoveFromBufferEmit(io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver r1, U r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.buffer = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r0 = r4.this$0
                    monitor-enter(r0)
                    io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r1 = r4.this$0     // Catch: java.lang.Throwable -> L18
                    java.util.List<U extends java.util.Collection<? super T>> r1 = r1.buffers     // Catch: java.lang.Throwable -> L18
                    U extends java.util.Collection<? super T> r2 = r4.buffer     // Catch: java.lang.Throwable -> L18
                    r1.remove(r2)     // Catch: java.lang.Throwable -> L18
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r0 = r4.this$0
                    U extends java.util.Collection<? super T> r1 = r4.buffer
                    r2 = 0
                    io.reactivex.Scheduler$Worker r3 = r0.f380w
                    io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.access$100(r0, r1, r2, r3)
                    return
                L18:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    throw r1
            }
        }

        BufferSkipBoundedObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, long r6, java.util.concurrent.TimeUnit r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.timeskip = r6
                r1.unit = r8
                r1.f380w = r9
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.buffers = r2
                return
        }

        static /* synthetic */ void access$000(io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver r0, java.lang.Object r1, boolean r2, io.reactivex.disposables.Disposable r3) {
                r0.fastPathOrderedEmit(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$100(io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver r0, java.lang.Object r1, boolean r2, io.reactivex.disposables.Disposable r3) {
                r0.fastPathOrderedEmit(r1, r2, r3)
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                return
        }

        void clear() {
                r1 = this;
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L8
                r0.clear()     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L14
                r0 = 1
                r1.cancelled = r0
                r1.clear()
                io.reactivex.disposables.Disposable r0 = r1.f379s
                r0.dispose()
                io.reactivex.Scheduler$Worker r0 = r1.f380w
                r0.dispose()
            L14:
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
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
                java.util.List<U extends java.util.Collection<? super T>> r1 = r4.buffers     // Catch: java.lang.Throwable -> L38
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
                java.util.List<U extends java.util.Collection<? super T>> r1 = r4.buffers     // Catch: java.lang.Throwable -> L38
                r1.clear()     // Catch: java.lang.Throwable -> L38
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                java.util.Collection r1 = (java.util.Collection) r1
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r2 = r4.queue
                r2.offer(r1)
                goto L12
            L24:
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L37
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r4.queue
                io.reactivex.Observer<? super V> r1 = r4.actual
                r2 = 0
                io.reactivex.Scheduler$Worker r3 = r4.f380w
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r2, r3, r4)
            L37:
                return
            L38:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.clear()
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.f380w
                r2.dispose()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L19
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L19
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L19
                r1.add(r3)     // Catch: java.lang.Throwable -> L19
                goto L7
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                return
            L19:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                throw r3
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r9) {
                r8 = this;
                io.reactivex.disposables.Disposable r0 = r8.f379s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r9)
                if (r0 == 0) goto L4d
                r8.f379s = r9
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r8.bufferSupplier     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L3c
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L3c
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L3c
                java.util.List<U extends java.util.Collection<? super T>> r9 = r8.buffers
                r9.add(r0)
                io.reactivex.Observer<? super V> r9 = r8.actual
                r9.onSubscribe(r8)
                io.reactivex.Scheduler$Worker r1 = r8.f380w
                long r5 = r8.timeskip
                java.util.concurrent.TimeUnit r7 = r8.unit
                r2 = r8
                r3 = r5
                r1.schedulePeriodically(r2, r3, r5, r7)
                io.reactivex.Scheduler$Worker r9 = r8.f380w
                io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$RemoveFromBufferEmit r1 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$RemoveFromBufferEmit
                r1.<init>(r8, r0)
                long r2 = r8.timespan
                java.util.concurrent.TimeUnit r0 = r8.unit
                r9.schedule(r1, r2, r0)
                goto L4d
            L3c:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r9.dispose()
                io.reactivex.Observer<? super V> r9 = r8.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r9)
                io.reactivex.Scheduler$Worker r9 = r8.f380w
                r9.dispose()
            L4d:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                boolean r0 = r5.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L32
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L32
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L32
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L32
                monitor-enter(r5)
                boolean r1 = r5.cancelled     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L1a
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
                return
            L1a:
                java.util.List<U extends java.util.Collection<? super T>> r1 = r5.buffers     // Catch: java.lang.Throwable -> L2f
                r1.add(r0)     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
                io.reactivex.Scheduler$Worker r1 = r5.f380w
                io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$RemoveFromBuffer r2 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$RemoveFromBuffer
                r2.<init>(r5, r0)
                long r3 = r5.timespan
                java.util.concurrent.TimeUnit r0 = r5.unit
                r1.schedule(r2, r3, r0)
                return
            L2f:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
                throw r0
            L32:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super V> r1 = r5.actual
                r1.onError(r0)
                r5.dispose()
                return
        }
    }

    public ObservableBufferTimed(io.reactivex.ObservableSource<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, java.util.concurrent.Callable<U> r8, int r9, boolean r10) {
            r0 = this;
            r0.<init>(r1)
            r0.timespan = r2
            r0.timeskip = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.bufferSupplier = r8
            r0.maxSize = r9
            r0.restartTimerOnMaxSize = r10
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r12) {
            r11 = this;
            long r0 = r11.timespan
            long r2 = r11.timeskip
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            int r0 = r11.maxSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L28
            io.reactivex.ObservableSource<T> r0 = r11.source
            io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactUnboundedObserver r8 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactUnboundedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r12)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r11.bufferSupplier
            long r4 = r11.timespan
            java.util.concurrent.TimeUnit r6 = r11.unit
            io.reactivex.Scheduler r7 = r11.scheduler
            r1 = r8
            r1.<init>(r2, r3, r4, r6, r7)
            r0.subscribe(r8)
            return
        L28:
            io.reactivex.Scheduler r0 = r11.scheduler
            io.reactivex.Scheduler$Worker r9 = r0.createWorker()
            long r0 = r11.timespan
            long r2 = r11.timeskip
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L51
            io.reactivex.ObservableSource<T> r0 = r11.source
            io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactBoundedObserver r10 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactBoundedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r12)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r11.bufferSupplier
            long r4 = r11.timespan
            java.util.concurrent.TimeUnit r6 = r11.unit
            int r7 = r11.maxSize
            boolean r8 = r11.restartTimerOnMaxSize
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            r0.subscribe(r10)
            return
        L51:
            io.reactivex.ObservableSource<T> r0 = r11.source
            io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r10 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r12)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r11.bufferSupplier
            long r4 = r11.timespan
            long r6 = r11.timeskip
            java.util.concurrent.TimeUnit r8 = r11.unit
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8, r9)
            r0.subscribe(r10)
            return
    }
}
