package com.google.android.material.behavior;

import android.view.View;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    float alphaEndSwipeDistance;
    float alphaStartSwipeDistance;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    float dragDismissThreshold;
    private boolean interceptingEvents;
    com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener listener;
    private float sensitivity;
    private boolean sensitivitySet;
    int swipeDirection;
    androidx.customview.widget.ViewDragHelper viewDragHelper;



    public interface OnDismissListener {
        void onDismiss(android.view.View r1);

        void onDragStateChanged(int r1);
    }

    private class SettleRunnable implements java.lang.Runnable {
        private final boolean dismiss;
        final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior this$0;
        private final android.view.View view;

        SettleRunnable(com.google.android.material.behavior.SwipeDismissBehavior r1, android.view.View r2, boolean r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.view = r2
                r0.dismiss = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = r0.viewDragHelper
                if (r0 == 0) goto L17
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = r0.viewDragHelper
                r1 = 1
                boolean r0 = r0.continueSettling(r1)
                if (r0 == 0) goto L17
                android.view.View r0 = r2.view
                androidx.core.view.ViewCompat.postOnAnimation(r0, r2)
                goto L2a
            L17:
                boolean r0 = r2.dismiss
                if (r0 == 0) goto L2a
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.this$0
                com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r0 = r0.listener
                if (r0 == 0) goto L2a
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.this$0
                com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r0 = r0.listener
                android.view.View r1 = r2.view
                r0.onDismiss(r1)
            L2a:
                return
        }
    }

    public SwipeDismissBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.sensitivity = r0
            r1 = 2
            r2.swipeDirection = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.dragDismissThreshold = r1
            r2.alphaStartSwipeDistance = r0
            r2.alphaEndSwipeDistance = r1
            com.google.android.material.behavior.SwipeDismissBehavior$1 r0 = new com.google.android.material.behavior.SwipeDismissBehavior$1
            r0.<init>(r2)
            r2.dragCallback = r0
            return
    }

    static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    static int clamp(int r0, int r1, int r2) {
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    private void ensureViewDragHelper(android.view.ViewGroup r3) {
            r2 = this;
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            if (r0 != 0) goto L19
            boolean r0 = r2.sensitivitySet
            if (r0 == 0) goto L11
            float r0 = r2.sensitivity
            androidx.customview.widget.ViewDragHelper$Callback r1 = r2.dragCallback
            androidx.customview.widget.ViewDragHelper r3 = androidx.customview.widget.ViewDragHelper.create(r3, r0, r1)
            goto L17
        L11:
            androidx.customview.widget.ViewDragHelper$Callback r0 = r2.dragCallback
            androidx.customview.widget.ViewDragHelper r3 = androidx.customview.widget.ViewDragHelper.create(r3, r0)
        L17:
            r2.viewDragHelper = r3
        L19:
            return
    }

    static float fraction(float r0, float r1, float r2) {
            float r2 = r2 - r0
            float r1 = r1 - r0
            float r2 = r2 / r1
            return r2
    }

    private void updateAccessibilityActions(android.view.View r4) {
            r3 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r4, r0)
            boolean r0 = r3.canSwipeDismissView(r4)
            if (r0 == 0) goto L16
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS
            com.google.android.material.behavior.SwipeDismissBehavior$2 r1 = new com.google.android.material.behavior.SwipeDismissBehavior$2
            r1.<init>(r3)
            r2 = 0
            androidx.core.view.ViewCompat.replaceAccessibilityAction(r4, r0, r2, r1)
        L16:
            return
    }

    public boolean canSwipeDismissView(android.view.View r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public int getDragState() {
            r1 = this;
            androidx.customview.widget.ViewDragHelper r0 = r1.viewDragHelper
            if (r0 == 0) goto L9
            int r0 = r0.getViewDragState()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener getListener() {
            r1 = this;
            com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r0 = r1.listener
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.MotionEvent r6) {
            r3 = this;
            boolean r0 = r3.interceptingEvents
            int r1 = r6.getActionMasked()
            r2 = 0
            if (r1 == 0) goto L13
            r5 = 1
            if (r1 == r5) goto L10
            r5 = 3
            if (r1 == r5) goto L10
            goto L23
        L10:
            r3.interceptingEvents = r2
            goto L23
        L13:
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            boolean r0 = r4.isPointInChildBounds(r5, r0, r1)
            r3.interceptingEvents = r0
        L23:
            if (r0 == 0) goto L2f
            r3.ensureViewDragHelper(r4)
            androidx.customview.widget.ViewDragHelper r4 = r3.viewDragHelper
            boolean r4 = r4.shouldInterceptTouchEvent(r6)
            return r4
        L2f:
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            boolean r1 = super.onLayoutChild(r1, r2, r3)
            int r3 = androidx.core.view.ViewCompat.getImportantForAccessibility(r2)
            if (r3 != 0) goto L11
            r3 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
            r0.updateAccessibilityActions(r2)
        L11:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
            r0 = this;
            androidx.customview.widget.ViewDragHelper r1 = r0.viewDragHelper
            if (r1 == 0) goto L9
            r1.processTouchEvent(r3)
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public void setDragDismissDistance(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = clamp(r0, r3, r1)
            r2.dragDismissThreshold = r3
            return
    }

    public void setEndAlphaSwipeDistance(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = clamp(r0, r3, r1)
            r2.alphaEndSwipeDistance = r3
            return
    }

    public void setListener(com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    public void setSensitivity(float r1) {
            r0 = this;
            r0.sensitivity = r1
            r1 = 1
            r0.sensitivitySet = r1
            return
    }

    public void setStartAlphaSwipeDistance(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = clamp(r0, r3, r1)
            r2.alphaStartSwipeDistance = r3
            return
    }

    public void setSwipeDirection(int r1) {
            r0 = this;
            r0.swipeDirection = r1
            return
    }
}
