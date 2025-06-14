package org.greenrobot.greendao;

/* loaded from: classes.dex */
public abstract class AbstractDao<T, K> {
    protected final org.greenrobot.greendao.internal.DaoConfig config;

    /* renamed from: db */
    protected final org.greenrobot.greendao.database.Database f614db;
    protected final org.greenrobot.greendao.identityscope.IdentityScope<K, T> identityScope;
    protected final org.greenrobot.greendao.identityscope.IdentityScopeLong<T> identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile org.greenrobot.greendao.p004rx.RxDao<T, K> rxDao;
    private volatile org.greenrobot.greendao.p004rx.RxDao<T, K> rxDaoPlain;
    protected final org.greenrobot.greendao.AbstractDaoSession session;
    protected final org.greenrobot.greendao.internal.TableStatements statements;

    public AbstractDao(org.greenrobot.greendao.internal.DaoConfig r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AbstractDao(org.greenrobot.greendao.internal.DaoConfig r2, org.greenrobot.greendao.AbstractDaoSession r3) {
            r1 = this;
            r1.<init>()
            r1.config = r2
            r1.session = r3
            org.greenrobot.greendao.database.Database r3 = r2.f618db
            r1.f614db = r3
            java.lang.Object r3 = r3.getRawDatabase()
            boolean r3 = r3 instanceof android.database.sqlite.SQLiteDatabase
            r1.isStandardSQLite = r3
            org.greenrobot.greendao.identityscope.IdentityScope r3 = r2.getIdentityScope()
            r1.identityScope = r3
            boolean r0 = r3 instanceof org.greenrobot.greendao.identityscope.IdentityScopeLong
            if (r0 == 0) goto L22
            org.greenrobot.greendao.identityscope.IdentityScopeLong r3 = (org.greenrobot.greendao.identityscope.IdentityScopeLong) r3
            r1.identityScopeLong = r3
            goto L25
        L22:
            r3 = 0
            r1.identityScopeLong = r3
        L25:
            org.greenrobot.greendao.internal.TableStatements r3 = r2.statements
            r1.statements = r3
            org.greenrobot.greendao.Property r3 = r2.pkProperty
            if (r3 == 0) goto L32
            org.greenrobot.greendao.Property r2 = r2.pkProperty
            int r2 = r2.ordinal
            goto L33
        L32:
            r2 = -1
        L33:
            r1.pkOrdinal = r2
            return
    }

    private void deleteByKeyInsideSynchronized(K r5, org.greenrobot.greendao.database.DatabaseStatement r6) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Long
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            r6.bindLong(r1, r2)
            goto L18
        Lf:
            if (r5 == 0) goto L1c
            java.lang.String r5 = r5.toString()
            r6.bindString(r1, r5)
        L18:
            r6.execute()
            return
        L1c:
            org.greenrobot.greendao.DaoException r5 = new org.greenrobot.greendao.DaoException
            java.lang.String r6 = "Cannot delete entity, key is null"
            r5.<init>(r6)
            throw r5
    }

    private void deleteInTxInternal(java.lang.Iterable<T> r4, java.lang.Iterable<K> r5) {
            r3 = this;
            r3.assertSinglePk()
            org.greenrobot.greendao.internal.TableStatements r0 = r3.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getDeleteStatement()
            org.greenrobot.greendao.database.Database r1 = r3.f614db
            r1.beginTransaction()
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7c
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r1 = r3.identityScope     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L1c
            r1.lock()     // Catch: java.lang.Throwable -> L79
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L79
            r1.<init>()     // Catch: java.lang.Throwable -> L79
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r4 == 0) goto L3c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3a
        L23:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r3.getKeyVerified(r2)     // Catch: java.lang.Throwable -> L3a
            r3.deleteByKeyInsideSynchronized(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L23
            r1.add(r2)     // Catch: java.lang.Throwable -> L3a
            goto L23
        L3a:
            r4 = move-exception
            goto L55
        L3c:
            if (r5 == 0) goto L5d
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L3a
        L42:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L3a
            r3.deleteByKeyInsideSynchronized(r5, r0)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L42
            r1.add(r5)     // Catch: java.lang.Throwable -> L3a
            goto L42
        L55:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r5 = r3.identityScope     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L5c
            r5.unlock()     // Catch: java.lang.Throwable -> L79
        L5c:
            throw r4     // Catch: java.lang.Throwable -> L79
        L5d:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r4 = r3.identityScope     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L64
            r4.unlock()     // Catch: java.lang.Throwable -> L79
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            org.greenrobot.greendao.database.Database r4 = r3.f614db     // Catch: java.lang.Throwable -> L7c
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L73
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r4 = r3.identityScope     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L73
            r4.remove(r1)     // Catch: java.lang.Throwable -> L7c
        L73:
            org.greenrobot.greendao.database.Database r4 = r3.f614db
            r4.endTransaction()
            return
        L79:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            throw r4     // Catch: java.lang.Throwable -> L7c
        L7c:
            r4 = move-exception
            org.greenrobot.greendao.database.Database r5 = r3.f614db
            r5.endTransaction()
            throw r4
    }

