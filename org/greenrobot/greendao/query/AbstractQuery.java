package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
abstract class AbstractQuery<T> {
    protected final org.greenrobot.greendao.AbstractDao<T, ?> dao;
    protected final org.greenrobot.greendao.InternalQueryDaoAccess<T> daoAccess;
    protected final java.lang.Thread ownerThread;
    protected final java.lang.String[] parameters;
    protected final java.lang.String sql;

    protected AbstractQuery(org.greenrobot.greendao.AbstractDao<T, ?> r2, java.lang.String r3, java.lang.String[] r4) {
            r1 = this;
            r1.<init>()
            r1.dao = r2
            org.greenrobot.greendao.InternalQueryDaoAccess r0 = new org.greenrobot.greendao.InternalQueryDaoAccess
            r0.<init>(r2)
            r1.daoAccess = r0
            r1.sql = r3
            r1.parameters = r4
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.ownerThread = r2
            return
    }

    protected static java.lang.String[] toStringArray(java.lang.Object[] r4) {
            int r0 = r4.length
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L17
            r3 = r4[r2]
            if (r3 == 0) goto L11
            java.lang.String r3 = r3.toString()
            r1[r2] = r3
            goto L14
        L11:
            r3 = 0
            r1[r2] = r3
        L14:
            int r2 = r2 + 1
            goto L4
        L17:
            return r1
    }

    protected void checkThread() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r2.ownerThread
            if (r0 != r1) goto L9
            return
        L9:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.String r1 = "Method may be called only in owner thread, use forCurrentThread to get an instance for this thread"
            r0.<init>(r1)
            throw r0
    }

    public org.greenrobot.greendao.query.AbstractQuery<T> setParameter(int r1, java.lang.Boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lb
            boolean r2 = r2.booleanValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            org.greenrobot.greendao.query.AbstractQuery r1 = r0.setParameter(r1, r2)
            return r1
    }

    public org.greenrobot.greendao.query.AbstractQuery<T> setParameter(int r2, java.lang.Object r3) {
            r1 = this;
            r1.checkThread()
            if (r3 == 0) goto Le
            java.lang.String[] r0 = r1.parameters
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            goto L13
        Le:
            java.lang.String[] r3 = r1.parameters
            r0 = 0
            r3[r2] = r0
        L13:
            return r1
    }

    public org.greenrobot.greendao.query.AbstractQuery<T> setParameter(int r3, java.util.Date r4) {
            r2 = this;
            if (r4 == 0) goto Lb
            long r0 = r4.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto Lc
        Lb:
            r4 = 0
        Lc:
            org.greenrobot.greendao.query.AbstractQuery r3 = r2.setParameter(r3, r4)
            return r3
    }
}
