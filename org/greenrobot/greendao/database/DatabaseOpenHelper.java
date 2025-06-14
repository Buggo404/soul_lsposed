package org.greenrobot.greendao.database;

/* loaded from: classes.dex */
public abstract class DatabaseOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
    private final android.content.Context context;
    private org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final java.lang.String name;
    private final int version;

    interface EncryptedHelper {
        org.greenrobot.greendao.database.Database getEncryptedReadableDb(java.lang.String r1);

        org.greenrobot.greendao.database.Database getEncryptedReadableDb(char[] r1);

        org.greenrobot.greendao.database.Database getEncryptedWritableDb(java.lang.String r1);

        org.greenrobot.greendao.database.Database getEncryptedWritableDb(char[] r1);
    }

    public DatabaseOpenHelper(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public DatabaseOpenHelper(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 1
            r0.loadSQLCipherNativeLibs = r3
            r0.context = r1
            r0.name = r2
            r0.version = r4
            return
    }

    public DatabaseOpenHelper(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4, android.database.DatabaseErrorHandler r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r3 = 1
            r0.loadSQLCipherNativeLibs = r3
            r0.context = r1
            r0.name = r2
            r0.version = r4
            return
    }

    private org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper checkEncryptedHelper() {
            r9 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = r9.encryptedHelper
            if (r0 != 0) goto L63
            java.lang.String r0 = "net.sqlcipher.database.SQLiteOpenHelper"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5b
            java.lang.String r0 = "org.greenrobot.greendao.database.SqlCipherEncryptedHelper"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L54
            r1 = 5
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L54
            java.lang.Class<org.greenrobot.greendao.database.DatabaseOpenHelper> r3 = org.greenrobot.greendao.database.DatabaseOpenHelper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L54
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.Exception -> L54
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.Exception -> L54
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L54
            r7 = 3
            r2[r7] = r3     // Catch: java.lang.Exception -> L54
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L54
            r8 = 4
            r2[r8] = r3     // Catch: java.lang.Exception -> L54
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L54
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L54
            r1[r4] = r9     // Catch: java.lang.Exception -> L54
            android.content.Context r2 = r9.context     // Catch: java.lang.Exception -> L54
            r1[r5] = r2     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = r9.name     // Catch: java.lang.Exception -> L54
            r1[r6] = r2     // Catch: java.lang.Exception -> L54
            int r2 = r9.version     // Catch: java.lang.Exception -> L54
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L54
            r1[r7] = r2     // Catch: java.lang.Exception -> L54
            boolean r2 = r9.loadSQLCipherNativeLibs     // Catch: java.lang.Exception -> L54
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L54
            r1[r8] = r2     // Catch: java.lang.Exception -> L54
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L54
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = (org.greenrobot.greendao.database.DatabaseOpenHelper.EncryptedHelper) r0     // Catch: java.lang.Exception -> L54
            r9.encryptedHelper = r0     // Catch: java.lang.Exception -> L54
            goto L63
        L54:
            r0 = move-exception
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException
            r1.<init>(r0)
            throw r1
        L5b:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.String r1 = "Using an encrypted database requires SQLCipher, make sure to add it to dependencies: https://greenrobot.org/greendao/documentation/database-encryption/"
            r0.<init>(r1)
            throw r0
        L63:
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = r9.encryptedHelper
            return r0
    }

    public org.greenrobot.greendao.database.Database getEncryptedReadableDb(java.lang.String r2) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = r1.checkEncryptedHelper()
            org.greenrobot.greendao.database.Database r2 = r0.getEncryptedReadableDb(r2)
            return r2
    }

    public org.greenrobot.greendao.database.Database getEncryptedReadableDb(char[] r2) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = r1.checkEncryptedHelper()
            org.greenrobot.greendao.database.Database r2 = r0.getEncryptedReadableDb(r2)
            return r2
    }

    public org.greenrobot.greendao.database.Database getEncryptedWritableDb(java.lang.String r2) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = r1.checkEncryptedHelper()
            org.greenrobot.greendao.database.Database r2 = r0.getEncryptedWritableDb(r2)
            return r2
    }

    public org.greenrobot.greendao.database.Database getEncryptedWritableDb(char[] r2) {
            r1 = this;
            org.greenrobot.greendao.database.DatabaseOpenHelper$EncryptedHelper r0 = r1.checkEncryptedHelper()
            org.greenrobot.greendao.database.Database r2 = r0.getEncryptedWritableDb(r2)
            return r2
    }

    public org.greenrobot.greendao.database.Database getReadableDb() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getReadableDatabase()
            org.greenrobot.greendao.database.Database r0 = r1.wrap(r0)
            return r0
    }

    public org.greenrobot.greendao.database.Database getWritableDb() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getWritableDatabase()
            org.greenrobot.greendao.database.Database r0 = r1.wrap(r0)
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            r0.onCreate(r1)
            return
    }

    public void onCreate(org.greenrobot.greendao.database.Database r1) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            r0.onOpen(r1)
            return
    }

    public void onOpen(org.greenrobot.greendao.database.Database r1) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            org.greenrobot.greendao.database.Database r1 = r0.wrap(r1)
            r0.onUpgrade(r1, r2, r3)
            return
    }

    public void onUpgrade(org.greenrobot.greendao.database.Database r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void setLoadSQLCipherNativeLibs(boolean r1) {
            r0 = this;
            r0.loadSQLCipherNativeLibs = r1
            return
    }

    protected org.greenrobot.greendao.database.Database wrap(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            org.greenrobot.greendao.database.StandardDatabase r0 = new org.greenrobot.greendao.database.StandardDatabase
            r0.<init>(r2)
            return r0
    }
}
