package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class MonthsPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder> {
    private final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private final android.content.Context context;
    private final com.google.android.material.datepicker.DateSelector<?> dateSelector;
    private final int itemHeight;
    private final com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener onDayClickListener;


    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final com.google.android.material.datepicker.MaterialCalendarGridView monthGrid;
        final android.widget.TextView monthTitle;

        ViewHolder(android.widget.LinearLayout r3, boolean r4) {
                r2 = this;
                r2.<init>(r3)
                int r0 = com.google.android.material.C0479R.id.month_title
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2.monthTitle = r0
                r1 = 1
                androidx.core.view.ViewCompat.setAccessibilityHeading(r0, r1)
                int r1 = com.google.android.material.C0479R.id.month_grid
                android.view.View r3 = r3.findViewById(r1)
                com.google.android.material.datepicker.MaterialCalendarGridView r3 = (com.google.android.material.datepicker.MaterialCalendarGridView) r3
                r2.monthGrid = r3
                if (r4 != 0) goto L22
                r3 = 8
                r0.setVisibility(r3)
            L22:
                return
        }
    }

    MonthsPagerAdapter(android.content.Context r4, com.google.android.material.datepicker.DateSelector<?> r5, com.google.android.material.datepicker.CalendarConstraints r6, com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener r7) {
            r3 = this;
            r3.<init>()
            com.google.android.material.datepicker.Month r0 = r6.getStart()
            com.google.android.material.datepicker.Month r1 = r6.getEnd()
            com.google.android.material.datepicker.Month r2 = r6.getOpenAt()
            int r0 = r0.compareTo2(r2)
            if (r0 > 0) goto L46
            int r0 = r2.compareTo2(r1)
            if (r0 > 0) goto L3e
            int r0 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r1 = com.google.android.material.datepicker.MaterialCalendar.getDayHeight(r4)
            int r0 = r0 * r1
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r4)
            if (r1 == 0) goto L2d
            int r1 = com.google.android.material.datepicker.MaterialCalendar.getDayHeight(r4)
            goto L2e
        L2d:
            r1 = 0
        L2e:
            r3.context = r4
            int r0 = r0 + r1
            r3.itemHeight = r0
            r3.calendarConstraints = r6
            r3.dateSelector = r5
            r3.onDayClickListener = r7
            r4 = 1
            r3.setHasStableIds(r4)
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "currentPage cannot be after lastPage"
            r4.<init>(r5)
            throw r4
        L46:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "firstPage cannot be after currentPage"
            r4.<init>(r5)
            throw r4
    }

    static /* synthetic */ com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener access$000(com.google.android.material.datepicker.MonthsPagerAdapter r0) {
            com.google.android.material.datepicker.MaterialCalendar$OnDayClickListener r0 = r0.onDayClickListener
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            int r0 = r0.getMonthSpan()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            com.google.android.material.datepicker.Month r3 = r0.monthsLater(r3)
            long r0 = r3.getStableId()
            return r0
    }

    com.google.android.material.datepicker.Month getPageMonth(int r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            com.google.android.material.datepicker.Month r2 = r0.monthsLater(r2)
            return r2
    }

    java.lang.CharSequence getPageTitle(int r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r2 = r1.getPageMonth(r2)
            android.content.Context r0 = r1.context
            java.lang.String r2 = r2.getLongName(r0)
            return r2
    }

    int getPosition(com.google.android.material.datepicker.Month r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r2 = r0.monthsUntil(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r1 = (com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder r4, int r5) {
            r3 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r3.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            com.google.android.material.datepicker.Month r5 = r0.monthsLater(r5)
            android.widget.TextView r0 = r4.monthTitle
            android.view.View r1 = r4.itemView
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r5.getLongName(r1)
            r0.setText(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r4 = r4.monthGrid
            int r0 = com.google.android.material.C0479R.id.month_grid
            android.view.View r4 = r4.findViewById(r0)
            com.google.android.material.datepicker.MaterialCalendarGridView r4 = (com.google.android.material.datepicker.MaterialCalendarGridView) r4
            com.google.android.material.datepicker.MonthAdapter r0 = r4.getAdapter()
            if (r0 == 0) goto L40
            com.google.android.material.datepicker.MonthAdapter r0 = r4.getAdapter()
            com.google.android.material.datepicker.Month r0 = r0.month
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L40
            r4.invalidate()
            com.google.android.material.datepicker.MonthAdapter r5 = r4.getAdapter()
            r5.updateSelectedStates(r4)
            goto L51
        L40:
            com.google.android.material.datepicker.MonthAdapter r0 = new com.google.android.material.datepicker.MonthAdapter
            com.google.android.material.datepicker.DateSelector<?> r1 = r3.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r2 = r3.calendarConstraints
            r0.<init>(r5, r1, r2)
            int r5 = r5.daysInWeek
            r4.setNumColumns(r5)
            r4.setAdapter(r0)
        L51:
            com.google.android.material.datepicker.MonthsPagerAdapter$1 r5 = new com.google.android.material.datepicker.MonthsPagerAdapter$1
            r5.<init>(r3, r4)
            r4.setOnItemClickListener(r5)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.C0479R.layout.mtrl_calendar_month_labeled
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.content.Context r3 = r3.getContext()
            boolean r3 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r3)
            if (r3 == 0) goto L2d
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r0 = -1
            int r1 = r2.itemHeight
            r3.<init>(r0, r1)
            r4.setLayoutParams(r3)
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r3 = new com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder
            r0 = 1
            r3.<init>(r4, r0)
            return r3
        L2d:
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r3 = new com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder
            r3.<init>(r4, r1)
            return r3
    }
}