    private long executeInsert(T r3, org.greenrobot.greendao.database.DatabaseStatement r4, boolean r5) {
            r2 = this;
            org.greenrobot.greendao.database.Database r0 = r2.f614db
            boolean r0 = r0.isDbLockedByCurrentThread()
            if (r0 == 0) goto Ld
            long r0 = r2.insertInsideTx(r3, r4)
            goto L20
        Ld:
            org.greenrobot.greendao.database.Database r0 = r2.f614db
            r0.beginTransaction()
            long r0 = r2.insertInsideTx(r3, r4)     // Catch: java.lang.Throwable -> L27
            org.greenrobot.greendao.database.Database r4 = r2.f614db     // Catch: java.lang.Throwable -> L27
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L27
            org.greenrobot.greendao.database.Database r4 = r2.f614db
            r4.endTransaction()
        L20:
            if (r5 == 0) goto L26
            r4 = 1
            r2.updateKeyAfterInsertAndAttach(r3, r0, r4)
        L26:
            return r0
        L27:
            r3 = move-exception
            org.greenrobot.greendao.database.Database r4 = r2.f614db
            r4.endTransaction()
            throw r3
    }

    private void executeInsertInTx(org.greenrobot.greendao.database.DatabaseStatement r6, java.lang.Iterable<T> r7, boolean r8) {
            r5 = this;
            org.greenrobot.greendao.database.Database r0 = r5.f614db
            r0.beginTransaction()
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L75
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r5.identityScope     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto Ld
            r0.lock()     // Catch: java.lang.Throwable -> L72
        Ld:
            boolean r0 = r5.isStandardSQLite     // Catch: java.lang.Throwable -> L69
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.Object r0 = r6.getRawStatement()     // Catch: java.lang.Throwable -> L69
            android.database.sqlite.SQLiteStatement r0 = (android.database.sqlite.SQLiteStatement) r0     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L69
        L1c:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L56
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L69
            r5.bindValues(r0, r2)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L33
            long r3 = r0.executeInsert()     // Catch: java.lang.Throwable -> L69
            r5.updateKeyAfterInsertAndAttach(r2, r3, r1)     // Catch: java.lang.Throwable -> L69
            goto L1c
        L33:
            r0.execute()     // Catch: java.lang.Throwable -> L69
            goto L1c
        L37:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L69
        L3b:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L56
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L69
            r5.bindValues(r6, r0)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L52
            long r2 = r6.executeInsert()     // Catch: java.lang.Throwable -> L69
            r5.updateKeyAfterInsertAndAttach(r0, r2, r1)     // Catch: java.lang.Throwable -> L69
            goto L3b
        L52:
            r6.execute()     // Catch: java.lang.Throwable -> L69
            goto L3b
        L56:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r7 = r5.identityScope     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L5d
            r7.unlock()     // Catch: java.lang.Throwable -> L72
        L5d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L72
            org.greenrobot.greendao.database.Database r6 = r5.f614db     // Catch: java.lang.Throwable -> L75
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L75
            org.greenrobot.greendao.database.Database r6 = r5.f614db
            r6.endTransaction()
            return
        L69:
            r7 = move-exception
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r8 = r5.identityScope     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L71
            r8.unlock()     // Catch: java.lang.Throwable -> L72
        L71:
            throw r7     // Catch: java.lang.Throwable -> L72
        L72:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L72
            throw r7     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            org.greenrobot.greendao.database.Database r7 = r5.f614db
            r7.endTransaction()
            throw r6
    }

