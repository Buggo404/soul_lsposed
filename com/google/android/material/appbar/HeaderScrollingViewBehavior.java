package com.google.android.material.appbar;

/* loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends com.google.android.material.appbar.ViewOffsetBehavior<android.view.View> {
    private int overlayTop;
    final android.graphics.Rect tempRect1;
    final android.graphics.Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.tempRect1 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.tempRect2 = r0
            r0 = 0
            r1.verticalLayoutGap = r0
            return
    }

    public HeaderScrollingViewBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tempRect1 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tempRect2 = r1
            r1 = 0
            r0.verticalLayoutGap = r1
            return
    }

    private static int resolveGravity(int r0) {
            if (r0 != 0) goto L5
            r0 = 8388659(0x800033, float:1.1755015E-38)
        L5:
            return r0
    }

    abstract android.view.View findFirstDependency(java.util.List<android.view.View> r1);

    final int getOverlapPixelsForOffset(android.view.View r4) {
            r3 = this;
            int r0 = r3.overlayTop
            r1 = 0
            if (r0 != 0) goto L6
            goto L13
        L6:
            float r4 = r3.getOverlapRatioForOffset(r4)
            int r0 = r3.overlayTop
            float r2 = (float) r0
            float r4 = r4 * r2
            int r4 = (int) r4
            int r1 = androidx.core.math.MathUtils.clamp(r4, r1, r0)
        L13:
            return r1
    }

    float getOverlapRatioForOffset(android.view.View r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    public final int getOverlayTop() {
            r1 = this;
            int r0 = r1.overlayTop
            return r0
    }

    int getScrollRange(android.view.View r1) {
            r0 = this;
            int r1 = r1.getMeasuredHeight()
            return r1
    }

    final int getVerticalLayoutGap() {
            r1 = this;
            int r0 = r1.verticalLayoutGap
            return r0
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void layoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) {
            r8 = this;
            java.util.List r0 = r9.getDependencies(r10)
            android.view.View r0 = r8.findFirstDependency(r0)
            if (r0 == 0) goto L94
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            android.graphics.Rect r5 = r8.tempRect1
            int r2 = r9.getPaddingLeft()
            int r3 = r1.leftMargin
            int r2 = r2 + r3
            int r3 = r0.getBottom()
            int r4 = r1.topMargin
            int r3 = r3 + r4
            int r4 = r9.getWidth()
            int r6 = r9.getPaddingRight()
            int r4 = r4 - r6
            int r6 = r1.rightMargin
            int r4 = r4 - r6
            int r6 = r9.getHeight()
            int r7 = r0.getBottom()
            int r6 = r6 + r7
            int r7 = r9.getPaddingBottom()
            int r6 = r6 - r7
            int r7 = r1.bottomMargin
            int r6 = r6 - r7
            r5.set(r2, r3, r4, r6)
            androidx.core.view.WindowInsetsCompat r2 = r9.getLastWindowInsets()
            if (r2 == 0) goto L64
            boolean r9 = androidx.core.view.ViewCompat.getFitsSystemWindows(r9)
            if (r9 == 0) goto L64
            boolean r9 = androidx.core.view.ViewCompat.getFitsSystemWindows(r10)
            if (r9 != 0) goto L64
            int r9 = r5.left
            int r3 = r2.getSystemWindowInsetLeft()
            int r9 = r9 + r3
            r5.left = r9
            int r9 = r5.right
            int r2 = r2.getSystemWindowInsetRight()
            int r9 = r9 - r2
            r5.right = r9
        L64:
            android.graphics.Rect r9 = r8.tempRect2
            int r1 = r1.gravity
            int r2 = resolveGravity(r1)
            int r3 = r10.getMeasuredWidth()
            int r4 = r10.getMeasuredHeight()
            r6 = r9
            r7 = r11
            androidx.core.view.GravityCompat.apply(r2, r3, r4, r5, r6, r7)
            int r11 = r8.getOverlapPixelsForOffset(r0)
            int r1 = r9.left
            int r2 = r9.top
            int r2 = r2 - r11
            int r3 = r9.right
            int r4 = r9.bottom
            int r4 = r4 - r11
            r10.layout(r1, r2, r3, r4)
            int r9 = r9.top
            int r10 = r0.getBottom()
            int r9 = r9 - r10
            r8.verticalLayoutGap = r9
            goto L9a
        L94:
            super.layoutChild(r9, r10, r11)
            r9 = 0
            r8.verticalLayoutGap = r9
        L9a:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            int r0 = r0.height
            r1 = -1
            if (r0 == r1) goto Lc
            r2 = -2
            if (r0 != r2) goto L62
        Lc:
            java.util.List r2 = r8.getDependencies(r9)
            android.view.View r2 = r7.findFirstDependency(r2)
            if (r2 == 0) goto L62
            int r12 = android.view.View.MeasureSpec.getSize(r12)
            if (r12 <= 0) goto L33
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r3 == 0) goto L37
            androidx.core.view.WindowInsetsCompat r3 = r8.getLastWindowInsets()
            if (r3 == 0) goto L37
            int r4 = r3.getSystemWindowInsetTop()
            int r3 = r3.getSystemWindowInsetBottom()
            int r4 = r4 + r3
            int r12 = r12 + r4
            goto L37
        L33:
            int r12 = r8.getHeight()
        L37:
            int r3 = r7.getScrollRange(r2)
            int r12 = r12 + r3
            int r2 = r2.getMeasuredHeight()
            boolean r3 = r7.shouldHeaderOverlapScrollingChild()
            if (r3 == 0) goto L4c
            int r2 = -r2
            float r2 = (float) r2
            r9.setTranslationY(r2)
            goto L4d
        L4c:
            int r12 = r12 - r2
        L4d:
            if (r0 != r1) goto L52
            r0 = 1073741824(0x40000000, float:2.0)
            goto L54
        L52:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L54:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.onMeasureChild(r2, r3, r4, r5, r6)
            r8 = 1
            return r8
        L62:
            r8 = 0
            return r8
    }

    public final void setOverlayTop(int r1) {
            r0 = this;
            r0.overlayTop = r1
            return
    }

    protected boolean shouldHeaderOverlapScrollingChild() {
            r1 = this;
            r0 = 0
            return r0
    }
}
