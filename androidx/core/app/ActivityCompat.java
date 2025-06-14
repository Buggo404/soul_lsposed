package androidx.core.app;

/* loaded from: classes.dex */
public class ActivityCompat extends androidx.core.content.ContextCompat {
    private static androidx.core.app.ActivityCompat.PermissionCompatDelegate sDelegate;

    /* renamed from: androidx.core.app.ActivityCompat$1 */
    class RunnableC01611 implements java.lang.Runnable {
        final /* synthetic */ android.app.Activity val$activity;
        final /* synthetic */ java.lang.String[] val$permissions;
        final /* synthetic */ int val$requestCode;

        RunnableC01611(java.lang.String[] r1, android.app.Activity r2, int r3) {
                r0 = this;
                r0.val$permissions = r1
                r0.val$activity = r2
                r0.val$requestCode = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String[] r0 = r6.val$permissions
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.app.Activity r1 = r6.val$activity
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.app.Activity r2 = r6.val$activity
                java.lang.String r2 = r2.getPackageName()
                java.lang.String[] r3 = r6.val$permissions
                int r3 = r3.length
                r4 = 0
            L15:
                if (r4 >= r3) goto L24
                java.lang.String[] r5 = r6.val$permissions
                r5 = r5[r4]
                int r5 = r1.checkPermission(r5, r2)
                r0[r4] = r5
                int r4 = r4 + 1
                goto L15
            L24:
                android.app.Activity r1 = r6.val$activity
                androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback r1 = (androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback) r1
                int r2 = r6.val$requestCode
                java.lang.String[] r3 = r6.val$permissions
                r1.onRequestPermissionsResult(r2, r3, r0)
                return
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$2 */
    class RunnableC01622 implements java.lang.Runnable {
        final /* synthetic */ android.app.Activity val$activity;

        RunnableC01622(android.app.Activity r1) {
                r0 = this;
                r0.val$activity = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.app.Activity r0 = r1.val$activity
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L15
                android.app.Activity r0 = r1.val$activity
                boolean r0 = androidx.core.app.ActivityRecreator.recreate(r0)
                if (r0 != 0) goto L15
                android.app.Activity r0 = r1.val$activity
                r0.recreate()
            L15:
                return
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setLocusContext(android.app.Activity r0, androidx.core.content.LocusIdCompat r1, android.os.Bundle r2) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.content.LocusId r1 = r1.toLocusId()
            L8:
                r0.setLocusContext(r1, r2)
                return
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(android.app.Activity r1, int r2, int r3, android.content.Intent r4);

        boolean requestPermissions(android.app.Activity r1, java.lang.String[] r2, int r3);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int r1);
    }

    private static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final androidx.core.app.SharedElementCallback mCallback;


        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        @Override // android.app.SharedElementCallback
        public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r2, android.graphics.Matrix r3, android.graphics.RectF r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                android.os.Parcelable r2 = r0.onCaptureSharedElementSnapshot(r2, r3, r4)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public android.view.View onCreateSnapshotView(android.content.Context r2, android.os.Parcelable r3) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                android.view.View r2 = r0.onCreateSnapshotView(r2, r3)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> r2, java.util.Map<java.lang.String, android.view.View> r3) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onMapSharedElements(r2, r3)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(java.util.List<android.view.View> r2) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onRejectSharedElements(r2)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onSharedElementEnd(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onSharedElementStart(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(java.util.List<java.lang.String> r3, java.util.List<android.view.View> r4, android.app.SharedElementCallback.OnSharedElementsReadyListener r5) {
                r2 = this;
                androidx.core.app.SharedElementCallback r0 = r2.mCallback
                androidx.core.app.ActivityCompat$SharedElementCallback21Impl$1 r1 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl$1
                r1.<init>(r2, r5)
                r0.onSharedElementsArrived(r3, r4, r1)
                return
        }
    }

    protected ActivityCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void finishAffinity(android.app.Activity r0) {
            r0.finishAffinity()
            return
    }

    public static void finishAfterTransition(android.app.Activity r0) {
            r0.finishAfterTransition()
            return
    }

    public static androidx.core.app.ActivityCompat.PermissionCompatDelegate getPermissionCompatDelegate() {
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            return r0
    }

    public static android.net.Uri getReferrer(android.app.Activity r0) {
            android.net.Uri r0 = r0.getReferrer()
            return r0
    }

    @java.lang.Deprecated
    public static boolean invalidateOptionsMenu(android.app.Activity r0) {
            r0.invalidateOptionsMenu()
            r0 = 1
            return r0
    }

    public static void postponeEnterTransition(android.app.Activity r0) {
            r0.postponeEnterTransition()
            return
    }

    public static void recreate(android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            r2.recreate()
            goto L13
        La:
            boolean r0 = androidx.core.app.ActivityRecreator.recreate(r2)
            if (r0 != 0) goto L13
            r2.recreate()
        L13:
            return
    }

    public static androidx.core.view.DragAndDropPermissionsCompat requestDragAndDropPermissions(android.app.Activity r0, android.view.DragEvent r1) {
            androidx.core.view.DragAndDropPermissionsCompat r0 = androidx.core.view.DragAndDropPermissionsCompat.request(r0, r1)
            return r0
    }

    public static void requestPermissions(android.app.Activity r3, java.lang.String[] r4, int r5) {
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            if (r0 == 0) goto Lb
            boolean r0 = r0.requestPermissions(r3, r4, r5)
            if (r0 == 0) goto Lb
            return
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L39
            r2 = r4[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1a
            int r1 = r1 + 1
            goto Ld
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Permission request for permissions "
            r5.<init>(r0)
            java.lang.String r4 = java.util.Arrays.toString(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " must not contain null or empty values"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L39:
            boolean r0 = r3 instanceof androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
            if (r0 == 0) goto L43
            r0 = r3
            androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator r0 = (androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) r0
            r0.validateRequestPermissionsRequestCode(r5)
        L43:
            r3.requestPermissions(r4, r5)
            return
    }

    public static <T extends android.view.View> T requireViewById(android.app.Activity r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.View r2 = r2.requireViewById(r3)
            return r2
        Lb:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Activity"
            r2.<init>(r3)
            throw r2
    }

    public static void setEnterSharedElementCallback(android.app.Activity r1, androidx.core.app.SharedElementCallback r2) {
            if (r2 == 0) goto L8
            androidx.core.app.ActivityCompat$SharedElementCallback21Impl r0 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.setEnterSharedElementCallback(r0)
            return
    }

    public static void setExitSharedElementCallback(android.app.Activity r1, androidx.core.app.SharedElementCallback r2) {
            if (r2 == 0) goto L8
            androidx.core.app.ActivityCompat$SharedElementCallback21Impl r0 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.setExitSharedElementCallback(r0)
            return
    }

    public static void setLocusContext(android.app.Activity r2, androidx.core.content.LocusIdCompat r3, android.os.Bundle r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            androidx.core.app.ActivityCompat.Api30Impl.setLocusContext(r2, r3, r4)
        L9:
            return
    }

    public static void setPermissionCompatDelegate(androidx.core.app.ActivityCompat.PermissionCompatDelegate r0) {
            androidx.core.app.ActivityCompat.sDelegate = r0
            return
    }

    public static boolean shouldShowRequestPermissionRationale(android.app.Activity r0, java.lang.String r1) {
            boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
            return r0
    }

    public static void startActivityForResult(android.app.Activity r0, android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0.startActivityForResult(r1, r2, r3)
            return
    }

    public static void startIntentSenderForResult(android.app.Activity r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void startPostponedEnterTransition(android.app.Activity r0) {
            r0.startPostponedEnterTransition()
            return
    }
}
