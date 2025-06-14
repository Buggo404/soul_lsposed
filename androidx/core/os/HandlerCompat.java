package androidx.core.os;

/* loaded from: classes.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    private HandlerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Handler createAsync(android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = android.os.Handler.createAsync(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L50
            return r0
        L37:
            r7 = move-exception
            java.lang.Throwable r7 = r7.getCause()
            boolean r0 = r7 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L4d
            boolean r0 = r7 instanceof java.lang.Error
            if (r0 == 0) goto L47
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L47:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L4d:
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L50:
            java.lang.String r0 = "HandlerCompat"
            java.lang.String r1 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.v(r0, r1)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }

    public static android.os.Handler createAsync(android.os.Looper r7, android.os.Handler.Callback r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = android.os.Handler.createAsync(r7, r8)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            r1[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.Throwable -> L4f
            return r0
        L36:
            r7 = move-exception
            java.lang.Throwable r7 = r7.getCause()
            boolean r8 = r7 instanceof java.lang.RuntimeException
            if (r8 != 0) goto L4c
            boolean r8 = r7 instanceof java.lang.Error
            if (r8 == 0) goto L46
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L46:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        L4c:
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L4f:
            java.lang.String r0 = "HandlerCompat"
            java.lang.String r1 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.v(r0, r1)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7, r8)
            return r0
    }

    public static boolean postDelayed(android.os.Handler r2, java.lang.Runnable r3, java.lang.Object r4, long r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = r2.postDelayed(r3, r4, r5)
            return r2
        Lb:
            android.os.Message r3 = android.os.Message.obtain(r2, r3)
            r3.obj = r4
            boolean r2 = r2.sendMessageDelayed(r3, r5)
            return r2
    }
}
