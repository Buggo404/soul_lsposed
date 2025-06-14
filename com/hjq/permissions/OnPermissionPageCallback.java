package com.hjq.permissions;

/* loaded from: classes.dex */
public interface OnPermissionPageCallback {
    default void onDenied() {
            r0 = this;
            return
    }

    void onGranted();
}
