package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacJavaUtilMapSingularizer.SCL.lombok */
public class JavacJavaUtilMapSingularizer extends lombok.javac.handlers.singulars.JavacJavaUtilSingularizer {
    public JavacJavaUtilMapSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes() {
            r4 = this;
            java.lang.String r0 = "java.util.Map"
            java.lang.String r1 = "java.util.SortedMap"
            java.lang.String r2 = "java.util.NavigableMap"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m62of(r0, r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getEmptyMaker(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "NavigableMap"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "java.util.Collections.emptyNavigableMap"
            return r0
        Lc:
            r0 = r4
            java.lang.String r1 = "SortedMap"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = "java.util.Collections.emptySortedMap"
            return r0
        L18:
            java.lang.String r0 = "java.util.Collections.emptyMap"
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer getGuavaInstead(lombok.javac.JavacNode r4) {
            r3 = this;
            lombok.javac.handlers.singulars.JavacGuavaMapSingularizer r0 = new lombok.javac.handlers.singulars.JavacGuavaMapSingularizer
            r1 = r0
            r1.<init>()
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public java.util.List<com.sun.tools.javac.util.Name> listFieldsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10) {
            r8 = this;
            r0 = r9
            com.sun.tools.javac.util.Name r0 = r0.getPluralName()
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = 2
            com.sun.tools.javac.util.Name[] r0 = new com.sun.tools.javac.util.Name[r0]
            r1 = r0
            r2 = 0
            r3 = r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r6 = r11
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.<init>(r6)
            java.lang.String r5 = "$key"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r6 = r11
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.<init>(r6)
            java.lang.String r5 = "$value"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
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
            r14 = r0
            r0 = r8
            r1 = 1
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
            r2 = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r9
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "$key"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r14
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r13 = r0
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
            r15 = r0
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.getTypeArgs()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L86
            r0 = r16
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L86
            r0 = r16
            com.sun.tools.javac.util.List r0 = r0.tail
            r16 = r0
            goto L8b
        L86:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
        L8b:
            r0 = r8
            r1 = 1
            r2 = 0
            r3 = r10
            r4 = r15
            r5 = r16
            r6 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r15 = r0
            r0 = r12
            r1 = r12
            r2 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r9
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "$value"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r15
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r14 = r0
            r0 = r10
            r1 = r14
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r15 = r0
            r0 = r10
            r1 = r13
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r16 = r0
            r0 = 2
            lombok.javac.JavacNode[] r0 = new lombok.javac.JavacNode[r0]
            r1 = r0
            r2 = 0
            r3 = r16
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r15
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
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
    protected com.sun.tools.javac.tree.JCTree.JCStatement generateClearStatements(lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11) {
            r8 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r12 = r0
            r0 = r11
            java.lang.String r1 = "this"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$key"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r13 = r0
            r0 = r11
            java.lang.String r1 = "this"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$key"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "clear"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r14 = r0
            r0 = r11
            java.lang.String r1 = "this"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$value"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "clear"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r15 = r0
            r0 = r9
            r1 = r9
            r2 = r12
            r3 = r14
            r4 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r16 = r0
            r0 = r9
            r1 = r9
            r2 = r12
            r3 = r15
            r4 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r17 = r0
            r0 = r9
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r13
            r3 = r9
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r18 = r0
            r0 = r9
            r1 = 0
            r2 = r16
            r3 = r17
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r19 = r0
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> generateSingularMethodStatements(lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12) {
            r8 = this;
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getSingularName()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "Key"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r13 = r0
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getSingularName()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "Value"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r14 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r13
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = r5
            r6.<init>()
            r6 = r10
            com.sun.tools.javac.util.Name r6 = r6.getPluralName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "$key"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.generateSingularMethodAddStatement(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = r5
            r6.<init>()
            r6 = r10
            com.sun.tools.javac.util.Name r6 = r6.getPluralName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "$value"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.generateSingularMethodAddStatement(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> generateSingularMethodParameters(lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12) {
            r8 = this;
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getSingularName()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "Key"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r13 = r0
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r10
            com.sun.tools.javac.util.Name r3 = r3.getSingularName()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "Value"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r14 = r0
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.generateSingularMethodParameter(r1, r2, r3, r4, r5, r6)
            r15 = r0
            r0 = r8
            r1 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r14
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.generateSingularMethodParameter(r1, r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r15
            r1 = r16
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> generatePluralMethodStatements(lombok.javac.JavacTreeMaker r11, lombok.javac.handlers.JavacSingularsRecipes.SingularData r12, lombok.javac.JavacNode r13, lombok.javac.JavacNode r14) {
            r10 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r15 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = 0
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r17 = r0
            r0 = r13
            java.lang.String r1 = "$lombokEntry"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r19 = r0
            r0 = r13
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Map"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "Entry"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r20 = r0
            r0 = r10
            r1 = 2
            r2 = 1
            r3 = r13
            r4 = r20
            r5 = r12
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r20 = r0
            r0 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r11
            r3 = r11
            r4 = r19
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            java.lang.String r5 = "getKey"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r21 = r0
            r0 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r11
            r3 = r11
            r4 = r19
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            java.lang.String r5 = "getValue"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r22 = r0
            r0 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r13
            java.lang.String r3 = "this"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            r5 = r12
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "$key"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "add"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r21
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r23 = r0
            r0 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r13
            java.lang.String r3 = "this"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            r5 = r12
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "$value"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "add"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r22
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r24 = r0
            r0 = r11
            r1 = 0
            r2 = r11
            r3 = r23
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r2 = r2.Exec(r3)
            r3 = r11
            r4 = r24
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r3 = r3.Exec(r4)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r25 = r0
            r0 = r11
            r1 = r15
            r2 = r11
            r3 = r11
            r4 = r12
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            java.lang.String r5 = "entrySet"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r15
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r26 = r0
            r0 = r11
            r1 = r11
            r2 = r11
            r3 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r19
            r4 = r20
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            r2 = r26
            r3 = r25
            com.sun.tools.javac.tree.JCTree$JCEnhancedForLoop r0 = r0.ForeachLoop(r1, r2, r3)
            r27 = r0
            r0 = r16
            r1 = r27
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r16
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
            java.lang.String r6 = "Map"
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
            r4 = 1
            r5 = r11
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.createConstructBuilderVarIfNeeded(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public void appendBuildCode(lombok.javac.handlers.JavacSingularsRecipes.SingularData r14, lombok.javac.JavacNode r15, lombok.javac.JavacNode r16, com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> r17, com.sun.tools.javac.util.Name r18, java.lang.String r19) {
            r13 = this;
            r0 = r15
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r20 = r0
            r0 = r14
            java.lang.String r0 = r0.getTargetFqn()
            java.lang.String r1 = "java.util.Map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            r0 = r17
            r1 = r13
            r2 = r20
            r3 = r14
            r4 = r15
            r5 = 1
            java.lang.String r6 = "emptyMap"
            java.lang.String r7 = "singletonMap"
            java.lang.String r8 = "LinkedHashMap"
            r9 = r16
            r10 = r19
            com.sun.tools.javac.util.List r1 = r1.createJavaUtilSetMapInitialCapacitySwitchStatements(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
            goto L48
        L30:
            r0 = r17
            r1 = r13
            r2 = r20
            r3 = r14
            r4 = r15
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 1
            java.lang.String r9 = "TreeMap"
            r10 = r16
            r11 = r19
            com.sun.tools.javac.util.List r1 = r1.createJavaUtilSimpleCreationAndFillStatements(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
        L48:
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getAddMethodName() {
            r2 = this;
            java.lang.String r0 = "put"
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected int getTypeArgumentsCount() {
            r2 = this;
            r0 = 2
            return r0
    }
}
