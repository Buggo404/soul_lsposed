package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
public final class IndeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    private com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> animatorDelegate;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;

    IndeterminateDrawable(android.content.Context r1, com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2, com.google.android.material.progressindicator.DrawingDelegate<S> r3, com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setDrawingDelegate(r3)
            r0.setAnimatorDelegate(r4)
            return
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context r3, com.google.android.material.progressindicator.CircularProgressIndicatorSpec r4) {
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = new com.google.android.material.progressindicator.IndeterminateDrawable
            com.google.android.material.progressindicator.CircularDrawingDelegate r1 = new com.google.android.material.progressindicator.CircularDrawingDelegate
            r1.<init>(r4)
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r2 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate
            r2.<init>(r4)
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context r3, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r4) {
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = new com.google.android.material.progressindicator.IndeterminateDrawable
            com.google.android.material.progressindicator.LinearDrawingDelegate r1 = new com.google.android.material.progressindicator.LinearDrawingDelegate
            r1.<init>(r4)
            int r2 = r4.indeterminateAnimationType
            if (r2 != 0) goto L11
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r2 = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate
            r2.<init>(r4)
            goto L16
        L11:
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r2 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate
            r2.<init>(r3, r4)
        L16:
            r0.<init>(r3, r4, r1, r2)
            return r0
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
            if (r1 != 0) goto L5b
            boolean r1 = r8.isVisible()
            if (r1 == 0) goto L5b
            boolean r0 = r9.getClipBounds(r0)
            if (r0 != 0) goto L1c
            goto L5b
        L1c:
            r9.save()
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r8.drawingDelegate
            float r1 = r8.getGrowFraction()
            r0.validateSpecAndAdjustCanvas(r9, r1)
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r8.drawingDelegate
            android.graphics.Paint r1 = r8.paint
            r0.fillTrack(r9, r1)
            r0 = 0
        L30:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1 = r8.animatorDelegate
            int[] r1 = r1.segmentColors
            int r1 = r1.length
            if (r0 >= r1) goto L58
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r2 = r8.drawingDelegate
            android.graphics.Paint r4 = r8.paint
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1 = r8.animatorDelegate
            float[] r1 = r1.segmentPositions
            int r3 = r0 * 2
            r5 = r1[r3]
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1 = r8.animatorDelegate
            float[] r1 = r1.segmentPositions
            int r3 = r3 + 1
            r6 = r1[r3]
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1 = r8.animatorDelegate
            int[] r1 = r1.segmentColors
            r7 = r1[r0]
            r3 = r9
            r2.fillIndicator(r3, r4, r5, r6, r7)
            int r0 = r0 + 1
            goto L30
        L58:
            r9.restore()
        L5b:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
            r1 = this;
            int r0 = super.getAlpha()
            return r0
    }

    com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> getAnimatorDelegate() {
            r1 = this;
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r0 = r1.animatorDelegate
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

    void setAnimatorDelegate(com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1) {
            r0 = this;
            r0.animatorDelegate = r1
            r1.registerDrawable(r0)
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
    boolean setVisibleInternal(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            boolean r4 = super.setVisibleInternal(r3, r4, r5)
            boolean r0 = r2.isRunning()
            if (r0 != 0) goto Lf
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r0 = r2.animatorDelegate
            r0.cancelAnimatorImmediately()
        Lf:
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r0 = r2.animatorDurationScaleProvider
            android.content.Context r1 = r2.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            r0.getSystemAnimatorDurationScale(r1)
            if (r3 == 0) goto L24
            if (r5 != 0) goto L1f
            goto L24
        L1f:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r3 = r2.animatorDelegate
            r3.startAnimator()
        L24:
            return r4
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
