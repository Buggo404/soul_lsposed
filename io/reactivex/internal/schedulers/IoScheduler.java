package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class IoScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.internal.schedulers.RxThreadFactory EVICTOR_THREAD_FACTORY = null;
    private static final java.lang.String EVICTOR_THREAD_NAME_PREFIX = "RxCachedWorkerPoolEvictor";
    private static final long KEEP_ALIVE_TIME = 60;
    private static final java.util.concurrent.TimeUnit KEEP_ALIVE_UNIT = null;
    private static final java.lang.String KEY_IO_PRIORITY = "rx2.io-priority";
    static final io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool NONE = null;
    static final io.reactivex.internal.schedulers.IoScheduler.ThreadWorker SHUTDOWN_THREAD_WORKER = null;
    static final io.reactivex.internal.schedulers.RxThreadFactory WORKER_THREAD_FACTORY = null;
    private static final java.lang.String WORKER_THREAD_NAME_PREFIX = "RxCachedThreadScheduler";
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool> pool;
    final java.util.concurrent.ThreadFactory threadFactory;

    static final class CachedWorkerPool implements java.lang.Runnable {
        final io.reactivex.disposables.CompositeDisposable allWorkers;
        private final java.util.concurrent.ScheduledExecutorService evictorService;
        private final java.util.concurrent.Future<?> evictorTask;
        private final java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler.ThreadWorker> expiringWorkerQueue;
        private final long keepAliveTime;
        private final java.util.concurrent.ThreadFactory threadFactory;

        CachedWorkerPool(long r8, java.util.concurrent.TimeUnit r10, java.util.concurrent.ThreadFactory r11) {
                r7 = this;
                r7.<init>()
                if (r10 == 0) goto La
                long r8 = r10.toNanos(r8)
                goto Lc
            La:
                r8 = 0
            Lc:
                r4 = r8
                r7.keepAliveTime = r4
                java.util.concurrent.ConcurrentLinkedQueue r8 = new java.util.concurrent.ConcurrentLinkedQueue
                r8.<init>()
                r7.expiringWorkerQueue = r8
                io.reactivex.disposables.CompositeDisposable r8 = new io.reactivex.disposables.CompositeDisposable
                r8.<init>()
                r7.allWorkers = r8
                r7.threadFactory = r11
                if (r10 == 0) goto L32
                r8 = 1
                io.reactivex.internal.schedulers.RxThreadFactory r9 = io.reactivex.internal.schedulers.IoScheduler.EVICTOR_THREAD_FACTORY
                java.util.concurrent.ScheduledExecutorService r8 = java.util.concurrent.Executors.newScheduledThreadPool(r8, r9)
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0 = r8
                r1 = r7
                r2 = r4
                java.util.concurrent.ScheduledFuture r9 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                goto L34
            L32:
                r8 = 0
                r9 = r8
            L34:
                r7.evictorService = r8
                r7.evictorTask = r9
                return
        }

        void evictExpiredWorkers() {
                r6 = this;
                java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler$ThreadWorker> r0 = r6.expiringWorkerQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L34
                long r0 = r6.now()
                java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler$ThreadWorker> r2 = r6.expiringWorkerQueue
                java.util.Iterator r2 = r2.iterator()
            L12:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L34
                java.lang.Object r3 = r2.next()
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r3 = (io.reactivex.internal.schedulers.IoScheduler.ThreadWorker) r3
                long r4 = r3.getExpirationTime()
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 > 0) goto L34
                java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler$ThreadWorker> r4 = r6.expiringWorkerQueue
                boolean r4 = r4.remove(r3)
                if (r4 == 0) goto L12
                io.reactivex.disposables.CompositeDisposable r4 = r6.allWorkers
                r4.remove(r3)
                goto L12
            L34:
                return
        }

        io.reactivex.internal.schedulers.IoScheduler.ThreadWorker get() {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.allWorkers
                boolean r0 = r0.isDisposed()
                if (r0 == 0) goto Lb
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r0 = io.reactivex.internal.schedulers.IoScheduler.SHUTDOWN_THREAD_WORKER
                return r0
            Lb:
                java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler$ThreadWorker> r0 = r2.expiringWorkerQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1e
                java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler$ThreadWorker> r0 = r2.expiringWorkerQueue
                java.lang.Object r0 = r0.poll()
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r0 = (io.reactivex.internal.schedulers.IoScheduler.ThreadWorker) r0
                if (r0 == 0) goto Lb
                return r0
            L1e:
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r0 = new io.reactivex.internal.schedulers.IoScheduler$ThreadWorker
                java.util.concurrent.ThreadFactory r1 = r2.threadFactory
                r0.<init>(r1)
                io.reactivex.disposables.CompositeDisposable r1 = r2.allWorkers
                r1.add(r0)
                return r0
        }

        long now() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        void release(io.reactivex.internal.schedulers.IoScheduler.ThreadWorker r5) {
                r4 = this;
                long r0 = r4.now()
                long r2 = r4.keepAliveTime
                long r0 = r0 + r2
                r5.setExpirationTime(r0)
                java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler$ThreadWorker> r0 = r4.expiringWorkerQueue
                r0.offer(r5)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                r0.evictExpiredWorkers()
                return
        }

        void shutdown() {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.allWorkers
                r0.dispose()
                java.util.concurrent.Future<?> r0 = r2.evictorTask
                if (r0 == 0) goto Ld
                r1 = 1
                r0.cancel(r1)
            Ld:
                java.util.concurrent.ScheduledExecutorService r0 = r2.evictorService
                if (r0 == 0) goto L14
                r0.shutdownNow()
            L14:
                return
        }
    }

    static final class EventLoopWorker extends io.reactivex.Scheduler.Worker {
        final java.util.concurrent.atomic.AtomicBoolean once;
        private final io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool pool;
        private final io.reactivex.disposables.CompositeDisposable tasks;
        private final io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker;

        EventLoopWorker(io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.once = r0
                r1.pool = r2
                io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
                r0.<init>()
                r1.tasks = r0
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r2 = r2.get()
                r1.threadWorker = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L16
                io.reactivex.disposables.CompositeDisposable r0 = r3.tasks
                r0.dispose()
                io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r0 = r3.pool
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r1 = r3.threadWorker
                r0.release(r1)
            L16:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.once
                boolean r0 = r0.get()
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r7, long r8, java.util.concurrent.TimeUnit r10) {
                r6 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r6.tasks
                boolean r0 = r0.isDisposed()
                if (r0 == 0) goto Lb
                io.reactivex.internal.disposables.EmptyDisposable r7 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r7
            Lb:
                io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r0 = r6.threadWorker
                io.reactivex.disposables.CompositeDisposable r5 = r6.tasks
                r1 = r7
                r2 = r8
                r4 = r10
                io.reactivex.internal.schedulers.ScheduledRunnable r7 = r0.scheduleActual(r1, r2, r4, r5)
                return r7
        }
    }

    static final class ThreadWorker extends io.reactivex.internal.schedulers.NewThreadWorker {
        private long expirationTime;

        ThreadWorker(java.util.concurrent.ThreadFactory r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.expirationTime = r0
                return
        }

        public long getExpirationTime() {
                r2 = this;
                long r0 = r2.expirationTime
                return r0
        }

        public void setExpirationTime(long r1) {
                r0 = this;
                r0.expirationTime = r1
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.internal.schedulers.IoScheduler.KEEP_ALIVE_UNIT = r0
            io.reactivex.internal.schedulers.IoScheduler$ThreadWorker r0 = new io.reactivex.internal.schedulers.IoScheduler$ThreadWorker
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r2 = "RxCachedThreadSchedulerShutdown"
            r1.<init>(r2)
            r0.<init>(r1)
            io.reactivex.internal.schedulers.IoScheduler.SHUTDOWN_THREAD_WORKER = r0
            r0.dispose()
            java.lang.String r0 = "rx2.io-priority"
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 10
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r2 = "RxCachedThreadScheduler"
            r1.<init>(r2, r0)
            io.reactivex.internal.schedulers.IoScheduler.WORKER_THREAD_FACTORY = r1
            io.reactivex.internal.schedulers.RxThreadFactory r2 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r3 = "RxCachedWorkerPoolEvictor"
            r2.<init>(r3, r0)
            io.reactivex.internal.schedulers.IoScheduler.EVICTOR_THREAD_FACTORY = r2
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r0 = new io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool
            r2 = 0
            r4 = 0
            r0.<init>(r2, r4, r1)
            io.reactivex.internal.schedulers.IoScheduler.NONE = r0
            r0.shutdown()
            return
    }

    public IoScheduler() {
            r1 = this;
            io.reactivex.internal.schedulers.RxThreadFactory r0 = io.reactivex.internal.schedulers.IoScheduler.WORKER_THREAD_FACTORY
            r1.<init>(r0)
            return
    }

    public IoScheduler(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            r1.threadFactory = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r0 = io.reactivex.internal.schedulers.IoScheduler.NONE
            r2.<init>(r0)
            r1.pool = r2
            r1.start()
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.IoScheduler$EventLoopWorker r0 = new io.reactivex.internal.schedulers.IoScheduler$EventLoopWorker
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool> r1 = r2.pool
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r1 = (io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool) r1
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool> r0 = r3.pool
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r0 = (io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool) r0
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r1 = io.reactivex.internal.schedulers.IoScheduler.NONE
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool> r2 = r3.pool
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r1 == 0) goto L0
            r0.shutdown()
            return
    }

    public int size() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool> r0 = r1.pool
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r0 = (io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool) r0
            io.reactivex.disposables.CompositeDisposable r0 = r0.allWorkers
            int r0 = r0.size()
            return r0
    }

    @Override // io.reactivex.Scheduler
    public void start() {
            r5 = this;
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r0 = new io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool
            java.util.concurrent.TimeUnit r1 = io.reactivex.internal.schedulers.IoScheduler.KEEP_ALIVE_UNIT
            java.util.concurrent.ThreadFactory r2 = r5.threadFactory
            r3 = 60
            r0.<init>(r3, r1, r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool> r1 = r5.pool
            io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool r2 = io.reactivex.internal.schedulers.IoScheduler.NONE
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r2, r0)
            if (r1 != 0) goto L18
            r0.shutdown()
        L18:
            return
    }
}
