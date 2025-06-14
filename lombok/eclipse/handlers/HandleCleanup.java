package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleCleanup.SCL.lombok */
public class HandleCleanup extends lombok.eclipse.EclipseAnnotationHandler<lombok.Cleanup> {
    public HandleCleanup() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Cleanup> r8, org.eclipse.jdt.internal.compiler.ast.Annotation r9, lombok.eclipse.EclipseNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.CLEANUP_FLAG_USAGE
            java.lang.String r2 = "@Cleanup"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Cleanup r0 = (lombok.Cleanup) r0
            java.lang.String r0 = r0.value()
            r11 = r0
            r0 = r11
            int r0 = r0.length()
            if (r0 != 0) goto L26
            r0 = r10
            java.lang.String r1 = "cleanupName cannot be the empty string."
            r0.addError(r1)
            return
        L26:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL
            if (r0 == r1) goto L3d
            r0 = r10
            java.lang.String r1 = "@Cleanup is legal only on local variable declarations."
            r0.addError(r1)
            return
        L3d:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r0
            r12 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 != 0) goto L5b
            r0 = r10
            java.lang.String r1 = "@Cleanup variable declarations need to be initialized."
            r0.addError(r1)
            return
        L5b:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L8c
            r0 = 0
            r15 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r16 = r0
            goto Lc3
        L8c:
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Block
            if (r0 == 0) goto La4
            r0 = 0
            r15 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.Block r0 = (org.eclipse.jdt.internal.compiler.ast.Block) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r16 = r0
            goto Lc3
        La4:
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SwitchStatement
            if (r0 == 0) goto Lbc
            r0 = 1
            r15 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r0 = (org.eclipse.jdt.internal.compiler.ast.SwitchStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r16 = r0
            goto Lc3
        Lbc:
            r0 = r10
            java.lang.String r1 = "@Cleanup is legal only on a local variable declaration inside a block."
            r0.addError(r1)
            return
        Lc3:
            r0 = r16
            if (r0 != 0) goto Lcf
            r0 = r10
            java.lang.String r1 = "LOMBOK BUG: Parent block does not contain any statements."
            r0.addError(r1)
            return
        Lcf:
            r0 = 0
            r17 = r0
            goto Le5
        Ld5:
            r0 = r16
            r1 = r17
            r0 = r0[r1]
            r1 = r12
            if (r0 != r1) goto Le2
            goto Led
        Le2:
            int r17 = r17 + 1
        Le5:
            r0 = r17
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto Ld5
        Led:
            r0 = r17
            r1 = r16
            int r1 = r1.length
            if (r0 != r1) goto Lfc
            r0 = r10
            java.lang.String r1 = "LOMBOK BUG: Can't find this local variable declaration inside its parent."
            r0.addError(r1)
            return
        Lfc:
            int r17 = r17 + 1
            r0 = r15
            if (r0 == 0) goto L129
            r0 = r17
            r1 = 1
            int r0 = r0 + r1
            r18 = r0
            goto L11e
        L10d:
            r0 = r16
            r1 = r18
            r0 = r0[r1]
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.CaseStatement
            if (r0 == 0) goto L11b
            goto L12e
        L11b:
            int r18 = r18 + 1
        L11e:
            r0 = r18
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto L10d
            goto L12e
        L129:
            r0 = r16
            int r0 = r0.length
            r18 = r0
        L12e:
            r0 = r18
            r1 = r17
            int r0 = r0 - r1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r19 = r0
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 0
            r4 = r18
            r5 = r17
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r16
            int r0 = r0.length
            r1 = r18
            r2 = r17
            int r1 = r1 - r2
            int r0 = r0 - r1
            r20 = r0
            int r20 = r20 + 1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r21 = r0
            r0 = r16
            r1 = 0
            r2 = r21
            r3 = 0
            r4 = r17
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r16
            r1 = r18
            r2 = r21
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            r4 = r16
            int r4 = r4.length
            r5 = r18
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = r10
            r2 = r19
            r3 = r12
            char[] r3 = r3.name
            r0.doAssignmentCheck(r1, r2, r3)
            org.eclipse.jdt.internal.compiler.ast.TryStatement r0 = new org.eclipse.jdt.internal.compiler.ast.TryStatement
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r1 = new org.eclipse.jdt.internal.compiler.ast.Block
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.tryBlock = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r19
            r0.statements = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r12
            int r0 = r0.declarationSourceEnd
            r1 = 1
            int r0 = r0 + r1
            r23 = r0
            r0 = r23
            r24 = r0
            r0 = r19
            int r0 = r0.length
            if (r0 <= 0) goto L1fb
            r0 = r19
            r1 = r19
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            int r0 = r0.sourceEnd
            r1 = 1
            int r0 = r0 + r1
            r24 = r0
            r0 = r22
            r1 = r23
            r0.sourceStart = r1
            r0 = r22
            r1 = r24
            r0.sourceEnd = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r23
            r0.sourceStart = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r24
            r0.sourceEnd = r1
        L1fb:
            r0 = r21
            r1 = r17
            r2 = r22
            r0[r1] = r2
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r25 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r26
            r1 = r9
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r26
            r1 = r9
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r12
            char[] r2 = r2.name
            r3 = 0
            r1.<init>(r2, r3)
            r27 = r0
            r0 = r27
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r26
            r1 = r27
            r0.receiver = r1
            r0 = r9
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r9
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r28 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs()
            if (r0 == 0) goto L2b6
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs()
            r1 = r0
            r33 = r1
            int r0 = r0.length
            r32 = r0
            r0 = 0
            r31 = r0
            goto L2af
        L26e:
            r0 = r33
            r1 = r31
            r0 = r0[r1]
            r30 = r0
            r0 = r30
            char[] r0 = r0.name
            if (r0 == 0) goto L2ac
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r30
            char[] r2 = r2.name
            r1.<init>(r2)
            java.lang.String r1 = "value"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2ac
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r30
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.value
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r28 = r0
            goto L2b6
        L2ac:
            int r31 = r31 + 1
        L2af:
            r0 = r31
            r1 = r32
            if (r0 < r1) goto L26e
        L2b6:
            r0 = r26
            r1 = r28
            r0.nameSourcePosition = r1
            r0 = r26
            r1 = r11
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r9
            int r0 = r0.sourceStart
            r30 = r0
            r0 = r9
            int r0 = r0.sourceEnd
            r31 = r0
            r0 = r30
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r31
            long r1 = (long) r1
            long r0 = r0 | r1
            r32 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r12
            char[] r2 = r2.name
            r3 = r32
            r1.<init>(r2, r3)
            r34 = r0
            r0 = r34
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r30
            r3 = r31
            r1.<init>(r2, r3)
            r35 = r0
            r0 = r35
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r7
            r1 = r9
            r2 = r34
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = r0.preventNullAnalysis(r1, r2)
            r36 = r0
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r36
            r3 = r35
            r4 = 29
            r1.<init>(r2, r3, r4)
            r37 = r0
            r0 = r37
            r1 = r30
            r0.sourceStart = r1
            r0 = r37
            r1 = r31
            r0.sourceEnd = r1
            r0 = r37
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r38 = r0
            r0 = r38
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
            r0 = r38
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r2 = r26
            r0[r1] = r2
            r0 = r38
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r37
            r3 = r38
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r39 = r0
            r0 = r39
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r25
            r1 = 0
            r2 = r39
            r0[r1] = r2
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r1 = new org.eclipse.jdt.internal.compiler.ast.Block
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.finallyBlock = r1
            r0 = r15
            if (r0 != 0) goto L3a2
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.finallyBlock
            r1 = r14
            int r1 = r1.sourceEnd
            r0.sourceStart = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.finallyBlock
            r1 = r14
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
        L3a2:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.finallyBlock
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.finallyBlock
            r1 = r25
            r0.statements = r1
            r0 = r22
            r1 = 0
            r0.catchArguments = r1
            r0 = r22
            r1 = 0
            r0.catchBlocks = r1
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L3d7
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            r1 = r21
            r0.statements = r1
            goto L3fe
        L3d7:
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Block
            if (r0 == 0) goto L3ec
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.Block r0 = (org.eclipse.jdt.internal.compiler.ast.Block) r0
            r1 = r21
            r0.statements = r1
            goto L3fe
        L3ec:
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SwitchStatement
            if (r0 == 0) goto L3fe
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r0 = (org.eclipse.jdt.internal.compiler.ast.SwitchStatement) r0
            r1 = r21
            r0.statements = r1
        L3fe:
            r0 = r13
            r0.rebuild()
            return
    }

    public org.eclipse.jdt.internal.compiler.ast.MessageSend preventNullAnalysis(org.eclipse.jdt.internal.compiler.ast.Annotation r8, org.eclipse.jdt.internal.compiler.ast.Expression r9) {
            r7 = this;
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r8
            int r0 = r0.sourceStart
            r11 = r0
            r0 = r8
            int r0 = r0.sourceEnd
            r12 = r0
            r0 = r11
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r12
            long r1 = (long) r1
            long r0 = r0 | r1
            r13 = r0
            r0 = r10
            java.lang.String r1 = "java.util.Collections"
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createNameReference(r1, r2)
            r0.receiver = r1
            r0 = r10
            java.lang.String r1 = "singletonList"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r10
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r9
            r2[r3] = r4
            r0.arguments = r1
            r0 = r10
            r1 = r13
            r0.nameSourcePosition = r1
            r0 = r10
            r1 = r11
            r0.sourceStart = r1
            r0 = r10
            r1 = r10
            r2 = r12
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r15
            r1 = r10
            r0.receiver = r1
            r0 = r15
            java.lang.String r1 = "get"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r15
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "0"
            char[] r4 = r4.toCharArray()
            r5 = r8
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r4 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r4, r5)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r15
            r1 = r13
            r0.nameSourcePosition = r1
            r0 = r15
            r1 = r11
            r0.sourceStart = r1
            r0 = r15
            r1 = r10
            r2 = r12
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r15
            return r0
    }

    public void doAssignmentCheck(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.Statement[] r7, char[] r8) {
            r5 = this;
            r0 = r7
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L1f
        Ld:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
            int r10 = r10 + 1
        L1f:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto Ld
            return
    }

    private void doAssignmentCheck0(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.Statement r7, char[] r8) {
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Assignment
            if (r0 == 0) goto L17
            r0 = r5
            r1 = r6
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.Assignment r2 = (org.eclipse.jdt.internal.compiler.ast.Assignment) r2
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = r2.expression
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
            goto L71
        L17:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            if (r0 == 0) goto L2e
            r0 = r5
            r1 = r6
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.LocalDeclaration) r2
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = r2.initialization
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
            goto L71
        L2e:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.CastExpression
            if (r0 == 0) goto L45
            r0 = r5
            r1 = r6
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.CastExpression r2 = (org.eclipse.jdt.internal.compiler.ast.CastExpression) r2
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = r2.expression
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
            goto L71
        L45:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            if (r0 == 0) goto L71
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleNameReference) r0
            char[] r0 = r0.token
            r1 = r8
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L71
            r0 = r6
            r1 = r7
            lombok.core.LombokNode r0 = r0.getNodeFor(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L71
            r0 = r9
            java.lang.String r1 = "You're assigning an auto-cleanup variable to something else. This is a bad idea."
            r0.addWarning(r1)
        L71:
            return
    }
}
