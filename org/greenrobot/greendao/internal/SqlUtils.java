package org.greenrobot.greendao.internal;

/* loaded from: classes.dex */
public class SqlUtils {
    private static final char[] HEX_ARRAY = null;

    static {
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            org.greenrobot.greendao.internal.SqlUtils.HEX_ARRAY = r0
            return
    }

    public SqlUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.StringBuilder appendColumn(java.lang.StringBuilder r2, java.lang.String r3) {
            r0 = 34
            java.lang.StringBuilder r1 = r2.append(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            r3.append(r0)
            return r2
    }

    public static java.lang.StringBuilder appendColumn(java.lang.StringBuilder r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r0 = ".\""
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 34
            r2.append(r3)
            return r1
    }

    public static java.lang.StringBuilder appendColumns(java.lang.StringBuilder r3, java.lang.String r4, java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L15
            r2 = r5[r1]
            appendColumn(r3, r4, r2)
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L12
            r2 = 44
            r3.append(r2)
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            return r3
    }

    public static java.lang.StringBuilder appendColumns(java.lang.StringBuilder r5, java.lang.String[] r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1f
            r2 = 34
            java.lang.StringBuilder r3 = r5.append(r2)
            r4 = r6[r1]
            java.lang.StringBuilder r3 = r3.append(r4)
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L1c
            r2 = 44
            r5.append(r2)
        L1c:
            int r1 = r1 + 1
            goto L2
        L1f:
            return r5
    }

    public static java.lang.StringBuilder appendColumnsEqValue(java.lang.StringBuilder r3, java.lang.String r4, java.lang.String[] r5) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L1c
            r1 = r5[r0]
            java.lang.StringBuilder r1 = appendColumn(r3, r4, r1)
            java.lang.String r2 = "=?"
            r1.append(r2)
            int r1 = r5.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L19
            r1 = 44
            r3.append(r1)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return r3
    }

    public static java.lang.StringBuilder appendColumnsEqualPlaceholders(java.lang.StringBuilder r3, java.lang.String[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L1c
            r1 = r4[r0]
            java.lang.StringBuilder r1 = appendColumn(r3, r1)
            java.lang.String r2 = "=?"
            r1.append(r2)
            int r1 = r4.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L19
            r1 = 44
            r3.append(r1)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return r3
    }

    public static java.lang.StringBuilder appendPlaceholders(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L15
            int r1 = r3 + (-1)
            if (r0 >= r1) goto Ld
            java.lang.String r1 = "?,"
            r2.append(r1)
            goto L12
        Ld:
            r1 = 63
            r2.append(r1)
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return r2
    }

    public static java.lang.StringBuilder appendProperty(java.lang.StringBuilder r1, java.lang.String r2, org.greenrobot.greendao.Property r3) {
            if (r2 == 0) goto Lb
            java.lang.StringBuilder r2 = r1.append(r2)
            r0 = 46
            r2.append(r0)
        Lb:
            r2 = 34
            java.lang.StringBuilder r0 = r1.append(r2)
            java.lang.String r3 = r3.columnName
            java.lang.StringBuilder r3 = r0.append(r3)
            r3.append(r2)
            return r1
    }

    public static java.lang.String createSqlCount(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT COUNT(*) FROM \""
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 34
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String createSqlDelete(java.lang.String r2, java.lang.String[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 34
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DELETE FROM "
            r0.<init>(r1)
            r0.append(r2)
            if (r3 == 0) goto L2c
            int r1 = r3.length
            if (r1 <= 0) goto L2c
            java.lang.String r1 = " WHERE "
            r0.append(r1)
            appendColumnsEqValue(r0, r2, r3)
        L2c:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String createSqlInsert(java.lang.String r1, java.lang.String r2, java.lang.String[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r1 = 34
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\" ("
            r1.append(r2)
            appendColumns(r0, r3)
            java.lang.String r1 = ") VALUES ("
            r0.append(r1)
            int r1 = r3.length
            appendPlaceholders(r0, r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String createSqlSelect(java.lang.String r1, java.lang.String r2, java.lang.String[] r3, boolean r4) {
            if (r2 == 0) goto L3d
            int r0 = r2.length()
            if (r0 < 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r4 == 0) goto Lf
            java.lang.String r4 = "SELECT DISTINCT "
            goto L11
        Lf:
            java.lang.String r4 = "SELECT "
        L11:
            r0.<init>(r4)
            java.lang.StringBuilder r3 = appendColumns(r0, r2, r3)
            java.lang.String r4 = " FROM "
            r3.append(r4)
            r3 = 34
            java.lang.StringBuilder r4 = r0.append(r3)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            r3 = 32
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
        L3d:
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException
            java.lang.String r2 = "Table alias required"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String createSqlSelectCountStar(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT COUNT(*) FROM \""
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r1 = "\" "
            r2.append(r1)
            if (r3 == 0) goto L1b
            java.lang.StringBuilder r2 = r0.append(r3)
            r3 = 32
            r2.append(r3)
        L1b:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String createSqlUpdate(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            r0 = 34
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UPDATE "
            r0.<init>(r1)
            java.lang.StringBuilder r1 = r0.append(r3)
            java.lang.String r2 = " SET "
            r1.append(r2)
            appendColumnsEqualPlaceholders(r0, r4)
            java.lang.String r4 = " WHERE "
            r0.append(r4)
            appendColumnsEqValue(r0, r3, r5)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String escapeBlobArgument(byte[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "X'"
            r0.<init>(r1)
            java.lang.String r2 = toHex(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 39
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String toHex(byte[] r6) {
            int r0 = r6.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
        L6:
            int r2 = r6.length
            if (r1 >= r2) goto L22
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 * 2
            char[] r4 = org.greenrobot.greendao.internal.SqlUtils.HEX_ARRAY
            int r5 = r2 >>> 4
            char r5 = r4[r5]
            r0[r3] = r5
            int r3 = r3 + 1
            r2 = r2 & 15
            char r2 = r4[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
    }
}
