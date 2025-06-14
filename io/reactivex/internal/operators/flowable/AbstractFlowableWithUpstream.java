package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends io.reactivex.Flowable<R> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    protected final io.reactivex.Flowable<T> source;

    AbstractFlowableWithUpstream(io.reactivex.Flowable<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "source is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = (io.reactivex.Flowable) r2
            r1.source = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final org.reactivestreams.Publisher<T> source() {
            r1 = this;
            io.reactivex.Flowable<T> r0 = r1.source
            return r0
    }
}
