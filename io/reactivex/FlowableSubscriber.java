package io.reactivex;

/* loaded from: classes.dex */
public interface FlowableSubscriber<T> extends org.reactivestreams.Subscriber<T> {
    @Override // org.reactivestreams.Subscriber
    void onSubscribe(org.reactivestreams.Subscription r1);
}
