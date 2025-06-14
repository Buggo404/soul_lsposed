package io.reactivex;

/* loaded from: classes.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    org.reactivestreams.Publisher<Downstream> apply(io.reactivex.Flowable<Upstream> r1);
}
