package io.reactivex;

/* loaded from: classes.dex */
public interface MaybeEmitter<T> {
    boolean isDisposed();

    void onComplete();

    void onError(java.lang.Throwable r1);

    void onSuccess(T r1);

    void setCancellable(io.reactivex.functions.Cancellable r1);

    void setDisposable(io.reactivex.disposables.Disposable r1);

    boolean tryOnError(java.lang.Throwable r1);
}
