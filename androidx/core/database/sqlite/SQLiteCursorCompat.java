package androidx.core.database.sqlite;

/* loaded from: classes.dex */
public final class SQLiteCursorCompat {
    private SQLiteCursorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setFillWindowForwardOnly(android.database.sqlite.SQLiteCursor r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L9
            r2.setFillWindowForwardOnly(r3)
        L9:
            return
    }
}
