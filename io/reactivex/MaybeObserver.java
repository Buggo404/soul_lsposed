package io.reactivex;

/* loaded from: classes.dex */
public interface MaybeObserver<T> {
    void onComplete();

    void onError(java.lang.Throwable r1);

    void onSubscribe(io.reactivex.disposables.Disposable r1);

    void onSuccess(T r1);
}
