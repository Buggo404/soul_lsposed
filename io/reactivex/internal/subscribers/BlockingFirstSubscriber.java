package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public final class BlockingFirstSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    public BlockingFirstSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 != 0) goto L7
            r1.error = r2
            goto La
        L7:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        La:
            r1.countDown()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 != 0) goto Le
            r1.value = r2
            org.reactivestreams.Subscription r2 = r1.f527s
            r2.cancel()
            r1.countDown()
        Le:
            return
    }
}
