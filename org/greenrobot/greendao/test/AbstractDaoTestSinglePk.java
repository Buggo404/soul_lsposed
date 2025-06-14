package org.greenrobot.greendao.test;

import org.greenrobot.greendao.AbstractDao;

/* loaded from: classes.dex */
public abstract class AbstractDaoTestSinglePk<D extends org.greenrobot.greendao.AbstractDao<T, K>, T, K> extends org.greenrobot.greendao.test.AbstractDaoTest<D, T, K> {
    private org.greenrobot.greendao.Property pkColumn;
    protected java.util.Set<K> usedPks;

    public AbstractDaoTestSinglePk(java.lang.Class<D> r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.usedPks = r1
            return
    }

    protected boolean checkKeyIsNullable() {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.createEntity(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = "Test is not available for entities with non-null keys"
            org.greenrobot.greendao.DaoLog.m100d(r0)
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    protected abstract T createEntity(K r1);

    protected T createEntityWithRandomPk() {
            r1 = this;
            java.lang.Object r0 = r1.nextPk()
            java.lang.Object r0 = r1.createEntity(r0)
            return r0
    }

    protected abstract K createRandomPk();

    protected K nextPk() {
            r3 = this;
            r0 = 0
        L1:
            r1 = 100000(0x186a0, float:1.4013E-40)
            if (r0 >= r1) goto L16
            java.lang.Object r1 = r3.createRandomPk()
            java.util.Set<K> r2 = r3.usedPks
            boolean r2 = r2.add(r1)
            if (r2 == 0) goto L13
            return r1
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find a new PK"
            r0.<init>(r1)
            throw r0
    }

    protected android.database.Cursor queryWithDummyColumnsInFront(int r6, java.lang.String r7, K r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT "
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r6) goto L17
            java.lang.StringBuilder r3 = r0.append(r7)
            java.lang.String r4 = ","
            r3.append(r4)
            int r2 = r2 + 1
            goto L9
        L17:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            java.lang.String[] r2 = r2.getAllColumns()
            java.lang.String r3 = "T"
            java.lang.StringBuilder r2 = org.greenrobot.greendao.internal.SqlUtils.appendColumns(r0, r3, r2)
            java.lang.String r3 = " FROM "
            r2.append(r3)
            r2 = 34
            java.lang.StringBuilder r3 = r0.append(r2)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r4 = r5.dao
            java.lang.String r4 = r4.getTablename()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " T"
            r2.append(r3)
            r2 = 1
            if (r8 == 0) goto L67
            java.lang.String r3 = " WHERE "
            r0.append(r3)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r3 = r5.dao
            java.lang.String[] r3 = r3.getPkColumns()
            int r3 = r3.length
            assertEquals(r2, r3)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r3 = r5.dao
            java.lang.String[] r3 = r3.getPkColumns()
            r3 = r3[r1]
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = "="
            r3.append(r4)
            android.database.DatabaseUtils.appendValueToSql(r0, r8)
        L67:
            java.lang.String r0 = r0.toString()
            org.greenrobot.greendao.database.Database r3 = r5.f621db
            r4 = 0
            android.database.Cursor r0 = r3.rawQuery(r0, r4)
            boolean r3 = r0.moveToFirst()
            assertTrue(r3)
        L79:
            if (r1 >= r6) goto L87
            java.lang.String r3 = r0.getString(r1)     // Catch: java.lang.RuntimeException -> L85
            assertEquals(r7, r3)     // Catch: java.lang.RuntimeException -> L85
            int r1 = r1 + 1
            goto L79
        L85:
            r6 = move-exception
            goto L91
        L87:
            if (r8 == 0) goto L95
            int r6 = r0.getCount()     // Catch: java.lang.RuntimeException -> L85
            assertEquals(r2, r6)     // Catch: java.lang.RuntimeException -> L85
            goto L95
        L91:
            r0.close()
            throw r6
        L95:
            return r0
    }

    protected void runLoadPkTest(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.nextPk()
            java.lang.Object r1 = r3.createEntity(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            r2.insert(r1)
            java.lang.String r1 = "42"
            android.database.Cursor r1 = r3.queryWithDummyColumnsInFront(r4, r1, r0)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r3.daoAccess     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r2.readKey(r1, r4)     // Catch: java.lang.Throwable -> L20
            assertEquals(r0, r4)     // Catch: java.lang.Throwable -> L20
            r1.close()
            return
        L20:
            r4 = move-exception
            r1.close()
            throw r4
    }

    @Override // org.greenrobot.greendao.test.AbstractDaoTest, org.greenrobot.greendao.test.DbTest
    protected void setUp() throws java.lang.Exception {
            r5 = this;
            super.setUp()
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r0 = r5.daoAccess
            org.greenrobot.greendao.Property[] r0 = r0.getProperties()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L25
            r3 = r0[r2]
            boolean r4 = r3.primaryKey
            if (r4 == 0) goto L22
            org.greenrobot.greendao.Property r4 = r5.pkColumn
            if (r4 != 0) goto L1a
            r5.pkColumn = r3
            goto L22
        L1a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Test does not work with multiple PK columns"
            r0.<init>(r1)
            throw r0
        L22:
            int r2 = r2 + 1
            goto Lb
        L25:
            org.greenrobot.greendao.Property r0 = r5.pkColumn
            if (r0 == 0) goto L2a
            return
        L2a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Test does not work without a PK column"
            r0.<init>(r1)
            throw r0
    }

    public void testCount() {
            r4 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            r0.deleteAll()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            long r0 = r0.count()
            r2 = 0
            assertEquals(r2, r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            java.lang.Object r1 = r4.createEntityWithRandomPk()
            r0.insert(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            long r0 = r0.count()
            r2 = 1
            assertEquals(r2, r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            java.lang.Object r1 = r4.createEntityWithRandomPk()
            r0.insert(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            long r0 = r0.count()
            r2 = 2
            assertEquals(r2, r0)
            return
    }

    public void testDelete() {
            r3 = this;
            java.lang.Object r0 = r3.nextPk()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            r1.deleteByKey(r0)
            java.lang.Object r1 = r3.createEntity(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            r2.insert(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            java.lang.Object r1 = r1.load(r0)
            assertNotNull(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            r1.deleteByKey(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            java.lang.Object r0 = r1.load(r0)
            assertNull(r0)
            return
    }

    public void testDeleteAll() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            r2 = 10
            if (r1 >= r2) goto L14
            java.lang.Object r2 = r5.createEntityWithRandomPk()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L14:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r5.dao
            r1.insertInTx(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r5.dao
            r1.deleteAll()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r5.dao
            long r1 = r1.count()
            r3 = 0
            assertEquals(r3, r1)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r5.daoAccess
            java.lang.Object r1 = r2.getKey(r1)
            assertNotNull(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            java.lang.Object r1 = r2.load(r1)
            assertNull(r1)
            goto L2d
        L4a:
            return
    }

    public void testDeleteByKeyInTx() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            r3 = 10
            if (r2 >= r3) goto L15
            java.lang.Object r3 = r5.createEntityWithRandomPk()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            r2.insertInTx(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r3 = r5.daoAccess
            java.lang.Object r1 = r0.get(r1)
            java.lang.Object r1 = r3.getKey(r1)
            r2.add(r1)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r1 = r5.daoAccess
            r3 = 3
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object r1 = r1.getKey(r3)
            r2.add(r1)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r1 = r5.daoAccess
            r3 = 4
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object r1 = r1.getKey(r3)
            r2.add(r1)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r1 = r5.daoAccess
            r3 = 8
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object r1 = r1.getKey(r3)
            r2.add(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r5.dao
            r1.deleteByKeyInTx(r2)
            int r0 = r0.size()
            int r1 = r2.size()
            int r0 = r0 - r1
            long r0 = (long) r0
            D extends org.greenrobot.greendao.AbstractDao<T, K> r3 = r5.dao
            long r3 = r3.count()
            assertEquals(r0, r3)
            java.util.Iterator r0 = r2.iterator()
        L73:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            assertNotNull(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            java.lang.Object r1 = r2.load(r1)
            assertNull(r1)
            goto L73
        L8a:
            return
    }

    public void testDeleteInTx() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            r3 = 10
            if (r2 >= r3) goto L15
            java.lang.Object r3 = r5.createEntityWithRandomPk()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            r2.insertInTx(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r1 = r0.get(r1)
            r2.add(r1)
            r1 = 3
            java.lang.Object r1 = r0.get(r1)
            r2.add(r1)
            r1 = 4
            java.lang.Object r1 = r0.get(r1)
            r2.add(r1)
            r1 = 8
            java.lang.Object r1 = r0.get(r1)
            r2.add(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r5.dao
            r1.deleteInTx(r2)
            int r0 = r0.size()
            int r1 = r2.size()
            int r0 = r0 - r1
            long r0 = (long) r0
            D extends org.greenrobot.greendao.AbstractDao<T, K> r3 = r5.dao
            long r3 = r3.count()
            assertEquals(r0, r3)
            java.util.Iterator r0 = r2.iterator()
        L5b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r0.next()
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r5.daoAccess
            java.lang.Object r1 = r2.getKey(r1)
            assertNotNull(r1)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            java.lang.Object r1 = r2.load(r1)
            assertNull(r1)
            goto L5b
        L78:
            return
    }

    public void testInsertAndLoad() {
            r3 = this;
            java.lang.Object r0 = r3.nextPk()
            java.lang.Object r1 = r3.createEntity(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            r2.insert(r1)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r3.daoAccess
            java.lang.Object r2 = r2.getKey(r1)
            assertEquals(r0, r2)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r3.dao
            java.lang.Object r0 = r2.load(r0)
            assertNotNull(r0)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r3.daoAccess
            java.lang.Object r1 = r2.getKey(r1)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r3.daoAccess
            java.lang.Object r0 = r2.getKey(r0)
            assertEquals(r1, r0)
            return
    }

    public void testInsertInTx() {
            r4 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            r0.deleteAll()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lb:
            r2 = 20
            if (r1 >= r2) goto L19
            java.lang.Object r2 = r4.createEntityWithRandomPk()
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L19:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r4.dao
            r1.insertInTx(r0)
            int r0 = r0.size()
            long r0 = (long) r0
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r4.dao
            long r2 = r2.count()
            assertEquals(r0, r2)
            return
    }

    public void testInsertOrReplaceInTx() {
            r5 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r5.dao
            r0.deleteAll()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L10:
            r3 = 20
            if (r2 >= r3) goto L25
            java.lang.Object r3 = r5.createEntityWithRandomPk()
            int r4 = r2 % 2
            if (r4 != 0) goto L1f
            r0.add(r3)
        L1f:
            r1.add(r3)
            int r2 = r2 + 1
            goto L10
        L25:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            r2.insertOrReplaceInTx(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r5.dao
            r0.insertOrReplaceInTx(r1)
            int r0 = r1.size()
            long r0 = (long) r0
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            long r2 = r2.count()
            assertEquals(r0, r2)
            return
    }

    public void testInsertOrReplaceTwice() {
            r6 = this;
            java.lang.Object r0 = r6.createEntityWithRandomPk()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r6.dao
            long r1 = r1.insert(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r3 = r6.dao
            long r3 = r3.insertOrReplace(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r6.dao
            org.greenrobot.greendao.Property r0 = r0.getPkProperty()
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            if (r0 != r5) goto L1f
            assertEquals(r1, r3)
        L1f:
            return
    }

    public void testInsertTwice() {
            r2 = this;
            java.lang.Object r0 = r2.nextPk()
            java.lang.Object r0 = r2.createEntity(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r2.dao
            r1.insert(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r2.dao     // Catch: android.database.SQLException -> L17
            r1.insert(r0)     // Catch: android.database.SQLException -> L17
            java.lang.String r0 = "Inserting twice should not work"
            fail(r0)     // Catch: android.database.SQLException -> L17
        L17:
            return
    }

    public void testLoadAll() {
            r3 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r3.dao
            r0.deleteAll()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lb:
            r2 = 15
            if (r1 >= r2) goto L1d
            java.lang.Object r2 = r3.nextPk()
            java.lang.Object r2 = r3.createEntity(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1d:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            r1.insertInTx(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r3.dao
            java.util.List r1 = r1.loadAll()
            int r0 = r0.size()
            int r1 = r1.size()
            assertEquals(r0, r1)
            return
    }

    public void testLoadPk() {
            r1 = this;
            r0 = 0
            r1.runLoadPkTest(r0)
            return
    }

    public void testLoadPkWithOffset() {
            r1 = this;
            r0 = 10
            r1.runLoadPkTest(r0)
            return
    }

    public void testQuery() {
            r7 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r7.dao
            java.lang.Object r1 = r7.createEntityWithRandomPk()
            r0.insert(r1)
            java.lang.Object r0 = r7.nextPk()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r7.dao
            java.lang.Object r2 = r7.createEntity(r0)
            r1.insert(r2)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r7.dao
            java.lang.Object r2 = r7.createEntityWithRandomPk()
            r1.insert(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WHERE "
            r1.<init>(r2)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r7.dao
            java.lang.String[] r2 = r2.getPkColumns()
            r3 = 0
            r2 = r2[r3]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "=?"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r7.dao
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r6 = r0.toString()
            r5[r3] = r6
            java.util.List r1 = r2.queryRaw(r1, r5)
            int r2 = r1.size()
            assertEquals(r4, r2)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r2 = r7.daoAccess
            java.lang.Object r1 = r1.get(r3)
            java.lang.Object r1 = r2.getKey(r1)
            assertEquals(r0, r1)
            return
    }

    public void testReadWithOffset() {
            r4 = this;
            java.lang.Object r0 = r4.nextPk()
            java.lang.Object r1 = r4.createEntity(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r4.dao
            r2.insert(r1)
            java.lang.String r1 = "42"
            r2 = 5
            android.database.Cursor r1 = r4.queryWithDummyColumnsInFront(r2, r1, r0)
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r3 = r4.daoAccess     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r3.readEntity(r1, r2)     // Catch: java.lang.Throwable -> L27
            org.greenrobot.greendao.InternalUnitTestDaoAccess<T, K> r3 = r4.daoAccess     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r3.getKey(r2)     // Catch: java.lang.Throwable -> L27
            assertEquals(r0, r2)     // Catch: java.lang.Throwable -> L27
            r1.close()
            return
        L27:
            r0 = move-exception
            r1.close()
            throw r0
    }

    public void testRowId() {
            r4 = this;
            java.lang.Object r0 = r4.createEntityWithRandomPk()
            java.lang.Object r1 = r4.createEntityWithRandomPk()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r4.dao
            long r2 = r2.insert(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            long r0 = r0.insert(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            assertTrue(r0)
            return
    }

    public void testSave() {
            r4 = this;
            boolean r0 = r4.checkKeyIsNullable()
            if (r0 != 0) goto L7
            return
        L7:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            r0.deleteAll()
            r0 = 0
            java.lang.Object r0 = r4.createEntity(r0)
            if (r0 == 0) goto L28
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r4.dao
            r1.save(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r4.dao
            r1.save(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            long r0 = r0.count()
            r2 = 1
            assertEquals(r2, r0)
        L28:
            return
    }

    public void testSaveInTx() {
            r5 = this;
            boolean r0 = r5.checkKeyIsNullable()
            if (r0 != 0) goto L7
            return
        L7:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r5.dao
            r0.deleteAll()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L17:
            r3 = 20
            if (r2 >= r3) goto L2d
            r3 = 0
            java.lang.Object r3 = r5.createEntity(r3)
            int r4 = r2 % 2
            if (r4 != 0) goto L27
            r0.add(r3)
        L27:
            r1.add(r3)
            int r2 = r2 + 1
            goto L17
        L2d:
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            r2.saveInTx(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r5.dao
            r0.saveInTx(r1)
            int r0 = r1.size()
            long r0 = (long) r0
            D extends org.greenrobot.greendao.AbstractDao<T, K> r2 = r5.dao
            long r2 = r2.count()
            assertEquals(r0, r2)
            return
    }

    public void testUpdate() {
            r4 = this;
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            r0.deleteAll()
            java.lang.Object r0 = r4.createEntityWithRandomPk()
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r4.dao
            r1.insert(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r1 = r4.dao
            r1.update(r0)
            D extends org.greenrobot.greendao.AbstractDao<T, K> r0 = r4.dao
            long r0 = r0.count()
            r2 = 1
            assertEquals(r2, r0)
            return
    }
}
