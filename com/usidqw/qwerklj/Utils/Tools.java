package com.usidqw.qwerklj.Utils;

/* loaded from: classes.dex */
public class Tools {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TAG = "PlusNETools-------------------";
    public static android.os.Handler handler;

    static {
            return
    }

    public Tools() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String Md5(java.lang.String r7) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L35
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Exception -> L35
            byte[] r7 = r0.digest(r7)     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Exception -> L35
            int r1 = r7.length     // Catch: java.lang.Exception -> L35
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L30
            r4 = r7[r3]     // Catch: java.lang.Exception -> L35
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Exception -> L35
            int r5 = r4.length()     // Catch: java.lang.Exception -> L35
            r6 = 2
            if (r5 >= r6) goto L2a
            r0.append(r2)     // Catch: java.lang.Exception -> L35
        L2a:
            r0.append(r4)     // Catch: java.lang.Exception -> L35
            int r3 = r3 + 1
            goto L16
        L30:
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L35
            return r7
        L35:
            r7 = move-exception
            r7.printStackTrace()
            java.lang.String r7 = ""
            return r7
    }

    public static int Random(int r1, int r2) {
            if (r1 != 0) goto L6
            if (r2 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r2)
            int r2 = r2 - r1
            int r2 = r2 + 1
            int r0 = r0 % r2
            int r0 = r0 + r1
            return r0
    }

    public static void RestartApp(android.app.Activity r6) {
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = r6.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            android.content.ComponentName r0 = r0.getComponent()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.usidqw.qwerklj.MainActivity> r2 = com.usidqw.qwerklj.MainActivity.class
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "com.usidqw.qwerklj"
            r1.<init>(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "PackageName"
            java.lang.String r5 = r6.getPackageName()
            r3.putString(r4, r5)
            java.lang.String r4 = "ActivityClassName"
            java.lang.String r0 = r0.getClassName()
            r3.putString(r4, r0)
            r2.putExtras(r3)
            r2.setComponent(r1)
            r6.startActivity(r2)
            r6 = 0
            java.lang.System.exit(r6)
            return
    }

    public static void WriteString(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.io.IOException -> Lf
            r0.<init>(r1)     // Catch: java.io.IOException -> Lf
            r0.write(r2)     // Catch: java.io.IOException -> Lf
            r0.flush()     // Catch: java.io.IOException -> Lf
            r0.close()     // Catch: java.io.IOException -> Lf
            goto L13
        Lf:
            r1 = move-exception
            r1.printStackTrace()
        L13:
            return
    }

    public static java.lang.String chazhao(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r0 = r2.length()     // Catch: java.lang.StringIndexOutOfBoundsException -> L12
            int r2 = r1.indexOf(r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L12
            int r0 = r0 + r2
            int r2 = r1.indexOf(r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L12
            java.lang.String r1 = r1.substring(r0, r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L12
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static java.lang.String chazhaoNew(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r3.length()     // Catch: java.lang.StringIndexOutOfBoundsException -> L1a
            int r3 = r2.indexOf(r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L1a
            int r0 = r0 + r3
            int r3 = r2.indexOf(r4, r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> L1a
            java.lang.String r2 = r2.substring(r0, r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L1a
            return r2
        L1a:
            return r1
    }

    public static boolean checkQQ(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 5
            r2 = 0
            if (r0 < r1) goto L32
            int r0 = r5.length()
            r1 = 12
            if (r0 <= r1) goto L11
            goto L32
        L11:
            char r0 = r5.charAt(r2)
            r1 = 48
            if (r0 != r1) goto L1a
            return r2
        L1a:
            r0 = r2
        L1b:
            int r3 = r5.length()
            if (r0 >= r3) goto L30
            char r3 = r5.charAt(r0)
            if (r3 < r1) goto L2f
            r4 = 57
            if (r3 <= r4) goto L2c
            goto L2f
        L2c:
            int r0 = r0 + 1
            goto L1b
        L2f:
            return r2
        L30:
            r5 = 1
            return r5
        L32:
            return r2
    }

    public static void compress(java.io.File r6, java.util.zip.ZipOutputStream r7, java.lang.String r8) throws java.lang.Exception {
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            boolean r1 = r6.isFile()
            r2 = 0
            if (r1 == 0) goto L2a
            java.util.zip.ZipEntry r1 = new java.util.zip.ZipEntry
            r1.<init>(r8)
            r7.putNextEntry(r1)
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
        L18:
            int r6 = r8.read(r0)
            r1 = -1
            if (r6 == r1) goto L23
            r7.write(r0, r2, r6)
            goto L18
        L23:
            r7.closeEntry()
            r8.close()
            goto L76
        L2a:
            java.io.File[] r6 = r6.listFiles()
            java.lang.String r0 = "/"
            if (r6 == 0) goto L5a
            int r1 = r6.length
            if (r1 != 0) goto L36
            goto L5a
        L36:
            int r1 = r6.length
        L37:
            if (r2 >= r1) goto L76
            r3 = r6[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = r3.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            compress(r3, r7, r4)
            int r2 = r2 + 1
            goto L37
        L5a:
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r6.<init>(r8)
            r7.putNextEntry(r6)
            r7.closeEntry()
        L76:
            return
    }

    public static boolean copyFile(java.lang.String r4, java.lang.String r5) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L50
            r1.<init>(r4)     // Catch: java.lang.Exception -> L50
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L50
            java.lang.String r3 = "copyFile"
            if (r2 != 0) goto L14
            java.lang.String r4 = "copyFile:  oldFile not exist."
            android.util.Log.e(r3, r4)     // Catch: java.lang.Exception -> L50
            return r0
        L14:
            boolean r2 = r1.isFile()     // Catch: java.lang.Exception -> L50
            if (r2 != 0) goto L20
            java.lang.String r4 = "copyFile:  oldFile not file."
            android.util.Log.e(r3, r4)     // Catch: java.lang.Exception -> L50
            return r0
        L20:
            boolean r1 = r1.canRead()     // Catch: java.lang.Exception -> L50
            if (r1 != 0) goto L2c
            java.lang.String r4 = "copyFile:  oldFile cannot read."
            android.util.Log.e(r3, r4)     // Catch: java.lang.Exception -> L50
            return r0
        L2c:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L50
            r1.<init>(r4)     // Catch: java.lang.Exception -> L50
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L50
            r4.<init>(r5)     // Catch: java.lang.Exception -> L50
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L50
        L3a:
            int r2 = r1.read(r5)     // Catch: java.lang.Exception -> L50
            r3 = -1
            if (r3 == r2) goto L45
            r4.write(r5, r0, r2)     // Catch: java.lang.Exception -> L50
            goto L3a
        L45:
            r1.close()     // Catch: java.lang.Exception -> L50
            r4.flush()     // Catch: java.lang.Exception -> L50
            r4.close()     // Catch: java.lang.Exception -> L50
            r4 = 1
            return r4
        L50:
            r4 = move-exception
            r4.printStackTrace()
            return r0
    }

    public static void copyToClipboard(android.content.Context r1, java.lang.String r2) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            java.lang.String r0 = "content"
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r0, r2)
            r1.setPrimaryClip(r2)
            return
    }

    /* renamed from: d */
    public static int m28d(java.lang.String r1) {
            if (r1 != 0) goto L4
            java.lang.String r1 = "NULL"
        L4:
            java.lang.String r0 = "PlusNETools-------------------"
            int r1 = android.util.Log.d(r0, r1)
            return r1
    }

    public static int dip2px(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* renamed from: e */
    public static int m29e(java.lang.String r1) {
            java.lang.String r0 = "PlusNETools-------------------"
            int r1 = android.util.Log.e(r0, r1)
            return r1
    }

    public static void fullScreen(android.view.Window r1) {
            if (r1 != 0) goto L3
            return
        L3:
            r0 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r0, r0)
            return
    }

    public static android.content.pm.PackageInfo getAppInfo(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La
            return r1
        La:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
            return r1
    }

    public static long getAudioFileVoiceTime(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L24
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto Lb
            goto L24
        Lb:
            android.media.MediaPlayer r2 = new android.media.MediaPlayer
            r2.<init>()
            r2.setDataSource(r3)     // Catch: java.io.IOException -> L1b
            r2.prepare()     // Catch: java.io.IOException -> L1b
            int r3 = r2.getDuration()     // Catch: java.io.IOException -> L1b
            long r0 = (long) r3
        L1b:
            r2.stop()
            r2.reset()
            r2.release()
        L24:
            return r0
    }

    public static android.os.Handler getMainHandler() {
            android.os.Handler r0 = com.usidqw.qwerklj.Utils.Tools.handler
            if (r0 != 0) goto Lb
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.usidqw.qwerklj.Utils.Tools.handler = r0
        Lb:
            android.os.Handler r0 = com.usidqw.qwerklj.Utils.Tools.handler
            return r0
    }

    public static java.lang.String getQiniuSign(java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            java.lang.String r0 = "\\?"
            java.lang.String[] r5 = r5.split(r0)
            r0 = 0
            r5 = r5[r0]
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = r0.getTimeInMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = (long) r6
            long r0 = r0 + r2
            java.lang.String r6 = java.lang.Long.toHexString(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = md5(r7)
            java.lang.String r7 = r7.toLowerCase()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "?sign="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r5 = "&t="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public static com.usidqw.qwerklj.Json.JsonSuccess getSuccess(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L14
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.Class<com.usidqw.qwerklj.Json.JsonSuccess> r1 = com.usidqw.qwerklj.Json.JsonSuccess.class
            java.lang.Object r2 = r0.fromJson(r2, r1)
            com.usidqw.qwerklj.Json.JsonSuccess r2 = (com.usidqw.qwerklj.Json.JsonSuccess) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    public static java.lang.String getTime() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.lang.String getTime(int r6) {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = (long) r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L44
            long r2 = r2 - r0
            float r6 = (float) r2
            r0 = 1114636288(0x42700000, float:60.0)
            float r6 = r6 / r0
            float r6 = r6 / r0
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = r6 / r0
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            double r2 = (double) r6
            double r2 = java.lang.Math.ceil(r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r4 = (int) r0
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r4 = "天"
            java.lang.StringBuilder r6 = r6.append(r4)
            r4 = 4627448617123184640(0x4038000000000000, double:24.0)
            double r0 = r0 * r4
            double r2 = r2 - r0
            int r0 = (int) r2
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "小时"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
        L44:
            if (r6 != 0) goto L49
            java.lang.String r6 = "永久"
            return r6
        L49:
            java.lang.String r6 = "已到期"
            return r6
    }

    public static int getToDay() {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 5
            int r0 = r0.get(r1)
            return r0
    }

    public static void goUrl(android.content.Context r2, java.lang.String r3) {
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
            r2.startActivity(r0)
            return
    }

    /* renamed from: i */
    public static int m30i(java.lang.String r1) {
            java.lang.String r0 = "PlusNETools-------------------"
            int r1 = android.util.Log.i(r0, r1)
            return r1
    }

    public static void insertMediaPic(android.content.Context r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L7e
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Exception -> L23
            r3 = 0
            android.provider.MediaStore.Images.Media.insertImage(r5, r1, r2, r3)     // Catch: java.lang.Exception -> L23
            goto L7e
        L23:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r1 = "_data"
            java.lang.String r2 = r0.getAbsolutePath()
            r5.put(r1, r2)
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = "image/jpeg"
            r5.put(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "datetaken"
            r5.put(r2, r1)
            android.content.ContentResolver r1 = r4.getContentResolver()
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r1.insert(r2, r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file://"
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r5.<init>(r1, r0)
            r4.sendBroadcast(r5)
        L7e:
            return
    }

    public static boolean isArrayValue(java.util.List<?> r2, java.lang.Object r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r3 != 0) goto L7
            return r0
        L7:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L15
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L15
            return r0
        L15:
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L19
            r2 = 1
            return r2
        L2b:
            return r0
    }

    public static boolean isInMainThread() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isRunningForeground(android.content.Context r4) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.String r4 = r4.packageName
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            java.lang.String r3 = r2.processName
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1a
            int r2 = r2.importance
            r3 = 100
            if (r2 != r3) goto L1a
            r4 = 1
            return r4
        L36:
            return r1
    }

    public static boolean isStringArray(java.lang.String[] r4, java.lang.String r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    public static boolean is_PassOrUser(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^[0-9a-zA-Z]{6,16}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
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

    private static java.lang.String md5(java.lang.String r7) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L36
            byte[] r7 = r7.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L36
            byte[] r7 = r0.digest(r7)     // Catch: java.security.NoSuchAlgorithmException -> L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L36
            r0.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L36
            int r1 = r7.length     // Catch: java.security.NoSuchAlgorithmException -> L36
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L31
            r4 = r7[r3]     // Catch: java.security.NoSuchAlgorithmException -> L36
            java.lang.String r5 = "%02x"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.security.NoSuchAlgorithmException -> L36
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.security.NoSuchAlgorithmException -> L36
            r6[r2] = r4     // Catch: java.security.NoSuchAlgorithmException -> L36
            java.lang.String r4 = java.lang.String.format(r5, r6)     // Catch: java.security.NoSuchAlgorithmException -> L36
            r0.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L36
            int r3 = r3 + 1
            goto L16
        L31:
            java.lang.String r7 = r0.toString()     // Catch: java.security.NoSuchAlgorithmException -> L36
            return r7
        L36:
            r7 = move-exception
            r7.printStackTrace()
            r7 = 0
            return r7
    }

    public static java.lang.String pathGetType(java.lang.String r1) {
            java.lang.String r0 = "\\."
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1 = r1[r0]
            return r1
    }

    public static boolean probability(double r3) {
            java.util.Random r0 = new java.util.Random
            java.util.concurrent.ThreadLocalRandom r1 = java.util.concurrent.ThreadLocalRandom.current()
            long r1 = r1.nextLong()
            r0.<init>(r1)
            double r0 = r0.nextDouble()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
    }

    public static android.text.Spanned toHtml(java.lang.String r2) {
            if (r2 != 0) goto La
            java.lang.String r2 = ""
            r0 = 0
            android.text.Spanned r2 = android.text.Html.fromHtml(r2, r0)
            return r2
        La:
            java.lang.String r0 = "[新增]"
            java.lang.String r1 = "<font color='#27903A'>[新增]</font>"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "[适配]"
            java.lang.String r1 = "<font color='#008FD5'>[适配]</font>"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "[删除]"
            java.lang.String r1 = "<font color='#EE3B2F'>[删除]</font>"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "[优化]"
            java.lang.String r1 = "<font color='#C9AE00'>[优化]</font>"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "[修复]"
            java.lang.String r1 = "<font color='#F26A2F'>[修复]</font>"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "<br />"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\n"
            java.lang.String r2 = r2.replace(r0, r1)
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            return r2
    }

    public static void toZip(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L23
            r1.<init>(r3)     // Catch: java.lang.Exception -> L23
            java.util.zip.ZipOutputStream r3 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Exception -> L24
            r3.<init>(r1)     // Catch: java.lang.Exception -> L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L21
            r0.<init>(r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Exception -> L21
            compress(r0, r3, r2)     // Catch: java.lang.Exception -> L21
            r3.flush()     // Catch: java.lang.Exception -> L21
            r3.close()     // Catch: java.lang.Exception -> L21
            r1.close()     // Catch: java.lang.Exception -> L21
            goto L35
        L21:
            r0 = r3
            goto L24
        L23:
            r1 = r0
        L24:
            if (r0 == 0) goto L2c
            r0.close()     // Catch: java.io.IOException -> L2a
            goto L2c
        L2a:
            r2 = move-exception
            goto L32
        L2c:
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.io.IOException -> L2a
            goto L35
        L32:
            r2.printStackTrace()
        L35:
            return
    }

    /* renamed from: v */
    public static int m31v(java.lang.String r1) {
            java.lang.String r0 = "PlusNETools-------------------"
            int r1 = android.util.Log.v(r0, r1)
            return r1
    }

    /* renamed from: w */
    public static int m32w(java.lang.String r1) {
            java.lang.String r0 = "PlusNETools-------------------"
            int r1 = android.util.Log.w(r0, r1)
            return r1
    }
}
