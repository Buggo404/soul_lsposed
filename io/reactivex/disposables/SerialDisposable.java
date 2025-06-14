package io.reactivex.disposables;

/* loaded from: classes.dex */
public final class SerialDisposable implements io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource;

    public SerialDisposable() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.resource = r0
            return
    }

    public SerialDisposable(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.resource = r0
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    public io.reactivex.disposables.Disposable get() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.resource
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L10
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.disposed()
        L10:
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    public boolean replace(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.replace(r0, r2)
            return r2
    }

    public boolean set(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.set(r0, r2)
            return r2
    }
}
