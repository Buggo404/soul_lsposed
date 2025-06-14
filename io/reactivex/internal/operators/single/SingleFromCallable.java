package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFromCallable<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends T> callable;

    public SingleFromCallable(java.util.concurrent.Callable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.callable = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r4.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto Le
            return
        Le:
            java.util.concurrent.Callable<? extends T> r1 = r3.callable     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "The callable returned a null value"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L23
            r4.onSuccess(r1)
        L23:
            return
        L24:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L32
            r4.onError(r1)
            goto L35
        L32:
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L35:
            return
    }
}
