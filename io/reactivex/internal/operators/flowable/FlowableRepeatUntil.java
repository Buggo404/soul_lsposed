package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRepeatUntil<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BooleanSupplier until;

    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long produced;

        /* renamed from: sa */
        final io.reactivex.internal.subscriptions.SubscriptionArbiter f284sa;
        final org.reactivestreams.Publisher<? extends T> source;
        final io.reactivex.functions.BooleanSupplier stop;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BooleanSupplier r2, io.reactivex.internal.subscriptions.SubscriptionArbiter r3, org.reactivestreams.Publisher<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f284sa = r3
                r0.source = r4
                r0.stop = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                io.reactivex.functions.BooleanSupplier r0 = r2.stop     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto Le
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                goto L11
            Le:
                r2.subscribeNext()
            L11:
                return
            L12:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super T> r1 = r2.actual
                r1.onError(r0)
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
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.f284sa
                r0.setSubscription(r2)
                return
        }

        void subscribeNext() {
                r6 = this;
                int r0 = r6.getAndIncrement()
                if (r0 != 0) goto L2b
                r0 = 1
            L7:
                io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = r6.f284sa
                boolean r1 = r1.isCancelled()
                if (r1 == 0) goto L10
                return
            L10:
                long r1 = r6.produced
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L1f
                r6.produced = r3
                io.reactivex.internal.subscriptions.SubscriptionArbiter r3 = r6.f284sa
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

    public FlowableRepeatUntil(io.reactivex.Flowable<T> r1, io.reactivex.functions.BooleanSupplier r2) {
            r0 = this;
            r0.<init>(r1)
            r0.until = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r0.<init>()
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber
            io.reactivex.functions.BooleanSupplier r2 = r4.until
            io.reactivex.Flowable<T> r3 = r4.source
            r1.<init>(r5, r2, r0, r3)
            r1.subscribeNext()
            return
    }
}
