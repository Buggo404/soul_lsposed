package org.greenrobot.greendao.p004rx;

/* loaded from: classes.dex */
public class RxQuery<T> extends org.greenrobot.greendao.p004rx.RxBase {
    private final org.greenrobot.greendao.query.Query<T> query;




    public RxQuery(org.greenrobot.greendao.query.Query<T> r1) {
            r0 = this;
            r0.<init>()
            r0.query = r1
            return
    }

    public RxQuery(org.greenrobot.greendao.query.Query<T> r1, rx.Scheduler r2) {
            r0 = this;
            r0.<init>(r2)
            r0.query = r1
            return
    }

    static /* synthetic */ org.greenrobot.greendao.query.Query access$000(org.greenrobot.greendao.p004rx.RxQuery r0) {
            org.greenrobot.greendao.query.Query<T> r0 = r0.query
            return r0
    }

    @Override // org.greenrobot.greendao.p004rx.RxBase
    public /* bridge */ /* synthetic */ rx.Scheduler getScheduler() {
            r1 = this;
            rx.Scheduler r0 = super.getScheduler()
            return r0
    }

    public rx.Observable<java.util.List<T>> list() {
            r1 = this;
            org.greenrobot.greendao.rx.RxQuery$1 r0 = new org.greenrobot.greendao.rx.RxQuery$1
            r0.<init>(r1)
            rx.Observable r0 = r1.wrap(r0)
            return r0
    }

    public rx.Observable<T> oneByOne() {
            r1 = this;
            org.greenrobot.greendao.rx.RxQuery$3 r0 = new org.greenrobot.greendao.rx.RxQuery$3
            r0.<init>(r1)
            rx.Observable r0 = rx.Observable.create(r0)
            rx.Observable r0 = r1.wrap(r0)
            return r0
    }

    public rx.Observable<T> unique() {
            r1 = this;
            org.greenrobot.greendao.rx.RxQuery$2 r0 = new org.greenrobot.greendao.rx.RxQuery$2
            r0.<init>(r1)
            rx.Observable r0 = r1.wrap(r0)
            return r0
    }
}
