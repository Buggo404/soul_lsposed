package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class BiConsumerSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 4943102778943297569L;
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> onCallback;

    public BiConsumerSingleObserver(io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.onCallback = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED     // Catch: java.lang.Throwable -> Lc
            r4.lazySet(r0)     // Catch: java.lang.Throwable -> Lc
            io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r4.onCallback     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r0.accept(r1, r5)     // Catch: java.lang.Throwable -> Lc
            goto L21
        Lc:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r1.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L21:
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T r3) {
            r2 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED     // Catch: java.lang.Throwable -> Lc
            r2.lazySet(r0)     // Catch: java.lang.Throwable -> Lc
            io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r2.onCallback     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r0.accept(r3, r1)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
        L13:
            return
    }
}
