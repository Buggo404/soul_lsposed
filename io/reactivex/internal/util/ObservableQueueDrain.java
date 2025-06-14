package io.reactivex.internal.util;

/* loaded from: classes.dex */
public interface ObservableQueueDrain<T, U> {
    void accept(io.reactivex.Observer<? super U> r1, T r2);

    boolean cancelled();

    boolean done();

    boolean enter();

    java.lang.Throwable error();

    int leave(int r1);
}
