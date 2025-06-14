package com.hjq.permissions;

/* loaded from: classes.dex */
public interface IPermissionInterceptor {
    default void deniedPermissionRequest(android.app.Activity r1, java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3, boolean r4, com.hjq.permissions.OnPermissionCallback r5) {
            r0 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r5.onDenied(r3, r4)
            return
    }

    default void finishPermissionRequest(android.app.Activity r1, java.util.List<java.lang.String> r2, boolean r3, com.hjq.permissions.OnPermissionCallback r4) {
            r0 = this;
            return
    }

    default void grantedPermissionRequest(android.app.Activity r1, java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3, boolean r4, com.hjq.permissions.OnPermissionCallback r5) {
            r0 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r5.onGranted(r3, r4)
            return
    }

    default void launchPermissionRequest(android.app.Activity r2, java.util.List<java.lang.String> r3, com.hjq.permissions.OnPermissionCallback r4) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            com.hjq.permissions.PermissionFragment.launch(r2, r0, r1, r4)
            return
    }
}
