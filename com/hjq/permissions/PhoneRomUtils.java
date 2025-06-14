package com.hjq.permissions;

/* loaded from: classes.dex */
final class PhoneRomUtils {
    private static final java.lang.String[] ROM_360 = null;
    private static final java.lang.String[] ROM_HUAWEI = null;
    private static final java.lang.String[] ROM_LEECO = null;
    private static final java.lang.String ROM_NAME_MIUI = "ro.miui.ui.version.name";
    private static final java.lang.String[] ROM_NUBIA = null;
    private static final java.lang.String[] ROM_ONEPLUS = null;
    private static final java.lang.String[] ROM_OPPO = null;
    private static final java.lang.String[] ROM_SAMSUNG = null;
    private static final java.lang.String[] ROM_VIVO = null;
    private static final java.lang.String[] ROM_XIAOMI = null;
    private static final java.lang.String[] ROM_ZTE = null;
    private static final java.lang.String VERSION_PROPERTY_360 = "ro.build.uiversion";
    private static final java.lang.String VERSION_PROPERTY_HUAWEI = "ro.build.version.emui";
    private static final java.lang.String VERSION_PROPERTY_LEECO = "ro.letv.release.version";
    private static final java.lang.String VERSION_PROPERTY_NUBIA = "ro.build.rom.id";
    private static final java.lang.String VERSION_PROPERTY_ONEPLUS = "ro.rom.version";
    private static final java.lang.String[] VERSION_PROPERTY_OPPO = null;
    private static final java.lang.String VERSION_PROPERTY_VIVO = "ro.vivo.os.build.display.id";
    private static final java.lang.String VERSION_PROPERTY_XIAOMI = "ro.build.version.incremental";
    private static final java.lang.String VERSION_PROPERTY_ZTE = "ro.build.MiFavor_version";

    static {
            java.lang.String r0 = "huawei"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_HUAWEI = r0
            java.lang.String r0 = "vivo"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_VIVO = r0
            java.lang.String r0 = "xiaomi"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_XIAOMI = r0
            java.lang.String r0 = "oppo"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_OPPO = r0
            java.lang.String r0 = "leeco"
            java.lang.String r1 = "letv"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.hjq.permissions.PhoneRomUtils.ROM_LEECO = r0
            java.lang.String r0 = "360"
            java.lang.String r1 = "qiku"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.hjq.permissions.PhoneRomUtils.ROM_360 = r0
            java.lang.String r0 = "zte"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_ZTE = r0
            java.lang.String r0 = "oneplus"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_ONEPLUS = r0
            java.lang.String r0 = "nubia"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_NUBIA = r0
            java.lang.String r0 = "samsung"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.hjq.permissions.PhoneRomUtils.ROM_SAMSUNG = r0
            java.lang.String r0 = "ro.build.version.opporom"
            java.lang.String r1 = "ro.build.version.oplusrom.display"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.hjq.permissions.PhoneRomUtils.VERSION_PROPERTY_OPPO = r0
            return
    }

