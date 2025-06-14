package com.google.android.material.button;

/* loaded from: classes.dex */
class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP = false;
    private boolean backgroundOverwritten;
    private android.content.res.ColorStateList backgroundTint;
    private android.graphics.PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private boolean cornerRadiusSet;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private android.graphics.drawable.Drawable maskDrawable;
    private final com.google.android.material.button.MaterialButton materialButton;
    private android.content.res.ColorStateList rippleColor;
    private android.graphics.drawable.LayerDrawable rippleDrawable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private boolean shouldDrawSurfaceColorStroke;
    private android.content.res.ColorStateList strokeColor;
    private int strokeWidth;

    static {
            r0 = 1
            com.google.android.material.button.MaterialButtonHelper.IS_LOLLIPOP = r0
            return
    }

    MaterialButtonHelper(com.google.android.material.button.MaterialButton r2, com.google.android.material.shape.ShapeAppearanceModel r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.shouldDrawSurfaceColorStroke = r0
            r1.backgroundOverwritten = r0
            r1.cornerRadiusSet = r0
            r1.materialButton = r2
            r1.shapeAppearanceModel = r3
            return
    }

    private android.graphics.drawable.Drawable createBackground() {
            r8 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r8.shapeAppearanceModel
            r0.<init>(r1)
            com.google.android.material.button.MaterialButton r1 = r8.materialButton
            android.content.Context r1 = r1.getContext()
            r0.initializeElevationOverlay(r1)
            android.content.res.ColorStateList r1 = r8.backgroundTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
            android.graphics.PorterDuff$Mode r1 = r8.backgroundTintMode
            if (r1 == 0) goto L1c
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L1c:
            int r1 = r8.strokeWidth
            float r1 = (float) r1
            android.content.res.ColorStateList r2 = r8.strokeColor
            r0.setStroke(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r8.shapeAppearanceModel
            r1.<init>(r2)
            r2 = 0
            r1.setTint(r2)
            int r3 = r8.strokeWidth
            float r3 = (float) r3
            boolean r4 = r8.shouldDrawSurfaceColorStroke
            if (r4 == 0) goto L3f
            com.google.android.material.button.MaterialButton r4 = r8.materialButton
            int r5 = com.google.android.material.C0479R.attr.colorSurface
            int r4 = com.google.android.material.color.MaterialColors.getColor(r4, r5)
            goto L40
        L3f:
            r4 = r2
        L40:
            r1.setStroke(r3, r4)
            boolean r3 = com.google.android.material.button.MaterialButtonHelper.IS_LOLLIPOP
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L75
            com.google.android.material.shape.MaterialShapeDrawable r3 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r6 = r8.shapeAppearanceModel
            r3.<init>(r6)
            r8.maskDrawable = r3
            r6 = -1
            androidx.core.graphics.drawable.DrawableCompat.setTint(r3, r6)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r6 = r8.rippleColor
            android.content.res.ColorStateList r6 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r6)
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            r4[r2] = r1
            r4[r5] = r0
            r7.<init>(r4)
            android.graphics.drawable.InsetDrawable r0 = r8.wrapDrawableWithInset(r7)
            android.graphics.drawable.Drawable r1 = r8.maskDrawable
            r3.<init>(r6, r0, r1)
            r8.rippleDrawable = r3
            return r3
        L75:
            com.google.android.material.ripple.RippleDrawableCompat r3 = new com.google.android.material.ripple.RippleDrawableCompat
            com.google.android.material.shape.ShapeAppearanceModel r6 = r8.shapeAppearanceModel
            r3.<init>(r6)
            r8.maskDrawable = r3
            android.content.res.ColorStateList r6 = r8.rippleColor
            android.content.res.ColorStateList r6 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r6)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r6)
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            r6 = 3
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            r6[r2] = r1
            r6[r5] = r0
            android.graphics.drawable.Drawable r0 = r8.maskDrawable
            r6[r4] = r0
            r3.<init>(r6)
            r8.rippleDrawable = r3
            android.graphics.drawable.InsetDrawable r0 = r8.wrapDrawableWithInset(r3)
            return r0
    }

    private com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeDrawable(boolean r3) {
            r2 = this;
            android.graphics.drawable.LayerDrawable r0 = r2.rippleDrawable
            if (r0 == 0) goto L31
            int r0 = r0.getNumberOfLayers()
            if (r0 <= 0) goto L31
            boolean r0 = com.google.android.material.button.MaterialButtonHelper.IS_LOLLIPOP
            if (r0 == 0) goto L26
            android.graphics.drawable.LayerDrawable r0 = r2.rippleDrawable
            r1 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            r3 = r3 ^ 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            com.google.android.material.shape.MaterialShapeDrawable r3 = (com.google.android.material.shape.MaterialShapeDrawable) r3
            return r3
        L26:
            android.graphics.drawable.LayerDrawable r0 = r2.rippleDrawable
            r3 = r3 ^ 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            com.google.android.material.shape.MaterialShapeDrawable r3 = (com.google.android.material.shape.MaterialShapeDrawable) r3
            return r3
        L31:
            r3 = 0
            return r3
    }

    private com.google.android.material.shape.MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
            r1 = this;
            r0 = 1
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getMaterialShapeDrawable(r0)
            return r0
    }

    private void setVerticalInsets(int r8, int r9) {
            r7 = this;
            com.google.android.material.button.MaterialButton r0 = r7.materialButton
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            com.google.android.material.button.MaterialButton r1 = r7.materialButton
            int r1 = r1.getPaddingTop()
            com.google.android.material.button.MaterialButton r2 = r7.materialButton
            int r2 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            com.google.android.material.button.MaterialButton r3 = r7.materialButton
            int r3 = r3.getPaddingBottom()
            int r4 = r7.insetTop
            int r5 = r7.insetBottom
            r7.insetBottom = r9
            r7.insetTop = r8
            boolean r6 = r7.backgroundOverwritten
            if (r6 != 0) goto L27
            r7.updateBackground()
        L27:
            com.google.android.material.button.MaterialButton r6 = r7.materialButton
            int r1 = r1 + r8
            int r1 = r1 - r4
            int r3 = r3 + r9
            int r3 = r3 - r5
            androidx.core.view.ViewCompat.setPaddingRelative(r6, r0, r1, r2, r3)
            return
    }

    private void updateBackground() {
            r2 = this;
            com.google.android.material.button.MaterialButton r0 = r2.materialButton
            android.graphics.drawable.Drawable r1 = r2.createBackground()
            r0.setInternalBackground(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.getMaterialShapeDrawable()
            if (r0 == 0) goto L15
            int r1 = r2.elevation
            float r1 = (float) r1
            r0.setElevation(r1)
        L15:
            return
    }

    private void updateButtonShape(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getMaterialShapeDrawable()
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getMaterialShapeDrawable()
            r0.setShapeAppearanceModel(r2)
        Ld:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getSurfaceColorStrokeDrawable()
            if (r0 == 0) goto L1a
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getSurfaceColorStrokeDrawable()
            r0.setShapeAppearanceModel(r2)
        L1a:
            com.google.android.material.shape.Shapeable r0 = r1.getMaskDrawable()
            if (r0 == 0) goto L27
            com.google.android.material.shape.Shapeable r0 = r1.getMaskDrawable()
            r0.setShapeAppearanceModel(r2)
        L27:
            return
    }

    private void updateStroke() {
            r4 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.getMaterialShapeDrawable()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.getSurfaceColorStrokeDrawable()
            if (r0 == 0) goto L28
            int r2 = r4.strokeWidth
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r4.strokeColor
            r0.setStroke(r2, r3)
            if (r1 == 0) goto L28
            int r0 = r4.strokeWidth
            float r0 = (float) r0
            boolean r2 = r4.shouldDrawSurfaceColorStroke
            if (r2 == 0) goto L24
            com.google.android.material.button.MaterialButton r2 = r4.materialButton
            int r3 = com.google.android.material.C0479R.attr.colorSurface
            int r2 = com.google.android.material.color.MaterialColors.getColor(r2, r3)
            goto L25
        L24:
            r2 = 0
        L25:
            r1.setStroke(r0, r2)
        L28:
            return
    }

    private android.graphics.drawable.InsetDrawable wrapDrawableWithInset(android.graphics.drawable.Drawable r8) {
            r7 = this;
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r2 = r7.insetLeft
            int r3 = r7.insetTop
            int r4 = r7.insetRight
            int r5 = r7.insetBottom
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    int getCornerRadius() {
            r1 = this;
            int r0 = r1.cornerRadius
            return r0
    }

    public int getInsetBottom() {
            r1 = this;
            int r0 = r1.insetBottom
            return r0
    }

    public int getInsetTop() {
            r1 = this;
            int r0 = r1.insetTop
            return r0
    }

    public com.google.android.material.shape.Shapeable getMaskDrawable() {
            r3 = this;
            android.graphics.drawable.LayerDrawable r0 = r3.rippleDrawable
            if (r0 == 0) goto L26
            int r0 = r0.getNumberOfLayers()
            r1 = 1
            if (r0 <= r1) goto L26
            android.graphics.drawable.LayerDrawable r0 = r3.rippleDrawable
            int r0 = r0.getNumberOfLayers()
            r2 = 2
            if (r0 <= r2) goto L1d
            android.graphics.drawable.LayerDrawable r0 = r3.rippleDrawable
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            com.google.android.material.shape.Shapeable r0 = (com.google.android.material.shape.Shapeable) r0
            return r0
        L1d:
            android.graphics.drawable.LayerDrawable r0 = r3.rippleDrawable
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            com.google.android.material.shape.Shapeable r0 = (com.google.android.material.shape.Shapeable) r0
            return r0
        L26:
            r0 = 0
            return r0
    }

    com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeDrawable() {
            r1 = this;
            r0 = 0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getMaterialShapeDrawable(r0)
            return r0
    }

    android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            return r0
    }

    com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            return r0
    }

    int getStrokeWidth() {
            r1 = this;
            int r0 = r1.strokeWidth
            return r0
    }

    android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.backgroundTint
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
            return r0
    }

    boolean isBackgroundOverwritten() {
            r1 = this;
            boolean r0 = r1.backgroundOverwritten
            return r0
    }

    boolean isCheckable() {
            r1 = this;
            boolean r0 = r1.checkable
            return r0
    }

    void loadFromAttributes(android.content.res.TypedArray r6) {
            r5 = this;
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_android_insetLeft
            r1 = 0
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.insetLeft = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_android_insetRight
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.insetRight = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_android_insetTop
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.insetTop = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_android_insetBottom
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.insetBottom = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_cornerRadius
            boolean r0 = r6.hasValue(r0)
            r2 = -1
            if (r0 == 0) goto L3f
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_cornerRadius
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r5.cornerRadius = r0
            com.google.android.material.shape.ShapeAppearanceModel r3 = r5.shapeAppearanceModel
            float r0 = (float) r0
            com.google.android.material.shape.ShapeAppearanceModel r0 = r3.withCornerSize(r0)
            r5.setShapeAppearanceModel(r0)
            r0 = 1
            r5.cornerRadiusSet = r0
        L3f:
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_strokeWidth
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r5.strokeWidth = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_backgroundTintMode
            int r0 = r6.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.ViewUtils.parseTintMode(r0, r2)
            r5.backgroundTintMode = r0
            com.google.android.material.button.MaterialButton r0 = r5.materialButton
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialButton_backgroundTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r6, r2)
            r5.backgroundTint = r0
            com.google.android.material.button.MaterialButton r0 = r5.materialButton
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialButton_strokeColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r6, r2)
            r5.strokeColor = r0
            com.google.android.material.button.MaterialButton r0 = r5.materialButton
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialButton_rippleColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r6, r2)
            r5.rippleColor = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_android_checkable
            boolean r0 = r6.getBoolean(r0, r1)
            r5.checkable = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialButton_elevation
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r5.elevation = r0
            com.google.android.material.button.MaterialButton r0 = r5.materialButton
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            com.google.android.material.button.MaterialButton r1 = r5.materialButton
            int r1 = r1.getPaddingTop()
            com.google.android.material.button.MaterialButton r2 = r5.materialButton
            int r2 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            com.google.android.material.button.MaterialButton r3 = r5.materialButton
            int r3 = r3.getPaddingBottom()
            int r4 = com.google.android.material.C0479R.styleable.MaterialButton_android_background
            boolean r6 = r6.hasValue(r4)
            if (r6 == 0) goto Lb3
            r5.setBackgroundOverwritten()
            goto Lb6
        Lb3:
            r5.updateBackground()
        Lb6:
            com.google.android.material.button.MaterialButton r6 = r5.materialButton
            int r4 = r5.insetLeft
            int r0 = r0 + r4
            int r4 = r5.insetTop
            int r1 = r1 + r4
            int r4 = r5.insetRight
            int r2 = r2 + r4
            int r4 = r5.insetBottom
            int r3 = r3 + r4
            androidx.core.view.ViewCompat.setPaddingRelative(r6, r0, r1, r2, r3)
            return
    }

    void setBackgroundColor(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getMaterialShapeDrawable()
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getMaterialShapeDrawable()
            r0.setTint(r2)
        Ld:
            return
    }

    void setBackgroundOverwritten() {
            r2 = this;
            r0 = 1
            r2.backgroundOverwritten = r0
            com.google.android.material.button.MaterialButton r0 = r2.materialButton
            android.content.res.ColorStateList r1 = r2.backgroundTint
            r0.setSupportBackgroundTintList(r1)
            com.google.android.material.button.MaterialButton r0 = r2.materialButton
            android.graphics.PorterDuff$Mode r1 = r2.backgroundTintMode
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    void setCheckable(boolean r1) {
            r0 = this;
            r0.checkable = r1
            return
    }

    void setCornerRadius(int r2) {
            r1 = this;
            boolean r0 = r1.cornerRadiusSet
            if (r0 == 0) goto L8
            int r0 = r1.cornerRadius
            if (r0 == r2) goto L17
        L8:
            r1.cornerRadius = r2
            r0 = 1
            r1.cornerRadiusSet = r0
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            float r2 = (float) r2
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
        L17:
            return
    }

    public void setInsetBottom(int r2) {
            r1 = this;
            int r0 = r1.insetTop
            r1.setVerticalInsets(r0, r2)
            return
    }

    public void setInsetTop(int r2) {
            r1 = this;
            int r0 = r1.insetBottom
            r1.setVerticalInsets(r2, r0)
            return
    }

    void setRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.rippleColor
            if (r0 == r3) goto L3f
            r2.rippleColor = r3
            boolean r0 = com.google.android.material.button.MaterialButtonHelper.IS_LOLLIPOP
            if (r0 == 0) goto L24
            com.google.android.material.button.MaterialButton r1 = r2.materialButton
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L24
            com.google.android.material.button.MaterialButton r0 = r2.materialButton
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r3 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r3)
            r0.setColor(r3)
            goto L3f
        L24:
            if (r0 != 0) goto L3f
            com.google.android.material.button.MaterialButton r0 = r2.materialButton
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof com.google.android.material.ripple.RippleDrawableCompat
            if (r0 == 0) goto L3f
            com.google.android.material.button.MaterialButton r0 = r2.materialButton
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            com.google.android.material.ripple.RippleDrawableCompat r0 = (com.google.android.material.ripple.RippleDrawableCompat) r0
            android.content.res.ColorStateList r3 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r3)
            r0.setTintList(r3)
        L3f:
            return
    }

    void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            r0.shapeAppearanceModel = r1
            r0.updateButtonShape(r1)
            return
    }

    void setShouldDrawSurfaceColorStroke(boolean r1) {
            r0 = this;
            r0.shouldDrawSurfaceColorStroke = r1
            r0.updateStroke()
            return
    }

    void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 == r2) goto L9
            r1.strokeColor = r2
            r1.updateStroke()
        L9:
            return
    }

    void setStrokeWidth(int r2) {
            r1 = this;
            int r0 = r1.strokeWidth
            if (r0 == r2) goto L9
            r1.strokeWidth = r2
            r1.updateStroke()
        L9:
            return
    }

    void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.backgroundTint
            if (r0 == r2) goto L15
            r1.backgroundTint = r2
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.getMaterialShapeDrawable()
            if (r2 == 0) goto L15
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.getMaterialShapeDrawable()
            android.content.res.ColorStateList r0 = r1.backgroundTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
        L15:
            return
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
            if (r0 == r2) goto L19
            r1.backgroundTintMode = r2
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.getMaterialShapeDrawable()
            if (r2 == 0) goto L19
            android.graphics.PorterDuff$Mode r2 = r1.backgroundTintMode
            if (r2 == 0) goto L19
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.getMaterialShapeDrawable()
            android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r2, r0)
        L19:
            return
    }

    void updateMaskBounds(int r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.maskDrawable
            if (r0 == 0) goto L11
            int r1 = r4.insetLeft
            int r2 = r4.insetTop
            int r3 = r4.insetRight
            int r6 = r6 - r3
            int r3 = r4.insetBottom
            int r5 = r5 - r3
            r0.setBounds(r1, r2, r6, r5)
        L11:
            return
    }
}
