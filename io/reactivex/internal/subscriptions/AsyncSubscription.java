package io.reactivex.internal.subscriptions;

/* loaded from: classes.dex */
public final class AsyncSubscription extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 7028635084060361255L;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> actual;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource;

    public AsyncSubscription() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.resource = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.actual = r0
            return
    }

    public AsyncSubscription(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            r0.lazySet(r2)
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
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.actual
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.actual
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

    public boolean replaceResource(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.replace(r0, r2)
            return r2
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.actual
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r2)
            return
    }

    public boolean setResource(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.set(r0, r2)
            return r2
    }

    public void setSubscription(org.reactivestreams.Subscription r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.actual
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r2)
            return
    }
}
