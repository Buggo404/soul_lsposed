package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class LambdaObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;

    public LambdaObserver(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r4) {
            r0 = this;
            r0.<init>()
            r0.onNext = r1
            r0.onError = r2
            r0.onComplete = r3
            r0.onSubscribe = r4
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
            r2 = this;
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r2.onError
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
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

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L18
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r0)
            io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L11
            r0.run()     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L18:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isDisposed()
            if (r0 != 0) goto L27
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r4.lazySet(r0)
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r4.onError     // Catch: java.lang.Throwable -> L11
            r0.accept(r5)     // Catch: java.lang.Throwable -> L11
            goto L2a
        L11:
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
            goto L2a
        L27:
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
        L2a:
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L1c
            io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> Lc
            r0.accept(r2)     // Catch: java.lang.Throwable -> Lc
            goto L1c
        Lc:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            java.lang.Object r0 = r1.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            r0.dispose()
            r1.onError(r2)
        L1c:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r1, r2)
            if (r0 == 0) goto L16
            io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r0 = r1.onSubscribe     // Catch: java.lang.Throwable -> Lc
            r0.accept(r1)     // Catch: java.lang.Throwable -> Lc
            goto L16
        Lc:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r2.dispose()
            r1.onError(r0)
        L16:
            return
    }
}
