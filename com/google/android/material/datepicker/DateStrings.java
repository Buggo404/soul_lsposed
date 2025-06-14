package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class DateStrings {
    private DateStrings() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(java.lang.Long r1, java.lang.Long r2) {
            r0 = 0
            androidx.core.util.Pair r1 = getDateRangeString(r1, r2, r0)
            return r1
    }

    static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(java.lang.Long r5, java.lang.Long r6, java.text.SimpleDateFormat r7) {
            r0 = 0
            if (r5 != 0) goto La
            if (r6 != 0) goto La
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r0, r0)
            return r5
        La:
            if (r5 != 0) goto L19
            long r5 = r6.longValue()
            java.lang.String r5 = getDateString(r5, r7)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r0, r5)
            return r5
        L19:
            if (r6 != 0) goto L28
            long r5 = r5.longValue()
            java.lang.String r5 = getDateString(r5, r7)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r0)
            return r5
        L28:
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            long r2 = r5.longValue()
            r1.setTimeInMillis(r2)
            java.util.Calendar r2 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            long r3 = r6.longValue()
            r2.setTimeInMillis(r3)
            if (r7 == 0) goto L63
            java.util.Date r0 = new java.util.Date
            long r1 = r5.longValue()
            r0.<init>(r1)
            java.util.Date r5 = new java.util.Date
            long r1 = r6.longValue()
            r5.<init>(r1)
            java.lang.String r6 = r7.format(r0)
            java.lang.String r5 = r7.format(r5)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r6, r5)
            return r5
        L63:
            r7 = 1
            int r3 = r1.get(r7)
            int r2 = r2.get(r7)
            if (r3 != r2) goto Lb2
            int r1 = r1.get(r7)
            int r7 = r0.get(r7)
            if (r1 != r7) goto L95
            long r0 = r5.longValue()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = getMonthDay(r0, r5)
            long r6 = r6.longValue()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r6 = getMonthDay(r6, r0)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r6)
            return r5
        L95:
            long r0 = r5.longValue()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = getMonthDay(r0, r5)
            long r6 = r6.longValue()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r6 = getYearMonthDay(r6, r0)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r6)
            return r5
        Lb2:
            long r0 = r5.longValue()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = getYearMonthDay(r0, r5)
            long r6 = r6.longValue()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r6 = getYearMonthDay(r6, r0)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r6)
            return r5
    }

    static java.lang.String getDateString(long r1) {
            r0 = 0
            java.lang.String r1 = getDateString(r1, r0)
            return r1
    }

    static java.lang.String getDateString(long r2, java.text.SimpleDateFormat r4) {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1.setTimeInMillis(r2)
            if (r4 == 0) goto L17
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = r4.format(r0)
            return r2
        L17:
            r4 = 1
            int r0 = r0.get(r4)
            int r4 = r1.get(r4)
            if (r0 != r4) goto L27
            java.lang.String r2 = getMonthDay(r2)
            return r2
        L27:
            java.lang.String r2 = getYearMonthDay(r2)
            return r2
    }

    static java.lang.String getMonthDay(long r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = getMonthDay(r1, r0)
            return r1
    }

    static java.lang.String getMonthDay(long r1, java.util.Locale r3) {
            android.icu.text.DateFormat r3 = com.google.android.material.datepicker.UtcDates.getAbbrMonthDayFormat(r3)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = r3.format(r0)
            return r1
    }

    static java.lang.String getMonthDayOfWeekDay(long r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = getMonthDayOfWeekDay(r1, r0)
            return r1
    }

    static java.lang.String getMonthDayOfWeekDay(long r1, java.util.Locale r3) {
            android.icu.text.DateFormat r3 = com.google.android.material.datepicker.UtcDates.getAbbrMonthWeekdayDayFormat(r3)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = r3.format(r0)
            return r1
    }

    static java.lang.String getYearMonth(android.content.Context r2, long r3) {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            int r0 = r0.getOffset(r3)
            long r0 = (long) r0
            long r3 = r3 - r0
            r0 = 36
            java.lang.String r2 = android.text.format.DateUtils.formatDateTime(r2, r3, r0)
            return r2
    }

    static java.lang.String getYearMonthDay(long r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = getYearMonthDay(r1, r0)
            return r1
    }

    static java.lang.String getYearMonthDay(long r1, java.util.Locale r3) {
            android.icu.text.DateFormat r3 = com.google.android.material.datepicker.UtcDates.getYearAbbrMonthDayFormat(r3)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = r3.format(r0)
            return r1
    }

    static java.lang.String getYearMonthDayOfWeekDay(long r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = getYearMonthDayOfWeekDay(r1, r0)
            return r1
    }

    static java.lang.String getYearMonthDayOfWeekDay(long r1, java.util.Locale r3) {
            android.icu.text.DateFormat r3 = com.google.android.material.datepicker.UtcDates.getYearAbbrMonthWeekdayDayFormat(r3)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = r3.format(r0)
            return r1
    }
}
