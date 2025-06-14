package io.reactivex.observers;

/* loaded from: classes.dex */
public abstract class DisposableCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {

    /* renamed from: s */
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f554s;

    public DisposableCompletableObserver() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f554s = r0
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f554s
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f554s
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f554s
            java.lang.Class r1 = r2.getClass()
            boolean r3 = io.reactivex.internal.util.EndConsumerHelper.setOnce(r0, r3, r1)
            if (r3 == 0) goto Lf
            r2.onStart()
        Lf:
            return
    }
}
