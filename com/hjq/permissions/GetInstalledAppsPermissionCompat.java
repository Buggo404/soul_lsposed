package com.hjq.permissions;

/* loaded from: classes.dex */
final class GetInstalledAppsPermissionCompat {
    private static final int MIUI_OP_GET_INSTALLED_APPS_DEFAULT_VALUE = 10022;
    private static final java.lang.String MIUI_OP_GET_INSTALLED_APPS_FIELD_NAME = "OP_GET_INSTALLED_APPS";

    GetInstalledAppsPermissionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.Intent getPermissionIntent(android.content.Context r1) {
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiui()
            if (r0 == 0) goto L1b
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiuiOptimization()
            if (r0 == 0) goto L11
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getMiuiPermissionPageIntent(r1)
            goto L12
        L11:
            r0 = 0
        L12:
            android.content.Intent r1 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r1)
            android.content.Intent r1 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r1)
            return r1
        L1b:
            android.content.Intent r1 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r1)
            return r1
    }

    static boolean isGrantedPermission(android.content.Context r2) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_4()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid6()
            if (r0 == 0) goto L1b
            boolean r0 = isSupportGetInstalledAppsPermission(r2)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r2 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r2, r0)
            return r2
        L1b:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiui()
            if (r0 == 0) goto L37
            boolean r0 = isMiuiSupportGetInstalledAppsPermission()
            if (r0 == 0) goto L37
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiuiOptimization()
            if (r0 != 0) goto L2e
            return r1
        L2e:
            java.lang.String r0 = "OP_GET_INSTALLED_APPS"
            r1 = 10022(0x2726, float:1.4044E-41)
            boolean r2 = com.hjq.permissions.PermissionUtils.checkOpNoThrow(r2, r0, r1)
            return r2
        L37:
            return r1
    }

    private static boolean isMiuiSupportGetInstalledAppsPermission() {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_4()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.NoSuchFieldException -> L18 java.lang.ClassNotFoundException -> L1d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchFieldException -> L18 java.lang.ClassNotFoundException -> L1d
            java.lang.String r2 = "OP_GET_INSTALLED_APPS"
            r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L18 java.lang.ClassNotFoundException -> L1d
            return r1
        L18:
            r0 = move-exception
            r0.printStackTrace()
            goto L21
        L1d:
            r0 = move-exception
            r0.printStackTrace()
        L21:
            return r1
    }

    static boolean isPermissionPermanentDenied(android.app.Activity r4) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_4()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid6()
            r2 = 1
            if (r0 == 0) goto L25
            boolean r0 = isSupportGetInstalledAppsPermission(r4)
            if (r0 == 0) goto L25
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r3 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r4, r0)
            if (r3 != 0) goto L24
            boolean r4 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r4, r0)
            if (r4 != 0) goto L24
            r1 = r2
        L24:
            return r1
        L25:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiui()
            if (r0 == 0) goto L3e
            boolean r0 = isMiuiSupportGetInstalledAppsPermission()
            if (r0 == 0) goto L3e
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiuiOptimization()
            if (r0 != 0) goto L38
            return r1
        L38:
            boolean r4 = isGrantedPermission(r4)
            r4 = r4 ^ r2
            return r4
        L3e:
            return r1
    }

    private static boolean isSupportGetInstalledAppsPermission(android.content.Context r4) {
            r0 = 0
            r1 = 1
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            java.lang.String r3 = "com.android.permission.GET_INSTALLED_APPS"
            android.content.pm.PermissionInfo r2 = r2.getPermissionInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r2 == 0) goto L28
            boolean r3 = com.hjq.permissions.AndroidVersion.isAndroid9()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r3 == 0) goto L1c
            int r4 = r2.getProtection()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r4 != r1) goto L1b
            r0 = r1
        L1b:
            return r0
        L1c:
            int r4 = r2.protectionLevel     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            r4 = r4 & 15
            if (r4 != r1) goto L23
            r0 = r1
        L23:
            return r0
        L24:
            r2 = move-exception
            r2.printStackTrace()
        L28:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L36
            java.lang.String r2 = "oem_installed_apps_runtime_permission_enable"
            int r4 = android.provider.Settings.Secure.getInt(r4, r2)     // Catch: android.provider.Settings.SettingNotFoundException -> L36
            if (r4 != r1) goto L35
            r0 = r1
        L35:
            return r0
        L36:
            r4 = move-exception
            r4.printStackTrace()
            return r0
    }
}
