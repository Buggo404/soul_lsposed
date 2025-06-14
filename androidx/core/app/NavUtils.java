package androidx.core.app;

/* loaded from: classes.dex */
public final class NavUtils {
    public static final java.lang.String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final java.lang.String TAG = "NavUtils";

    private NavUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Intent getParentActivityIntent(android.app.Activity r3) {
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = getParentActivityName(r3)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = getParentActivityName(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r3 != 0) goto L1f
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            goto L28
        L1f:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
        L28:
            return r3
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.<init>(r2)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "' in manifest"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context r2, android.content.ComponentName r3) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = getParentActivityName(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = getParentActivityName(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            goto L25
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
        L25:
            return r2
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context r1, java.lang.Class<?> r2) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r2)
            java.lang.String r2 = getParentActivityName(r1, r0)
            if (r2 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r2)
            java.lang.String r1 = getParentActivityName(r1, r0)
            if (r1 != 0) goto L1d
            android.content.Intent r1 = android.content.Intent.makeMainActivity(r0)
            goto L26
        L1d:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r1 = r1.setComponent(r0)
        L26:
            return r1
    }

    public static java.lang.String getParentActivityName(android.app.Activity r1) {
            android.content.ComponentName r0 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            java.lang.String r1 = getParentActivityName(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String getParentActivityName(android.content.Context r3, android.content.ComponentName r4) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Le
            r1 = 269222528(0x100c0280, float:2.7612058E-29)
            goto L11
        Le:
            r1 = 787072(0xc0280, float:1.102923E-39)
        L11:
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r4, r1)
            java.lang.String r0 = r4.parentActivityName
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.os.Bundle r0 = r4.metaData
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            android.os.Bundle r4 = r4.metaData
            java.lang.String r0 = "android.support.PARENT_ACTIVITY"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L2b
            return r1
        L2b:
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r3.toString()
        L49:
            return r4
    }

    public static void navigateUpFromSameTask(android.app.Activity r3) {
            android.content.Intent r0 = getParentActivityIntent(r3)
            if (r0 == 0) goto La
            navigateUpTo(r3, r0)
            return
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Activity "
            r1.<init>(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void navigateUpTo(android.app.Activity r0, android.content.Intent r1) {
            r0.navigateUpTo(r1)
            return
    }

    public static boolean shouldUpRecreateTask(android.app.Activity r0, android.content.Intent r1) {
            boolean r0 = r0.shouldUpRecreateTask(r1)
            return r0
    }
}
