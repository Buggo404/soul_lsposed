package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class FlowableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    static final class BufferExactBoundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;

        /* renamed from: s */
        org.reactivestreams.Subscription f223s;
        io.reactivex.disposables.Disposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f224w;

        BufferExactBoundedSubscriber(org.reactivestreams.Subscriber<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, int r7, boolean r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.maxSize = r7
                r1.restartTimerOnMaxSize = r8
                r1.f224w = r9
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(org.reactivestreams.Subscriber r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(org.reactivestreams.Subscriber<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto La
                r0 = 1
                r1.cancelled = r0
                r1.dispose()
            La:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                org.reactivestreams.Subscription r0 = r1.f223s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.f224w
                r0.dispose()
                return
            L10:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.f224w
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
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
                if (r0 == 0) goto L1d
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                org.reactivestreams.Subscriber<? super V> r1 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r1, r2, r3, r3)
            L1d:
                io.reactivex.Scheduler$Worker r0 = r3.f224w
                r0.dispose()
                return
            L23:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                throw r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.f224w
                r2.dispose()
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // org.reactivestreams.Subscriber
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
                r7.fastPathOrderedEmitMax(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L59
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L59
                java.lang.String r0 = "The supplied buffer is null"
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
                io.reactivex.Scheduler$Worker r0 = r7.f224w
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
                r7.cancel()
                org.reactivestreams.Subscriber<? super V> r0 = r7.actual
                r0.onError(r8)
                return
            L66:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
                throw r8
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r9) {
                r8 = this;
                org.reactivestreams.Subscription r0 = r8.f223s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r9)
                if (r0 != 0) goto L9
                return
            L9:
                r8.f223s = r9
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r8.bufferSupplier     // Catch: java.lang.Throwable -> L37
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L37
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L37
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L37
                r8.buffer = r0
                org.reactivestreams.Subscriber<? super V> r0 = r8.actual
                r0.onSubscribe(r8)
                io.reactivex.Scheduler$Worker r1 = r8.f224w
                long r5 = r8.timespan
                java.util.concurrent.TimeUnit r7 = r8.unit
                r2 = r8
                r3 = r5
                io.reactivex.disposables.Disposable r0 = r1.schedulePeriodically(r2, r3, r5, r7)
                r8.timer = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9.request(r0)
                return
            L37:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r8.f224w
                r1.dispose()
                r9.cancel()
                org.reactivestreams.Subscriber<? super V> r9 = r8.actual
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r9)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r6.bufferSupplier     // Catch: java.lang.Throwable -> L29
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L29
                java.lang.String r1 = "The supplied buffer is null"
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
                r6.fastPathOrderedEmitMax(r1, r0, r6)
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
                r6.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r6.actual
                r1.onError(r0)
                return
        }
    }

    static final class BufferExactUnboundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;

        /* renamed from: s */
        org.reactivestreams.Subscription f225s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        BufferExactUnboundedSubscriber(org.reactivestreams.Subscriber<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7) {
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

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(org.reactivestreams.Subscriber r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(org.reactivestreams.Subscriber<? super U> r1, U r2) {
                r0 = this;
                org.reactivestreams.Subscriber<? super V> r1 = r0.actual
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f225s
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                r0.cancel()
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

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r4)
                U extends java.util.Collection<? super T> r0 = r4.buffer     // Catch: java.lang.Throwable -> L27
                if (r0 != 0) goto Lc
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
                return
            Lc:
                r1 = 0
                r4.buffer = r1     // Catch: java.lang.Throwable -> L27
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r2 = r4.queue
                r2.offer(r0)
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L26
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r4.queue
                org.reactivestreams.Subscriber<? super V> r2 = r4.actual
                r3 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r2, r3, r1, r4)
            L26:
                return
            L27:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
                throw r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                U extends java.util.Collection<? super T> r0 = r1.buffer     // Catch: java.lang.Throwable -> La
                if (r0 == 0) goto L8
                r0.add(r2)     // Catch: java.lang.Throwable -> La
            L8:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                return
            La:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r2
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r10) {
                r9 = this;
                org.reactivestreams.Subscription r0 = r9.f225s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r10)
                if (r0 == 0) goto L50
                r9.f225s = r10
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r9.bufferSupplier     // Catch: java.lang.Throwable -> L44
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L44
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L44
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L44
                r9.buffer = r0
                org.reactivestreams.Subscriber<? super V> r0 = r9.actual
                r0.onSubscribe(r9)
                boolean r0 = r9.cancelled
                if (r0 != 0) goto L50
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10.request(r0)
                io.reactivex.Scheduler r2 = r9.scheduler
                long r6 = r9.timespan
                java.util.concurrent.TimeUnit r8 = r9.unit
                r3 = r9
                r4 = r6
                io.reactivex.disposables.Disposable r10 = r2.schedulePeriodicallyDirect(r3, r4, r6, r8)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r9.timer
                r1 = 0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r10)
                if (r0 != 0) goto L50
                r10.dispose()
                goto L50
            L44:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                org.reactivestreams.Subscriber<? super V> r0 = r9.actual
                io.reactivex.internal.subscriptions.EmptySubscription.error(r10, r0)
            L50:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L20
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L20
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L20
                monitor-enter(r2)
                U extends java.util.Collection<? super T> r1 = r2.buffer     // Catch: java.lang.Throwable -> L1d
                if (r1 != 0) goto L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                return
            L15:
                r2.buffer = r0     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                r0 = 0
                r2.fastPathEmitMax(r1, r0, r2)
                return
            L1d:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                throw r0
            L20:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r2.actual
                r1.onError(r0)
                return
        }
    }

    static final class BufferSkipBoundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, java.lang.Runnable {
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;

        /* renamed from: s */
        org.reactivestreams.Subscription f226s;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f227w;

        final class RemoveFromBuffer implements java.lang.Runnable {
            private final U buffer;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber this$0;

            RemoveFromBuffer(io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber r1, U r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.buffer = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r0 = r4.this$0
                    monitor-enter(r0)
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r1 = r4.this$0     // Catch: java.lang.Throwable -> L18
                    java.util.List<U extends java.util.Collection<? super T>> r1 = r1.buffers     // Catch: java.lang.Throwable -> L18
                    U extends java.util.Collection<? super T> r2 = r4.buffer     // Catch: java.lang.Throwable -> L18
                    r1.remove(r2)     // Catch: java.lang.Throwable -> L18
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r0 = r4.this$0
                    U extends java.util.Collection<? super T> r1 = r4.buffer
                    r2 = 0
                    io.reactivex.Scheduler$Worker r3 = r0.f227w
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.access$000(r0, r1, r2, r3)
                    return
                L18:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    throw r1
            }
        }

        BufferSkipBoundedSubscriber(org.reactivestreams.Subscriber<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, long r6, java.util.concurrent.TimeUnit r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.timeskip = r6
                r1.unit = r8
                r1.f227w = r9
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.buffers = r2
                return
        }

        static /* synthetic */ void access$000(io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber r0, java.lang.Object r1, boolean r2, io.reactivex.disposables.Disposable r3) {
                r0.fastPathOrderedEmitMax(r1, r2, r3)
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(org.reactivestreams.Subscriber r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(org.reactivestreams.Subscriber<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f226s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.f227w
                r0.dispose()
                r1.clear()
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

        @Override // org.reactivestreams.Subscriber
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
                org.reactivestreams.Subscriber<? super V> r1 = r4.actual
                r2 = 0
                io.reactivex.Scheduler$Worker r3 = r4.f227w
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r1, r2, r3, r4)
            L37:
                return
            L38:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                throw r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.Scheduler$Worker r0 = r1.f227w
                r0.dispose()
                r1.clear()
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r11) {
                r10 = this;
                org.reactivestreams.Subscription r0 = r10.f226s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r11)
                if (r0 != 0) goto L9
                return
            L9:
                r10.f226s = r11
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r10.bufferSupplier     // Catch: java.lang.Throwable -> L45
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L45
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L45
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L45
                java.util.List<U extends java.util.Collection<? super T>> r1 = r10.buffers
                r1.add(r0)
                org.reactivestreams.Subscriber<? super V> r1 = r10.actual
                r1.onSubscribe(r10)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11.request(r1)
                io.reactivex.Scheduler$Worker r3 = r10.f227w
                long r7 = r10.timeskip
                java.util.concurrent.TimeUnit r9 = r10.unit
                r4 = r10
                r5 = r7
                r3.schedulePeriodically(r4, r5, r7, r9)
                io.reactivex.Scheduler$Worker r11 = r10.f227w
                io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer r1 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer
                r1.<init>(r10, r0)
                long r2 = r10.timespan
                java.util.concurrent.TimeUnit r0 = r10.unit
                r11.schedule(r1, r2, r0)
                return
            L45:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r10.f227w
                r1.dispose()
                r11.cancel()
                org.reactivestreams.Subscriber<? super V> r11 = r10.actual
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r11)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
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
                java.lang.String r1 = "The supplied buffer is null"
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
                io.reactivex.Scheduler$Worker r1 = r5.f227w
                io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer r2 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer
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
                r5.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r5.actual
                r1.onError(r0)
                return
        }
    }

    public FlowableBufferTimed(io.reactivex.Flowable<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, java.util.concurrent.Callable<U> r8, int r9, boolean r10) {
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

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r12) {
            r11 = this;
            long r0 = r11.timespan
            long r2 = r11.timeskip
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            int r0 = r11.maxSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L28
            io.reactivex.Flowable<T> r0 = r11.source
            io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactUnboundedSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactUnboundedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
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
            io.reactivex.Flowable<T> r0 = r11.source
            io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactBoundedSubscriber r10 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactBoundedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
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
            io.reactivex.Flowable<T> r0 = r11.source
            io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r10 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
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
