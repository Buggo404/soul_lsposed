package androidx.core.view;

/* loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    private static class Impl16 {
        private Impl16() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setDecorFitsSystemWindows(android.view.Window r1, boolean r2) {
                android.view.View r1 = r1.getDecorView()
                int r0 = r1.getSystemUiVisibility()
                if (r2 == 0) goto Ld
                r2 = r0 & (-1793(0xfffffffffffff8ff, float:NaN))
                goto Lf
            Ld:
                r2 = r0 | 1792(0x700, float:2.511E-42)
            Lf:
                r1.setSystemUiVisibility(r2)
                return
        }
    }

    private static class Impl30 {
        private Impl30() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.view.WindowInsetsControllerCompat getInsetsController(android.view.Window r0) {
                android.view.WindowInsetsController r0 = r0.getInsetsController()
                if (r0 == 0) goto Lb
                androidx.core.view.WindowInsetsControllerCompat r0 = androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(r0)
                return r0
            Lb:
                r0 = 0
                return r0
        }

        static void setDecorFitsSystemWindows(android.view.Window r0, boolean r1) {
                r0.setDecorFitsSystemWindows(r1)
                return
        }
    }

    private WindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.view.WindowInsetsControllerCompat getInsetsController(android.view.Window r2, android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsControllerCompat r2 = androidx.core.view.WindowCompat.Impl30.getInsetsController(r2)
            return r2
        Lb:
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r2, r3)
            return r0
    }

    public static <T extends android.view.View> T requireViewById(android.view.Window r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.View r2 = r2.requireViewById(r3)
            return r2
        Lb:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Window"
            r2.<init>(r3)
            throw r2
    }

    public static void setDecorFitsSystemWindows(android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.view.WindowCompat.Impl30.setDecorFitsSystemWindows(r2, r3)
            goto Ld
        La:
            androidx.core.view.WindowCompat.Impl16.setDecorFitsSystemWindows(r2, r3)
        Ld:
            return
    }
}
