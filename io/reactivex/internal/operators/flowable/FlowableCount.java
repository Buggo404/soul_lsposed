package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableCount<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, java.lang.Long> {

    static final class CountSubscriber extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Long> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        long count;

        /* renamed from: s */
        org.reactivestreams.Subscription f234s;

        CountSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f234s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                long r0 = r2.count
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.complete(r0)
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
        public void onNext(java.lang.Object r5) {
                r4 = this;
                long r0 = r4.count
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f234s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f234s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableCount(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableCount$CountSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableCount$CountSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
