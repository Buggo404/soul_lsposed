package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/TransformEclipseAST.SCL.lombok */
public class TransformEclipseAST {
    private final lombok.eclipse.EclipseAST ast;
    private static final java.lang.reflect.Field astCacheField = null;
    private static final lombok.eclipse.HandlerLibrary handlers = null;
    public static boolean disableLombok;
    private static final lombok.core.debug.HistogramTracker lombokTracker = null;
    private static java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, lombok.eclipse.TransformEclipseAST.State> transformationStates;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/TransformEclipseAST$AnnotationVisitor.SCL.lombok */
    private static class AnnotationVisitor extends lombok.eclipse.EclipseASTAdapter {
        private final long priority;
        private long nextPriority;

        public AnnotationVisitor(long r5) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.nextPriority = r1
                r0 = r4
                r1 = r5
                r0.priority = r1
                return
        }

        public long getNextPriority() {
                r3 = this;
                r0 = r3
                long r0 = r0.nextPriority
                return r0
        }

        @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.Annotation r13) {
                r10 = this;
                r0 = r12
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r14 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.nextPriority
                lombok.eclipse.HandlerLibrary r2 = lombok.eclipse.TransformEclipseAST.access$0()
                r3 = r14
                r4 = r12
                r5 = r13
                r6 = r10
                long r6 = r6.priority
                long r2 = r2.handleAnnotation(r3, r4, r5, r6)
                long r1 = java.lang.Math.min(r1, r2)
                r0.nextPriority = r1
                return
        }

        @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnMethodArgument(org.eclipse.jdt.internal.compiler.ast.Argument r11, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r12, lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.Annotation r14) {
                r10 = this;
                r0 = r13
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r15 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.nextPriority
                lombok.eclipse.HandlerLibrary r2 = lombok.eclipse.TransformEclipseAST.access$0()
                r3 = r15
                r4 = r13
                r5 = r14
                r6 = r10
                long r6 = r6.priority
                long r2 = r2.handleAnnotation(r3, r4, r5, r6)
                long r1 = java.lang.Math.min(r1, r2)
                r0.nextPriority = r1
                return
        }

        @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnLocal(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.Annotation r13) {
                r10 = this;
                r0 = r12
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r14 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.nextPriority
                lombok.eclipse.HandlerLibrary r2 = lombok.eclipse.TransformEclipseAST.access$0()
                r3 = r14
                r4 = r12
                r5 = r13
                r6 = r10
                long r6 = r6.priority
                long r2 = r2.handleAnnotation(r3, r4, r5, r6)
                long r1 = java.lang.Math.min(r1, r2)
                r0.nextPriority = r1
                return
        }

        @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.Annotation r13) {
                r10 = this;
                r0 = r12
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r14 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.nextPriority
                lombok.eclipse.HandlerLibrary r2 = lombok.eclipse.TransformEclipseAST.access$0()
                r3 = r14
                r4 = r12
                r5 = r13
                r6 = r10
                long r6 = r6.priority
                long r2 = r2.handleAnnotation(r3, r4, r5, r6)
                long r1 = java.lang.Math.min(r1, r2)
                r0.nextPriority = r1
                return
        }

        @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnType(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.Annotation r13) {
                r10 = this;
                r0 = r12
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r14 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.nextPriority
                lombok.eclipse.HandlerLibrary r2 = lombok.eclipse.TransformEclipseAST.access$0()
                r3 = r14
                r4 = r12
                r5 = r13
                r6 = r10
                long r6 = r6.priority
                long r2 = r2.handleAnnotation(r3, r4, r5, r6)
                long r1 = java.lang.Math.min(r1, r2)
                r0.nextPriority = r1
                return
        }

        @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnTypeUse(org.eclipse.jdt.internal.compiler.ast.TypeReference r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.Annotation r13) {
                r10 = this;
                r0 = r12
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r14 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.nextPriority
                lombok.eclipse.HandlerLibrary r2 = lombok.eclipse.TransformEclipseAST.access$0()
                r3 = r14
                r4 = r12
                r5 = r13
                r6 = r10
                long r6 = r6.priority
                long r2 = r2.handleAnnotation(r3, r4, r5, r6)
                long r1 = java.lang.Math.min(r1, r2)
                r0.nextPriority = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/TransformEclipseAST$State.SCL.lombok */
    private enum State extends java.lang.Enum<lombok.eclipse.TransformEclipseAST.State> {
        public static final lombok.eclipse.TransformEclipseAST.State DIET = null;
        public static final lombok.eclipse.TransformEclipseAST.State FULL = null;
        private static final /* synthetic */ lombok.eclipse.TransformEclipseAST.State[] ENUM$VALUES = null;

        static {
                lombok.eclipse.TransformEclipseAST$State r0 = new lombok.eclipse.TransformEclipseAST$State
                r1 = r0
                java.lang.String r2 = "DIET"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.eclipse.TransformEclipseAST.State.DIET = r0
                lombok.eclipse.TransformEclipseAST$State r0 = new lombok.eclipse.TransformEclipseAST$State
                r1 = r0
                java.lang.String r2 = "FULL"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.eclipse.TransformEclipseAST.State.FULL = r0
                r0 = 2
                lombok.eclipse.TransformEclipseAST$State[] r0 = new lombok.eclipse.TransformEclipseAST.State[r0]
                r1 = r0
                r2 = 0
                lombok.eclipse.TransformEclipseAST$State r3 = lombok.eclipse.TransformEclipseAST.State.DIET
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.eclipse.TransformEclipseAST$State r3 = lombok.eclipse.TransformEclipseAST.State.FULL
                r1[r2] = r3
                lombok.eclipse.TransformEclipseAST.State.ENUM$VALUES = r0
                return
        }

        State(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.eclipse.TransformEclipseAST.State[] values() {
                lombok.eclipse.TransformEclipseAST$State[] r0 = lombok.eclipse.TransformEclipseAST.State.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.eclipse.TransformEclipseAST$State[] r2 = new lombok.eclipse.TransformEclipseAST.State[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.eclipse.TransformEclipseAST.State valueOf(java.lang.String r3) {
                java.lang.Class<lombok.eclipse.TransformEclipseAST$State> r0 = lombok.eclipse.TransformEclipseAST.State.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.eclipse.TransformEclipseAST$State r0 = (lombok.eclipse.TransformEclipseAST.State) r0
                return r0
        }
    }

    static {
            r0 = 0
            lombok.eclipse.TransformEclipseAST.disableLombok = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = r0
            r1.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            lombok.eclipse.TransformEclipseAST.transformationStates = r0
            java.lang.String r0 = "lombok.histogram"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L22
            r0 = 0
            lombok.eclipse.TransformEclipseAST.lombokTracker = r0
            goto L4c
        L22:
            r0 = r5
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "sysout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            lombok.core.debug.HistogramTracker r0 = new lombok.core.debug.HistogramTracker
            r1 = r0
            java.lang.String r2 = "lombok.histogram"
            java.io.PrintStream r3 = java.lang.System.out
            r1.<init>(r2, r3)
            lombok.eclipse.TransformEclipseAST.lombokTracker = r0
            goto L4c
        L40:
            lombok.core.debug.HistogramTracker r0 = new lombok.core.debug.HistogramTracker
            r1 = r0
            java.lang.String r2 = "lombok.histogram"
            r1.<init>(r2)
            lombok.eclipse.TransformEclipseAST.lombokTracker = r0
        L4c:
            r0 = 0
            r5 = r0
            r0 = 0
            r6 = r0
            java.lang.String r0 = "lombok.disable"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L67
            r0 = 1
            lombok.eclipse.TransformEclipseAST.disableLombok = r0
            r0 = 0
            lombok.eclipse.TransformEclipseAST.astCacheField = r0
            r0 = 0
            lombok.eclipse.TransformEclipseAST.handlers = r0
            goto L9e
        L67:
            lombok.eclipse.HandlerLibrary r0 = lombok.eclipse.HandlerLibrary.load()     // Catch: java.lang.Throwable -> L6e
            r6 = r0
            goto L8a
        L6e:
            r7 = move-exception
            r0 = 0
            java.lang.String r1 = "Problem initializing lombok"
            r2 = r7
            lombok.eclipse.handlers.EclipseHandlerUtil.error(r0, r1, r2)     // Catch: java.lang.Throwable -> L79
            goto L86
        L79:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Problem initializing lombok"
            r0.println(r1)
            r0 = r7
            r0.printStackTrace()
        L86:
            r0 = 1
            lombok.eclipse.TransformEclipseAST.disableLombok = r0
        L8a:
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration.class
            java.lang.String r1 = "$lombokAST"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L95
            r5 = r0
            goto L96
        L95:
        L96:
            r0 = r5
            lombok.eclipse.TransformEclipseAST.astCacheField = r0
            r0 = r6
            lombok.eclipse.TransformEclipseAST.handlers = r0
        L9e:
            return
    }

    public static void transform_swapped(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r3, org.eclipse.jdt.internal.compiler.parser.Parser r4) {
            r0 = r4
            r1 = r3
            transform(r0, r1)
            return
    }

    public static lombok.eclipse.EclipseAST getAST(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r4, boolean r5) {
            r0 = 0
            r6 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.TransformEclipseAST.astCacheField
            if (r0 == 0) goto L17
            java.lang.reflect.Field r0 = lombok.eclipse.TransformEclipseAST.astCacheField     // Catch: java.lang.Exception -> L16
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L16
            lombok.eclipse.EclipseAST r0 = (lombok.eclipse.EclipseAST) r0     // Catch: java.lang.Exception -> L16
            r6 = r0
            goto L17
        L16:
        L17:
            r0 = r6
            if (r0 != 0) goto L39
            lombok.eclipse.EclipseAST r0 = new lombok.eclipse.EclipseAST
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.TransformEclipseAST.astCacheField
            if (r0 == 0) goto L3e
            java.lang.reflect.Field r0 = lombok.eclipse.TransformEclipseAST.astCacheField     // Catch: java.lang.Exception -> L35
            r1 = r4
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L35
            goto L3e
        L35:
            goto L3e
        L39:
            r0 = r6
            r1 = r5
            r0.rebuild(r1)
        L3e:
            r0 = r6
            return r0
    }

    public static boolean alreadyTransformed(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r4) {
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, lombok.eclipse.TransformEclipseAST$State> r0 = lombok.eclipse.TransformEclipseAST.transformationStates
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.TransformEclipseAST$State r0 = (lombok.eclipse.TransformEclipseAST.State) r0
            r5 = r0
            r0 = r5
            lombok.eclipse.TransformEclipseAST$State r1 = lombok.eclipse.TransformEclipseAST.State.FULL
            if (r0 != r1) goto L16
            r0 = 1
            return r0
        L16:
            r0 = r5
            lombok.eclipse.TransformEclipseAST$State r1 = lombok.eclipse.TransformEclipseAST.State.DIET
            if (r0 != r1) goto L36
            r0 = r4
            boolean r0 = lombok.eclipse.EclipseAST.isComplete(r0)
            if (r0 != 0) goto L26
            r0 = 1
            return r0
        L26:
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, lombok.eclipse.TransformEclipseAST$State> r0 = lombok.eclipse.TransformEclipseAST.transformationStates
            r1 = r4
            lombok.eclipse.TransformEclipseAST$State r2 = lombok.eclipse.TransformEclipseAST.State.FULL
            java.lang.Object r0 = r0.put(r1, r2)
            goto L43
        L36:
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, lombok.eclipse.TransformEclipseAST$State> r0 = lombok.eclipse.TransformEclipseAST.transformationStates
            r1 = r4
            lombok.eclipse.TransformEclipseAST$State r2 = lombok.eclipse.TransformEclipseAST.State.DIET
            java.lang.Object r0 = r0.put(r1, r2)
        L43:
            r0 = 0
            return r0
    }

    public static void transform(org.eclipse.jdt.internal.compiler.parser.Parser r8, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r9) {
            boolean r0 = lombok.eclipse.TransformEclipseAST.disableLombok
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "lombok.disable"
            boolean r0 = lombok.patcher.Symbols.hasSymbol(r0)
            if (r0 == 0) goto L10
            return
        L10:
            r0 = r9
            boolean r0 = alreadyTransformed(r0)
            if (r0 == 0) goto L18
            return
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.LOMBOK_DISABLE
            r2 = r9
            java.net.URI r2 = lombok.eclipse.EclipseAST.getAbsoluteFileLocation(r2)
            java.lang.Object r1 = lombok.core.LombokConfiguration.read(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            return
        L2c:
            lombok.core.debug.DebugSnapshotStore r0 = lombok.core.debug.DebugSnapshotStore.INSTANCE     // Catch: java.lang.Throwable -> L86
            r1 = r9
            java.lang.String r2 = "transform entry"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L86
            r0.snapshot(r1, r2, r3)     // Catch: java.lang.Throwable -> L86
            lombok.core.debug.HistogramTracker r0 = lombok.eclipse.TransformEclipseAST.lombokTracker     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L43
            r0 = 0
            goto L49
        L43:
            lombok.core.debug.HistogramTracker r0 = lombok.eclipse.TransformEclipseAST.lombokTracker     // Catch: java.lang.Throwable -> L86
            long r0 = r0.start()     // Catch: java.lang.Throwable -> L86
        L49:
            r10 = r0
            r0 = r9
            r1 = 0
            lombok.eclipse.EclipseAST r0 = getAST(r0, r1)     // Catch: java.lang.Throwable -> L86
            r12 = r0
            r0 = r12
            r1 = r8
            org.eclipse.jdt.internal.compiler.parser.Scanner r1 = r1.scanner     // Catch: java.lang.Throwable -> L86
            char[] r1 = r1.getSource()     // Catch: java.lang.Throwable -> L86
            r0.setSource(r1)     // Catch: java.lang.Throwable -> L86
            lombok.eclipse.TransformEclipseAST r0 = new lombok.eclipse.TransformEclipseAST     // Catch: java.lang.Throwable -> L86
            r1 = r0
            r2 = r12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r0.m68go()     // Catch: java.lang.Throwable -> L86
            lombok.core.debug.HistogramTracker r0 = lombok.eclipse.TransformEclipseAST.lombokTracker     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L76
            lombok.core.debug.HistogramTracker r0 = lombok.eclipse.TransformEclipseAST.lombokTracker     // Catch: java.lang.Throwable -> L86
            r1 = r10
            r0.end(r1)     // Catch: java.lang.Throwable -> L86
        L76:
            lombok.core.debug.DebugSnapshotStore r0 = lombok.core.debug.DebugSnapshotStore.INSTANCE     // Catch: java.lang.Throwable -> L86
            r1 = r9
            java.lang.String r2 = "transform exit"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L86
            r0.snapshot(r1, r2, r3)     // Catch: java.lang.Throwable -> L86
            goto Lec
        L86:
            r10 = move-exception
            lombok.core.debug.DebugSnapshotStore r0 = lombok.core.debug.DebugSnapshotStore.INSTANCE
            r1 = r9
            java.lang.String r2 = "transform error: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r10
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r4[r5] = r6
            r0.snapshot(r1, r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r1 = r0
            java.lang.String r2 = "Lombok can't parse this source: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lca
            r1 = r10
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lca
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lca
            r11 = r0
            r0 = r9
            char[] r0 = r0.getFileName()     // Catch: java.lang.Throwable -> Lca
            r1 = r9
            org.eclipse.jdt.internal.compiler.CompilationResult r1 = r1.compilationResult     // Catch: java.lang.Throwable -> Lca
            r2 = 0
            r3 = r11
            r4 = 0
            r5 = 0
            lombok.eclipse.EclipseAST.addProblemToCompilationResult(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lca
            r0 = r10
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lca
            goto Lec
        Lca:
            r11 = move-exception
            r0 = r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le7
            r2 = r1
            java.lang.String r3 = "Can't create an error in the problems dialog while adding: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le7
            r2 = r10
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le7
            r2 = r11
            lombok.eclipse.handlers.EclipseHandlerUtil.error(r0, r1, r2)     // Catch: java.lang.Throwable -> Le7
            goto Lec
        Le7:
            r0 = 1
            lombok.eclipse.TransformEclipseAST.disableLombok = r0
        Lec:
            return
    }

    public TransformEclipseAST(lombok.eclipse.EclipseAST r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.ast = r1
            return
    }

    /* renamed from: go */
    public void m68go() {
            r8 = this;
            r0 = -9223372036854775808
            r9 = r0
            lombok.eclipse.HandlerLibrary r0 = lombok.eclipse.TransformEclipseAST.handlers
            java.util.SortedSet r0 = r0.getPriorities()
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L61
        L14:
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r11 = r0
            r0 = r9
            r1 = r11
            long r1 = r1.longValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            goto L61
        L2b:
            lombok.eclipse.TransformEclipseAST$AnnotationVisitor r0 = new lombok.eclipse.TransformEclipseAST$AnnotationVisitor
            r1 = r0
            r2 = r11
            long r2 = r2.longValue()
            r1.<init>(r2)
            r13 = r0
            r0 = r8
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r13
            r0.traverse(r1)
            r0 = r13
            long r0 = r0.getNextPriority()
            r9 = r0
            r0 = r9
            lombok.eclipse.HandlerLibrary r1 = lombok.eclipse.TransformEclipseAST.handlers
            r2 = r8
            lombok.eclipse.EclipseAST r2 = r2.ast
            r3 = r11
            long r3 = r3.longValue()
            r4 = r8
            lombok.eclipse.EclipseAST r4 = r4.ast
            boolean r4 = r4.isCompleteParse()
            long r1 = r1.callASTVisitors(r2, r3, r4)
            long r0 = java.lang.Math.min(r0, r1)
            r9 = r0
        L61:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            return
    }

    static /* synthetic */ lombok.eclipse.HandlerLibrary access$0() {
            lombok.eclipse.HandlerLibrary r0 = lombok.eclipse.TransformEclipseAST.handlers
            return r0
    }
}
