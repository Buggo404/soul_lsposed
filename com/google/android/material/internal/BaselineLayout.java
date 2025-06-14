package com.google.android.material.internal;

/* loaded from: classes.dex */
public class BaselineLayout extends android.view.ViewGroup {
    private int baseline;

    public BaselineLayout(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            r3 = -1
            r2.baseline = r3
            return
    }

    public BaselineLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = -1
            r1.baseline = r2
            return
    }

    public BaselineLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.baseline = r1
            return
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            int r0 = r1.baseline
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            int r7 = r6.getChildCount()
            int r9 = r6.getPaddingLeft()
            int r10 = r10 - r8
            int r8 = r6.getPaddingRight()
            int r10 = r10 - r8
            int r10 = r10 - r9
            int r8 = r6.getPaddingTop()
            r11 = 0
        L14:
            if (r11 >= r7) goto L4d
            android.view.View r0 = r6.getChildAt(r11)
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L23
            goto L4a
        L23:
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            int r3 = r10 - r1
            int r3 = r3 / 2
            int r3 = r3 + r9
            int r4 = r6.baseline
            r5 = -1
            if (r4 == r5) goto L44
            int r4 = r0.getBaseline()
            if (r4 == r5) goto L44
            int r4 = r6.baseline
            int r4 = r4 + r8
            int r5 = r0.getBaseline()
            int r4 = r4 - r5
            goto L45
        L44:
            r4 = r8
        L45:
            int r1 = r1 + r3
            int r2 = r2 + r4
            r0.layout(r3, r4, r1, r2)
        L4a:
            int r11 = r11 + 1
            goto L14
        L4d:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r12, int r13) {
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = -1
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r2
            r7 = r6
        Lb:
            if (r1 >= r0) goto L4b
            android.view.View r8 = r11.getChildAt(r1)
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 != r10) goto L1a
            goto L48
        L1a:
            r11.measureChild(r8, r12, r13)
            int r9 = r8.getBaseline()
            if (r9 == r2) goto L30
            int r6 = java.lang.Math.max(r6, r9)
            int r10 = r8.getMeasuredHeight()
            int r10 = r10 - r9
            int r7 = java.lang.Math.max(r7, r10)
        L30:
            int r9 = r8.getMeasuredWidth()
            int r4 = java.lang.Math.max(r4, r9)
            int r9 = r8.getMeasuredHeight()
            int r3 = java.lang.Math.max(r3, r9)
            int r8 = r8.getMeasuredState()
            int r5 = android.view.View.combineMeasuredStates(r5, r8)
        L48:
            int r1 = r1 + 1
            goto Lb
        L4b:
            if (r6 == r2) goto L5c
            int r0 = r11.getPaddingBottom()
            int r0 = java.lang.Math.max(r7, r0)
            int r0 = r0 + r6
            int r3 = java.lang.Math.max(r3, r0)
            r11.baseline = r6
        L5c:
            int r0 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r5)
            int r1 = r5 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
    }
}
