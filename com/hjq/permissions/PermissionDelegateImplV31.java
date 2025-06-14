package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV31 extends com.hjq.permissions.PermissionDelegateImplV30 {
    PermissionDelegateImplV31() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent getAlarmPermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L18
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L18:
            return r0
    }

    private static boolean isGrantedAlarmPermission(android.content.Context r1) {
            java.lang.Class<android.app.AlarmManager> r0 = android.app.AlarmManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1
            boolean r1 = r1.canScheduleExactAlarms()
            return r1
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = getAlarmPermissionIntent(r2)
            return r2
        Ld:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = isGrantedAlarmPermission(r2)
            return r2
        Ld:
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L26
            goto L2b
        L26:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
        L2b:
            boolean r2 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            r2 = 1
            if (r0 != 0) goto L67
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 != 0) goto L67
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L24
            goto L67
        L24:
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 31
            if (r0 < r3) goto L62
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r7, r0)
            if (r0 == 0) goto L62
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r0)
            if (r3 != 0) goto L54
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r3)
            if (r4 != 0) goto L54
            boolean r7 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r6, r0)
            if (r7 != 0) goto L53
            boolean r6 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r6, r3)
            if (r6 != 0) goto L53
            r1 = r2
        L53:
            return r1
        L54:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r7)
            if (r0 != 0) goto L61
            boolean r6 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r6, r7)
            if (r6 != 0) goto L61
            r1 = r2
        L61:
            return r1
        L62:
            boolean r6 = super.isPermissionPermanentDenied(r6, r7)
            return r6
        L67:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r6, r7)
            if (r0 != 0) goto L74
            boolean r6 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r6, r7)
            if (r6 != 0) goto L74
            r1 = r2
        L74:
            return r1
    }
}
