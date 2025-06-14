package com.usidqw.qwerklj.Tools;

/* loaded from: classes.dex */
public class Fun extends com.usidqw.qwerklj.Base.HookFun {
    public static java.util.HashMap<java.lang.String, java.lang.Class<?>> cacheClass;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.usidqw.qwerklj.Tools.Fun.cacheClass = r0
            return
    }

    public Fun() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: R */
    public static java.lang.Object m27R(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
            java.lang.reflect.Member r0 = r2.method     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
            java.lang.Object r1 = r2.thisObject     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
            java.lang.Object[] r2 = r2.args     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
            java.lang.Object r2 = de.robv.android.xposed.XposedBridge.invokeOriginalMethod(r0, r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
            return r2
        Lb:
            r2 = move-exception
            goto Le
        Ld:
            r2 = move-exception
        Le:
            r2.printStackTrace()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            msg(r0)
            r2 = 0
            return r2
    }

    public static void copyToClipboard(java.lang.Object r1) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r0 = r0.getActivity()
            if (r0 == 0) goto L15
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r0 = r0.getActivity()
            java.lang.String r1 = r1.toString()
            com.usidqw.qwerklj.Utils.Tools.copyToClipboard(r0, r1)
        L15:
            return
    }

    public static void copyToClipboard(java.lang.Object r1, boolean r2) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r0 = r0.getActivity()
            if (r0 == 0) goto L1a
            if (r2 == 0) goto L17
            com.google.gson.Gson r2 = new com.google.gson.Gson
            r2.<init>()
            java.lang.String r1 = r2.toJson(r1)
            copyToClipboard(r1)
            goto L1a
        L17:
            copyToClipboard(r1)
        L1a:
            return
    }

    public static int getResourcesId(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = r2.trim()
            r0 = 0
            int r1 = getResourcesId(r1, r2, r0)
            return r1
    }

    public static int getResourcesId(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L10
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Tools.Static.App
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = r3.getLpparam()
            android.content.pm.ApplicationInfo r3 = r3.appInfo
            java.lang.String r3 = r3.packageName
        L10:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r0 = r0.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r0.getIdentifier(r2, r1, r3)
            return r1
    }

    public static void hookMethodSys(java.lang.Class<?> r0, java.lang.String r1, java.lang.Object... r2) {
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8
            goto Lc
        L4:
            r0 = move-exception
            goto L9
        L6:
            r0 = move-exception
            goto L9
        L8:
            r0 = move-exception
        L9:
            r0.printStackTrace()
        Lc:
            return
    }

    public static void hookMethodSys(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            goto L1f
        Ld:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App     // Catch: java.lang.NullPointerException -> L17 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L19 java.lang.NoSuchMethodError -> L1b
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.NullPointerException -> L17 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L19 java.lang.NoSuchMethodError -> L1b
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r0, r2, r3)     // Catch: java.lang.NullPointerException -> L17 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L19 java.lang.NoSuchMethodError -> L1b
            goto L1f
        L17:
            r1 = move-exception
            goto L1c
        L19:
            r1 = move-exception
            goto L1c
        L1b:
            r1 = move-exception
        L1c:
            r1.printStackTrace()
        L1f:
            return
    }

    public static void msg(java.lang.Object r2, boolean r3) {
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L15
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.String r2 = r1.toJson(r2)
            r3[r0] = r2
            msg(r3)
            goto L1c
        L15:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r0] = r2
            msg(r3)
        L1c:
            return
    }

    public static void msg(java.lang.Object... r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r13.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto Lad
            r4 = r13[r3]
            boolean r5 = r4 instanceof java.lang.Exception
            if (r5 == 0) goto L80
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.StackTraceElement[] r5 = r4.getStackTrace()
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "---------------------"
            r7[r2] = r8
            msg(r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r4 = r4.getMessage()
            r7[r2] = r4
            msg(r7)
            int r4 = r5.length
            r7 = r2
        L2d:
            if (r7 >= r4) goto La9
            r8 = r5[r7]
            java.lang.String r9 = r8.getClassName()
            java.lang.String r10 = "android"
            boolean r10 = r9.contains(r10)
            if (r10 != 0) goto L7d
            java.lang.String r10 = "java"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L7d
            java.lang.String r10 = "dalvik"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L7d
            java.lang.String r10 = r8.getMethodName()
            int r8 = r8.getLineNumber()
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r9 = r12.append(r9)
            java.lang.String r12 = "."
            java.lang.StringBuilder r9 = r9.append(r12)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = "():"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r11[r2] = r8
            msg(r11)
        L7d:
            int r7 = r7 + 1
            goto L2d
        L80:
            java.lang.String r5 = " , "
            if (r4 != 0) goto L98
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = "IS NULL"
            if (r4 == 0) goto L90
            r0.append(r6)
            goto La9
        L90:
            java.lang.StringBuilder r4 = r0.append(r5)
            r4.append(r6)
            goto La9
        L98:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto La2
            r0.append(r4)
            goto La9
        La2:
            java.lang.StringBuilder r5 = r0.append(r5)
            r5.append(r4)
        La9:
            int r3 = r3 + 1
            goto L8
        Lad:
            java.lang.String r13 = r0.toString()
            msgInside(r13)
            return
    }

    public static void msgInside(java.lang.Object r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "  -> "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            de.robv.android.xposed.XposedBridge.log(r2)
            return
    }

    public static void msgStackTrace() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L5f
            r4 = r0[r3]
            java.lang.String r5 = r4.getClassName()
            java.lang.String r6 = "android"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L5c
            java.lang.String r6 = "java"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L5c
            java.lang.String r6 = "dalvik"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L5c
            java.lang.String r6 = r4.getMethodName()
            int r4 = r4.getLineNumber()
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r5 = r8.append(r5)
            java.lang.String r8 = "."
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "():"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r7[r2] = r4
            msg(r7)
        L5c:
            int r3 = r3 + 1
            goto Lb
        L5f:
            return
    }

    public static java.lang.String queryClassField(java.lang.Class<?> r2, java.lang.String r3) {
            r0 = 0
            r1 = 1
            java.lang.String r2 = queryClassField(r2, r3, r0, r1, r1)
            return r2
    }

    public static java.lang.String queryClassField(java.lang.Class<?> r2, java.lang.String r3, int r4) {
            r0 = 0
            r1 = 1
            java.lang.String r2 = queryClassField(r2, r3, r0, r4, r1)
            return r2
    }

    public static java.lang.String queryClassField(java.lang.Class<?> r1, java.lang.String r2, boolean r3) {
            r0 = 1
            java.lang.String r1 = queryClassField(r1, r2, r3, r0, r0)
            return r1
    }

    public static java.lang.String queryClassField(java.lang.Class<?> r10, java.lang.String r11, boolean r12, int r13, boolean r14) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Field[] r1 = r10.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r4
        Ld:
            if (r5 >= r2) goto L4a
            r7 = r1[r5]
            if (r12 == 0) goto L2c
            java.lang.Class r8 = r7.getType()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = r11.trim()
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L47
            if (r13 != r6) goto L45
            java.lang.String r10 = r7.getName()
            return r10
        L2c:
            java.lang.Class r8 = r7.getType()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = r11.trim()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L47
            if (r13 != r6) goto L45
            java.lang.String r10 = r7.getName()
            return r10
        L45:
            int r6 = r6 + 1
        L47:
            int r5 = r5 + 1
            goto Ld
        L4a:
            if (r14 == 0) goto L58
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r10
            java.lang.String r10 = "自适配失败Field"
            r11[r4] = r10
            msg(r11)
        L58:
            return r0
    }

    public static java.lang.String queryClassField(java.lang.Class<?> r2, boolean r3, java.lang.String r4) {
            r0 = 0
            r1 = 1
            java.lang.String r2 = queryClassField(r2, r4, r0, r1, r3)
            return r2
    }

    public static java.lang.reflect.Field queryClassFieldAnnotation(java.lang.Class<?> r8, java.lang.String r9, java.lang.String r10) {
            if (r8 == 0) goto L2c
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L2c
            r3 = r8[r2]
            java.lang.annotation.Annotation[] r4 = r3.getAnnotations()
            int r5 = r4.length
            r6 = r1
        L13:
            if (r6 >= r5) goto L29
            r7 = r4[r6]
            java.lang.Object r7 = callMethod(r7, r9)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L26
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L26
            return r3
        L26:
            int r6 = r6 + 1
            goto L13
        L29:
            int r2 = r2 + 1
            goto L9
        L2c:
            r8 = 0
            return r8
    }

    public static java.lang.String queryClassFieldToName(java.lang.Class<?> r7, java.lang.String r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Field[] r1 = r7.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            if (r4 >= r2) goto L25
            r5 = r1[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L22
            java.lang.Class r7 = r5.getType()
            java.lang.String r7 = r7.getName()
            return r7
        L22:
            int r4 = r4 + 1
            goto Lb
        L25:
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r3] = r7
            java.lang.String r7 = "自适配失败FieldToName"
            r1 = 1
            r8[r1] = r7
            msg(r8)
            return r0
    }

    public static java.lang.String queryClassMethod(java.lang.Class<?> r1, java.lang.String r2) {
            r0 = 1
            java.lang.String r1 = queryClassMethod(r1, r2, r0)
            return r1
    }

    public static java.lang.String queryClassMethod(java.lang.Class<?> r9, java.lang.String r10, int r11) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r9.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r4
        Ld:
            if (r5 >= r2) goto L32
            r7 = r1[r5]
            java.lang.Class r8 = r7.getReturnType()
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L2f
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != 0) goto L2f
            if (r6 != r11) goto L2d
            java.lang.String r9 = r7.getName()
            return r9
        L2d:
            int r6 = r6 + 1
        L2f:
            int r5 = r5 + 1
            goto Ld
        L32:
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r9
            java.lang.String r9 = "自适配失败MethodNum"
            r10[r4] = r9
            msg(r10)
            return r0
    }

    public static java.lang.String queryClassMethod(java.lang.Class<?> r15, java.lang.String r16, int r17, int r18, boolean r19, java.lang.Object... r20) {
            r0 = r17
            r1 = r20
            r2 = 0
            if (r15 != 0) goto L8
            return r2
        L8:
            java.lang.reflect.Method[] r3 = r15.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
            r7 = r6
        L10:
            r8 = 2
            r9 = 3
            r10 = 1
            if (r6 >= r4) goto Lce
            r11 = r3[r6]
            java.lang.Class r12 = r11.getReturnType()
            java.lang.String r12 = r12.getName()
            r13 = r16
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto Lc8
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            int r14 = r1.length
            if (r12 != r14) goto Lc8
            if (r0 != 0) goto L3d
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPrivate(r12)
            if (r12 != 0) goto L3d
            goto Lc8
        L3d:
            if (r19 == 0) goto L49
            int r12 = r11.getModifiers()
            r12 = r12 & 4096(0x1000, float:5.74E-42)
            if (r12 != 0) goto L53
            goto Lc8
        L49:
            int r12 = r11.getModifiers()
            r12 = r12 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L53
            goto Lc8
        L53:
            if (r0 != r10) goto L61
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isProtected(r12)
            if (r12 != 0) goto L61
            goto Lc8
        L61:
            if (r0 != r8) goto L6e
            int r8 = r11.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 != 0) goto L6e
            goto Lc8
        L6e:
            if (r0 != r9) goto L7b
            int r8 = r11.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPrivate(r8)
            if (r8 != 0) goto L7b
            goto Lc8
        L7b:
            r8 = r5
        L7c:
            int r9 = r1.length
            if (r8 >= r9) goto Lbb
            r9 = r1[r8]
            boolean r9 = r9 instanceof java.lang.Class
            if (r9 == 0) goto L9f
            java.lang.Class[] r9 = r11.getParameterTypes()
            r9 = r9[r8]
            java.lang.String r9 = r9.getName()
            r12 = r1[r8]
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.String r12 = r12.getName()
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L9f
        L9d:
            r10 = r5
            goto Lbb
        L9f:
            r9 = r1[r8]
            boolean r9 = r9 instanceof java.lang.String
            if (r9 == 0) goto Lb8
            java.lang.Class[] r9 = r11.getParameterTypes()
            r9 = r9[r8]
            java.lang.String r9 = r9.getName()
            r12 = r1[r8]
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto Lb8
            goto L9d
        Lb8:
            int r8 = r8 + 1
            goto L7c
        Lbb:
            if (r10 == 0) goto Lc8
            int r7 = r7 + 1
            r12 = r18
            if (r7 != r12) goto Lca
            java.lang.String r0 = r11.getName()
            return r0
        Lc8:
            r12 = r18
        Lca:
            int r6 = r6 + 1
            goto L10
        Lce:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r15
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            java.lang.String r1 = r3.toJson(r1)
            r0[r10] = r1
            java.lang.String r1 = "自适配失败Method"
            r0[r8] = r1
            msg(r0)
            return r2
    }

    public static java.lang.String queryClassMethod(java.lang.Class<?> r11, java.lang.String r12, int r13, boolean r14, java.lang.Object... r15) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r11.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            r5 = 2
            r6 = 3
            r7 = 1
            if (r4 >= r2) goto Lbe
            r8 = r1[r4]
            java.lang.Class r9 = r8.getReturnType()
            java.lang.String r9 = r9.getName()
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto Lba
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            int r10 = r15.length
            if (r9 != r10) goto Lba
            if (r13 != 0) goto L36
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isPrivate(r9)
            if (r9 != 0) goto L36
            goto Lba
        L36:
            if (r14 == 0) goto L42
            int r9 = r8.getModifiers()
            r9 = r9 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L4c
            goto Lba
        L42:
            int r9 = r8.getModifiers()
            r9 = r9 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L4c
            goto Lba
        L4c:
            if (r13 != r7) goto L59
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isProtected(r9)
            if (r9 != 0) goto L59
            goto Lba
        L59:
            if (r13 != r5) goto L66
            int r5 = r8.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)
            if (r5 != 0) goto L66
            goto Lba
        L66:
            if (r13 != r6) goto L73
            int r5 = r8.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPrivate(r5)
            if (r5 != 0) goto L73
            goto Lba
        L73:
            r5 = r3
        L74:
            int r6 = r15.length
            if (r5 >= r6) goto Lb3
            r6 = r15[r5]
            boolean r6 = r6 instanceof java.lang.Class
            if (r6 == 0) goto L97
            java.lang.Class[] r6 = r8.getParameterTypes()
            r6 = r6[r5]
            java.lang.String r6 = r6.getName()
            r9 = r15[r5]
            java.lang.Class r9 = (java.lang.Class) r9
            java.lang.String r9 = r9.getName()
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L97
        L95:
            r7 = r3
            goto Lb3
        L97:
            r6 = r15[r5]
            boolean r6 = r6 instanceof java.lang.String
            if (r6 == 0) goto Lb0
            java.lang.Class[] r6 = r8.getParameterTypes()
            r6 = r6[r5]
            java.lang.String r6 = r6.getName()
            r9 = r15[r5]
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto Lb0
            goto L95
        Lb0:
            int r5 = r5 + 1
            goto L74
        Lb3:
            if (r7 == 0) goto Lba
            java.lang.String r11 = r8.getName()
            return r11
        Lba:
            int r4 = r4 + 1
            goto Lb
        Lbe:
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r3] = r11
            com.google.gson.Gson r11 = new com.google.gson.Gson
            r11.<init>()
            java.lang.String r11 = r11.toJson(r15)
            r12[r7] = r11
            java.lang.String r11 = "自适配失败Method"
            r12[r5] = r11
            msg(r12)
            return r0
    }

    public static java.lang.String queryClassMethod(java.lang.Class<?> r11, java.lang.String r12, int r13, java.lang.String... r14) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r11.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
            r5 = r4
        Lc:
            r6 = 1
            if (r4 >= r2) goto L54
            r7 = r1[r4]
            java.lang.Class r8 = r7.getReturnType()
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L51
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            int r9 = r14.length
            if (r8 != r9) goto L51
            r8 = r3
        L28:
            int r9 = r14.length
            if (r8 >= r9) goto L46
            r9 = r14[r8]
            if (r9 == 0) goto L43
            java.lang.Class[] r9 = r7.getParameterTypes()
            r9 = r9[r8]
            java.lang.String r9 = r9.getName()
            r10 = r14[r8]
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L43
            r6 = r3
            goto L46
        L43:
            int r8 = r8 + 1
            goto L28
        L46:
            if (r6 == 0) goto L51
            int r5 = r5 + 1
            if (r5 != r13) goto L51
            java.lang.String r11 = r7.getName()
            return r11
        L51:
            int r4 = r4 + 1
            goto Lc
        L54:
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r3] = r11
            com.google.gson.Gson r11 = new com.google.gson.Gson
            r11.<init>()
            java.lang.String r11 = r11.toJson(r14)
            r12[r6] = r11
            r11 = 2
            java.lang.String r13 = "自适配失败Method"
            r12[r11] = r13
            msg(r12)
            return r0
    }

    public static java.lang.String queryClassMethod(java.lang.Class<?> r10, java.lang.String r11, java.lang.String... r12) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            r5 = 1
            if (r4 >= r2) goto L4f
            r6 = r1[r4]
            java.lang.Class r7 = r6.getReturnType()
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L4c
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            int r8 = r12.length
            if (r7 != r8) goto L4c
            r7 = r3
        L27:
            int r8 = r12.length
            if (r7 >= r8) goto L45
            r8 = r12[r7]
            if (r8 == 0) goto L42
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r7]
            java.lang.String r8 = r8.getName()
            r9 = r12[r7]
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L42
            r5 = r3
            goto L45
        L42:
            int r7 = r7 + 1
            goto L27
        L45:
            if (r5 == 0) goto L4c
            java.lang.String r10 = r6.getName()
            return r10
        L4c:
            int r4 = r4 + 1
            goto Lb
        L4f:
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r10
            com.google.gson.Gson r10 = new com.google.gson.Gson
            r10.<init>()
            java.lang.String r10 = r10.toJson(r12)
            r11[r5] = r10
            r10 = 2
            java.lang.String r12 = "自适配失败Method"
            r11[r10] = r12
            msg(r11)
            return r0
    }

    public static java.lang.Class<?> queryClassMethodGetReturn(java.lang.Class<?> r7, java.lang.String r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r7.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            if (r4 >= r2) goto L21
            r5 = r1[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L1e
            java.lang.Class r7 = r5.getReturnType()
            return r7
        L1e:
            int r4 = r4 + 1
            goto Lb
        L21:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r7 = 1
            r1[r7] = r8
            r7 = 2
            java.lang.String r8 = "自适配失败MethodGetReturn:methodName"
            r1[r7] = r8
            msg(r1)
            return r0
    }

    public static java.lang.Class<?> queryClassMethodGetReturn(java.lang.Class<?> r10, java.lang.String r11, java.lang.String... r12) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            r5 = 1
            if (r4 >= r2) goto L4e
            r6 = r1[r4]
            java.lang.String r7 = r6.getName()
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L4b
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            int r8 = r12.length
            if (r7 != r8) goto L4b
            int r7 = r12.length
            if (r7 <= 0) goto L4b
            r7 = r3
        L26:
            int r8 = r12.length
            if (r7 >= r8) goto L44
            r8 = r12[r7]
            if (r8 == 0) goto L41
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r7]
            java.lang.String r8 = r8.getName()
            r9 = r12[r7]
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L41
            r5 = r3
            goto L44
        L41:
            int r7 = r7 + 1
            goto L26
        L44:
            if (r5 == 0) goto L4b
            java.lang.Class r10 = r6.getReturnType()
            return r10
        L4b:
            int r4 = r4 + 1
            goto Lb
        L4e:
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r10
            com.google.gson.Gson r10 = new com.google.gson.Gson
            r10.<init>()
            java.lang.String r10 = r10.toJson(r12)
            r11[r5] = r10
            r10 = 2
            java.lang.String r12 = "自适配失败MethodGetReturn"
            r11[r10] = r12
            msg(r11)
            return r0
    }

    public static java.lang.String queryClassMethodGetReturnClass(java.lang.Class<?> r10, java.lang.Object... r11) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            r5 = 1
            if (r4 >= r2) goto L49
            r6 = r1[r4]
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            int r8 = r11.length
            if (r7 != r8) goto L46
            int r7 = r11.length
            if (r7 <= 0) goto L41
            r7 = r3
        L1c:
            int r8 = r11.length
            if (r7 >= r8) goto L3a
            r8 = r11[r7]
            if (r8 == 0) goto L37
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r7]
            java.lang.String r8 = r8.getName()
            r9 = r11[r7]
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L37
            r5 = r3
            goto L3a
        L37:
            int r7 = r7 + 1
            goto L1c
        L3a:
            if (r5 == 0) goto L46
            java.lang.String r10 = r6.getName()
            return r10
        L41:
            java.lang.String r10 = r6.getName()
            return r10
        L46:
            int r4 = r4 + 1
            goto Lb
        L49:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            com.google.gson.Gson r10 = new com.google.gson.Gson
            r10.<init>()
            java.lang.String r10 = r10.toJson(r11)
            r1[r5] = r10
            r10 = 2
            java.lang.String r11 = "自适配失败MethodGetReturnClass"
            r1[r10] = r11
            msg(r1)
            return r0
    }

    public static java.lang.String queryClassMethodNotReturnNull(java.lang.Class<?> r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r8.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            if (r4 >= r2) goto L34
            r5 = r1[r4]
            java.lang.Class r6 = r5.getReturnType()
            if (r6 == 0) goto L31
            java.lang.Class r6 = r5.getReturnType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "void"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L31
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != 0) goto L31
            java.lang.String r8 = r5.getName()
            return r8
        L31:
            int r4 = r4 + 1
            goto Lb
        L34:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            java.lang.String r8 = "自适配失败MethodNotReturnNull"
            r2 = 1
            r1[r2] = r8
            msg(r1)
            return r0
    }

    public static java.lang.String queryClassMethodParamVague(java.lang.Class<?> r7, java.lang.String r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r7.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            if (r4 >= r2) goto L25
            r5 = r1[r4]
            java.lang.Class r6 = r5.getReturnType()
            java.lang.String r6 = r6.getName()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L22
            java.lang.String r7 = r5.getName()
            return r7
        L22:
            int r4 = r4 + 1
            goto Lb
        L25:
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r3] = r7
            java.lang.String r7 = "自适配失败MethodParamVague"
            r1 = 1
            r8[r1] = r7
            msg(r8)
            return r0
    }

    public static java.lang.String queryClassMethodReverse(java.lang.Class<?> r10, java.lang.String r11, java.lang.String... r12) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            r5 = 1
            if (r4 >= r2) goto L4f
            r6 = r1[r4]
            java.lang.Class r7 = r6.getReturnType()
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L4c
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            int r8 = r12.length
            if (r7 != r8) goto L4c
            r7 = r3
        L27:
            int r8 = r12.length
            if (r7 >= r8) goto L45
            r8 = r12[r7]
            if (r8 == 0) goto L42
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r7]
            java.lang.String r8 = r8.getName()
            r9 = r12[r7]
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L42
            r5 = r3
            goto L45
        L42:
            int r7 = r7 + 1
            goto L27
        L45:
            if (r5 == 0) goto L4c
            java.lang.String r10 = r6.getName()
            return r10
        L4c:
            int r4 = r4 + 1
            goto Lb
        L4f:
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r10
            com.google.gson.Gson r10 = new com.google.gson.Gson
            r10.<init>()
            java.lang.String r10 = r10.toJson(r12)
            r11[r5] = r10
            r10 = 2
            java.lang.String r12 = "自适配失败MethodReverse"
            r11[r10] = r12
            msg(r11)
            return r0
    }

    public static java.lang.String queryClassMethod_param(java.lang.Class<?> r11, java.lang.String r12, int r13, java.lang.String... r14) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r11.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r4
        Ld:
            if (r5 >= r2) goto L55
            r7 = r1[r5]
            java.lang.Class r8 = r7.getReturnType()
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L52
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            int r9 = r14.length
            if (r8 != r9) goto L52
            r8 = r3
        L28:
            int r9 = r14.length
            if (r8 >= r9) goto L46
            r9 = r14[r8]
            if (r9 == 0) goto L43
            java.lang.Class[] r9 = r7.getParameterTypes()
            r9 = r9[r8]
            java.lang.String r9 = r9.getName()
            r10 = r14[r8]
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L43
            r8 = r3
            goto L47
        L43:
            int r8 = r8 + 1
            goto L28
        L46:
            r8 = r4
        L47:
            if (r8 == 0) goto L52
            if (r6 != r13) goto L50
            java.lang.String r11 = r7.getName()
            return r11
        L50:
            int r6 = r6 + 1
        L52:
            int r5 = r5 + 1
            goto Ld
        L55:
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r3] = r11
            com.google.gson.Gson r11 = new com.google.gson.Gson
            r11.<init>()
            java.lang.String r11 = r11.toJson(r14)
            r12[r4] = r11
            r11 = 2
            java.lang.String r13 = "自适配失败Method_param"
            r12[r11] = r13
            msg(r12)
            return r0
    }

    public static java.lang.String queryClassParam(java.lang.Class<?> r12, java.lang.String r13, int r14, java.lang.String... r15) {
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method[] r1 = r12.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r6 = r0
            r4 = r3
            r5 = r4
        Ld:
            r7 = 1
            if (r4 >= r2) goto L6d
            r8 = r1[r4]
            java.lang.Class r9 = r8.getReturnType()
            java.lang.String r9 = r9.getName()
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L6a
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            int r10 = r15.length
            if (r9 != r10) goto L6a
            r9 = r3
        L29:
            int r10 = r15.length
            if (r9 >= r10) goto L63
            r10 = r15[r9]
            java.lang.String r11 = "void"
            if (r10 == 0) goto L38
            boolean r10 = java.util.Objects.equals(r10, r11)
            if (r10 == 0) goto L42
        L38:
            java.lang.Class[] r6 = r8.getParameterTypes()
            r6 = r6[r9]
            java.lang.String r6 = r6.getName()
        L42:
            r10 = r15[r9]
            if (r10 == 0) goto L60
            boolean r10 = java.util.Objects.equals(r10, r11)
            if (r10 != 0) goto L60
            java.lang.Class[] r10 = r8.getParameterTypes()
            r10 = r10[r9]
            java.lang.String r10 = r10.getName()
            r11 = r15[r9]
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L60
            r7 = r3
            goto L63
        L60:
            int r9 = r9 + 1
            goto L29
        L63:
            if (r7 == 0) goto L6a
            int r5 = r5 + 1
            if (r14 != r5) goto L6a
            return r6
        L6a:
            int r4 = r4 + 1
            goto Ld
        L6d:
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r3] = r12
            com.google.gson.Gson r12 = new com.google.gson.Gson
            r12.<init>()
            java.lang.String r12 = r12.toJson(r15)
            r13[r7] = r12
            r12 = 2
            java.lang.String r14 = "自适配失败Param"
            r13[r12] = r14
            msg(r13)
            return r0
    }

    public static java.lang.String queryClassParam(java.lang.Class<?> r1, java.lang.String r2, java.lang.String... r3) {
            r0 = 1
            java.lang.String r1 = queryClassParam(r1, r2, r0, r3)
            return r1
    }
}
