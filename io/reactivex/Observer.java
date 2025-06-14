package io.reactivex;

/* loaded from: classes.dex */
public interface Observer<T> {
    void onComplete();

    void onError(java.lang.Throwable r1);

    void onNext(T r1);

    void onSubscribe(io.reactivex.disposables.Disposable r1);
}
