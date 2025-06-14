package com.github.yuweiguocn.library.greendao;

/* loaded from: classes.dex */
public final class MigrationHelper {
    public static boolean DEBUG = false;
    private static final java.lang.String SQLITE_MASTER = "sqlite_master";
    private static final java.lang.String SQLITE_TEMP_MASTER = "sqlite_temp_master";
    private static java.lang.String TAG = "MigrationHelper";
    private static java.lang.ref.WeakReference<com.github.yuweiguocn.library.greendao.MigrationHelper.ReCreateAllTableListener> weakListener;

    public interface ReCreateAllTableListener {
        void onCreateAllTables(org.greenrobot.greendao.database.Database r1, boolean r2);

        void onDropAllTables(org.greenrobot.greendao.database.Database r1, boolean r2);
    }

    private static class TableInfo {
        int cid;
        java.lang.String dfltValue;
        java.lang.String name;
        boolean notnull;

        /* renamed from: pk */
        boolean f89pk;
        java.lang.String type;

        private TableInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.List access$000(org.greenrobot.greendao.database.Database r0, java.lang.String r1) {
                java.util.List r0 = getTableInfo(r0, r1)
                return r0
        }

        private static java.util.List<com.github.yuweiguocn.library.greendao.MigrationHelper.TableInfo> getTableInfo(org.greenrobot.greendao.database.Database r4, java.lang.String r5) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PRAGMA table_info("
                r0.<init>(r1)
                java.lang.StringBuilder r5 = r0.append(r5)
                java.lang.String r0 = ")"
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r5 = r5.toString()
                com.github.yuweiguocn.library.greendao.MigrationHelper.access$100(r5)
                r0 = 0
                android.database.Cursor r4 = r4.rawQuery(r5, r0)
                if (r4 != 0) goto L25
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                return r4
            L25:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L2a:
                boolean r0 = r4.moveToNext()
                if (r0 == 0) goto L6b
                com.github.yuweiguocn.library.greendao.MigrationHelper$TableInfo r0 = new com.github.yuweiguocn.library.greendao.MigrationHelper$TableInfo
                r0.<init>()
                r1 = 0
                int r2 = r4.getInt(r1)
                r0.cid = r2
                r2 = 1
                java.lang.String r3 = r4.getString(r2)
                r0.name = r3
                r3 = 2
                java.lang.String r3 = r4.getString(r3)
                r0.type = r3
                r3 = 3
                int r3 = r4.getInt(r3)
                if (r3 != r2) goto L53
                r3 = r2
                goto L54
            L53:
                r3 = r1
            L54:
                r0.notnull = r3
                r3 = 4
                java.lang.String r3 = r4.getString(r3)
                r0.dfltValue = r3
                r3 = 5
                int r3 = r4.getInt(r3)
                if (r3 != r2) goto L65
                r1 = r2
            L65:
                r0.f89pk = r1
                r5.add(r0)
                goto L2a
            L6b:
                r4.close()
                return r5
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 == r3) goto L1d
                if (r3 == 0) goto L1b
                java.lang.Class r0 = r2.getClass()
                java.lang.Class r1 = r3.getClass()
                if (r0 != r1) goto L1b
                java.lang.String r0 = r2.name
                com.github.yuweiguocn.library.greendao.MigrationHelper$TableInfo r3 = (com.github.yuweiguocn.library.greendao.MigrationHelper.TableInfo) r3
                java.lang.String r3 = r3.name
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L1b
                goto L1d
            L1b:
                r3 = 0
                goto L1e
            L1d:
                r3 = 1
            L1e:
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "TableInfo{cid="
                r0.<init>(r1)
                int r1 = r2.cid
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", name='"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.name
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "', type='"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.type
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "', notnull="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.notnull
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", dfltValue='"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.dfltValue
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "', pk="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.f89pk
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            return
    }

    public MigrationHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$100(java.lang.String r0) {
            printLog(r0)
            return
    }

    private static void createAllTables(org.greenrobot.greendao.database.Database r1, boolean r2, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r3) {
            java.lang.String r0 = "createTable"
            reflectMethod(r1, r0, r2, r3)
            java.lang.String r1 = "【Create all table by reflect】"
            printLog(r1)
            return
    }

