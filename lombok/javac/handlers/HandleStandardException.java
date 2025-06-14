package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleStandardException.SCL.lombok */
public class HandleStandardException extends lombok.javac.JavacAnnotationHandler<lombok.experimental.StandardException> {
    public HandleStandardException() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.StandardException> r6, com.sun.tools.javac.tree.JCTree.JCAnnotation r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r8
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.STANDARD_EXCEPTION_FLAG_USAGE
            java.lang.String r2 = "@StandardException"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r8
            java.lang.Class<lombok.experimental.StandardException> r1 = lombok.experimental.StandardException.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r8
            java.lang.String r1 = "lombok.AccessLevel"
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto L2d
            r0 = r8
            java.lang.String r1 = "@StandardException is only supported on a class"
            r0.addError(r1)
            return
        L2d:
            r0 = r9
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.Javac.getExtendsClause(r0)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L46
            r0 = r8
            java.lang.String r1 = "@StandardException requires that you extend a Throwable type"
            r0.addError(r1)
            return
        L46:
            r0 = r6
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.StandardException r0 = (lombok.experimental.StandardException) r0
            lombok.AccessLevel r0 = r0.access()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L5e
            lombok.AccessLevel r0 = lombok.AccessLevel.PUBLIC
            r11 = r0
        L5e:
            r0 = r11
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L71
            r0 = r8
            java.lang.String r1 = "AccessLevel.NONE is not valid here"
            r0.addError(r1)
            lombok.AccessLevel r0 = lombok.AccessLevel.PUBLIC
            r11 = r0
        L71:
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateNoArgsConstructor(r1, r2, r3)
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateMsgOnlyConstructor(r1, r2, r3)
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateCauseOnlyConstructor(r1, r2, r3)
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateFullConstructor(r1, r2, r3)
            return
    }

    private void generateNoArgsConstructor(lombok.javac.JavacNode r8, lombok.AccessLevel r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r8
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto Lf
            return
        Lf:
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r11 = r0
            r0 = r11
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOT
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            r1 = r11
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_BOT
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            r12 = r0
            r0 = r11
            r1 = r11
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r11
            r4 = r8
            java.lang.String r5 = "this"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r13 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = r10
            r5 = r13
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createConstructor(r0, r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r8
            r1 = r14
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void generateMsgOnlyConstructor(lombok.javac.JavacNode r8, lombok.AccessLevel r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r8
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L14
            return
        L14:
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r11 = r0
            r0 = r11
            r1 = r8
            java.lang.String r2 = "message"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r1 = r11
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_BOT
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            r12 = r0
            r0 = r11
            r1 = r11
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r11
            r4 = r8
            java.lang.String r5 = "this"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r13 = r0
            r0 = r9
            r1 = r8
            r2 = 1
            r3 = 0
            r4 = r10
            r5 = r13
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createConstructor(r0, r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r8
            r1 = r14
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void generateCauseOnlyConstructor(lombok.javac.JavacNode r9, lombok.AccessLevel r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r9
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r2[r3] = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L14
            return
        L14:
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r9
            java.lang.String r1 = "cause"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r13 = r0
            r0 = r12
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r12
            r3 = r12
            r4 = r13
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r9
            java.lang.String r5 = "getMessage"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r14 = r0
            r0 = r12
            r1 = r12
            lombok.javac.JavacTreeMaker$TreeTag r2 = lombok.javac.Javac.CTC_NOT_EQUAL
            r3 = r12
            r4 = r13
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r12
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_BOT
            r6 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCBinary r1 = r1.Binary(r2, r3, r4)
            r2 = r14
            r3 = r12
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r15 = r0
            r0 = r15
            r1 = r12
            r2 = r13
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            r16 = r0
            r0 = r12
            r1 = r12
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = r9
            java.lang.String r5 = "this"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r17 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            r3 = 1
            r4 = r11
            r5 = r17
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createConstructor(r0, r1, r2, r3, r4, r5)
            r18 = r0
            r0 = r9
            r1 = r18
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void generateFullConstructor(lombok.javac.JavacNode r9, lombok.AccessLevel r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r9
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r2[r3] = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L19
            return
        L19:
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r9
            java.lang.String r1 = "cause"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r13 = r0
            r0 = r9
            java.lang.String r1 = "super"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r14 = r0
            r0 = r12
            r1 = r9
            java.lang.String r2 = "message"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r15 = r0
            r0 = r12
            r1 = r12
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = r14
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r15
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r16 = r0
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r12
            r3 = r13
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r17 = r0
            r0 = r12
            r1 = r12
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = r12
            r5 = r14
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r9
            java.lang.String r6 = "initCause"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = r3.Select(r4, r5)
            r4 = r12
            r5 = r13
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r18 = r0
            r0 = r12
            r1 = r17
            r2 = r18
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            r19 = r0
            r0 = r10
            r1 = r9
            r2 = 1
            r3 = 1
            r4 = r11
            r5 = r16
            r6 = r19
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createConstructor(r0, r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r9
            r1 = r20
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult hasConstructor(lombok.javac.JavacNode r5, java.lang.Class<?>... r6) {
            r0 = r5
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.upToTypeNode(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L84
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L84
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L7b
        L24:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L7b
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r9 = r0
            r0 = r9
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "<init>"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L7b
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L7b
            r0 = r5
            r1 = r9
            com.sun.tools.javac.util.List r1 = r1.params
            r2 = r6
            boolean r0 = paramsMatch(r0, r1, r2)
            if (r0 != 0) goto L6a
            goto L7b
        L6a:
            r0 = r7
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r0)
            if (r0 != 0) goto L77
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L7a
        L77:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L7a:
            return r0
        L7b:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L24
        L84:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    private static boolean paramsMatch(lombok.javac.JavacNode r4, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> r5, java.lang.Class<?>[] r6) {
            r0 = r5
            if (r0 != 0) goto L11
            r0 = r6
            if (r0 == 0) goto Lf
            r0 = r6
            int r0 = r0.length
            if (r0 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
        L11:
            r0 = r6
            if (r0 != 0) goto L20
            r0 = r5
            int r0 = r0.size()
            if (r0 != 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
        L20:
            r0 = r5
            int r0 = r0.size()
            r1 = r6
            int r1 = r1.length
            if (r0 == r1) goto L2b
            r0 = 0
            return r0
        L2b:
            r0 = 0
            r7 = r0
            goto L52
        L30:
            r0 = r5
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r8 = r0
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r4
            r2 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.vartype
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 != 0) goto L4f
            r0 = 0
            return r0
        L4f:
            int r7 = r7 + 1
        L52:
            r0 = r7
            r1 = r5
            int r1 = r1.size()
            if (r0 < r1) goto L30
            r0 = 1
            return r0
    }

    private static void addConstructorProperties(com.sun.tools.javac.tree.JCTree.JCModifiers r8, lombok.javac.JavacNode r9, boolean r10, boolean r11) {
            r0 = r10
            if (r0 != 0) goto L9
            r0 = r11
            if (r0 != 0) goto L9
            return
        L9:
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r9
            java.lang.String r1 = "java"
            java.lang.String r2 = "beans"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ConstructorProperties"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r13 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r10
            if (r0 == 0) goto L3f
            r0 = r14
            r1 = r12
            java.lang.String r2 = "message"
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L3f:
            r0 = r11
            if (r0 == 0) goto L50
            r0 = r14
            r1 = r12
            java.lang.String r2 = "cause"
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L50:
            r0 = r12
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r14
            com.sun.tools.javac.util.List r3 = r3.toList()
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = r0.NewArray(r1, r2, r3)
            r15 = r0
            r0 = r12
            r1 = r13
            r2 = r15
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r16 = r0
            r0 = r8
            r1 = r8
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r16
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.annotations = r1
            return
    }

    private static com.sun.tools.javac.tree.JCTree.JCMethodDecl createConstructor(lombok.AccessLevel r12, lombok.javac.JavacNode r13, boolean r14, boolean r15, lombok.javac.JavacNode r16, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r17) {
            r0 = r13
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r18 = r0
            r0 = r14
            if (r0 != 0) goto Le
            r0 = r15
            if (r0 == 0) goto L25
        Le:
            r0 = r13
            boolean r0 = isLocalType(r0)
            if (r0 != 0) goto L25
            r0 = r13
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.generateConstructorProperties()
            if (r0 != 0) goto L2b
        L25:
            r0 = 0
            r19 = r0
            goto L59
        L2b:
            r0 = r13
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_ADD_CONSTRUCTOR_PROPERTIES
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L47
            r0 = r20
            boolean r0 = r0.booleanValue()
            goto L57
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r13
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_SUPPRESS_CONSTRUCTOR_PROPERTIES
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L57:
            r19 = r0
        L59:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r14
            if (r0 == 0) goto La5
            r0 = r13
            java.lang.String r1 = "message"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r22 = r0
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "String"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r24 = r0
            r0 = r18
            r1 = r18
            r2 = r22
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r21
            r3 = r24
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r25 = r0
            r0 = r20
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        La5:
            r0 = r15
            if (r0 == 0) goto Le8
            r0 = r13
            java.lang.String r1 = "cause"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r22 = r0
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Throwable"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r24 = r0
            r0 = r18
            r1 = r18
            r2 = r22
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r21
            r3 = r24
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r25 = r0
            r0 = r20
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Le8:
            r0 = r18
            r1 = r12
            int r1 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r1)
            long r1 = (long) r1
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r21 = r0
            r0 = r19
            if (r0 == 0) goto L104
            r0 = r21
            r1 = r13
            r2 = r14
            r3 = r15
            addConstructorProperties(r0, r1, r2, r3)
        L104:
            r0 = r18
            r1 = r21
            r2 = r13
            java.lang.String r3 = "<init>"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r20
            com.sun.tools.javac.util.List r5 = r5.toList()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r18
            r8 = 0
            r9 = r17
            com.sun.tools.javac.tree.JCTree$JCBlock r7 = r7.Block(r8, r9)
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r16
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public static boolean isLocalType(lombok.javac.JavacNode r3) {
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L26
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            boolean r0 = isLocalType(r0)
            return r0
        L26:
            r0 = 1
            return r0
    }
}
