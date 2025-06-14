package org.greenrobot.greendao.database;

/* loaded from: classes.dex */
public class EncryptedDatabase implements org.greenrobot.greendao.database.Database {
    private final net.sqlcipher.database.SQLiteDatabase delegate;

    public EncryptedDatabase(net.sqlcipher.database.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    @Override // org.greenrobot.greendao.database.Database
    public void beginTransaction() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            r0.beginTransaction()
            return
    }

    @Override // org.greenrobot.greendao.database.Database
    public void close() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            r0.close()
            return
    }

    @Override // org.greenrobot.greendao.database.Database
    public org.greenrobot.greendao.database.DatabaseStatement compileStatement(java.lang.String r3) {
            r2 = this;
            org.greenrobot.greendao.database.EncryptedDatabaseStatement r0 = new org.greenrobot.greendao.database.EncryptedDatabaseStatement
            net.sqlcipher.database.SQLiteDatabase r1 = r2.delegate
            net.sqlcipher.database.SQLiteStatement r3 = r1.compileStatement(r3)
            r0.<init>(r3)
            return r0
    }

    @Override // org.greenrobot.greendao.database.Database
    public void endTransaction() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            r0.endTransaction()
            return
    }

    @Override // org.greenrobot.greendao.database.Database
    public void execSQL(java.lang.String r2) throws android.database.SQLException {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            r0.execSQL(r2)
            return
    }

    @Override // org.greenrobot.greendao.database.Database
    public void execSQL(java.lang.String r2, java.lang.Object[] r3) throws android.database.SQLException {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            r0.execSQL(r2, r3)
            return
    }

    @Override // org.greenrobot.greendao.database.Database
    public java.lang.Object getRawDatabase() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            return r0
    }

    public net.sqlcipher.database.SQLiteDatabase getSQLiteDatabase() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            return r0
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean inTransaction() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.inTransaction()
            return r0
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean isDbLockedByCurrentThread() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isDbLockedByCurrentThread()
            return r0
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean isOpen() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // org.greenrobot.greendao.database.Database
    public android.database.Cursor rawQuery(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            net.sqlcipher.Cursor r2 = r0.rawQuery(r2, r3)
            return r2
    }

    @Override // org.greenrobot.greendao.database.Database
    public void setTransactionSuccessful() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.delegate
            r0.setTransactionSuccessful()
            return
    }
}
