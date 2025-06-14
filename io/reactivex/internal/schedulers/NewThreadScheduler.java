package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class NewThreadScheduler extends io.reactivex.Scheduler {
    private static final java.lang.String KEY_NEWTHREAD_PRIORITY = "rx2.newthread-priority";
    private static final io.reactivex.internal.schedulers.RxThreadFactory THREAD_FACTORY = null;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxNewThreadScheduler";
    final java.util.concurrent.ThreadFactory threadFactory;

    static {
            java.lang.String r0 = "rx2.newthread-priority"
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 10
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r2 = "RxNewThreadScheduler"
            r1.<init>(r2, r0)
            io.reactivex.internal.schedulers.NewThreadScheduler.THREAD_FACTORY = r1
            return
    }

    public NewThreadScheduler() {
            r1 = this;
            io.reactivex.internal.schedulers.RxThreadFactory r0 = io.reactivex.internal.schedulers.NewThreadScheduler.THREAD_FACTORY
            r1.<init>(r0)
            return
    }

    public NewThreadScheduler(java.util.concurrent.ThreadFactory r1) {
            r0 = this;
            r0.<init>()
            r0.threadFactory = r1
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.NewThreadWorker r0 = new io.reactivex.internal.schedulers.NewThreadWorker
            java.util.concurrent.ThreadFactory r1 = r2.threadFactory
            r0.<init>(r1)
            return r0
    }
}
