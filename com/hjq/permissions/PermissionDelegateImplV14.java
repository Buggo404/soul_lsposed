package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV14 implements com.hjq.permissions.PermissionDelegate {
    PermissionDelegateImplV14() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent getVpnPermissionIntent(android.content.Context r2) {
            android.content.Intent r0 = android.net.VpnService.prepare(r2)
            boolean r1 = com.hjq.permissions.PermissionUtils.areActivityIntent(r2, r0)
            if (r1 != 0) goto Le
            android.content.Intent r0 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
        Le:
            return r0
    }

    private static boolean isGrantedVpnPermission(android.content.Context r0) {
            android.content.Intent r0 = android.net.VpnService.prepare(r0)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.BIND_VPN_SERVICE"
            boolean r3 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r3 == 0) goto Ld
            android.content.Intent r2 = getVpnPermissionIntent(r2)
            return r2
        Ld:
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r2)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.BIND_VPN_SERVICE"
            boolean r3 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r3 == 0) goto Ld
            boolean r2 = isGrantedVpnPermission(r2)
            return r2
        Ld:
            r2 = 1
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
