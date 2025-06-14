package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
abstract class AbstractMaybeWithUpstream<T, R> extends io.reactivex.Maybe<R> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    protected final io.reactivex.MaybeSource<T> source;

    AbstractMaybeWithUpstream(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }
}
