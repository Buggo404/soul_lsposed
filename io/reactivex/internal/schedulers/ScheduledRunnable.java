package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class ScheduledRunnable extends java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> implements java.lang.Runnable, java.util.concurrent.Callable<java.lang.Object>, io.reactivex.disposables.Disposable {
    static final java.lang.Object ASYNC_DISPOSED = null;
    static final java.lang.Object DONE = null;
    static final int FUTURE_INDEX = 1;
    static final java.lang.Object PARENT_DISPOSED = null;
    static final int PARENT_INDEX = 0;
    static final java.lang.Object SYNC_DISPOSED = null;
    static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    final java.lang.Runnable actual;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.schedulers.ScheduledRunnable.PARENT_DISPOSED = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.schedulers.ScheduledRunnable.SYNC_DISPOSED = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.schedulers.ScheduledRunnable.ASYNC_DISPOSED = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.schedulers.ScheduledRunnable.DONE = r0
            return
    }

    public ScheduledRunnable(java.lang.Runnable r2, io.reactivex.internal.disposables.DisposableContainer r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r1.actual = r2
            r2 = 0
            r1.lazySet(r2, r3)
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
            r1 = this;
            r1.run()
            r0 = 0
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r7 = this;
        L0:
            r0 = 1
            java.lang.Object r1 = r7.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            r3 = 0
            if (r1 == r2) goto L31
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.SYNC_DISPOSED
            if (r1 == r2) goto L31
            java.lang.Object r4 = io.reactivex.internal.schedulers.ScheduledRunnable.ASYNC_DISPOSED
            if (r1 != r4) goto L13
            goto L31
        L13:
            r5 = 2
            java.lang.Object r5 = r7.get(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r5 == r6) goto L20
            r5 = r0
            goto L21
        L20:
            r5 = r3
        L21:
            if (r5 == 0) goto L24
            r2 = r4
        L24:
            boolean r0 = r7.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L0
            if (r1 == 0) goto L31
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r5)
        L31:
            java.lang.Object r0 = r7.get(r3)
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r0 == r1) goto L4b
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.PARENT_DISPOSED
            if (r0 == r1) goto L4b
            if (r0 != 0) goto L40
            goto L4b
        L40:
            boolean r1 = r7.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L31
            io.reactivex.internal.disposables.DisposableContainer r0 = (io.reactivex.internal.disposables.DisposableContainer) r0
            r0.delete(r7)
        L4b:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.PARENT_DISPOSED
            if (r1 == r2) goto Ld
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r1 != r2) goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 2
            r5.lazySet(r1, r0)
            r0 = 0
            r2 = 1
            r3 = 0
            java.lang.Runnable r4 = r5.actual     // Catch: java.lang.Throwable -> L11
            r4.run()     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r4 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r4)     // Catch: java.lang.Throwable -> L44
        L15:
            r5.lazySet(r1, r0)
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.PARENT_DISPOSED
            if (r0 == r1) goto L2f
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L2f
            if (r0 == 0) goto L2f
            io.reactivex.internal.disposables.DisposableContainer r0 = (io.reactivex.internal.disposables.DisposableContainer) r0
            r0.delete(r5)
        L2f:
            java.lang.Object r0 = r5.get(r2)
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.SYNC_DISPOSED
            if (r0 == r1) goto L43
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.ASYNC_DISPOSED
            if (r0 == r1) goto L43
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r0 = r5.compareAndSet(r2, r0, r1)
            if (r0 == 0) goto L2f
        L43:
            return
        L44:
            r4 = move-exception
            r5.lazySet(r1, r0)
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.PARENT_DISPOSED
            if (r0 == r1) goto L5f
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L5f
            if (r0 == 0) goto L5f
            io.reactivex.internal.disposables.DisposableContainer r0 = (io.reactivex.internal.disposables.DisposableContainer) r0
            r0.delete(r5)
        L5f:
            java.lang.Object r0 = r5.get(r2)
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.SYNC_DISPOSED
            if (r0 == r1) goto L74
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.ASYNC_DISPOSED
            if (r0 == r1) goto L74
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r0 = r5.compareAndSet(r2, r0, r1)
            if (r0 != 0) goto L74
            goto L5f
        L74:
            throw r4
    }

    public void setFuture(java.util.concurrent.Future<?> r4) {
            r3 = this;
        L0:
            r0 = 1
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r1 != r2) goto La
            return
        La:
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.SYNC_DISPOSED
            if (r1 != r2) goto L13
            r0 = 0
            r4.cancel(r0)
            return
        L13:
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.ASYNC_DISPOSED
            if (r1 != r2) goto L1b
            r4.cancel(r0)
            return
        L1b:
            boolean r0 = r3.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L0
            return
    }
}
