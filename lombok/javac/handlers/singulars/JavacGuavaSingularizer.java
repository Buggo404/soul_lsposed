package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacGuavaSingularizer.SCL.lombok */
abstract class JavacGuavaSingularizer extends lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer {
    JavacGuavaSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    protected java.lang.String getSimpleTargetTypeName(lombok.javac.handlers.JavacSingularsRecipes.SingularData r3) {
            r2 = this;
            r0 = r3
            java.lang.String r0 = r0.getTargetFqn()
            java.lang.String r0 = lombok.core.GuavaTypeMap.getGuavaTypeName(r0)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getEmptyMaker(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "com.google.common.collect."
            r1.<init>(r2)
            r1 = r5
            java.lang.String r1 = lombok.core.GuavaTypeMap.getGuavaTypeName(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".of"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected java.lang.String getBuilderMethodName(lombok.javac.handlers.JavacSingularsRecipes.SingularData r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.getSimpleTargetTypeName(r1)
            r5 = r0
            java.lang.String r0 = "ImmutableSortedSet"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "ImmutableSortedMap"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
        L18:
            java.lang.String r0 = "naturalOrder"
            return r0
        L1b:
            java.lang.String r0 = "builder"
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public java.util.List<lombok.javac.JavacNode> generateFields(lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r10
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r8
            r1 = r9
            java.lang.String r0 = r0.getSimpleTargetTypeName(r1)
            r13 = r0
            r0 = r10
            java.lang.String r1 = "com"
            java.lang.String r2 = "google"
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "common"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "collect"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r13
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "Builder"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r14 = r0
            r0 = r8
            r1 = r8
            int r1 = r1.getTypeArgumentsCount()
            r2 = 0
            r3 = r10
            r4 = r14
            r5 = r9
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r14 = r0
            r0 = r12
            r1 = r12
            r2 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r9
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            r3 = r14
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r15 = r0
            r0 = r10
            r1 = r15
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r12, lombok.javac.handlers.JavacSingularsRecipes.SingularData r13, boolean r14, lombok.javac.JavacNode r15, lombok.javac.JavacNode r16, boolean r17, lombok.javac.handlers.JavacSingularsRecipes.ExpressionMaker r18, lombok.javac.handlers.JavacSingularsRecipes.StatementMaker r19, lombok.AccessLevel r20) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.doGenerateMethods(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.tree.JCTree.JCStatement generateClearStatements(lombok.javac.JavacTreeMaker r8, lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r8
            r1 = r8
            r2 = r10
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r9
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r11 = r0
            r0 = r8
            r1 = r8
            r2 = r11
            r3 = r8
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> generateSingularMethodParameters(lombok.javac.JavacTreeMaker r11, lombok.javac.handlers.JavacSingularsRecipes.SingularData r12, lombok.javac.JavacNode r13, lombok.javac.JavacNode r14) {
            r10 = this;
            r0 = r10
            r1 = r12
            r2 = r13
            com.sun.tools.javac.util.Name[] r0 = r0.generateSingularMethodParameterNames(r1, r2)
            r15 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = 0
            r17 = r0
            goto L30
        L17:
            r0 = r16
            r1 = r10
            r2 = r17
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r17
            r7 = r7[r8]
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.generateSingularMethodParameter(r2, r3, r4, r5, r6, r7)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            int r17 = r17 + 1
        L30:
            r0 = r17
            r1 = r15
            int r1 = r1.length
            if (r0 < r1) goto L17
            r0 = r16
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> generateSingularMethodStatements(lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12) {
            r8 = this;
            r0 = r8
            r1 = r10
            r2 = r11
            com.sun.tools.javac.util.Name[] r0 = r0.generateSingularMethodParameterNames(r1, r2)
            r13 = r0
            r0 = r11
            java.lang.String r1 = "this"
            r2 = r10
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.String r6 = r6.getAddMethodName()
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r14 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r13
            r1 = r0
            r19 = r1
            int r0 = r0.length
            r18 = r0
            r0 = 0
            r17 = r0
            goto L4f
        L39:
            r0 = r19
            r1 = r17
            r0 = r0[r1]
            r16 = r0
            r0 = r15
            r1 = r9
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            int r17 = r17 + 1
        L4f:
            r0 = r17
            r1 = r18
            if (r0 < r1) goto L39
            r0 = r15
            com.sun.tools.javac.util.List r0 = r0.toList()
            r16 = r0
            r0 = r9
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r14
            r3 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r17 = r0
            r0 = r9
            r1 = r17
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r18 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r1 = r18
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            return r0
    }

    private com.sun.tools.javac.util.Name[] generateSingularMethodParameterNames(lombok.javac.handlers.JavacSingularsRecipes.SingularData r6, lombok.javac.JavacNode r7) {
            r5 = this;
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.getArgumentSuffixes()
            r8 = r0
            r0 = r8
            int r0 = r0.size()
            com.sun.tools.javac.util.Name[] r0 = new com.sun.tools.javac.util.Name[r0]
            r9 = r0
            r0 = 0
            r10 = r0
            goto L40
        L14:
            r0 = r8
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.getSingularName()
            r12 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L36
            r2 = r12
            goto L3c
        L36:
            r2 = r7
            r3 = r11
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
        L3c:
            r0[r1] = r2
            int r10 = r10 + 1
        L40:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 < r1) goto L14
            r0 = r9
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.tree.JCTree.JCExpression getPluralMethodParamType(lombok.javac.JavacNode r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getAddAllTypeName()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r0, r1)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public void appendBuildCode(lombok.javac.handlers.JavacSingularsRecipes.SingularData r11, lombok.javac.JavacNode r12, lombok.javac.JavacNode r13, com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> r14, com.sun.tools.javac.util.Name r15, java.lang.String r16) {
            r10 = this;
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r17 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r18 = r0
            r0 = r12
            r1 = r11
            java.lang.String r1 = r1.getTargetFqn()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r0, r1)
            r19 = r0
            r0 = r10
            int r0 = r0.getTypeArgumentsCount()
            r20 = r0
            r0 = r10
            r1 = r20
            r2 = 0
            r3 = r12
            r4 = r19
            r5 = r11
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r19 = r0
            r0 = r12
            java.lang.String r1 = "com"
            java.lang.String r2 = "google"
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "common"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "collect"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r10
            r7 = r11
            java.lang.String r6 = r6.getSimpleTargetTypeName(r7)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "of"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r22 = r0
            r0 = r10
            r1 = r20
            r2 = 0
            r3 = r12
            r4 = r11
            com.sun.tools.javac.util.List r4 = r4.getTypeArgs()
            r5 = r13
            com.sun.tools.javac.util.List r0 = r0.createTypeArgs(r1, r2, r3, r4, r5)
            r23 = r0
            r0 = r17
            r1 = r23
            r2 = r22
            r3 = r18
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r21 = r0
            r0 = r17
            r1 = r18
            r2 = r12
            r3 = r16
            r4 = r11
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "build"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r18
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r22 = r0
            r0 = r17
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r17
            r3 = r17
            r4 = r12
            r5 = r16
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r11
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r17
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r23 = r0
            r0 = r17
            r1 = r23
            r2 = r21
            r3 = r22
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r24 = r0
            r0 = r17
            r1 = r17
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            r3 = r19
            r4 = r24
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r25 = r0
            r0 = r14
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.tree.JCTree.JCStatement createConstructBuilderVarIfNeeded(lombok.javac.JavacTreeMaker r12, lombok.javac.handlers.JavacSingularsRecipes.SingularData r13, lombok.javac.JavacNode r14, lombok.javac.JavacNode r15) {
            r11 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
            r0 = r12
            r1 = r12
            r2 = r14
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r13
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r17 = r0
            r0 = r12
            r1 = r12
            r2 = r14
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r13
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r18 = r0
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r17
            r3 = r12
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r19 = r0
            r0 = r12
            r1 = r16
            r2 = r14
            java.lang.String r3 = "com"
            java.lang.String r4 = "google"
            r5 = 4
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "common"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            java.lang.String r8 = "collect"
            r6[r7] = r8
            r6 = r5
            r7 = 2
            r8 = r11
            r9 = r13
            java.lang.String r8 = r8.getSimpleTargetTypeName(r9)
            r6[r7] = r8
            r6 = r5
            r7 = 3
            r8 = r11
            r9 = r13
            java.lang.String r8 = r8.getBuilderMethodName(r9)
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r20 = r0
            r0 = r12
            r1 = r12
            r2 = r18
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r21 = r0
            r0 = r12
            r1 = r19
            r2 = r21
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            return r0
    }

    protected abstract lombok.core.LombokImmutableList<java.lang.String> getArgumentSuffixes();

    protected abstract java.lang.String getAddAllTypeName();

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected int getTypeArgumentsCount() {
            r2 = this;
            r0 = r2
            lombok.core.LombokImmutableList r0 = r0.getArgumentSuffixes()
            int r0 = r0.size()
            return r0
    }
}
