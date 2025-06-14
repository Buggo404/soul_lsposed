package com.google.android.material.appbar;

/* loaded from: classes.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    private static final int DEF_STYLE_RES = 0;
    private java.lang.Integer navigationIconTint;

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_Toolbar
            com.google.android.material.appbar.MaterialToolbar.DEF_STYLE_RES = r0
            return
    }

    public MaterialToolbar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialToolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.toolbarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialToolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r7 = r6.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.MaterialToolbar
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r7
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C0479R.styleable.MaterialToolbar_navigationIconTint
            boolean r9 = r8.hasValue(r9)
            if (r9 == 0) goto L2b
            int r9 = com.google.android.material.C0479R.styleable.MaterialToolbar_navigationIconTint
            r0 = -1
            int r9 = r8.getColor(r9, r0)
            r6.setNavigationIconTint(r9)
        L2b:
            r8.recycle()
            r6.initBackground(r7)
            return
    }

    private void initBackground(android.content.Context r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r0 == 0) goto Lb
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 != 0) goto Lb
            return
        Lb:
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            if (r0 == 0) goto L19
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L1a
        L19:
            r0 = 0
        L1a:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setFillColor(r0)
            r1.initializeElevationOverlay(r3)
            float r3 = androidx.core.view.ViewCompat.getElevation(r2)
            r1.setElevation(r3)
            androidx.core.view.ViewCompat.setBackground(r2, r1)
            return
    }

    private android.graphics.drawable.Drawable maybeTintNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.Integer r0 = r1.navigationIconTint
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            java.lang.Integer r0 = r1.navigationIconTint
            int r0 = r0.intValue()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
        L13:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.maybeTintNavigationIcon(r1)
            super.setNavigationIcon(r1)
            return
    }

    public void setNavigationIconTint(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.navigationIconTint = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }
}
