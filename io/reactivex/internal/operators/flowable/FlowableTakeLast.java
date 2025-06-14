package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTakeLast<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int count;

    static final class TakeLastSubscriber<T> extends java.util.ArrayDeque<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7240042530241604978L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f309s;
        final java.util.concurrent.atomic.AtomicInteger wip;

        TakeLastSubscriber(org.reactivestreams.Subscriber<? super T> r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.wip = r0
                r1.actual = r2
                r1.count = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f309s
                r0.cancel()
                return
        }

        void drain() {
                r9 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r9.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L52
                org.reactivestreams.Subscriber<? super T> r0 = r9.actual
                java.util.concurrent.atomic.AtomicLong r1 = r9.requested
                long r1 = r1.get()
            L10:
                boolean r3 = r9.cancelled
                if (r3 == 0) goto L15
                return
            L15:
                boolean r3 = r9.done
                if (r3 == 0) goto L4a
                r3 = 0
                r5 = r3
            L1c:
                int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r7 == 0) goto L36
                boolean r7 = r9.cancelled
                if (r7 == 0) goto L25
                return
            L25:
                java.lang.Object r7 = r9.poll()
                if (r7 != 0) goto L2f
                r0.onComplete()
                return
            L2f:
                r0.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                goto L1c
            L36:
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 == 0) goto L4a
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 == 0) goto L4a
                java.util.concurrent.atomic.AtomicLong r1 = r9.requested
                long r2 = -r5
                long r1 = r1.addAndGet(r2)
            L4a:
                java.util.concurrent.atomic.AtomicInteger r3 = r9.wip
                int r3 = r3.decrementAndGet()
                if (r3 != 0) goto L10
            L52:
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
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.count
                int r1 = r2.size()
                if (r0 != r1) goto Lb
                r2.poll()
            Lb:
                r2.offer(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f309s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f309s = r3
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

    public FlowableTakeLast(io.reactivex.Flowable<T> r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableTakeLast$TakeLastSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTakeLast$TakeLastSubscriber
            int r2 = r3.count
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
