package io.reactivex.internal.fuseable;

/* loaded from: classes.dex */
public interface ScalarCallable<T> extends java.util.concurrent.Callable<T> {
    @Override // java.util.concurrent.Callable
    T call();
}
