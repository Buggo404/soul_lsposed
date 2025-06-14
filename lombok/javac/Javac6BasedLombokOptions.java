package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/Javac6BasedLombokOptions.SCL.lombok */
public class Javac6BasedLombokOptions extends lombok.javac.LombokOptions {
    private static final java.lang.reflect.Method optionName_valueOf = null;
    private static final java.lang.reflect.Method options_put = null;

    static {
            java.lang.String r0 = "com.sun.tools.javac.main.OptionName"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L35
            r7 = r0
            r0 = r7
            java.lang.String r1 = "valueOf"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L35
            lombok.javac.Javac6BasedLombokOptions.optionName_valueOf = r0     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = "com.sun.tools.javac.util.Options"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "put"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.Exception -> L35
            r3 = r2
            r4 = 1
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L35
            lombok.javac.Javac6BasedLombokOptions.options_put = r0     // Catch: java.lang.Exception -> L35
            goto L41
        L35:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Can't initialize Javac6-based lombok options due to reflection issue."
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        L41:
            return
    }

    public static lombok.javac.Javac6BasedLombokOptions replaceWithDelombokOptions(com.sun.tools.javac.util.Context r4) {
            r0 = r4
            com.sun.tools.javac.util.Options r0 = com.sun.tools.javac.util.Options.instance(r0)
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.Javac6BasedLombokOptions.optionsKey
            r2 = 0
            r0.put(r1, r2)
            lombok.javac.Javac6BasedLombokOptions r0 = new lombok.javac.Javac6BasedLombokOptions
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.putAll(r1)
            r0 = r6
            return r0
    }

    private Javac6BasedLombokOptions(com.sun.tools.javac.util.Context r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // lombok.javac.LombokOptions
    public void putJavacOption(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            java.lang.reflect.Method r0 = lombok.javac.Javac6BasedLombokOptions.options_put     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            r1 = r12
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            r3 = r2
            r4 = 0
            java.lang.reflect.Method r5 = lombok.javac.Javac6BasedLombokOptions.optionName_valueOf     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            r6 = 0
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            r8 = r7
            r9 = 0
            r10 = r13
            r8[r9] = r10     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            java.lang.Object r5 = lombok.permit.Permit.invoke(r5, r6, r7)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            r3 = r2
            r4 = 1
            r5 = r14
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L31
            goto L3a
        L25:
            r15 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Can't initialize Javac6-based lombok options due to reflection issue."
            r3 = r15
            r1.<init>(r2, r3)
            throw r0
        L31:
            r15 = move-exception
            r0 = r15
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L3a:
            return
    }
}