    private PhoneRomUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getBrand() {
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    private static java.lang.String getManufacturer() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    private static java.lang.String getPropertyName(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb
            java.lang.String r1 = getSystemProperty(r1)
            goto Ld
        Lb:
            java.lang.String r1 = ""
        Ld:
            return r1
    }

    static java.lang.String getRomVersionName() {
            java.lang.String r0 = getBrand()
            java.lang.String r1 = getManufacturer()
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_HUAWEI
            boolean r2 = isRightRom(r0, r1, r2)
            java.lang.String r3 = ""
            if (r2 == 0) goto L34
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = getPropertyName(r0)
            java.lang.String r1 = "_"
            java.lang.String[] r1 = r0.split(r1)
            int r2 = r1.length
            r4 = 1
            if (r2 <= r4) goto L25
            r0 = r1[r4]
            return r0
        L25:
            java.lang.String r1 = "EmotionUI"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L33
            java.lang.String r1 = "EmotionUI\\s*"
            java.lang.String r0 = r0.replaceFirst(r1, r3)
        L33:
            return r0
        L34:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_VIVO
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto L43
            java.lang.String r0 = "ro.vivo.os.build.display.id"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        L43:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_XIAOMI
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto L52
            java.lang.String r0 = "ro.build.version.incremental"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        L52:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_OPPO
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto L71
            java.lang.String[] r0 = com.hjq.permissions.PhoneRomUtils.VERSION_PROPERTY_OPPO
            int r1 = r0.length
            r2 = 0
        L5e:
            if (r2 >= r1) goto L70
            r4 = r0[r2]
            java.lang.String r5 = getPropertyName(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L6f
            int r2 = r2 + 1
            goto L5e
        L6f:
            return r5
        L70:
            return r3
        L71:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_LEECO
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto L80
            java.lang.String r0 = "ro.letv.release.version"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        L80:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_360
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto L8f
            java.lang.String r0 = "ro.build.uiversion"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        L8f:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_ZTE
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto L9e
            java.lang.String r0 = "ro.build.MiFavor_version"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        L9e:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_ONEPLUS
            boolean r2 = isRightRom(r0, r1, r2)
            if (r2 == 0) goto Lad
            java.lang.String r0 = "ro.rom.version"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        Lad:
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_NUBIA
            boolean r0 = isRightRom(r0, r1, r2)
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "ro.build.rom.id"
            java.lang.String r0 = getPropertyName(r0)
            return r0
        Lbc:
            java.lang.String r0 = getPropertyName(r3)
            return r0
    }

    private static java.lang.String getSystemProperty(java.lang.String r3) {
            java.lang.String r0 = getSystemPropertyByShell(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = getSystemPropertyByStream(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            return r0
        L16:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L21
            java.lang.String r3 = getSystemPropertyByReflect(r3)
            return r3
        L21:
            return r0
    }

    private static java.lang.String getSystemPropertyByReflect(java.lang.String r8) {
            java.lang.String r0 = ""
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            r3[r6] = r8     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            r3[r7] = r0     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.Object r8 = r2.invoke(r1, r3)     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.IllegalAccessException -> L28 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L32 java.lang.ClassNotFoundException -> L37
            return r8
        L28:
            r8 = move-exception
            r8.printStackTrace()
            goto L3b
        L2d:
            r8 = move-exception
            r8.printStackTrace()
            goto L3b
        L32:
            r8 = move-exception
            r8.printStackTrace()
            goto L3b
        L37:
            r8 = move-exception
            r8.printStackTrace()
        L3b:
            return r0
    }

    private static java.lang.String getSystemPropertyByShell(java.lang.String r4) {
            java.lang.String r0 = "getprop "
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.StringBuilder r4 = r3.append(r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.Process r4 = r2.exec(r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.String r4 = r0.readLine()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r4 == 0) goto L37
            r0.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r0 = move-exception
            r0.printStackTrace()
        L36:
            return r4
        L37:
            r0.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L3b:
            r4 = move-exception
            r1 = r0
            goto L54
        L3e:
            r4 = move-exception
            r1 = r0
            goto L44
        L41:
            r4 = move-exception
            goto L54
        L43:
            r4 = move-exception
        L44:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r4 = move-exception
            r4.printStackTrace()
        L51:
            java.lang.String r4 = ""
            return r4
        L54:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            r0.printStackTrace()
        L5e:
            throw r4
    }

    private static java.lang.String getSystemPropertyByStream(java.lang.String r6) {
            java.lang.String r0 = ""
            java.util.Properties r1 = new java.util.Properties     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            r1.<init>()     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            r2.<init>(r3)     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            r1.load(r2)     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            java.lang.String r6 = r1.getProperty(r6, r0)     // Catch: java.io.IOException -> L1f java.io.FileNotFoundException -> L24
            return r6
        L1f:
            r6 = move-exception
            r6.printStackTrace()
            goto L28
        L24:
            r6 = move-exception
            r6.printStackTrace()
        L28:
            return r0
    }

    static boolean isColorOs() {
            java.lang.String[] r0 = com.hjq.permissions.PhoneRomUtils.VERSION_PROPERTY_OPPO
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            java.lang.String r4 = getPropertyName(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L16
            int r3 = r3 + 1
            goto L5
        L16:
            r0 = 1
            return r0
        L18:
            return r2
    }

    static boolean isEmui() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = getPropertyName(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    static boolean isHarmonyOs() {
            r0 = 0
            java.lang.String r1 = "com.huawei.system.BuildEx"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "getOsBrand"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Harmony"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L20
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L20
            return r0
        L20:
            r1 = move-exception
            r1.printStackTrace()
            return r0
    }

    static boolean isMiui() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = getPropertyName(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    static boolean isMiuiOptimization() {
            r0 = 1
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r5 = "ro.miui.cts"
            r4[r6] = r5     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r5 = ""
            r4[r0] = r5     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Object r2 = r2.invoke(r1, r4)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r4 = "getBoolean"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r5[r6] = r7     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            r5[r0] = r7     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r5 = "persist.sys.miui_optimization"
            r3[r6] = r5     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r5 = "1"
            boolean r2 = r5.equals(r2)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            if (r2 != 0) goto L4a
            r6 = r0
        L4a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            r3[r0] = r2     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.Object r1 = r4.invoke(r1, r3)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            boolean r0 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62 java.lang.reflect.InvocationTargetException -> L67 java.lang.ClassNotFoundException -> L6c
            return r0
        L5d:
            r1 = move-exception
            r1.printStackTrace()
            goto L70
        L62:
            r1 = move-exception
            r1.printStackTrace()
            goto L70
        L67:
            r1 = move-exception
            r1.printStackTrace()
            goto L70
        L6c:
            r1 = move-exception
            r1.printStackTrace()
        L70:
            return r0
    }

    static boolean isOneUi() {
            java.lang.String r0 = getBrand()
            java.lang.String r1 = getManufacturer()
            java.lang.String[] r2 = com.hjq.permissions.PhoneRomUtils.ROM_SAMSUNG
            boolean r0 = isRightRom(r0, r1, r2)
            return r0
    }

    static boolean isOriginOs() {
            java.lang.String r0 = "ro.vivo.os.build.display.id"
            java.lang.String r0 = getPropertyName(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    private static boolean isRightRom(java.lang.String r5, java.lang.String r6, java.lang.String... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L19
            r3 = r7[r2]
            boolean r4 = r5.contains(r3)
            if (r4 != 0) goto L17
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L14
            goto L17
        L14:
            int r2 = r2 + 1
            goto L3
        L17:
            r5 = 1
            return r5
        L19:
            return r1
    }
}
