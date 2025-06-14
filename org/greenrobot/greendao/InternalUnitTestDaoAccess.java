package org.greenrobot.greendao;

/* loaded from: classes.dex */
public class InternalUnitTestDaoAccess<T, K> {
    private final org.greenrobot.greendao.AbstractDao<T, K> dao;

    public InternalUnitTestDaoAccess(org.greenrobot.greendao.database.Database r4, java.lang.Class<org.greenrobot.greendao.AbstractDao<T, K>> r5, org.greenrobot.greendao.identityscope.IdentityScope<?, ?> r6) throws java.lang.Exception {
            r3 = this;
            r3.<init>()
            org.greenrobot.greendao.internal.DaoConfig r0 = new org.greenrobot.greendao.internal.DaoConfig
            r0.<init>(r4, r5)
            r0.setIdentityScope(r6)
            r4 = 1
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class<org.greenrobot.greendao.internal.DaoConfig> r1 = org.greenrobot.greendao.internal.DaoConfig.class
            r2 = 0
            r6[r2] = r1
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r0
            java.lang.Object r4 = r5.newInstance(r4)
            org.greenrobot.greendao.AbstractDao r4 = (org.greenrobot.greendao.AbstractDao) r4
            r3.dao = r4
            return
    }

    public org.greenrobot.greendao.AbstractDao<T, K> getDao() {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            return r0
    }

    public K getKey(T r2) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            java.lang.Object r2 = r0.getKey(r2)
            return r2
    }

    public org.greenrobot.greendao.Property[] getProperties() {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            org.greenrobot.greendao.Property[] r0 = r0.getProperties()
            return r0
    }

    public boolean isEntityUpdateable() {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            boolean r0 = r0.isEntityUpdateable()
            return r0
    }

    public T readEntity(android.database.Cursor r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            java.lang.Object r2 = r0.readEntity(r2, r3)
            return r2
    }

    public K readKey(android.database.Cursor r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, K> r0 = r1.dao
            java.lang.Object r2 = r0.readKey(r2, r3)
            return r2
    }
}