    private long insertInsideTx(T r3, org.greenrobot.greendao.database.DatabaseStatement r4) {
            r2 = this;
            monitor-enter(r4)
            boolean r0 = r2.isStandardSQLite     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L14
            java.lang.Object r0 = r4.getRawStatement()     // Catch: java.lang.Throwable -> L1d
            android.database.sqlite.SQLiteStatement r0 = (android.database.sqlite.SQLiteStatement) r0     // Catch: java.lang.Throwable -> L1d
            r2.bindValues(r0, r3)     // Catch: java.lang.Throwable -> L1d
            long r0 = r0.executeInsert()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            return r0
        L14:
            r2.bindValues(r4, r3)     // Catch: java.lang.Throwable -> L1d
            long r0 = r4.executeInsert()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    private void loadAllUnlockOnWindowBounds(android.database.Cursor r4, android.database.CursorWindow r5, java.util.List<T> r6) {
            r3 = this;
            int r0 = r5.getStartPosition()
            int r5 = r5.getNumRows()
            int r0 = r0 + r5
            r5 = 0
            r1 = r5
        Lb:
            java.lang.Object r2 = r3.loadCurrent(r4, r5, r5)
            r6.add(r2)
            int r1 = r1 + 1
            if (r1 < r0) goto L28
            android.database.CursorWindow r0 = r3.moveToNextUnlocked(r4)
            if (r0 != 0) goto L1d
            goto L2e
        L1d:
            int r2 = r0.getStartPosition()
            int r0 = r0.getNumRows()
            int r2 = r2 + r0
            r0 = r2
            goto L2f
        L28:
            boolean r2 = r4.moveToNext()
            if (r2 != 0) goto L2f
        L2e:
            return
        L2f:
            int r1 = r1 + 1
            goto Lb
    }

    private android.database.CursorWindow moveToNextUnlocked(android.database.Cursor r2) {
            r1 = this;
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r1.identityScope
            r0.unlock()
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L17
            android.database.CrossProcessCursor r2 = (android.database.CrossProcessCursor) r2     // Catch: java.lang.Throwable -> L1e
            android.database.CursorWindow r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L1e
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r1.identityScope
            r0.lock()
            return r2
        L17:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r2 = r1.identityScope
            r2.lock()
            r2 = 0
            return r2
        L1e:
            r2 = move-exception
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r1.identityScope
            r0.lock()
            throw r2
    }

    protected void assertSinglePk() {
            r3 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r3.config
            java.lang.String[] r0 = r0.pkColumns
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L9
            return
        L9:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)
            org.greenrobot.greendao.internal.DaoConfig r2 = r3.config
            java.lang.String r2 = r2.tablename
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") does not have a single-column primary key"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected void attachEntity(T r1) {
            r0 = this;
            return
    }

    protected final void attachEntity(K r2, T r3, boolean r4) {
            r1 = this;
            r1.attachEntity(r3)
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r1.identityScope
            if (r0 == 0) goto L12
            if (r2 == 0) goto L12
            if (r4 == 0) goto Lf
            r0.put(r2, r3)
            goto L12
        Lf:
            r0.putNoLock(r2, r3)
        L12:
            return
    }

    protected abstract void bindValues(android.database.sqlite.SQLiteStatement r1, T r2);

    protected abstract void bindValues(org.greenrobot.greendao.database.DatabaseStatement r1, T r2);

    public long count() {
            r2 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r2.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getCountStatement()
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    public void delete(T r1) {
            r0 = this;
            r0.assertSinglePk()
            java.lang.Object r1 = r0.getKeyVerified(r1)
            r0.deleteByKey(r1)
            return
    }

    public void deleteAll() {
            r3 = this;
            org.greenrobot.greendao.database.Database r0 = r3.f614db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DELETE FROM '"
            r1.<init>(r2)
            org.greenrobot.greendao.internal.DaoConfig r2 = r3.config
            java.lang.String r2 = r2.tablename
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.execSQL(r1)
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r3.identityScope
            if (r0 == 0) goto L25
            r0.clear()
        L25:
            return
    }

    public void deleteByKey(K r3) {
            r2 = this;
            r2.assertSinglePk()
            org.greenrobot.greendao.internal.TableStatements r0 = r2.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getDeleteStatement()
            org.greenrobot.greendao.database.Database r1 = r2.f614db
            boolean r1 = r1.isDbLockedByCurrentThread()
            if (r1 == 0) goto L1a
            monitor-enter(r0)
            r2.deleteByKeyInsideSynchronized(r3, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L2e
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1a:
            org.greenrobot.greendao.database.Database r1 = r2.f614db
            r1.beginTransaction()
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L39
            r2.deleteByKeyInsideSynchronized(r3, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            org.greenrobot.greendao.database.Database r0 = r2.f614db     // Catch: java.lang.Throwable -> L39
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L39
            org.greenrobot.greendao.database.Database r0 = r2.f614db
            r0.endTransaction()
        L2e:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r2.identityScope
            if (r0 == 0) goto L35
            r0.remove(r3)
        L35:
            return
        L36:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r3 = move-exception
            org.greenrobot.greendao.database.Database r0 = r2.f614db
            r0.endTransaction()
            throw r3
    }

    public void deleteByKeyInTx(java.lang.Iterable<K> r2) {
            r1 = this;
            r0 = 0
            r1.deleteInTxInternal(r0, r2)
            return
    }

    public void deleteByKeyInTx(K... r2) {
            r1 = this;
            r0 = 0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.deleteInTxInternal(r0, r2)
            return
    }

    public void deleteInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            r0 = 0
            r1.deleteInTxInternal(r2, r0)
            return
    }

    public void deleteInTx(T... r2) {
            r1 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0 = 0
            r1.deleteInTxInternal(r2, r0)
            return
    }

    public boolean detach(T r3) {
            r2 = this;
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r2.identityScope
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r2.getKeyVerified(r3)
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r1 = r2.identityScope
            boolean r3 = r1.detach(r0, r3)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public void detachAll() {
            r1 = this;
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r1.identityScope
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public java.lang.String[] getAllColumns() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            java.lang.String[] r0 = r0.allColumns
            return r0
    }

    public org.greenrobot.greendao.database.Database getDatabase() {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r1.f614db
            return r0
    }

    protected abstract K getKey(T r1);

    protected K getKeyVerified(T r2) {
            r1 = this;
            java.lang.Object r0 = r1.getKey(r2)
            if (r0 != 0) goto L18
            if (r2 != 0) goto L10
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Entity may not be null"
            r2.<init>(r0)
            throw r2
        L10:
            org.greenrobot.greendao.DaoException r2 = new org.greenrobot.greendao.DaoException
            java.lang.String r0 = "Entity has no key"
            r2.<init>(r0)
            throw r2
        L18:
            return r0
    }

    public java.lang.String[] getNonPkColumns() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            java.lang.String[] r0 = r0.nonPkColumns
            return r0
    }

    public java.lang.String[] getPkColumns() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            java.lang.String[] r0 = r0.pkColumns
            return r0
    }

    public org.greenrobot.greendao.Property getPkProperty() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            org.greenrobot.greendao.Property r0 = r0.pkProperty
            return r0
    }

    public org.greenrobot.greendao.Property[] getProperties() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            org.greenrobot.greendao.Property[] r0 = r0.properties
            return r0
    }

