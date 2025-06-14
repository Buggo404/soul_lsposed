package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class TimeSource {
    private static final com.google.android.material.datepicker.TimeSource SYSTEM_TIME_SOURCE = null;
    private final java.lang.Long fixedTimeMs;
    private final java.util.TimeZone fixedTimeZone;

    static {
            com.google.android.material.datepicker.TimeSource r0 = new com.google.android.material.datepicker.TimeSource
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.material.datepicker.TimeSource.SYSTEM_TIME_SOURCE = r0
            return
    }

    private TimeSource(java.lang.Long r1, java.util.TimeZone r2) {
            r0 = this;
            r0.<init>()
            r0.fixedTimeMs = r1
            r0.fixedTimeZone = r2
            return
    }

    static com.google.android.material.datepicker.TimeSource fixed(long r1) {
            com.google.android.material.datepicker.TimeSource r0 = new com.google.android.material.datepicker.TimeSource
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    static com.google.android.material.datepicker.TimeSource fixed(long r1, java.util.TimeZone r3) {
            com.google.android.material.datepicker.TimeSource r0 = new com.google.android.material.datepicker.TimeSource
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.<init>(r1, r3)
            return r0
    }

    static com.google.android.material.datepicker.TimeSource system() {
            com.google.android.material.datepicker.TimeSource r0 = com.google.android.material.datepicker.TimeSource.SYSTEM_TIME_SOURCE
            return r0
    }

    java.util.Calendar now() {
            r1 = this;
            java.util.TimeZone r0 = r1.fixedTimeZone
            java.util.Calendar r0 = r1.now(r0)
            return r0
    }

    java.util.Calendar now(java.util.TimeZone r3) {
            r2 = this;
            if (r3 != 0) goto L7
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            goto Lb
        L7:
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)
        Lb:
            java.lang.Long r0 = r2.fixedTimeMs
            if (r0 == 0) goto L16
            long r0 = r0.longValue()
            r3.setTimeInMillis(r0)
        L16:
            return r3
    }
}
