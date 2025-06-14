package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAST.SCL.lombok */
public class EclipseAST extends lombok.core.AST<lombok.eclipse.EclipseAST, lombok.eclipse.EclipseNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> {
    private static volatile boolean skipEclipseWorkspaceBasedFileResolver;
    private static final java.net.URI NOT_CALCULATED_MARKER = null;
    private java.net.URI memoizedAbsoluteFileLocation;
    private final java.util.List<lombok.eclipse.EclipseAST.ParseProblem> queuedProblems;
    private final org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration compilationUnitDeclaration;
    private char[] source;
    private boolean completeParse;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAST$EcjReflectionCheck.SCL.lombok */
    private static class EcjReflectionCheck {
        private static final java.lang.String COMPILATIONRESULT_TYPE = "org.eclipse.jdt.internal.compiler.CompilationResult";
        public static final java.lang.reflect.Method addProblemToCompilationResult = null;
        public static final java.lang.Throwable problemAddProblemToCompilationResult = null;
        public static final java.lang.reflect.Method typeReferenceGetAnnotationsOnDimensions = null;
        public static final java.lang.reflect.Field typeReferenceAnnotations = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                java.lang.Class<lombok.eclipse.EclipseAstProblemView> r0 = lombok.eclipse.EclipseAstProblemView.class
                java.lang.String r1 = "addProblemToCompilationResult"
                r2 = 6
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L38
                r3 = r2
                r4 = 0
                java.lang.Class<char[]> r5 = char[].class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L38
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.CompilationResult"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L38
                r3[r4] = r5     // Catch: java.lang.Throwable -> L38
                r3 = r2
                r4 = 2
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L38
                r3[r4] = r5     // Catch: java.lang.Throwable -> L38
                r3 = r2
                r4 = 3
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L38
                r3 = r2
                r4 = 4
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L38
                r3[r4] = r5     // Catch: java.lang.Throwable -> L38
                r3 = r2
                r4 = 5
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L38
                r3[r4] = r5     // Catch: java.lang.Throwable -> L38
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L38
                r8 = r0
                goto L3d
            L38:
                r11 = move-exception
                r0 = r11
                r7 = r0
            L3d:
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TypeReference> r0 = org.eclipse.jdt.internal.compiler.ast.TypeReference.class
                java.lang.String r1 = "getAnnotationsOnDimensions"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4c
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L4c
                r9 = r0
                goto L4f
            L4c:
                r0 = 0
                r9 = r0
            L4f:
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TypeReference> r0 = org.eclipse.jdt.internal.compiler.ast.TypeReference.class
                java.lang.String r1 = "annotations"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L5a
                r10 = r0
                goto L5d
            L5a:
                r0 = 0
                r10 = r0
            L5d:
                r0 = r8
                lombok.eclipse.EclipseAST.EcjReflectionCheck.addProblemToCompilationResult = r0
                r0 = r7
                lombok.eclipse.EclipseAST.EcjReflectionCheck.problemAddProblemToCompilationResult = r0
                r0 = r9
                lombok.eclipse.EclipseAST.EcjReflectionCheck.typeReferenceGetAnnotationsOnDimensions = r0
                r0 = r10
                lombok.eclipse.EclipseAST.EcjReflectionCheck.typeReferenceAnnotations = r0
                return
        }

