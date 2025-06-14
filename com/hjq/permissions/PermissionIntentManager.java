package com.hjq.permissions;

/* loaded from: classes.dex */
final class PermissionIntentManager {
    private static final java.lang.String COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_1 = "com.oppo.safe";
    private static final java.lang.String COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_2 = "com.color.safecenter";
    private static final java.lang.String COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_3 = "com.oplus.safecenter";
    private static final java.lang.String EMUI_MOBILE_MANAGER_APP_PACKAGE_NAME = "com.huawei.systemmanager";
    private static final java.lang.String MIUI_MOBILE_MANAGER_APP_PACKAGE_NAME = "com.miui.securitycenter";
    private static final java.lang.String ORIGIN_OS_MOBILE_MANAGER_APP_PACKAGE_NAME = "com.iqoo.secure";

    PermissionIntentManager() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.Intent getAndroidSettingAppIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r2 == 0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    static android.content.Intent getApplicationDetailsIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 == 0) goto L15
            return r0
        L15:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_SETTINGS"
            r0.<init>(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 == 0) goto L23
            return r0
        L23:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.MANAGE_APPLICATIONS_SETTINGS"
            r0.<init>(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 == 0) goto L31
            return r0
        L31:
            android.content.Intent r2 = getAndroidSettingAppIntent(r2)
            return r2
    }

    static android.content.Intent getColorOsWindowPermissionPageIntent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.oppo.safe.permission.PermissionTopActivity"
            r0.<init>(r1)
            android.content.Intent r1 = getOppoSafeCenterAppIntent(r3)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r3, r0)
            if (r2 == 0) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r3, r1)
            if (r3 == 0) goto L1d
            android.content.Intent r0 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r1)
        L1d:
            return r0
    }

    static android.content.Intent getEmuiWindowPermissionPageIntent(android.content.Context r5) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"
            java.lang.String r2 = "com.huawei.systemmanager"
            r0.setClassName(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "com.huawei.notificationmanager.ui.NotificationManagmentActivity"
            r1.setClassName(r2, r3)
            android.content.Intent r2 = getHuaWeiMobileManagerAppIntent(r5)
            java.lang.String r3 = com.hjq.permissions.PhoneRomUtils.getRomVersionName()
            if (r3 != 0) goto L22
            java.lang.String r3 = ""
        L22:
            java.lang.String r4 = "3.0"
            boolean r3 = r3.startsWith(r4)
            r4 = 0
            if (r3 == 0) goto L3e
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r5, r1)
            if (r3 == 0) goto L32
            goto L33
        L32:
            r1 = r4
        L33:
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r5, r0)
            if (r3 == 0) goto L52
            android.content.Intent r1 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r1, r0)
            goto L52
        L3e:
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r5, r0)
            if (r3 == 0) goto L45
            goto L46
        L45:
            r0 = r4
        L46:
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r5, r1)
            if (r3 == 0) goto L51
            android.content.Intent r1 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r1)
            goto L52
        L51:
            r1 = r0
        L52:
            boolean r5 = com.hjq.permissions.PermissionUtils.areActivityIntent(r5, r2)
            if (r5 == 0) goto L5c
            android.content.Intent r1 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r1, r2)
        L5c:
            return r1
    }

    static android.content.Intent getHuaWeiMobileManagerAppIntent(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.huawei.systemmanager"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    static android.content.Intent getMiuiPermissionPageIntent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = "extra_pkgname"
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r0 = r0.putExtra(r1, r2)
            android.content.Intent r1 = getXiaoMiMobileManagerAppIntent(r3)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r3, r0)
            if (r2 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r3, r1)
            if (r3 == 0) goto L2b
            android.content.Intent r0 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r1)
        L2b:
            return r0
    }

    static android.content.Intent getMiuiWindowPermissionPageIntent(android.content.Context r0) {
            android.content.Intent r0 = getMiuiPermissionPageIntent(r0)
            return r0
    }

    static android.content.Intent getOneUiPermissionPageIntent(android.content.Context r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.android.settings"
            java.lang.String r2 = "com.android.settings.Settings$AppOpsDetailsActivity"
            r0.setClassName(r1, r2)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "package"
            java.lang.String r3 = r4.getPackageName()
            r1.putString(r2, r3)
            java.lang.String r2 = ":settings:show_fragment_args"
            r0.putExtra(r2, r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r4)
            r0.setData(r1)
            boolean r4 = com.hjq.permissions.PermissionUtils.areActivityIntent(r4, r0)
            if (r4 == 0) goto L2d
            return r0
        L2d:
            r4 = 0
            return r4
    }

    static android.content.Intent getOneUiWindowPermissionPageIntent(android.content.Context r0) {
            android.content.Intent r0 = getOneUiPermissionPageIntent(r0)
            return r0
    }

    static android.content.Intent getOppoSafeCenterAppIntent(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.oppo.safe"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 == 0) goto L11
            return r0
        L11:
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.color.safecenter"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 == 0) goto L22
            return r0
        L22:
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.oplus.safecenter"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r2 == 0) goto L33
            return r0
        L33:
            r2 = 0
            return r2
    }

    static android.content.Intent getOriginOsPermissionPageIntent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "permission.intent.action.softPermissionDetail"
            r0.<init>(r1)
            java.lang.String r1 = "packagename"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            boolean r3 = com.hjq.permissions.PermissionUtils.areActivityIntent(r3, r0)
            if (r3 == 0) goto L17
            return r0
        L17:
            r3 = 0
            return r3
    }

    static android.content.Intent getOriginOsWindowPermissionPageIntent(android.content.Context r1) {
            android.content.Intent r0 = getVivoMobileManagerAppIntent(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r1, r0)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r1 = 0
            return r1
    }

    static android.content.Intent getVivoMobileManagerAppIntent(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.iqoo.secure"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    static android.content.Intent getXiaoMiMobileManagerAppIntent(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.miui.securitycenter"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }
}
