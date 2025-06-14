package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSkipUntil<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> other;

    static final class SkipUntilMainSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -6270983465606289181L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.util.AtomicThrowable error;
        volatile boolean gate;
        final io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber<T>.OtherSubscriber other;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f303s;

        final class OtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
            private static final long serialVersionUID = -5592042965931999169L;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber this$0;

            OtherSubscriber(io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                    r2 = this;
                    io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber r0 = r2.this$0
                    r1 = 1
                    r0.gate = r1
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(java.lang.Throwable r4) {
                    r3 = this;
                    io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber r0 = r3.this$0
                    java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r0.f303s
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                    io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber r0 = r3.this$0
                    org.reactivestreams.Subscriber<? super T> r0 = r0.actual
                    io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber r1 = r3.this$0
                    io.reactivex.internal.util.AtomicThrowable r2 = r1.error
                    io.reactivex.internal.util.HalfSerializer.onError(r0, r4, r1, r2)
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(java.lang.Object r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber r2 = r1.this$0
                    r0 = 1
                    r2.gate = r0
                    java.lang.Object r2 = r1.get()
                    org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                    r2.cancel()
                    return
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public void onSubscribe(org.reactivestreams.Subscription r3) {
                    r2 = this;
                    r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                    return
            }
        }

        SkipUntilMainSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.f303s = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber$OtherSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber$OtherSubscriber
                r1.<init>(r0)
                r0.other = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f303s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber<T>$OtherSubscriber r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber<T>$OtherSubscriber r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber<T>$OtherSubscriber r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto L13
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.f303s
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
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f303s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f303s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.gate
                if (r0 == 0) goto Ld
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r3, r2, r1)
                r3 = 1
                return r3
            Ld:
                r3 = 0
                return r3
        }
    }

    public FlowableSkipUntil(io.reactivex.Flowable<T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber
            r0.<init>(r3)
            r3.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r3 = r2.other
            io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber<T>$OtherSubscriber r1 = r0.other
            r3.subscribe(r1)
            io.reactivex.Flowable<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
