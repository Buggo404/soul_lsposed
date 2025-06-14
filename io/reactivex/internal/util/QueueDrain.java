package io.reactivex.internal.util;

/* loaded from: classes.dex */
public interface QueueDrain<T, U> {
    boolean accept(org.reactivestreams.Subscriber<? super U> r1, T r2);

    boolean cancelled();

    boolean done();

    boolean enter();

    java.lang.Throwable error();

    int leave(int r1);

    long produced(long r1);

    long requested();
}
