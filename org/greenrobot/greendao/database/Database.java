package org.greenrobot.greendao.database;

/* loaded from: classes.dex */
public interface Database {
    void beginTransaction();

    void close();

    org.greenrobot.greendao.database.DatabaseStatement compileStatement(java.lang.String r1);

    void endTransaction();

    void execSQL(java.lang.String r1) throws android.database.SQLException;

    void execSQL(java.lang.String r1, java.lang.Object[] r2) throws android.database.SQLException;

    java.lang.Object getRawDatabase();

    boolean inTransaction();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    android.database.Cursor rawQuery(java.lang.String r1, java.lang.String[] r2);

    void setTransactionSuccessful();
}
