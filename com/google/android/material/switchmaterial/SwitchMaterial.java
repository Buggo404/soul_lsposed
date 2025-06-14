package com.google.android.material.switchmaterial;

/* loaded from: classes.dex */
public class SwitchMaterial extends androidx.appcompat.widget.SwitchCompat {
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] ENABLED_CHECKED_STATES = null;
    private final com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
    private android.content.res.ColorStateList materialThemeColorsThumbTintList;
    private android.content.res.ColorStateList materialThemeColorsTrackTintList;
    private boolean useMaterialThemeColors;

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_CompoundButton_Switch
            com.google.android.material.switchmaterial.SwitchMaterial.DEF_STYLE_RES = r0
            r0 = 4
            int[][] r0 = new int[r0][]
            r1 = 2
            int[] r2 = new int[r1]
            r2 = {x002a: FILL_ARRAY_DATA , data: [16842910, 16842912} // fill-array
            r3 = 0
            r0[r3] = r2
            int[] r2 = new int[r1]
            r2 = {x0032: FILL_ARRAY_DATA , data: [16842910, -16842912} // fill-array
            r3 = 1
            r0[r3] = r2
            int[] r2 = new int[r1]
            r2 = {x003a: FILL_ARRAY_DATA , data: [-16842910, 16842912} // fill-array
            r0[r1] = r2
            int[] r1 = new int[r1]
            r1 = {x0042: FILL_ARRAY_DATA , data: [-16842910, -16842912} // fill-array
            r2 = 3
            r0[r2] = r1
            com.google.android.material.switchmaterial.SwitchMaterial.ENABLED_CHECKED_STATES = r0
            return
    }

    public SwitchMaterial(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SwitchMaterial(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.switchStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            com.google.android.material.elevation.ElevationOverlayProvider r7 = new com.google.android.material.elevation.ElevationOverlayProvider
            r7.<init>(r0)
            r6.elevationOverlayProvider = r7
            int[] r2 = com.google.android.material.C0479R.styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C0479R.styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.useMaterialThemeColors = r7
            r8.recycle()
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsThumbTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.materialThemeColorsThumbTintList
            if (r0 != 0) goto L52
            int r0 = com.google.android.material.C0479R.attr.colorSurface
            int r0 = com.google.android.material.color.MaterialColors.getColor(r7, r0)
            int r1 = com.google.android.material.C0479R.attr.colorControlActivated
            int r1 = com.google.android.material.color.MaterialColors.getColor(r7, r1)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.C0479R.dimen.mtrl_switch_thumb_elevation
            float r2 = r2.getDimension(r3)
            com.google.android.material.elevation.ElevationOverlayProvider r3 = r7.elevationOverlayProvider
            boolean r3 = r3.isThemeElevationOverlayEnabled()
            if (r3 == 0) goto L27
            float r3 = com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(r7)
            float r2 = r2 + r3
        L27:
            com.google.android.material.elevation.ElevationOverlayProvider r3 = r7.elevationOverlayProvider
            int r2 = r3.compositeOverlayIfNeeded(r0, r2)
            int[][] r3 = com.google.android.material.switchmaterial.SwitchMaterial.ENABLED_CHECKED_STATES
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = com.google.android.material.color.MaterialColors.layer(r0, r1, r5)
            r6 = 0
            r4[r6] = r5
            r5 = 1
            r4[r5] = r2
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r0 = com.google.android.material.color.MaterialColors.layer(r0, r1, r5)
            r1 = 2
            r4[r1] = r0
            r0 = 3
            r4[r0] = r2
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r3, r4)
            r7.materialThemeColorsThumbTintList = r0
        L52:
            android.content.res.ColorStateList r0 = r7.materialThemeColorsThumbTintList
            return r0
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTrackTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.materialThemeColorsTrackTintList
            if (r0 != 0) goto L47
            int[][] r0 = com.google.android.material.switchmaterial.SwitchMaterial.ENABLED_CHECKED_STATES
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.C0479R.attr.colorSurface
            int r2 = com.google.android.material.color.MaterialColors.getColor(r7, r2)
            int r3 = com.google.android.material.C0479R.attr.colorControlActivated
            int r3 = com.google.android.material.color.MaterialColors.getColor(r7, r3)
            int r4 = com.google.android.material.C0479R.attr.colorOnSurface
            int r4 = com.google.android.material.color.MaterialColors.getColor(r7, r4)
            r5 = 1057635697(0x3f0a3d71, float:0.54)
            int r5 = com.google.android.material.color.MaterialColors.layer(r2, r3, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 1050924810(0x3ea3d70a, float:0.32)
            int r5 = com.google.android.material.color.MaterialColors.layer(r2, r4, r5)
            r6 = 1
            r1[r6] = r5
            r5 = 2
            r6 = 1039516303(0x3df5c28f, float:0.12)
            int r3 = com.google.android.material.color.MaterialColors.layer(r2, r3, r6)
            r1[r5] = r3
            r3 = 3
            int r2 = com.google.android.material.color.MaterialColors.layer(r2, r4, r6)
            r1[r3] = r2
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r7.materialThemeColorsTrackTintList = r2
        L47:
            android.content.res.ColorStateList r0 = r7.materialThemeColorsTrackTintList
            return r0
    }

    public boolean isUseMaterialThemeColors() {
            r1 = this;
            boolean r0 = r1.useMaterialThemeColors
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.useMaterialThemeColors
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r0 = r1.getThumbTintList()
            if (r0 != 0) goto L14
            android.content.res.ColorStateList r0 = r1.getMaterialThemeColorsThumbTintList()
            r1.setThumbTintList(r0)
        L14:
            boolean r0 = r1.useMaterialThemeColors
            if (r0 == 0) goto L25
            android.content.res.ColorStateList r0 = r1.getTrackTintList()
            if (r0 != 0) goto L25
            android.content.res.ColorStateList r0 = r1.getMaterialThemeColorsTrackTintList()
            r1.setTrackTintList(r0)
        L25:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.useMaterialThemeColors = r1
            if (r1 == 0) goto L13
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsThumbTintList()
            r0.setThumbTintList(r1)
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTrackTintList()
            r0.setTrackTintList(r1)
            goto L1a
        L13:
            r1 = 0
            r0.setThumbTintList(r1)
            r0.setTrackTintList(r1)
        L1a:
            return
    }
}
