package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
abstract class DrawableWithAnimatedVisibilityChange extends android.graphics.drawable.Drawable implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> GROW_FRACTION = null;
    private java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> animationCallbacks;
    com.google.android.material.progressindicator.AnimatorDurationScaleProvider animatorDurationScaleProvider;
    final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    final android.content.Context context;
    private float growFraction;
    private android.animation.ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    final android.graphics.Paint paint;
    private android.animation.ValueAnimator showAnimator;
    private int totalAlpha;




    static {
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3 r0 = new com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "growFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.GROW_FRACTION = r0
            return
    }

    DrawableWithAnimatedVisibilityChange(android.content.Context r2, com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.paint = r0
            r1.context = r2
            r1.baseSpec = r3
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r2 = new com.google.android.material.progressindicator.AnimatorDurationScaleProvider
            r2.<init>()
            r1.animatorDurationScaleProvider = r2
            r2 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r2)
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0) {
            r0.dispatchAnimationStart()
            return
    }

    static /* synthetic */ boolean access$101(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0, boolean r1, boolean r2) {
            boolean r0 = super.setVisible(r1, r2)
            return r0
    }

    static /* synthetic */ void access$200(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0) {
            r0.dispatchAnimationEnd()
            return
    }

    private void dispatchAnimationEnd() {
            r2 = this;
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r0 = r2.internalAnimationCallback
            if (r0 == 0) goto L7
            r0.onAnimationEnd(r2)
        L7:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.animationCallbacks
            if (r0 == 0) goto L23
            boolean r1 = r2.ignoreCallbacks
            if (r1 != 0) goto L23
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r1
            r1.onAnimationEnd(r2)
            goto L13
        L23:
            return
    }

    private void dispatchAnimationStart() {
            r2 = this;
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r0 = r2.internalAnimationCallback
            if (r0 == 0) goto L7
            r0.onAnimationStart(r2)
        L7:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.animationCallbacks
            if (r0 == 0) goto L23
            boolean r1 = r2.ignoreCallbacks
            if (r1 != 0) goto L23
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r1
            r1.onAnimationStart(r2)
            goto L13
        L23:
            return
    }

    private void endAnimatorWithoutCallbacks(android.animation.ValueAnimator... r5) {
            r4 = this;
            boolean r0 = r4.ignoreCallbacks
            r1 = 1
            r4.ignoreCallbacks = r1
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r3.end()
            int r2 = r2 + 1
            goto L7
        L11:
            r4.ignoreCallbacks = r0
            return
    }

    private void maybeInitializeAnimators() {
            r5 = this;
            android.animation.ValueAnimator r0 = r5.showAnimator
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 2
            if (r0 != 0) goto L23
            android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> r0 = com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.GROW_FRACTION
            float[] r4 = new float[r3]
            r4 = {x0044: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r4)
            r5.showAnimator = r0
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.showAnimator
            android.animation.TimeInterpolator r4 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r4)
            android.animation.ValueAnimator r0 = r5.showAnimator
            r5.setShowAnimator(r0)
        L23:
            android.animation.ValueAnimator r0 = r5.hideAnimator
            if (r0 != 0) goto L43
            android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> r0 = com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.GROW_FRACTION
            float[] r3 = new float[r3]
            r3 = {x004c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r3)
            r5.hideAnimator = r0
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.hideAnimator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r5.hideAnimator
            r5.setHideAnimator(r0)
        L43:
            return
    }

    private void setHideAnimator(android.animation.ValueAnimator r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.hideAnimator
            if (r0 == 0) goto L13
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set hideAnimator while the current hideAnimator is running."
            r2.<init>(r0)
            throw r2
        L13:
            r1.hideAnimator = r2
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2 r0 = new com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2
            r0.<init>(r1)
            r2.addListener(r0)
            return
    }

    private void setShowAnimator(android.animation.ValueAnimator r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.showAnimator
            if (r0 == 0) goto L13
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set showAnimator while the current showAnimator is running."
            r2.<init>(r0)
            throw r2
        L13:
            r1.showAnimator = r2
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1 r0 = new com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1
            r0.<init>(r1)
            r2.addListener(r0)
            return
    }

    public void clearAnimationCallbacks() {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.clear()
            r0 = 0
            r1.animationCallbacks = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.totalAlpha
            return r0
    }

    float getGrowFraction() {
            r1 = this;
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.baseSpec
            boolean r0 = r0.isShowAnimationEnabled()
            if (r0 != 0) goto L13
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.baseSpec
            boolean r0 = r0.isHideAnimationEnabled()
            if (r0 != 0) goto L13
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L13:
            boolean r0 = r1.mockHideAnimationRunning
            if (r0 != 0) goto L1f
            boolean r0 = r1.mockShowAnimationRunning
            if (r0 == 0) goto L1c
            goto L1f
        L1c:
            float r0 = r1.growFraction
            return r0
        L1f:
            float r0 = r1.mockGrowFraction
            return r0
    }

    android.animation.ValueAnimator getHideAnimator() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.hideAnimator
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public boolean hideNow() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.setVisible(r0, r0, r0)
            return r0
    }

    public boolean isHiding() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.hideAnimator
            if (r0 == 0) goto La
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Le
        La:
            boolean r0 = r1.mockHideAnimationRunning
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto Lf
            boolean r0 = r1.isHiding()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public boolean isShowing() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.showAnimator
            if (r0 == 0) goto La
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Le
        La:
            boolean r0 = r1.mockShowAnimationRunning
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.animationCallbacks = r0
        Lb:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L18
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.add(r2)
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            r0.totalAlpha = r1
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.paint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    void setGrowFraction(float r2) {
            r1 = this;
            float r0 = r1.growFraction
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.growFraction = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    void setInternalAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            r0.internalAnimationCallback = r1
            return
    }

    void setMockHideAnimationRunning(boolean r1, float r2) {
            r0 = this;
            r0.mockHideAnimationRunning = r1
            r0.mockGrowFraction = r2
            return
    }

    void setMockShowAnimationRunning(boolean r1, float r2) {
            r0 = this;
            r0.mockShowAnimationRunning = r1
            r0.mockGrowFraction = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.setVisible(r2, r3, r0)
            return r2
    }

    public boolean setVisible(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r0 = r2.animatorDurationScaleProvider
            android.content.Context r1 = r2.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            float r0 = r0.getSystemAnimatorDurationScale(r1)
            if (r5 == 0) goto L15
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            boolean r3 = r2.setVisibleInternal(r3, r4, r5)
            return r3
    }

    boolean setVisibleInternal(boolean r4, boolean r5, boolean r6) {
            r3 = this;
            r3.maybeInitializeAnimators()
            boolean r0 = r3.isVisible()
            r1 = 0
            if (r0 != 0) goto Ld
            if (r4 != 0) goto Ld
            return r1
        Ld:
            if (r4 == 0) goto L12
            android.animation.ValueAnimator r0 = r3.showAnimator
            goto L14
        L12:
            android.animation.ValueAnimator r0 = r3.hideAnimator
        L14:
            r2 = 1
            if (r6 != 0) goto L2d
            boolean r5 = r0.isRunning()
            if (r5 == 0) goto L21
            r0.end()
            goto L28
        L21:
            android.animation.ValueAnimator[] r5 = new android.animation.ValueAnimator[r2]
            r5[r1] = r0
            r3.endAnimatorWithoutCallbacks(r5)
        L28:
            boolean r4 = super.setVisible(r4, r1)
            return r4
        L2d:
            if (r6 == 0) goto L36
            boolean r6 = r0.isRunning()
            if (r6 == 0) goto L36
            return r1
        L36:
            if (r4 == 0) goto L41
            boolean r6 = super.setVisible(r4, r1)
            if (r6 == 0) goto L3f
            goto L41
        L3f:
            r6 = r1
            goto L42
        L41:
            r6 = r2
        L42:
            if (r4 == 0) goto L4b
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r4 = r3.baseSpec
            boolean r4 = r4.isShowAnimationEnabled()
            goto L51
        L4b:
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r4 = r3.baseSpec
            boolean r4 = r4.isHideAnimationEnabled()
        L51:
            if (r4 != 0) goto L5b
            android.animation.ValueAnimator[] r4 = new android.animation.ValueAnimator[r2]
            r4[r1] = r0
            r3.endAnimatorWithoutCallbacks(r4)
            return r6
        L5b:
            if (r5 != 0) goto L68
            boolean r4 = r0.isPaused()
            if (r4 != 0) goto L64
            goto L68
        L64:
            r0.resume()
            goto L6b
        L68:
            r0.start()
        L6b:
            return r6
    }

    public void start() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.setVisibleInternal(r0, r0, r1)
            return
    }

    public void stop() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.setVisibleInternal(r0, r1, r0)
            return
    }

    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 == 0) goto L1c
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1c
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.remove(r2)
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r2 = r1.animationCallbacks
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            r2 = 0
            r1.animationCallbacks = r2
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }
}
