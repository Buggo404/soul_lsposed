package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelFromArray<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final org.reactivestreams.Publisher<T>[] sources;

    public ParallelFromArray(org.reactivestreams.Publisher<T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            org.reactivestreams.Publisher<T>[] r0 = r1.sources
            int r0 = r0.length
            return r0
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] r5) {
            r4 = this;
            boolean r0 = r4.validate(r5)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L17
            org.reactivestreams.Publisher<T>[] r2 = r4.sources
            r2 = r2[r1]
            r3 = r5[r1]
            r2.subscribe(r3)
            int r1 = r1 + 1
            goto L9
        L17:
            return
    }
}
