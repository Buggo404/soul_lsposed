package org.greenrobot.greendao.p004rx;

/* loaded from: classes.dex */
class RxBase {
    protected final rx.Scheduler scheduler;

    RxBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.scheduler = r0
            return
    }

    RxBase(rx.Scheduler r1) {
            r0 = this;
            r0.<init>()
            r0.scheduler = r1
            return
    }

    public rx.Scheduler getScheduler() {
            r1 = this;
            rx.Scheduler r0 = r1.scheduler
            return r0
    }

    protected <R> rx.Observable<R> wrap(java.util.concurrent.Callable<R> r1) {
            r0 = this;
            rx.Observable r1 = org.greenrobot.greendao.p004rx.RxUtils.fromCallable(r1)
            rx.Observable r1 = r0.wrap(r1)
            return r1
    }

    protected <R> rx.Observable<R> wrap(rx.Observable<R> r2) {
            r1 = this;
            rx.Scheduler r0 = r1.scheduler
            if (r0 == 0) goto L8
            rx.Observable r2 = r2.subscribeOn(r0)
        L8:
            return r2
    }
}
