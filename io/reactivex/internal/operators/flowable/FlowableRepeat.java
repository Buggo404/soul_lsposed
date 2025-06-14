package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRepeat<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long count;

    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long produced;
        long remaining;

        /* renamed from: sa */
        final io.reactivex.internal.subscriptions.SubscriptionArbiter f283sa;
        final org.reactivestreams.Publisher<? extends T> source;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, io.reactivex.internal.subscriptions.SubscriptionArbiter r4, org.reactivestreams.Publisher<? extends T> r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f283sa = r4
                r0.source = r5
                r0.remaining = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r4 = this;
                long r0 = r4.remaining
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L11
                r2 = 1
                long r2 = r0 - r2
                r4.remaining = r2
            L11:
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1b
                r4.subscribeNext()
                goto L20
            L1b:
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
            L20:
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
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.f283sa
                r0.setSubscription(r2)
                return
        }

        void subscribeNext() {
                r6 = this;
                int r0 = r6.getAndIncrement()
                if (r0 != 0) goto L2b
                r0 = 1
            L7:
                io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = r6.f283sa
                boolean r1 = r1.isCancelled()
                if (r1 == 0) goto L10
                return
            L10:
                long r1 = r6.produced
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L1f
                r6.produced = r3
                io.reactivex.internal.subscriptions.SubscriptionArbiter r3 = r6.f283sa
                r3.produced(r1)
            L1f:
                org.reactivestreams.Publisher<? extends T> r1 = r6.source
                r1.subscribe(r6)
                int r0 = -r0
                int r0 = r6.addAndGet(r0)
                if (r0 != 0) goto L7
            L2b:
                return
        }
    }

    public FlowableRepeat(io.reactivex.Flowable<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r4 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r4.<init>()
            r8.onSubscribe(r4)
            io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber r6 = new io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber
            long r0 = r7.count
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L19
            r2 = 1
            long r0 = r0 - r2
            r2 = r0
        L19:
            io.reactivex.Flowable<T> r5 = r7.source
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r4, r5)
            r6.subscribeNext()
            return
    }
}
