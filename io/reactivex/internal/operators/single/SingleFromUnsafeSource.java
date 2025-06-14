package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFromUnsafeSource<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> source;

    public SingleFromUnsafeSource(io.reactivex.SingleSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r2) {
            r1 = this;
            io.reactivex.SingleSource<T> r0 = r1.source
            r0.subscribe(r2)
            return
    }
}
