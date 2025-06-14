package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public abstract class DeferredScalarSubscriber<T, R> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<R> implements io.reactivex.FlowableSubscriber<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;

    /* renamed from: s */
    protected org.reactivestreams.Subscription f528s;

    public DeferredScalarSubscriber(org.reactivestreams.Subscriber<? super R> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            super.cancel()
            org.reactivestreams.Subscription r0 = r1.f528s
            r0.cancel()
            return
    }

    public void onComplete() {
            r1 = this;
            boolean r0 = r1.hasValue
            if (r0 == 0) goto La
            T r0 = r1.value
            r1.complete(r0)
            goto Lf
        La:
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual
            r0.onComplete()
        Lf:
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.value = r0
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual
            r0.onError(r2)
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            org.reactivestreams.Subscription r0 = r2.f528s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
            if (r0 == 0) goto L17
            r2.f528s = r3
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            r0.onSubscribe(r2)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
        L17:
            return
    }
}
