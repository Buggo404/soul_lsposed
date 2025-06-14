package androidx.core.database;

/* loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.database.CursorWindow create(java.lang.String r2, long r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.database.CursorWindow r0 = new android.database.CursorWindow
            r0.<init>(r2, r3)
            return r0
        Lc:
            android.database.CursorWindow r3 = new android.database.CursorWindow
            r3.<init>(r2)
            return r3
    }
}
