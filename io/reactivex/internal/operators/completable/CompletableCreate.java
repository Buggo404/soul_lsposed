package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableCreate extends io.reactivex.Completable {
    final io.reactivex.CompletableOnSubscribe source;

    static final class Emitter extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.CompletableObserver actual;

        Emitter(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.CompletableEmitter
        public void onComplete() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L26
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L26
                io.reactivex.CompletableObserver r1 = r2.actual     // Catch: java.lang.Throwable -> L1f
                r1.onComplete()     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L26
                r0.dispose()
                goto L26
            L1f:
                r1 = move-exception
                if (r0 == 0) goto L25
                r0.dispose()
            L25:
                throw r1
            L26:
                return
        }

        @Override // io.reactivex.CompletableEmitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.tryOnError(r2)
                if (r0 != 0) goto L9
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L9:
                return
        }

        @Override // io.reactivex.CompletableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.disposables.CancellableDisposable r0 = new io.reactivex.internal.disposables.CancellableDisposable
                r0.<init>(r2)
                r1.setDisposable(r0)
                return
        }

        @Override // io.reactivex.CompletableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
                return
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public java.lang.String toString() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                java.lang.String r2 = super.toString()
                r0[r1] = r2
                java.lang.String r1 = "%s{%s}"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // io.reactivex.CompletableEmitter
        public boolean tryOnError(java.lang.Throwable r3) {
                r2 = this;
                if (r3 != 0) goto L9
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
            L9:
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L30
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L30
                io.reactivex.CompletableObserver r1 = r2.actual     // Catch: java.lang.Throwable -> L29
                r1.onError(r3)     // Catch: java.lang.Throwable -> L29
                if (r0 == 0) goto L27
                r0.dispose()
            L27:
                r3 = 1
                return r3
            L29:
                r3 = move-exception
                if (r0 == 0) goto L2f
                r0.dispose()
            L2f:
                throw r3
            L30:
                r3 = 0
                return r3
        }
    }

    public CompletableCreate(io.reactivex.CompletableOnSubscribe r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableCreate$Emitter r0 = new io.reactivex.internal.operators.completable.CompletableCreate$Emitter
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.CompletableOnSubscribe r2 = r1.source     // Catch: java.lang.Throwable -> Le
            r2.subscribe(r0)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r0.onError(r2)
        L15:
            return
    }
}
