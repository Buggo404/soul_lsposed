package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public interface InnerQueuedObserverSupport<T> {
    void drain();

    void innerComplete(io.reactivex.internal.observers.InnerQueuedObserver<T> r1);

    void innerError(io.reactivex.internal.observers.InnerQueuedObserver<T> r1, java.lang.Throwable r2);

    void innerNext(io.reactivex.internal.observers.InnerQueuedObserver<T> r1, T r2);
}
