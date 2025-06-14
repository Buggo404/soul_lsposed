package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class CallbackCompletableObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, io.reactivex.functions.Consumer<java.lang.Throwable>, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -4361286194466301354L;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;

    public CallbackCompletableObserver(io.reactivex.functions.Action r1) {
            r0 = this;
            r0.<init>()
            r0.onError = r0
            r0.onComplete = r1
            return
    }

    public CallbackCompletableObserver(io.reactivex.functions.Consumer<? super java.lang.Throwable> r1, io.reactivex.functions.Action r2) {
            r0 = this;
            r0.<init>()
            r0.onError = r1
            r0.onComplete = r2
            return
    }

    @Override // io.reactivex.functions.Consumer
    public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.accept2(r1)
            return
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    public void accept2(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.exceptions.OnErrorNotImplementedException r0 = new io.reactivex.exceptions.OnErrorNotImplementedException
            r0.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
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
            r1 = this;
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r1.onError
            if (r0 == r1) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
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

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r1 = this;
            io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L6
            r0.run()     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        Ld:
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r0)
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r1.onError     // Catch: java.lang.Throwable -> L6
            r0.accept(r2)     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        Ld:
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r2)
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }
}