    private static void dropAllTables(org.greenrobot.greendao.database.Database r1, boolean r2, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r3) {
            java.lang.String r0 = "dropTable"
            reflectMethod(r1, r0, r2, r3)
            java.lang.String r1 = "【Drop all table by reflect】"
            printLog(r1)
            return
    }

    private static void generateTempTables(org.greenrobot.greendao.database.Database r8, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r9) {
            java.lang.String r0 = ";"
            r1 = 0
            r2 = r1
        L4:
            int r3 = r9.length
            if (r2 >= r3) goto Lc2
            org.greenrobot.greendao.internal.DaoConfig r3 = new org.greenrobot.greendao.internal.DaoConfig
            r4 = r9[r2]
            r3.<init>(r8, r4)
            java.lang.String r4 = r3.tablename
            boolean r5 = isTableExists(r8, r1, r4)
            if (r5 != 0) goto L2a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "【New Table】"
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            printLog(r3)
            goto Lbe
        L2a:
            r5 = 0
            java.lang.String r6 = r3.tablename     // Catch: android.database.SQLException -> La9
            java.lang.String r7 = "_TEMP"
            java.lang.String r5 = r6.concat(r7)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> La9
            r6.<init>()     // Catch: android.database.SQLException -> La9
            java.lang.String r7 = "DROP TABLE IF EXISTS "
            java.lang.StringBuilder r7 = r6.append(r7)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r7 = r7.append(r5)     // Catch: android.database.SQLException -> La9
            r7.append(r0)     // Catch: android.database.SQLException -> La9
            java.lang.String r6 = r6.toString()     // Catch: android.database.SQLException -> La9
            r8.execSQL(r6)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> La9
            r6.<init>()     // Catch: android.database.SQLException -> La9
            java.lang.String r7 = "CREATE TEMPORARY TABLE "
            java.lang.StringBuilder r7 = r6.append(r7)     // Catch: android.database.SQLException -> La9
            r7.append(r5)     // Catch: android.database.SQLException -> La9
            java.lang.String r7 = " AS SELECT * FROM "
            java.lang.StringBuilder r7 = r6.append(r7)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r7 = r7.append(r4)     // Catch: android.database.SQLException -> La9
            r7.append(r0)     // Catch: android.database.SQLException -> La9
            java.lang.String r6 = r6.toString()     // Catch: android.database.SQLException -> La9
            r8.execSQL(r6)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> La9
            r6.<init>()     // Catch: android.database.SQLException -> La9
            java.lang.String r7 = "【Table】"
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: android.database.SQLException -> La9
            java.lang.String r6 = "\n ---Columns-->"
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: android.database.SQLException -> La9
            java.lang.String r3 = getColumnsStr(r3)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: android.database.SQLException -> La9
            java.lang.String r3 = r3.toString()     // Catch: android.database.SQLException -> La9
            printLog(r3)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> La9
            r3.<init>()     // Catch: android.database.SQLException -> La9
            java.lang.String r4 = "【Generate temp table】"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: android.database.SQLException -> La9
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: android.database.SQLException -> La9
            java.lang.String r3 = r3.toString()     // Catch: android.database.SQLException -> La9
            printLog(r3)     // Catch: android.database.SQLException -> La9
            goto Lbe
        La9:
            r3 = move-exception
            java.lang.String r4 = com.github.yuweiguocn.library.greendao.MigrationHelper.TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "【Failed to generate temp table】"
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r4, r5, r3)
        Lbe:
            int r2 = r2 + 1
            goto L4
        Lc2:
            return
    }

    private static java.util.List<java.lang.String> getColumns(org.greenrobot.greendao.database.Database r3, java.lang.String r4) {
            java.lang.String r0 = "SELECT * FROM "
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.String r0 = " limit 0"
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            android.database.Cursor r3 = r3.rawQuery(r4, r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r3 == 0) goto L31
            int r4 = r3.getColumnCount()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r4 <= 0) goto L31
            java.lang.String[] r4 = r3.getColumnNames()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.util.List r1 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L31
        L2b:
            r4 = move-exception
            r1 = r3
            goto L4f
        L2e:
            r4 = move-exception
            r1 = r3
            goto L41
        L31:
            if (r3 == 0) goto L36
            r3.close()
        L36:
            if (r1 != 0) goto L4e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L4e
        L3e:
            r4 = move-exception
            goto L4f
        L40:
            r4 = move-exception
        L41:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L49
            r1.close()
        L49:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L4e:
            return r1
        L4f:
            if (r1 == 0) goto L54
            r1.close()
        L54:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            throw r4
    }

    private static java.lang.String getColumnsStr(org.greenrobot.greendao.internal.DaoConfig r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = "no columns"
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lb:
            java.lang.String[] r2 = r3.allColumns
            int r2 = r2.length
            if (r1 >= r2) goto L1f
            java.lang.String[] r2 = r3.allColumns
            r2 = r2[r1]
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r0.length()
            if (r3 <= 0) goto L2e
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.deleteCharAt(r3)
        L2e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static boolean isTableExists(org.greenrobot.greendao.database.Database r5, boolean r6, java.lang.String r7) {
            r0 = 0
            if (r5 == 0) goto L64
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto La
            goto L64
        La:
            if (r6 == 0) goto Lf
            java.lang.String r6 = "sqlite_temp_master"
            goto L11
        Lf:
            java.lang.String r6 = "sqlite_master"
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT COUNT(*) FROM "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = " WHERE type = ? AND name = ?"
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r4 = "table"
            r1[r0] = r4     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r1[r2] = r7     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            android.database.Cursor r3 = r5.rawQuery(r6, r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r3 == 0) goto L48
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r5 != 0) goto L3e
            goto L48
        L3e:
            int r5 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r3 == 0) goto L5a
            r3.close()
            goto L5a
        L48:
            if (r3 == 0) goto L4d
            r3.close()
        L4d:
            return r0
        L4e:
            r5 = move-exception
            goto L5e
        L50:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L59
            r3.close()
        L59:
            r5 = r0
        L5a:
            if (r5 <= 0) goto L5d
            r0 = r2
        L5d:
            return r0
        L5e:
            if (r3 == 0) goto L63
            r3.close()
        L63:
            throw r5
        L64:
            return r0
    }

    public static void migrate(android.database.sqlite.SQLiteDatabase r1, com.github.yuweiguocn.library.greendao.MigrationHelper.ReCreateAllTableListener r2, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r3) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            com.github.yuweiguocn.library.greendao.MigrationHelper.weakListener = r0
            migrate(r1, r3)
            return
    }

    public static void migrate(android.database.sqlite.SQLiteDatabase r2, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "【The Old Database Version】"
            r0.<init>(r1)
            int r1 = r2.getVersion()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            printLog(r0)
            org.greenrobot.greendao.database.StandardDatabase r0 = new org.greenrobot.greendao.database.StandardDatabase
            r0.<init>(r2)
            migrate(r0, r3)
            return
    }

    public static void migrate(org.greenrobot.greendao.database.Database r1, com.github.yuweiguocn.library.greendao.MigrationHelper.ReCreateAllTableListener r2, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r3) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            com.github.yuweiguocn.library.greendao.MigrationHelper.weakListener = r0
            migrate(r1, r3)
            return
    }

    public static void migrate(org.greenrobot.greendao.database.Database r3, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r4) {
            java.lang.String r0 = "【Generate temp table】start"
            printLog(r0)
            generateTempTables(r3, r4)
            java.lang.String r0 = "【Generate temp table】complete"
            printLog(r0)
            java.lang.ref.WeakReference<com.github.yuweiguocn.library.greendao.MigrationHelper$ReCreateAllTableListener> r0 = com.github.yuweiguocn.library.greendao.MigrationHelper.weakListener
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.get()
            com.github.yuweiguocn.library.greendao.MigrationHelper$ReCreateAllTableListener r0 = (com.github.yuweiguocn.library.greendao.MigrationHelper.ReCreateAllTableListener) r0
            goto L19
        L18:
            r0 = 0
        L19:
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            r0.onDropAllTables(r3, r2)
            java.lang.String r2 = "【Drop all table by listener】"
            printLog(r2)
            r0.onCreateAllTables(r3, r1)
            java.lang.String r0 = "【Create all table by listener】"
            printLog(r0)
            goto L34
        L2e:
            dropAllTables(r3, r2, r4)
            createAllTables(r3, r1, r4)
        L34:
            java.lang.String r0 = "【Restore data】start"
            printLog(r0)
            restoreData(r3, r4)
            java.lang.String r3 = "【Restore data】complete"
            printLog(r3)
            return
    }

    private static void printLog(java.lang.String r1) {
            boolean r0 = com.github.yuweiguocn.library.greendao.MigrationHelper.DEBUG
            if (r0 == 0) goto L9
            java.lang.String r0 = com.github.yuweiguocn.library.greendao.MigrationHelper.TAG
            android.util.Log.d(r0, r1)
        L9:
            return
    }

    private static void reflectMethod(org.greenrobot.greendao.database.Database r8, java.lang.String r9, boolean r10, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r11) {
            int r0 = r11.length
            r1 = 1
            if (r0 >= r1) goto L5
            return
        L5:
            int r0 = r11.length     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L3a
            r4 = r11[r3]     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            java.lang.Class<org.greenrobot.greendao.database.Database> r7 = org.greenrobot.greendao.database.Database.class
            r6[r2] = r7     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            r6[r1] = r7     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r9, r6)     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            r5[r2] = r8     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            r5[r1] = r6     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            r6 = 0
            r4.invoke(r6, r5)     // Catch: java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L36
            int r3 = r3 + 1
            goto L8
        L2c:
            r8 = move-exception
            r8.printStackTrace()
            goto L3a
        L31:
            r8 = move-exception
            r8.printStackTrace()
            goto L3a
        L36:
            r8 = move-exception
            r8.printStackTrace()
        L3a:
            return
    }

    private static void restoreData(org.greenrobot.greendao.database.Database r13, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>>... r14) {
            java.lang.String r0 = ","
            r1 = 0
        L3:
            int r2 = r14.length
            if (r1 >= r2) goto L179
            org.greenrobot.greendao.internal.DaoConfig r2 = new org.greenrobot.greendao.internal.DaoConfig
            r3 = r14[r1]
            r2.<init>(r13, r3)
            java.lang.String r3 = r2.tablename
            java.lang.String r2 = r2.tablename
            java.lang.String r4 = "_TEMP"
            java.lang.String r2 = r2.concat(r4)
            r4 = 1
            boolean r4 = isTableExists(r13, r4, r2)
            if (r4 != 0) goto L20
            goto L175
        L20:
            java.util.List r4 = com.github.yuweiguocn.library.greendao.MigrationHelper.TableInfo.access$000(r13, r3)     // Catch: android.database.SQLException -> L160
            java.util.List r5 = com.github.yuweiguocn.library.greendao.MigrationHelper.TableInfo.access$000(r13, r2)     // Catch: android.database.SQLException -> L160
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: android.database.SQLException -> L160
            int r7 = r4.size()     // Catch: android.database.SQLException -> L160
            r6.<init>(r7)     // Catch: android.database.SQLException -> L160
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: android.database.SQLException -> L160
            int r8 = r4.size()     // Catch: android.database.SQLException -> L160
            r7.<init>(r8)     // Catch: android.database.SQLException -> L160
            java.util.Iterator r8 = r5.iterator()     // Catch: android.database.SQLException -> L160
        L3e:
            boolean r9 = r8.hasNext()     // Catch: android.database.SQLException -> L160
            r10 = 96
            if (r9 == 0) goto L70
            java.lang.Object r9 = r8.next()     // Catch: android.database.SQLException -> L160
            com.github.yuweiguocn.library.greendao.MigrationHelper$TableInfo r9 = (com.github.yuweiguocn.library.greendao.MigrationHelper.TableInfo) r9     // Catch: android.database.SQLException -> L160
            boolean r11 = r4.contains(r9)     // Catch: android.database.SQLException -> L160
            if (r11 == 0) goto L3e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r11.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r11 = r11.append(r10)     // Catch: android.database.SQLException -> L160
            java.lang.String r9 = r9.name     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r9 = r11.append(r9)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: android.database.SQLException -> L160
            java.lang.String r9 = r9.toString()     // Catch: android.database.SQLException -> L160
            r7.add(r9)     // Catch: android.database.SQLException -> L160
            r6.add(r9)     // Catch: android.database.SQLException -> L160
            goto L3e
        L70:
            java.util.Iterator r4 = r4.iterator()     // Catch: android.database.SQLException -> L160
        L74:
            boolean r8 = r4.hasNext()     // Catch: android.database.SQLException -> L160
            if (r8 == 0) goto Ldb
            java.lang.Object r8 = r4.next()     // Catch: android.database.SQLException -> L160
            com.github.yuweiguocn.library.greendao.MigrationHelper$TableInfo r8 = (com.github.yuweiguocn.library.greendao.MigrationHelper.TableInfo) r8     // Catch: android.database.SQLException -> L160
            boolean r9 = r8.notnull     // Catch: android.database.SQLException -> L160
            if (r9 == 0) goto L74
            boolean r9 = r5.contains(r8)     // Catch: android.database.SQLException -> L160
            if (r9 != 0) goto L74
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r9.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: android.database.SQLException -> L160
            java.lang.String r11 = r8.name     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r9 = r9.append(r11)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: android.database.SQLException -> L160
            java.lang.String r9 = r9.toString()     // Catch: android.database.SQLException -> L160
            r7.add(r9)     // Catch: android.database.SQLException -> L160
            java.lang.String r11 = r8.dfltValue     // Catch: android.database.SQLException -> L160
            if (r11 == 0) goto Lc4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r11.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.String r12 = "'"
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: android.database.SQLException -> L160
            java.lang.String r8 = r8.dfltValue     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r8 = r11.append(r8)     // Catch: android.database.SQLException -> L160
            java.lang.String r11 = "' AS "
            java.lang.StringBuilder r8 = r8.append(r11)     // Catch: android.database.SQLException -> L160
            java.lang.String r8 = r8.toString()     // Catch: android.database.SQLException -> L160
            goto Lc6
        Lc4:
            java.lang.String r8 = "'' AS "
        Lc6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r11.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r8 = r11.append(r8)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: android.database.SQLException -> L160
            java.lang.String r8 = r8.toString()     // Catch: android.database.SQLException -> L160
            r6.add(r8)     // Catch: android.database.SQLException -> L160
            goto L74
        Ldb:
            int r4 = r7.size()     // Catch: android.database.SQLException -> L160
            if (r4 == 0) goto L134
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r4.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.String r5 = "REPLACE INTO "
            java.lang.StringBuilder r5 = r4.append(r5)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: android.database.SQLException -> L160
            java.lang.String r8 = " ("
            r5.append(r8)     // Catch: android.database.SQLException -> L160
            java.lang.String r5 = android.text.TextUtils.join(r0, r7)     // Catch: android.database.SQLException -> L160
            r4.append(r5)     // Catch: android.database.SQLException -> L160
            java.lang.String r5 = ") SELECT "
            r4.append(r5)     // Catch: android.database.SQLException -> L160
            java.lang.String r5 = android.text.TextUtils.join(r0, r6)     // Catch: android.database.SQLException -> L160
            r4.append(r5)     // Catch: android.database.SQLException -> L160
            java.lang.String r5 = " FROM "
            java.lang.StringBuilder r5 = r4.append(r5)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: android.database.SQLException -> L160
            java.lang.String r6 = ";"
            r5.append(r6)     // Catch: android.database.SQLException -> L160
            java.lang.String r4 = r4.toString()     // Catch: android.database.SQLException -> L160
            r13.execSQL(r4)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r4.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.String r5 = "【Restore data】 to "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: android.database.SQLException -> L160
            java.lang.String r3 = r3.toString()     // Catch: android.database.SQLException -> L160
            printLog(r3)     // Catch: android.database.SQLException -> L160
        L134:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r3.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.String r4 = "DROP TABLE "
            java.lang.StringBuilder r4 = r3.append(r4)     // Catch: android.database.SQLException -> L160
            r4.append(r2)     // Catch: android.database.SQLException -> L160
            java.lang.String r3 = r3.toString()     // Catch: android.database.SQLException -> L160
            r13.execSQL(r3)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L160
            r3.<init>()     // Catch: android.database.SQLException -> L160
            java.lang.String r4 = "【Drop temp table】"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: android.database.SQLException -> L160
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch: android.database.SQLException -> L160
            java.lang.String r3 = r3.toString()     // Catch: android.database.SQLException -> L160
            printLog(r3)     // Catch: android.database.SQLException -> L160
            goto L175
        L160:
            r3 = move-exception
            java.lang.String r4 = com.github.yuweiguocn.library.greendao.MigrationHelper.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "【Failed to restore data from temp table 】"
            r5.<init>(r6)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r4, r2, r3)
        L175:
            int r1 = r1 + 1
            goto L3
        L179:
            return
    }
}
