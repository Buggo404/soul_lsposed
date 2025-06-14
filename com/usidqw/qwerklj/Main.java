package com.usidqw.qwerklj;

/* loaded from: classes.dex */
public class Main implements de.robv.android.xposed.IXposedHookLoadPackage, de.robv.android.xposed.IXposedHookZygoteInit, de.robv.android.xposed.IXposedHookInitPackageResources {
    public static java.lang.String modulePath;
    private boolean run;


    public Main() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object addModuleAssetPath(android.app.Application r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r0 = addModuleAssetPath(r0)
            return r0
    }

    public static java.lang.Object addModuleAssetPath(android.content.res.Resources r6) {
            android.content.res.AssetManager r6 = r6.getAssets()
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            java.lang.String r1 = "addAssetPath"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            r0.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            java.lang.String r2 = com.usidqw.qwerklj.Main.modulePath     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            r1[r5] = r2     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L28
            return r6
        L24:
            r6 = move-exception
            goto L29
        L26:
            r6 = move-exception
            goto L29
        L28:
            r6 = move-exception
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[PlusNE]->添加宿主资源失败:"
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            de.robv.android.xposed.XposedBridge.log(r0)
            r6.printStackTrace()
            r6 = 0
            return r6
    }

    public static boolean addModuleAssetPath(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = r0
        L5:
            r2 = 5
            if (r1 >= r2) goto L21
            android.content.res.Resources r2 = r3.getResources()
            java.lang.Object r2 = addModuleAssetPath(r2)
            if (r2 == 0) goto L19
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L1a
        L19:
            r2 = r0
        L1a:
            if (r2 <= 0) goto L1e
            r3 = 1
            return r3
        L1e:
            int r1 = r1 + 1
            goto L5
        L21:
            return r0
    }

    public void handleInitPackageResources(de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam r1) throws java.lang.Throwable {
            r0 = this;
            return
    }

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4) throws java.lang.Throwable {
            r3 = this;
            boolean r0 = r4.isFirstApplication
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.run
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            r3.run = r0
            com.usidqw.qwerklj.Main$1 r0 = new com.usidqw.qwerklj.Main$1
            r0.<init>(r3)
            java.lang.String r1 = r4.packageName
            java.lang.String r2 = "com.usidqw.qwerklj"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f
            r0.onLoadPackage(r4)
        L1f:
            return
    }

    public void initZygote(de.robv.android.xposed.IXposedHookZygoteInit.StartupParam r2) {
            r1 = this;
            java.lang.String r2 = r2.modulePath
            com.usidqw.qwerklj.Main.modulePath = r2
            r0 = 0
            android.content.res.XModuleResources.createInstance(r2, r0)
            return
    }
}
