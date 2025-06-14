package com.google.android.material.appbar;

/* loaded from: classes.dex */
class ViewOffsetHelper {
    private boolean horizontalOffsetEnabled;
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private boolean verticalOffsetEnabled;
    private final android.view.View view;

    public ViewOffsetHelper(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.verticalOffsetEnabled = r0
            r1.horizontalOffsetEnabled = r0
            r1.view = r2
            return
    }

    void applyOffsets() {
            r4 = this;
            android.view.View r0 = r4.view
            int r1 = r4.offsetTop
            int r2 = r0.getTop()
            int r3 = r4.layoutTop
            int r2 = r2 - r3
            int r1 = r1 - r2
            androidx.core.view.ViewCompat.offsetTopAndBottom(r0, r1)
            android.view.View r0 = r4.view
            int r1 = r4.offsetLeft
            int r2 = r0.getLeft()
            int r3 = r4.layoutLeft
            int r2 = r2 - r3
            int r1 = r1 - r2
            androidx.core.view.ViewCompat.offsetLeftAndRight(r0, r1)
            return
    }

    public int getLayoutLeft() {
            r1 = this;
            int r0 = r1.layoutLeft
            return r0
    }

    public int getLayoutTop() {
            r1 = this;
            int r0 = r1.layoutTop
            return r0
    }

    public int getLeftAndRightOffset() {
            r1 = this;
            int r0 = r1.offsetLeft
            return r0
    }

    public int getTopAndBottomOffset() {
            r1 = this;
            int r0 = r1.offsetTop
            return r0
    }

    public boolean isHorizontalOffsetEnabled() {
            r1 = this;
            boolean r0 = r1.horizontalOffsetEnabled
            return r0
    }

    public boolean isVerticalOffsetEnabled() {
            r1 = this;
            boolean r0 = r1.verticalOffsetEnabled
            return r0
    }

    void onViewLayout() {
            r1 = this;
            android.view.View r0 = r1.view
            int r0 = r0.getTop()
            r1.layoutTop = r0
            android.view.View r0 = r1.view
            int r0 = r0.getLeft()
            r1.layoutLeft = r0
            return
    }

    public void setHorizontalOffsetEnabled(boolean r1) {
            r0 = this;
            r0.horizontalOffsetEnabled = r1
            return
    }

    public boolean setLeftAndRightOffset(int r2) {
            r1 = this;
            boolean r0 = r1.horizontalOffsetEnabled
            if (r0 == 0) goto Lf
            int r0 = r1.offsetLeft
            if (r0 == r2) goto Lf
            r1.offsetLeft = r2
            r1.applyOffsets()
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public boolean setTopAndBottomOffset(int r2) {
            r1 = this;
            boolean r0 = r1.verticalOffsetEnabled
            if (r0 == 0) goto Lf
            int r0 = r1.offsetTop
            if (r0 == r2) goto Lf
            r1.offsetTop = r2
            r1.applyOffsets()
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public void setVerticalOffsetEnabled(boolean r1) {
            r0 = this;
            r0.verticalOffsetEnabled = r1
            return
    }
}
