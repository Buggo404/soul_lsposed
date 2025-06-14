package org.greenrobot.greendao.internal;

/* loaded from: classes.dex */
public class TableStatements {
    private final java.lang.String[] allColumns;
    private org.greenrobot.greendao.database.DatabaseStatement countStatement;

    /* renamed from: db */
    private final org.greenrobot.greendao.database.Database f619db;
    private org.greenrobot.greendao.database.DatabaseStatement deleteStatement;
    private org.greenrobot.greendao.database.DatabaseStatement insertOrReplaceStatement;
    private org.greenrobot.greendao.database.DatabaseStatement insertStatement;
    private final java.lang.String[] pkColumns;
    private volatile java.lang.String selectAll;
    private volatile java.lang.String selectByKey;
    private volatile java.lang.String selectByRowId;
    private volatile java.lang.String selectKeys;
    private final java.lang.String tablename;
    private org.greenrobot.greendao.database.DatabaseStatement updateStatement;

    public TableStatements(org.greenrobot.greendao.database.Database r1, java.lang.String r2, java.lang.String[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.f619db = r1
            r0.tablename = r2
            r0.allColumns = r3
            r0.pkColumns = r4
            return
    }

    public org.greenrobot.greendao.database.DatabaseStatement getCountStatement() {
            r2 = this;
            org.greenrobot.greendao.database.DatabaseStatement r0 = r2.countStatement
            if (r0 != 0) goto L12
            java.lang.String r0 = r2.tablename
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlCount(r0)
            org.greenrobot.greendao.database.Database r1 = r2.f619db
            org.greenrobot.greendao.database.DatabaseStatement r0 = r1.compileStatement(r0)
            r2.countStatement = r0
        L12:
            org.greenrobot.greendao.database.DatabaseStatement r0 = r2.countStatement
            return r0
    }

    public org.greenrobot.greendao.database.DatabaseStatement getDeleteStatement() {
            r2 = this;
            org.greenrobot.greendao.database.DatabaseStatement r0 = r2.deleteStatement
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.tablename
            java.lang.String[] r1 = r2.pkColumns
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlDelete(r0, r1)
            org.greenrobot.greendao.database.Database r1 = r2.f619db
            org.greenrobot.greendao.database.DatabaseStatement r0 = r1.compileStatement(r0)
            monitor-enter(r2)
            org.greenrobot.greendao.database.DatabaseStatement r1 = r2.deleteStatement     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L19
            r2.deleteStatement = r0     // Catch: java.lang.Throwable -> L22
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            org.greenrobot.greendao.database.DatabaseStatement r1 = r2.deleteStatement
            if (r1 == r0) goto L25
            r0.close()
            goto L25
        L22:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
        L25:
            org.greenrobot.greendao.database.DatabaseStatement r0 = r2.deleteStatement
            return r0
    }

    public org.greenrobot.greendao.database.DatabaseStatement getInsertOrReplaceStatement() {
            r3 = this;
            org.greenrobot.greendao.database.DatabaseStatement r0 = r3.insertOrReplaceStatement
            if (r0 != 0) goto L27
            java.lang.String r0 = "INSERT OR REPLACE INTO "
            java.lang.String r1 = r3.tablename
            java.lang.String[] r2 = r3.allColumns
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlInsert(r0, r1, r2)
            org.greenrobot.greendao.database.Database r1 = r3.f619db
            org.greenrobot.greendao.database.DatabaseStatement r0 = r1.compileStatement(r0)
            monitor-enter(r3)
            org.greenrobot.greendao.database.DatabaseStatement r1 = r3.insertOrReplaceStatement     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L1b
            r3.insertOrReplaceStatement = r0     // Catch: java.lang.Throwable -> L24
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            org.greenrobot.greendao.database.DatabaseStatement r1 = r3.insertOrReplaceStatement
            if (r1 == r0) goto L27
            r0.close()
            goto L27
        L24:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        L27:
            org.greenrobot.greendao.database.DatabaseStatement r0 = r3.insertOrReplaceStatement
            return r0
    }

    public org.greenrobot.greendao.database.DatabaseStatement getInsertStatement() {
            r3 = this;
            org.greenrobot.greendao.database.DatabaseStatement r0 = r3.insertStatement
            if (r0 != 0) goto L27
            java.lang.String r0 = "INSERT INTO "
            java.lang.String r1 = r3.tablename
            java.lang.String[] r2 = r3.allColumns
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlInsert(r0, r1, r2)
            org.greenrobot.greendao.database.Database r1 = r3.f619db
            org.greenrobot.greendao.database.DatabaseStatement r0 = r1.compileStatement(r0)
            monitor-enter(r3)
            org.greenrobot.greendao.database.DatabaseStatement r1 = r3.insertStatement     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L1b
            r3.insertStatement = r0     // Catch: java.lang.Throwable -> L24
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            org.greenrobot.greendao.database.DatabaseStatement r1 = r3.insertStatement
            if (r1 == r0) goto L27
            r0.close()
            goto L27
        L24:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        L27:
            org.greenrobot.greendao.database.DatabaseStatement r0 = r3.insertStatement
            return r0
    }

    public java.lang.String getSelectAll() {
            r4 = this;
            java.lang.String r0 = r4.selectAll
            if (r0 != 0) goto L11
            java.lang.String r0 = r4.tablename
            java.lang.String[] r1 = r4.allColumns
            r2 = 0
            java.lang.String r3 = "T"
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlSelect(r0, r3, r1, r2)
            r4.selectAll = r0
        L11:
            java.lang.String r0 = r4.selectAll
            return r0
    }

    public java.lang.String getSelectByKey() {
            r3 = this;
            java.lang.String r0 = r3.selectByKey
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.getSelectAll()
            r0.<init>(r1)
            java.lang.String r1 = "WHERE "
            r0.append(r1)
            java.lang.String r1 = "T"
            java.lang.String[] r2 = r3.pkColumns
            org.greenrobot.greendao.internal.SqlUtils.appendColumnsEqValue(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            r3.selectByKey = r0
        L1f:
            java.lang.String r0 = r3.selectByKey
            return r0
    }

    public java.lang.String getSelectByRowId() {
            r2 = this;
            java.lang.String r0 = r2.selectByRowId
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getSelectAll()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "WHERE ROWID=?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.selectByRowId = r0
        L1d:
            java.lang.String r0 = r2.selectByRowId
            return r0
    }

    public java.lang.String getSelectKeys() {
            r4 = this;
            java.lang.String r0 = r4.selectKeys
            if (r0 != 0) goto L11
            java.lang.String r0 = r4.tablename
            java.lang.String[] r1 = r4.pkColumns
            r2 = 0
            java.lang.String r3 = "T"
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlSelect(r0, r3, r1, r2)
            r4.selectKeys = r0
        L11:
            java.lang.String r0 = r4.selectKeys
            return r0
    }

    public org.greenrobot.greendao.database.DatabaseStatement getUpdateStatement() {
            r3 = this;
            org.greenrobot.greendao.database.DatabaseStatement r0 = r3.updateStatement
            if (r0 != 0) goto L27
            java.lang.String r0 = r3.tablename
            java.lang.String[] r1 = r3.allColumns
            java.lang.String[] r2 = r3.pkColumns
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlUpdate(r0, r1, r2)
            org.greenrobot.greendao.database.Database r1 = r3.f619db
            org.greenrobot.greendao.database.DatabaseStatement r0 = r1.compileStatement(r0)
            monitor-enter(r3)
            org.greenrobot.greendao.database.DatabaseStatement r1 = r3.updateStatement     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L1b
            r3.updateStatement = r0     // Catch: java.lang.Throwable -> L24
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            org.greenrobot.greendao.database.DatabaseStatement r1 = r3.updateStatement
            if (r1 == r0) goto L27
            r0.close()
            goto L27
        L24:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        L27:
            org.greenrobot.greendao.database.DatabaseStatement r0 = r3.updateStatement
            return r0
    }
}
