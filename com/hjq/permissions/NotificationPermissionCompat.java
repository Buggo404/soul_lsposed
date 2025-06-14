package com.hjq.permissions;

/* loaded from: classes.dex */
final class NotificationPermissionCompat {
    private static final int OP_POST_NOTIFICATION_DEFAULT_VALUE = 11;
    private static final java.lang.String OP_POST_NOTIFICATION_FIELD_NAME = "OP_POST_NOTIFICATION";

    NotificationPermissionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.Intent getPermissionIntent(android.content.Context r3) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid8()
            java.lang.String r1 = "android.settings.APP_NOTIFICATION_SETTINGS"
            if (r0 == 0) goto L17
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            java.lang.String r1 = "android.provider.extra.APP_PACKAGE"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            goto L3b
        L17:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid5()
            if (r0 == 0) goto L3a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setAction(r1)
            java.lang.String r1 = "app_package"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()
            int r1 = r1.uid
            java.lang.String r2 = "app_uid"
            r0.putExtra(r2, r1)
            goto L3b
        L3a:
            r0 = 0
        L3b:
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r3, r0)
            if (r1 != 0) goto L45
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r3)
        L45:
            return r0
    }

    static boolean isGrantedPermission(android.content.Context r2) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid7()
            if (r0 == 0) goto L13
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            boolean r2 = r2.areNotificationsEnabled()
            return r2
        L13:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_4()
            if (r0 == 0) goto L22
            java.lang.String r0 = "OP_POST_NOTIFICATION"
            r1 = 11
            boolean r2 = com.hjq.permissions.PermissionUtils.checkOpNoThrow(r2, r0, r1)
            return r2
        L22:
            r2 = 1
            return r2
    }
}
