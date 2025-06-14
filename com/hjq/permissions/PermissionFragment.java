package com.hjq.permissions;

/* loaded from: classes.dex */
public final class PermissionFragment extends android.app.Fragment implements java.lang.Runnable {
    private static final java.lang.String REQUEST_CODE = "request_code";
    private static final java.util.List<java.lang.Integer> REQUEST_CODE_ARRAY = null;
    private static final java.lang.String REQUEST_PERMISSIONS = "request_permissions";
    private com.hjq.permissions.OnPermissionCallback mCallBack;
    private boolean mDangerousRequest;
    private com.hjq.permissions.IPermissionInterceptor mInterceptor;
    private boolean mRequestFlag;
    private int mScreenOrientation;
    private boolean mSpecialRequest;


    /* renamed from: com.hjq.permissions.PermissionFragment$2 */
    class C08622 implements com.hjq.permissions.OnPermissionCallback {
        final /* synthetic */ com.hjq.permissions.PermissionFragment this$0;
        final /* synthetic */ android.app.Activity val$activity;
        final /* synthetic */ java.util.ArrayList val$allPermissions;
        final /* synthetic */ int val$requestCode;
        final /* synthetic */ java.util.ArrayList val$secondPermissions;



        C08622(com.hjq.permissions.PermissionFragment r1, android.app.Activity r2, java.util.ArrayList r3, java.util.ArrayList r4, int r5) {
                r0 = this;
                r0.this$0 = r1
                r0.val$activity = r2
                r0.val$secondPermissions = r3
                r0.val$allPermissions = r4
                r0.val$requestCode = r5
                r0.<init>()
                return
        }

        /* renamed from: lambda$onGranted$0$com-hjq-permissions-PermissionFragment$2, reason: not valid java name */
        /* synthetic */ void m135lambda$onGranted$0$comhjqpermissionsPermissionFragment$2(android.app.Activity r3, java.util.ArrayList r4, java.util.ArrayList r5, int r6) {
                r2 = this;
                com.hjq.permissions.PermissionFragment$2$1 r0 = new com.hjq.permissions.PermissionFragment$2$1
                r0.<init>(r2)
                com.hjq.permissions.PermissionFragment$2$2 r1 = new com.hjq.permissions.PermissionFragment$2$2
                r1.<init>(r2, r5, r6, r4)
                com.hjq.permissions.PermissionFragment.launch(r3, r4, r0, r1)
                return
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> r4, boolean r5) {
                r3 = this;
                com.hjq.permissions.PermissionFragment r4 = r3.this$0
                boolean r4 = r4.isAdded()
                if (r4 != 0) goto L9
                return
            L9:
                java.util.ArrayList r4 = r3.val$allPermissions
                int r4 = r4.size()
                int[] r4 = new int[r4]
                r5 = -1
                java.util.Arrays.fill(r4, r5)
                com.hjq.permissions.PermissionFragment r5 = r3.this$0
                int r0 = r3.val$requestCode
                java.util.ArrayList r1 = r3.val$allPermissions
                r2 = 0
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r5.onRequestPermissionsResult(r0, r1, r4)
                return
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> r8, boolean r9) {
                r7 = this;
                if (r9 == 0) goto L28
                com.hjq.permissions.PermissionFragment r8 = r7.this$0
                boolean r8 = r8.isAdded()
                if (r8 != 0) goto Lb
                goto L28
            Lb:
                boolean r8 = com.hjq.permissions.AndroidVersion.isAndroid13()
                if (r8 == 0) goto L14
                r8 = 150(0x96, double:7.4E-322)
                goto L16
            L14:
                r8 = 0
            L16:
                android.app.Activity r2 = r7.val$activity
                java.util.ArrayList r3 = r7.val$secondPermissions
                java.util.ArrayList r4 = r7.val$allPermissions
                int r5 = r7.val$requestCode
                com.hjq.permissions.PermissionFragment$2$$ExternalSyntheticLambda0 r6 = new com.hjq.permissions.PermissionFragment$2$$ExternalSyntheticLambda0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                com.hjq.permissions.PermissionUtils.postDelayed(r6, r8)
            L28:
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.hjq.permissions.PermissionFragment.REQUEST_CODE_ARRAY = r0
            return
    }

