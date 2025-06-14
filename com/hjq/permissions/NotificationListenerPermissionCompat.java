package com.hjq.permissions;

/* loaded from: classes.dex */
final class NotificationListenerPermissionCompat {
    private static final java.lang.String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";

    NotificationListenerPermissionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.Intent getPermissionIntent(android.content.Context r6) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            r1 = 0
            if (r0 == 0) goto L52
            com.hjq.permissions.AndroidManifestInfo r0 = com.hjq.permissions.PermissionUtils.getAndroidManifestInfo(r6)
            if (r0 == 0) goto L30
            java.util.List<com.hjq.permissions.AndroidManifestInfo$ServiceInfo> r0 = r0.serviceInfoList
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.next()
            com.hjq.permissions.AndroidManifestInfo$ServiceInfo r3 = (com.hjq.permissions.AndroidManifestInfo.ServiceInfo) r3
            java.lang.String r4 = r3.permission
            java.lang.String r5 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L2b
            goto L14
        L2b:
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L14
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L52
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS"
            r0.<init>(r3)
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r2 = r2.name
            r3.<init>(r6, r2)
            java.lang.String r2 = r3.flattenToString()
            java.lang.String r3 = "android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME"
            r0.putExtra(r3, r2)
            boolean r2 = com.hjq.permissions.PermissionUtils.areActivityIntent(r6, r0)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r1 = r0
        L52:
            if (r1 != 0) goto L68
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid5_1()
            java.lang.String r1 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            if (r0 == 0) goto L62
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            goto L67
        L62:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
        L67:
            r1 = r0
        L68:
            boolean r0 = com.hjq.permissions.PermissionUtils.areActivityIntent(r6, r1)
            if (r0 != 0) goto L72
            android.content.Intent r1 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r6)
        L72:
            return r1
    }

    static boolean isGrantedPermission(android.content.Context r8) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_3()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.ContentResolver r0 = r8.getContentResolver()
            java.lang.String r2 = "enabled_notification_listeners"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L1a
            return r3
        L1a:
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r4 = r3
        L22:
            if (r4 >= r2) goto L48
            r5 = r0[r4]
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r5)
            java.lang.String r6 = r5.getPackageName()
            java.lang.String r7 = r8.getPackageName()
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 != 0) goto L39
            goto L45
        L39:
            java.lang.String r5 = r5.getClassName()
            java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L41
            return r1
        L41:
            r5 = move-exception
            r5.printStackTrace()
        L45:
            int r4 = r4 + 1
            goto L22
        L48:
            return r3
    }
}
