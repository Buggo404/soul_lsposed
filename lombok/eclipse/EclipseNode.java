package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseNode.SCL.lombok */
public class EclipseNode extends lombok.core.LombokNode<lombok.eclipse.EclipseAST, lombok.eclipse.EclipseNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> {
    private lombok.eclipse.EclipseAST ast;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    EclipseNode(lombok.eclipse.EclipseAST r6, org.eclipse.jdt.internal.compiler.ast.ASTNode r7, java.util.List<lombok.eclipse.EclipseNode> r8, lombok.core.AST.Kind r9) {
            r5 = this;
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = r6
            r0.ast = r1
            return
    }

    @Override // lombok.core.LombokNode
    public lombok.eclipse.EclipseAST getAst() {
            r2 = this;
            r0 = r2
            lombok.eclipse.EclipseAST r0 = r0.ast
            return r0
    }

    public void traverse(lombok.eclipse.EclipseASTVisitor r7) {
            r6 = this;
            r0 = r7
            boolean r0 = r0.isDeferUntilPostDiet()
            if (r0 == 0) goto L11
            r0 = r6
            boolean r0 = r0.isCompleteParse()
            if (r0 != 0) goto L11
            return
        L11:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r6
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L54;
                case 2: goto L7c;
                case 3: goto La4;
                case 4: goto Lcc;
                case 5: goto Lf4;
                case 6: goto L187;
                case 7: goto L127;
                case 8: goto L15f;
                case 9: goto L2dc;
                case 10: goto L2b4;
                default: goto L304;
            }
        L54:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            r0.visitCompilationUnit(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            r0.endVisitCompilationUnit(r1, r2)
            goto L31f
        L7c:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            r0.visitType(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            r0.endVisitType(r1, r2)
            goto L31f
        La4:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r2
            r0.visitField(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r2
            r0.endVisitField(r1, r2)
            goto L31f
        Lcc:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Initializer r2 = (org.eclipse.jdt.internal.compiler.ast.Initializer) r2
            r0.visitInitializer(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Initializer r2 = (org.eclipse.jdt.internal.compiler.ast.Initializer) r2
            r0.endVisitInitializer(r1, r2)
            goto L31f
        Lf4:
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Clinit
            if (r0 == 0) goto Lff
            return
        Lff:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r2
            r0.visitMethod(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r2
            r0.endVisitMethod(r1, r2)
            goto L31f
        L127:
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Argument r2 = (org.eclipse.jdt.internal.compiler.ast.Argument) r2
            r3 = r8
            r0.visitMethodArgument(r1, r2, r3)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Argument r2 = (org.eclipse.jdt.internal.compiler.ast.Argument) r2
            r3 = r8
            r0.endVisitMethodArgument(r1, r2, r3)
            goto L31f
        L15f:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r2
            r0.visitLocal(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r2
            r0.endVisitLocal(r1, r2)
            goto L31f
        L187:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L1cc;
                case 3: goto L1ea;
                case 4: goto L293;
                case 5: goto L208;
                case 6: goto L293;
                case 7: goto L226;
                case 8: goto L257;
                case 9: goto L293;
                case 10: goto L275;
                default: goto L293;
            }
        L1cc:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r3 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r3
            r0.visitAnnotationOnType(r1, r2, r3)
            goto L31f
        L1ea:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r3 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r3
            r0.visitAnnotationOnField(r1, r2, r3)
            goto L31f
        L208:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r3 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r3
            r0.visitAnnotationOnMethod(r1, r2, r3)
            goto L31f
        L226:
            r0 = r7
            r1 = r6
            L extends lombok.core.LombokNode<A, L, N> r1 = r1.parent
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.Argument r1 = (org.eclipse.jdt.internal.compiler.ast.Argument) r1
            r2 = r6
            L extends lombok.core.LombokNode<A, L, N> r2 = r2.parent
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            lombok.core.LombokNode r2 = r2.directUp()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r2
            r3 = r6
            r4 = r6
            java.lang.Object r4 = r4.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r4 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r4
            r0.visitAnnotationOnMethodArgument(r1, r2, r3, r4)
            goto L31f
        L257:
            r0 = r7
            r1 = r6
            L extends lombok.core.LombokNode<A, L, N> r1 = r1.parent
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r3 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r3
            r0.visitAnnotationOnLocal(r1, r2, r3)
            goto L31f
        L275:
            r0 = r7
            r1 = r6
            L extends lombok.core.LombokNode<A, L, N> r1 = r1.parent
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r3 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r3
            r0.visitAnnotationOnTypeUse(r1, r2, r3)
            goto L31f
        L293:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Annotation not expected as child of a "
            r3.<init>(r4)
            r3 = r6
            lombok.core.LombokNode r3 = r3.m66up()
            lombok.eclipse.EclipseNode r3 = (lombok.eclipse.EclipseNode) r3
            lombok.core.AST$Kind r3 = r3.getKind()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2b4:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r2
            r0.visitTypeUse(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r2
            r0.endVisitTypeUse(r1, r2)
            goto L31f
        L2dc:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Statement r2 = (org.eclipse.jdt.internal.compiler.ast.Statement) r2
            r0.visitStatement(r1, r2)
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Statement r2 = (org.eclipse.jdt.internal.compiler.ast.Statement) r2
            r0.endVisitStatement(r1, r2)
            goto L31f
        L304:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unexpected kind during node traversal: "
            r3.<init>(r4)
            r3 = r6
            lombok.core.AST$Kind r3 = r3.getKind()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L31f:
            return
    }

    @Override // lombok.core.LombokNode
    public java.lang.String getName() {
            r4 = this;
            r0 = r4
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L18
            r0 = r4
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            char[] r0 = r0.name
            r5 = r0
            goto L62
        L18:
            r0 = r4
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L30
            r0 = r4
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            char[] r0 = r0.name
            r5 = r0
            goto L62
        L30:
            r0 = r4
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L48
            r0 = r4
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            char[] r0 = r0.selector
            r5 = r0
            goto L62
        L48:
            r0 = r4
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            if (r0 == 0) goto L60
            r0 = r4
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r0
            char[] r0 = r0.name
            r5 = r0
            goto L62
        L60:
            r0 = 0
            r5 = r0
        L62:
            r0 = r5
            if (r0 != 0) goto L6a
            r0 = 0
            goto L72
        L6a:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r5
            r1.<init>(r2)
        L72:
            return r0
    }

    @Override // lombok.core.DiagnosticsReceiver
    public void addError(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            int r2 = r2.sourceStart
            r3 = r5
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r3
            int r3 = r3.sourceEnd
            r0.addError(r1, r2, r3)
            return
    }

    public void addError(java.lang.String r10, int r11, int r12) {
            r9 = this;
            r0 = r9
            lombok.eclipse.EclipseAST r0 = r0.ast
            lombok.eclipse.EclipseAST$ParseProblem r1 = new lombok.eclipse.EclipseAST$ParseProblem
            r2 = r1
            r3 = r9
            lombok.eclipse.EclipseAST r3 = r3.ast
            r4 = r3
            java.lang.Class r4 = r4.getClass()
            r4 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.addProblem(r1)
            return
    }

    @Override // lombok.core.DiagnosticsReceiver
    public void addWarning(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            int r2 = r2.sourceStart
            r3 = r5
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r3
            int r3 = r3.sourceEnd
            r0.addWarning(r1, r2, r3)
            return
    }

    public void addWarning(java.lang.String r10, int r11, int r12) {
            r9 = this;
            r0 = r9
            lombok.eclipse.EclipseAST r0 = r0.ast
            lombok.eclipse.EclipseAST$ParseProblem r1 = new lombok.eclipse.EclipseAST$ParseProblem
            r2 = r1
            r3 = r9
            lombok.eclipse.EclipseAST r3 = r3.ast
            r4 = r3
            java.lang.Class r4 = r4.getClass()
            r4 = 1
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.addProblem(r1)
            return
    }

    /* renamed from: calculateIsStructurallySignificant, reason: avoid collision after fix types in other method */
    protected boolean calculateIsStructurallySignificant2(org.eclipse.jdt.internal.compiler.ast.ASTNode r3) {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            if (r0 == 0) goto L30
            r0 = 1
            return r0
        L30:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration
            if (r0 == 0) goto L3c
            r0 = 1
            return r0
        L3c:
            r0 = 0
            return r0
    }

    public boolean isCompleteParse() {
            r2 = this;
            r0 = r2
            lombok.eclipse.EclipseAST r0 = r0.ast
            boolean r0 = r0.isCompleteParse()
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            return r0
    }

    @Override // lombok.core.LombokNode
    public <Z extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<Z> findAnnotation(java.lang.Class<Z> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findAnnotation(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            r1 = r5
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            return r0
    }

    private java.lang.Integer getModifiers() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L18
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L18:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L30
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.modifiers
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L30:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            if (r0 == 0) goto L48
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r0
            int r0 = r0.modifiers
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L48:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L60
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            int r0 = r0.modifiers
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L60:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isStatic() {
            r3 = this;
            r0 = r3
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L5e
            r0 = r3
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r4 = r0
            r0 = r4
            int r0 = r0.modifiers
            r5 = r0
            r0 = 16896(0x4200, float:2.3676E-41)
            r1 = r5
            r0 = r0 & r1
            if (r0 == 0) goto L21
            r0 = 1
            return r0
        L21:
            r0 = r3
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L37
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L39
        L37:
            r0 = 1
            return r0
        L39:
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 != 0) goto L45
            r0 = 0
            return r0
        L45:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r7 = r0
            r0 = r7
            int r0 = r0.modifiers
            r5 = r0
            r0 = 16896(0x4200, float:2.3676E-41)
            r1 = r5
            r0 = r0 & r1
            if (r0 == 0) goto L5e
            r0 = 1
            return r0
        L5e:
            r0 = r3
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L95
            r0 = r3
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L95
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L95
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r5 = r0
            r0 = r5
            int r0 = r0.modifiers
            r6 = r0
            r0 = 512(0x200, float:7.175E-43)
            r1 = r6
            r0 = r0 & r1
            if (r0 == 0) goto L95
            r0 = 1
            return r0
        L95:
            r0 = r3
            java.lang.Integer r0 = r0.getModifiers()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto La0
            r0 = 0
            return r0
        La0:
            r0 = r4
            int r0 = r0.intValue()
            r5 = r0
            r0 = 8
            r1 = r5
            r0 = r0 & r1
            if (r0 == 0) goto Lae
            r0 = 1
            return r0
        Lae:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isFinal() {
            r3 = this;
            r0 = r3
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L37
            r0 = r3
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L37
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L37
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r5 = r0
            r0 = r5
            int r0 = r0.modifiers
            r6 = r0
            r0 = 16896(0x4200, float:2.3676E-41)
            r1 = r6
            r0 = r0 & r1
            if (r0 == 0) goto L37
            r0 = 1
            return r0
        L37:
            r0 = r3
            java.lang.Integer r0 = r0.getModifiers()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L42
            r0 = 0
            return r0
        L42:
            r0 = r4
            int r0 = r0.intValue()
            r5 = r0
            r0 = 16
            r1 = r5
            r0 = r0 & r1
            if (r0 == 0) goto L50
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isPrimitive() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L1f
            r0 = r2
            boolean r0 = r0.isEnumMember()
            if (r0 != 0) goto L1f
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = lombok.eclipse.Eclipse.isPrimitive(r0)
            return r0
        L1f:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L37
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = lombok.eclipse.Eclipse.isPrimitive(r0)
            return r0
        L37:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public java.lang.String fieldOrMethodBaseType() {
            r6 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L1e
            r0 = r6
            boolean r0 = r0.isEnumMember()
            if (r0 != 0) goto L1e
            r0 = r6
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r7 = r0
        L1e:
            r0 = r6
            N r0 = r0.node
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L33
            r0 = r6
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r7 = r0
        L33:
            r0 = r7
            if (r0 != 0) goto L39
            r0 = 0
            return r0
        L39:
            r0 = r7
            char[][] r0 = r0.getTypeName()
            java.lang.String r0 = lombok.eclipse.Eclipse.toQualifiedName(r0)
            r8 = r0
            r0 = r7
            int r0 = r0.dimensions()
            if (r0 != 0) goto L4a
            r0 = r8
            return r0
        L4a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r8
            int r2 = r2.length()
            r3 = 2
            r4 = r7
            int r4 = r4.dimensions()
            int r3 = r3 * r4
            int r2 = r2 + r3
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r10 = r0
            goto L74
        L69:
            r0 = r9
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r10 = r10 + 1
        L74:
            r0 = r10
            r1 = r7
            int r1 = r1.dimensions()
            if (r0 < r1) goto L69
            r0 = r9
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isTransient() {
            r3 = this;
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            java.lang.Integer r0 = r0.getModifiers()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L22
            r0 = r4
            int r0 = r0.intValue()
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isEnumMember() {
            r3 = this;
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.getKind()
            r1 = 3
            if (r0 != r1) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isEnumType() {
            r3 = this;
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public int countMethodParameters() {
            r3 = this;
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1d
            r0 = 0
            return r0
        L1d:
            r0 = r4
            int r0 = r0.length
            return r0
    }

    @Override // lombok.core.LombokNode
    public int getStartPos() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceStart
            return r0
    }

    @Override // lombok.core.LombokNode
    protected /* bridge */ /* synthetic */ boolean calculateIsStructurallySignificant(org.eclipse.jdt.internal.compiler.ast.ASTNode r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            boolean r0 = r0.calculateIsStructurallySignificant2(r1)
            return r0
    }

    @Override // lombok.core.LombokNode
    public /* bridge */ /* synthetic */ lombok.core.AST getAst() {
            r2 = this;
            r0 = r2
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.EclipseNode.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.EclipseNode.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
