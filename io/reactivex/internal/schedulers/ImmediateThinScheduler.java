package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class ImmediateThinScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.disposables.Disposable DISPOSED = null;
    public static final io.reactivex.Scheduler INSTANCE = null;
    static final io.reactivex.Scheduler.Worker WORKER = null;

    static final class ImmediateThinWorker extends io.reactivex.Scheduler.Worker {
        ImmediateThinWorker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r1) {
                r0 = this;
                r1.run()
                io.reactivex.disposables.Disposable r1 = io.reactivex.internal.schedulers.ImmediateThinScheduler.DISPOSED
                return r1
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "This scheduler doesn't support delayed execution"
                r1.<init>(r2)
                throw r1
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "This scheduler doesn't support periodic execution"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            io.reactivex.internal.schedulers.ImmediateThinScheduler r0 = new io.reactivex.internal.schedulers.ImmediateThinScheduler
            r0.<init>()
            io.reactivex.internal.schedulers.ImmediateThinScheduler.INSTANCE = r0
            io.reactivex.internal.schedulers.ImmediateThinScheduler$ImmediateThinWorker r0 = new io.reactivex.internal.schedulers.ImmediateThinScheduler$ImmediateThinWorker
            r0.<init>()
            io.reactivex.internal.schedulers.ImmediateThinScheduler.WORKER = r0
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            io.reactivex.internal.schedulers.ImmediateThinScheduler.DISPOSED = r0
            r0.dispose()
            return
    }

    private ImmediateThinScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r1 = this;
            io.reactivex.Scheduler$Worker r0 = io.reactivex.internal.schedulers.ImmediateThinScheduler.WORKER
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            io.reactivex.disposables.Disposable r1 = io.reactivex.internal.schedulers.ImmediateThinScheduler.DISPOSED
            return r1
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This scheduler doesn't support delayed execution"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This scheduler doesn't support periodic execution"
            r1.<init>(r2)
            throw r1
    }
}
