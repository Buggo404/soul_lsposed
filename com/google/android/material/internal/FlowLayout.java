package com.google.android.material.internal;

/* loaded from: classes.dex */
public class FlowLayout extends android.view.ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FlowLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FlowLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 0
            r0.singleLine = r3
            r0.loadFromAttributes(r1, r2)
            return
    }

    public FlowLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 0
            r0.singleLine = r3
            r0.loadFromAttributes(r1, r2)
            return
    }

    private static int getMeasuredDimension(int r1, int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto La
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == r0) goto L9
            return r3
        L9:
            return r1
        La:
            int r1 = java.lang.Math.min(r3, r1)
            return r1
    }

    private void loadFromAttributes(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int[] r0 = com.google.android.material.C0479R.styleable.FlowLayout
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r1, r1)
            int r4 = com.google.android.material.C0479R.styleable.FlowLayout_lineSpacing
            int r4 = r3.getDimensionPixelSize(r4, r1)
            r2.lineSpacing = r4
            int r4 = com.google.android.material.C0479R.styleable.FlowLayout_itemSpacing
            int r4 = r3.getDimensionPixelSize(r4, r1)
            r2.itemSpacing = r4
            r3.recycle()
            return
    }

    protected int getItemSpacing() {
            r1 = this;
            int r0 = r1.itemSpacing
            return r0
    }

    protected int getLineSpacing() {
            r1 = this;
            int r0 = r1.lineSpacing
            return r0
    }

    protected int getRowCount() {
            r1 = this;
            int r0 = r1.rowCount
            return r0
    }

    public int getRowIndex(android.view.View r2) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.id.row_index_key
            java.lang.Object r2 = r2.getTag(r0)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto Lc
            r2 = -1
            return r2
        Lc:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public boolean isSingleLine() {
            r1 = this;
            boolean r0 = r1.singleLine
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            int r10 = r9.getChildCount()
            r12 = 0
            if (r10 != 0) goto La
            r9.rowCount = r12
            return
        La:
            r10 = 1
            r9.rowCount = r10
            int r14 = androidx.core.view.ViewCompat.getLayoutDirection(r9)
            if (r14 != r10) goto L15
            r14 = r10
            goto L16
        L15:
            r14 = r12
        L16:
            if (r14 == 0) goto L1d
            int r0 = r9.getPaddingRight()
            goto L21
        L1d:
            int r0 = r9.getPaddingLeft()
        L21:
            if (r14 == 0) goto L28
            int r1 = r9.getPaddingLeft()
            goto L2c
        L28:
            int r1 = r9.getPaddingRight()
        L2c:
            int r2 = r9.getPaddingTop()
            int r13 = r13 - r11
            int r13 = r13 - r1
            r1 = r12
            r3 = r0
            r11 = r2
        L35:
            int r4 = r9.getChildCount()
            if (r1 >= r4) goto Lb1
            android.view.View r4 = r9.getChildAt(r1)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L52
            int r5 = com.google.android.material.C0479R.id.row_index_key
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.setTag(r5, r6)
            goto Lae
        L52:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L65
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r5)
            int r5 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r5)
            goto L67
        L65:
            r5 = r12
            r6 = r5
        L67:
            int r7 = r3 + r6
            int r8 = r4.getMeasuredWidth()
            int r7 = r7 + r8
            boolean r8 = r9.singleLine
            if (r8 != 0) goto L7d
            if (r7 <= r13) goto L7d
            int r11 = r9.lineSpacing
            int r11 = r11 + r2
            int r2 = r9.rowCount
            int r2 = r2 + r10
            r9.rowCount = r2
            r3 = r0
        L7d:
            int r2 = com.google.android.material.C0479R.id.row_index_key
            int r7 = r9.rowCount
            int r7 = r7 - r10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.setTag(r2, r7)
            int r2 = r3 + r6
            int r7 = r4.getMeasuredWidth()
            int r7 = r7 + r2
            int r8 = r4.getMeasuredHeight()
            int r8 = r8 + r11
            if (r14 == 0) goto La0
            int r2 = r13 - r7
            int r7 = r13 - r3
            int r7 = r7 - r6
            r4.layout(r2, r11, r7, r8)
            goto La3
        La0:
            r4.layout(r2, r11, r7, r8)
        La3:
            int r6 = r6 + r5
            int r2 = r4.getMeasuredWidth()
            int r6 = r6 + r2
            int r2 = r9.itemSpacing
            int r6 = r6 + r2
            int r3 = r3 + r6
            r2 = r8
        Lae:
            int r1 = r1 + 1
            goto L35
        Lb1:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r21, int r22) {
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getSize(r21)
            int r2 = android.view.View.MeasureSpec.getMode(r21)
            int r3 = android.view.View.MeasureSpec.getSize(r22)
            int r4 = android.view.View.MeasureSpec.getMode(r22)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r5) goto L1f
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 != r5) goto L1b
            goto L1f
        L1b:
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L20
        L1f:
            r5 = r1
        L20:
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingTop()
            int r8 = r20.getPaddingRight()
            int r5 = r5 - r8
            r9 = r7
            r10 = 0
            r11 = 0
        L30:
            int r12 = r20.getChildCount()
            if (r10 >= r12) goto Laf
            android.view.View r12 = r0.getChildAt(r10)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L49
            r13 = r21
            r14 = r22
            r16 = 0
            goto Lac
        L49:
            r13 = r21
            r14 = r22
            r0.measureChild(r12, r13, r14)
            android.view.ViewGroup$LayoutParams r15 = r12.getLayoutParams()
            boolean r8 = r15 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L65
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            int r8 = r15.leftMargin
            r16 = 0
            int r8 = r8 + 0
            int r15 = r15.rightMargin
            int r15 = r15 + 0
            goto L6a
        L65:
            r16 = 0
            r8 = r16
            r15 = r8
        L6a:
            int r17 = r6 + r8
            int r18 = r12.getMeasuredWidth()
            r19 = r6
            int r6 = r17 + r18
            if (r6 <= r5) goto L84
            boolean r6 = r20.isSingleLine()
            if (r6 != 0) goto L84
            int r6 = r20.getPaddingLeft()
            int r9 = r0.lineSpacing
            int r9 = r9 + r7
            goto L86
        L84:
            r6 = r19
        L86:
            int r7 = r6 + r8
            int r17 = r12.getMeasuredWidth()
            int r7 = r7 + r17
            int r17 = r12.getMeasuredHeight()
            int r17 = r9 + r17
            if (r7 <= r11) goto L97
            r11 = r7
        L97:
            int r8 = r8 + r15
            int r7 = r12.getMeasuredWidth()
            int r8 = r8 + r7
            int r7 = r0.itemSpacing
            int r8 = r8 + r7
            int r6 = r6 + r8
            int r7 = r20.getChildCount()
            int r7 = r7 + (-1)
            if (r10 != r7) goto Laa
            int r11 = r11 + r15
        Laa:
            r7 = r17
        Lac:
            int r10 = r10 + 1
            goto L30
        Laf:
            int r5 = r20.getPaddingRight()
            int r11 = r11 + r5
            int r5 = r20.getPaddingBottom()
            int r7 = r7 + r5
            int r1 = getMeasuredDimension(r1, r2, r11)
            int r2 = getMeasuredDimension(r3, r4, r7)
            r0.setMeasuredDimension(r1, r2)
            return
    }

    protected void setItemSpacing(int r1) {
            r0 = this;
            r0.itemSpacing = r1
            return
    }

    protected void setLineSpacing(int r1) {
            r0 = this;
            r0.lineSpacing = r1
            return
    }

    public void setSingleLine(boolean r1) {
            r0 = this;
            r0.singleLine = r1
            return
    }
}
