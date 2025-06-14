package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV28 extends com.hjq.permissions.PermissionDelegateImplV26 {
    PermissionDelegateImplV28() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.ACCEPT_HANDOVER"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r2, r3)
            return r2
        Ld:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.ACCEPT_HANDOVER"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto L18
            boolean r0 = com.hjq.permissions.PermissionUtils.checkSelfPermission(r2, r3)
            if (r0 != 0) goto L16
            boolean r2 = com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(r2, r3)
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
        L18:
            boolean r2 = super.isPermissionPermanentDenied(r2, r3)
            return r2
    }
}
