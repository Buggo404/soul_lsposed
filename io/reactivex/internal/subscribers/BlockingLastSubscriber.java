package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public final class BlockingLastSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    public BlockingLastSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.value = r0
            r1.error = r2
            r1.countDown()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
