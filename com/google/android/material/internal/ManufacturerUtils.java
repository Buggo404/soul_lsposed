package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ManufacturerUtils {
    private static final java.lang.String LGE = "lge";
    private static final java.lang.String MEIZU = "meizu";
    private static final java.lang.String SAMSUNG = "samsung";

    private ManufacturerUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
            boolean r0 = isLGEDevice()
            if (r0 != 0) goto Lf
            boolean r0 = isSamsungDevice()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public static boolean isLGEDevice() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "lge"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isMeizuDevice() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "meizu"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isSamsungDevice() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "samsung"
            boolean r0 = r0.equals(r1)
            return r0
    }
}
