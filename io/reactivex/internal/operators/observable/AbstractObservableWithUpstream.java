package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
abstract class AbstractObservableWithUpstream<T, U> extends io.reactivex.Observable<U> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T> {
    protected final io.reactivex.ObservableSource<T> source;

    AbstractObservableWithUpstream(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final io.reactivex.ObservableSource<T> source() {
            r1 = this;
            io.reactivex.ObservableSource<T> r0 = r1.source
            return r0
    }
}
