package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleLift<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleOperator<? extends R, ? super T> onLift;
    final io.reactivex.SingleSource<T> source;

    public SingleLift(io.reactivex.SingleSource<T> r1, io.reactivex.SingleOperator<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onLift = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r3) {
            r2 = this;
            io.reactivex.SingleOperator<? extends R, ? super T> r0 = r2.onLift     // Catch: java.lang.Throwable -> L14
            io.reactivex.SingleObserver r0 = r0.apply(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "The onLift returned a null SingleObserver"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L14
            io.reactivex.SingleObserver r0 = (io.reactivex.SingleObserver) r0     // Catch: java.lang.Throwable -> L14
            io.reactivex.SingleSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
        L14:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
