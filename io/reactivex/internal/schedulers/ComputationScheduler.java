package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class ComputationScheduler extends io.reactivex.Scheduler implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport {
    private static final java.lang.String KEY_COMPUTATION_PRIORITY = "rx2.computation-priority";
    static final java.lang.String KEY_MAX_THREADS = "rx2.computation-threads";
    static final int MAX_THREADS = 0;
    static final io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool NONE = null;
    static final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker SHUTDOWN_WORKER = null;
    static final io.reactivex.internal.schedulers.RxThreadFactory THREAD_FACTORY = null;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxComputationThreadPool";
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool> pool;
    final java.util.concurrent.ThreadFactory threadFactory;

    static final class EventLoopWorker extends io.reactivex.Scheduler.Worker {
        private final io.reactivex.internal.disposables.ListCompositeDisposable both;
        volatile boolean disposed;
        private final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker;
        private final io.reactivex.internal.disposables.ListCompositeDisposable serial;
        private final io.reactivex.disposables.CompositeDisposable timed;

        EventLoopWorker(io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker r3) {
                r2 = this;
                r2.<init>()
                r2.poolWorker = r3
                io.reactivex.internal.disposables.ListCompositeDisposable r3 = new io.reactivex.internal.disposables.ListCompositeDisposable
                r3.<init>()
                r2.serial = r3
                io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
                r0.<init>()
                r2.timed = r0
                io.reactivex.internal.disposables.ListCompositeDisposable r1 = new io.reactivex.internal.disposables.ListCompositeDisposable
                r1.<init>()
                r2.both = r1
                r1.add(r3)
                r1.add(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 != 0) goto Lc
                r0 = 1
                r1.disposed = r0
                io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.both
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
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r7) {
                r6 = this;
                boolean r0 = r6.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r7 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r7
            L7:
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r0 = r6.poolWorker
                r2 = 0
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                io.reactivex.internal.disposables.ListCompositeDisposable r5 = r6.serial
                r1 = r7
                io.reactivex.internal.schedulers.ScheduledRunnable r7 = r0.scheduleActual(r1, r2, r4, r5)
                return r7
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r7, long r8, java.util.concurrent.TimeUnit r10) {
                r6 = this;
                boolean r0 = r6.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r7 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r7
            L7:
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r0 = r6.poolWorker
                io.reactivex.disposables.CompositeDisposable r5 = r6.timed
                r1 = r7
                r2 = r8
                r4 = r10
                io.reactivex.internal.schedulers.ScheduledRunnable r7 = r0.scheduleActual(r1, r2, r4, r5)
                return r7
        }
    }

    static final class FixedSchedulerPool implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport {
        final int cores;
        final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[] eventLoops;

        /* renamed from: n */
        long f520n;

        FixedSchedulerPool(int r4, java.util.concurrent.ThreadFactory r5) {
                r3 = this;
                r3.<init>()
                r3.cores = r4
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker[] r0 = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[r4]
                r3.eventLoops = r0
                r0 = 0
            La:
                if (r0 >= r4) goto L18
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker[] r1 = r3.eventLoops
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r2 = new io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker
                r2.<init>(r5)
                r1[r0] = r2
                int r0 = r0 + 1
                goto La
            L18:
                return
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int r7, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback r8) {
                r6 = this;
                int r0 = r6.cores
                r1 = 0
                if (r0 != 0) goto Lf
            L5:
                if (r1 >= r7) goto L2d
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r0 = io.reactivex.internal.schedulers.ComputationScheduler.SHUTDOWN_WORKER
                r8.onWorker(r1, r0)
                int r1 = r1 + 1
                goto L5
            Lf:
                long r2 = r6.f520n
                int r2 = (int) r2
                int r2 = r2 % r0
                r3 = r1
            L14:
                if (r3 >= r7) goto L2a
                io.reactivex.internal.schedulers.ComputationScheduler$EventLoopWorker r4 = new io.reactivex.internal.schedulers.ComputationScheduler$EventLoopWorker
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker[] r5 = r6.eventLoops
                r5 = r5[r2]
                r4.<init>(r5)
                r8.onWorker(r3, r4)
                int r2 = r2 + 1
                if (r2 != r0) goto L27
                r2 = r1
            L27:
                int r3 = r3 + 1
                goto L14
            L2a:
                long r7 = (long) r2
                r6.f520n = r7
            L2d:
                return
        }

        public io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker getEventLoop() {
                r6 = this;
                int r0 = r6.cores
                if (r0 != 0) goto L7
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r0 = io.reactivex.internal.schedulers.ComputationScheduler.SHUTDOWN_WORKER
                return r0
            L7:
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker[] r1 = r6.eventLoops
                long r2 = r6.f520n
                r4 = 1
                long r4 = r4 + r2
                r6.f520n = r4
                long r4 = (long) r0
                long r2 = r2 % r4
                int r0 = (int) r2
                r0 = r1[r0]
                return r0
        }

        public void shutdown() {
                r4 = this;
                io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker[] r0 = r4.eventLoops
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }
    }

    static final class PoolWorker extends io.reactivex.internal.schedulers.NewThreadWorker {
        PoolWorker(java.util.concurrent.ThreadFactory r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            java.lang.String r1 = "rx2.computation-threads"
            r2 = 0
            java.lang.Integer r1 = java.lang.Integer.getInteger(r1, r2)
            int r1 = r1.intValue()
            int r0 = cap(r0, r1)
            io.reactivex.internal.schedulers.ComputationScheduler.MAX_THREADS = r0
            io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r0 = new io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r3 = "RxComputationShutdown"
            r1.<init>(r3)
            r0.<init>(r1)
            io.reactivex.internal.schedulers.ComputationScheduler.SHUTDOWN_WORKER = r0
            r0.dispose()
            java.lang.String r0 = "rx2.computation-priority"
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 10
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.internal.schedulers.RxThreadFactory r3 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r4 = "RxComputationThreadPool"
            r3.<init>(r4, r0, r1)
            io.reactivex.internal.schedulers.ComputationScheduler.THREAD_FACTORY = r3
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = new io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool
            r0.<init>(r2, r3)
            io.reactivex.internal.schedulers.ComputationScheduler.NONE = r0
            r0.shutdown()
            return
    }

    public ComputationScheduler() {
            r1 = this;
            io.reactivex.internal.schedulers.RxThreadFactory r0 = io.reactivex.internal.schedulers.ComputationScheduler.THREAD_FACTORY
            r1.<init>(r0)
            return
    }

    public ComputationScheduler(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            r1.threadFactory = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = io.reactivex.internal.schedulers.ComputationScheduler.NONE
            r2.<init>(r0)
            r1.pool = r2
            r1.start()
            return
    }

    static int cap(int r0, int r1) {
            if (r1 <= 0) goto L6
            if (r1 <= r0) goto L5
            goto L6
        L5:
            r0 = r1
        L6:
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.ComputationScheduler$EventLoopWorker r0 = new io.reactivex.internal.schedulers.ComputationScheduler$EventLoopWorker
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r1 = r2.pool
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r1 = (io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool) r1
            io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r1 = r1.getEventLoop()
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int r2, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback r3) {
            r1 = this;
            java.lang.String r0 = "number > 0 required"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r0 = r1.pool
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = (io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool) r0
            r0.createWorkers(r2, r3)
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r0 = r1.pool
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = (io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool) r0
            io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r0 = r0.getEventLoop()
            io.reactivex.disposables.Disposable r2 = r0.scheduleDirect(r2, r3, r5)
            return r2
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r0 = r8.pool
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = (io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool) r0
            io.reactivex.internal.schedulers.ComputationScheduler$PoolWorker r1 = r0.getEventLoop()
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            io.reactivex.disposables.Disposable r9 = r1.schedulePeriodicallyDirect(r2, r3, r5, r7)
            return r9
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r0 = r3.pool
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = (io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool) r0
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r1 = io.reactivex.internal.schedulers.ComputationScheduler.NONE
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r2 = r3.pool
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r1 == 0) goto L0
            r0.shutdown()
            return
    }

    @Override // io.reactivex.Scheduler
    public void start() {
            r3 = this;
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r0 = new io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool
            int r1 = io.reactivex.internal.schedulers.ComputationScheduler.MAX_THREADS
            java.util.concurrent.ThreadFactory r2 = r3.threadFactory
            r0.<init>(r1, r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool> r1 = r3.pool
            io.reactivex.internal.schedulers.ComputationScheduler$FixedSchedulerPool r2 = io.reactivex.internal.schedulers.ComputationScheduler.NONE
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r2, r0)
            if (r1 != 0) goto L16
            r0.shutdown()
        L16:
            return
    }
}
