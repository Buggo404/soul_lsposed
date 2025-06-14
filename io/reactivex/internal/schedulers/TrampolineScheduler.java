package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class TrampolineScheduler extends io.reactivex.Scheduler {
    private static final io.reactivex.internal.schedulers.TrampolineScheduler INSTANCE = null;

    static final class SleepingRunnable implements java.lang.Runnable {
        private final long execTime;
        private final java.lang.Runnable run;
        private final io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker worker;

        SleepingRunnable(java.lang.Runnable r1, io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.run = r1
                r0.worker = r2
                r0.execTime = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker r0 = r5.worker
                boolean r0 = r0.disposed
                if (r0 != 0) goto L30
                io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker r0 = r5.worker
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r0.now(r1)
                long r2 = r5.execTime
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L25
                long r2 = r2 - r0
                java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L19
                goto L25
            L19:
                r0 = move-exception
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
                return
            L25:
                io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker r0 = r5.worker
                boolean r0 = r0.disposed
                if (r0 != 0) goto L30
                java.lang.Runnable r0 = r5.run
                r0.run()
            L30:
                return
        }
    }

    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable> {
        final int count;
        volatile boolean disposed;
        final long execTime;
        final java.lang.Runnable run;

        TimedRunnable(java.lang.Runnable r1, java.lang.Long r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.run = r1
                long r1 = r2.longValue()
                r0.execTime = r1
                r0.count = r3
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable r5) {
                r4 = this;
                long r0 = r4.execTime
                long r2 = r5.execTime
                int r0 = io.reactivex.internal.functions.ObjectHelper.compare(r0, r2)
                if (r0 != 0) goto L13
                int r0 = r4.count
                int r5 = r5.count
                int r5 = io.reactivex.internal.functions.ObjectHelper.compare(r0, r5)
                return r5
            L13:
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable r1) {
                r0 = this;
                io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable r1 = (io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    static final class TrampolineWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
        final java.util.concurrent.atomic.AtomicInteger counter;
        volatile boolean disposed;
        final java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable> queue;
        private final java.util.concurrent.atomic.AtomicInteger wip;

        final class AppendToQueueTask implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker this$0;
            final io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable;

            AppendToQueueTask(io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker r1, io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.timedRunnable = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable r0 = r2.timedRunnable
                    r1 = 1
                    r0.disposed = r1
                    io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker r0 = r2.this$0
                    java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable> r0 = r0.queue
                    io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable r1 = r2.timedRunnable
                    r0.remove(r1)
                    return
            }
        }

        TrampolineWorker() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
                r0.<init>()
                r1.queue = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.wip = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.counter = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                return
        }

        io.reactivex.disposables.Disposable enqueue(java.lang.Runnable r2, long r3) {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r2 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r2
            L7:
                io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable r0 = new io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.util.concurrent.atomic.AtomicInteger r4 = r1.counter
                int r4 = r4.incrementAndGet()
                r0.<init>(r2, r3, r4)
                java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable> r2 = r1.queue
                r2.add(r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.wip
                int r2 = r2.getAndIncrement()
                if (r2 != 0) goto L50
                r2 = 1
            L24:
                boolean r3 = r1.disposed
                if (r3 == 0) goto L30
                java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable> r2 = r1.queue
                r2.clear()
                io.reactivex.internal.disposables.EmptyDisposable r2 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r2
            L30:
                java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable> r3 = r1.queue
                java.lang.Object r3 = r3.poll()
                io.reactivex.internal.schedulers.TrampolineScheduler$TimedRunnable r3 = (io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable) r3
                if (r3 != 0) goto L46
                java.util.concurrent.atomic.AtomicInteger r3 = r1.wip
                int r2 = -r2
                int r2 = r3.addAndGet(r2)
                if (r2 != 0) goto L24
                io.reactivex.internal.disposables.EmptyDisposable r2 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r2
            L46:
                boolean r4 = r3.disposed
                if (r4 != 0) goto L24
                java.lang.Runnable r3 = r3.run
                r3.run()
                goto L24
            L50:
                io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker$AppendToQueueTask r2 = new io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker$AppendToQueueTask
                r2.<init>(r1, r0)
                io.reactivex.disposables.Disposable r2 = io.reactivex.disposables.Disposables.fromRunnable(r2)
                return r2
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r3) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r2.now(r0)
                io.reactivex.disposables.Disposable r3 = r2.enqueue(r3, r0)
                return r3
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r2.now(r0)
                long r4 = r6.toMillis(r4)
                long r0 = r0 + r4
                io.reactivex.internal.schedulers.TrampolineScheduler$SleepingRunnable r4 = new io.reactivex.internal.schedulers.TrampolineScheduler$SleepingRunnable
                r4.<init>(r3, r2, r0)
                io.reactivex.disposables.Disposable r3 = r2.enqueue(r4, r0)
                return r3
        }
    }

    static {
            io.reactivex.internal.schedulers.TrampolineScheduler r0 = new io.reactivex.internal.schedulers.TrampolineScheduler
            r0.<init>()
            io.reactivex.internal.schedulers.TrampolineScheduler.INSTANCE = r0
            return
    }

    TrampolineScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.reactivex.internal.schedulers.TrampolineScheduler instance() {
            io.reactivex.internal.schedulers.TrampolineScheduler r0 = io.reactivex.internal.schedulers.TrampolineScheduler.INSTANCE
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r1 = this;
            io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker r0 = new io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker
            r0.<init>()
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r1) {
            r0 = this;
            java.lang.Runnable r1 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r1)
            r1.run()
            io.reactivex.internal.disposables.EmptyDisposable r1 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r1
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r4.sleep(r2)     // Catch: java.lang.InterruptedException -> Lb
            java.lang.Runnable r1 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r1)     // Catch: java.lang.InterruptedException -> Lb
            r1.run()     // Catch: java.lang.InterruptedException -> Lb
            goto L16
        Lb:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L16:
            io.reactivex.internal.disposables.EmptyDisposable r1 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r1
    }
}
