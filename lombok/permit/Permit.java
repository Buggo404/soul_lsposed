package lombok.permit;

/* loaded from: com.usidqw.qwerklj.apk:lombok/permit/Permit.SCL.lombok */
public class Permit {
    private static final long ACCESSIBLE_OVERRIDE_FIELD_OFFSET = 0;
    private static final java.lang.IllegalAccessException INIT_ERROR = null;
    private static final sun.misc.Unsafe UNSAFE = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/permit/Permit$Fake.SCL.lombok */
    static class Fake {
        boolean override;
        java.lang.Object accessCheckCache;

        Fake() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.String r1 = "theUnsafe"
            java.lang.Object r0 = reflectiveStaticFieldAccess(r0, r1)
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            lombok.permit.Permit.UNSAFE = r0
            long r0 = getOverrideFieldOffset()     // Catch: java.lang.Throwable -> L16
            r4 = r0
            r0 = 0
            r6 = r0
            goto L1f
        L16:
            r7 = move-exception
            r0 = 0
            r0 = -1
            r4 = r0
            r0 = r7
            r6 = r0
        L1f:
            r0 = r4
            lombok.permit.Permit.ACCESSIBLE_OVERRIDE_FIELD_OFFSET = r0
            r0 = r6
            if (r0 != 0) goto L2e
            r0 = 0
            lombok.permit.Permit.INIT_ERROR = r0
            goto L53
        L2e:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.IllegalAccessException
            if (r0 == 0) goto L3f
            r0 = r6
            java.lang.IllegalAccessException r0 = (java.lang.IllegalAccessException) r0
            lombok.permit.Permit.INIT_ERROR = r0
            goto L53
        L3f:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException
            r1 = r0
            java.lang.String r2 = "Cannot initialize Unsafe-based permit"
            r1.<init>(r2)
            lombok.permit.Permit.INIT_ERROR = r0
            java.lang.IllegalAccessException r0 = lombok.permit.Permit.INIT_ERROR
            r1 = r6
            java.lang.Throwable r0 = r0.initCause(r1)
        L53:
            return
    }

    private Permit() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static <T extends java.lang.reflect.AccessibleObject> T setAccessible(T r6) {
            java.lang.IllegalAccessException r0 = lombok.permit.Permit.INIT_ERROR
            if (r0 != 0) goto L14
            sun.misc.Unsafe r0 = lombok.permit.Permit.UNSAFE
            r1 = r6
            long r2 = lombok.permit.Permit.ACCESSIBLE_OVERRIDE_FIELD_OFFSET
            r3 = 1
            r0.putBoolean(r1, r2, r3)
            goto L19
        L14:
            r0 = r6
            r1 = 1
            r0.setAccessible(r1)
        L19:
            r0 = r6
            return r0
    }

