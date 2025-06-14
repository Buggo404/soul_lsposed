package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class CursorQuery<T> extends org.greenrobot.greendao.query.AbstractQueryWithLimit<T> {
    private final org.greenrobot.greendao.query.CursorQuery.QueryData<T> queryData;

    /* renamed from: org.greenrobot.greendao.query.CursorQuery$1 */
    static /* synthetic */ class C12121 {
    }

    private static final class QueryData<T2> extends org.greenrobot.greendao.query.AbstractQueryData<T2, org.greenrobot.greendao.query.CursorQuery<T2>> {
        private final int limitPosition;
        private final int offsetPosition;

        QueryData(org.greenrobot.greendao.AbstractDao r1, java.lang.String r2, java.lang.String[] r3, int r4, int r5) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.limitPosition = r4
                r0.offsetPosition = r5
                return
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery createQuery() {
                r1 = this;
                org.greenrobot.greendao.query.CursorQuery r0 = r1.createQuery()
                return r0
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected org.greenrobot.greendao.query.CursorQuery<T2> createQuery() {
                r9 = this;
                org.greenrobot.greendao.query.CursorQuery r8 = new org.greenrobot.greendao.query.CursorQuery
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

    private CursorQuery(org.greenrobot.greendao.query.CursorQuery.QueryData<T> r7, org.greenrobot.greendao.AbstractDao<T, ?> r8, java.lang.String r9, java.lang.String[] r10, int r11, int r12) {
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

    /* synthetic */ CursorQuery(org.greenrobot.greendao.query.CursorQuery.QueryData r1, org.greenrobot.greendao.AbstractDao r2, java.lang.String r3, java.lang.String[] r4, int r5, int r6, org.greenrobot.greendao.query.CursorQuery.C12121 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    static <T2> org.greenrobot.greendao.query.CursorQuery<T2> create(org.greenrobot.greendao.AbstractDao<T2, ?> r7, java.lang.String r8, java.lang.Object[] r9, int r10, int r11) {
            org.greenrobot.greendao.query.CursorQuery$QueryData r6 = new org.greenrobot.greendao.query.CursorQuery$QueryData
            java.lang.String[] r3 = toStringArray(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            org.greenrobot.greendao.query.AbstractQuery r7 = r6.forCurrentThread()
            org.greenrobot.greendao.query.CursorQuery r7 = (org.greenrobot.greendao.query.CursorQuery) r7
            return r7
    }

    public static <T2> org.greenrobot.greendao.query.CursorQuery<T2> internalCreate(org.greenrobot.greendao.AbstractDao<T2, ?> r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = -1
            org.greenrobot.greendao.query.CursorQuery r1 = create(r1, r2, r3, r0, r0)
            return r1
    }

    public org.greenrobot.greendao.query.CursorQuery forCurrentThread() {
            r1 = this;
            org.greenrobot.greendao.query.CursorQuery$QueryData<T> r0 = r1.queryData
            org.greenrobot.greendao.query.AbstractQuery r0 = r0.forCurrentThread(r1)
            org.greenrobot.greendao.query.CursorQuery r0 = (org.greenrobot.greendao.query.CursorQuery) r0
            return r0
    }

    public android.database.Cursor query() {
            r3 = this;
            r3.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r3.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.String r1 = r3.sql
            java.lang.String[] r2 = r3.parameters
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            return r0
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
            org.greenrobot.greendao.query.CursorQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.CursorQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.CursorQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQueryWithLimit setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.CursorQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.CursorQuery<T> setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.CursorQuery r1 = (org.greenrobot.greendao.query.CursorQuery) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.CursorQuery<T> setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQueryWithLimit r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.CursorQuery r1 = (org.greenrobot.greendao.query.CursorQuery) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.CursorQuery<T> setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.CursorQuery r1 = (org.greenrobot.greendao.query.CursorQuery) r1
            return r1
    }
}
