package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV23 extends com.hjq.permissions.PermissionDelegateImplV21 {
    PermissionDelegateImplV23() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent getIgnoreBatteryPermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L1b
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"
            r0.<init>(r1)
        L1b:
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L25
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L25:
            return r0
    }

    private static android.content.Intent getNotDisturbPermissionIntent(android.content.Context r2) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r0 == 0) goto L1b
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isHarmonyOs()
            if (r0 != 0) goto L1b
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L29
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"
            r0.<init>(r1)
        L29:
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L33
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L33:
            return r0
    }

    private static android.content.Intent getSettingPermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.action.MANAGE_WRITE_SETTINGS"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L18
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L18:
            return r0
    }

    private static boolean isGrantedIgnoreBatteryPermission(android.content.Context r1) {
            java.lang.Class<android.os.PowerManager> r0 = android.os.PowerManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r0.isIgnoringBatteryOptimizations(r1)
            return r1
    }

    private static boolean isGrantedNotDisturbPermission(android.content.Context r1) {
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            boolean r1 = r1.isNotificationPolicyAccessGranted()
            return r1
    }

    private static boolean isGrantedSettingPermission(android.content.Context r1) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid6()
            if (r0 == 0) goto Lb
            boolean r1 = android.provider.Settings.System.canWrite(r1)
            return r1
        Lb:
            r1 = 1
            return r1
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = getSettingPermissionIntent(r2)
            return r2
        Ld:
            java.lang.String r0 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L1a
            android.content.Intent r2 = getNotDisturbPermissionIntent(r2)
            return r2
        L1a:
            java.lang.String r0 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L27
            android.content.Intent r2 = getIgnoreBatteryPermissionIntent(r2)
            return r2
        L27:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            if (r0 != 0) goto L50
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r1)
            if (r0 == 0) goto L17
            boolean r6 = super.isGrantedPermission(r6, r7)
            return r6
        L17:
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L24
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r3)
            return r6
        L24:
            java.lang.String r0 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L33
            java.lang.String r7 = "android.permission.BODY_SENSORS"
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r7)
            return r6
        L33:
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L50
        L4b:
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r2)
            return r6
        L50:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid12()
            r4 = 1
            if (r0 != 0) goto L75
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L64
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r3)
            return r6
        L64:
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 != 0) goto L74
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L75
        L74:
            return r4
        L75:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 != 0) goto L94
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L94
            boolean r7 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r2)
            if (r7 == 0) goto L92
            java.lang.String r7 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r7)
            if (r6 == 0) goto L92
            goto L93
        L92:
            r4 = 0
        L93:
            return r4
        L94:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto La7
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r3)
            return r6
        La7:
            java.lang.String r0 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto Lb0
            return r4
        Lb0:
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto Lbd
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r2)
            return r6
        Lbd:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid9()
            if (r0 != 0) goto Lcc
            java.lang.String r0 = "android.permission.ACCEPT_HANDOVER"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto Lcc
            return r4
        Lcc:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid8()
            if (r0 != 0) goto Lea
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto Ldb
            return r4
        Ldb:
            java.lang.String r0 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto Lea
            java.lang.String r7 = "android.permission.READ_PHONE_STATE"
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r7)
            return r6
        Lea:
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 != 0) goto L130
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r1)
            if (r0 == 0) goto Lf9
            goto L130
        Lf9:
            boolean r0 = com.hjq.permissions.PermissionUtils.isSpecialPermission(r7)
            if (r0 == 0) goto L12b
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L10c
            boolean r6 = isGrantedSettingPermission(r6)
            return r6
        L10c:
            java.lang.String r0 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L119
            boolean r6 = isGrantedNotDisturbPermission(r6)
            return r6
        L119:
            java.lang.String r0 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L126
            boolean r6 = isGrantedIgnoreBatteryPermission(r6)
            return r6
        L126:
            boolean r6 = super.isGrantedPermission(r6, r7)
            return r6
        L12b:
            boolean r6 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r7)
            return r6
        L130:
            boolean r6 = super.isGrantedPermission(r6, r7)
            return r6
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r7, java.lang.String r8) {
            r6 = this;
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L70
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r1)
            if (r0 == 0) goto L19
            boolean r7 = super.isPermissionPermanentDenied(r7, r8)
            return r7
        L19:
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto L30
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r3)
            if (r8 != 0) goto L2e
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r3)
            if (r7 != 0) goto L2e
            goto L2f
        L2e:
            r4 = r5
        L2f:
            return r4
        L30:
            java.lang.String r0 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto L49
            java.lang.String r8 = "android.permission.BODY_SENSORS"
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r8)
            if (r0 != 0) goto L47
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r8)
            if (r7 != 0) goto L47
            goto L48
        L47:
            r4 = r5
        L48:
            return r4
        L49:
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 != 0) goto L61
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 != 0) goto L61
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto L70
        L61:
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r2)
            if (r8 != 0) goto L6e
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r2)
            if (r7 != 0) goto L6e
            goto L6f
        L6e:
            r4 = r5
        L6f:
            return r4
        L70:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid12()
            if (r0 != 0) goto L9e
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto L8d
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r3)
            if (r8 != 0) goto L8b
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r3)
            if (r7 != 0) goto L8b
            goto L8c
        L8b:
            r4 = r5
        L8c:
            return r4
        L8d:
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto L9e
        L9d:
            return r5
        L9e:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r0 != 0) goto Ldb
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto Lbb
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r3)
            if (r8 != 0) goto Lb9
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r3)
            if (r7 != 0) goto Lb9
            goto Lba
        Lb9:
            r4 = r5
        Lba:
            return r4
        Lbb:
            java.lang.String r0 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto Lc4
            return r5
        Lc4:
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto Ldb
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r2)
            if (r8 != 0) goto Ld9
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r2)
            if (r7 != 0) goto Ld9
            goto Lda
        Ld9:
            r4 = r5
        Lda:
            return r4
        Ldb:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid9()
            if (r0 != 0) goto Lea
            java.lang.String r0 = "android.permission.ACCEPT_HANDOVER"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto Lea
            return r5
        Lea:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid8()
            if (r0 != 0) goto L112
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto Lf9
            return r5
        Lf9:
            java.lang.String r0 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 == 0) goto L112
            java.lang.String r8 = "android.permission.READ_PHONE_STATE"
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r8)
            if (r0 != 0) goto L110
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r8)
            if (r7 != 0) goto L110
            goto L111
        L110:
            r4 = r5
        L111:
            return r4
        L112:
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r0)
            if (r0 != 0) goto L137
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r8, r1)
            if (r0 == 0) goto L121
            goto L137
        L121:
            boolean r0 = com.hjq.permissions.PermissionUtils.isSpecialPermission(r8)
            if (r0 == 0) goto L128
            return r5
        L128:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r8)
            if (r0 != 0) goto L135
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r7, r8)
            if (r7 != 0) goto L135
            goto L136
        L135:
            r4 = r5
        L136:
            return r4
        L137:
            boolean r7 = super.isPermissionPermanentDenied(r7, r8)
            return r7
    }
}
