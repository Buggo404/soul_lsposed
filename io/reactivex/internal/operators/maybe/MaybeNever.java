package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeNever extends io.reactivex.Maybe<java.lang.Object> {
    public static final io.reactivex.internal.operators.maybe.MaybeNever INSTANCE = null;

    static {
            io.reactivex.internal.operators.maybe.MaybeNever r0 = new io.reactivex.internal.operators.maybe.MaybeNever
            r0.<init>()
            io.reactivex.internal.operators.maybe.MaybeNever.INSTANCE = r0
            return
    }

    public MaybeNever() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Object> r2) {
            r1 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.NEVER
            r2.onSubscribe(r0)
            return
    }
}
