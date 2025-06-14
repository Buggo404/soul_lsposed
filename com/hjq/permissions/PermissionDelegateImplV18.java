package com.hjq.permissions;

/* loaded from: classes.dex */
class PermissionDelegateImplV18 extends com.hjq.permissions.PermissionDelegateImplV14 {
    PermissionDelegateImplV18() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            android.content.Intent r2 = com.hjq.permissions.NotificationListenerPermissionCompat.getPermissionIntent(r2)
            return r2
        Ld:
            android.content.Intent r2 = super.getPermissionIntent(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto Ld
            boolean r2 = com.hjq.permissions.NotificationListenerPermissionCompat.isGrantedPermission(r2)
            return r2
        Ld:
            boolean r2 = super.isGrantedPermission(r2, r3)
            return r2
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r3, r0)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = super.isPermissionPermanentDenied(r2, r3)
            return r2
    }
}
