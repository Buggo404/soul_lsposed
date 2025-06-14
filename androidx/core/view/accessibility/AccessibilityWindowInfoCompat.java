package androidx.core.view.accessibility;

/* loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private java.lang.Object mInfo;

    private AccessibilityWindowInfoCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mInfo = r1
            return
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain() {
            android.view.accessibility.AccessibilityWindowInfo r0 = android.view.accessibility.AccessibilityWindowInfo.obtain()
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain(androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L10
        L4:
            java.lang.Object r0 = r0.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = android.view.accessibility.AccessibilityWindowInfo.obtain(r0)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
        L10:
            return r0
    }

    private static java.lang.String typeToString(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L12
            r0 = 4
            if (r1 == r0) goto Lf
            java.lang.String r1 = "<UNKNOWN>"
            return r1
        Lf:
            java.lang.String r1 = "TYPE_ACCESSIBILITY_OVERLAY"
            return r1
        L12:
            java.lang.String r1 = "TYPE_SYSTEM"
            return r1
        L15:
            java.lang.String r1 = "TYPE_INPUT_METHOD"
            return r1
        L18:
            java.lang.String r1 = "TYPE_APPLICATION"
            return r1
    }

    static androidx.core.view.accessibility.AccessibilityWindowInfoCompat wrapNonNullInstance(java.lang.Object r1) {
            if (r1 == 0) goto L8
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityWindowInfoCompat
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof androidx.core.view.accessibility.AccessibilityWindowInfoCompat
            if (r2 != 0) goto Ld
            return r1
        Ld:
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r4 = (androidx.core.view.accessibility.AccessibilityWindowInfoCompat) r4
            java.lang.Object r2 = r3.mInfo
            if (r2 != 0) goto L18
            java.lang.Object r4 = r4.mInfo
            if (r4 == 0) goto L21
            return r1
        L18:
            java.lang.Object r4 = r4.mInfo
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L21
            return r1
        L21:
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getAnchor() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getAnchor()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    public void getBoundsInScreen(android.graphics.Rect r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            r0.getBoundsInScreen(r2)
            return
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getChild(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r2 = r0.getChild(r2)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r2 = wrapNonNullInstance(r2)
            return r2
    }

    public int getChildCount() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = r0.getChildCount()
            return r0
    }

    public int getId() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = r0.getId()
            return r0
    }

    public int getLayer() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = r0.getLayer()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getParent() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = r0.getParent()
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRoot()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public int getType() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = r0.getType()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public boolean isAccessibilityFocused() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = r0.isAccessibilityFocused()
            return r0
    }

    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = r0.isActive()
            return r0
    }

    public boolean isFocused() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = r0.isFocused()
            return r0
    }

    public void recycle() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            r0.recycle()
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AccessibilityWindowInfo[id="
            r0.<init>(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.getBoundsInScreen(r1)
            int r2 = r5.getId()
            r0.append(r2)
            java.lang.String r2 = ", type="
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r5.getType()
            java.lang.String r3 = typeToString(r3)
            r2.append(r3)
            java.lang.String r2 = ", layer="
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r5.getLayer()
            r2.append(r3)
            java.lang.String r2 = ", bounds="
            java.lang.StringBuilder r2 = r0.append(r2)
            r2.append(r1)
            java.lang.String r1 = ", focused="
            java.lang.StringBuilder r1 = r0.append(r1)
            boolean r2 = r5.isFocused()
            r1.append(r2)
            java.lang.String r1 = ", active="
            java.lang.StringBuilder r1 = r0.append(r1)
            boolean r2 = r5.isActive()
            r1.append(r2)
            java.lang.String r1 = ", hasParent="
            java.lang.StringBuilder r1 = r0.append(r1)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r2 = r5.getParent()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L67
            r2 = r3
            goto L68
        L67:
            r2 = r4
        L68:
            r1.append(r2)
            java.lang.String r1 = ", hasChildren="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r2 = r5.getChildCount()
            if (r2 <= 0) goto L78
            goto L79
        L78:
            r3 = r4
        L79:
            r1.append(r3)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
