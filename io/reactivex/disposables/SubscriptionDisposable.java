package io.reactivex.disposables;

/* loaded from: classes.dex */
final class SubscriptionDisposable extends io.reactivex.disposables.ReferenceDisposable<org.reactivestreams.Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(org.reactivestreams.Subscription r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected /* bridge */ /* synthetic */ void onDisposed(org.reactivestreams.Subscription r1) {
            r0 = this;
            org.reactivestreams.Subscription r1 = (org.reactivestreams.Subscription) r1
            r0.onDisposed2(r1)
            return
    }

    /* renamed from: onDisposed, reason: avoid collision after fix types in other method */
    protected void onDisposed2(org.reactivestreams.Subscription r1) {
            r0 = this;
            r1.cancel()
            return
    }
}
