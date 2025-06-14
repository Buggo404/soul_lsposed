package androidx.core.text;

/* loaded from: classes.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    static {
            return
    }

    private ICUCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String addLikelySubtags(java.util.Locale r4) {
            java.lang.String r0 = "ICUCompat"
            java.lang.String r4 = r4.toString()
            java.lang.reflect.Method r1 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            if (r1 == 0) goto L21
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            return r1
        L18:
            r1 = move-exception
            android.util.Log.w(r0, r1)
            goto L21
        L1d:
            r1 = move-exception
            android.util.Log.w(r0, r1)
        L21:
            return r4
    }

    private static java.lang.String getScript(java.lang.String r5) {
            java.lang.String r0 = "ICUCompat"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.core.text.ICUCompat.sGetScriptMethod     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            if (r2 == 0) goto L1d
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.Object r5 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            return r5
        L14:
            r5 = move-exception
            android.util.Log.w(r0, r5)
            goto L1d
        L19:
            r5 = move-exception
            android.util.Log.w(r0, r5)
        L1d:
            return r1
    }

    public static java.lang.String maximizeAndGetScript(java.util.Locale r0) {
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r0)
            android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
            java.lang.String r0 = r0.getScript()
            return r0
    }
}
