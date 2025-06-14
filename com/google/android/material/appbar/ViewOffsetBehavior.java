package com.google.android.material.appbar;

import android.view.View;

/* loaded from: classes.dex */
class ViewOffsetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private com.google.android.material.appbar.ViewOffsetHelper viewOffsetHelper;

    public ViewOffsetBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.tempTopBottomOffset = r0
            r1.tempLeftRightOffset = r0
            return
    }

    public ViewOffsetBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.tempTopBottomOffset = r1
            r0.tempLeftRightOffset = r1
            return
    }

    public int getLeftAndRightOffset() {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto L9
            int r0 = r0.getLeftAndRightOffset()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getTopAndBottomOffset() {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto L9
            int r0 = r0.getTopAndBottomOffset()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isHorizontalOffsetEnabled() {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isHorizontalOffsetEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isVerticalOffsetEnabled() {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isVerticalOffsetEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    protected void layoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r1.onLayoutChild(r2, r3)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r0.layoutChild(r1, r2, r3)
            com.google.android.material.appbar.ViewOffsetHelper r1 = r0.viewOffsetHelper
            if (r1 != 0) goto Le
            com.google.android.material.appbar.ViewOffsetHelper r1 = new com.google.android.material.appbar.ViewOffsetHelper
            r1.<init>(r2)
            r0.viewOffsetHelper = r1
        Le:
            com.google.android.material.appbar.ViewOffsetHelper r1 = r0.viewOffsetHelper
            r1.onViewLayout()
            com.google.android.material.appbar.ViewOffsetHelper r1 = r0.viewOffsetHelper
            r1.applyOffsets()
            int r1 = r0.tempTopBottomOffset
            r2 = 0
            if (r1 == 0) goto L24
            com.google.android.material.appbar.ViewOffsetHelper r3 = r0.viewOffsetHelper
            r3.setTopAndBottomOffset(r1)
            r0.tempTopBottomOffset = r2
        L24:
            int r1 = r0.tempLeftRightOffset
            if (r1 == 0) goto L2f
            com.google.android.material.appbar.ViewOffsetHelper r3 = r0.viewOffsetHelper
            r3.setLeftAndRightOffset(r1)
            r0.tempLeftRightOffset = r2
        L2f:
            r1 = 1
            return r1
    }

    public void setHorizontalOffsetEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto L7
            r0.setHorizontalOffsetEnabled(r2)
        L7:
            return
    }

    public boolean setLeftAndRightOffset(int r2) {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto L9
            boolean r2 = r0.setLeftAndRightOffset(r2)
            return r2
        L9:
            r1.tempLeftRightOffset = r2
            r2 = 0
            return r2
    }

    public boolean setTopAndBottomOffset(int r2) {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto L9
            boolean r2 = r0.setTopAndBottomOffset(r2)
            return r2
        L9:
            r1.tempTopBottomOffset = r2
            r2 = 0
            return r2
    }

    public void setVerticalOffsetEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = r1.viewOffsetHelper
            if (r0 == 0) goto L7
            r0.setVerticalOffsetEnabled(r2)
        L7:
            return
    }
}
