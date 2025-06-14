package com.hjq.permissions;

/* loaded from: classes.dex */
public interface PermissionDelegate {
    android.content.Intent getPermissionIntent(android.content.Context r1, java.lang.String r2);

    boolean isGrantedPermission(android.content.Context r1, java.lang.String r2);

    boolean isPermissionPermanentDenied(android.app.Activity r1, java.lang.String r2);
}