    public PermissionFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void launch(android.app.Activity r7, java.util.ArrayList<java.lang.String> r8, com.hjq.permissions.IPermissionInterceptor r9, com.hjq.permissions.OnPermissionCallback r10) {
            com.hjq.permissions.PermissionFragment r0 = new com.hjq.permissions.PermissionFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        La:
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r3 = java.lang.Math.pow(r3, r5)
            int r3 = (int) r3
            int r2 = r2.nextInt(r3)
            java.util.List<java.lang.Integer> r3 = com.hjq.permissions.PermissionFragment.REQUEST_CODE_ARRAY
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto La
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.add(r4)
            java.lang.String r3 = "request_code"
            r1.putInt(r3, r2)
            java.lang.String r2 = "request_permissions"
            r1.putStringArrayList(r2, r8)
            r0.setArguments(r1)
            r8 = 1
            r0.setRetainInstance(r8)
            r0.setRequestFlag(r8)
            r0.setCallBack(r10)
            r0.setInterceptor(r9)
            r0.attachActivity(r7)
            return
    }

    public void attachActivity(android.app.Activity r2) {
            r1 = this;
            android.app.FragmentManager r2 = r2.getFragmentManager()
            android.app.FragmentTransaction r2 = r2.beginTransaction()
            java.lang.String r0 = r1.toString()
            android.app.FragmentTransaction r2 = r2.add(r1, r0)
            r2.commitAllowingStateLoss()
            return
    }

    public void detachActivity(android.app.Activity r1) {
            r0 = this;
            android.app.FragmentManager r1 = r1.getFragmentManager()
            android.app.FragmentTransaction r1 = r1.beginTransaction()
            android.app.FragmentTransaction r1 = r1.remove(r0)
            r1.commitAllowingStateLoss()
            return
    }

    @Override // android.app.Fragment
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            android.app.Activity r2 = r0.getActivity()
            android.os.Bundle r3 = r0.getArguments()
            if (r2 == 0) goto L2e
            if (r3 == 0) goto L2e
            boolean r2 = r0.mDangerousRequest
            if (r2 != 0) goto L2e
            java.lang.String r2 = "request_code"
            int r2 = r3.getInt(r2)
            if (r1 == r2) goto L19
            goto L2e
        L19:
            java.lang.String r1 = "request_permissions"
            java.util.ArrayList r1 = r3.getStringArrayList(r1)
            if (r1 == 0) goto L2e
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L28
            goto L2e
        L28:
            r2 = 1
            r0.mDangerousRequest = r2
            com.hjq.permissions.PermissionUtils.postActivityResult(r1, r0)
        L2e:
            return
    }

    @Override // android.app.Fragment
    public void onAttach(android.content.Context r3) {
            r2 = this;
            super.onAttach(r3)
            android.app.Activity r3 = r2.getActivity()
            if (r3 != 0) goto La
            return
        La:
            int r0 = r3.getRequestedOrientation()
            r2.mScreenOrientation = r0
            r1 = -1
            if (r0 == r1) goto L14
            return
        L14:
            com.hjq.permissions.PermissionUtils.lockActivityOrientation(r3)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            r1.mCallBack = r0
            return
    }

