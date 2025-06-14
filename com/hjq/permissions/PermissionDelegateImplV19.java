package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV19 extends com.hjq.permissions.PermissionDelegateImplV18 {
    PermissionDelegateImplV19() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = com.hjq.permissions.WindowPermissionCompat.getPermissionIntent(r2)
            return r2
        Ld:
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L1a
            android.content.Intent r2 = com.hjq.permissions.GetInstalledAppsPermissionCompat.getPermissionIntent(r2)
            return r2
        L1a:
            java.lang.String r0 = "android.permission.NOTIFICATION_SERVICE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L27
            android.content.Intent r2 = com.hjq.permissions.NotificationPermissionCompat.getPermissionIntent(r2)
            return r2
        L27:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r0 != 0) goto L3a
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L3a
            android.content.Intent r2 = com.hjq.permissions.NotificationPermissionCompat.getPermissionIntent(r2)
            return r2
        L3a:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = com.hjq.permissions.WindowPermissionCompat.isGrantedPermission(r2)
            return r2
        Ld:
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L1a
            boolean r2 = com.hjq.permissions.GetInstalledAppsPermissionCompat.isGrantedPermission(r2)
            return r2
        L1a:
            java.lang.String r0 = "android.permission.NOTIFICATION_SERVICE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L27
            boolean r2 = com.hjq.permissions.NotificationPermissionCompat.isGrantedPermission(r2)
            return r2
        L27:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r0 != 0) goto L3a
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L3a
            boolean r2 = com.hjq.permissions.NotificationPermissionCompat.isGrantedPermission(r2)
            return r2
        L3a:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            if (r0 == 0) goto L17
            boolean r3 = com.hjq.permissions.GetInstalledAppsPermissionCompat.isPermissionPermanentDenied(r3)
            return r3
        L17:
            java.lang.String r0 = "android.permission.NOTIFICATION_SERVICE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            if (r0 == 0) goto L20
            return r1
        L20:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r0 != 0) goto L2f
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            if (r0 == 0) goto L2f
            return r1
        L2f:
            boolean r3 = super.isPermissionPermanentDenied(r3, r4)
            return r3
    }
}
