package lombok.javac.apt;

@javax.annotation.processing.SupportedAnnotationTypes({"*"})
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/LombokProcessor.SCL.lombok */
public class LombokProcessor extends javax.annotation.processing.AbstractProcessor {
    private javax.annotation.processing.ProcessingEnvironment processingEnv;
    private com.sun.tools.javac.processing.JavacProcessingEnvironment javacProcessingEnv;
    private com.sun.tools.javac.processing.JavacFiler javacFiler;
    private lombok.javac.JavacTransformer transformer;
    private com.sun.source.util.Trees trees;
    private boolean lombokDisabled;
    private static final java.lang.String JPE = "com.sun.tools.javac.processing.JavacProcessingEnvironment";
    private static final java.lang.reflect.Field javacProcessingEnvironment_discoveredProcs = null;
    private static final java.lang.reflect.Field discoveredProcessors_procStateList = null;
    private static final java.lang.reflect.Field processorState_processor = null;
    private final java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree.JCCompilationUnit, java.lang.Long> roots;
    private long[] priorityLevels;
    private java.util.Set<java.lang.Long> priorityLevelsRequiringResolutionReset;
    private lombok.core.CleanupRegistry cleanup;
    private int dummyCount;
    private static java.lang.Class<?> qualifiedNamableClass;
    private static java.lang.reflect.Method qualifiedNamableQualifiedNameMethod;


    static {
            java.lang.String r0 = "com.sun.tools.javac.processing.JavacProcessingEnvironment"
            java.lang.String r1 = "discoveredProcs"
            java.lang.reflect.Field r0 = getFieldAccessor(r0, r1)
            lombok.javac.apt.LombokProcessor.javacProcessingEnvironment_discoveredProcs = r0
            java.lang.String r0 = "com.sun.tools.javac.processing.JavacProcessingEnvironment$DiscoveredProcessors"
            java.lang.String r1 = "procStateList"
            java.lang.reflect.Field r0 = getFieldAccessor(r0, r1)
            lombok.javac.apt.LombokProcessor.discoveredProcessors_procStateList = r0
            java.lang.String r0 = "com.sun.tools.javac.processing.JavacProcessingEnvironment$processor"
            java.lang.String r1 = "processor"
            java.lang.reflect.Field r0 = getFieldAccessor(r0, r1)
            lombok.javac.apt.LombokProcessor.processorState_processor = r0
            r0 = 0
            lombok.javac.apt.LombokProcessor.qualifiedNamableClass = r0
            r0 = 0
            lombok.javac.apt.LombokProcessor.qualifiedNamableQualifiedNameMethod = r0
            return
    }

