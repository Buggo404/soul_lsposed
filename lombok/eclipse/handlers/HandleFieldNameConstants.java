package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleFieldNameConstants.SCL.lombok */
public class HandleFieldNameConstants extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.FieldNameConstants> {
    private static final lombok.core.configuration.IdentifierName FIELDS = null;

    static {
            java.lang.String r0 = "Fields"
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)
            lombok.eclipse.handlers.HandleFieldNameConstants.FIELDS = r0
            return
    }

    public HandleFieldNameConstants() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void generateFieldNameConstantsForType(lombok.eclipse.EclipseNode r11, lombok.eclipse.EclipseNode r12, lombok.AccessLevel r13, boolean r14, lombok.core.configuration.IdentifierName r15, boolean r16, boolean r17) {
            r10 = this;
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassEnumOrRecord(r0)
            if (r0 != 0) goto Le
            r0 = r12
            java.lang.String r1 = "@FieldNameConstants is only supported on a class, an enum or a record."
            r0.addError(r1)
            return
        Le:
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto L1c
            r0 = r12
            java.lang.String r1 = "@FieldNameConstants is not supported on non-static nested classes."
            r0.addError(r1)
            return
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r11
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L52
        L31:
            r0 = r20
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r19 = r0
            r0 = r10
            r1 = r19
            r2 = r16
            boolean r0 = r0.fieldQualifiesForFieldNameConstantsGeneration(r1, r2)
            if (r0 == 0) goto L52
            r0 = r18
            r1 = r19
            boolean r0 = r0.add(r1)
        L52:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L31
            r0 = r18
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            r0 = r12
            java.lang.String r1 = "No fields qualify for @FieldNameConstants, therefore this annotation does nothing"
            r0.addWarning(r1)
            goto L85
        L6f:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r12
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r3
            r4 = r13
            r5 = r18
            r6 = r14
            r7 = r15
            r8 = r17
            r0.createInnerTypeFieldNameConstants(r1, r2, r3, r4, r5, r6, r7, r8)
        L85:
            return
    }

    private boolean fieldQualifiesForFieldNameConstantsGeneration(lombok.eclipse.EclipseNode r4, boolean r5) {
            r3 = this;
            r0 = r4
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.Class<lombok.experimental.FieldNameConstants$Exclude> r0 = lombok.experimental.FieldNameConstants.Exclude.class
            r1 = r4
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L17
            r0 = 0
            return r0
        L17:
            java.lang.Class<lombok.experimental.FieldNameConstants$Include> r0 = lombok.experimental.FieldNameConstants.Include.class
            r1 = r4
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = r5
            if (r0 == 0) goto L28
            r0 = 0
            return r0
        L28:
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r6 = r0
            r0 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            return r0
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.FieldNameConstants> r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11, lombok.eclipse.EclipseNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.FIELD_NAME_CONSTANTS_FLAG_USAGE
            java.lang.String r2 = "@FieldNameConstants"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.FieldNameConstants r0 = (lombok.experimental.FieldNameConstants) r0
            r14 = r0
            r0 = r14
            lombok.AccessLevel r0 = r0.level()
            r15 = r0
            r0 = r14
            boolean r0 = r0.asEnum()
            r16 = r0
            r0 = r10
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L4e
            r0 = r10
            java.lang.String r1 = "suffix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L4e
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L4e
            r0 = 0
            goto L4f
        L4e:
            r0 = 1
        L4f:
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L5d
            r0 = r12
            java.lang.String r1 = "@FieldNameConstants has been redesigned in lombok v1.18.4; please upgrade your project dependency on lombok. See https://projectlombok.org/features/experimental/FieldNameConstants for more information."
            r0.addError(r1)
            return
        L5d:
            r0 = r15
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L6c
            r0 = r12
            java.lang.String r1 = "AccessLevel.NONE is not compatible with @FieldNameConstants. If you don't want the inner type, simply remove FieldNameConstants."
            r0.addWarning(r1)
            return
        L6c:
            r0 = r14
            java.lang.String r0 = r0.innerTypeName()     // Catch: java.lang.IllegalArgumentException -> L7b
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L7b
            r18 = r0
            goto L9c
        L7b:
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "InnerTypeName "
            r2.<init>(r3)
            r2 = r14
            java.lang.String r2 = r2.innerTypeName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not a valid Java identifier."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L9c:
            r0 = r18
            if (r0 != 0) goto Lb0
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.IdentifierName> r1 = lombok.ConfigurationKeys.FIELD_NAME_CONSTANTS_INNER_TYPE_NAME
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.IdentifierName r0 = (lombok.core.configuration.IdentifierName) r0
            r18 = r0
        Lb0:
            r0 = r18
            if (r0 != 0) goto Lba
            lombok.core.configuration.IdentifierName r0 = lombok.eclipse.handlers.HandleFieldNameConstants.FIELDS
            r18 = r0
        Lba:
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.FIELD_NAME_CONSTANTS_UPPERCASE
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r19 = r0
            r0 = r19
            if (r0 != 0) goto Ld4
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r19 = r0
        Ld4:
            r0 = r9
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r14
            boolean r6 = r6.onlyExplicitlyIncluded()
            r7 = r19
            boolean r7 = r7.booleanValue()
            r0.generateFieldNameConstantsForType(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void createInnerTypeFieldNameConstants(lombok.eclipse.EclipseNode r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r13, lombok.AccessLevel r14, java.util.List<lombok.eclipse.EclipseNode> r15, boolean r16, lombok.core.configuration.IdentifierName r17, boolean r18) {
            r10 = this;
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            lombok.eclipse.handlers.SetGeneratedByVisitor r0 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r19 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r20 = r0
            r0 = r11
            r1 = r17
            java.lang.String r1 = r1.getName()
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findInnerClass(r0, r1)
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = r17
            char[] r0 = r0.getCharArray()
            r24 = r0
            r0 = r21
            if (r0 != 0) goto L98
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            r1 = r0
            r2 = r20
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r25 = r0
            r0 = r25
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r25
            r1 = r14
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r2 = r16
            if (r2 == 0) goto L68
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L6a
        L68:
            r2 = 24
        L6a:
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r25
            r1 = r24
            r0.name = r1
            r0 = r11
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectType(r0, r1)
            r21 = r0
            r0 = 1
            r22 = r0
            r0 = r16
            r23 = r0
            r0 = r25
            r1 = r19
            r2 = r11
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            goto L10f
        L98:
            r0 = r21
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r25 = r0
            r0 = r16
            if (r0 == 0) goto Ld0
            r0 = r25
            int r0 = r0.modifiers
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            if (r0 != 0) goto Ld0
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Existing "
            r2.<init>(r3)
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be declared as an 'enum'."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Ld0:
            r0 = r16
            if (r0 != 0) goto Lfd
            r0 = r25
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto Lfd
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Existing "
            r2.<init>(r3)
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be declared as a 'static class'."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lfd:
            r0 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.constructorExists(r0)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L10c
            r0 = 1
            goto L10d
        L10c:
            r0 = 0
        L10d:
            r22 = r0
        L10f:
            r0 = r22
            if (r0 == 0) goto L175
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            r1 = r0
            r2 = r20
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r25 = r0
            r0 = r25
            r1 = r24
            r0.selector = r1
            r0 = r25
            r1 = 2
            r0.modifiers = r1
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r26 = r0
            r0 = r26
            r1 = r13
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r26
            r1 = r13
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r26
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r25
            r1 = r26
            r0.constructorCall = r1
            r0 = r16
            if (r0 != 0) goto L16d
            r0 = r25
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
        L16d:
            r0 = r21
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L175:
            r0 = 0
            r25 = r0
            r0 = r23
            if (r0 == 0) goto L193
            org.eclipse.jdt.internal.compiler.ast.Clinit r0 = new org.eclipse.jdt.internal.compiler.ast.Clinit
            r1 = r0
            r2 = r20
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r25 = r0
            r0 = r21
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L193:
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L2bd
        L19f:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r28 = r0
            r0 = r28
            char[] r0 = r0.name
            r29 = r0
            r0 = r18
            if (r0 == 0) goto L1d2
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r29
            r1.<init>(r2)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.camelCaseToConstant(r0)
            char[] r0 = r0.toCharArray()
            r29 = r0
        L1d2:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r29
            r1.<init>(r2)
            r1 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.fieldExists(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L1e9
            goto L2bd
        L1e9:
            r0 = r13
            int r0 = r0.sourceStart
            r30 = r0
            r0 = r13
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
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r29
            r3 = r30
            r4 = r31
            r1.<init>(r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r16
            if (r0 == 0) goto L265
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r35 = r0
            r0 = r35
            r1 = r34
            r0.enumConstant = r1
            r0 = r35
            r1 = r13
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r35
            r1 = r13
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r34
            r1 = r35
            r0.initialization = r1
            r0 = r34
            r1 = 0
            r0.modifiers = r1
            r0 = r21
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r1 = r0
            int r1 = r1.enumConstantsCounter
            r2 = 1
            int r1 = r1 + r2
            r0.enumConstantsCounter = r1
            goto L2a3
        L265:
            r0 = r34
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_STRING
            r4 = 3
            long[] r4 = new long[r4]
            r5 = r4
            r6 = 0
            r7 = r32
            r5[r6] = r7
            r5 = r4
            r6 = 1
            r7 = r32
            r5[r6] = r7
            r5 = r4
            r6 = 2
            r7 = r32
            r5[r6] = r7
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r34
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r1 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r2 = r1
            r3 = r28
            char[] r3 = r3.name
            r4 = r30
            r5 = r31
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.initialization = r1
            r0 = r34
            r1 = 25
            r0.modifiers = r1
        L2a3:
            r0 = r21
            r1 = r34
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectField(r0, r1)
            r0 = r34
            r1 = r19
            r2 = r21
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope
            r0.traverse(r1, r2)
        L2bd:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L19f
            r0 = r23
            if (r0 == 0) goto L2de
            r0 = r25
            r1 = r19
            r2 = r21
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
        L2de:
            return
    }
}
