package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class MonthAdapter extends android.widget.BaseAdapter {
    static final int MAXIMUM_WEEKS = 0;
    final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    com.google.android.material.datepicker.CalendarStyle calendarStyle;
    final com.google.android.material.datepicker.DateSelector<?> dateSelector;
    final com.google.android.material.datepicker.Month month;
    private java.util.Collection<java.lang.Long> previouslySelectedDates;

    static {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1 = 4
            int r0 = r0.getMaximum(r1)
            com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS = r0
            return
    }

    MonthAdapter(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.DateSelector<?> r2, com.google.android.material.datepicker.CalendarConstraints r3) {
            r0 = this;
            r0.<init>()
            r0.month = r1
            r0.dateSelector = r2
            r0.calendarConstraints = r3
            java.util.Collection r1 = r2.getSelectedDays()
            r0.previouslySelectedDates = r1
            return
    }

    private void initializeStyles(android.content.Context r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarStyle r0 = r1.calendarStyle
            if (r0 != 0) goto Lb
            com.google.android.material.datepicker.CalendarStyle r0 = new com.google.android.material.datepicker.CalendarStyle
            r0.<init>(r2)
            r1.calendarStyle = r0
        Lb:
            return
    }

    private boolean isSelected(long r6) {
            r5 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r5.dateSelector
            java.util.Collection r0 = r0.getSelectedDays()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r6)
            long r1 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r6 = 1
            return r6
        L28:
            r6 = 0
            return r6
    }

    private void updateSelectedState(android.widget.TextView r3, long r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = r0.getDateValidator()
            boolean r0 = r0.isValid(r4)
            if (r0 == 0) goto L34
            r0 = 1
            r3.setEnabled(r0)
            boolean r0 = r2.isSelected(r4)
            if (r0 == 0) goto L1e
            com.google.android.material.datepicker.CalendarStyle r4 = r2.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r4 = r4.selectedDay
            goto L3c
        L1e:
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r0 = r0.getTimeInMillis()
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L2f
            com.google.android.material.datepicker.CalendarStyle r4 = r2.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r4 = r4.todayDay
            goto L3c
        L2f:
            com.google.android.material.datepicker.CalendarStyle r4 = r2.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r4 = r4.day
            goto L3c
        L34:
            r4 = 0
            r3.setEnabled(r4)
            com.google.android.material.datepicker.CalendarStyle r4 = r2.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r4 = r4.invalidDay
        L3c:
            r4.styleItem(r3)
            return
    }

    private void updateSelectedStateForDate(com.google.android.material.datepicker.MaterialCalendarGridView r3, long r4) {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r4)
            com.google.android.material.datepicker.Month r1 = r2.month
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.getDayOfMonth(r4)
            com.google.android.material.datepicker.MonthAdapter r1 = r3.getAdapter()
            int r0 = r1.dayToPosition(r0)
            int r1 = r3.getFirstVisiblePosition()
            int r0 = r0 - r1
            android.view.View r3 = r3.getChildAt(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.updateSelectedState(r3, r4)
        L28:
            return
    }

    int dayToPosition(int r2) {
            r1 = this;
            int r2 = r2 + (-1)
            int r0 = r1.firstPositionInMonth()
            int r0 = r0 + r2
            return r0
    }

    int firstPositionInMonth() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.month
            int r0 = r0.daysFromStartOfWeekToFirstOfMonth()
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.daysInMonth
            int r1 = r2.firstPositionInMonth()
            int r0 = r0 + r1
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Long getItem(int r3) {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.daysFromStartOfWeekToFirstOfMonth()
            if (r3 < r0) goto L1e
            int r0 = r2.lastPositionInMonth()
            if (r3 <= r0) goto Lf
            goto L1e
        Lf:
            com.google.android.material.datepicker.Month r0 = r2.month
            int r3 = r2.positionToDay(r3)
            long r0 = r0.getDay(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.daysInWeek
            int r3 = r3 / r0
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.widget.TextView r1 = r0.getView(r1, r2, r3)
            return r1
    }

    @Override // android.widget.Adapter
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.initializeStyles(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C0479R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.firstPositionInMonth()
            int r7 = r6 - r7
            if (r7 < 0) goto L77
            com.google.android.material.datepicker.Month r8 = r5.month
            int r8 = r8.daysInMonth
            if (r7 < r8) goto L2d
            goto L77
        L2d:
            r8 = 1
            int r7 = r7 + r8
            com.google.android.material.datepicker.Month r2 = r5.month
            r0.setTag(r2)
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r5.month
            long r2 = r2.getDay(r7)
            com.google.android.material.datepicker.Month r7 = r5.month
            int r7 = r7.year
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.current()
            int r4 = r4.year
            if (r7 != r4) goto L69
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.getMonthDayOfWeekDay(r2)
            r0.setContentDescription(r7)
            goto L70
        L69:
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.getYearMonthDayOfWeekDay(r2)
            r0.setContentDescription(r7)
        L70:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L7f
        L77:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7f:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L86
            return r0
        L86:
            long r6 = r6.longValue()
            r5.updateSelectedState(r0, r6)
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }

    boolean isFirstInRow(int r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.month
            int r0 = r0.daysInWeek
            int r2 = r2 % r0
            if (r2 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    boolean isLastInRow(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r3 + r0
            com.google.android.material.datepicker.Month r1 = r2.month
            int r1 = r1.daysInWeek
            int r3 = r3 % r1
            if (r3 != 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    int lastPositionInMonth() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.daysFromStartOfWeekToFirstOfMonth()
            com.google.android.material.datepicker.Month r1 = r2.month
            int r1 = r1.daysInMonth
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    int positionToDay(int r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.month
            int r0 = r0.daysFromStartOfWeekToFirstOfMonth()
            int r2 = r2 - r0
            int r2 = r2 + 1
            return r2
    }

    public void updateSelectedStates(com.google.android.material.datepicker.MaterialCalendarGridView r4) {
            r3 = this;
            java.util.Collection<java.lang.Long> r0 = r3.previouslySelectedDates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.updateSelectedStateForDate(r4, r1)
            goto L6
        L1a:
            com.google.android.material.datepicker.DateSelector<?> r0 = r3.dateSelector
            if (r0 == 0) goto L42
            java.util.Collection r0 = r0.getSelectedDays()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.updateSelectedStateForDate(r4, r1)
            goto L26
        L3a:
            com.google.android.material.datepicker.DateSelector<?> r4 = r3.dateSelector
            java.util.Collection r4 = r4.getSelectedDays()
            r3.previouslySelectedDates = r4
        L42:
            return
    }

    boolean withinMonth(int r2) {
            r1 = this;
            int r0 = r1.firstPositionInMonth()
            if (r2 < r0) goto Le
            int r0 = r1.lastPositionInMonth()
            if (r2 > r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }
}
