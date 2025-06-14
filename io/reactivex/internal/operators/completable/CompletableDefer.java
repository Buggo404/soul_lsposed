package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableDefer extends io.reactivex.Completable {
    final java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> completableSupplier;

    public CompletableDefer(java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> r1) {
            r0 = this;
            r0.<init>()
            r0.completableSupplier = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> r0 = r2.completableSupplier     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "The completableSupplier returned a null CompletableSource"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
            io.reactivex.CompletableSource r0 = (io.reactivex.CompletableSource) r0     // Catch: java.lang.Throwable -> L12
            r0.subscribe(r3)
            return
        L12:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
