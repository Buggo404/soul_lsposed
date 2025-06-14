package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    public CircularProgressIndicatorSpec(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.circularProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CircularProgressIndicatorSpec(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public CircularProgressIndicatorSpec(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
            r9 = this;
            r9.<init>(r10, r11, r12, r13)
            android.content.res.Resources r0 = r10.getResources()
            int r1 = com.google.android.material.C0479R.dimen.mtrl_progress_circular_size_medium
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r10.getResources()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_progress_circular_inset_medium
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r4 = com.google.android.material.C0479R.styleable.CircularProgressIndicator
            r8 = 0
            int[] r7 = new int[r8]
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            android.content.res.TypedArray r11 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r12 = com.google.android.material.C0479R.styleable.CircularProgressIndicator_indicatorSize
            int r12 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r10, r11, r12, r0)
            r9.indicatorSize = r12
            int r12 = com.google.android.material.C0479R.styleable.CircularProgressIndicator_indicatorInset
            int r10 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r10, r11, r12, r1)
            r9.indicatorInset = r10
            int r10 = com.google.android.material.C0479R.styleable.CircularProgressIndicator_indicatorDirectionCircular
            int r10 = r11.getInt(r10, r8)
            r9.indicatorDirection = r10
            r11.recycle()
            r9.validateSpec()
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    void validateSpec() {
            r3 = this;
            int r0 = r3.indicatorSize
            int r1 = r3.trackThickness
            int r1 = r1 * 2
            if (r0 < r1) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The indicatorSize ("
            r1.<init>(r2)
            int r2 = r3.indicatorSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " px) cannot be less than twice of the trackThickness ("
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.trackThickness
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " px)."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
