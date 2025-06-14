package io.reactivex;

/* loaded from: classes.dex */
public abstract class Scheduler {
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = 0;

    static final class DisposeTask implements io.reactivex.disposables.Disposable, java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        final java.lang.Runnable decoratedRun;
        java.lang.Thread runner;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f164w;

        DisposeTask(java.lang.Runnable r1, io.reactivex.Scheduler.Worker r2) {
                r0 = this;
                r0.<init>()
                r0.decoratedRun = r1
                r0.f164w = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                java.lang.Thread r0 = r2.runner
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                if (r0 != r1) goto L14
                io.reactivex.Scheduler$Worker r0 = r2.f164w
                boolean r1 = r0 instanceof io.reactivex.internal.schedulers.NewThreadWorker
                if (r1 == 0) goto L14
                io.reactivex.internal.schedulers.NewThreadWorker r0 = (io.reactivex.internal.schedulers.NewThreadWorker) r0
                r0.shutdown()
                goto L19
            L14:
                io.reactivex.Scheduler$Worker r0 = r2.f164w
                r0.dispose()
            L19:
                return
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public java.lang.Runnable getWrappedRunnable() {
                r1 = this;
                java.lang.Runnable r0 = r1.decoratedRun
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.f164w
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r2.runner = r0
                r0 = 0
                java.lang.Runnable r1 = r2.decoratedRun     // Catch: java.lang.Throwable -> L12
                r1.run()     // Catch: java.lang.Throwable -> L12
                r2.dispose()
                r2.runner = r0
                return
            L12:
                r1 = move-exception
                r2.dispose()
                r2.runner = r0
                throw r1
        }
    }

    static final class PeriodicDirectTask implements io.reactivex.disposables.Disposable, java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        volatile boolean disposed;
        final java.lang.Runnable run;
        final io.reactivex.Scheduler.Worker worker;

        PeriodicDirectTask(java.lang.Runnable r1, io.reactivex.Scheduler.Worker r2) {
                r0 = this;
                r0.<init>()
                r0.run = r1
                r0.worker = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public java.lang.Runnable getWrappedRunnable() {
                r1 = this;
                java.lang.Runnable r0 = r1.run
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.disposed
                if (r0 != 0) goto L18
                java.lang.Runnable r0 = r2.run     // Catch: java.lang.Throwable -> La
                r0.run()     // Catch: java.lang.Throwable -> La
                goto L18
            La:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r2.worker
                r1.dispose()
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L18:
                return
        }
    }

    public static abstract class Worker implements io.reactivex.disposables.Disposable {

        final class PeriodicTask implements java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
            long count;
            final java.lang.Runnable decoratedRun;
            long lastNowNanoseconds;
            final long periodInNanoseconds;

            /* renamed from: sd */
            final io.reactivex.internal.disposables.SequentialDisposable f165sd;
            long startInNanoseconds;
            final /* synthetic */ io.reactivex.Scheduler.Worker this$0;

            PeriodicTask(io.reactivex.Scheduler.Worker r1, long r2, java.lang.Runnable r4, long r5, io.reactivex.internal.disposables.SequentialDisposable r7, long r8) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.decoratedRun = r4
                    r0.f165sd = r7
                    r0.periodInNanoseconds = r8
                    r0.lastNowNanoseconds = r5
                    r0.startInNanoseconds = r2
                    return
            }

            @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
            public java.lang.Runnable getWrappedRunnable() {
                    r1 = this;
                    java.lang.Runnable r0 = r1.decoratedRun
                    return r0
            }

