package com.google.android.material.datepicker;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;
    private final boolean nestedScrollable;


    public MaterialCalendarGridView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r0.dayCompute = r1
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r1)
            if (r1 == 0) goto L1d
            int r1 = com.google.android.material.C0479R.id.cancel_button
            r0.setNextFocusLeftId(r1)
            int r1 = com.google.android.material.C0479R.id.confirm_button
            r0.setNextFocusRightId(r1)
        L1d:
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isNestedScrollable(r1)
            r0.nestedScrollable = r1
            com.google.android.material.datepicker.MaterialCalendarGridView$1 r1 = new com.google.android.material.datepicker.MaterialCalendarGridView$1
            r1.<init>(r0)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    private void gainFocus(int r2, android.graphics.Rect r3) {
            r1 = this;
            r0 = 33
            if (r2 != r0) goto L10
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.lastPositionInMonth()
            r1.setSelection(r2)
            goto L24
        L10:
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L20
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            r1.setSelection(r2)
            goto L24
        L20:
            r0 = 1
            super.onFocusChanged(r0, r2, r3)
        L24:
            return
    }

    private static int horizontalMidPoint(android.view.View r1) {
            int r0 = r1.getLeft()
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            int r0 = r0 + r1
            return r0
    }

    private static boolean skipMonth(java.lang.Long r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6) {
            r0 = 1
            if (r3 == 0) goto L24
            if (r4 == 0) goto L24
            if (r5 == 0) goto L24
            if (r6 != 0) goto La
            goto L24
        La:
            long r1 = r5.longValue()
            long r4 = r4.longValue()
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L24
            long r4 = r6.longValue()
            long r1 = r3.longValue()
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ android.widget.Adapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ android.widget.ListAdapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public com.google.android.material.datepicker.MonthAdapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.MonthAdapter r0 = (com.google.android.material.datepicker.MonthAdapter) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas r26) {
            r25 = this;
            r0 = r25
            super.onDraw(r26)
            com.google.android.material.datepicker.MonthAdapter r1 = r25.getAdapter()
            com.google.android.material.datepicker.DateSelector<?> r2 = r1.dateSelector
            com.google.android.material.datepicker.CalendarStyle r3 = r1.calendarStyle
            int r4 = r1.firstPositionInMonth()
            java.lang.Long r4 = r1.getItem(r4)
            int r5 = r1.lastPositionInMonth()
            java.lang.Long r5 = r1.getItem(r5)
            java.util.Collection r2 = r2.getSelectedRanges()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L165
            java.lang.Object r6 = r2.next()
            androidx.core.util.Pair r6 = (androidx.core.util.Pair) r6
            F r7 = r6.first
            if (r7 == 0) goto L161
            S r7 = r6.second
            if (r7 != 0) goto L3a
            goto L25
        L3a:
            F r7 = r6.first
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            S r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            boolean r6 = skipMonth(r4, r5, r6, r11)
            if (r6 == 0) goto L59
            goto L25
        L59:
            boolean r6 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r25)
            long r11 = r4.longValue()
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r12 = 5
            if (r11 >= 0) goto L8a
            int r7 = r1.firstPositionInMonth()
            boolean r8 = r1.isFirstInRow(r7)
            if (r8 == 0) goto L72
            r8 = 0
            goto La1
        L72:
            if (r6 != 0) goto L7f
            int r8 = r7 + (-1)
            android.view.View r8 = r0.getChildAt(r8)
            int r8 = r8.getRight()
            goto La1
        L7f:
            int r8 = r7 + (-1)
            android.view.View r8 = r0.getChildAt(r8)
            int r8 = r8.getLeft()
            goto La1
        L8a:
            java.util.Calendar r11 = r0.dayCompute
            r11.setTimeInMillis(r7)
            java.util.Calendar r7 = r0.dayCompute
            int r7 = r7.get(r12)
            int r7 = r1.dayToPosition(r7)
            android.view.View r8 = r0.getChildAt(r7)
            int r8 = horizontalMidPoint(r8)
        La1:
            long r14 = r5.longValue()
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 <= 0) goto Ld6
            int r9 = r1.lastPositionInMonth()
            int r10 = r25.getChildCount()
            int r10 = r10 + (-1)
            int r9 = java.lang.Math.min(r9, r10)
            boolean r10 = r1.isLastInRow(r9)
            if (r10 == 0) goto Lc2
            int r10 = r25.getWidth()
            goto Led
        Lc2:
            if (r6 != 0) goto Lcd
            android.view.View r10 = r0.getChildAt(r9)
            int r10 = r10.getRight()
            goto Led
        Lcd:
            android.view.View r10 = r0.getChildAt(r9)
            int r10 = r10.getLeft()
            goto Led
        Ld6:
            java.util.Calendar r11 = r0.dayCompute
            r11.setTimeInMillis(r9)
            java.util.Calendar r9 = r0.dayCompute
            int r9 = r9.get(r12)
            int r9 = r1.dayToPosition(r9)
            android.view.View r10 = r0.getChildAt(r9)
            int r10 = horizontalMidPoint(r10)
        Led:
            long r11 = r1.getItemId(r7)
            int r11 = (int) r11
            long r14 = r1.getItemId(r9)
            int r12 = (int) r14
        Lf7:
            if (r11 > r12) goto L161
            int r14 = r25.getNumColumns()
            int r14 = r14 * r11
            int r15 = r25.getNumColumns()
            int r15 = r15 + r14
            int r15 = r15 + (-1)
            android.view.View r16 = r0.getChildAt(r14)
            int r17 = r16.getTop()
            com.google.android.material.datepicker.CalendarItemStyle r13 = r3.day
            int r13 = r13.getTopInset()
            int r13 = r17 + r13
            int r16 = r16.getBottom()
            com.google.android.material.datepicker.CalendarItemStyle r0 = r3.day
            int r0 = r0.getBottomInset()
            int r0 = r16 - r0
            if (r6 != 0) goto L131
            if (r14 <= r7) goto L127
            r14 = 0
            goto L128
        L127:
            r14 = r8
        L128:
            if (r9 <= r15) goto L12f
            int r15 = r25.getWidth()
            goto L143
        L12f:
            r15 = r10
            goto L143
        L131:
            if (r9 <= r15) goto L135
            r15 = 0
            goto L136
        L135:
            r15 = r10
        L136:
            if (r14 <= r7) goto L13d
            int r14 = r25.getWidth()
            goto L13e
        L13d:
            r14 = r8
        L13e:
            r24 = r15
            r15 = r14
            r14 = r24
        L143:
            float r14 = (float) r14
            float r13 = (float) r13
            float r15 = (float) r15
            float r0 = (float) r0
            r16 = r1
            android.graphics.Paint r1 = r3.rangeFill
            r18 = r26
            r19 = r14
            r20 = r13
            r21 = r15
            r22 = r0
            r23 = r1
            r18.drawRect(r19, r20, r21, r22, r23)
            int r11 = r11 + 1
            r0 = r25
            r1 = r16
            goto Lf7
        L161:
            r0 = r25
            goto L25
        L165:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.gainFocus(r2, r3)
            goto La
        L6:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
        La:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L30
            int r5 = r3.getSelectedItemPosition()
            com.google.android.material.datepicker.MonthAdapter r1 = r3.getAdapter()
            int r1 = r1.firstPositionInMonth()
            if (r5 < r1) goto L1f
            goto L30
        L1f:
            r5 = 19
            if (r5 != r4) goto L2f
            com.google.android.material.datepicker.MonthAdapter r4 = r3.getAdapter()
            int r4 = r4.firstPositionInMonth()
            r3.setSelection(r4)
            return r2
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.nestedScrollable
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getMeasuredHeight()
            r2.height = r3
            goto L1e
        L1b:
            super.onMeasure(r2, r3)
        L1e:
            return
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(android.widget.ListAdapter r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.material.datepicker.MonthAdapter
            if (r0 == 0) goto L8
            super.setAdapter(r4)
            return
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r1 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r1 = r1.getCanonicalName()
            r2 = 0
            r0[r2] = r1
            java.lang.Class<com.google.android.material.datepicker.MonthAdapter> r1 = com.google.android.material.datepicker.MonthAdapter.class
            java.lang.String r1 = r1.getCanonicalName()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            int r0 = r0.firstPositionInMonth()
            if (r2 >= r0) goto L16
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            super.setSelection(r2)
            goto L19
        L16:
            super.setSelection(r2)
        L19:
            return
    }
}
