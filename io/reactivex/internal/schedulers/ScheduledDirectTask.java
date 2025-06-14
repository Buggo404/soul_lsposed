package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class ScheduledDirectTask extends io.reactivex.internal.schedulers.AbstractDirectTask implements java.util.concurrent.Callable<java.lang.Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectTask(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
            r1 = this;
            java.lang.Void r0 = r1.call2()
            return r0
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: call, reason: avoid collision after fix types in other method */
    public java.lang.Void call2() throws java.lang.Exception {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r3.runner = r0
            r0 = 0
            java.lang.Runnable r1 = r3.runnable     // Catch: java.lang.Throwable -> L14
            r1.run()     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.ScheduledDirectTask.FINISHED
            r3.lazySet(r1)
            r3.runner = r0
            return r0
        L14:
            r1 = move-exception
            java.util.concurrent.FutureTask<java.lang.Void> r2 = io.reactivex.internal.schedulers.ScheduledDirectTask.FINISHED
            r3.lazySet(r2)
            r3.runner = r0
            throw r1
    }

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, io.reactivex.schedulers.SchedulerRunnableIntrospection
    public /* bridge */ /* synthetic */ java.lang.Runnable getWrappedRunnable() {
            r1 = this;
            java.lang.Runnable r0 = super.getWrappedRunnable()
            return r0
    }
}
