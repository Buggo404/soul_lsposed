package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class ExecutorScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.Scheduler HELPER = null;
    final java.util.concurrent.Executor executor;

    final class DelayedDispose implements java.lang.Runnable {

        /* renamed from: dr */
        private final io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable f522dr;
        final /* synthetic */ io.reactivex.internal.schedulers.ExecutorScheduler this$0;

        DelayedDispose(io.reactivex.internal.schedulers.ExecutorScheduler r1, io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f522dr = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable r0 = r3.f522dr
                io.reactivex.internal.disposables.SequentialDisposable r0 = r0.direct
                io.reactivex.internal.schedulers.ExecutorScheduler r1 = r3.this$0
                io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable r2 = r3.f522dr
                io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r2)
                r0.replace(r1)
                return
        }
    }

    static final class DelayedRunnable extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable, io.reactivex.disposables.Disposable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        private static final long serialVersionUID = -4101336210206799084L;
        final io.reactivex.internal.disposables.SequentialDisposable direct;
        final io.reactivex.internal.disposables.SequentialDisposable timed;

        DelayedRunnable(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>(r1)
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.timed = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.direct = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                java.lang.Object r0 = r1.getAndSet(r0)
                if (r0 == 0) goto L11
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timed
                r0.dispose()
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.direct
                r0.dispose()
            L11:
                return
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public java.lang.Runnable getWrappedRunnable() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                if (r0 == 0) goto L9
                goto Lb
            L9:
                java.lang.Runnable r0 = io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE
            Lb:
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                if (r0 == 0) goto L31
                r1 = 0
                r0.run()     // Catch: java.lang.Throwable -> L1e
                r3.lazySet(r1)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r3.timed
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r0.lazySet(r1)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r3.direct
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r0.lazySet(r1)
                goto L31
            L1e:
                r0 = move-exception
                r3.lazySet(r1)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.timed
                io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.lazySet(r2)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.direct
                io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.lazySet(r2)
                throw r0
            L31:
                return
        }
    }

    public static final class ExecutorWorker extends io.reactivex.Scheduler.Worker implements java.lang.Runnable {
        volatile boolean disposed;
        final java.util.concurrent.Executor executor;
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> queue;
        final io.reactivex.disposables.CompositeDisposable tasks;
        final java.util.concurrent.atomic.AtomicInteger wip;

        static final class BooleanRunnable extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -2421395018820541164L;
            final java.lang.Runnable actual;

            BooleanRunnable(java.lang.Runnable r1) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r1 = this;
                    r0 = 1
                    r1.lazySet(r0)
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                    r1 = this;
                    boolean r0 = r1.get()
                    return r0
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    boolean r0 = r2.get()
                    if (r0 == 0) goto L7
                    return
                L7:
                    r0 = 1
                    java.lang.Runnable r1 = r2.actual     // Catch: java.lang.Throwable -> L11
                    r1.run()     // Catch: java.lang.Throwable -> L11
                    r2.lazySet(r0)
                    return
                L11:
                    r1 = move-exception
                    r2.lazySet(r0)
                    throw r1
            }
        }

        final class SequentialDispose implements java.lang.Runnable {
            private final java.lang.Runnable decoratedRun;
            private final io.reactivex.internal.disposables.SequentialDisposable mar;
            final /* synthetic */ io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker this$0;

            SequentialDispose(io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker r1, io.reactivex.internal.disposables.SequentialDisposable r2, java.lang.Runnable r3) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.mar = r2
                    r0.decoratedRun = r3
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r3.mar
                    io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker r1 = r3.this$0
                    java.lang.Runnable r2 = r3.decoratedRun
                    io.reactivex.disposables.Disposable r1 = r1.schedule(r2)
                    r0.replace(r1)
                    return
            }
        }

        public ExecutorWorker(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.wip = r0
                io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
                r0.<init>()
                r1.tasks = r0
                r1.executor = r2
                io.reactivex.internal.queue.MpscLinkedQueue r2 = new io.reactivex.internal.queue.MpscLinkedQueue
                r2.<init>()
                r1.queue = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 != 0) goto L19
                r0 = 1
                r1.disposed = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.tasks
                r0.dispose()
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L19
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r0 = r1.queue
                r0.clear()
            L19:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r0 = r3.queue
                r1 = 1
            L3:
                boolean r2 = r3.disposed
                if (r2 == 0) goto Lb
                r0.clear()
                return
            Lb:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L25
                boolean r2 = r3.disposed
                if (r2 == 0) goto L1b
                r0.clear()
                return
            L1b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.wip
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L3
                return
            L25:
                r2.run()
                boolean r2 = r3.disposed
                if (r2 == 0) goto Lb
                r0.clear()
                return
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r2) {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r2 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r2
            L7:
                java.lang.Runnable r2 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r2)
                io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable r0 = new io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable
                r0.<init>(r2)
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r2 = r1.queue
                r2.offer(r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.wip
                int r2 = r2.getAndIncrement()
                if (r2 != 0) goto L32
                java.util.concurrent.Executor r2 = r1.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r2.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                goto L32
            L23:
                r2 = move-exception
                r0 = 1
                r1.disposed = r0
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r0 = r1.queue
                r0.clear()
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                io.reactivex.internal.disposables.EmptyDisposable r2 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r2
            L32:
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r5, long r6, java.util.concurrent.TimeUnit r8) {
                r4 = this;
                r0 = 0
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 > 0) goto Lb
                io.reactivex.disposables.Disposable r5 = r4.schedule(r5)
                return r5
            Lb:
                boolean r0 = r4.disposed
                if (r0 == 0) goto L12
                io.reactivex.internal.disposables.EmptyDisposable r5 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r5
            L12:
                io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
                r0.<init>()
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>(r0)
                java.lang.Runnable r5 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r5)
                io.reactivex.internal.schedulers.ScheduledRunnable r2 = new io.reactivex.internal.schedulers.ScheduledRunnable
                io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$SequentialDispose r3 = new io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$SequentialDispose
                r3.<init>(r4, r1, r5)
                io.reactivex.disposables.CompositeDisposable r5 = r4.tasks
                r2.<init>(r3, r5)
                io.reactivex.disposables.CompositeDisposable r5 = r4.tasks
                r5.add(r2)
                java.util.concurrent.Executor r5 = r4.executor
                boolean r3 = r5 instanceof java.util.concurrent.ScheduledExecutorService
                if (r3 == 0) goto L4b
                java.util.concurrent.ScheduledExecutorService r5 = (java.util.concurrent.ScheduledExecutorService) r5     // Catch: java.util.concurrent.RejectedExecutionException -> L41
                java.util.concurrent.ScheduledFuture r5 = r5.schedule(r2, r6, r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L41
                r2.setFuture(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L41
                goto L59
            L41:
                r5 = move-exception
                r6 = 1
                r4.disposed = r6
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
                io.reactivex.internal.disposables.EmptyDisposable r5 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r5
            L4b:
                io.reactivex.Scheduler r5 = io.reactivex.internal.schedulers.ExecutorScheduler.HELPER
                io.reactivex.disposables.Disposable r5 = r5.scheduleDirect(r2, r6, r8)
                io.reactivex.internal.schedulers.DisposeOnCancel r6 = new io.reactivex.internal.schedulers.DisposeOnCancel
                r6.<init>(r5)
                r2.setFuture(r6)
            L59:
                r0.replace(r2)
                return r1
        }
    }

    static {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.single()
            io.reactivex.internal.schedulers.ExecutorScheduler.HELPER = r0
            return
    }

    public ExecutorScheduler(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker r0 = new io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker
            java.util.concurrent.Executor r1 = r2.executor
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r2) {
            r1 = this;
            java.lang.Runnable r2 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r2)
            java.util.concurrent.Executor r0 = r1.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            boolean r0 = r0 instanceof java.util.concurrent.ExecutorService     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            if (r0 == 0) goto L1b
            io.reactivex.internal.schedulers.ScheduledDirectTask r0 = new io.reactivex.internal.schedulers.ScheduledDirectTask     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            r0.<init>(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            java.util.concurrent.Executor r2 = r1.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            java.util.concurrent.Future r2 = r2.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            r0.setFuture(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            return r0
        L1b:
            io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable r0 = new io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            r0.<init>(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            java.util.concurrent.Executor r2 = r1.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            r2.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L26
            return r0
        L26:
            r2 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            io.reactivex.internal.disposables.EmptyDisposable r2 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r2
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            java.lang.Runnable r3 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r3)
            java.util.concurrent.Executor r0 = r2.executor
            boolean r0 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L22
            io.reactivex.internal.schedulers.ScheduledDirectTask r0 = new io.reactivex.internal.schedulers.ScheduledDirectTask     // Catch: java.util.concurrent.RejectedExecutionException -> L1b
            r0.<init>(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L1b
            java.util.concurrent.Executor r3 = r2.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L1b
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch: java.util.concurrent.RejectedExecutionException -> L1b
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r0, r4, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L1b
            r0.setFuture(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L1b
            return r0
        L1b:
            r3 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            io.reactivex.internal.disposables.EmptyDisposable r3 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r3
        L22:
            io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable r0 = new io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable
            r0.<init>(r3)
            io.reactivex.Scheduler r3 = io.reactivex.internal.schedulers.ExecutorScheduler.HELPER
            io.reactivex.internal.schedulers.ExecutorScheduler$DelayedDispose r1 = new io.reactivex.internal.schedulers.ExecutorScheduler$DelayedDispose
            r1.<init>(r2, r0)
            io.reactivex.disposables.Disposable r3 = r3.scheduleDirect(r1, r4, r6)
            io.reactivex.internal.disposables.SequentialDisposable r4 = r0.timed
            r4.replace(r3)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r8 = this;
            java.util.concurrent.Executor r0 = r8.executor
            boolean r0 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L27
            java.lang.Runnable r9 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r9)
            io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask r7 = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            r7.<init>(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            java.util.concurrent.Executor r9 = r8.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            r0 = r9
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            r1 = r7
            r2 = r10
            r4 = r12
            r6 = r14
            java.util.concurrent.ScheduledFuture r9 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            r7.setFuture(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
            return r7
        L20:
            r9 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r9
        L27:
            io.reactivex.disposables.Disposable r9 = super.schedulePeriodicallyDirect(r9, r10, r12, r14)
            return r9
    }
}
