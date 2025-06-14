package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRepeatWhen<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> handler;

    static final class RepeatWhenSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber<T, java.lang.Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.FlowableProcessor<java.lang.Object> r2, org.reactivestreams.Subscription r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.again(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.receiver
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }
    }

    static final class WhenReceiver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<java.lang.Object>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 2827772011130406689L;
        final java.util.concurrent.atomic.AtomicLong requested;
        final org.reactivestreams.Publisher<T> source;
        io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber<T, U> subscriber;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> subscription;

        WhenReceiver(org.reactivestreams.Publisher<T> r1) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.subscription = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber<T, U> r0 = r1.subscriber
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber<T, U> r0 = r1.subscriber
                org.reactivestreams.Subscriber<? super T> r0 = r0.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber<T, U> r0 = r1.subscriber
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber<T, U> r0 = r1.subscriber
                org.reactivestreams.Subscriber<? super T> r0 = r0.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r2) {
                r1 = this;
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L22
            L6:
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.subscription
                java.lang.Object r2 = r2.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r2)
                if (r2 == 0) goto L15
                return
            L15:
                org.reactivestreams.Publisher<T> r2 = r1.source
                io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber<T, U> r0 = r1.subscriber
                r2.subscribe(r0)
                int r2 = r1.decrementAndGet()
                if (r2 != 0) goto L6
            L22:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final org.reactivestreams.Subscriber<? super T> actual;
        protected final io.reactivex.processors.FlowableProcessor<U> processor;
        private long produced;
        protected final org.reactivestreams.Subscription receiver;

        WhenSourceSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.FlowableProcessor<U> r2, org.reactivestreams.Subscription r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.processor = r2
                r0.receiver = r3
                return
        }

        protected final void again(U r6) {
                r5 = this;
                long r0 = r5.produced
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Ld
                r5.produced = r2
                r5.produced(r0)
            Ld:
                org.reactivestreams.Subscription r0 = r5.receiver
                r1 = 1
                r0.request(r1)
                io.reactivex.processors.FlowableProcessor<U> r0 = r5.processor
                r0.onNext(r6)
                return
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.receiver
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T r5) {
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
        public final void onSubscribe(org.reactivestreams.Subscription r1) {
                r0 = this;
                r0.setSubscription(r1)
                return
        }
    }

    public FlowableRepeatWhen(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.handler = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r6)
            r1 = 8
            io.reactivex.processors.UnicastProcessor r1 = io.reactivex.processors.UnicastProcessor.create(r1)
            io.reactivex.processors.FlowableProcessor r1 = r1.toSerialized()
            io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> r2 = r5.handler     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.apply(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "handler returned a null Publisher"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L3a
            org.reactivestreams.Publisher r2 = (org.reactivestreams.Publisher) r2     // Catch: java.lang.Throwable -> L3a
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver r3 = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver
            io.reactivex.Flowable<T> r4 = r5.source
            r3.<init>(r4)
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen$RepeatWhenSubscriber r4 = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen$RepeatWhenSubscriber
            r4.<init>(r0, r1, r3)
            r3.subscriber = r4
            r6.onSubscribe(r4)
            r2.subscribe(r3)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.onNext(r6)
            return
        L3a:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
    }
}
