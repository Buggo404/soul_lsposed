package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeDefer<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends T>> maybeSupplier;

    public MaybeDefer(java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            r0 = this;
            r0.<init>()
            r0.maybeSupplier = r1
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends T>> r0 = r2.maybeSupplier     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "The maybeSupplier returned a null MaybeSource"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
            io.reactivex.MaybeSource r0 = (io.reactivex.MaybeSource) r0     // Catch: java.lang.Throwable -> L12
            r0.subscribe(r3)
            return
        L12:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
