package io.reactivex;

/* loaded from: classes.dex */
public interface ObservableEmitter<T> extends io.reactivex.Emitter<T> {
    boolean isDisposed();

    io.reactivex.ObservableEmitter<T> serialize();

    void setCancellable(io.reactivex.functions.Cancellable r1);

    void setDisposable(io.reactivex.disposables.Disposable r1);

    boolean tryOnError(java.lang.Throwable r1);
}
