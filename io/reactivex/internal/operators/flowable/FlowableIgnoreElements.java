package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableIgnoreElements<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    static final class IgnoreElementsSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.fuseable.QueueSubscription<T> {
        final org.reactivestreams.Subscriber<? super T> actual;

        /* renamed from: s */
        org.reactivestreams.Subscription f264s;

        IgnoreElementsSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f264s
                r0.cancel()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r0 = this;
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Should not be called!"
                r2.<init>(r0)
                throw r2
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r1, T r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Should not be called!"
                r1.<init>(r2)
                throw r1
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
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
        public void onNext(T r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f264s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f264s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                r1 = r1 & 2
                return r1
        }
    }

    public FlowableIgnoreElements(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableIgnoreElements$IgnoreElementsSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableIgnoreElements$IgnoreElementsSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
