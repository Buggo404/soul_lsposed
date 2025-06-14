package org.greenrobot.greendao.database;

/* loaded from: classes.dex */
public class StandardDatabaseStatement implements org.greenrobot.greendao.database.DatabaseStatement {
    private final android.database.sqlite.SQLiteStatement delegate;

    public StandardDatabaseStatement(android.database.sqlite.SQLiteStatement r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void bindBlob(int r2, byte[] r3) {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindBlob(r2, r3)
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void bindDouble(int r2, double r3) {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindDouble(r2, r3)
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void bindLong(int r2, long r3) {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindLong(r2, r3)
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void bindNull(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindNull(r2)
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void bindString(int r2, java.lang.String r3) {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindString(r2, r3)
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void clearBindings() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.clearBindings()
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void close() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.close()
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public void execute() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.execute()
            return
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public long executeInsert() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.delegate
            long r0 = r0.executeInsert()
            return r0
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public java.lang.Object getRawStatement() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            return r0
    }

    @Override // org.greenrobot.greendao.database.DatabaseStatement
    public long simpleQueryForLong() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.delegate
            long r0 = r0.simpleQueryForLong()
            return r0
    }
}
