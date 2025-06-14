package org.greenrobot.greendao;

/* loaded from: classes.dex */
public class DbUtils {
    public DbUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int copyAllBytes(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = r1
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 != r4) goto Le
            return r2
        Le:
            r6.write(r0, r1, r3)
            int r2 = r2 + r3
            goto L6
    }

    public static int executeSqlScript(android.content.Context r1, org.greenrobot.greendao.database.Database r2, java.lang.String r3) throws java.io.IOException {
            r0 = 1
            int r1 = executeSqlScript(r1, r2, r3, r0)
            return r1
    }

    public static int executeSqlScript(android.content.Context r2, org.greenrobot.greendao.database.Database r3, java.lang.String r4, boolean r5) throws java.io.IOException {
            byte[] r2 = readAsset(r2, r4)
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)
            java.lang.String r2 = ";(\\s)*[\n\r]"
            java.lang.String[] r2 = r0.split(r2)
            if (r5 == 0) goto L18
            int r2 = executeSqlStatementsInTx(r3, r2)
            goto L1c
        L18:
            int r2 = executeSqlStatements(r3, r2)
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Executed "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r5 = " statements from SQL script '"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            org.greenrobot.greendao.DaoLog.m104i(r3)
            return r2
    }

    public static int executeSqlStatements(org.greenrobot.greendao.database.Database r5, java.lang.String[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L19
            r3 = r6[r1]
            java.lang.String r3 = r3.trim()
            int r4 = r3.length()
            if (r4 <= 0) goto L16
            r5.execSQL(r3)
            int r2 = r2 + 1
        L16:
            int r1 = r1 + 1
            goto L3
        L19:
            return r2
    }

    public static int executeSqlStatementsInTx(org.greenrobot.greendao.database.Database r0, java.lang.String[] r1) {
            r0.beginTransaction()
            int r1 = executeSqlStatements(r0, r1)     // Catch: java.lang.Throwable -> Le
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Le
            r0.endTransaction()
            return r1
        Le:
            r1 = move-exception
            r0.endTransaction()
            throw r1
    }

    public static void logTableDump(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9) {
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = android.database.DatabaseUtils.dumpCursorToString(r8)     // Catch: java.lang.Throwable -> L17
            org.greenrobot.greendao.DaoLog.m100d(r9)     // Catch: java.lang.Throwable -> L17
            r8.close()
            return
        L17:
            r9 = move-exception
            r8.close()
            throw r9
    }

    public static byte[] readAllBytes(java.io.InputStream r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            copyAllBytes(r1, r0)
            byte[] r1 = r0.toByteArray()
            return r1
    }

    public static byte[] readAsset(android.content.Context r0, java.lang.String r1) throws java.io.IOException {
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            java.io.InputStream r0 = r0.open(r1)
            byte[] r1 = readAllBytes(r0)     // Catch: java.lang.Throwable -> L14
            r0.close()
            return r1
        L14:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public static void vacuum(org.greenrobot.greendao.database.Database r1) {
            java.lang.String r0 = "VACUUM"
            r1.execSQL(r0)
            return
    }
}
