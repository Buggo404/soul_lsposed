package lombok.launch;

/* loaded from: classes.dex */
class Main {
    private static lombok.launch.ShadowClassLoader classLoader;

    Main() {
            r0 = this;
            r0.<init>()
            return
    }

    static synchronized java.lang.ClassLoader getShadowClassLoader() {
            java.lang.Class<lombok.launch.Main> r0 = lombok.launch.Main.class
            monitor-enter(r0)
            lombok.launch.ShadowClassLoader r1 = lombok.launch.Main.classLoader     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L29
            lombok.launch.ShadowClassLoader r1 = new lombok.launch.ShadowClassLoader     // Catch: java.lang.Throwable -> L2d
            java.lang.Class<lombok.launch.Main> r2 = lombok.launch.Main.class
            java.lang.ClassLoader r3 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "lombok"
            r5 = 0
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L2d
            java.util.List r6 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "lombok.patcher.Symbols"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L2d
            java.util.List r7 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L2d
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d
            lombok.launch.Main.classLoader = r1     // Catch: java.lang.Throwable -> L2d
        L29:
            lombok.launch.ShadowClassLoader r1 = lombok.launch.Main.classLoader     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            return r1
        L2d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static void main(java.lang.String[] r6) throws java.lang.Throwable {
            java.lang.ClassLoader r0 = getShadowClassLoader()
            java.lang.String r1 = "lombok.core.Main"
            java.lang.Class r0 = r0.loadClass(r1)
            java.lang.String r1 = "main"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L21
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L21
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L21
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L21
            r1[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L21
            r6 = 0
            r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L21
            return
        L21:
            r6 = move-exception
            java.lang.Throwable r6 = r6.getCause()
            throw r6
    }

    static synchronized void prependClassLoader(java.lang.ClassLoader r2) {
            java.lang.Class<lombok.launch.Main> r0 = lombok.launch.Main.class
            monitor-enter(r0)
            getShadowClassLoader()     // Catch: java.lang.Throwable -> Ld
            lombok.launch.ShadowClassLoader r1 = lombok.launch.Main.classLoader     // Catch: java.lang.Throwable -> Ld
            r1.prependParent(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
