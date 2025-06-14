package com.hjq.permissions;

/* loaded from: classes.dex */
final class PermissionApi {
    private static final com.hjq.permissions.PermissionDelegate DELEGATE = null;

    static {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r0 == 0) goto Lf
            com.hjq.permissions.PermissionDelegateImplV33 r0 = new com.hjq.permissions.PermissionDelegateImplV33
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        Lf:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid12()
            if (r0 == 0) goto L1e
            com.hjq.permissions.PermissionDelegateImplV31 r0 = new com.hjq.permissions.PermissionDelegateImplV31
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L1e:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 == 0) goto L2d
            com.hjq.permissions.PermissionDelegateImplV30 r0 = new com.hjq.permissions.PermissionDelegateImplV30
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L2d:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r0 == 0) goto L3b
            com.hjq.permissions.PermissionDelegateImplV29 r0 = new com.hjq.permissions.PermissionDelegateImplV29
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L3b:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid9()
            if (r0 == 0) goto L49
            com.hjq.permissions.PermissionDelegateImplV28 r0 = new com.hjq.permissions.PermissionDelegateImplV28
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L49:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid8()
            if (r0 == 0) goto L57
            com.hjq.permissions.PermissionDelegateImplV26 r0 = new com.hjq.permissions.PermissionDelegateImplV26
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L57:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid6()
            if (r0 == 0) goto L65
            com.hjq.permissions.PermissionDelegateImplV23 r0 = new com.hjq.permissions.PermissionDelegateImplV23
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L65:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid5()
            if (r0 == 0) goto L73
            com.hjq.permissions.PermissionDelegateImplV21 r0 = new com.hjq.permissions.PermissionDelegateImplV21
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L73:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_4()
            if (r0 == 0) goto L81
            com.hjq.permissions.PermissionDelegateImplV19 r0 = new com.hjq.permissions.PermissionDelegateImplV19
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L81:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid4_3()
            if (r0 == 0) goto L8f
            com.hjq.permissions.PermissionDelegateImplV18 r0 = new com.hjq.permissions.PermissionDelegateImplV18
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
            goto L96
        L8f:
            com.hjq.permissions.PermissionDelegateImplV14 r0 = new com.hjq.permissions.PermissionDelegateImplV14
            r0.<init>()
            com.hjq.permissions.PermissionApi.DELEGATE = r0
        L96:
            return
    }

    PermissionApi() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean containsSpecialPermission(java.util.List<java.lang.String> r2) {
            r0 = 0
            if (r2 == 0) goto L22
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L22
        La:
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = isSpecialPermission(r1)
            if (r1 == 0) goto Le
            r2 = 1
            return r2
        L22:
            return r0
    }

    static java.util.List<java.lang.String> getDeniedPermissions(android.content.Context r3, java.util.List<java.lang.String> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = isGrantedPermission(r3, r1)
            if (r2 != 0) goto Ld
            r0.add(r1)
            goto Ld
        L23:
            return r0
    }

    static java.util.List<java.lang.String> getDeniedPermissions(java.util.List<java.lang.String> r4, int[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L18
            r2 = r5[r1]
            r3 = -1
            if (r2 != r3) goto L15
            java.lang.Object r2 = r4.get(r1)
            r0.add(r2)
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            return r0
    }

    static java.util.List<java.lang.String> getGrantedPermissions(android.content.Context r3, java.util.List<java.lang.String> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = isGrantedPermission(r3, r1)
            if (r2 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L23:
            return r0
    }

    static java.util.List<java.lang.String> getGrantedPermissions(java.util.List<java.lang.String> r3, int[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            r2 = r4[r1]
            if (r2 != 0) goto L14
            java.lang.Object r2 = r3.get(r1)
            r0.add(r2)
        L14:
            int r1 = r1 + 1
            goto L6
        L17:
            return r0
    }

    static android.content.Intent getPermissionIntent(android.content.Context r1, java.lang.String r2) {
            com.hjq.permissions.PermissionDelegate r0 = com.hjq.permissions.PermissionApi.DELEGATE
            android.content.Intent r1 = r0.getPermissionIntent(r1, r2)
            return r1
    }

    static boolean isGrantedPermission(android.content.Context r1, java.lang.String r2) {
            com.hjq.permissions.PermissionDelegate r0 = com.hjq.permissions.PermissionApi.DELEGATE
            boolean r1 = r0.isGrantedPermission(r1, r2)
            return r1
    }

    static boolean isGrantedPermissions(android.content.Context r2, java.util.List<java.lang.String> r3) {
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = isGrantedPermission(r2, r0)
            if (r0 != 0) goto Lc
            return r1
        L1f:
            r2 = 1
            return r2
    }

    static boolean isPermissionPermanentDenied(android.app.Activity r1, java.lang.String r2) {
            com.hjq.permissions.PermissionDelegate r0 = com.hjq.permissions.PermissionApi.DELEGATE
            boolean r1 = r0.isPermissionPermanentDenied(r1, r2)
            return r1
    }

    static boolean isPermissionPermanentDenied(android.app.Activity r1, java.util.List<java.lang.String> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = isPermissionPermanentDenied(r1, r0)
            if (r0 == 0) goto L4
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    static boolean isSpecialPermission(java.lang.String r0) {
            boolean r0 = com.hjq.permissions.PermissionUtils.isSpecialPermission(r0)
            return r0
    }
}
