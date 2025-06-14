package org.greenrobot.greendao;

/* loaded from: classes.dex */
public abstract class AbstractDaoMaster {
    protected final java.util.Map<java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>, org.greenrobot.greendao.internal.DaoConfig> daoConfigMap;

    /* renamed from: db */
    protected final org.greenrobot.greendao.database.Database f615db;
    protected final int schemaVersion;

    public AbstractDaoMaster(org.greenrobot.greendao.database.Database r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f615db = r1
            r0.schemaVersion = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.daoConfigMap = r1
            return
    }

    public org.greenrobot.greendao.database.Database getDatabase() {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r1.f615db
            return r0
    }

    public int getSchemaVersion() {
            r1 = this;
            int r0 = r1.schemaVersion
            return r0
    }

    public abstract org.greenrobot.greendao.AbstractDaoSession newSession();

    public abstract org.greenrobot.greendao.AbstractDaoSession newSession(org.greenrobot.greendao.identityscope.IdentityScopeType r1);

    protected void registerDaoClass(java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>> r3) {
            r2 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = new org.greenrobot.greendao.internal.DaoConfig
            org.greenrobot.greendao.database.Database r1 = r2.f615db
            r0.<init>(r1, r3)
            java.util.Map<java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>, org.greenrobot.greendao.internal.DaoConfig> r1 = r2.daoConfigMap
            r1.put(r3, r0)
            return
    }
}
