package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public final class CancellableDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.functions.Cancellable> implements io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(io.reactivex.functions.Cancellable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r0)
            io.reactivex.functions.Cancellable r0 = (io.reactivex.functions.Cancellable) r0
            if (r0 == 0) goto L1a
            r0.cancel()     // Catch: java.lang.Exception -> L13
            goto L1a
        L13:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L1a:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
