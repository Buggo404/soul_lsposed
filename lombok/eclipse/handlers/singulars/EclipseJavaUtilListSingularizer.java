package lombok.eclipse.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/singulars/EclipseJavaUtilListSingularizer.SCL.lombok */
public class EclipseJavaUtilListSingularizer extends lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer {
    private static final char[] EMPTY_LIST = null;

    static {
            r0 = 9
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 109(0x6d, float:1.53E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 76
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 105(0x69, float:1.47E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.EMPTY_LIST = r0
            return
    }

    public EclipseJavaUtilListSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes() {
            r4 = this;
            java.lang.String r0 = "java.util.List"
            java.lang.String r1 = "java.util.Collection"
            java.lang.String r2 = "java.lang.Iterable"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m62of(r0, r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    protected char[][] getEmptyMakerReceiver(java.lang.String r3) {
            r2 = this;
            char[][] r0 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.JAVA_UTIL_COLLECTIONS
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    protected char[] getEmptyMakerSelector(java.lang.String r3) {
            r2 = this;
            char[] r0 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.EMPTY_LIST
            return r0
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public void appendBuildCode(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r10, lombok.eclipse.EclipseNode r11, java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> r12, char[] r13, java.lang.String r14) {
            r9 = this;
            r0 = r9
            r1 = r11
            boolean r0 = r0.useGuavaInstead(r1)
            if (r0 == 0) goto L17
            r0 = r9
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.guavaListSetSingularizer
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.appendBuildCode(r1, r2, r3, r4, r5)
            return
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = 1
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 48
            r2[r3] = r4
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r1 = lombok.eclipse.Eclipse.createCaseStatement(r1)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.JAVA_UTIL_COLLECTIONS
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r16
            java.lang.String r1 = "emptyList"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r10
            char[] r5 = r5.getPluralName()
            r6 = 0
            r4.<init>(r5, r6)
            r4 = r16
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.BreakStatement r1 = new org.eclipse.jdt.internal.compiler.ast.BreakStatement
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r15
            r1 = 1
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 49
            r2[r3] = r4
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r1 = lombok.eclipse.Eclipse.createCaseStatement(r1)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r10
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r16
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r16
            r0.receiver = r1
            r0 = r17
            r1 = 3
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 103(0x67, float:1.44E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 101(0x65, float:1.42E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 116(0x74, float:1.63E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = 1
            char[] r4 = new char[r4]
            r5 = r4
            r6 = 0
            r7 = 48
            r5[r6] = r7
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r4 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r4, r5)
            r2[r3] = r4
            r0.arguments = r1
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r1 = r0
            r2 = 0
            r3 = r17
            r1[r2] = r3
            r18 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.JAVA_UTIL_COLLECTIONS
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r19
            java.lang.String r1 = "singletonList"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r19
            r1 = r18
            r0.arguments = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r10
            char[] r5 = r5.getPluralName()
            r6 = 0
            r4.<init>(r5, r6)
            r4 = r19
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.BreakStatement r1 = new org.eclipse.jdt.internal.compiler.ast.BreakStatement
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r15
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r1 = lombok.eclipse.Eclipse.createCaseStatement(r1)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r10
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.JAVA_UTIL_ARRAYLIST
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r9
            r1 = 1
            r2 = 0
            r3 = r11
            r4 = r18
            r5 = r10
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r18 = r0
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r18
            r0.type = r1
            r0 = r19
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r17
            r2[r3] = r4
            r0.arguments = r1
            r0 = r19
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.JAVA_UTIL_COLLECTIONS
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r17
            java.lang.String r1 = "unmodifiableList"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r16
            r2[r3] = r4
            r0.arguments = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r10
            char[] r5 = r5.getPluralName()
            r6 = 0
            r4.<init>(r5, r6)
            r4 = r17
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r0 = new org.eclipse.jdt.internal.compiler.ast.SwitchStatement
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = r15
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r16
            r1 = r9
            r2 = r11
            r3 = r10
            char[] r3 = r3.getPluralName()
            r4 = 1
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.getSize(r2, r3, r4, r5)
            r0.expression = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.getTargetFqn()
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilListSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r9
            r1 = 1
            r2 = 0
            r3 = r11
            r4 = r17
            r5 = r10
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r17 = r0
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r10
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r18
            r1 = r17
            r0.type = r1
            r0 = r12
            r1 = r18
            boolean r0 = r0.add(r1)
            r0 = r12
            r1 = r16
            boolean r0 = r0.add(r1)
            return
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ java.util.List generateFields(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.generateFields(r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r11, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r12, boolean r13, lombok.eclipse.EclipseNode r14, boolean r15, lombok.eclipse.handlers.EclipseSingularsRecipes.TypeReferenceMaker r16, lombok.eclipse.handlers.EclipseSingularsRecipes.StatementMaker r17, lombok.AccessLevel r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            super.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ java.util.List listFieldsToBeGenerated(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listFieldsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseJavaUtilListSetSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ java.util.List listMethodsToBeGenerated(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listMethodsToBeGenerated(r1, r2)
            return r0
    }
}
