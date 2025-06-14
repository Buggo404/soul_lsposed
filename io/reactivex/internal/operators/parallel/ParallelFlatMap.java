package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelFlatMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final boolean delayError;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    public ParallelFlatMap(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.delayError = r3
            r0.maxConcurrency = r4
            r0.prefetch = r5
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            io.reactivex.parallel.ParallelFlowable<T> r0 = r1.source
            int r0 = r0.parallelism()
            return r0
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super R>[] r9) {
            r8 = this;
            boolean r0 = r8.validate(r9)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r9.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L20
            r3 = r9[r2]
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r4 = r8.mapper
            boolean r5 = r8.delayError
            int r6 = r8.maxConcurrency
            int r7 = r8.prefetch
            io.reactivex.FlowableSubscriber r3 = io.reactivex.internal.operators.flowable.FlowableFlatMap.subscribe(r3, r4, r5, r6, r7)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L20:
            io.reactivex.parallel.ParallelFlowable<T> r9 = r8.source
            r9.subscribe(r1)
            return
    }
}
