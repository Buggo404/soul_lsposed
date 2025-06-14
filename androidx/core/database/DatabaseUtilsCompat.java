package androidx.core.database;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class DatabaseUtilsCompat {
    private DatabaseUtilsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.lang.String[] appendSelectionArgs(java.lang.String[] r3, java.lang.String[] r4) {
            if (r3 == 0) goto L16
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L16
        L6:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            java.lang.String[] r0 = new java.lang.String[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
        L16:
            return r4
    }

    @java.lang.Deprecated
    public static java.lang.String concatenateWhere(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            return r2
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ") AND ("
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }
}
