package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableNever extends io.reactivex.Completable {
    public static final io.reactivex.Completable INSTANCE = null;

    static {
            io.reactivex.internal.operators.completable.CompletableNever r0 = new io.reactivex.internal.operators.completable.CompletableNever
            r0.<init>()
            io.reactivex.internal.operators.completable.CompletableNever.INSTANCE = r0
            return
    }

    private CompletableNever() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.NEVER
            r2.onSubscribe(r0)
            return
    }
}
