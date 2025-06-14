package com.google.android.material.behavior;

import android.view.View;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    protected static final int ENTER_ANIMATION_DURATION = 225;
    protected static final int EXIT_ANIMATION_DURATION = 175;
    private static final int STATE_SCROLLED_DOWN = 1;
    private static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private android.view.ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int height;


    public HideBottomViewOnScrollBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.height = r0
            r1 = 2
            r2.currentState = r1
            r2.additionalHiddenOffsetY = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.height = r1
            r2 = 2
            r0.currentState = r2
            r0.additionalHiddenOffsetY = r1
            return
    }

    static /* synthetic */ android.view.ViewPropertyAnimator access$002(com.google.android.material.behavior.HideBottomViewOnScrollBehavior r0, android.view.ViewPropertyAnimator r1) {
            r0.currentAnimator = r1
            return r1
    }

    private void animateChildTo(V r1, int r2, long r3, android.animation.TimeInterpolator r5) {
            r0 = this;
            android.view.ViewPropertyAnimator r1 = r1.animate()
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$1 r2 = new com.google.android.material.behavior.HideBottomViewOnScrollBehavior$1
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.currentAnimator = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getMeasuredHeight()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            r2.height = r1
            boolean r3 = super.onLayoutChild(r3, r4, r5)
            return r3
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
            r0 = this;
            if (r5 <= 0) goto L6
            r0.slideDown(r2)
            goto Lb
        L6:
            if (r5 >= 0) goto Lb
            r0.slideUp(r2)
        Lb:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 2
            if (r5 != r1) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    public void setAdditionalHiddenOffsetY(V r3, int r4) {
            r2 = this;
            r2.additionalHiddenOffsetY = r4
            int r0 = r2.currentState
            r1 = 1
            if (r0 != r1) goto Le
            int r0 = r2.height
            int r0 = r0 + r4
            float r4 = (float) r0
            r3.setTranslationY(r4)
        Le:
            return
    }

    public void slideDown(V r9) {
            r8 = this;
            int r0 = r8.currentState
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            android.view.ViewPropertyAnimator r0 = r8.currentAnimator
            if (r0 == 0) goto L10
            r0.cancel()
            r9.clearAnimation()
        L10:
            r8.currentState = r1
            int r0 = r8.height
            int r1 = r8.additionalHiddenOffsetY
            int r4 = r0 + r1
            r5 = 175(0xaf, double:8.65E-322)
            android.animation.TimeInterpolator r7 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            r2 = r8
            r3 = r9
            r2.animateChildTo(r3, r4, r5, r7)
            return
    }

    public void slideUp(V r9) {
            r8 = this;
            int r0 = r8.currentState
            r1 = 2
            if (r0 != r1) goto L6
            return
        L6:
            android.view.ViewPropertyAnimator r0 = r8.currentAnimator
            if (r0 == 0) goto L10
            r0.cancel()
            r9.clearAnimation()
        L10:
            r8.currentState = r1
            r4 = 0
            r5 = 225(0xe1, double:1.11E-321)
            android.animation.TimeInterpolator r7 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            r2 = r8
            r3 = r9
            r2.animateChildTo(r3, r4, r5, r7)
            return
    }
}
