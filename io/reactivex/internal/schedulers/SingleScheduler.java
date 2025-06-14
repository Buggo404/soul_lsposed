package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class SingleScheduler extends io.reactivex.Scheduler {
    private static final java.lang.String KEY_SINGLE_PRIORITY = "rx2.single-priority";
    static final java.util.concurrent.ScheduledExecutorService SHUTDOWN = null;
    static final io.reactivex.internal.schedulers.RxThreadFactory SINGLE_THREAD_FACTORY = null;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxSingleScheduler";
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> executor;
    final java.util.concurrent.ThreadFactory threadFactory;

    static final class ScheduledWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean disposed;
        final java.util.concurrent.ScheduledExecutorService executor;
        final io.reactivex.disposables.CompositeDisposable tasks;

        ScheduledWorker(java.util.concurrent.ScheduledExecutorService r1) {
                r0 = this;
                r0.<init>()
                r0.executor = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.tasks = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 != 0) goto Lc
                r0 = 1
                r1.disposed = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.tasks
                r0.dispose()
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
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
                r3 = this;
                boolean r0 = r3.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r4
            L7:
                java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
                io.reactivex.internal.schedulers.ScheduledRunnable r0 = new io.reactivex.internal.schedulers.ScheduledRunnable
                io.reactivex.disposables.CompositeDisposable r1 = r3.tasks
                r0.<init>(r4, r1)
                io.reactivex.disposables.CompositeDisposable r4 = r3.tasks
                r4.add(r0)
                r1 = 0
                int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r4 > 0) goto L24
                java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
                java.util.concurrent.Future r4 = r4.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
                goto L2a
            L24:
                java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
                java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
            L2a:
                r0.setFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
                return r0
            L2e:
                r4 = move-exception
                r3.dispose()
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r4
        }
    }

    static {
            r0 = 0
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            io.reactivex.internal.schedulers.SingleScheduler.SHUTDOWN = r0
            r0.shutdown()
            java.lang.String r0 = "rx2.single-priority"
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 10
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.internal.schedulers.RxThreadFactory r2 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r3 = "RxSingleScheduler"
            r2.<init>(r3, r0, r1)
            io.reactivex.internal.schedulers.SingleScheduler.SINGLE_THREAD_FACTORY = r2
            return
    }

    public SingleScheduler() {
            r1 = this;
            io.reactivex.internal.schedulers.RxThreadFactory r0 = io.reactivex.internal.schedulers.SingleScheduler.SINGLE_THREAD_FACTORY
            r1.<init>(r0)
            return
    }

    public SingleScheduler(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.executor = r0
            r1.threadFactory = r2
            java.util.concurrent.ScheduledExecutorService r2 = createExecutor(r2)
            r0.lazySet(r2)
            return
    }

    static java.util.concurrent.ScheduledExecutorService createExecutor(java.util.concurrent.ThreadFactory r0) {
            java.util.concurrent.ScheduledExecutorService r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(r0)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.SingleScheduler$ScheduledWorker r0 = new io.reactivex.internal.schedulers.SingleScheduler$ScheduledWorker
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r1 = r2.executor
            java.lang.Object r1 = r1.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            io.reactivex.internal.schedulers.ScheduledDirectTask r0 = new io.reactivex.internal.schedulers.ScheduledDirectTask
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            r0.<init>(r4)
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L1c
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            java.util.concurrent.Future r4 = r4.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            goto L28
        L1c:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
        L28:
            r0.setFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L2c
            return r0
        L2c:
            r4 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r4
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            java.lang.Runnable r9 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r9)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L2f
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r12 = r8.executor
            java.lang.Object r12 = r12.get()
            java.util.concurrent.ScheduledExecutorService r12 = (java.util.concurrent.ScheduledExecutorService) r12
            io.reactivex.internal.schedulers.InstantPeriodicTask r13 = new io.reactivex.internal.schedulers.InstantPeriodicTask
            r13.<init>(r9, r12)
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 > 0) goto L20
            java.util.concurrent.Future r9 = r12.submit(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L28
            goto L24
        L20:
            java.util.concurrent.ScheduledFuture r9 = r12.schedule(r13, r10, r14)     // Catch: java.util.concurrent.RejectedExecutionException -> L28
        L24:
            r13.setFirst(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L28
            return r13
        L28:
            r9 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r9
        L2f:
            io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask r7 = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask
            r7.<init>(r9)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r9 = r8.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L49
            java.lang.Object r9 = r9.get()     // Catch: java.util.concurrent.RejectedExecutionException -> L49
            r0 = r9
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch: java.util.concurrent.RejectedExecutionException -> L49
            r1 = r7
            r2 = r10
            r4 = r12
            r6 = r14
            java.util.concurrent.ScheduledFuture r9 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L49
            r7.setFuture(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L49
            return r7
        L49:
            r9 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r9
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = r2.executor
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            java.util.concurrent.ScheduledExecutorService r1 = io.reactivex.internal.schedulers.SingleScheduler.SHUTDOWN
            if (r0 == r1) goto L19
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = r2.executor
            java.lang.Object r0 = r0.getAndSet(r1)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == r1) goto L19
            r0.shutdownNow()
        L19:
            return
    }

    @Override // io.reactivex.Scheduler
    public void start() {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r1 = r3.executor
            java.lang.Object r1 = r1.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            java.util.concurrent.ScheduledExecutorService r2 = io.reactivex.internal.schedulers.SingleScheduler.SHUTDOWN
            if (r1 == r2) goto L13
            if (r0 == 0) goto L12
            r0.shutdown()
        L12:
            return
        L13:
            if (r0 != 0) goto L1b
            java.util.concurrent.ThreadFactory r0 = r3.threadFactory
            java.util.concurrent.ScheduledExecutorService r0 = createExecutor(r0)
        L1b:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r2 = r3.executor
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r1, r0)
            if (r1 == 0) goto L1
            return
    }
}
