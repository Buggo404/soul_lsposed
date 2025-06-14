package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFromRunnable<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final java.lang.Runnable runnable;

    public MaybeFromRunnable(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.runnable = r1
            return
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
            r1 = this;
            java.lang.Runnable r0 = r1.runnable
            r0.run()
            r0 = 0
            return r0
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r3.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 != 0) goto L2d
            java.lang.Runnable r1 = r2.runnable     // Catch: java.lang.Throwable -> L1c
            r1.run()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L2d
            r3.onComplete()
            goto L2d
        L1c:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L2a
            r3.onError(r1)
            goto L2d
        L2a:
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L2d:
            return
    }
}
