package com.usidqw.qwerklj.GreenDao.dao;

/* loaded from: classes.dex */
public class DaoMaster extends org.greenrobot.greendao.AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 3;

    public static class DevOpenHelper extends com.usidqw.qwerklj.GreenDao.dao.DaoMaster.OpenHelper {
        public DevOpenHelper(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public DevOpenHelper(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onUpgrade(org.greenrobot.greendao.database.Database r3, int r4, int r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Upgrading schema from version "
                r0.<init>(r1)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r0 = " to "
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r5 = " by dropping all tables"
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "greenDAO"
                android.util.Log.i(r5, r4)
                r4 = 1
                com.usidqw.qwerklj.GreenDao.dao.DaoMaster.dropAllTables(r3, r4)
                r2.onCreate(r3)
                return
        }
    }

    public static abstract class OpenHelper extends org.greenrobot.greendao.database.DatabaseOpenHelper {
        public OpenHelper(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = 3
                r1.<init>(r2, r3, r0)
                return
        }

        public OpenHelper(android.content.Context r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase.CursorFactory r4) {
                r1 = this;
                r0 = 3
                r1.<init>(r2, r3, r4, r0)
                return
        }

        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onCreate(org.greenrobot.greendao.database.Database r3) {
                r2 = this;
                java.lang.String r0 = "greenDAO"
                java.lang.String r1 = "Creating tables for schema version 3"
                android.util.Log.i(r0, r1)
                r0 = 0
                com.usidqw.qwerklj.GreenDao.dao.DaoMaster.createAllTables(r3, r0)
                return
        }
    }

    public DaoMaster(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            org.greenrobot.greendao.database.StandardDatabase r0 = new org.greenrobot.greendao.database.StandardDatabase
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public DaoMaster(org.greenrobot.greendao.database.Database r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r2, r0)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.ConfigDao> r2 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.class
            r1.registerDaoClass(r2)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.RecordLogDao> r2 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.class
            r1.registerDaoClass(r2)
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.UserConfigDao> r2 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.class
            r1.registerDaoClass(r2)
            return
    }

    public static void createAllTables(org.greenrobot.greendao.database.Database r0, boolean r1) {
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao.createTable(r0, r1)
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.createTable(r0, r1)
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.createTable(r0, r1)
            return
    }

    public static void dropAllTables(org.greenrobot.greendao.database.Database r0, boolean r1) {
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao.dropTable(r0, r1)
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.dropTable(r0, r1)
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.dropTable(r0, r1)
            return
    }

    public static com.usidqw.qwerklj.GreenDao.dao.DaoSession newDevSession(android.content.Context r1, java.lang.String r2) {
            com.usidqw.qwerklj.GreenDao.dao.DaoMaster$DevOpenHelper r0 = new com.usidqw.qwerklj.GreenDao.dao.DaoMaster$DevOpenHelper
            r0.<init>(r1, r2)
            org.greenrobot.greendao.database.Database r1 = r0.getWritableDb()
            com.usidqw.qwerklj.GreenDao.dao.DaoMaster r2 = new com.usidqw.qwerklj.GreenDao.dao.DaoMaster
            r2.<init>(r1)
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r2.newSession()
            return r1
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public com.usidqw.qwerklj.GreenDao.dao.DaoSession newSession() {
            r4 = this;
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = new com.usidqw.qwerklj.GreenDao.dao.DaoSession
            org.greenrobot.greendao.database.Database r1 = r4.f615db
            org.greenrobot.greendao.identityscope.IdentityScopeType r2 = org.greenrobot.greendao.identityscope.IdentityScopeType.Session
            java.util.Map<java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>, org.greenrobot.greendao.internal.DaoConfig> r3 = r4.daoConfigMap
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public com.usidqw.qwerklj.GreenDao.dao.DaoSession newSession(org.greenrobot.greendao.identityscope.IdentityScopeType r4) {
            r3 = this;
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = new com.usidqw.qwerklj.GreenDao.dao.DaoSession
            org.greenrobot.greendao.database.Database r1 = r3.f615db
            java.util.Map<java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>, org.greenrobot.greendao.internal.DaoConfig> r2 = r3.daoConfigMap
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.AbstractDaoSession newSession() {
            r1 = this;
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r1.newSession()
            return r0
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.AbstractDaoSession newSession(org.greenrobot.greendao.identityscope.IdentityScopeType r1) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r0.newSession(r1)
            return r1
    }
}
