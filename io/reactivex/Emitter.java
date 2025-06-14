package io.reactivex;

/* loaded from: classes.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(java.lang.Throwable r1);

    void onNext(T r1);
}
