package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class TimeModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.timepicker.TimeModel> CREATOR = null;
    public static final java.lang.String NUMBER_FORMAT = "%d";
    public static final java.lang.String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final com.google.android.material.timepicker.MaxInputValidator hourInputValidator;
    int minute;
    private final com.google.android.material.timepicker.MaxInputValidator minuteInputValidator;
    int period;
    int selection;


    static {
            com.google.android.material.timepicker.TimeModel$1 r0 = new com.google.android.material.timepicker.TimeModel$1
            r0.<init>()
            com.google.android.material.timepicker.TimeModel.CREATOR = r0
            return
    }

    public TimeModel() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public TimeModel(int r3) {
            r2 = this;
            r0 = 0
            r1 = 10
            r2.<init>(r0, r0, r1, r3)
            return
    }

    public TimeModel(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.hour = r1
            r0.minute = r2
            r0.selection = r3
            r0.format = r4
            int r1 = getPeriod(r1)
            r0.period = r1
            com.google.android.material.timepicker.MaxInputValidator r1 = new com.google.android.material.timepicker.MaxInputValidator
            r2 = 59
            r1.<init>(r2)
            r0.minuteInputValidator = r1
            com.google.android.material.timepicker.MaxInputValidator r1 = new com.google.android.material.timepicker.MaxInputValidator
            r2 = 1
            if (r4 != r2) goto L22
            r2 = 24
            goto L24
        L22:
            r2 = 12
        L24:
            r1.<init>(r2)
            r0.hourInputValidator = r1
            return
    }

    protected TimeModel(android.os.Parcel r4) {
            r3 = this;
            int r0 = r4.readInt()
            int r1 = r4.readInt()
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
    }

    public static java.lang.String formatText(android.content.res.Resources r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "%02d"
            java.lang.String r1 = formatText(r1, r2, r0)
            return r1
    }

    public static java.lang.String formatText(android.content.res.Resources r2, java.lang.CharSequence r3, java.lang.String r4) {
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r2 = java.lang.String.format(r2, r4, r0)
            return r2
    }

    private static int getPeriod(int r1) {
            r0 = 12
            if (r1 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
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
            boolean r1 = r5 instanceof com.google.android.material.timepicker.TimeModel
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.timepicker.TimeModel r5 = (com.google.android.material.timepicker.TimeModel) r5
            int r1 = r4.hour
            int r3 = r5.hour
            if (r1 != r3) goto L25
            int r1 = r4.minute
            int r3 = r5.minute
            if (r1 != r3) goto L25
            int r1 = r4.format
            int r3 = r5.format
            if (r1 != r3) goto L25
            int r1 = r4.selection
            int r5 = r5.selection
            if (r1 != r5) goto L25
            goto L26
        L25:
            r0 = r2
        L26:
            return r0
    }

    public int getHourForDisplay() {
            r4 = this;
            int r0 = r4.format
            r1 = 1
            if (r0 != r1) goto La
            int r0 = r4.hour
            int r0 = r0 % 24
            return r0
        La:
            int r0 = r4.hour
            int r2 = r0 % 12
            r3 = 12
            if (r2 != 0) goto L13
            return r3
        L13:
            int r2 = r4.period
            if (r2 != r1) goto L18
            int r0 = r0 - r3
        L18:
            return r0
    }

    public com.google.android.material.timepicker.MaxInputValidator getHourInputValidator() {
            r1 = this;
            com.google.android.material.timepicker.MaxInputValidator r0 = r1.hourInputValidator
            return r0
    }

    public com.google.android.material.timepicker.MaxInputValidator getMinuteInputValidator() {
            r1 = this;
            com.google.android.material.timepicker.MaxInputValidator r0 = r1.minuteInputValidator
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.format
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.hour
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.minute
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.selection
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public void setHour(int r4) {
            r3 = this;
            int r0 = r3.format
            r1 = 1
            if (r0 != r1) goto L8
            r3.hour = r4
            return
        L8:
            r0 = 12
            int r4 = r4 % r0
            int r2 = r3.period
            if (r2 != r1) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            int r4 = r4 + r0
            r3.hour = r4
            return
    }

    public void setHourOfDay(int r2) {
            r1 = this;
            int r0 = getPeriod(r2)
            r1.period = r0
            r1.hour = r2
            return
    }

    public void setMinute(int r1) {
            r0 = this;
            int r1 = r1 % 60
            r0.minute = r1
            return
    }

    public void setPeriod(int r4) {
            r3 = this;
            int r0 = r3.period
            if (r4 == r0) goto L1a
            r3.period = r4
            int r0 = r3.hour
            r1 = 12
            if (r0 >= r1) goto L13
            r2 = 1
            if (r4 != r2) goto L13
            int r0 = r0 + r1
            r3.hour = r0
            goto L1a
        L13:
            if (r0 < r1) goto L1a
            if (r4 != 0) goto L1a
            int r0 = r0 - r1
            r3.hour = r0
        L1a:
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.hour
            r1.writeInt(r2)
            int r2 = r0.minute
            r1.writeInt(r2)
            int r2 = r0.selection
            r1.writeInt(r2)
            int r2 = r0.format
            r1.writeInt(r2)
            return
    }
}
