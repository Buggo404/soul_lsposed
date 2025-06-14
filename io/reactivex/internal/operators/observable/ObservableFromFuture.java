package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFromFuture<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public ObservableFromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.future = r1
            r0.timeout = r2
            r0.unit = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r6) {
            r5 = this;
            io.reactivex.internal.observers.DeferredScalarDisposable r0 = new io.reactivex.internal.observers.DeferredScalarDisposable
            r0.<init>(r6)
            r6.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 != 0) goto L38
            java.util.concurrent.TimeUnit r1 = r5.unit     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1b
            java.util.concurrent.Future<? extends T> r2 = r5.future     // Catch: java.lang.Throwable -> L2b
            long r3 = r5.timeout     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r2.get(r3, r1)     // Catch: java.lang.Throwable -> L2b
            goto L21
        L1b:
            java.util.concurrent.Future<? extends T> r1 = r5.future     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2b
        L21:
            java.lang.String r2 = "Future returned null"
            java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r0.complete(r6)
            goto L38
        L2b:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L38
            r6.onError(r1)
        L38:
            return
    }
}
