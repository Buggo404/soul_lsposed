package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/SetGeneratedByVisitor.SCL.lombok */
public final class SetGeneratedByVisitor extends org.eclipse.jdt.internal.compiler.ASTVisitor {
    private static final long INT_TO_LONG_MASK = 4294967295L;
    private final org.eclipse.jdt.internal.compiler.ast.ASTNode source;
    private final int sourceStart;
    private final int sourceEnd;
    private final long sourcePos;

    public SetGeneratedByVisitor(org.eclipse.jdt.internal.compiler.ast.ASTNode r9) {
            r8 = this;
            r0 = r8
            r0.<init>()
            r0 = r8
            r1 = r9
            r0.source = r1
            r0 = r8
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r8
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r8
            r1 = r8
            int r1 = r1.sourceStart
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            r2 = r8
            int r2 = r2.sourceEnd
            long r2 = (long) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r3
            long r1 = r1 | r2
            r0.sourcePos = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.memberStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            r1 = r4
            long r1 = r1.sourcePos
            r0.nameSourcePosition = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            r1 = r4
            long r1 = r1.sourcePos
            r0.nameSourcePosition = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            long[] r0 = r0.sourcePositions
            if (r0 == 0) goto L2c
            r0 = r5
            long[] r0 = r0.sourcePositions
            int r0 = r0.length
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            if (r0 == r1) goto L37
        L2c:
            r0 = r5
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.sourcePositions = r1
        L37:
            r0 = r5
            long[] r0 = r0.sourcePositions
            r1 = r4
            long r1 = r1.sourcePos
            java.util.Arrays.fill(r0, r1)
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            long[] r0 = r0.sourcePositions
            if (r0 == 0) goto L2c
            r0 = r5
            long[] r0 = r0.sourcePositions
            int r0 = r0.length
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            if (r0 == r1) goto L37
        L2c:
            r0 = r5
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.sourcePositions = r1
        L37:
            r0 = r5
            long[] r0 = r0.sourcePositions
            r1 = r4
            long r1 = r1.sourcePos
            java.util.Arrays.fill(r0, r1)
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.tagSourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.tagSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.originalSourceEnd = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.bodyEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.bodyStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.declarationSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.modifiersSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.Javadoc r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            long r1 = (long) r1
            r0.valuePositions = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.Initializer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.declarationSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.modifiersSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.endPart1Position = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.endPart2Position = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.bodyStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.bodyEnd = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.bodyEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.bodyStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.declarationSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.modifiersSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.ImportReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.declarationEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.declarationSourceStart = r1
            r0 = r5
            long[] r0 = r0.sourcePositions
            if (r0 == 0) goto L3c
            r0 = r5
            long[] r0 = r0.sourcePositions
            int r0 = r0.length
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            if (r0 == r1) goto L47
        L3c:
            r0 = r5
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.sourcePositions = r1
        L47:
            r0 = r5
            long[] r0 = r0.sourcePositions
            r1 = r4
            long r1 = r1.sourcePos
            java.util.Arrays.fill(r0, r1)
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.ASTNode r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.SwitchStatement r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.blockStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.Expression r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.declarationSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.modifiersSourceStart = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.declarationSourceEnd = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.declarationSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceStart
            r0.modifiersSourceStart = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.endPart1Position = r1
            r0 = r4
            r1 = r3
            int r1 = r1.sourceEnd
            r0.endPart2Position = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.FieldReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            r1 = r4
            long r1 = r1.sourcePos
            r0.nameSourcePosition = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.MessageSend r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            r1 = r4
            long r1 = r1.sourcePos
            r0.nameSourcePosition = r1
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            long[] r0 = r0.sourcePositions
            if (r0 == 0) goto L2c
            r0 = r5
            long[] r0 = r0.sourcePositions
            int r0 = r0.length
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            if (r0 == r1) goto L37
        L2c:
            r0 = r5
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.sourcePositions = r1
        L37:
            r0 = r5
            long[] r0 = r0.sourcePositions
            r1 = r4
            long r1 = r1.sourcePos
            java.util.Arrays.fill(r0, r1)
            return
    }

    private void fixPositions(org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r5
            r1 = r4
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r5
            long[] r0 = r0.sourcePositions
            if (r0 == 0) goto L2c
            r0 = r5
            long[] r0 = r0.sourcePositions
            int r0 = r0.length
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            if (r0 == r1) goto L37
        L2c:
            r0 = r5
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.sourcePositions = r1
        L37:
            r0 = r5
            long[] r0 = r0.sourcePositions
            r1 = r4
            long r1 = r1.sourcePos
            java.util.Arrays.fill(r0, r1)
            return
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.AllocationExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.AnnotationMethodDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Argument r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Argument r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.AssertStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Assignment r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.BinaryExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Block r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.BreakStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.CaseStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.CastExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.CharLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Clinit r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.CompoundAssignment r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ContinueStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.DoStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.DoubleLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.EmptyStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.EqualExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ExtendedStringLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.FalseLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.MethodScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.FieldReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r1 = (org.eclipse.jdt.internal.compiler.ast.FieldReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.FieldReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r1 = (org.eclipse.jdt.internal.compiler.ast.FieldReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.FloatLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ForeachStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ForStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.IfStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ImportReference r5, org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ImportReference r1 = (org.eclipse.jdt.internal.compiler.ast.ImportReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Initializer r5, org.eclipse.jdt.internal.compiler.lookup.MethodScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Initializer r1 = (org.eclipse.jdt.internal.compiler.ast.Initializer) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.InstanceOfExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.IntLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Javadoc r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Javadoc r1 = (org.eclipse.jdt.internal.compiler.ast.Javadoc) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Javadoc r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Javadoc r1 = (org.eclipse.jdt.internal.compiler.ast.Javadoc) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocAllocationExpression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocArgumentExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocArgumentExpression r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocArrayQualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocArraySingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocArraySingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocFieldReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocImplicitTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocImplicitTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocMessageSend) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocQualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocReturnStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocReturnStatement r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.JavadocSingleTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.LabeledStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.LongLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.MemberValuePair r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.MessageSend r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r1 = (org.eclipse.jdt.internal.compiler.ast.MessageSend) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.NullLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.OR_OR_Expression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.PostfixExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.PrefixExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedAllocationExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedSuperReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedSuperReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedThisReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedThisReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ReturnStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SingleNameReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SingleNameReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.StringLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SuperReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SwitchStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r1 = (org.eclipse.jdt.internal.compiler.ast.SwitchStatement) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ThisReference r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ThisReference r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.ThrowStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TrueLiteral r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TryStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TypeParameter r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.TypeParameter r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.UnaryExpression r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.WhileStatement r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Wildcard r5, org.eclipse.jdt.internal.compiler.lookup.BlockScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }

    public boolean visit(org.eclipse.jdt.internal.compiler.ast.Wildcard r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.fixPositions(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.visit(r1, r2)
            return r0
    }
}
