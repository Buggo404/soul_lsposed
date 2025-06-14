package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class RadialViewGroup extends androidx.constraintlayout.widget.ConstraintLayout {
    private static final java.lang.String SKIP_TAG = "skip";
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private int radius;
    private final java.lang.Runnable updateLayoutParametersRunnable;


    public RadialViewGroup(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RadialViewGroup(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RadialViewGroup(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            int r1 = com.google.android.material.C0479R.layout.material_radial_view_group
            r0.inflate(r1, r2)
            android.graphics.drawable.Drawable r0 = r2.createBackground()
            androidx.core.view.ViewCompat.setBackground(r2, r0)
            int[] r0 = com.google.android.material.C0479R.styleable.RadialViewGroup
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r4 = com.google.android.material.C0479R.styleable.RadialViewGroup_materialCircleRadius
            int r4 = r3.getDimensionPixelSize(r4, r1)
            r2.radius = r4
            com.google.android.material.timepicker.RadialViewGroup$1 r4 = new com.google.android.material.timepicker.RadialViewGroup$1
            r4.<init>(r2)
            r2.updateLayoutParametersRunnable = r4
            r3.recycle()
            return
    }

    private android.graphics.drawable.Drawable createBackground() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r3.background = r0
            com.google.android.material.shape.RelativeCornerSize r1 = new com.google.android.material.shape.RelativeCornerSize
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r2)
            r0.setCornerSize(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.background
            r1 = -1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.background
            return r0
    }

    private static boolean shouldSkipView(android.view.View r1) {
            java.lang.String r0 = "skip"
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r0.equals(r1)
            return r1
    }

    private void updateLayoutParamsAsync() {
            r2 = this;
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto L10
            java.lang.Runnable r1 = r2.updateLayoutParametersRunnable
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r2.updateLayoutParametersRunnable
            r0.post(r1)
        L10:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = r1.getId()
            r3 = -1
            if (r2 != r3) goto L11
            int r2 = androidx.core.view.ViewCompat.generateViewId()
            r1.setId(r2)
        L11:
            r0.updateLayoutParamsAsync()
            return
    }

    public int getRadius() {
            r1 = this;
            int r0 = r1.radius
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.updateLayoutParams()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View r1) {
            r0 = this;
            super.onViewRemoved(r1)
            r0.updateLayoutParamsAsync()
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.background
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setFillColor(r2)
            return
    }

    public void setRadius(int r1) {
            r0 = this;
            r0.radius = r1
            r0.updateLayoutParams()
            return
    }

    protected void updateLayoutParams() {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 1
            r2 = 0
            r3 = r2
        L7:
            if (r3 >= r0) goto L18
            android.view.View r4 = r8.getChildAt(r3)
            boolean r4 = shouldSkipView(r4)
            if (r4 == 0) goto L15
            int r1 = r1 + 1
        L15:
            int r3 = r3 + 1
            goto L7
        L18:
            androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet
            r3.<init>()
            r3.clone(r8)
            r4 = 0
        L21:
            if (r2 >= r0) goto L4b
            android.view.View r5 = r8.getChildAt(r2)
            int r6 = r5.getId()
            int r7 = com.google.android.material.C0479R.id.circle_center
            if (r6 == r7) goto L48
            boolean r6 = shouldSkipView(r5)
            if (r6 == 0) goto L36
            goto L48
        L36:
            int r5 = r5.getId()
            int r6 = com.google.android.material.C0479R.id.circle_center
            int r7 = r8.radius
            r3.constrainCircle(r5, r6, r7, r4)
            int r5 = r0 - r1
            float r5 = (float) r5
            r6 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 / r5
            float r4 = r4 + r6
        L48:
            int r2 = r2 + 1
            goto L21
        L4b:
            r3.applyTo(r8)
            return
    }
}
