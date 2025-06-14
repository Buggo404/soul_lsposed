package androidx.transition;

/* loaded from: classes.dex */
class ViewGroupUtils {
    private static java.lang.reflect.Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    static {
            return
    }

    private ViewGroupUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static int getChildDrawingOrder(android.view.ViewGroup r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            int r7 = r7.getChildDrawingOrder(r8)
            return r7
        Lb:
            boolean r0 = androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethodFetched
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L2b
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r4 = "getChildDrawingOrder"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L29
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L29
            r5[r3] = r6     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L29
            androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethod = r0     // Catch: java.lang.NoSuchMethodException -> L29
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L29
        L29:
            androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethodFetched = r3
        L2b:
            java.lang.reflect.Method r0 = androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethod
            if (r0 == 0) goto L4c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4c
            int r4 = r7.getChildCount()     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L4c
            r2[r1] = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L4c
            r2[r3] = r1     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r7 = r0.invoke(r7, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L4c
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L4c
            return r7
        L4c:
            return r8
    }

    static androidx.transition.ViewGroupOverlayImpl getOverlay(android.view.ViewGroup r1) {
            androidx.transition.ViewGroupOverlayApi18 r0 = new androidx.transition.ViewGroupOverlayApi18
            r0.<init>(r1)
            return r0
    }

    private static void hiddenSuppressLayout(android.view.ViewGroup r1, boolean r2) {
            boolean r0 = androidx.transition.ViewGroupUtils.sTryHiddenSuppressLayout
            if (r0 == 0) goto Lb
            r1.suppressLayout(r2)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r1 = 0
            androidx.transition.ViewGroupUtils.sTryHiddenSuppressLayout = r1
        Lb:
            return
    }

    static void suppressLayout(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            r2.suppressLayout(r3)
            goto Ld
        La:
            hiddenSuppressLayout(r2, r3)
        Ld:
            return
    }
}
