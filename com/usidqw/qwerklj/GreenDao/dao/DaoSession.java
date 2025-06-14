package com.usidqw.qwerklj.GreenDao.dao;

/* loaded from: classes.dex */
public class DaoSession extends org.greenrobot.greendao.AbstractDaoSession {
    private final com.usidqw.qwerklj.GreenDao.dao.ConfigDao configDao;
    private final org.greenrobot.greendao.internal.DaoConfig configDaoConfig;
    private final com.usidqw.qwerklj.GreenDao.dao.RecordLogDao recordLogDao;
    private final org.greenrobot.greendao.internal.DaoConfig recordLogDaoConfig;
    private final com.usidqw.qwerklj.GreenDao.dao.UserConfigDao userConfigDao;
    private final org.greenrobot.greendao.internal.DaoConfig userConfigDaoConfig;

    public DaoSession(org.greenrobot.greendao.database.Database r3, org.greenrobot.greendao.identityscope.IdentityScopeType r4, java.util.Map<java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>, org.greenrobot.greendao.internal.DaoConfig> r5) {
            r2 = this;
            r2.<init>(r3)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.ConfigDao> r3 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.class
            java.lang.Object r3 = r5.get(r3)
            org.greenrobot.greendao.internal.DaoConfig r3 = (org.greenrobot.greendao.internal.DaoConfig) r3
            org.greenrobot.greendao.internal.DaoConfig r3 = r3.m358clone()
            r2.configDaoConfig = r3
            r3.initIdentityScope(r4)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.RecordLogDao> r0 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.class
            java.lang.Object r0 = r5.get(r0)
            org.greenrobot.greendao.internal.DaoConfig r0 = (org.greenrobot.greendao.internal.DaoConfig) r0
            org.greenrobot.greendao.internal.DaoConfig r0 = r0.m358clone()
            r2.recordLogDaoConfig = r0
            r0.initIdentityScope(r4)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.UserConfigDao> r1 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.class
            java.lang.Object r5 = r5.get(r1)
            org.greenrobot.greendao.internal.DaoConfig r5 = (org.greenrobot.greendao.internal.DaoConfig) r5
            org.greenrobot.greendao.internal.DaoConfig r5 = r5.m358clone()
            r2.userConfigDaoConfig = r5
            r5.initIdentityScope(r4)
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r4 = new com.usidqw.qwerklj.GreenDao.dao.ConfigDao
            r4.<init>(r3, r2)
            r2.configDao = r4
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao r3 = new com.usidqw.qwerklj.GreenDao.dao.RecordLogDao
            r3.<init>(r0, r2)
            r2.recordLogDao = r3
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r0 = new com.usidqw.qwerklj.GreenDao.dao.UserConfigDao
            r0.<init>(r5, r2)
            r2.userConfigDao = r0
            java.lang.Class<com.usidqw.qwerklj.GreenDao.db.Config> r5 = com.usidqw.qwerklj.GreenDao.p001db.Config.class
            r2.registerDao(r5, r4)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.db.RecordLog> r4 = com.usidqw.qwerklj.GreenDao.p001db.RecordLog.class
            r2.registerDao(r4, r3)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.db.UserConfig> r3 = com.usidqw.qwerklj.GreenDao.p001db.UserConfig.class
            r2.registerDao(r3, r0)
            return
    }

    public void clear() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.configDaoConfig
            r0.clearIdentityScope()
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.recordLogDaoConfig
            r0.clearIdentityScope()
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.userConfigDaoConfig
            r0.clearIdentityScope()
            return
    }

    public com.usidqw.qwerklj.GreenDao.dao.ConfigDao getConfigDao() {
            r1 = this;
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r1.configDao
            return r0
    }

    public com.usidqw.qwerklj.GreenDao.dao.RecordLogDao getRecordLogDao() {
            r1 = this;
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao r0 = r1.recordLogDao
            return r0
    }

    public com.usidqw.qwerklj.GreenDao.dao.UserConfigDao getUserConfigDao() {
            r1 = this;
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r0 = r1.userConfigDao
            return r0
    }
}