    public org.greenrobot.greendao.AbstractDaoSession getSession() {
            r1 = this;
            org.greenrobot.greendao.AbstractDaoSession r0 = r1.session
            return r0
    }

    org.greenrobot.greendao.internal.TableStatements getStatements() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            org.greenrobot.greendao.internal.TableStatements r0 = r0.statements
            return r0
    }

    public java.lang.String getTablename() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.config
            java.lang.String r0 = r0.tablename
            return r0
    }

    protected abstract boolean hasKey(T r1);

    public long insert(T r3) {
            r2 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r2.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getInsertStatement()
            r1 = 1
            long r0 = r2.executeInsert(r3, r0, r1)
            return r0
    }

    public void insertInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            boolean r0 = r1.isEntityUpdateable()
            r1.insertInTx(r2, r0)
            return
    }

    public void insertInTx(java.lang.Iterable<T> r2, boolean r3) {
            r1 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r1.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getInsertStatement()
            r1.executeInsertInTx(r0, r2, r3)
            return
    }

    public void insertInTx(T... r2) {
            r1 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            boolean r0 = r1.isEntityUpdateable()
            r1.insertInTx(r2, r0)
            return
    }

    public long insertOrReplace(T r3) {
            r2 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r2.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getInsertOrReplaceStatement()
            r1 = 1
            long r0 = r2.executeInsert(r3, r0, r1)
            return r0
    }

    public void insertOrReplaceInTx(java.lang.Iterable<T> r2) {
            r1 = this;
            boolean r0 = r1.isEntityUpdateable()
            r1.insertOrReplaceInTx(r2, r0)
            return
    }

    public void insertOrReplaceInTx(java.lang.Iterable<T> r2, boolean r3) {
            r1 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r1.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getInsertOrReplaceStatement()
            r1.executeInsertInTx(r0, r2, r3)
            return
    }

    public void insertOrReplaceInTx(T... r2) {
            r1 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            boolean r0 = r1.isEntityUpdateable()
            r1.insertOrReplaceInTx(r2, r0)
            return
    }

    public long insertWithoutSettingPk(T r3) {
            r2 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r2.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getInsertOrReplaceStatement()
            r1 = 0
            long r0 = r2.executeInsert(r3, r0, r1)
            return r0
    }

    protected abstract boolean isEntityUpdateable();

    public T load(K r4) {
            r3 = this;
            r3.assertSinglePk()
            if (r4 != 0) goto L7
            r4 = 0
            return r4
        L7:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r3.identityScope
            if (r0 == 0) goto L12
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L12
            return r0
        L12:
            org.greenrobot.greendao.internal.TableStatements r0 = r3.statements
            java.lang.String r0 = r0.getSelectByKey()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r4 = r4.toString()
            r1[r2] = r4
            org.greenrobot.greendao.database.Database r4 = r3.f614db
            android.database.Cursor r4 = r4.rawQuery(r0, r1)
            java.lang.Object r4 = r3.loadUniqueAndCloseCursor(r4)
            return r4
    }

    public java.util.List<T> loadAll() {
            r3 = this;
            org.greenrobot.greendao.database.Database r0 = r3.f614db
            org.greenrobot.greendao.internal.TableStatements r1 = r3.statements
            java.lang.String r1 = r1.getSelectAll()
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            java.util.List r0 = r3.loadAllAndCloseCursor(r0)
            return r0
    }

    protected java.util.List<T> loadAllAndCloseCursor(android.database.Cursor r2) {
            r1 = this;
            java.util.List r0 = r1.loadAllFromCursor(r2)     // Catch: java.lang.Throwable -> L8
            r2.close()
            return r0
        L8:
            r0 = move-exception
            r2.close()
            throw r0
    }

    protected java.util.List<T> loadAllFromCursor(android.database.Cursor r7) {
            r6 = this;
            int r0 = r7.getCount()
            if (r0 != 0) goto Lc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r2 = r7 instanceof android.database.CrossProcessCursor
            r3 = 0
            if (r2 == 0) goto L4d
            r2 = r7
            android.database.CrossProcessCursor r2 = (android.database.CrossProcessCursor) r2
            android.database.CursorWindow r2 = r2.getWindow()
            if (r2 == 0) goto L4e
            int r4 = r2.getNumRows()
            if (r4 != r0) goto L2c
            org.greenrobot.greendao.internal.FastCursor r7 = new org.greenrobot.greendao.internal.FastCursor
            r7.<init>(r2)
            r4 = 1
            goto L4f
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Window vs. result size: "
            r4.<init>(r5)
            int r5 = r2.getNumRows()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            org.greenrobot.greendao.DaoLog.m100d(r4)
            goto L4e
        L4d:
            r2 = 0
        L4e:
            r4 = r3
        L4f:
            boolean r5 = r7.moveToFirst()
            if (r5 == 0) goto L8b
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r5 = r6.identityScope
            if (r5 == 0) goto L61
            r5.lock()
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r5 = r6.identityScope
            r5.reserveRoom(r0)
        L61:
            if (r4 != 0) goto L6d
            if (r2 == 0) goto L6d
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r6.identityScope     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L6d
            r6.loadAllUnlockOnWindowBounds(r7, r2, r1)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L6d:
            java.lang.Object r0 = r6.loadCurrent(r7, r3, r3)     // Catch: java.lang.Throwable -> L82
            r1.add(r0)     // Catch: java.lang.Throwable -> L82
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L6d
        L7a:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r7 = r6.identityScope
            if (r7 == 0) goto L8b
            r7.unlock()
            goto L8b
        L82:
            r7 = move-exception
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r6.identityScope
            if (r0 == 0) goto L8a
            r0.unlock()
        L8a:
            throw r7
        L8b:
            return r1
    }

    public T loadByRowId(long r3) {
            r2 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r3 = java.lang.Long.toString(r3)
            r0[r1] = r3
            org.greenrobot.greendao.database.Database r3 = r2.f614db
            org.greenrobot.greendao.internal.TableStatements r4 = r2.statements
            java.lang.String r4 = r4.getSelectByRowId()
            android.database.Cursor r3 = r3.rawQuery(r4, r0)
            java.lang.Object r3 = r2.loadUniqueAndCloseCursor(r3)
            return r3
    }

    protected final T loadCurrent(android.database.Cursor r4, int r5, boolean r6) {
            r3 = this;
            org.greenrobot.greendao.identityscope.IdentityScopeLong<T> r0 = r3.identityScopeLong
            r1 = 0
            if (r0 == 0) goto L3d
            if (r5 == 0) goto L11
            int r0 = r3.pkOrdinal
            int r0 = r0 + r5
            boolean r0 = r4.isNull(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            int r0 = r3.pkOrdinal
            int r0 = r0 + r5
            long r0 = r4.getLong(r0)
            org.greenrobot.greendao.identityscope.IdentityScopeLong<T> r2 = r3.identityScopeLong
            if (r6 == 0) goto L21
            java.lang.Object r2 = r2.get2(r0)
            goto L25
        L21:
            java.lang.Object r2 = r2.get2NoLock(r0)
        L25:
            if (r2 == 0) goto L28
            return r2
        L28:
            java.lang.Object r4 = r3.readEntity(r4, r5)
            r3.attachEntity(r4)
            if (r6 == 0) goto L37
            org.greenrobot.greendao.identityscope.IdentityScopeLong<T> r5 = r3.identityScopeLong
            r5.put2(r0, r4)
            goto L3c
        L37:
            org.greenrobot.greendao.identityscope.IdentityScopeLong<T> r5 = r3.identityScopeLong
            r5.put2NoLock(r0, r4)
        L3c:
            return r4
        L3d:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r0 = r3.identityScope
            if (r0 == 0) goto L62
            java.lang.Object r0 = r3.readKey(r4, r5)
            if (r5 == 0) goto L4a
            if (r0 != 0) goto L4a
            return r1
        L4a:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r1 = r3.identityScope
            if (r6 == 0) goto L53
            java.lang.Object r1 = r1.get(r0)
            goto L57
        L53:
            java.lang.Object r1 = r1.getNoLock(r0)
        L57:
            if (r1 == 0) goto L5a
            return r1
        L5a:
            java.lang.Object r4 = r3.readEntity(r4, r5)
            r3.attachEntity(r0, r4, r6)
            return r4
        L62:
            if (r5 == 0) goto L6b
            java.lang.Object r6 = r3.readKey(r4, r5)
            if (r6 != 0) goto L6b
            return r1
        L6b:
            java.lang.Object r4 = r3.readEntity(r4, r5)
            r3.attachEntity(r4)
            return r4
    }

    protected final <O> O loadCurrentOther(org.greenrobot.greendao.AbstractDao<O, ?> r2, android.database.Cursor r3, int r4) {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r2.loadCurrent(r3, r4, r0)
            return r2
    }

    protected T loadUnique(android.database.Cursor r4) {
            r3 = this;
            boolean r0 = r4.moveToFirst()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            boolean r0 = r4.isLast()
            if (r0 == 0) goto L15
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r3.loadCurrent(r4, r0, r1)
            return r4
        L15:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected unique result, but count was "
            r1.<init>(r2)
            int r4 = r4.getCount()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    protected T loadUniqueAndCloseCursor(android.database.Cursor r2) {
            r1 = this;
            java.lang.Object r0 = r1.loadUnique(r2)     // Catch: java.lang.Throwable -> L8
            r2.close()
            return r0
        L8:
            r0 = move-exception
            r2.close()
            throw r0
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> queryBuilder() {
            r1 = this;
            org.greenrobot.greendao.query.QueryBuilder r0 = org.greenrobot.greendao.query.QueryBuilder.internalCreate(r1)
            return r0
    }

    public java.util.List<T> queryRaw(java.lang.String r4, java.lang.String... r5) {
            r3 = this;
            org.greenrobot.greendao.database.Database r0 = r3.f614db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            org.greenrobot.greendao.internal.TableStatements r2 = r3.statements
            java.lang.String r2 = r2.getSelectAll()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            android.database.Cursor r4 = r0.rawQuery(r4, r5)
            java.util.List r4 = r3.loadAllAndCloseCursor(r4)
            return r4
    }

    public org.greenrobot.greendao.query.Query<T> queryRawCreate(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            org.greenrobot.greendao.query.Query r1 = r0.queryRawCreateListArgs(r1, r2)
            return r1
    }

    public org.greenrobot.greendao.query.Query<T> queryRawCreateListArgs(java.lang.String r3, java.util.Collection<java.lang.Object> r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.greenrobot.greendao.internal.TableStatements r1 = r2.statements
            java.lang.String r1 = r1.getSelectAll()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = r4.toArray()
            org.greenrobot.greendao.query.Query r3 = org.greenrobot.greendao.query.Query.internalCreate(r2, r3, r4)
            return r3
    }

    protected abstract T readEntity(android.database.Cursor r1, int r2);

    protected abstract void readEntity(android.database.Cursor r1, T r2, int r3);

    protected abstract K readKey(android.database.Cursor r1, int r2);

    public void refresh(T r9) {
            r8 = this;
            java.lang.String r0 = "Expected unique result, but count was "
            java.lang.String r1 = "Entity does not exist in the database anymore: "
            r8.assertSinglePk()
            java.lang.Object r2 = r8.getKeyVerified(r9)
            org.greenrobot.greendao.internal.TableStatements r3 = r8.statements
            java.lang.String r3 = r3.getSelectByKey()
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r6 = r2.toString()
            r7 = 0
            r5[r7] = r6
            org.greenrobot.greendao.database.Database r6 = r8.f614db
            android.database.Cursor r3 = r6.rawQuery(r3, r5)
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L4e
            boolean r1 = r3.isLast()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L37
            r8.readEntity(r3, r9, r7)     // Catch: java.lang.Throwable -> L6f
            r8.attachEntity(r2, r9, r4)     // Catch: java.lang.Throwable -> L6f
            r3.close()
            return
        L37:
            org.greenrobot.greendao.DaoException r9 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            int r0 = r3.getCount()     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        L4e:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r9 = r4.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = " with key "
            java.lang.StringBuilder r9 = r9.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r9 = r9.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r9 = move-exception
            r3.close()
            throw r9
    }

    /* renamed from: rx */
    public org.greenrobot.greendao.p004rx.RxDao<T, K> m99rx() {
            r2 = this;
            org.greenrobot.greendao.rx.RxDao<T, K> r0 = r2.rxDao
            if (r0 != 0) goto Lf
            org.greenrobot.greendao.rx.RxDao r0 = new org.greenrobot.greendao.rx.RxDao
            rx.Scheduler r1 = rx.schedulers.Schedulers.io()
            r0.<init>(r2, r1)
            r2.rxDao = r0
        Lf:
            org.greenrobot.greendao.rx.RxDao<T, K> r0 = r2.rxDao
            return r0
    }

    public org.greenrobot.greendao.p004rx.RxDao<T, K> rxPlain() {
            r1 = this;
            org.greenrobot.greendao.rx.RxDao<T, K> r0 = r1.rxDaoPlain
            if (r0 != 0) goto Lb
            org.greenrobot.greendao.rx.RxDao r0 = new org.greenrobot.greendao.rx.RxDao
            r0.<init>(r1)
            r1.rxDaoPlain = r0
        Lb:
            org.greenrobot.greendao.rx.RxDao<T, K> r0 = r1.rxDaoPlain
            return r0
    }

    public void save(T r2) {
            r1 = this;
            boolean r0 = r1.hasKey(r2)
            if (r0 == 0) goto La
            r1.update(r2)
            goto Ld
        La:
            r1.insert(r2)
        Ld:
            return
    }

    public void saveInTx(java.lang.Iterable<T> r5) {
            r4 = this;
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r0.next()
            boolean r3 = r4.hasKey(r3)
            if (r3 == 0) goto L19
            int r1 = r1 + 1
            goto L6
        L19:
            int r2 = r2 + 1
            goto L6
        L1c:
            if (r1 <= 0) goto L63
            if (r2 <= 0) goto L63
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L2e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r5.next()
            boolean r3 = r4.hasKey(r2)
            if (r3 == 0) goto L42
            r0.add(r2)
            goto L2e
        L42:
            r1.add(r2)
            goto L2e
        L46:
            org.greenrobot.greendao.database.Database r5 = r4.f614db
            r5.beginTransaction()
            r4.updateInTx(r0)     // Catch: java.lang.Throwable -> L5c
            r4.insertInTx(r1)     // Catch: java.lang.Throwable -> L5c
            org.greenrobot.greendao.database.Database r5 = r4.f614db     // Catch: java.lang.Throwable -> L5c
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5c
            org.greenrobot.greendao.database.Database r5 = r4.f614db
            r5.endTransaction()
            goto L6e
        L5c:
            r5 = move-exception
            org.greenrobot.greendao.database.Database r0 = r4.f614db
            r0.endTransaction()
            throw r5
        L63:
            if (r2 <= 0) goto L69
            r4.insertInTx(r5)
            goto L6e
        L69:
            if (r1 <= 0) goto L6e
            r4.updateInTx(r5)
        L6e:
            return
    }

    public void saveInTx(T... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.saveInTx(r1)
            return
    }

    public void update(T r4) {
            r3 = this;
            r3.assertSinglePk()
            org.greenrobot.greendao.internal.TableStatements r0 = r3.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getUpdateStatement()
            org.greenrobot.greendao.database.Database r1 = r3.f614db
            boolean r1 = r1.isDbLockedByCurrentThread()
            r2 = 1
            if (r1 == 0) goto L29
            monitor-enter(r0)
            boolean r1 = r3.isStandardSQLite     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.getRawStatement()     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteStatement r1 = (android.database.sqlite.SQLiteStatement) r1     // Catch: java.lang.Throwable -> L26
            r3.updateInsideSynchronized(r4, r1, r2)     // Catch: java.lang.Throwable -> L26
            goto L24
        L21:
            r3.updateInsideSynchronized(r4, r0, r2)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            goto L3d
        L26:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
        L29:
            org.greenrobot.greendao.database.Database r1 = r3.f614db
            r1.beginTransaction()
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L41
            r3.updateInsideSynchronized(r4, r0, r2)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            org.greenrobot.greendao.database.Database r4 = r3.f614db     // Catch: java.lang.Throwable -> L41
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L41
            org.greenrobot.greendao.database.Database r4 = r3.f614db
            r4.endTransaction()
        L3d:
            return
        L3e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L41
        L41:
            r4 = move-exception
            org.greenrobot.greendao.database.Database r0 = r3.f614db
            r0.endTransaction()
            throw r4
    }

    public void updateInTx(java.lang.Iterable<T> r5) {
            r4 = this;
            org.greenrobot.greendao.internal.TableStatements r0 = r4.statements
            org.greenrobot.greendao.database.DatabaseStatement r0 = r0.getUpdateStatement()
            org.greenrobot.greendao.database.Database r1 = r4.f614db
            r1.beginTransaction()
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L6d
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r1 = r4.identityScope     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L13
            r1.lock()     // Catch: java.lang.Throwable -> L61
        L13:
            boolean r1 = r4.isStandardSQLite     // Catch: java.lang.Throwable -> L58
            r2 = 0
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.getRawStatement()     // Catch: java.lang.Throwable -> L58
            android.database.sqlite.SQLiteStatement r1 = (android.database.sqlite.SQLiteStatement) r1     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L58
        L22:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L42
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L58
            r4.updateInsideSynchronized(r3, r1, r2)     // Catch: java.lang.Throwable -> L58
            goto L22
        L30:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L58
        L34:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L42
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L58
            r4.updateInsideSynchronized(r1, r0, r2)     // Catch: java.lang.Throwable -> L58
            goto L34
        L42:
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r5 = r4.identityScope     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L49
            r5.unlock()     // Catch: java.lang.Throwable -> L61
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            org.greenrobot.greendao.database.Database r5 = r4.f614db     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L6d
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L6d
            org.greenrobot.greendao.database.Database r5 = r4.f614db     // Catch: java.lang.RuntimeException -> L56
            r5.endTransaction()     // Catch: java.lang.RuntimeException -> L56
            r5 = 0
            goto L73
        L56:
            r5 = move-exception
            throw r5
        L58:
            r5 = move-exception
            org.greenrobot.greendao.identityscope.IdentityScope<K, T> r1 = r4.identityScope     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L60
            r1.unlock()     // Catch: java.lang.Throwable -> L61
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r5     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L6d
        L64:
            r5 = move-exception
            org.greenrobot.greendao.database.Database r0 = r4.f614db     // Catch: java.lang.RuntimeException -> L6b
            r0.endTransaction()     // Catch: java.lang.RuntimeException -> L6b
            throw r5
        L6b:
            r5 = move-exception
            throw r5
        L6d:
            r5 = move-exception
            org.greenrobot.greendao.database.Database r0 = r4.f614db     // Catch: java.lang.RuntimeException -> L77
            r0.endTransaction()     // Catch: java.lang.RuntimeException -> L77
        L73:
            if (r5 != 0) goto L76
            return
        L76:
            throw r5
        L77:
            r0 = move-exception
            java.lang.String r1 = "Could not end transaction (rethrowing initial exception)"
            org.greenrobot.greendao.DaoLog.m109w(r1, r0)
            throw r5
    }

    public void updateInTx(T... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.updateInTx(r1)
            return
    }

    protected void updateInsideSynchronized(T r5, android.database.sqlite.SQLiteStatement r6, boolean r7) {
            r4 = this;
            r4.bindValues(r6, r5)
            org.greenrobot.greendao.internal.DaoConfig r0 = r4.config
            java.lang.String[] r0 = r0.allColumns
            int r0 = r0.length
            int r0 = r0 + 1
            java.lang.Object r1 = r4.getKey(r5)
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L1d
            r2 = r1
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r6.bindLong(r0, r2)
            goto L26
        L1d:
            if (r1 == 0) goto L2d
            java.lang.String r2 = r1.toString()
            r6.bindString(r0, r2)
        L26:
            r6.execute()
            r4.attachEntity(r1, r5, r7)
            return
        L2d:
            org.greenrobot.greendao.DaoException r5 = new org.greenrobot.greendao.DaoException
            java.lang.String r6 = "Cannot update entity without key - was it inserted before?"
            r5.<init>(r6)
            throw r5
    }

    protected void updateInsideSynchronized(T r5, org.greenrobot.greendao.database.DatabaseStatement r6, boolean r7) {
            r4 = this;
            r4.bindValues(r6, r5)
            org.greenrobot.greendao.internal.DaoConfig r0 = r4.config
            java.lang.String[] r0 = r0.allColumns
            int r0 = r0.length
            int r0 = r0 + 1
            java.lang.Object r1 = r4.getKey(r5)
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L1d
            r2 = r1
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r6.bindLong(r0, r2)
            goto L26
        L1d:
            if (r1 == 0) goto L2d
            java.lang.String r2 = r1.toString()
            r6.bindString(r0, r2)
        L26:
            r6.execute()
            r4.attachEntity(r1, r5, r7)
            return
        L2d:
            org.greenrobot.greendao.DaoException r5 = new org.greenrobot.greendao.DaoException
            java.lang.String r6 = "Cannot update entity without key - was it inserted before?"
            r5.<init>(r6)
            throw r5
    }

    protected abstract K updateKeyAfterInsert(T r1, long r2);

    protected void updateKeyAfterInsertAndAttach(T r3, long r4, boolean r6) {
            r2 = this;
            r0 = -1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto Le
            java.lang.Object r4 = r2.updateKeyAfterInsert(r3, r4)
            r2.attachEntity(r4, r3, r6)
            goto L13
        Le:
            java.lang.String r3 = "Could not insert row (executeInsert returned -1)"
            org.greenrobot.greendao.DaoLog.m108w(r3)
        L13:
            return
    }
}
