package com.hjq.permissions;

/* loaded from: classes.dex */
final class AndroidVersion {
    static final int ANDROID_10 = 29;
    static final int ANDROID_11 = 30;
    static final int ANDROID_12 = 31;
    static final int ANDROID_12_L = 32;
    static final int ANDROID_13 = 33;
    static final int ANDROID_4_0 = 14;
    static final int ANDROID_4_1 = 16;
    static final int ANDROID_4_2 = 17;
    static final int ANDROID_4_3 = 18;
    static final int ANDROID_4_4 = 19;
    static final int ANDROID_5 = 21;
    static final int ANDROID_5_1 = 22;
    static final int ANDROID_6 = 23;
    static final int ANDROID_7 = 24;
    static final int ANDROID_7_1 = 25;
    static final int ANDROID_8 = 26;
    static final int ANDROID_8_1 = 27;
    static final int ANDROID_9 = 28;

    AndroidVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    static int getAndroidVersionCode() {
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    static int getTargetSdkVersionCode(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            return r0
    }

    static boolean isAndroid10() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAndroid11() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAndroid12() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAndroid13() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAndroid4() {
            r0 = 1
            return r0
    }

    static boolean isAndroid4_2() {
            r0 = 1
            return r0
    }

    static boolean isAndroid4_3() {
            r0 = 1
            return r0
    }

    static boolean isAndroid4_4() {
            r0 = 1
            return r0
    }

    static boolean isAndroid5() {
            r0 = 1
            return r0
    }

    static boolean isAndroid5_1() {
            r0 = 1
            return r0
    }

    static boolean isAndroid6() {
            r0 = 1
            return r0
    }

    static boolean isAndroid7() {
            r0 = 1
            return r0
    }

    static boolean isAndroid7_1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAndroid8() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAndroid9() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
