package io.reactivex;

/* loaded from: classes.dex */
public interface CompletableEmitter {
    boolean isDisposed();

    void onComplete();

    void onError(java.lang.Throwable r1);

    void setCancellable(io.reactivex.functions.Cancellable r1);

    void setDisposable(io.reactivex.disposables.Disposable r1);

    boolean tryOnError(java.lang.Throwable r1);
}
