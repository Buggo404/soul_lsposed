package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacJavaUtilListSingularizer.SCL.lombok */
public class JavacJavaUtilListSingularizer extends lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer {
    public JavacJavaUtilListSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes() {
            r4 = this;
            java.lang.String r0 = "java.util.List"
            java.lang.String r1 = "java.util.Collection"
            java.lang.String r2 = "java.lang.Iterable"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m62of(r0, r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getEmptyMaker(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "java.util.Collections.emptyList"
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
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r17
            r1 = r18
            r2 = r12
            java.lang.String r3 = "java"
            java.lang.String r4 = "util"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Collections"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            java.lang.String r8 = "emptyList"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r18
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r21 = r0
            r0 = r17
            r1 = r17
            r2 = r17
            r3 = r11
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r21
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r20 = r0
            r0 = r17
            r1 = 0
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = r0.Break(r1)
            r21 = r0
            r0 = r17
            r1 = r17
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_INT
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            r2 = r20
            r3 = r21
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCCase r0 = r0.Case(r1, r2)
            r22 = r0
            r0 = r19
            r1 = r22
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r17
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
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
            java.lang.String r8 = "get"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r21
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r22 = r0
            r0 = r22
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r23 = r0
            r0 = r17
            r1 = r18
            r2 = r12
            java.lang.String r3 = "java"
            java.lang.String r4 = "util"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Collections"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            java.lang.String r8 = "singletonList"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r23
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r24 = r0
            r0 = r17
            r1 = r17
            r2 = r17
            r3 = r11
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r24
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r20 = r0
            r0 = r17
            r1 = 0
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = r0.Break(r1)
            r21 = r0
            r0 = r17
            r1 = r17
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_INT
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            r2 = r20
            r3 = r21
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCCase r0 = r0.Case(r1, r2)
            r22 = r0
            r0 = r19
            r1 = r22
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r10
            r1 = r17
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r16
            com.sun.tools.javac.util.List r0 = r0.createListCopy(r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r17
            r1 = 0
            r2 = r20
            com.sun.tools.javac.tree.JCTree$JCCase r0 = r0.Case(r1, r2)
            r21 = r0
            r0 = r19
            r1 = r21
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r17
            r1 = r10
            r2 = r17
            r3 = r12
            r4 = r11
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            r5 = 1
            r6 = 0
            r7 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.getSize(r2, r3, r4, r5, r6, r7)
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCSwitch r0 = r0.Switch(r1, r2)
            r20 = r0
            r0 = r12
            r1 = r11
            java.lang.String r1 = r1.getTargetFqn()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r0, r1)
            r21 = r0
            r0 = r10
            r1 = 1
            r2 = 0
            r3 = r12
            r4 = r21
            r5 = r11
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r21 = r0
            r0 = r17
            r1 = r17
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            r3 = r21
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r22 = r0
            r0 = r14
            r1 = r22
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            r1 = r20
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            return
    }

    private com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> createListCopy(lombok.javac.JavacTreeMaker r11, lombok.javac.handlers.JavacSingularsRecipes.SingularData r12, lombok.javac.JavacNode r13, lombok.javac.JavacNode r14, java.lang.String r15) {
            r10 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
            r0 = r13
            r1 = r15
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r17 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r19 = r0
            r0 = r11
            r1 = r11
            r2 = r17
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r12
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r20 = r0
            r0 = r20
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r19 = r0
            r0 = r13
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ArrayList"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r21 = r0
            r0 = r10
            r1 = 1
            r2 = 0
            r3 = r13
            r4 = r21
            r5 = r12
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r21 = r0
            r0 = r11
            r1 = 0
            r2 = r16
            r3 = r21
            r4 = r19
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r18 = r0
            r0 = r11
            r1 = r16
            r2 = r13
            java.lang.String r3 = "java"
            java.lang.String r4 = "util"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Collections"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            java.lang.String r8 = "unmodifiableList"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r18
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r20 = r0
            r0 = r11
            r1 = r11
            r2 = r11
            r3 = r12
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r19 = r0
            r0 = r19
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List generateFields(lombok.javac.handlers.JavacSingularsRecipes.SingularData r6, lombok.javac.JavacNode r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.util.List r0 = super.generateFields(r1, r2, r3)
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r12, lombok.javac.handlers.JavacSingularsRecipes.SingularData r13, boolean r14, lombok.javac.JavacNode r15, lombok.javac.JavacNode r16, boolean r17, lombok.javac.handlers.JavacSingularsRecipes.ExpressionMaker r18, lombok.javac.handlers.JavacSingularsRecipes.StatementMaker r19, lombok.AccessLevel r20) {
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
            super.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List listFieldsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listFieldsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List listMethodsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listMethodsToBeGenerated(r1, r2)
            return r0
    }
}
