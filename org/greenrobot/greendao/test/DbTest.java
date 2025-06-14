package org.greenrobot.greendao.test;

/* loaded from: classes.dex */
public abstract class DbTest extends android.test.AndroidTestCase {
    public static final java.lang.String DB_NAME = "greendao-unittest-db.temp";
    private android.app.Application application;

    /* renamed from: db */
    protected org.greenrobot.greendao.database.Database f621db;
    protected final boolean inMemory;
    protected final java.util.Random random;

    public DbTest() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public DbTest(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.inMemory = r1
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0.random = r1
            return
    }

    public <T extends android.app.Application> T createApplication(java.lang.Class<T> r5) {
            r4 = this;
            java.lang.String r0 = "Application already created"
            android.app.Application r1 = r4.application
            assertNull(r0, r1)
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Exception -> L15
            android.app.Application r5 = android.app.Instrumentation.newApplication(r5, r0)     // Catch: java.lang.Exception -> L15
            r5.onCreate()
            r4.application = r5
            return r5
        L15:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create application "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    protected org.greenrobot.greendao.database.Database createDatabase() {
            r4 = this;
            boolean r0 = r4.inMemory
            r1 = 0
            if (r0 == 0) goto La
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.create(r1)
            goto L1c
        La:
            android.content.Context r0 = r4.getContext()
            java.lang.String r2 = "greendao-unittest-db.temp"
            r0.deleteDatabase(r2)
            android.content.Context r0 = r4.getContext()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.openOrCreateDatabase(r2, r3, r1)
        L1c:
            org.greenrobot.greendao.database.StandardDatabase r1 = new org.greenrobot.greendao.database.StandardDatabase
            r1.<init>(r0)
            return r1
    }

    public <T extends android.app.Application> T getApplication() {
            r2 = this;
            java.lang.String r0 = "Application not yet created"
            android.app.Application r1 = r2.application
            assertNotNull(r0, r1)
            android.app.Application r0 = r2.application
            return r0
    }

    protected void logTableDump(java.lang.String r3) {
            r2 = this;
            org.greenrobot.greendao.database.Database r0 = r2.f621db
            boolean r1 = r0 instanceof org.greenrobot.greendao.database.StandardDatabase
            if (r1 == 0) goto L10
            org.greenrobot.greendao.database.StandardDatabase r0 = (org.greenrobot.greendao.database.StandardDatabase) r0
            android.database.sqlite.SQLiteDatabase r0 = r0.getSQLiteDatabase()
            org.greenrobot.greendao.DbUtils.logTableDump(r0, r3)
            goto L24
        L10:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Table dump unsupported for "
            r3.<init>(r0)
            org.greenrobot.greendao.database.Database r0 = r2.f621db
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            org.greenrobot.greendao.DaoLog.m108w(r3)
        L24:
            return
    }

    protected void setUp() throws java.lang.Exception {
            r1 = this;
            super.setUp()
            org.greenrobot.greendao.database.Database r0 = r1.createDatabase()
            r1.f621db = r0
            return
    }

    protected void tearDown() throws java.lang.Exception {
            r2 = this;
            android.app.Application r0 = r2.application
            if (r0 == 0) goto L7
            r2.terminateApplication()
        L7:
            org.greenrobot.greendao.database.Database r0 = r2.f621db
            r0.close()
            boolean r0 = r2.inMemory
            if (r0 != 0) goto L19
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "greendao-unittest-db.temp"
            r0.deleteDatabase(r1)
        L19:
            super.tearDown()
            return
    }

    public void terminateApplication() {
            r2 = this;
            java.lang.String r0 = "Application not yet created"
            android.app.Application r1 = r2.application
            assertNotNull(r0, r1)
            android.app.Application r0 = r2.application
            r0.onTerminate()
            r0 = 0
            r2.application = r0
            return
    }
}
