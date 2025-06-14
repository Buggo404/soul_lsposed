package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRetryBiPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;

    static final class RetryBiSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;
        long produced;
        int retries;

        /* renamed from: sa */
        final io.reactivex.internal.subscriptions.SubscriptionArbiter f286sa;
        final org.reactivestreams.Publisher<? extends T> source;

        RetryBiSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2, io.reactivex.internal.subscriptions.SubscriptionArbiter r3, org.reactivestreams.Publisher<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f286sa = r3
                r0.source = r4
                r0.predicate = r2
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
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                r0 = 1
                io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r1 = r6.predicate     // Catch: java.lang.Throwable -> L1c
                int r2 = r6.retries     // Catch: java.lang.Throwable -> L1c
                int r2 = r2 + r0
                r6.retries = r2     // Catch: java.lang.Throwable -> L1c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r0 = r1.test(r2, r7)     // Catch: java.lang.Throwable -> L1c
                if (r0 != 0) goto L18
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onError(r7)
                return
            L18:
                r6.subscribeNext()
                return
            L1c:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscriber<? super T> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
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
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.f286sa
                r0.setSubscription(r2)
                return
        }

        void subscribeNext() {
                r6 = this;
                int r0 = r6.getAndIncrement()
                if (r0 != 0) goto L2b
                r0 = 1
            L7:
                io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = r6.f286sa
                boolean r1 = r1.isCancelled()
                if (r1 == 0) goto L10
                return
            L10:
                long r1 = r6.produced
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L1f
                r6.produced = r3
                io.reactivex.internal.subscriptions.SubscriptionArbiter r3 = r6.f286sa
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

    public FlowableRetryBiPredicate(io.reactivex.Flowable<T> r1, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r0.<init>()
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber
            io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2 = r4.predicate
            io.reactivex.Flowable<T> r3 = r4.source
            r1.<init>(r5, r2, r0, r3)
            r1.subscribeNext()
            return
    }
}
