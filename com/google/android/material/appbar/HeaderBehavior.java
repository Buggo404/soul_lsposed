package com.google.android.material.appbar;

import android.view.View;

/* loaded from: classes.dex */
abstract class HeaderBehavior<V extends android.view.View> extends com.google.android.material.appbar.ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private java.lang.Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    android.widget.OverScroller scroller;
    private int touchSlop;
    private android.view.VelocityTracker velocityTracker;

    private class FlingRunnable implements java.lang.Runnable {
        private final V layout;
        private final androidx.coordinatorlayout.widget.CoordinatorLayout parent;
        final /* synthetic */ com.google.android.material.appbar.HeaderBehavior this$0;

        FlingRunnable(com.google.android.material.appbar.HeaderBehavior r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parent = r2
                r0.layout = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                V extends android.view.View r0 = r4.layout
                if (r0 == 0) goto L32
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                android.widget.OverScroller r0 = r0.scroller
                if (r0 == 0) goto L32
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                android.widget.OverScroller r0 = r0.scroller
                boolean r0 = r0.computeScrollOffset()
                if (r0 == 0) goto L29
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.parent
                V extends android.view.View r2 = r4.layout
                android.widget.OverScroller r3 = r0.scroller
                int r3 = r3.getCurrY()
                r0.setHeaderTopBottomOffset(r1, r2, r3)
                V extends android.view.View r0 = r4.layout
                androidx.core.view.ViewCompat.postOnAnimation(r0, r4)
                goto L32
            L29:
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.parent
                V extends android.view.View r2 = r4.layout
                r0.onFlingFinished(r1, r2)
            L32:
                return
        }
    }

    public HeaderBehavior() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.activePointerId = r0
            r1.touchSlop = r0
            return
    }

    public HeaderBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.activePointerId = r1
            r0.touchSlop = r1
            return
    }

    private void ensureVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.velocityTracker = r0
        La:
            return
    }

    boolean canDragView(V r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    final boolean fling(androidx.coordinatorlayout.widget.CoordinatorLayout r14, V r15, int r16, int r17, float r18) {
            r13 = this;
            r0 = r13
            r1 = r15
            java.lang.Runnable r2 = r0.flingRunnable
            if (r2 == 0) goto Lc
            r15.removeCallbacks(r2)
            r2 = 0
            r0.flingRunnable = r2
        Lc:
            android.widget.OverScroller r2 = r0.scroller
            if (r2 != 0) goto L1b
            android.widget.OverScroller r2 = new android.widget.OverScroller
            android.content.Context r3 = r15.getContext()
            r2.<init>(r3)
            r0.scroller = r2
        L1b:
            android.widget.OverScroller r4 = r0.scroller
            r5 = 0
            int r6 = r13.getTopAndBottomOffset()
            r7 = 0
            int r8 = java.lang.Math.round(r18)
            r9 = 0
            r10 = 0
            r11 = r16
            r12 = r17
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            android.widget.OverScroller r2 = r0.scroller
            boolean r2 = r2.computeScrollOffset()
            if (r2 == 0) goto L45
            com.google.android.material.appbar.HeaderBehavior$FlingRunnable r2 = new com.google.android.material.appbar.HeaderBehavior$FlingRunnable
            r3 = r14
            r2.<init>(r13, r14, r15)
            r0.flingRunnable = r2
            androidx.core.view.ViewCompat.postOnAnimation(r15, r2)
            r1 = 1
            return r1
        L45:
            r3 = r14
            r13.onFlingFinished(r14, r15)
            r1 = 0
            return r1
    }

    int getMaxDragOffset(V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            int r1 = -r1
            return r1
    }

    int getScrollRangeForDragFling(V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            return r1
    }

    int getTopBottomOffsetForScrollingSibling() {
            r1 = this;
            int r0 = r1.getTopAndBottomOffset()
            return r0
    }

    void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
            r0 = this;
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
            r6 = this;
            int r0 = r6.touchSlop
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.touchSlop = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.isBeingDragged
            if (r0 == 0) goto L40
            int r0 = r6.activePointerId
            if (r0 != r3) goto L25
            return r4
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            return r4
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.lastMotionY
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.touchSlop
            if (r1 <= r5) goto L40
            r6.lastMotionY = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L80
            r6.activePointerId = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.canDragView(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.isPointInChildBounds(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.isBeingDragged = r7
            if (r7 == 0) goto L80
            r6.lastMotionY = r1
            int r7 = r9.getPointerId(r4)
            r6.activePointerId = r7
            r6.ensureVelocityTracker()
            android.widget.OverScroller r7 = r6.scroller
            if (r7 == 0) goto L80
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L80
            android.widget.OverScroller r7 = r6.scroller
            r7.abortAnimation()
            return r2
        L80:
            android.view.VelocityTracker r7 = r6.velocityTracker
            if (r7 == 0) goto L87
            r7.addMovement(r9)
        L87:
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.activePointerId = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.lastMotionY = r12
            goto L4c
        L2d:
            int r0 = r11.activePointerId
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.lastMotionY
            int r7 = r1 - r0
            r11.lastMotionY = r0
            int r8 = r11.getMaxDragOffset(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.scroll(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.velocityTracker
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.velocityTracker
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.velocityTracker
            int r4 = r11.activePointerId
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.getScrollRangeForDragFling(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.fling(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.isBeingDragged = r3
            r11.activePointerId = r1
            android.view.VelocityTracker r13 = r11.velocityTracker
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.velocityTracker = r13
        L81:
            android.view.VelocityTracker r13 = r11.velocityTracker
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.isBeingDragged
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
    }

    final int scroll(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.getTopBottomOffsetForScrollingSibling()
            int r4 = r0 - r10
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            int r8 = r1.setHeaderTopBottomOffset(r2, r3, r4, r5, r6)
            return r8
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
            r6 = this;
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.setHeaderTopBottomOffset(r1, r2, r3, r4, r5)
            return r7
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.getTopAndBottomOffset()
            if (r4 == 0) goto L15
            if (r1 < r4) goto L15
            if (r1 > r5) goto L15
            int r2 = androidx.core.math.MathUtils.clamp(r3, r4, r5)
            if (r1 == r2) goto L15
            r0.setTopAndBottomOffset(r2)
            int r1 = r1 - r2
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }
}
