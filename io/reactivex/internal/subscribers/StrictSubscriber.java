package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public class StrictSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    private static final long serialVersionUID = -4945028590049415624L;
    final org.reactivestreams.Subscriber<? super T> actual;
    volatile boolean done;
    final io.reactivex.internal.util.AtomicThrowable error;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final java.util.concurrent.atomic.AtomicLong requested;

    /* renamed from: s */
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f549s;

    public StrictSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
            r1.<init>()
            r0.error = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>()
            r0.requested = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.f549s = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r0.once = r1
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L9
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f549s
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
        L9:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r2 = this;
            r0 = 1
            r2.done = r0
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            io.reactivex.internal.util.AtomicThrowable r1 = r2.error
            io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r3) {
            r2 = this;
            r0 = 1
            r2.done = r0
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            io.reactivex.internal.util.AtomicThrowable r1 = r2.error
            io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r3) {
            r2 = this;
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            io.reactivex.internal.util.AtomicThrowable r1 = r2.error
            io.reactivex.internal.util.HalfSerializer.onNext(r0, r3, r2, r1)
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L17
            org.reactivestreams.Subscriber<? super T> r0 = r3.actual
            r0.onSubscribe(r3)
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.f549s
            java.util.concurrent.atomic.AtomicLong r1 = r3.requested
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r4)
            goto L27
        L17:
            r4.cancel()
            r3.cancel()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "§2.12 violated: onSubscribe must be called at most once"
            r4.<init>(r0)
            r3.onError(r4)
        L27:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
            r3.cancel()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "§3.9 violated: positive request amount required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            r3.onError(r0)
            goto L28
        L21:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.f549s
            java.util.concurrent.atomic.AtomicLong r1 = r3.requested
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r4)
        L28:
            return
    }
}
