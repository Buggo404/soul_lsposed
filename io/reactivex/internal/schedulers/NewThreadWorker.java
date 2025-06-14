package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public class NewThreadWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
    volatile boolean disposed;
    private final java.util.concurrent.ScheduledExecutorService executor;

    public NewThreadWorker(java.util.concurrent.ThreadFactory r1) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ScheduledExecutorService r1 = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(r1)
            r0.executor = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            boolean r0 = r1.disposed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.disposed = r0
            java.util.concurrent.ScheduledExecutorService r0 = r1.executor
            r0.shutdownNow()
        Lc:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.disposed
            return r0
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            io.reactivex.disposables.Disposable r4 = r3.schedule(r4, r0, r2)
            return r4
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            boolean r0 = r6.disposed
            if (r0 == 0) goto L7
            io.reactivex.internal.disposables.EmptyDisposable r7 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r7
        L7:
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.internal.schedulers.ScheduledRunnable r7 = r0.scheduleActual(r1, r2, r4, r5)
            return r7
    }

    public io.reactivex.internal.schedulers.ScheduledRunnable scheduleActual(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7, io.reactivex.internal.disposables.DisposableContainer r8) {
            r3 = this;
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            io.reactivex.internal.schedulers.ScheduledRunnable r0 = new io.reactivex.internal.schedulers.ScheduledRunnable
            r0.<init>(r4, r8)
            if (r8 == 0) goto L12
            boolean r4 = r8.add(r0)
            if (r4 != 0) goto L12
            return r0
        L12:
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L1f
            java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L29
            java.util.concurrent.Future r4 = r4.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L29
            goto L25
        L1f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L29
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L29
        L25:
            r0.setFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L29
            goto L32
        L29:
            r4 = move-exception
            if (r8 == 0) goto L2f
            r8.remove(r0)
        L2f:
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
        L32:
            return r0
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            io.reactivex.internal.schedulers.ScheduledDirectTask r0 = new io.reactivex.internal.schedulers.ScheduledDirectTask
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            r0.<init>(r4)
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L16
            java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            java.util.concurrent.Future r4 = r4.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            goto L1c
        L16:
            java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
        L1c:
            r0.setFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            return r0
        L20:
            r4 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r4
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            java.lang.Runnable r9 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r9)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L2d
            io.reactivex.internal.schedulers.InstantPeriodicTask r12 = new io.reactivex.internal.schedulers.InstantPeriodicTask
            java.util.concurrent.ScheduledExecutorService r13 = r8.executor
            r12.<init>(r9, r13)
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 > 0) goto L1c
            java.util.concurrent.ScheduledExecutorService r9 = r8.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            goto L22
        L1c:
            java.util.concurrent.ScheduledExecutorService r9 = r8.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            java.util.concurrent.ScheduledFuture r9 = r9.schedule(r12, r10, r14)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
        L22:
            r12.setFirst(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            return r12
        L26:
            r9 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r9
        L2d:
            io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask r7 = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask
            r7.<init>(r9)
            java.util.concurrent.ScheduledExecutorService r0 = r8.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            r1 = r7
            r2 = r10
            r4 = r12
            r6 = r14
            java.util.concurrent.ScheduledFuture r9 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            r7.setFuture(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            return r7
        L40:
            r9 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r9
    }

    public void shutdown() {
            r1 = this;
            boolean r0 = r1.disposed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.disposed = r0
            java.util.concurrent.ScheduledExecutorService r0 = r1.executor
            r0.shutdown()
        Lc:
            return
    }
}
