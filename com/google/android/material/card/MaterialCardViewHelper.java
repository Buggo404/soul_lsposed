package com.google.android.material.card;

/* loaded from: classes.dex */
class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final int[] CHECKED_STATE_SET = null;
    private static final double COS_45 = 0.0d;
    private static final int DEFAULT_STROKE_VALUE = -1;
    private final com.google.android.material.shape.MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    private android.graphics.drawable.Drawable checkedIcon;
    private int checkedIconMargin;
    private int checkedIconSize;
    private android.content.res.ColorStateList checkedIconTint;
    private android.graphics.drawable.LayerDrawable clickableForegroundDrawable;
    private com.google.android.material.shape.MaterialShapeDrawable compatRippleDrawable;
    private android.graphics.drawable.Drawable fgDrawable;
    private final com.google.android.material.shape.MaterialShapeDrawable foregroundContentDrawable;
    private com.google.android.material.shape.MaterialShapeDrawable foregroundShapeDrawable;
    private boolean isBackgroundOverwritten;
    private final com.google.android.material.card.MaterialCardView materialCardView;
    private android.content.res.ColorStateList rippleColor;
    private android.graphics.drawable.Drawable rippleDrawable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.content.res.ColorStateList strokeColor;
    private int strokeWidth;
    private final android.graphics.Rect userContentPadding;


    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.card.MaterialCardViewHelper.CHECKED_STATE_SET = r0
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            com.google.android.material.card.MaterialCardViewHelper.COS_45 = r0
            return
    }

    public MaterialCardViewHelper(com.google.android.material.card.MaterialCardView r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.userContentPadding = r0
            r0 = 0
            r2.isBackgroundOverwritten = r0
            r2.materialCardView = r3
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1, r4, r5, r6)
            r2.bgDrawable = r0
            android.content.Context r6 = r3.getContext()
            r0.initializeElevationOverlay(r6)
            r6 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r0.setShadowColor(r6)
            com.google.android.material.shape.ShapeAppearanceModel r6 = r0.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = r6.toBuilder()
            android.content.Context r3 = r3.getContext()
            int[] r0 = com.google.android.material.C0479R.styleable.CardView
            int r1 = com.google.android.material.C0479R.style.CardView
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r4 = com.google.android.material.C0479R.styleable.CardView_cardCornerRadius
            boolean r4 = r3.hasValue(r4)
            if (r4 == 0) goto L4d
            int r4 = com.google.android.material.C0479R.styleable.CardView_cardCornerRadius
            r5 = 0
            float r4 = r3.getDimension(r4, r5)
            r6.setAllCornerSizes(r4)
        L4d:
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            r4.<init>()
            r2.foregroundContentDrawable = r4
            com.google.android.material.shape.ShapeAppearanceModel r4 = r6.build()
            r2.setShapeAppearanceModel(r4)
            r3.recycle()
            return
    }

    private float calculateActualCornerPadding() {
            r4 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r0 = r0.getTopLeftCorner()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.bgDrawable
            float r1 = r1.getTopLeftCornerResolvedSize()
            float r0 = r4.calculateCornerPaddingForCornerTreatment(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r1.getTopRightCorner()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.bgDrawable
            float r2 = r2.getTopRightCornerResolvedSize()
            float r1 = r4.calculateCornerPaddingForCornerTreatment(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r1.getBottomRightCorner()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.bgDrawable
            float r2 = r2.getBottomRightCornerResolvedSize()
            float r1 = r4.calculateCornerPaddingForCornerTreatment(r1, r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r2 = r2.getBottomLeftCorner()
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.bgDrawable
            float r3 = r3.getBottomLeftCornerResolvedSize()
            float r2 = r4.calculateCornerPaddingForCornerTreatment(r2, r3)
            float r1 = java.lang.Math.max(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private float calculateCornerPaddingForCornerTreatment(com.google.android.material.shape.CornerTreatment r5, float r6) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r0 == 0) goto Ld
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.card.MaterialCardViewHelper.COS_45
            double r0 = r0 - r2
            double r5 = (double) r6
            double r0 = r0 * r5
            float r5 = (float) r0
            return r5
        Ld:
            boolean r5 = r5 instanceof com.google.android.material.shape.CutCornerTreatment
            if (r5 == 0) goto L15
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            return r6
        L15:
            r5 = 0
            return r5
    }

    private float calculateHorizontalBackgroundPadding() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            float r0 = r0.getMaxCardElevation()
            boolean r1 = r2.shouldAddCornerPaddingOutsideCardBackground()
            if (r1 == 0) goto L11
            float r1 = r2.calculateActualCornerPadding()
            goto L12
        L11:
            r1 = 0
        L12:
            float r0 = r0 + r1
            return r0
    }

    private float calculateVerticalBackgroundPadding() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            float r0 = r0.getMaxCardElevation()
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r1
            boolean r1 = r2.shouldAddCornerPaddingOutsideCardBackground()
            if (r1 == 0) goto L14
            float r1 = r2.calculateActualCornerPadding()
            goto L15
        L14:
            r1 = 0
        L15:
            float r0 = r0 + r1
            return r0
    }

    private boolean canClipToOutline() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            boolean r0 = r0.isRoundRect()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private android.graphics.drawable.Drawable createCheckedIconLayer() {
            r3 = this;
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            android.graphics.drawable.Drawable r1 = r3.checkedIcon
            if (r1 == 0) goto Le
            int[] r2 = com.google.android.material.card.MaterialCardViewHelper.CHECKED_STATE_SET
            r0.addState(r2, r1)
        Le:
            return r0
    }

    private android.graphics.drawable.Drawable createCompatRippleDrawable() {
            r4 = this;
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.createForegroundShapeDrawable()
            r4.compatRippleDrawable = r1
            android.content.res.ColorStateList r2 = r4.rippleColor
            r1.setFillColor(r2)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r2] = r3
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.compatRippleDrawable
            r0.addState(r1, r2)
            return r0
    }

    private android.graphics.drawable.Drawable createForegroundRippleDrawable() {
            r4 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L15
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.createForegroundShapeDrawable()
            r4.foregroundShapeDrawable = r0
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r4.rippleColor
            r2 = 0
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.foregroundShapeDrawable
            r0.<init>(r1, r2, r3)
            return r0
        L15:
            android.graphics.drawable.Drawable r0 = r4.createCompatRippleDrawable()
            return r0
    }

    private com.google.android.material.shape.MaterialShapeDrawable createForegroundShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            r0.<init>(r1)
            return r0
    }

    private android.graphics.drawable.Drawable getClickableForeground() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.rippleDrawable
            if (r0 != 0) goto La
            android.graphics.drawable.Drawable r0 = r5.createForegroundRippleDrawable()
            r5.rippleDrawable = r0
        La:
            android.graphics.drawable.LayerDrawable r0 = r5.clickableForegroundDrawable
            if (r0 != 0) goto L2e
            android.graphics.drawable.Drawable r0 = r5.createCheckedIconLayer()
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r3 = 0
            android.graphics.drawable.Drawable r4 = r5.rippleDrawable
            r2[r3] = r4
            r3 = 1
            com.google.android.material.shape.MaterialShapeDrawable r4 = r5.foregroundContentDrawable
            r2[r3] = r4
            r3 = 2
            r2[r3] = r0
            r1.<init>(r2)
            r5.clickableForegroundDrawable = r1
            int r0 = com.google.android.material.C0479R.id.mtrl_card_checked_layer_id
            r1.setId(r3, r0)
        L2e:
            android.graphics.drawable.LayerDrawable r0 = r5.clickableForegroundDrawable
            return r0
    }

    private float getParentCardViewCalculatedCornerPadding() {
            r4 = this;
            com.google.android.material.card.MaterialCardView r0 = r4.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L1f
            com.google.android.material.card.MaterialCardView r0 = r4.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L1f
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.card.MaterialCardViewHelper.COS_45
            double r0 = r0 - r2
            com.google.android.material.card.MaterialCardView r2 = r4.materialCardView
            float r2 = r2.getCardViewRadius()
            double r2 = (double) r2
            double r0 = r0 * r2
            float r0 = (float) r0
            return r0
        L1f:
            r0 = 0
            return r0
    }

    private android.graphics.drawable.Drawable insetDrawable(android.graphics.drawable.Drawable r9) {
            r8 = this;
            com.google.android.material.card.MaterialCardView r0 = r8.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L1f
            float r0 = r8.calculateVerticalBackgroundPadding()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r8.calculateHorizontalBackgroundPadding()
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r7 = r0
            r6 = r1
            goto L22
        L1f:
            r0 = 0
            r6 = r0
            r7 = r6
        L22:
            com.google.android.material.card.MaterialCardViewHelper$1 r0 = new com.google.android.material.card.MaterialCardViewHelper$1
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r6
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L10
            boolean r0 = r1.canClipToOutline()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L18
            boolean r0 = r1.canClipToOutline()
            if (r0 == 0) goto L18
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private void updateInsetForeground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r0 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L16
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            r0.setDrawable(r2)
            goto L1f
        L16:
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            android.graphics.drawable.Drawable r2 = r1.insetDrawable(r2)
            r0.setForeground(r2)
        L1f:
            return
    }

    private void updateRippleColor() {
            r2 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r2.rippleDrawable
            if (r0 == 0) goto L10
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r1 = r2.rippleColor
            r0.setColor(r1)
            goto L19
        L10:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.compatRippleDrawable
            if (r0 == 0) goto L19
            android.content.res.ColorStateList r1 = r2.rippleColor
            r0.setFillColor(r1)
        L19:
            return
    }

    void forceRippleRedraw() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.rippleDrawable
            if (r0 == 0) goto L22
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.bottom
            android.graphics.drawable.Drawable r2 = r7.rippleDrawable
            int r3 = r0.left
            int r4 = r0.top
            int r5 = r0.right
            int r6 = r1 + (-1)
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = r7.rippleDrawable
            int r3 = r0.left
            int r4 = r0.top
            int r0 = r0.right
            r2.setBounds(r3, r4, r0, r1)
        L22:
            return
    }

    com.google.android.material.shape.MaterialShapeDrawable getBackground() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            return r0
    }

    android.content.res.ColorStateList getCardBackgroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    android.content.res.ColorStateList getCardForegroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            return r0
    }

    int getCheckedIconMargin() {
            r1 = this;
            int r0 = r1.checkedIconMargin
            return r0
    }

    int getCheckedIconSize() {
            r1 = this;
            int r0 = r1.checkedIconSize
            return r0
    }

    android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.checkedIconTint
            return r0
    }

    float getCornerRadius() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    float getProgress() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            float r0 = r0.getInterpolation()
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

    int getStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 != 0) goto L6
            r0 = -1
            goto La
        L6:
            int r0 = r0.getDefaultColor()
        La:
            return r0
    }

    android.content.res.ColorStateList getStrokeColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            return r0
    }

    int getStrokeWidth() {
            r1 = this;
            int r0 = r1.strokeWidth
            return r0
    }

    android.graphics.Rect getUserContentPadding() {
            r1 = this;
            android.graphics.Rect r0 = r1.userContentPadding
            return r0
    }

    boolean isBackgroundOverwritten() {
            r1 = this;
            boolean r0 = r1.isBackgroundOverwritten
            return r0
    }

    boolean isCheckable() {
            r1 = this;
            boolean r0 = r1.checkable
            return r0
    }

    void loadFromAttributes(android.content.res.TypedArray r4) {
            r3 = this;
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.styleable.MaterialCardView_strokeColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.strokeColor = r0
            if (r0 != 0) goto L17
            r0 = -1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.strokeColor = r0
        L17:
            int r0 = com.google.android.material.C0479R.styleable.MaterialCardView_strokeWidth
            r1 = 0
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.strokeWidth = r0
            int r0 = com.google.android.material.C0479R.styleable.MaterialCardView_android_checkable
            boolean r0 = r4.getBoolean(r0, r1)
            r3.checkable = r0
            com.google.android.material.card.MaterialCardView r2 = r3.materialCardView
            r2.setLongClickable(r0)
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r2)
            r3.checkedIconTint = r0
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r0 = com.google.android.material.resources.MaterialResources.getDrawable(r0, r4, r2)
            r3.setCheckedIcon(r0)
            int r0 = com.google.android.material.C0479R.styleable.MaterialCardView_checkedIconSize
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.setCheckedIconSize(r0)
            int r0 = com.google.android.material.C0479R.styleable.MaterialCardView_checkedIconMargin
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.setCheckedIconMargin(r0)
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.styleable.MaterialCardView_rippleColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.rippleColor = r0
            if (r0 != 0) goto L7a
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            int r1 = com.google.android.material.C0479R.attr.colorControlHighlight
            int r0 = com.google.android.material.color.MaterialColors.getColor(r0, r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.rippleColor = r0
        L7a:
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.styleable.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.setCardForegroundColor(r4)
            r3.updateRippleColor()
            r3.updateElevation()
            r3.updateStroke()
            com.google.android.material.card.MaterialCardView r4 = r3.materialCardView
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.bgDrawable
            android.graphics.drawable.Drawable r0 = r3.insetDrawable(r0)
            r4.setBackgroundInternal(r0)
            com.google.android.material.card.MaterialCardView r4 = r3.materialCardView
            boolean r4 = r4.isClickable()
            if (r4 == 0) goto Laa
            android.graphics.drawable.Drawable r4 = r3.getClickableForeground()
            goto Lac
        Laa:
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.foregroundContentDrawable
        Lac:
            r3.fgDrawable = r4
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.graphics.drawable.Drawable r4 = r3.insetDrawable(r4)
            r0.setForeground(r4)
            return
    }

    void onMeasure(int r7, int r8) {
            r6 = this;
            android.graphics.drawable.LayerDrawable r0 = r6.clickableForegroundDrawable
            if (r0 == 0) goto L47
            int r0 = r6.checkedIconMargin
            int r7 = r7 - r0
            int r1 = r6.checkedIconSize
            int r7 = r7 - r1
            int r8 = r8 - r0
            int r8 = r8 - r1
            com.google.android.material.card.MaterialCardView r0 = r6.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L2e
            float r0 = r6.calculateVerticalBackgroundPadding()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            int r8 = r8 - r0
            float r0 = r6.calculateHorizontalBackgroundPadding()
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r7 = r7 - r0
        L2e:
            r5 = r8
            int r8 = r6.checkedIconMargin
            com.google.android.material.card.MaterialCardView r0 = r6.materialCardView
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r1 = 1
            if (r0 != r1) goto L3d
            r4 = r7
            r2 = r8
            goto L3f
        L3d:
            r2 = r7
            r4 = r8
        L3f:
            android.graphics.drawable.LayerDrawable r0 = r6.clickableForegroundDrawable
            r1 = 2
            int r3 = r6.checkedIconMargin
            r0.setLayerInset(r1, r2, r3, r4, r5)
        L47:
            return
    }

    void setBackgroundOverwritten(boolean r1) {
            r0 = this;
            r0.isBackgroundOverwritten = r1
            return
    }

    void setCardBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            r0.setFillColor(r2)
            return
    }

    void setCardForegroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            if (r2 != 0) goto L9
            r2 = 0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        L9:
            r0.setFillColor(r2)
            return
    }

    void setCheckable(boolean r1) {
            r0 = this;
            r0.checkable = r1
            return
    }

    void setCheckedIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.checkedIcon = r3
            if (r3 == 0) goto L13
            android.graphics.drawable.Drawable r3 = r3.mutate()
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.DrawableCompat.wrap(r3)
            r2.checkedIcon = r3
            android.content.res.ColorStateList r0 = r2.checkedIconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r0)
        L13:
            android.graphics.drawable.LayerDrawable r3 = r2.clickableForegroundDrawable
            if (r3 == 0) goto L22
            android.graphics.drawable.Drawable r3 = r2.createCheckedIconLayer()
            android.graphics.drawable.LayerDrawable r0 = r2.clickableForegroundDrawable
            int r1 = com.google.android.material.C0479R.id.mtrl_card_checked_layer_id
            r0.setDrawableByLayerId(r1, r3)
        L22:
            return
    }

    void setCheckedIconMargin(int r1) {
            r0 = this;
            r0.checkedIconMargin = r1
            return
    }

    void setCheckedIconSize(int r1) {
            r0 = this;
            r0.checkedIconSize = r1
            return
    }

    void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.checkedIconTint = r2
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto L9
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L9:
            return
    }

    void setCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
            android.graphics.drawable.Drawable r2 = r1.fgDrawable
            r2.invalidateSelf()
            boolean r2 = r1.shouldAddCornerPaddingOutsideCardBackground()
            if (r2 != 0) goto L1a
            boolean r2 = r1.shouldAddCornerPaddingInsideCardBackground()
            if (r2 == 0) goto L1d
        L1a:
            r1.updateContentPadding()
        L1d:
            boolean r2 = r1.shouldAddCornerPaddingOutsideCardBackground()
            if (r2 == 0) goto L26
            r1.updateInsets()
        L26:
            return
    }

    void setProgress(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            r0.setInterpolation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            if (r0 == 0) goto Lc
            r0.setInterpolation(r2)
        Lc:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundShapeDrawable
            if (r0 == 0) goto L13
            r0.setInterpolation(r2)
        L13:
            return
    }

    void setRippleColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.rippleColor = r1
            r0.updateRippleColor()
            return
    }

    void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            r2.shapeAppearanceModel = r3
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            r0.setShapeAppearanceModel(r3)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            boolean r1 = r0.isRoundRect()
            r1 = r1 ^ 1
            r0.setShadowBitmapDrawingEnable(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.foregroundContentDrawable
            if (r0 == 0) goto L19
            r0.setShapeAppearanceModel(r3)
        L19:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.foregroundShapeDrawable
            if (r0 == 0) goto L20
            r0.setShapeAppearanceModel(r3)
        L20:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.compatRippleDrawable
            if (r0 == 0) goto L27
            r0.setShapeAppearanceModel(r3)
        L27:
            return
    }

    void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 != r2) goto L5
            return
        L5:
            r1.strokeColor = r2
            r1.updateStroke()
            return
    }

    void setStrokeWidth(int r2) {
            r1 = this;
            int r0 = r1.strokeWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.strokeWidth = r2
            r1.updateStroke()
            return
    }

    void setUserContentPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.userContentPadding
            r0.set(r2, r3, r4, r5)
            r1.updateContentPadding()
            return
    }

    void updateClickable() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fgDrawable
            com.google.android.material.card.MaterialCardView r1 = r2.materialCardView
            boolean r1 = r1.isClickable()
            if (r1 == 0) goto Lf
            android.graphics.drawable.Drawable r1 = r2.getClickableForeground()
            goto L11
        Lf:
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.foregroundContentDrawable
        L11:
            r2.fgDrawable = r1
            if (r0 == r1) goto L18
            r2.updateInsetForeground(r1)
        L18:
            return
    }

    void updateContentPadding() {
            r6 = this;
            boolean r0 = r6.shouldAddCornerPaddingInsideCardBackground()
            if (r0 != 0) goto Lf
            boolean r0 = r6.shouldAddCornerPaddingOutsideCardBackground()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L17
            float r0 = r6.calculateActualCornerPadding()
            goto L18
        L17:
            r0 = 0
        L18:
            float r1 = r6.getParentCardViewCalculatedCornerPadding()
            float r0 = r0 - r1
            int r0 = (int) r0
            com.google.android.material.card.MaterialCardView r1 = r6.materialCardView
            android.graphics.Rect r2 = r6.userContentPadding
            int r2 = r2.left
            int r2 = r2 + r0
            android.graphics.Rect r3 = r6.userContentPadding
            int r3 = r3.top
            int r3 = r3 + r0
            android.graphics.Rect r4 = r6.userContentPadding
            int r4 = r4.right
            int r4 = r4 + r0
            android.graphics.Rect r5 = r6.userContentPadding
            int r5 = r5.bottom
            int r5 = r5 + r0
            r1.setAncestorContentPadding(r2, r3, r4, r5)
            return
    }

    void updateElevation() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            com.google.android.material.card.MaterialCardView r1 = r2.materialCardView
            float r1 = r1.getCardElevation()
            r0.setElevation(r1)
            return
    }

    void updateInsets() {
            r2 = this;
            boolean r0 = r2.isBackgroundOverwritten()
            if (r0 != 0) goto L11
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.bgDrawable
            android.graphics.drawable.Drawable r1 = r2.insetDrawable(r1)
            r0.setBackgroundInternal(r1)
        L11:
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            android.graphics.drawable.Drawable r1 = r2.fgDrawable
            android.graphics.drawable.Drawable r1 = r2.insetDrawable(r1)
            r0.setForeground(r1)
            return
    }

    void updateStroke() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.foregroundContentDrawable
            int r1 = r3.strokeWidth
            float r1 = (float) r1
            android.content.res.ColorStateList r2 = r3.strokeColor
            r0.setStroke(r1, r2)
            return
    }
}
