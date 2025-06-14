package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacNode.SCL.lombok */
public class JavacNode extends lombok.core.LombokNode<lombok.javac.JavacAST, lombok.javac.JavacNode, com.sun.tools.javac.tree.JCTree> {
    private lombok.javac.JavacAST ast;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    public JavacNode(lombok.javac.JavacAST r6, com.sun.tools.javac.tree.JCTree r7, java.util.List<lombok.javac.JavacNode> r8, lombok.core.AST.Kind r9) {
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
    public lombok.javac.JavacAST getAst() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.ast
            return r0
    }

    public javax.lang.model.element.Element getElement() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L15
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym
            return r0
        L15:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L2a
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.code.Symbol$MethodSymbol r0 = r0.sym
            return r0
        L2a:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L3f
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.code.Symbol$VarSymbol r0 = r0.sym
            return r0
        L3f:
            r0 = 0
            return r0
    }

    public int getEndPosition(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r4) {
            r3 = this;
            r0 = r3
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = lombok.javac.Javac.getEndPosition(r0, r1)
            return r0
    }

    public int getEndPosition() {
            r3 = this;
            r0 = r3
            r1 = r3
            N r1 = r1.node
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r1 = (com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition) r1
            int r0 = r0.getEndPosition(r1)
            return r0
    }

    public void traverse(lombok.javac.JavacASTVisitor r7) {
            r6 = this;
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r6
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L40;
                case 2: goto L68;
                case 3: goto L90;
                case 4: goto Le0;
                case 5: goto Lb8;
                case 6: goto L190;
                case 7: goto L108;
                case 8: goto L140;
                case 9: goto L168;
                case 10: goto L2c2;
                default: goto L2ea;
            }
        L40:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r2 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r2
            r0.visitCompilationUnit(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r2 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r2
            r0.endVisitCompilationUnit(r1, r2)
            goto L305
        L68:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r2 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r2
            r0.visitType(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r2 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r2
            r0.endVisitType(r1, r2)
            goto L305
        L90:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            r0.visitField(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            r0.endVisitField(r1, r2)
            goto L305
        Lb8:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r2 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r2
            r0.visitMethod(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r2 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r2
            r0.endVisitMethod(r1, r2)
            goto L305
        Le0:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = (com.sun.tools.javac.tree.JCTree.JCBlock) r2
            r0.visitInitializer(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = (com.sun.tools.javac.tree.JCTree.JCBlock) r2
            r0.endVisitInitializer(r1, r2)
            goto L305
        L108:
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            r3 = r8
            r0.visitMethodArgument(r1, r2, r3)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            r3 = r8
            r0.endVisitMethodArgument(r1, r2, r3)
            goto L305
        L140:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            r0.visitLocal(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            r0.endVisitLocal(r1, r2)
            goto L305
        L168:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r0.visitStatement(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r0.endVisitStatement(r1, r2)
            goto L305
        L190:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L1d4;
                case 3: goto L1f2;
                case 4: goto L2a1;
                case 5: goto L210;
                case 6: goto L2a1;
                case 7: goto L22e;
                case 8: goto L265;
                case 9: goto L2a1;
                case 10: goto L283;
                default: goto L2a1;
            }
        L1d4:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r3 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r3
            r0.visitAnnotationOnType(r1, r2, r3)
            goto L305
        L1f2:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r3 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r3
            r0.visitAnnotationOnField(r1, r2, r3)
            goto L305
        L210:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r3 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r3
            r0.visitAnnotationOnMethod(r1, r2, r3)
            goto L305
        L22e:
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r9 = r0
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r10 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r6
            r4 = r6
            java.lang.Object r4 = r4.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r4 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r4
            r0.visitAnnotationOnMethodArgument(r1, r2, r3, r4)
            goto L305
        L265:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r3 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r3
            r0.visitAnnotationOnLocal(r1, r2, r3)
            goto L305
        L283:
            r0 = r7
            r1 = r6
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r2 = r6
            r3 = r6
            java.lang.Object r3 = r3.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r3 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r3
            r0.visitAnnotationOnTypeUse(r1, r2, r3)
            goto L305
        L2a1:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Annotion not expected as child of a "
            r3.<init>(r4)
            r3 = r6
            lombok.core.LombokNode r3 = r3.m66up()
            lombok.javac.JavacNode r3 = (lombok.javac.JavacNode) r3
            lombok.core.AST$Kind r3 = r3.getKind()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2c2:
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r0.visitTypeUse(r1, r2)
            r0 = r6
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r7
            r2 = r6
            r0.traverseChildren(r1, r2)
            r0 = r7
            r1 = r6
            r2 = r6
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r0.endVisitTypeUse(r1, r2)
            goto L305
        L2ea:
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
        L305:
            return
    }

    @Override // lombok.core.LombokNode
    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L18
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r3 = r0
            goto L4a
        L18:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L30
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r3 = r0
            goto L4a
        L30:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L48
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r3 = r0
            goto L4a
        L48:
            r0 = 0
            r3 = r0
        L4a:
            r0 = r3
            if (r0 != 0) goto L52
            r0 = 0
            goto L56
        L52:
            r0 = r3
            java.lang.String r0 = r0.toString()
        L56:
            return r0
    }

    /* renamed from: calculateIsStructurallySignificant, reason: avoid collision after fix types in other method */
    protected boolean calculateIsStructurallySignificant2(com.sun.tools.javac.tree.JCTree r3) {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCCompilationUnit
            if (r0 == 0) goto L30
            r0 = 1
            return r0
        L30:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L3f
            r0 = r3
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            return r0
        L3f:
            r0 = 0
            return r0
    }

    public lombok.javac.JavacTreeMaker getTreeMaker() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.ast
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            return r0
    }

    public com.sun.tools.javac.code.Symtab getSymbolTable() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.ast
            com.sun.tools.javac.code.Symtab r0 = r0.getSymbolTable()
            return r0
    }

    public com.sun.tools.javac.model.JavacTypes getTypesUtil() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.ast
            com.sun.tools.javac.model.JavacTypes r0 = r0.getTypesUtil()
            return r0
    }

    public com.sun.tools.javac.util.Context getContext() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.ast
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            return r0
    }

    public boolean shouldDeleteLombokAnnotations() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.ast
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            boolean r0 = lombok.javac.LombokOptions.shouldDeleteLombokAnnotations(r0)
            return r0
    }

    public com.sun.tools.javac.util.Name toName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r4
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            return r0
    }

    public void removeDeferredErrors() {
            r3 = this;
            r0 = r3
            lombok.javac.JavacAST r0 = r0.ast
            r1 = r3
            r0.removeDeferredErrors(r1)
            return
    }

    @Override // lombok.core.DiagnosticsReceiver
    public void addError(java.lang.String r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacAST r0 = r0.ast
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.ERROR
            r2 = r8
            r3 = r7
            r4 = 0
            r5 = 1
            r0.printMessage(r1, r2, r3, r4, r5)
            return
    }

    public void addError(java.lang.String r8, com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacAST r0 = r0.ast
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.ERROR
            r2 = r8
            r3 = 0
            r4 = r9
            r5 = 1
            r0.printMessage(r1, r2, r3, r4, r5)
            return
    }

    @Override // lombok.core.DiagnosticsReceiver
    public void addWarning(java.lang.String r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacAST r0 = r0.ast
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            r2 = r8
            r3 = r7
            r4 = 0
            r5 = 0
            r0.printMessage(r1, r2, r3, r4, r5)
            return
    }

    public void addWarning(java.lang.String r8, com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacAST r0 = r0.ast
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            r2 = r8
            r3 = 0
            r4 = r9
            r5 = 0
            r0.printMessage(r1, r2, r3, r4, r5)
            return
    }

    @Override // lombok.core.LombokNode
    public boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotationAndDeleteIfNeccessary(r0, r1)
            return r0
    }

    @Override // lombok.core.LombokNode
    public <Z extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<Z> findAnnotation(java.lang.Class<Z> r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            r2 = 1
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r5
            r1 = r6
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r0, r1)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCModifiers getModifiers() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L15
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            return r0
        L15:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L2a
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            return r0
        L2a:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L3f
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            return r0
        L3f:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isStatic() {
            r5 = this;
            r0 = r5
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L6d
            r0 = r5
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r7 = r0
            r0 = 16896(0x4200, double:8.3477E-320)
            r1 = r7
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = r5
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3f
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L41
        L3f:
            r0 = 1
            return r0
        L41:
            r0 = r9
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 != 0) goto L4e
            r0 = 0
            return r0
        L4e:
            r0 = r9
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r7 = r0
            r0 = 16896(0x4200, double:8.3477E-320)
            r1 = r7
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6d
            r0 = 1
            return r0
        L6d:
            r0 = r5
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto La9
            r0 = r5
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto La9
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto La9
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r8 = r0
            r0 = 512(0x200, double:2.53E-321)
            r1 = r8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 1
            return r0
        La9:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lb4
            r0 = 0
            return r0
        Lb4:
            r0 = r6
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc3
            r0 = 1
            return r0
        Lc3:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isFinal() {
            r5 = this;
            r0 = r5
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L3c
            r0 = r5
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L3c
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L3c
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r8 = r0
            r0 = 16896(0x4200, double:8.3477E-320)
            r1 = r8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
            r0 = 1
            return r0
        L3c:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L54
            r0 = 16
            r1 = r6
            long r1 = r1.flags
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            r0 = 1
            return r0
        L54:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isEnumMember() {
            r5 = this;
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = 16384(0x4000, double:8.0948E-320)
            r1 = r6
            long r1 = r1.flags
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isEnumType() {
            r5 = this;
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = 16384(0x4000, double:8.0948E-320)
            r1 = r6
            long r1 = r1.flags
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isPrimitive() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L1f
            r0 = r2
            boolean r0 = r0.isEnumMember()
            if (r0 != 0) goto L1f
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            boolean r0 = lombok.javac.Javac.isPrimitive(r0)
            return r0
        L1f:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L37
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            boolean r0 = lombok.javac.Javac.isPrimitive(r0)
            return r0
        L37:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public java.lang.String fieldOrMethodBaseType() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L1f
            r0 = r2
            boolean r0 = r0.isEnumMember()
            if (r0 != 0) goto L1f
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            java.lang.String r0 = r0.toString()
            return r0
        L1f:
            r0 = r2
            N r0 = r0.node
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L37
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            java.lang.String r0 = r0.toString()
            return r0
        L37:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokNode
    public boolean isTransient() {
            r5 = this;
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = 128(0x80, double:6.32E-322)
            r1 = r6
            long r1 = r1.flags
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
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
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.util.List r0 = r0.params
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1d
            r0 = 0
            return r0
        L1d:
            r0 = r4
            int r0 = r0.size()
            return r0
    }

    @Override // lombok.core.LombokNode
    public int getStartPos() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            int r0 = r0.getPreferredPosition()
            return r0
    }

    @Override // lombok.core.LombokNode
    protected /* bridge */ /* synthetic */ boolean calculateIsStructurallySignificant(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            boolean r0 = r0.calculateIsStructurallySignificant2(r1)
            return r0
    }

    @Override // lombok.core.LombokNode
    public /* bridge */ /* synthetic */ lombok.core.AST getAst() {
            r2 = this;
            r0 = r2
            lombok.javac.JavacAST r0 = r0.getAst()
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.JavacNode.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.JavacNode.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
