package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public abstract class BlockingBaseSubscriber<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.FlowableSubscriber<T> {
    volatile boolean cancelled;
    java.lang.Throwable error;

    /* renamed from: s */
    org.reactivestreams.Subscription f527s;
    T value;

    public BlockingBaseSubscriber() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public final T blockingGet() {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L22
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L11
            r4.await()     // Catch: java.lang.InterruptedException -> L11
            goto L22
        L11:
            r0 = move-exception
            org.reactivestreams.Subscription r1 = r4.f527s
            io.reactivex.internal.subscriptions.SubscriptionHelper r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r4.f527s = r2
            if (r1 == 0) goto L1d
            r1.cancel()
        L1d:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
        L22:
            java.lang.Throwable r0 = r4.error
            if (r0 != 0) goto L29
            T r0 = r4.value
            return r0
        L29:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
            r0 = this;
            r0.countDown()
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            org.reactivestreams.Subscription r0 = r2.f527s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
            if (r0 == 0) goto L21
            r2.f527s = r3
            boolean r0 = r2.cancelled
            if (r0 != 0) goto L21
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            boolean r0 = r2.cancelled
            if (r0 == 0) goto L21
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r2.f527s = r0
            r3.cancel()
        L21:
            return
    }
}
