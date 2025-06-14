package io.reactivex;

/* loaded from: classes.dex */
public interface FlowableOperator<Downstream, Upstream> {
    org.reactivestreams.Subscriber<? super Upstream> apply(org.reactivestreams.Subscriber<? super Downstream> r1) throws java.lang.Exception;
}
