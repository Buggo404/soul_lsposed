package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleCleanup.SCL.lombok */
public class HandleCleanup extends lombok.javac.JavacAnnotationHandler<lombok.Cleanup> {
    public HandleCleanup() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Cleanup> r8, com.sun.tools.javac.tree.JCTree.JCAnnotation r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.CLEANUP_FLAG_USAGE
            java.lang.String r2 = "@Cleanup"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.inNetbeansEditor(r0)
            if (r0 == 0) goto L11
            return
        L11:
            r0 = r10
            java.lang.Class<lombok.Cleanup> r1 = lombok.Cleanup.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Cleanup r0 = (lombok.Cleanup) r0
            java.lang.String r0 = r0.value()
            r11 = r0
            r0 = r11
            int r0 = r0.length()
            if (r0 != 0) goto L34
            r0 = r10
            java.lang.String r1 = "cleanupName cannot be the empty string."
            r0.addError(r1)
            return
        L34:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL
            if (r0 == r1) goto L4b
            r0 = r10
            java.lang.String r1 = "@Cleanup is legal only on local variable declarations."
            r0.addError(r1)
            return
        L4b:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r12 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto L69
            r0 = r10
            java.lang.String r1 = "@Cleanup variable declarations need to be initialized."
            r0.addError(r1)
            return
        L69:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L97
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            com.sun.tools.javac.util.List r0 = r0.stats
            r15 = r0
            goto Lcb
        L97:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCCase
            if (r0 == 0) goto Lac
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCCase r0 = (com.sun.tools.javac.tree.JCTree.JCCase) r0
            com.sun.tools.javac.util.List r0 = r0.stats
            r15 = r0
            goto Lcb
        Lac:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto Lc4
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            r15 = r0
            goto Lcb
        Lc4:
            r0 = r10
            java.lang.String r1 = "@Cleanup is legal only on a local variable declaration inside a block."
            r0.addError(r1)
            return
        Lcb:
            r0 = 0
            r16 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r17 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L118
        Lea:
            r0 = r20
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r19 = r0
            r0 = r16
            if (r0 != 0) goto L110
            r0 = r19
            r1 = r12
            if (r0 != r1) goto L105
            r0 = 1
            r16 = r0
        L105:
            r0 = r17
            r1 = r19
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L118
        L110:
            r0 = r18
            r1 = r19
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L118:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lea
            r0 = r16
            if (r0 != 0) goto L12e
            r0 = r10
            java.lang.String r1 = "LOMBOK BUG: Can't find this local variable declaration inside its parent."
            r0.addError(r1)
            return
        L12e:
            r0 = r7
            r1 = r10
            r2 = r18
            com.sun.tools.javac.util.List r2 = r2.toList()
            r3 = r12
            com.sun.tools.javac.util.Name r3 = r3.name
            r0.doAssignmentCheck(r1, r2, r3)
            r0 = r10
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r19 = r0
            r0 = r19
            r1 = r19
            r2 = r12
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r10
            r3 = r11
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r20 = r0
            r0 = r19
            r1 = r19
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r20
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r21 = r0
            r0 = r7
            r1 = r19
            r2 = r10
            r3 = r19
            r4 = r12
            com.sun.tools.javac.util.Name r4 = r4.name
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.preventNullAnalysis(r1, r2, r3)
            r22 = r0
            r0 = r19
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r22
            r3 = r19
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r23 = r0
            r0 = r19
            r1 = r23
            r2 = r19
            r3 = 0
            r4 = r21
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.Block(r3, r4)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            r24 = r0
            r0 = r19
            r1 = 0
            r2 = r24
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r1 = r10
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            r25 = r0
            r0 = r17
            r1 = r19
            r2 = r19
            r3 = 0
            r4 = r18
            com.sun.tools.javac.util.List r4 = r4.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.Block(r3, r4)
            r3 = r10
            com.sun.tools.javac.tree.JCTree r2 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = (com.sun.tools.javac.tree.JCTree.JCBlock) r2
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r25
            com.sun.tools.javac.tree.JCTree$JCTry r1 = r1.Try(r2, r3, r4)
            r2 = r10
            com.sun.tools.javac.tree.JCTree r1 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = (com.sun.tools.javac.tree.JCTree.JCStatement) r1
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L200
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            r1 = r17
            com.sun.tools.javac.util.List r1 = r1.toList()
            r0.stats = r1
            goto L23d
        L200:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCCase
            if (r0 == 0) goto L218
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCCase r0 = (com.sun.tools.javac.tree.JCTree.JCCase) r0
            r1 = r17
            com.sun.tools.javac.util.List r1 = r1.toList()
            r0.stats = r1
            goto L23d
        L218:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L233
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            r1 = r17
            com.sun.tools.javac.util.List r1 = r1.toList()
            r0.stats = r1
            goto L23d
        L233:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Should not get here"
            r1.<init>(r2)
            throw r0
        L23d:
            r0 = r13
            r0.rebuild()
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression preventNullAnalysis(lombok.javac.JavacTreeMaker r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCExpression r10) {
            r7 = this;
            r0 = r9
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.danceAroundIdeChecks()
            if (r0 == 0) goto L4b
            r0 = r8
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r9
            java.lang.String r3 = "java.util.Collections.singletonList"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r2, r3)
            r3 = r10
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r11 = r0
            r0 = r8
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r8
            r3 = r11
            r4 = r9
            java.lang.String r5 = "get"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r8
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_INT
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r12 = r0
            r0 = r12
            return r0
        L4b:
            r0 = r10
            return r0
    }

    public void doAssignmentCheck(lombok.javac.JavacNode r6, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r7, com.sun.tools.javac.util.Name r8) {
            r5 = this;
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L1d
        L9:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
        L1d:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9
            return
    }

    public void doAssignmentCheck0(lombok.javac.JavacNode r6, com.sun.tools.javac.tree.JCTree r7, com.sun.tools.javac.util.Name r8) {
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssign
            if (r0 == 0) goto L14
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCAssign r2 = (com.sun.tools.javac.tree.JCTree.JCAssign) r2
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.rhs
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
        L14:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCExpressionStatement
            if (r0 == 0) goto L28
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r2 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r2
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.expr
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
        L28:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L3c
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.init
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
        L3c:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeCast
            if (r0 == 0) goto L50
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCTypeCast r2 = (com.sun.tools.javac.tree.JCTree.JCTypeCast) r2
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.expr
            r3 = r8
            r0.doAssignmentCheck0(r1, r2, r3)
        L50:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L7c
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r8
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L7c
            r0 = r6
            r1 = r7
            lombok.core.LombokNode r0 = r0.getNodeFor(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L7c
            r0 = r9
            java.lang.String r1 = "You're assigning an auto-cleanup variable to something else. This is a bad idea."
            r0.addWarning(r1)
        L7c:
            return
    }
}
