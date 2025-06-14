package org.greenrobot.greendao;

/* loaded from: classes.dex */
public class AbstractDaoSession {

    /* renamed from: db */
    private final org.greenrobot.greendao.database.Database f616db;
    private final java.util.Map<java.lang.Class<?>, org.greenrobot.greendao.AbstractDao<?, ?>> entityToDao;
    private volatile org.greenrobot.greendao.p004rx.RxTransaction rxTxIo;
    private volatile org.greenrobot.greendao.p004rx.RxTransaction rxTxPlain;

    public AbstractDaoSession(org.greenrobot.greendao.database.Database r1) {
            r0 = this;
            r0.<init>()
            r0.f616db = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.entityToDao = r1
            return
    }

    public <V> V callInTx(java.util.concurrent.Callable<V> r2) throws java.lang.Exception {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r1.f616db
            r0.beginTransaction()
            java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L14
            org.greenrobot.greendao.database.Database r0 = r1.f616db     // Catch: java.lang.Throwable -> L14
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L14
            org.greenrobot.greendao.database.Database r0 = r1.f616db
            r0.endTransaction()
            return r2
        L14:
            r2 = move-exception
            org.greenrobot.greendao.database.Database r0 = r1.f616db
            r0.endTransaction()
            throw r2
    }

    public <V> V callInTxNoException(java.util.concurrent.Callable<V> r3) {
            r2 = this;
            org.greenrobot.greendao.database.Database r0 = r2.f616db
            r0.beginTransaction()
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            org.greenrobot.greendao.database.Database r0 = r2.f616db     // Catch: java.lang.Throwable -> L14
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L14
            org.greenrobot.greendao.database.Database r0 = r2.f616db
            r0.endTransaction()
            return r3
        L14:
            r3 = move-exception
            goto L1f
        L16:
            r3 = move-exception
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Callable failed"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L1f:
            org.greenrobot.greendao.database.Database r0 = r2.f616db
            r0.endTransaction()
            throw r3
    }

    public <T> void delete(T r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            org.greenrobot.greendao.AbstractDao r0 = r1.getDao(r0)
            r0.delete(r2)
            return
    }

    public <T> void deleteAll(java.lang.Class<T> r1) {
            r0 = this;
            org.greenrobot.greendao.AbstractDao r1 = r0.getDao(r1)
            r1.deleteAll()
            return
    }

    public java.util.Collection<org.greenrobot.greendao.AbstractDao<?, ?>> getAllDaos() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, org.greenrobot.greendao.AbstractDao<?, ?>> r0 = r1.entityToDao
            java.util.Collection r0 = r0.values()
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public org.greenrobot.greendao.AbstractDao<?, ?> getDao(java.lang.Class<? extends java.lang.Object> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, org.greenrobot.greendao.AbstractDao<?, ?>> r0 = r3.entityToDao
            java.lang.Object r0 = r0.get(r4)
            org.greenrobot.greendao.AbstractDao r0 = (org.greenrobot.greendao.AbstractDao) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No DAO registered for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public org.greenrobot.greendao.database.Database getDatabase() {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r1.f616db
            return r0
    }

    public <T> long insert(T r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            org.greenrobot.greendao.AbstractDao r0 = r2.getDao(r0)
            long r0 = r0.insert(r3)
            return r0
    }

    public <T> long insertOrReplace(T r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            org.greenrobot.greendao.AbstractDao r0 = r2.getDao(r0)
            long r0 = r0.insertOrReplace(r3)
            return r0
    }

    public <T, K> T load(java.lang.Class<T> r1, K r2) {
            r0 = this;
            org.greenrobot.greendao.AbstractDao r1 = r0.getDao(r1)
            java.lang.Object r1 = r1.load(r2)
            return r1
    }

    public <T, K> java.util.List<T> loadAll(java.lang.Class<T> r1) {
            r0 = this;
            org.greenrobot.greendao.AbstractDao r1 = r0.getDao(r1)
            java.util.List r1 = r1.loadAll()
            return r1
    }

    public <T> org.greenrobot.greendao.query.QueryBuilder<T> queryBuilder(java.lang.Class<T> r1) {
            r0 = this;
            org.greenrobot.greendao.AbstractDao r1 = r0.getDao(r1)
            org.greenrobot.greendao.query.QueryBuilder r1 = r1.queryBuilder()
            return r1
    }

    public <T, K> java.util.List<T> queryRaw(java.lang.Class<T> r1, java.lang.String r2, java.lang.String... r3) {
            r0 = this;
            org.greenrobot.greendao.AbstractDao r1 = r0.getDao(r1)
            java.util.List r1 = r1.queryRaw(r2, r3)
            return r1
    }

    public <T> void refresh(T r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            org.greenrobot.greendao.AbstractDao r0 = r1.getDao(r0)
            r0.refresh(r2)
            return
    }

    protected <T> void registerDao(java.lang.Class<T> r2, org.greenrobot.greendao.AbstractDao<T, ?> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, org.greenrobot.greendao.AbstractDao<?, ?>> r0 = r1.entityToDao
            r0.put(r2, r3)
            return
    }

    public void runInTx(java.lang.Runnable r2) {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r1.f616db
            r0.beginTransaction()
            r2.run()     // Catch: java.lang.Throwable -> L13
            org.greenrobot.greendao.database.Database r2 = r1.f616db     // Catch: java.lang.Throwable -> L13
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L13
            org.greenrobot.greendao.database.Database r2 = r1.f616db
            r2.endTransaction()
            return
        L13:
            r2 = move-exception
            org.greenrobot.greendao.database.Database r0 = r1.f616db
            r0.endTransaction()
            throw r2
    }

    public org.greenrobot.greendao.p004rx.RxTransaction rxTx() {
            r2 = this;
            org.greenrobot.greendao.rx.RxTransaction r0 = r2.rxTxIo
            if (r0 != 0) goto Lf
            org.greenrobot.greendao.rx.RxTransaction r0 = new org.greenrobot.greendao.rx.RxTransaction
            rx.Scheduler r1 = rx.schedulers.Schedulers.io()
            r0.<init>(r2, r1)
            r2.rxTxIo = r0
        Lf:
            org.greenrobot.greendao.rx.RxTransaction r0 = r2.rxTxIo
            return r0
    }

    public org.greenrobot.greendao.p004rx.RxTransaction rxTxPlain() {
            r1 = this;
            org.greenrobot.greendao.rx.RxTransaction r0 = r1.rxTxPlain
            if (r0 != 0) goto Lb
            org.greenrobot.greendao.rx.RxTransaction r0 = new org.greenrobot.greendao.rx.RxTransaction
            r0.<init>(r1)
            r1.rxTxPlain = r0
        Lb:
            org.greenrobot.greendao.rx.RxTransaction r0 = r1.rxTxPlain
            return r0
    }

    public org.greenrobot.greendao.async.AsyncSession startAsyncSession() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncSession r0 = new org.greenrobot.greendao.async.AsyncSession
            r0.<init>(r1)
            return r0
    }

    public <T> void update(T r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            org.greenrobot.greendao.AbstractDao r0 = r1.getDao(r0)
            r0.update(r2)
            return
    }
}
