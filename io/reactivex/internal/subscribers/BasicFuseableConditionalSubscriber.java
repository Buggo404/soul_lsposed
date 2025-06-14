package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, io.reactivex.internal.fuseable.QueueSubscription<R> {
    protected final io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> actual;
    protected boolean done;

    /* renamed from: qs */
    protected io.reactivex.internal.fuseable.QueueSubscription<T> f523qs;

    /* renamed from: s */
    protected org.reactivestreams.Subscription f524s;
    protected int sourceMode;

    public BasicFuseableConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    protected void afterDownstream() {
            r0 = this;
            return
    }

    protected boolean beforeDownstream() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f524s
            r0.cancel()
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
            r1 = this;
            io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r1.f523qs
            r0.clear()
            return
    }

    protected final void fail(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            org.reactivestreams.Subscription r0 = r1.f524s
            r0.cancel()
            r1.onError(r2)
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
            r1 = this;
            io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r1.f523qs
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Should not be called!"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r1, R r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Should not be called!"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.done = r0
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
            r0.onComplete()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
        L8:
            r0 = 1
            r1.done = r0
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f524s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
            if (r0 == 0) goto L20
            r1.f524s = r2
            boolean r0 = r2 instanceof io.reactivex.internal.fuseable.QueueSubscription
            if (r0 == 0) goto L12
            io.reactivex.internal.fuseable.QueueSubscription r2 = (io.reactivex.internal.fuseable.QueueSubscription) r2
            r1.f523qs = r2
        L12:
            boolean r2 = r1.beforeDownstream()
            if (r2 == 0) goto L20
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r1.actual
            r2.onSubscribe(r1)
            r1.afterDownstream()
        L20:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f524s
            r0.request(r2)
            return
    }

    protected final int transitiveBoundaryFusion(int r3) {
            r2 = this;
            io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f523qs
            if (r0 == 0) goto L11
            r1 = r3 & 4
            if (r1 != 0) goto L11
            int r3 = r0.requestFusion(r3)
            if (r3 == 0) goto L10
            r2.sourceMode = r3
        L10:
            return r3
        L11:
            r3 = 0
            return r3
    }
}
