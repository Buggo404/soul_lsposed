package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableThrottleLatest<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class ThrottleLatestSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final boolean emitLast;
        long emitted;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicReference<T> latest;
        final java.util.concurrent.atomic.AtomicLong requested;
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.Scheduler.Worker worker;

        ThrottleLatestSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                r0.emitLast = r6
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.latest = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r2 = this;
                r0 = 1
                r2.cancelled = r0
                org.reactivestreams.Subscription r0 = r2.upstream
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L19
                java.util.concurrent.atomic.AtomicReference<T> r0 = r2.latest
                r1 = 0
                r0.lazySet(r1)
            L19:
                return
        }

        void drain() {
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.concurrent.atomic.AtomicReference<T> r0 = r13.latest
                java.util.concurrent.atomic.AtomicLong r1 = r13.requested
                org.reactivestreams.Subscriber<? super T> r2 = r13.downstream
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r13.cancelled
                r6 = 0
                if (r5 == 0) goto L18
                r0.lazySet(r6)
                return
            L18:
                boolean r5 = r13.done
                if (r5 == 0) goto L2e
                java.lang.Throwable r7 = r13.error
                if (r7 == 0) goto L2e
                r0.lazySet(r6)
                java.lang.Throwable r0 = r13.error
                r2.onError(r0)
                io.reactivex.Scheduler$Worker r0 = r13.worker
                r0.dispose()
                return
            L2e:
                java.lang.Object r7 = r0.get()
                r8 = 0
                if (r7 != 0) goto L37
                r7 = r3
                goto L38
            L37:
                r7 = r8
            L38:
                r9 = 1
                if (r5 == 0) goto L71
                if (r7 != 0) goto L65
                boolean r3 = r13.emitLast
                if (r3 == 0) goto L65
                java.lang.Object r0 = r0.getAndSet(r6)
                long r3 = r13.emitted
                long r5 = r1.get()
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L5a
                long r3 = r3 + r9
                r13.emitted = r3
                r2.onNext(r0)
                r2.onComplete()
                goto L6b
            L5a:
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not emit final value due to lack of requests"
                r0.<init>(r1)
                r2.onError(r0)
                goto L6b
            L65:
                r0.lazySet(r6)
                r2.onComplete()
            L6b:
                io.reactivex.Scheduler$Worker r0 = r13.worker
                r0.dispose()
                return
            L71:
                if (r7 == 0) goto L7c
                boolean r5 = r13.timerFired
                if (r5 == 0) goto L85
                r13.timerRunning = r8
                r13.timerFired = r8
                goto L85
            L7c:
                boolean r5 = r13.timerRunning
                if (r5 == 0) goto L8d
                boolean r5 = r13.timerFired
                if (r5 == 0) goto L85
                goto L8d
            L85:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            L8d:
                java.lang.Object r5 = r0.getAndSet(r6)
                long r6 = r13.emitted
                long r11 = r1.get()
                int r11 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r11 == 0) goto Lb0
                r2.onNext(r5)
                long r6 = r6 + r9
                r13.emitted = r6
                r13.timerFired = r8
                r13.timerRunning = r3
                io.reactivex.Scheduler$Worker r5 = r13.worker
                long r6 = r13.timeout
                java.util.concurrent.TimeUnit r8 = r13.unit
                r5.schedule(r13, r6, r8)
                goto Lf
            Lb0:
                org.reactivestreams.Subscription r0 = r13.upstream
                r0.cancel()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not emit value due to lack of requests"
                r0.<init>(r1)
                r2.onError(r0)
                io.reactivex.Scheduler$Worker r0 = r13.worker
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<T> r0 = r1.latest
                r0.set(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.upstream = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.downstream
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Lb
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
            Lb:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 1
                r1.timerFired = r0
                r1.drain()
                return
        }
    }

    public FlowableThrottleLatest(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.emitLast = r6
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r10) {
            r9 = this;
            io.reactivex.Flowable<T> r0 = r9.source
            io.reactivex.internal.operators.flowable.FlowableThrottleLatest$ThrottleLatestSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableThrottleLatest$ThrottleLatestSubscriber
            long r3 = r9.timeout
            java.util.concurrent.TimeUnit r5 = r9.unit
            io.reactivex.Scheduler r1 = r9.scheduler
            io.reactivex.Scheduler$Worker r6 = r1.createWorker()
            boolean r7 = r9.emitLast
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r5, r6, r7)
            r0.subscribe(r8)
            return
    }
}
