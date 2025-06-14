package io.reactivex.internal.subscriptions;

/* loaded from: classes.dex */
public final class ScalarSubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.QueueSubscription<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final org.reactivestreams.Subscriber<? super T> subscriber;
    final T value;

    public ScalarSubscription(org.reactivestreams.Subscriber<? super T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.subscriber = r1
            r0.value = r2
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            r0 = 2
            r1.lazySet(r0)
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
            r1 = this;
            r0 = 1
            r1.lazySet(r0)
            return
    }

    public boolean isCancelled() {
            r2 = this;
            int r0 = r2.get()
            r1 = 2
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.get()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
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

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public T poll() {
            r1 = this;
            int r0 = r1.get()
            if (r0 != 0) goto Ld
            r0 = 1
            r1.lazySet(r0)
            T r0 = r1.value
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r2) {
            r1 = this;
            boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r2 != 0) goto L7
            return
        L7:
            r2 = 0
            r3 = 1
            boolean r2 = r1.compareAndSet(r2, r3)
            if (r2 == 0) goto L20
            org.reactivestreams.Subscriber<? super T> r2 = r1.subscriber
            T r3 = r1.value
            r2.onNext(r3)
            int r3 = r1.get()
            r0 = 2
            if (r3 == r0) goto L20
            r2.onComplete()
        L20:
            return
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int r1) {
            r0 = this;
            r1 = r1 & 1
            return r1
    }
}
