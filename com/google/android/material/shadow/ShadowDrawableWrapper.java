package com.google.android.material.shadow;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class ShadowDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapper {
    static final double COS_45 = 0.0d;
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final android.graphics.RectF contentBounds;
    float cornerRadius;
    final android.graphics.Paint cornerShadowPaint;
    android.graphics.Path cornerShadowPath;
    private boolean dirty;
    final android.graphics.Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            com.google.android.material.shadow.ShadowDrawableWrapper.COS_45 = r0
            return
    }

    public ShadowDrawableWrapper(android.content.Context r2, android.graphics.drawable.Drawable r3, float r4, float r5, float r6) {
            r1 = this;
            r1.<init>(r3)
            r3 = 1
            r1.dirty = r3
            r1.addPaddingForCorners = r3
            r3 = 0
            r1.printedShadowClipWarning = r3
            int r0 = com.google.android.material.C0479R.color.design_fab_shadow_start_color
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.shadowStartColor = r0
            int r0 = com.google.android.material.C0479R.color.design_fab_shadow_mid_color
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.shadowMiddleColor = r0
            int r0 = com.google.android.material.C0479R.color.design_fab_shadow_end_color
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.shadowEndColor = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 5
            r2.<init>(r0)
            r1.cornerShadowPaint = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            r1.cornerRadius = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r1.contentBounds = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r1.edgeShadowPaint = r4
            r4.setAntiAlias(r3)
            r1.setShadowSize(r5, r6)
            return
    }

    private void buildComponents(android.graphics.Rect r7) {
            r6 = this;
            float r0 = r6.rawMaxShadowSize
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r1
            android.graphics.RectF r1 = r6.contentBounds
            int r2 = r7.left
            float r2 = (float) r2
            float r3 = r6.rawMaxShadowSize
            float r2 = r2 + r3
            int r3 = r7.top
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r7.right
            float r4 = (float) r4
            float r5 = r6.rawMaxShadowSize
            float r4 = r4 - r5
            int r7 = r7.bottom
            float r7 = (float) r7
            float r7 = r7 - r0
            r1.set(r2, r3, r4, r7)
            android.graphics.drawable.Drawable r7 = r6.getWrappedDrawable()
            android.graphics.RectF r0 = r6.contentBounds
            float r0 = r0.left
            int r0 = (int) r0
            android.graphics.RectF r1 = r6.contentBounds
            float r1 = r1.top
            int r1 = (int) r1
            android.graphics.RectF r2 = r6.contentBounds
            float r2 = r2.right
            int r2 = (int) r2
            android.graphics.RectF r3 = r6.contentBounds
            float r3 = r3.bottom
            int r3 = (int) r3
            r7.setBounds(r0, r1, r2, r3)
            r6.buildShadowCorners()
            return
    }

    private void buildShadowCorners() {
            r25 = this;
            r0 = r25
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r0.cornerRadius
            float r3 = -r2
            float r4 = -r2
            r1.<init>(r3, r4, r2, r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r1)
            float r3 = r0.shadowSize
            float r4 = -r3
            float r3 = -r3
            r2.inset(r4, r3)
            android.graphics.Path r3 = r0.cornerShadowPath
            if (r3 != 0) goto L23
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.cornerShadowPath = r3
            goto L26
        L23:
            r3.reset()
        L26:
            android.graphics.Path r3 = r0.cornerShadowPath
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.EVEN_ODD
            r3.setFillType(r4)
            android.graphics.Path r3 = r0.cornerShadowPath
            float r4 = r0.cornerRadius
            float r4 = -r4
            r5 = 0
            r3.moveTo(r4, r5)
            android.graphics.Path r3 = r0.cornerShadowPath
            float r4 = r0.shadowSize
            float r4 = -r4
            r3.rLineTo(r4, r5)
            android.graphics.Path r3 = r0.cornerShadowPath
            r4 = 1127481344(0x43340000, float:180.0)
            r6 = 1119092736(0x42b40000, float:90.0)
            r7 = 0
            r3.arcTo(r2, r4, r6, r7)
            android.graphics.Path r3 = r0.cornerShadowPath
            r4 = 1132920832(0x43870000, float:270.0)
            r6 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r3.arcTo(r1, r4, r6, r7)
            android.graphics.Path r3 = r0.cornerShadowPath
            r3.close()
            float r3 = r2.top
            float r11 = -r3
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r4 = 2
            r6 = 1
            r15 = 3
            if (r3 <= 0) goto La2
            float r3 = r0.cornerRadius
            float r3 = r3 / r11
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r8 - r3
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r9 = r9 + r3
            android.graphics.Paint r14 = r0.cornerShadowPaint
            android.graphics.RadialGradient r13 = new android.graphics.RadialGradient
            r12 = 4
            int[] r10 = new int[r12]
            r10[r7] = r7
            int r8 = r0.shadowStartColor
            r10[r6] = r8
            int r8 = r0.shadowMiddleColor
            r10[r4] = r8
            int r8 = r0.shadowEndColor
            r10[r15] = r8
            float[] r12 = new float[r12]
            r12[r7] = r5
            r12[r6] = r3
            r12[r4] = r9
            r3 = 1065353216(0x3f800000, float:1.0)
            r12[r15] = r3
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            r8 = r13
            r5 = 0
            r9 = r5
            r16 = r10
            r5 = 0
            r10 = r5
            r5 = r12
            r12 = r16
            r4 = r13
            r13 = r5
            r5 = r14
            r14 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.setShader(r4)
        La2:
            android.graphics.Paint r3 = r0.edgeShadowPaint
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r18 = 0
            float r1 = r1.top
            r20 = 0
            float r2 = r2.top
            int[] r5 = new int[r15]
            int r8 = r0.shadowStartColor
            r5[r7] = r8
            int r8 = r0.shadowMiddleColor
            r5[r6] = r8
            int r6 = r0.shadowEndColor
            r8 = 2
            r5[r8] = r6
            float[] r6 = new float[r15]
            r6 = {x00da: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            android.graphics.Shader$TileMode r24 = android.graphics.Shader.TileMode.CLAMP
            r17 = r4
            r19 = r1
            r21 = r2
            r22 = r5
            r23 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.setShader(r4)
            android.graphics.Paint r1 = r0.edgeShadowPaint
            r1.setAntiAlias(r7)
            return
    }

    public static float calculateHorizontalPadding(float r6, float r7, boolean r8) {
            if (r8 == 0) goto Lc
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
        Lc:
            return r6
    }

    public static float calculateVerticalPadding(float r6, float r7, boolean r8) {
            r0 = 1069547520(0x3fc00000, float:1.5)
            if (r8 == 0) goto L10
            float r6 = r6 * r0
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
            return r6
        L10:
            float r6 = r6 * r0
            return r6
    }

    private void drawShadow(android.graphics.Canvas r21) {
            r20 = this;
            r0 = r20
            r7 = r21
            int r8 = r21.save()
            float r1 = r0.rotation
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.centerX()
            android.graphics.RectF r3 = r0.contentBounds
            float r3 = r3.centerY()
            r7.rotate(r1, r2, r3)
            float r9 = r0.cornerRadius
            float r1 = -r9
            float r2 = r0.shadowSize
            float r10 = r1 - r2
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.width()
            r2 = 1073741824(0x40000000, float:2.0)
            float r11 = r9 * r2
            float r1 = r1 - r11
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 <= 0) goto L34
            r12 = r3
            goto L35
        L34:
            r12 = r4
        L35:
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.height()
            float r1 = r1 - r11
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L42
            r13 = r3
            goto L43
        L42:
            r13 = r4
        L43:
            float r1 = r0.rawShadowSize
            r2 = 1048576000(0x3e800000, float:0.25)
            float r2 = r2 * r1
            float r2 = r1 - r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r1
            float r3 = r1 - r3
            r14 = 1065353216(0x3f800000, float:1.0)
            float r4 = r1 * r14
            float r1 = r1 - r4
            float r3 = r3 + r9
            float r15 = r9 / r3
            float r2 = r2 + r9
            float r6 = r9 / r2
            float r1 = r1 + r9
            float r5 = r9 / r1
            int r4 = r21.save()
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.left
            float r1 = r1 + r9
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.top
            float r2 = r2 + r9
            r7.translate(r1, r2)
            r7.scale(r15, r6)
            android.graphics.Path r1 = r0.cornerShadowPath
            android.graphics.Paint r2 = r0.cornerShadowPaint
            r7.drawPath(r1, r2)
            if (r12 == 0) goto La4
            float r1 = r14 / r15
            r7.scale(r1, r14)
            r2 = 0
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.width()
            float r16 = r1 - r11
            float r1 = r0.cornerRadius
            float r3 = -r1
            android.graphics.Paint r1 = r0.edgeShadowPaint
            r17 = r1
            r1 = r21
            r18 = r3
            r3 = r10
            r14 = r4
            r4 = r16
            r19 = r5
            r5 = r18
            r16 = r8
            r8 = r6
            r6 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            goto Laa
        La4:
            r14 = r4
            r19 = r5
            r16 = r8
            r8 = r6
        Laa:
            r7.restoreToCount(r14)
            int r14 = r21.save()
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.right
            float r1 = r1 - r9
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.bottom
            float r2 = r2 - r9
            r7.translate(r1, r2)
            r6 = r19
            r7.scale(r15, r6)
            r1 = 1127481344(0x43340000, float:180.0)
            r7.rotate(r1)
            android.graphics.Path r1 = r0.cornerShadowPath
            android.graphics.Paint r2 = r0.cornerShadowPaint
            r7.drawPath(r1, r2)
            if (r12 == 0) goto Lf5
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1 / r15
            r7.scale(r2, r1)
            r2 = 0
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.width()
            float r4 = r1 - r11
            float r1 = r0.cornerRadius
            float r1 = -r1
            float r3 = r0.shadowSize
            float r5 = r1 + r3
            android.graphics.Paint r12 = r0.edgeShadowPaint
            r1 = r21
            r3 = r10
            r17 = r8
            r8 = r6
            r6 = r12
            r1.drawRect(r2, r3, r4, r5, r6)
            goto Lf8
        Lf5:
            r17 = r8
            r8 = r6
        Lf8:
            r7.restoreToCount(r14)
            int r12 = r21.save()
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.left
            float r1 = r1 + r9
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.bottom
            float r2 = r2 - r9
            r7.translate(r1, r2)
            r7.scale(r15, r8)
            r1 = 1132920832(0x43870000, float:270.0)
            r7.rotate(r1)
            android.graphics.Path r1 = r0.cornerShadowPath
            android.graphics.Paint r2 = r0.cornerShadowPaint
            r7.drawPath(r1, r2)
            if (r13 == 0) goto L138
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r8
            r7.scale(r14, r1)
            r2 = 0
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.height()
            float r4 = r1 - r11
            float r1 = r0.cornerRadius
            float r5 = -r1
            android.graphics.Paint r6 = r0.edgeShadowPaint
            r1 = r21
            r3 = r10
            r1.drawRect(r2, r3, r4, r5, r6)
        L138:
            r7.restoreToCount(r12)
            int r8 = r21.save()
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.right
            float r1 = r1 - r9
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.top
            float r2 = r2 + r9
            r7.translate(r1, r2)
            r9 = r17
            r7.scale(r15, r9)
            r1 = 1119092736(0x42b40000, float:90.0)
            r7.rotate(r1)
            android.graphics.Path r1 = r0.cornerShadowPath
            android.graphics.Paint r2 = r0.cornerShadowPaint
            r7.drawPath(r1, r2)
            if (r13 == 0) goto L17a
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r9
            r7.scale(r14, r1)
            r2 = 0
            android.graphics.RectF r1 = r0.contentBounds
            float r1 = r1.height()
            float r4 = r1 - r11
            float r1 = r0.cornerRadius
            float r5 = -r1
            android.graphics.Paint r6 = r0.edgeShadowPaint
            r1 = r21
            r3 = r10
            r1.drawRect(r2, r3, r4, r5, r6)
        L17a:
            r7.restoreToCount(r8)
            r1 = r16
            r7.restoreToCount(r1)
            return
    }

    private static int toEven(float r2) {
            int r2 = java.lang.Math.round(r2)
            int r0 = r2 % 2
            r1 = 1
            if (r0 != r1) goto Lb
            int r2 = r2 + (-1)
        Lb:
            return r2
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.dirty
            if (r0 == 0) goto Le
            android.graphics.Rect r0 = r1.getBounds()
            r1.buildComponents(r0)
            r0 = 0
            r1.dirty = r0
        Le:
            r1.drawShadow(r2)
            super.draw(r2)
            return
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.cornerRadius
            return r0
    }

    public float getMaxShadowSize() {
            r1 = this;
            float r0 = r1.rawMaxShadowSize
            return r0
    }

    public float getMinHeight() {
            r5 = this;
            float r0 = r5.rawMaxShadowSize
            float r1 = r5.cornerRadius
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r0 * r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r4
            float r1 = r5.rawMaxShadowSize
            float r1 = r1 * r2
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    public float getMinWidth() {
            r4 = this;
            float r0 = r4.rawMaxShadowSize
            float r1 = r4.cornerRadius
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r2
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r2
            float r1 = r4.rawMaxShadowSize
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r5) {
            r4 = this;
            float r0 = r4.rawMaxShadowSize
            float r1 = r4.cornerRadius
            boolean r2 = r4.addPaddingForCorners
            float r0 = calculateVerticalPadding(r0, r1, r2)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r4.rawMaxShadowSize
            float r2 = r4.cornerRadius
            boolean r3 = r4.addPaddingForCorners
            float r1 = calculateHorizontalPadding(r1, r2, r3)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r5.set(r1, r0, r1, r0)
            r5 = 1
            return r5
    }

    public float getShadowSize() {
            r1 = this;
            float r0 = r1.rawShadowSize
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            r1 = 1
            r0.dirty = r1
            return
    }

    public void setAddPaddingForCorners(boolean r1) {
            r0 = this;
            r0.addPaddingForCorners = r1
            r0.invalidateSelf()
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            super.setAlpha(r2)
            android.graphics.Paint r0 = r1.cornerShadowPaint
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.edgeShadowPaint
            r0.setAlpha(r2)
            return
    }

    public void setCornerRadius(float r2) {
            r1 = this;
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r0 = r1.cornerRadius
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r1.cornerRadius = r2
            r2 = 1
            r1.dirty = r2
            r1.invalidateSelf()
            return
    }

    public void setMaxShadowSize(float r2) {
            r1 = this;
            float r0 = r1.rawShadowSize
            r1.setShadowSize(r0, r2)
            return
    }

    public final void setRotation(float r2) {
            r1 = this;
            float r0 = r1.rotation
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.rotation = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setShadowSize(float r2) {
            r1 = this;
            float r0 = r1.rawMaxShadowSize
            r1.setShadowSize(r2, r0)
            return
    }

    public void setShadowSize(float r3, float r4) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L42
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L42
            int r3 = toEven(r3)
            float r3 = (float) r3
            int r4 = toEven(r4)
            float r4 = (float) r4
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1f
            boolean r3 = r2.printedShadowClipWarning
            if (r3 != 0) goto L1e
            r2.printedShadowClipWarning = r1
        L1e:
            r3 = r4
        L1f:
            float r0 = r2.rawShadowSize
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2c
            float r0 = r2.rawMaxShadowSize
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L2c
            return
        L2c:
            r2.rawShadowSize = r3
            r2.rawMaxShadowSize = r4
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            r2.shadowSize = r3
            r2.maxShadowSize = r4
            r2.dirty = r1
            r2.invalidateSelf()
            return
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "invalid shadow size"
            r3.<init>(r4)
            throw r3
    }
}
