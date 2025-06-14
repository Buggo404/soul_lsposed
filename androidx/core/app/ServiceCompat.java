package androidx.core.app;

/* loaded from: classes.dex */
public final class ServiceCompat {
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void stopForeground(android.app.Service r0, int r1) {
            r0.stopForeground(r1)
            return
    }
}
