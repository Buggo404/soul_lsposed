package androidx.core.os;

/* loaded from: classes.dex */
public final class EnvironmentCompat {
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";
    private static final java.lang.String TAG = "EnvironmentCompat";

    private EnvironmentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStorageState(java.io.File r0) {
            java.lang.String r0 = android.os.Environment.getExternalStorageState(r0)
            return r0
    }
}
