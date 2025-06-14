package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleNever extends io.reactivex.Single<java.lang.Object> {
    public static final io.reactivex.Single<java.lang.Object> INSTANCE = null;

    static {
            io.reactivex.internal.operators.single.SingleNever r0 = new io.reactivex.internal.operators.single.SingleNever
            r0.<init>()
            io.reactivex.internal.operators.single.SingleNever.INSTANCE = r0
            return
    }

    private SingleNever() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Object> r2) {
            r1 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.NEVER
            r2.onSubscribe(r0)
            return
    }
}
