package io.reactivex.parallel;

/* loaded from: classes.dex */
public interface ParallelFlowableConverter<T, R> {
    R apply(io.reactivex.parallel.ParallelFlowable<T> r1);
}
