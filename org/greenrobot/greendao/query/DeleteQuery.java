package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class DeleteQuery<T> extends org.greenrobot.greendao.query.AbstractQuery<T> {
    private final org.greenrobot.greendao.query.DeleteQuery.QueryData<T> queryData;

    /* renamed from: org.greenrobot.greendao.query.DeleteQuery$1 */
    static /* synthetic */ class C12131 {
    }

    private static final class QueryData<T2> extends org.greenrobot.greendao.query.AbstractQueryData<T2, org.greenrobot.greendao.query.DeleteQuery<T2>> {
        private QueryData(org.greenrobot.greendao.AbstractDao<T2, ?> r1, java.lang.String r2, java.lang.String[] r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        /* synthetic */ QueryData(org.greenrobot.greendao.AbstractDao r1, java.lang.String r2, java.lang.String[] r3, org.greenrobot.greendao.query.DeleteQuery.C12131 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery createQuery() {
                r1 = this;
                org.greenrobot.greendao.query.DeleteQuery r0 = r1.createQuery()
                return r0
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        protected org.greenrobot.greendao.query.DeleteQuery<T2> createQuery() {
                r7 = this;
                org.greenrobot.greendao.query.DeleteQuery r6 = new org.greenrobot.greendao.query.DeleteQuery
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

    private DeleteQuery(org.greenrobot.greendao.query.DeleteQuery.QueryData<T> r1, org.greenrobot.greendao.AbstractDao<T, ?> r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.queryData = r1
            return
    }

    /* synthetic */ DeleteQuery(org.greenrobot.greendao.query.DeleteQuery.QueryData r1, org.greenrobot.greendao.AbstractDao r2, java.lang.String r3, java.lang.String[] r4, org.greenrobot.greendao.query.DeleteQuery.C12131 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static <T2> org.greenrobot.greendao.query.DeleteQuery<T2> create(org.greenrobot.greendao.AbstractDao<T2, ?> r2, java.lang.String r3, java.lang.Object[] r4) {
            org.greenrobot.greendao.query.DeleteQuery$QueryData r0 = new org.greenrobot.greendao.query.DeleteQuery$QueryData
            java.lang.String[] r4 = toStringArray(r4)
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            org.greenrobot.greendao.query.AbstractQuery r2 = r0.forCurrentThread()
            org.greenrobot.greendao.query.DeleteQuery r2 = (org.greenrobot.greendao.query.DeleteQuery) r2
            return r2
    }

    public void executeDeleteWithoutDetachingEntities() {
            r4 = this;
            r4.checkThread()
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r4.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            boolean r1 = r0.isDbLockedByCurrentThread()
            if (r1 == 0) goto L1d
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r4.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.String r1 = r4.sql
            java.lang.String[] r2 = r4.parameters
            r0.execSQL(r1, r2)
            goto L33
        L1d:
            r0.beginTransaction()
            org.greenrobot.greendao.AbstractDao<T, ?> r1 = r4.dao     // Catch: java.lang.Throwable -> L34
            org.greenrobot.greendao.database.Database r1 = r1.getDatabase()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r4.sql     // Catch: java.lang.Throwable -> L34
            java.lang.String[] r3 = r4.parameters     // Catch: java.lang.Throwable -> L34
            r1.execSQL(r2, r3)     // Catch: java.lang.Throwable -> L34
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L34
            r0.endTransaction()
        L33:
            return
        L34:
            r1 = move-exception
            r0.endTransaction()
            throw r1
    }

    public org.greenrobot.greendao.query.DeleteQuery<T> forCurrentThread() {
            r1 = this;
            org.greenrobot.greendao.query.DeleteQuery$QueryData<T> r0 = r1.queryData
            org.greenrobot.greendao.query.AbstractQuery r0 = r0.forCurrentThread(r1)
            org.greenrobot.greendao.query.DeleteQuery r0 = (org.greenrobot.greendao.query.DeleteQuery) r0
            return r0
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.DeleteQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.DeleteQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.DeleteQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.DeleteQuery<T> setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.DeleteQuery r1 = (org.greenrobot.greendao.query.DeleteQuery) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.DeleteQuery<T> setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.DeleteQuery r1 = (org.greenrobot.greendao.query.DeleteQuery) r1
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.DeleteQuery<T> setParameter(int r1, java.util.Date r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQuery r1 = super.setParameter(r1, r2)
            org.greenrobot.greendao.query.DeleteQuery r1 = (org.greenrobot.greendao.query.DeleteQuery) r1
            return r1
    }
}
