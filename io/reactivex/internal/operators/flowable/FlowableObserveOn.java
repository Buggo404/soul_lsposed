package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableObserveOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean delayError;
    final int prefetch;
    final io.reactivex.Scheduler scheduler;

    static abstract class BaseObserveOnSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T>, java.lang.Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f270s;
        int sourceMode;
        final io.reactivex.Scheduler.Worker worker;

        BaseObserveOnSubscriber(io.reactivex.Scheduler.Worker r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.worker = r1
                r0.delayError = r2
                r0.prefetch = r3
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                int r1 = r3 >> 2
                int r3 = r3 - r1
                r0.limit = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f270s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1d
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
            L1d:
                return
        }

        final boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<?> r5) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto L9
                r2.clear()
                return r1
            L9:
                if (r3 == 0) goto L3d
                boolean r3 = r2.delayError
                if (r3 == 0) goto L22
                if (r4 == 0) goto L3d
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L19
                r5.onError(r3)
                goto L1c
            L19:
                r5.onComplete()
            L1c:
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
                return r1
            L22:
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L32
                r2.clear()
                r5.onError(r3)
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
                return r1
            L32:
                if (r4 == 0) goto L3d
                r5.onComplete()
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
                return r1
            L3d:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto La
                r0 = 1
                r1.done = r0
                r1.trySchedule()
            La:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.trySchedule()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r2.sourceMode
                r1 = 2
                if (r0 != r1) goto Le
                r2.trySchedule()
                return
            Le:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r2.queue
                boolean r3 = r0.offer(r3)
                if (r3 != 0) goto L27
                org.reactivestreams.Subscription r3 = r2.f270s
                r3.cancel()
                io.reactivex.exceptions.MissingBackpressureException r3 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue is full?!"
                r3.<init>(r0)
                r2.error = r3
                r3 = 1
                r2.done = r3
            L27:
                r2.trySchedule()
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.trySchedule()
            Le:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                boolean r0 = r2.outputFused
                if (r0 == 0) goto L8
                r2.runBackfused()
                goto L14
            L8:
                int r0 = r2.sourceMode
                r1 = 1
                if (r0 != r1) goto L11
                r2.runSync()
                goto L14
            L11:
                r2.runAsync()
            L14:
                return
        }

        abstract void runAsync();

        abstract void runBackfused();

        abstract void runSync();

        final void trySchedule() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.schedule(r1)
                return
        }
    }

    static final class ObserveOnConditionalSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;
        long consumed;

        ObserveOnConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.Scheduler.Worker r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>(r2, r3, r4)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.f270s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L4c
                r3.f270s = r4
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L38
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 7
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L25
                r3.sourceMode = r2
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r4 = r3.actual
                r4.onSubscribe(r3)
                return
            L25:
                r2 = 2
                if (r1 != r2) goto L38
                r3.sourceMode = r2
                r3.queue = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L38:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L4c:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r5 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r5.queue
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L25
                int r1 = r5.sourceMode
                r2 = 1
                if (r1 == r2) goto L25
                long r1 = r5.consumed
                r3 = 1
                long r1 = r1 + r3
                int r3 = r5.limit
                long r3 = (long) r3
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 != 0) goto L23
                r3 = 0
                r5.consumed = r3
                org.reactivestreams.Subscription r3 = r5.f270s
                r3.request(r1)
                goto L25
            L23:
                r5.consumed = r1
            L25:
                return r0
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void runAsync() {
                r14 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r14.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r14.queue
                long r2 = r14.produced
                long r4 = r14.consumed
                r6 = 1
                r7 = r6
            La:
                java.util.concurrent.atomic.AtomicLong r8 = r14.requested
                long r8 = r8.get()
            L10:
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 == 0) goto L57
                boolean r11 = r14.done
                java.lang.Object r12 = r1.poll()     // Catch: java.lang.Throwable -> L42
                if (r12 != 0) goto L1e
                r13 = r6
                goto L1f
            L1e:
                r13 = 0
            L1f:
                boolean r11 = r14.checkTerminated(r11, r13, r0)
                if (r11 == 0) goto L26
                return
            L26:
                if (r13 == 0) goto L29
                goto L57
            L29:
                boolean r10 = r0.tryOnNext(r12)
                r11 = 1
                if (r10 == 0) goto L32
                long r2 = r2 + r11
            L32:
                long r4 = r4 + r11
                int r10 = r14.limit
                long r10 = (long) r10
                int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r10 != 0) goto L10
                org.reactivestreams.Subscription r10 = r14.f270s
                r10.request(r4)
                r4 = 0
                goto L10
            L42:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscription r3 = r14.f270s
                r3.cancel()
                r1.clear()
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r0 = r14.worker
                r0.dispose()
                return
            L57:
                if (r10 != 0) goto L66
                boolean r8 = r14.done
                boolean r9 = r1.isEmpty()
                boolean r8 = r14.checkTerminated(r8, r9, r0)
                if (r8 == 0) goto L66
                return
            L66:
                int r8 = r14.get()
                if (r7 != r8) goto L78
                r14.produced = r2
                r14.consumed = r4
                int r7 = -r7
                int r7 = r14.addAndGet(r7)
                if (r7 != 0) goto La
                return
            L78:
                r7 = r8
                goto La
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void runBackfused() {
                r4 = this;
                r0 = 1
            L1:
                boolean r1 = r4.cancelled
                if (r1 == 0) goto L6
                return
            L6:
                boolean r1 = r4.done
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r4.actual
                r3 = 0
                r2.onNext(r3)
                if (r1 == 0) goto L25
                java.lang.Throwable r0 = r4.error
                if (r0 == 0) goto L1a
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1 = r4.actual
                r1.onError(r0)
                goto L1f
            L1a:
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r4.actual
                r0.onComplete()
            L1f:
                io.reactivex.Scheduler$Worker r0 = r4.worker
                r0.dispose()
                return
            L25:
                int r0 = -r0
                int r0 = r4.addAndGet(r0)
                if (r0 != 0) goto L1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void runSync() {
                r9 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r9.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r9.queue
                long r2 = r9.produced
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r9.requested
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L41
                java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> L2f
                boolean r8 = r9.cancelled
                if (r8 == 0) goto L1a
                return
            L1a:
                if (r7 != 0) goto L25
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r9.worker
                r0.dispose()
                return
            L25:
                boolean r7 = r0.tryOnNext(r7)
                if (r7 == 0) goto Ld
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L2f:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscription r2 = r9.f270s
                r2.cancel()
                r0.onError(r1)
                io.reactivex.Scheduler$Worker r0 = r9.worker
                r0.dispose()
                return
            L41:
                boolean r5 = r9.cancelled
                if (r5 == 0) goto L46
                return
            L46:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L55
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r9.worker
                r0.dispose()
                return
            L55:
                int r5 = r9.get()
                if (r4 != r5) goto L65
                r9.produced = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L7
                return
            L65:
                r4 = r5
                goto L7
        }
    }

    static final class ObserveOnSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final org.reactivestreams.Subscriber<? super T> actual;

        ObserveOnSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.Scheduler.Worker r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>(r2, r3, r4)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.f270s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L4c
                r3.f270s = r4
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L38
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 7
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L25
                r3.sourceMode = r2
                r3.queue = r0
                r3.done = r2
                org.reactivestreams.Subscriber<? super T> r4 = r3.actual
                r4.onSubscribe(r3)
                return
            L25:
                r2 = 2
                if (r1 != r2) goto L38
                r3.sourceMode = r2
                r3.queue = r0
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L38:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L4c:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r5 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r5.queue
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L25
                int r1 = r5.sourceMode
                r2 = 1
                if (r1 == r2) goto L25
                long r1 = r5.produced
                r3 = 1
                long r1 = r1 + r3
                int r3 = r5.limit
                long r3 = (long) r3
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 != 0) goto L23
                r3 = 0
                r5.produced = r3
                org.reactivestreams.Subscription r3 = r5.f270s
                r3.request(r1)
                goto L25
            L23:
                r5.produced = r1
            L25:
                return r0
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void runAsync() {
                r12 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r12.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r12.queue
                long r2 = r12.produced
                r4 = 1
                r5 = r4
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r12.requested
                long r6 = r6.get()
            Le:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L61
                boolean r9 = r12.done
                java.lang.Object r10 = r1.poll()     // Catch: java.lang.Throwable -> L4c
                if (r10 != 0) goto L1c
                r11 = r4
                goto L1d
            L1c:
                r11 = 0
            L1d:
                boolean r9 = r12.checkTerminated(r9, r11, r0)
                if (r9 == 0) goto L24
                return
            L24:
                if (r11 == 0) goto L27
                goto L61
            L27:
                r0.onNext(r10)
                r8 = 1
                long r2 = r2 + r8
                int r8 = r12.limit
                long r8 = (long) r8
                int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r8 != 0) goto Le
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 == 0) goto L44
                java.util.concurrent.atomic.AtomicLong r6 = r12.requested
                long r7 = -r2
                long r6 = r6.addAndGet(r7)
            L44:
                org.reactivestreams.Subscription r8 = r12.f270s
                r8.request(r2)
                r2 = 0
                goto Le
            L4c:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscription r3 = r12.f270s
                r3.cancel()
                r1.clear()
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r0 = r12.worker
                r0.dispose()
                return
            L61:
                if (r8 != 0) goto L70
                boolean r6 = r12.done
                boolean r7 = r1.isEmpty()
                boolean r6 = r12.checkTerminated(r6, r7, r0)
                if (r6 == 0) goto L70
                return
            L70:
                int r6 = r12.get()
                if (r5 != r6) goto L80
                r12.produced = r2
                int r5 = -r5
                int r5 = r12.addAndGet(r5)
                if (r5 != 0) goto L8
                return
            L80:
                r5 = r6
                goto L8
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void runBackfused() {
                r4 = this;
                r0 = 1
            L1:
                boolean r1 = r4.cancelled
                if (r1 == 0) goto L6
                return
            L6:
                boolean r1 = r4.done
                org.reactivestreams.Subscriber<? super T> r2 = r4.actual
                r3 = 0
                r2.onNext(r3)
                if (r1 == 0) goto L25
                java.lang.Throwable r0 = r4.error
                if (r0 == 0) goto L1a
                org.reactivestreams.Subscriber<? super T> r1 = r4.actual
                r1.onError(r0)
                goto L1f
            L1a:
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
            L1f:
                io.reactivex.Scheduler$Worker r0 = r4.worker
                r0.dispose()
                return
            L25:
                int r0 = -r0
                int r0 = r4.addAndGet(r0)
                if (r0 != 0) goto L1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        void runSync() {
                r9 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r9.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r9.queue
                long r2 = r9.produced
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r9.requested
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L3e
                java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> L2c
                boolean r8 = r9.cancelled
                if (r8 == 0) goto L1a
                return
            L1a:
                if (r7 != 0) goto L25
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r9.worker
                r0.dispose()
                return
            L25:
                r0.onNext(r7)
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L2c:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscription r2 = r9.f270s
                r2.cancel()
                r0.onError(r1)
                io.reactivex.Scheduler$Worker r0 = r9.worker
                r0.dispose()
                return
            L3e:
                boolean r5 = r9.cancelled
                if (r5 == 0) goto L43
                return
            L43:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L52
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r9.worker
                r0.dispose()
                return
            L52:
                int r5 = r9.get()
                if (r4 != r5) goto L62
                r9.produced = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L7
                return
            L62:
                r4 = r5
                goto L7
        }
    }

    public FlowableObserveOn(io.reactivex.Flowable<T> r1, io.reactivex.Scheduler r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            r0.delayError = r3
            r0.prefetch = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.Scheduler r0 = r5.scheduler
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            boolean r1 = r6 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r1 == 0) goto L1b
            io.reactivex.Flowable<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnConditionalSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r6 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r6
            boolean r3 = r5.delayError
            int r4 = r5.prefetch
            r2.<init>(r6, r0, r3, r4)
            r1.subscribe(r2)
            goto L29
        L1b:
            io.reactivex.Flowable<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnSubscriber
            boolean r3 = r5.delayError
            int r4 = r5.prefetch
            r2.<init>(r6, r0, r3, r4)
            r1.subscribe(r2)
        L29:
            return
    }
}