        private EcjReflectionCheck() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAST$EclipseWorkspaceBasedFileResolver.SCL.lombok */
    private static class EclipseWorkspaceBasedFileResolver {
        private EclipseWorkspaceBasedFileResolver() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.net.URI resolve(java.lang.String r5) {
                r0 = r5
                if (r0 == 0) goto Lf
                r0 = r5
                r1 = 47
                r2 = 1
                int r0 = r0.indexOf(r1, r2)
                r1 = -1
                if (r0 != r1) goto L11
            Lf:
                r0 = 0
                return r0
            L11:
                org.eclipse.core.resources.IWorkspace r0 = org.eclipse.core.resources.ResourcesPlugin.getWorkspace()     // Catch: java.lang.Exception -> L2c
                org.eclipse.core.resources.IWorkspaceRoot r0 = r0.getRoot()     // Catch: java.lang.Exception -> L2c
                org.eclipse.core.runtime.Path r1 = new org.eclipse.core.runtime.Path     // Catch: java.lang.Exception -> L2c
                r2 = r1
                r3 = r5
                r2.<init>(r3)     // Catch: java.lang.Exception -> L2c
                org.eclipse.core.resources.IFile r0 = r0.getFile(r1)     // Catch: java.lang.Exception -> L2c
                java.net.URI r0 = r0.getLocationURI()     // Catch: java.lang.Exception -> L2c
                return r0
            L2c:
                r0 = 0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAST$ParseProblem.SCL.lombok */
    class ParseProblem {
        final boolean isWarning;
        final java.lang.String message;
        final int sourceStart;
        final int sourceEnd;
        final /* synthetic */ lombok.eclipse.EclipseAST this$0;

        ParseProblem(lombok.eclipse.EclipseAST r4, boolean r5, java.lang.String r6, int r7, int r8) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.isWarning = r1
                r0 = r3
                r1 = r6
                r0.message = r1
                r0 = r3
                r1 = r7
                r0.sourceStart = r1
                r0 = r3
                r1 = r8
                r0.sourceEnd = r1
                return
        }

        void addToCompilationResult() {
                r7 = this;
                r0 = r7
                lombok.eclipse.EclipseAST r0 = r0.this$0
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
                r8 = r0
                r0 = r8
                char[] r0 = r0.getFileName()
                r1 = r8
                org.eclipse.jdt.internal.compiler.CompilationResult r1 = r1.compilationResult
                r2 = r7
                boolean r2 = r2.isWarning
                r3 = r7
                java.lang.String r3 = r3.message
                r4 = r7
                int r4 = r4.sourceStart
                r5 = r7
                int r5 = r5.sourceEnd
                lombok.eclipse.EclipseAST.addProblemToCompilationResult(r0, r1, r2, r3, r4, r5)
                return
        }
    }

    static {
            r0 = 0
            lombok.eclipse.EclipseAST.skipEclipseWorkspaceBasedFileResolver = r0
            java.lang.String r0 = "https://projectlombok.org/not/calculated"
            java.net.URI r0 = java.net.URI.create(r0)
            lombok.eclipse.EclipseAST.NOT_CALCULATED_MARKER = r0
            return
    }

    public EclipseAST(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r8) {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.String r1 = toFileName(r1)
            r2 = r8
            java.lang.String r2 = packageDeclaration(r2)
            lombok.eclipse.EclipseImportList r3 = new lombok.eclipse.EclipseImportList
            r4 = r3
            r5 = r8
            r4.<init>(r5)
            java.util.Collection r4 = statementTypes()
            r0.<init>(r1, r2, r3, r4)
            r0 = r7
            java.net.URI r1 = lombok.eclipse.EclipseAST.NOT_CALCULATED_MARKER
            r0.memoizedAbsoluteFileLocation = r1
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.queuedProblems = r1
            r0 = r7
            r1 = r8
            r0.compilationUnitDeclaration = r1
            r0 = r7
            r1 = r7
            r2 = r8
            lombok.eclipse.EclipseNode r1 = r1.buildCompilationUnit(r2)
            r0.setTop(r1)
            r0 = r7
            r1 = r8
            boolean r1 = isComplete(r1)
            r0.completeParse = r1
            r0 = r7
            r0.clearChanged()
            return
    }

    public static java.net.URI getAbsoluteFileLocation(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2) {
            r0 = r2
            java.net.URI r0 = getAbsoluteFileLocation0(r0)
            return r0
    }

    @Override // lombok.core.AST
    public java.net.URI getAbsoluteFileLocation() {
            r3 = this;
            r0 = r3
            java.net.URI r0 = r0.memoizedAbsoluteFileLocation
            java.net.URI r1 = lombok.eclipse.EclipseAST.NOT_CALCULATED_MARKER
            if (r0 == r1) goto Lf
            r0 = r3
            java.net.URI r0 = r0.memoizedAbsoluteFileLocation
            return r0
        Lf:
            r0 = r3
            r1 = r3
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r1 = r1.compilationUnitDeclaration
            java.net.URI r1 = getAbsoluteFileLocation0(r1)
            r0.memoizedAbsoluteFileLocation = r1
            r0 = r3
            java.net.URI r0 = r0.memoizedAbsoluteFileLocation
            return r0
    }

