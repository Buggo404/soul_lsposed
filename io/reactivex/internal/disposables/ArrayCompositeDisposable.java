package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public final class ArrayCompositeDisposable extends java.util.concurrent.atomic.AtomicReferenceArray<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = r4.get(r0)
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 == r2) goto L2d
            int r1 = r4.length()
        Ld:
            if (r0 >= r1) goto L2d
            java.lang.Object r2 = r4.get(r0)
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            io.reactivex.internal.disposables.DisposableHelper r3 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r2 == r3) goto L2a
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            java.lang.Object r2 = r4.getAndSet(r0, r2)
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            io.reactivex.internal.disposables.DisposableHelper r3 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r2 == r3) goto L2a
            if (r2 == 0) goto L2a
            r2.dispose()
        L2a:
            int r0 = r0 + 1
            goto Ld
        L2d:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.get(r0)
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 != r2) goto La
            r0 = 1
        La:
            return r0
    }

    public io.reactivex.disposables.Disposable replaceResource(int r3, io.reactivex.disposables.Disposable r4) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get(r3)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto Lf
            r4.dispose()
            r3 = 0
            return r3
        Lf:
            boolean r1 = r2.compareAndSet(r3, r0, r4)
            if (r1 == 0) goto L0
            return r0
    }

    public boolean setResource(int r3, io.reactivex.disposables.Disposable r4) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get(r3)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto Lf
            r4.dispose()
            r3 = 0
            return r3
        Lf:
            boolean r1 = r2.compareAndSet(r3, r0, r4)
            if (r1 == 0) goto L0
            if (r0 == 0) goto L1a
            r0.dispose()
        L1a:
            r3 = 1
            return r3
    }
}