    public LombokProcessor() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.lombokDisabled = r1
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.roots = r1
            r0 = r4
            lombok.core.CleanupRegistry r1 = new lombok.core.CleanupRegistry
            r2 = r1
            r2.<init>()
            r0.cleanup = r1
            r0 = r4
            r1 = 0
            r0.dummyCount = r1
            return
    }

    public void init(javax.annotation.processing.ProcessingEnvironment r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            super.init(r1)
            java.lang.String r0 = "lombok.disable"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L13
            r0 = r6
            r1 = 1
            r0.lombokDisabled = r1
            return
        L13:
            r0 = r6
            r1 = r7
            r0.processingEnv = r1
            r0 = r6
            r1 = r6
            r2 = r7
            com.sun.tools.javac.processing.JavacProcessingEnvironment r1 = r1.getJavacProcessingEnvironment(r2)
            r0.javacProcessingEnv = r1
            r0 = r6
            r1 = r6
            r2 = r7
            javax.annotation.processing.Filer r2 = r2.getFiler()
            com.sun.tools.javac.processing.JavacFiler r1 = r1.getJavacFiler(r2)
            r0.javacFiler = r1
            r0 = r6
            r0.placePostCompileAndDontMakeForceRoundDummiesHook()
            r0 = r6
            r1 = r6
            com.sun.tools.javac.processing.JavacProcessingEnvironment r1 = r1.javacProcessingEnv
            com.sun.source.util.Trees r1 = com.sun.source.util.Trees.instance(r1)
            r0.trees = r1
            r0 = r6
            lombok.javac.JavacTransformer r1 = new lombok.javac.JavacTransformer
            r2 = r1
            r3 = r7
            javax.annotation.processing.Messager r3 = r3.getMessager()
            r4 = r6
            com.sun.source.util.Trees r4 = r4.trees
            r2.<init>(r3, r4)
            r0.transformer = r1
            r0 = r6
            lombok.javac.JavacTransformer r0 = r0.transformer
            java.util.SortedSet r0 = r0.getPriorities()
            r8 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L79
            r0 = r6
            r1 = 1
            long[] r1 = new long[r1]
            r0.priorityLevels = r1
            r0 = r6
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.priorityLevelsRequiringResolutionReset = r1
            goto Lc1
        L79:
            r0 = r6
            r1 = r8
            int r1 = r1.size()
            long[] r1 = new long[r1]
            r0.priorityLevels = r1
            r0 = 0
            r9 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto Lac
        L92:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r10 = r0
            r0 = r6
            long[] r0 = r0.priorityLevels
            r1 = r9
            int r9 = r9 + 1
            r2 = r10
            long r2 = r2.longValue()
            r0[r1] = r2
        Lac:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L92
            r0 = r6
            r1 = r6
            lombok.javac.JavacTransformer r1 = r1.transformer
            java.util.SortedSet r1 = r1.getPrioritiesRequiringResolutionReset()
            r0.priorityLevelsRequiringResolutionReset = r1
        Lc1:
            return
    }

    private static final java.lang.reflect.Field getFieldAccessor(java.lang.String r3, java.lang.String r4) {
            r0 = r3
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L9 java.lang.NoSuchFieldException -> Lc
            r1 = r4
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L9 java.lang.NoSuchFieldException -> Lc
            return r0
        L9:
            r0 = 0
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.lang.String listAnnotationProcessorsBeforeOurs() {
            r4 = this;
            java.lang.reflect.Field r0 = lombok.javac.apt.LombokProcessor.javacProcessingEnvironment_discoveredProcs     // Catch: java.lang.Exception -> La4
            r1 = r4
            com.sun.tools.javac.processing.JavacProcessingEnvironment r1 = r1.javacProcessingEnv     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> La4
            r5 = r0
            java.lang.reflect.Field r0 = lombok.javac.apt.LombokProcessor.discoveredProcessors_procStateList     // Catch: java.lang.Exception -> La4
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> La4
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> La4
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L21
            r0 = r6
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = r6
            int r0 = r0.size()     // Catch: java.lang.Exception -> La4
            r1 = 1
            if (r0 != r1) goto L3d
            java.lang.reflect.Field r0 = lombok.javac.apt.LombokProcessor.processorState_processor     // Catch: java.lang.Exception -> La4
            r1 = r6
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> La4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> La4
            return r0
        L3d:
            r0 = 0
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> La4
            r8 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> La4
            r10 = r0
            goto L94
        L51:
            r0 = r10
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> La4
            r9 = r0
            int r7 = r7 + 1
            java.lang.reflect.Field r0 = lombok.javac.apt.LombokProcessor.processorState_processor     // Catch: java.lang.Exception -> La4
            r1 = r9
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> La4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> La4
            r11 = r0
            r0 = r8
            int r0 = r0.length()     // Catch: java.lang.Exception -> La4
            if (r0 <= 0) goto L7d
            r0 = r8
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> La4
        L7d:
            r0 = r8
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> La4
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> La4
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> La4
        L94:
            r0 = r10
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> La4
            if (r0 != 0) goto L51
            r0 = r8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La4
            return r0
        La4:
            r0 = 0
            return r0
    }

    private void placePostCompileAndDontMakeForceRoundDummiesHook() {
            r7 = this;
            r0 = r7
            r0.stopJavacProcessingEnvironmentFromClosingOurClassloader()
            r0 = r7
            r0.forceMultipleRoundsInNetBeansEditor()
            r0 = r7
            com.sun.tools.javac.processing.JavacProcessingEnvironment r0 = r0.javacProcessingEnv
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            r8 = r0
            r0 = r7
            r1 = r8
            r0.disablePartialReparseInNetBeansEditor(r1)
            java.lang.Class<com.sun.tools.javac.util.Context> r0 = com.sun.tools.javac.util.Context.class
            java.lang.String r1 = "key"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lc0
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r3[r4] = r5     // Catch: java.lang.Exception -> Lc0
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> Lc0
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lc0
            r3 = r2
            r4 = 0
            java.lang.Class<javax.tools.JavaFileManager> r5 = javax.tools.JavaFileManager.class
            r3[r4] = r5     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Exception -> Lc0
            r10 = r0
            java.lang.Class<com.sun.tools.javac.util.Context> r0 = com.sun.tools.javac.util.Context.class
            java.lang.String r1 = "ht"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lc0
            r11 = r0
            r0 = r11
            r1 = r8
            java.lang.Object r0 = lombok.permit.Permit.get(r0, r1)     // Catch: java.lang.Exception -> Lc0
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> Lc0
            r12 = r0
            r0 = r12
            r1 = r10
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lc0
            javax.tools.JavaFileManager r0 = (javax.tools.JavaFileManager) r0     // Catch: java.lang.Exception -> Lc0
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof lombok.javac.apt.InterceptingJavaFileManager     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto Lc6
            r0 = r7
            javax.annotation.processing.ProcessingEnvironment r0 = r0.processingEnv     // Catch: java.lang.Exception -> Lc0
            javax.annotation.processing.Messager r0 = r0.getMessager()     // Catch: java.lang.Exception -> Lc0
            r14 = r0
            lombok.javac.apt.MessagerDiagnosticsReceiver r0 = new lombok.javac.apt.MessagerDiagnosticsReceiver     // Catch: java.lang.Exception -> Lc0
            r1 = r0
            r2 = r14
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lc0
            r15 = r0
            lombok.javac.apt.InterceptingJavaFileManager r0 = new lombok.javac.apt.InterceptingJavaFileManager     // Catch: java.lang.Exception -> Lc0
            r1 = r0
            r2 = r13
            r3 = r15
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> Lc0
            r16 = r0
            r0 = r12
            r1 = r10
            r2 = r16
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc0
            java.lang.Class<com.sun.tools.javac.processing.JavacFiler> r0 = com.sun.tools.javac.processing.JavacFiler.class
            java.lang.String r1 = "fileManager"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lc0
            r17 = r0
            r0 = r17
            r1 = r7
            com.sun.tools.javac.processing.JavacFiler r1 = r1.javacFiler     // Catch: java.lang.Exception -> Lc0
            r2 = r16
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lc0
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()     // Catch: java.lang.Exception -> Lc0
            r1 = 8
            if (r0 <= r1) goto Lc6
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.inNetbeansCompileOnSave(r0)     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto Lc6
            r0 = r7
            r1 = r8
            r2 = r16
            r0.replaceFileManagerJdk9(r1, r2)     // Catch: java.lang.Exception -> Lc0
            goto Lc6
        Lc0:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        Lc6:
            return
    }

    private void replaceFileManagerJdk9(com.sun.tools.javac.util.Context r8, javax.tools.JavaFileManager r9) {
            r7 = this;
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "instance"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L69
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Context> r5 = com.sun.tools.javac.util.Context.class
            r3[r4] = r5     // Catch: java.lang.Exception -> L69
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L69
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L69
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Exception -> L69
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Exception -> L69
            com.sun.tools.javac.main.JavaCompiler r0 = (com.sun.tools.javac.main.JavaCompiler) r0     // Catch: java.lang.Exception -> L69
            r10 = r0
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "fileManager"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L38 java.lang.Exception -> L69
            r11 = r0
            r0 = r11
            r1 = r10
            r2 = r9
            lombok.permit.Permit.set(r0, r1, r2)     // Catch: java.lang.Exception -> L38 java.lang.Exception -> L69
            goto L39
        L38:
        L39:
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "writer"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L65 java.lang.Exception -> L69
            r11 = r0
            r0 = r11
            r1 = r10
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L65 java.lang.Exception -> L69
            com.sun.tools.javac.jvm.ClassWriter r0 = (com.sun.tools.javac.jvm.ClassWriter) r0     // Catch: java.lang.Exception -> L65 java.lang.Exception -> L69
            r12 = r0
            java.lang.Class<com.sun.tools.javac.jvm.ClassWriter> r0 = com.sun.tools.javac.jvm.ClassWriter.class
            java.lang.String r1 = "fileManager"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L65 java.lang.Exception -> L69
            r13 = r0
            r0 = r13
            r1 = r12
            r2 = r9
            lombok.permit.Permit.set(r0, r1, r2)     // Catch: java.lang.Exception -> L65 java.lang.Exception -> L69
            goto L6a
        L65:
            goto L6a
        L69:
        L6a:
            return
    }

    private void forceMultipleRoundsInNetBeansEditor() {
            r4 = this;
            java.lang.Class<com.sun.tools.javac.processing.JavacProcessingEnvironment> r0 = com.sun.tools.javac.processing.JavacProcessingEnvironment.class
            java.lang.String r1 = "isBackgroundCompilation"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L19 java.lang.Throwable -> L1d
            r5 = r0
            r0 = r5
            r1 = r4
            com.sun.tools.javac.processing.JavacProcessingEnvironment r1 = r1.javacProcessingEnv     // Catch: java.lang.NoSuchFieldException -> L19 java.lang.Throwable -> L1d
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.NoSuchFieldException -> L19 java.lang.Throwable -> L1d
            r0.set(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L19 java.lang.Throwable -> L1d
            goto L23
        L19:
            goto L23
        L1d:
            r5 = move-exception
            r0 = r5
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L23:
            return
    }

    private void disablePartialReparseInNetBeansEditor(com.sun.tools.javac.util.Context r8) {
            r7 = this;
            java.lang.String r0 = "com.sun.tools.javac.util.CancelService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r9 = r0
            r0 = r9
            java.lang.String r1 = "instance"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Context> r5 = com.sun.tools.javac.util.Context.class
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r10 = r0
            r0 = r10
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L2e
            return
        L2e:
            r0 = r11
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            java.lang.String r1 = "parser"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r12 = r0
            r0 = r12
            r1 = r11
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r13 = r0
            r0 = r13
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            java.lang.String r1 = "supportsReparse"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            r0.set(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L5f java.lang.NoSuchFieldException -> L63 java.lang.Throwable -> L67
            goto L6d
        L5f:
            goto L6d
        L63:
            goto L6d
        L67:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L6d:
            return
    }

    private static java.lang.ClassLoader wrapClassLoader(java.lang.ClassLoader r4) {
            lombok.javac.apt.LombokProcessor$1 r0 = new lombok.javac.apt.LombokProcessor$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    private void stopJavacProcessingEnvironmentFromClosingOurClassloader() {
            r4 = this;
            java.lang.Class<com.sun.tools.javac.processing.JavacProcessingEnvironment> r0 = com.sun.tools.javac.processing.JavacProcessingEnvironment.class
            java.lang.String r1 = "processorClassLoader"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            r5 = r0
            r0 = r5
            r1 = r4
            com.sun.tools.javac.processing.JavacProcessingEnvironment r1 = r1.javacProcessingEnv     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L1b
            return
        L1b:
            r0 = r6
            java.lang.ClassLoader r0 = wrapClassLoader(r0)     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            r7 = r0
            r0 = r5
            r1 = r4
            com.sun.tools.javac.processing.JavacProcessingEnvironment r1 = r1.javacProcessingEnv     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            r2 = r7
            r0.set(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L2c java.lang.Throwable -> L30
            goto L36
        L2c:
            goto L36
        L30:
            r5 = move-exception
            r0 = r5
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L36:
            return
    }

    public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r8, javax.annotation.processing.RoundEnvironment r9) {
            r7 = this;
            r0 = r7
            boolean r0 = r0.lombokDisabled
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r9
            boolean r0 = r0.processingOver()
            if (r0 == 0) goto L1b
            r0 = r7
            lombok.core.CleanupRegistry r0 = r0.cleanup
            r0.run()
            r0 = 0
            return r0
        L1b:
            r0 = 0
            r10 = r0
            r0 = r9
            java.util.Set r0 = r0.getRootElements()
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L76
        L2d:
            r0 = r12
            java.lang.Object r0 = r0.next()
            javax.lang.model.element.Element r0 = (javax.lang.model.element.Element) r0
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L44
            r0 = r7
            r1 = r11
            java.lang.String r0 = r0.getModuleNameFor(r1)
            r10 = r0
        L44:
            r0 = r7
            r1 = r11
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = r0.toUnit(r1)
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L54
            goto L76
        L54:
            r0 = r7
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.lang.Long> r0 = r0.roots
            r1 = r13
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L63
            goto L76
        L63:
            r0 = r7
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.lang.Long> r0 = r0.roots
            r1 = r13
            r2 = r7
            long[] r2 = r2.priorityLevels
            r3 = 0
            r2 = r2[r3]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
        L76:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2d
        L80:
            r0 = r7
            long[] r0 = r0.priorityLevels
            r1 = r0
            r15 = r1
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r13 = r0
            goto L111
        L90:
            r0 = r15
            r1 = r13
            r0 = r0[r1]
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r7
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.lang.Long> r0 = r0.roots
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Lee
        Lb1:
            r0 = r18
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r17 = r0
            r0 = r17
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            r19 = r0
            r0 = r19
            if (r0 == 0) goto Lee
            r0 = r19
            long r0 = r0.longValue()
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ldc
            goto Lee
        Ldc:
            r0 = r16
            r1 = r17
            java.lang.Object r1 = r1.getKey()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1
            boolean r0 = r0.add(r1)
        Lee:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb1
            r0 = r7
            lombok.javac.JavacTransformer r0 = r0.transformer
            r1 = r11
            r2 = r7
            com.sun.tools.javac.processing.JavacProcessingEnvironment r2 = r2.javacProcessingEnv
            com.sun.tools.javac.util.Context r2 = r2.getContext()
            r3 = r16
            r4 = r7
            lombok.core.CleanupRegistry r4 = r4.cleanup
            r0.transform(r1, r2, r3, r4)
            int r13 = r13 + 1
        L111:
            r0 = r13
            r1 = r14
            if (r0 < r1) goto L90
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r7
            long[] r0 = r0.priorityLevels
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
            goto L1e3
        L12d:
            r0 = r7
            long[] r0 = r0.priorityLevels
            r1 = r12
            r0 = r0[r1]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13 = r0
            r0 = r12
            r1 = r7
            long[] r1 = r1.priorityLevels
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L149
            r0 = 0
            goto L155
        L149:
            r0 = r7
            long[] r0 = r0.priorityLevels
            r1 = r12
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L155:
            r14 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r7
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.lang.Long> r0 = r0.roots
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L1a8
        L171:
            r0 = r17
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r16 = r0
            r0 = r13
            r1 = r16
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a8
            r0 = r15
            r1 = r16
            java.lang.Object r1 = r1.getKey()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r14
            boolean r0 = r0.add(r1)
        L1a8:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L171
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L1d6
        L1be:
            r0 = r17
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r16 = r0
            r0 = r7
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.lang.Long> r0 = r0.roots
            r1 = r16
            r2 = r14
            java.lang.Object r0 = r0.put(r1, r2)
        L1d6:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1be
            int r12 = r12 + (-1)
        L1e3:
            r0 = r12
            if (r0 >= 0) goto L12d
            r0 = r11
            r1 = 0
            boolean r0 = r0.remove(r1)
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1fd
            r0 = 0
            return r0
        L1fd:
            r0 = r11
            r1 = r7
            java.util.Set<java.lang.Long> r1 = r1.priorityLevelsRequiringResolutionReset
            boolean r0 = r0.retainAll(r1)
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L80
            r0 = r7
            r1 = r10
            r2 = r7
            com.sun.tools.javac.processing.JavacFiler r2 = r2.javacFiler
            r0.forceNewRound(r1, r2)
            r0 = 0
            return r0
    }

    private void forceNewRound(java.lang.String r8, com.sun.tools.javac.processing.JavacFiler r9) {
            r7 = this;
            r0 = r9
            boolean r0 = r0.newFiles()
            if (r0 != 0) goto L48
            r0 = r9
            java.util.Set r0 = r0.getGeneratedSourceNames()     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r2 = r1
            java.lang.String r3 = "lombok.dummy.ForceNewRound"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2f
            r2 = r7
            r3 = r2
            int r3 = r3.dummyCount     // Catch: java.lang.Exception -> L2f
            r4 = r3; r3 = r2; r2 = r4;      // Catch: java.lang.Exception -> L2f
            r5 = 1
            int r4 = r4 + r5
            r3.dummyCount = r4     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2f
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> L2f
            goto L48
        L2f:
            r10 = move-exception
            r0 = r10
            r0.printStackTrace()
            r0 = r7
            javax.annotation.processing.ProcessingEnvironment r0 = r0.processingEnv
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.String r2 = "Can't force a new processing round. Lombok won't work."
            r0.printMessage(r1, r2)
        L48:
            return
    }

    private java.lang.String getModuleNameFor(javax.lang.model.element.Element r4) {
            r3 = this;
            goto L2a
        L3:
            r0 = r4
            javax.lang.model.element.ElementKind r0 = r0.getKind()
            java.lang.String r0 = r0.name()
            java.lang.String r1 = "MODULE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = r4
            java.lang.String r0 = getModuleName(r0)
            return r0
        L1a:
            r0 = r4
            javax.lang.model.element.Element r0 = r0.getEnclosingElement()
            r5 = r0
            r0 = r5
            r1 = r4
            if (r0 != r1) goto L28
            r0 = 0
            return r0
        L28:
            r0 = r5
            r4 = r0
        L2a:
            r0 = r4
            if (r0 != 0) goto L3
            r0 = 0
            return r0
    }

    private static java.lang.String getModuleName(javax.lang.model.element.Element r4) {
            java.lang.Class<?> r0 = lombok.javac.apt.LombokProcessor.qualifiedNamableClass     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            if (r0 != 0) goto Lf
            java.lang.String r0 = "javax.lang.model.element.QualifiedNamable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            lombok.javac.apt.LombokProcessor.qualifiedNamableClass = r0     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
        Lf:
            java.lang.Class<?> r0 = lombok.javac.apt.LombokProcessor.qualifiedNamableClass     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            r1 = r4
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            if (r0 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            java.lang.reflect.Method r0 = lombok.javac.apt.LombokProcessor.qualifiedNamableQualifiedNameMethod     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            if (r0 != 0) goto L31
            java.lang.Class<?> r0 = lombok.javac.apt.LombokProcessor.qualifiedNamableClass     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            java.lang.String r1 = "getQualifiedName"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            lombok.javac.apt.LombokProcessor.qualifiedNamableQualifiedNameMethod = r0     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
        L31:
            java.lang.reflect.Method r0 = lombok.javac.apt.LombokProcessor.qualifiedNamableQualifiedNameMethod     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            java.lang.String r0 = r0.trim()     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            r5 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassNotFoundException -> L50 java.lang.NoSuchMethodException -> L53 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L59
            if (r0 == 0) goto L4e
            r0 = 0
            goto L4f
        L4e:
            r0 = r5
        L4f:
            return r0
        L50:
            r0 = 0
            return r0
        L53:
            r0 = 0
            return r0
        L56:
            r0 = 0
            return r0
        L59:
            r0 = 0
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCCompilationUnit toUnit(javax.lang.model.element.Element r4) {
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = r3
            com.sun.source.util.Trees r0 = r0.trees
            if (r0 == 0) goto L16
            r0 = r3
            com.sun.source.util.Trees r0 = r0.trees     // Catch: java.lang.NullPointerException -> L15
            r1 = r4
            com.sun.source.util.TreePath r0 = r0.getPath(r1)     // Catch: java.lang.NullPointerException -> L15
            r5 = r0
            goto L16
        L15:
        L16:
            r0 = r5
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = r5
            com.sun.source.tree.CompilationUnitTree r0 = r0.getCompilationUnit()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            return r0
    }

    public javax.lang.model.SourceVersion getSupportedSourceVersion() {
            r2 = this;
            javax.lang.model.SourceVersion r0 = javax.lang.model.SourceVersion.latest()
            return r0
    }

    public com.sun.tools.javac.processing.JavacProcessingEnvironment getJavacProcessingEnvironment(java.lang.Object r5) {
            r4 = this;
            addOpensForLombok()
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.processing.JavacProcessingEnvironment
            if (r0 == 0) goto Lf
            r0 = r5
            com.sun.tools.javac.processing.JavacProcessingEnvironment r0 = (com.sun.tools.javac.processing.JavacProcessingEnvironment) r0
            return r0
        Lf:
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r6 = r0
            goto L43
        L17:
            r0 = r4
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.tryGetDelegateField(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L29
            r0 = r4
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.tryGetProxyDelegateToField(r1, r2)
            r7 = r0
        L29:
            r0 = r7
            if (r0 != 0) goto L34
            r0 = r4
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.tryGetProcessingEnvField(r1, r2)
            r7 = r0
        L34:
            r0 = r7
            if (r0 == 0) goto L3e
            r0 = r4
            r1 = r7
            com.sun.tools.javac.processing.JavacProcessingEnvironment r0 = r0.getJavacProcessingEnvironment(r1)
            return r0
        L3e:
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            r6 = r0
        L43:
            r0 = r6
            if (r0 != 0) goto L17
            r0 = r4
            javax.annotation.processing.ProcessingEnvironment r0 = r0.processingEnv
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.String r2 = "Can't get the delegate of the gradle IncrementalProcessingEnvironment. Lombok won't work."
            r0.printMessage(r1, r2)
            r0 = 0
            return r0
    }

    private static java.lang.Object getOwnModule() {
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getModule"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L18
            r4 = r0
            r0 = r4
            java.lang.Class<lombok.javac.apt.LombokProcessor> r1 = lombok.javac.apt.LombokProcessor.class
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L18
            return r0
        L18:
            r0 = 0
            return r0
    }

    private static java.lang.Object getJdkCompilerModule() {
            java.lang.String r0 = "java.lang.ModuleLayer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L5e
            r7 = r0
            r0 = r7
            java.lang.String r1 = "boot"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L5e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L5e
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L5e
            r9 = r0
            java.lang.String r0 = "java.util.Optional"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L5e
            r10 = r0
            r0 = r7
            java.lang.String r1 = "findModule"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L5e
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.Exception -> L5e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L5e
            r11 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L5e
            r3 = r2
            r4 = 0
            java.lang.String r5 = "jdk.compiler"
            r3[r4] = r5     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L5e
            r12 = r0
            r0 = r10
            java.lang.String r1 = "get"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L5e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L5e
            r1 = r12
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L5e
            return r0
        L5e:
            r0 = 0
            return r0
    }

    public static void addOpensForLombok() {
            java.lang.String r0 = "java.lang.Module"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> La
            r7 = r0
            goto Lc
        La:
            return
        Lc:
            sun.misc.Unsafe r0 = getUnsafe()
            r8 = r0
            java.lang.Object r0 = getJdkCompilerModule()
            r9 = r0
            java.lang.Object r0 = getOwnModule()
            r10 = r0
            r0 = 10
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.sun.tools.javac.code"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "com.sun.tools.javac.comp"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "com.sun.tools.javac.file"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "com.sun.tools.javac.main"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "com.sun.tools.javac.model"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "com.sun.tools.javac.parser"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "com.sun.tools.javac.processing"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "com.sun.tools.javac.tree"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "com.sun.tools.javac.util"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "com.sun.tools.javac.jvm"
            r1[r2] = r3
            r11 = r0
            r0 = r7
            java.lang.String r1 = "implAddOpens"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lbb
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.Exception -> Lbb
            r3 = r2
            r4 = 1
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.Exception -> Lbb
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> Lbb
            r12 = r0
            r0 = r8
            long r0 = getFirstFieldOffset(r0)     // Catch: java.lang.Exception -> Lbb
            r13 = r0
            r0 = r8
            r1 = r12
            r2 = r13
            r3 = 1
            r0.putBooleanVolatile(r1, r2, r3)     // Catch: java.lang.Exception -> Lbb
            r0 = r11
            r1 = r0
            r18 = r1
            int r0 = r0.length     // Catch: java.lang.Exception -> Lbb
            r17 = r0
            r0 = 0
            r16 = r0
            goto Lb1
        L93:
            r0 = r18
            r1 = r16
            r0 = r0[r1]     // Catch: java.lang.Exception -> Lbb
            r15 = r0
            r0 = r12
            r1 = r9
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lbb
            r3 = r2
            r4 = 0
            r5 = r15
            r3[r4] = r5     // Catch: java.lang.Exception -> Lbb
            r3 = r2
            r4 = 1
            r5 = r10
            r3[r4] = r5     // Catch: java.lang.Exception -> Lbb
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> Lbb
            int r16 = r16 + 1
        Lb1:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto L93
            goto Lbc
        Lbb:
        Lbc:
            return
    }

    private static long getFirstFieldOffset(sun.misc.Unsafe r4) {
            r0 = r4
            java.lang.Class<lombok.permit.dummy.Parent> r1 = lombok.permit.dummy.Parent.class
            java.lang.String r2 = "first"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Le java.lang.SecurityException -> L18
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> Le java.lang.SecurityException -> L18
            return r0
        Le:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L18:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    private static sun.misc.Unsafe getUnsafe() {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.String r1 = "theUnsafe"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L18
            r3 = r0
            r0 = r3
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L18
            r0 = r3
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L18
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Exception -> L18
            return r0
        L18:
            r0 = 0
            return r0
    }

    public com.sun.tools.javac.processing.JavacFiler getJavacFiler(java.lang.Object r7) {
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.processing.JavacFiler
            if (r0 == 0) goto Lc
            r0 = r7
            com.sun.tools.javac.processing.JavacFiler r0 = (com.sun.tools.javac.processing.JavacFiler) r0
            return r0
        Lc:
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            goto L40
        L14:
            r0 = r6
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.tryGetDelegateField(r1, r2)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L26
            r0 = r6
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.tryGetProxyDelegateToField(r1, r2)
            r9 = r0
        L26:
            r0 = r9
            if (r0 != 0) goto L31
            r0 = r6
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.tryGetFilerField(r1, r2)
            r9 = r0
        L31:
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r6
            r1 = r9
            com.sun.tools.javac.processing.JavacFiler r0 = r0.getJavacFiler(r1)
            return r0
        L3b:
            r0 = r8
            java.lang.Class r0 = r0.getSuperclass()
            r8 = r0
        L40:
            r0 = r8
            if (r0 != 0) goto L14
            r0 = r6
            javax.annotation.processing.ProcessingEnvironment r0 = r0.processingEnv
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Can't get a JavacFiler from "
            r3.<init>(r4)
            r3 = r7
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ". Lombok won't work."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.printMessage(r1, r2)
            r0 = 0
            return r0
    }

    private java.lang.Object tryGetDelegateField(java.lang.Class<?> r4, java.lang.Object r5) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "delegate"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lc
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.lang.Object tryGetProcessingEnvField(java.lang.Class<?> r4, java.lang.Object r5) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "processingEnv"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lc
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.lang.Object tryGetFilerField(java.lang.Class<?> r4, java.lang.Object r5) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "filer"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lc
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.lang.Object tryGetProxyDelegateToField(java.lang.Class<?> r4, java.lang.Object r5) {
            r3 = this;
            r0 = r5
            java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r0)     // Catch: java.lang.Exception -> L14
            r6 = r0
            r0 = r6
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = "val$delegateTo"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L14
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            r0 = 0
            return r0
    }
}