    private static java.net.URI getAbsoluteFileLocation0(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r4) {
            r0 = r4
            java.lang.String r0 = toFileName(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L20
            r0 = r5
            java.lang.String r1 = "file:"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "sourcecontrol:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L20
        L1b:
            r0 = r5
            java.net.URI r0 = java.net.URI.create(r0)
            return r0
        L20:
            boolean r0 = lombok.eclipse.EclipseAST.skipEclipseWorkspaceBasedFileResolver
            if (r0 != 0) goto L4d
            r0 = r5
            java.net.URI r0 = lombok.eclipse.EclipseAST.EclipseWorkspaceBasedFileResolver.resolve(r0)     // Catch: java.lang.IllegalArgumentException -> L2b java.lang.NoClassDefFoundError -> L48
            return r0
        L2b:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NoClassDefFoundError -> L48
            r1 = r0
            java.lang.String r2 = "Finding 'lombok.config' file failed for '"
            r1.<init>(r2)     // Catch: java.lang.NoClassDefFoundError -> L48
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NoClassDefFoundError -> L48
            java.lang.String r1 = "'"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NoClassDefFoundError -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NoClassDefFoundError -> L48
            r1 = r6
            lombok.eclipse.handlers.EclipseHandlerUtil.warning(r0, r1)     // Catch: java.lang.NoClassDefFoundError -> L48
            goto L4d
        L48:
            r0 = 1
            lombok.eclipse.EclipseAST.skipEclipseWorkspaceBasedFileResolver = r0
        L4d:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L5c
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5c
            java.io.File r0 = r0.getAbsoluteFile()     // Catch: java.lang.Exception -> L5c
            java.net.URI r0 = r0.toURI()     // Catch: java.lang.Exception -> L5c
            return r0
        L5c:
            r0 = 0
            return r0
    }

    private static java.lang.String packageDeclaration(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2) {
            r0 = r2
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.currentPackage
            r3 = r0
            r0 = r3
            if (r0 != 0) goto Ld
            r0 = 0
            goto L14
        Ld:
            r0 = r3
            char[][] r0 = r0.getImportName()
            java.lang.String r0 = lombok.eclipse.Eclipse.toQualifiedName(r0)
        L14:
            return r0
    }

    @Override // lombok.core.AST
    public int getSourceVersion() {
            r6 = this;
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnitDeclaration
            org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter
            org.eclipse.jdt.internal.compiler.impl.CompilerOptions r0 = r0.options
            long r0 = r0.sourceLevel
            r7 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnitDeclaration
            org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter
            org.eclipse.jdt.internal.compiler.impl.CompilerOptions r0 = r0.options
            long r0 = r0.complianceLevel
            r9 = r0
            r0 = r7
            r1 = 16
            long r0 = r0 >> r1
            r7 = r0
            r0 = r9
            r1 = 16
            long r0 = r0 >> r1
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            r0 = r9
            r7 = r0
        L2e:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L36
            r0 = r7
            r9 = r0
        L36:
            r0 = r7
            r1 = 44
            long r0 = r0 - r1
            int r0 = (int) r0
            r1 = r9
            r2 = 44
            long r1 = r1 - r2
            int r1 = (int) r1
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // lombok.core.AST
    public int getLatestJavaSpecSupported() {
            r2 = this;
            int r0 = lombok.eclipse.Eclipse.getEcjCompilerVersion()
            return r0
    }

    public void traverse(lombok.eclipse.EclipseASTVisitor r4) {
            r3 = this;
            r0 = r3
            lombok.core.LombokNode r0 = r0.top()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r4
            r0.traverse(r1)
            return
    }

    void traverseChildren(lombok.eclipse.EclipseASTVisitor r4, lombok.eclipse.EclipseNode r5) {
            r3 = this;
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            r6 = r0
            r0 = r6
            int r0 = r0.size()
            r7 = r0
            r0 = 0
            r8 = r0
            goto L21
        L11:
            r0 = r6
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r4
            r0.traverse(r1)
            int r8 = r8 + 1
        L21:
            r0 = r8
            r1 = r7
            if (r0 < r1) goto L11
            return
    }

    public void setSource(char[] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.source = r1
            return
    }

    public char[] getSource() {
            r2 = this;
            r0 = r2
            char[] r0 = r0.source
            return r0
    }

    public boolean isCompleteParse() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.completeParse
            return r0
    }

    private void propagateProblems() {
            r2 = this;
            r0 = r2
            java.util.List<lombok.eclipse.EclipseAST$ParseProblem> r0 = r0.queuedProblems
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            r0 = r2
            lombok.core.LombokNode r0 = r0.top()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
            r3 = r0
            r0 = r3
            org.eclipse.jdt.internal.compiler.CompilationResult r0 = r0.compilationResult
            if (r0 != 0) goto L23
            return
        L23:
            r0 = r2
            java.util.List<lombok.eclipse.EclipseAST$ParseProblem> r0 = r0.queuedProblems
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto L3e
        L30:
            r0 = r5
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseAST$ParseProblem r0 = (lombok.eclipse.EclipseAST.ParseProblem) r0
            r4 = r0
            r0 = r4
            r0.addToCompilationResult()
        L3e:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L30
            r0 = r2
            java.util.List<lombok.eclipse.EclipseAST$ParseProblem> r0 = r0.queuedProblems
            r0.clear()
            return
    }

    void addProblem(lombok.eclipse.EclipseAST.ParseProblem r4) {
            r3 = this;
            r0 = r3
            java.util.List<lombok.eclipse.EclipseAST$ParseProblem> r0 = r0.queuedProblems
            r1 = r4
            boolean r0 = r0.add(r1)
            r0 = r3
            r0.propagateProblems()
            return
    }

    public static void addProblemToCompilationResult(char[] r8, org.eclipse.jdt.internal.compiler.CompilationResult r9, boolean r10, java.lang.String r11, int r12, int r13) {
            java.lang.Throwable r0 = lombok.eclipse.EclipseAST.EcjReflectionCheck.problemAddProblemToCompilationResult
            java.lang.reflect.Method r1 = lombok.eclipse.EclipseAST.EcjReflectionCheck.addProblemToCompilationResult
            r2 = 0
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r9
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r10
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = r11
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = r12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = r13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2, r3)
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] getTopLevelTypeReferenceAnnotations(org.eclipse.jdt.internal.compiler.ast.TypeReference r4) {
            java.lang.reflect.Method r0 = lombok.eclipse.EclipseAST.EcjReflectionCheck.typeReferenceGetAnnotationsOnDimensions
            r5 = r0
            r0 = r5
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 0
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L21
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[][]) r0     // Catch: java.lang.Throwable -> L21
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r6
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
        L22:
            java.lang.reflect.Field r0 = lombok.eclipse.EclipseAST.EcjReflectionCheck.typeReferenceAnnotations     // Catch: java.lang.Throwable -> L42
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = r7
            r1 = r4
            java.lang.Object r0 = lombok.permit.Permit.get(r0, r1)     // Catch: java.lang.Throwable -> L42
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[][]) r0     // Catch: java.lang.Throwable -> L42
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L3b
            r0 = 0
            return r0
        L3b:
            r0 = r6
            r1 = r6
            int r1 = r1.length     // Catch: java.lang.Throwable -> L42
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L42
            return r0
        L42:
            r0 = 0
            return r0
    }

    private static java.lang.String toFileName(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r4) {
            r0 = r4
            org.eclipse.jdt.internal.compiler.CompilationResult r0 = r0.compilationResult
            char[] r0 = r0.fileName
            if (r0 != 0) goto Le
            r0 = 0
            goto L1c
        Le:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r4
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            char[] r2 = r2.fileName
            r1.<init>(r2)
        L1c:
            return r0
    }

    public void rebuild(boolean r4) {
            r3 = this;
            r0 = r3
            r0.propagateProblems()
            r0 = r3
            boolean r0 = r0.completeParse
            if (r0 == 0) goto L10
            r0 = r4
            if (r0 != 0) goto L10
            return
        L10:
            r0 = r3
            boolean r0 = r0.isChanged()
            r5 = r0
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnitDeclaration
            boolean r0 = isComplete(r0)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L26
            r0 = r4
            if (r0 != 0) goto L26
            return
        L26:
            r0 = r3
            lombok.core.LombokNode r0 = r0.top()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r0.rebuild()
            r0 = r3
            r1 = r6
            r0.completeParse = r1
            r0 = r5
            if (r0 != 0) goto L3d
            r0 = r3
            r0.clearChanged()
        L3d:
            return
    }

    public static boolean isComplete(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r3) {
            r0 = r3
            int r0 = r0.bits
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* renamed from: buildTree, reason: avoid collision after fix types in other method */
    protected lombok.eclipse.EclipseNode buildTree2(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, lombok.core.AST.Kind r8) {
            r6 = this;
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r8
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L40;
                case 2: goto L49;
                case 3: goto L52;
                case 4: goto L5c;
                case 5: goto L65;
                case 6: goto L8b;
                case 7: goto L6e;
                case 8: goto L78;
                case 9: goto L82;
                case 10: goto L95;
                default: goto L9e;
            }
        L40:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r1
            lombok.eclipse.EclipseNode r0 = r0.buildCompilationUnit(r1)
            return r0
        L49:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            lombok.eclipse.EclipseNode r0 = r0.buildType(r1)
            return r0
        L52:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r1
            r2 = 0
            lombok.eclipse.EclipseNode r0 = r0.buildField(r1, r2)
            return r0
        L5c:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Initializer r1 = (org.eclipse.jdt.internal.compiler.ast.Initializer) r1
            lombok.eclipse.EclipseNode r0 = r0.buildInitializer(r1)
            return r0
        L65:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            lombok.eclipse.EclipseNode r0 = r0.buildMethod(r1)
            return r0
        L6e:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Argument r1 = (org.eclipse.jdt.internal.compiler.ast.Argument) r1
            r2 = r8
            lombok.eclipse.EclipseNode r0 = r0.buildLocal(r1, r2)
            return r0
        L78:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r1
            r2 = r8
            lombok.eclipse.EclipseNode r0 = r0.buildLocal(r1, r2)
            return r0
        L82:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Statement r1 = (org.eclipse.jdt.internal.compiler.ast.Statement) r1
            lombok.eclipse.EclipseNode r0 = r0.buildStatement(r1)
            return r0
        L8b:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r1
            r2 = 0
            lombok.eclipse.EclipseNode r0 = r0.buildAnnotation(r1, r2)
            return r0
        L95:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r1
            lombok.eclipse.EclipseNode r0 = r0.buildTypeUse(r1)
            return r0
        L9e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Did not expect to arrive here: "
            r3.<init>(r4)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private lombok.eclipse.EclipseNode buildCompilationUnit(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r8
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r1 = r1.types
            java.util.List r0 = r0.buildTypes(r1)
            r10 = r0
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.COMPILATION_UNIT
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private void addIfNotNull(java.util.Collection<lombok.eclipse.EclipseNode> r4, lombok.eclipse.EclipseNode r5) {
            r3 = this;
            r0 = r5
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = r5
            boolean r0 = r0.add(r1)
        Lc:
            return
    }

    private java.util.List<lombok.eclipse.EclipseNode> buildTypes(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L33
            r0 = r6
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L2c
        L19:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r5
            r1 = r7
            r2 = r5
            r3 = r8
            lombok.eclipse.EclipseNode r2 = r2.buildType(r3)
            r0.addIfNotNull(r1, r2)
            int r9 = r9 + 1
        L2c:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L19
        L33:
            r0 = r7
            return r0
    }

    private lombok.eclipse.EclipseNode buildType(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r2 = r2.fields
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r3 = lombok.eclipse.handlers.EclipseHandlerUtil.getRecordFieldAnnotations(r3)
            java.util.Collection r1 = r1.buildFields(r2, r3)
            boolean r0 = r0.addAll(r1)
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r2 = r2.memberTypes
            java.util.List r1 = r1.buildTypes(r2)
            boolean r0 = r0.addAll(r1)
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r2 = r2.methods
            java.util.Collection r1 = r1.buildMethods(r2)
            boolean r0 = r0.addAll(r1)
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            r3 = 0
            java.util.Collection r1 = r1.buildAnnotations(r2, r3)
            boolean r0 = r0.addAll(r1)
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private java.util.Collection<lombok.eclipse.EclipseNode> buildFields(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r8, org.eclipse.jdt.internal.compiler.ast.Annotation[][] r9) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L2d
            r0 = 0
            r11 = r0
            goto L26
        L12:
            r0 = r7
            r1 = r10
            r2 = r7
            r3 = r8
            r4 = r11
            r3 = r3[r4]
            r4 = r9
            r5 = r11
            r4 = r4[r5]
            lombok.eclipse.EclipseNode r2 = r2.buildField(r3, r4)
            r0.addIfNotNull(r1, r2)
            int r11 = r11 + 1
        L26:
            r0 = r11
            r1 = r8
            int r1 = r1.length
            if (r0 < r1) goto L12
        L2d:
            r0 = r10
            return r0
    }

    private static <T> java.util.List<T> singleton(T r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r4
            r1 = r3
            boolean r0 = r0.add(r1)
        L14:
            r0 = r4
            return r0
    }

    private lombok.eclipse.EclipseNode buildField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r9, org.eclipse.jdt.internal.compiler.ast.Annotation[] r10) {
            r8 = this;
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Initializer
            if (r0 == 0) goto L10
            r0 = r8
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.Initializer r1 = (org.eclipse.jdt.internal.compiler.ast.Initializer) r1
            lombok.eclipse.EclipseNode r0 = r0.buildInitializer(r1)
            return r0
        L10:
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto L1a
            r0 = 0
            return r0
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r8
            r1 = r11
            r2 = r8
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.type
            lombok.eclipse.EclipseNode r2 = r2.buildTypeUse(r3)
            r0.addIfNotNull(r1, r2)
            r0 = r8
            r1 = r11
            r2 = r8
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = r3.initialization
            lombok.eclipse.EclipseNode r2 = r2.buildStatement(r3)
            r0.addIfNotNull(r1, r2)
            r0 = r11
            r1 = r8
            r2 = r10
            if (r2 == 0) goto L46
            r2 = r10
            goto L4a
        L46:
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
        L4a:
            r3 = 1
            java.util.Collection r1 = r1.buildAnnotations(r2, r3)
            boolean r0 = r0.addAll(r1)
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.FIELD
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private lombok.eclipse.EclipseNode buildInitializer(org.eclipse.jdt.internal.compiler.ast.Initializer r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r8
            r6 = r9
            org.eclipse.jdt.internal.compiler.ast.Block r6 = r6.block
            lombok.eclipse.EclipseNode r5 = r5.buildStatement(r6)
            java.util.List r5 = singleton(r5)
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.INITIALIZER
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private java.util.Collection<lombok.eclipse.EclipseNode> buildMethods(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L33
            r0 = r6
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L2c
        L19:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r5
            r1 = r7
            r2 = r5
            r3 = r8
            lombok.eclipse.EclipseNode r2 = r2.buildMethod(r3)
            r0.addIfNotNull(r1, r2)
            int r9 = r9 + 1
        L2c:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L19
        L33:
            r0 = r7
            return r0
    }

    private lombok.eclipse.EclipseNode buildMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.Argument[] r2 = r2.arguments
            java.util.Collection r1 = r1.buildArguments(r2)
            boolean r0 = r0.addAll(r1)
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L3a
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            r11 = r0
            r0 = r8
            r1 = r10
            r2 = r8
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r3 = r3.constructorCall
            lombok.eclipse.EclipseNode r2 = r2.buildStatement(r3)
            r0.addIfNotNull(r1, r2)
        L3a:
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = r2.statements
            java.util.Collection r1 = r1.buildStatements(r2)
            boolean r0 = r0.addAll(r1)
            r0 = r10
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            r3 = 0
            java.util.Collection r1 = r1.buildAnnotations(r2, r3)
            boolean r0 = r0.addAll(r1)
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.METHOD
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private java.util.Collection<lombok.eclipse.EclipseNode> buildArguments(org.eclipse.jdt.internal.compiler.ast.Argument[] r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r7
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L2f
        L19:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r6
            r3 = r9
            lombok.core.AST$Kind r4 = lombok.core.AST.Kind.ARGUMENT
            lombok.eclipse.EclipseNode r2 = r2.buildLocal(r3, r4)
            r0.addIfNotNull(r1, r2)
            int r10 = r10 + 1
        L2f:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L19
        L36:
            r0 = r8
            return r0
    }

    private lombok.eclipse.EclipseNode buildLocal(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r9, lombok.core.AST.Kind r10) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r8
            r1 = r11
            r2 = r8
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.type
            lombok.eclipse.EclipseNode r2 = r2.buildTypeUse(r3)
            r0.addIfNotNull(r1, r2)
            r0 = r8
            r1 = r11
            r2 = r8
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = r3.initialization
            lombok.eclipse.EclipseNode r2 = r2.buildStatement(r3)
            r0.addIfNotNull(r1, r2)
            r0 = r11
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            r3 = 1
            java.util.Collection r1 = r1.buildAnnotations(r2, r3)
            boolean r0 = r0.addAll(r1)
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r10
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private lombok.eclipse.EclipseNode buildTypeUse(org.eclipse.jdt.internal.compiler.ast.TypeReference r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r9
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = getTopLevelTypeReferenceAnnotations(r0)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L4b
            r0 = r11
            r1 = r0
            r15 = r1
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r13 = r0
            goto L44
        L2e:
            r0 = r15
            r1 = r13
            r0 = r0[r1]
            r12 = r0
            r0 = r8
            r1 = r10
            r2 = r8
            r3 = r12
            r4 = 0
            lombok.eclipse.EclipseNode r2 = r2.buildAnnotation(r3, r4)
            r0.addIfNotNull(r1, r2)
            int r13 = r13 + 1
        L44:
            r0 = r13
            r1 = r14
            if (r0 < r1) goto L2e
        L4b:
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            if (r0 == 0) goto Lac
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference) r0
            r12 = r0
            r0 = r12
            char[][] r0 = r0.tokens
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
            goto La2
        L66:
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L9f
            r0 = r15
            r1 = r0
            r19 = r1
            int r0 = r0.length
            r18 = r0
            r0 = 0
            r17 = r0
            goto L98
        L83:
            r0 = r19
            r1 = r17
            r0 = r0[r1]
            r16 = r0
            r0 = r8
            r1 = r10
            r2 = r8
            r3 = r16
            lombok.eclipse.EclipseNode r2 = r2.buildTypeUse(r3)
            r0.addIfNotNull(r1, r2)
            int r17 = r17 + 1
        L98:
            r0 = r17
            r1 = r18
            if (r0 < r1) goto L83
        L9f:
            int r14 = r14 + 1
        La2:
            r0 = r14
            r1 = r13
            if (r0 < r1) goto L66
            goto L111
        Lac:
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            if (r0 == 0) goto Lf1
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference) r0
            r12 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            if (r0 == 0) goto L111
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            r1 = r0
            r16 = r1
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r14 = r0
            goto Le7
        Ld2:
            r0 = r16
            r1 = r14
            r0 = r0[r1]
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r8
            r3 = r13
            lombok.eclipse.EclipseNode r2 = r2.buildTypeUse(r3)
            r0.addIfNotNull(r1, r2)
            int r14 = r14 + 1
        Le7:
            r0 = r14
            r1 = r15
            if (r0 < r1) goto Ld2
            goto L111
        Lf1:
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Wildcard
            if (r0 == 0) goto L111
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = (org.eclipse.jdt.internal.compiler.ast.Wildcard) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.bound
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L111
            r0 = r8
            r1 = r10
            r2 = r8
            r3 = r12
            lombok.eclipse.EclipseNode r2 = r2.buildTypeUse(r3)
            r0.addIfNotNull(r1, r2)
        L111:
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE_USE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private java.util.Collection<lombok.eclipse.EclipseNode> buildAnnotations(org.eclipse.jdt.internal.compiler.ast.Annotation[] r7, boolean r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r7
            r1 = r0
            r13 = r1
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r11 = r0
            goto L2f
        L19:
            r0 = r13
            r1 = r11
            r0 = r0[r1]
            r10 = r0
            r0 = r6
            r1 = r9
            r2 = r6
            r3 = r10
            r4 = r8
            lombok.eclipse.EclipseNode r2 = r2.buildAnnotation(r3, r4)
            r0.addIfNotNull(r1, r2)
            int r11 = r11 + 1
        L2f:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L19
        L36:
            r0 = r9
            return r0
    }

    private lombok.eclipse.EclipseNode buildAnnotation(org.eclipse.jdt.internal.compiler.ast.Annotation r9, boolean r10) {
            r8 = this;
            r0 = r9
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L16
            r0 = r11
            if (r0 == 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = 0
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.ANNOTATION
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private java.util.Collection<lombok.eclipse.EclipseNode> buildStatements(org.eclipse.jdt.internal.compiler.ast.Statement[] r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L33
            r0 = r6
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L2c
        L19:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r5
            r1 = r7
            r2 = r5
            r3 = r8
            lombok.eclipse.EclipseNode r2 = r2.buildStatement(r3)
            r0.addIfNotNull(r1, r2)
            int r9 = r9 + 1
        L2c:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L19
        L33:
            r0 = r7
            return r0
    }

    private lombok.eclipse.EclipseNode buildStatement(org.eclipse.jdt.internal.compiler.ast.Statement r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L16
            r0 = r4
            r1 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            lombok.eclipse.EclipseNode r0 = r0.buildType(r1)
            return r0
        L16:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            if (r0 == 0) goto L29
            r0 = r4
            r1 = r5
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r1
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.LOCAL
            lombok.eclipse.EclipseNode r0 = r0.buildLocal(r1, r2)
            return r0
        L29:
            r0 = r4
            r1 = r5
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto L33
            r0 = 0
            return r0
        L33:
            r0 = r4
            r1 = r5
            lombok.eclipse.EclipseNode r0 = r0.drill(r1)
            return r0
    }

    private lombok.eclipse.EclipseNode drill(org.eclipse.jdt.internal.compiler.ast.Statement r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            r1 = r9
            java.lang.Class r1 = r1.getClass()
            lombok.core.AST$FieldAccess[] r0 = r0.fieldsOf(r1)
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L34
        L1c:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r10
            r1 = r8
            java.lang.Class<lombok.eclipse.EclipseNode> r2 = lombok.eclipse.EclipseNode.class
            r3 = r9
            r4 = r11
            java.util.Collection r1 = r1.buildWithField(r2, r3, r4)
            boolean r0 = r0.addAll(r1)
            int r12 = r12 + 1
        L34:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L1c
            r0 = r8
            lombok.eclipse.EclipseNode r1 = new lombok.eclipse.EclipseNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.STATEMENT
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private static java.util.Collection<java.lang.Class<? extends org.eclipse.jdt.internal.compiler.ast.ASTNode>> statementTypes() {
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Statement> r0 = org.eclipse.jdt.internal.compiler.ast.Statement.class
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    @Override // lombok.core.AST
    protected /* bridge */ /* synthetic */ lombok.core.LombokNode buildTree(org.eclipse.jdt.internal.compiler.ast.ASTNode r5, lombok.core.AST.Kind r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            r2 = r6
            lombok.eclipse.EclipseNode r0 = r0.buildTree2(r1, r2)
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.EclipseAST.$SWITCH_TABLE$lombok$core$AST$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.AST$Kind[] r0 = lombok.core.AST.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.INITIALIZER     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL     // Catch: java.lang.NoSuchFieldError -> L60
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            goto L61
        L60:
        L61:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L6d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            goto L6e
        L6d:
        L6e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.NoSuchFieldError -> L7b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            goto L7c
        L7b:
        L7c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE_USE     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            r1 = r0
            lombok.eclipse.EclipseAST.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