    @Override // android.app.Fragment
    public void onDetach() {
            r3 = this;
            super.onDetach()
            android.app.Activity r0 = r3.getActivity()
            if (r0 == 0) goto L18
            int r1 = r3.mScreenOrientation
            r2 = -1
            if (r1 != r2) goto L18
            int r1 = r0.getRequestedOrientation()
            if (r1 != r2) goto L15
            goto L18
        L15:
            r0.setRequestedOrientation(r2)
        L18:
            return
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int r11, java.lang.String[] r12, int[] r13) {
            r10 = this;
            int r0 = r12.length
            if (r0 == 0) goto L7a
            int r0 = r13.length
            if (r0 != 0) goto L8
            goto L7a
        L8:
            android.os.Bundle r0 = r10.getArguments()
            android.app.Activity r7 = r10.getActivity()
            if (r7 == 0) goto L7a
            if (r0 == 0) goto L7a
            com.hjq.permissions.IPermissionInterceptor r1 = r10.mInterceptor
            if (r1 == 0) goto L7a
            java.lang.String r1 = "request_code"
            int r0 = r0.getInt(r1)
            if (r11 == r0) goto L21
            goto L7a
        L21:
            com.hjq.permissions.OnPermissionCallback r0 = r10.mCallBack
            r1 = 0
            r10.mCallBack = r1
            com.hjq.permissions.IPermissionInterceptor r8 = r10.mInterceptor
            r10.mInterceptor = r1
            com.hjq.permissions.PermissionUtils.optimizePermissionResults(r7, r12, r13)
            java.util.ArrayList r12 = com.hjq.permissions.PermissionUtils.asArrayList(r12)
            java.util.List<java.lang.Integer> r1 = com.hjq.permissions.PermissionFragment.REQUEST_CODE_ARRAY
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1.remove(r11)
            r10.detachActivity(r7)
            java.util.List r11 = com.hjq.permissions.PermissionApi.getGrantedPermissions(r12, r13)
            int r1 = r11.size()
            int r2 = r12.size()
            r9 = 0
            if (r1 != r2) goto L59
            r5 = 1
            r1 = r8
            r2 = r7
            r3 = r12
            r4 = r11
            r6 = r0
            r1.grantedPermissionRequest(r2, r3, r4, r5, r6)
            r8.finishPermissionRequest(r7, r12, r9, r0)
            return
        L59:
            java.util.List r4 = com.hjq.permissions.PermissionApi.getDeniedPermissions(r12, r13)
            boolean r5 = com.hjq.permissions.PermissionApi.isPermissionPermanentDenied(r7, r4)
            r1 = r8
            r2 = r7
            r3 = r12
            r6 = r0
            r1.deniedPermissionRequest(r2, r3, r4, r5, r6)
            boolean r13 = r11.isEmpty()
            if (r13 != 0) goto L77
            r5 = 0
            r1 = r8
            r2 = r7
            r3 = r12
            r4 = r11
            r6 = r0
            r1.grantedPermissionRequest(r2, r3, r4, r5, r6)
        L77:
            r8.finishPermissionRequest(r7, r12, r9, r0)
        L7a:
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            boolean r0 = r1.mRequestFlag
            if (r0 != 0) goto Lf
            android.app.Activity r0 = r1.getActivity()
            r1.detachActivity(r0)
            return
        Lf:
            boolean r0 = r1.mSpecialRequest
            if (r0 == 0) goto L14
            return
        L14:
            r0 = 1
            r1.mSpecialRequest = r0
            r1.requestSpecialPermission()
            return
    }

