package com.google.android.material.elevation;

/* loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            int r0 = com.google.android.material.C0479R.attr.elevationOverlayEnabled
            r1 = 0
            boolean r0 = com.google.android.material.resources.MaterialAttributes.resolveBoolean(r3, r0, r1)
            r2.elevationOverlayEnabled = r0
            int r0 = com.google.android.material.C0479R.attr.elevationOverlayColor
            int r0 = com.google.android.material.color.MaterialColors.getColor(r3, r0, r1)
            r2.elevationOverlayColor = r0
            int r0 = com.google.android.material.C0479R.attr.colorSurface
            int r0 = com.google.android.material.color.MaterialColors.getColor(r3, r0, r1)
            r2.colorSurface = r0
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r2.displayDensity = r3
            return
    }

    private boolean isThemeSurfaceColor(int r2) {
            r1 = this;
            r0 = 255(0xff, float:3.57E-43)
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            int r0 = r1.colorSurface
            if (r2 != r0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public int calculateOverlayAlpha(float r2) {
            r1 = this;
            float r2 = r1.calculateOverlayAlphaFraction(r2)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    public float calculateOverlayAlphaFraction(float r4) {
            r3 = this;
            float r0 = r3.displayDensity
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 > 0) goto Lc
            goto L23
        Lc:
            float r4 = r4 / r0
            double r0 = (double) r4
            double r0 = java.lang.Math.log1p(r0)
            float r4 = (float) r0
            r0 = 1083179008(0x40900000, float:4.5)
            float r4 = r4 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 + r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r0)
            return r4
        L23:
            return r1
    }

    public int compositeOverlay(int r3, float r4) {
            r2 = this;
            float r4 = r2.calculateOverlayAlphaFraction(r4)
            int r0 = android.graphics.Color.alpha(r3)
            r1 = 255(0xff, float:3.57E-43)
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r3, r1)
            int r1 = r2.elevationOverlayColor
            int r3 = com.google.android.material.color.MaterialColors.layer(r3, r1, r4)
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r3, r0)
            return r3
    }

    public int compositeOverlay(int r1, float r2, android.view.View r3) {
            r0 = this;
            float r3 = r0.getParentAbsoluteElevation(r3)
            float r2 = r2 + r3
            int r1 = r0.compositeOverlay(r1, r2)
            return r1
    }

    public int compositeOverlayIfNeeded(int r2, float r3) {
            r1 = this;
            boolean r0 = r1.elevationOverlayEnabled
            if (r0 == 0) goto Le
            boolean r0 = r1.isThemeSurfaceColor(r2)
            if (r0 == 0) goto Le
            int r2 = r1.compositeOverlay(r2, r3)
        Le:
            return r2
    }

    public int compositeOverlayIfNeeded(int r1, float r2, android.view.View r3) {
            r0 = this;
            float r3 = r0.getParentAbsoluteElevation(r3)
            float r2 = r2 + r3
            int r1 = r0.compositeOverlayIfNeeded(r1, r2)
            return r1
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float r2) {
            r1 = this;
            int r0 = r1.colorSurface
            int r2 = r1.compositeOverlayIfNeeded(r0, r2)
            return r2
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float r1, android.view.View r2) {
            r0 = this;
            float r2 = r0.getParentAbsoluteElevation(r2)
            float r1 = r1 + r2
            int r1 = r0.compositeOverlayWithThemeSurfaceColorIfNeeded(r1)
            return r1
    }

    public float getParentAbsoluteElevation(android.view.View r1) {
            r0 = this;
            float r1 = com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(r1)
            return r1
    }

    public int getThemeElevationOverlayColor() {
            r1 = this;
            int r0 = r1.elevationOverlayColor
            return r0
    }

    public int getThemeSurfaceColor() {
            r1 = this;
            int r0 = r1.colorSurface
            return r0
    }

    public boolean isThemeElevationOverlayEnabled() {
            r1 = this;
            boolean r0 = r1.elevationOverlayEnabled
            return r0
    }
}
