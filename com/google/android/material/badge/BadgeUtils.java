package com.google.android.material.badge;

/* loaded from: classes.dex */
public class BadgeUtils {
    private static final java.lang.String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;


    static {
            r0 = 0
            com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT = r0
            return
    }

    private BadgeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, android.view.View r2) {
            r0 = 0
            attachBadgeDrawable(r1, r2, r0)
            return
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r0, android.view.View r1, android.widget.FrameLayout r2) {
            setBadgeDrawableBounds(r0, r1, r2)
            android.widget.FrameLayout r2 = r0.getCustomBadgeParent()
            if (r2 == 0) goto L11
            android.widget.FrameLayout r1 = r0.getCustomBadgeParent()
            r1.setForeground(r0)
            goto L1c
        L11:
            boolean r2 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r2 != 0) goto L1d
            android.view.ViewOverlay r1 = r1.getOverlay()
            r1.add(r0)
        L1c:
            return
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to reference null customBadgeParent"
            r0.<init>(r1)
            throw r0
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, androidx.appcompat.widget.Toolbar r2, int r3) {
            r0 = 0
            attachBadgeDrawable(r1, r2, r3, r0)
            return
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, androidx.appcompat.widget.Toolbar r2, int r3, android.widget.FrameLayout r4) {
            com.google.android.material.badge.BadgeUtils$1 r0 = new com.google.android.material.badge.BadgeUtils$1
            r0.<init>(r2, r3, r1, r4)
            r2.post(r0)
            return
    }

    public static android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> createBadgeDrawablesFromSavedStates(android.content.Context r4, com.google.android.material.internal.ParcelableSparseArray r5) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.size()
            if (r1 >= r2) goto L2e
            int r2 = r5.keyAt(r1)
            java.lang.Object r3 = r5.valueAt(r1)
            com.google.android.material.badge.BadgeDrawable$SavedState r3 = (com.google.android.material.badge.BadgeDrawable.SavedState) r3
            if (r3 == 0) goto L26
            com.google.android.material.badge.BadgeDrawable r3 = com.google.android.material.badge.BadgeDrawable.createFromSavedState(r4, r3)
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto La
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "BadgeDrawable's savedState cannot be null"
            r4.<init>(r5)
            throw r4
        L2e:
            return r0
    }

    public static com.google.android.material.internal.ParcelableSparseArray createParcelableBadgeStates(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r4) {
            com.google.android.material.internal.ParcelableSparseArray r0 = new com.google.android.material.internal.ParcelableSparseArray
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L2a
            int r2 = r4.keyAt(r1)
            java.lang.Object r3 = r4.valueAt(r1)
            com.google.android.material.badge.BadgeDrawable r3 = (com.google.android.material.badge.BadgeDrawable) r3
            if (r3 == 0) goto L22
            com.google.android.material.badge.BadgeDrawable$SavedState r3 = r3.getSavedState()
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "badgeDrawable cannot be null"
            r4.<init>(r0)
            throw r4
        L2a:
            return r0
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r1, android.view.View r2) {
            if (r1 != 0) goto L3
            return
        L3:
            boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r0 != 0) goto L16
            android.widget.FrameLayout r0 = r1.getCustomBadgeParent()
            if (r0 == 0) goto Le
            goto L16
        Le:
            android.view.ViewOverlay r2 = r2.getOverlay()
            r2.remove(r1)
            goto L1e
        L16:
            android.widget.FrameLayout r1 = r1.getCustomBadgeParent()
            r2 = 0
            r1.setForeground(r2)
        L1e:
            return
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable r0, androidx.appcompat.widget.Toolbar r1, int r2) {
            if (r0 != 0) goto L3
            return
        L3:
            androidx.appcompat.view.menu.ActionMenuItemView r1 = com.google.android.material.internal.ToolbarUtils.getActionMenuItemView(r1, r2)
            if (r1 == 0) goto Ld
            detachBadgeDrawable(r0, r1)
            goto L21
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to remove badge from a null menuItemView: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BadgeUtils"
            android.util.Log.w(r1, r0)
        L21:
            return
    }

    public static void setBadgeDrawableBounds(com.google.android.material.badge.BadgeDrawable r1, android.view.View r2, android.widget.FrameLayout r3) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getDrawingRect(r0)
            r1.setBounds(r0)
            r1.updateBadgeCoordinates(r2, r3)
            return
    }

    public static void updateBadgeBounds(android.graphics.Rect r2, float r3, float r4, float r5, float r6) {
            float r0 = r3 - r5
            int r0 = (int) r0
            float r1 = r4 - r6
            int r1 = (int) r1
            float r3 = r3 + r5
            int r3 = (int) r3
            float r4 = r4 + r6
            int r4 = (int) r4
            r2.set(r0, r1, r3, r4)
            return
    }
}
