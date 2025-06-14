package com.usidqw.qwerklj.Base;

/* loaded from: classes.dex */
public class HookFun {
    public static java.util.HashMap<java.lang.String, java.lang.Class<?>> cacheClass;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.usidqw.qwerklj.Base.HookFun.cacheClass = r0
            return
    }

    public HookFun() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void DescCollections(java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r1) {
            if (r1 != 0) goto L3
            return
        L3:
            com.usidqw.qwerklj.Base.HookFun$$ExternalSyntheticLambda0 r0 = new com.usidqw.qwerklj.Base.HookFun$$ExternalSyntheticLambda0
            r0.<init>()
            r1.sort(r0)
            return
    }

    public static java.lang.Object callMethod(java.lang.Object r3, java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.String r4 = r4.trim()     // Catch: java.lang.NullPointerException -> L10 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L12 java.lang.NoSuchMethodError -> L14
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.NullPointerException -> L10 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L12 java.lang.NoSuchMethodError -> L14
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.callMethod(r3, r4, r2)     // Catch: java.lang.NullPointerException -> L10 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L12 java.lang.NoSuchMethodError -> L14
            return r3
        L10:
            r3 = move-exception
            goto L15
        L12:
            r3 = move-exception
            goto L15
        L14:
            r3 = move-exception
        L15:
            r3.printStackTrace()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            com.usidqw.qwerklj.Tools.Fun.msg(r4)
            return r0
    }

    public static java.lang.Object callMethod(java.lang.Object r0, java.lang.String r1, java.lang.Object... r2) {
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L5 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L7 java.lang.NoSuchMethodError -> L9
            return r0
        L5:
            r0 = move-exception
            goto La
        L7:
            r0 = move-exception
            goto La
        L9:
            r0 = move-exception
        La:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
            r0.printStackTrace()
            r0 = 0
            return r0
    }

    public static java.lang.Object callStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r1, r2, r3)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            return r1
        L9:
            r1 = move-exception
            goto L10
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = move-exception
            goto L10
        Lf:
            r1 = move-exception
        L10:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            return r0
    }

    public static boolean check(java.lang.String r1) {
            r0 = 0
            boolean r1 = com.usidqw.qwerklj.Base.Base.getValue(r1, r0)
            return r1
    }

    public static int checkAllAlpha(java.lang.String r2) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            boolean r0 = r0.isLongClick()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L26
            java.lang.String r0 = "View_ALL"
            boolean r0 = check(r0)
            if (r0 == 0) goto L26
            java.lang.String r0 = "View_Unified_Check"
            boolean r0 = check(r0)
            if (r0 == 0) goto L21
            java.lang.String r2 = "View_Unified"
            int r2 = get(r2, r1)
            return r2
        L21:
            int r2 = get(r2, r1)
            return r2
        L26:
            return r1
    }

    public static java.lang.Class<?> findClass(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = com.usidqw.qwerklj.Base.HookFun.cacheClass     // Catch: java.lang.Error -> L2e
            java.lang.String r2 = r3.trim()     // Catch: java.lang.Error -> L2e
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Error -> L2e
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Error -> L2e
            if (r0 != 0) goto L2d
            java.lang.String r0 = r3.trim()     // Catch: java.lang.Error -> L2e
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Tools.Static.App     // Catch: java.lang.Error -> L2e
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Error -> L2e
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r0, r2)     // Catch: java.lang.Error -> L2e
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r2 = com.usidqw.qwerklj.Base.HookFun.cacheClass     // Catch: java.lang.Error -> L2e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Error -> L2e
            r2.put(r3, r0)     // Catch: java.lang.Error -> L2e
        L2d:
            return r0
        L2e:
            r3 = move-exception
            r3.printStackTrace()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            com.usidqw.qwerklj.Tools.Fun.msg(r0)
            return r1
    }

    public static java.lang.reflect.Field findField(java.lang.Class<?> r1, java.lang.String r2) {
            java.lang.reflect.Field r1 = de.robv.android.xposed.XposedHelpers.findField(r1, r2)     // Catch: java.lang.NullPointerException -> L5 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L7 java.lang.NoSuchMethodError -> L9 java.lang.NoSuchFieldError -> Lb
            return r1
        L5:
            r1 = move-exception
            goto Lc
        L7:
            r1 = move-exception
            goto Lc
        L9:
            r1 = move-exception
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1 = 0
            return r1
    }

    public static java.lang.reflect.Field findField(java.lang.String r0, java.lang.String r1) {
            java.lang.Class r0 = findClass(r0)
            java.lang.reflect.Field r0 = findField(r0, r1)
            return r0
    }

    public static double get(java.lang.String r0, double r1) {
            java.lang.String r0 = r0.trim()
            double r0 = com.usidqw.qwerklj.Base.Base.getValue(r0, r1)
            return r0
    }

    public static float get(java.lang.String r0, float r1) {
            java.lang.String r0 = r0.trim()
            float r0 = com.usidqw.qwerklj.Base.Base.getValue(r0, r1)
            return r0
    }

    public static int get(java.lang.String r0, int r1) {
            java.lang.String r0 = r0.trim()
            int r0 = com.usidqw.qwerklj.Base.Base.getValue(r0, r1)
            return r0
    }

    public static java.lang.String get(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = r1.trim()
            java.lang.String r0 = com.usidqw.qwerklj.Base.Base.getValue(r0, r1)
            return r0
    }

    public static java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> get(java.lang.String r3) {
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = ""
            java.lang.String r3 = com.usidqw.qwerklj.Base.Base.getValue(r3, r0)
            r0 = 0
            if (r3 == 0) goto L27
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: com.google.gson.JsonSyntaxException -> L23
            r1.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L23
            com.usidqw.qwerklj.Base.HookFun$1 r2 = new com.usidqw.qwerklj.Base.HookFun$1     // Catch: com.google.gson.JsonSyntaxException -> L23
            r2.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L23
            java.lang.reflect.Type r2 = r2.getType()     // Catch: com.google.gson.JsonSyntaxException -> L23
            java.lang.Object r3 = r1.fromJson(r3, r2)     // Catch: com.google.gson.JsonSyntaxException -> L23
            java.util.List r3 = (java.util.List) r3     // Catch: com.google.gson.JsonSyntaxException -> L23
            r0 = r3
            goto L27
        L23:
            r3 = move-exception
            r3.printStackTrace()
        L27:
            return r0
    }

    public static boolean get(java.lang.String r1, boolean r2) {
            boolean r0 = com.usidqw.qwerklj.Base.Base.isAllOpen()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.trim()
            boolean r1 = com.usidqw.qwerklj.Base.Base.getValue(r1, r2)
            return r1
    }

    public static boolean getBooleanField(java.lang.Object r1, java.lang.String r2) {
            java.lang.String r2 = r2.trim()     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            boolean r1 = de.robv.android.xposed.XposedHelpers.getBooleanField(r1, r2)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            return r1
        L9:
            r1 = move-exception
            goto L10
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = move-exception
            goto L10
        Lf:
            r1 = move-exception
        L10:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            return r0
    }

    public static java.lang.String getCurSecUserId() {
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.AccountProxyService"
            java.lang.Class r0 = findClass(r0)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "userService"
            java.lang.Object r0 = callStaticMethod(r0, r2, r1)
            java.lang.String r1 = "getCurSecUserId"
            java.lang.Object r0 = callMethod(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static double getDoubleField(java.lang.Object r1, java.lang.String r2) {
            java.lang.String r2 = r2.trim()     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            double r1 = de.robv.android.xposed.XposedHelpers.getDoubleField(r1, r2)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            return r1
        L9:
            r1 = move-exception
            goto L10
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = move-exception
            goto L10
        Lf:
            r1 = move-exception
        L10:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1.printStackTrace()
            r1 = 0
            return r1
    }

    public static int getIntField(java.lang.Object r1, java.lang.String r2) {
            java.lang.String r2 = r2.trim()     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            int r1 = de.robv.android.xposed.XposedHelpers.getIntField(r1, r2)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            return r1
        L9:
            r1 = move-exception
            goto L10
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = move-exception
            goto L10
        Lf:
            r1 = move-exception
        L10:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            return r0
    }

    public static android.view.View getListDataView(android.view.View r0, int r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    public static android.view.View getListDataViewX(android.view.View r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L14
            android.view.View r2 = r2.findViewById(r0)     // Catch: java.lang.NumberFormatException -> L14
            goto L1e
        L14:
            java.lang.String r0 = "id"
            int r3 = com.usidqw.qwerklj.Tools.Fun.getResourcesId(r0, r3)
            android.view.View r2 = r2.findViewById(r3)
        L1e:
            return r2
    }

    public static long getLongField(java.lang.Object r1, java.lang.String r2) {
            long r1 = de.robv.android.xposed.XposedHelpers.getLongField(r1, r2)     // Catch: java.lang.NullPointerException -> L5 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L7 java.lang.NoSuchMethodError -> L9 java.lang.NoSuchFieldError -> Lb
            return r1
        L5:
            r1 = move-exception
            goto Lc
        L7:
            r1 = move-exception
            goto Lc
        L9:
            r1 = move-exception
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1 = 0
            return r1
    }

    public static java.lang.Object getObjectField(java.lang.Object r1, java.lang.String r2) {
            r0 = 0
            java.lang.Object r1 = getObjectField(r1, r2, r0)
            return r1
    }

    public static java.lang.Object getObjectField(java.lang.Object r0, java.lang.String r1, boolean r2) {
            java.lang.String r1 = r1.trim()     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r0, r1)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            return r0
        L9:
            r0 = move-exception
            goto L10
        Lb:
            r0 = move-exception
            goto L10
        Ld:
            r0 = move-exception
            goto L10
        Lf:
            r0 = move-exception
        L10:
            r0.printStackTrace()
            if (r2 != 0) goto L1e
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L1e:
            r0 = 0
            return r0
    }

    public static int getStaticIntField(java.lang.Class<?> r1, java.lang.String r2) {
            int r1 = de.robv.android.xposed.XposedHelpers.getStaticIntField(r1, r2)     // Catch: java.lang.NullPointerException -> L5 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L7 java.lang.NoSuchMethodError -> L9 java.lang.NoSuchFieldError -> Lb
            return r1
        L5:
            r1 = move-exception
            goto Lc
        L7:
            r1 = move-exception
            goto Lc
        L9:
            r1 = move-exception
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            return r0
    }

    public static java.lang.Object getStaticObjectField(java.lang.Class<?> r1, java.lang.String r2) {
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.getStaticObjectField(r1, r2)     // Catch: java.lang.NullPointerException -> L5 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L7 java.lang.NoSuchMethodError -> L9 java.lang.NoSuchFieldError -> Lb
            return r1
        L5:
            r1 = move-exception
            goto Lc
        L7:
            r1 = move-exception
            goto Lc
        L9:
            r1 = move-exception
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1.printStackTrace()
            r1 = 0
            return r1
    }

    public static java.lang.String getStringField(java.lang.Object r1, java.lang.String r2) {
            java.lang.String r2 = r2.trim()     // Catch: java.lang.NullPointerException -> Lb de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Ld java.lang.NoSuchMethodError -> Lf java.lang.NoSuchFieldError -> L11
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.getObjectField(r1, r2)     // Catch: java.lang.NullPointerException -> Lb de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Ld java.lang.NoSuchMethodError -> Lf java.lang.NoSuchFieldError -> L11
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NullPointerException -> Lb de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Ld java.lang.NoSuchMethodError -> Lf java.lang.NoSuchFieldError -> L11
            return r1
        Lb:
            r1 = move-exception
            goto L12
        Ld:
            r1 = move-exception
            goto L12
        Lf:
            r1 = move-exception
            goto L12
        L11:
            r1 = move-exception
        L12:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1 = 0
            return r1
    }

    public static void hookAllMethods(java.lang.Class<?> r0, java.lang.String r1, de.robv.android.xposed.XC_MethodHook r2) {
            if (r0 != 0) goto L3
            return
        L3:
            de.robv.android.xposed.XposedBridge.hookAllMethods(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L7 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L9 java.lang.NoSuchMethodError -> Lb
            goto L18
        L7:
            r0 = move-exception
            goto Lc
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            r0 = move-exception
        Lc:
            r0.printStackTrace()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L18:
            return
    }

    public static void hookConstructor(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App     // Catch: java.lang.NullPointerException -> L11 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoSuchFieldError -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.NullPointerException -> L11 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoSuchFieldError -> L17
            de.robv.android.xposed.XposedHelpers.findAndHookConstructor(r1, r0, r2)     // Catch: java.lang.NullPointerException -> L11 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoSuchFieldError -> L17
            goto L24
        L11:
            r1 = move-exception
            goto L18
        L13:
            r1 = move-exception
            goto L18
        L15:
            r1 = move-exception
            goto L18
        L17:
            r1 = move-exception
        L18:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
        L24:
            return
    }

    public static void hookMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1b
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r3)     // Catch: java.lang.NullPointerException -> La de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lc java.lang.NoSuchMethodError -> Le
            goto L1b
        La:
            r1 = move-exception
            goto Lf
        Lc:
            r1 = move-exception
            goto Lf
        Le:
            r1 = move-exception
        Lf:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
        L1b:
            return
    }

    public static void hookMethod(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            goto L30
        Ld:
            java.lang.String r1 = r1.trim()     // Catch: java.lang.NullPointerException -> L1f de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L21 java.lang.NoSuchMethodError -> L23
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App     // Catch: java.lang.NullPointerException -> L1f de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L21 java.lang.NoSuchMethodError -> L23
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.NullPointerException -> L1f de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L21 java.lang.NoSuchMethodError -> L23
            java.lang.String r2 = r2.trim()     // Catch: java.lang.NullPointerException -> L1f de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L21 java.lang.NoSuchMethodError -> L23
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r0, r2, r3)     // Catch: java.lang.NullPointerException -> L1f de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L21 java.lang.NoSuchMethodError -> L23
            goto L30
        L1f:
            r1 = move-exception
            goto L24
        L21:
            r1 = move-exception
            goto L24
        L23:
            r1 = move-exception
        L24:
            r1.printStackTrace()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
        L30:
            return
    }

    public static boolean itemContainsKey(java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r3 != 0) goto Lb
            return r1
        Lb:
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            com.usidqw.qwerklj.Json.DialogListEdit r0 = (com.usidqw.qwerklj.Json.DialogListEdit) r0
            java.lang.String r2 = r4.trim()
            java.lang.String r0 = r0.getKey()
            java.lang.String r0 = r0.trim()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lf
            r3 = 1
            return r3
        L2f:
            return r1
    }

    public static boolean itemEqualsKey(java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r3 != 0) goto Lb
            return r1
        Lb:
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            com.usidqw.qwerklj.Json.DialogListEdit r0 = (com.usidqw.qwerklj.Json.DialogListEdit) r0
            java.lang.String r2 = r4.trim()
            java.lang.String r0 = r0.getKey()
            java.lang.String r0 = r0.trim()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            r3 = 1
            return r3
        L2f:
            return r1
    }

    static /* synthetic */ int lambda$DescCollections$0(com.usidqw.qwerklj.Json.DialogListEdit r2, com.usidqw.qwerklj.Json.DialogListEdit r3) {
            java.lang.String r0 = r2.getKey()
            int r0 = r0.length()
            java.lang.String r1 = r3.getKey()
            int r1 = r1.length()
            if (r0 <= r1) goto L14
            r2 = -1
            return r2
        L14:
            java.lang.String r2 = r2.getKey()
            int r2 = r2.length()
            java.lang.String r3 = r3.getKey()
            int r3 = r3.length()
            if (r2 >= r3) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    public static java.lang.Object newInstance(java.lang.Class<?> r1, java.lang.Object... r2) {
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.newInstance(r1, r2)     // Catch: java.lang.NullPointerException -> L5 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L7 java.lang.NoSuchMethodError -> L9 java.lang.NoSuchFieldError -> Lb
            return r1
        L5:
            r1 = move-exception
            goto Lc
        L7:
            r1 = move-exception
            goto Lc
        L9:
            r1 = move-exception
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1.printStackTrace()
            r1 = 0
            return r1
    }

    public static java.lang.Object newInstance(java.lang.String r1, java.lang.Object... r2) {
            java.lang.Class r1 = findClass(r1)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.newInstance(r1, r2)     // Catch: java.lang.NullPointerException -> L9 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> Lb java.lang.NoSuchMethodError -> Ld java.lang.NoSuchFieldError -> Lf
            return r1
        L9:
            r1 = move-exception
            goto L10
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = move-exception
            goto L10
        Lf:
            r1 = move-exception
        L10:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            com.usidqw.qwerklj.Tools.Fun.msg(r2)
            r1.printStackTrace()
            r1 = 0
            return r1
    }

    public static void postMessage(java.io.Serializable r3) {
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "key"
            r1.putSerializable(r2, r3)
            r0.setData(r1)
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Tools.Static.App
            android.os.Handler r3 = r3.getHandler()
            if (r3 == 0) goto L23
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Tools.Static.App
            android.os.Handler r3 = r3.getHandler()
            r3.sendMessage(r0)
        L23:
            return
    }

    public static void set(java.lang.String r0, java.lang.Object r1) {
            com.usidqw.qwerklj.Base.Base.setValue(r0, r1)
            return
    }

    public static void setAlphaView(android.view.View r3, int r4) {
            if (r3 == 0) goto L35
            java.lang.String r0 = "View_ALL"
            boolean r0 = check(r0)
            r1 = 0
            if (r0 == 0) goto L2d
            r0 = -1
            if (r4 <= r0) goto L1d
            r2 = 256(0x100, float:3.59E-43)
            if (r4 >= r2) goto L1d
            r3.setVisibility(r1)
            float r4 = (float) r4
            r0 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 / r0
            r3.setAlpha(r4)
            goto L35
        L1d:
            if (r4 != r0) goto L24
            r4 = 4
            r3.setVisibility(r4)
            goto L35
        L24:
            r0 = -2
            if (r4 != r0) goto L35
            r4 = 8
            r3.setVisibility(r4)
            goto L35
        L2d:
            r3.setVisibility(r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
        L35:
            return
    }

    public static void setBooleanField(java.lang.Object r0, java.lang.String r1, boolean r2) {
            de.robv.android.xposed.XposedHelpers.setBooleanField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8 java.lang.NoSuchFieldError -> La
            goto L17
        L4:
            r0 = move-exception
            goto Lb
        L6:
            r0 = move-exception
            goto Lb
        L8:
            r0 = move-exception
            goto Lb
        La:
            r0 = move-exception
        Lb:
            r0.printStackTrace()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L17:
            return
    }

    public static void setBooleanFieldExists(java.lang.Object r0, java.lang.String r1, boolean r2) {
            de.robv.android.xposed.XposedHelpers.setBooleanField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8 java.lang.NoSuchFieldError -> La
            goto Le
        L4:
            r0 = move-exception
            goto Lb
        L6:
            r0 = move-exception
            goto Lb
        L8:
            r0 = move-exception
            goto Lb
        La:
            r0 = move-exception
        Lb:
            r0.printStackTrace()
        Le:
            return
    }

    public static void setDoubleField(java.lang.Object r0, java.lang.String r1, double r2) {
            de.robv.android.xposed.XposedHelpers.setDoubleField(r0, r1, r2)     // Catch: java.lang.Error -> L4
            goto L11
        L4:
            r0 = move-exception
            r0.printStackTrace()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L11:
            return
    }

    public static void setFloatField(java.lang.Object r0, java.lang.String r1, float r2) {
            de.robv.android.xposed.XposedHelpers.setFloatField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8 java.lang.NoSuchFieldError -> La
            goto L17
        L4:
            r0 = move-exception
            goto Lb
        L6:
            r0 = move-exception
            goto Lb
        L8:
            r0 = move-exception
            goto Lb
        La:
            r0 = move-exception
        Lb:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
            r0.printStackTrace()
        L17:
            return
    }

    public static void setIntField(java.lang.Object r0, java.lang.String r1, int r2) {
            de.robv.android.xposed.XposedHelpers.setIntField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8 java.lang.NoSuchFieldError -> La
            goto L17
        L4:
            r0 = move-exception
            goto Lb
        L6:
            r0 = move-exception
            goto Lb
        L8:
            r0 = move-exception
            goto Lb
        La:
            r0 = move-exception
        Lb:
            r0.printStackTrace()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L17:
            return
    }

    public static void setLongField(java.lang.Object r0, java.lang.String r1, long r2) {
            de.robv.android.xposed.XposedHelpers.setLongField(r0, r1, r2)     // Catch: java.lang.NoSuchFieldError -> L4
            goto L11
        L4:
            r0 = move-exception
            r0.printStackTrace()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L11:
            return
    }

    public static void setObjectField(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            de.robv.android.xposed.XposedHelpers.setObjectField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8
            goto L15
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
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L15:
            return
    }

    public static void setObjectFieldExists(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            de.robv.android.xposed.XposedHelpers.setObjectField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8
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

    public static void setStaticObjectField(java.lang.Class<?> r0, java.lang.String r1, java.lang.Object r2) {
            de.robv.android.xposed.XposedHelpers.setStaticObjectField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8
            goto L15
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
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
        L15:
            return
    }

    public static void setStringField(java.lang.Object r0, java.lang.String r1, java.lang.String r2) {
            de.robv.android.xposed.XposedHelpers.setObjectField(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L4 de.robv.android.xposed.XposedHelpers.InvocationTargetError -> L6 java.lang.NoSuchMethodError -> L8 java.lang.NoSuchFieldError -> La
            goto L17
        L4:
            r0 = move-exception
            goto Lb
        L6:
            r0 = move-exception
            goto Lb
        L8:
            r0 = move-exception
            goto Lb
        La:
            r0 = move-exception
        Lb:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.usidqw.qwerklj.Tools.Fun.msg(r1)
            r0.printStackTrace()
        L17:
            return
    }

    public java.util.Set<de.robv.android.xposed.XC_MethodHook.Unhook> hookAllConstructors(java.lang.String r3, de.robv.android.xposed.XC_MethodHook r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Class r3 = findClass(r3)
            if (r3 != 0) goto Lf
            return r1
        Lf:
            java.util.Set r3 = de.robv.android.xposed.XposedBridge.hookAllConstructors(r3, r4)
            return r3
    }

    public void hookAllMethods(java.lang.String r2, java.lang.String r3, de.robv.android.xposed.XC_MethodHook r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Class r2 = findClass(r2)
            if (r2 != 0) goto Le
            return
        Le:
            hookAllMethods(r2, r3, r4)
            return
    }
}
