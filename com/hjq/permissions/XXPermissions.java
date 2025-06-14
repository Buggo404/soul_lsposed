package com.hjq.permissions;

/* loaded from: classes.dex */
public final class XXPermissions {
    public static final int REQUEST_CODE = 1025;
    private static java.lang.Boolean sCheckMode;
    private static com.hjq.permissions.IPermissionInterceptor sInterceptor;
    private java.lang.Boolean mCheckMode;
    private final android.content.Context mContext;
    private com.hjq.permissions.IPermissionInterceptor mInterceptor;
    private final java.util.List<java.lang.String> mPermissions;


    private XXPermissions(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPermissions = r0
            r1.mContext = r2
            return
    }

    public static boolean containsSpecial(java.util.List<java.lang.String> r0) {
            boolean r0 = com.hjq.permissions.PermissionApi.containsSpecialPermission(r0)
            return r0
    }

    public static boolean containsSpecial(java.lang.String... r0) {
            java.util.ArrayList r0 = com.hjq.permissions.PermissionUtils.asArrayList(r0)
            boolean r0 = containsSpecial(r0)
            return r0
    }

    public static java.util.List<java.lang.String> getDenied(android.content.Context r0, java.util.List<java.lang.String> r1) {
            java.util.List r0 = com.hjq.permissions.PermissionApi.getDeniedPermissions(r0, r1)
            return r0
    }

    public static java.util.List<java.lang.String> getDenied(android.content.Context r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            java.util.List r0 = getDenied(r0, r1)
            return r0
    }

    public static java.util.List<java.lang.String> getDenied(android.content.Context r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            java.util.List r0 = getDenied(r0, r1)
            return r0
    }

    public static com.hjq.permissions.IPermissionInterceptor getInterceptor() {
            com.hjq.permissions.IPermissionInterceptor r0 = com.hjq.permissions.XXPermissions.sInterceptor
            if (r0 != 0) goto Lb
            com.hjq.permissions.XXPermissions$1 r0 = new com.hjq.permissions.XXPermissions$1
            r0.<init>()
            com.hjq.permissions.XXPermissions.sInterceptor = r0
        Lb:
            com.hjq.permissions.IPermissionInterceptor r0 = com.hjq.permissions.XXPermissions.sInterceptor
            return r0
    }

