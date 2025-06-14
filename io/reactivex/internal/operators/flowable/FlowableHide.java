package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableHide<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    static final class HideSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;

        /* renamed from: s */
        org.reactivestreams.Subscription f263s;

        HideSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f263s
                r0.cancel()
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
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f263s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f263s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f263s
                r0.request(r2)
                return
        }
    }

    public FlowableHide(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableHide$HideSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableHide$HideSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
