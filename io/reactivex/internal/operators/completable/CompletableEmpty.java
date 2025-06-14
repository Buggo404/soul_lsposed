package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableEmpty extends io.reactivex.Completable {
    public static final io.reactivex.Completable INSTANCE = null;

    static {
            io.reactivex.internal.operators.completable.CompletableEmpty r0 = new io.reactivex.internal.operators.completable.CompletableEmpty
            r0.<init>()
            io.reactivex.internal.operators.completable.CompletableEmpty.INSTANCE = r0
            return
    }

    private CompletableEmpty() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r1) {
            r0 = this;
            io.reactivex.internal.disposables.EmptyDisposable.complete(r1)
            return
    }
}
