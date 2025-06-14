package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFromFuture<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public FlowableFromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.future = r1
            r0.timeout = r2
            r0.unit = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.internal.subscriptions.DeferredScalarSubscription r0 = new io.reactivex.internal.subscriptions.DeferredScalarSubscription
            r0.<init>(r6)
            r6.onSubscribe(r0)
            java.util.concurrent.TimeUnit r1 = r5.unit     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            java.util.concurrent.Future<? extends T> r2 = r5.future     // Catch: java.lang.Throwable -> L2c
            long r3 = r5.timeout     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r2.get(r3, r1)     // Catch: java.lang.Throwable -> L2c
            goto L1b
        L15:
            java.util.concurrent.Future<? extends T> r1 = r5.future     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2c
        L1b:
            if (r1 != 0) goto L28
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "The future returned null"
            r0.<init>(r1)
            r6.onError(r0)
            goto L2b
        L28:
            r0.complete(r1)
        L2b:
            return
        L2c:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L39
            r6.onError(r1)
        L39:
            return
    }
}
