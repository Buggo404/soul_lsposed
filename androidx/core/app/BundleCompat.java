package androidx.core.app;

/* loaded from: classes.dex */
public final class BundleCompat {

    static class BundleCompatBaseImpl {
        private static final java.lang.String TAG = "BundleCompatBaseImpl";
        private static java.lang.reflect.Method sGetIBinderMethod;
        private static boolean sGetIBinderMethodFetched;
        private static java.lang.reflect.Method sPutIBinderMethod;
        private static boolean sPutIBinderMethodFetched;

        private BundleCompatBaseImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.IBinder getBinder(android.os.Bundle r7, java.lang.String r8) {
                boolean r0 = androidx.core.app.BundleCompat.BundleCompatBaseImpl.sGetIBinderMethodFetched
                r1 = 0
                java.lang.String r2 = "BundleCompatBaseImpl"
                r3 = 1
                if (r0 != 0) goto L24
                java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
                java.lang.String r4 = "getIBinder"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1c
                androidx.core.app.BundleCompat.BundleCompatBaseImpl.sGetIBinderMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1c
                r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L1c
                goto L22
            L1c:
                r0 = move-exception
                java.lang.String r4 = "Failed to retrieve getIBinder method"
                android.util.Log.i(r2, r4, r0)
            L22:
                androidx.core.app.BundleCompat.BundleCompatBaseImpl.sGetIBinderMethodFetched = r3
            L24:
                java.lang.reflect.Method r0 = androidx.core.app.BundleCompat.BundleCompatBaseImpl.sGetIBinderMethod
                r4 = 0
                if (r0 == 0) goto L40
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L38
                r3[r1] = r8     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L38
                java.lang.Object r7 = r0.invoke(r7, r3)     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L38
                android.os.IBinder r7 = (android.os.IBinder) r7     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L38
                return r7
            L34:
                r7 = move-exception
                goto L39
            L36:
                r7 = move-exception
                goto L39
            L38:
                r7 = move-exception
            L39:
                java.lang.String r8 = "Failed to invoke getIBinder via reflection"
                android.util.Log.i(r2, r8, r7)
                androidx.core.app.BundleCompat.BundleCompatBaseImpl.sGetIBinderMethod = r4
            L40:
                return r4
        }

        public static void putBinder(android.os.Bundle r8, java.lang.String r9, android.os.IBinder r10) {
                boolean r0 = androidx.core.app.BundleCompat.BundleCompatBaseImpl.sPutIBinderMethodFetched
                r1 = 0
                java.lang.String r2 = "BundleCompatBaseImpl"
                r3 = 2
                r4 = 1
                if (r0 != 0) goto L29
                java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
                java.lang.String r5 = "putIBinder"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r6[r1] = r7     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
                r6[r4] = r7     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L21
                androidx.core.app.BundleCompat.BundleCompatBaseImpl.sPutIBinderMethod = r0     // Catch: java.lang.NoSuchMethodException -> L21
                r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L21
                goto L27
            L21:
                r0 = move-exception
                java.lang.String r5 = "Failed to retrieve putIBinder method"
                android.util.Log.i(r2, r5, r0)
            L27:
                androidx.core.app.BundleCompat.BundleCompatBaseImpl.sPutIBinderMethodFetched = r4
            L29:
                java.lang.reflect.Method r0 = androidx.core.app.BundleCompat.BundleCompatBaseImpl.sPutIBinderMethod
                if (r0 == 0) goto L44
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                r3[r1] = r9     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                r3[r4] = r10     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                r0.invoke(r8, r3)     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                goto L44
            L37:
                r8 = move-exception
                goto L3c
            L39:
                r8 = move-exception
                goto L3c
            L3b:
                r8 = move-exception
            L3c:
                java.lang.String r9 = "Failed to invoke putIBinder via reflection"
                android.util.Log.i(r2, r9, r8)
                r8 = 0
                androidx.core.app.BundleCompat.BundleCompatBaseImpl.sPutIBinderMethod = r8
            L44:
                return
        }
    }

    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.IBinder getBinder(android.os.Bundle r0, java.lang.String r1) {
            android.os.IBinder r0 = r0.getBinder(r1)
            return r0
    }

    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
