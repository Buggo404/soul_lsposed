package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public final class CalendarConstraints implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CalendarConstraints> CREATOR = null;
    private final com.google.android.material.datepicker.Month end;
    private final int monthSpan;
    private com.google.android.material.datepicker.Month openAt;
    private final com.google.android.material.datepicker.Month start;
    private final com.google.android.material.datepicker.CalendarConstraints.DateValidator validator;
    private final int yearSpan;


    public static final class Builder {
        private static final java.lang.String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        static final long DEFAULT_END = 0;
        static final long DEFAULT_START = 0;
        private long end;
        private java.lang.Long openAt;
        private long start;
        private com.google.android.material.datepicker.CalendarConstraints.DateValidator validator;

        static {
                r0 = 1900(0x76c, float:2.662E-42)
                r1 = 0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r0, r1)
                long r0 = r0.timeInMillis
                long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
                com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_START = r0
                r0 = 2100(0x834, float:2.943E-42)
                r1 = 11
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r0, r1)
                long r0 = r0.timeInMillis
                long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
                com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_END = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_START
                r2.start = r0
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_END
                r2.end = r0
                r0 = -9223372036854775808
                com.google.android.material.datepicker.DateValidatorPointForward r0 = com.google.android.material.datepicker.DateValidatorPointForward.from(r0)
                r2.validator = r0
                return
        }

        Builder(com.google.android.material.datepicker.CalendarConstraints r3) {
                r2 = this;
                r2.<init>()
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_START
                r2.start = r0
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_END
                r2.end = r0
                r0 = -9223372036854775808
                com.google.android.material.datepicker.DateValidatorPointForward r0 = com.google.android.material.datepicker.DateValidatorPointForward.from(r0)
                r2.validator = r0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.CalendarConstraints.access$100(r3)
                long r0 = r0.timeInMillis
                r2.start = r0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.CalendarConstraints.access$200(r3)
                long r0 = r0.timeInMillis
                r2.end = r0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.CalendarConstraints.access$300(r3)
                long r0 = r0.timeInMillis
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.openAt = r0
                com.google.android.material.datepicker.CalendarConstraints$DateValidator r3 = com.google.android.material.datepicker.CalendarConstraints.access$400(r3)
                r2.validator = r3
                return
        }

        public com.google.android.material.datepicker.CalendarConstraints build() {
                r9 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints$DateValidator r1 = r9.validator
                java.lang.String r2 = "DEEP_COPY_VALIDATOR_KEY"
                r0.putParcelable(r2, r1)
                com.google.android.material.datepicker.CalendarConstraints r1 = new com.google.android.material.datepicker.CalendarConstraints
                long r3 = r9.start
                com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.create(r3)
                long r5 = r9.end
                com.google.android.material.datepicker.Month r5 = com.google.android.material.datepicker.Month.create(r5)
                android.os.Parcelable r0 = r0.getParcelable(r2)
                r6 = r0
                com.google.android.material.datepicker.CalendarConstraints$DateValidator r6 = (com.google.android.material.datepicker.CalendarConstraints.DateValidator) r6
                java.lang.Long r0 = r9.openAt
                if (r0 != 0) goto L27
                r0 = 0
                goto L2f
            L27:
                long r2 = r0.longValue()
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r2)
            L2f:
                r7 = r0
                r8 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                return r1
        }

        public com.google.android.material.datepicker.CalendarConstraints.Builder setEnd(long r1) {
                r0 = this;
                r0.end = r1
                return r0
        }

        public com.google.android.material.datepicker.CalendarConstraints.Builder setOpenAt(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.openAt = r1
                return r0
        }

        public com.google.android.material.datepicker.CalendarConstraints.Builder setStart(long r1) {
                r0 = this;
                r0.start = r1
                return r0
        }

        public com.google.android.material.datepicker.CalendarConstraints.Builder setValidator(com.google.android.material.datepicker.CalendarConstraints.DateValidator r1) {
                r0 = this;
                r0.validator = r1
                return r0
        }
    }

    public interface DateValidator extends android.os.Parcelable {
        boolean isValid(long r1);
    }

    static {
            com.google.android.material.datepicker.CalendarConstraints$1 r0 = new com.google.android.material.datepicker.CalendarConstraints$1
            r0.<init>()
            com.google.android.material.datepicker.CalendarConstraints.CREATOR = r0
            return
    }

    private CalendarConstraints(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.Month r2, com.google.android.material.datepicker.CalendarConstraints.DateValidator r3, com.google.android.material.datepicker.Month r4) {
            r0 = this;
            r0.<init>()
            r0.start = r1
            r0.end = r2
            r0.openAt = r4
            r0.validator = r3
            if (r4 == 0) goto L1c
            int r3 = r1.compareTo2(r4)
            if (r3 > 0) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "start Month cannot be after current Month"
            r1.<init>(r2)
            throw r1
        L1c:
            if (r4 == 0) goto L2d
            int r3 = r4.compareTo2(r2)
            if (r3 > 0) goto L25
            goto L2d
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "current Month cannot be after end Month"
            r1.<init>(r2)
            throw r1
        L2d:
            int r3 = r1.monthsUntil(r2)
            int r3 = r3 + 1
            r0.monthSpan = r3
            int r2 = r2.year
            int r1 = r1.year
            int r2 = r2 - r1
            int r2 = r2 + 1
            r0.yearSpan = r2
            return
    }

    /* synthetic */ CalendarConstraints(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.Month r2, com.google.android.material.datepicker.CalendarConstraints.DateValidator r3, com.google.android.material.datepicker.Month r4, com.google.android.material.datepicker.CalendarConstraints.C05311 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ com.google.android.material.datepicker.Month access$100(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.Month r0 = r0.start
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.Month access$200(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.Month r0 = r0.end
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.Month access$300(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.Month r0 = r0.openAt
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.CalendarConstraints.DateValidator access$400(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = r0.validator
            return r0
    }

    com.google.android.material.datepicker.Month clamp(com.google.android.material.datepicker.Month r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.start
            int r0 = r2.compareTo2(r0)
            if (r0 >= 0) goto Lb
            com.google.android.material.datepicker.Month r2 = r1.start
            return r2
        Lb:
            com.google.android.material.datepicker.Month r0 = r1.end
            int r0 = r2.compareTo2(r0)
            if (r0 <= 0) goto L15
            com.google.android.material.datepicker.Month r2 = r1.end
        L15:
            return r2
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
            boolean r1 = r5 instanceof com.google.android.material.datepicker.CalendarConstraints
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.CalendarConstraints r5 = (com.google.android.material.datepicker.CalendarConstraints) r5
            com.google.android.material.datepicker.Month r1 = r4.start
            com.google.android.material.datepicker.Month r3 = r5.start
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            com.google.android.material.datepicker.Month r1 = r4.end
            com.google.android.material.datepicker.Month r3 = r5.end
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            com.google.android.material.datepicker.Month r1 = r4.openAt
            com.google.android.material.datepicker.Month r3 = r5.openAt
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
            if (r1 == 0) goto L35
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r1 = r4.validator
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r5 = r5.validator
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
    }

    public com.google.android.material.datepicker.CalendarConstraints.DateValidator getDateValidator() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = r1.validator
            return r0
    }

    com.google.android.material.datepicker.Month getEnd() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.end
            return r0
    }

    int getMonthSpan() {
            r1 = this;
            int r0 = r1.monthSpan
            return r0
    }

    com.google.android.material.datepicker.Month getOpenAt() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.openAt
            return r0
    }

    com.google.android.material.datepicker.Month getStart() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.start
            return r0
    }

    int getYearSpan() {
            r1 = this;
            int r0 = r1.yearSpan
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            com.google.android.material.datepicker.Month r2 = r3.start
            r0[r1] = r2
            r1 = 1
            com.google.android.material.datepicker.Month r2 = r3.end
            r0[r1] = r2
            r1 = 2
            com.google.android.material.datepicker.Month r2 = r3.openAt
            r0[r1] = r2
            r1 = 3
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r2 = r3.validator
            r0[r1] = r2
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    boolean isWithinBounds(long r5) {
            r4 = this;
            com.google.android.material.datepicker.Month r0 = r4.start
            r1 = 1
            long r2 = r0.getDay(r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L18
            com.google.android.material.datepicker.Month r0 = r4.end
            int r2 = r0.daysInMonth
            long r2 = r0.getDay(r2)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 > 0) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    void setOpenAt(com.google.android.material.datepicker.Month r1) {
            r0 = this;
            r0.openAt = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.material.datepicker.Month r3 = r1.start
            r0 = 0
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.Month r3 = r1.end
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.Month r3 = r1.openAt
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r3 = r1.validator
            r2.writeParcelable(r3, r0)
            return
    }
}
