package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public final class SequentialDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
            r0 = this;
            r0.<init>()
            return
    }

    public SequentialDisposable(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            r0.<init>()
            r0.lazySet(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    public boolean replace(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
            return r1
    }

    public boolean update(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
            return r1
    }
}
