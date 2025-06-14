package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableConcatMapPublisher<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int prefetch;
    final org.reactivestreams.Publisher<T> source;

    public FlowableConcatMapPublisher(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, io.reactivex.internal.util.ErrorMode r4) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.prefetch = r3
            r0.errorMode = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r4.mapper
            boolean r0 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(r0, r5, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r4.mapper
            int r2 = r4.prefetch
            io.reactivex.internal.util.ErrorMode r3 = r4.errorMode
            org.reactivestreams.Subscriber r5 = io.reactivex.internal.operators.flowable.FlowableConcatMap.subscribe(r5, r1, r2, r3)
            r0.subscribe(r5)
            return
    }
}
