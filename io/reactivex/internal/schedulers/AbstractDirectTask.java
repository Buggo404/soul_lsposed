package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
abstract class AbstractDirectTask extends java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> implements io.reactivex.disposables.Disposable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
    protected static final java.util.concurrent.FutureTask<java.lang.Void> DISPOSED = null;
    protected static final java.util.concurrent.FutureTask<java.lang.Void> FINISHED = null;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final java.lang.Runnable runnable;
    protected java.lang.Thread runner;

    static {
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            java.lang.Runnable r1 = io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.schedulers.AbstractDirectTask.FINISHED = r0
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            java.lang.Runnable r1 = io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE
            r0.<init>(r1, r2)
            io.reactivex.internal.schedulers.AbstractDirectTask.DISPOSED = r0
            return
    }

    AbstractDirectTask(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.runnable = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r3 = this;
            java.lang.Object r0 = r3.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.AbstractDirectTask.FINISHED
            if (r0 == r1) goto L24
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.AbstractDirectTask.DISPOSED
            if (r0 == r1) goto L24
            boolean r1 = r3.compareAndSet(r0, r1)
            if (r1 == 0) goto L24
            if (r0 == 0) goto L24
            java.lang.Thread r1 = r3.runner
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 == r2) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            r0.cancel(r1)
        L24:
            return
    }

    @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public java.lang.Runnable getWrappedRunnable() {
            r1 = this;
            java.lang.Runnable r0 = r1.runnable
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.AbstractDirectTask.FINISHED
            if (r0 == r1) goto L11
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.AbstractDirectTask.DISPOSED
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    public final void setFuture(java.util.concurrent.Future<?> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.AbstractDirectTask.FINISHED
            if (r0 != r1) goto Lb
            goto L24
        Lb:
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.AbstractDirectTask.DISPOSED
            if (r0 != r1) goto L1e
            java.lang.Thread r0 = r2.runner
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r3.cancel(r0)
            goto L24
        L1e:
            boolean r0 = r2.compareAndSet(r0, r3)
            if (r0 == 0) goto L0
        L24:
            return
    }
}
