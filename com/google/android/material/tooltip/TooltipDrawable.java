package com.google.android.material.tooltip;

/* loaded from: classes.dex */
public class TooltipDrawable extends com.google.android.material.shape.MaterialShapeDrawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    private static final int DEFAULT_STYLE = 0;
    private static final int DEFAULT_THEME_ATTR = 0;
    private int arrowSize;
    private final android.view.View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final android.content.Context context;
    private final android.graphics.Rect displayFrame;
    private final android.graphics.Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private java.lang.CharSequence text;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;


    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_Tooltip
            com.google.android.material.tooltip.TooltipDrawable.DEFAULT_STYLE = r0
            int r0 = com.google.android.material.C0479R.attr.tooltipStyle
            com.google.android.material.tooltip.TooltipDrawable.DEFAULT_THEME_ATTR = r0
            return
    }

    private TooltipDrawable(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            android.graphics.Paint$FontMetrics r2 = new android.graphics.Paint$FontMetrics
            r2.<init>()
            r0.fontMetrics = r2
            com.google.android.material.internal.TextDrawableHelper r2 = new com.google.android.material.internal.TextDrawableHelper
            r2.<init>(r0)
            r0.textDrawableHelper = r2
            com.google.android.material.tooltip.TooltipDrawable$1 r3 = new com.google.android.material.tooltip.TooltipDrawable$1
            r3.<init>(r0)
            r0.attachedViewLayoutChangeListener = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.displayFrame = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.tooltipScaleX = r3
            r0.tooltipScaleY = r3
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.tooltipPivotX = r4
            r0.tooltipPivotY = r4
            r0.labelOpacity = r3
            r0.context = r1
            android.text.TextPaint r3 = r2.getTextPaint()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r3.density = r1
            android.text.TextPaint r1 = r2.getTextPaint()
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r1.setTextAlign(r2)
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.tooltip.TooltipDrawable r0, android.view.View r1) {
            r0.updateLocationOnScreen(r1)
            return
    }

    private float calculatePointerOffset() {
            r2 = this;
            android.graphics.Rect r0 = r2.displayFrame
            int r0 = r0.right
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.right
            int r0 = r0 - r1
            int r1 = r2.locationOnScreenX
            int r0 = r0 - r1
            int r1 = r2.layoutMargin
            int r0 = r0 - r1
            if (r0 >= 0) goto L26
            android.graphics.Rect r0 = r2.displayFrame
            int r0 = r0.right
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.right
            int r0 = r0 - r1
            int r1 = r2.locationOnScreenX
            int r0 = r0 - r1
            int r1 = r2.layoutMargin
            int r0 = r0 - r1
        L24:
            float r0 = (float) r0
            goto L4c
        L26:
            android.graphics.Rect r0 = r2.displayFrame
            int r0 = r0.left
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.left
            int r0 = r0 - r1
            int r1 = r2.locationOnScreenX
            int r0 = r0 - r1
            int r1 = r2.layoutMargin
            int r0 = r0 + r1
            if (r0 <= 0) goto L4b
            android.graphics.Rect r0 = r2.displayFrame
            int r0 = r0.left
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.left
            int r0 = r0 - r1
            int r1 = r2.locationOnScreenX
            int r0 = r0 - r1
            int r1 = r2.layoutMargin
            int r0 = r0 + r1
            goto L24
        L4b:
            r0 = 0
        L4c:
            return r0
    }

    private float calculateTextCenterFromBaseline() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            android.graphics.Paint$FontMetrics r1 = r2.fontMetrics
            r0.getFontMetrics(r1)
            android.graphics.Paint$FontMetrics r0 = r2.fontMetrics
            float r0 = r0.descent
            android.graphics.Paint$FontMetrics r1 = r2.fontMetrics
            float r1 = r1.ascent
            float r0 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            return r0
    }

    private float calculateTextOriginAndAlignment(android.graphics.Rect r2) {
            r1 = this;
            int r2 = r2.centerY()
            float r2 = (float) r2
            float r0 = r1.calculateTextCenterFromBaseline()
            float r2 = r2 - r0
            return r2
    }

    public static com.google.android.material.tooltip.TooltipDrawable create(android.content.Context r3) {
            int r0 = com.google.android.material.tooltip.TooltipDrawable.DEFAULT_THEME_ATTR
            int r1 = com.google.android.material.tooltip.TooltipDrawable.DEFAULT_STYLE
            r2 = 0
            com.google.android.material.tooltip.TooltipDrawable r3 = createFromAttributes(r3, r2, r0, r1)
            return r3
    }

    public static com.google.android.material.tooltip.TooltipDrawable createFromAttributes(android.content.Context r2, android.util.AttributeSet r3) {
            int r0 = com.google.android.material.tooltip.TooltipDrawable.DEFAULT_THEME_ATTR
            int r1 = com.google.android.material.tooltip.TooltipDrawable.DEFAULT_STYLE
            com.google.android.material.tooltip.TooltipDrawable r2 = createFromAttributes(r2, r3, r0, r1)
            return r2
    }

    public static com.google.android.material.tooltip.TooltipDrawable createFromAttributes(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            com.google.android.material.tooltip.TooltipDrawable r0 = new com.google.android.material.tooltip.TooltipDrawable
            r0.<init>(r1, r2, r3, r4)
            r0.loadFromAttributes(r2, r3, r4)
            return r0
    }

    private com.google.android.material.shape.EdgeTreatment createMarkerEdge() {
            r7 = this;
            float r0 = r7.calculatePointerOffset()
            float r0 = -r0
            android.graphics.Rect r1 = r7.getBounds()
            int r1 = r1.width()
            double r1 = (double) r1
            int r3 = r7.arrowSize
            double r3 = (double) r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.sqrt(r5)
            double r3 = r3 * r5
            double r1 = r1 - r3
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r2 = -r1
            float r0 = java.lang.Math.max(r0, r2)
            float r0 = java.lang.Math.min(r0, r1)
            com.google.android.material.shape.OffsetEdgeTreatment r1 = new com.google.android.material.shape.OffsetEdgeTreatment
            com.google.android.material.shape.MarkerEdgeTreatment r2 = new com.google.android.material.shape.MarkerEdgeTreatment
            int r3 = r7.arrowSize
            float r3 = (float) r3
            r2.<init>(r3)
            r1.<init>(r2, r0)
            return r1
    }

    private void drawText(android.graphics.Canvas r12) {
            r11 = this;
            java.lang.CharSequence r0 = r11.text
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r0 = r11.getBounds()
            float r1 = r11.calculateTextOriginAndAlignment(r0)
            int r1 = (int) r1
            com.google.android.material.internal.TextDrawableHelper r2 = r11.textDrawableHelper
            com.google.android.material.resources.TextAppearance r2 = r2.getTextAppearance()
            if (r2 == 0) goto L38
            com.google.android.material.internal.TextDrawableHelper r2 = r11.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            int[] r3 = r11.getState()
            r2.drawableState = r3
            com.google.android.material.internal.TextDrawableHelper r2 = r11.textDrawableHelper
            android.content.Context r3 = r11.context
            r2.updateTextPaintDrawState(r3)
            com.google.android.material.internal.TextDrawableHelper r2 = r11.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            float r3 = r11.labelOpacity
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.setAlpha(r3)
        L38:
            java.lang.CharSequence r5 = r11.text
            r6 = 0
            int r7 = r5.length()
            int r0 = r0.centerX()
            float r8 = (float) r0
            float r9 = (float) r1
            com.google.android.material.internal.TextDrawableHelper r0 = r11.textDrawableHelper
            android.text.TextPaint r10 = r0.getTextPaint()
            r4 = r12
            r4.drawText(r5, r6, r7, r8, r9, r10)
            return
    }

    private float getTextWidth() {
            r2 = this;
            java.lang.CharSequence r0 = r2.text
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.material.internal.TextDrawableHelper r1 = r2.textDrawableHelper
            java.lang.String r0 = r0.toString()
            float r0 = r1.getTextWidth(r0)
            return r0
    }

    private void loadFromAttributes(android.util.AttributeSet r8, int r9, int r10) {
            r7 = this;
            android.content.Context r0 = r7.context
            int[] r2 = com.google.android.material.C0479R.styleable.Tooltip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            android.content.Context r9 = r7.context
            android.content.res.Resources r9 = r9.getResources()
            int r10 = com.google.android.material.C0479R.dimen.mtrl_tooltip_arrowSize
            int r9 = r9.getDimensionPixelSize(r10)
            r7.arrowSize = r9
            com.google.android.material.shape.ShapeAppearanceModel r9 = r7.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = r9.toBuilder()
            com.google.android.material.shape.EdgeTreatment r10 = r7.createMarkerEdge()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = r9.setBottomEdge(r10)
            com.google.android.material.shape.ShapeAppearanceModel r9 = r9.build()
            r7.setShapeAppearanceModel(r9)
            int r9 = com.google.android.material.C0479R.styleable.Tooltip_android_text
            java.lang.CharSequence r9 = r8.getText(r9)
            r7.setText(r9)
            android.content.Context r9 = r7.context
            int r10 = com.google.android.material.C0479R.styleable.Tooltip_android_textAppearance
            com.google.android.material.resources.TextAppearance r9 = com.google.android.material.resources.MaterialResources.getTextAppearance(r9, r8, r10)
            r7.setTextAppearance(r9)
            android.content.Context r9 = r7.context
            int r10 = com.google.android.material.C0479R.attr.colorOnBackground
            java.lang.Class<com.google.android.material.tooltip.TooltipDrawable> r0 = com.google.android.material.tooltip.TooltipDrawable.class
            java.lang.String r1 = r0.getCanonicalName()
            int r9 = com.google.android.material.color.MaterialColors.getColor(r9, r10, r1)
            android.content.Context r10 = r7.context
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            java.lang.String r2 = r0.getCanonicalName()
            int r10 = com.google.android.material.color.MaterialColors.getColor(r10, r1, r2)
            r1 = 229(0xe5, float:3.21E-43)
            int r10 = androidx.core.graphics.ColorUtils.setAlphaComponent(r10, r1)
            r1 = 153(0x99, float:2.14E-43)
            int r9 = androidx.core.graphics.ColorUtils.setAlphaComponent(r9, r1)
            int r9 = com.google.android.material.color.MaterialColors.layer(r10, r9)
            int r10 = com.google.android.material.C0479R.styleable.Tooltip_backgroundTint
            int r9 = r8.getColor(r10, r9)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r7.setFillColor(r9)
            android.content.Context r9 = r7.context
            int r10 = com.google.android.material.C0479R.attr.colorSurface
            java.lang.String r0 = r0.getCanonicalName()
            int r9 = com.google.android.material.color.MaterialColors.getColor(r9, r10, r0)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r7.setStrokeColor(r9)
            int r9 = com.google.android.material.C0479R.styleable.Tooltip_android_padding
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.padding = r9
            int r9 = com.google.android.material.C0479R.styleable.Tooltip_android_minWidth
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.minWidth = r9
            int r9 = com.google.android.material.C0479R.styleable.Tooltip_android_minHeight
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.minHeight = r9
            int r9 = com.google.android.material.C0479R.styleable.Tooltip_android_layout_margin
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.layoutMargin = r9
            r8.recycle()
            return
    }

    private void updateLocationOnScreen(android.view.View r3) {
            r2 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r3.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            r2.locationOnScreenX = r0
            android.graphics.Rect r0 = r2.displayFrame
            r3.getWindowVisibleDisplayFrame(r0)
            return
    }

    public void detachView(android.view.View r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            android.view.View$OnLayoutChangeListener r0 = r1.attachedViewLayoutChangeListener
            r2.removeOnLayoutChangeListener(r0)
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            r9.save()
            float r0 = r8.calculatePointerOffset()
            int r1 = r8.arrowSize
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = r1 * r3
            int r3 = r8.arrowSize
            double r3 = (double) r3
            double r1 = r1 - r3
            double r1 = -r1
            float r1 = (float) r1
            float r2 = r8.tooltipScaleX
            float r3 = r8.tooltipScaleY
            android.graphics.Rect r4 = r8.getBounds()
            int r4 = r4.left
            float r4 = (float) r4
            android.graphics.Rect r5 = r8.getBounds()
            int r5 = r5.width()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            float r4 = r4 + r5
            android.graphics.Rect r5 = r8.getBounds()
            int r5 = r5.top
            float r5 = (float) r5
            android.graphics.Rect r6 = r8.getBounds()
            int r6 = r6.height()
            float r6 = (float) r6
            float r7 = r8.tooltipPivotY
            float r6 = r6 * r7
            float r5 = r5 + r6
            r9.scale(r2, r3, r4, r5)
            r9.translate(r0, r1)
            super.draw(r9)
            r8.drawText(r9)
            r9.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            float r0 = r0.getTextSize()
            int r1 = r2.minHeight
            float r1 = (float) r1
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r2 = this;
            int r0 = r2.padding
            int r0 = r0 * 2
            float r0 = (float) r0
            float r1 = r2.getTextWidth()
            float r0 = r0 + r1
            int r1 = r2.minWidth
            float r1 = (float) r1
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (int) r0
            return r0
    }

    public int getLayoutMargin() {
            r1 = this;
            int r0 = r1.layoutMargin
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.minHeight
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.minWidth
            return r0
    }

    public java.lang.CharSequence getText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.text
            return r0
    }

    public com.google.android.material.resources.TextAppearance getTextAppearance() {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            return r0
    }

    public int getTextPadding() {
            r1 = this;
            int r0 = r1.padding
            return r0
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            super.onBoundsChange(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r1.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.toBuilder()
            com.google.android.material.shape.EdgeTreatment r0 = r1.createMarkerEdge()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.setBottomEdge(r0)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            r1.setShapeAppearanceModel(r2)
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] r1) {
            r0 = this;
            boolean r1 = super.onStateChange(r1)
            return r1
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    public void setLayoutMargin(int r1) {
            r0 = this;
            r0.layoutMargin = r1
            r0.invalidateSelf()
            return
    }

    public void setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.invalidateSelf()
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.invalidateSelf()
            return
    }

    public void setRelativeToView(android.view.View r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r1.updateLocationOnScreen(r2)
            android.view.View$OnLayoutChangeListener r0 = r1.attachedViewLayoutChangeListener
            r2.addOnLayoutChangeListener(r0)
            return
    }

    public void setRevealFraction(float r4) {
            r3 = this;
            r0 = 1067030938(0x3f99999a, float:1.2)
            r3.tooltipPivotY = r0
            r3.tooltipScaleX = r4
            r3.tooltipScaleY = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1044549468(0x3e428f5c, float:0.19)
            r2 = 0
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r2, r0, r1, r0, r4)
            r3.labelOpacity = r4
            r3.invalidateSelf()
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.text
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L13
            r1.text = r2
            com.google.android.material.internal.TextDrawableHelper r2 = r1.textDrawableHelper
            r0 = 1
            r2.setTextWidthDirty(r0)
            r1.invalidateSelf()
        L13:
            return
    }

    public void setTextAppearance(com.google.android.material.resources.TextAppearance r3) {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.content.Context r1 = r2.context
            r0.setTextAppearance(r3, r1)
            return
    }

    public void setTextAppearanceResource(int r3) {
            r2 = this;
            com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
            android.content.Context r1 = r2.context
            r0.<init>(r1, r3)
            r2.setTextAppearance(r0)
            return
    }

    public void setTextPadding(int r1) {
            r0 = this;
            r0.padding = r1
            r0.invalidateSelf()
            return
    }

    public void setTextResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }
}
