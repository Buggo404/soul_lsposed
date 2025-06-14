package io.reactivex.disposables;

/* loaded from: classes.dex */
final class RunnableDisposable extends io.reactivex.disposables.ReferenceDisposable<java.lang.Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    RunnableDisposable(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected /* bridge */ /* synthetic */ void onDisposed(java.lang.Runnable r1) {
            r0 = this;
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.onDisposed2(r1)
            return
    }

    /* renamed from: onDisposed, reason: avoid collision after fix types in other method */
    protected void onDisposed2(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RunnableDisposable(disposed="
            r0.<init>(r1)
            boolean r1 = r2.isDisposed()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
