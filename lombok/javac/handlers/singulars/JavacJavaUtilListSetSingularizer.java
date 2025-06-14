package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacJavaUtilListSetSingularizer.SCL.lombok */
abstract class JavacJavaUtilListSetSingularizer extends lombok.javac.handlers.singulars.JavacJavaUtilSingularizer {
    JavacJavaUtilListSetSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer getGuavaInstead(lombok.javac.JavacNode r4) {
            r3 = this;
            lombok.javac.handlers.singulars.JavacGuavaSetListSingularizer r0 = new lombok.javac.handlers.singulars.JavacGuavaSetListSingularizer
            r1 = r0
            r1.<init>()
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public java.util.List<com.sun.tools.javac.util.Name> listFieldsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listFieldsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public java.util.List<com.sun.tools.javac.util.Name> listMethodsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listMethodsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public java.util.List<lombok.javac.JavacNode> generateFields(lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r10
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r10
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ArrayList"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r13 = r0
            r0 = r8
            r1 = 1
            r2 = 0
            r3 = r10
            r4 = r13
            r5 = r9
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r13 = r0
            r0 = r12
            r1 = r12
            r2 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r9
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            r3 = r13
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r14 = r0
            r0 = r10
            r1 = r14
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
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r11 = r0
            r0 = r8
            r1 = r8
            r2 = r10
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r9
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r12 = r0
            r0 = r8
            r1 = r8
            r2 = r8
            r3 = r10
            java.lang.String r4 = "this"
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r9
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = r1.Select(r2, r3)
            r2 = r10
            java.lang.String r3 = "clear"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r13 = r0
            r0 = r8
            r1 = r8
            r2 = r11
            r3 = r13
            r4 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r14 = r0
            r0 = r8
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r12
            r3 = r8
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r15 = r0
            r0 = r8
            r1 = r15
            r2 = r14
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> generateSingularMethodStatements(lombok.javac.JavacTreeMaker r8, lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11) {
            r7 = this;
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r9
            com.sun.tools.javac.util.Name r4 = r4.getSingularName()
            r5 = r9
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.String r5 = r5.toString()
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.generateSingularMethodAddStatement(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> generateSingularMethodParameters(lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12) {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r10
            com.sun.tools.javac.util.Name r6 = r6.getSingularName()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.generateSingularMethodParameter(r1, r2, r3, r4, r5, r6)
            r13 = r0
            r0 = r13
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.tree.JCTree.JCExpression getPluralMethodParamType(lombok.javac.JavacNode r9) {
            r8 = this;
            r0 = r9
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Collection"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.tree.JCTree.JCStatement createConstructBuilderVarIfNeeded(lombok.javac.JavacTreeMaker r8, lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = 0
            r5 = r11
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.createConstructBuilderVarIfNeeded(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getAddMethodName() {
            r2 = this;
            java.lang.String r0 = "add"
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected int getTypeArgumentsCount() {
            r2 = this;
            r0 = 1
            return r0
    }
}
