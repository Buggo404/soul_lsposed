package com.hjq.permissions;

/* loaded from: classes.dex */
final class WindowPermissionCompat {
    private static final int OP_SYSTEM_ALERT_WINDOW_DEFAULT_VALUE = 24;
    private static final java.lang.String OP_SYSTEM_ALERT_WINDOW_FIELD_NAME = "OP_SYSTEM_ALERT_WINDOW";

    WindowPermissionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.Intent getPermissionIntent(android.content.Context r2) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid6()
            if (r0 == 0) goto L3f
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 == 0) goto L25
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiui()
            if (r0 == 0) goto L25
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiuiOptimization()
            if (r0 == 0) goto L25
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getMiuiPermissionPageIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r2)
            return r2
        L25:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 == 0) goto L3a
            return r0
        L3a:
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            return r2
        L3f:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isEmui()
            if (r0 == 0) goto L52
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getEmuiWindowPermissionPageIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r2)
            return r2
        L52:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiui()
            if (r0 == 0) goto L6d
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiuiOptimization()
            if (r0 == 0) goto L63
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getMiuiWindowPermissionPageIntent(r2)
            goto L64
        L63:
            r0 = 0
        L64:
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r2)
            return r2
        L6d:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isColorOs()
            if (r0 == 0) goto L80
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getColorOsWindowPermissionPageIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r2)
            return r2
        L80:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isOriginOs()
            if (r0 == 0) goto L93
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getOriginOsWindowPermissionPageIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r2)
            return r2
        L93:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isOneUi()
            if (r0 == 0) goto La6
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getOneUiWindowPermissionPageIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            android.content.Intent r2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(r0, r2)
            return r2
        La6:
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            return r2
    }

    static boolean isGrantedPermission(android.content.Context r2) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid6()
            if (r0 == 0) goto Lb
            boolean r2 = android.provider.Settings.canDrawOverlays(r2)
            return r2
        Lb:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_4()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "OP_SYSTEM_ALERT_WINDOW"
            r1 = 24
            boolean r2 = com.hjq.permissions.PermissionUtils.checkOpNoThrow(r2, r0, r1)
            return r2
        L1a:
            r2 = 1
            return r2
    }
}
