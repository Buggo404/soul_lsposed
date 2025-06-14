package io.reactivex.disposables;

/* loaded from: classes.dex */
abstract class ReferenceDisposable<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 6537757548749041217L;

    ReferenceDisposable(T r2) {
            r1 = this;
            java.lang.String r0 = "value is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r1.<init>(r2)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L10
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L10
            r1.onDisposed(r0)
        L10:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
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

    protected abstract void onDisposed(T r1);
}
