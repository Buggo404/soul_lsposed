package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV29 extends com.hjq.permissions.PermissionDelegateImplV28 {
    PermissionDelegateImplV29() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean hasReadStoragePermission(android.content.Context r7) {
            r6 = this;
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            r1 = 0
            java.lang.String r2 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            r3 = 1
            if (r0 == 0) goto L22
            int r0 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r7)
            r4 = 33
            if (r0 < r4) goto L22
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r0)
            if (r0 != 0) goto L20
            boolean r7 = r6.isGrantedPermission(r7, r2)
            if (r7 == 0) goto L21
        L20:
            r1 = r3
        L21:
            return r1
        L22:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r0 == 0) goto L40
            int r0 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r7)
            r5 = 30
            if (r0 < r5) goto L40
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r4)
            if (r0 != 0) goto L3e
            boolean r7 = r6.isGrantedPermission(r7, r2)
            if (r7 == 0) goto L3f
        L3e:
            r1 = r3
        L3f:
            return r1
        L40:
            boolean r7 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r7, r4)
            return r7
    }

    private static boolean isUseDeprecationExternalStorage() {
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            return r0
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r5, r0)
            r2 = 0
            if (r1 == 0) goto L17
            boolean r5 = r3.hasReadStoragePermission(r4)
            if (r5 == 0) goto L16
            boolean r4 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r4, r0)
            if (r4 == 0) goto L16
            r2 = 1
        L16:
            return r2
        L17:
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r5, r0)
            if (r0 != 0) goto L42
            java.lang.String r0 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r5, r0)
            if (r0 == 0) goto L28
            goto L42
        L28:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 != 0) goto L3d
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r5, r0)
            if (r0 == 0) goto L3d
            boolean r0 = isUseDeprecationExternalStorage()
            if (r0 != 0) goto L3d
            return r2
        L3d:
            boolean r4 = super.isGrantedPermission(r4, r5)
            return r4
        L42:
            boolean r4 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r4, r5)
            return r4
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L26
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r5, r0)
            if (r3 != 0) goto L18
            boolean r5 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r5, r0)
            r5 = r5 ^ r2
            return r5
        L18:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r5, r6)
            if (r0 != 0) goto L25
            boolean r5 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r5, r6)
            if (r5 != 0) goto L25
            r1 = r2
        L25:
            return r1
        L26:
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r6, r0)
            if (r0 == 0) goto L42
            boolean r0 = r4.hasReadStoragePermission(r5)
            if (r0 == 0) goto L41
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r5, r6)
            if (r0 != 0) goto L41
            boolean r5 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r5, r6)
            if (r5 != 0) goto L41
            r1 = r2
        L41:
            return r1
        L42:
            java.lang.String r0 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r6, r0)
            if (r0 == 0) goto L58
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r5, r6)
            if (r0 != 0) goto L57
            boolean r5 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r5, r6)
            if (r5 != 0) goto L57
            r1 = r2
        L57:
            return r1
        L58:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 != 0) goto L6d
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r6, r0)
            if (r0 == 0) goto L6d
            boolean r0 = isUseDeprecationExternalStorage()
            if (r0 != 0) goto L6d
            return r2
        L6d:
            boolean r5 = super.isPermissionPermanentDenied(r5, r6)
            return r5
    }
}
