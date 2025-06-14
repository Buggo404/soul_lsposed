package org.greenrobot.greendao.database;

/* loaded from: classes.dex */
class SqlCipherEncryptedHelper extends net.sqlcipher.database.SQLiteOpenHelper implements org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper {
    private final org.greenrobot.greendao.database.DatabaseOpenHelper delegate;

    public SqlCipherEncryptedHelper(org.greenrobot.greendao.database.DatabaseOpenHelper r2, android.content.Context r3, java.lang.String r4, int r5, boolean r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r4, r0, r5)
            r1.delegate = r2
            if (r6 == 0) goto Lb
            net.sqlcipher.database.SQLiteDatabase.loadLibs(r3)
        Lb:
            return
    }

    private org.greenrobot.greendao.database.Database wrap(net.sqlcipher.database.SQLiteDatabase r2) {
            r1 = this;
            org.greenrobot.greendao.database.EncryptedDatabase r0 = new org.greenrobot.greendao.database.EncryptedDatabase
            r0.<init>(r2)
            return r0
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper
    public org.greenrobot.greendao.database.Database getEncryptedReadableDb(java.lang.String r1) {
            r0 = this;
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getReadableDatabase(r1)
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            return r1
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper
    public org.greenrobot.greendao.database.Database getEncryptedReadableDb(char[] r1) {
            r0 = this;
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getReadableDatabase(r1)
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            return r1
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper
    public org.greenrobot.greendao.database.Database getEncryptedWritableDb(java.lang.String r1) {
            r0 = this;
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getWritableDatabase(r1)
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            return r1
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper
    public org.greenrobot.greendao.database.Database getEncryptedWritableDb(char[] r1) {
            r0 = this;
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getWritableDatabase(r1)
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            return r1
    }

    public void onCreate(net.sqlcipher.database.SQLiteDatabase r2) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper r0 = r1.delegate
            org.greenrobot.greendao.database.Database r2 = r1.wrap(r2)
            r0.onCreate(r2)
            return
    }

    public void onOpen(net.sqlcipher.database.SQLiteDatabase r2) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper r0 = r1.delegate
            org.greenrobot.greendao.database.Database r2 = r1.wrap(r2)
            r0.onOpen(r2)
            return
    }

    public void onUpgrade(net.sqlcipher.database.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper r0 = r1.delegate
            org.greenrobot.greendao.database.Database r2 = r1.wrap(r2)
            r0.onUpgrade(r2, r3, r4)
            return
    }
}
