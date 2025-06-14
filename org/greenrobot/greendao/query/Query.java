package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class Query<T> extends org.greenrobot.greendao.query.AbstractQueryWithLimit<T> {
    private final org.greenrobot.greendao.query.Query.QueryData<T> queryData;
    private volatile org.greenrobot.greendao.p004rx.RxQuery rxTxIo;
    private volatile org.greenrobot.greendao.p004rx.RxQuery rxTxPlain;

    /* renamed from: org.greenrobot.greendao.query.Query$1 */
    static /* synthetic */ class C12141 {
    }

    private static final class QueryData<T2> extends org.greenrobot.greendao.query.AbstractQueryData<T2, org.greenrobot.greendao.query.Query<T2>> {
        private final int limitPosition;
        private final int offsetPosition;

        QueryData(org.greenrobot.greendao.AbstractDao<T2, ?> r1, java.lang.String r2, java.lang.String[] r3, int r4, int r5) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.limitPosition = r4
                r0.offsetPosition = r5
                return
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery createQuery() {
                r1 = this;
                org.greenrobot.greendao.query.Query r0 = r1.createQuery()
                return r0
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected org.greenrobot.greendao.query.Query<T2> createQuery() {
                r9 = this;
                org.greenrobot.greendao.query.Query r8 = new org.greenrobot.greendao.query.Query
                org.greenrobot.greendao.AbstractDao<T, ?> r2 = r9.dao
                java.lang.String r3 = r9.sql
                java.lang.String[] r0 = r9.initialValues
                java.lang.Object r0 = r0.clone()
                r4 = r0
                java.lang.String[] r4 = (java.lang.String[]) r4
                int r5 = r9.limitPosition
                int r6 = r9.offsetPosition
                r7 = 0
                r0 = r8
                r1 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }
    }

    private Query(org.greenrobot.greendao.query.Query.QueryData<T> r7, org.greenrobot.greendao.AbstractDao<T, ?> r8, java.lang.String r9, java.lang.String[] r10, int r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.queryData = r7
            return
    }

    /* synthetic */ Query(org.greenrobot.greendao.query.Query.QueryData r1, org.greenrobot.greendao.AbstractDao r2, java.lang.String r3, java.lang.String[] r4, int r5, int r6, org.greenrobot.greendao.query.Query.C12141 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    static <T2> org.greenrobot.greendao.query.Query<T2> create(org.greenrobot.greendao.AbstractDao<T2, ?> r7, java.lang.String r8, java.lang.Object[] r9, int r10, int r11) {
            org.greenrobot.greendao.query.Query$QueryData r6 = new org.greenrobot.greendao.query.Query$QueryData
            java.lang.String[] r3 = toStringArray(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            org.greenrobot.greendao.query.AbstractQuery r7 = r6.forCurrentThread()
            org.greenrobot.greendao.query.Query r7 = (org.greenrobot.greendao.query.Query) r7
            return r7
    }

    public static <T2> org.greenrobot.greendao.query.Query<T2> internalCreate(org.greenrobot.greendao.AbstractDao<T2, ?> r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = -1
            org.greenrobot.greendao.query.Query r1 = create(r1, r2, r3, r0, r0)
            return r1
    }

    public org.greenrobot.greendao.p004rx.RxQuery __InternalRx() {
            r2 = this;
            org.greenrobot.greendao.rx.RxQuery r0 = r2.rxTxIo
            if (r0 != 0) goto Lf
            org.greenrobot.greendao.rx.RxQuery r0 = new org.greenrobot.greendao.rx.RxQuery
            rx.Scheduler r1 = rx.schedulers.Schedulers.io()
            r0.<init>(r2, r1)
            r2.rxTxIo = r0
        Lf:
            org.greenrobot.greendao.rx.RxQuery r0 = r2.rxTxIo
            return r0
    }

    public org.greenrobot.greendao.p004rx.RxQuery __internalRxPlain() {
            r1 = this;
            org.greenrobot.greendao.rx.RxQuery r0 = r1.rxTxPlain
            if (r0 != 0) goto Lb
            org.greenrobot.greendao.rx.RxQuery r0 = new org.greenrobot.greendao.rx.RxQuery
            r0.<init>(r1)
            r1.rxTxPlain = r0
        Lb:
            org.greenrobot.greendao.rx.RxQuery r0 = r1.rxTxPlain
            return r0
    }

    public org.greenrobot.greendao.query.Query<T> forCurrentThread() {
            r1 = this;
            org.greenrobot.greendao.query.Query$QueryData<T> r0 = r1.queryData
            org.greenrobot.greendao.query.AbstractQuery r0 = r0.forCurrentThread(r1)
            org.greenrobot.greendao.query.Query r0 = (org.greenrobot.greendao.query.Query) r0
            return r0
    }

    public java.util.List<T> list() {
            r3 = this;
            r3.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r3.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.String r1 = r3.sql
            java.lang.String[] r2 = r3.parameters
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            org.greenrobot.greendao.InternalQueryDaoAccess<T> r1 = r3.daoAccess
            java.util.List r0 = r1.loadAllAndCloseCursor(r0)
            return r0
    }

    public org.greenrobot.greendao.query.CloseableListIterator<T> listIterator() {
            r1 = this;
            org.greenrobot.greendao.query.LazyList r0 = r1.listLazyUncached()
            org.greenrobot.greendao.query.CloseableListIterator r0 = r0.listIteratorAutoClose()
            return r0
    }

    public org.greenrobot.greendao.query.LazyList<T> listLazy() {
            r4 = this;
            r4.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r4.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.String r1 = r4.sql
            java.lang.String[] r2 = r4.parameters
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            org.greenrobot.greendao.query.LazyList r1 = new org.greenrobot.greendao.query.LazyList
            org.greenrobot.greendao.InternalQueryDaoAccess<T> r2 = r4.daoAccess
            r3 = 1
            r1.<init>(r2, r0, r3)
            return r1
    }

    public org.greenrobot.greendao.query.LazyList<T> listLazyUncached() {
            r4 = this;
            r4.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r4.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.String r1 = r4.sql
            java.lang.String[] r2 = r4.parameters
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            org.greenrobot.greendao.query.LazyList r1 = new org.greenrobot.greendao.query.LazyList
            org.greenrobot.greendao.InternalQueryDaoAccess<T> r2 = r4.daoAccess
            r3 = 0
            r1.<init>(r2, r0, r3)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit
    public /* bridge */ /* synthetic */ void setLimit(int r1) {
            r0 = this;
            super.setLimit(r1)
            return
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit
    public /* bridge */ /* synthetic */ void setOffset(int r1) {
            r0 = this;
            super.setOffset(r1)
            return
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.Query r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.Query r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.Query r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQueryWithLimit setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.Query r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.Query<T> setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.Query r1 = (org.greenrobot.greendao.query.Query) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.Query<T> setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQueryWithLimit r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.Query r1 = (org.greenrobot.greendao.query.Query) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.Query<T> setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.Query r1 = (org.greenrobot.greendao.query.Query) r1
            return r1
    }

    public T unique() {
            r3 = this;
            r3.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r3.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.String r1 = r3.sql
            java.lang.String[] r2 = r3.parameters
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            org.greenrobot.greendao.InternalQueryDaoAccess<T> r1 = r3.daoAccess
            java.lang.Object r0 = r1.loadUniqueAndCloseCursor(r0)
            return r0
    }

    public T uniqueOrThrow() {
            r2 = this;
            java.lang.Object r0 = r2.unique()
            if (r0 == 0) goto L7
            return r0
        L7:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.String r1 = "No entity found for query"
            r0.<init>(r1)
            throw r0
    }
}
