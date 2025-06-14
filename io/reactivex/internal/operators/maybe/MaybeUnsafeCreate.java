package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeUnsafeCreate<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    public MaybeUnsafeCreate(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r2) {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            r0.subscribe(r2)
            return
    }
}
