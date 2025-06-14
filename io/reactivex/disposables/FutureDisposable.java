package io.reactivex.disposables;

/* loaded from: classes.dex */
final class FutureDisposable extends java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> implements io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    FutureDisposable(java.util.concurrent.Future<?> r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.allowInterrupt = r2
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.getAndSet(r0)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            if (r0 == 0) goto Le
            boolean r1 = r2.allowInterrupt
            r0.cancel(r1)
        Le:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            if (r0 == 0) goto L11
            boolean r0 = r0.isDone()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }
}
