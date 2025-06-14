package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
public abstract class BaseProgressIndicator<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends android.widget.ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = 0;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    com.google.android.material.progressindicator.AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final java.lang.Runnable delayedHide;
    private final java.lang.Runnable delayedShow;
    private final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback hideAnimationCallback;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback switchIndeterminateModeCallback;
    private int visibilityAfterHide;





    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_ProgressIndicator
            com.google.android.material.progressindicator.BaseProgressIndicator.DEF_STYLE_RES = r0
            return
    }

    protected BaseProgressIndicator(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            int r0 = com.google.android.material.progressindicator.BaseProgressIndicator.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r0)
            r7.<init>(r8, r9, r10)
            r0 = -1
            r7.lastShowStartTime = r0
            r8 = 0
            r7.isIndeterminateModeChangeRequested = r8
            r0 = 4
            r7.visibilityAfterHide = r0
            com.google.android.material.progressindicator.BaseProgressIndicator$1 r0 = new com.google.android.material.progressindicator.BaseProgressIndicator$1
            r0.<init>(r7)
            r7.delayedShow = r0
            com.google.android.material.progressindicator.BaseProgressIndicator$2 r0 = new com.google.android.material.progressindicator.BaseProgressIndicator$2
            r0.<init>(r7)
            r7.delayedHide = r0
            com.google.android.material.progressindicator.BaseProgressIndicator$3 r0 = new com.google.android.material.progressindicator.BaseProgressIndicator$3
            r0.<init>(r7)
            r7.switchIndeterminateModeCallback = r0
            com.google.android.material.progressindicator.BaseProgressIndicator$4 r0 = new com.google.android.material.progressindicator.BaseProgressIndicator$4
            r0.<init>(r7)
            r7.hideAnimationCallback = r0
            android.content.Context r1 = r7.getContext()
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.createSpec(r1, r9)
            r7.spec = r0
            int[] r3 = com.google.android.material.C0479R.styleable.BaseProgressIndicator
            int[] r6 = new int[r8]
            r2 = r9
            r4 = r10
            r5 = r11
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r9 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_showDelay
            r10 = -1
            int r9 = r8.getInt(r9, r10)
            r7.showDelay = r9
            int r9 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_minHideDelay
            int r9 = r8.getInt(r9, r10)
            r10 = 1000(0x3e8, float:1.401E-42)
            int r9 = java.lang.Math.min(r9, r10)
            r7.minHideDelay = r9
            r8.recycle()
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r8 = new com.google.android.material.progressindicator.AnimatorDurationScaleProvider
            r8.<init>()
            r7.animatorDurationScaleProvider = r8
            r8 = 1
            r7.isParentDoneInitializing = r8
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.progressindicator.BaseProgressIndicator r0) {
            r0.internalShow()
            return
    }

    static /* synthetic */ void access$100(com.google.android.material.progressindicator.BaseProgressIndicator r0) {
            r0.internalHide()
            return
    }

    static /* synthetic */ long access$202(com.google.android.material.progressindicator.BaseProgressIndicator r0, long r1) {
            r0.lastShowStartTime = r1
            return r1
    }

    static /* synthetic */ int access$300(com.google.android.material.progressindicator.BaseProgressIndicator r0) {
            int r0 = r0.storedProgress
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.android.material.progressindicator.BaseProgressIndicator r0) {
            boolean r0 = r0.storedProgressAnimated
            return r0
    }

    static /* synthetic */ boolean access$500(com.google.android.material.progressindicator.BaseProgressIndicator r0) {
            boolean r0 = r0.isIndeterminateModeChangeRequested
            return r0
    }

    static /* synthetic */ int access$600(com.google.android.material.progressindicator.BaseProgressIndicator r0) {
            int r0 = r0.visibilityAfterHide
            return r0
    }

    private com.google.android.material.progressindicator.DrawingDelegate<S> getCurrentDrawingDelegate() {
            r2 = this;
            boolean r0 = r2.isIndeterminate()
            r1 = 0
            if (r0 == 0) goto L17
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            if (r0 != 0) goto Le
            goto L16
        Le:
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            com.google.android.material.progressindicator.DrawingDelegate r1 = r0.getDrawingDelegate()
        L16:
            return r1
        L17:
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            if (r0 != 0) goto L1e
            goto L26
        L1e:
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            com.google.android.material.progressindicator.DrawingDelegate r1 = r0.getDrawingDelegate()
        L26:
            return r1
    }

    private void internalHide() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getCurrentDrawable()
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) r0
            r1 = 0
            r2 = 1
            r0.setVisible(r1, r1, r2)
            boolean r0 = r3.isNoLongerNeedToBeVisible()
            if (r0 == 0) goto L15
            r0 = 4
            r3.setVisibility(r0)
        L15:
            return
    }

    private void internalShow() {
            r2 = this;
            int r0 = r2.minHideDelay
            if (r0 <= 0) goto La
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.lastShowStartTime = r0
        La:
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    private boolean isNoLongerNeedToBeVisible() {
            r1 = this;
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
            if (r0 == 0) goto L10
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L21
        L10:
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.getIndeterminateDrawable()
            if (r0 == 0) goto L23
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.getIndeterminateDrawable()
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            return r0
    }

    private void registerAnimationCallbacks() {
            r2 = this;
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            if (r0 == 0) goto L19
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            if (r0 == 0) goto L19
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate r0 = r0.getAnimatorDelegate()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r2.switchIndeterminateModeCallback
            r0.registerAnimatorsCompleteCallback(r1)
        L19:
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            if (r0 == 0) goto L28
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r2.hideAnimationCallback
            r0.registerAnimationCallback(r1)
        L28:
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            if (r0 == 0) goto L37
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r2.hideAnimationCallback
            r0.registerAnimationCallback(r1)
        L37:
            return
    }

    private void unregisterAnimationCallbacks() {
            r2 = this;
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            if (r0 == 0) goto L1a
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r2.hideAnimationCallback
            r0.unregisterAnimationCallback(r1)
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r2.getIndeterminateDrawable()
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate r0 = r0.getAnimatorDelegate()
            r0.unregisterAnimatorsCompleteCallback()
        L1a:
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            if (r0 == 0) goto L29
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r2.getProgressDrawable()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r2.hideAnimationCallback
            r0.unregisterAnimationCallback(r1)
        L29:
            return
    }

    protected void applyNewVisibility(boolean r4) {
            r3 = this;
            boolean r0 = r3.isParentDoneInitializing
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.drawable.Drawable r0 = r3.getCurrentDrawable()
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) r0
            boolean r1 = r3.visibleToUser()
            r2 = 0
            r0.setVisible(r1, r2, r4)
            return
    }

    abstract S createSpec(android.content.Context r1, android.util.AttributeSet r2);

    @Override // android.widget.ProgressBar
    public android.graphics.drawable.Drawable getCurrentDrawable() {
            r1 = this;
            boolean r0 = r1.isIndeterminate()
            if (r0 == 0) goto Lb
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.getIndeterminateDrawable()
            goto Lf
        Lb:
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
        Lf:
            return r0
    }

    public int getHideAnimationBehavior() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.hideAnimationBehavior
            return r0
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getIndeterminateDrawable() {
            r1 = this;
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.getIndeterminateDrawable()
            return r0
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.IndeterminateDrawable<S> getIndeterminateDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getIndeterminateDrawable()
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = (com.google.android.material.progressindicator.IndeterminateDrawable) r0
            return r0
    }

    public int[] getIndicatorColor() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int[] r0 = r0.indicatorColors
            return r0
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getProgressDrawable() {
            r1 = this;
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
            return r0
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.DeterminateDrawable<S> getProgressDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getProgressDrawable()
            com.google.android.material.progressindicator.DeterminateDrawable r0 = (com.google.android.material.progressindicator.DeterminateDrawable) r0
            return r0
    }

    public int getShowAnimationBehavior() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.showAnimationBehavior
            return r0
    }

    public int getTrackColor() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.trackColor
            return r0
    }

    public int getTrackCornerRadius() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.trackCornerRadius
            return r0
    }

    public int getTrackThickness() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.trackThickness
            return r0
    }

    public void hide() {
            r6 = this;
            int r0 = r6.getVisibility()
            if (r0 == 0) goto Lc
            java.lang.Runnable r0 = r6.delayedShow
            r6.removeCallbacks(r0)
            return
        Lc:
            java.lang.Runnable r0 = r6.delayedHide
            r6.removeCallbacks(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.lastShowStartTime
            long r0 = r0 - r2
            int r2 = r6.minHideDelay
            long r3 = (long) r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L2a
            java.lang.Runnable r0 = r6.delayedHide
            r0.run()
            return
        L2a:
            java.lang.Runnable r3 = r6.delayedHide
            long r4 = (long) r2
            long r4 = r4 - r0
            r6.postDelayed(r3, r4)
            return
    }

    @Override // android.view.View
    public void invalidate() {
            r1 = this;
            super.invalidate()
            android.graphics.drawable.Drawable r0 = r1.getCurrentDrawable()
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.getCurrentDrawable()
            r0.invalidateSelf()
        L10:
            return
    }

    boolean isEffectivelyVisible() {
            r3 = this;
            r0 = r3
        L1:
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            android.view.ViewParent r0 = r0.getParent()
            r1 = 1
            if (r0 != 0) goto L18
            int r0 = r3.getWindowVisibility()
            if (r0 != 0) goto L17
            r2 = r1
        L17:
            return r2
        L18:
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto L1d
            return r1
        L1d:
            android.view.View r0 = (android.view.View) r0
            goto L1
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r1.registerAnimationCallbacks()
            boolean r0 = r1.visibleToUser()
            if (r0 == 0) goto Lf
            r1.internalShow()
        Lf:
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.delayedHide
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.delayedShow
            r1.removeCallbacks(r0)
            android.graphics.drawable.Drawable r0 = r1.getCurrentDrawable()
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) r0
            r0.hideNow()
            r1.unregisterAnimationCallbacks()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = r6.save()     // Catch: java.lang.Throwable -> L56
            int r1 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L11
            int r1 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L1e
        L11:
            int r1 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L56
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L56
            int r2 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> L56
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L56
            r6.translate(r1, r2)     // Catch: java.lang.Throwable -> L56
        L1e:
            int r1 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L2a
            int r1 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L4a
        L2a:
            int r1 = r5.getWidth()     // Catch: java.lang.Throwable -> L56
            int r2 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L56
            int r3 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> L56
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getHeight()     // Catch: java.lang.Throwable -> L56
            int r3 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> L56
            int r4 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + r4
            int r2 = r2 - r3
            r3 = 0
            r6.clipRect(r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L56
        L4a:
            android.graphics.drawable.Drawable r1 = r5.getCurrentDrawable()     // Catch: java.lang.Throwable -> L56
            r1.draw(r6)     // Catch: java.lang.Throwable -> L56
            r6.restoreToCount(r0)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            return
        L56:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L3b
            com.google.android.material.progressindicator.DrawingDelegate r2 = r1.getCurrentDrawingDelegate()     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto Lc
            monitor-exit(r1)
            return
        Lc:
            int r3 = r2.getPreferredWidth()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.getPreferredHeight()     // Catch: java.lang.Throwable -> L3b
            if (r3 >= 0) goto L1b
            int r3 = r1.getMeasuredWidth()     // Catch: java.lang.Throwable -> L3b
            goto L25
        L1b:
            int r0 = r1.getPaddingLeft()     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 + r0
            int r0 = r1.getPaddingRight()     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 + r0
        L25:
            if (r2 >= 0) goto L2c
            int r2 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L3b
            goto L36
        L2c:
            int r0 = r1.getPaddingTop()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r0
            int r0 = r1.getPaddingBottom()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r0
        L36:
            r1.setMeasuredDimension(r3, r2)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r1)
            return
        L3b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            if (r2 != 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            r0.applyNewVisibility(r1)
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            r1 = 0
            r0.applyNewVisibility(r1)
            return
    }

    public void setAnimatorDurationScaleProvider(com.google.android.material.progressindicator.AnimatorDurationScaleProvider r2) {
            r1 = this;
            r1.animatorDurationScaleProvider = r2
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
            if (r0 == 0) goto Le
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
            r0.animatorDurationScaleProvider = r2
        Le:
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.getIndeterminateDrawable()
            if (r0 == 0) goto L1a
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.getIndeterminateDrawable()
            r0.animatorDurationScaleProvider = r2
        L1a:
            return
    }

    public void setHideAnimationBehavior(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.hideAnimationBehavior = r2
            r1.invalidate()
            return
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isIndeterminate()     // Catch: java.lang.Throwable -> L3c
            if (r3 != r0) goto L9
            monitor-exit(r2)
            return
        L9:
            boolean r0 = r2.visibleToUser()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L1a
            if (r3 != 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "Cannot switch to indeterminate mode while the progress indicator is visible."
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            throw r3     // Catch: java.lang.Throwable -> L3c
        L1a:
            android.graphics.drawable.Drawable r0 = r2.getCurrentDrawable()     // Catch: java.lang.Throwable -> L3c
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L25
            r0.hideNow()     // Catch: java.lang.Throwable -> L3c
        L25:
            super.setIndeterminate(r3)     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r3 = r2.getCurrentDrawable()     // Catch: java.lang.Throwable -> L3c
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r3 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) r3     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            if (r3 == 0) goto L38
            boolean r1 = r2.visibleToUser()     // Catch: java.lang.Throwable -> L3c
            r3.setVisible(r1, r0, r0)     // Catch: java.lang.Throwable -> L3c
        L38:
            r2.isIndeterminateModeChangeRequested = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            return
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setIndeterminateDrawable(r2)
            return
        L7:
            boolean r0 = r2 instanceof com.google.android.material.progressindicator.IndeterminateDrawable
            if (r0 == 0) goto L15
            r0 = r2
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) r0
            r0.hideNow()
            super.setIndeterminateDrawable(r2)
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set framework drawable as indeterminate drawable."
            r2.<init>(r0)
            throw r2
    }

    public void setIndicatorColor(int... r4) {
            r3 = this;
            int r0 = r4.length
            if (r0 != 0) goto L14
            r4 = 1
            int[] r4 = new int[r4]
            android.content.Context r0 = r3.getContext()
            int r1 = com.google.android.material.C0479R.attr.colorPrimary
            r2 = -1
            int r0 = com.google.android.material.color.MaterialColors.getColor(r0, r1, r2)
            r1 = 0
            r4[r1] = r0
        L14:
            int[] r0 = r3.getIndicatorColor()
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 != 0) goto L30
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r3.spec
            r0.indicatorColors = r4
            com.google.android.material.progressindicator.IndeterminateDrawable r4 = r3.getIndeterminateDrawable()
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate r4 = r4.getAnimatorDelegate()
            r4.invalidateSpecValues()
            r3.invalidate()
        L30:
            return
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isIndeterminate()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 0
            r1.setProgressCompat(r2, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public void setProgressCompat(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isIndeterminate()
            if (r0 == 0) goto L47
            com.google.android.material.progressindicator.DeterminateDrawable r0 = r1.getProgressDrawable()
            if (r0 == 0) goto L59
            r1.storedProgress = r2
            r1.storedProgressAnimated = r3
            r2 = 1
            r1.isIndeterminateModeChangeRequested = r2
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.getIndeterminateDrawable()
            boolean r2 = r2.isVisible()
            if (r2 == 0) goto L3d
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r2 = r1.animatorDurationScaleProvider
            android.content.Context r3 = r1.getContext()
            android.content.ContentResolver r3 = r3.getContentResolver()
            float r2 = r2.getSystemAnimatorDurationScale(r3)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L31
            goto L3d
        L31:
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.getIndeterminateDrawable()
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate r2 = r2.getAnimatorDelegate()
            r2.requestCancelAnimatorAfterCurrentCycle()
            goto L59
        L3d:
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r2 = r1.switchIndeterminateModeCallback
            com.google.android.material.progressindicator.IndeterminateDrawable r3 = r1.getIndeterminateDrawable()
            r2.onAnimationEnd(r3)
            goto L59
        L47:
            super.setProgress(r2)
            com.google.android.material.progressindicator.DeterminateDrawable r2 = r1.getProgressDrawable()
            if (r2 == 0) goto L59
            if (r3 != 0) goto L59
            com.google.android.material.progressindicator.DeterminateDrawable r2 = r1.getProgressDrawable()
            r2.jumpToCurrentState()
        L59:
            return
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r3 = 0
            super.setProgressDrawable(r3)
            return
        L7:
            boolean r0 = r3 instanceof com.google.android.material.progressindicator.DeterminateDrawable
            if (r0 == 0) goto L22
            com.google.android.material.progressindicator.DeterminateDrawable r3 = (com.google.android.material.progressindicator.DeterminateDrawable) r3
            r3.hideNow()
            super.setProgressDrawable(r3)
            int r0 = r2.getProgress()
            float r0 = (float) r0
            int r1 = r2.getMax()
            float r1 = (float) r1
            float r0 = r0 / r1
            r3.setLevelByFraction(r0)
            return
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set framework drawable as progress drawable."
            r3.<init>(r0)
            throw r3
    }

    public void setShowAnimationBehavior(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.showAnimationBehavior = r2
            r1.invalidate()
            return
    }

    public void setTrackColor(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.trackColor
            if (r0 == r2) goto Ld
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.trackColor = r2
            r1.invalidate()
        Ld:
            return
    }

    public void setTrackCornerRadius(int r3) {
            r2 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            int r0 = r0.trackCornerRadius
            if (r0 == r3) goto L12
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            int r1 = r0.trackThickness
            int r1 = r1 / 2
            int r3 = java.lang.Math.min(r3, r1)
            r0.trackCornerRadius = r3
        L12:
            return
    }

    public void setTrackThickness(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            int r0 = r0.trackThickness
            if (r0 == r2) goto Ld
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.trackThickness = r2
            r1.requestLayout()
        Ld:
            return
    }

    public void setVisibilityAfterHide(int r2) {
            r1 = this;
            if (r2 == 0) goto L12
            r0 = 4
            if (r2 == r0) goto L12
            r0 = 8
            if (r2 != r0) goto La
            goto L12
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View."
            r2.<init>(r0)
            throw r2
        L12:
            r1.visibilityAfterHide = r2
            return
    }

    public void show() {
            r3 = this;
            int r0 = r3.showDelay
            if (r0 <= 0) goto L12
            java.lang.Runnable r0 = r3.delayedShow
            r3.removeCallbacks(r0)
            java.lang.Runnable r0 = r3.delayedShow
            int r1 = r3.showDelay
            long r1 = (long) r1
            r3.postDelayed(r0, r1)
            goto L17
        L12:
            java.lang.Runnable r0 = r3.delayedShow
            r0.run()
        L17:
            return
    }

    boolean visibleToUser() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r1)
            if (r0 == 0) goto L14
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L14
            boolean r0 = r1.isEffectivelyVisible()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }
}
