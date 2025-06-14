package com.hjq.permissions;

/* loaded from: classes.dex */
public final class PermissionPageFragment extends android.app.Fragment implements java.lang.Runnable {
    private static final java.lang.String REQUEST_PERMISSIONS = "request_permissions";
    private com.hjq.permissions.OnPermissionPageCallback mCallBack;
    private boolean mRequestFlag;
    private boolean mStartActivityFlag;

    public PermissionPageFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginRequest(android.app.Activity r3, java.util.ArrayList<java.lang.String> r4, com.hjq.permissions.OnPermissionPageCallback r5) {
            com.hjq.permissions.PermissionPageFragment r0 = new com.hjq.permissions.PermissionPageFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "request_permissions"
            r1.putStringArrayList(r2, r4)
            r0.setArguments(r1)
            r4 = 1
            r0.setRetainInstance(r4)
            r0.setRequestFlag(r4)
            r0.setCallBack(r5)
            r0.attachActivity(r3)
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
            r2 = 1025(0x401, float:1.436E-42)
            if (r1 == r2) goto L5
            return
        L5:
            android.app.Activity r1 = r0.getActivity()
            android.os.Bundle r2 = r0.getArguments()
            if (r1 == 0) goto L24
            if (r2 != 0) goto L12
            goto L24
        L12:
            java.lang.String r1 = "request_permissions"
            java.util.ArrayList r1 = r2.getStringArrayList(r1)
            if (r1 == 0) goto L24
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L21
            goto L24
        L21:
            com.hjq.permissions.PermissionUtils.postActivityResult(r1, r0)
        L24:
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r2 = this;
            super.onResume()
            boolean r0 = r2.mRequestFlag
            if (r0 != 0) goto Lf
            android.app.Activity r0 = r2.getActivity()
            r2.detachActivity(r0)
            return
        Lf:
            boolean r0 = r2.mStartActivityFlag
            if (r0 == 0) goto L14
            return
        L14:
            r0 = 1
            r2.mStartActivityFlag = r0
            android.os.Bundle r0 = r2.getArguments()
            android.app.Activity r1 = r2.getActivity()
            if (r0 == 0) goto L37
            if (r1 != 0) goto L24
            goto L37
        L24:
            java.lang.String r1 = "request_permissions"
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            android.app.Activity r1 = r2.getActivity()
            android.content.Intent r0 = com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(r1, r0)
            r1 = 1025(0x401, float:1.436E-42)
            com.hjq.permissions.StartActivityManager.startActivityForResult(r2, r0, r1)
        L37:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            boolean r0 = r4.isAdded()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.Activity r0 = r4.getActivity()
            if (r0 != 0) goto Le
            return
        Le:
            com.hjq.permissions.OnPermissionPageCallback r1 = r4.mCallBack
            r2 = 0
            r4.mCallBack = r2
            if (r1 != 0) goto L19
            r4.detachActivity(r0)
            return
        L19:
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r3 = "request_permissions"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            java.util.List r3 = com.hjq.permissions.PermissionApi.getGrantedPermissions(r0, r2)
            int r3 = r3.size()
            int r2 = r2.size()
            if (r3 != r2) goto L35
            r1.onGranted()
            goto L38
        L35:
            r1.onDenied()
        L38:
            r4.detachActivity(r0)
            return
    }

    public void setCallBack(com.hjq.permissions.OnPermissionPageCallback r1) {
            r0 = this;
            r0.mCallBack = r1
            return
    }

    public void setRequestFlag(boolean r1) {
            r0 = this;
            r0.mRequestFlag = r1
            return
    }
}
