package androidx.transition;

/* loaded from: classes.dex */
class ViewGroupUtilsApi14 {
    private static final int LAYOUT_TRANSITION_CHANGING = 4;
    private static final java.lang.String TAG = "ViewGroupUtilsApi14";
    private static java.lang.reflect.Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static android.animation.LayoutTransition sEmptyLayoutTransition;
    private static java.lang.reflect.Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;


    private ViewGroupUtilsApi14() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void cancelLayoutTransition(android.animation.LayoutTransition r7) {
            boolean r0 = androidx.transition.ViewGroupUtilsApi14.sCancelMethodFetched
            java.lang.String r1 = "Failed to access cancel method by reflection"
            r2 = 0
            java.lang.String r3 = "ViewGroupUtilsApi14"
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.animation.LayoutTransition> r4 = android.animation.LayoutTransition.class
            java.lang.String r5 = "cancel"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.transition.ViewGroupUtilsApi14.sCancelMethod = r4     // Catch: java.lang.NoSuchMethodException -> L1a
            r4.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L1d
        L1a:
            android.util.Log.i(r3, r1)
        L1d:
            androidx.transition.ViewGroupUtilsApi14.sCancelMethodFetched = r0
        L1f:
            java.lang.reflect.Method r0 = androidx.transition.ViewGroupUtilsApi14.sCancelMethod
            if (r0 == 0) goto L32
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2f
            r0.invoke(r7, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2f
            goto L32
        L29:
            java.lang.String r7 = "Failed to invoke cancel method by reflection"
            android.util.Log.i(r3, r7)
            goto L32
        L2f:
            android.util.Log.i(r3, r1)
        L32:
            return
    }

    static void suppressLayout(android.view.ViewGroup r5, boolean r6) {
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            androidx.transition.ViewGroupUtilsApi14$1 r0 = new androidx.transition.ViewGroupUtilsApi14$1
            r0.<init>()
            androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            cancelLayoutTransition(r6)
        L39:
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            if (r6 == r0) goto L42
            int r0 = androidx.transition.C0425R.id.transition_layout_save
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r5.setLayoutTransition(r6)
            goto L96
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedFieldFetched
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedField = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedFieldFetched = r1
        L66:
            java.lang.reflect.Field r6 = androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedField
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedField     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = androidx.transition.C0425R.id.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L96
            int r0 = androidx.transition.C0425R.id.transition_layout_save
            r5.setTag(r0, r3)
            r5.setLayoutTransition(r6)
        L96:
            return
    }
}
