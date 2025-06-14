package lombok.launch;

/* loaded from: classes.dex */
final class Agent {
    Agent() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void agentmain(java.lang.String r1, java.lang.instrument.Instrumentation r2) throws java.lang.Throwable {
            r0 = 1
            runLauncher(r1, r2, r0)
            return
    }

    public static void premain(java.lang.String r1, java.lang.instrument.Instrumentation r2) throws java.lang.Throwable {
            r0 = 0
            runLauncher(r1, r2, r0)
            return
    }

    private static void runLauncher(java.lang.String r9, java.lang.instrument.Instrumentation r10, boolean r11) throws java.lang.Throwable {
            java.lang.ClassLoader r0 = lombok.launch.Main.getShadowClassLoader()
            java.lang.String r1 = "lombok.core.AgentLauncher"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.String r1 = "runAgents"
            r2 = 4
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Class<java.lang.instrument.Instrumentation> r4 = java.lang.instrument.Instrumentation.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            r7 = 2
            r3[r7] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r8 = 3
            r3[r8] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            r1[r5] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            r1[r6] = r10     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            r1[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Class<lombok.launch.Agent> r9 = lombok.launch.Agent.class
            r1[r8] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            r9 = 0
            r0.invoke(r9, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3c
            return
        L3c:
            r9 = move-exception
            java.lang.Throwable r9 = r9.getCause()
            throw r9
    }
}
