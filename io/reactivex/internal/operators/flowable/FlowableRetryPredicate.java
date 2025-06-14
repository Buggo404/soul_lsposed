package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRetryPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long count;
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;

    static final class RetrySubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;
        long produced;
        long remaining;

        /* renamed from: sa */
        final io.reactivex.internal.subscriptions.SubscriptionArbiter f287sa;
        final org.reactivestreams.Publisher<? extends T> source;

        RetrySubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4, io.reactivex.internal.subscriptions.SubscriptionArbiter r5, org.reactivestreams.Publisher<? extends T> r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f287sa = r5
                r0.source = r6
                r0.predicate = r4
                r0.remaining = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                long r0 = r5.remaining
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L11
                r2 = 1
                long r2 = r0 - r2
                r5.remaining = r2
            L11:
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L1d
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onError(r6)
                goto L2e
            L1d:
                io.reactivex.functions.Predicate<? super java.lang.Throwable> r0 = r5.predicate     // Catch: java.lang.Throwable -> L2f
                boolean r0 = r0.test(r6)     // Catch: java.lang.Throwable -> L2f
                if (r0 != 0) goto L2b
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onError(r6)
                return
            L2b:
                r5.subscribeNext()
            L2e:
                return
            L2f:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super T> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
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
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.f287sa
                r0.setSubscription(r2)
                return
        }

        void subscribeNext() {
                r6 = this;
                int r0 = r6.getAndIncrement()
                if (r0 != 0) goto L2b
                r0 = 1
            L7:
                io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = r6.f287sa
                boolean r1 = r1.isCancelled()
                if (r1 == 0) goto L10
                return
            L10:
                long r1 = r6.produced
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L1f
                r6.produced = r3
                io.reactivex.internal.subscriptions.SubscriptionArbiter r3 = r6.f287sa
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

    public FlowableRetryPredicate(io.reactivex.Flowable<T> r1, long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r4
            r0.count = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r5 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r5.<init>()
            r9.onSubscribe(r5)
            io.reactivex.internal.operators.flowable.FlowableRetryPredicate$RetrySubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableRetryPredicate$RetrySubscriber
            long r2 = r8.count
            io.reactivex.functions.Predicate<? super java.lang.Throwable> r4 = r8.predicate
            io.reactivex.Flowable<T> r6 = r8.source
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r4, r5, r6)
            r7.subscribeNext()
            return
    }
}