            @Override // java.lang.Runnable
            public void run() {
                    r10 = this;
                    java.lang.Runnable r0 = r10.decoratedRun
                    r0.run()
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r10.f165sd
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L56
                    io.reactivex.Scheduler$Worker r0 = r10.this$0
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r0 = r0.now(r1)
                    long r2 = io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS
                    long r2 = r2 + r0
                    long r4 = r10.lastNowNanoseconds
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    r6 = 1
                    if (r2 < 0) goto L37
                    long r2 = r10.periodInNanoseconds
                    long r4 = r4 + r2
                    long r2 = io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS
                    long r4 = r4 + r2
                    int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r2 < 0) goto L2b
                    goto L37
                L2b:
                    long r2 = r10.startInNanoseconds
                    long r4 = r10.count
                    long r4 = r4 + r6
                    r10.count = r4
                    long r6 = r10.periodInNanoseconds
                    long r4 = r4 * r6
                    long r2 = r2 + r4
                    goto L46
                L37:
                    long r2 = r10.periodInNanoseconds
                    long r4 = r0 + r2
                    long r8 = r10.count
                    long r8 = r8 + r6
                    r10.count = r8
                    long r2 = r2 * r8
                    long r2 = r4 - r2
                    r10.startInNanoseconds = r2
                    r2 = r4
                L46:
                    r10.lastNowNanoseconds = r0
                    long r2 = r2 - r0
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r10.f165sd
                    io.reactivex.Scheduler$Worker r1 = r10.this$0
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                    io.reactivex.disposables.Disposable r1 = r1.schedule(r10, r2, r4)
                    r0.replace(r1)
                L56:
                    return
            }
        }

        public Worker() {
                r0 = this;
                r0.<init>()
                return
        }

        public long now(java.util.concurrent.TimeUnit r4) {
                r3 = this;
                long r0 = java.lang.System.currentTimeMillis()
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r4.convert(r0, r2)
                return r0
        }

        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r4) {
                r3 = this;
                r0 = 0
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                io.reactivex.disposables.Disposable r4 = r3.schedule(r4, r0, r2)
                return r4
        }

        public abstract io.reactivex.disposables.Disposable schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);

        public io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable r18, long r19, long r21, java.util.concurrent.TimeUnit r23) {
                r17 = this;
                r10 = r17
                r11 = r19
                r13 = r23
                io.reactivex.internal.disposables.SequentialDisposable r14 = new io.reactivex.internal.disposables.SequentialDisposable
                r14.<init>()
                io.reactivex.internal.disposables.SequentialDisposable r15 = new io.reactivex.internal.disposables.SequentialDisposable
                r15.<init>(r14)
                java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r18)
                r0 = r21
                long r8 = r13.toNanos(r0)
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
                long r5 = r10.now(r0)
                long r0 = r13.toNanos(r11)
                long r2 = r5 + r0
                io.reactivex.Scheduler$Worker$PeriodicTask r7 = new io.reactivex.Scheduler$Worker$PeriodicTask
                r0 = r7
                r1 = r17
                r16 = r14
                r14 = r7
                r7 = r15
                r0.<init>(r1, r2, r4, r5, r7, r8)
                io.reactivex.disposables.Disposable r0 = r10.schedule(r14, r11, r13)
                io.reactivex.internal.disposables.EmptyDisposable r1 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                if (r0 != r1) goto L3b
                return r0
            L3b:
                r1 = r16
                r1.replace(r0)
                return r15
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r1 = "rx2.scheduler.drift-tolerance"
            r2 = 15
            java.lang.Long r1 = java.lang.Long.getLong(r1, r2)
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS = r0
            return
    }

    public Scheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long clockDriftTolerance() {
            long r0 = io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS
            return r0
    }

    public abstract io.reactivex.Scheduler.Worker createWorker();

    public long now(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4) {
            r3 = this;
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            io.reactivex.disposables.Disposable r4 = r3.scheduleDirect(r4, r0, r2)
            return r4
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            io.reactivex.Scheduler$Worker r0 = r2.createWorker()
            java.lang.Runnable r3 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r3)
            io.reactivex.Scheduler$DisposeTask r1 = new io.reactivex.Scheduler$DisposeTask
            r1.<init>(r3, r0)
            r0.schedule(r1, r4, r6)
            return r1
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            io.reactivex.Scheduler$Worker r0 = r8.createWorker()
            java.lang.Runnable r9 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r9)
            io.reactivex.Scheduler$PeriodicDirectTask r7 = new io.reactivex.Scheduler$PeriodicDirectTask
            r7.<init>(r9, r0)
            r1 = r7
            r2 = r10
            r4 = r12
            r6 = r14
            io.reactivex.disposables.Disposable r9 = r0.schedulePeriodically(r1, r2, r4, r6)
            io.reactivex.internal.disposables.EmptyDisposable r10 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            if (r9 != r10) goto L1a
            return r9
        L1a:
            return r7
    }

    public void shutdown() {
            r0 = this;
            return
    }

    public void start() {
            r0 = this;
            return
    }

    public <S extends io.reactivex.Scheduler & io.reactivex.disposables.Disposable> S when(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> r2) {
            r1 = this;
            io.reactivex.internal.schedulers.SchedulerWhen r0 = new io.reactivex.internal.schedulers.SchedulerWhen
            r0.<init>(r2, r1)
            return r0
    }
}
