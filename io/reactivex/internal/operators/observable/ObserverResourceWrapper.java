package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObserverResourceWrapper<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -8612022020200669122L;
    final io.reactivex.Observer<? super T> actual;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> subscription;

    public ObserverResourceWrapper(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.subscription = r0
            r1.actual = r2
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.subscription
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

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            r1.dispose()
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onComplete()
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r1.dispose()
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onNext(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
            if (r2 == 0) goto Ld
            io.reactivex.Observer<? super T> r2 = r1.actual
            r2.onSubscribe(r1)
        Ld:
            return
    }

    public void setResource(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
            return
    }
}
