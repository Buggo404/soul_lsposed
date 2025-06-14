package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFromUnsafeSource<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<T> source;

    public ObservableFromUnsafeSource(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.ObservableSource<T> r0 = r1.source
            r0.subscribe(r2)
            return
    }
}
