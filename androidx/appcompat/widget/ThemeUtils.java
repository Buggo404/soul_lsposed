package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ThemeUtils {
    static final int[] ACTIVATED_STATE_SET = null;
    static final int[] CHECKED_STATE_SET = null;
    static final int[] DISABLED_STATE_SET = null;
    static final int[] EMPTY_STATE_SET = null;
    static final int[] FOCUSED_STATE_SET = null;
    static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET = null;
    static final int[] PRESSED_STATE_SET = null;
    static final int[] SELECTED_STATE_SET = null;
    private static final java.lang.String TAG = "ThemeUtils";
    private static final int[] TEMP_ARRAY = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> TL_TYPED_VALUE = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r3 = 0
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.FOCUSED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16843518(0x10102fe, float:2.3695705E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.ACTIVATED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.PRESSED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.CHECKED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.SELECTED_STATE_SET = r1
            r1 = 2
            int[] r1 = new int[r1]
            r1 = {x0050: FILL_ARRAY_DATA , data: [-16842919, -16842908} // fill-array
            androidx.appcompat.widget.ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET = r1
            int[] r1 = new int[r3]
            androidx.appcompat.widget.ThemeUtils.EMPTY_STATE_SET = r1
            int[] r0 = new int[r0]
            androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY = r0
            return
    }

    private ThemeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkAppCompatTheme(android.view.View r3, android.content.Context r4) {
            java.lang.String r0 = "View "
            int[] r1 = androidx.appcompat.C0015R.styleable.AppCompatTheme
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1)
            int r1 = androidx.appcompat.C0015R.styleable.AppCompatTheme_windowActionBar     // Catch: java.lang.Throwable -> L30
            boolean r1 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L2c
            java.lang.String r1 = "ThemeUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r3 = r2.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> L30
        L2c:
            r4.recycle()
            return
        L30:
            r3 = move-exception
            r4.recycle()
            throw r3
    }

    public static android.content.res.ColorStateList createDisabledStateList(int r4, int r5) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            int[] r2 = androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET
            r3 = 0
            r1[r3] = r2
            r0[r3] = r5
            int[] r5 = androidx.appcompat.widget.ThemeUtils.EMPTY_STATE_SET
            r2 = 1
            r1[r2] = r5
            r0[r2] = r4
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r1, r0)
            return r4
    }

    public static int getDisabledThemeAttrColor(android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = getThemeAttrColorStateList(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            android.util.TypedValue r0 = getTypedValue()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            float r0 = r0.getFloat()
            int r4 = getThemeAttrColor(r4, r5, r0)
            return r4
    }

    public static int getThemeAttrColor(android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            r1 = 0
            r0[r1] = r3
            r3 = 0
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r2, r3, r0)
            int r3 = r2.getColor(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    static int getThemeAttrColor(android.content.Context r0, int r1, float r2) {
            int r0 = getThemeAttrColor(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r0 = androidx.core.graphics.ColorUtils.setAlphaComponent(r0, r1)
            return r0
    }

    public static android.content.res.ColorStateList getThemeAttrColorStateList(android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            r1 = 0
            r0[r1] = r3
            r3 = 0
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r2, r3, r0)
            android.content.res.ColorStateList r3 = r2.getColorStateList(r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }
}
