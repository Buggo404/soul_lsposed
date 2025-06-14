package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV21 extends com.hjq.permissions.PermissionDelegateImplV19 {
    PermissionDelegateImplV21() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent getPackagePermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.USAGE_ACCESS_SETTINGS"
            r0.<init>(r1)
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r1 == 0) goto L14
            android.net.Uri r1 = com.hjq.permissions.PermissionUtils.getPackageNameUri(r2)
            r0.setData(r1)
        L14:
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto L1e
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        L1e:
            return r0
    }

    private static boolean isGrantedPackagePermission(android.content.Context r1) {
            java.lang.String r0 = "android:get_usage_stats"
            boolean r1 = com.hjq.permissions.PermissionUtils.checkOpNoThrow(r1, r0)
            return r1
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.PACKAGE_USAGE_STATS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = getPackagePermissionIntent(r2)
            return r2
        Ld:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.PACKAGE_USAGE_STATS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = isGrantedPackagePermission(r2)
            return r2
        Ld:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.PACKAGE_USAGE_STATS"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = super.isPermissionPermanentDenied(r2, r3)
            return r2
    }
}
