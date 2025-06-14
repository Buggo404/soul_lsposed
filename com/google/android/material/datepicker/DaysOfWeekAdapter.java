package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class DaysOfWeekAdapter extends android.widget.BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 0;
    private static final int NARROW_FORMAT = 4;
    private final java.util.Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 4
            goto L9
        L8:
            r0 = 1
        L9:
            com.google.android.material.datepicker.DaysOfWeekAdapter.CALENDAR_DAY_STYLE = r0
            return
    }

    public DaysOfWeekAdapter() {
            r2 = this;
            r2.<init>()
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2.calendar = r0
            r1 = 7
            int r1 = r0.getMaximum(r1)
            r2.daysInWeek = r1
            int r0 = r0.getFirstDayOfWeek()
            r2.firstDayOfWeek = r0
            return
    }

    private int positionToDayOfWeek(int r2) {
            r1 = this;
            int r0 = r1.firstDayOfWeek
            int r2 = r2 + r0
            int r0 = r1.daysInWeek
            if (r2 <= r0) goto L8
            int r2 = r2 - r0
        L8:
            return r2
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = r1.daysInWeek
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Integer getItem(int r2) {
            r1 = this;
            int r0 = r1.daysInWeek
            if (r2 < r0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.positionToDayOfWeek(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Integer r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L17
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C0479R.layout.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L17:
            java.util.Calendar r7 = r5.calendar
            int r6 = r5.positionToDayOfWeek(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.calendar
            int r3 = com.google.android.material.datepicker.DaysOfWeekAdapter.CALENDAR_DAY_STYLE
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = com.google.android.material.C0479R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.calendar
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
    }
}
