package androidx.core.graphics;

/* loaded from: classes.dex */
public final class PaintCompat {
    private static final java.lang.String EM_STRING = "m";
    private static final java.lang.String TOFU_STRING = "\udfffd";
    private static final java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> sRectThreadLocal = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.graphics.PaintCompat.sRectThreadLocal = r0
            return
    }

    private PaintCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasGlyph(android.graphics.Paint r0, java.lang.String r1) {
            boolean r0 = r0.hasGlyph(r1)
            return r0
    }

    private static androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect> obtainEmptyRects() {
            java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> r0 = androidx.core.graphics.PaintCompat.sRectThreadLocal
            java.lang.Object r1 = r0.get()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            if (r1 != 0) goto L1d
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.<init>(r2, r3)
            r0.set(r1)
            goto L2b
        L1d:
            F r0 = r1.first
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.setEmpty()
            S r0 = r1.second
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.setEmpty()
        L2b:
            return r1
    }

    public static boolean setBlendMode(android.graphics.Paint r4, androidx.core.graphics.BlendModeCompat r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L12
            if (r5 == 0) goto Le
            android.graphics.BlendMode r3 = androidx.core.graphics.BlendModeUtils.obtainBlendModeFromCompat(r5)
        Le:
            r4.setBlendMode(r3)
            return r2
        L12:
            if (r5 == 0) goto L27
            android.graphics.PorterDuff$Mode r5 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r5)
            if (r5 == 0) goto L1f
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            r3.<init>(r5)
        L1f:
            r4.setXfermode(r3)
            if (r5 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            return r2
        L27:
            r4.setXfermode(r3)
            return r2
    }
}
