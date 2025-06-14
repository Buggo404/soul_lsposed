package com.google.android.material.checkbox;

/* loaded from: classes.dex */
public class MaterialCheckBox extends androidx.appcompat.widget.AppCompatCheckBox {
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] ENABLED_CHECKED_STATES = null;
    private android.content.res.ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_CompoundButton_CheckBox
            com.google.android.material.checkbox.MaterialCheckBox.DEF_STYLE_RES = r0
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
            com.google.android.material.checkbox.MaterialCheckBox.ENABLED_CHECKED_STATES = r0
            return
    }

    public MaterialCheckBox(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.checkboxStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C0479R.styleable.MaterialCheckBox_buttonTint
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L2a
            int r10 = com.google.android.material.C0479R.styleable.MaterialCheckBox_buttonTint
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r10)
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r7, r8)
        L2a:
            int r8 = com.google.android.material.C0479R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.useMaterialThemeColors = r8
            r9.recycle()
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.materialThemeColorsTintList
            if (r0 != 0) goto L46
            int[][] r0 = com.google.android.material.checkbox.MaterialCheckBox.ENABLED_CHECKED_STATES
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.C0479R.attr.colorControlActivated
            int r2 = com.google.android.material.color.MaterialColors.getColor(r7, r2)
            int r3 = com.google.android.material.C0479R.attr.colorSurface
            int r3 = com.google.android.material.color.MaterialColors.getColor(r7, r3)
            int r4 = com.google.android.material.C0479R.attr.colorOnSurface
            int r4 = com.google.android.material.color.MaterialColors.getColor(r7, r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.google.android.material.color.MaterialColors.layer(r3, r2, r5)
            r5 = 0
            r1[r5] = r2
            r2 = 1057635697(0x3f0a3d71, float:0.54)
            int r2 = com.google.android.material.color.MaterialColors.layer(r3, r4, r2)
            r5 = 1
            r1[r5] = r2
            r2 = 2
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = com.google.android.material.color.MaterialColors.layer(r3, r4, r5)
            r1[r2] = r6
            r2 = 3
            int r3 = com.google.android.material.color.MaterialColors.layer(r3, r4, r5)
            r1[r2] = r3
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r7.materialThemeColorsTintList = r2
        L46:
            android.content.res.ColorStateList r0 = r7.materialThemeColorsTintList
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
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r0 = androidx.core.widget.CompoundButtonCompat.getButtonTintList(r1)
            if (r0 != 0) goto L11
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L11:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.useMaterialThemeColors = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r0, r1)
            goto L10
        Lc:
            r1 = 0
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r0, r1)
        L10:
            return
    }
}
