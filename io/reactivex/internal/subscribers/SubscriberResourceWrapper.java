package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public final class SubscriberResourceWrapper<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable, org.reactivestreams.Subscription {
    private static final long serialVersionUID = -8612022020200669122L;
    final org.reactivestreams.Subscriber<? super T> actual;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> subscription;

    public SubscriberResourceWrapper(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.subscription = r0
            r1.actual = r2
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r0 = this;
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r1 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual
            r0.onComplete()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
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
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
            if (r2 == 0) goto Ld
            org.reactivestreams.Subscriber<? super T> r2 = r1.actual
            r2.onSubscribe(r1)
        Ld:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r0 == 0) goto L11
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r2)
        L11:
            return
    }

    public void setResource(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
            return
    }
}
