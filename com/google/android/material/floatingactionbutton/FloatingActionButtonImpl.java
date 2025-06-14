package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    static final android.animation.TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = null;
    static final int[] EMPTY_STATE_SET = null;
    static final int[] ENABLED_STATE_SET = null;
    static final int[] FOCUSED_ENABLED_STATE_SET = null;
    private static final float HIDE_ICON_SCALE = 0.0f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.0f;
    static final int[] HOVERED_ENABLED_STATE_SET = null;
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = null;
    static final int[] PRESSED_ENABLED_STATE_SET = null;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private int animState;
    com.google.android.material.floatingactionbutton.BorderDrawable borderDrawable;
    android.graphics.drawable.Drawable contentBackground;
    private android.animation.Animator currentAnimator;
    private com.google.android.material.animation.MotionSpec defaultHideMotionSpec;
    private com.google.android.material.animation.MotionSpec defaultShowMotionSpec;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> hideListeners;
    private com.google.android.material.animation.MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private float imageMatrixScale;
    private int maxImageSize;
    int minTouchTargetSize;
    private android.view.ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;
    android.graphics.drawable.Drawable rippleDrawable;
    private float rotation;
    boolean shadowPaddingEnabled;
    final com.google.android.material.shadow.ShadowViewDelegate shadowViewDelegate;
    com.google.android.material.shape.ShapeAppearanceModel shapeAppearance;
    com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> showListeners;
    private com.google.android.material.animation.MotionSpec showMotionSpec;
    private final com.google.android.material.internal.StateListAnimator stateListAnimator;
    private final android.graphics.Matrix tmpMatrix;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF1;
    private final android.graphics.RectF tmpRectF2;
    private java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> transformationCallbacks;
    final com.google.android.material.floatingactionbutton.FloatingActionButton view;






    private class DisabledElevationAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButtonImpl this$0;

        DisabledElevationAnimation(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    private class ElevateToHoveredFocusedTranslationZAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButtonImpl this$0;

        ElevateToHoveredFocusedTranslationZAnimation(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r2.this$0
                float r0 = r0.elevation
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r2.this$0
                float r1 = r1.hoveredFocusedTranslationZ
                float r0 = r0 + r1
                return r0
        }
    }

    private class ElevateToPressedTranslationZAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButtonImpl this$0;

        ElevateToPressedTranslationZAnimation(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r2.this$0
                float r0 = r0.elevation
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r2.this$0
                float r1 = r1.pressedTranslationZ
                float r0 = r0 + r1
                return r0
        }
    }

    interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    private class ResetElevationAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButtonImpl this$0;

        ResetElevationAnimation(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
                r1 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.this$0
                float r0 = r0.elevation
                return r0
        }
    }

    private abstract class ShadowAnimatorImpl extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButtonImpl this$0;
        private boolean validValues;

        private ShadowAnimatorImpl(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ShadowAnimatorImpl(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1, com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.C05741 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        protected abstract float getTargetShadowSize();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2 = r1.this$0
                float r0 = r1.shadowSizeEnd
                int r0 = (int) r0
                float r0 = (float) r0
                r2.updateShapeElevation(r0)
                r2 = 0
                r1.validValues = r2
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                r3 = this;
                boolean r0 = r3.validValues
                if (r0 != 0) goto L1f
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r3.this$0
                com.google.android.material.shape.MaterialShapeDrawable r0 = r0.shapeDrawable
                if (r0 != 0) goto Lc
                r0 = 0
                goto L14
            Lc:
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r3.this$0
                com.google.android.material.shape.MaterialShapeDrawable r0 = r0.shapeDrawable
                float r0 = r0.getElevation()
            L14:
                r3.shadowSizeStart = r0
                float r0 = r3.getTargetShadowSize()
                r3.shadowSizeEnd = r0
                r0 = 1
                r3.validValues = r0
            L1f:
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r3.this$0
                float r1 = r3.shadowSizeStart
                float r2 = r3.shadowSizeEnd
                float r2 = r2 - r1
                float r4 = r4.getAnimatedFraction()
                float r2 = r2 * r4
                float r1 = r1 + r2
                int r4 = (int) r1
                float r4 = (float) r4
                r0.updateShapeElevation(r4)
                return
        }
    }

    static {
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR = r0
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x0032: FILL_ARRAY_DATA , data: [16842919, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET = r1
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x003a: FILL_ARRAY_DATA , data: [16843623, 16842908, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET = r1
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET = r1
            int[] r0 = new int[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r2 = 0
            r0[r2] = r1
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ENABLED_STATE_SET = r0
            int[] r0 = new int[r2]
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.EMPTY_STATE_SET = r0
            return
    }

    FloatingActionButtonImpl(com.google.android.material.floatingactionbutton.FloatingActionButton r3, com.google.android.material.shadow.ShadowViewDelegate r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.shadowPaddingEnabled = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.imageMatrixScale = r0
            r0 = 0
            r2.animState = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.tmpRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.tmpRectF1 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.tmpRectF2 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.tmpMatrix = r0
            r2.view = r3
            r2.shadowViewDelegate = r4
            com.google.android.material.internal.StateListAnimator r4 = new com.google.android.material.internal.StateListAnimator
            r4.<init>()
            r2.stateListAnimator = r4
            int[] r0 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.createElevationAnimator(r1)
            r4.addState(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.createElevationAnimator(r1)
            r4.addState(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.createElevationAnimator(r1)
            r4.addState(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.createElevationAnimator(r1)
            r4.addState(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ENABLED_STATE_SET
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ResetElevationAnimation r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ResetElevationAnimation
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.createElevationAnimator(r1)
            r4.addState(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.EMPTY_STATE_SET
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$DisabledElevationAnimation r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$DisabledElevationAnimation
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.createElevationAnimator(r1)
            r4.addState(r0, r1)
            float r3 = r3.getRotation()
            r2.rotation = r3
            return
    }

    static /* synthetic */ int access$002(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0, int r1) {
            r0.animState = r1
            return r1
    }

    static /* synthetic */ android.animation.Animator access$102(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0, android.animation.Animator r1) {
            r0.currentAnimator = r1
            return r1
    }

    static /* synthetic */ float access$202(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0, float r1) {
            r0.imageMatrixScale = r1
            return r1
    }

    private void calculateImageMatrixFromScale(float r6, android.graphics.Matrix r7) {
            r5 = this;
            r7.reset()
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r5.view
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L38
            int r1 = r5.maxImageSize
            if (r1 == 0) goto L38
            android.graphics.RectF r1 = r5.tmpRectF1
            android.graphics.RectF r2 = r5.tmpRectF2
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            r4 = 0
            r1.set(r4, r4, r3, r0)
            int r0 = r5.maxImageSize
            float r3 = (float) r0
            float r0 = (float) r0
            r2.set(r4, r4, r3, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
            r7.setRectToRect(r1, r2, r0)
            int r0 = r5.maxImageSize
            float r1 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            r7.postScale(r6, r6, r1, r0)
        L38:
            return
    }

    private android.animation.AnimatorSet createAnimator(com.google.android.material.animation.MotionSpec r7, float r8, float r9, float r10) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r6.view
            android.util.Property r2 = android.view.View.ALPHA
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            java.lang.String r1 = "opacity"
            com.google.android.material.animation.MotionTiming r1 = r7.getTiming(r1)
            r1.apply(r8)
            r0.add(r8)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r6.view
            android.util.Property r1 = android.view.View.SCALE_X
            float[] r2 = new float[r3]
            r2[r5] = r9
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r1, r2)
            java.lang.String r1 = "scale"
            com.google.android.material.animation.MotionTiming r2 = r7.getTiming(r1)
            r2.apply(r8)
            r6.workAroundOreoBug(r8)
            r0.add(r8)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r6.view
            android.util.Property r2 = android.view.View.SCALE_Y
            float[] r4 = new float[r3]
            r4[r5] = r9
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r2, r4)
            com.google.android.material.animation.MotionTiming r9 = r7.getTiming(r1)
            r9.apply(r8)
            r6.workAroundOreoBug(r8)
            r0.add(r8)
            android.graphics.Matrix r8 = r6.tmpMatrix
            r6.calculateImageMatrixFromScale(r10, r8)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r6.view
            com.google.android.material.animation.ImageMatrixProperty r9 = new com.google.android.material.animation.ImageMatrixProperty
            r9.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$3 r10 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$3
            r10.<init>(r6)
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r3]
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r6.tmpMatrix
            r2.<init>(r3)
            r1[r5] = r2
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r8, r9, r10, r1)
            java.lang.String r9 = "iconScale"
            com.google.android.material.animation.MotionTiming r7 = r7.getTiming(r9)
            r7.apply(r8)
            r0.add(r8)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r7, r0)
            return r7
    }

    private android.animation.ValueAnimator createElevationAnimator(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl r4) {
            r3 = this;
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r1 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR
            r0.setInterpolator(r1)
            r1 = 100
            r0.setDuration(r1)
            r0.addListener(r4)
            r0.addUpdateListener(r4)
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x0020: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0.setFloatValues(r4)
            return r0
    }

    private com.google.android.material.animation.MotionSpec getDefaultHideMotionSpec() {
            r2 = this;
            com.google.android.material.animation.MotionSpec r0 = r2.defaultHideMotionSpec
            if (r0 != 0) goto L12
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.animator.design_fab_hide_motion_spec
            com.google.android.material.animation.MotionSpec r0 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r1)
            r2.defaultHideMotionSpec = r0
        L12:
            com.google.android.material.animation.MotionSpec r0 = r2.defaultHideMotionSpec
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.animation.MotionSpec r0 = (com.google.android.material.animation.MotionSpec) r0
            return r0
    }

    private com.google.android.material.animation.MotionSpec getDefaultShowMotionSpec() {
            r2 = this;
            com.google.android.material.animation.MotionSpec r0 = r2.defaultShowMotionSpec
            if (r0 != 0) goto L12
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.animator.design_fab_show_motion_spec
            com.google.android.material.animation.MotionSpec r0 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r1)
            r2.defaultShowMotionSpec = r0
        L12:
            com.google.android.material.animation.MotionSpec r0 = r2.defaultShowMotionSpec
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.animation.MotionSpec r0 = (com.google.android.material.animation.MotionSpec) r0
            return r0
    }

    private android.view.ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
            r1 = this;
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r1.preDrawListener
            if (r0 != 0) goto Lb
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5 r0 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5
            r0.<init>(r1)
            r1.preDrawListener = r0
        Lb:
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r1.preDrawListener
            return r0
    }

    private boolean shouldAnimateVisibilityChange() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.view
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r0 == 0) goto L12
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.view
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private void workAroundOreoBug(android.animation.ObjectAnimator r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto L7
            return
        L7:
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$4 r0 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$4
            r0.<init>(r2)
            r3.setEvaluator(r0)
            return
    }

    public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.hideListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.hideListeners = r0
        Lb:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.hideListeners
            r0.add(r2)
            return
    }

    void addOnShowAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.showListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.showListeners = r0
        Lb:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.showListeners
            r0.add(r2)
            return
    }

    void addTransformationCallback(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback> r0 = r1.transformationCallbacks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.transformationCallbacks = r0
        Lb:
            java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback> r0 = r1.transformationCallbacks
            r0.add(r2)
            return
    }

    com.google.android.material.shape.MaterialShapeDrawable createShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearance
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = (com.google.android.material.shape.ShapeAppearanceModel) r0
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>(r0)
            return r1
    }

    final android.graphics.drawable.Drawable getContentBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.contentBackground
            return r0
    }

    float getElevation() {
            r1 = this;
            float r0 = r1.elevation
            return r0
    }

    boolean getEnsureMinTouchTargetSize() {
            r1 = this;
            boolean r0 = r1.ensureMinTouchTargetSize
            return r0
    }

    final com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.animation.MotionSpec r0 = r1.hideMotionSpec
            return r0
    }

    float getHoveredFocusedTranslationZ() {
            r1 = this;
            float r0 = r1.hoveredFocusedTranslationZ
            return r0
    }

    void getPadding(android.graphics.Rect r6) {
            r5 = this;
            boolean r0 = r5.ensureMinTouchTargetSize
            if (r0 == 0) goto L10
            int r0 = r5.minTouchTargetSize
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r5.view
            int r1 = r1.getSizeDimension()
            int r0 = r0 - r1
            int r0 = r0 / 2
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r1 = r5.shadowPaddingEnabled
            if (r1 == 0) goto L1d
            float r1 = r5.getElevation()
            float r2 = r5.pressedTranslationZ
            float r1 = r1 + r2
            goto L1e
        L1d:
            r1 = 0
        L1e:
            double r2 = (double) r1
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r0, r2)
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r3
            double r3 = (double) r1
            double r3 = java.lang.Math.ceil(r3)
            int r1 = (int) r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.set(r2, r0, r2, r0)
            return
    }

    float getPressedTranslationZ() {
            r1 = this;
            float r0 = r1.pressedTranslationZ
            return r0
    }

    final com.google.android.material.shape.ShapeAppearanceModel getShapeAppearance() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearance
            return r0
    }

    final com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.animation.MotionSpec r0 = r1.showMotionSpec
            return r0
    }

    void hide(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.isOrWillBeHidden()
            if (r0 == 0) goto L7
            return
        L7:
            android.animation.Animator r0 = r2.currentAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            boolean r0 = r2.shouldAnimateVisibilityChange()
            if (r0 == 0) goto L46
            com.google.android.material.animation.MotionSpec r0 = r2.hideMotionSpec
            if (r0 == 0) goto L19
            goto L1d
        L19:
            com.google.android.material.animation.MotionSpec r0 = r2.getDefaultHideMotionSpec()
        L1d:
            r1 = 0
            android.animation.AnimatorSet r0 = r2.createAnimator(r0, r1, r1, r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1 r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1
            r1.<init>(r2, r4, r3)
            r0.addListener(r1)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r3 = r2.hideListeners
            if (r3 == 0) goto L42
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()
            android.animation.Animator$AnimatorListener r4 = (android.animation.Animator.AnimatorListener) r4
            r0.addListener(r4)
            goto L32
        L42:
            r0.start()
            goto L56
        L46:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            if (r4 == 0) goto L4d
            r1 = 8
            goto L4e
        L4d:
            r1 = 4
        L4e:
            r0.internalSetVisibility(r1, r4)
            if (r3 == 0) goto L56
            r3.onHidden()
        L56:
            return
    }

    void initializeBackgroundDrawable(android.content.res.ColorStateList r1, android.graphics.PorterDuff.Mode r2, android.content.res.ColorStateList r3, int r4) {
            r0 = this;
            com.google.android.material.shape.MaterialShapeDrawable r4 = r0.createShapeDrawable()
            r0.shapeDrawable = r4
            r4.setTintList(r1)
            if (r2 == 0) goto L10
            com.google.android.material.shape.MaterialShapeDrawable r1 = r0.shapeDrawable
            r1.setTintMode(r2)
        L10:
            com.google.android.material.shape.MaterialShapeDrawable r1 = r0.shapeDrawable
            r2 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setShadowColor(r2)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r0.shapeDrawable
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r0.view
            android.content.Context r2 = r2.getContext()
            r1.initializeElevationOverlay(r2)
            com.google.android.material.ripple.RippleDrawableCompat r1 = new com.google.android.material.ripple.RippleDrawableCompat
            com.google.android.material.shape.MaterialShapeDrawable r2 = r0.shapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.getShapeAppearanceModel()
            r1.<init>(r2)
            android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r3)
            r1.setTintList(r2)
            r0.rippleDrawable = r1
            r2 = 2
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            com.google.android.material.shape.MaterialShapeDrawable r3 = r0.shapeDrawable
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r2)
            r0.contentBackground = r1
            return
    }

    boolean isOrWillBeHidden() {
            r4 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r4.view
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            int r0 = r4.animState
            if (r0 != r2) goto Lf
            r1 = r2
        Lf:
            return r1
        L10:
            int r0 = r4.animState
            r3 = 2
            if (r0 == r3) goto L16
            r1 = r2
        L16:
            return r1
    }

    boolean isOrWillBeShown() {
            r4 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r4.view
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            int r0 = r4.animState
            r3 = 2
            if (r0 != r3) goto L10
            r1 = r2
        L10:
            return r1
        L11:
            int r0 = r4.animState
            if (r0 == r2) goto L16
            r1 = r2
        L16:
            return r1
    }

    void jumpDrawableToCurrentState() {
            r1 = this;
            com.google.android.material.internal.StateListAnimator r0 = r1.stateListAnimator
            r0.jumpToCurrentState()
            return
    }

    void onAttachedToWindow() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.shapeDrawable
            if (r0 == 0) goto L9
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.view
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
        L9:
            boolean r0 = r2.requirePreDrawListener()
            if (r0 == 0) goto L1c
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.getOrCreatePreDrawListener()
            r0.addOnPreDrawListener(r1)
        L1c:
            return
    }

    void onCompatShadowChanged() {
            r0 = this;
            return
    }

    void onDetachedFromWindow() {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.preDrawListener
            if (r1 == 0) goto L10
            r0.removeOnPreDrawListener(r1)
            r0 = 0
            r2.preDrawListener = r0
        L10:
            return
    }

    void onDrawableStateChanged(int[] r2) {
            r1 = this;
            com.google.android.material.internal.StateListAnimator r0 = r1.stateListAnimator
            r0.setState(r2)
            return
    }

    void onElevationsChanged(float r1, float r2, float r3) {
            r0 = this;
            r0.updatePadding()
            r0.updateShapeElevation(r1)
            return
    }

    void onPaddingUpdated(android.graphics.Rect r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.contentBackground
            java.lang.String r1 = "Didn't initialize content background"
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            boolean r0 = r7.shouldAddPadding()
            if (r0 == 0) goto L23
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.contentBackground
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.material.shadow.ShadowViewDelegate r8 = r7.shadowViewDelegate
            r8.setBackgroundDrawable(r0)
            goto L2a
        L23:
            com.google.android.material.shadow.ShadowViewDelegate r8 = r7.shadowViewDelegate
            android.graphics.drawable.Drawable r0 = r7.contentBackground
            r8.setBackgroundDrawable(r0)
        L2a:
            return
    }

    void onPreDraw() {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            float r0 = r0.getRotation()
            float r1 = r2.rotation
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L11
            r2.rotation = r0
            r2.updateFromViewRotation()
        L11:
            return
    }

    void onScaleChanged() {
            r2 = this;
            java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback> r0 = r2.transformationCallbacks
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback r1 = (com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback) r1
            r1.onScaleChanged()
            goto L8
        L18:
            return
    }

    void onTranslationChanged() {
            r2 = this;
            java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback> r0 = r2.transformationCallbacks
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback r1 = (com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback) r1
            r1.onTranslationChanged()
            goto L8
        L18:
            return
    }

    public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.hideListeners
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.showListeners
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    void removeTransformationCallback(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback> r0 = r1.transformationCallbacks
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    boolean requirePreDrawListener() {
            r1 = this;
            r0 = 1
            return r0
    }

    void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            if (r0 == 0) goto L7
            r0.setTintList(r2)
        L7:
            com.google.android.material.floatingactionbutton.BorderDrawable r0 = r1.borderDrawable
            if (r0 == 0) goto Le
            r0.setBorderTint(r2)
        Le:
            return
    }

    void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            if (r0 == 0) goto L7
            r0.setTintMode(r2)
        L7:
            return
    }

    final void setElevation(float r3) {
            r2 = this;
            float r0 = r2.elevation
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lf
            r2.elevation = r3
            float r0 = r2.hoveredFocusedTranslationZ
            float r1 = r2.pressedTranslationZ
            r2.onElevationsChanged(r3, r0, r1)
        Lf:
            return
    }

    void setEnsureMinTouchTargetSize(boolean r1) {
            r0 = this;
            r0.ensureMinTouchTargetSize = r1
            return
    }

    final void setHideMotionSpec(com.google.android.material.animation.MotionSpec r1) {
            r0 = this;
            r0.hideMotionSpec = r1
            return
    }

    final void setHoveredFocusedTranslationZ(float r3) {
            r2 = this;
            float r0 = r2.hoveredFocusedTranslationZ
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lf
            r2.hoveredFocusedTranslationZ = r3
            float r0 = r2.elevation
            float r1 = r2.pressedTranslationZ
            r2.onElevationsChanged(r0, r3, r1)
        Lf:
            return
    }

    final void setImageMatrixScale(float r2) {
            r1 = this;
            r1.imageMatrixScale = r2
            android.graphics.Matrix r0 = r1.tmpMatrix
            r1.calculateImageMatrixFromScale(r2, r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r1.view
            r2.setImageMatrix(r0)
            return
    }

    final void setMaxImageSize(int r2) {
            r1 = this;
            int r0 = r1.maxImageSize
            if (r0 == r2) goto L9
            r1.maxImageSize = r2
            r1.updateImageMatrixScale()
        L9:
            return
    }

    void setMinTouchTargetSize(int r1) {
            r0 = this;
            r0.minTouchTargetSize = r1
            return
    }

    final void setPressedTranslationZ(float r3) {
            r2 = this;
            float r0 = r2.pressedTranslationZ
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lf
            r2.pressedTranslationZ = r3
            float r0 = r2.elevation
            float r1 = r2.hoveredFocusedTranslationZ
            r2.onElevationsChanged(r0, r1, r3)
        Lf:
            return
    }

    void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.rippleDrawable
            if (r0 == 0) goto Lb
            android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        Lb:
            return
    }

    void setShadowPaddingEnabled(boolean r1) {
            r0 = this;
            r0.shadowPaddingEnabled = r1
            r0.updatePadding()
            return
    }

    final void setShapeAppearance(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            r2.shapeAppearance = r3
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.shapeDrawable
            if (r0 == 0) goto L9
            r0.setShapeAppearanceModel(r3)
        L9:
            android.graphics.drawable.Drawable r0 = r2.rippleDrawable
            boolean r1 = r0 instanceof com.google.android.material.shape.Shapeable
            if (r1 == 0) goto L14
            com.google.android.material.shape.Shapeable r0 = (com.google.android.material.shape.Shapeable) r0
            r0.setShapeAppearanceModel(r3)
        L14:
            com.google.android.material.floatingactionbutton.BorderDrawable r0 = r2.borderDrawable
            if (r0 == 0) goto L1b
            r0.setShapeAppearanceModel(r3)
        L1b:
            return
    }

    final void setShowMotionSpec(com.google.android.material.animation.MotionSpec r1) {
            r0 = this;
            r0.showMotionSpec = r1
            return
    }

    boolean shouldAddPadding() {
            r1 = this;
            r0 = 1
            return r0
    }

    final boolean shouldExpandBoundsForA11y() {
            r2 = this;
            boolean r0 = r2.ensureMinTouchTargetSize
            if (r0 == 0) goto L11
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            int r0 = r0.getSizeDimension()
            int r1 = r2.minTouchTargetSize
            if (r0 < r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    void show(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.isOrWillBeShown()
            if (r0 == 0) goto L7
            return
        L7:
            android.animation.Animator r0 = r3.currentAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            boolean r0 = r3.shouldAnimateVisibilityChange()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L62
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.view
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L31
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.view
            r2 = 0
            r0.setAlpha(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.view
            r0.setScaleY(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.view
            r0.setScaleX(r2)
            r3.setImageMatrixScale(r2)
        L31:
            com.google.android.material.animation.MotionSpec r0 = r3.showMotionSpec
            if (r0 == 0) goto L36
            goto L3a
        L36:
            com.google.android.material.animation.MotionSpec r0 = r3.getDefaultShowMotionSpec()
        L3a:
            android.animation.AnimatorSet r0 = r3.createAnimator(r0, r1, r1, r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2 r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2
            r1.<init>(r3, r5, r4)
            r0.addListener(r1)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r4 = r3.showListeners
            if (r4 == 0) goto L5e
            java.util.Iterator r4 = r4.iterator()
        L4e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r4.next()
            android.animation.Animator$AnimatorListener r5 = (android.animation.Animator.AnimatorListener) r5
            r0.addListener(r5)
            goto L4e
        L5e:
            r0.start()
            goto L7f
        L62:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.view
            r2 = 0
            r0.internalSetVisibility(r2, r5)
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = r3.view
            r5.setAlpha(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = r3.view
            r5.setScaleY(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = r3.view
            r5.setScaleX(r1)
            r3.setImageMatrixScale(r1)
            if (r4 == 0) goto L7f
            r4.onShown()
        L7f:
            return
    }

    void updateFromViewRotation() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.shapeDrawable
            if (r0 == 0) goto La
            float r1 = r2.rotation
            int r1 = (int) r1
            r0.setShadowCompatRotation(r1)
        La:
            return
    }

    final void updateImageMatrixScale() {
            r1 = this;
            float r0 = r1.imageMatrixScale
            r1.setImageMatrixScale(r0)
            return
    }

    final void updatePadding() {
            r5 = this;
            android.graphics.Rect r0 = r5.tmpRect
            r5.getPadding(r0)
            r5.onPaddingUpdated(r0)
            com.google.android.material.shadow.ShadowViewDelegate r1 = r5.shadowViewDelegate
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            r1.setShadowPadding(r2, r3, r4, r0)
            return
    }

    void updateShapeElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            if (r0 == 0) goto L7
            r0.setElevation(r2)
        L7:
            return
    }
}
