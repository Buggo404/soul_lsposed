package androidx.core.content;

/* loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sLock = null;
    private static android.util.TypedValue sTempValue;

    private static final class LegacyServiceMapHolder {
        static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES = r0
                java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
                java.lang.String r2 = "telephony_subscription_service"
                r0.put(r1, r2)
                java.lang.Class<android.app.usage.UsageStatsManager> r1 = android.app.usage.UsageStatsManager.class
                java.lang.String r2 = "usagestats"
                r0.put(r1, r2)
                java.lang.Class<android.appwidget.AppWidgetManager> r1 = android.appwidget.AppWidgetManager.class
                java.lang.String r2 = "appwidget"
                r0.put(r1, r2)
                java.lang.Class<android.os.BatteryManager> r1 = android.os.BatteryManager.class
                java.lang.String r2 = "batterymanager"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.camera2.CameraManager> r1 = android.hardware.camera2.CameraManager.class
                java.lang.String r2 = "camera"
                r0.put(r1, r2)
                java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
                java.lang.String r2 = "jobscheduler"
                r0.put(r1, r2)
                java.lang.Class<android.content.pm.LauncherApps> r1 = android.content.pm.LauncherApps.class
                java.lang.String r2 = "launcherapps"
                r0.put(r1, r2)
                java.lang.Class<android.media.projection.MediaProjectionManager> r1 = android.media.projection.MediaProjectionManager.class
                java.lang.String r2 = "media_projection"
                r0.put(r1, r2)
                java.lang.Class<android.media.session.MediaSessionManager> r1 = android.media.session.MediaSessionManager.class
                java.lang.String r2 = "media_session"
                r0.put(r1, r2)
                java.lang.Class<android.content.RestrictionsManager> r1 = android.content.RestrictionsManager.class
                java.lang.String r2 = "restrictions"
                r0.put(r1, r2)
                java.lang.Class<android.telecom.TelecomManager> r1 = android.telecom.TelecomManager.class
                java.lang.String r2 = "telecom"
                r0.put(r1, r2)
                java.lang.Class<android.media.tv.TvInputManager> r1 = android.media.tv.TvInputManager.class
                java.lang.String r2 = "tv_input"
                r0.put(r1, r2)
                java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
                java.lang.String r2 = "appops"
                r0.put(r1, r2)
                java.lang.Class<android.view.accessibility.CaptioningManager> r1 = android.view.accessibility.CaptioningManager.class
                java.lang.String r2 = "captioning"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.ConsumerIrManager> r1 = android.hardware.ConsumerIrManager.class
                java.lang.String r2 = "consumer_ir"
                r0.put(r1, r2)
                java.lang.Class<android.print.PrintManager> r1 = android.print.PrintManager.class
                java.lang.String r2 = "print"
                r0.put(r1, r2)
                java.lang.Class<android.bluetooth.BluetoothManager> r1 = android.bluetooth.BluetoothManager.class
                java.lang.String r2 = "bluetooth"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
                java.lang.String r2 = "display"
                r0.put(r1, r2)
                java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
                java.lang.String r2 = "user"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.input.InputManager> r1 = android.hardware.input.InputManager.class
                java.lang.String r2 = "input"
                r0.put(r1, r2)
                java.lang.Class<android.media.MediaRouter> r1 = android.media.MediaRouter.class
                java.lang.String r2 = "media_router"
                r0.put(r1, r2)
                java.lang.Class<android.net.nsd.NsdManager> r1 = android.net.nsd.NsdManager.class
                java.lang.String r2 = "servicediscovery"
                r0.put(r1, r2)
                java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
                java.lang.String r2 = "accessibility"
                r0.put(r1, r2)
                java.lang.Class<android.accounts.AccountManager> r1 = android.accounts.AccountManager.class
                java.lang.String r2 = "account"
                r0.put(r1, r2)
                java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
                java.lang.String r2 = "activity"
                r0.put(r1, r2)
                java.lang.Class<android.app.AlarmManager> r1 = android.app.AlarmManager.class
                java.lang.String r2 = "alarm"
                r0.put(r1, r2)
                java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
                java.lang.String r2 = "audio"
                r0.put(r1, r2)
                java.lang.Class<android.content.ClipboardManager> r1 = android.content.ClipboardManager.class
                java.lang.String r2 = "clipboard"
                r0.put(r1, r2)
                java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
                java.lang.String r2 = "connectivity"
                r0.put(r1, r2)
                java.lang.Class<android.app.admin.DevicePolicyManager> r1 = android.app.admin.DevicePolicyManager.class
                java.lang.String r2 = "device_policy"
                r0.put(r1, r2)
                java.lang.Class<android.app.DownloadManager> r1 = android.app.DownloadManager.class
                java.lang.String r2 = "download"
                r0.put(r1, r2)
                java.lang.Class<android.os.DropBoxManager> r1 = android.os.DropBoxManager.class
                java.lang.String r2 = "dropbox"
                r0.put(r1, r2)
                java.lang.Class<android.view.inputmethod.InputMethodManager> r1 = android.view.inputmethod.InputMethodManager.class
                java.lang.String r2 = "input_method"
                r0.put(r1, r2)
                java.lang.Class<android.app.KeyguardManager> r1 = android.app.KeyguardManager.class
                java.lang.String r2 = "keyguard"
                r0.put(r1, r2)
                java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
                java.lang.String r2 = "layout_inflater"
                r0.put(r1, r2)
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r2 = "location"
                r0.put(r1, r2)
                java.lang.Class<android.nfc.NfcManager> r1 = android.nfc.NfcManager.class
                java.lang.String r2 = "nfc"
                r0.put(r1, r2)
                java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
                java.lang.String r2 = "notification"
                r0.put(r1, r2)
                java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
                java.lang.String r2 = "power"
                r0.put(r1, r2)
                java.lang.Class<android.app.SearchManager> r1 = android.app.SearchManager.class
                java.lang.String r2 = "search"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.SensorManager> r1 = android.hardware.SensorManager.class
                java.lang.String r2 = "sensor"
                r0.put(r1, r2)
                java.lang.Class<android.os.storage.StorageManager> r1 = android.os.storage.StorageManager.class
                java.lang.String r2 = "storage"
                r0.put(r1, r2)
                java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
                java.lang.String r2 = "phone"
                r0.put(r1, r2)
                java.lang.Class<android.view.textservice.TextServicesManager> r1 = android.view.textservice.TextServicesManager.class
                java.lang.String r2 = "textservices"
                r0.put(r1, r2)
                java.lang.Class<android.app.UiModeManager> r1 = android.app.UiModeManager.class
                java.lang.String r2 = "uimode"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.usb.UsbManager> r1 = android.hardware.usb.UsbManager.class
                java.lang.String r2 = "usb"
                r0.put(r1, r2)
                java.lang.Class<android.os.Vibrator> r1 = android.os.Vibrator.class
                java.lang.String r2 = "vibrator"
                r0.put(r1, r2)
                java.lang.Class<android.app.WallpaperManager> r1 = android.app.WallpaperManager.class
                java.lang.String r2 = "wallpaper"
                r0.put(r1, r2)
                java.lang.Class<android.net.wifi.p2p.WifiP2pManager> r1 = android.net.wifi.p2p.WifiP2pManager.class
                java.lang.String r2 = "wifip2p"
                r0.put(r1, r2)
                java.lang.Class<android.net.wifi.WifiManager> r1 = android.net.wifi.WifiManager.class
                java.lang.String r2 = "wifi"
                r0.put(r1, r2)
                java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
                java.lang.String r2 = "window"
                r0.put(r1, r2)
                return
        }

        private LegacyServiceMapHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class MainHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        MainHandlerExecutor(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto L9
                return
            L9:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " is shutting down"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.ContextCompat.sLock = r0
            return
    }

    protected ContextCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkSelfPermission(android.content.Context r2, java.lang.String r3) {
            if (r3 == 0) goto Lf
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "permission is null"
            r2.<init>(r3)
            throw r2
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context r0) {
            android.content.Context r0 = r0.createDeviceProtectedStorageContext()
            return r0
    }

    private static synchronized java.io.File createFilesDir(java.io.File r4) {
            java.lang.String r0 = "Unable to create files subdir "
            java.lang.Class<androidx.core.content.ContextCompat> r1 = androidx.core.content.ContextCompat.class
            monitor-enter(r1)
            boolean r2 = r4.exists()     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L32
            boolean r2 = r4.mkdirs()     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L32
            boolean r2 = r4.exists()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L19
            monitor-exit(r1)
            return r4
        L19:
            java.lang.String r2 = "ContextCompat"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r4 = r3.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            android.util.Log.w(r2, r4)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)
            r4 = 0
            return r4
        L32:
            monitor-exit(r1)
            return r4
        L34:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
    }

    public static java.io.File getCodeCacheDir(android.content.Context r0) {
            java.io.File r0 = r0.getCodeCacheDir()
            return r0
    }

    public static int getColor(android.content.Context r0, int r1) {
            int r0 = r0.getColor(r1)
            return r0
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context r0, int r1) {
            android.content.res.ColorStateList r0 = r0.getColorStateList(r1)
            return r0
    }

    public static java.io.File getDataDir(android.content.Context r0) {
            java.io.File r0 = r0.getDataDir()
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r0, int r1) {
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context r0) {
            java.io.File[] r0 = r0.getExternalCacheDirs()
            return r0
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context r0, java.lang.String r1) {
            java.io.File[] r0 = r0.getExternalFilesDirs(r1)
            return r0
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.util.concurrent.Executor r2 = r2.getMainExecutor()
            return r2
        Lb:
            androidx.core.content.ContextCompat$MainHandlerExecutor r0 = new androidx.core.content.ContextCompat$MainHandlerExecutor
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r2.getMainLooper()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context r0) {
            java.io.File r0 = r0.getNoBackupFilesDir()
            return r0
    }

    public static java.io.File[] getObbDirs(android.content.Context r0) {
            java.io.File[] r0 = r0.getObbDirs()
            return r0
    }

    public static <T> T getSystemService(android.content.Context r0, java.lang.Class<T> r1) {
            java.lang.Object r0 = r0.getSystemService(r1)
            return r0
    }

    public static java.lang.String getSystemServiceName(android.content.Context r0, java.lang.Class<?> r1) {
            java.lang.String r0 = r0.getSystemServiceName(r1)
            return r0
    }

    public static boolean isDeviceProtectedStorage(android.content.Context r0) {
            boolean r0 = r0.isDeviceProtectedStorage()
            return r0
    }

    public static boolean startActivities(android.content.Context r1, android.content.Intent[] r2) {
            r0 = 0
            boolean r1 = startActivities(r1, r2, r0)
            return r1
    }

    public static boolean startActivities(android.content.Context r0, android.content.Intent[] r1, android.os.Bundle r2) {
            r0.startActivities(r1, r2)
            r0 = 1
            return r0
    }

    public static void startActivity(android.content.Context r0, android.content.Intent r1, android.os.Bundle r2) {
            r0.startActivity(r1, r2)
            return
    }

    public static void startForegroundService(android.content.Context r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            r2.startForegroundService(r3)
            goto Ld
        La:
            r2.startService(r3)
        Ld:
            return
    }
}
