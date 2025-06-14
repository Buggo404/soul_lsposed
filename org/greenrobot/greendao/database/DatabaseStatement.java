package org.greenrobot.greendao.database;

/* loaded from: classes.dex */
public interface DatabaseStatement {
    void bindBlob(int r1, byte[] r2);

    void bindDouble(int r1, double r2);

    void bindLong(int r1, long r2);

    void bindNull(int r1);

    void bindString(int r1, java.lang.String r2);

    void clearBindings();

    void close();

    void execute();

    long executeInsert();

    java.lang.Object getRawStatement();

    long simpleQueryForLong();
}
