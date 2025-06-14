package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class YearGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.YearGridAdapter.ViewHolder> {
    private final com.google.android.material.datepicker.MaterialCalendar<?> materialCalendar;


    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final android.widget.TextView textView;

        ViewHolder(android.widget.TextView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.textView = r1
                return
        }
    }

    YearGridAdapter(com.google.android.material.datepicker.MaterialCalendar<?> r1) {
            r0 = this;
            r0.<init>()
            r0.materialCalendar = r1
            return
    }

    static /* synthetic */ com.google.android.material.datepicker.MaterialCalendar access$000(com.google.android.material.datepicker.YearGridAdapter r0) {
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r0.materialCalendar
            return r0
    }

    private android.view.View.OnClickListener createYearClickListener(int r2) {
            r1 = this;
            com.google.android.material.datepicker.YearGridAdapter$1 r0 = new com.google.android.material.datepicker.YearGridAdapter$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            int r0 = r0.getYearSpan()
            return r0
    }

    int getPositionForYear(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r0 = r0.year
            int r2 = r2 - r0
            return r2
    }

    int getYearForPosition(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r0 = r0.year
            int r0 = r0 + r2
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r1 = (com.google.android.material.datepicker.YearGridAdapter.ViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(com.google.android.material.datepicker.YearGridAdapter.ViewHolder r8, int r9) {
            r7 = this;
            int r9 = r7.getYearForPosition(r9)
            android.widget.TextView r0 = r8.textView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.string.mtrl_picker_navigate_to_year_description
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r8.textView
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)
            r1.setText(r2)
            android.widget.TextView r1 = r8.textView
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r2[r6] = r4
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.setContentDescription(r0)
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r7.materialCalendar
            com.google.android.material.datepicker.CalendarStyle r0 = r0.getCalendarStyle()
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            int r2 = r1.get(r3)
            if (r2 != r9) goto L4d
            com.google.android.material.datepicker.CalendarItemStyle r2 = r0.todayYear
            goto L4f
        L4d:
            com.google.android.material.datepicker.CalendarItemStyle r2 = r0.year
        L4f:
            com.google.android.material.datepicker.MaterialCalendar<?> r4 = r7.materialCalendar
            com.google.android.material.datepicker.DateSelector r4 = r4.getDateSelector()
            java.util.Collection r4 = r4.getSelectedDays()
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r1.setTimeInMillis(r5)
            int r5 = r1.get(r3)
            if (r5 != r9) goto L5d
            com.google.android.material.datepicker.CalendarItemStyle r2 = r0.selectedYear
            goto L5d
        L79:
            android.widget.TextView r0 = r8.textView
            r2.styleItem(r0)
            android.widget.TextView r8 = r8.textView
            android.view.View$OnClickListener r9 = r7.createYearClickListener(r9)
            r8.setOnClickListener(r9)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public com.google.android.material.datepicker.YearGridAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.C0479R.layout.mtrl_calendar_year
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r4 = new com.google.android.material.datepicker.YearGridAdapter$ViewHolder
            r4.<init>(r3)
            return r4
    }
}
