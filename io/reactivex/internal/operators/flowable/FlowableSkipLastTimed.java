package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSkipLastTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    static final class SkipLastTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5677354903406201275L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f302s;
        final io.reactivex.Scheduler scheduler;
        final long time;
        final java.util.concurrent.TimeUnit unit;

        SkipLastTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6, int r7, boolean r8) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                r1.actual = r2
                r1.time = r3
                r1.unit = r5
                r1.scheduler = r6
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r7)
                r1.queue = r2
                r1.delayError = r8
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f302s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<? super T> r5, boolean r6) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto Lb
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r3 = r2.queue
                r3.clear()
                return r1
            Lb:
                if (r3 == 0) goto L30
                if (r6 == 0) goto L1d
                if (r4 == 0) goto L30
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L19
                r5.onError(r3)
                goto L1c
            L19:
                r5.onComplete()
            L1c:
                return r1
            L1d:
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L2a
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r4 = r2.queue
                r4.clear()
                r5.onError(r3)
                return r1
            L2a:
                if (r4 == 0) goto L30
                r5.onComplete()
                return r1
            L30:
                r3 = 0
                return r3
        }

        void drain() {
                r23 = this;
                r0 = r23
                int r1 = r23.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super T> r1 = r0.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r0.queue
                boolean r3 = r0.delayError
                java.util.concurrent.TimeUnit r4 = r0.unit
                io.reactivex.Scheduler r5 = r0.scheduler
                long r6 = r0.time
                r9 = 1
            L16:
                java.util.concurrent.atomic.AtomicLong r10 = r0.requested
                long r10 = r10.get()
                r14 = 0
            L1e:
                int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r16 == 0) goto L5d
                boolean r8 = r0.done
                java.lang.Object r17 = r2.peek()
                java.lang.Long r17 = (java.lang.Long) r17
                if (r17 != 0) goto L2f
                r18 = 1
                goto L31
            L2f:
                r18 = 0
            L31:
                long r19 = r5.now(r4)
                if (r18 != 0) goto L43
                long r21 = r17.longValue()
                long r19 = r19 - r6
                int r17 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
                if (r17 <= 0) goto L43
                r12 = 1
                goto L45
            L43:
                r12 = r18
            L45:
                boolean r8 = r0.checkTerminated(r8, r12, r1, r3)
                if (r8 == 0) goto L4c
                return
            L4c:
                if (r12 == 0) goto L4f
                goto L5d
            L4f:
                r2.poll()
                java.lang.Object r8 = r2.poll()
                r1.onNext(r8)
                r12 = 1
                long r14 = r14 + r12
                goto L1e
            L5d:
                r10 = 0
                int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r8 == 0) goto L68
                java.util.concurrent.atomic.AtomicLong r8 = r0.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r8, r14)
            L68:
                int r8 = -r9
                int r9 = r0.addAndGet(r8)
                if (r9 != 0) goto L16
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
        public void onNext(T r4) {
                r3 = this;
                io.reactivex.Scheduler r0 = r3.scheduler
                java.util.concurrent.TimeUnit r1 = r3.unit
                long r0 = r0.now(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r3.queue
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.offer(r0, r4)
                r3.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f302s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f302s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
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
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }
    }

    public FlowableSkipLastTimed(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, int r6, boolean r7) {
            r0 = this;
            r0.<init>(r1)
            r0.time = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.bufferSize = r6
            r0.delayError = r7
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r11) {
            r10 = this;
            io.reactivex.Flowable<T> r0 = r10.source
            io.reactivex.internal.operators.flowable.FlowableSkipLastTimed$SkipLastTimedSubscriber r9 = new io.reactivex.internal.operators.flowable.FlowableSkipLastTimed$SkipLastTimedSubscriber
            long r3 = r10.time
            java.util.concurrent.TimeUnit r5 = r10.unit
            io.reactivex.Scheduler r6 = r10.scheduler
            int r7 = r10.bufferSize
            boolean r8 = r10.delayError
            r1 = r9
            r2 = r11
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r0.subscribe(r9)
            return
    }
}
