package org.greenrobot.greendao.p004rx;

/* loaded from: classes.dex */
public class RxTransaction extends org.greenrobot.greendao.p004rx.RxBase {
    private final org.greenrobot.greendao.AbstractDaoSession daoSession;



    public RxTransaction(org.greenrobot.greendao.AbstractDaoSession r1) {
            r0 = this;
            r0.<init>()
            r0.daoSession = r1
            return
    }

    public RxTransaction(org.greenrobot.greendao.AbstractDaoSession r1, rx.Scheduler r2) {
            r0 = this;
            r0.<init>(r2)
            r0.daoSession = r1
            return
    }

    static /* synthetic */ org.greenrobot.greendao.AbstractDaoSession access$000(org.greenrobot.greendao.p004rx.RxTransaction r0) {
            org.greenrobot.greendao.AbstractDaoSession r0 = r0.daoSession
            return r0
    }

    public <T> rx.Observable<T> call(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxTransaction$2 r0 = new org.greenrobot.greendao.rx.RxTransaction$2
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public org.greenrobot.greendao.AbstractDaoSession getDaoSession() {
            r1 = this;
            org.greenrobot.greendao.AbstractDaoSession r0 = r1.daoSession
            return r0
    }

    @Override // org.greenrobot.greendao.p004rx.RxBase
    public /* bridge */ /* synthetic */ rx.Scheduler getScheduler() {
            r1 = this;
            rx.Scheduler r0 = super.getScheduler()
            return r0
    }

    public rx.Observable<java.lang.Void> run(java.lang.Runnable r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxTransaction$1 r0 = new org.greenrobot.greendao.rx.RxTransaction$1
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }
}
