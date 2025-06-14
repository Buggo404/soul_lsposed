package org.greenrobot.greendao.test;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.AbstractDaoSession;

/* loaded from: classes.dex */
public abstract class AbstractDaoSessionTest<T extends org.greenrobot.greendao.AbstractDaoMaster, S extends org.greenrobot.greendao.AbstractDaoSession> extends org.greenrobot.greendao.test.DbTest {
    protected T daoMaster;
    private final java.lang.Class<T> daoMasterClass;
    protected S daoSession;

    public AbstractDaoSessionTest(java.lang.Class<T> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AbstractDaoSessionTest(java.lang.Class<T> r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            r0.daoMasterClass = r1
            return
    }

    @Override // org.greenrobot.greendao.test.DbTest
    protected void setUp() throws java.lang.Exception {
            r7 = this;
            super.setUp()
            java.lang.Class<T extends org.greenrobot.greendao.AbstractDaoMaster> r0 = r7.daoMasterClass     // Catch: java.lang.Exception -> L4b
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L4b
            java.lang.Class<org.greenrobot.greendao.database.Database> r3 = org.greenrobot.greendao.database.Database.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L4b
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L4b
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L4b
            org.greenrobot.greendao.database.Database r3 = r7.f621db     // Catch: java.lang.Exception -> L4b
            r2[r4] = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Exception -> L4b
            org.greenrobot.greendao.AbstractDaoMaster r0 = (org.greenrobot.greendao.AbstractDaoMaster) r0     // Catch: java.lang.Exception -> L4b
            r7.daoMaster = r0     // Catch: java.lang.Exception -> L4b
            java.lang.Class<T extends org.greenrobot.greendao.AbstractDaoMaster> r0 = r7.daoMasterClass     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = "createAllTables"
            r3 = 2
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4b
            java.lang.Class<org.greenrobot.greendao.database.Database> r6 = org.greenrobot.greendao.database.Database.class
            r5[r4] = r6     // Catch: java.lang.Exception -> L4b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L4b
            r5[r1] = r6     // Catch: java.lang.Exception -> L4b
            java.lang.reflect.Method r0 = r0.getMethod(r2, r5)     // Catch: java.lang.Exception -> L4b
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L4b
            org.greenrobot.greendao.database.Database r3 = r7.f621db     // Catch: java.lang.Exception -> L4b
            r2[r4] = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L4b
            r2[r1] = r3     // Catch: java.lang.Exception -> L4b
            r1 = 0
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L4b
            T extends org.greenrobot.greendao.AbstractDaoMaster r0 = r7.daoMaster
            org.greenrobot.greendao.AbstractDaoSession r0 = r0.newSession()
            r7.daoSession = r0
            return
        L4b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not prepare DAO session test"
            r1.<init>(r2, r0)
            throw r1
    }
}