    private static long getOverrideFieldOffset() throws java.lang.Throwable {
            r0 = 0
            r4 = r0
            r0 = 0
            r5 = r0
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "override"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Lf
            r4 = r0
            goto L12
        Lf:
            r6 = move-exception
            r0 = r6
            r5 = r0
        L12:
            r0 = r4
            if (r0 == 0) goto L1e
            sun.misc.Unsafe r0 = lombok.permit.Permit.UNSAFE
            r1 = r4
            long r0 = r0.objectFieldOffset(r1)
            return r0
        L1e:
            sun.misc.Unsafe r0 = lombok.permit.Permit.UNSAFE     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<lombok.permit.Permit$Fake> r1 = lombok.permit.Permit.Fake.class
            java.lang.String r2 = "override"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L2c
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            r0 = r5
            throw r0
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) throws java.lang.NoSuchMethodException {
            r0 = 0
            r9 = r0
            r0 = r6
            r10 = r0
            goto L18
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L12
            r9 = r0
            goto L1c
        L12:
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            r6 = r0
        L18:
            r0 = r6
            if (r0 != 0) goto L8
        L1c:
            r0 = r9
            if (r0 != 0) goto L48
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r10
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = " :: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "(args)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L48:
            r0 = r9
            java.lang.reflect.AccessibleObject r0 = setAccessible(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    public static java.lang.reflect.Method permissiveGetMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class<?>... r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static java.lang.reflect.Field getField(java.lang.Class<?> r6, java.lang.String r7) throws java.lang.NoSuchFieldException {
            r0 = 0
            r8 = r0
            r0 = r6
            r9 = r0
            goto L16
        L7:
            r0 = r6
            r1 = r7
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L10
            r8 = r0
            goto L1a
        L10:
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            r6 = r0
        L16:
            r0 = r6
            if (r0 != 0) goto L7
        L1a:
            r0 = r8
            if (r0 != 0) goto L40
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r9
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = " :: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L40:
            r0 = r8
            java.lang.reflect.AccessibleObject r0 = setAccessible(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            return r0
    }

    public static java.lang.reflect.Field permissiveGetField(java.lang.Class<?> r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            java.lang.reflect.Field r0 = getField(r0, r1)     // Catch: java.lang.Exception -> L6
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static <T> T permissiveReadField(java.lang.Class<T> r4, java.lang.reflect.Field r5, java.lang.Object r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> La
            java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Exception -> La
            return r0
        La:
            r0 = 0
            return r0
    }

    public static <T> java.lang.reflect.Constructor<T> getConstructor(java.lang.Class<T> r3, java.lang.Class<?>... r4) throws java.lang.NoSuchMethodException {
            r0 = r3
            r1 = r4
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)
            java.lang.reflect.AccessibleObject r0 = setAccessible(r0)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            return r0
    }

    private static java.lang.Object reflectiveStaticFieldAccess(java.lang.Class<?> r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L11
            r5 = r0
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L11
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static boolean isDebugReflection() {
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.debug.reflection"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    public static void handleReflectionDebug(java.lang.Throwable r5, java.lang.Throwable r6) {
            boolean r0 = isDebugReflection()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "** LOMBOK REFLECTION exception: "
            r2.<init>(r3)
            r2 = r5
            java.lang.Class r2 = r2.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L2b
            java.lang.String r2 = "(no message)"
            goto L2f
        L2b:
            r2 = r5
            java.lang.String r2 = r2.getMessage()
        L2f:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            r0 = r6
            if (r0 == 0) goto L52
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "*** ADDITIONALLY, exception occurred setting up reflection: "
            r0.println(r1)
            r0 = r6
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
        L52:
            return
    }

    public static java.lang.Object invoke(java.lang.reflect.Method r5, java.lang.Object r6, java.lang.Object... r7) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r0 = 0
            r1 = r5
            r2 = r6
            r3 = r7
            java.lang.Object r0 = invoke(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.Object invoke(java.lang.Throwable r4, java.lang.reflect.Method r5, java.lang.Object r6, java.lang.Object... r7) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L7 java.lang.RuntimeException -> L12 java.lang.Error -> L1d
            return r0
        L7:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = r8
            throw r0
        L12:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = r8
            throw r0
        L1d:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = r8
            throw r0
    }

    public static java.lang.Object invokeSneaky(java.lang.reflect.Method r5, java.lang.Object r6, java.lang.Object... r7) {
            r0 = 0
            r1 = r5
            r2 = r6
            r3 = r7
            java.lang.Object r0 = invokeSneaky(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.Object invokeSneaky(java.lang.Throwable r4, java.lang.reflect.Method r5, java.lang.Object r6, java.lang.Object... r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L7 java.lang.NullPointerException -> L11 java.lang.IllegalAccessException -> L1b java.lang.reflect.InvocationTargetException -> L29 java.lang.RuntimeException -> L34 java.lang.Error -> L3f
            return r0
        L7:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = 0
            return r0
        L11:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = 0
            return r0
        L1b:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = r8
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L29:
            r8 = move-exception
            r0 = r8
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L34:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = r8
            throw r0
        L3f:
            r8 = move-exception
            r0 = r8
            r1 = r4
            handleReflectionDebug(r0, r1)
            r0 = r8
            throw r0
    }

    public static <T> T newInstance(java.lang.reflect.Constructor<T> r4, java.lang.Object... r5) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            r0 = 0
            r1 = r4
            r2 = r5
            java.lang.Object r0 = newInstance(r0, r1, r2)
            return r0
    }

    public static <T> T newInstance(java.lang.Throwable r3, java.lang.reflect.Constructor<T> r4, java.lang.Object... r5) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            r0 = r4
            r1 = r5
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.IllegalAccessException -> L6 java.lang.InstantiationException -> Le java.lang.RuntimeException -> L16 java.lang.Error -> L1e
            return r0
        L6:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            throw r0
        Le:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            throw r0
        L16:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            throw r0
        L1e:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            throw r0
    }

    public static <T> T newInstanceSneaky(java.lang.reflect.Constructor<T> r4, java.lang.Object... r5) {
            r0 = 0
            r1 = r4
            r2 = r5
            java.lang.Object r0 = newInstanceSneaky(r0, r1, r2)
            return r0
    }

    public static <T> T newInstanceSneaky(java.lang.Throwable r3, java.lang.reflect.Constructor<T> r4, java.lang.Object... r5) {
            r0 = r4
            r1 = r5
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoClassDefFoundError -> L6 java.lang.NullPointerException -> Le java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L21 java.lang.reflect.InvocationTargetException -> L2c java.lang.RuntimeException -> L35 java.lang.Error -> L3d
            return r0
        L6:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = 0
            return r0
        Le:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = 0
            return r0
        L16:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L21:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L2c:
            r6 = move-exception
            r0 = r6
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L35:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            throw r0
        L3d:
            r6 = move-exception
            r0 = r6
            r1 = r3
            handleReflectionDebug(r0, r1)
            r0 = r6
            throw r0
    }

    public static java.lang.Object get(java.lang.reflect.Field r3, java.lang.Object r4) throws java.lang.IllegalAccessException {
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L6 java.lang.RuntimeException -> Le java.lang.Error -> L16
            return r0
        L6:
            r5 = move-exception
            r0 = r5
            r1 = 0
            handleReflectionDebug(r0, r1)
            r0 = r5
            throw r0
        Le:
            r5 = move-exception
            r0 = r5
            r1 = 0
            handleReflectionDebug(r0, r1)
            r0 = r5
            throw r0
        L16:
            r5 = move-exception
            r0 = r5
            r1 = 0
            handleReflectionDebug(r0, r1)
            r0 = r5
            throw r0
    }

    public static void set(java.lang.reflect.Field r4, java.lang.Object r5, java.lang.Object r6) throws java.lang.IllegalAccessException {
            r0 = r4
            r1 = r5
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L9 java.lang.RuntimeException -> L11 java.lang.Error -> L19
            goto L21
        L9:
            r7 = move-exception
            r0 = r7
            r1 = 0
            handleReflectionDebug(r0, r1)
            r0 = r7
            throw r0
        L11:
            r7 = move-exception
            r0 = r7
            r1 = 0
            handleReflectionDebug(r0, r1)
            r0 = r7
            throw r0
        L19:
            r7 = move-exception
            r0 = r7
            r1 = 0
            handleReflectionDebug(r0, r1)
            r0 = r7
            throw r0
        L21:
            return
    }

    public static void reportReflectionProblem(java.lang.Throwable r5, java.lang.String r6) {
            boolean r0 = isDebugReflection()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "** LOMBOK REFLECTION issue: "
            r2.<init>(r3)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            if (r0 == 0) goto L31
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "*** ADDITIONALLY, exception occurred setting up reflection: "
            r0.println(r1)
            r0 = r5
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
        L31:
            return
    }

    public static java.lang.RuntimeException sneakyThrow(java.lang.Throwable r4) {
            r0 = r4
            if (r0 != 0) goto Lf
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "t"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r4
            java.lang.Throwable r0 = sneakyThrow0(r0)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            return r0
    }

    private static <T extends java.lang.Throwable> T sneakyThrow0(java.lang.Throwable r2) throws java.lang.Throwable {
            r0 = r2
            throw r0
    }
}
