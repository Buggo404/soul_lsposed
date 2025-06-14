package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelConcatMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int prefetch;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    public ParallelConcatMap(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, io.reactivex.internal.util.ErrorMode r4) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            java.lang.String r1 = "mapper"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r1)
            io.reactivex.functions.Function r1 = (io.reactivex.functions.Function) r1
            r0.mapper = r1
            r0.prefetch = r3
            java.lang.String r1 = "errorMode"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)
            io.reactivex.internal.util.ErrorMode r1 = (io.reactivex.internal.util.ErrorMode) r1
            r0.errorMode = r1
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
    public void subscribe(org.reactivestreams.Subscriber<? super R>[] r8) {
            r7 = this;
            boolean r0 = r7.validate(r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r8.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1e
            r3 = r8[r2]
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r4 = r7.mapper
            int r5 = r7.prefetch
            io.reactivex.internal.util.ErrorMode r6 = r7.errorMode
            org.reactivestreams.Subscriber r3 = io.reactivex.internal.operators.flowable.FlowableConcatMap.subscribe(r3, r4, r5, r6)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L1e:
            io.reactivex.parallel.ParallelFlowable<T> r8 = r7.source
            r8.subscribe(r1)
            return
    }
}
