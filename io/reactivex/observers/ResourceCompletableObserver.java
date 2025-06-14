package io.reactivex.observers;

/* loaded from: classes.dex */
public abstract class ResourceCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
    private final io.reactivex.internal.disposables.ListCompositeDisposable resources;

    /* renamed from: s */
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f558s;

    public ResourceCompletableObserver() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f558s = r0
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = new io.reactivex.internal.disposables.ListCompositeDisposable
            r0.<init>()
            r1.resources = r0
            return
    }

    public final void add(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.lang.String r0 = "resource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.add(r2)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f558s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            if (r0 == 0) goto Ld
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.dispose()
        Ld:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f558s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f558s
            java.lang.Class r1 = r2.getClass()
            boolean r3 = io.reactivex.internal.util.EndConsumerHelper.setOnce(r0, r3, r1)
            if (r3 == 0) goto Lf
            r2.onStart()
        Lf:
            return
    }
}
