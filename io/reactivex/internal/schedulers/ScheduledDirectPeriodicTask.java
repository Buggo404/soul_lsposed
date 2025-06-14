package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class ScheduledDirectPeriodicTask extends io.reactivex.internal.schedulers.AbstractDirectTask implements java.lang.Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, io.reactivex.schedulers.SchedulerRunnableIntrospection
    public /* bridge */ /* synthetic */ java.lang.Runnable getWrappedRunnable() {
            r1 = this;
            java.lang.Runnable r0 = super.getWrappedRunnable()
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r2.runner = r0
            r0 = 0
            java.lang.Runnable r1 = r2.runnable     // Catch: java.lang.Throwable -> Lf
            r1.run()     // Catch: java.lang.Throwable -> Lf
            r2.runner = r0     // Catch: java.lang.Throwable -> Lf
            goto L1a
        Lf:
            r1 = move-exception
            r2.runner = r0
            java.util.concurrent.FutureTask<java.lang.Void> r0 = io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask.FINISHED
            r2.lazySet(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L1a:
            return
    }
}
