package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class BlockingMultiObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver<T> {
    volatile boolean cancelled;

    /* renamed from: d */
    io.reactivex.disposables.Disposable f178d;
    java.lang.Throwable error;
    T value;

    public BlockingMultiObserver() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public boolean blockingAwait(long r5, java.util.concurrent.TimeUnit r7) {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L21
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L18
            boolean r5 = r4.await(r5, r7)     // Catch: java.lang.InterruptedException -> L18
            if (r5 != 0) goto L21
            r4.dispose()     // Catch: java.lang.InterruptedException -> L18
            r5 = 0
            return r5
        L18:
            r5 = move-exception
            r4.dispose()
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
        L21:
            java.lang.Throwable r5 = r4.error
            if (r5 != 0) goto L27
            r5 = 1
            return r5
        L27:
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
    }

    public T blockingGet() {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L11
            r4.await()     // Catch: java.lang.InterruptedException -> L11
            goto L1a
        L11:
            r0 = move-exception
            r4.dispose()
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
        L1a:
            java.lang.Throwable r0 = r4.error
            if (r0 != 0) goto L21
            T r0 = r4.value
            return r0
        L21:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    public T blockingGet(T r5) {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L11
            r4.await()     // Catch: java.lang.InterruptedException -> L11
            goto L1a
        L11:
            r5 = move-exception
            r4.dispose()
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
        L1a:
            java.lang.Throwable r0 = r4.error
            if (r0 != 0) goto L24
            T r0 = r4.value
            if (r0 == 0) goto L23
            r5 = r0
        L23:
            return r5
        L24:
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r5
    }

    public java.lang.Throwable blockingGetError() {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L11
            r4.await()     // Catch: java.lang.InterruptedException -> L11
            goto L16
        L11:
            r0 = move-exception
            r4.dispose()
            return r0
        L16:
            java.lang.Throwable r0 = r4.error
            return r0
    }

    public java.lang.Throwable blockingGetError(long r5, java.util.concurrent.TimeUnit r7) {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2a
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L21
            boolean r5 = r4.await(r5, r7)     // Catch: java.lang.InterruptedException -> L21
            if (r5 == 0) goto L14
            goto L2a
        L14:
            r4.dispose()     // Catch: java.lang.InterruptedException -> L21
            java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException     // Catch: java.lang.InterruptedException -> L21
            r5.<init>()     // Catch: java.lang.InterruptedException -> L21
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)     // Catch: java.lang.InterruptedException -> L21
            throw r5     // Catch: java.lang.InterruptedException -> L21
        L21:
            r5 = move-exception
            r4.dispose()
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
        L2a:
            java.lang.Throwable r5 = r4.error
            return r5
    }

    void dispose() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            io.reactivex.disposables.Disposable r0 = r1.f178d
            if (r0 == 0) goto La
            r0.dispose()
        La:
            return
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r0 = this;
            r0.countDown()
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable r1) {
            r0 = this;
            r0.error = r1
            r0.countDown()
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            r1.f178d = r2
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            r2.dispose()
        L9:
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T r1) {
            r0 = this;
            r0.value = r1
            r0.countDown()
            return
    }
}
