package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
public final class DeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    private static final androidx.dynamicanimation.animation.FloatPropertyCompat<com.google.android.material.progressindicator.DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = null;
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange;
    private final androidx.dynamicanimation.animation.SpringAnimation springAnimator;
    private final androidx.dynamicanimation.animation.SpringForce springForce;


    static {
            com.google.android.material.progressindicator.DeterminateDrawable$1 r0 = new com.google.android.material.progressindicator.DeterminateDrawable$1
            java.lang.String r1 = "indicatorLevel"
            r0.<init>(r1)
            com.google.android.material.progressindicator.DeterminateDrawable.INDICATOR_LENGTH_IN_LEVEL = r0
            return
    }

    DeterminateDrawable(android.content.Context r2, com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3, com.google.android.material.progressindicator.DrawingDelegate<S> r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.skipAnimationOnLevelChange = r2
            r1.setDrawingDelegate(r4)
            androidx.dynamicanimation.animation.SpringForce r2 = new androidx.dynamicanimation.animation.SpringForce
            r2.<init>()
            r1.springForce = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setDampingRatio(r3)
            r4 = 1112014848(0x42480000, float:50.0)
            r2.setStiffness(r4)
            androidx.dynamicanimation.animation.SpringAnimation r4 = new androidx.dynamicanimation.animation.SpringAnimation
            androidx.dynamicanimation.animation.FloatPropertyCompat<com.google.android.material.progressindicator.DeterminateDrawable> r0 = com.google.android.material.progressindicator.DeterminateDrawable.INDICATOR_LENGTH_IN_LEVEL
            r4.<init>(r1, r0)
            r1.springAnimator = r4
            r4.setSpring(r2)
            r1.setGrowFraction(r3)
            return
    }

    static /* synthetic */ float access$000(com.google.android.material.progressindicator.DeterminateDrawable r0) {
            float r0 = r0.getIndicatorFraction()
            return r0
    }

    static /* synthetic */ void access$100(com.google.android.material.progressindicator.DeterminateDrawable r0, float r1) {
            r0.setIndicatorFraction(r1)
            return
    }

    public static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context r2, com.google.android.material.progressindicator.CircularProgressIndicatorSpec r3) {
            com.google.android.material.progressindicator.DeterminateDrawable r0 = new com.google.android.material.progressindicator.DeterminateDrawable
            com.google.android.material.progressindicator.CircularDrawingDelegate r1 = new com.google.android.material.progressindicator.CircularDrawingDelegate
            r1.<init>(r3)
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context r2, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r3) {
            com.google.android.material.progressindicator.DeterminateDrawable r0 = new com.google.android.material.progressindicator.DeterminateDrawable
            com.google.android.material.progressindicator.LinearDrawingDelegate r1 = new com.google.android.material.progressindicator.LinearDrawingDelegate
            r1.<init>(r3)
            r0.<init>(r2, r3, r1)
            return r0
    }

    private float getIndicatorFraction() {
            r1 = this;
            float r0 = r1.indicatorFraction
            return r0
    }

    private void setIndicatorFraction(float r1) {
            r0 = this;
            r0.indicatorFraction = r1
            r0.invalidateSelf()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
            r0 = this;
            super.clearAnimationCallbacks()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r8.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4e
            boolean r1 = r8.isVisible()
            if (r1 == 0) goto L4e
            boolean r0 = r9.getClipBounds(r0)
            if (r0 != 0) goto L1c
            goto L4e
        L1c:
            r9.save()
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r8.drawingDelegate
            float r1 = r8.getGrowFraction()
            r0.validateSpecAndAdjustCanvas(r9, r1)
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r8.drawingDelegate
            android.graphics.Paint r1 = r8.paint
            r0.fillTrack(r9, r1)
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r8.baseSpec
            int[] r0 = r0.indicatorColors
            r1 = 0
            r0 = r0[r1]
            int r1 = r8.getAlpha()
            int r7 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r0, r1)
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r2 = r8.drawingDelegate
            android.graphics.Paint r4 = r8.paint
            r5 = 0
            float r6 = r8.getIndicatorFraction()
            r3 = r9
            r2.fillIndicator(r3, r4, r5, r6, r7)
            r9.restore()
        L4e:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
            r1 = this;
            int r0 = super.getAlpha()
            return r0
    }

    com.google.android.material.progressindicator.DrawingDelegate<S> getDrawingDelegate() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            int r0 = r0.getPreferredHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            int r0 = r0.getPreferredWidth()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
            r1 = this;
            int r0 = super.getOpacity()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
            r1 = this;
            boolean r0 = super.hideNow()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
            r1 = this;
            boolean r0 = super.isHiding()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
            r1 = this;
            boolean r0 = super.isRunning()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
            r1 = this;
            boolean r0 = super.isShowing()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r2 = this;
            androidx.dynamicanimation.animation.SpringAnimation r0 = r2.springAnimator
            r0.cancel()
            int r0 = r2.getLevel()
            float r0 = (float) r0
            r1 = 1176256512(0x461c4000, float:10000.0)
            float r0 = r0 / r1
            r2.setIndicatorFraction(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r4) {
            r3 = this;
            boolean r0 = r3.skipAnimationOnLevelChange
            r1 = 1176256512(0x461c4000, float:10000.0)
            if (r0 == 0) goto L12
            androidx.dynamicanimation.animation.SpringAnimation r0 = r3.springAnimator
            r0.cancel()
            float r4 = (float) r4
            float r4 = r4 / r1
            r3.setIndicatorFraction(r4)
            goto L22
        L12:
            androidx.dynamicanimation.animation.SpringAnimation r0 = r3.springAnimator
            float r2 = r3.getIndicatorFraction()
            float r2 = r2 * r1
            r0.setStartValue(r2)
            androidx.dynamicanimation.animation.SpringAnimation r0 = r3.springAnimator
            float r4 = (float) r4
            r0.animateToFinalPosition(r4)
        L22:
            r4 = 1
            return r4
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            super.registerAnimationCallback(r1)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int r1) {
            r0 = this;
            super.setAlpha(r1)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            super.setColorFilter(r1)
            return
    }

    void setDrawingDelegate(com.google.android.material.progressindicator.DrawingDelegate<S> r1) {
            r0 = this;
            r0.drawingDelegate = r1
            r1.registerDrawable(r0)
            return
    }

    void setLevelByFraction(float r2) {
            r1 = this;
            r0 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.setLevel(r2)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2) {
            r0 = this;
            boolean r1 = super.setVisible(r1, r2)
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            boolean r1 = super.setVisible(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    boolean setVisibleInternal(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r2 = super.setVisibleInternal(r2, r3, r4)
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r3 = r1.animatorDurationScaleProvider
            android.content.Context r4 = r1.context
            android.content.ContentResolver r4 = r4.getContentResolver()
            float r3 = r3.getSystemAnimatorDurationScale(r4)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L19
            r3 = 1
            r1.skipAnimationOnLevelChange = r3
            goto L24
        L19:
            r4 = 0
            r1.skipAnimationOnLevelChange = r4
            androidx.dynamicanimation.animation.SpringForce r4 = r1.springForce
            r0 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 / r3
            r4.setStiffness(r0)
        L24:
            return r2
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
            r0 = this;
            super.start()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
            r0 = this;
            super.stop()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            boolean r1 = super.unregisterAnimationCallback(r1)
            return r1
    }
}
