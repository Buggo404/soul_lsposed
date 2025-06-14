package org.greenrobot.greendao.test;

import org.greenrobot.greendao.AbstractDao;

/* loaded from: classes.dex */
public abstract class AbstractDaoTestLongPk<D extends org.greenrobot.greendao.AbstractDao<T, java.lang.Long>, T> extends org.greenrobot.greendao.test.AbstractDaoTestSinglePk<D, T, java.lang.Long> {
    public AbstractDaoTestLongPk(java.lang.Class<D> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.test.AbstractDaoTestSinglePk
    protected java.lang.Long createRandomPk() {
            r2 = this;
            java.util.Random r0 = r2.random
            long r0 = r0.nextLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // org.greenrobot.greendao.test.AbstractDaoTestSinglePk
    protected /* bridge */ /* synthetic */ java.lang.Long createRandomPk() {
            r1 = this;
            java.lang.Long r0 = r1.createRandomPk()
            return r0
    }

    public void testAssignPk() {
            r3 = this;
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r0 = r3.daoAccess
            boolean r0 = r0.isEntityUpdateable()
            if (r0 == 0) goto L68
            r0 = 0
            java.lang.Object r1 = r3.createEntity(r0)
            if (r1 == 0) goto L4d
            java.lang.Object r0 = r3.createEntity(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            r2.insert(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            r2.insert(r0)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r3.daoAccess
            java.lang.Object r1 = r2.getKey(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            assertNotNull(r1)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r3.daoAccess
            java.lang.Object r0 = r2.getKey(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            assertNotNull(r0)
            boolean r2 = r1.equals(r0)
            assertFalse(r2)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            java.lang.Object r1 = r2.load(r1)
            assertNotNull(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            java.lang.Object r0 = r1.load(r0)
            assertNotNull(r0)
            goto L7c
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Skipping testAssignPk for "
            r0.<init>(r1)
            java.lang.Class<D extends org.greenrobot.greendao.AbstractDao<T, K>> r1 = r3.daoClass
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " (createEntity returned null for null key)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.greenrobot.greendao.DaoLog.m100d(r0)
            goto L7c
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Skipping testAssignPk for not updateable "
            r0.<init>(r1)
            java.lang.Class<D extends org.greenrobot.greendao.AbstractDao<T, K>> r1 = r3.daoClass
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.greenrobot.greendao.DaoLog.m100d(r0)
        L7c:
            return
    }
}
