package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleEqualsAndHashCode.SCL.lombok */
public class HandleEqualsAndHashCode extends lombok.eclipse.EclipseAnnotationHandler<lombok.EqualsAndHashCode> {
    private static final java.lang.String HASH_CODE_CACHE_NAME = "$hashCodeCache";
    private final char[] HASH_CODE_CACHE_NAME_ARR;
    private final char[] PRIME;
    private final char[] RESULT;
    public static final java.util.Set<java.lang.String> BUILT_IN_TYPES = null;
    private static final char[] HASH_CODE = null;
    private static final char[] FLOAT_TO_INT_BITS = null;
    private static final char[] DOUBLE_TO_LONG_BITS = null;
    private static final char[][] JAVAX_ANNOTATION_NULLABLE = null;
    private static final char[][] ORG_ECLIPSE_JDT_ANNOTATION_NULLABLE = null;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f574xb87c1847;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType;

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
            lombok.eclipse.handlers.HandleEqualsAndHashCode.BUILT_IN_TYPES = r0
            java.lang.String r0 = "hashCode"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleEqualsAndHashCode.HASH_CODE = r0
            java.lang.String r0 = "floatToIntBits"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleEqualsAndHashCode.FLOAT_TO_INT_BITS = r0
            java.lang.String r0 = "doubleToLongBits"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleEqualsAndHashCode.DOUBLE_TO_LONG_BITS = r0
            java.lang.String r0 = "javax.annotation.Nullable"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleEqualsAndHashCode.JAVAX_ANNOTATION_NULLABLE = r0
            java.lang.String r0 = "org.eclipse.jdt.annotation.Nullable"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleEqualsAndHashCode.ORG_ECLIPSE_JDT_ANNOTATION_NULLABLE = r0
            return
    }

    public HandleEqualsAndHashCode() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            java.lang.String r1 = "$hashCodeCache"
            char[] r1 = r1.toCharArray()
            r0.HASH_CODE_CACHE_NAME_ARR = r1
            r0 = r3
            java.lang.String r1 = "PRIME"
            char[] r1 = r1.toCharArray()
            r0.PRIME = r1
            r0 = r3
            java.lang.String r1 = "result"
            char[] r1 = r1.toCharArray()
            r0.RESULT = r1
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.EqualsAndHashCode> r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12, lombok.eclipse.EclipseNode r13) {
            r10 = this;
            r0 = r13
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_FLAG_USAGE
            java.lang.String r2 = "@EqualsAndHashCode"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.EqualsAndHashCode r0 = (lombok.EqualsAndHashCode) r0
            r14 = r0
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            r1 = r11
            r2 = r13
            java.util.List r0 = lombok.core.handlers.InclusionExclusionUtils.handleEqualsAndHashCodeMarking(r0, r1, r2)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L23
            return
        L23:
            r0 = r12
            java.lang.String r1 = "onParam"
            java.lang.String r2 = "@EqualsAndHashCode(onParam"
            r3 = r13
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r16 = r0
            r0 = r14
            boolean r0 = r0.callSuper()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r17 = r0
            r0 = r11
            java.lang.String r1 = "callSuper"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L46
            r0 = 0
            r17 = r0
        L46:
            r0 = r13
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r18 = r0
            r0 = r11
            java.lang.String r1 = "doNotUseGetters"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L63
            r0 = r18
            if (r0 != 0) goto L6d
        L63:
            r0 = r14
            boolean r0 = r0.doNotUseGetters()
            goto L72
        L6d:
            r0 = r18
            boolean r0 = r0.booleanValue()
        L72:
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L7f
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
            goto L82
        L7f:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
        L82:
            r20 = r0
            r0 = r14
            lombok.EqualsAndHashCode$CacheStrategy r0 = r0.cacheStrategy()
            lombok.EqualsAndHashCode$CacheStrategy r1 = lombok.EqualsAndHashCode.CacheStrategy.LAZY
            if (r0 != r1) goto L95
            r0 = 1
            goto L96
        L95:
            r0 = 0
        L96:
            r21 = r0
            r0 = r10
            r1 = r13
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = 1
            r6 = r21
            r7 = r20
            r8 = r16
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateEqualsAndHashCodeForType(lombok.eclipse.EclipseNode r12, lombok.eclipse.EclipseNode r13) {
            r11 = this;
            java.lang.Class<lombok.EqualsAndHashCode> r0 = lombok.EqualsAndHashCode.class
            r1 = r12
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            r0 = r12
            r1 = 0
            r2 = 0
            java.util.List r0 = lombok.core.handlers.InclusionExclusionUtils.handleEqualsAndHashCodeMarking(r0, r1, r2)
            r14 = r0
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L2d
            r0 = r15
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L33
        L2d:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
            goto L36
        L33:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
        L36:
            r16 = r0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r16
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = r8
            r9.<init>()
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateMethods(lombok.eclipse.EclipseNode r10, lombok.eclipse.EclipseNode r11, java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.eclipse.EclipseNode, lombok.EqualsAndHashCode.Include>> r12, java.lang.Boolean r13, boolean r14, boolean r15, lombok.core.handlers.HandlerUtil.FieldAccess r16, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r17) {
            r9 = this;
            r0 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto Lf
            r0 = r11
            java.lang.String r1 = "@EqualsAndHashCode is only supported on a class."
            r0.addError(r1)
            return
        Lf:
            r0 = r10
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r18 = r0
            r0 = r13
            if (r0 != 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            r19 = r0
            r0 = r13
            if (r0 != 0) goto L51
            java.lang.Class<lombok.EqualsAndHashCode> r0 = lombok.EqualsAndHashCode.class
            java.lang.String r1 = "callSuper"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r0.getDefaultValue()     // Catch: java.lang.Exception -> L45
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L45
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L45
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L45
            r13 = r0
            goto L51
        L45:
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            java.lang.String r2 = "Lombok bug - this cannot happen - can't find callSuper field in EqualsAndHashCode annotation."
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isDirectDescendantOfObject(r0)
            r20 = r0
            r0 = r18
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L66
            r0 = 1
            goto L67
        L66:
            r0 = 0
        L67:
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L77
            r0 = r20
            if (r0 == 0) goto L77
            r0 = 0
            goto L78
        L77:
            r0 = 1
        L78:
            r22 = r0
            java.lang.String r0 = "equals"
            r1 = r10
            r2 = 1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            r23 = r0
            java.lang.String r0 = "hashCode"
            r1 = r10
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            r24 = r0
            java.lang.String r0 = "canEqual"
            r1 = r10
            r2 = 1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            r25 = r0
            int[] r0 = m71xb87c1847()
            r1 = 2
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r1 = new lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r24
            r2[r3] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.Object r1 = java.util.Collections.max(r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = (lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L11a;
                case 2: goto Ld0;
                case 3: goto Ld1;
                default: goto L11a;
            }
        Ld0:
            return
        Ld1:
            r0 = r14
            if (r0 == 0) goto Le4
            java.lang.String r0 = "Not generating equals and hashCode: A method with one of those names already exists. (Either both or none of these methods will be generated)."
            r26 = r0
            r0 = r11
            r1 = r26
            r0.addWarning(r1)
            goto L119
        Le4:
            r0 = r23
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto Lf4
            r0 = r24
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L119
        Lf4:
            java.lang.String r0 = "Not generating %s: One of equals or hashCode exists. You should either write both of these or none of these (in the latter case, lombok generates them)."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r5 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r4 != r5) goto L10b
            java.lang.String r4 = "equals"
            goto L10d
        L10b:
            java.lang.String r4 = "hashCode"
        L10d:
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r26 = r0
            r0 = r11
            r1 = r26
            r0.addWarning(r1)
        L119:
            return
        L11a:
            r0 = r20
            if (r0 == 0) goto L12f
            r0 = r13
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12f
            r0 = r11
            java.lang.String r1 = "Generating equals/hashCode with a supercall to java.lang.Object is pointless."
            r0.addError(r1)
            return
        L12f:
            r0 = r19
            if (r0 == 0) goto L193
            r0 = r20
            if (r0 != 0) goto L193
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CallSuperType> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_CALL_SUPER
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.CallSuperType r0 = (lombok.core.configuration.CallSuperType) r0
            r26 = r0
            r0 = r26
            if (r0 != 0) goto L152
            lombok.core.configuration.CallSuperType r0 = lombok.core.configuration.CallSuperType.WARN
            r26 = r0
        L152:
            int[] r0 = $SWITCH_TABLE$lombok$core$configuration$CallSuperType()
            r1 = r26
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L18d;
                case 2: goto L184;
                case 3: goto L174;
                default: goto L174;
            }
        L174:
            r0 = r11
            java.lang.String r1 = "Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type."
            r0.addWarning(r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13 = r0
            goto L193
        L184:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13 = r0
            goto L193
        L18d:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13 = r0
        L193:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            boolean r3 = r3.booleanValue()
            r4 = r11
            java.lang.Object r4 = r4.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r4 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r4
            r5 = r16
            r6 = r22
            r7 = r17
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createEquals(r1, r2, r3, r4, r5, r6, r7)
            r26 = r0
            r0 = r26
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r11
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r3
            r2.<init>(r3)
            r2 = r10
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r10
            r1 = r26
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            r0 = r22
            if (r0 == 0) goto L212
            r0 = r25
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L212
            r0 = r9
            r1 = r10
            r2 = r11
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r3 = r17
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createCanEqual(r1, r2, r3)
            r27 = r0
            r0 = r27
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r11
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r3
            r2.<init>(r3)
            r2 = r10
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r10
            r1 = r27
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L212:
            r0 = r15
            if (r0 == 0) goto L24c
            java.lang.String r0 = "$hashCodeCache"
            r1 = r10
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.fieldExists(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L240
            java.lang.String r0 = "Not caching the result of hashCode: A field named %s already exists."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "$hashCodeCache"
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r27 = r0
            r0 = r11
            r1 = r27
            r0.addWarning(r1)
            r0 = 0
            r15 = r0
            goto L24c
        L240:
            r0 = r9
            r1 = r10
            r2 = r11
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r0.createHashCodeCacheField(r1, r2)
        L24c:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            boolean r3 = r3.booleanValue()
            r4 = r15
            r5 = r11
            java.lang.Object r5 = r5.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r5 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r5
            r6 = r16
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createHashCode(r1, r2, r3, r4, r5, r6)
            r27 = r0
            r0 = r27
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r11
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r3
            r2.<init>(r3)
            r2 = r10
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r10
            r1 = r27
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void createHashCodeCacheField(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8) {
            r6 = this;
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r6
            char[] r2 = r2.HASH_CODE_CACHE_NAME_ARR
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r1 = 130(0x82, float:1.82E-43)
            r0.modifiers = r1
            r0 = r9
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r9
            r1 = 10
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r9
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r7
            r1 = r9
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r0 = r9
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            return
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createHashCode(lombok.eclipse.EclipseNode r9, java.util.Collection<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.eclipse.EclipseNode, lombok.EqualsAndHashCode.Include>> r10, boolean r11, boolean r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r13, lombok.core.handlers.HandlerUtil.FieldAccess r14) {
            r8 = this;
            r0 = r13
            int r0 = r0.sourceStart
            r15 = r0
            r0 = r13
            int r0 = r0.sourceEnd
            r16 = r0
            r0 = r15
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r16
            long r1 = (long) r1
            long r0 = r0 | r1
            r17 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r9
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r19 = r0
            r0 = r19
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r19
            r1 = 10
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.returnType = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            r20 = r0
            r0 = r9
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            r21 = r0
            r0 = r12
            if (r0 == 0) goto L95
            r0 = r21
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L95
            r0 = r19
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r20
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r13
            java.lang.String r5 = "org.checkerframework.dataflow.qual.Pure"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
            goto Lc7
        L95:
            r0 = r21
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto Lb9
            r0 = r19
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r20
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r13
            java.lang.String r5 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
            goto Lc7
        Lb9:
            r0 = r19
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r20
            r2[r3] = r4
            r0.annotations = r1
        Lc7:
            r0 = r19
            java.lang.String r1 = "hashCode"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r19
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r19
            r1 = 0
            r0.typeParameters = r1
            r0 = r19
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r19
            r1 = r19
            r2 = r19
            r3 = r13
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r19
            r1 = r19
            r2 = r19
            r3 = r13
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = r19
            r1 = 0
            r0.arguments = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = 1
            r23 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L15c
        L133:
            r0 = r25
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r24 = r0
            r0 = r24
            java.lang.Object r0 = r0.getNode()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getFieldType(r0, r1)
            r26 = r0
            r0 = r26
            char[] r0 = r0.getLastToken()
            if (r0 == 0) goto L15c
            r0 = 0
            r23 = r0
            goto L166
        L15c:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L133
        L166:
            r0 = r12
            if (r0 == 0) goto L1f7
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r8
            char[] r2 = r2.HASH_CODE_CACHE_NAME_ARR
            r3 = r17
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r15
            r4 = r16
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r24
            java.lang.String r3 = "0"
            char[] r3 = r3.toCharArray()
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r3 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r3, r4)
            r4 = 29
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r24
            r3 = r15
            r4 = r16
            r1.<init>(r2, r3, r4)
            r26 = r0
            r0 = r26
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r25
            r3 = r26
            r4 = r15
            r5 = r16
            r1.<init>(r2, r3, r4, r5)
            r27 = r0
            r0 = r27
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r27
            boolean r0 = r0.add(r1)
        L1f7:
            r0 = r23
            if (r0 != 0) goto L268
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r8
            char[] r2 = r2.PRIME
            r3 = r15
            r4 = r16
            r1.<init>(r2, r3, r4)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r24
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r24
            r1 = 10
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            r0.sourceStart = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r16
            r0.sourceEnd = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r24
            int r1 = lombok.core.handlers.HandlerUtil.primeForHashcode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            char[] r1 = r1.toCharArray()
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r1, r2)
            r0.initialization = r1
            r0 = r22
            r1 = r24
            boolean r0 = r0.add(r1)
        L268:
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r8
            char[] r2 = r2.RESULT
            r3 = r15
            r4 = r16
            r1.<init>(r2, r3, r4)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r11
            if (r0 == 0) goto L2d0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r26
            r1 = r15
            r0.sourceStart = r1
            r0 = r26
            r1 = r16
            r0.sourceEnd = r1
            r0 = r26
            org.eclipse.jdt.internal.compiler.ast.SuperReference r1 = new org.eclipse.jdt.internal.compiler.ast.SuperReference
            r2 = r1
            r3 = r15
            r4 = r16
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r26
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r26
            java.lang.String r1 = "hashCode"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r26
            r25 = r0
            goto L2dd
        L2d0:
            java.lang.String r0 = "1"
            char[] r0 = r0.toCharArray()
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
            r25 = r0
        L2dd:
            r0 = r24
            r1 = r25
            r0.initialization = r1
            r0 = r24
            r1 = 10
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            r0.sourceStart = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r16
            r0.sourceEnd = r1
            r0 = r23
            if (r0 == 0) goto L319
            r0 = r12
            if (r0 != 0) goto L319
            r0 = r24
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
        L319:
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r24
            boolean r0 = r0.add(r1)
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L736
        L339:
            r0 = r25
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r24 = r0
            r0 = r24
            java.lang.Object r0 = r0.getNode()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L35e
            r0 = 1
            goto L35f
        L35e:
            r0 = 0
        L35f:
            r27 = r0
            r0 = r26
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getFieldType(r0, r1)
            r28 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r27
            if (r2 == 0) goto L379
            java.lang.String r2 = "$$"
            goto L37c
        L379:
            java.lang.String r2 = "$"
        L37c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r26
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r29 = r0
            r0 = r28
            char[] r0 = r0.getLastToken()
            r30 = r0
            r0 = r27
            if (r0 == 0) goto L3a8
            r0 = r26
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createMethodAccessor(r0, r1)
            goto L3b1
        L3a8:
            r0 = r26
            r1 = r14
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
        L3b1:
            r31 = r0
            r0 = r28
            int r0 = r0.dimensions()
            if (r0 != 0) goto L694
            r0 = r30
            if (r0 == 0) goto L694
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.BOOLEAN
            r1 = r30
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L415
            int r0 = lombok.core.handlers.HandlerUtil.primeForTrue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            char[] r0 = r0.toCharArray()
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
            r32 = r0
            int r0 = lombok.core.handlers.HandlerUtil.primeForFalse()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            char[] r0 = r0.toCharArray()
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
            r33 = r0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r31
            r3 = r32
            r4 = r33
            r1.<init>(r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r34
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
            goto L736
        L415:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.LONG
            r1 = r30
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L47d
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r29
            r4 = 7
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r4, r5)
            r5 = r31
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.createLocalDeclaration(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r29
            r3 = r17
            r1.<init>(r2, r3)
            r32 = r0
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r29
            r3 = r17
            r1.<init>(r2, r3)
            r33 = r0
            r0 = r33
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r8
            r4 = r32
            r5 = r33
            r6 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = r3.longToIntForHashCode(r4, r5, r6)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
            goto L736
        L47d:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.FLOAT
            r1 = r30
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L4dd
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r32 = r0
            r0 = r32
            r1 = r15
            r0.sourceStart = r1
            r0 = r32
            r1 = r16
            r0.sourceEnd = r1
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r32
            r1 = r13
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_FLOAT
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r32
            char[] r1 = lombok.eclipse.handlers.HandleEqualsAndHashCode.FLOAT_TO_INT_BITS
            r0.selector = r1
            r0 = r32
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r31
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r32
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
            goto L736
        L4dd:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.DOUBLE
            r1 = r30
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L587
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r32 = r0
            r0 = r32
            r1 = r15
            r0.sourceStart = r1
            r0 = r32
            r1 = r16
            r0.sourceEnd = r1
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r32
            r1 = r13
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_DOUBLE
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r32
            char[] r1 = lombok.eclipse.handlers.HandleEqualsAndHashCode.DOUBLE_TO_LONG_BITS
            r0.selector = r1
            r0 = r32
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r31
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r29
            r4 = 7
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r4, r5)
            r5 = r32
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.createLocalDeclaration(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r29
            r3 = r17
            r1.<init>(r2, r3)
            r33 = r0
            r0 = r33
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r29
            r3 = r17
            r1.<init>(r2, r3)
            r34 = r0
            r0 = r34
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r8
            r4 = r33
            r5 = r34
            r6 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = r3.longToIntForHashCode(r4, r5, r6)
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
            goto L736
        L587:
            java.util.Set<java.lang.String> r0 = lombok.eclipse.handlers.HandleEqualsAndHashCode.BUILT_IN_TYPES
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r30
            r2.<init>(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5ae
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r31
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
            goto L736
        L5ae:
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r29
            r4 = r13
            char[][] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r4, r5)
            r5 = r31
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.createLocalDeclaration(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r29
            r3 = r17
            r1.<init>(r2, r3)
            r32 = r0
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r29
            r3 = r17
            r1.<init>(r2, r3)
            r33 = r0
            r0 = r33
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r34 = r0
            r0 = r34
            r1 = r15
            r0.sourceStart = r1
            r0 = r34
            r1 = r16
            r0.sourceEnd = r1
            r0 = r34
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r34
            r1 = r32
            r0.receiver = r1
            r0 = r34
            char[] r1 = lombok.eclipse.handlers.HandleEqualsAndHashCode.HASH_CODE
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r15
            r3 = r16
            r1.<init>(r2, r3)
            r35 = r0
            r0 = r35
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r33
            r3 = r35
            r4 = 18
            r1.<init>(r2, r3, r4)
            r36 = r0
            r0 = r36
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            int r0 = lombok.core.handlers.HandlerUtil.primeForNull()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            char[] r0 = r0.toCharArray()
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
            r37 = r0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r36
            r3 = r37
            r4 = r34
            r1.<init>(r2, r3, r4)
            r38 = r0
            r0 = r38
            r1 = r15
            r0.sourceStart = r1
            r0 = r38
            r1 = r16
            r0.sourceEnd = r1
            r0 = r38
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r38
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
            goto L736
        L694:
            r0 = r28
            int r0 = r0.dimensions()
            if (r0 <= 0) goto L736
            r0 = r30
            if (r0 == 0) goto L736
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r32 = r0
            r0 = r32
            r1 = r15
            r0.sourceStart = r1
            r0 = r32
            r1 = r16
            r0.sourceEnd = r1
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r32
            r1 = r13
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
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r28
            int r0 = r0.dimensions()
            r1 = 1
            if (r0 > r1) goto L700
            java.util.Set<java.lang.String> r0 = lombok.eclipse.handlers.HandleEqualsAndHashCode.BUILT_IN_TYPES
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r30
            r2.<init>(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L70e
        L700:
            r0 = r32
            java.lang.String r1 = "deepHashCode"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            goto L718
        L70e:
            r0 = r32
            java.lang.String r1 = "hashCode"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
        L718:
            r0 = r32
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r31
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r1 = r8
            r2 = r13
            r3 = r32
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.createResultCalculation(r2, r3)
            boolean r0 = r0.add(r1)
        L736:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L339
            r0 = r12
            if (r0 == 0) goto L885
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r8
            char[] r2 = r2.RESULT
            r3 = r17
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r24
            java.lang.String r3 = "0"
            char[] r3 = r3.toCharArray()
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r3 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r3, r4)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r8
            char[] r2 = r2.RESULT
            r3 = r17
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            java.lang.String r2 = "MIN_VALUE"
            char[] r2 = r2.toCharArray()
            r3 = r17
            r1.<init>(r2, r3)
            r26 = r0
            r0 = r26
            r1 = r13
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_INTEGER
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r26
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r24
            r3 = r26
            r4 = r16
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r15
            r0.sourceStart = r1
            r0 = r27
            r1 = r27
            r2 = r16
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r27
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r25
            r3 = r27
            r4 = r15
            r5 = r16
            r1.<init>(r2, r3, r4, r5)
            r28 = r0
            r0 = r28
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r28
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r8
            char[] r2 = r2.HASH_CODE_CACHE_NAME_ARR
            r3 = r17
            r1.<init>(r2, r3)
            r29 = r0
            r0 = r29
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r15
            r4 = r16
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r29
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r29
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r8
            char[] r2 = r2.RESULT
            r3 = r17
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r29
            r3 = r24
            r4 = r16
            r1.<init>(r2, r3, r4)
            r30 = r0
            r0 = r30
            r1 = r15
            r0.sourceStart = r1
            r0 = r30
            r1 = r30
            r2 = r16
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r30
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r30
            boolean r0 = r0.add(r1)
        L885:
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r8
            char[] r2 = r2.RESULT
            r3 = r17
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r24
            r3 = r15
            r4 = r16
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r25
            boolean r0 = r0.add(r1)
            r0 = r19
            r1 = r22
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r19
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.LocalDeclaration createLocalDeclaration(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, char[] r8, org.eclipse.jdt.internal.compiler.ast.TypeReference r9, org.eclipse.jdt.internal.compiler.ast.Expression r10) {
            r6 = this;
            r0 = r7
            int r0 = r0.sourceStart
            r11 = r0
            r0 = r7
            int r0 = r0.sourceEnd
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r8
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r13
            r1 = r10
            r0.initialization = r1
            r0 = r13
            r1 = r9
            r0.type = r1
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r11
            r0.sourceStart = r1
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r12
            r0.sourceEnd = r1
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r13
            r1 = 16
            r0.modifiers = r1
            r0 = r13
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.Expression createResultCalculation(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, org.eclipse.jdt.internal.compiler.ast.Expression r8) {
            r6 = this;
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
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r6
            char[] r2 = r2.RESULT
            r3 = r11
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r6
            char[] r2 = r2.PRIME
            r3 = r11
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = 15
            r1.<init>(r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = r9
            r0.sourceStart = r1
            r0 = r15
            r1 = r10
            r0.sourceEnd = r1
            r0 = r15
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r15
            r3 = r8
            r4 = 14
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r16
            r1 = r9
            r0.sourceStart = r1
            r0 = r16
            r1 = r10
            r0.sourceEnd = r1
            r0 = r16
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r6
            char[] r2 = r2.RESULT
            r3 = r11
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r13
            r3 = r16
            r4 = r10
            r1.<init>(r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = r9
            r0.sourceStart = r1
            r0 = r17
            r1 = r17
            r2 = r10
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r17
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r17
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.TypeReference createTypeReference(lombok.eclipse.EclipseNode r11, long r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, boolean r15) {
            r10 = this;
            r0 = r14
            int r0 = r0.sourceStart
            r16 = r0
            r0 = r14
            int r0 = r0.sourceEnd
            r17 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r15
            if (r0 == 0) goto L26
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            goto L27
        L26:
            r0 = 0
        L27:
            r19 = r0
            r0 = r18
            r1 = r11
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.add(r1)
            r0 = r15
            if (r0 == 0) goto L53
            r0 = r19
            r1 = r10
            r2 = r11
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            int r1 = r1.arraySizeOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L53:
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L67
            r0 = 1
            goto L68
        L67:
            r0 = 0
        L68:
            r20 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r21 = r0
            goto L103
        L76:
            r0 = r21
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r22 = r0
            r0 = r22
            char[] r0 = r0.name
            if (r0 == 0) goto L113
            r0 = r22
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 != 0) goto L94
            goto L113
        L94:
            r0 = r18
            r1 = r21
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.add(r1)
            r0 = r20
            if (r0 != 0) goto Lc0
            r0 = r21
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto Lc0
            r0 = r22
            int r0 = r0.modifiers
            r1 = 512(0x200, float:7.175E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lc0
            r0 = 1
            r20 = r0
        Lc0:
            r0 = r15
            if (r0 == 0) goto Le2
            r0 = r19
            r1 = r20
            if (r1 == 0) goto Ld0
            r1 = 0
            goto Ld9
        Ld0:
            r1 = r10
            r2 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            int r1 = r1.arraySizeOf(r2)
        Ld9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        Le2:
            r0 = r20
            if (r0 != 0) goto Lf9
            r0 = r22
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lf6
            r0 = 1
            goto Lf7
        Lf6:
            r0 = 0
        Lf7:
            r20 = r0
        Lf9:
            r0 = r21
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r21 = r0
        L103:
            r0 = r21
            if (r0 == 0) goto L113
            r0 = r21
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L76
        L113:
            r0 = r18
            java.util.Collections.reverse(r0)
            r0 = r15
            if (r0 == 0) goto L122
            r0 = r19
            java.util.Collections.reverse(r0)
        L122:
            r0 = r18
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L18a
            r0 = r15
            if (r0 == 0) goto L143
            r0 = r19
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L15a
        L143:
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r18
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            r3 = r12
            r1.<init>(r2, r3)
            return r0
        L15a:
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            r1 = r0
            r2 = r18
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            r3 = r10
            r4 = r16
            r5 = r17
            r6 = r14
            r7 = r19
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r3 = r3.wildcardify(r4, r5, r6, r7)
            r4 = 0
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            return r0
        L18a:
            r0 = r15
            if (r0 == 0) goto L1bf
            r0 = 0
            r15 = r0
            r0 = r19
            java.util.Iterator r0 = r0.iterator()
            r23 = r0
            goto L1b5
        L19e:
            r0 = r23
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r22 = r0
            r0 = r22
            if (r0 <= 0) goto L1b5
            r0 = 1
            r15 = r0
        L1b5:
            r0 = r23
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L19e
        L1bf:
            r0 = r18
            int r0 = r0.size()
            long[] r0 = new long[r0]
            r22 = r0
            r0 = r18
            int r0 = r0.size()
            char[] r0 = new char[r0]
            r23 = r0
            r0 = 0
            r24 = r0
            goto L1f9
        L1dc:
            r0 = r22
            r1 = r24
            r2 = r12
            r0[r1] = r2
            r0 = r23
            r1 = r24
            r2 = r18
            r3 = r24
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r24 = r24 + 1
        L1f9:
            r0 = r24
            r1 = r18
            int r1 = r1.size()
            if (r0 < r1) goto L1dc
            r0 = r15
            if (r0 != 0) goto L216
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r23
            r3 = r22
            r1.<init>(r2, r3)
            return r0
        L216:
            r0 = r23
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r24 = r0
            r0 = 0
            r25 = r0
            goto L245
        L224:
            r0 = r24
            r1 = r25
            r2 = r10
            r3 = r16
            r4 = r17
            r5 = r14
            r6 = r19
            r7 = r25
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = r2.wildcardify(r3, r4, r5, r6)
            r0[r1] = r2
            int r25 = r25 + 1
        L245:
            r0 = r25
            r1 = r23
            int r1 = r1.length
            if (r0 < r1) goto L224
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r23
            r3 = r24
            r4 = 0
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.TypeReference[] wildcardify(int r7, int r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9, int r10) {
            r6 = this;
            r0 = r10
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r11 = r0
            r0 = 0
            r12 = r0
            goto L40
        L14:
            r0 = r11
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.Wildcard r2 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r3 = r2
            r4 = 0
            r3.<init>(r4)
            r0[r1] = r2
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r7
            r0.sourceStart = r1
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r8
            r0.sourceEnd = r1
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            int r12 = r12 + 1
        L40:
            r0 = r12
            r1 = r10
            if (r0 < r1) goto L14
            r0 = r11
            return r0
    }

    private int arraySizeOf(java.lang.Object[] r3) {
            r2 = this;
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = r3
            int r0 = r0.length
        La:
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createEquals(lombok.eclipse.EclipseNode r13, java.util.Collection<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.eclipse.EclipseNode, lombok.EqualsAndHashCode.Include>> r14, boolean r15, org.eclipse.jdt.internal.compiler.ast.ASTNode r16, lombok.core.handlers.HandlerUtil.FieldAccess r17, boolean r18, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r19) {
            r12 = this;
            r0 = r16
            int r0 = r0.sourceStart
            r20 = r0
            r0 = r16
            int r0 = r0.sourceEnd
            r21 = r0
            r0 = r20
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r21
            long r1 = (long) r1
            long r0 = r0 | r1
            r22 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = r13
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "javax.annotation.ParametersAreNullableByDefault"
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "javax.annotation.ParametersAreNonnullByDefault"
            r2[r3] = r4
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.scanForNearestAnnotation(r0, r1)
            r26 = r0
            java.lang.String r0 = "javax.annotation.ParametersAreNonnullByDefault"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6b
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r4 = r3
            r5 = r16
            char[][] r6 = lombok.eclipse.handlers.HandleEqualsAndHashCode.JAVAX_ANNOTATION_NULLABLE
            org.eclipse.jdt.internal.compiler.ast.TypeReference r5 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r5, r6)
            r6 = 0
            r4.<init>(r5, r6)
            r1[r2] = r3
            r25 = r0
            r0 = r24
            lombok.core.configuration.NullAnnotationLibrary r1 = lombok.core.configuration.NullAnnotationLibrary.JAVAX
            boolean r0 = r0.add(r1)
        L6b:
            r0 = 0
            r27 = r0
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "org.eclipse.jdt.annotation.NonNullByDefault"
            r2[r3] = r4
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.scanForNearestAnnotation(r0, r1)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto La7
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r4 = r3
            r5 = r16
            char[][] r6 = lombok.eclipse.handlers.HandleEqualsAndHashCode.ORG_ECLIPSE_JDT_ANNOTATION_NULLABLE
            org.eclipse.jdt.internal.compiler.ast.TypeReference r5 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r5, r6)
            r6 = 0
            r4.<init>(r5, r6)
            r1[r2] = r3
            r27 = r0
            r0 = r24
            lombok.core.configuration.NullAnnotationLibrary r1 = lombok.core.configuration.NullAnnotationLibrary.ECLIPSE
            boolean r0 = r0.add(r1)
        La7:
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r13
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r28 = r0
            r0 = r28
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r28
            lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r28
            r1 = 5
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.returnType = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r20
            r0.sourceStart = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r21
            r0.sourceEnd = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            r29 = r0
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L12c
            r0 = r28
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r29
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r16
            java.lang.String r5 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
            goto L13a
        L12c:
            r0 = r28
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r29
            r2[r3] = r4
            r0.annotations = r1
        L13a:
            r0 = r28
            java.lang.String r1 = "equals"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r28
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r28
            r1 = 0
            r0.typeParameters = r1
            r0 = r28
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r28
            r1 = r28
            r2 = r28
            r3 = r16
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r28
            r1 = r28
            r2 = r28
            r3 = r16
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r3 = 3
            long[] r3 = new long[r3]
            r4 = r3
            r5 = 0
            r6 = r22
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r22
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r22
            r4[r5] = r6
            r1.<init>(r2, r3)
            r30 = r0
            r0 = r27
            if (r0 == 0) goto L1d5
            r0 = r30
            r1 = 3
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 2
            r4 = r27
            r2[r3] = r4
            r0.annotations = r1
            r0 = r30
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r28
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
        L1d5:
            r0 = r30
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r28
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument r4 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r5 = r4
            r6 = 1
            char[] r6 = new char[r6]
            r7 = r6
            r8 = 0
            r9 = 111(0x6f, float:1.56E-43)
            r7[r8] = r9
            r7 = 0
            r8 = r30
            r9 = 16
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r20
            r0.sourceStart = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r21
            r0.sourceEnd = r1
            r0 = r19
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L224
            r0 = r25
            if (r0 == 0) goto L24d
        L224:
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r16
            r2 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r19
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r25
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
        L24d:
            r0 = r13
            r1 = r28
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            r2 = 0
            r1 = r1[r2]
            r2 = r28
            r3 = r24
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNullableAnnotation(r0, r1, r2, r3)
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r31 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = 1
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 111(0x6f, float:1.56E-43)
            r3[r4] = r5
            r3 = r22
            r1.<init>(r2, r3)
            r32 = r0
            r0 = r32
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r33 = r0
            r0 = r33
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r32
            r3 = r33
            r4 = 18
            r1.<init>(r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.TrueLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r35 = r0
            r0 = r35
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r35
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r36 = r0
            r0 = r36
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r34
            r3 = r36
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r37 = r0
            r0 = r37
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r37
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = 1
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 111(0x6f, float:1.56E-43)
            r3[r4] = r5
            r3 = r22
            r1.<init>(r2, r3)
            r32 = r0
            r0 = r32
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r12
            r1 = r13
            r2 = r22
            r3 = r16
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createTypeReference(r1, r2, r3, r4)
            r33 = r0
            r0 = r33
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.InstanceOfExpression r0 = new org.eclipse.jdt.internal.compiler.ast.InstanceOfExpression
            r1 = r0
            r2 = r32
            r3 = r33
            r1.<init>(r2, r3)
            r34 = r0
            r0 = r34
            r1 = r20
            r0.sourceStart = r1
            r0 = r34
            r1 = r21
            r0.sourceEnd = r1
            r0 = r34
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r34
            r3 = 11
            r1.<init>(r2, r3)
            r35 = r0
            r0 = r35
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r36 = r0
            r0 = r36
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r36
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r37 = r0
            r0 = r37
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r35
            r3 = r37
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r38 = r0
            r0 = r38
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r38
            boolean r0 = r0.add(r1)
            java.lang.String r0 = "other"
            char[] r0 = r0.toCharArray()
            r32 = r0
            r0 = r14
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d4
            r0 = r18
            if (r0 == 0) goto L458
        L3d4:
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r32
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r33 = r0
            r0 = r33
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r33
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r12
            r1 = r13
            r2 = r22
            r3 = r16
            r4 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createTypeReference(r1, r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            r1 = r12
            r2 = r13
            r3 = r22
            r4 = r16
            r5 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.createTypeReference(r2, r3, r4, r5)
            r0.type = r1
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = 1
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 111(0x6f, float:1.56E-43)
            r3[r4] = r5
            r3 = r22
            r1.<init>(r2, r3)
            r35 = r0
            r0 = r35
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            r1 = r35
            r2 = r34
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.CastExpression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeCastExpression(r1, r2, r3)
            r0.initialization = r1
            r0 = r31
            r1 = r33
            boolean r0 = r0.add(r1)
        L458:
            r0 = r18
            if (r0 == 0) goto L548
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r33
            r1 = r20
            r0.sourceStart = r1
            r0 = r33
            r1 = r21
            r0.sourceEnd = r1
            r0 = r33
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r32
            r4 = r22
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            java.lang.String r1 = "canEqual"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r34 = r0
            r0 = r34
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r34
            r1 = r16
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r1, r2)
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.CastExpression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeCastExpression(r0, r1, r2)
            r35 = r0
            r0 = r35
            r1 = r20
            r0.sourceStart = r1
            r0 = r35
            r1 = r21
            r0.sourceEnd = r1
            r0 = r33
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r35
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r33
            r3 = 11
            r1.<init>(r2, r3)
            r36 = r0
            r0 = r36
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r37 = r0
            r0 = r37
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r37
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r38 = r0
            r0 = r38
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r36
            r3 = r38
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r39 = r0
            r0 = r39
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r39
            boolean r0 = r0.add(r1)
        L548:
            r0 = r15
            if (r0 == 0) goto L61e
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r33
            r1 = r20
            r0.sourceStart = r1
            r0 = r33
            r1 = r21
            r0.sourceEnd = r1
            r0 = r33
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.SuperReference r1 = new org.eclipse.jdt.internal.compiler.ast.SuperReference
            r2 = r1
            r3 = r20
            r4 = r21
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            java.lang.String r1 = "equals"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = 1
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 111(0x6f, float:1.56E-43)
            r3[r4] = r5
            r3 = r22
            r1.<init>(r2, r3)
            r34 = r0
            r0 = r34
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r33
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r34
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r33
            r3 = 11
            r1.<init>(r2, r3)
            r35 = r0
            r0 = r35
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r36 = r0
            r0 = r36
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r36
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r37 = r0
            r0 = r37
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r35
            r3 = r37
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r38 = r0
            r0 = r38
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r38
            boolean r0 = r0.add(r1)
        L61e:
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r34 = r0
            goto La78
        L629:
            r0 = r34
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r33 = r0
            r0 = r33
            java.lang.Object r0 = r0.getNode()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r35 = r0
            r0 = r35
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L64e
            r0 = 1
            goto L64f
        L64e:
            r0 = 0
        L64f:
            r36 = r0
            r0 = r35
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getFieldType(r0, r1)
            r37 = r0
            r0 = r37
            char[] r0 = r0.getLastToken()
            r38 = r0
            r0 = r36
            if (r0 == 0) goto L670
            r0 = r35
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createMethodAccessor(r0, r1)
            goto L679
        L670:
            r0 = r35
            r1 = r17
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
        L679:
            r39 = r0
            r0 = r36
            if (r0 == 0) goto L68c
            r0 = r35
            r1 = r16
            r2 = r32
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createMethodAccessor(r0, r1, r2)
            goto L697
        L68c:
            r0 = r35
            r1 = r17
            r2 = r16
            r3 = r32
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2, r3)
        L697:
            r40 = r0
            r0 = r37
            int r0 = r0.dimensions()
            if (r0 != 0) goto L96e
            r0 = r38
            if (r0 == 0) goto L96e
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.FLOAT
            r1 = r38
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L6cc
            r0 = r31
            r1 = r12
            r2 = r39
            r3 = r40
            java.lang.String r4 = "Float"
            char[] r4 = r4.toCharArray()
            r5 = r16
            org.eclipse.jdt.internal.compiler.ast.IfStatement r1 = r1.generateCompareFloatOrDouble(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            goto La78
        L6cc:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.DOUBLE
            r1 = r38
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L6f2
            r0 = r31
            r1 = r12
            r2 = r39
            r3 = r40
            java.lang.String r4 = "Double"
            char[] r4 = r4.toCharArray()
            r5 = r16
            org.eclipse.jdt.internal.compiler.ast.IfStatement r1 = r1.generateCompareFloatOrDouble(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            goto La78
        L6f2:
            java.util.Set<java.lang.String> r0 = lombok.eclipse.handlers.HandleEqualsAndHashCode.BUILT_IN_TYPES
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r38
            r2.<init>(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L76f
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r39
            r3 = r40
            r4 = 29
            r1.<init>(r2, r3, r4)
            r41 = r0
            r0 = r41
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r42 = r0
            r0 = r42
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r42
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r43 = r0
            r0 = r43
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r41
            r3 = r43
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r44 = r0
            r0 = r44
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r44
            boolean r0 = r0.add(r1)
            goto La78
        L76f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "this"
            r1.<init>(r2)
            r1 = r36
            if (r1 == 0) goto L784
            java.lang.String r1 = "$$"
            goto L787
        L784:
            java.lang.String r1 = "$"
        L787:
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r35
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r41 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "other"
            r1.<init>(r2)
            r1 = r36
            if (r1 == 0) goto L7af
            java.lang.String r1 = "$$"
            goto L7b2
        L7af:
            java.lang.String r1 = "$"
        L7b2:
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r35
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r42 = r0
            r0 = r31
            r1 = r12
            r2 = r16
            r3 = r41
            r4 = r16
            char[][] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r4, r5)
            r5 = r39
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.createLocalDeclaration(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r31
            r1 = r12
            r2 = r16
            r3 = r42
            r4 = r16
            char[][] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r4, r5)
            r5 = r40
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.createLocalDeclaration(r2, r3, r4, r5)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r41
            r3 = r22
            r1.<init>(r2, r3)
            r43 = r0
            r0 = r43
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r41
            r3 = r22
            r1.<init>(r2, r3)
            r44 = r0
            r0 = r44
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r42
            r3 = r22
            r1.<init>(r2, r3)
            r45 = r0
            r0 = r45
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r42
            r3 = r22
            r1.<init>(r2, r3)
            r46 = r0
            r0 = r46
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r47 = r0
            r0 = r47
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r43
            r3 = r47
            r4 = 18
            r1.<init>(r2, r3, r4)
            r48 = r0
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r47 = r0
            r0 = r47
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r45
            r3 = r47
            r4 = 29
            r1.<init>(r2, r3, r4)
            r49 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r50 = r0
            r0 = r50
            r1 = r20
            r0.sourceStart = r1
            r0 = r50
            r1 = r21
            r0.sourceEnd = r1
            r0 = r50
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r50
            r1 = r44
            r0.receiver = r1
            r0 = r50
            java.lang.String r1 = "equals"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r50
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r46
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r50
            r3 = 11
            r1.<init>(r2, r3)
            r51 = r0
            r0 = r51
            r1 = r20
            r0.sourceStart = r1
            r0 = r51
            r1 = r21
            r0.sourceEnd = r1
            r0 = r51
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r48
            r3 = r49
            r4 = r51
            r1.<init>(r2, r3, r4)
            r52 = r0
            r0 = r52
            r1 = r20
            r0.sourceStart = r1
            r0 = r52
            r1 = r21
            r0.sourceEnd = r1
            r0 = r52
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r53 = r0
            r0 = r53
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r53
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r54 = r0
            r0 = r54
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r52
            r3 = r54
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r55 = r0
            r0 = r55
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r55
            boolean r0 = r0.add(r1)
            goto La78
        L96e:
            r0 = r37
            int r0 = r0.dimensions()
            if (r0 <= 0) goto La78
            r0 = r38
            if (r0 == 0) goto La78
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r41 = r0
            r0 = r41
            r1 = r20
            r0.sourceStart = r1
            r0 = r41
            r1 = r21
            r0.sourceEnd = r1
            r0 = r41
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r41
            r1 = r16
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
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r37
            int r0 = r0.dimensions()
            r1 = 1
            if (r0 > r1) goto L9da
            java.util.Set<java.lang.String> r0 = lombok.eclipse.handlers.HandleEqualsAndHashCode.BUILT_IN_TYPES
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r38
            r2.<init>(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L9e8
        L9da:
            r0 = r41
            java.lang.String r1 = "deepEquals"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            goto L9f3
        L9e8:
            r0 = r41
            java.lang.String r1 = "equals"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
        L9f3:
            r0 = r41
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r39
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r40
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r41
            r3 = 11
            r1.<init>(r2, r3)
            r42 = r0
            r0 = r42
            r1 = r20
            r0.sourceStart = r1
            r0 = r42
            r1 = r21
            r0.sourceEnd = r1
            r0 = r42
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r43 = r0
            r0 = r43
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r43
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r44 = r0
            r0 = r44
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r42
            r3 = r44
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5)
            r45 = r0
            r0 = r45
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r45
            boolean r0 = r0.add(r1)
        La78:
            r0 = r34
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L629
            org.eclipse.jdt.internal.compiler.ast.TrueLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r33 = r0
            r0 = r33
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r33
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r31
            r1 = r34
            boolean r0 = r0.add(r1)
            r0 = r28
            r1 = r31
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r28
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createCanEqual(lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r15) {
            r12 = this;
            r0 = r14
            int r0 = r0.sourceStart
            r16 = r0
            r0 = r14
            int r0 = r0.sourceEnd
            r17 = r0
            r0 = r16
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r17
            long r1 = (long) r1
            long r0 = r0 | r1
            r18 = r0
            java.lang.String r0 = "other"
            char[] r0 = r0.toCharArray()
            r20 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r13
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r21 = r0
            r0 = r21
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r21
            lombok.AccessLevel r1 = lombok.AccessLevel.PROTECTED
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r21
            r1 = 5
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.returnType = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r16
            r0.sourceStart = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r17
            r0.sourceEnd = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r21
            java.lang.String r1 = "canEqual"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r21
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r21
            r1 = 0
            r0.typeParameters = r1
            r0 = r21
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r21
            r1 = r21
            r2 = r21
            r3 = r14
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r21
            r1 = r21
            r2 = r21
            r3 = r14
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r3 = 3
            long[] r3 = new long[r3]
            r4 = r3
            r5 = 0
            r6 = r18
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r18
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r18
            r4[r5] = r6
            r1.<init>(r2, r3)
            r22 = r0
            r0 = r22
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r21
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument r4 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r5 = r4
            r6 = r20
            r7 = 0
            r8 = r22
            r9 = 16
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r16
            r0.sourceStart = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r17
            r0.sourceEnd = r1
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L138
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r15
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r1
            r0.annotations = r1
        L138:
            r0 = r13
            r1 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            r2 = 0
            r1 = r1[r2]
            r2 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNullableAnnotation(r0, r1, r2)
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r20
            r3 = r18
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r23
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r12
            r1 = r13
            r2 = r18
            r3 = r14
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createTypeReference(r1, r2, r3, r4)
            r24 = r0
            r0 = r24
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.InstanceOfExpression r0 = new org.eclipse.jdt.internal.compiler.ast.InstanceOfExpression
            r1 = r0
            r2 = r23
            r3 = r24
            r1.<init>(r2, r3)
            r25 = r0
            r0 = r25
            r1 = r16
            r0.sourceStart = r1
            r0 = r25
            r1 = r17
            r0.sourceEnd = r1
            r0 = r25
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r25
            r3 = r16
            r4 = r17
            r1.<init>(r2, r3, r4)
            r26 = r0
            r0 = r26
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r21
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r26
            r2[r3] = r4
            r0.statements = r1
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L1da
            r0 = r21
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r14
            java.lang.String r5 = "org.checkerframework.dataflow.qual.Pure"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
        L1da:
            r0 = r21
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.IfStatement generateCompareFloatOrDouble(org.eclipse.jdt.internal.compiler.ast.Expression r8, org.eclipse.jdt.internal.compiler.ast.Expression r9, char[] r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11) {
            r7 = this;
            r0 = r11
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r11
            int r0 = r0.sourceEnd
            r13 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            r1 = r12
            r0.sourceStart = r1
            r0 = r14
            r1 = r13
            r0.sourceEnd = r1
            r0 = r14
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r11
            r2 = 3
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            char[] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA
            r3[r4] = r5
            r3 = r2
            r4 = 1
            char[] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.LANG
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
            r0.receiver = r1
            r0 = r14
            java.lang.String r1 = "compare"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r14
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r9
            r2[r3] = r4
            r0.arguments = r1
            java.lang.String r0 = "0"
            char[] r0 = r0.toCharArray()
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r14
            r3 = r15
            r4 = 29
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r16
            r1 = r12
            r0.sourceStart = r1
            r0 = r16
            r1 = r13
            r0.sourceEnd = r1
            r0 = r16
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r17
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r18
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r16
            r3 = r18
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            r19 = r0
            r0 = r19
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.Expression longToIntForHashCode(org.eclipse.jdt.internal.compiler.ast.Expression r7, org.eclipse.jdt.internal.compiler.ast.Expression r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9) {
            r6 = this;
            r0 = r9
            int r0 = r0.sourceStart
            r10 = r0
            r0 = r9
            int r0 = r0.sourceEnd
            r11 = r0
            java.lang.String r0 = "32"
            char[] r0 = r0.toCharArray()
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r7
            r3 = r12
            r4 = 19
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r8
            r3 = r13
            r4 = 8
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = 10
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r0, r1)
            r15 = r0
            r0 = r15
            r1 = r10
            r0.sourceStart = r1
            r0 = r15
            r1 = r11
            r0.sourceEnd = r1
            r0 = r15
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r15
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.CastExpression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeCastExpression(r0, r1, r2)
            r16 = r0
            r0 = r16
            r1 = r10
            r0.sourceStart = r1
            r0 = r16
            r1 = r11
            r0.sourceEnd = r1
            r0 = r16
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m71xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleEqualsAndHashCode.f574xb87c1847
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
            lombok.eclipse.handlers.HandleEqualsAndHashCode.f574xb87c1847 = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType() {
            int[] r0 = lombok.eclipse.handlers.HandleEqualsAndHashCode.$SWITCH_TABLE$lombok$core$configuration$CallSuperType
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
            lombok.eclipse.handlers.HandleEqualsAndHashCode.$SWITCH_TABLE$lombok$core$configuration$CallSuperType = r1
            return r0
    }
}
