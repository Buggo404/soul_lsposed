package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV33 extends com.hjq.permissions.PermissionDelegateImplV31 {
    PermissionDelegateImplV33() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = com.hjq.permissions.NotificationPermissionCompat.getPermissionIntent(r2)
            return r2
        Ld:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            java.lang.String r9 = "android.permission.BODY_SENSORS"
            boolean r9 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r9)
            if (r9 == 0) goto L19
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r0)
            if (r8 == 0) goto L19
            r2 = r3
        L19:
            return r2
        L1a:
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            if (r1 != 0) goto L75
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
            boolean r4 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r1)
            if (r4 != 0) goto L75
            java.lang.String r4 = "android.permission.READ_MEDIA_AUDIO"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r4)
            if (r5 == 0) goto L43
            goto L75
        L43:
            int r5 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r8)
            r6 = 33
            if (r5 < r6) goto L70
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r5)
            if (r5 == 0) goto L54
            return r3
        L54:
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r5)
            if (r5 == 0) goto L70
            boolean r9 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r0)
            if (r9 == 0) goto L6f
            boolean r9 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r1)
            if (r9 == 0) goto L6f
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r4)
            if (r8 == 0) goto L6f
            r2 = r3
        L6f:
            return r2
        L70:
            boolean r8 = super.isGrantedPermission(r8, r9)
            return r8
        L75:
            boolean r8 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r9)
            return r8
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            java.lang.String r0 = "android.permission.BODY_SENSORS"
            boolean r3 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r0)
            if (r3 != 0) goto L18
            boolean r8 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r8, r0)
            r8 = r8 ^ r1
            return r8
        L18:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r9)
            if (r0 != 0) goto L25
            boolean r8 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r8, r9)
            if (r8 != 0) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            return r1
        L27:
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            if (r0 != 0) goto L95
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            if (r0 != 0) goto L95
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r3 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r0)
            if (r3 != 0) goto L95
            java.lang.String r3 = "android.permission.READ_MEDIA_VIDEO"
            boolean r4 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r3)
            if (r4 != 0) goto L95
            java.lang.String r4 = "android.permission.READ_MEDIA_AUDIO"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r4)
            if (r5 == 0) goto L50
            goto L95
        L50:
            int r5 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r8)
            r6 = 33
            if (r5 < r6) goto L90
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r5)
            if (r5 == 0) goto L61
            return r2
        L61:
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r9, r5)
            if (r5 == 0) goto L90
            boolean r9 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r0)
            if (r9 != 0) goto L8e
            boolean r9 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r8, r0)
            if (r9 != 0) goto L8e
            boolean r9 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r3)
            if (r9 != 0) goto L8e
            boolean r9 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r8, r3)
            if (r9 != 0) goto L8e
            boolean r9 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r4)
            if (r9 != 0) goto L8e
            boolean r8 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r8, r4)
            if (r8 != 0) goto L8e
            goto L8f
        L8e:
            r1 = r2
        L8f:
            return r1
        L90:
            boolean r8 = super.isPermissionPermanentDenied(r8, r9)
            return r8
        L95:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r8, r9)
            if (r0 != 0) goto La2
            boolean r8 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r8, r9)
            if (r8 != 0) goto La2
            goto La3
        La2:
            r1 = r2
        La3:
            return r1
    }
}
