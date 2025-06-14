package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class CountQuery<T> extends org.greenrobot.greendao.query.AbstractQuery<T> {
    private final org.greenrobot.greendao.query.CountQuery.QueryData<T> queryData;

    /* renamed from: org.greenrobot.greendao.query.CountQuery$1 */
    static /* synthetic */ class C12111 {
    }

    private static final class QueryData<T2> extends org.greenrobot.greendao.query.AbstractQueryData<T2, org.greenrobot.greendao.query.CountQuery<T2>> {
        private QueryData(org.greenrobot.greendao.AbstractDao<T2, ?> r1, java.lang.String r2, java.lang.String[] r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        /* synthetic */ QueryData(org.greenrobot.greendao.AbstractDao r1, java.lang.String r2, java.lang.String[] r3, org.greenrobot.greendao.query.CountQuery.C12111 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery createQuery() {
                r1 = this;
                org.greenrobot.greendao.query.CountQuery r0 = r1.createQuery()
                return r0
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected org.greenrobot.greendao.query.CountQuery<T2> createQuery() {
                r7 = this;
                org.greenrobot.greendao.query.CountQuery r6 = new org.greenrobot.greendao.query.CountQuery
                org.greenrobot.greendao.AbstractDao<T, ?> r2 = r7.dao
                java.lang.String r3 = r7.sql
                java.lang.String[] r0 = r7.initialValues
                java.lang.Object r0 = r0.clone()
                r4 = r0
                java.lang.String[] r4 = (java.lang.String[]) r4
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    private CountQuery(org.greenrobot.greendao.query.CountQuery.QueryData<T> r1, org.greenrobot.greendao.AbstractDao<T, ?> r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.queryData = r1
            return
    }

    /* synthetic */ CountQuery(org.greenrobot.greendao.query.CountQuery.QueryData r1, org.greenrobot.greendao.AbstractDao r2, java.lang.String r3, java.lang.String[] r4, org.greenrobot.greendao.query.CountQuery.C12111 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static <T2> org.greenrobot.greendao.query.CountQuery<T2> create(org.greenrobot.greendao.AbstractDao<T2, ?> r2, java.lang.String r3, java.lang.Object[] r4) {
            org.greenrobot.greendao.query.CountQuery$QueryData r0 = new org.greenrobot.greendao.query.CountQuery$QueryData
            java.lang.String[] r4 = toStringArray(r4)
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            org.greenrobot.greendao.query.AbstractQuery r2 = r0.forCurrentThread()
            org.greenrobot.greendao.query.CountQuery r2 = (org.greenrobot.greendao.query.CountQuery) r2
            return r2
    }

    public long count() {
            r5 = this;
            java.lang.String r0 = "Unexpected column count: "
            java.lang.String r1 = "Unexpected row count: "
            r5.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r2 = r5.dao
            org.greenrobot.greendao.database.Database r2 = r2.getDatabase()
            java.lang.String r3 = r5.sql
            java.lang.String[] r4 = r5.parameters
            android.database.Cursor r2 = r2.rawQuery(r3, r4)
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L5f
            boolean r3 = r2.isLast()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L48
            int r1 = r2.getColumnCount()     // Catch: java.lang.Throwable -> L67
            r3 = 1
            if (r1 != r3) goto L31
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L67
            r2.close()
            return r0
        L31:
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L67
            int r0 = r2.getColumnCount()     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L67
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L67
            throw r1     // Catch: java.lang.Throwable -> L67
        L48:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L67
            int r1 = r2.getCount()     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L67
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L67
        L5f:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "No result for count"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L67
        L67:
            r0 = move-exception
            r2.close()
            throw r0
    }

    public org.greenrobot.greendao.query.CountQuery<T> forCurrentThread() {
            r1 = this;
            org.greenrobot.greendao.query.CountQuery$QueryData<T> r0 = r1.queryData
            org.greenrobot.greendao.query.AbstractQuery r0 = r0.forCurrentThread(r1)
            org.greenrobot.greendao.query.CountQuery r0 = (org.greenrobot.greendao.query.CountQuery) r0
            return r0
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.CountQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.CountQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.CountQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.CountQuery<T> setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.CountQuery r1 = (org.greenrobot.greendao.query.CountQuery) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.CountQuery<T> setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.CountQuery r1 = (org.greenrobot.greendao.query.CountQuery) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.CountQuery<T> setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.CountQuery r1 = (org.greenrobot.greendao.query.CountQuery) r1
            return r1
    }
}
