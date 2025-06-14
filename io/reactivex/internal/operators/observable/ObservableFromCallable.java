package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFromCallable<T> extends io.reactivex.Observable<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> callable;

    public ObservableFromCallable(java.util.concurrent.Callable<? extends T> r1) {
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

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.internal.observers.DeferredScalarDisposable r0 = new io.reactivex.internal.observers.DeferredScalarDisposable
            r0.<init>(r4)
            r4.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto Lf
            return
        Lf:
            java.util.concurrent.Callable<? extends T> r1 = r3.callable     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "Callable returned null"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r0.complete(r4)
            return
        L1f:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L2d
            r4.onError(r1)
            goto L30
        L2d:
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L30:
            return
    }
}
