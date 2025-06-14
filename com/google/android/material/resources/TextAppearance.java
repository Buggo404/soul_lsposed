package com.google.android.material.resources;

/* loaded from: classes.dex */
public class TextAppearance {
    private static final java.lang.String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private android.graphics.Typeface font;
    public final java.lang.String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final android.content.res.ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    public final android.content.res.ColorStateList textColor;
    public final android.content.res.ColorStateList textColorHint;
    public final android.content.res.ColorStateList textColorLink;
    public float textSize;
    public final int textStyle;
    public final int typeface;



    public TextAppearance(android.content.Context r6, int r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.fontResolved = r0
            int[] r1 = com.google.android.material.C0479R.styleable.TextAppearance
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1)
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_android_textSize
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r5.textSize = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r1, r2)
            r5.textColor = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r1, r2)
            r5.textColorHint = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r1, r2)
            r5.textColorLink = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_android_textStyle
            int r2 = r1.getInt(r2, r0)
            r5.textStyle = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_android_typeface
            r4 = 1
            int r2 = r1.getInt(r2, r4)
            r5.typeface = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_fontFamily
            int r4 = com.google.android.material.C0479R.styleable.TextAppearance_android_fontFamily
            int r2 = com.google.android.material.resources.MaterialResources.getIndexWithValue(r1, r2, r4)
            int r4 = r1.getResourceId(r2, r0)
            r5.fontFamilyResourceId = r4
            java.lang.String r2 = r1.getString(r2)
            r5.fontFamily = r2
            int r2 = com.google.android.material.C0479R.styleable.TextAppearance_textAllCaps
            boolean r0 = r1.getBoolean(r2, r0)
            r5.textAllCaps = r0
            int r0 = com.google.android.material.C0479R.styleable.TextAppearance_android_shadowColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r1, r0)
            r5.shadowColor = r0
            int r0 = com.google.android.material.C0479R.styleable.TextAppearance_android_shadowDx
            float r0 = r1.getFloat(r0, r3)
            r5.shadowDx = r0
            int r0 = com.google.android.material.C0479R.styleable.TextAppearance_android_shadowDy
            float r0 = r1.getFloat(r0, r3)
            r5.shadowDy = r0
            int r0 = com.google.android.material.C0479R.styleable.TextAppearance_android_shadowRadius
            float r0 = r1.getFloat(r0, r3)
            r5.shadowRadius = r0
            r1.recycle()
            int[] r0 = com.google.android.material.C0479R.styleable.MaterialTextAppearance
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = com.google.android.material.C0479R.styleable.MaterialTextAppearance_android_letterSpacing
            boolean r7 = r6.hasValue(r7)
            r5.hasLetterSpacing = r7
            int r7 = com.google.android.material.C0479R.styleable.MaterialTextAppearance_android_letterSpacing
            float r7 = r6.getFloat(r7, r3)
            r5.letterSpacing = r7
            r6.recycle()
            return
    }

    static /* synthetic */ android.graphics.Typeface access$000(com.google.android.material.resources.TextAppearance r0) {
            android.graphics.Typeface r0 = r0.font
            return r0
    }

    static /* synthetic */ android.graphics.Typeface access$002(com.google.android.material.resources.TextAppearance r0, android.graphics.Typeface r1) {
            r0.font = r1
            return r1
    }

    static /* synthetic */ boolean access$102(com.google.android.material.resources.TextAppearance r0, boolean r1) {
            r0.fontResolved = r1
            return r1
    }

    private void createFallbackFont() {
            r2 = this;
            android.graphics.Typeface r0 = r2.font
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.fontFamily
            if (r0 == 0) goto L10
            int r1 = r2.textStyle
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r2.font = r0
        L10:
            android.graphics.Typeface r0 = r2.font
            if (r0 != 0) goto L3c
            int r0 = r2.typeface
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 == r1) goto L24
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r2.font = r0
            goto L32
        L24:
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r2.font = r0
            goto L32
        L29:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            r2.font = r0
            goto L32
        L2e:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r2.font = r0
        L32:
            android.graphics.Typeface r0 = r2.font
            int r1 = r2.textStyle
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r2.font = r0
        L3c:
            return
    }

    private boolean shouldLoadFontSynchronously(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.google.android.material.resources.TextAppearanceConfig.shouldLoadFontSynchronously()
            return r1
    }

    public android.graphics.Typeface getFallbackFont() {
            r1 = this;
            r1.createFallbackFont()
            android.graphics.Typeface r0 = r1.font
            return r0
    }

    public android.graphics.Typeface getFont(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.fontResolved
            if (r0 == 0) goto L7
            android.graphics.Typeface r3 = r2.font
            return r3
        L7:
            boolean r0 = r3.isRestricted()
            if (r0 != 0) goto L37
            int r0 = r2.fontFamilyResourceId     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L37
            android.graphics.Typeface r3 = androidx.core.content.res.ResourcesCompat.getFont(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L37
            r2.font = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L37
            if (r3 == 0) goto L37
            int r0 = r2.textStyle     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L37
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L37
            r2.font = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L37
            goto L37
        L20:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error loading font "
            r0.<init>(r1)
            java.lang.String r1 = r2.fontFamily
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextAppearance"
            android.util.Log.d(r1, r0, r3)
        L37:
            r2.createFallbackFont()
            r3 = 1
            r2.fontResolved = r3
            android.graphics.Typeface r3 = r2.font
            return r3
    }

    public void getFontAsync(android.content.Context r2, android.text.TextPaint r3, com.google.android.material.resources.TextAppearanceFontCallback r4) {
            r1 = this;
            android.graphics.Typeface r0 = r1.getFallbackFont()
            r1.updateTextPaintMeasureState(r3, r0)
            com.google.android.material.resources.TextAppearance$2 r0 = new com.google.android.material.resources.TextAppearance$2
            r0.<init>(r1, r3, r4)
            r1.getFontAsync(r2, r0)
            return
    }

    public void getFontAsync(android.content.Context r5, com.google.android.material.resources.TextAppearanceFontCallback r6) {
            r4 = this;
            boolean r0 = r4.shouldLoadFontSynchronously(r5)
            if (r0 == 0) goto La
            r4.getFont(r5)
            goto Ld
        La:
            r4.createFallbackFont()
        Ld:
            int r0 = r4.fontFamilyResourceId
            r1 = 1
            if (r0 != 0) goto L14
            r4.fontResolved = r1
        L14:
            boolean r2 = r4.fontResolved
            if (r2 == 0) goto L1e
            android.graphics.Typeface r5 = r4.font
            r6.onFontRetrieved(r5, r1)
            return
        L1e:
            com.google.android.material.resources.TextAppearance$1 r2 = new com.google.android.material.resources.TextAppearance$1     // Catch: java.lang.Exception -> L28 android.content.res.Resources.NotFoundException -> L46
            r2.<init>(r4, r6)     // Catch: java.lang.Exception -> L28 android.content.res.Resources.NotFoundException -> L46
            r3 = 0
            androidx.core.content.res.ResourcesCompat.getFont(r5, r0, r2, r3)     // Catch: java.lang.Exception -> L28 android.content.res.Resources.NotFoundException -> L46
            goto L4b
        L28:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading font "
            r0.<init>(r2)
            java.lang.String r2 = r4.fontFamily
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextAppearance"
            android.util.Log.d(r2, r0, r5)
            r4.fontResolved = r1
            r5 = -3
            r6.onFontRetrievalFailed(r5)
            goto L4b
        L46:
            r4.fontResolved = r1
            r6.onFontRetrievalFailed(r1)
        L4b:
            return
    }

    public void updateDrawState(android.content.Context r5, android.text.TextPaint r6, com.google.android.material.resources.TextAppearanceFontCallback r7) {
            r4 = this;
            r4.updateMeasureState(r5, r6, r7)
            android.content.res.ColorStateList r5 = r4.textColor
            if (r5 == 0) goto L14
            int[] r7 = r6.drawableState
            android.content.res.ColorStateList r0 = r4.textColor
            int r0 = r0.getDefaultColor()
            int r5 = r5.getColorForState(r7, r0)
            goto L16
        L14:
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L16:
            r6.setColor(r5)
            float r5 = r4.shadowRadius
            float r7 = r4.shadowDx
            float r0 = r4.shadowDy
            android.content.res.ColorStateList r1 = r4.shadowColor
            if (r1 == 0) goto L30
            int[] r2 = r6.drawableState
            android.content.res.ColorStateList r3 = r4.shadowColor
            int r3 = r3.getDefaultColor()
            int r1 = r1.getColorForState(r2, r3)
            goto L31
        L30:
            r1 = 0
        L31:
            r6.setShadowLayer(r5, r7, r0, r1)
            return
    }

    public void updateMeasureState(android.content.Context r2, android.text.TextPaint r3, com.google.android.material.resources.TextAppearanceFontCallback r4) {
            r1 = this;
            boolean r0 = r1.shouldLoadFontSynchronously(r2)
            if (r0 == 0) goto Le
            android.graphics.Typeface r2 = r1.getFont(r2)
            r1.updateTextPaintMeasureState(r3, r2)
            goto L11
        Le:
            r1.getFontAsync(r2, r3, r4)
        L11:
            return
    }

    public void updateTextPaintMeasureState(android.text.TextPaint r2, android.graphics.Typeface r3) {
            r1 = this;
            r2.setTypeface(r3)
            int r0 = r1.textStyle
            int r3 = r3.getStyle()
            int r3 = ~r3
            r3 = r3 & r0
            r0 = r3 & 1
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r2.setFakeBoldText(r0)
            r3 = r3 & 2
            if (r3 == 0) goto L1c
            r3 = -1098907648(0xffffffffbe800000, float:-0.25)
            goto L1d
        L1c:
            r3 = 0
        L1d:
            r2.setTextSkewX(r3)
            float r3 = r1.textSize
            r2.setTextSize(r3)
            boolean r3 = r1.hasLetterSpacing
            if (r3 == 0) goto L2e
            float r3 = r1.letterSpacing
            r2.setLetterSpacing(r3)
        L2e:
            return
    }
}
