package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
class BorderDrawable extends android.graphics.drawable.Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private android.content.res.ColorStateList borderTint;
    float borderWidth;
    private int bottomInnerStrokeColor;
    private int bottomOuterStrokeColor;
    private final android.graphics.RectF boundsRectF;
    private int currentBorderTintColor;
    private boolean invalidateShader;
    private final android.graphics.Paint paint;
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider;
    private final android.graphics.Rect rect;
    private final android.graphics.RectF rectF;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private final android.graphics.Path shapePath;
    private final com.google.android.material.floatingactionbutton.BorderDrawable.BorderState state;
    private int topInnerStrokeColor;
    private int topOuterStrokeColor;

    /* renamed from: com.google.android.material.floatingactionbutton.BorderDrawable$1 */
    static /* synthetic */ class C05651 {
    }

    private class BorderState extends android.graphics.drawable.Drawable.ConstantState {
        final /* synthetic */ com.google.android.material.floatingactionbutton.BorderDrawable this$0;

        private BorderState(com.google.android.material.floatingactionbutton.BorderDrawable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ BorderState(com.google.android.material.floatingactionbutton.BorderDrawable r1, com.google.android.material.floatingactionbutton.BorderDrawable.C05651 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                com.google.android.material.floatingactionbutton.BorderDrawable r0 = r1.this$0
                return r0
        }
    }

    BorderDrawable(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            r2.<init>()
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            r2.pathProvider = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.shapePath = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.rect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.rectF = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.boundsRectF = r0
            com.google.android.material.floatingactionbutton.BorderDrawable$BorderState r0 = new com.google.android.material.floatingactionbutton.BorderDrawable$BorderState
            r1 = 0
            r0.<init>(r2, r1)
            r2.state = r0
            r0 = 1
            r2.invalidateShader = r0
            r2.shapeAppearanceModel = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r0)
            r2.paint = r3
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            return
    }

    private android.graphics.Shader createGradientShader() {
            r11 = this;
            android.graphics.Rect r0 = r11.rect
            r11.copyBounds(r0)
            float r1 = r11.borderWidth
            int r2 = r0.height()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 6
            int[] r8 = new int[r2]
            int r3 = r11.topOuterStrokeColor
            int r4 = r11.currentBorderTintColor
            int r3 = androidx.core.graphics.ColorUtils.compositeColors(r3, r4)
            r4 = 0
            r8[r4] = r3
            int r3 = r11.topInnerStrokeColor
            int r5 = r11.currentBorderTintColor
            int r3 = androidx.core.graphics.ColorUtils.compositeColors(r3, r5)
            r5 = 1
            r8[r5] = r3
            int r3 = r11.topInnerStrokeColor
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r3, r4)
            int r6 = r11.currentBorderTintColor
            int r3 = androidx.core.graphics.ColorUtils.compositeColors(r3, r6)
            r6 = 2
            r8[r6] = r3
            int r3 = r11.bottomInnerStrokeColor
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r3, r4)
            int r7 = r11.currentBorderTintColor
            int r3 = androidx.core.graphics.ColorUtils.compositeColors(r3, r7)
            r7 = 3
            r8[r7] = r3
            int r3 = r11.bottomInnerStrokeColor
            int r9 = r11.currentBorderTintColor
            int r3 = androidx.core.graphics.ColorUtils.compositeColors(r3, r9)
            r9 = 4
            r8[r9] = r3
            int r3 = r11.bottomOuterStrokeColor
            int r10 = r11.currentBorderTintColor
            int r3 = androidx.core.graphics.ColorUtils.compositeColors(r3, r10)
            r10 = 5
            r8[r10] = r3
            float[] r2 = new float[r2]
            r3 = 0
            r2[r4] = r3
            r2[r5] = r1
            r3 = 1056964608(0x3f000000, float:0.5)
            r2[r6] = r3
            r2[r7] = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3 - r1
            r2[r9] = r1
            r2[r10] = r3
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r4 = 0
            int r3 = r0.top
            float r5 = (float) r3
            r6 = 0
            int r0 = r0.bottom
            float r7 = (float) r0
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3 = r1
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.invalidateShader
            if (r0 == 0) goto L10
            android.graphics.Paint r0 = r4.paint
            android.graphics.Shader r1 = r4.createGradientShader()
            r0.setShader(r1)
            r0 = 0
            r4.invalidateShader = r0
        L10:
            android.graphics.Paint r0 = r4.paint
            float r0 = r0.getStrokeWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.Rect r2 = r4.rect
            r4.copyBounds(r2)
            android.graphics.RectF r2 = r4.rectF
            android.graphics.Rect r3 = r4.rect
            r2.set(r3)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r2 = r2.getTopLeftCornerSize()
            android.graphics.RectF r3 = r4.getBoundsAsRectF()
            float r2 = r2.getCornerSize(r3)
            android.graphics.RectF r3 = r4.rectF
            float r3 = r3.width()
            float r3 = r3 / r1
            float r1 = java.lang.Math.min(r2, r3)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r4.shapeAppearanceModel
            android.graphics.RectF r3 = r4.getBoundsAsRectF()
            boolean r2 = r2.isRoundRect(r3)
            if (r2 == 0) goto L56
            android.graphics.RectF r2 = r4.rectF
            r2.inset(r0, r0)
            android.graphics.RectF r0 = r4.rectF
            android.graphics.Paint r2 = r4.paint
            r5.drawRoundRect(r0, r1, r1, r2)
        L56:
            return
    }

    protected android.graphics.RectF getBoundsAsRectF() {
            r2 = this;
            android.graphics.RectF r0 = r2.boundsRectF
            android.graphics.Rect r1 = r2.getBounds()
            r0.set(r1)
            android.graphics.RectF r0 = r2.boundsRectF
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.google.android.material.floatingactionbutton.BorderDrawable$BorderState r0 = r1.state
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r2 = this;
            float r0 = r2.borderWidth
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            r0 = -3
            goto La
        L9:
            r0 = -2
        La:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r6) {
            r5 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r5.shapeAppearanceModel
            android.graphics.RectF r1 = r5.getBoundsAsRectF()
            boolean r0 = r0.isRoundRect(r1)
            if (r0 == 0) goto L22
            com.google.android.material.shape.ShapeAppearanceModel r0 = r5.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
            android.graphics.RectF r1 = r5.getBoundsAsRectF()
            float r0 = r0.getCornerSize(r1)
            android.graphics.Rect r1 = r5.getBounds()
            r6.setRoundRect(r1, r0)
            return
        L22:
            android.graphics.Rect r0 = r5.rect
            r5.copyBounds(r0)
            android.graphics.RectF r0 = r5.rectF
            android.graphics.Rect r1 = r5.rect
            r0.set(r1)
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = r5.pathProvider
            com.google.android.material.shape.ShapeAppearanceModel r1 = r5.shapeAppearanceModel
            android.graphics.RectF r2 = r5.rectF
            android.graphics.Path r3 = r5.shapePath
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.calculatePath(r1, r4, r2, r3)
            android.graphics.Path r0 = r5.shapePath
            boolean r0 = r0.isConvex()
            if (r0 == 0) goto L48
            android.graphics.Path r0 = r5.shapePath
            r6.setConvexPath(r0)
        L48:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r3) {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            boolean r0 = r0.isRoundRect(r1)
            if (r0 == 0) goto L15
            float r0 = r2.borderWidth
            int r0 = java.lang.Math.round(r0)
            r3.set(r0, r0, r0, r0)
        L15:
            r3 = 1
            return r3
    }

    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.borderTint
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L10
        La:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            r1 = 1
            r0.invalidateShader = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.borderTint
            if (r0 == 0) goto L13
            int r1 = r2.currentBorderTintColor
            int r3 = r0.getColorForState(r3, r1)
            int r0 = r2.currentBorderTintColor
            if (r3 == r0) goto L13
            r0 = 1
            r2.invalidateShader = r0
            r2.currentBorderTintColor = r3
        L13:
            boolean r3 = r2.invalidateShader
            if (r3 == 0) goto L1a
            r2.invalidateSelf()
        L1a:
            boolean r3 = r2.invalidateShader
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.paint
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    void setBorderTint(android.content.res.ColorStateList r3) {
            r2 = this;
            if (r3 == 0) goto Le
            int[] r0 = r2.getState()
            int r1 = r2.currentBorderTintColor
            int r0 = r3.getColorForState(r0, r1)
            r2.currentBorderTintColor = r0
        Le:
            r2.borderTint = r3
            r3 = 1
            r2.invalidateShader = r3
            r2.invalidateSelf()
            return
    }

    public void setBorderWidth(float r3) {
            r2 = this;
            float r0 = r2.borderWidth
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L17
            r2.borderWidth = r3
            android.graphics.Paint r0 = r2.paint
            r1 = 1068149139(0x3faaa993, float:1.3333)
            float r3 = r3 * r1
            r0.setStrokeWidth(r3)
            r3 = 1
            r2.invalidateShader = r3
            r2.invalidateSelf()
        L17:
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

    void setGradientColors(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.topOuterStrokeColor = r1
            r0.topInnerStrokeColor = r2
            r0.bottomOuterStrokeColor = r3
            r0.bottomInnerStrokeColor = r4
            return
    }

    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            r0.shapeAppearanceModel = r1
            r0.invalidateSelf()
            return
    }
}
