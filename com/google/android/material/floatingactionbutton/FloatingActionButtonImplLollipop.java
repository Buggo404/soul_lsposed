package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
class FloatingActionButtonImplLollipop extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl {

    static class AlwaysStatefulMaterialShapeDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
        AlwaysStatefulMaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    FloatingActionButtonImplLollipop(com.google.android.material.floatingactionbutton.FloatingActionButton r1, com.google.android.material.shadow.ShadowViewDelegate r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private android.animation.Animator createElevationAnimator(float r8, float r9) {
            r7 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r7.view
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r8, r3)
            r5 = 0
            android.animation.ObjectAnimator r8 = r8.setDuration(r5)
            android.animation.AnimatorSet$Builder r8 = r0.play(r8)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r7.view
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r2]
            r2[r4] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r3, r2)
            r1 = 100
            android.animation.ObjectAnimator r9 = r9.setDuration(r1)
            r8.with(r9)
            android.animation.TimeInterpolator r8 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.ELEVATION_ANIM_INTERPOLATOR
            r0.setInterpolator(r8)
            return r0
    }

    com.google.android.material.floatingactionbutton.BorderDrawable createBorderDrawable(int r7, android.content.res.ColorStateList r8) {
            r6 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r6.view
            android.content.Context r0 = r0.getContext()
            com.google.android.material.floatingactionbutton.BorderDrawable r1 = new com.google.android.material.floatingactionbutton.BorderDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r6.shapeAppearance
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = (com.google.android.material.shape.ShapeAppearanceModel) r2
            r1.<init>(r2)
            int r2 = com.google.android.material.C0479R.color.design_fab_stroke_top_outer_color
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            int r3 = com.google.android.material.C0479R.color.design_fab_stroke_top_inner_color
            int r3 = androidx.core.content.ContextCompat.getColor(r0, r3)
            int r4 = com.google.android.material.C0479R.color.design_fab_stroke_end_inner_color
            int r4 = androidx.core.content.ContextCompat.getColor(r0, r4)
            int r5 = com.google.android.material.C0479R.color.design_fab_stroke_end_outer_color
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r5)
            r1.setGradientColors(r2, r3, r4, r0)
            float r7 = (float) r7
            r1.setBorderWidth(r7)
            r1.setBorderTint(r8)
            return r1
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    com.google.android.material.shape.MaterialShapeDrawable createShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearance
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = (com.google.android.material.shape.ShapeAppearanceModel) r0
            com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public float getElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.view
            float r0 = r0.getElevation()
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void getPadding(android.graphics.Rect r3) {
            r2 = this;
            com.google.android.material.shadow.ShadowViewDelegate r0 = r2.shadowViewDelegate
            boolean r0 = r0.isCompatPaddingEnabled()
            if (r0 == 0) goto Lc
            super.getPadding(r3)
            goto L25
        Lc:
            boolean r0 = r2.shouldExpandBoundsForA11y()
            if (r0 != 0) goto L21
            int r0 = r2.minTouchTargetSize
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.view
            int r1 = r1.getSizeDimension()
            int r0 = r0 - r1
            int r0 = r0 / 2
            r3.set(r0, r0, r0, r0)
            goto L25
        L21:
            r0 = 0
            r3.set(r0, r0, r0, r0)
        L25:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void initializeBackgroundDrawable(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4, android.content.res.ColorStateList r5, int r6) {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.createShapeDrawable()
            r2.shapeDrawable = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.shapeDrawable
            r0.setTintList(r3)
            if (r4 == 0) goto L12
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.shapeDrawable
            r0.setTintMode(r4)
        L12:
            com.google.android.material.shape.MaterialShapeDrawable r4 = r2.shapeDrawable
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.content.Context r0 = r0.getContext()
            r4.initializeElevationOverlay(r0)
            r4 = 0
            if (r6 <= 0) goto L45
            com.google.android.material.floatingactionbutton.BorderDrawable r3 = r2.createBorderDrawable(r6, r3)
            r2.borderDrawable = r3
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            com.google.android.material.floatingactionbutton.BorderDrawable r0 = r2.borderDrawable
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1 = 0
            r6[r1] = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.shapeDrawable
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1 = 1
            r6[r1] = r0
            r3.<init>(r6)
            goto L49
        L45:
            r2.borderDrawable = r4
            com.google.android.material.shape.MaterialShapeDrawable r3 = r2.shapeDrawable
        L49:
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r5)
            r6.<init>(r5, r3, r4)
            r2.rippleDrawable = r6
            android.graphics.drawable.Drawable r3 = r2.rippleDrawable
            r2.contentBackground = r3
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void jumpDrawableToCurrentState() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void onCompatShadowChanged() {
            r0 = this;
            r0.updatePadding()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void onDrawableStateChanged(int[] r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void onElevationsChanged(float r9, float r10, float r11) {
            r8 = this;
            android.animation.StateListAnimator r0 = new android.animation.StateListAnimator
            r0.<init>()
            int[] r1 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.PRESSED_ENABLED_STATE_SET
            android.animation.Animator r11 = r8.createElevationAnimator(r9, r11)
            r0.addState(r1, r11)
            int[] r11 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.HOVERED_FOCUSED_ENABLED_STATE_SET
            android.animation.Animator r1 = r8.createElevationAnimator(r9, r10)
            r0.addState(r11, r1)
            int[] r11 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.FOCUSED_ENABLED_STATE_SET
            android.animation.Animator r1 = r8.createElevationAnimator(r9, r10)
            r0.addState(r11, r1)
            int[] r11 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.HOVERED_ENABLED_STATE_SET
            android.animation.Animator r10 = r8.createElevationAnimator(r9, r10)
            r0.addState(r11, r10)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r8.view
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r9
            java.lang.String r9 = "elevation"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r9, r3)
            r5 = 0
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r5 = 100
            if (r9 > r1) goto L6b
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.view
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r2]
            com.google.android.material.floatingactionbutton.FloatingActionButton r7 = r8.view
            float r7 = r7.getTranslationZ()
            r3[r4] = r7
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r1, r3)
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
        L6b:
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.view
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r2]
            r3 = 0
            r2[r4] = r3
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r1, r2)
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
            android.animation.Animator[] r9 = new android.animation.Animator[r4]
            java.lang.Object[] r9 = r11.toArray(r9)
            android.animation.Animator[] r9 = (android.animation.Animator[]) r9
            r10.playSequentially(r9)
            android.animation.TimeInterpolator r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.ELEVATION_ANIM_INTERPOLATOR
            r10.setInterpolator(r9)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.ENABLED_STATE_SET
            r0.addState(r9, r10)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop.EMPTY_STATE_SET
            android.animation.Animator r10 = r8.createElevationAnimator(r3, r3)
            r0.addState(r9, r10)
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.view
            r9.setStateListAnimator(r0)
            boolean r9 = r8.shouldAddPadding()
            if (r9 == 0) goto Lab
            r8.updatePadding()
        Lab:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    boolean requirePreDrawListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.rippleDrawable
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.rippleDrawable
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r2)
            r0.setColor(r2)
            goto L15
        L12:
            super.setRippleColor(r2)
        L15:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    boolean shouldAddPadding() {
            r1 = this;
            com.google.android.material.shadow.ShadowViewDelegate r0 = r1.shadowViewDelegate
            boolean r0 = r0.isCompatPaddingEnabled()
            if (r0 != 0) goto L11
            boolean r0 = r1.shouldExpandBoundsForA11y()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void updateFromViewRotation() {
            r0 = this;
            return
    }
}
