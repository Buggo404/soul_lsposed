package lombok.eclipse.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/singulars/EclipseGuavaSingularizer.SCL.lombok */
abstract class EclipseGuavaSingularizer extends lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer {

    /* renamed from: OF */
    protected static final char[] f583OF = null;
    protected static final char[][] CGCC = null;

    static {
            r0 = 2
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.f583OF = r0
            r0 = 4
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 3
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 99
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 109(0x6d, float:1.53E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 6
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 103(0x67, float:1.44E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 103(0x67, float:1.44E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 101(0x65, float:1.42E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 6
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 99
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 109(0x6d, float:1.53E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 109(0x6d, float:1.53E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 110(0x6e, float:1.54E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 7
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 99
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 101(0x65, float:1.42E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 99
            r4[r5] = r6
            r4 = r3
            r5 = 6
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.CGCC = r0
            return
    }

    EclipseGuavaSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    protected java.lang.String getSimpleTargetTypeName(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r3) {
            r2 = this;
            r0 = r3
            java.lang.String r0 = r0.getTargetFqn()
            java.lang.String r0 = lombok.core.GuavaTypeMap.getGuavaTypeName(r0)
            return r0
    }

    protected char[] getBuilderMethodName(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r4) {
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
            if (r0 == 0) goto L1e
        L18:
            java.lang.String r0 = "naturalOrder"
            char[] r0 = r0.toCharArray()
            return r0
        L1e:
            java.lang.String r0 = "builder"
            char[] r0 = r0.toCharArray()
            return r0
    }

    protected char[][] makeGuavaTypeName(java.lang.String r8, boolean r9) {
            r7 = this;
            r0 = r9
            if (r0 == 0) goto L9
            r0 = 6
            goto La
        L9:
            r0 = 5
        La:
            char[] r0 = new char[r0]
            r10 = r0
            r0 = r10
            r1 = 0
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.CGCC
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r10
            r1 = 1
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.CGCC
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r10
            r1 = 2
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.CGCC
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r10
            r1 = 3
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.CGCC
            r3 = 3
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r10
            r1 = 4
            r2 = r8
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            r0 = r9
            if (r0 == 0) goto L64
            r0 = r10
            r1 = 5
            r2 = 7
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 66
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 117(0x75, float:1.64E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 105(0x69, float:1.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 108(0x6c, float:1.51E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 100
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 101(0x65, float:1.42E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 114(0x72, float:1.6E-43)
            r3[r4] = r5
            r0[r1] = r2
        L64:
            r0 = r10
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    protected char[] getEmptyMakerSelector(java.lang.String r3) {
            r2 = this;
            char[] r0 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.f583OF
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    protected char[][] getEmptyMakerReceiver(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = lombok.core.GuavaTypeMap.getGuavaTypeName(r1)
            r2 = 0
            char[][] r0 = r0.makeGuavaTypeName(r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public java.util.List<lombok.eclipse.EclipseNode> generateFields(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r8, lombok.eclipse.EclipseNode r9) {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.String r0 = r0.getSimpleTargetTypeName(r1)
            r10 = r0
            r0 = r7
            r1 = r10
            r2 = 1
            char[][] r0 = r0.makeGuavaTypeName(r1, r2)
            r11 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r11
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.getTypeArgumentsCount()
            r2 = 0
            r3 = r9
            r4 = r12
            r5 = r8
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r8
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r13
            r1 = 2
            r0.modifiers = r1
            r0 = r13
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r13
            r1 = r12
            r0.type = r1
            r0 = r8
            r1 = r13
            r0.setGeneratedByRecursive(r1)
            r0 = r9
            r1 = r13
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r11, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r12, boolean r13, lombok.eclipse.EclipseNode r14, boolean r15, lombok.eclipse.handlers.EclipseSingularsRecipes.TypeReferenceMaker r16, lombok.eclipse.handlers.EclipseSingularsRecipes.StatementMaker r17, lombok.AccessLevel r18) {
            r10 = this;
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

    void generateClearMethod(lombok.core.configuration.CheckerFrameworkVersion r9, boolean r10, org.eclipse.jdt.internal.compiler.ast.TypeReference r11, org.eclipse.jdt.internal.compiler.ast.Statement r12, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r13, lombok.eclipse.EclipseNode r14, lombok.AccessLevel r15) {
            r8 = this;
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r14
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r16
            r1 = r15
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r13
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r17
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 0
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r16
            r1 = r14
            java.lang.String r2 = "clear"
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r13
            char[] r5 = r5.getPluralName()
            r4.<init>(r5)
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r16
            r1 = r12
            if (r1 == 0) goto L95
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r18
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r12
            r2[r3] = r4
            goto L9e
        L95:
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r18
            r2[r3] = r4
        L9e:
            r0.statements = r1
            r0 = r16
            r1 = r11
            r0.returnType = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.getSource()
            r2 = r9
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r16
            r1 = r8
            r2 = r10
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.getSource()
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = r1.generateSelfReturnAnnotations(r2, r3)
            r0.annotations = r1
            r0 = r13
            r1 = r16
            r0.setGeneratedByRecursive(r1)
            r0 = r12
            if (r0 == 0) goto Ld7
            r0 = r14
            r1 = r16
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        Ld7:
            r0 = r14
            r1 = r16
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    void generateSingularMethod(lombok.core.configuration.CheckerFrameworkVersion r11, boolean r12, org.eclipse.jdt.internal.compiler.ast.TypeReference r13, org.eclipse.jdt.internal.compiler.ast.Statement r14, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r15, lombok.eclipse.EclipseNode r16, boolean r17, lombok.AccessLevel r18) {
            r10 = this;
            r0 = r10
            lombok.core.LombokImmutableList r0 = r0.getArgumentSuffixes()
            r19 = r0
            r0 = r19
            int r0 = r0.size()
            char[] r0 = new char[r0]
            r20 = r0
            r0 = 0
            r21 = r0
            goto L43
        L16:
            r0 = r19
            r1 = r21
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            r0 = r15
            char[] r0 = r0.getSingularName()
            r23 = r0
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3a
            r2 = r23
            goto L3f
        L3a:
            r2 = r22
            char[] r2 = r2.toCharArray()
        L3f:
            r0[r1] = r2
            int r21 = r21 + 1
        L43:
            r0 = r21
            r1 = r19
            int r1 = r1.size()
            if (r0 < r1) goto L16
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r16
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r21 = r0
            r0 = r21
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r21
            r1 = r18
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = r10
            r2 = r15
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.Statement r1 = r1.createConstructBuilderVarIfNeeded(r2, r3)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r15
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r24
            r1 = r19
            int r1 = r1.size()
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r0.arguments = r1
            r0 = 0
            r25 = r0
            goto Le7
        Lcf:
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r20
            r5 = r25
            r4 = r4[r5]
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r25 = r25 + 1
        Le7:
            r0 = r25
            r1 = r19
            int r1 = r1.size()
            if (r0 < r1) goto Lcf
            r0 = r24
            r1 = r23
            r0.receiver = r1
            r0 = r24
            r1 = r10
            java.lang.String r1 = r1.getAddMethodName()
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r22
            r1 = r24
            boolean r0 = r0.add(r1)
            r0 = r14
            if (r0 == 0) goto L11d
            r0 = r22
            r1 = r14
            boolean r0 = r0.add(r1)
        L11d:
            r0 = r21
            r1 = r22
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r21
            r1 = r19
            int r1 = r1.size()
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r0.arguments = r1
            r0 = 0
            r25 = r0
            goto L187
        L143:
            r0 = r10
            r1 = r25
            r2 = r15
            java.util.List r2 = r2.getTypeArgs()
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.cloneParamType(r1, r2, r3)
            r26 = r0
            r0 = r26
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getTypeUseAnnotations(r0)
            r27 = r0
            r0 = r26
            lombok.eclipse.handlers.EclipseHandlerUtil.removeTypeUseAnnotations(r0)
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.Argument r2 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r3 = r2
            r4 = r20
            r5 = r25
            r4 = r4[r5]
            r5 = 0
            r6 = r26
            r7 = 16
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r25
            r0 = r0[r1]
            r1 = r27
            r0.annotations = r1
            int r25 = r25 + 1
        L187:
            r0 = r25
            r1 = r19
            int r1 = r1.size()
            if (r0 < r1) goto L143
            r0 = r21
            r1 = r13
            r0.returnType = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.getSource()
            r2 = r11
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r15
            char[] r0 = r0.getSetterPrefix()
            int r0 = r0.length
            if (r0 != 0) goto L1b6
            r0 = r15
            char[] r0 = r0.getSingularName()
            goto L1d6
        L1b6:
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
        L1d6:
            r25 = r0
            r0 = r21
            r1 = r17
            if (r1 == 0) goto L1e4
            r1 = r25
            goto L1fb
        L1e4:
            r1 = r16
            java.lang.String r2 = "add"
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r15
            char[] r5 = r5.getSingularName()
            r4.<init>(r5)
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
            char[] r1 = r1.toCharArray()
        L1fb:
            r0.selector = r1
            r0 = r10
            r1 = r12
            r2 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.getSource()
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.generateSelfReturnAnnotations(r1, r2)
            r26 = r0
            r0 = r21
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
            r27 = r0
            r0 = r21
            r1 = r26
            r2 = r27
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Annotation> r3 = org.eclipse.jdt.internal.compiler.ast.Annotation.class
            java.lang.Object[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.concat(r1, r2, r3)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r1
            r0.annotations = r1
            r0 = r14
            if (r0 == 0) goto L244
            r0 = r16
            r1 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L244:
            r0 = r15
            r1 = r21
            r0.setGeneratedByRecursive(r1)
            lombok.eclipse.handlers.HandleNonNull r0 = lombok.eclipse.handlers.HandleNonNull.INSTANCE
            r1 = r16
            r2 = r21
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
            org.eclipse.jdt.internal.compiler.ast.Statement r1 = r1.createConstructBuilderVarIfNeeded(r2, r3)
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
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r10
            java.lang.String r3 = r3.getAddMethodName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "All"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r20
            r1 = r22
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.getAddAllTypeName()
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r10
            r1 = r10
            int r1 = r1.getTypeArgumentsCount()
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
            if (r0 == 0) goto L10f
            r0 = r20
            r1 = r14
            boolean r0 = r0.add(r1)
        L10f:
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
            if (r0 != 0) goto L155
            r0 = r15
            char[] r0 = r0.getPluralName()
            goto L175
        L155:
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
        L175:
            r25 = r0
            r0 = r19
            r1 = r17
            if (r1 == 0) goto L183
            r1 = r25
            goto L19a
        L183:
            r1 = r16
            java.lang.String r2 = "addAll"
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r15
            char[] r5 = r5.getPluralName()
            r4.<init>(r5)
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
            char[] r1 = r1.toCharArray()
        L19a:
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
            if (r0 == 0) goto L1e3
            r0 = r16
            r1 = r19
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L1e3:
            r0 = r15
            r1 = r19
            r0.setGeneratedByRecursive(r1)
            r0 = r16
            r1 = r19
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public void appendBuildCode(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r9, lombok.eclipse.EclipseNode r10, java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> r11, char[] r12, java.lang.String r13) {
            r8 = this;
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r9
            java.lang.String r2 = r2.getTargetFqn()
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r8
            r1 = r9
            java.lang.String r0 = r0.getSimpleTargetTypeName(r1)
            r15 = r0
            r0 = r8
            int r0 = r0.getTypeArgumentsCount()
            r16 = r0
            r0 = r8
            r1 = r16
            r2 = 0
            r3 = r10
            r4 = r14
            r5 = r9
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r14 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = 2
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 111(0x6f, float:1.56E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 102(0x66, float:1.43E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            r3 = r8
            r4 = r15
            r5 = 0
            char[][] r3 = r3.makeGuavaTypeName(r4, r5)
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r17
            r1 = r8
            r2 = r16
            r3 = 0
            r4 = r10
            r5 = r9
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = r1.createTypeArgs(r2, r3, r4, r5)
            r0.typeArguments = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = 5
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 98
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 117(0x75, float:1.64E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 105(0x69, float:1.47E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 3
            r4 = 108(0x6c, float:1.51E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 4
            r4 = 100
            r2[r3] = r4
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r9
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r19 = r0
            r0 = r19
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            r0 = r18
            r1 = r19
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r9
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r20 = r0
            r0 = r20
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r20
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r19 = r0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r19
            r3 = r17
            r4 = r18
            r1.<init>(r2, r3, r4)
            r20 = r0
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r9
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r21 = r0
            r0 = r21
            r1 = r14
            r0.type = r1
            r0 = r21
            r1 = r20
            r0.initialization = r1
            r0 = r11
            r1 = r21
            boolean r0 = r0.add(r1)
            return
    }

    protected org.eclipse.jdt.internal.compiler.ast.Statement createConstructBuilderVarIfNeeded(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r10, lombok.eclipse.EclipseNode r11) {
            r9 = this;
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r10
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r10
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r12
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r14 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r9
            r1 = r9
            r2 = r10
            java.lang.String r1 = r1.getSimpleTargetTypeName(r2)
            r2 = 0
            char[][] r0 = r0.makeGuavaTypeName(r1, r2)
            r16 = r0
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            r3 = r16
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r15
            r1 = r9
            r2 = r10
            char[] r1 = r1.getBuilderMethodName(r2)
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r14
            org.eclipse.jdt.internal.compiler.ast.Assignment r3 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r4 = r3
            r5 = r13
            r6 = r15
            r7 = 0
            r4.<init>(r5, r6, r7)
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    protected abstract lombok.core.LombokImmutableList<java.lang.String> getArgumentSuffixes();

    protected abstract java.lang.String getAddMethodName();

    protected abstract java.lang.String getAddAllTypeName();

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    protected int getTypeArgumentsCount() {
            r2 = this;
            r0 = r2
            lombok.core.LombokImmutableList r0 = r0.getArgumentSuffixes()
            int r0 = r0.size()
            return r0
    }
}
