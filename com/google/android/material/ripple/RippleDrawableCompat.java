package com.google.android.material.ripple;

/* loaded from: classes.dex */
public class RippleDrawableCompat extends android.graphics.drawable.Drawable implements com.google.android.material.shape.Shapeable, androidx.core.graphics.drawable.TintAwareDrawable {
    private com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState drawableState;

    /* renamed from: com.google.android.material.ripple.RippleDrawableCompat$1 */
    static /* synthetic */ class C06171 {
    }

    static final class RippleDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        com.google.android.material.shape.MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        public RippleDrawableCompatState(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState r2) {
                r1 = this;
                r1.<init>()
                com.google.android.material.shape.MaterialShapeDrawable r0 = r2.delegate
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                com.google.android.material.shape.MaterialShapeDrawable r0 = (com.google.android.material.shape.MaterialShapeDrawable) r0
                r1.delegate = r0
                boolean r2 = r2.shouldDrawDelegate
                r1.shouldDrawDelegate = r2
                return
        }

        public RippleDrawableCompatState(com.google.android.material.shape.MaterialShapeDrawable r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r1 = 0
                r0.shouldDrawDelegate = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                com.google.android.material.ripple.RippleDrawableCompat r0 = r1.newDrawable()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public com.google.android.material.ripple.RippleDrawableCompat newDrawable() {
                r3 = this;
                com.google.android.material.ripple.RippleDrawableCompat r0 = new com.google.android.material.ripple.RippleDrawableCompat
                com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = new com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState
                r1.<init>(r3)
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private RippleDrawableCompat(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState r1) {
            r0 = this;
            r0.<init>()
            r0.drawableState = r1
            return
    }

    /* synthetic */ RippleDrawableCompat(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState r1, com.google.android.material.ripple.RippleDrawableCompat.C06171 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public RippleDrawableCompat(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = new com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            boolean r0 = r0.shouldDrawDelegate
            if (r0 == 0) goto Ld
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.draw(r2)
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable mutate() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat r0 = r1.mutate()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public com.google.android.material.ripple.RippleDrawableCompat mutate() {
            r2 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = new com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = r2.drawableState
            r0.<init>(r1)
            r2.drawableState = r0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            super.onBoundsChange(r2)
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setBounds(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r4) {
            r3 = this;
            boolean r0 = super.onStateChange(r4)
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = r3.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r1 = r1.delegate
            boolean r1 = r1.setState(r4)
            r2 = 1
            if (r1 == 0) goto L10
            r0 = r2
        L10:
            boolean r4 = com.google.android.material.ripple.RippleUtils.shouldDrawRippleCompat(r4)
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = r3.drawableState
            boolean r1 = r1.shouldDrawDelegate
            if (r1 == r4) goto L1f
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r3.drawableState
            r0.shouldDrawDelegate = r4
            goto L20
        L1f:
            r2 = r0
        L20:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setColorFilter(r2)
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setShapeAppearanceModel(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setTintMode(r2)
            return
    }
}
