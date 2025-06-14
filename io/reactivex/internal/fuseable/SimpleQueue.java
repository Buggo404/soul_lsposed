package io.reactivex.internal.fuseable;

/* loaded from: classes.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(T r1);

    boolean offer(T r1, T r2);

    T poll() throws java.lang.Exception;
}
