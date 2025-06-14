package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelRunOn<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final int prefetch;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    static abstract class BaseRunOnSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        java.lang.Throwable error;
        final int limit;
        final int prefetch;
        final io.reactivex.internal.queue.SpscArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f493s;
        final io.reactivex.Scheduler.Worker worker;

        BaseRunOnSubscriber(int r2, io.reactivex.internal.queue.SpscArrayQueue<T> r3, io.reactivex.Scheduler.Worker r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                r1.prefetch = r2
                r1.queue = r3
                int r3 = r2 >> 2
                int r2 = r2 - r3
                r1.limit = r2
                r1.worker = r4
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1c
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f493s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1c
                io.reactivex.internal.queue.SpscArrayQueue<T> r0 = r1.queue
                r0.clear()
            L1c:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                r1.schedule()
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
                r1.schedule()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.internal.queue.SpscArrayQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L1d
                org.reactivestreams.Subscription r2 = r1.f493s
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue is full?!"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L1d:
                r1.schedule()
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.schedule()
            Le:
                return
        }

        final void schedule() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto Lb
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.schedule(r1)
            Lb:
                return
        }
    }

    final class MultiWorkerCallback implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback {
        final org.reactivestreams.Subscriber<T>[] parents;
        final org.reactivestreams.Subscriber<? super T>[] subscribers;
        final /* synthetic */ io.reactivex.internal.operators.parallel.ParallelRunOn this$0;

        MultiWorkerCallback(io.reactivex.internal.operators.parallel.ParallelRunOn r1, org.reactivestreams.Subscriber<? super T>[] r2, org.reactivestreams.Subscriber<T>[] r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.subscribers = r2
                r0.parents = r3
                return
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int r4, io.reactivex.Scheduler.Worker r5) {
                r3 = this;
                io.reactivex.internal.operators.parallel.ParallelRunOn r0 = r3.this$0
                org.reactivestreams.Subscriber<? super T>[] r1 = r3.subscribers
                org.reactivestreams.Subscriber<T>[] r2 = r3.parents
                r0.createSubscriber(r4, r1, r2, r5)
                return
        }
    }

    static final class RunOnConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelRunOn.BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;

        RunOnConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, int r2, io.reactivex.internal.queue.SpscArrayQueue<T> r3, io.reactivex.Scheduler.Worker r4) {
                r0 = this;
                r0.<init>(r2, r3, r4)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f493s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L15
                r2.f493s = r3
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.prefetch
                long r0 = (long) r0
                r3.request(r0)
            L15:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r18 = this;
                r0 = r18
                int r1 = r0.consumed
                io.reactivex.internal.queue.SpscArrayQueue<T> r2 = r0.queue
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r3 = r0.actual
                int r4 = r0.limit
                r5 = 1
                r6 = r5
            Lc:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L15:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L68
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r2.clear()
                return
            L21:
                boolean r14 = r0.done
                if (r14 == 0) goto L35
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L35
                r2.clear()
                r3.onError(r15)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L35:
                java.lang.Object r15 = r2.poll()
                r16 = 0
                if (r15 != 0) goto L40
                r17 = r5
                goto L42
            L40:
                r17 = r16
            L42:
                if (r14 == 0) goto L4f
                if (r17 == 0) goto L4f
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L4f:
                if (r17 == 0) goto L52
                goto L68
            L52:
                boolean r13 = r3.tryOnNext(r15)
                if (r13 == 0) goto L5b
                r13 = 1
                long r11 = r11 + r13
            L5b:
                int r1 = r1 + 1
                if (r1 != r4) goto L15
                org.reactivestreams.Subscription r13 = r0.f493s
                long r14 = (long) r1
                r13.request(r14)
                r1 = r16
                goto L15
            L68:
                if (r13 != 0) goto L95
                boolean r13 = r0.cancelled
                if (r13 == 0) goto L72
                r2.clear()
                return
            L72:
                boolean r13 = r0.done
                if (r13 == 0) goto L95
                java.lang.Throwable r13 = r0.error
                if (r13 == 0) goto L86
                r2.clear()
                r3.onError(r13)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L86:
                boolean r13 = r2.isEmpty()
                if (r13 == 0) goto L95
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L95:
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 == 0) goto La8
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 == 0) goto La8
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r8 = -r11
                r7.addAndGet(r8)
            La8:
                int r7 = r18.get()
                if (r7 != r6) goto Lb8
                r0.consumed = r1
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto Lc
                return
            Lb8:
                r6 = r7
                goto Lc
        }
    }

    static final class RunOnSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelRunOn.BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final org.reactivestreams.Subscriber<? super T> actual;

        RunOnSubscriber(org.reactivestreams.Subscriber<? super T> r1, int r2, io.reactivex.internal.queue.SpscArrayQueue<T> r3, io.reactivex.Scheduler.Worker r4) {
                r0 = this;
                r0.<init>(r2, r3, r4)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f493s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L15
                r2.f493s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.prefetch
                long r0 = (long) r0
                r3.request(r0)
            L15:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r18 = this;
                r0 = r18
                int r1 = r0.consumed
                io.reactivex.internal.queue.SpscArrayQueue<T> r2 = r0.queue
                org.reactivestreams.Subscriber<? super T> r3 = r0.actual
                int r4 = r0.limit
                r5 = 1
                r6 = r5
            Lc:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L15:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L65
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r2.clear()
                return
            L21:
                boolean r14 = r0.done
                if (r14 == 0) goto L35
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L35
                r2.clear()
                r3.onError(r15)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L35:
                java.lang.Object r15 = r2.poll()
                r16 = 0
                if (r15 != 0) goto L40
                r17 = r5
                goto L42
            L40:
                r17 = r16
            L42:
                if (r14 == 0) goto L4f
                if (r17 == 0) goto L4f
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L4f:
                if (r17 == 0) goto L52
                goto L65
            L52:
                r3.onNext(r15)
                r13 = 1
                long r11 = r11 + r13
                int r1 = r1 + 1
                if (r1 != r4) goto L15
                org.reactivestreams.Subscription r13 = r0.f493s
                long r14 = (long) r1
                r13.request(r14)
                r1 = r16
                goto L15
            L65:
                if (r13 != 0) goto L92
                boolean r13 = r0.cancelled
                if (r13 == 0) goto L6f
                r2.clear()
                return
            L6f:
                boolean r13 = r0.done
                if (r13 == 0) goto L92
                java.lang.Throwable r13 = r0.error
                if (r13 == 0) goto L83
                r2.clear()
                r3.onError(r13)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L83:
                boolean r13 = r2.isEmpty()
                if (r13 == 0) goto L92
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L92:
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 == 0) goto La5
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 == 0) goto La5
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r8 = -r11
                r7.addAndGet(r8)
            La5:
                int r7 = r18.get()
                if (r7 != r6) goto Lb5
                r0.consumed = r1
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto Lc
                return
            Lb5:
                r6 = r7
                goto Lc
        }
    }

    public ParallelRunOn(io.reactivex.parallel.ParallelFlowable<? extends T> r1, io.reactivex.Scheduler r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.scheduler = r2
            r0.prefetch = r3
            return
    }

    void createSubscriber(int r4, org.reactivestreams.Subscriber<? super T>[] r5, org.reactivestreams.Subscriber<T>[] r6, io.reactivex.Scheduler.Worker r7) {
            r3 = this;
            r5 = r5[r4]
            io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
            int r1 = r3.prefetch
            r0.<init>(r1)
            boolean r1 = r5 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r1 == 0) goto L19
            io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnConditionalSubscriber r1 = new io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r5 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r5
            int r2 = r3.prefetch
            r1.<init>(r5, r2, r0, r7)
            r6[r4] = r1
            goto L22
        L19:
            io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnSubscriber r1 = new io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnSubscriber
            int r2 = r3.prefetch
            r1.<init>(r5, r2, r0, r7)
            r6[r4] = r1
        L22:
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            io.reactivex.parallel.ParallelFlowable<? extends T> r0 = r1.source
            int r0 = r0.parallelism()
            return r0
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] r5) {
            r4 = this;
            boolean r0 = r4.validate(r5)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            io.reactivex.Scheduler r2 = r4.scheduler
            boolean r3 = r2 instanceof io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
            if (r3 == 0) goto L1b
            io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport r2 = (io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport) r2
            io.reactivex.internal.operators.parallel.ParallelRunOn$MultiWorkerCallback r3 = new io.reactivex.internal.operators.parallel.ParallelRunOn$MultiWorkerCallback
            r3.<init>(r4, r5, r1)
            r2.createWorkers(r0, r3)
            goto L2a
        L1b:
            r2 = 0
        L1c:
            if (r2 >= r0) goto L2a
            io.reactivex.Scheduler r3 = r4.scheduler
            io.reactivex.Scheduler$Worker r3 = r3.createWorker()
            r4.createSubscriber(r2, r5, r1, r3)
            int r2 = r2 + 1
            goto L1c
        L2a:
            io.reactivex.parallel.ParallelFlowable<? extends T> r5 = r4.source
            r5.subscribe(r1)
            return
    }
}
