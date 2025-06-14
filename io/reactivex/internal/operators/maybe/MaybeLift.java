package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeLift<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.MaybeOperator<? extends R, ? super T> operator;

    public MaybeLift(io.reactivex.MaybeSource<T> r1, io.reactivex.MaybeOperator<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.operator = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r3) {
            r2 = this;
            io.reactivex.MaybeOperator<? extends R, ? super T> r0 = r2.operator     // Catch: java.lang.Throwable -> L14
            io.reactivex.MaybeObserver r0 = r0.apply(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "The operator returned a null MaybeObserver"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L14
            io.reactivex.MaybeObserver r0 = (io.reactivex.MaybeObserver) r0     // Catch: java.lang.Throwable -> L14
            io.reactivex.MaybeSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
        L14:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
