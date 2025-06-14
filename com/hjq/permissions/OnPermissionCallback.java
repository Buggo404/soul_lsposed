package com.hjq.permissions;

/* loaded from: classes.dex */
public interface OnPermissionCallback {
    default void onDenied(java.util.List<java.lang.String> r1, boolean r2) {
            r0 = this;
            return
    }

    void onGranted(java.util.List<java.lang.String> r1, boolean r2);
}
