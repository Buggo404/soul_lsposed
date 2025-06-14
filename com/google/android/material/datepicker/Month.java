package com.google.android.material.datepicker;

/* loaded from: classes.dex */
final class Month implements java.lang.Comparable<com.google.android.material.datepicker.Month>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.Month> CREATOR = null;
    final int daysInMonth;
    final int daysInWeek;
    private final java.util.Calendar firstOfMonth;
    private java.lang.String longName;
    final int month;
    final long timeInMillis;
    final int year;


    static {
            com.google.android.material.datepicker.Month$1 r0 = new com.google.android.material.datepicker.Month$1
            r0.<init>()
            com.google.android.material.datepicker.Month.CREATOR = r0
            return
    }

    private Month(java.util.Calendar r4) {
            r3 = this;
            r3.<init>()
            r0 = 5
            r1 = 1
            r4.set(r0, r1)
            java.util.Calendar r4 = com.google.android.material.datepicker.UtcDates.getDayCopy(r4)
            r3.firstOfMonth = r4
            r2 = 2
            int r2 = r4.get(r2)
            r3.month = r2
            int r1 = r4.get(r1)
            r3.year = r1
            r1 = 7
            int r1 = r4.getMaximum(r1)
            r3.daysInWeek = r1
            int r0 = r4.getActualMaximum(r0)
            r3.daysInMonth = r0
            long r0 = r4.getTimeInMillis()
            r3.timeInMillis = r0
            return
    }

    static com.google.android.material.datepicker.Month create(int r2, int r3) {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1 = 1
            r0.set(r1, r2)
            r2 = 2
            r0.set(r2, r3)
            com.google.android.material.datepicker.Month r2 = new com.google.android.material.datepicker.Month
            r2.<init>(r0)
            return r2
    }

    static com.google.android.material.datepicker.Month create(long r1) {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r0.setTimeInMillis(r1)
            com.google.android.material.datepicker.Month r1 = new com.google.android.material.datepicker.Month
            r1.<init>(r0)
            return r1
    }

    static com.google.android.material.datepicker.Month current() {
            com.google.android.material.datepicker.Month r0 = new com.google.android.material.datepicker.Month
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            r0.<init>(r1)
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.android.material.datepicker.Month r2) {
            r1 = this;
            java.util.Calendar r0 = r1.firstOfMonth
            java.util.Calendar r2 = r2.firstOfMonth
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.android.material.datepicker.Month r1) {
            r0 = this;
            com.google.android.material.datepicker.Month r1 = (com.google.android.material.datepicker.Month) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    int daysFromStartOfWeekToFirstOfMonth() {
            r2 = this;
            java.util.Calendar r0 = r2.firstOfMonth
            r1 = 7
            int r0 = r0.get(r1)
            java.util.Calendar r1 = r2.firstOfMonth
            int r1 = r1.getFirstDayOfWeek()
            int r0 = r0 - r1
            if (r0 >= 0) goto L13
            int r1 = r2.daysInWeek
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.Month
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.Month r5 = (com.google.android.material.datepicker.Month) r5
            int r1 = r4.month
            int r3 = r5.month
            if (r1 != r3) goto L19
            int r1 = r4.year
            int r5 = r5.year
            if (r1 != r5) goto L19
            goto L1a
        L19:
            r0 = r2
        L1a:
            return r0
    }

    long getDay(int r3) {
            r2 = this;
            java.util.Calendar r0 = r2.firstOfMonth
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getDayCopy(r0)
            r1 = 5
            r0.set(r1, r3)
            long r0 = r0.getTimeInMillis()
            return r0
    }

    int getDayOfMonth(long r2) {
            r1 = this;
            java.util.Calendar r0 = r1.firstOfMonth
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getDayCopy(r0)
            r0.setTimeInMillis(r2)
            r2 = 5
            int r2 = r0.get(r2)
            return r2
    }

    java.lang.String getLongName(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = r2.longName
            if (r0 != 0) goto L10
            java.util.Calendar r0 = r2.firstOfMonth
            long r0 = r0.getTimeInMillis()
            java.lang.String r3 = com.google.android.material.datepicker.DateStrings.getYearMonth(r3, r0)
            r2.longName = r3
        L10:
            java.lang.String r3 = r2.longName
            return r3
    }

    long getStableId() {
            r2 = this;
            java.util.Calendar r0 = r2.firstOfMonth
            long r0 = r0.getTimeInMillis()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.month
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.year
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    com.google.android.material.datepicker.Month monthsLater(int r3) {
            r2 = this;
            java.util.Calendar r0 = r2.firstOfMonth
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getDayCopy(r0)
            r1 = 2
            r0.add(r1, r3)
            com.google.android.material.datepicker.Month r3 = new com.google.android.material.datepicker.Month
            r3.<init>(r0)
            return r3
    }

    int monthsUntil(com.google.android.material.datepicker.Month r3) {
            r2 = this;
            java.util.Calendar r0 = r2.firstOfMonth
            boolean r0 = r0 instanceof java.util.GregorianCalendar
            if (r0 == 0) goto L14
            int r0 = r3.year
            int r1 = r2.year
            int r0 = r0 - r1
            int r0 = r0 * 12
            int r3 = r3.month
            int r1 = r2.month
            int r3 = r3 - r1
            int r0 = r0 + r3
            return r0
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only Gregorian calendars are supported."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.year
            r1.writeInt(r2)
            int r2 = r0.month
            r1.writeInt(r2)
            return
    }
}
