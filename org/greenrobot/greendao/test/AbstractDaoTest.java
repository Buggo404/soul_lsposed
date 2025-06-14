package org.greenrobot.greendao.test;

import org.greenrobot.greendao.AbstractDao;

/* loaded from: classes.dex */
public abstract class AbstractDaoTest<D extends org.greenrobot.greendao.AbstractDao<T, K>, T, K> extends org.greenrobot.greendao.test.DbTest {
    protected D dao;
    protected org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> daoAccess;
    protected final java.lang.Class<D> daoClass;
    protected org.greenrobot.greendao.identityscope.IdentityScope<K, T> identityScopeForDao;
    protected org.greenrobot.greendao.Property pkColumn;

    public AbstractDaoTest(java.lang.Class<D> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AbstractDaoTest(java.lang.Class<D> r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            r0.daoClass = r1
            return
    }

    protected void clearIdentityScopeIfAny() {
            r1 = this;
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r1.identityScopeForDao
            if (r0 == 0) goto Ld
            r0.clear()
            java.lang.String r0 = "Identity scope cleared"
            org.greenrobot.greendao.DaoLog.m100d(r0)
            goto L12
        Ld:
            java.lang.String r0 = "No identity scope to clear"
            org.greenrobot.greendao.DaoLog.m100d(r0)
        L12:
            return
    }

    protected void logTableDump() {
            r1 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            java.lang.String r0 = r0.getTablename()
            r1.logTableDump(r0)
            return
    }

    public void setIdentityScopeBeforeSetUp(org.greenrobot.greendao.identityscope.IdentityScope<K, T> r1) {
            r0 = this;
            r0.identityScopeForDao = r1
            return
    }

    @Override // org.greenrobot.greendao.test.DbTest
    protected void setUp() throws java.lang.Exception {
            r4 = this;
            super.setUp()
            r4.setUpTableForDao()     // Catch: java.lang.Exception -> L1a
            org.greenrobot.greendao.InternalUnitTestDaoAccess r0 = new org.greenrobot.greendao.InternalUnitTestDaoAccess     // Catch: java.lang.Exception -> L1a
            org.greenrobot.greendao.database.Database r1 = r4.f621db     // Catch: java.lang.Exception -> L1a
            java.lang.Class<D extends org.greenrobot.greendao.AbstractDao<T, K>> r2 = r4.daoClass     // Catch: java.lang.Exception -> L1a
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r3 = r4.identityScopeForDao     // Catch: java.lang.Exception -> L1a
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L1a
            r4.daoAccess = r0     // Catch: java.lang.Exception -> L1a
            org.greenrobot.greendao.AbstractDao r0 = r0.getDao()     // Catch: java.lang.Exception -> L1a
            r4.dao = r0     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not prepare DAO Test"
            r1.<init>(r2, r0)
            throw r1
    }

    protected void setUpTableForDao() throws java.lang.Exception {
            r7 = this;
            java.lang.Class<D extends org.greenrobot.greendao.AbstractDao<T, K>> r0 = r7.daoClass     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.String r1 = "createTable"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class<org.greenrobot.greendao.database.Database> r4 = org.greenrobot.greendao.database.Database.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L26
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L26
            org.greenrobot.greendao.database.Database r2 = r7.f621db     // Catch: java.lang.NoSuchMethodException -> L26
            r1[r5] = r2     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.NoSuchMethodException -> L26
            r1[r6] = r2     // Catch: java.lang.NoSuchMethodException -> L26
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.NoSuchMethodException -> L26
            goto L2b
        L26:
            java.lang.String r0 = "No createTable method"
            org.greenrobot.greendao.DaoLog.m104i(r0)
        L2b:
            return
    }
}
