package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFromCallable<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> callable;

    public MaybeFromCallable(java.util.concurrent.Callable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.callable = r1
            return
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.Callable<? extends T> r0 = r1.callable
            java.lang.Object r0 = r0.call()
            return r0
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r3.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 != 0) goto L34
            java.util.concurrent.Callable<? extends T> r1 = r2.callable     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L34
            if (r1 != 0) goto L1f
            r3.onComplete()
            goto L34
        L1f:
            r3.onSuccess(r1)
            goto L34
        L23:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L31
            r3.onError(r1)
            goto L34
        L31:
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L34:
            return
    }
}