    private boolean isCheckMode(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.mCheckMode
            if (r0 != 0) goto L16
            java.lang.Boolean r0 = com.hjq.permissions.XXPermissions.sCheckMode
            if (r0 != 0) goto L12
            boolean r2 = com.hjq.permissions.PermissionUtils.isDebugMode(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.hjq.permissions.XXPermissions.sCheckMode = r2
        L12:
            java.lang.Boolean r2 = com.hjq.permissions.XXPermissions.sCheckMode
            r1.mCheckMode = r2
        L16:
            java.lang.Boolean r2 = r1.mCheckMode
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean isGranted(android.content.Context r0, java.util.List<java.lang.String> r1) {
            boolean r0 = com.hjq.permissions.PermissionApi.isGrantedPermissions(r0, r1)
            return r0
    }

    public static boolean isGranted(android.content.Context r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            boolean r0 = isGranted(r0, r1)
            return r0
    }

    public static boolean isGranted(android.content.Context r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            boolean r0 = isGranted(r0, r1)
            return r0
    }

    public static boolean isPermanentDenied(android.app.Activity r0, java.util.List<java.lang.String> r1) {
            boolean r0 = com.hjq.permissions.PermissionApi.isPermissionPermanentDenied(r0, r1)
            return r0
    }

    public static boolean isPermanentDenied(android.app.Activity r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            boolean r0 = isPermanentDenied(r0, r1)
            return r0
    }

    public static boolean isPermanentDenied(android.app.Activity r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            boolean r0 = isPermanentDenied(r0, r1)
            return r0
    }

    public static boolean isSpecial(java.lang.String r0) {
            boolean r0 = com.hjq.permissions.PermissionApi.isSpecialPermission(r0)
            return r0
    }

    public static void setCheckMode(boolean r0) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.hjq.permissions.XXPermissions.sCheckMode = r0
            return
    }

    public static void setInterceptor(com.hjq.permissions.IPermissionInterceptor r0) {
            com.hjq.permissions.XXPermissions.sInterceptor = r0
            return
    }

    public static void startPermissionActivity(android.app.Activity r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            startPermissionActivity(r2, r0)
            return
    }

    public static void startPermissionActivity(android.app.Activity r2, java.lang.String r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.util.ArrayList r3 = com.hjq.permissions.PermissionUtils.asArrayList(r0)
            startPermissionActivity(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(android.app.Activity r1, java.util.List<java.lang.String> r2) {
            r0 = 1025(0x401, float:1.436E-42)
            startPermissionActivity(r1, r2, r0)
            return
    }

    public static void startPermissionActivity(android.app.Activity r0, java.util.List<java.lang.String> r1, int r2) {
            android.content.Intent r1 = com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(r0, r1)
            com.hjq.permissions.StartActivityManager.startActivityForResult(r0, r1, r2)
            return
    }

    public static void startPermissionActivity(android.app.Activity r1, java.util.List<java.lang.String> r2, com.hjq.permissions.OnPermissionPageCallback r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            android.content.Intent r2 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r1)
            com.hjq.permissions.StartActivityManager.startActivity(r1, r2)
            return
        Le:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            com.hjq.permissions.PermissionPageFragment.beginRequest(r1, r2, r3)
            return
    }

    public static void startPermissionActivity(android.app.Activity r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(android.app.Activity r2, java.lang.String[] r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            r0 = 1
            java.lang.String[][] r0 = new java.lang.String[r0][]
            r1 = 0
            r0[r1] = r3
            java.util.ArrayList r3 = com.hjq.permissions.PermissionUtils.asArrayLists(r0)
            startPermissionActivity(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(android.app.Activity r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            startPermissionActivity(r2, r0)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r2, java.lang.String r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.util.ArrayList r3 = com.hjq.permissions.PermissionUtils.asArrayList(r0)
            startPermissionActivity(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r1, java.util.List<java.lang.String> r2) {
            r0 = 1025(0x401, float:1.436E-42)
            startPermissionActivity(r1, r2, r0)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r2, java.util.List<java.lang.String> r3, int r4) {
            android.app.Activity r0 = r2.getActivity()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L15
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r0)
            com.hjq.permissions.StartActivityManager.startActivity(r2, r3)
            return
        L15:
            android.content.Intent r3 = com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(r0, r3)
            com.hjq.permissions.StartActivityManager.startActivityForResult(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r2, java.util.List<java.lang.String> r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            android.app.Activity r0 = r2.getActivity()
            if (r0 == 0) goto L2d
            boolean r1 = r0.isFinishing()
            if (r1 == 0) goto Ld
            goto L2d
        Ld:
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid4_2()
            if (r1 == 0) goto L1a
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L1a
            return
        L1a:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L28
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r0)
            com.hjq.permissions.StartActivityManager.startActivity(r2, r3)
            return
        L28:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            com.hjq.permissions.PermissionPageFragment.beginRequest(r0, r3, r4)
        L2d:
            return
    }

    public static void startPermissionActivity(android.app.Fragment r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r2, java.lang.String[] r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            r0 = 1
            java.lang.String[][] r0 = new java.lang.String[r0][]
            r1 = 0
            r0[r1] = r3
            java.util.ArrayList r3 = com.hjq.permissions.PermissionUtils.asArrayLists(r0)
            startPermissionActivity(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(android.app.Fragment r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(android.content.Context r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            startPermissionActivity(r2, r0)
            return
    }

    public static void startPermissionActivity(android.content.Context r1, java.util.List<java.lang.String> r2) {
            android.app.Activity r0 = com.hjq.permissions.PermissionUtils.findActivity(r1)
            if (r0 == 0) goto La
            startPermissionActivity(r0, r2)
            return
        La:
            android.content.Intent r2 = com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(r1, r2)
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto L17
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
        L17:
            com.hjq.permissions.StartActivityManager.startActivity(r1, r2)
            return
    }

    public static void startPermissionActivity(android.content.Context r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(android.content.Context r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            startPermissionActivity(r1, r0)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r2, java.lang.String r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.util.ArrayList r3 = com.hjq.permissions.PermissionUtils.asArrayList(r0)
            startPermissionActivity(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r1, java.util.List<java.lang.String> r2) {
            r0 = 1025(0x401, float:1.436E-42)
            startPermissionActivity(r1, r2, r0)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r2, java.util.List<java.lang.String> r3, int r4) {
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L15
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r0)
            com.hjq.permissions.StartActivityManager.startActivity(r2, r3)
            return
        L15:
            android.content.Intent r3 = com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(r0, r3)
            com.hjq.permissions.StartActivityManager.startActivityForResult(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r2, java.util.List<java.lang.String> r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L2d
            boolean r1 = r0.isFinishing()
            if (r1 == 0) goto Ld
            goto L2d
        Ld:
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid4_2()
            if (r1 == 0) goto L1a
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L1a
            return
        L1a:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L28
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r0)
            com.hjq.permissions.StartActivityManager.startActivity(r2, r3)
            return
        L28:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            com.hjq.permissions.PermissionPageFragment.beginRequest(r0, r3, r4)
        L2d:
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r0, java.lang.String... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r2, java.lang.String[] r3, com.hjq.permissions.OnPermissionPageCallback r4) {
            r0 = 1
            java.lang.String[][] r0 = new java.lang.String[r0][]
            r1 = 0
            r0[r1] = r3
            java.util.ArrayList r3 = com.hjq.permissions.PermissionUtils.asArrayLists(r0)
            startPermissionActivity(r2, r3, r4)
            return
    }

    public static void startPermissionActivity(androidx.fragment.app.Fragment r0, java.lang.String[]... r1) {
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            startPermissionActivity(r0, r1)
            return
    }

    public static com.hjq.permissions.XXPermissions with(android.app.Fragment r0) {
            android.app.Activity r0 = r0.getActivity()
            com.hjq.permissions.XXPermissions r0 = with(r0)
            return r0
    }

    public static com.hjq.permissions.XXPermissions with(android.content.Context r1) {
            com.hjq.permissions.XXPermissions r0 = new com.hjq.permissions.XXPermissions
            r0.<init>(r1)
            return r0
    }

    public static com.hjq.permissions.XXPermissions with(androidx.fragment.app.Fragment r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            com.hjq.permissions.XXPermissions r0 = with(r0)
            return r0
    }

    public com.hjq.permissions.XXPermissions interceptor(com.hjq.permissions.IPermissionInterceptor r1) {
            r0 = this;
            r0.mInterceptor = r1
            return r0
    }

    public com.hjq.permissions.XXPermissions permission(java.util.List<java.lang.String> r3) {
            r2 = this;
            if (r3 == 0) goto L28
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L28
        L9:
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<java.lang.String> r1 = r2.mPermissions
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r1, r0)
            if (r1 == 0) goto L22
            goto Ld
        L22:
            java.util.List<java.lang.String> r1 = r2.mPermissions
            r1.add(r0)
            goto Ld
        L28:
            return r2
    }

    public com.hjq.permissions.XXPermissions permission(java.lang.String... r1) {
            r0 = this;
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayList(r1)
            com.hjq.permissions.XXPermissions r1 = r0.permission(r1)
            return r1
    }

    public com.hjq.permissions.XXPermissions permission(java.lang.String[]... r1) {
            r0 = this;
            java.util.ArrayList r1 = com.hjq.permissions.PermissionUtils.asArrayLists(r1)
            com.hjq.permissions.XXPermissions r1 = r0.permission(r1)
            return r1
    }

    public void request(com.hjq.permissions.OnPermissionCallback r11) {
            r10 = this;
            android.content.Context r0 = r10.mContext
            if (r0 != 0) goto L5
            return
        L5:
            com.hjq.permissions.IPermissionInterceptor r0 = r10.mInterceptor
            if (r0 != 0) goto Lf
            com.hjq.permissions.IPermissionInterceptor r0 = getInterceptor()
            r10.mInterceptor = r0
        Lf:
            android.content.Context r0 = r10.mContext
            com.hjq.permissions.IPermissionInterceptor r7 = r10.mInterceptor
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r10.mPermissions
            r8.<init>(r1)
            boolean r1 = r10.isCheckMode(r0)
            android.app.Activity r9 = com.hjq.permissions.PermissionUtils.findActivity(r0)
            boolean r2 = com.hjq.permissions.PermissionChecker.checkActivityStatus(r9, r1)
            if (r2 != 0) goto L29
            return
        L29:
            boolean r2 = com.hjq.permissions.PermissionChecker.checkPermissionArgument(r8, r1)
            if (r2 != 0) goto L30
            return
        L30:
            if (r1 == 0) goto L51
            com.hjq.permissions.AndroidManifestInfo r1 = com.hjq.permissions.PermissionUtils.getAndroidManifestInfo(r0)
            com.hjq.permissions.PermissionChecker.checkMediaLocationPermission(r0, r8)
            com.hjq.permissions.PermissionChecker.checkStoragePermission(r0, r8, r1)
            com.hjq.permissions.PermissionChecker.checkBodySensorsPermission(r8)
            com.hjq.permissions.PermissionChecker.checkLocationPermission(r8)
            com.hjq.permissions.PermissionChecker.checkPictureInPicturePermission(r9, r8, r1)
            com.hjq.permissions.PermissionChecker.checkNotificationListenerPermission(r8, r1)
            com.hjq.permissions.PermissionChecker.checkNearbyDevicesPermission(r8, r1)
            com.hjq.permissions.PermissionChecker.checkTargetSdkVersion(r0, r8)
            com.hjq.permissions.PermissionChecker.checkManifestPermissions(r0, r8, r1)
        L51:
            com.hjq.permissions.PermissionChecker.optimizeDeprecatedPermission(r8)
            boolean r0 = com.hjq.permissions.PermissionApi.isGrantedPermissions(r0, r8)
            if (r0 == 0) goto L6a
            if (r11 == 0) goto L69
            r5 = 1
            r1 = r7
            r2 = r9
            r3 = r8
            r4 = r8
            r6 = r11
            r1.grantedPermissionRequest(r2, r3, r4, r5, r6)
            r0 = 1
            r7.finishPermissionRequest(r9, r8, r0, r11)
        L69:
            return
        L6a:
            r7.launchPermissionRequest(r9, r8, r11)
            return
    }

    public boolean revokeOnKill() {
            r5 = this;
            android.content.Context r0 = r5.mContext
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List<java.lang.String> r2 = r5.mPermissions
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lf
            return r1
        Lf:
            boolean r3 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r3 != 0) goto L16
            return r1
        L16:
            int r3 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L2b
            r4 = 1
            if (r3 != r4) goto L27
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.IllegalArgumentException -> L2b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalArgumentException -> L2b
            r0.revokeSelfPermissionOnKill(r2)     // Catch: java.lang.IllegalArgumentException -> L2b
            goto L2a
        L27:
            r0.revokeSelfPermissionsOnKill(r2)     // Catch: java.lang.IllegalArgumentException -> L2b
        L2a:
            return r4
        L2b:
            r2 = move-exception
            boolean r0 = r5.isCheckMode(r0)
            if (r0 != 0) goto L36
            r2.printStackTrace()
            return r1
        L36:
            throw r2
    }

    public com.hjq.permissions.XXPermissions unchecked() {
            r1 = this;
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mCheckMode = r0
            return r1
    }
}
