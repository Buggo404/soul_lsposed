package androidx.appcompat.app;

/* loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final java.lang.String TAG = "TwilightManager";
    private static androidx.appcompat.app.TwilightManager sInstance;
    private final android.content.Context mContext;
    private final android.location.LocationManager mLocationManager;
    private final androidx.appcompat.app.TwilightManager.TwilightState mTwilightState;

    private static class TwilightState {
        boolean isNight;
        long nextUpdate;
        long todaySunrise;
        long todaySunset;
        long tomorrowSunrise;
        long yesterdaySunset;

        TwilightState() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    TwilightManager(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.app.TwilightManager$TwilightState r0 = new androidx.appcompat.app.TwilightManager$TwilightState
            r0.<init>()
            r1.mTwilightState = r0
            r1.mContext = r2
            r1.mLocationManager = r3
            return
    }

    static androidx.appcompat.app.TwilightManager getInstance(android.content.Context r2) {
            androidx.appcompat.app.TwilightManager r0 = androidx.appcompat.app.TwilightManager.sInstance
            if (r0 != 0) goto L17
            android.content.Context r2 = r2.getApplicationContext()
            androidx.appcompat.app.TwilightManager r0 = new androidx.appcompat.app.TwilightManager
            java.lang.String r1 = "location"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.<init>(r2, r1)
            androidx.appcompat.app.TwilightManager.sInstance = r0
        L17:
            androidx.appcompat.app.TwilightManager r2 = androidx.appcompat.app.TwilightManager.sInstance
            return r2
    }

    private android.location.Location getLastKnownLocation() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = androidx.core.content.PermissionChecker.checkSelfPermission(r0, r1)
            r1 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "network"
            android.location.Location r0 = r6.getLastKnownLocationForProvider(r0)
            goto L13
        L12:
            r0 = r1
        L13:
            android.content.Context r2 = r6.mContext
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = androidx.core.content.PermissionChecker.checkSelfPermission(r2, r3)
            if (r2 != 0) goto L23
            java.lang.String r1 = "gps"
            android.location.Location r1 = r6.getLastKnownLocationForProvider(r1)
        L23:
            if (r1 == 0) goto L35
            if (r0 == 0) goto L35
            long r2 = r1.getTime()
            long r4 = r0.getTime()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L34
            r0 = r1
        L34:
            return r0
        L35:
            if (r1 == 0) goto L38
            r0 = r1
        L38:
            return r0
    }

    private android.location.Location getLastKnownLocationForProvider(java.lang.String r3) {
            r2 = this;
            android.location.LocationManager r0 = r2.mLocationManager     // Catch: java.lang.Exception -> Lf
            boolean r0 = r0.isProviderEnabled(r3)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L17
            android.location.LocationManager r0 = r2.mLocationManager     // Catch: java.lang.Exception -> Lf
            android.location.Location r3 = r0.getLastKnownLocation(r3)     // Catch: java.lang.Exception -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Failed to get last known location"
            android.util.Log.d(r0, r1, r3)
        L17:
            r3 = 0
            return r3
    }

    private boolean isStateValid() {
            r4 = this;
            androidx.appcompat.app.TwilightManager$TwilightState r0 = r4.mTwilightState
            long r0 = r0.nextUpdate
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    static void setInstance(androidx.appcompat.app.TwilightManager r0) {
            androidx.appcompat.app.TwilightManager.sInstance = r0
            return
    }

    private void updateState(android.location.Location r23) {
            r22 = this;
            r0 = r22
            androidx.appcompat.app.TwilightManager$TwilightState r1 = r0.mTwilightState
            long r9 = java.lang.System.currentTimeMillis()
            androidx.appcompat.app.TwilightCalculator r11 = androidx.appcompat.app.TwilightCalculator.getInstance()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r9 - r12
            double r5 = r23.getLatitude()
            double r7 = r23.getLongitude()
            r2 = r11
            r2.calculateTwilight(r3, r5, r7)
            long r14 = r11.sunset
            double r5 = r23.getLatitude()
            double r7 = r23.getLongitude()
            r3 = r9
            r2.calculateTwilight(r3, r5, r7)
            int r2 = r11.state
            r3 = 1
            if (r2 != r3) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            r7 = r3
            long r5 = r11.sunrise
            long r3 = r11.sunset
            long r12 = r12 + r9
            double r16 = r23.getLatitude()
            double r18 = r23.getLongitude()
            r2 = r11
            r20 = r14
            r14 = r3
            r3 = r12
            r12 = r5
            r5 = r16
            r0 = r7
            r7 = r18
            r2.calculateTwilight(r3, r5, r7)
            long r2 = r11.sunrise
            r4 = -1
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L6f
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L5b
            goto L6f
        L5b:
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            r5 = 0
            if (r4 <= 0) goto L63
            long r5 = r5 + r2
            goto L6a
        L63:
            int r4 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r4 <= 0) goto L69
            long r5 = r5 + r14
            goto L6a
        L69:
            long r5 = r5 + r12
        L6a:
            r7 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 + r7
            goto L74
        L6f:
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r5 = r9 + r4
        L74:
            r1.isNight = r0
            r7 = r20
            r1.yesterdaySunset = r7
            r1.todaySunrise = r12
            r1.todaySunset = r14
            r1.tomorrowSunrise = r2
            r1.nextUpdate = r5
            return
    }

    boolean isNight() {
            r2 = this;
            androidx.appcompat.app.TwilightManager$TwilightState r0 = r2.mTwilightState
            boolean r1 = r2.isStateValid()
            if (r1 == 0) goto Lb
            boolean r0 = r0.isNight
            return r0
        Lb:
            android.location.Location r1 = r2.getLastKnownLocation()
            if (r1 == 0) goto L17
            r2.updateState(r1)
            boolean r0 = r0.isNight
            return r0
        L17:
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r0, r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 6
            if (r0 < r1) goto L32
            r1 = 22
            if (r0 < r1) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            return r0
    }
}
