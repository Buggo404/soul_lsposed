package androidx.cardview.widget;

/* loaded from: classes.dex */
class RoundRectDrawableWithShadow extends android.graphics.drawable.Drawable {
    private static final double COS_45 = 0.0d;
    private static final float SHADOW_MULTIPLIER = 1.5f;
    static androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper sRoundRectHelper;
    private boolean mAddPaddingForCorners;
    private android.content.res.ColorStateList mBackground;
    private final android.graphics.RectF mCardBounds;
    private float mCornerRadius;
    private android.graphics.Paint mCornerShadowPaint;
    private android.graphics.Path mCornerShadowPath;
    private boolean mDirty;
    private android.graphics.Paint mEdgeShadowPaint;
    private final int mInsetShadow;
    private android.graphics.Paint mPaint;
    private boolean mPrintedShadowClipWarning;
    private float mRawMaxShadowSize;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;

    interface RoundRectHelper {
        void drawRoundRect(android.graphics.Canvas r1, android.graphics.RectF r2, float r3, android.graphics.Paint r4);
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            androidx.cardview.widget.RoundRectDrawableWithShadow.COS_45 = r0
            return
    }

    RoundRectDrawableWithShadow(android.content.res.Resources r3, android.content.res.ColorStateList r4, float r5, float r6, float r7) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mDirty = r0
            r2.mAddPaddingForCorners = r0
            r0 = 0
            r2.mPrintedShadowClipWarning = r0
            int r1 = androidx.cardview.C0109R.color.cardview_shadow_start_color
            int r1 = r3.getColor(r1)
            r2.mShadowStartColor = r1
            int r1 = androidx.cardview.C0109R.color.cardview_shadow_end_color
            int r1 = r3.getColor(r1)
            r2.mShadowEndColor = r1
            int r1 = androidx.cardview.C0109R.dimen.cardview_compat_inset_shadow
            int r3 = r3.getDimensionPixelSize(r1)
            r2.mInsetShadow = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r1 = 5
            r3.<init>(r1)
            r2.mPaint = r3
            r2.setBackground(r4)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r1)
            r2.mCornerShadowPaint = r3
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r3.setStyle(r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r3
            int r3 = (int) r5
            float r3 = (float) r3
            r2.mCornerRadius = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.mCardBounds = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            android.graphics.Paint r4 = r2.mCornerShadowPaint
            r3.<init>(r4)
            r2.mEdgeShadowPaint = r3
            r3.setAntiAlias(r0)
            r2.setShadowSize(r6, r7)
            return
    }

    private void buildComponents(android.graphics.Rect r7) {
            r6 = this;
            float r0 = r6.mRawMaxShadowSize
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r1
            android.graphics.RectF r1 = r6.mCardBounds
            int r2 = r7.left
            float r2 = (float) r2
            float r3 = r6.mRawMaxShadowSize
            float r2 = r2 + r3
            int r3 = r7.top
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r7.right
            float r4 = (float) r4
            float r5 = r6.mRawMaxShadowSize
            float r4 = r4 - r5
            int r7 = r7.bottom
            float r7 = (float) r7
            float r7 = r7 - r0
            r1.set(r2, r3, r4, r7)
            r6.buildShadowCorners()
            return
    }

    private void buildShadowCorners() {
            r25 = this;
            r0 = r25
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r0.mCornerRadius
            float r3 = -r2
            float r4 = -r2
            r1.<init>(r3, r4, r2, r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r1)
            float r3 = r0.mShadowSize
            float r4 = -r3
            float r3 = -r3
            r2.inset(r4, r3)
            android.graphics.Path r3 = r0.mCornerShadowPath
            if (r3 != 0) goto L23
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.mCornerShadowPath = r3
            goto L26
        L23:
            r3.reset()
        L26:
            android.graphics.Path r3 = r0.mCornerShadowPath
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.EVEN_ODD
            r3.setFillType(r4)
            android.graphics.Path r3 = r0.mCornerShadowPath
            float r4 = r0.mCornerRadius
            float r4 = -r4
            r5 = 0
            r3.moveTo(r4, r5)
            android.graphics.Path r3 = r0.mCornerShadowPath
            float r4 = r0.mShadowSize
            float r4 = -r4
            r3.rLineTo(r4, r5)
            android.graphics.Path r3 = r0.mCornerShadowPath
            r4 = 1127481344(0x43340000, float:180.0)
            r6 = 1119092736(0x42b40000, float:90.0)
            r7 = 0
            r3.arcTo(r2, r4, r6, r7)
            android.graphics.Path r2 = r0.mCornerShadowPath
            r3 = 1132920832(0x43870000, float:270.0)
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2.arcTo(r1, r3, r4, r7)
            android.graphics.Path r1 = r0.mCornerShadowPath
            r1.close()
            float r1 = r0.mCornerRadius
            float r2 = r0.mShadowSize
            float r2 = r2 + r1
            float r1 = r1 / r2
            android.graphics.Paint r2 = r0.mCornerShadowPaint
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r9 = 0
            r10 = 0
            float r4 = r0.mCornerRadius
            float r6 = r0.mShadowSize
            float r11 = r4 + r6
            r4 = 3
            int[] r12 = new int[r4]
            int r6 = r0.mShadowStartColor
            r12[r7] = r6
            r15 = 1
            r12[r15] = r6
            int r6 = r0.mShadowEndColor
            r16 = 2
            r12[r16] = r6
            float[] r13 = new float[r4]
            r13[r7] = r5
            r13[r15] = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r13[r16] = r1
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.setShader(r3)
            android.graphics.Paint r1 = r0.mEdgeShadowPaint
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            r18 = 0
            float r3 = r0.mCornerRadius
            float r5 = -r3
            float r6 = r0.mShadowSize
            float r19 = r5 + r6
            r20 = 0
            float r3 = -r3
            float r21 = r3 - r6
            int[] r3 = new int[r4]
            int r5 = r0.mShadowStartColor
            r3[r7] = r5
            r3[r15] = r5
            int r5 = r0.mShadowEndColor
            r3[r16] = r5
            float[] r4 = new float[r4]
            r4 = {x00c2: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            android.graphics.Shader$TileMode r24 = android.graphics.Shader.TileMode.CLAMP
            r17 = r2
            r22 = r3
            r23 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r1.setShader(r2)
            android.graphics.Paint r1 = r0.mEdgeShadowPaint
            r1.setAntiAlias(r7)
            return
    }

    static float calculateHorizontalPadding(float r6, float r7, boolean r8) {
            if (r8 == 0) goto Lc
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = androidx.cardview.widget.RoundRectDrawableWithShadow.COS_45
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
        Lc:
            return r6
    }

    static float calculateVerticalPadding(float r6, float r7, boolean r8) {
            r0 = 1069547520(0x3fc00000, float:1.5)
            if (r8 == 0) goto L10
            float r6 = r6 * r0
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = androidx.cardview.widget.RoundRectDrawableWithShadow.COS_45
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

    private void drawShadow(android.graphics.Canvas r13) {
            r12 = this;
            float r0 = r12.mCornerRadius
            float r1 = -r0
            float r2 = r12.mShadowSize
            float r1 = r1 - r2
            int r2 = r12.mInsetShadow
            float r2 = (float) r2
            float r0 = r0 + r2
            float r2 = r12.mRawShadowSize
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 + r2
            android.graphics.RectF r2 = r12.mCardBounds
            float r2 = r2.width()
            float r9 = r0 * r3
            float r2 = r2 - r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r2 <= 0) goto L22
            r2 = r4
            goto L23
        L22:
            r2 = r5
        L23:
            android.graphics.RectF r6 = r12.mCardBounds
            float r6 = r6.height()
            float r6 = r6 - r9
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L30
            r10 = r4
            goto L31
        L30:
            r10 = r5
        L31:
            int r11 = r13.save()
            android.graphics.RectF r3 = r12.mCardBounds
            float r3 = r3.left
            float r3 = r3 + r0
            android.graphics.RectF r4 = r12.mCardBounds
            float r4 = r4.top
            float r4 = r4 + r0
            r13.translate(r3, r4)
            android.graphics.Path r3 = r12.mCornerShadowPath
            android.graphics.Paint r4 = r12.mCornerShadowPaint
            r13.drawPath(r3, r4)
            if (r2 == 0) goto L5e
            r4 = 0
            android.graphics.RectF r3 = r12.mCardBounds
            float r3 = r3.width()
            float r6 = r3 - r9
            float r3 = r12.mCornerRadius
            float r7 = -r3
            android.graphics.Paint r8 = r12.mEdgeShadowPaint
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L5e:
            r13.restoreToCount(r11)
            int r11 = r13.save()
            android.graphics.RectF r3 = r12.mCardBounds
            float r3 = r3.right
            float r3 = r3 - r0
            android.graphics.RectF r4 = r12.mCardBounds
            float r4 = r4.bottom
            float r4 = r4 - r0
            r13.translate(r3, r4)
            r3 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r3)
            android.graphics.Path r3 = r12.mCornerShadowPath
            android.graphics.Paint r4 = r12.mCornerShadowPaint
            r13.drawPath(r3, r4)
            if (r2 == 0) goto L97
            r4 = 0
            android.graphics.RectF r2 = r12.mCardBounds
            float r2 = r2.width()
            float r6 = r2 - r9
            float r2 = r12.mCornerRadius
            float r2 = -r2
            float r3 = r12.mShadowSize
            float r7 = r2 + r3
            android.graphics.Paint r8 = r12.mEdgeShadowPaint
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L97:
            r13.restoreToCount(r11)
            int r2 = r13.save()
            android.graphics.RectF r3 = r12.mCardBounds
            float r3 = r3.left
            float r3 = r3 + r0
            android.graphics.RectF r4 = r12.mCardBounds
            float r4 = r4.bottom
            float r4 = r4 - r0
            r13.translate(r3, r4)
            r3 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r3)
            android.graphics.Path r3 = r12.mCornerShadowPath
            android.graphics.Paint r4 = r12.mCornerShadowPaint
            r13.drawPath(r3, r4)
            if (r10 == 0) goto Lcc
            r4 = 0
            android.graphics.RectF r3 = r12.mCardBounds
            float r3 = r3.height()
            float r6 = r3 - r9
            float r3 = r12.mCornerRadius
            float r7 = -r3
            android.graphics.Paint r8 = r12.mEdgeShadowPaint
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        Lcc:
            r13.restoreToCount(r2)
            int r2 = r13.save()
            android.graphics.RectF r3 = r12.mCardBounds
            float r3 = r3.right
            float r3 = r3 - r0
            android.graphics.RectF r4 = r12.mCardBounds
            float r4 = r4.top
            float r4 = r4 + r0
            r13.translate(r3, r4)
            r0 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r0)
            android.graphics.Path r0 = r12.mCornerShadowPath
            android.graphics.Paint r3 = r12.mCornerShadowPaint
            r13.drawPath(r0, r3)
            if (r10 == 0) goto L101
            r4 = 0
            android.graphics.RectF r0 = r12.mCardBounds
            float r0 = r0.height()
            float r6 = r0 - r9
            float r0 = r12.mCornerRadius
            float r7 = -r0
            android.graphics.Paint r8 = r12.mEdgeShadowPaint
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L101:
            r13.restoreToCount(r2)
            return
    }

    private void setBackground(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L7:
            r3.mBackground = r4
            android.graphics.Paint r0 = r3.mPaint
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.mBackground
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return
    }

    private void setShadowSize(float r4, float r5) {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = ". Must be >= 0"
            if (r1 < 0) goto L5f
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L46
            int r4 = r3.toEven(r4)
            float r4 = (float) r4
            int r5 = r3.toEven(r5)
            float r5 = (float) r5
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L21
            boolean r4 = r3.mPrintedShadowClipWarning
            if (r4 != 0) goto L20
            r3.mPrintedShadowClipWarning = r1
        L20:
            r4 = r5
        L21:
            float r0 = r3.mRawShadowSize
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L2e
            float r0 = r3.mRawMaxShadowSize
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L2e
            return
        L2e:
            r3.mRawShadowSize = r4
            r3.mRawMaxShadowSize = r5
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r5
            int r5 = r3.mInsetShadow
            float r5 = (float) r5
            float r4 = r4 + r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            float r4 = (float) r4
            r3.mShadowSize = r4
            r3.mDirty = r1
            r3.invalidateSelf()
            return
        L46:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid max shadow size "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid shadow size "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    private int toEven(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r3 = (int) r3
            int r0 = r3 % 2
            r1 = 1
            if (r0 != r1) goto La
            int r3 = r3 - r1
        La:
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.mDirty
            if (r0 == 0) goto Le
            android.graphics.Rect r0 = r4.getBounds()
            r4.buildComponents(r0)
            r0 = 0
            r4.mDirty = r0
        Le:
            float r0 = r4.mRawShadowSize
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2 = 0
            r5.translate(r2, r0)
            r4.drawShadow(r5)
            float r0 = r4.mRawShadowSize
            float r0 = -r0
            float r0 = r0 / r1
            r5.translate(r2, r0)
            androidx.cardview.widget.RoundRectDrawableWithShadow$RoundRectHelper r0 = androidx.cardview.widget.RoundRectDrawableWithShadow.sRoundRectHelper
            android.graphics.RectF r1 = r4.mCardBounds
            float r2 = r4.mCornerRadius
            android.graphics.Paint r3 = r4.mPaint
            r0.drawRoundRect(r5, r1, r2, r3)
            return
    }

    android.content.res.ColorStateList getColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBackground
            return r0
    }

    float getCornerRadius() {
            r1 = this;
            float r0 = r1.mCornerRadius
            return r0
    }

    void getMaxShadowAndCornerPadding(android.graphics.Rect r1) {
            r0 = this;
            r0.getPadding(r1)
            return
    }

    float getMaxShadowSize() {
            r1 = this;
            float r0 = r1.mRawMaxShadowSize
            return r0
    }

    float getMinHeight() {
            r5 = this;
            float r0 = r5.mRawMaxShadowSize
            float r1 = r5.mCornerRadius
            int r2 = r5.mInsetShadow
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r0 * r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r4
            float r1 = r5.mRawMaxShadowSize
            float r1 = r1 * r2
            int r2 = r5.mInsetShadow
            float r2 = (float) r2
            float r1 = r1 + r2
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    float getMinWidth() {
            r4 = this;
            float r0 = r4.mRawMaxShadowSize
            float r1 = r4.mCornerRadius
            int r2 = r4.mInsetShadow
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r2
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r2
            float r1 = r4.mRawMaxShadowSize
            int r3 = r4.mInsetShadow
            float r3 = (float) r3
            float r1 = r1 + r3
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r5) {
            r4 = this;
            float r0 = r4.mRawMaxShadowSize
            float r1 = r4.mCornerRadius
            boolean r2 = r4.mAddPaddingForCorners
            float r0 = calculateVerticalPadding(r0, r1, r2)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r4.mRawMaxShadowSize
            float r2 = r4.mCornerRadius
            boolean r3 = r4.mAddPaddingForCorners
            float r1 = calculateHorizontalPadding(r1, r2, r3)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r5.set(r1, r0, r1, r0)
            r5 = 1
            return r5
    }

    float getShadowSize() {
            r1 = this;
            float r0 = r1.mRawShadowSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBackground
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
            super.onBoundsChange(r1)
            r1 = 1
            r0.mDirty = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.mBackground
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            android.graphics.Paint r0 = r2.mPaint
            int r0 = r0.getColor()
            if (r0 != r3) goto L14
            r3 = 0
            return r3
        L14:
            android.graphics.Paint r0 = r2.mPaint
            r0.setColor(r3)
            r3 = 1
            r2.mDirty = r3
            r2.invalidateSelf()
            return r3
    }

    void setAddPaddingForCorners(boolean r1) {
            r0 = this;
            r0.mAddPaddingForCorners = r1
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.mCornerShadowPaint
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.mEdgeShadowPaint
            r0.setAlpha(r2)
            return
    }

    void setColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setBackground(r1)
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            return
    }

    void setCornerRadius(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1a
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            float r4 = (float) r4
            float r0 = r3.mCornerRadius
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L11
            return
        L11:
            r3.mCornerRadius = r4
            r4 = 1
            r3.mDirty = r4
            r3.invalidateSelf()
            return
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid radius "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ". Must be >= 0"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    void setMaxShadowSize(float r2) {
            r1 = this;
            float r0 = r1.mRawShadowSize
            r1.setShadowSize(r0, r2)
            return
    }

    void setShadowSize(float r2) {
            r1 = this;
            float r0 = r1.mRawMaxShadowSize
            r1.setShadowSize(r2, r0)
            return
    }
}
