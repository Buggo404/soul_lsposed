package androidx.core.os;

/* loaded from: classes.dex */
public final class ProcessCompat {

    static class Api16Impl {
        private static java.lang.reflect.Method sMethodUserIdIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api16Impl.sResolvedLock = r0
                return
        }

        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r7) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api16Impl.sResolvedLock     // Catch: java.lang.Exception -> L43
                monitor-enter(r1)     // Catch: java.lang.Exception -> L43
                boolean r2 = androidx.core.os.ProcessCompat.Api16Impl.sResolved     // Catch: java.lang.Throwable -> L40
                r3 = 0
                if (r2 != 0) goto L1f
                androidx.core.os.ProcessCompat.Api16Impl.sResolved = r0     // Catch: java.lang.Throwable -> L40
                java.lang.String r2 = "android.os.UserId"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L40
                java.lang.String r4 = "isApp"
                java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L40
                java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L40
                r5[r3] = r6     // Catch: java.lang.Throwable -> L40
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L40
                androidx.core.os.ProcessCompat.Api16Impl.sMethodUserIdIsAppMethod = r2     // Catch: java.lang.Throwable -> L40
            L1f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api16Impl.sMethodUserIdIsAppMethod     // Catch: java.lang.Exception -> L43
                if (r1 == 0) goto L47
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L43
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L43
                r2[r3] = r7     // Catch: java.lang.Exception -> L43
                r7 = 0
                java.lang.Object r7 = r1.invoke(r7, r2)     // Catch: java.lang.Exception -> L43
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L43
                if (r7 == 0) goto L3a
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L43
                return r7
            L3a:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L43
                r7.<init>()     // Catch: java.lang.Exception -> L43
                throw r7     // Catch: java.lang.Exception -> L43
            L40:
                r7 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
                throw r7     // Catch: java.lang.Exception -> L43
            L43:
                r7 = move-exception
                r7.printStackTrace()
            L47:
                return r0
        }
    }

    static class Api17Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api17Impl.sResolvedLock = r0
                return
        }

        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r7) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api17Impl.sResolvedLock     // Catch: java.lang.Exception -> L3b
                monitor-enter(r1)     // Catch: java.lang.Exception -> L3b
                boolean r2 = androidx.core.os.ProcessCompat.Api17Impl.sResolved     // Catch: java.lang.Throwable -> L38
                r3 = 0
                if (r2 != 0) goto L1b
                androidx.core.os.ProcessCompat.Api17Impl.sResolved = r0     // Catch: java.lang.Throwable -> L38
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r4 = "isApp"
                java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L38
                java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L38
                r5[r3] = r6     // Catch: java.lang.Throwable -> L38
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L38
                androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod = r2     // Catch: java.lang.Throwable -> L38
            L1b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L3b
                if (r1 == 0) goto L3f
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L3b
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3b
                r2[r3] = r7     // Catch: java.lang.Exception -> L3b
                r7 = 0
                java.lang.Object r7 = r1.invoke(r7, r2)     // Catch: java.lang.Exception -> L3b
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L3b
                if (r7 == 0) goto L32
                goto L3f
            L32:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L3b
                r7.<init>()     // Catch: java.lang.Exception -> L3b
                throw r7     // Catch: java.lang.Exception -> L3b
            L38:
                r7 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
                throw r7     // Catch: java.lang.Exception -> L3b
            L3b:
                r7 = move-exception
                r7.printStackTrace()
            L3f:
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r0) {
                boolean r0 = android.os.Process.isApplicationUid(r0)
                return r0
        }
    }

    private ProcessCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isApplicationUid(int r0) {
            boolean r0 = androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(r0)
            return r0
    }
}
