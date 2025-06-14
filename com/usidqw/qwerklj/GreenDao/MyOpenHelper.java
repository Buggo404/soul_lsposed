package com.usidqw.qwerklj.GreenDao;

/* loaded from: classes.dex */
public class MyOpenHelper extends com.usidqw.qwerklj.GreenDao.dao.DaoMaster.OpenHelper {


    public MyOpenHelper(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public MyOpenHelper(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
    public void onUpgrade(org.greenrobot.greendao.database.Database r3, int r4, int r5) {
            r2 = this;
            super.onUpgrade(r3, r4, r5)
            com.usidqw.qwerklj.GreenDao.MyOpenHelper$1 r4 = new com.usidqw.qwerklj.GreenDao.MyOpenHelper$1
            r4.<init>(r2)
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]
            r0 = 0
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.ConfigDao> r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.class
            r5[r0] = r1
            r0 = 1
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.RecordLogDao> r1 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.class
            r5[r0] = r1
            r0 = 2
            java.lang.Class<com.usidqw.qwerklj.GreenDao.dao.UserConfigDao> r1 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.class
            r5[r0] = r1
            com.github.yuweiguocn.library.greendao.MigrationHelper.migrate(r3, r4, r5)
            return
    }
}
