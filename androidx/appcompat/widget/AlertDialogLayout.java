package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AlertDialogLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void forceUniformWidth(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.getChildAt(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            int r2 = r8.width
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.height
            int r2 = r3.getMeasuredHeight()
            r8.height = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r0
            r6 = r12
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.height = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    private static int resolveMinimumHeight(android.view.View r3) {
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            if (r0 <= 0) goto L7
            return r0
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L1e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 != r2) goto L1e
            android.view.View r3 = r3.getChildAt(r1)
            int r3 = resolveMinimumHeight(r3)
            return r3
        L1e:
            return r1
    }

    private void setChildFrame(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    private boolean tryOnMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r16.getChildCount()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        Lf:
            r9 = 8
            if (r8 >= r3) goto L3f
            android.view.View r10 = r0.getChildAt(r8)
            int r11 = r10.getVisibility()
            if (r11 != r9) goto L1e
            goto L3c
        L1e:
            int r9 = r10.getId()
            int r11 = androidx.appcompat.C0015R.id.topPanel
            if (r9 != r11) goto L28
            r4 = r10
            goto L3c
        L28:
            int r11 = androidx.appcompat.C0015R.id.buttonPanel
            if (r9 != r11) goto L2e
            r6 = r10
            goto L3c
        L2e:
            int r11 = androidx.appcompat.C0015R.id.contentPanel
            if (r9 == r11) goto L38
            int r11 = androidx.appcompat.C0015R.id.customPanel
            if (r9 != r11) goto L37
            goto L38
        L37:
            return r5
        L38:
            if (r7 == 0) goto L3b
            return r5
        L3b:
            r7 = r10
        L3c:
            int r8 = r8 + 1
            goto Lf
        L3f:
            int r8 = android.view.View.MeasureSpec.getMode(r18)
            int r10 = android.view.View.MeasureSpec.getSize(r18)
            int r11 = android.view.View.MeasureSpec.getMode(r17)
            int r12 = r16.getPaddingTop()
            int r13 = r16.getPaddingBottom()
            int r12 = r12 + r13
            if (r4 == 0) goto L67
            r4.measure(r1, r5)
            int r13 = r4.getMeasuredHeight()
            int r12 = r12 + r13
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r5, r4)
            goto L68
        L67:
            r4 = r5
        L68:
            if (r6 == 0) goto L80
            r6.measure(r1, r5)
            int r13 = resolveMinimumHeight(r6)
            int r14 = r6.getMeasuredHeight()
            int r14 = r14 - r13
            int r12 = r12 + r13
            int r15 = r6.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r15)
            goto L82
        L80:
            r13 = r5
            r14 = r13
        L82:
            if (r7 == 0) goto La3
            if (r8 != 0) goto L88
            r15 = r5
            goto L92
        L88:
            int r15 = r10 - r12
            int r15 = java.lang.Math.max(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
        L92:
            r7.measure(r1, r15)
            int r15 = r7.getMeasuredHeight()
            int r12 = r12 + r15
            int r5 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r5)
            goto La4
        La3:
            r15 = 0
        La4:
            int r10 = r10 - r12
            r5 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto Lc6
            int r12 = r12 - r13
            int r14 = java.lang.Math.min(r10, r14)
            if (r14 <= 0) goto Lb2
            int r10 = r10 - r14
            int r13 = r13 + r14
        Lb2:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r5)
            r6.measure(r1, r13)
            int r13 = r6.getMeasuredHeight()
            int r12 = r12 + r13
            int r6 = r6.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r6)
        Lc6:
            if (r7 == 0) goto Le0
            if (r10 <= 0) goto Le0
            int r12 = r12 - r15
            int r15 = r15 + r10
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
            r7.measure(r1, r6)
            int r6 = r7.getMeasuredHeight()
            int r12 = r12 + r6
            int r6 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r6)
        Le0:
            r6 = 0
            r7 = 0
        Le2:
            if (r6 >= r3) goto Lf9
            android.view.View r8 = r0.getChildAt(r6)
            int r10 = r8.getVisibility()
            if (r10 == r9) goto Lf6
            int r8 = r8.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r8)
        Lf6:
            int r6 = r6 + 1
            goto Le2
        Lf9:
            int r6 = r16.getPaddingLeft()
            int r8 = r16.getPaddingRight()
            int r6 = r6 + r8
            int r7 = r7 + r6
            int r1 = android.view.View.resolveSizeAndState(r7, r1, r4)
            r4 = 0
            int r4 = android.view.View.resolveSizeAndState(r12, r2, r4)
            r0.setMeasuredDimension(r1, r4)
            if (r11 == r5) goto L114
            r0.forceUniformWidth(r3, r2)
        L114:
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = r2
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = r2
        L5a:
            if (r13 >= r10) goto Lbf
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lbc
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lbc
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r15 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r15
            int r2 = r15.gravity
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r17)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L97
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La2
        L92:
            int r2 = r8 - r4
            int r3 = r15.rightMargin
            goto La1
        L97:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
            int r3 = r15.rightMargin
        La1:
            int r2 = r2 - r3
        La2:
            boolean r3 = r6.hasDividerBeforeChildAt(r13)
            if (r3 == 0) goto La9
            int r0 = r0 + r12
        La9:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lbc:
            int r13 = r13 + 1
            goto L5a
        Lbf:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.tryOnMeasure(r2, r3)
            if (r0 != 0) goto L9
            super.onMeasure(r2, r3)
        L9:
            return
    }
}
