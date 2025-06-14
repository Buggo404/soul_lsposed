package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final org.reactivestreams.Publisher<T> source;

    public FlowableConcatMapEagerPublisher(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, int r4, io.reactivex.internal.util.ErrorMode r5) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.maxConcurrency = r3
            r0.prefetch = r4
            r0.errorMode = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r9) {
            r8 = this;
            org.reactivestreams.Publisher<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3 = r8.mapper
            int r4 = r8.maxConcurrency
            int r5 = r8.prefetch
            io.reactivex.internal.util.ErrorMode r6 = r8.errorMode
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
