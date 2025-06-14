package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
    final org.reactivestreams.Publisher<? extends U> other;

    final class FlowableWithLatestSubscriber implements io.reactivex.FlowableSubscriber<U> {
        final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableWithLatestFrom this$0;
        private final io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> wlf;

        FlowableWithLatestSubscriber(io.reactivex.internal.operators.flowable.FlowableWithLatestFrom r1, io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.wlf = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r0 = this;
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber<T, U, R> r0 = r1.wlf
                r0.otherError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber<T, U, R> r0 = r1.wlf
                r0.lazySet(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber<T, U, R> r0 = r2.wlf
                boolean r0 = r0.setOther(r3)
                if (r0 == 0) goto L10
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L10:
                return
        }
    }

    static final class WithLatestFromSubscriber<T, U, R> extends java.util.concurrent.atomic.AtomicReference<U> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        final org.reactivestreams.Subscriber<? super R> actual;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> other;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f332s;

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.f332s = r0
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.combiner = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f332s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto L13
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.f332s
                java.lang.Object r3 = r3.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                r0 = 1
                r3.request(r0)
            L13:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f332s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        public void otherError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f332s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f332s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }

        public boolean setOther(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
                return r2
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                r1 = 0
                if (r0 == 0) goto L26
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2 = r3.combiner     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r4 = r2.apply(r4, r0)     // Catch: java.lang.Throwable -> L1a
                java.lang.String r0 = "The combiner returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L1a
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onNext(r4)
                r4 = 1
                return r4
            L1a:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r3.cancel()
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onError(r4)
            L26:
                return r1
        }
    }

    public FlowableWithLatestFrom(io.reactivex.Flowable<T> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, org.reactivestreams.Publisher<? extends U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.combiner = r2
            r0.other = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r3) {
            r2 = this;
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r3)
            io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber r3 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber
            io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1 = r2.combiner
            r3.<init>(r0, r1)
            r0.onSubscribe(r3)
            org.reactivestreams.Publisher<? extends U> r0 = r2.other
            io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$FlowableWithLatestSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$FlowableWithLatestSubscriber
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            io.reactivex.Flowable<T> r0 = r2.source
            r0.subscribe(r3)
            return
    }
}
