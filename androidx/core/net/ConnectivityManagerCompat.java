package androidx.core.net;

/* loaded from: classes.dex */
public final class ConnectivityManagerCompat {
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    private ConnectivityManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.net.NetworkInfo getNetworkInfoFromBroadcast(android.net.ConnectivityManager r1, android.content.Intent r2) {
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r2 = r2.getParcelableExtra(r0)
            android.net.NetworkInfo r2 = (android.net.NetworkInfo) r2
            if (r2 == 0) goto L13
            int r2 = r2.getType()
            android.net.NetworkInfo r1 = r1.getNetworkInfo(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static int getRestrictBackgroundStatus(android.net.ConnectivityManager r0) {
            int r0 = r0.getRestrictBackgroundStatus()
            return r0
    }

    public static boolean isActiveNetworkMetered(android.net.ConnectivityManager r0) {
            boolean r0 = r0.isActiveNetworkMetered()
            return r0
    }
}
