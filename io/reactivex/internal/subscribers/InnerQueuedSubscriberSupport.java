package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public interface InnerQueuedSubscriberSupport<T> {
    void drain();

    void innerComplete(io.reactivex.internal.subscribers.InnerQueuedSubscriber<T> r1);

    void innerError(io.reactivex.internal.subscribers.InnerQueuedSubscriber<T> r1, java.lang.Throwable r2);

    void innerNext(io.reactivex.internal.subscribers.InnerQueuedSubscriber<T> r1, T r2);
}
