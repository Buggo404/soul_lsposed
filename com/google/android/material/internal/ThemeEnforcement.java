package com.google.android.material.internal;

/* loaded from: classes.dex */
public final class ThemeEnforcement {
    private static final int[] APPCOMPAT_CHECK_ATTRS = null;
    private static final java.lang.String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final int[] MATERIAL_CHECK_ATTRS = null;
    private static final java.lang.String MATERIAL_THEME_NAME = "Theme.MaterialComponents";

    static {
            r0 = 1
            int[] r1 = new int[r0]
            int r2 = com.google.android.material.C0479R.attr.colorPrimary
            r3 = 0
            r1[r3] = r2
            com.google.android.material.internal.ThemeEnforcement.APPCOMPAT_CHECK_ATTRS = r1
            int[] r0 = new int[r0]
            int r1 = com.google.android.material.C0479R.attr.colorPrimaryVariant
            r0[r3] = r1
            com.google.android.material.internal.ThemeEnforcement.MATERIAL_CHECK_ATTRS = r0
            return
    }

    private ThemeEnforcement() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkAppCompatTheme(android.content.Context r2) {
            int[] r0 = com.google.android.material.internal.ThemeEnforcement.APPCOMPAT_CHECK_ATTRS
            java.lang.String r1 = "Theme.AppCompat"
            checkTheme(r2, r0, r1)
            return
    }

    private static void checkCompatibleTheme(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            int[] r0 = com.google.android.material.C0479R.styleable.ThemeEnforcement
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            int r3 = com.google.android.material.C0479R.styleable.ThemeEnforcement_enforceMaterialTheme
            r4 = 0
            boolean r3 = r2.getBoolean(r3, r4)
            r2.recycle()
            if (r3 == 0) goto L31
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r1.getTheme()
            int r4 = com.google.android.material.C0479R.attr.isMaterialTheme
            r0 = 1
            boolean r3 = r3.resolveAttribute(r4, r2, r0)
            if (r3 == 0) goto L2e
            int r3 = r2.type
            r4 = 18
            if (r3 != r4) goto L31
            int r2 = r2.data
            if (r2 != 0) goto L31
        L2e:
            checkMaterialTheme(r1)
        L31:
            checkAppCompatTheme(r1)
            return
    }

    public static void checkMaterialTheme(android.content.Context r2) {
            int[] r0 = com.google.android.material.internal.ThemeEnforcement.MATERIAL_CHECK_ATTRS
            java.lang.String r1 = "Theme.MaterialComponents"
            checkTheme(r2, r0, r1)
            return
    }

    private static void checkTextAppearance(android.content.Context r3, android.util.AttributeSet r4, int[] r5, int r6, int r7, int... r8) {
            int[] r0 = com.google.android.material.C0479R.styleable.ThemeEnforcement
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r4, r0, r6, r7)
            int r1 = com.google.android.material.C0479R.styleable.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L13
            r0.recycle()
            return
        L13:
            if (r8 == 0) goto L1e
            int r1 = r8.length
            if (r1 != 0) goto L19
            goto L1e
        L19:
            boolean r3 = isCustomTextAppearanceValid(r3, r4, r5, r6, r7, r8)
            goto L29
        L1e:
            int r3 = com.google.android.material.C0479R.styleable.ThemeEnforcement_android_textAppearance
            r4 = -1
            int r3 = r0.getResourceId(r3, r4)
            if (r3 == r4) goto L28
            r2 = 1
        L28:
            r3 = r2
        L29:
            r0.recycle()
            if (r3 == 0) goto L2f
            return
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r3.<init>(r4)
            throw r3
    }

    private static void checkTheme(android.content.Context r1, int[] r2, java.lang.String r3) {
            boolean r1 = isTheme(r1, r2)
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "The style on this component requires your app theme to be "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " (or a descendant)."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static boolean isAppCompatTheme(android.content.Context r1) {
            int[] r0 = com.google.android.material.internal.ThemeEnforcement.APPCOMPAT_CHECK_ATTRS
            boolean r1 = isTheme(r1, r0)
            return r1
    }

    private static boolean isCustomTextAppearanceValid(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5, int... r6) {
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            int r2 = r6.length
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r2) goto L19
            r5 = r6[r4]
            r0 = -1
            int r5 = r1.getResourceId(r5, r0)
            if (r5 != r0) goto L16
            r1.recycle()
            return r3
        L16:
            int r4 = r4 + 1
            goto L7
        L19:
            r1.recycle()
            r1 = 1
            return r1
    }

    public static boolean isMaterialTheme(android.content.Context r1) {
            int[] r0 = com.google.android.material.internal.ThemeEnforcement.MATERIAL_CHECK_ATTRS
            boolean r1 = isTheme(r1, r0)
            return r1
    }

    private static boolean isTheme(android.content.Context r3, int[] r4) {
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            r0 = 0
            r1 = r0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L16
            boolean r2 = r3.hasValue(r1)
            if (r2 != 0) goto L13
            r3.recycle()
            return r0
        L13:
            int r1 = r1 + 1
            goto L6
        L16:
            r3.recycle()
            r3 = 1
            return r3
    }

    public static android.content.res.TypedArray obtainStyledAttributes(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            checkCompatibleTheme(r0, r1, r3, r4)
            checkTextAppearance(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            return r0
    }

    public static androidx.appcompat.widget.TintTypedArray obtainTintedStyledAttributes(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            checkCompatibleTheme(r0, r1, r3, r4)
            checkTextAppearance(r0, r1, r2, r3, r4, r5)
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r1, r2, r3, r4)
            return r0
    }
}
