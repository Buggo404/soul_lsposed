package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleToString.SCL.lombok */
public class HandleToString extends lombok.eclipse.EclipseAnnotationHandler<lombok.ToString> {
    private static final java.util.Set<java.lang.String> BUILT_IN_TYPES = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f580xb87c1847;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 8
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "byte"
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "short"
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.String r5 = "int"
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.String r5 = "long"
            r3[r4] = r5
            r3 = r2
            r4 = 4
            java.lang.String r5 = "char"
            r3[r4] = r5
            r3 = r2
            r4 = 5
            java.lang.String r5 = "boolean"
            r3[r4] = r5
            r3 = r2
            r4 = 6
            java.lang.String r5 = "double"
            r3[r4] = r5
            r3 = r2
            r4 = 7
            java.lang.String r5 = "float"
            r3[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            lombok.eclipse.handlers.HandleToString.BUILT_IN_TYPES = r0
            return
    }

    public HandleToString() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.ToString> r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11, lombok.eclipse.EclipseNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.TO_STRING_FLAG_USAGE
            java.lang.String r2 = "@ToString"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.ToString r0 = (lombok.ToString) r0
            r13 = r0
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r10
            java.lang.String r2 = "onlyExplicitlyIncluded"
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r3 = lombok.ConfigurationKeys.TO_STRING_ONLY_EXPLICITLY_INCLUDED
            boolean r0 = r0.getBooleanAnnotationValue(r1, r2, r3)
            r14 = r0
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            r1 = r14
            r2 = r10
            r3 = r12
            java.util.List r0 = lombok.core.handlers.InclusionExclusionUtils.handleToStringMarking(r0, r1, r2, r3)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L34
            return
        L34:
            r0 = r13
            boolean r0 = r0.callSuper()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r16 = r0
            r0 = r10
            java.lang.String r1 = "callSuper"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L4c
            r0 = 0
            r16 = r0
        L4c:
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.TO_STRING_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r17 = r0
            r0 = r10
            java.lang.String r1 = "doNotUseGetters"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L69
            r0 = r17
            if (r0 != 0) goto L73
        L69:
            r0 = r13
            boolean r0 = r0.doNotUseGetters()
            goto L78
        L73:
            r0 = r17
            boolean r0 = r0.booleanValue()
        L78:
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L85
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
            goto L88
        L85:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
        L88:
            r19 = r0
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.TO_STRING_INCLUDE_FIELD_NAMES
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r20 = r0
            r0 = r10
            java.lang.String r1 = "includeFieldNames"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto La7
            r0 = r20
            if (r0 != 0) goto Lb1
        La7:
            r0 = r13
            boolean r0 = r0.includeFieldNames()
            goto Lb6
        Lb1:
            r0 = r20
            boolean r0 = r0.booleanValue()
        Lb6:
            r21 = r0
            r0 = r9
            r1 = r12
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            r2 = r12
            r3 = r15
            r4 = r21
            r5 = r16
            r6 = 1
            r7 = r19
            r0.generateToString(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void generateToStringForType(lombok.eclipse.EclipseNode r10, lombok.eclipse.EclipseNode r11) {
            r9 = this;
            java.lang.Class<lombok.ToString> r0 = lombok.ToString.class
            r1 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            java.lang.Class<lombok.ToString> r0 = lombok.ToString.class
            lombok.core.AnnotationValues r0 = lombok.core.AnnotationValues.m57of(r0)
            r12 = r0
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r12
            java.lang.String r2 = "includeFieldNames"
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r3 = lombok.ConfigurationKeys.TO_STRING_INCLUDE_FIELD_NAMES
            boolean r0 = r0.getBooleanAnnotationValue(r1, r2, r3)
            r13 = r0
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r12
            java.lang.String r2 = "onlyExplicitlyIncluded"
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r3 = lombok.ConfigurationKeys.TO_STRING_ONLY_EXPLICITLY_INCLUDED
            boolean r0 = r0.getBooleanAnnotationValue(r1, r2, r3)
            r14 = r0
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.TO_STRING_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L4a
            r0 = r15
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L50
        L4a:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
            goto L53
        L50:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
        L53:
            r16 = r0
            r0 = r10
            r1 = r14
            r2 = 0
            r3 = 0
            java.util.List r0 = lombok.core.handlers.InclusionExclusionUtils.handleToStringMarking(r0, r1, r2, r3)
            r17 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r17
            r4 = r13
            r5 = 0
            r6 = 0
            r7 = r16
            r0.generateToString(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void generateToString(lombok.eclipse.EclipseNode r8, lombok.eclipse.EclipseNode r9, java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.eclipse.EclipseNode, lombok.ToString.Include>> r10, boolean r11, java.lang.Boolean r12, boolean r13, lombok.core.handlers.HandlerUtil.FieldAccess r14) {
            r7 = this;
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto Le
            r0 = r9
            java.lang.String r1 = "@ToString is only supported on a class or enum."
            r0.addError(r1)
            return
        Le:
            int[] r0 = m76xb87c1847()
            java.lang.String r1 = "toString"
            r2 = r8
            r3 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L38;
                case 2: goto Lc7;
                case 3: goto Lca;
                default: goto Lca;
            }
        L38:
            r0 = r12
            if (r0 != 0) goto La6
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isDirectDescendantOfObject(r0)
            if (r0 == 0) goto L4d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12 = r0
            goto La6
        L4d:
            r0 = r8
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CallSuperType> r1 = lombok.ConfigurationKeys.TO_STRING_CALL_SUPER
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.CallSuperType r0 = (lombok.core.configuration.CallSuperType) r0
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L66
            lombok.core.configuration.CallSuperType r0 = lombok.core.configuration.CallSuperType.SKIP
            r15 = r0
        L66:
            int[] r0 = $SWITCH_TABLE$lombok$core$configuration$CallSuperType()
            r1 = r15
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto La0;
                case 2: goto L88;
                case 3: goto L91;
                default: goto L88;
            }
        L88:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12 = r0
            goto La6
        L91:
            r0 = r9
            java.lang.String r1 = "Generating toString implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this intentional, add '@ToString(callSuper=false)' to your type."
            r0.addWarning(r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12 = r0
            goto La6
        La0:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12 = r0
        La6:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            boolean r3 = r3.booleanValue()
            r4 = r9
            java.lang.Object r4 = r4.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r4 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r4
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = createToString(r0, r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r8
            r1 = r15
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            goto Ld6
        Lc7:
            goto Ld6
        Lca:
            r0 = r13
            if (r0 == 0) goto Ld6
            r0 = r9
            java.lang.String r1 = "Not generating toString(): A method with that name already exists"
            r0.addWarning(r1)
        Ld6:
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createToString(lombok.eclipse.EclipseNode r10, java.util.Collection<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.eclipse.EclipseNode, lombok.ToString.Include>> r11, boolean r12, boolean r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, lombok.core.handlers.HandlerUtil.FieldAccess r15) {
            r0 = r10
            java.lang.String r0 = getTypeName(r0)
            r16 = r0
            r0 = r10
            boolean r0 = r0.isEnumType()
            r17 = r0
            java.lang.String r0 = ")"
            char[] r0 = r0.toCharArray()
            r18 = r0
            java.lang.String r0 = ", "
            r19 = r0
            r0 = r19
            char[] r0 = r0.toCharArray()
            r20 = r0
            r0 = r14
            int r0 = r0.sourceStart
            r21 = r0
            r0 = r14
            int r0 = r0.sourceEnd
            r22 = r0
            r0 = r21
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r22
            long r1 = (long) r1
            long r0 = r0 | r1
            r23 = r0
            r0 = r13
            if (r0 == 0) goto L46
            java.lang.String r0 = "(super="
            r25 = r0
            goto Lca
        L46:
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L62
            r0 = r17
            if (r0 == 0) goto L5a
            java.lang.String r0 = ""
            goto L5d
        L5a:
            java.lang.String r0 = "()"
        L5d:
            r25 = r0
            goto Lca
        L62:
            r0 = r12
            if (r0 == 0) goto Lc5
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r26 = r0
            r0 = r26
            java.lang.annotation.Annotation r0 = r0.getInc()
            if (r0 != 0) goto L84
            java.lang.String r0 = ""
            goto L91
        L84:
            r0 = r26
            java.lang.annotation.Annotation r0 = r0.getInc()
            lombok.ToString$Include r0 = (lombok.ToString.Include) r0
            java.lang.String r0 = r0.name()
        L91:
            r27 = r0
            r0 = r27
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La8
            r0 = r26
            java.lang.Object r0 = r0.getNode()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r0 = r0.getName()
            r27 = r0
        La8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "("
            r1.<init>(r2)
            r1 = r27
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r25 = r0
            goto Lca
        Lc5:
            java.lang.String r0 = "("
            r25 = r0
        Lca:
            r0 = 1
            r26 = r0
            r0 = r17
            if (r0 != 0) goto L102
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r16
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            r3 = r25
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            char[] r2 = r2.toCharArray()
            r3 = r21
            r4 = r22
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            goto L1d4
        L102:
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r16
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            char[] r2 = r2.toCharArray()
            r3 = r21
            r4 = r22
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = r28
            r1 = r21
            r0.sourceStart = r1
            r0 = r28
            r1 = r22
            r0.sourceEnd = r1
            r0 = r28
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r21
            r4 = r22
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r28
            java.lang.String r1 = "name"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r28
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r25
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d4
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r25
            char[] r2 = r2.toCharArray()
            r3 = r21
            r4 = r22
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r29 = r0
            r0 = r29
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r29
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r21
            r0.sourceStart = r1
            r0 = r27
            r1 = r22
            r0.sourceEnd = r1
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
        L1d4:
            r0 = r13
            if (r0 == 0) goto L236
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = r28
            r1 = r21
            r0.sourceStart = r1
            r0 = r28
            r1 = r22
            r0.sourceEnd = r1
            r0 = r28
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.SuperReference r1 = new org.eclipse.jdt.internal.compiler.ast.SuperReference
            r2 = r1
            r3 = r21
            r4 = r22
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r28
            java.lang.String r1 = "toString"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r28
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = 0
            r26 = r0
        L236:
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L428
        L241:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r28 = r0
            r0 = r28
            java.lang.Object r0 = r0.getNode()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r30 = r0
            r0 = r30
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getFieldType(r0, r1)
            r31 = r0
            r0 = r30
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L277
            r0 = r30
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createMethodAccessor(r0, r1)
            r32 = r0
            goto L282
        L277:
            r0 = r30
            r1 = r15
            r2 = r14
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
            r32 = r0
        L282:
            java.util.Set<java.lang.String> r0 = lombok.eclipse.handlers.HandleToString.BUILT_IN_TYPES
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r31
            char[] r3 = r3.getLastToken()
            r2.<init>(r3)
            boolean r0 = r0.contains(r1)
            r33 = r0
            r0 = r31
            int r0 = r0.dimensions()
            if (r0 != 0) goto L2a0
        L2a0:
            r0 = r31
            int r0 = r0.dimensions()
            r1 = 1
            if (r0 != r1) goto L2b2
            r0 = r33
            if (r0 == 0) goto L2b2
            r0 = 1
            goto L2b3
        L2b2:
            r0 = 0
        L2b3:
            r34 = r0
            r0 = r31
            int r0 = r0.dimensions()
            if (r0 <= 0) goto L2c6
            r0 = r34
            if (r0 != 0) goto L2c6
            r0 = 1
            goto L2c7
        L2c6:
            r0 = 0
        L2c7:
            r35 = r0
            r0 = r34
            if (r0 != 0) goto L2d3
            r0 = r35
            if (r0 == 0) goto L344
        L2d3:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r37 = r0
            r0 = r37
            r1 = r21
            r0.sourceStart = r1
            r0 = r37
            r1 = r22
            r0.sourceEnd = r1
            r0 = r37
            r1 = r14
            r2 = 3
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            char[] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA
            r3[r4] = r5
            r3 = r2
            r4 = 1
            char[] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.UTIL
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.String r5 = "Arrays"
            char[] r5 = r5.toCharArray()
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r37
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r32
            r2[r3] = r4
            r0.arguments = r1
            r0 = r37
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r37
            r1 = r35
            if (r1 == 0) goto L335
            java.lang.String r1 = "deepToString"
            goto L337
        L335:
            java.lang.String r1 = "toString"
        L337:
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r37
            r36 = r0
            goto L348
        L344:
            r0 = r32
            r36 = r0
        L348:
            r0 = r36
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r26
            if (r0 == 0) goto L380
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r36
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r21
            r0.sourceStart = r1
            r0 = r27
            r1 = r22
            r0.sourceEnd = r1
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = 0
            r26 = r0
            goto L428
        L380:
            r0 = r12
            if (r0 == 0) goto L3e2
            r0 = r28
            java.lang.annotation.Annotation r0 = r0.getInc()
            if (r0 != 0) goto L392
            java.lang.String r0 = ""
            goto L39f
        L392:
            r0 = r28
            java.lang.annotation.Annotation r0 = r0.getInc()
            lombok.ToString$Include r0 = (lombok.ToString.Include) r0
            java.lang.String r0 = r0.name()
        L39f:
            r38 = r0
            r0 = r38
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b0
            r0 = r30
            java.lang.String r0 = r0.getName()
            r38 = r0
        L3b0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r19
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r38
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r39 = r0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r39
            r3 = r21
            r4 = r22
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r37 = r0
            goto L3f2
        L3e2:
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r37 = r0
        L3f2:
            r0 = r37
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r37
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r36
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
        L428:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L241
            r0 = r26
            if (r0 != 0) goto L466
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r18
            r3 = r21
            r4 = r22
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r28 = r0
            r0 = r28
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r27
            r3 = r28
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
        L466:
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r27
            r3 = r21
            r4 = r22
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r10
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r29 = r0
            r0 = r29
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r29
            lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r29
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_STRING
            r4 = 3
            long[] r4 = new long[r4]
            r5 = r4
            r6 = 0
            r7 = r23
            r5[r6] = r7
            r5 = r4
            r6 = 1
            r7 = r23
            r5[r6] = r7
            r5 = r4
            r6 = 2
            r7 = r23
            r5[r6] = r7
            r2.<init>(r3, r4)
            r0.returnType = r1
            r0 = r29
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            r30 = r0
            r0 = r10
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L505
            r0 = r29
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r30
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r14
            java.lang.String r5 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
            goto L513
        L505:
            r0 = r29
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r30
            r2[r3] = r4
            r0.annotations = r1
        L513:
            r0 = r29
            r1 = 0
            r0.arguments = r1
            r0 = r29
            java.lang.String r1 = "toString"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r29
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r29
            r1 = 0
            r0.typeParameters = r1
            r0 = r29
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r29
            r1 = r29
            r2 = r29
            r3 = r14
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r29
            r1 = r29
            r2 = r29
            r3 = r14
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = r29
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r28
            r2[r3] = r4
            r0.statements = r1
            r0 = r10
            r1 = r29
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r29
            return r0
    }

    public static java.lang.String getTypeName(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            java.lang.String r0 = getSingleTypeName(r0)
            r5 = r0
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            goto L40
        L10:
            r0 = r6
            java.lang.String r0 = getSingleTypeName(r0)
            r7 = r0
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f
            goto L4a
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
        L40:
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L10
        L4a:
            r0 = r5
            return r0
    }

    public static java.lang.String getSingleTypeName(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r5 = r0
            r0 = r5
            char[] r0 = r0.name
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
            goto L1f
        L17:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            r1.<init>(r2)
        L1f:
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.NameReference generateQualifiedNameRef(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, char[]... r8) {
            r0 = r7
            int r0 = r0.sourceStart
            r9 = r0
            r0 = r7
            int r0 = r0.sourceEnd
            r10 = r0
            r0 = r9
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r10
            long r1 = (long) r1
            long r0 = r0 | r1
            r11 = r0
            r0 = r8
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L2d
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r8
            r3 = r8
            int r3 = r3.length
            long[] r3 = new long[r3]
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            goto L3b
        L2d:
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r8
            r3 = 0
            r2 = r2[r3]
            r3 = r11
            r1.<init>(r2, r3)
            r13 = r0
        L3b:
            r0 = r13
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r13
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType() {
            int[] r0 = lombok.eclipse.handlers.HandleToString.$SWITCH_TABLE$lombok$core$configuration$CallSuperType
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.configuration.CallSuperType[] r0 = lombok.core.configuration.CallSuperType.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.configuration.CallSuperType r1 = lombok.core.configuration.CallSuperType.CALL     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.core.configuration.CallSuperType r1 = lombok.core.configuration.CallSuperType.SKIP     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.core.configuration.CallSuperType r1 = lombok.core.configuration.CallSuperType.WARN     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.eclipse.handlers.HandleToString.$SWITCH_TABLE$lombok$core$configuration$CallSuperType = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m76xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleToString.f580xb87c1847
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.eclipse.handlers.HandleToString.f580xb87c1847 = r1
            return r0
    }
}
