package com.google.gson.internal;

/* loaded from: classes.dex */
public class ReflectionAccessFilterHelper {

    /* renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$1 */
    static /* synthetic */ class C08001 {
    }

    private static abstract class AccessChecker {
        public static final com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker INSTANCE = null;



        static {
                boolean r0 = com.google.gson.internal.JavaVersion.isJava9OrLater()
                if (r0 == 0) goto L1c
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
                com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$1 r1 = new com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$1     // Catch: java.lang.NoSuchMethodException -> L1c
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
                goto L1d
            L1c:
                r1 = 0
            L1d:
                if (r1 != 0) goto L24
                com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2 r1 = new com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2
                r1.<init>()
            L24:
                com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.INSTANCE = r1
                return
        }

        private AccessChecker() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AccessChecker(com.google.gson.internal.ReflectionAccessFilterHelper.C08001 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean canAccess(java.lang.reflect.AccessibleObject r1, java.lang.Object r2);
    }

    private ReflectionAccessFilterHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canAccess(java.lang.reflect.AccessibleObject r1, java.lang.Object r2) {
            com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker r0 = com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.INSTANCE
            boolean r1 = r0.canAccess(r1, r2)
            return r1
    }

    public static com.google.gson.ReflectionAccessFilter.FilterResult getFilterResult(java.util.List<com.google.gson.ReflectionAccessFilter> r2, java.lang.Class<?> r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            com.google.gson.ReflectionAccessFilter r0 = (com.google.gson.ReflectionAccessFilter) r0
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = r0.check(r3)
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.INDECISIVE
            if (r0 == r1) goto L4
            return r0
        L19:
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            return r2
    }

    public static boolean isAndroidType(java.lang.Class<?> r0) {
            java.lang.String r0 = r0.getName()
            boolean r0 = isAndroidType(r0)
            return r0
    }

    private static boolean isAndroidType(java.lang.String r1) {
            java.lang.String r0 = "android."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "androidx."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L19
            boolean r1 = isJavaType(r1)
            if (r1 == 0) goto L17
            goto L19
        L17:
            r1 = 0
            goto L1a
        L19:
            r1 = 1
        L1a:
            return r1
    }

    public static boolean isAnyPlatformType(java.lang.Class<?> r1) {
            java.lang.String r1 = r1.getName()
            boolean r0 = isAndroidType(r1)
            if (r0 != 0) goto L25
            java.lang.String r0 = "kotlin."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "kotlinx."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "scala."
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L23
            goto L25
        L23:
            r1 = 0
            goto L26
        L25:
            r1 = 1
        L26:
            return r1
    }

    public static boolean isJavaType(java.lang.Class<?> r0) {
            java.lang.String r0 = r0.getName()
            boolean r0 = isJavaType(r0)
            return r0
    }

    private static boolean isJavaType(java.lang.String r1) {
            java.lang.String r0 = "java."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = "javax."
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }
}
