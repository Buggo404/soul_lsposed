package org.reactivestreams;

/* loaded from: classes.dex */
public interface Subscriber<T> {
    void onComplete();

    void onError(java.lang.Throwable r1);

    void onNext(T r1);

    void onSubscribe(org.reactivestreams.Subscription r1);
}