    public void requestDangerousPermission() {
            r8 = this;
            android.app.Activity r0 = r8.getActivity()
            android.os.Bundle r1 = r8.getArguments()
            if (r0 == 0) goto Lc8
            if (r1 != 0) goto Le
            goto Lc8
        Le:
            java.lang.String r2 = "request_code"
            int r2 = r1.getInt(r2)
            java.lang.String r3 = "request_permissions"
            java.util.ArrayList r1 = r1.getStringArrayList(r3)
            if (r1 == 0) goto Lc8
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L24
            goto Lc8
        L24:
            boolean r3 = com.hjq.permissions.AndroidVersion.isAndroid6()
            if (r3 != 0) goto L54
            int r3 = r1.size()
            int[] r4 = new int[r3]
            r5 = 0
            r6 = r5
        L32:
            if (r6 >= r3) goto L48
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = com.hjq.permissions.PermissionApi.isGrantedPermission(r0, r7)
            if (r7 == 0) goto L42
            r7 = r5
            goto L43
        L42:
            r7 = -1
        L43:
            r4[r6] = r7
            int r6 = r6 + 1
            goto L32
        L48:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r8.onRequestPermissionsResult(r2, r0, r4)
            return
        L54:
            boolean r3 = com.hjq.permissions.AndroidVersion.isAndroid13()
            r4 = 2
            if (r3 == 0) goto L75
            int r3 = r1.size()
            if (r3 < r4) goto L75
            java.lang.String r3 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r5 = com.hjq.permissions.PermissionUtils.containsPermission(r1, r3)
            if (r5 == 0) goto L75
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r4.remove(r3)
            r8.splitTwiceRequestPermission(r0, r1, r4, r2)
            return
        L75:
            boolean r3 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r3 == 0) goto L95
            int r3 = r1.size()
            if (r3 < r4) goto L95
            java.lang.String r3 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r4 = com.hjq.permissions.PermissionUtils.containsPermission(r1, r3)
            if (r4 == 0) goto L95
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r4.remove(r3)
            r8.splitTwiceRequestPermission(r0, r1, r4, r2)
            return
        L95:
            boolean r3 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r3 == 0) goto Lb7
            java.lang.String r3 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r4 = com.hjq.permissions.PermissionUtils.containsPermission(r1, r3)
            if (r4 == 0) goto Lb7
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r4 = com.hjq.permissions.PermissionUtils.containsPermission(r1, r4)
            if (r4 == 0) goto Lb7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r4.remove(r3)
            r8.splitTwiceRequestPermission(r0, r1, r4, r2)
            return
        Lb7:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r8.requestPermissions(r0, r2)
        Lc8:
            return
    }

    public void requestSpecialPermission() {
            r7 = this;
            android.os.Bundle r0 = r7.getArguments()
            android.app.Activity r1 = r7.getActivity()
            if (r0 == 0) goto L63
            if (r1 != 0) goto Ld
            goto L63
        Ld:
            java.lang.String r2 = "request_permissions"
            java.util.ArrayList r0 = r0.getStringArrayList(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L19:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = com.hjq.permissions.PermissionApi.isSpecialPermission(r4)
            if (r5 != 0) goto L2c
            goto L19
        L2c:
            boolean r5 = com.hjq.permissions.PermissionApi.isGrantedPermission(r1, r4)
            if (r5 == 0) goto L33
            goto L19
        L33:
            boolean r5 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r5 != 0) goto L42
            java.lang.String r5 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r5 = com.hjq.permissions.PermissionUtils.equalsPermission(r4, r5)
            if (r5 == 0) goto L42
            goto L19
        L42:
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]
            r5[r2] = r4
            java.util.ArrayList r4 = com.hjq.permissions.PermissionUtils.asArrayList(r5)
            android.content.Intent r4 = com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(r1, r4)
            android.os.Bundle r5 = r7.getArguments()
            java.lang.String r6 = "request_code"
            int r5 = r5.getInt(r6)
            com.hjq.permissions.StartActivityManager.startActivityForResult(r7, r4, r5)
            goto L19
        L5d:
            if (r3 == 0) goto L60
            return
        L60:
            r7.requestDangerousPermission()
        L63:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 != 0) goto L7
            return
        L7:
            r1.requestDangerousPermission()
            return
    }

    public void setCallBack(com.hjq.permissions.OnPermissionCallback r1) {
            r0 = this;
            r0.mCallBack = r1
            return
    }

    public void setInterceptor(com.hjq.permissions.IPermissionInterceptor r1) {
            r0 = this;
            r0.mInterceptor = r1
            return
    }

    public void setRequestFlag(boolean r1) {
            r0 = this;
            r0.mRequestFlag = r1
            return
    }

    public void splitTwiceRequestPermission(android.app.Activity r9, java.util.ArrayList<java.lang.String> r10, java.util.ArrayList<java.lang.String> r11, int r12) {
            r8 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r10)
            java.util.Iterator r0 = r11.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r3.remove(r1)
            goto L9
        L19:
            com.hjq.permissions.PermissionFragment$1 r6 = new com.hjq.permissions.PermissionFragment$1
            r6.<init>(r8)
            com.hjq.permissions.PermissionFragment$2 r7 = new com.hjq.permissions.PermissionFragment$2
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            launch(r9, r11, r6, r7)
            return
    }
}
