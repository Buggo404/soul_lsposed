package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV30 extends com.hjq.permissions.PermissionDelegateImplV29 {
    PermissionDelegateImplV30() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent getManageStoragePermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"
            r0.<init>(r1)
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L1b
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"
            r0.<init>(r1)
        L1b:
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L25
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L25:
            return r0
    }

    private static boolean isGrantedManageStoragePermission() {
            boolean r0 = android.os.Environment.isExternalStorageManager()
            return r0
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = getManageStoragePermissionIntent(r2)
            return r2
        Ld:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = isGrantedManageStoragePermission()
            return r2
        Ld:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = super.isPermissionPermanentDenied(r2, r3)
            return r2
    }
}
