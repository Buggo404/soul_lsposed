package com.hjq.permissions;

/* loaded from: classes.dex */
final class PermissionUtils {
    private static final android.os.Handler HANDLER = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.hjq.permissions.PermissionUtils.HANDLER = r0
            return
    }

    PermissionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean areActivityIntent(android.content.Context r2, android.content.Intent r3) {
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r0 == 0) goto L20
            r0 = 65536(0x10000, double:3.2379E-319)
            android.content.pm.PackageManager$ResolveInfoFlags r0 = android.content.pm.PackageManager.ResolveInfoFlags.of(r0)
            java.util.List r2 = r2.queryIntentActivities(r3, r0)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            return r2
        L20:
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r2.queryIntentActivities(r3, r0)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            return r2
    }

    static <T> java.util.ArrayList<T> asArrayList(T... r4) {
            r0 = 0
            if (r4 == 0) goto L5
            int r1 = r4.length
            goto L6
        L5:
            r1 = r0
        L6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            if (r4 == 0) goto L1c
            int r1 = r4.length
            if (r1 != 0) goto L11
            goto L1c
        L11:
            int r1 = r4.length
        L12:
            if (r0 >= r1) goto L1c
            r3 = r4[r0]
            r2.add(r3)
            int r0 = r0 + 1
            goto L12
        L1c:
            return r2
    }

    @java.lang.SafeVarargs
    static <T> java.util.ArrayList<T> asArrayLists(T[]... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L1b
            int r1 = r4.length
            if (r1 != 0) goto Lb
            goto L1b
        Lb:
            int r1 = r4.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            r3 = r4[r2]
            java.util.ArrayList r3 = asArrayList(r3)
            r0.addAll(r3)
            int r2 = r2 + 1
            goto Ld
        L1b:
            return r0
    }

    static boolean checkOpNoThrow(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            boolean r1 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r1 == 0) goto L1d
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()
            int r1 = r1.uid
            java.lang.String r2 = r2.getPackageName()
            int r2 = r0.unsafeCheckOpNoThrow(r3, r1, r2)
            goto L2b
        L1d:
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()
            int r1 = r1.uid
            java.lang.String r2 = r2.getPackageName()
            int r2 = r0.checkOpNoThrow(r3, r1, r2)
        L2b:
            if (r2 != 0) goto L2f
            r2 = 1
            goto L30
        L2f:
            r2 = 0
        L30:
            return r2
    }

    static boolean checkOpNoThrow(android.content.Context r9, java.lang.String r10, int r11) {
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            android.content.pm.ApplicationInfo r1 = r9.getApplicationInfo()
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r9 = r9.getPackageName()
            int r1 = r1.uid
            r2 = 1
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Field r10 = r3.getDeclaredField(r10)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.lang.Object r10 = r10.get(r4)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            int r11 = r10.intValue()     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            goto L36
        L32:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
        L36:
            java.lang.String r10 = "checkOpNoThrow"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            r5[r2] = r6     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8 = 2
            r5[r8] = r6     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.reflect.Method r10 = r3.getMethod(r10, r5)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            r3[r7] = r11     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            r3[r2] = r11     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            r3[r8] = r9     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Object r9 = r10.invoke(r0, r3)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b java.lang.Throwable -> L6b
            if (r9 != 0) goto L6a
            goto L6b
        L6a:
            r2 = r7
        L6b:
            return r2
    }

    static boolean checkSelfPermission(android.content.Context r0, java.lang.String r1) {
            int r0 = r0.checkSelfPermission(r1)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean containsPermission(java.util.Collection<java.lang.String> r2, java.lang.String r3) {
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = equalsPermission(r0, r3)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        L20:
            return r1
    }

    static boolean equalsPermission(java.lang.String r5, java.lang.String r6) {
            int r0 = r5.length()
            int r1 = r6.length()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r1 = 1
            int r0 = r0 - r1
        Le:
            if (r0 < 0) goto L1e
            char r3 = r5.charAt(r0)
            char r4 = r6.charAt(r0)
            if (r3 == r4) goto L1b
            return r2
        L1b:
            int r0 = r0 + (-1)
            goto Le
        L1e:
            return r1
    }

    static android.app.Activity findActivity(android.content.Context r2) {
        L0:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        L7:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            r1 = 0
            if (r0 == 0) goto L14
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            if (r2 != 0) goto L0
        L14:
            return r1
    }

    static int findApkPathCookie(android.content.Context r8, java.lang.String r9) {
            android.content.res.AssetManager r0 = r8.getAssets()
            r1 = 0
            int r2 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            r3 = 28
            r4 = 1
            if (r2 < r3) goto L62
            int r2 = com.hjq.permissions.AndroidVersion.getAndroidVersionCode()     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            if (r2 < r3) goto L62
            int r2 = com.hjq.permissions.AndroidVersion.getAndroidVersionCode()     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            r3 = 30
            if (r2 >= r3) goto L62
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r3 = "getDeclaredMethod"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Class<java.lang.Class[]> r7 = java.lang.Class[].class
            r6[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            r2.setAccessible(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Class<android.content.res.AssetManager> r3 = android.content.res.AssetManager.class
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.String r6 = "findCookieForPath"
            r5[r1] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            r5[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            if (r2 == 0) goto L62
            r2.setAccessible(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            r3[r1] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Object r8 = r2.invoke(r8, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            if (r8 == 0) goto L62
            int r8 = r8.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            return r8
        L62:
            java.lang.Class r8 = r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.String r2 = "addAssetPath"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r1] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            r2[r1] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Object r8 = r8.invoke(r0, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            if (r8 == 0) goto L91
            int r8 = r8.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L88 java.lang.NoSuchMethodException -> L8d
            return r8
        L83:
            r8 = move-exception
            r8.printStackTrace()
            goto L91
        L88:
            r8 = move-exception
            r8.printStackTrace()
            goto L91
        L8d:
            r8 = move-exception
            r8.printStackTrace()
        L91:
            return r1
    }

    static com.hjq.permissions.AndroidManifestInfo getAndroidManifestInfo(android.content.Context r3) {
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            int r0 = findApkPathCookie(r3, r0)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            com.hjq.permissions.AndroidManifestInfo r0 = com.hjq.permissions.AndroidManifestParser.parseAndroidManifest(r3, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> L25 java.io.IOException -> L2a
            java.lang.String r3 = r3.getPackageName()     // Catch: org.xmlpull.v1.XmlPullParserException -> L1f java.io.IOException -> L22
            java.lang.String r2 = r0.packageName     // Catch: org.xmlpull.v1.XmlPullParserException -> L1f java.io.IOException -> L22
            boolean r3 = android.text.TextUtils.equals(r3, r2)     // Catch: org.xmlpull.v1.XmlPullParserException -> L1f java.io.IOException -> L22
            if (r3 != 0) goto L2f
            return r1
        L1f:
            r3 = move-exception
            r1 = r0
            goto L26
        L22:
            r3 = move-exception
            r1 = r0
            goto L2b
        L25:
            r3 = move-exception
        L26:
            r3.printStackTrace()
            goto L2e
        L2a:
            r3 = move-exception
        L2b:
            r3.printStackTrace()
        L2e:
            r0 = r1
        L2f:
            return r0
    }

    static android.net.Uri getPackageNameUri(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "package:"
            r0.<init>(r1)
            java.lang.String r2 = r2.getPackageName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    static android.content.Intent getSmartPermissionIntent(android.content.Context r3, java.util.List<java.lang.String> r4) {
            if (r4 == 0) goto L83
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            goto L83
        La:
            boolean r0 = com.hjq.permissions.PermissionApi.containsSpecialPermission(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L28
            int r0 = r4.size()
            if (r0 != r2) goto L23
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = com.hjq.permissions.PermissionApi.getPermissionIntent(r3, r4)
            return r3
        L23:
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r3)
            return r3
        L28:
            int r0 = r4.size()
            if (r0 == r2) goto L78
            r1 = 2
            if (r0 == r1) goto L58
            r1 = 3
            if (r0 == r1) goto L35
            goto L73
        L35:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 == 0) goto L73
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r1 = containsPermission(r4, r0)
            if (r1 == 0) goto L73
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r1 = containsPermission(r4, r1)
            if (r1 == 0) goto L73
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r4 = containsPermission(r4, r1)
            if (r4 == 0) goto L73
            android.content.Intent r3 = com.hjq.permissions.PermissionApi.getPermissionIntent(r3, r0)
            return r3
        L58:
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r0 != 0) goto L73
            java.lang.String r0 = "android.permission.NOTIFICATION_SERVICE"
            boolean r1 = containsPermission(r4, r0)
            if (r1 == 0) goto L73
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r4 = containsPermission(r4, r1)
            if (r4 == 0) goto L73
            android.content.Intent r3 = com.hjq.permissions.PermissionApi.getPermissionIntent(r3, r0)
            return r3
        L73:
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r3)
            return r3
        L78:
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = com.hjq.permissions.PermissionApi.getPermissionIntent(r3, r4)
            return r3
        L83:
            android.content.Intent r3 = com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(r3)
            return r3
    }

    static boolean isActivityReverse(android.app.Activity r1) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 == 0) goto Lf
            android.view.Display r1 = r1.getDisplay()
            int r1 = r1.getRotation()
            goto L1b
        Lf:
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
        L1b:
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L23
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    static boolean isDebugMode(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static boolean isScopedStorage(android.content.Context r3) {
            java.lang.String r0 = "ScopedStorage"
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            if (r3 == 0) goto L2b
            boolean r1 = r3.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            if (r1 == 0) goto L2b
            java.lang.Object r3 = r3.get(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            return r3
        L27:
            r3 = move-exception
            r3.printStackTrace()
        L2b:
            r3 = 0
            return r3
    }

    static boolean isSpecialPermission(java.lang.String r1) {
            java.lang.String r0 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.NOTIFICATION_SERVICE"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.PACKAGE_USAGE_STATS"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.BIND_VPN_SERVICE"
            boolean r0 = equalsPermission(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "android.permission.PICTURE_IN_PICTURE"
            boolean r1 = equalsPermission(r1, r0)
            if (r1 == 0) goto L61
            goto L63
        L61:
            r1 = 0
            goto L64
        L63:
            r1 = 1
        L64:
            return r1
    }

    static void lockActivityOrientation(android.app.Activity r2) {
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.IllegalStateException -> L2b
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.IllegalStateException -> L2b
            int r0 = r0.orientation     // Catch: java.lang.IllegalStateException -> L2b
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 == r1) goto L11
            goto L2f
        L11:
            boolean r0 = isActivityReverse(r2)     // Catch: java.lang.IllegalStateException -> L2b
            if (r0 == 0) goto L1a
            r0 = 8
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r2.setRequestedOrientation(r0)     // Catch: java.lang.IllegalStateException -> L2b
            goto L2f
        L1f:
            boolean r0 = isActivityReverse(r2)     // Catch: java.lang.IllegalStateException -> L2b
            if (r0 == 0) goto L27
            r1 = 9
        L27:
            r2.setRequestedOrientation(r1)     // Catch: java.lang.IllegalStateException -> L2b
            goto L2f
        L2b:
            r2 = move-exception
            r2.printStackTrace()
        L2f:
            return
    }

    static void optimizePermissionResults(android.app.Activity r7, java.lang.String[] r8, int[] r9) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto Ld9
            r2 = r8[r1]
            boolean r3 = com.hjq.permissions.PermissionApi.isSpecialPermission(r2)
            boolean r4 = com.hjq.permissions.AndroidVersion.isAndroid13()
            r5 = 1
            if (r4 == 0) goto L23
            int r4 = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(r7)
            r6 = 33
            if (r4 < r6) goto L23
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto L23
            r3 = r5
        L23:
            boolean r4 = com.hjq.permissions.AndroidVersion.isAndroid13()
            if (r4 != 0) goto L5a
            java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "android.permission.READ_MEDIA_IMAGES"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "android.permission.READ_MEDIA_VIDEO"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "android.permission.READ_MEDIA_AUDIO"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto L5a
        L59:
            r3 = r5
        L5a:
            boolean r4 = com.hjq.permissions.AndroidVersion.isAndroid12()
            if (r4 != 0) goto L79
            java.lang.String r4 = "android.permission.BLUETOOTH_SCAN"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L78
            java.lang.String r4 = "android.permission.BLUETOOTH_CONNECT"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L78
            java.lang.String r4 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto L79
        L78:
            r3 = r5
        L79:
            boolean r4 = com.hjq.permissions.AndroidVersion.isAndroid10()
            if (r4 != 0) goto L98
            java.lang.String r4 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L97
            java.lang.String r4 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto L97
            java.lang.String r4 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto L98
        L97:
            r3 = r5
        L98:
            boolean r4 = com.hjq.permissions.AndroidVersion.isAndroid9()
            if (r4 != 0) goto La7
            java.lang.String r4 = "android.permission.ACCEPT_HANDOVER"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto La7
            r3 = r5
        La7:
            boolean r4 = com.hjq.permissions.AndroidVersion.isAndroid8()
            if (r4 != 0) goto Lbe
            java.lang.String r4 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 != 0) goto Lbd
            java.lang.String r4 = "android.permission.READ_PHONE_NUMBERS"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto Lbe
        Lbd:
            r3 = r5
        Lbe:
            java.lang.String r4 = "com.android.permission.GET_INSTALLED_APPS"
            boolean r4 = equalsPermission(r2, r4)
            if (r4 == 0) goto Lc7
            goto Lc8
        Lc7:
            r5 = r3
        Lc8:
            if (r5 == 0) goto Ld5
            boolean r2 = com.hjq.permissions.PermissionApi.isGrantedPermission(r7, r2)
            if (r2 == 0) goto Ld2
            r2 = r0
            goto Ld3
        Ld2:
            r2 = -1
        Ld3:
            r9[r1] = r2
        Ld5:
            int r1 = r1 + 1
            goto L2
        Ld9:
            return
    }

    static void postActivityResult(java.util.List<java.lang.String> r5, java.lang.Runnable r6) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            r1 = 300(0x12c, double:1.48E-321)
            if (r0 == 0) goto Lb
            r3 = 200(0xc8, double:9.9E-322)
            goto Lc
        Lb:
            r3 = r1
        Lc:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isEmui()
            if (r0 != 0) goto L32
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isHarmonyOs()
            if (r0 == 0) goto L19
            goto L32
        L19:
            boolean r0 = com.hjq.permissions.PhoneRomUtils.isMiui()
            if (r0 == 0) goto L30
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid11()
            if (r0 == 0) goto L30
            java.lang.String r0 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r5 = containsPermission(r5, r0)
            if (r5 == 0) goto L30
            r1 = 1000(0x3e8, double:4.94E-321)
            goto L3b
        L30:
            r1 = r3
            goto L3b
        L32:
            boolean r5 = com.hjq.permissions.AndroidVersion.isAndroid8()
            if (r5 == 0) goto L39
            goto L3b
        L39:
            r1 = 500(0x1f4, double:2.47E-321)
        L3b:
            postDelayed(r6, r1)
            return
    }

    static void postDelayed(java.lang.Runnable r1, long r2) {
            android.os.Handler r0 = com.hjq.permissions.PermissionUtils.HANDLER
            r0.postDelayed(r1, r2)
            return
    }

    static boolean shouldShowRequestPermissionRationale(android.app.Activity r7, java.lang.String r8) {
            int r0 = com.hjq.permissions.AndroidVersion.getAndroidVersionCode()
            r1 = 31
            if (r0 != r1) goto L37
            android.app.Application r0 = r7.getApplication()     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.Class<android.content.pm.PackageManager> r1 = android.content.pm.PackageManager.class
            java.lang.String r2 = "shouldShowRequestPermissionRationale"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            r2[r6] = r8     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            boolean r7 = r0.booleanValue()     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.NoSuchMethodException -> L33
            return r7
        L2f:
            r0 = move-exception
            goto L34
        L31:
            r0 = move-exception
            goto L34
        L33:
            r0 = move-exception
        L34:
            r0.printStackTrace()
        L37:
            boolean r7 = r7.shouldShowRequestPermissionRationale(r8)
            return r7
    }
}
