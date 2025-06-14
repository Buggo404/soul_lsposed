package lombok.eclipse.agent;

/* JADX WARN: Classes with same name are omitted:
  com.usidqw.qwerklj.apk:Class50/lombok/eclipse/agent/EclipseLoaderPatcherTransplants.SCL.lombok
 */
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/EclipseLoaderPatcherTransplants.SCL.lombok */
public class EclipseLoaderPatcherTransplants {
    static java.lang.Class class$0;
    static java.lang.Class class$1;
    static java.lang.Class class$2;
    static java.lang.Class class$3;
    static java.lang.Class class$4;

    public EclipseLoaderPatcherTransplants() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean overrideLoadDecide(java.lang.ClassLoader r3, java.lang.String r4, boolean r5) {
            r0 = r4
            java.lang.String r1 = "lombok."
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    public static java.lang.Class overrideLoadResult(java.lang.ClassLoader r12, java.lang.String r13, boolean r14) throws java.lang.ClassNotFoundException {
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L451
            java.lang.String r1 = "lombok$shadowLoader"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L451
            r15 = r0
            r0 = r15
            r1 = r12
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L451
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Exception -> L451
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L3d8
            java.lang.String r0 = "lombok$shadowLoader$globalLock"
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L451
            r1 = r0
            r17 = r1
            monitor-enter(r0)     // Catch: java.lang.Exception -> L451
            r0 = r15
            r1 = r12
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L3ce
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r1 = "lombok$shadowLoaderClass"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r18 = r0
            java.lang.String r0 = "java.lang.ClassLoader"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r19 = r0
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r1 = "lombok$location"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r20 = r0
            r0 = r18
            if (r0 != 0) goto L350
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1 = r0
            r2 = r20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r21
            java.lang.String r1 = "lombok/launch/ShadowClassLoader.class"
            java.util.zip.ZipEntry r0 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r23 = r0
            r0 = r21
            r1 = r23
            java.io.InputStream r0 = r0.getInputStream(r1)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r22 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r24 = r0
            r0 = 0
            r25 = r0
        L8a:
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r24
            int r3 = r3.length     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r4 = r25
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r26 = r0
            r0 = r26
            r1 = -1
            if (r0 != r1) goto La4
            goto Lbd
        La4:
            r0 = r25
            r1 = r26
            int r0 = r0 + r1
            r25 = r0
            r0 = r25
            r1 = r24
            int r1 = r1.length     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            if (r0 != r1) goto L8a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1 = r0
            java.lang.String r2 = "lombok.launch.ShadowClassLoader too large."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        Lbd:
            r0 = r22
            r0.close()     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r0 = "java.lang.invoke.MethodHandles"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r26 = r0
            java.lang.String r0 = "java.lang.invoke.MethodHandle"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r27 = r0
            java.lang.String r0 = "java.lang.invoke.MethodType"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r28 = r0
            java.lang.String r0 = "java.lang.invoke.MethodHandles$Lookup"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r29 = r0
            r0 = r26
            java.lang.String r1 = "lookup"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r30 = r0
            r0 = r28
            java.lang.String r1 = "methodType"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L112
        Lfa:
            java.lang.String r5 = "java.lang.Class"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L106 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$0 = r6     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L112
        L106:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L112:
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$1     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L135
        L11d:
            java.lang.String r5 = "[Ljava.lang.Class;"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L129 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$1 = r6     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L135
        L129:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L135:
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r31 = r0
            r0 = r29
            java.lang.String r1 = "findVirtual"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L165
        L14d:
            java.lang.String r5 = "java.lang.Class"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L159 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$0 = r6     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L165
        L159:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L165:
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$2     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L188
        L170:
            java.lang.String r5 = "java.lang.String"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L17c java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$2 = r6     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L188
        L17c:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L188:
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 2
            r5 = r28
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r32 = r0
            r0 = r27
            java.lang.String r1 = "invokeWithArguments"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$3     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L1bd
        L1a5:
            java.lang.String r5 = "[Ljava.lang.Object;"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L1b1 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$3 = r6     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L1bd
        L1b1:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L1bd:
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r33 = r0
            r0 = r30
            r1 = 0
            r2 = 0
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r34 = r0
            r0 = r31
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L1f5
        L1dd:
            java.lang.String r5 = "java.lang.Class"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L1e9 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$0 = r6     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L1f5
        L1e9:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L1f5:
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            r5 = 4
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 0
            java.lang.Class r8 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$2     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r9 = r8
            if (r9 != 0) goto L21e
        L206:
            java.lang.String r8 = "java.lang.String"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.ClassNotFoundException -> L212 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r9 = r8
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$2 = r9     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L21e
        L212:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L21e:
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 1
            java.lang.Class r8 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$4     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r9 = r8
            if (r9 != 0) goto L241
        L229:
            java.lang.String r8 = "[B"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.ClassNotFoundException -> L235 java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r9 = r8
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$4 = r9     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L241
        L235:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L241:
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 2
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 3
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r35 = r0
            r0 = r32
            r1 = r34
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            r5 = r12
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            java.lang.String r5 = "defineClass"
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 2
            r5 = r35
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r36 = r0
            r0 = r33
            r1 = r36
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 0
            r8 = r12
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 1
            java.lang.String r8 = "lombok.launch.ShadowClassLoader"
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 2
            r8 = r24
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 3
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r9 = r8
            r10 = 0
            r9.<init>(r10)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 4
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r9 = r8
            r10 = r25
            r9.<init>(r10)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6[r7] = r8     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L2b1 java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r18 = r0
            goto L2b2
        L2b1:
        L2b2:
            r0 = r18
            if (r0 != 0) goto L320
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r26 = r0
            r0 = r26
            r1 = 0
            java.lang.String r2 = ""
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r26
            r1 = 1
            r2 = 0
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r26
            r1 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r26
            r1 = 3
            r2 = r26
            r3 = 2
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r19
            java.lang.String r1 = "defineClass"
            r2 = r26
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r27 = r0
            r0 = r27
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r27
            r1 = r12
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            java.lang.String r5 = "lombok.launch.ShadowClassLoader"
            r3[r4] = r5     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            r5 = r24
            r3[r4] = r5     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 2
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = 0
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3 = r2
            r4 = 3
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r6 = r5
            r7 = r25
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r18 = r0
        L320:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.String r1 = "lombok$shadowLoaderClass"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r1 = 0
            r2 = r18
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L332 java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L34d
        L332:
            r38 = move-exception
            r0 = jsr -> L33a
        L337:
            r1 = r38
            throw r1     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L33a:
            r37 = r0
            r0 = r22
            if (r0 == 0) goto L346
            r0 = r22
            r0.close()     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L346:
            r0 = r21
            r0.close()     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            ret r37     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L34d:
            r0 = jsr -> L33a
        L350:
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r21 = r0
            r0 = r21
            r1 = 0
            r2 = r19
            r0[r1] = r2     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r21
            r1 = 1
            java.lang.String r2 = ""
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r21
            r1 = 2
            r2 = r21
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r21
            r1 = 3
            java.lang.String r2 = "java.util.List"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r21
            r1 = 4
            r2 = r21
            r3 = 3
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r18
            r1 = r21
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r22 = r0
            r0 = r22
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r0 = r22
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1
            r3 = 1
            java.lang.String r4 = "lombok"
            r2[r3] = r4     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1
            r3 = 2
            r4 = r20
            r2[r3] = r4     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1
            r3 = 3
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r5 = r4
            r6 = 0
            java.lang.String r7 = "lombok."
            r5[r6] = r7     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2[r3] = r4     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2 = r1
            r3 = 4
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r5 = r4
            r6 = 0
            java.lang.String r7 = "lombok.patcher.Symbols"
            r5[r6] = r7     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r2[r3] = r4     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            r16 = r0
            r0 = r15
            r1 = r12
            r2 = r16
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L3ce:
            r0 = r17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            goto L3d8
        L3d4:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
            throw r0     // Catch: java.lang.Throwable -> L3d4 java.lang.Exception -> L451
        L3d8:
            r0 = r14
            if (r0 == 0) goto L44a
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L451
            r17 = r0
            r0 = r17
            r1 = 0
            java.lang.String r2 = ""
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Exception -> L451
            r0 = r17
            r1 = 1
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L451
            r0[r1] = r2     // Catch: java.lang.Exception -> L451
            r0 = r16
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L451
            java.lang.String r1 = "loadClass"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            java.lang.Class r5 = lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$2     // Catch: java.lang.Exception -> L451
            r6 = r5
            if (r6 != 0) goto L41f
        L407:
            java.lang.String r5 = "java.lang.String"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L413 java.lang.Exception -> L451
            r6 = r5
            lombok.eclipse.agent.EclipseLoaderPatcherTransplants.class$2 = r6     // Catch: java.lang.Exception -> L451
            goto L41f
        L413:
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.Exception -> L451
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.Exception -> L451
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.Exception -> L451
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Exception -> L451
            r1.<init>(r2)     // Catch: java.lang.Exception -> L451
            throw r0     // Catch: java.lang.Exception -> L451
        L41f:
            r3[r4] = r5     // Catch: java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.Exception -> L451
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L451
            r18 = r0
            r0 = r18
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L451
            r0 = r18
            r1 = r16
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L451
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5     // Catch: java.lang.Exception -> L451
            r3 = r2
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L451
            r3[r4] = r5     // Catch: java.lang.Exception -> L451
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L451
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Exception -> L451
            return r0
        L44a:
            r0 = r16
            r1 = r13
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L451
            return r0
        L451:
            r15 = move-exception
            r0 = r15
            r16 = r0
            r0 = r16
            boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L464
            r0 = r16
            java.lang.Throwable r0 = r0.getCause()
            r16 = r0
        L464:
            r0 = r16
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L472
            r0 = r16
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L472:
            r0 = r16
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L480
            r0 = r16
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L480:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r16
            r1.<init>(r2)
            throw r0
    }
}
