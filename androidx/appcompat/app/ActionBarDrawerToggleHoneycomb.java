package androidx.appcompat.app;

/* loaded from: classes.dex */
class ActionBarDrawerToggleHoneycomb {
    private static final java.lang.String TAG = "ActionBarDrawerToggleHC";
    private static final int[] THEME_ATTRS = null;

    static class SetIndicatorInfo {
        public java.lang.reflect.Method setHomeActionContentDescription;
        public java.lang.reflect.Method setHomeAsUpIndicator;
        public android.widget.ImageView upIndicatorView;

        SetIndicatorInfo(android.app.Activity r7) {
                r6 = this;
                r6.<init>()
                r0 = 0
                r1 = 1
                java.lang.Class<android.app.ActionBar> r2 = android.app.ActionBar.class
                java.lang.String r3 = "setHomeAsUpIndicator"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L26
                r6.setHomeAsUpIndicator = r2     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.Class<android.app.ActionBar> r2 = android.app.ActionBar.class
                java.lang.String r3 = "setHomeActionContentDescription"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L26
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L26
                r6.setHomeActionContentDescription = r2     // Catch: java.lang.NoSuchMethodException -> L26
                return
            L26:
                r2 = 16908332(0x102002c, float:2.3877352E-38)
                android.view.View r7 = r7.findViewById(r2)
                if (r7 != 0) goto L30
                return
            L30:
                android.view.ViewParent r7 = r7.getParent()
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                int r3 = r7.getChildCount()
                r4 = 2
                if (r3 == r4) goto L3e
                return
            L3e:
                android.view.View r0 = r7.getChildAt(r0)
                android.view.View r7 = r7.getChildAt(r1)
                int r1 = r0.getId()
                if (r1 != r2) goto L4d
                r0 = r7
            L4d:
                boolean r7 = r0 instanceof android.widget.ImageView
                if (r7 == 0) goto L56
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r6.upIndicatorView = r0
            L56:
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843531(0x101030b, float:2.369574E-38)
            r0[r1] = r2
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.THEME_ATTRS = r0
            return
    }

    private ActionBarDrawerToggleHoneycomb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getThemeUpIndicator(android.app.Activity r1) {
            int[] r0 = androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.THEME_ATTRS
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r1.recycle()
            return r0
    }

    public static androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarDescription(androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo r3, android.app.Activity r4, int r5) {
            if (r3 != 0) goto L7
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo r3 = new androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
            r3.<init>(r4)
        L7:
            java.lang.reflect.Method r0 = r3.setHomeAsUpIndicator
            if (r0 == 0) goto L27
            android.app.ActionBar r4 = r4.getActionBar()     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = r3.setHomeActionContentDescription     // Catch: java.lang.Exception -> L1f
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Exception -> L1f
            r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L1f
            goto L27
        L1f:
            r4 = move-exception
            java.lang.String r5 = "ActionBarDrawerToggleHC"
            java.lang.String r0 = "Couldn't set content description via JB-MR2 API"
            android.util.Log.w(r5, r0, r4)
        L27:
            return r3
    }

    public static androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarUpIndicator(android.app.Activity r6, android.graphics.drawable.Drawable r7, int r8) {
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo r0 = new androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
            r0.<init>(r6)
            java.lang.reflect.Method r1 = r0.setHomeAsUpIndicator
            java.lang.String r2 = "ActionBarDrawerToggleHC"
            if (r1 == 0) goto L2f
            android.app.ActionBar r6 = r6.getActionBar()     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r1 = r0.setHomeAsUpIndicator     // Catch: java.lang.Exception -> L28
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L28
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Exception -> L28
            r1.invoke(r6, r4)     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r7 = r0.setHomeActionContentDescription     // Catch: java.lang.Exception -> L28
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L28
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L28
            r1[r5] = r8     // Catch: java.lang.Exception -> L28
            r7.invoke(r6, r1)     // Catch: java.lang.Exception -> L28
            goto L3e
        L28:
            r6 = move-exception
            java.lang.String r7 = "Couldn't set home-as-up indicator via JB-MR2 API"
            android.util.Log.w(r2, r7, r6)
            goto L3e
        L2f:
            android.widget.ImageView r6 = r0.upIndicatorView
            if (r6 == 0) goto L39
            android.widget.ImageView r6 = r0.upIndicatorView
            r6.setImageDrawable(r7)
            goto L3e
        L39:
            java.lang.String r6 = "Couldn't set home-as-up indicator"
            android.util.Log.w(r2, r6)
        L3e:
            return r0
    }
}
