package androidx.core.app;

/* loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int noteOp(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteOp(r2, r3, r4)
            return r1
    }

    public static int noteOpNoThrow(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteOpNoThrow(r2, r3, r4)
            return r1
    }

    public static int noteProxyOp(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteProxyOp(r2, r3)
            return r1
    }

    public static int noteProxyOpNoThrow(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteProxyOpNoThrow(r2, r3)
            return r1
    }

    public static java.lang.String permissionToOp(java.lang.String r0) {
            java.lang.String r0 = android.app.AppOpsManager.permissionToOp(r0)
            return r0
    }
}
