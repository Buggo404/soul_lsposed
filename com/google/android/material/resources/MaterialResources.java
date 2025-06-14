package com.google.android.material.resources;

/* loaded from: classes.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context r1, androidx.appcompat.widget.TintTypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }

    public static int getDimensionPixelSize(android.content.Context r3, android.content.res.TypedArray r4, int r5, int r6) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            boolean r1 = r4.getValue(r5, r0)
            if (r1 == 0) goto L29
            int r1 = r0.type
            r2 = 2
            if (r1 == r2) goto L11
            goto L29
        L11:
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 1
            int[] r4 = new int[r4]
            int r5 = r0.data
            r0 = 0
            r4[r0] = r5
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            int r4 = r3.getDimensionPixelSize(r0, r6)
            r3.recycle()
            return r4
        L29:
            int r3 = r4.getDimensionPixelSize(r5, r6)
            return r3
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
    }

    static int getIndexWithValue(android.content.res.TypedArray r0, int r1, int r2) {
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L7
            return r1
        L7:
            return r2
    }

    public static com.google.android.material.resources.TextAppearance getTextAppearance(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L13
            r0 = 0
            int r2 = r2.getResourceId(r3, r0)
            if (r2 == 0) goto L13
            com.google.android.material.resources.TextAppearance r3 = new com.google.android.material.resources.TextAppearance
            r3.<init>(r1, r2)
            return r3
        L13:
            r1 = 0
            return r1
    }

    public static boolean isFontScaleAtLeast1_3(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1067869798(0x3fa66666, float:1.3)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public static boolean isFontScaleAtLeast2_0(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }
}
