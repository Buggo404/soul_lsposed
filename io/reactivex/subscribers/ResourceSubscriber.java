package io.reactivex.subscribers;

/* loaded from: classes.dex */
public abstract class ResourceSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicLong missedRequested;
    private final io.reactivex.internal.disposables.ListCompositeDisposable resources;

    /* renamed from: s */
    private final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f568s;

    public ResourceSubscriber() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f568s = r0
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = new io.reactivex.internal.disposables.ListCompositeDisposable
            r0.<init>()
            r1.resources = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.missedRequested = r0
            return
    }

    public final void add(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.lang.String r0 = "resource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.add(r2)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f568s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            if (r0 == 0) goto Ld
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.dispose()
        Ld:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f568s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
            return r0
    }

    protected void onStart() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.request(r0)
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r5.f568s
            java.lang.Class r1 = r5.getClass()
            boolean r0 = io.reactivex.internal.util.EndConsumerHelper.setOnce(r0, r6, r1)
            if (r0 == 0) goto L1e
            java.util.concurrent.atomic.AtomicLong r0 = r5.missedRequested
            r1 = 0
            long r3 = r0.getAndSet(r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1b
            r6.request(r3)
        L1b:
            r5.onStart()
        L1e:
            return
    }

    protected final void request(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f568s
            java.util.concurrent.atomic.AtomicLong r1 = r2.missedRequested
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
            return
    }
}
