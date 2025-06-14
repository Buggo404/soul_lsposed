package lombok.eclipse.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/singulars/EclipseJavaUtilListSetSingularizer.SCL.lombok */
abstract class EclipseJavaUtilListSetSingularizer extends lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer {
    EclipseJavaUtilListSetSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public java.util.List<char[]> listFieldsToBeGenerated(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            boolean r0 = r0.useGuavaInstead(r1)
            if (r0 == 0) goto L12
            r0 = r4
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.guavaListSetSingularizer
            r1 = r5
            r2 = r6
            java.util.List r0 = r0.listFieldsToBeGenerated(r1, r2)
            return r0
        L12:
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listFieldsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public java.util.List<char[]> listMethodsToBeGenerated(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            boolean r0 = r0.useGuavaInstead(r1)
            if (r0 == 0) goto L12
            r0 = r4
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.guavaListSetSingularizer
            r1 = r5
            r2 = r6
            java.util.List r0 = r0.listMethodsToBeGenerated(r1, r2)
            return r0
        L12:
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listMethodsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public java.util.List<lombok.eclipse.EclipseNode> generateFields(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r8, lombok.eclipse.EclipseNode r9) {
            r7 = this;
            r0 = r7
            r1 = r9
            boolean r0 = r0.useGuavaInstead(r1)
            if (r0 == 0) goto L12
            r0 = r7
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.guavaListSetSingularizer
            r1 = r8
            r2 = r9
            java.util.List r0 = r0.generateFields(r1, r2)
            return r0
        L12:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer.JAVA_UTIL_ARRAYLIST
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r7
            r1 = 1
            r2 = 0
            r3 = r9
            r4 = r10
            r5 = r8
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r10 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r8
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            r1 = 2
            r0.modifiers = r1
            r0 = r11
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r11
            r1 = r10
            r0.type = r1
            r0 = r8
            r1 = r11
            r0.setGeneratedByRecursive(r1)
            r0 = r9
            r1 = r11
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r11, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r12, boolean r13, lombok.eclipse.EclipseNode r14, boolean r15, lombok.eclipse.handlers.EclipseSingularsRecipes.TypeReferenceMaker r16, lombok.eclipse.handlers.EclipseSingularsRecipes.StatementMaker r17, lombok.AccessLevel r18) {
            r10 = this;
            r0 = r10
            r1 = r14
            boolean r0 = r0.useGuavaInstead(r1)
            if (r0 == 0) goto L1e
            r0 = r10
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.guavaListSetSingularizer
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L1e:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.make()
            r4 = r17
            org.eclipse.jdt.internal.compiler.ast.Statement r4 = r4.mo246make()
            r5 = r12
            r6 = r14
            r7 = r15
            r8 = r18
            r0.generateSingularMethod(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.make()
            r4 = r17
            org.eclipse.jdt.internal.compiler.ast.Statement r4 = r4.mo246make()
            r5 = r12
            r6 = r14
            r7 = r15
            r8 = r18
            r0.generatePluralMethod(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.make()
            r4 = r17
            org.eclipse.jdt.internal.compiler.ast.Statement r4 = r4.mo246make()
            r5 = r12
            r6 = r14
            r7 = r18
            r0.generateClearMethod(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void generateClearMethod(lombok.core.configuration.CheckerFrameworkVersion r11, boolean r12, org.eclipse.jdt.internal.compiler.ast.TypeReference r13, org.eclipse.jdt.internal.compiler.ast.Statement r14, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r15, lombok.eclipse.EclipseNode r16, lombok.AccessLevel r17) {
            r10 = this;
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r16
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r18 = r0
            r0 = r18
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r18
            r1 = r17
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r15
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r19 = r0
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r15
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r18
            r1 = r16
            java.lang.String r2 = "clear"
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r15
            char[] r5 = r5.getPluralName()
            r4.<init>(r5)
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r21
            r1 = r20
            r0.receiver = r1
            r0 = r21
            java.lang.String r1 = "clear"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r2 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r3 = r2
            r4 = r19
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r5 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r6 = r5
            r7 = 0
            r8 = 0
            r6.<init>(r7, r8)
            r6 = 29
            r3.<init>(r4, r5, r6)
            r3 = r21
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r22 = r0
            r0 = r18
            r1 = r14
            if (r1 == 0) goto Ld8
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r22
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r14
            r2[r3] = r4
            goto Le1
        Ld8:
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r22
            r2[r3] = r4
        Le1:
            r0.statements = r1
            r0 = r18
            r1 = r13
            r0.returnType = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.getSource()
            r2 = r11
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r18
            r1 = r10
            r2 = r12
            r3 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.getSource()
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = r1.generateSelfReturnAnnotations(r2, r3)
            r0.annotations = r1
            r0 = r15
            r1 = r18
            r0.setGeneratedByRecursive(r1)
            r0 = r14
            if (r0 == 0) goto L11a
            r0 = r16
            r1 = r18
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L11a:
            r0 = r16
            r1 = r18
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    void generateSingularMethod(lombok.core.configuration.CheckerFrameworkVersion r11, boolean r12, org.eclipse.jdt.internal.compiler.ast.TypeReference r13, org.eclipse.jdt.internal.compiler.ast.Statement r14, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r15, lombok.eclipse.EclipseNode r16, boolean r17, lombok.AccessLevel r18) {
            r10 = this;
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r16
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r19 = r0
            r0 = r19
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r19
            r1 = r18
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r1 = r1.createConstructBuilderVarIfNeeded(r2, r3, r4)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r15
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            r6 = r15
            char[] r6 = r6.getSingularName()
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r1 = r21
            r0.receiver = r1
            r0 = r22
            java.lang.String r1 = "add"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r20
            r1 = r22
            boolean r0 = r0.add(r1)
            r0 = r14
            if (r0 == 0) goto Lb4
            r0 = r20
            r1 = r14
            boolean r0 = r0.add(r1)
        Lb4:
            r0 = r19
            r1 = r20
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r10
            r1 = 0
            r2 = r15
            java.util.List r2 = r2.getTypeArgs()
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.cloneParamType(r1, r2, r3)
            r23 = r0
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getTypeUseAnnotations(r0)
            r24 = r0
            r0 = r23
            lombok.eclipse.handlers.EclipseHandlerUtil.removeTypeUseAnnotations(r0)
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            r2 = r15
            char[] r2 = r2.getSingularName()
            r3 = 0
            r4 = r23
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r25 = r0
            r0 = r25
            r1 = r24
            r0.annotations = r1
            r0 = r19
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            r4 = r25
            r2[r3] = r4
            r0.arguments = r1
            r0 = r19
            r1 = r13
            r0.returnType = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.getSource()
            r2 = r11
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r15
            char[] r0 = r0.getSetterPrefix()
            int r0 = r0.length
            if (r0 != 0) goto L12e
            r0 = r15
            char[] r0 = r0.getSingularName()
            goto L14e
        L12e:
            r0 = r16
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r15
            char[] r3 = r3.getSetterPrefix()
            r2.<init>(r3)
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r15
            char[] r4 = r4.getSingularName()
            r3.<init>(r4)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            char[] r0 = r0.toCharArray()
        L14e:
            r26 = r0
            r0 = r19
            r1 = r17
            if (r1 == 0) goto L15c
            r1 = r26
            goto L173
        L15c:
            r1 = r16
            java.lang.String r2 = "add"
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r15
            char[] r5 = r5.getSingularName()
            r4.<init>(r5)
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
            char[] r1 = r1.toCharArray()
        L173:
            r0.selector = r1
            r0 = r10
            r1 = r12
            r2 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.getSource()
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.generateSelfReturnAnnotations(r1, r2)
            r27 = r0
            r0 = r19
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r15
            lombok.eclipse.EclipseNode r4 = r4.getAnnotation()
            lombok.core.LombokNode r4 = r4.m66up()
            lombok.eclipse.EclipseNode r4 = (lombok.eclipse.EclipseNode) r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r4 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableToBuilderSingularSetterAnnotations(r4)
            r2[r3] = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r0, r1)
            r28 = r0
            r0 = r19
            r1 = r27
            r2 = r28
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Annotation> r3 = org.eclipse.jdt.internal.compiler.ast.Annotation.class
            java.lang.Object[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.concat(r1, r2, r3)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r1
            r0.annotations = r1
            r0 = r14
            if (r0 == 0) goto L1bc
            r0 = r16
            r1 = r19
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L1bc:
            r0 = r15
            r1 = r19
            r0.setGeneratedByRecursive(r1)
            lombok.eclipse.handlers.HandleNonNull r0 = lombok.eclipse.handlers.HandleNonNull.INSTANCE
            r1 = r16
            r2 = r19
            lombok.eclipse.EclipseNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r1, r2)
            r0.fix(r1)
            return
    }

    void generatePluralMethod(lombok.core.configuration.CheckerFrameworkVersion r11, boolean r12, org.eclipse.jdt.internal.compiler.ast.TypeReference r13, org.eclipse.jdt.internal.compiler.ast.Statement r14, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r15, lombok.eclipse.EclipseNode r16, boolean r17, lombok.AccessLevel r18) {
            r10 = this;
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r16
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r19 = r0
            r0 = r19
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r19
            r1 = r18
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r1 = r1.createConstructBuilderVarIfNeeded(r2, r3, r4)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r15
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            r6 = r15
            char[] r6 = r6.getPluralName()
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r1 = r21
            r0.receiver = r1
            r0 = r22
            java.lang.String r1 = "addAll"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r20
            r1 = r22
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_UTIL_COLLECTION
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r10
            r1 = 1
            r2 = 1
            r3 = r16
            r4 = r23
            r5 = r15
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r23 = r0
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            r2 = r15
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = r23
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r24 = r0
            r0 = r10
            r1 = r16
            r2 = r15
            r3 = r20
            r4 = r24
            r5 = r19
            r0.nullBehaviorize(r1, r2, r3, r4, r5)
            r0 = r14
            if (r0 == 0) goto Lf5
            r0 = r20
            r1 = r14
            boolean r0 = r0.add(r1)
        Lf5:
            r0 = r19
            r1 = r20
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r19
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            r4 = r24
            r2[r3] = r4
            r0.arguments = r1
            r0 = r19
            r1 = r13
            r0.returnType = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.getSource()
            r2 = r11
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r15
            char[] r0 = r0.getSetterPrefix()
            int r0 = r0.length
            if (r0 != 0) goto L13b
            r0 = r15
            char[] r0 = r0.getPluralName()
            goto L15b
        L13b:
            r0 = r16
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r15
            char[] r3 = r3.getSetterPrefix()
            r2.<init>(r3)
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r15
            char[] r4 = r4.getPluralName()
            r3.<init>(r4)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            char[] r0 = r0.toCharArray()
        L15b:
            r25 = r0
            r0 = r19
            r1 = r17
            if (r1 == 0) goto L169
            r1 = r25
            goto L180
        L169:
            r1 = r16
            java.lang.String r2 = "addAll"
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r15
            char[] r5 = r5.getPluralName()
            r4.<init>(r5)
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
            char[] r1 = r1.toCharArray()
        L180:
            r0.selector = r1
            r0 = r10
            r1 = r12
            r2 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.getSource()
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.generateSelfReturnAnnotations(r1, r2)
            r26 = r0
            r0 = r19
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r15
            lombok.eclipse.EclipseNode r4 = r4.getAnnotation()
            lombok.core.LombokNode r4 = r4.m66up()
            lombok.eclipse.EclipseNode r4 = (lombok.eclipse.EclipseNode) r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r4 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableToSetterAnnotations(r4)
            r2[r3] = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r0, r1)
            r27 = r0
            r0 = r19
            r1 = r26
            r2 = r27
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Annotation> r3 = org.eclipse.jdt.internal.compiler.ast.Annotation.class
            java.lang.Object[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.concat(r1, r2, r3)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r1
            r0.annotations = r1
            r0 = r14
            if (r0 == 0) goto L1c9
            r0 = r16
            r1 = r19
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L1c9:
            r0 = r15
            r1 = r19
            r0.setGeneratedByRecursive(r1)
            r0 = r16
            r1 = r19
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    protected int getTypeArgumentsCount() {
            r2 = this;
            r0 = 1
            return r0
    }
}
