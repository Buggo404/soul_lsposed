package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableError extends io.reactivex.Completable {
    final java.lang.Throwable error;

    public CompletableError(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.error = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r2)
            return
    }
}
