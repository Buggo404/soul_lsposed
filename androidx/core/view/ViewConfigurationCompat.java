package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewConfigurationCompat {
    private static final java.lang.String TAG = "ViewConfigCompat";
    private static java.lang.reflect.Method sGetScaledScrollFactorMethod;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L1b
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L14
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L14
            androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod = r0     // Catch: java.lang.Exception -> L14
            goto L1b
        L14:
            java.lang.String r0 = "ViewConfigCompat"
            java.lang.String r1 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r0, r1)
        L1b:
            return
    }

    private ViewConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float getLegacyScrollFactor(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L20
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod
            if (r0 == 0) goto L20
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L19
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L19
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L19
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L19
            float r3 = (float) r3
            return r3
        L19:
            java.lang.String r3 = "ViewConfigCompat"
            java.lang.String r0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r3, r0)
        L20:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L40
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L40:
            r3 = 0
            return r3
    }

    public static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = r2.getScaledHorizontalScrollFactor()
            return r2
        Lb:
            float r2 = getLegacyScrollFactor(r2, r3)
            return r2
    }

    public static int getScaledHoverSlop(android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = r2.getScaledHoverSlop()
            return r2
        Lb:
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 / 2
            return r2
    }

    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledPagingTouchSlop()
            return r0
    }

    public static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = r2.getScaledVerticalScrollFactor()
            return r2
        Lb:
            float r2 = getLegacyScrollFactor(r2, r3)
            return r2
    }

    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration r0) {
            boolean r0 = r0.hasPermanentMenuKey()
            return r0
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = r2.shouldShowMenuShortcutsWhenKeyboardPresent()
            return r2
        Lb:
            android.content.res.Resources r2 = r3.getResources()
            java.lang.String r3 = "bool"
            java.lang.String r0 = "android"
            java.lang.String r1 = "config_showMenuShortcutsWhenKeyboardPresent"
            int r3 = r2.getIdentifier(r1, r3, r0)
            if (r3 == 0) goto L23
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }
}
