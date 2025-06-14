package com.usidqw.qwerklj;

/* loaded from: classes.dex */
public abstract class Run extends com.usidqw.qwerklj.Base.Base {
    private static boolean ApplicationRun;
    private static boolean isTest;
    private static boolean isToastPlus;
    private java.lang.String errorPlusNE;



    public Run() {
            r0 = this;
            r0.<init>()
            return
    }

    private void InitActivity() {
            r4 = this;
            com.usidqw.qwerklj.Run$2 r0 = new com.usidqw.qwerklj.Run$2
            r0.<init>(r4)
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r2 = "onCreate"
            de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r2, r0)
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r3 = "onResume"
            de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r3, r0)
            java.lang.Class<androidx.appcompat.app.AppCompatActivity> r1 = androidx.appcompat.app.AppCompatActivity.class
            de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r2, r0)
            java.lang.Class<androidx.appcompat.app.AppCompatActivity> r1 = androidx.appcompat.app.AppCompatActivity.class
            de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r3, r0)
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r2 = "onStart"
            de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r2, r0)
            java.lang.Class<androidx.appcompat.app.AppCompatActivity> r1 = androidx.appcompat.app.AppCompatActivity.class
            de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r2, r0)
            return
    }

    static /* synthetic */ boolean access$000() {
            boolean r0 = com.usidqw.qwerklj.Run.ApplicationRun
            return r0
    }

    static /* synthetic */ boolean access$002(boolean r0) {
            com.usidqw.qwerklj.Run.ApplicationRun = r0
            return r0
    }

    static /* synthetic */ void access$100(com.usidqw.qwerklj.Run r0) {
            r0.initDaoMaster()
            return
    }

    static /* synthetic */ boolean access$200() {
            boolean r0 = com.usidqw.qwerklj.Run.isTest
            return r0
    }

    static /* synthetic */ boolean access$202(boolean r0) {
            com.usidqw.qwerklj.Run.isTest = r0
            return r0
    }

    private void initDaoMaster() {
            r4 = this;
            com.usidqw.qwerklj.GreenDao.MyOpenHelper r0 = new com.usidqw.qwerklj.GreenDao.MyOpenHelper     // Catch: java.lang.Exception -> L21
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> L21
            android.app.Application r1 = r1.getApplication()     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "test1.db"
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L21
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Exception -> L21
            com.usidqw.qwerklj.GreenDao.dao.DaoMaster r1 = new com.usidqw.qwerklj.GreenDao.dao.DaoMaster     // Catch: java.lang.Exception -> L21
            r1.<init>(r0)     // Catch: java.lang.Exception -> L21
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> L21
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r1.newSession()     // Catch: java.lang.Exception -> L21
            r0.setDb(r1)     // Catch: java.lang.Exception -> L21
            goto L2e
        L21:
            r0 = move-exception
            r0.printStackTrace()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            msg(r1)
        L2e:
            return
    }

    @Override // com.usidqw.qwerklj.Base.Base
    public void onLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r6) {
            r5 = this;
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App
            r0.setLpparam(r6)
            java.lang.ClassLoader r0 = r6.classLoader
            com.usidqw.qwerklj.Run.classLoader = r0
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App
            java.lang.ClassLoader r1 = r6.classLoader
            r0.setClassLoader(r1)
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.setLooper(r1)
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App
            android.os.Handler r1 = new android.os.Handler
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Run.App
            android.os.Looper r2 = r2.getLooper()
            r1.<init>(r2)
            r0.setMainHandler(r1)
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.ClassLoader r1 = r6.classLoader
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r0, r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "currentActivityThread"
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r0, r3, r2)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Run.App
            java.lang.String r3 = "getSystemContext"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r3, r4)
            android.content.Context r0 = (android.content.Context) r0
            r2.setSystemContext(r0)
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            android.content.pm.ApplicationInfo r2 = r6.appInfo     // Catch: java.lang.Exception -> Lb2
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            android.content.Context r3 = r3.getSystemContext()     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> Lb2
            java.lang.CharSequence r2 = r2.loadLabel(r3)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lb2
            r0.setAppName(r2)     // Catch: java.lang.Exception -> Lb2
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lb2
            r2 = 28
            if (r0 < r2) goto L82
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            android.content.Context r2 = r2.getSystemContext()     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = r6.packageName     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Exception -> Lb2
            long r2 = r2.getLongVersionCode()     // Catch: java.lang.Exception -> Lb2
            r0.setVersionCode(r2)     // Catch: java.lang.Exception -> Lb2
            goto L9a
        L82:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            android.content.Context r2 = r2.getSystemContext()     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = r6.packageName     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Exception -> Lb2
            int r2 = r2.versionCode     // Catch: java.lang.Exception -> Lb2
            long r2 = (long) r2     // Catch: java.lang.Exception -> Lb2
            r0.setVersionCode(r2)     // Catch: java.lang.Exception -> Lb2
        L9a:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Run.App     // Catch: java.lang.Exception -> Lb2
            android.content.Context r2 = r2.getSystemContext()     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> Lb2
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r1)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = r6.versionName     // Catch: java.lang.Exception -> Lb2
            r0.setVersionName(r6)     // Catch: java.lang.Exception -> Lb2
            goto Lb6
        Lb2:
            r6 = move-exception
            r6.printStackTrace()
        Lb6:
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Run.App
            long r0 = r6.getVersionCode()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L10a
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Run.App
            java.lang.String r6 = r6.getVersionName()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto Lcf
            goto L10a
        Lcf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "模块错误,获取PlusNE信息失败,请检查是否隐藏PlusNE,或者没有给\""
            r6.<init>(r0)
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Run.App
            java.lang.String r0 = r0.getAppName()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "\"读取应用列表权限"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.errorPlusNE = r6
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Run.App
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r6 = r6.getLpparam()
            java.lang.String r6 = r6.packageName
            boolean r6 = r5.isAppOpen(r6)
            if (r6 != 0) goto Lfb
            return
        Lfb:
            r5.InitActivity()
            java.lang.Class<android.app.Application> r6 = android.app.Application.class
            com.usidqw.qwerklj.Run$1 r0 = new com.usidqw.qwerklj.Run$1
            r0.<init>(r5)
            java.lang.String r1 = "onCreate"
            de.robv.android.xposed.XposedBridge.hookAllMethods(r6, r1, r0)
        L10a:
            return
    }
}
