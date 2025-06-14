package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV26 extends com.hjq.permissions.PermissionDelegateImplV23 {
    PermissionDelegateImplV26() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent getInstallPermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L18
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L18:
            return r0
    }

    private static android.content.Intent getPictureInPicturePermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.PICTURE_IN_PICTURE_SETTINGS"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L18
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L18:
            return r0
    }

    private static boolean isGrantedInstallPermission(android.content.Context r0) {
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = r0.canRequestPackageInstalls()
            return r0
    }

    private static boolean isGrantedPictureInPicturePermission(android.content.Context r1) {
            java.lang.String r0 = "android:picture_in_picture"
            boolean r1 = com.hjq.permissions.PermissionUtils.checkOpNoThrow(r1, r0)
            return r1
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = getInstallPermissionIntent(r2)
            return r2
        Ld:
            java.lang.String r0 = "android.permission.PICTURE_IN_PICTURE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L1a
            android.content.Intent r2 = getPictureInPicturePermissionIntent(r2)
            return r2
        L1a:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = isGrantedInstallPermission(r2)
            return r2
        Ld:
            java.lang.String r0 = "android.permission.PICTURE_IN_PICTURE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L1a
            boolean r2 = isGrantedPictureInPicturePermission(r2)
            return r2
        L1a:
            java.lang.String r0 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L2b
            goto L30
        L2b:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
        L30:
            boolean r2 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "android.permission.PICTURE_IN_PICTURE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.String r0 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r0)
            if (r0 == 0) goto L24
            goto L29
        L24:
            boolean r3 = super.isPermissionPermanentDenied(r3, r4)
            return r3
        L29:
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r3, r4)
            if (r0 != 0) goto L36
            boolean r3 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r3, r4)
            if (r3 != 0) goto L36
            r1 = 1
        L36:
            return r1
    }
}
