package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFlatMapPublisher<T, U> extends io.reactivex.Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
    final int maxConcurrency;
    final org.reactivestreams.Publisher<T> source;

    public FlowableFlatMapPublisher(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            r0.bufferSize = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r6) {
            r5 = this;
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(r0, r6, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r1 = r5.mapper
            boolean r2 = r5.delayErrors
            int r3 = r5.maxConcurrency
            int r4 = r5.bufferSize
            io.reactivex.FlowableSubscriber r6 = io.reactivex.internal.operators.flowable.FlowableFlatMap.subscribe(r6, r1, r2, r3, r4)
            r0.subscribe(r6)
            return
    }
}
