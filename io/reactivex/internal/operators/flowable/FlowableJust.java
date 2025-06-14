package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableJust<T> extends io.reactivex.Flowable<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    private final T value;

    public FlowableJust(T r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.subscriptions.ScalarSubscription r0 = new io.reactivex.internal.subscriptions.ScalarSubscription
            T r1 = r2.value
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            return
    }
}
