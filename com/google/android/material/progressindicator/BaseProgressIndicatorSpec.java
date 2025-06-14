package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    protected BaseProgressIndicatorSpec(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
            r8 = this;
            r8.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r8.indicatorColors = r1
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_progress_track_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r4 = com.google.android.material.C0479R.styleable.BaseProgressIndicator
            int[] r7 = new int[r0]
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r11 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_trackThickness
            int r11 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r9, r10, r11, r1)
            r8.trackThickness = r11
            int r11 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_trackCornerRadius
            int r11 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r9, r10, r11, r0)
            int r12 = r8.trackThickness
            int r12 = r12 / 2
            int r11 = java.lang.Math.min(r11, r12)
            r8.trackCornerRadius = r11
            int r11 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_showAnimationBehavior
            int r11 = r10.getInt(r11, r0)
            r8.showAnimationBehavior = r11
            int r11 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_hideAnimationBehavior
            int r11 = r10.getInt(r11, r0)
            r8.hideAnimationBehavior = r11
            r8.loadIndicatorColors(r9, r10)
            r8.loadTrackColor(r9, r10)
            r10.recycle()
            return
    }

    private void loadIndicatorColors(android.content.Context r5, android.content.res.TypedArray r6) {
            r4 = this;
            int r0 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_indicatorColor
            boolean r0 = r6.hasValue(r0)
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L18
            int[] r6 = new int[r3]
            int r0 = com.google.android.material.C0479R.attr.colorPrimary
            int r5 = com.google.android.material.color.MaterialColors.getColor(r5, r0, r2)
            r6[r1] = r5
            r4.indicatorColors = r6
            return
        L18:
            int r0 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_indicatorColor
            android.util.TypedValue r0 = r6.peekValue(r0)
            int r0 = r0.type
            if (r0 == r3) goto L2f
            int[] r5 = new int[r3]
            int r0 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_indicatorColor
            int r6 = r6.getColor(r0, r2)
            r5[r1] = r6
            r4.indicatorColors = r5
            return
        L2f:
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_indicatorColor
            int r6 = r6.getResourceId(r0, r2)
            int[] r5 = r5.getIntArray(r6)
            r4.indicatorColors = r5
            int r5 = r5.length
            if (r5 == 0) goto L43
            return
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "indicatorColors cannot be empty when indicatorColor is not used."
            r5.<init>(r6)
            throw r5
    }

    private void loadTrackColor(android.content.Context r3, android.content.res.TypedArray r4) {
            r2 = this;
            int r0 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_trackColor
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L12
            int r3 = com.google.android.material.C0479R.styleable.BaseProgressIndicator_trackColor
            r0 = -1
            int r3 = r4.getColor(r3, r0)
            r2.trackColor = r3
            return
        L12:
            int[] r4 = r2.indicatorColors
            r0 = 0
            r4 = r4[r0]
            r2.trackColor = r4
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 1
            int[] r4 = new int[r4]
            r1 = 16842803(0x1010033, float:2.36937E-38)
            r4[r0] = r1
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r3.getFloat(r0, r4)
            r3.recycle()
            r3 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r3
            int r3 = (int) r4
            int r4 = r2.trackColor
            int r3 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r4, r3)
            r2.trackColor = r3
            return
    }

    public boolean isHideAnimationEnabled() {
            r1 = this;
            int r0 = r1.hideAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isShowAnimationEnabled() {
            r1 = this;
            int r0 = r1.showAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    abstract void validateSpec();
}
