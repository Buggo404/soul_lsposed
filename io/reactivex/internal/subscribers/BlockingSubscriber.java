package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public final class BlockingSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    public static final java.lang.Object TERMINATED = null;
    private static final long serialVersionUID = -4875965440900746268L;
    final java.util.Queue<java.lang.Object> queue;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.subscribers.BlockingSubscriber.TERMINATED = r0
            return
    }

    public BlockingSubscriber(java.util.Queue<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.queue = r1
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r2 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
            if (r0 == 0) goto Ld
            java.util.Queue<java.lang.Object> r0 = r2.queue
            java.lang.Object r1 = io.reactivex.internal.subscribers.BlockingSubscriber.TERMINATED
            r0.offer(r1)
        Ld:
            return
    }

    public boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r2 = this;
            java.util.Queue<java.lang.Object> r0 = r2.queue
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()
            r0.offer(r1)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
            r0.offer(r2)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r2) {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
            r0.offer(r2)
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r1, r2)
            if (r2 == 0) goto Lf
            java.util.Queue<java.lang.Object> r2 = r1.queue
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.subscription(r1)
            r2.offer(r0)
        Lf:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r2)
            return
    }
}
