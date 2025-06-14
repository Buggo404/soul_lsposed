package io.reactivex.parallel;

/* loaded from: classes.dex */
public interface ParallelTransformer<Upstream, Downstream> {
    io.reactivex.parallel.ParallelFlowable<Downstream> apply(io.reactivex.parallel.ParallelFlowable<Upstream> r1);
}
