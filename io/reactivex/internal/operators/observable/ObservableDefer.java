package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDefer<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> supplier;

    public ObservableDefer(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            r0 = this;
            r0.<init>()
            r0.supplier = r1
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> r0 = r2.supplier     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "null ObservableSource supplied"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
            io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L12
            r0.subscribe(r3)
            return
        L12:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
