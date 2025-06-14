package io.reactivex.internal.fuseable;

/* loaded from: classes.dex */
public interface ConditionalSubscriber<T> extends io.reactivex.FlowableSubscriber<T> {
    boolean tryOnNext(T r1);
}
