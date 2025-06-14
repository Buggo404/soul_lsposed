package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/ScriptManager.SCL.lombok */
public class ScriptManager {
    private final java.util.List<lombok.patcher.PatchScript> scripts;
    private final java.util.Map<java.lang.String, java.util.List<lombok.patcher.ScriptManager.WitnessAction>> witnessActions;
    private lombok.patcher.TransplantMapper transplantMapper;
    private lombok.patcher.Filter filter;
    private static final java.lang.String DEBUG_PATCHING = null;
    private static final boolean LOG_TO_STANDARD_ERR = false;
    private final lombok.patcher.ScriptManager.OurClassFileTransformer transformer;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/ScriptManager$OurClassFileTransformer.SCL.lombok */
    private class OurClassFileTransformer implements java.lang.instrument.ClassFileTransformer {
        final /* synthetic */ lombok.patcher.ScriptManager this$0;

        private OurClassFileTransformer(lombok.patcher.ScriptManager r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public byte[] transform(java.lang.ClassLoader r8, java.lang.String r9, java.lang.Class<?> r10, java.security.ProtectionDomain r11, byte[] r12) throws java.lang.instrument.IllegalClassFormatException {
                r7 = this;
                r0 = r9
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r0 = r7
                lombok.patcher.ScriptManager r0 = r0.this$0
                java.util.Map r0 = lombok.patcher.ScriptManager.access$0(r0)
                r1 = r9
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L7f
                r0 = r13
                java.util.Iterator r0 = r0.iterator()
                r15 = r0
                goto L75
            L29:
                r0 = r15
                java.lang.Object r0 = r0.next()
                lombok.patcher.ScriptManager$WitnessAction r0 = (lombok.patcher.ScriptManager.WitnessAction) r0
                r14 = r0
                r0 = r14
                boolean r0 = r0.triggered
                if (r0 == 0) goto L40
                goto L75
            L40:
                r0 = r14
                r1 = 1
                r0.triggered = r1
                r0 = r14
                boolean r0 = r0.ifWitnessRemove
                if (r0 == 0) goto L63
                r0 = r7
                lombok.patcher.ScriptManager r0 = r0.this$0
                java.util.List r0 = lombok.patcher.ScriptManager.access$1(r0)
                r1 = r14
                lombok.patcher.PatchScript r1 = r1.script
                boolean r0 = r0.remove(r1)
                goto L75
            L63:
                r0 = r7
                lombok.patcher.ScriptManager r0 = r0.this$0
                java.util.List r0 = lombok.patcher.ScriptManager.access$1(r0)
                r1 = r14
                lombok.patcher.PatchScript r1 = r1.script
                boolean r0 = r0.add(r1)
            L75:
                r0 = r15
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L29
            L7f:
                r0 = r7
                lombok.patcher.ScriptManager r0 = r0.this$0
                lombok.patcher.Filter r0 = lombok.patcher.ScriptManager.access$2(r0)
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                boolean r0 = r0.shouldTransform(r1, r2, r3, r4, r5)
                if (r0 != 0) goto L97
                r0 = 0
                return r0
            L97:
                r0 = r12
                r14 = r0
                r0 = 0
                r15 = r0
                r0 = r7
                lombok.patcher.ScriptManager r0 = r0.this$0
                java.util.List r0 = lombok.patcher.ScriptManager.access$1(r0)
                java.util.Iterator r0 = r0.iterator()
                r17 = r0
                goto L101
            Laf:
                r0 = r17
                java.lang.Object r0 = r0.next()
                lombok.patcher.PatchScript r0 = (lombok.patcher.PatchScript) r0
                r16 = r0
                r0 = 0
                r18 = r0
                r0 = r16
                r1 = r9
                r2 = r14
                r3 = r7
                lombok.patcher.ScriptManager r3 = r3.this$0     // Catch: java.lang.Throwable -> Ld2
                lombok.patcher.TransplantMapper r3 = lombok.patcher.ScriptManager.access$3(r3)     // Catch: java.lang.Throwable -> Ld2
                byte[] r0 = r0.patch(r1, r2, r3)     // Catch: java.lang.Throwable -> Ld2
                r18 = r0
                goto Lf5
            Ld2:
                r19 = move-exception
                java.io.PrintStream r0 = java.lang.System.err
                java.lang.String r1 = "Transformer %s failed on %s. Trace:\n"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r16
                java.lang.String r5 = r5.getPatchScriptName()
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                r3[r4] = r5
                java.io.PrintStream r0 = r0.printf(r1, r2)
                r0 = r19
                r0.printStackTrace()
                r0 = 0
                r18 = r0
            Lf5:
                r0 = r18
                if (r0 == 0) goto L101
                r0 = 1
                r15 = r0
                r0 = r18
                r14 = r0
            L101:
                r0 = r17
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Laf
                r0 = r15
                if (r0 == 0) goto L160
                java.lang.String r0 = lombok.patcher.ScriptManager.access$4()
                if (r0 == 0) goto L160
                r0 = r7
                java.lang.String r1 = lombok.patcher.ScriptManager.access$4()     // Catch: java.io.IOException -> L151
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L151
                r3 = r2
                r4 = r9
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L151
                r3.<init>(r4)     // Catch: java.io.IOException -> L151
                java.lang.String r3 = ".class"
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L151
                java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L151
                r3 = r14
                r0.writeArray(r1, r2, r3)     // Catch: java.io.IOException -> L151
                r0 = r7
                java.lang.String r1 = lombok.patcher.ScriptManager.access$4()     // Catch: java.io.IOException -> L151
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L151
                r3 = r2
                r4 = r9
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L151
                r3.<init>(r4)     // Catch: java.io.IOException -> L151
                java.lang.String r3 = "_OLD.class"
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L151
                java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L151
                r3 = r12
                r0.writeArray(r1, r2, r3)     // Catch: java.io.IOException -> L151
                goto L160
            L151:
                r16 = move-exception
                java.io.PrintStream r0 = java.lang.System.err
                java.lang.String r1 = "Can't log patch result."
                r0.println(r1)
                r0 = r16
                r0.printStackTrace()
            L160:
                r0 = r15
                if (r0 == 0) goto L16a
                r0 = r14
                goto L16b
            L16a:
                r0 = 0
            L16b:
                return r0
        }

        private void writeArray(java.lang.String r6, java.lang.String r7, byte[] r8) throws java.io.IOException {
                r5 = this;
                java.io.File r0 = new java.io.File
                r1 = r0
                r2 = r6
                r3 = r7
                r1.<init>(r2, r3)
                r9 = r0
                r0 = r9
                java.io.File r0 = r0.getParentFile()
                boolean r0 = r0.mkdirs()
                java.io.FileOutputStream r0 = new java.io.FileOutputStream
                r1 = r0
                r2 = r9
                r1.<init>(r2)
                r10 = r0
                r0 = r10
                r1 = r8
                r0.write(r1)
                r0 = r10
                r0.close()
                return
        }

        /* synthetic */ OurClassFileTransformer(lombok.patcher.ScriptManager r4, lombok.patcher.ScriptManager.OurClassFileTransformer r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/ScriptManager$WitnessAction.SCL.lombok */
    private static final class WitnessAction {
        boolean triggered;
        boolean ifWitnessRemove;
        lombok.patcher.PatchScript script;

        private WitnessAction() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        /* synthetic */ WitnessAction(lombok.patcher.ScriptManager.WitnessAction r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "lombok.patcher.patchDebugDir"
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            lombok.patcher.ScriptManager.DEBUG_PATCHING = r0
            return
    }

    public ScriptManager() {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.scripts = r1
            r0 = r6
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.witnessActions = r1
            r0 = r6
            lombok.patcher.TransplantMapper r1 = lombok.patcher.TransplantMapper.IDENTITY_MAPPER
            r0.transplantMapper = r1
            r0 = r6
            lombok.patcher.Filter r1 = lombok.patcher.Filter.ALWAYS
            r0.filter = r1
            r0 = r6
            lombok.patcher.ScriptManager$OurClassFileTransformer r1 = new lombok.patcher.ScriptManager$OurClassFileTransformer
            r2 = r1
            r3 = r6
            r4 = 0
            r2.<init>(r3, r4)
            r0.transformer = r1
            return
    }

    public void addScript(lombok.patcher.PatchScript r4) {
            r3 = this;
            r0 = r3
            java.util.List<lombok.patcher.PatchScript> r0 = r0.scripts
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public void addScriptIfWitness(java.lang.String[] r5, lombok.patcher.PatchScript r6) {
            r4 = this;
            lombok.patcher.ScriptManager$WitnessAction r0 = new lombok.patcher.ScriptManager$WitnessAction
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = 0
            r0.ifWitnessRemove = r1
            r0 = r7
            r1 = r6
            r0.script = r1
            r0 = r5
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L5f
        L20:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.util.List<lombok.patcher.ScriptManager$WitnessAction>> r0 = r0.witnessActions
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L53
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.util.List<lombok.patcher.ScriptManager$WitnessAction>> r0 = r0.witnessActions
            r1 = r8
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
        L53:
            r0 = r12
            r1 = r7
            boolean r0 = r0.add(r1)
            int r9 = r9 + 1
        L5f:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L20
            return
    }

    public void addScriptIfNotWitness(java.lang.String[] r5, lombok.patcher.PatchScript r6) {
            r4 = this;
            lombok.patcher.ScriptManager$WitnessAction r0 = new lombok.patcher.ScriptManager$WitnessAction
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = 1
            r0.ifWitnessRemove = r1
            r0 = r7
            r1 = r6
            r0.script = r1
            r0 = r4
            java.util.List<lombok.patcher.PatchScript> r0 = r0.scripts
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r5
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L6a
        L2b:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.util.List<lombok.patcher.ScriptManager$WitnessAction>> r0 = r0.witnessActions
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L5e
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.util.List<lombok.patcher.ScriptManager$WitnessAction>> r0 = r0.witnessActions
            r1 = r8
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
        L5e:
            r0 = r12
            r1 = r7
            boolean r0 = r0.add(r1)
            int r9 = r9 + 1
        L6a:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L2b
            return
    }

    public void setFilter(lombok.patcher.Filter r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r1 != 0) goto Lb
            lombok.patcher.Filter r1 = lombok.patcher.Filter.ALWAYS
            goto Lc
        Lb:
            r1 = r4
        Lc:
            r0.filter = r1
            return
    }

    public void registerTransformer(java.lang.instrument.Instrumentation r8) {
            r7 = this;
            java.lang.Class<java.lang.instrument.Instrumentation> r0 = java.lang.instrument.Instrumentation.class
            java.lang.String r1 = "addTransformer"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L32
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.instrument.ClassFileTransformer> r5 = java.lang.instrument.ClassFileTransformer.class
            r3[r4] = r5     // Catch: java.lang.Throwable -> L32
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L32
            r3[r4] = r5     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L32
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L32
            r3 = r2
            r4 = 0
            r5 = r7
            lombok.patcher.ScriptManager$OurClassFileTransformer r5 = r5.transformer     // Catch: java.lang.Throwable -> L32
            r3[r4] = r5     // Catch: java.lang.Throwable -> L32
            r3 = r2
            r4 = 1
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L32
            r3[r4] = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L32
            goto L3d
        L32:
            r0 = r8
            r1 = r7
            lombok.patcher.ScriptManager$OurClassFileTransformer r1 = r1.transformer
            r0.addTransformer(r1)
        L3d:
            return
    }

    public void reloadClasses(java.lang.instrument.Instrumentation r11) {
            r10 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r10
            java.util.List<lombok.patcher.PatchScript> r0 = r0.scripts
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L2c
        L16:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.patcher.PatchScript r0 = (lombok.patcher.PatchScript) r0
            r13 = r0
            r0 = r12
            r1 = r13
            java.util.Collection r1 = r1.getClassesToReload()
            boolean r0 = r0.addAll(r1)
        L2c:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16
            r0 = r11
            java.lang.Class[] r0 = r0.getAllLoadedClasses()
            r1 = r0
            r16 = r1
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r14 = r0
            goto Lbf
        L48:
            r0 = r16
            r1 = r14
            r0 = r0[r1]
            r13 = r0
            r0 = r12
            r1 = r13
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lbc
            java.lang.Class<java.lang.instrument.Instrumentation> r0 = java.lang.instrument.Instrumentation.class
            java.lang.String r1 = "retransformClasses"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            r1 = r11
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            r3 = r2
            r4 = 0
            r5 = 1
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            r6 = r5
            r7 = 0
            r8 = r13
            r6[r7] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L82 java.lang.Throwable -> Lb1
            goto Lbc
        L82:
            r17 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "The "
            r3.<init>(r4)
            r3 = r13
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " class is already loaded and cannot be modified. "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "You'll have to restart the application to patch it. Reason: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r17
            java.lang.Throwable r3 = r3.getCause()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lb1:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This appears to be a JVM v1.5, which cannot reload already loaded classes. You'll have to restart the application to patch it."
            r1.<init>(r2)
            throw r0
        Lbc:
            int r14 = r14 + 1
        Lbf:
            r0 = r14
            r1 = r15
            if (r0 < r1) goto L48
            return
    }

    private static boolean classpathContains(java.lang.String r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r6 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L1b
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Exception -> L1b
            r6 = r0
            goto L1c
        L1b:
        L1c:
            r0 = r4
            java.lang.String r1 = ""
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            java.lang.String r1 = java.io.File.pathSeparator
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L66
        L34:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r11 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L57
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L57
            r11 = r0
            goto L58
        L57:
        L58:
            r0 = r11
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L63
            r0 = 1
            return r0
        L63:
            int r8 = r8 + 1
        L66:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L34
            r0 = 0
            return r0
    }

    public void addToSystemClasspath(java.lang.instrument.Instrumentation r10, java.lang.String r11) {
            r9 = this;
            r0 = r11
            if (r0 != 0) goto Lf
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "pathToJar"
            r1.<init>(r2)
            throw r0
        Lf:
            java.lang.String r0 = "sun.boot.class.path"
            r1 = r11
            boolean r0 = classpathContains(r0, r1)
            if (r0 == 0) goto L1a
            return
        L1a:
            java.lang.String r0 = "java.class.path"
            r1 = r11
            boolean r0 = classpathContains(r0, r1)
            if (r0 == 0) goto L25
            return
        L25:
            r0 = r10
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.String r1 = "appendToSystemClassLoaderSearch"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.jar.JarFile> r5 = java.util.jar.JarFile.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            r12 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3 = r2
            r4 = 0
            java.util.jar.JarFile r5 = new java.util.jar.JarFile     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            r6 = r5
            r7 = r11
            r6.<init>(r7)     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52 java.io.IOException -> L5e java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L85
            goto Lb6
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Adding to the classloader path is not possible on a v1.5 JVM"
            r1.<init>(r2)
            throw r0
        L5e:
            r12 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "not found or not a jar file: "
            r3.<init>(r4)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r12
            r1.<init>(r2, r3)
            throw r0
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "appendToSystemClassLoaderSearch isn't public? This isn't a JVM..."
            r1.<init>(r2)
            throw r0
        L85:
            r12 = move-exception
            r0 = r12
            java.lang.Throwable r0 = r0.getCause()
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L9a
            r0 = r13
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L9a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown issue: "
            r3.<init>(r4)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r13
            r1.<init>(r2, r3)
            throw r0
        Lb6:
            return
    }

    public void addToBootClasspath(java.lang.instrument.Instrumentation r10, java.lang.String r11) {
            r9 = this;
            r0 = r11
            if (r0 != 0) goto Lf
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "pathToJar"
            r1.<init>(r2)
            throw r0
        Lf:
            java.lang.String r0 = "sun.boot.class.path"
            r1 = r11
            boolean r0 = classpathContains(r0, r1)
            if (r0 == 0) goto L1a
            return
        L1a:
            r0 = r10
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            java.lang.String r1 = "appendToBootstrapClassLoaderSearch"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.jar.JarFile> r5 = java.util.jar.JarFile.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            r12 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            r3 = r2
            r4 = 0
            java.util.jar.JarFile r5 = new java.util.jar.JarFile     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            r6 = r5
            r7 = r11
            r6.<init>(r7)     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47 java.io.IOException -> L53 java.lang.IllegalAccessException -> L6e java.lang.reflect.InvocationTargetException -> L7a
            goto Lab
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Adding to the classloader path is not possible on a v1.5 JVM"
            r1.<init>(r2)
            throw r0
        L53:
            r12 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "not found or not a jar file: "
            r3.<init>(r4)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r12
            r1.<init>(r2, r3)
            throw r0
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "appendToSystemClassLoaderSearch isn't public? This isn't a JVM..."
            r1.<init>(r2)
            throw r0
        L7a:
            r12 = move-exception
            r0 = r12
            java.lang.Throwable r0 = r0.getCause()
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L8f
            r0 = r13
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L8f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown issue: "
            r3.<init>(r4)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r13
            r1.<init>(r2, r3)
            throw r0
        Lab:
            return
    }

    public void setTransplantMapper(lombok.patcher.TransplantMapper r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r1 != 0) goto Lb
            lombok.patcher.TransplantMapper r1 = lombok.patcher.TransplantMapper.IDENTITY_MAPPER
            goto Lc
        Lb:
            r1 = r4
        Lc:
            r0.transplantMapper = r1
            return
    }

    static /* synthetic */ java.util.Map access$0(lombok.patcher.ScriptManager r2) {
            r0 = r2
            java.util.Map<java.lang.String, java.util.List<lombok.patcher.ScriptManager$WitnessAction>> r0 = r0.witnessActions
            return r0
    }

    static /* synthetic */ java.util.List access$1(lombok.patcher.ScriptManager r2) {
            r0 = r2
            java.util.List<lombok.patcher.PatchScript> r0 = r0.scripts
            return r0
    }

    static /* synthetic */ lombok.patcher.Filter access$2(lombok.patcher.ScriptManager r2) {
            r0 = r2
            lombok.patcher.Filter r0 = r0.filter
            return r0
    }

    static /* synthetic */ lombok.patcher.TransplantMapper access$3(lombok.patcher.ScriptManager r2) {
            r0 = r2
            lombok.patcher.TransplantMapper r0 = r0.transplantMapper
            return r0
    }

    static /* synthetic */ java.lang.String access$4() {
            java.lang.String r0 = lombok.patcher.ScriptManager.DEBUG_PATCHING
            return r0
    }
}
