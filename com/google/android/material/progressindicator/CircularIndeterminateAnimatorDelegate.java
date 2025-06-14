package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
final class CircularIndeterminateAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = null;
    private static final android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> COMPLETE_END_FRACTION = null;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = null;
    private static final int[] DELAY_TO_EXPAND_IN_MS = null;
    private static final int[] DELAY_TO_FADE_IN_MS = null;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private android.animation.ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final androidx.interpolator.view.animation.FastOutSlowInInterpolator interpolator;





    static {
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x002e: FILL_ARRAY_DATA , data: [0, 1350, 2700, 4050} // fill-array
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_EXPAND_IN_MS = r1
            int[] r1 = new int[r0]
            r1 = {x003a: FILL_ARRAY_DATA , data: [667, 2017, 3367, 4717} // fill-array
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_COLLAPSE_IN_MS = r1
            int[] r0 = new int[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [1000, 2350, 3700, 5050} // fill-array
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_FADE_IN_MS = r0
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3 r0 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.ANIMATION_FRACTION = r0
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4 r0 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "completeEndFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.COMPLETE_END_FRACTION = r0
            return
    }

    public CircularIndeterminateAnimatorDelegate(com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r0 = 0
            r1.indicatorColorIndexOffset = r0
            r0 = 0
            r1.animatorCompleteCallback = r0
            r1.baseSpec = r2
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r2 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r2.<init>()
            r1.interpolator = r2
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            int r0 = r0.indicatorColorIndexOffset
            return r0
    }

    static /* synthetic */ int access$002(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0, int r1) {
            r0.indicatorColorIndexOffset = r1
            return r1
    }

    static /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec access$100(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r0.baseSpec
            return r0
    }

    static /* synthetic */ float access$200(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            float r0 = r0.getAnimationFraction()
            return r0
    }

    static /* synthetic */ float access$300(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            float r0 = r0.getCompleteEndFraction()
            return r0
    }

    static /* synthetic */ void access$400(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0, float r1) {
            r0.setCompleteEndFraction(r1)
            return
    }

    private float getAnimationFraction() {
            r1 = this;
            float r0 = r1.animationFraction
            return r0
    }

    private float getCompleteEndFraction() {
            r1 = this;
            float r0 = r1.completeEndFraction
            return r0
    }

    private void maybeInitializeAnimators() {
            r4 = this;
            android.animation.ObjectAnimator r0 = r4.animator
            r1 = 2
            if (r0 != 0) goto L2d
            android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.ANIMATION_FRACTION
            float[] r2 = new float[r1]
            r2 = {x0056: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            r4.animator = r0
            r2 = 5400(0x1518, double:2.668E-320)
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r4.animator
            r2 = 0
            r0.setInterpolator(r2)
            android.animation.ObjectAnimator r0 = r4.animator
            r2 = -1
            r0.setRepeatCount(r2)
            android.animation.ObjectAnimator r0 = r4.animator
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1 r2 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1
            r2.<init>(r4)
            r0.addListener(r2)
        L2d:
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            if (r0 != 0) goto L54
            android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.COMPLETE_END_FRACTION
            float[] r1 = new float[r1]
            r1 = {x005e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r1)
            r4.completeEndAnimator = r0
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r1 = r4.interpolator
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2 r1 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2
            r1.<init>(r4)
            r0.addListener(r1)
        L54:
            return
    }

    private void maybeUpdateSegmentColors(int r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 4
            if (r1 >= r2) goto L6d
            int[] r2 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_FADE_IN_MS
            r2 = r2[r1]
            r3 = 333(0x14d, float:4.67E-43)
            float r2 = r5.getFractionInRange(r6, r2, r3)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L6a
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L6a
            int r6 = r5.indicatorColorIndexOffset
            int r1 = r1 + r6
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r6 = r5.baseSpec
            int[] r6 = r6.indicatorColors
            int r6 = r6.length
            int r1 = r1 % r6
            int r6 = r1 + 1
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r5.baseSpec
            int[] r3 = r3.indicatorColors
            int r3 = r3.length
            int r6 = r6 % r3
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r5.baseSpec
            int[] r3 = r3.indicatorColors
            r1 = r3[r1]
            com.google.android.material.progressindicator.IndeterminateDrawable r3 = r5.drawable
            int r3 = r3.getAlpha()
            int r1 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r1, r3)
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r5.baseSpec
            int[] r3 = r3.indicatorColors
            r6 = r3[r6]
            com.google.android.material.progressindicator.IndeterminateDrawable r3 = r5.drawable
            int r3 = r3.getAlpha()
            int r6 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r6, r3)
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r3 = r5.interpolator
            float r2 = r3.getInterpolation(r2)
            int[] r3 = r5.segmentColors
            com.google.android.material.animation.ArgbEvaluatorCompat r4 = com.google.android.material.animation.ArgbEvaluatorCompat.getInstance()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r6 = r4.evaluate2(r2, r1, r6)
            int r6 = r6.intValue()
            r3[r0] = r6
            goto L6d
        L6a:
            int r1 = r1 + 1
            goto L2
        L6d:
            return
    }

    private void setCompleteEndFraction(float r1) {
            r0 = this;
            r0.completeEndFraction = r1
            return
    }

    private void updateSegmentPositions(int r9) {
            r8 = this;
            float[] r0 = r8.segmentPositions
            float r1 = r8.animationFraction
            r2 = 1153302528(0x44be0000, float:1520.0)
            float r1 = r1 * r2
            r3 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r1 = r1 + r3
            r3 = 0
            r0[r3] = r1
            float[] r0 = r8.segmentPositions
            float r1 = r8.animationFraction
            float r1 = r1 * r2
            r2 = 1
            r0[r2] = r1
            r0 = r3
        L16:
            r1 = 4
            if (r0 >= r1) goto L4c
            int[] r1 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_EXPAND_IN_MS
            r1 = r1[r0]
            r4 = 667(0x29b, float:9.35E-43)
            float r1 = r8.getFractionInRange(r9, r1, r4)
            float[] r5 = r8.segmentPositions
            r6 = r5[r2]
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r7 = r8.interpolator
            float r1 = r7.getInterpolation(r1)
            r7 = 1132068864(0x437a0000, float:250.0)
            float r1 = r1 * r7
            float r6 = r6 + r1
            r5[r2] = r6
            int[] r1 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_COLLAPSE_IN_MS
            r1 = r1[r0]
            float r1 = r8.getFractionInRange(r9, r1, r4)
            float[] r4 = r8.segmentPositions
            r5 = r4[r3]
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r6 = r8.interpolator
            float r1 = r6.getInterpolation(r1)
            float r1 = r1 * r7
            float r5 = r5 + r1
            r4[r3] = r5
            int r0 = r0 + 1
            goto L16
        L4c:
            float[] r9 = r8.segmentPositions
            r0 = r9[r3]
            float[] r1 = r8.segmentPositions
            r1 = r1[r2]
            float[] r4 = r8.segmentPositions
            r4 = r4[r3]
            float r1 = r1 - r4
            float r4 = r8.completeEndFraction
            float r1 = r1 * r4
            float r0 = r0 + r1
            r9[r3] = r0
            float[] r9 = r8.segmentPositions
            r0 = r9[r3]
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 / r1
            r9[r3] = r0
            float[] r9 = r8.segmentPositions
            r0 = r9[r2]
            float r0 = r0 / r1
            r9[r2] = r0
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
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
    void requestCancelAnimatorAfterCurrentCycle() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.completeEndAnimator
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L9
            return
        L9:
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.drawable
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L17
            android.animation.ObjectAnimator r0 = r1.completeEndAnimator
            r0.start()
            goto L1a
        L17:
            r1.cancelAnimatorImmediately()
        L1a:
            return
    }

    void resetPropertiesForNewStart() {
            r4 = this;
            r0 = 0
            r4.indicatorColorIndexOffset = r0
            int[] r1 = r4.segmentColors
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.baseSpec
            int[] r2 = r2.indicatorColors
            r2 = r2[r0]
            com.google.android.material.progressindicator.IndeterminateDrawable r3 = r4.drawable
            int r3 = r3.getAlpha()
            int r2 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r2, r3)
            r1[r0] = r2
            r0 = 0
            r4.completeEndFraction = r0
            return
    }

    void setAnimationFraction(float r2) {
            r1 = this;
            r1.animationFraction = r2
            r0 = 1168687104(0x45a8c000, float:5400.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.updateSegmentPositions(r2)
            r1.maybeUpdateSegmentColors(r2)
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.drawable
            r2.invalidateSelf()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
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
