package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeErrorCallable<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> errorSupplier;

    public MaybeErrorCallable(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.errorSupplier = r1
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.disposed()
            r3.onSubscribe(r0)
            java.util.concurrent.Callable<? extends java.lang.Throwable> r0 = r2.errorSupplier     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources."
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
        L1a:
            r3.onError(r0)
            return
    }
}
