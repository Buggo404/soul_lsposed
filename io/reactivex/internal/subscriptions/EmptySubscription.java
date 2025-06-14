package io.reactivex.internal.subscriptions;

/* loaded from: classes.dex */
public enum EmptySubscription extends java.lang.Enum<io.reactivex.internal.subscriptions.EmptySubscription> implements io.reactivex.internal.fuseable.QueueSubscription<java.lang.Object> {
    private static final /* synthetic */ io.reactivex.internal.subscriptions.EmptySubscription[] $VALUES = null;
    public static final io.reactivex.internal.subscriptions.EmptySubscription INSTANCE = null;

    static {
            io.reactivex.internal.subscriptions.EmptySubscription r0 = new io.reactivex.internal.subscriptions.EmptySubscription
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE = r0
            r1 = 1
            io.reactivex.internal.subscriptions.EmptySubscription[] r1 = new io.reactivex.internal.subscriptions.EmptySubscription[r1]
            r1[r2] = r0
            io.reactivex.internal.subscriptions.EmptySubscription.$VALUES = r1
            return
    }

    EmptySubscription(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static void complete(org.reactivestreams.Subscriber<?> r1) {
            io.reactivex.internal.subscriptions.EmptySubscription r0 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE
            r1.onSubscribe(r0)
            r1.onComplete()
            return
    }

    public static void error(java.lang.Throwable r1, org.reactivestreams.Subscriber<?> r2) {
            io.reactivex.internal.subscriptions.EmptySubscription r0 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE
            r2.onSubscribe(r0)
            r2.onError(r1)
            return
    }

    public static io.reactivex.internal.subscriptions.EmptySubscription valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.subscriptions.EmptySubscription> r0 = io.reactivex.internal.subscriptions.EmptySubscription.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.subscriptions.EmptySubscription r1 = (io.reactivex.internal.subscriptions.EmptySubscription) r1
            return r1
    }

    public static io.reactivex.internal.subscriptions.EmptySubscription[] values() {
            io.reactivex.internal.subscriptions.EmptySubscription[] r0 = io.reactivex.internal.subscriptions.EmptySubscription.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.subscriptions.EmptySubscription[] r0 = (io.reactivex.internal.subscriptions.EmptySubscription[]) r0
            return r0
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r0 = this;
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
    public boolean offer(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Should not be called!"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Should not be called!"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public java.lang.Object poll() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r1) {
            r0 = this;
            io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r1)
            return
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int r1) {
            r0 = this;
            r1 = r1 & 2
            return r1
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EmptySubscription"
            return r0
    }
}
