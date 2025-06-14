package androidx.core.app;

/* loaded from: classes.dex */
public final class AlarmManagerCompat {
    private AlarmManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setAlarmClock(android.app.AlarmManager r1, long r2, android.app.PendingIntent r4, android.app.PendingIntent r5) {
            android.app.AlarmManager$AlarmClockInfo r0 = new android.app.AlarmManager$AlarmClockInfo
            r0.<init>(r2, r4)
            r1.setAlarmClock(r0, r5)
            return
    }

    public static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            r0.setAndAllowWhileIdle(r1, r2, r4)
            return
    }

    public static void setExact(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            r0.setExact(r1, r2, r4)
            return
    }

    public static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            r0.setExactAndAllowWhileIdle(r1, r2, r4)
            return
    }
}
