package io.reactivex.schedulers;

/* loaded from: classes.dex */
public final class TestScheduler extends io.reactivex.Scheduler {
    long counter;
    final java.util.Queue<io.reactivex.schedulers.TestScheduler.TimedRunnable> queue;
    volatile long time;

    final class TestWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean disposed;
        final /* synthetic */ io.reactivex.schedulers.TestScheduler this$0;

        final class QueueRemove implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.schedulers.TestScheduler.TestWorker this$1;
            final io.reactivex.schedulers.TestScheduler.TimedRunnable timedAction;

            QueueRemove(io.reactivex.schedulers.TestScheduler.TestWorker r1, io.reactivex.schedulers.TestScheduler.TimedRunnable r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r0.timedAction = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.schedulers.TestScheduler$TestWorker r0 = r2.this$1
                    io.reactivex.schedulers.TestScheduler r0 = r0.this$0
                    java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r0 = r0.queue
                    io.reactivex.schedulers.TestScheduler$TimedRunnable r1 = r2.timedAction
                    r0.remove(r1)
                    return
            }
        }

        TestWorker(io.reactivex.schedulers.TestScheduler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(java.util.concurrent.TimeUnit r3) {
                r2 = this;
                io.reactivex.schedulers.TestScheduler r0 = r2.this$0
                long r0 = r0.now(r3)
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r11) {
                r10 = this;
                boolean r0 = r10.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r11 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r11
            L7:
                io.reactivex.schedulers.TestScheduler$TimedRunnable r7 = new io.reactivex.schedulers.TestScheduler$TimedRunnable
                r2 = 0
                io.reactivex.schedulers.TestScheduler r0 = r10.this$0
                long r5 = r0.counter
                r8 = 1
                long r8 = r8 + r5
                r0.counter = r8
                r0 = r7
                r1 = r10
                r4 = r11
                r0.<init>(r1, r2, r4, r5)
                io.reactivex.schedulers.TestScheduler r11 = r10.this$0
                java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r11 = r11.queue
                r11.add(r7)
                io.reactivex.schedulers.TestScheduler$TestWorker$QueueRemove r11 = new io.reactivex.schedulers.TestScheduler$TestWorker$QueueRemove
                r11.<init>(r10, r7)
                io.reactivex.disposables.Disposable r11 = io.reactivex.disposables.Disposables.fromRunnable(r11)
                return r11
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r9, long r10, java.util.concurrent.TimeUnit r12) {
                r8 = this;
                boolean r0 = r8.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r9
            L7:
                io.reactivex.schedulers.TestScheduler$TimedRunnable r7 = new io.reactivex.schedulers.TestScheduler$TimedRunnable
                io.reactivex.schedulers.TestScheduler r0 = r8.this$0
                long r0 = r0.time
                long r10 = r12.toNanos(r10)
                long r2 = r0 + r10
                io.reactivex.schedulers.TestScheduler r10 = r8.this$0
                long r5 = r10.counter
                r11 = 1
                long r11 = r11 + r5
                r10.counter = r11
                r0 = r7
                r1 = r8
                r4 = r9
                r0.<init>(r1, r2, r4, r5)
                io.reactivex.schedulers.TestScheduler r9 = r8.this$0
                java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r9 = r9.queue
                r9.add(r7)
                io.reactivex.schedulers.TestScheduler$TestWorker$QueueRemove r9 = new io.reactivex.schedulers.TestScheduler$TestWorker$QueueRemove
                r9.<init>(r8, r7)
                io.reactivex.disposables.Disposable r9 = io.reactivex.disposables.Disposables.fromRunnable(r9)
                return r9
        }
    }

    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.schedulers.TestScheduler.TimedRunnable> {
        final long count;
        final java.lang.Runnable run;
        final io.reactivex.schedulers.TestScheduler.TestWorker scheduler;
        final long time;

        TimedRunnable(io.reactivex.schedulers.TestScheduler.TestWorker r1, long r2, java.lang.Runnable r4, long r5) {
                r0 = this;
                r0.<init>()
                r0.time = r2
                r0.run = r4
                r0.scheduler = r1
                r0.count = r5
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(io.reactivex.schedulers.TestScheduler.TimedRunnable r6) {
                r5 = this;
                long r0 = r5.time
                long r2 = r6.time
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L11
                long r0 = r5.count
                long r2 = r6.count
                int r6 = io.reactivex.internal.functions.ObjectHelper.compare(r0, r2)
                return r6
            L11:
                int r6 = io.reactivex.internal.functions.ObjectHelper.compare(r0, r2)
                return r6
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.reactivex.schedulers.TestScheduler.TimedRunnable r1) {
                r0 = this;
                io.reactivex.schedulers.TestScheduler$TimedRunnable r1 = (io.reactivex.schedulers.TestScheduler.TimedRunnable) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.time
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.Runnable r1 = r3.run
                java.lang.String r1 = r1.toString()
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = "TimedRunnable(time = %d, run = %s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    public TestScheduler() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r1 = 11
            r0.<init>(r1)
            r2.queue = r0
            return
    }

    public TestScheduler(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r1 = 11
            r0.<init>(r1)
            r2.queue = r0
            long r3 = r5.toNanos(r3)
            r2.time = r3
            return
    }

    private void triggerActions(long r6) {
            r5 = this;
        L0:
            java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r0 = r5.queue
            java.lang.Object r0 = r0.peek()
            io.reactivex.schedulers.TestScheduler$TimedRunnable r0 = (io.reactivex.schedulers.TestScheduler.TimedRunnable) r0
            if (r0 == 0) goto L31
            long r1 = r0.time
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L11
            goto L31
        L11:
            long r1 = r0.time
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1c
            long r1 = r5.time
            goto L1e
        L1c:
            long r1 = r0.time
        L1e:
            r5.time = r1
            java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r1 = r5.queue
            r1.remove(r0)
            io.reactivex.schedulers.TestScheduler$TestWorker r1 = r0.scheduler
            boolean r1 = r1.disposed
            if (r1 != 0) goto L0
            java.lang.Runnable r0 = r0.run
            r0.run()
            goto L0
        L31:
            r5.time = r6
            return
    }

    public void advanceTimeBy(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            long r0 = r2.time
            long r3 = r5.toNanos(r3)
            long r0 = r0 + r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.advanceTimeTo(r0, r3)
            return
    }

    public void advanceTimeTo(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toNanos(r1)
            r0.triggerActions(r1)
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r1 = this;
            io.reactivex.schedulers.TestScheduler$TestWorker r0 = new io.reactivex.schedulers.TestScheduler$TestWorker
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public long now(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.time
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public void triggerActions() {
            r2 = this;
            long r0 = r2.time
            r2.triggerActions(r0)
            return
    }
}
