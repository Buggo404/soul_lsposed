package lombok.patcher.inject;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/inject/LiveInjector.SCL.lombok */
public class LiveInjector {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/inject/LiveInjector$LibInstrument.SCL.lombok */
    public interface LibInstrument extends com.sun.jna.Library {
        void Agent_OnAttach(com.sun.jna.Pointer r1, java.lang.String r2, com.sun.jna.Pointer r3);
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/inject/LiveInjector$LibJVM.SCL.lombok */
    public interface LibJVM extends com.sun.jna.Library {
        int JNI_GetCreatedJavaVMs(com.sun.jna.ptr.PointerByReference r1, int r2, com.sun.jna.ptr.IntByReference r3);
    }

    public LiveInjector() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void injectSelf() throws java.lang.IllegalStateException {
            r3 = this;
            r0 = r3
            java.lang.String r1 = lombok.patcher.ClassRootFinder.findClassRootOfSelf()
            r0.inject(r1)
            return
    }

    public void inject(java.lang.String r5) throws java.lang.IllegalStateException {
            r4 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L1a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Live Injection is not possible unless the classpath root to inject is a jar file."
            r1.<init>(r2)
            throw r0
        L1a:
            java.lang.String r0 = "lombok.patcher.safeInject"
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            if (r0 == 0) goto L2b
            r0 = r4
            r1 = r5
            r0.slowInject(r1)
            goto L30
        L2b:
            r0 = r4
            r1 = r5
            r0.fastInject(r1)
        L30:
            return
    }

    private void fastInject(java.lang.String r6) throws java.lang.IllegalStateException {
            r5 = this;
            java.lang.String r0 = "sun.instrument.InstrumentationImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L9
            goto L14
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "agent injection only works on a sun-derived 1.6 or higher VM"
            r1.<init>(r2)
            throw r0
        L14:
            java.lang.Class<lombok.patcher.inject.LiveInjector$LibJVM> r0 = lombok.patcher.inject.LiveInjector.LibJVM.class
            com.sun.jna.Library r0 = com.sun.jna.Native.load(r0)
            lombok.patcher.inject.LiveInjector$LibJVM r0 = (lombok.patcher.inject.LiveInjector.LibJVM) r0
            r7 = r0
            com.sun.jna.ptr.PointerByReference r0 = new com.sun.jna.ptr.PointerByReference
            r1 = r0
            r1.<init>()
            r8 = r0
            com.sun.jna.ptr.IntByReference r0 = new com.sun.jna.ptr.IntByReference
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            r1 = r8
            r2 = 1
            r3 = r9
            int r0 = r0.JNI_GetCreatedJavaVMs(r1, r2, r3)
            java.lang.Class<lombok.patcher.inject.LiveInjector$LibInstrument> r0 = lombok.patcher.inject.LiveInjector.LibInstrument.class
            com.sun.jna.Library r0 = com.sun.jna.Native.load(r0)
            lombok.patcher.inject.LiveInjector$LibInstrument r0 = (lombok.patcher.inject.LiveInjector.LibInstrument) r0
            r10 = r0
            r0 = r8
            com.sun.jna.Pointer r0 = r0.getValue()
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r6
            r3 = 0
            r0.Agent_OnAttach(r1, r2, r3)
            return
    }

    private void slowInject(java.lang.String r8) throws java.lang.IllegalStateException {
            r7 = this;
            java.lang.management.RuntimeMXBean r0 = java.lang.management.ManagementFactory.getRuntimeMXBean()
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r9
            r3 = 64
            int r2 = r2.indexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            r9 = r0
            r0 = r9
            int r0 = java.lang.Integer.parseInt(r0)
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            java.lang.String r0 = "com.sun.tools.attach.VirtualMachine"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r13 = r0
            r0 = r13
            java.lang.String r1 = "attach"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r3 = r2
            r4 = 0
            r5 = r10
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r14 = r0
            r0 = r13
            java.lang.String r1 = "loadAgent"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r1 = r14
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.NoSuchMethodException -> L70 java.lang.reflect.InvocationTargetException -> L77 java.lang.Throwable -> L8c
            goto L92
        L69:
            r0 = 1
            r11 = r0
            goto L92
        L70:
            r0 = 1
            r11 = r0
            goto L92
        L77:
            r13 = move-exception
            r0 = r13
            java.lang.Throwable r0 = r0.getCause()
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L92
            r0 = r13
            r12 = r0
            goto L92
        L8c:
            r13 = move-exception
            r0 = r13
            r12 = r0
        L92:
            r0 = r11
            if (r0 == 0) goto La1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "agent injection only works on a sun-derived 1.6 or higher VM"
            r1.<init>(r2)
            throw r0
        La1:
            r0 = r12
            if (r0 == 0) goto Lb2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "agent injection not supported on this platform due to unknown reason"
            r3 = r12
            r1.<init>(r2, r3)
            throw r0
        Lb2:
            return
    }
}
