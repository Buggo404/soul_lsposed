package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public abstract class BlockingBaseObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    volatile boolean cancelled;

    /* renamed from: d */
    io.reactivex.disposables.Disposable f177d;
    java.lang.Throwable error;
    T value;

    public BlockingBaseObserver() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public final T blockingGet() {
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

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            io.reactivex.disposables.Disposable r0 = r1.f177d
            if (r0 == 0) goto La
            r0.dispose()
        La:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
            r0 = this;
            r0.countDown()
            return
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            r1.f177d = r2
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            r2.dispose()
        L9:
            return
    }
}
