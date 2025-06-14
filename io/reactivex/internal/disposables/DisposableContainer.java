package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public interface DisposableContainer {
    boolean add(io.reactivex.disposables.Disposable r1);

    boolean delete(io.reactivex.disposables.Disposable r1);

    boolean remove(io.reactivex.disposables.Disposable r1);
}
