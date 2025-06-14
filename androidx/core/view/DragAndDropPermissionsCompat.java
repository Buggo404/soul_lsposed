package androidx.core.view;

/* loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {
    private java.lang.Object mDragAndDropPermissions;

    private DragAndDropPermissionsCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mDragAndDropPermissions = r1
            return
    }

    public static androidx.core.view.DragAndDropPermissionsCompat request(android.app.Activity r0, android.view.DragEvent r1) {
            android.view.DragAndDropPermissions r0 = r0.requestDragAndDropPermissions(r1)
            if (r0 == 0) goto Lc
            androidx.core.view.DragAndDropPermissionsCompat r1 = new androidx.core.view.DragAndDropPermissionsCompat
            r1.<init>(r0)
            return r1
        Lc:
            r0 = 0
            return r0
    }

    public void release() {
            r1 = this;
            java.lang.Object r0 = r1.mDragAndDropPermissions
            android.view.DragAndDropPermissions r0 = (android.view.DragAndDropPermissions) r0
            r0.release()
            return
    }
}
