package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDefer<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<? extends T>> supplier;

    public FlowableDefer(java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            r0 = this;
            r0.<init>()
            r0.supplier = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<? extends T>> r0 = r2.supplier     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "The publisher supplied is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
            org.reactivestreams.Publisher r0 = (org.reactivestreams.Publisher) r0     // Catch: java.lang.Throwable -> L12
            r0.subscribe(r3)
            return
        L12:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r3)
            return
    }
}
