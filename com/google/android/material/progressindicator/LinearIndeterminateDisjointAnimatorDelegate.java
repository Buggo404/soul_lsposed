package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = null;
    private static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = null;
    private static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = null;
    private static final int TOTAL_DURATION_IN_MS = 1800;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private boolean animatorCompleteEndRequested;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private boolean dirtyColors;
    private int indicatorColorIndex;
    private final android.view.animation.Interpolator[] interpolatorArray;



    static {
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x001c: FILL_ARRAY_DATA , data: [533, 567, 850, 750} // fill-array
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS = r1
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [1267, 1000, 333, 0} // fill-array
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS = r0
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2 r0 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION = r0
            return
    }

    public LinearIndeterminateDisjointAnimatorDelegate(android.content.Context r4, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5) {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            r1 = 0
            r3.indicatorColorIndex = r1
            r2 = 0
            r3.animatorCompleteCallback = r2
            r3.baseSpec = r5
            r5 = 4
            android.view.animation.Interpolator[] r5 = new android.view.animation.Interpolator[r5]
            int r2 = com.google.android.material.C0479R.animator.linear_indeterminate_line1_head_interpolator
            android.view.animation.Interpolator r2 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r2)
            r5[r1] = r2
            int r1 = com.google.android.material.C0479R.animator.linear_indeterminate_line1_tail_interpolator
            android.view.animation.Interpolator r1 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r1)
            r2 = 1
            r5[r2] = r1
            int r1 = com.google.android.material.C0479R.animator.linear_indeterminate_line2_head_interpolator
            android.view.animation.Interpolator r1 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r1)
            r5[r0] = r1
            int r0 = com.google.android.material.C0479R.animator.linear_indeterminate_line2_tail_interpolator
            android.view.animation.Interpolator r4 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r0)
            r0 = 3
            r5[r0] = r4
            r3.interpolatorArray = r5
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            int r0 = r0.indicatorColorIndex
            return r0
    }

    static /* synthetic */ int access$002(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0, int r1) {
            r0.indicatorColorIndex = r1
            return r1
    }

    static /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec access$100(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r0.baseSpec
            return r0
    }

    static /* synthetic */ boolean access$202(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0, boolean r1) {
            r0.dirtyColors = r1
            return r1
    }

    static /* synthetic */ boolean access$300(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            boolean r0 = r0.animatorCompleteEndRequested
            return r0
    }

    static /* synthetic */ boolean access$302(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0, boolean r1) {
            r0.animatorCompleteEndRequested = r1
            return r1
    }

    static /* synthetic */ android.animation.ObjectAnimator access$400(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            android.animation.ObjectAnimator r0 = r0.animator
            return r0
    }

    static /* synthetic */ float access$500(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            float r0 = r0.getAnimationFraction()
            return r0
    }

    private float getAnimationFraction() {
            r1 = this;
            float r0 = r1.animationFraction
            return r0
    }

    private void maybeInitializeAnimators() {
            r3 = this;
            android.animation.ObjectAnimator r0 = r3.animator
            if (r0 != 0) goto L2d
            android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x002e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r1)
            r3.animator = r0
            r1 = 1800(0x708, double:8.893E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r3.animator
            r1 = 0
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r3.animator
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ObjectAnimator r0 = r3.animator
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1 r1 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1
            r1.<init>(r3)
            r0.addListener(r1)
        L2d:
            return
    }

    private void maybeUpdateSegmentColors() {
            r3 = this;
            boolean r0 = r3.dirtyColors
            if (r0 == 0) goto L1e
            int[] r0 = r3.segmentColors
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r3.baseSpec
            int[] r1 = r1.indicatorColors
            int r2 = r3.indicatorColorIndex
            r1 = r1[r2]
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r3.drawable
            int r2 = r2.getAlpha()
            int r1 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r1, r2)
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r3.dirtyColors = r0
        L1e:
            return
    }

    private void updateSegmentPositions(int r5) {
            r4 = this;
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L2a
            int[] r1 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS
            r1 = r1[r0]
            int[] r2 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS
            r2 = r2[r0]
            float r1 = r4.getFractionInRange(r5, r1, r2)
            android.view.animation.Interpolator[] r2 = r4.interpolatorArray
            r2 = r2[r0]
            float r1 = r2.getInterpolation(r1)
            float[] r2 = r4.segmentPositions
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r3, r1)
            r3 = 0
            float r1 = java.lang.Math.max(r3, r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L1
        L2a:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.animator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
            r0 = this;
            r0.resetPropertiesForNewStart()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            r0.animatorCompleteCallback = r1
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
            r2 = this;
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.drawable
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L12
            r0 = 1
            r2.animatorCompleteEndRequested = r0
            android.animation.ObjectAnimator r0 = r2.animator
            r1 = 0
            r0.setRepeatCount(r1)
            goto L15
        L12:
            r2.cancelAnimatorImmediately()
        L15:
            return
    }

    void resetPropertiesForNewStart() {
            r3 = this;
            r0 = 0
            r3.indicatorColorIndex = r0
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r3.baseSpec
            int[] r1 = r1.indicatorColors
            r1 = r1[r0]
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r3.drawable
            int r2 = r2.getAlpha()
            int r1 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r1, r2)
            int[] r2 = r3.segmentColors
            r2[r0] = r1
            int[] r0 = r3.segmentColors
            r2 = 1
            r0[r2] = r1
            return
    }

    void setAnimationFraction(float r2) {
            r1 = this;
            r1.animationFraction = r2
            r0 = 1155596288(0x44e10000, float:1800.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.updateSegmentPositions(r2)
            r1.maybeUpdateSegmentColors()
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.drawable
            r2.invalidateSelf()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
            r1 = this;
            r1.maybeInitializeAnimators()
            r1.resetPropertiesForNewStart()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.start()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
            r1 = this;
            r0 = 0
            r1.animatorCompleteCallback = r0
            return
    }
}
