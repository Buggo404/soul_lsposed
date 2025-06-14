package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFromCallable<T> extends io.reactivex.Flowable<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> callable;

    public FlowableFromCallable(java.util.concurrent.Callable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.callable = r1
            return
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
            r2 = this;
            java.util.concurrent.Callable<? extends T> r0 = r2.callable
            java.lang.Object r0 = r0.call()
            java.lang.String r1 = "The callable returned a null value"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
            return r0
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.internal.subscriptions.DeferredScalarSubscription r0 = new io.reactivex.internal.subscriptions.DeferredScalarSubscription
            r0.<init>(r4)
            r4.onSubscribe(r0)
            java.util.concurrent.Callable<? extends T> r1 = r3.callable     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "The callable returned a null value"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L18
            r0.complete(r4)
            return
        L18:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r4.onError(r0)
            return
    }
}
