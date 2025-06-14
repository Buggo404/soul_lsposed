package com.hjq.permissions;

/* loaded from: classes.dex */
final class PermissionChecker {
    PermissionChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean checkActivityStatus(android.app.Activity r2, boolean r3) {
            r0 = 0
            if (r2 != 0) goto Le
            if (r3 != 0) goto L6
            return r0
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The instance of the context must be an activity object"
            r2.<init>(r3)
            throw r2
        Le:
            boolean r1 = r2.isFinishing()
            if (r1 == 0) goto L1f
            if (r3 != 0) goto L17
            return r0
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "The activity has been finishing, please manually determine the status of the activity"
            r2.<init>(r3)
            throw r2
        L1f:
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid4_2()
            if (r1 == 0) goto L36
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L36
            if (r3 != 0) goto L2e
            return r0
        L2e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "The activity has been destroyed, please manually determine the status of the activity"
            r2.<init>(r3)
            throw r2
        L36:
            r2 = 1
            return r2
    }

    static void checkBodySensorsPermission(java.util.List<java.lang.String> r2) {
            java.lang.String r0 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r2, r0)
            if (r1 != 0) goto L9
            return
        L9:
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r2, r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "android.permission.BODY_SENSORS"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r2, r0)
            if (r0 == 0) goto L18
            goto L20
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Applying for background sensor permissions must contain android.permission.BODY_SENSORS"
            r2.<init>(r0)
            throw r2
        L20:
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r0, r1)
            if (r1 != 0) goto L49
            java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.equalsPermission(r0, r1)
            if (r0 != 0) goto L41
            goto L24
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported"
            r2.<init>(r0)
            throw r2
        L49:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported"
            r2.<init>(r0)
            throw r2
        L51:
            return
    }

    static void checkLocationPermission(java.util.List<java.lang.String> r5) {
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r5, r0)
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = com.hjq.permissions.PermissionUtils.containsPermission(r5, r1)
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            if (r2 == 0) goto L22
            boolean r2 = com.hjq.permissions.PermissionUtils.containsPermission(r5, r3)
            if (r2 == 0) goto L1a
            goto L22
        L1a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION"
            r5.<init>(r0)
            throw r5
        L22:
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r3)
            if (r4 != 0) goto L26
            boolean r4 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r1)
            if (r4 != 0) goto L26
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r0)
            if (r2 == 0) goto L45
            goto L26
        L45:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Because it includes background location permissions, do not apply for permissions unrelated to location"
            r5.<init>(r0)
            throw r5
        L4d:
            return
    }

    static void checkManifestPermission(java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> r1, java.lang.String r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            checkManifestPermission(r1, r2, r0)
            return
    }

    static void checkManifestPermission(java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> r3, java.lang.String r4, int r5) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()
            com.hjq.permissions.AndroidManifestInfo$PermissionInfo r0 = (com.hjq.permissions.AndroidManifestInfo.PermissionInfo) r0
            java.lang.String r1 = r0.name
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L4
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L70
            int r3 = r0.maxSdkVersion
            if (r3 >= r5) goto L6f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The AndroidManifest.xml file <uses-permission android:name=\""
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "\" android:maxSdkVersion=\""
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r1 = "\" /> does not meet the requirements, "
            java.lang.StringBuilder r4 = r4.append(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "the minimum requirement for maxSdkVersion is "
            r3.<init>(r1)
            java.lang.StringBuilder r3 = r3.append(r5)
            goto L5f
        L4e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "please delete the android:maxSdkVersion=\""
            r5.<init>(r1)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = "\" attribute"
            java.lang.StringBuilder r3 = r3.append(r5)
        L5f:
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L6f:
            return
        L70:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\""
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "\" />"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    static void checkManifestPermissions(android.content.Context r8, java.util.List<java.lang.String> r9, com.hjq.permissions.AndroidManifestInfo r10) {
            if (r10 != 0) goto L3
            return
        L3:
            java.util.List<com.hjq.permissions.AndroidManifestInfo$PermissionInfo> r0 = r10.permissionInfoList
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L124
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid7()
            if (r1 == 0) goto L18
            android.content.pm.ApplicationInfo r10 = r8.getApplicationInfo()
            int r10 = r10.minSdkVersion
            goto L23
        L18:
            com.hjq.permissions.AndroidManifestInfo$UsesSdkInfo r1 = r10.usesSdkInfo
            if (r1 == 0) goto L21
            com.hjq.permissions.AndroidManifestInfo$UsesSdkInfo r10 = r10.usesSdkInfo
            int r10 = r10.minSdkVersion
            goto L23
        L21:
            r10 = 23
        L23:
            java.util.Iterator r9 = r9.iterator()
        L27:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L123
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "android.permission.NOTIFICATION_SERVICE"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 != 0) goto L27
            java.lang.String r2 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 != 0) goto L27
            java.lang.String r2 = "android.permission.BIND_VPN_SERVICE"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 != 0) goto L27
            java.lang.String r2 = "android.permission.PICTURE_IN_PICTURE"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto L54
            goto L27
        L54:
            checkManifestPermission(r0, r1)
            java.lang.String r2 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto L65
            java.lang.String r1 = "android.permission.BODY_SENSORS"
            checkManifestPermission(r0, r1)
            goto L27
        L65:
            java.lang.String r2 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            r3 = 31
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r5 = 30
            if (r2 == 0) goto L86
            int r1 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r8)
            if (r1 < r3) goto L82
            checkManifestPermission(r0, r4, r5)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            checkManifestPermission(r0, r1)
            goto L27
        L82:
            checkManifestPermission(r0, r4)
            goto L27
        L86:
            r2 = 33
            java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r10 >= r2) goto Lb9
            java.lang.String r2 = "android.permission.READ_MEDIA_IMAGES"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            r7 = 32
            if (r2 != 0) goto Lb4
            java.lang.String r2 = "android.permission.READ_MEDIA_VIDEO"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 != 0) goto Lb4
            java.lang.String r2 = "android.permission.READ_MEDIA_AUDIO"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto La7
            goto Lb4
        La7:
            java.lang.String r2 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto Lb9
            checkManifestPermission(r0, r4, r7)
            goto L27
        Lb4:
            checkManifestPermission(r0, r6, r7)
            goto L27
        Lb9:
            if (r10 >= r3) goto Le9
            java.lang.String r2 = "android.permission.BLUETOOTH_SCAN"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            java.lang.String r3 = "android.permission.BLUETOOTH_ADMIN"
            if (r2 == 0) goto Lcd
            checkManifestPermission(r0, r3, r5)
            checkManifestPermission(r0, r4, r5)
            goto L27
        Lcd:
            java.lang.String r2 = "android.permission.BLUETOOTH_CONNECT"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto Ldc
            java.lang.String r1 = "android.permission.BLUETOOTH"
            checkManifestPermission(r0, r1, r5)
            goto L27
        Ldc:
            java.lang.String r2 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto Le9
            checkManifestPermission(r0, r3, r5)
            goto L27
        Le9:
            if (r10 >= r5) goto Lff
            java.lang.String r2 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto Lff
            r1 = 29
            checkManifestPermission(r0, r6, r1)
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            checkManifestPermission(r0, r2, r1)
            goto L27
        Lff:
            r2 = 26
            if (r10 >= r2) goto L114
            java.lang.String r2 = "android.permission.READ_PHONE_NUMBERS"
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r2 == 0) goto L114
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            r2 = 25
            checkManifestPermission(r0, r1, r2)
            goto L27
        L114:
            java.lang.String r2 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r1 == 0) goto L27
            java.lang.String r1 = "android.permission.QUERY_ALL_PACKAGES"
            checkManifestPermission(r0, r1)
            goto L27
        L123:
            return
        L124:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "No permissions are registered in the AndroidManifest.xml file"
            r8.<init>(r9)
            throw r8
    }

    static void checkMediaLocationPermission(android.content.Context r7, java.util.List<java.lang.String> r8) {
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r8, r0)
            if (r1 != 0) goto L9
            return
        L9:
            java.util.Iterator r1 = r8.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r5 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r6 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r0)
            if (r6 != 0) goto Ld
            boolean r3 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r3)
            if (r3 != 0) goto Ld
            boolean r3 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r4)
            if (r3 != 0) goto Ld
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r3 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r3)
            if (r3 != 0) goto Ld
            boolean r2 = com.hjq.permissions.PermissionUtils.equalsPermission(r2, r5)
            if (r2 == 0) goto L40
            goto Ld
        L40:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Because it includes access media location permissions, do not apply for permissions unrelated to access media location"
            r7.<init>(r8)
            throw r7
        L48:
            int r7 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r7)
            r0 = 33
            if (r7 < r0) goto L65
            boolean r7 = com.hjq.permissions.PermissionUtils.containsPermission(r8, r3)
            if (r7 != 0) goto L7a
            boolean r7 = com.hjq.permissions.PermissionUtils.containsPermission(r8, r5)
            if (r7 == 0) goto L5d
            goto L7a
        L5d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "You must add android.permission.READ_MEDIA_IMAGES or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights"
            r7.<init>(r8)
            throw r7
        L65:
            boolean r7 = com.hjq.permissions.PermissionUtils.containsPermission(r8, r4)
            if (r7 != 0) goto L7a
            boolean r7 = com.hjq.permissions.PermissionUtils.containsPermission(r8, r5)
            if (r7 == 0) goto L72
            goto L7a
        L72:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights"
            r7.<init>(r8)
            throw r7
        L7a:
            return
    }

    static void checkNearbyDevicesPermission(java.util.List<java.lang.String> r4, com.hjq.permissions.AndroidManifestInfo r5) {
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            java.lang.String r2 = "android.permission.NEARBY_WIFI_DEVICES"
            if (r1 != 0) goto L11
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r2)
            if (r1 != 0) goto L11
            return
        L11:
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r1)
            if (r4 == 0) goto L1a
            return
        L1a:
            if (r5 != 0) goto L1d
            return
        L1d:
            java.util.List<com.hjq.permissions.AndroidManifestInfo$PermissionInfo> r4 = r5.permissionInfoList
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r4.next()
            com.hjq.permissions.AndroidManifestInfo$PermissionInfo r5 = (com.hjq.permissions.AndroidManifestInfo.PermissionInfo) r5
            java.lang.String r1 = r5.name
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r0)
            if (r1 != 0) goto L40
            java.lang.String r1 = r5.name
            boolean r1 = com.hjq.permissions.PermissionUtils.equalsPermission(r1, r2)
            if (r1 != 0) goto L40
            goto L23
        L40:
            boolean r1 = r5.neverForLocation()
            if (r1 != 0) goto L23
            int r4 = r5.maxSdkVersion
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r1 = "\" "
            if (r4 == r0) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "android:maxSdkVersion=\""
            r4.<init>(r0)
            int r0 = r5.maxSdkVersion
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            goto L67
        L65:
            java.lang.String r4 = ""
        L67:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "If your app doesn't use "
            r2.<init>(r3)
            java.lang.String r3 = r5.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " to get physical location, please change the <uses-permission android:name=\""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "/> node in the manifest file to <uses-permission android:name=\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.name
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\" android:usesPermissionFlags=\"neverForLocation\" "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "/> node, if your app need use "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = r5.name
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " to get physical location, also need to add android.permission.ACCESS_FINE_LOCATION permissions"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        Lba:
            return
    }

    static void checkNotificationListenerPermission(java.util.List<java.lang.String> r2, com.hjq.permissions.AndroidManifestInfo r3) {
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r2 = com.hjq.permissions.PermissionUtils.containsPermission(r2, r0)
            if (r2 != 0) goto L9
            return
        L9:
            if (r3 != 0) goto Lc
            return
        Lc:
            java.util.List<com.hjq.permissions.AndroidManifestInfo$ServiceInfo> r2 = r3.serviceInfoList
            r3 = 0
        Lf:
            int r1 = r2.size()
            if (r3 >= r1) goto L27
            java.lang.Object r1 = r2.get(r3)
            com.hjq.permissions.AndroidManifestInfo$ServiceInfo r1 = (com.hjq.permissions.AndroidManifestInfo.ServiceInfo) r1
            java.lang.String r1 = r1.permission
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto L24
            return
        L24:
            int r3 = r3 + 1
            goto Lf
        L27:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "No service registered permission attribute, please register <service android:permission=\"android.permission.BIND_NOTIFICATION_LISTENER_SERVICE\" > in AndroidManifest.xml"
            r2.<init>(r3)
            throw r2
    }

    static boolean checkPermissionArgument(java.util.List<java.lang.String> r7, boolean r8) {
            r0 = 0
            if (r7 == 0) goto L7d
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb
            goto L7d
        Lb:
            int r1 = com.hjq.permissions.AndroidVersion.getAndroidVersionCode()
            r2 = 33
            r3 = 1
            if (r1 <= r2) goto L15
            return r3
        L15:
            if (r8 == 0) goto L7c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Class<com.hjq.permissions.Permission> r1 = com.hjq.permissions.Permission.class
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
            int r2 = r1.length
            if (r2 != 0) goto L26
            return r3
        L26:
            int r2 = r1.length
        L27:
            if (r0 >= r2) goto L4a
            r4 = r1[r0]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class r6 = r4.getType()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L38
            goto L47
        L38:
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.IllegalAccessException -> L43
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalAccessException -> L43
            r8.add(r4)     // Catch: java.lang.IllegalAccessException -> L43
            goto L47
        L43:
            r4 = move-exception
            r4.printStackTrace()
        L47:
            int r0 = r0 + 1
            goto L27
        L4a:
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r8, r0)
            if (r1 == 0) goto L61
            goto L4e
        L61:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "The "
            r8.<init>(r1)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = " is not a dangerous permission or special permission, please do not request dynamically"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L7c:
            return r3
        L7d:
            if (r8 != 0) goto L80
            return r0
        L80:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "The requested permission cannot be empty"
            r7.<init>(r8)
            throw r7
    }

    static void checkPictureInPicturePermission(android.app.Activity r1, java.util.List<java.lang.String> r2, com.hjq.permissions.AndroidManifestInfo r3) {
            java.lang.String r0 = "android.permission.PICTURE_IN_PICTURE"
            boolean r2 = com.hjq.permissions.PermissionUtils.containsPermission(r2, r0)
            if (r2 != 0) goto L9
            return
        L9:
            if (r3 != 0) goto Lc
            return
        Lc:
            java.util.List<com.hjq.permissions.AndroidManifestInfo$ActivityInfo> r2 = r3.activityInfoList
            r3 = 0
        Lf:
            int r0 = r2.size()
            if (r3 >= r0) goto L23
            java.lang.Object r0 = r2.get(r3)
            com.hjq.permissions.AndroidManifestInfo$ActivityInfo r0 = (com.hjq.permissions.AndroidManifestInfo.ActivityInfo) r0
            boolean r0 = r0.supportsPictureInPicture
            if (r0 == 0) goto L20
            return
        L20:
            int r3 = r3 + 1
            goto Lf
        L23:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r3 = ""
            java.lang.String r1 = r2.replace(r1, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "No activity registered supportsPictureInPicture attribute, please register \n<activity android:name=\""
            r3.<init>(r0)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = "\" android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    static void checkStoragePermission(android.content.Context r5, java.util.List<java.lang.String> r6, com.hjq.permissions.AndroidManifestInfo r7) {
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r0)
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r3 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            if (r1 != 0) goto L31
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "android.permission.READ_MEDIA_AUDIO"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r1)
            if (r1 != 0) goto L31
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r3)
            if (r1 != 0) goto L31
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r2)
            if (r1 != 0) goto L31
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r1)
            if (r1 != 0) goto L31
            return
        L31:
            int r1 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r5)
            r4 = 33
            if (r1 < r4) goto L48
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r2)
            if (r1 != 0) goto L40
            goto L48
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO instead of android.permission.READ_EXTERNAL_STORAGE"
            r5.<init>(r6)
            throw r5
        L48:
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r0)
            if (r0 == 0) goto L4f
            return
        L4f:
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r0)
            if (r0 == 0) goto L58
            return
        L58:
            if (r7 != 0) goto L5b
            return
        L5b:
            com.hjq.permissions.AndroidManifestInfo$ApplicationInfo r7 = r7.applicationInfo
            if (r7 != 0) goto L60
            return
        L60:
            boolean r0 = com.hjq.permissions.PermissionUtils.isScopedStorage(r5)
            int r5 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r5)
            boolean r7 = r7.requestLegacyExternalStorage
            r1 = 29
            if (r5 < r1) goto L81
            if (r7 != 0) goto L81
            boolean r7 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r3)
            if (r7 != 0) goto L79
            if (r0 == 0) goto L79
            goto L81
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version"
            r5.<init>(r6)
            throw r5
        L81:
            r7 = 30
            if (r5 < r7) goto L96
            boolean r5 = com.hjq.permissions.PermissionUtils.containsPermission(r6, r3)
            if (r5 != 0) goto L96
            if (r0 == 0) goto L8e
            goto L96
        L8e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission"
            r5.<init>(r6)
            throw r5
        L96:
            return
    }

    static void checkTargetSdkVersion(android.content.Context r2, java.util.List<java.lang.String> r3) {
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 == 0) goto L32
            goto Laf
        L32:
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Lac
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Lac
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto Lac
            java.lang.String r0 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 == 0) goto L53
            goto Lac
        L53:
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 == 0) goto L5e
            r3 = 30
            goto Lb1
        L5e:
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 == 0) goto L77
            goto La9
        L77:
            java.lang.String r0 = "android.permission.ACCEPT_HANDOVER"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 == 0) goto L82
            r3 = 28
            goto Lb1
        L82:
            java.lang.String r0 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto La6
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto La6
            java.lang.String r0 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r0 != 0) goto La6
            java.lang.String r0 = "android.permission.PICTURE_IN_PICTURE"
            boolean r3 = com.hjq.permissions.PermissionUtils.containsPermission(r3, r0)
            if (r3 == 0) goto La3
            goto La6
        La3:
            r3 = 23
            goto Lb1
        La6:
            r3 = 26
            goto Lb1
        La9:
            r3 = 29
            goto Lb1
        Lac:
            r3 = 31
            goto Lb1
        Laf:
            r3 = 33
        Lb1:
            int r2 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r2)
            if (r2 < r3) goto Lb8
            return
        Lb8:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The targetSdkVersion SDK must be "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permissions"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static void optimizeDeprecatedPermission(java.util.List<java.lang.String> r4) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r0 != 0) goto L4f
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "android.permission.NOTIFICATION_SERVICE"
            boolean r3 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r3 != 0) goto L1d
            r4.add(r0)
        L1d:
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto L2e
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r1)
            if (r0 != 0) goto L2e
            r4.add(r1)
        L2e:
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto L4f
        L46:
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r2)
            if (r0 != 0) goto L4f
            r4.add(r2)
        L4f:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid12()
            if (r0 != 0) goto L66
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto L66
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r1)
            if (r0 != 0) goto L66
            r4.add(r1)
        L66:
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto L91
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r2)
            if (r0 != 0) goto L89
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r1 != 0) goto L89
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r1 != 0) goto L91
            r4.add(r2)
            r4.add(r0)
            goto L91
        L89:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions"
            r4.<init>(r0)
            throw r4
        L91:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r0 != 0) goto Laa
            java.lang.String r0 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto Laa
            java.lang.String r0 = "android.permission.BODY_SENSORS"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r1 != 0) goto Laa
            r4.add(r0)
        Laa:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid8()
            if (r0 != 0) goto Lc3
            java.lang.String r0 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.hjq.permissions.PermissionUtils.containsPermission(r4, r0)
            if (r1 != 0) goto Lc3
            r4.add(r0)
        Lc3:
            return
    }
}
