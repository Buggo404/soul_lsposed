package androidx.core.content;

/* loaded from: classes.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    private PermissionChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkCallingOrSelfPermission(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lf
            java.lang.String r0 = r3.getPackageName()
            goto L10
        Lf:
            r0 = 0
        L10:
            int r1 = android.os.Binder.getCallingPid()
            int r2 = android.os.Binder.getCallingUid()
            int r3 = checkPermission(r3, r4, r1, r2, r0)
            return r3
    }

    public static int checkCallingPermission(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lc
            r2 = -1
            return r2
        Lc:
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Binder.getCallingUid()
            int r2 = checkPermission(r2, r3, r0, r1, r4)
            return r2
    }

    public static int checkPermission(android.content.Context r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            int r3 = r1.checkPermission(r2, r3, r4)
            r0 = -1
            if (r3 != r0) goto L8
            return r0
        L8:
            java.lang.String r2 = androidx.core.app.AppOpsManagerCompat.permissionToOp(r2)
            r3 = 0
            if (r2 != 0) goto L10
            return r3
        L10:
            if (r5 != 0) goto L24
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            java.lang.String[] r4 = r5.getPackagesForUid(r4)
            if (r4 == 0) goto L23
            int r5 = r4.length
            if (r5 > 0) goto L20
            goto L23
        L20:
            r5 = r4[r3]
            goto L24
        L23:
            return r0
        L24:
            int r1 = androidx.core.app.AppOpsManagerCompat.noteProxyOpNoThrow(r1, r2, r5)
            if (r1 == 0) goto L2c
            r1 = -2
            return r1
        L2c:
            return r3
    }

    public static int checkSelfPermission(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r3 = checkPermission(r3, r4, r0, r1, r2)
            return r3
    }
}
