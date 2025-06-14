package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public class DateValidatorPointBackward implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.DateValidatorPointBackward> CREATOR = null;
    private final long point;


    static {
            com.google.android.material.datepicker.DateValidatorPointBackward$1 r0 = new com.google.android.material.datepicker.DateValidatorPointBackward$1
            r0.<init>()
            com.google.android.material.datepicker.DateValidatorPointBackward.CREATOR = r0
            return
    }

    private DateValidatorPointBackward(long r1) {
            r0 = this;
            r0.<init>()
            r0.point = r1
            return
    }

    /* synthetic */ DateValidatorPointBackward(long r1, com.google.android.material.datepicker.DateValidatorPointBackward.C05371 r3) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.material.datepicker.DateValidatorPointBackward before(long r1) {
            com.google.android.material.datepicker.DateValidatorPointBackward r0 = new com.google.android.material.datepicker.DateValidatorPointBackward
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.material.datepicker.DateValidatorPointBackward now() {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r0 = r0.getTimeInMillis()
            com.google.android.material.datepicker.DateValidatorPointBackward r0 = before(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.material.datepicker.DateValidatorPointBackward
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.DateValidatorPointBackward r8 = (com.google.android.material.datepicker.DateValidatorPointBackward) r8
            long r3 = r7.point
            long r5 = r8.point
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L15
            goto L16
        L15:
            r0 = r2
        L16:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.point
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long r3) {
            r2 = this;
            long r0 = r2.point
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.point
            r3.writeLong(r0)
            return
    }
}
