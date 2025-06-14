package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewParentCompat {
    private static final java.lang.String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    private ViewParentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[] getTempNestedScrollConsumed() {
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            if (r0 != 0) goto La
            r0 = 2
            int[] r0 = new int[r0]
            androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed = r0
            goto L10
        La:
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
        L10:
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            return r0
    }

    public static void notifySubtreeAccessibilityStateChanged(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
            r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
            return
    }

    public static boolean onNestedFling(android.view.ViewParent r0, android.view.View r1, float r2, float r3, boolean r4) {
            boolean r0 = r0.onNestedFling(r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L5
            return r0
        L5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewParent "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " does not implement interface method onNestedFling"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
            r0 = 0
            return r0
    }

    public static boolean onNestedPreFling(android.view.ViewParent r0, android.view.View r1, float r2, float r3) {
            boolean r0 = r0.onNestedPreFling(r1, r2, r3)     // Catch: java.lang.AbstractMethodError -> L5
            return r0
        L5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewParent "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " does not implement interface method onNestedPreFling"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
            r0 = 0
            return r0
    }

    public static void onNestedPreScroll(android.view.ViewParent r6, android.view.View r7, int r8, int r9, int[] r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            onNestedPreScroll(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void onNestedPreScroll(android.view.ViewParent r7, android.view.View r8, int r9, int r10, int[] r11, int r12) {
            boolean r0 = r7 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto L10
            r1 = r7
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.onNestedPreScroll(r2, r3, r4, r5, r6)
            goto L31
        L10:
            if (r12 != 0) goto L31
            r7.onNestedPreScroll(r8, r9, r10, r11)     // Catch: java.lang.AbstractMethodError -> L16
            goto L31
        L16:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "ViewParent "
            r9.<init>(r10)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r9 = " does not implement interface method onNestedPreScroll"
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "ViewParentCompat"
            android.util.Log.e(r9, r7, r8)
        L31:
            return
    }

    public static void onNestedScroll(android.view.ViewParent r8, android.view.View r9, int r10, int r11, int r12, int r13) {
            r6 = 0
            int[] r7 = getTempNestedScrollConsumed()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            onNestedScroll(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void onNestedScroll(android.view.ViewParent r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            int[] r7 = getTempNestedScrollConsumed()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            onNestedScroll(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void onNestedScroll(android.view.ViewParent r10, android.view.View r11, int r12, int r13, int r14, int r15, int r16, int[] r17) {
            r1 = r10
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent3
            if (r0 == 0) goto L14
            androidx.core.view.NestedScrollingParent3 r1 = (androidx.core.view.NestedScrollingParent3) r1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.onNestedScroll(r2, r3, r4, r5, r6, r7, r8)
            goto L54
        L14:
            r0 = 0
            r2 = r17[r0]
            int r2 = r2 + r14
            r17[r0] = r2
            r0 = 1
            r2 = r17[r0]
            int r2 = r2 + r15
            r17[r0] = r2
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto L32
            r3 = r1
            androidx.core.view.NestedScrollingParent2 r3 = (androidx.core.view.NestedScrollingParent2) r3
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r3.onNestedScroll(r4, r5, r6, r7, r8, r9)
            goto L54
        L32:
            if (r16 != 0) goto L54
            r10.onNestedScroll(r11, r12, r13, r14, r15)     // Catch: java.lang.AbstractMethodError -> L38
            goto L54
        L38:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewParent "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r1 = " does not implement interface method onNestedScroll"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ViewParentCompat"
            android.util.Log.e(r1, r0, r2)
        L54:
            return
    }

    public static void onNestedScrollAccepted(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4) {
            r0 = 0
            onNestedScrollAccepted(r1, r2, r3, r4, r0)
            return
    }

    public static void onNestedScrollAccepted(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r1.onNestedScrollAccepted(r2, r3, r4, r5)
            goto L2b
        La:
            if (r5 != 0) goto L2b
            r1.onNestedScrollAccepted(r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L10
            goto L2b
        L10:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " does not implement interface method onNestedScrollAccepted"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
        L2b:
            return
    }

    public static boolean onStartNestedScroll(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4) {
            r0 = 0
            boolean r1 = onStartNestedScroll(r1, r2, r3, r4, r0)
            return r1
    }

    public static boolean onStartNestedScroll(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            boolean r1 = r1.onStartNestedScroll(r2, r3, r4, r5)
            return r1
        Lb:
            if (r5 != 0) goto L2d
            boolean r1 = r1.onStartNestedScroll(r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L12
            return r1
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " does not implement interface method onStartNestedScroll"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
        L2d:
            r1 = 0
            return r1
    }

    public static void onStopNestedScroll(android.view.ViewParent r1, android.view.View r2) {
            r0 = 0
            onStopNestedScroll(r1, r2, r0)
            return
    }

    public static void onStopNestedScroll(android.view.ViewParent r1, android.view.View r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r1.onStopNestedScroll(r2, r3)
            goto L2b
        La:
            if (r3 != 0) goto L2b
            r1.onStopNestedScroll(r2)     // Catch: java.lang.AbstractMethodError -> L10
            goto L2b
        L10:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewParent "
            r3.<init>(r0)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " does not implement interface method onStopNestedScroll"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
        L2b:
            return
    }

    @java.lang.Deprecated
    public static boolean requestSendAccessibilityEvent(android.view.ViewParent r0, android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            boolean r0 = r0.requestSendAccessibilityEvent(r1, r2)
            return r0
    }
}
