package io.reactivex;

/* loaded from: classes.dex */
public interface SingleEmitter<T> {
    boolean isDisposed();

    void onError(java.lang.Throwable r1);

    void onSuccess(T r1);

    void setCancellable(io.reactivex.functions.Cancellable r1);

    void setDisposable(io.reactivex.disposables.Disposable r1);

    boolean tryOnError(java.lang.Throwable r1);
}
