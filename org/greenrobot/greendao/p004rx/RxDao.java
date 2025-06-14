package org.greenrobot.greendao.p004rx;

/* loaded from: classes.dex */
public class RxDao<T, K> extends org.greenrobot.greendao.p004rx.RxBase {
    private final org.greenrobot.greendao.AbstractDao<T, K> dao;
























    public RxDao(org.greenrobot.greendao.AbstractDao<T, K> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RxDao(org.greenrobot.greendao.AbstractDao<T, K> r1, rx.Scheduler r2) {
            r0 = this;
            r0.<init>(r2)
            r0.dao = r1
            return
    }

    static /* synthetic */ org.greenrobot.greendao.AbstractDao access$000(org.greenrobot.greendao.p004rx.RxDao r0) {
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r0.dao
            return r0
    }

    public rx.Observable<java.lang.Long> count() {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$23 r0 = new org.greenrobot.greendao.rx.RxDao$23
            r0.<init>(r1)
            rx.Observable r0 = r1.wrap(r0)
            return r0
    }

    public rx.Observable<java.lang.Void> delete(T r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$16 r0 = new org.greenrobot.greendao.rx.RxDao$16
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Void> deleteAll() {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$18 r0 = new org.greenrobot.greendao.rx.RxDao$18
            r0.<init>(r1)
            rx.Observable r0 = r1.wrap(r0)
            return r0
    }

    public rx.Observable<java.lang.Void> deleteByKey(K r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$17 r0 = new org.greenrobot.greendao.rx.RxDao$17
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Void> deleteByKeyInTx(java.lang.Iterable<K> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$21 r0 = new org.greenrobot.greendao.rx.RxDao$21
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Void> deleteByKeyInTx(K... r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$22 r0 = new org.greenrobot.greendao.rx.RxDao$22
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Void> deleteInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$19 r0 = new org.greenrobot.greendao.rx.RxDao$19
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Void> deleteInTx(T... r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$20 r0 = new org.greenrobot.greendao.rx.RxDao$20
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public org.greenrobot.greendao.AbstractDao<T, K> getDao() {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            return r0
    }

    @Override // org.greenrobot.greendao.p004rx.RxBase
    public /* bridge */ /* synthetic */ rx.Scheduler getScheduler() {
            r1 = this;
            rx.Scheduler r0 = super.getScheduler()
            return r0
    }

    public rx.Observable<T> insert(T r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$4 r0 = new org.greenrobot.greendao.rx.RxDao$4
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Iterable<T>> insertInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$5 r0 = new org.greenrobot.greendao.rx.RxDao$5
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Object[]> insertInTx(T... r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$6 r0 = new org.greenrobot.greendao.rx.RxDao$6
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<T> insertOrReplace(T r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$7 r0 = new org.greenrobot.greendao.rx.RxDao$7
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Iterable<T>> insertOrReplaceInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$8 r0 = new org.greenrobot.greendao.rx.RxDao$8
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Object[]> insertOrReplaceInTx(T... r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$9 r0 = new org.greenrobot.greendao.rx.RxDao$9
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<T> load(K r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$2 r0 = new org.greenrobot.greendao.rx.RxDao$2
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.util.List<T>> loadAll() {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$1 r0 = new org.greenrobot.greendao.rx.RxDao$1
            r0.<init>(r1)
            rx.Observable r0 = r1.wrap(r0)
            return r0
    }

    public rx.Observable<T> refresh(T r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$3 r0 = new org.greenrobot.greendao.rx.RxDao$3
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<T> save(T r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$10 r0 = new org.greenrobot.greendao.rx.RxDao$10
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Iterable<T>> saveInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$11 r0 = new org.greenrobot.greendao.rx.RxDao$11
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Object[]> saveInTx(T... r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$12 r0 = new org.greenrobot.greendao.rx.RxDao$12
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<T> update(T r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$13 r0 = new org.greenrobot.greendao.rx.RxDao$13
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Iterable<T>> updateInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$14 r0 = new org.greenrobot.greendao.rx.RxDao$14
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }

    public rx.Observable<java.lang.Object[]> updateInTx(T... r2) {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao$15 r0 = new org.greenrobot.greendao.rx.RxDao$15
            r0.<init>(r1, r2)
            rx.Observable r2 = r1.wrap(r0)
            return r2
    }
}
