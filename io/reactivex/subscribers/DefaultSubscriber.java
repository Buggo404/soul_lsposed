package io.reactivex.subscribers;

/* loaded from: classes.dex */
public abstract class DefaultSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {

    /* renamed from: s */
    private org.reactivestreams.Subscription f566s;

    public DefaultSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final void cancel() {
            r2 = this;
            org.reactivestreams.Subscription r0 = r2.f566s
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r2.f566s = r1
            r0.cancel()
            return
    }

    protected void onStart() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.request(r0)
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            org.reactivestreams.Subscription r0 = r2.f566s
            java.lang.Class r1 = r2.getClass()
            boolean r0 = io.reactivex.internal.util.EndConsumerHelper.validate(r0, r3, r1)
            if (r0 == 0) goto L11
            r2.f566s = r3
            r2.onStart()
        L11:
            return
    }

    protected final void request(long r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f566s
            if (r0 == 0) goto L7
            r0.request(r2)
        L7:
            return
    }
}
