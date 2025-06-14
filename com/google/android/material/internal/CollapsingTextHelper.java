package com.google.android.material.internal;

/* loaded from: classes.dex */
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final android.graphics.Paint DEBUG_DRAW_PAINT = null;
    private static final java.lang.String ELLIPSIS_NORMAL = "…";
    private static final java.lang.String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;
    private final android.graphics.Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private com.google.android.material.resources.CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private android.content.res.ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private android.content.res.ColorStateList collapsedTextColor;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private android.graphics.Typeface collapsedTypeface;
    private final android.graphics.RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentTextSize;
    private android.graphics.Typeface currentTypeface;
    private boolean drawTitle;
    private final android.graphics.Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private float expandedFirstLineDrawX;
    private com.google.android.material.resources.CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private android.content.res.ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private android.content.res.ColorStateList expandedTextColor;
    private int expandedTextGravity;
    private float expandedTextSize;
    private android.graphics.Bitmap expandedTitleTexture;
    private android.graphics.Typeface expandedTypeface;
    private boolean isRtl;
    private int maxLines;
    private android.animation.TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private java.lang.CharSequence text;
    private android.text.StaticLayout textLayout;
    private final android.text.TextPaint textPaint;
    private android.animation.TimeInterpolator textSizeInterpolator;
    private java.lang.CharSequence textToDraw;
    private java.lang.CharSequence textToDrawCollapsed;
    private android.graphics.Paint texturePaint;
    private final android.text.TextPaint tmpPaint;
    private boolean useTexture;
    private final android.view.View view;



    static {
            r0 = 0
            com.google.android.material.internal.CollapsingTextHelper.USE_SCALING_TEXTURE = r0
            r0 = 0
            com.google.android.material.internal.CollapsingTextHelper.DEBUG_DRAW_PAINT = r0
            return
    }

    public CollapsingTextHelper(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 16
            r1.expandedTextGravity = r0
            r1.collapsedTextGravity = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r1.expandedTextSize = r0
            r1.collapsedTextSize = r0
            r0 = 1
            r1.maxLines = r0
            r1.view = r2
            android.text.TextPaint r2 = new android.text.TextPaint
            r0 = 129(0x81, float:1.81E-43)
            r2.<init>(r0)
            r1.textPaint = r2
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r2)
            r1.tmpPaint = r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.collapsedBounds = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.expandedBounds = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.currentBounds = r2
            return
    }

    private static int blendColors(int r5, int r6, float r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            int r1 = android.graphics.Color.alpha(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r6)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r1 = r1 + r2
            int r2 = android.graphics.Color.red(r5)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r3 = android.graphics.Color.red(r6)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r2 = r2 + r3
            int r3 = android.graphics.Color.green(r5)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r4 = android.graphics.Color.green(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r3 = r3 + r4
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r7
            float r5 = r5 + r6
            int r6 = (int) r1
            int r7 = (int) r2
            int r0 = (int) r3
            int r5 = (int) r5
            int r5 = android.graphics.Color.argb(r6, r7, r0, r5)
            return r5
    }

    private void calculateBaseOffsets() {
            r13 = this;
            float r0 = r13.currentTextSize
            float r1 = r13.collapsedTextSize
            r13.calculateUsingTextSize(r1)
            java.lang.CharSequence r1 = r13.textToDraw
            if (r1 == 0) goto L1e
            android.text.StaticLayout r2 = r13.textLayout
            if (r2 == 0) goto L1e
            android.text.TextPaint r3 = r13.textPaint
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r3, r2, r4)
            r13.textToDrawCollapsed = r1
        L1e:
            java.lang.CharSequence r1 = r13.textToDrawCollapsed
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L2f
            android.text.TextPaint r4 = r13.textPaint
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L30
        L2f:
            r1 = r3
        L30:
            int r4 = r13.collapsedTextGravity
            boolean r5 = r13.isRtl
            int r4 = androidx.core.view.GravityCompat.getAbsoluteGravity(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L6c
            if (r5 == r6) goto L5d
            android.text.TextPaint r5 = r13.textPaint
            float r5 = r5.descent()
            android.text.TextPaint r9 = r13.textPaint
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r13.collapsedBounds
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            r13.collapsedDrawY = r9
            goto L73
        L5d:
            android.graphics.Rect r5 = r13.collapsedBounds
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r13.textPaint
            float r9 = r9.ascent()
            float r5 = r5 + r9
            r13.collapsedDrawY = r5
            goto L73
        L6c:
            android.graphics.Rect r5 = r13.collapsedBounds
            int r5 = r5.top
            float r5 = (float) r5
            r13.collapsedDrawY = r5
        L73:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L8e
            if (r4 == r9) goto L85
            android.graphics.Rect r1 = r13.collapsedBounds
            int r1 = r1.left
            float r1 = (float) r1
            r13.collapsedDrawX = r1
            goto L99
        L85:
            android.graphics.Rect r4 = r13.collapsedBounds
            int r4 = r4.right
            float r4 = (float) r4
            float r4 = r4 - r1
            r13.collapsedDrawX = r4
            goto L99
        L8e:
            android.graphics.Rect r4 = r13.collapsedBounds
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
            float r4 = r4 - r1
            r13.collapsedDrawX = r4
        L99:
            float r1 = r13.expandedTextSize
            r13.calculateUsingTextSize(r1)
            android.text.StaticLayout r1 = r13.textLayout
            if (r1 == 0) goto La8
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto La9
        La8:
            r1 = r3
        La9:
            java.lang.CharSequence r4 = r13.textToDraw
            if (r4 == 0) goto Lb8
            android.text.TextPaint r11 = r13.textPaint
            int r12 = r4.length()
            float r4 = r11.measureText(r4, r2, r12)
            goto Lb9
        Lb8:
            r4 = r3
        Lb9:
            android.text.StaticLayout r11 = r13.textLayout
            if (r11 == 0) goto Lca
            int r12 = r13.maxLines
            if (r12 <= r10) goto Lca
            boolean r12 = r13.isRtl
            if (r12 != 0) goto Lca
            int r4 = r11.getWidth()
            float r4 = (float) r4
        Lca:
            android.text.StaticLayout r11 = r13.textLayout
            if (r11 == 0) goto Ld2
            float r3 = r11.getLineLeft(r2)
        Ld2:
            r13.expandedFirstLineDrawX = r3
            int r2 = r13.expandedTextGravity
            boolean r3 = r13.isRtl
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r3)
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 == r7) goto Lfe
            if (r3 == r6) goto Lee
            float r1 = r1 / r8
            android.graphics.Rect r3 = r13.expandedBounds
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r1
            r13.expandedDrawY = r3
            goto L105
        Lee:
            android.graphics.Rect r3 = r13.expandedBounds
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r1
            android.text.TextPaint r1 = r13.textPaint
            float r1 = r1.descent()
            float r3 = r3 + r1
            r13.expandedDrawY = r3
            goto L105
        Lfe:
            android.graphics.Rect r1 = r13.expandedBounds
            int r1 = r1.top
            float r1 = (float) r1
            r13.expandedDrawY = r1
        L105:
            r1 = r2 & r5
            if (r1 == r10) goto L11c
            if (r1 == r9) goto L113
            android.graphics.Rect r1 = r13.expandedBounds
            int r1 = r1.left
            float r1 = (float) r1
            r13.expandedDrawX = r1
            goto L127
        L113:
            android.graphics.Rect r1 = r13.expandedBounds
            int r1 = r1.right
            float r1 = (float) r1
            float r1 = r1 - r4
            r13.expandedDrawX = r1
            goto L127
        L11c:
            android.graphics.Rect r1 = r13.expandedBounds
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r4 = r4 / r8
            float r1 = r1 - r4
            r13.expandedDrawX = r1
        L127:
            r13.clearTexture()
            r13.setInterpolatedTextSize(r0)
            return
    }

    private void calculateCurrentOffsets() {
            r1 = this;
            float r0 = r1.expandedFraction
            r1.calculateOffsets(r0)
            return
    }

    private boolean calculateIsRtl(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = r3.isDefaultIsRtl()
            if (r0 == 0) goto L9
            androidx.core.text.TextDirectionHeuristicCompat r0 = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL
            goto Lb
        L9:
            androidx.core.text.TextDirectionHeuristicCompat r0 = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR
        Lb:
            r1 = 0
            int r2 = r4.length()
            boolean r4 = r0.isRtl(r4, r1, r2)
            return r4
    }

    private void calculateOffsets(float r7) {
            r6 = this;
            r6.interpolateBounds(r7)
            float r0 = r6.expandedDrawX
            float r1 = r6.collapsedDrawX
            android.animation.TimeInterpolator r2 = r6.positionInterpolator
            float r0 = lerp(r0, r1, r7, r2)
            r6.currentDrawX = r0
            float r0 = r6.expandedDrawY
            float r1 = r6.collapsedDrawY
            android.animation.TimeInterpolator r2 = r6.positionInterpolator
            float r0 = lerp(r0, r1, r7, r2)
            r6.currentDrawY = r0
            float r0 = r6.expandedTextSize
            float r1 = r6.collapsedTextSize
            android.animation.TimeInterpolator r2 = r6.textSizeInterpolator
            float r0 = lerp(r0, r1, r7, r2)
            r6.setInterpolatedTextSize(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 - r7
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r3 = 0
            float r1 = lerp(r3, r0, r1, r2)
            float r1 = r0 - r1
            r6.setCollapsedTextBlend(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            float r0 = lerp(r0, r3, r7, r1)
            r6.setExpandedTextBlend(r0)
            android.content.res.ColorStateList r0 = r6.collapsedTextColor
            android.content.res.ColorStateList r1 = r6.expandedTextColor
            if (r0 == r1) goto L59
            android.text.TextPaint r0 = r6.textPaint
            int r1 = r6.getCurrentExpandedTextColor()
            int r2 = r6.getCurrentCollapsedTextColor()
            int r1 = blendColors(r1, r2, r7)
            r0.setColor(r1)
            goto L62
        L59:
            android.text.TextPaint r0 = r6.textPaint
            int r1 = r6.getCurrentCollapsedTextColor()
            r0.setColor(r1)
        L62:
            float r0 = r6.collapsedLetterSpacing
            float r1 = r6.expandedLetterSpacing
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L76
            android.text.TextPaint r2 = r6.textPaint
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            float r0 = lerp(r1, r0, r7, r3)
            r2.setLetterSpacing(r0)
            goto L7b
        L76:
            android.text.TextPaint r1 = r6.textPaint
            r1.setLetterSpacing(r0)
        L7b:
            android.text.TextPaint r0 = r6.textPaint
            float r1 = r6.expandedShadowRadius
            float r2 = r6.collapsedShadowRadius
            r3 = 0
            float r1 = lerp(r1, r2, r7, r3)
            float r2 = r6.expandedShadowDx
            float r4 = r6.collapsedShadowDx
            float r2 = lerp(r2, r4, r7, r3)
            float r4 = r6.expandedShadowDy
            float r5 = r6.collapsedShadowDy
            float r3 = lerp(r4, r5, r7, r3)
            android.content.res.ColorStateList r4 = r6.expandedShadowColor
            int r4 = r6.getCurrentColor(r4)
            android.content.res.ColorStateList r5 = r6.collapsedShadowColor
            int r5 = r6.getCurrentColor(r5)
            int r7 = blendColors(r4, r5, r7)
            r0.setShadowLayer(r1, r2, r3, r7)
            android.view.View r7 = r6.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
            return
    }

    private void calculateUsingTextSize(float r9) {
            r8 = this;
            java.lang.CharSequence r0 = r8.text
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r0 = r8.collapsedBounds
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r8.expandedBounds
            int r1 = r1.width()
            float r1 = (float) r1
            float r2 = r8.collapsedTextSize
            boolean r2 = isClose(r9, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2f
            float r9 = r8.collapsedTextSize
            r8.scale = r3
            android.graphics.Typeface r1 = r8.currentTypeface
            android.graphics.Typeface r2 = r8.collapsedTypeface
            if (r1 == r2) goto L2d
            r8.currentTypeface = r2
            r1 = r5
            goto L5f
        L2d:
            r1 = r4
            goto L5f
        L2f:
            float r2 = r8.expandedTextSize
            android.graphics.Typeface r6 = r8.currentTypeface
            android.graphics.Typeface r7 = r8.expandedTypeface
            if (r6 == r7) goto L3b
            r8.currentTypeface = r7
            r6 = r5
            goto L3c
        L3b:
            r6 = r4
        L3c:
            boolean r7 = isClose(r9, r2)
            if (r7 == 0) goto L45
            r8.scale = r3
            goto L4a
        L45:
            float r7 = r8.expandedTextSize
            float r9 = r9 / r7
            r8.scale = r9
        L4a:
            float r9 = r8.collapsedTextSize
            float r7 = r8.expandedTextSize
            float r9 = r9 / r7
            float r7 = r1 * r9
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L5c
            float r0 = r0 / r9
            float r9 = java.lang.Math.min(r0, r1)
            r0 = r9
            goto L5d
        L5c:
            r0 = r1
        L5d:
            r9 = r2
            r1 = r6
        L5f:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L78
            float r2 = r8.currentTextSize
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L73
            boolean r2 = r8.boundsChanged
            if (r2 != 0) goto L73
            if (r1 == 0) goto L71
            goto L73
        L71:
            r1 = r4
            goto L74
        L73:
            r1 = r5
        L74:
            r8.currentTextSize = r9
            r8.boundsChanged = r4
        L78:
            java.lang.CharSequence r9 = r8.textToDraw
            if (r9 == 0) goto L7e
            if (r1 == 0) goto Lb6
        L7e:
            android.text.TextPaint r9 = r8.textPaint
            float r1 = r8.currentTextSize
            r9.setTextSize(r1)
            android.text.TextPaint r9 = r8.textPaint
            android.graphics.Typeface r1 = r8.currentTypeface
            r9.setTypeface(r1)
            android.text.TextPaint r9 = r8.textPaint
            float r1 = r8.scale
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L95
            r4 = r5
        L95:
            r9.setLinearText(r4)
            java.lang.CharSequence r9 = r8.text
            boolean r9 = r8.calculateIsRtl(r9)
            r8.isRtl = r9
            boolean r9 = r8.shouldDrawMultiline()
            if (r9 == 0) goto La8
            int r5 = r8.maxLines
        La8:
            boolean r9 = r8.isRtl
            android.text.StaticLayout r9 = r8.createStaticLayout(r5, r0, r9)
            r8.textLayout = r9
            java.lang.CharSequence r9 = r9.getText()
            r8.textToDraw = r9
        Lb6:
            return
    }

    private void clearTexture() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.expandedTitleTexture
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.expandedTitleTexture = r0
        La:
            return
    }

    private android.text.StaticLayout createStaticLayout(int r3, float r4, boolean r5) {
            r2 = this;
            java.lang.CharSequence r0 = r2.text     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            android.text.TextPaint r1 = r2.textPaint     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            int r4 = (int) r4     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = com.google.android.material.internal.StaticLayoutBuilderCompat.obtain(r0, r1, r4)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setEllipsize(r0)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setIsRtl(r5)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setAlignment(r5)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            r5 = 0
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setIncludePad(r5)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            com.google.android.material.internal.StaticLayoutBuilderCompat r3 = r4.setMaxLines(r3)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            android.text.StaticLayout r3 = r3.build()     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L27
            goto L36
        L27:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "CollapsingTextHelper"
            android.util.Log.e(r5, r4, r3)
            r3 = 0
        L36:
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3
            return r3
    }

    private void drawMultinlineTransition(android.graphics.Canvas r12, float r13, float r14) {
            r11 = this;
            android.text.TextPaint r0 = r11.textPaint
            int r0 = r0.getAlpha()
            r12.translate(r13, r14)
            android.text.TextPaint r1 = r11.textPaint
            float r2 = r11.expandedTextBlend
            float r3 = (float) r0
            float r2 = r2 * r3
            int r2 = (int) r2
            r1.setAlpha(r2)
            android.text.StaticLayout r1 = r11.textLayout
            r1.draw(r12)
            android.text.TextPaint r1 = r11.textPaint
            float r4 = r11.collapsedTextBlend
            float r4 = r4 * r3
            int r3 = (int) r4
            r1.setAlpha(r3)
            android.text.StaticLayout r1 = r11.textLayout
            r3 = 0
            int r1 = r1.getLineBaseline(r3)
            java.lang.CharSequence r5 = r11.textToDrawCollapsed
            r6 = 0
            int r7 = r5.length()
            r8 = 0
            float r1 = (float) r1
            android.text.TextPaint r10 = r11.textPaint
            r4 = r12
            r9 = r1
            r4.drawText(r5, r6, r7, r8, r9, r10)
            java.lang.CharSequence r4 = r11.textToDrawCollapsed
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = "…"
            boolean r5 = r4.endsWith(r5)
            if (r5 == 0) goto L54
            int r5 = r4.length()
            int r5 = r5 + (-1)
            java.lang.String r4 = r4.substring(r3, r5)
        L54:
            r5 = r4
            android.text.TextPaint r4 = r11.textPaint
            r4.setAlpha(r0)
            r6 = 0
            android.text.StaticLayout r0 = r11.textLayout
            int r0 = r0.getLineEnd(r3)
            int r3 = r5.length()
            int r7 = java.lang.Math.min(r0, r3)
            r8 = 0
            android.text.TextPaint r10 = r11.textPaint
            r4 = r12
            r9 = r1
            r4.drawText(r5, r6, r7, r8, r9, r10)
            return
    }

    private void ensureExpandedTexture() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.expandedTitleTexture
            if (r0 != 0) goto L4a
            android.graphics.Rect r0 = r3.expandedBounds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            java.lang.CharSequence r0 = r3.textToDraw
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            goto L4a
        L15:
            r0 = 0
            r3.calculateOffsets(r0)
            android.text.StaticLayout r0 = r3.textLayout
            int r0 = r0.getWidth()
            android.text.StaticLayout r1 = r3.textLayout
            int r1 = r1.getHeight()
            if (r0 <= 0) goto L4a
            if (r1 > 0) goto L2a
            goto L4a
        L2a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r3.expandedTitleTexture = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r3.expandedTitleTexture
            r0.<init>(r1)
            android.text.StaticLayout r1 = r3.textLayout
            r1.draw(r0)
            android.graphics.Paint r0 = r3.texturePaint
            if (r0 != 0) goto L4a
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r3.texturePaint = r0
        L4a:
            return
    }

    private float getCollapsedTextLeftBound(int r3, int r4) {
            r2 = this;
            r0 = 17
            if (r4 == r0) goto L40
            r0 = r4 & 7
            r1 = 1
            if (r0 != r1) goto La
            goto L40
        La:
            r3 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r3
            if (r0 == r3) goto L2b
            r3 = 5
            r4 = r4 & r3
            if (r4 != r3) goto L16
            goto L2b
        L16:
            boolean r3 = r2.isRtl
            if (r3 == 0) goto L25
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
            float r4 = r2.calculateCollapsedTextWidth()
            float r3 = r3 - r4
            goto L2a
        L25:
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.left
            float r3 = (float) r3
        L2a:
            return r3
        L2b:
            boolean r3 = r2.isRtl
            if (r3 == 0) goto L35
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.left
            float r3 = (float) r3
            goto L3f
        L35:
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
            float r4 = r2.calculateCollapsedTextWidth()
            float r3 = r3 - r4
        L3f:
            return r3
        L40:
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r0 = r2.calculateCollapsedTextWidth()
            float r0 = r0 / r4
            float r3 = r3 - r0
            return r3
    }

    private float getCollapsedTextRightBound(android.graphics.RectF r3, int r4, int r5) {
            r2 = this;
            r0 = 17
            if (r5 == r0) goto L3a
            r0 = r5 & 7
            r1 = 1
            if (r0 != r1) goto La
            goto L3a
        La:
            r4 = 8388613(0x800005, float:1.175495E-38)
            r0 = r5 & r4
            if (r0 == r4) goto L28
            r4 = 5
            r5 = r5 & r4
            if (r5 != r4) goto L16
            goto L28
        L16:
            boolean r4 = r2.isRtl
            if (r4 == 0) goto L20
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
            goto L27
        L20:
            float r3 = r3.left
            float r4 = r2.calculateCollapsedTextWidth()
            float r3 = r3 + r4
        L27:
            return r3
        L28:
            boolean r4 = r2.isRtl
            if (r4 == 0) goto L34
            float r3 = r3.left
            float r4 = r2.calculateCollapsedTextWidth()
            float r3 = r3 + r4
            goto L39
        L34:
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
        L39:
            return r3
        L3a:
            float r3 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r5 = r2.calculateCollapsedTextWidth()
            float r5 = r5 / r4
            float r3 = r3 + r5
            return r3
    }

    private int getCurrentColor(android.content.res.ColorStateList r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int[] r1 = r2.state
            if (r1 == 0) goto Ld
            int r3 = r3.getColorForState(r1, r0)
            return r3
        Ld:
            int r3 = r3.getDefaultColor()
            return r3
    }

    private int getCurrentExpandedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            int r0 = r1.getCurrentColor(r0)
            return r0
    }

    private void getTextPaintCollapsed(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.collapsedTextSize
            r2.setTextSize(r0)
            android.graphics.Typeface r0 = r1.collapsedTypeface
            r2.setTypeface(r0)
            float r0 = r1.collapsedLetterSpacing
            r2.setLetterSpacing(r0)
            return
    }

    private void getTextPaintExpanded(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.expandedTextSize
            r2.setTextSize(r0)
            android.graphics.Typeface r0 = r1.expandedTypeface
            r2.setTypeface(r0)
            float r0 = r1.expandedLetterSpacing
            r2.setLetterSpacing(r0)
            return
    }

    private void interpolateBounds(float r5) {
            r4 = this;
            android.graphics.RectF r0 = r4.currentBounds
            android.graphics.Rect r1 = r4.expandedBounds
            int r1 = r1.left
            float r1 = (float) r1
            android.graphics.Rect r2 = r4.collapsedBounds
            int r2 = r2.left
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r1 = lerp(r1, r2, r5, r3)
            r0.left = r1
            android.graphics.RectF r0 = r4.currentBounds
            float r1 = r4.expandedDrawY
            float r2 = r4.collapsedDrawY
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r1 = lerp(r1, r2, r5, r3)
            r0.top = r1
            android.graphics.RectF r0 = r4.currentBounds
            android.graphics.Rect r1 = r4.expandedBounds
            int r1 = r1.right
            float r1 = (float) r1
            android.graphics.Rect r2 = r4.collapsedBounds
            int r2 = r2.right
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r1 = lerp(r1, r2, r5, r3)
            r0.right = r1
            android.graphics.RectF r0 = r4.currentBounds
            android.graphics.Rect r1 = r4.expandedBounds
            int r1 = r1.bottom
            float r1 = (float) r1
            android.graphics.Rect r2 = r4.collapsedBounds
            int r2 = r2.bottom
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r5 = lerp(r1, r2, r5, r3)
            r0.bottom = r5
            return
    }

    private static boolean isClose(float r0, float r1) {
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private boolean isDefaultIsRtl() {
            r2 = this;
            android.view.View r0 = r2.view
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private static float lerp(float r0, float r1, float r2, android.animation.TimeInterpolator r3) {
            if (r3 == 0) goto L6
            float r2 = r3.getInterpolation(r2)
        L6:
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r2)
            return r0
    }

    private static boolean rectEquals(android.graphics.Rect r1, int r2, int r3, int r4, int r5) {
            int r0 = r1.left
            if (r0 != r2) goto L12
            int r2 = r1.top
            if (r2 != r3) goto L12
            int r2 = r1.right
            if (r2 != r4) goto L12
            int r1 = r1.bottom
            if (r1 != r5) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private void setCollapsedTextBlend(float r1) {
            r0 = this;
            r0.collapsedTextBlend = r1
            android.view.View r1 = r0.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    private boolean setCollapsedTypefaceInternal(android.graphics.Typeface r2) {
            r1 = this;
            com.google.android.material.resources.CancelableFontCallback r0 = r1.collapsedFontCallback
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.graphics.Typeface r0 = r1.collapsedTypeface
            if (r0 == r2) goto Lf
            r1.collapsedTypeface = r2
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private void setExpandedTextBlend(float r1) {
            r0 = this;
            r0.expandedTextBlend = r1
            android.view.View r1 = r0.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    private boolean setExpandedTypefaceInternal(android.graphics.Typeface r2) {
            r1 = this;
            com.google.android.material.resources.CancelableFontCallback r0 = r1.expandedFontCallback
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.graphics.Typeface r0 = r1.expandedTypeface
            if (r0 == r2) goto Lf
            r1.expandedTypeface = r2
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private void setInterpolatedTextSize(float r2) {
            r1 = this;
            r1.calculateUsingTextSize(r2)
            boolean r2 = com.google.android.material.internal.CollapsingTextHelper.USE_SCALING_TEXTURE
            if (r2 == 0) goto L11
            float r2 = r1.scale
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r1.useTexture = r2
            if (r2 == 0) goto L19
            r1.ensureExpandedTexture()
        L19:
            android.view.View r2 = r1.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
            return
    }

    private boolean shouldDrawMultiline() {
            r2 = this;
            int r0 = r2.maxLines
            r1 = 1
            if (r0 <= r1) goto Le
            boolean r0 = r2.isRtl
            if (r0 != 0) goto Le
            boolean r0 = r2.useTexture
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public float calculateCollapsedTextWidth() {
            r4 = this;
            java.lang.CharSequence r0 = r4.text
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.text.TextPaint r0 = r4.tmpPaint
            r4.getTextPaintCollapsed(r0)
            android.text.TextPaint r0 = r4.tmpPaint
            java.lang.CharSequence r1 = r4.text
            r2 = 0
            int r3 = r1.length()
            float r0 = r0.measureText(r1, r2, r3)
            return r0
    }

    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r8.save()
            java.lang.CharSequence r1 = r7.textToDraw
            if (r1 == 0) goto L5d
            boolean r1 = r7.drawTitle
            if (r1 == 0) goto L5d
            float r1 = r7.currentDrawX
            android.text.StaticLayout r2 = r7.textLayout
            r3 = 0
            float r2 = r2.getLineLeft(r3)
            float r1 = r1 + r2
            float r2 = r7.expandedFirstLineDrawX
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r4
            float r1 = r1 - r2
            android.text.TextPaint r2 = r7.textPaint
            float r4 = r7.currentTextSize
            r2.setTextSize(r4)
            float r2 = r7.currentDrawX
            float r4 = r7.currentDrawY
            boolean r5 = r7.useTexture
            if (r5 == 0) goto L30
            android.graphics.Bitmap r5 = r7.expandedTitleTexture
            if (r5 == 0) goto L30
            r3 = 1
        L30:
            float r5 = r7.scale
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L3b
            r8.scale(r5, r5, r2, r4)
        L3b:
            if (r3 == 0) goto L48
            android.graphics.Bitmap r1 = r7.expandedTitleTexture
            android.graphics.Paint r3 = r7.texturePaint
            r8.drawBitmap(r1, r2, r4, r3)
            r8.restoreToCount(r0)
            return
        L48:
            boolean r3 = r7.shouldDrawMultiline()
            if (r3 == 0) goto L52
            r7.drawMultinlineTransition(r8, r1, r4)
            goto L5a
        L52:
            r8.translate(r2, r4)
            android.text.StaticLayout r1 = r7.textLayout
            r1.draw(r8)
        L5a:
            r8.restoreToCount(r0)
        L5d:
            return
    }

    public void getCollapsedTextActualBounds(android.graphics.RectF r2, int r3, int r4) {
            r1 = this;
            java.lang.CharSequence r0 = r1.text
            boolean r0 = r1.calculateIsRtl(r0)
            r1.isRtl = r0
            float r0 = r1.getCollapsedTextLeftBound(r3, r4)
            r2.left = r0
            android.graphics.Rect r0 = r1.collapsedBounds
            int r0 = r0.top
            float r0 = (float) r0
            r2.top = r0
            float r3 = r1.getCollapsedTextRightBound(r2, r3, r4)
            r2.right = r3
            android.graphics.Rect r3 = r1.collapsedBounds
            int r3 = r3.top
            float r3 = (float) r3
            float r4 = r1.getCollapsedTextHeight()
            float r3 = r3 + r4
            r2.bottom = r3
            return
    }

    public android.content.res.ColorStateList getCollapsedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            return r0
    }

    public int getCollapsedTextGravity() {
            r1 = this;
            int r0 = r1.collapsedTextGravity
            return r0
    }

    public float getCollapsedTextHeight() {
            r1 = this;
            android.text.TextPaint r0 = r1.tmpPaint
            r1.getTextPaintCollapsed(r0)
            android.text.TextPaint r0 = r1.tmpPaint
            float r0 = r0.ascent()
            float r0 = -r0
            return r0
    }

    public float getCollapsedTextSize() {
            r1 = this;
            float r0 = r1.collapsedTextSize
            return r0
    }

    public android.graphics.Typeface getCollapsedTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.collapsedTypeface
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L7:
            return r0
    }

    public int getCurrentCollapsedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            int r0 = r1.getCurrentColor(r0)
            return r0
    }

    public android.content.res.ColorStateList getExpandedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            return r0
    }

    public int getExpandedTextGravity() {
            r1 = this;
            int r0 = r1.expandedTextGravity
            return r0
    }

    public float getExpandedTextHeight() {
            r1 = this;
            android.text.TextPaint r0 = r1.tmpPaint
            r1.getTextPaintExpanded(r0)
            android.text.TextPaint r0 = r1.tmpPaint
            float r0 = r0.ascent()
            float r0 = -r0
            return r0
    }

    public float getExpandedTextSize() {
            r1 = this;
            float r0 = r1.expandedTextSize
            return r0
    }

    public android.graphics.Typeface getExpandedTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.expandedTypeface
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L7:
            return r0
    }

    public float getExpansionFraction() {
            r1 = this;
            float r0 = r1.expandedFraction
            return r0
    }

    public int getMaxLines() {
            r1 = this;
            int r0 = r1.maxLines
            return r0
    }

    public java.lang.CharSequence getText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.text
            return r0
    }

    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L14
        La:
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    void onBoundsChanged() {
            r1 = this;
            android.graphics.Rect r0 = r1.collapsedBounds
            int r0 = r0.width()
            if (r0 <= 0) goto L22
            android.graphics.Rect r0 = r1.collapsedBounds
            int r0 = r0.height()
            if (r0 <= 0) goto L22
            android.graphics.Rect r0 = r1.expandedBounds
            int r0 = r0.width()
            if (r0 <= 0) goto L22
            android.graphics.Rect r0 = r1.expandedBounds
            int r0 = r0.height()
            if (r0 <= 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            r1.drawTitle = r0
            return
    }

    public void recalculate() {
            r1 = this;
            android.view.View r0 = r1.view
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L16
            android.view.View r0 = r1.view
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L16
            r1.calculateBaseOffsets()
            r1.calculateCurrentOffsets()
        L16:
            return
    }

    public void setCollapsedBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.collapsedBounds
            boolean r0 = rectEquals(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L13
            android.graphics.Rect r0 = r1.collapsedBounds
            r0.set(r2, r3, r4, r5)
            r2 = 1
            r1.boundsChanged = r2
            r1.onBoundsChanged()
        L13:
            return
    }

    public void setCollapsedBounds(android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.setCollapsedBounds(r0, r1, r2, r4)
            return
    }

    public void setCollapsedTextAppearance(int r4) {
            r3 = this;
            com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
            android.view.View r1 = r3.view
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r4)
            android.content.res.ColorStateList r4 = r0.textColor
            if (r4 == 0) goto L13
            android.content.res.ColorStateList r4 = r0.textColor
            r3.collapsedTextColor = r4
        L13:
            float r4 = r0.textSize
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L1e
            float r4 = r0.textSize
            r3.collapsedTextSize = r4
        L1e:
            android.content.res.ColorStateList r4 = r0.shadowColor
            if (r4 == 0) goto L26
            android.content.res.ColorStateList r4 = r0.shadowColor
            r3.collapsedShadowColor = r4
        L26:
            float r4 = r0.shadowDx
            r3.collapsedShadowDx = r4
            float r4 = r0.shadowDy
            r3.collapsedShadowDy = r4
            float r4 = r0.shadowRadius
            r3.collapsedShadowRadius = r4
            float r4 = r0.letterSpacing
            r3.collapsedLetterSpacing = r4
            com.google.android.material.resources.CancelableFontCallback r4 = r3.collapsedFontCallback
            if (r4 == 0) goto L3d
            r4.cancel()
        L3d:
            com.google.android.material.resources.CancelableFontCallback r4 = new com.google.android.material.resources.CancelableFontCallback
            com.google.android.material.internal.CollapsingTextHelper$1 r1 = new com.google.android.material.internal.CollapsingTextHelper$1
            r1.<init>(r3)
            android.graphics.Typeface r2 = r0.getFallbackFont()
            r4.<init>(r1, r2)
            r3.collapsedFontCallback = r4
            android.view.View r4 = r3.view
            android.content.Context r4 = r4.getContext()
            com.google.android.material.resources.CancelableFontCallback r1 = r3.collapsedFontCallback
            r0.getFontAsync(r4, r1)
            r3.recalculate()
            return
    }

    public void setCollapsedTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            if (r0 == r2) goto L9
            r1.collapsedTextColor = r2
            r1.recalculate()
        L9:
            return
    }

    public void setCollapsedTextGravity(int r2) {
            r1 = this;
            int r0 = r1.collapsedTextGravity
            if (r0 == r2) goto L9
            r1.collapsedTextGravity = r2
            r1.recalculate()
        L9:
            return
    }

    public void setCollapsedTextSize(float r2) {
            r1 = this;
            float r0 = r1.collapsedTextSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.collapsedTextSize = r2
            r1.recalculate()
        Lb:
            return
    }

    public void setCollapsedTypeface(android.graphics.Typeface r1) {
            r0 = this;
            boolean r1 = r0.setCollapsedTypefaceInternal(r1)
            if (r1 == 0) goto L9
            r0.recalculate()
        L9:
            return
    }

    public void setExpandedBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.expandedBounds
            boolean r0 = rectEquals(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L13
            android.graphics.Rect r0 = r1.expandedBounds
            r0.set(r2, r3, r4, r5)
            r2 = 1
            r1.boundsChanged = r2
            r1.onBoundsChanged()
        L13:
            return
    }

    public void setExpandedBounds(android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.setExpandedBounds(r0, r1, r2, r4)
            return
    }

    public void setExpandedTextAppearance(int r4) {
            r3 = this;
            com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
            android.view.View r1 = r3.view
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r4)
            android.content.res.ColorStateList r4 = r0.textColor
            if (r4 == 0) goto L13
            android.content.res.ColorStateList r4 = r0.textColor
            r3.expandedTextColor = r4
        L13:
            float r4 = r0.textSize
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L1e
            float r4 = r0.textSize
            r3.expandedTextSize = r4
        L1e:
            android.content.res.ColorStateList r4 = r0.shadowColor
            if (r4 == 0) goto L26
            android.content.res.ColorStateList r4 = r0.shadowColor
            r3.expandedShadowColor = r4
        L26:
            float r4 = r0.shadowDx
            r3.expandedShadowDx = r4
            float r4 = r0.shadowDy
            r3.expandedShadowDy = r4
            float r4 = r0.shadowRadius
            r3.expandedShadowRadius = r4
            float r4 = r0.letterSpacing
            r3.expandedLetterSpacing = r4
            com.google.android.material.resources.CancelableFontCallback r4 = r3.expandedFontCallback
            if (r4 == 0) goto L3d
            r4.cancel()
        L3d:
            com.google.android.material.resources.CancelableFontCallback r4 = new com.google.android.material.resources.CancelableFontCallback
            com.google.android.material.internal.CollapsingTextHelper$2 r1 = new com.google.android.material.internal.CollapsingTextHelper$2
            r1.<init>(r3)
            android.graphics.Typeface r2 = r0.getFallbackFont()
            r4.<init>(r1, r2)
            r3.expandedFontCallback = r4
            android.view.View r4 = r3.view
            android.content.Context r4 = r4.getContext()
            com.google.android.material.resources.CancelableFontCallback r1 = r3.expandedFontCallback
            r0.getFontAsync(r4, r1)
            r3.recalculate()
            return
    }

    public void setExpandedTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            if (r0 == r2) goto L9
            r1.expandedTextColor = r2
            r1.recalculate()
        L9:
            return
    }

    public void setExpandedTextGravity(int r2) {
            r1 = this;
            int r0 = r1.expandedTextGravity
            if (r0 == r2) goto L9
            r1.expandedTextGravity = r2
            r1.recalculate()
        L9:
            return
    }

    public void setExpandedTextSize(float r2) {
            r1 = this;
            float r0 = r1.expandedTextSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.expandedTextSize = r2
            r1.recalculate()
        Lb:
            return
    }

    public void setExpandedTypeface(android.graphics.Typeface r1) {
            r0 = this;
            boolean r1 = r0.setExpandedTypefaceInternal(r1)
            if (r1 == 0) goto L9
            r0.recalculate()
        L9:
            return
    }

    public void setExpansionFraction(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = androidx.core.math.MathUtils.clamp(r3, r0, r1)
            float r0 = r2.expandedFraction
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L12
            r2.expandedFraction = r3
            r2.calculateCurrentOffsets()
        L12:
            return
    }

    public void setMaxLines(int r2) {
            r1 = this;
            int r0 = r1.maxLines
            if (r2 == r0) goto Lc
            r1.maxLines = r2
            r1.clearTexture()
            r1.recalculate()
        Lc:
            return
    }

    public void setPositionInterpolator(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.positionInterpolator = r1
            r0.recalculate()
            return
    }

    public final boolean setState(int[] r1) {
            r0 = this;
            r0.state = r1
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto Ld
            r0.recalculate()
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto La
            java.lang.CharSequence r0 = r1.text
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L15
        La:
            r1.text = r2
            r2 = 0
            r1.textToDraw = r2
            r1.clearTexture()
            r1.recalculate()
        L15:
            return
    }

    public void setTextSizeInterpolator(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.textSizeInterpolator = r1
            r0.recalculate()
            return
    }

    public void setTypefaces(android.graphics.Typeface r2) {
            r1 = this;
            boolean r0 = r1.setCollapsedTypefaceInternal(r2)
            boolean r2 = r1.setExpandedTypefaceInternal(r2)
            if (r0 != 0) goto Lc
            if (r2 == 0) goto Lf
        Lc:
            r1.recalculate()
        Lf:
            return
    }
}
