package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ClickActionDelegate extends androidx.core.view.AccessibilityDelegateCompat {
    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat clickAction;

    public ClickActionDelegate(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r1 = 16
            java.lang.String r3 = r3.getString(r4)
            r0.<init>(r1, r3)
            r2.clickAction = r0
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = r0.clickAction
            r2.addAction(r1)
            return
    }
}
