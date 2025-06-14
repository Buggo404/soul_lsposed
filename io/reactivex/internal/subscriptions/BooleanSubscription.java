package io.reactivex.internal.subscriptions;

/* loaded from: classes.dex */
public final class BooleanSubscription extends java.util.concurrent.atomic.AtomicBoolean implements org.reactivestreams.Subscription {
    private static final long serialVersionUID = -8127758972444290902L;

    public BooleanSubscription() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.lazySet(r0)
            return
    }

    public boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.get()
            return r0
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r1) {
            r0 = this;
            io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r1)
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BooleanSubscription(cancelled="
            r0.<init>(r1)
            boolean r1 = r2.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
