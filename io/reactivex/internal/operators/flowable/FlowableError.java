package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableError<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> errorSupplier;

    public FlowableError(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.errorSupplier = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            java.util.concurrent.Callable<? extends java.lang.Throwable> r0 = r2.errorSupplier     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources."
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
        L13:
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r3)
            return
    }
}
