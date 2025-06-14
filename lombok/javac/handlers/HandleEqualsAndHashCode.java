package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleEqualsAndHashCode.SCL.lombok */
public class HandleEqualsAndHashCode extends lombok.javac.JavacAnnotationHandler<lombok.EqualsAndHashCode> {
    private static final java.lang.String RESULT_NAME = "result";
    private static final java.lang.String PRIME_NAME = "PRIME";
    private static final java.lang.String HASH_CODE_CACHE_NAME = "$hashCodeCache";
    private boolean jcAnnotatedTypeInit;
    private java.lang.Class<?> jcAnnotatedTypeClass;
    private java.lang.reflect.Field jcAnnotatedTypeUnderlyingTypeField;

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f588x2486df07;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType;
    private static /* synthetic */ int[] $SWITCH_TABLE$javax$lang$model$type$TypeKind;

    public HandleEqualsAndHashCode() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.jcAnnotatedTypeClass = r1
            r0 = r3
            r1 = 0
            r0.jcAnnotatedTypeUnderlyingTypeField = r1
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.EqualsAndHashCode> r11, com.sun.tools.javac.tree.JCTree.JCAnnotation r12, lombok.javac.JavacNode r13) {
            r10 = this;
            r0 = r13
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_FLAG_USAGE
            java.lang.String r2 = "@EqualsAndHashCode"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r13
            java.lang.Class<lombok.EqualsAndHashCode> r1 = lombok.EqualsAndHashCode.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r13
            java.lang.Class<lombok.EqualsAndHashCode$CacheStrategy> r1 = lombok.EqualsAndHashCode.CacheStrategy.class
            java.lang.String r1 = r1.getName()
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
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
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r16 = r0
            r0 = r12
            java.lang.String r1 = "onParam"
            java.lang.String r2 = "@EqualsAndHashCode(onParam"
            r3 = r13
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r17 = r0
            r0 = r14
            boolean r0 = r0.callSuper()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r18 = r0
            r0 = r11
            java.lang.String r1 = "callSuper"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L58
            r0 = 0
            r18 = r0
        L58:
            r0 = r13
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r19 = r0
            r0 = r11
            java.lang.String r1 = "doNotUseGetters"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L75
            r0 = r19
            if (r0 != 0) goto L7f
        L75:
            r0 = r14
            boolean r0 = r0.doNotUseGetters()
            goto L84
        L7f:
            r0 = r19
            boolean r0 = r0.booleanValue()
        L84:
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L91
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
            goto L94
        L91:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
        L94:
            r21 = r0
            r0 = r14
            lombok.EqualsAndHashCode$CacheStrategy r0 = r0.cacheStrategy()
            lombok.EqualsAndHashCode$CacheStrategy r1 = lombok.EqualsAndHashCode.CacheStrategy.LAZY
            if (r0 != r1) goto La7
            r0 = 1
            goto La8
        La7:
            r0 = 0
        La8:
            r22 = r0
            r0 = r10
            r1 = r16
            r2 = r13
            r3 = r15
            r4 = r18
            r5 = 1
            r6 = r22
            r7 = r21
            r8 = r17
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateEqualsAndHashCodeForType(lombok.javac.JavacNode r11, lombok.javac.JavacNode r12) {
            r10 = this;
            java.lang.Class<lombok.EqualsAndHashCode> r0 = lombok.EqualsAndHashCode.class
            r1 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            r0 = r11
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L23
            r0 = r13
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L29
        L23:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
            goto L2c
        L29:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
        L2c:
            r14 = r0
            r0 = r11
            r1 = 0
            r2 = 0
            java.util.List r0 = lombok.core.handlers.InclusionExclusionUtils.handleEqualsAndHashCodeMarking(r0, r1, r2)
            r15 = r0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r15
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r14
            com.sun.tools.javac.util.List r8 = com.sun.tools.javac.util.List.nil()
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateMethods(lombok.javac.JavacNode r10, lombok.javac.JavacNode r11, java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.javac.JavacNode, lombok.EqualsAndHashCode.Include>> r12, java.lang.Boolean r13, boolean r14, boolean r15, lombok.core.handlers.HandlerUtil.FieldAccess r16, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r17) {
            r9 = this;
            r0 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto Le
            r0 = r11
            java.lang.String r1 = "@EqualsAndHashCode is only supported on a class."
            r0.addError(r1)
            return
        Le:
            r0 = r13
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r18 = r0
            r0 = r13
            if (r0 != 0) goto L46
            java.lang.Class<lombok.EqualsAndHashCode> r0 = lombok.EqualsAndHashCode.class
            java.lang.String r1 = "callSuper"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = r0.getDefaultValue()     // Catch: java.lang.Exception -> L3b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L3b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L3b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L3b
            r13 = r0
            goto L46
        L3b:
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            java.lang.String r2 = "Lombok bug - this cannot happen - can't find callSuper field in EqualsAndHashCode annotation."
            r1.<init>(r2)
            throw r0
        L46:
            r0 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isDirectDescendantOfObject(r0)
            r19 = r0
            r0 = r10
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L66
            r0 = 1
            goto L67
        L66:
            r0 = 0
        L67:
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L77
            r0 = r19
            if (r0 == 0) goto L77
            r0 = 0
            goto L78
        L77:
            r0 = 1
        L78:
            r21 = r0
            java.lang.String r0 = "equals"
            r1 = r10
            r2 = 1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            r22 = r0
            java.lang.String r0 = "hashCode"
            r1 = r10
            r2 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            r23 = r0
            java.lang.String r0 = "canEqual"
            r1 = r10
            r2 = 1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            r24 = r0
            int[] r0 = m83x2486df07()
            r1 = 2
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult[] r1 = new lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult[r1]
            r2 = r1
            r3 = 0
            r4 = r22
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r23
            r2[r3] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.Object r1 = java.util.Collections.max(r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = (lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L115;
                case 2: goto Lcc;
                case 3: goto Lcd;
                default: goto L115;
            }
        Lcc:
            return
        Lcd:
            r0 = r14
            if (r0 == 0) goto Le0
            java.lang.String r0 = "Not generating equals and hashCode: A method with one of those names already exists. (Either both or none of these methods will be generated)."
            r25 = r0
            r0 = r11
            r1 = r25
            r0.addWarning(r1)
            goto L114
        Le0:
            r0 = r22
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto Lf0
            r0 = r23
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L114
        Lf0:
            java.lang.String r0 = "Not generating %s: One of equals or hashCode exists. You should either write both of these or none of these (in the latter case, lombok generates them)."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r22
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r5 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r4 != r5) goto L106
            java.lang.String r4 = "equals"
            goto L108
        L106:
            java.lang.String r4 = "hashCode"
        L108:
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r25 = r0
            r0 = r11
            r1 = r25
            r0.addWarning(r1)
        L114:
            return
        L115:
            r0 = r19
            if (r0 == 0) goto L12a
            r0 = r13
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12a
            r0 = r11
            java.lang.String r1 = "Generating equals/hashCode with a supercall to java.lang.Object is pointless."
            r0.addError(r1)
            return
        L12a:
            r0 = r18
            if (r0 == 0) goto L18f
            r0 = r19
            if (r0 != 0) goto L18f
            r0 = r10
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CallSuperType> r1 = lombok.ConfigurationKeys.EQUALS_AND_HASH_CODE_CALL_SUPER
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.CallSuperType r0 = (lombok.core.configuration.CallSuperType) r0
            r25 = r0
            r0 = r25
            if (r0 != 0) goto L14d
            lombok.core.configuration.CallSuperType r0 = lombok.core.configuration.CallSuperType.WARN
            r25 = r0
        L14d:
            int[] r0 = $SWITCH_TABLE$lombok$core$configuration$CallSuperType()
            r1 = r25
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L189;
                case 2: goto L180;
                case 3: goto L170;
                default: goto L170;
            }
        L170:
            r0 = r11
            java.lang.String r1 = "Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type."
            r0.addWarning(r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13 = r0
            goto L18f
        L180:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13 = r0
            goto L18f
        L189:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13 = r0
        L18f:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            boolean r3 = r3.booleanValue()
            r4 = r16
            r5 = r21
            r6 = r11
            r7 = r17
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createEquals(r1, r2, r3, r4, r5, r6, r7)
            r25 = r0
            r0 = r10
            r1 = r25
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            r0 = r21
            if (r0 == 0) goto L1c6
            r0 = r24
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L1c6
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r17
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createCanEqual(r1, r2, r3)
            r26 = r0
            r0 = r10
            r1 = r26
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L1c6:
            r0 = r15
            if (r0 == 0) goto L1fa
            java.lang.String r0 = "$hashCodeCache"
            r1 = r10
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.fieldExists(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L1f4
            java.lang.String r0 = "Not caching the result of hashCode: A field named %s already exists."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "$hashCodeCache"
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r26 = r0
            r0 = r11
            r1 = r26
            r0.addWarning(r1)
            r0 = 0
            r15 = r0
            goto L1fa
        L1f4:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.createHashCodeCacheField(r1, r2)
        L1fa:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            boolean r3 = r3.booleanValue()
            r4 = r15
            r5 = r16
            r6 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createHashCode(r1, r2, r3, r4, r5, r6)
            r26 = r0
            r0 = r10
            r1 = r26
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void createHashCodeCacheField(lombok.javac.JavacNode r7, lombok.javac.JavacNode r8) {
            r6 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r9 = r0
            r0 = r9
            r1 = 130(0x82, double:6.4E-322)
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r10 = r0
            r0 = r9
            r1 = r10
            r2 = r7
            java.lang.String r3 = "$hashCodeCache"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r9
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r3 = r3.TypeIdent(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r11 = r0
            r0 = r7
            r1 = r11
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r0 = r11
            r1 = r8
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createHashCode(lombok.javac.JavacNode r13, java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.javac.JavacNode, lombok.EqualsAndHashCode.Include>> r14, boolean r15, boolean r16, lombok.core.handlers.HandlerUtil.FieldAccess r17, lombok.javac.JavacNode r18) {
            r12 = this;
            r0 = r13
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r19 = r0
            r0 = r19
            r1 = r13
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r20 = r0
            r0 = r20
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r21 = r0
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            r22 = r0
            r0 = r16
            if (r0 == 0) goto L51
            r0 = r22
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L51
            r0 = r21
            r1 = r19
            r2 = r13
            java.lang.String r3 = "org.checkerframework.dataflow.qual.Pure"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r21 = r0
            goto L6f
        L51:
            r0 = r22
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L6f
            r0 = r21
            r1 = r19
            r2 = r13
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r21 = r0
        L6f:
            r0 = r19
            r1 = 1
            r2 = r21
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r23 = r0
            r0 = r19
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            r24 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r13
            java.lang.String r1 = "PRIME"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r26 = r0
            r0 = r13
            java.lang.String r1 = "result"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r27 = r0
            r0 = 0
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r28 = r0
            r0 = r14
            boolean r0 = r0.isEmpty()
            r30 = r0
            r0 = r16
            if (r0 == 0) goto Lfd
            r0 = r19
            r1 = r13
            java.lang.String r2 = "this"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r31 = r0
            r0 = r19
            r1 = r31
            r2 = r13
            java.lang.String r3 = "$hashCodeCache"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r32 = r0
            r0 = r19
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r32
            r3 = r19
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_INT
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r33 = r0
            r0 = r25
            r1 = r19
            r2 = r33
            r3 = r19
            r4 = r32
            com.sun.tools.javac.tree.JCTree$JCReturn r3 = r3.Return(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Lfd:
            r0 = r30
            if (r0 != 0) goto L129
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r26
            r4 = r19
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r4 = r4.TypeIdent(r5)
            r5 = r19
            int r6 = lombok.core.handlers.HandlerUtil.primeForHashcode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.sun.tools.javac.tree.JCTree$JCLiteral r5 = r5.Literal(r6)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L129:
            r0 = r15
            if (r0 == 0) goto L154
            r0 = r19
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r19
            r3 = r19
            r4 = r13
            java.lang.String r5 = "super"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            java.lang.String r5 = "hashCode"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r31 = r0
            goto L15f
        L154:
            r0 = r19
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r31 = r0
        L15f:
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r30
            if (r3 == 0) goto L174
            r3 = r16
            if (r3 != 0) goto L174
            r3 = r28
            goto L175
        L174:
            r3 = 0
        L175:
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r27
            r4 = r19
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r4 = r4.TypeIdent(r5)
            r5 = r31
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r32 = r0
            goto L4bc
        L196:
            r0 = r32
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r31 = r0
            r0 = r31
            java.lang.Object r0 = r0.getNode()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r33 = r0
            r0 = r12
            r1 = r33
            r2 = r17
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.getFieldType(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.unnotate(r1)
            r34 = r0
            r0 = r33
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L1c8
            r0 = 1
            goto L1c9
        L1c8:
            r0 = 0
        L1c9:
            r35 = r0
            r0 = r35
            if (r0 == 0) goto L1da
            r0 = r19
            r1 = r33
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createMethodAccessor(r0, r1)
            goto L1e3
        L1da:
            r0 = r19
            r1 = r33
            r2 = r17
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r0, r1, r2)
        L1e3:
            r36 = r0
            r0 = r34
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L392
            int[] r0 = $SWITCH_TABLE$javax$lang$model$type$TypeKind()
            r1 = r34
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r1 = (com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree) r1
            javax.lang.model.type.TypeKind r1 = r1.getPrimitiveTypeKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L22c;
                case 2: goto L382;
                case 3: goto L382;
                case 4: goto L382;
                case 5: goto L25c;
                case 6: goto L382;
                case 7: goto L2c6;
                case 8: goto L2f5;
                default: goto L382;
            }
        L22c:
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r19
            r4 = r19
            r5 = r36
            r6 = r19
            int r7 = lombok.core.handlers.HandlerUtil.primeForTrue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.sun.tools.javac.tree.JCTree$JCLiteral r6 = r6.Literal(r7)
            r7 = r19
            int r8 = lombok.core.handlers.HandlerUtil.primeForFalse()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.sun.tools.javac.tree.JCTree$JCLiteral r7 = r7.Literal(r8)
            com.sun.tools.javac.tree.JCTree$JCConditional r4 = r4.Conditional(r5, r6, r7)
            com.sun.tools.javac.tree.JCTree$JCParens r3 = r3.Parens(r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4bc
        L25c:
            r0 = r33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r35
            if (r3 == 0) goto L26d
            java.lang.String r3 = "$$"
            goto L270
        L26d:
            java.lang.String r3 = "$"
        L270:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r2 = r33
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r37 = r0
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r37
            r4 = r19
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_LONG
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r4 = r4.TypeIdent(r5)
            r5 = r36
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r12
            r4 = r19
            r5 = r19
            r6 = r37
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            r6 = r19
            r7 = r37
            com.sun.tools.javac.tree.JCTree$JCIdent r6 = r6.Ident(r7)
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.longToIntForHashCode(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4bc
        L2c6:
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r19
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r13
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = r6
            r8 = 0
            java.lang.String r9 = "Float"
            r7[r8] = r9
            r7 = r6
            r8 = 1
            java.lang.String r9 = "floatToIntBits"
            r7[r8] = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r5 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r5, r6)
            r6 = r36
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.of(r6)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r3 = r3.Apply(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4bc
        L2f5:
            r0 = r33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r35
            if (r3 == 0) goto L306
            java.lang.String r3 = "$$"
            goto L309
        L306:
            java.lang.String r3 = "$"
        L309:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r2 = r33
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r37 = r0
            r0 = r19
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r13
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Double"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "doubleToLongBits"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r2, r3)
            r3 = r36
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r38 = r0
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r37
            r4 = r19
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_LONG
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r4 = r4.TypeIdent(r5)
            r5 = r38
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r12
            r4 = r19
            r5 = r19
            r6 = r37
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            r6 = r19
            r7 = r37
            com.sun.tools.javac.tree.JCTree$JCIdent r6 = r6.Ident(r7)
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.longToIntForHashCode(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4bc
        L382:
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r36
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4bc
        L392:
            r0 = r34
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L411
            r0 = r34
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            r37 = r0
            r0 = r12
            r1 = r37
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.elemtype
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.unnotate(r1)
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            r38 = r0
            r0 = r12
            r1 = r37
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.elemtype
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.unnotate(r1)
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            r39 = r0
            r0 = r38
            if (r0 != 0) goto L3cb
            r0 = r39
            if (r0 == 0) goto L3cb
            r0 = 0
            goto L3cc
        L3cb:
            r0 = 1
        L3cc:
            r40 = r0
            r0 = r13
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Arrays"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r40
            if (r6 == 0) goto L3ec
            java.lang.String r6 = "deepHashCode"
            goto L3ee
        L3ec:
            java.lang.String r6 = "hashCode"
        L3ee:
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r41 = r0
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r19
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r41
            r6 = r36
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.of(r6)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r3 = r3.Apply(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4bc
        L411:
            r0 = r33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r35
            if (r3 == 0) goto L422
            java.lang.String r3 = "$$"
            goto L425
        L422:
            java.lang.String r3 = "$"
        L425:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r2 = r33
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r37 = r0
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r37
            r4 = r13
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Object"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r4, r5)
            r5 = r36
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r19
            r3 = r19
            r4 = r37
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            java.lang.String r5 = "hashCode"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r38 = r0
            r0 = r19
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r19
            r3 = r37
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r19
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r39 = r0
            r0 = r25
            r1 = r12
            r2 = r13
            r3 = r19
            r4 = r19
            r5 = r39
            r6 = r19
            int r7 = lombok.core.handlers.HandlerUtil.primeForNull()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.sun.tools.javac.tree.JCTree$JCLiteral r6 = r6.Literal(r7)
            r7 = r38
            com.sun.tools.javac.tree.JCTree$JCConditional r4 = r4.Conditional(r5, r6, r7)
            com.sun.tools.javac.tree.JCTree$JCParens r3 = r3.Parens(r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.createResultCalculation(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L4bc:
            r0 = r32
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L196
            r0 = r16
            if (r0 == 0) goto L549
            r0 = r25
            r1 = r19
            r2 = r19
            lombok.javac.JavacTreeMaker$TreeTag r3 = lombok.javac.Javac.CTC_EQUAL
            r4 = r19
            r5 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r19
            lombok.javac.JavacTreeMaker$TypeTag r6 = lombok.javac.Javac.CTC_INT
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.sun.tools.javac.tree.JCTree$JCLiteral r5 = r5.Literal(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCBinary r2 = r2.Binary(r3, r4, r5)
            r3 = r19
            r4 = r19
            r5 = r19
            r6 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            r6 = r13
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "Integer"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "MIN_VALUE"
            r8[r9] = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r6 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCAssign r4 = r4.Assign(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r3 = r3.Exec(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            r1 = r19
            r2 = r13
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r13
            java.lang.String r3 = "$hashCodeCache"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r31 = r0
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r31
            r4 = r19
            r5 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            com.sun.tools.javac.tree.JCTree$JCAssign r2 = r2.Assign(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L549:
            r0 = r25
            r1 = r19
            r2 = r19
            r3 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            r1 = 0
            r2 = r25
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r31 = r0
            r0 = r19
            r1 = r23
            r2 = r13
            java.lang.String r3 = "hashCode"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r24
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r31
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r18
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpressionStatement createResultCalculation(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r10 = r0
            r0 = r8
            java.lang.String r1 = "result"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r11 = r0
            r0 = r10
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_MUL
            r2 = r10
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r10
            r4 = r8
            java.lang.String r5 = "PRIME"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r12 = r0
            r0 = r10
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r12
            r3 = r9
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r13 = r0
            r0 = r10
            r1 = r10
            r2 = r10
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r13
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression longToIntForHashCode(lombok.javac.JavacTreeMaker r7, com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r6 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_UNSIGNED_SHIFT_RIGHT
            r2 = r8
            r3 = r7
            r4 = 32
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r10 = r0
            r0 = r7
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_BITXOR
            r2 = r10
            r3 = r9
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r11 = r0
            r0 = r7
            r1 = r7
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r1 = r1.TypeIdent(r2)
            r2 = r7
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCParens r2 = r2.Parens(r3)
            com.sun.tools.javac.tree.JCTree$JCTypeCast r0 = r0.TypeCast(r1, r2)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression createTypeReference(lombok.javac.JavacNode r7, boolean r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            goto L17
        L16:
            r0 = 0
        L17:
            r10 = r0
            r0 = r9
            r1 = r7
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.add(r1)
            r0 = r8
            if (r0 == 0) goto L40
            r0 = r10
            r1 = r7
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r1
            com.sun.tools.javac.util.List r1 = r1.typarams
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L40:
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r11 = r0
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r12 = r0
            goto Lc8
        L69:
            r0 = r9
            r1 = r12
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.add(r1)
            r0 = r8
            if (r0 == 0) goto L9b
            r0 = r10
            r1 = r11
            if (r1 == 0) goto L84
            r1 = 0
            goto L92
        L84:
            r1 = r12
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r1
            com.sun.tools.javac.util.List r1 = r1.typarams
            int r1 = r1.size()
        L92:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L9b:
            r0 = r11
            if (r0 != 0) goto Lbe
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbb
            r0 = 1
            goto Lbc
        Lbb:
            r0 = 0
        Lbc:
            r11 = r0
        Lbe:
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r12 = r0
        Lc8:
            r0 = r12
            if (r0 == 0) goto Le3
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto Le3
            r0 = r12
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L69
        Le3:
            r0 = r9
            java.util.Collections.reverse(r0)
            r0 = r8
            if (r0 == 0) goto Lf0
            r0 = r10
            java.util.Collections.reverse(r0)
        Lf0:
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r13 = r0
            r0 = r13
            r1 = r7
            r2 = r9
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r14 = r0
            r0 = r8
            if (r0 == 0) goto L127
            r0 = r6
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.wildcardify(r1, r2, r3)
            r14 = r0
        L127:
            r0 = 1
            r15 = r0
            goto L165
        L12d:
            r0 = r13
            r1 = r14
            r2 = r7
            r3 = r9
            r4 = r15
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r14 = r0
            r0 = r8
            if (r0 == 0) goto L162
            r0 = r6
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = r15
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.wildcardify(r1, r2, r3)
            r14 = r0
        L162:
            int r15 = r15 + 1
        L165:
            r0 = r15
            r1 = r9
            int r1 = r1.size()
            if (r0 < r1) goto L12d
            r0 = r14
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCExpression wildcardify(lombok.javac.JavacTreeMaker r6, com.sun.tools.javac.tree.JCTree.JCExpression r7, int r8) {
            r5 = this;
            r0 = r8
            if (r0 != 0) goto L6
            r0 = r7
            return r0
        L6:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 0
            r10 = r0
            goto L2a
        L15:
            r0 = r9
            r1 = r6
            r2 = r6
            com.sun.tools.javac.code.BoundKind r3 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r2 = r2.TypeBoundKind(r3)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r1 = r1.Wildcard(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            int r10 = r10 + 1
        L2a:
            r0 = r10
            r1 = r8
            if (r0 < r1) goto L15
            r0 = r6
            r1 = r7
            r2 = r9
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createEquals(lombok.javac.JavacNode r11, java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.javac.JavacNode, lombok.EqualsAndHashCode.Include>> r12, boolean r13, lombok.core.handlers.HandlerUtil.FieldAccess r14, boolean r15, lombok.javac.JavacNode r16, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r17) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r18 = r0
            r0 = r11
            java.lang.String r1 = "o"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r19 = r0
            r0 = r11
            java.lang.String r1 = "other"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r20 = r0
            r0 = r11
            java.lang.String r1 = "this"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r22 = r0
            r0 = r18
            r1 = r11
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r23 = r0
            r0 = r23
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r24 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            r25 = r0
            r0 = r25
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L69
            r0 = r24
            r1 = r18
            r2 = r11
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r24 = r0
        L69:
            r0 = r18
            r1 = 1
            r2 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r26 = r0
            r0 = r22
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8e
            r0 = r11
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Object"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r27 = r0
            goto Laf
        L8e:
            r0 = r11
            java.lang.String r1 = "java"
            java.lang.String r2 = "lang"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Object"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r27 = r0
            r0 = r18
            r1 = r22
            r2 = r27
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.AnnotatedType(r1, r2)
            r27 = r0
        Laf:
            r0 = r18
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            r28 = r0
            r0 = 0
            r1 = r11
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r29 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r31 = r0
            r0 = r18
            r1 = r18
            r2 = r29
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r2 = r2 | r3
            r3 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r19
            r3 = r27
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r32 = r0
            r0 = r11
            r1 = r32
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNullableAnnotation(r0, r1)
            r0 = r32
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r33 = r0
            r0 = r31
            r1 = r18
            r2 = r18
            lombok.javac.JavacTreeMaker$TreeTag r3 = lombok.javac.Javac.CTC_EQUAL
            r4 = r18
            r5 = r19
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r18
            r6 = r21
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            com.sun.tools.javac.tree.JCTree$JCBinary r2 = r2.Binary(r3, r4, r5)
            r3 = r10
            r4 = r18
            r5 = 1
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r18
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT
            r2 = r18
            r3 = r18
            r4 = r18
            r5 = r19
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r10
            r6 = r11
            r7 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.createTypeReference(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCInstanceOf r3 = r3.TypeTest(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCParens r2 = r2.Parens(r3)
            com.sun.tools.javac.tree.JCTree$JCUnary r0 = r0.Unary(r1, r2)
            r34 = r0
            r0 = r31
            r1 = r18
            r2 = r34
            r3 = r10
            r4 = r18
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15f
            r0 = r15
            if (r0 == 0) goto L193
        L15f:
            r0 = r10
            r1 = r11
            r2 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.createTypeReference(r1, r2)
            r34 = r0
            r0 = r10
            r1 = r11
            r2 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.createTypeReference(r1, r2)
            r35 = r0
            r0 = r31
            r1 = r18
            r2 = r18
            r3 = r29
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r20
            r4 = r34
            r5 = r18
            r6 = r35
            r7 = r18
            r8 = r19
            com.sun.tools.javac.tree.JCTree$JCIdent r7 = r7.Ident(r8)
            com.sun.tools.javac.tree.JCTree$JCTypeCast r5 = r5.TypeCast(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L193:
            r0 = r15
            if (r0 == 0) goto L1fa
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r34 = r0
            r0 = r18
            r1 = r21
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r35 = r0
            r0 = r18
            r1 = r11
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Object"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            r2 = r35
            com.sun.tools.javac.tree.JCTree$JCTypeCast r0 = r0.TypeCast(r1, r2)
            r36 = r0
            r0 = r18
            r1 = r34
            r2 = r18
            r3 = r18
            r4 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r11
            java.lang.String r5 = "canEqual"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r36
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r37 = r0
            r0 = r31
            r1 = r18
            r2 = r18
            lombok.javac.JavacTreeMaker$TreeTag r3 = lombok.javac.Javac.CTC_NOT
            r4 = r37
            com.sun.tools.javac.tree.JCTree$JCUnary r2 = r2.Unary(r3, r4)
            r3 = r10
            r4 = r18
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1fa:
            r0 = r13
            if (r0 == 0) goto L24a
            r0 = r18
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r18
            r3 = r18
            r4 = r11
            java.lang.String r5 = "super"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r11
            java.lang.String r5 = "equals"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r18
            r4 = r19
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r34 = r0
            r0 = r18
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT
            r2 = r34
            com.sun.tools.javac.tree.JCTree$JCUnary r0 = r0.Unary(r1, r2)
            r35 = r0
            r0 = r31
            r1 = r18
            r2 = r35
            r3 = r10
            r4 = r18
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L24a:
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r35 = r0
            goto L4ff
        L255:
            r0 = r35
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r34 = r0
            r0 = r34
            java.lang.Object r0 = r0.getNode()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r36 = r0
            r0 = r36
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L27a
            r0 = 1
            goto L27b
        L27a:
            r0 = 0
        L27b:
            r37 = r0
            r0 = r10
            r1 = r36
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.getFieldType(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.unnotate(r1)
            r38 = r0
            r0 = r37
            if (r0 == 0) goto L299
            r0 = r18
            r1 = r36
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createMethodAccessor(r0, r1)
            goto L2a2
        L299:
            r0 = r18
            r1 = r36
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r0, r1, r2)
        L2a2:
            r39 = r0
            r0 = r37
            if (r0 == 0) goto L2ba
            r0 = r18
            r1 = r36
            r2 = r18
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createMethodAccessor(r0, r1, r2)
            goto L2ca
        L2ba:
            r0 = r18
            r1 = r36
            r2 = r14
            r3 = r18
            r4 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r0, r1, r2, r3)
        L2ca:
            r40 = r0
            r0 = r38
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L344
            int[] r0 = $SWITCH_TABLE$javax$lang$model$type$TypeKind()
            r1 = r38
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r1 = (com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree) r1
            javax.lang.model.type.TypeKind r1 = r1.getPrimitiveTypeKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 7: goto L2f8;
                case 8: goto L30d;
                default: goto L322;
            }
        L2f8:
            r0 = r31
            r1 = r10
            r2 = r39
            r3 = r40
            r4 = r18
            r5 = r11
            r6 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.generateCompareFloatOrDouble(r2, r3, r4, r5, r6)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4ff
        L30d:
            r0 = r31
            r1 = r10
            r2 = r39
            r3 = r40
            r4 = r18
            r5 = r11
            r6 = 1
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.generateCompareFloatOrDouble(r2, r3, r4, r5, r6)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4ff
        L322:
            r0 = r31
            r1 = r18
            r2 = r18
            lombok.javac.JavacTreeMaker$TreeTag r3 = lombok.javac.Javac.CTC_NOT_EQUAL
            r4 = r39
            r5 = r40
            com.sun.tools.javac.tree.JCTree$JCBinary r2 = r2.Binary(r3, r4, r5)
            r3 = r10
            r4 = r18
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4ff
        L344:
            r0 = r38
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L3d9
            r0 = r38
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            r41 = r0
            r0 = r10
            r1 = r41
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.elemtype
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.unnotate(r1)
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            r42 = r0
            r0 = r10
            r1 = r41
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.elemtype
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.unnotate(r1)
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            r43 = r0
            r0 = r42
            if (r0 != 0) goto L37d
            r0 = r43
            if (r0 == 0) goto L37d
            r0 = 0
            goto L37e
        L37d:
            r0 = 1
        L37e:
            r44 = r0
            r0 = r11
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Arrays"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r44
            if (r6 == 0) goto L39e
            java.lang.String r6 = "deepEquals"
            goto L3a0
        L39e:
            java.lang.String r6 = "equals"
        L3a0:
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r45 = r0
            r0 = r39
            r1 = r40
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            r46 = r0
            r0 = r31
            r1 = r18
            r2 = r18
            lombok.javac.JavacTreeMaker$TreeTag r3 = lombok.javac.Javac.CTC_NOT
            r4 = r18
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r6 = r45
            r7 = r46
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r4 = r4.Apply(r5, r6, r7)
            com.sun.tools.javac.tree.JCTree$JCUnary r2 = r2.Unary(r3, r4)
            r3 = r10
            r4 = r18
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4ff
        L3d9:
            r0 = r36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "this"
            r2.<init>(r3)
            r2 = r37
            if (r2 == 0) goto L3f0
            java.lang.String r2 = "$$"
            goto L3f3
        L3f0:
            java.lang.String r2 = "$"
        L3f3:
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r36
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r41 = r0
            r0 = r36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "other"
            r2.<init>(r3)
            r2 = r37
            if (r2 == 0) goto L41d
            java.lang.String r2 = "$$"
            goto L420
        L41d:
            java.lang.String r2 = "$"
        L420:
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r36
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r42 = r0
            r0 = r31
            r1 = r18
            r2 = r18
            r3 = r29
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r41
            r4 = r11
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Object"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r4, r5)
            r5 = r39
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r31
            r1 = r18
            r2 = r18
            r3 = r29
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r42
            r4 = r11
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Object"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r4, r5)
            r5 = r40
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r18
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r18
            r3 = r41
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r18
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r43 = r0
            r0 = r18
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r18
            r3 = r42
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r18
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r44 = r0
            r0 = r18
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r18
            r3 = r18
            r4 = r41
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r11
            java.lang.String r5 = "equals"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r18
            r4 = r42
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r45 = r0
            r0 = r18
            r1 = r43
            r2 = r44
            r3 = r18
            lombok.javac.JavacTreeMaker$TreeTag r4 = lombok.javac.Javac.CTC_NOT
            r5 = r45
            com.sun.tools.javac.tree.JCTree$JCUnary r3 = r3.Unary(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r46 = r0
            r0 = r31
            r1 = r18
            r2 = r46
            r3 = r10
            r4 = r18
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = r3.returnBool(r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L4ff:
            r0 = r35
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L255
            r0 = r31
            r1 = r10
            r2 = r18
            r3 = 1
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.returnBool(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r18
            r1 = 0
            r2 = r31
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r34 = r0
            r0 = r18
            r1 = r26
            r2 = r11
            java.lang.String r3 = "equals"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r28
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r33
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r34
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r16
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createCanEqual(lombok.javac.JavacNode r11, lombok.javac.JavacNode r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r15 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            r16 = r0
            r0 = r16
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L2f
            r0 = r15
            r1 = r14
            r2 = r11
            java.lang.String r3 = "org.checkerframework.dataflow.qual.Pure"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r15 = r0
        L2f:
            r0 = r14
            r1 = 4
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r17 = r0
            r0 = r14
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            r18 = r0
            r0 = r11
            java.lang.String r1 = "canEqual"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r19 = r0
            r0 = r11
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Object"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r20 = r0
            r0 = r11
            java.lang.String r1 = "other"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r11
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r22 = r0
            r0 = r14
            r1 = r14
            r2 = r22
            r3 = r13
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r21
            r3 = r20
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r24 = r0
            r0 = r11
            r1 = r24
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNullableAnnotation(r0, r1)
            r0 = r24
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r25 = r0
            r0 = r14
            r1 = 0
            r2 = r14
            r3 = r14
            r4 = r14
            r5 = r21
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r10
            r6 = r11
            r7 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.createTypeReference(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCInstanceOf r3 = r3.TypeTest(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCReturn r2 = r2.Return(r3)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r26 = r0
            r0 = r14
            r1 = r17
            r2 = r19
            r3 = r18
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r25
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r26
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCStatement generateCompareFloatOrDouble(com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.tree.JCTree.JCExpression r11, lombok.javac.JavacTreeMaker r12, lombok.javac.JavacNode r13, boolean r14) {
            r9 = this;
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r14
            if (r4 == 0) goto L13
            java.lang.String r4 = "Double"
            goto L16
        L13:
            java.lang.String r4 = "Float"
        L16:
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r15 = r0
            r0 = r10
            r1 = r11
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            r16 = r0
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r12
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r12
            r5 = r15
            r6 = r13
            java.lang.String r7 = "compare"
            com.sun.tools.javac.util.Name r6 = r6.toName(r7)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r4 = r4.Select(r5, r6)
            r5 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r2 = r2.Apply(r3, r4, r5)
            r3 = r12
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r17 = r0
            r0 = r12
            r1 = r17
            r2 = r9
            r3 = r12
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r2 = r2.returnBool(r3, r4)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCStatement returnBool(lombok.javac.JavacTreeMaker r6, boolean r7) {
            r5 = this;
            r0 = r6
            r1 = r6
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_BOOLEAN
            r3 = r7
            if (r3 == 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCExpression unnotate(com.sun.tools.javac.tree.JCTree.JCExpression r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.isJcAnnotatedType(r1)
            if (r0 != 0) goto La
            r0 = r4
            return r0
        La:
            r0 = r3
            java.lang.reflect.Field r0 = r0.jcAnnotatedTypeUnderlyingTypeField
            if (r0 != 0) goto L13
            r0 = r4
            return r0
        L13:
            r0 = r3
            java.lang.reflect.Field r0 = r0.jcAnnotatedTypeUnderlyingTypeField     // Catch: java.lang.Exception -> L1f
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1f
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.Exception -> L1f
            return r0
        L1f:
            r0 = r4
            return r0
    }

    private boolean isJcAnnotatedType(com.sun.tools.javac.tree.JCTree.JCExpression r6) {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            boolean r0 = r0.jcAnnotatedTypeInit
            if (r0 != 0) goto L36
            r0 = r5
            java.lang.String r1 = "com.sun.tools.javac.tree.JCTree$JCAnnotatedType"
            r2 = 0
            r3 = r6
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Exception -> L30
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L30
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.Exception -> L30
            r0.jcAnnotatedTypeClass = r1     // Catch: java.lang.Exception -> L30
            r0 = r5
            r1 = r5
            java.lang.Class<?> r1 = r1.jcAnnotatedTypeClass     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "underlyingType"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L30
            r0.jcAnnotatedTypeUnderlyingTypeField = r1     // Catch: java.lang.Exception -> L30
            goto L31
        L30:
        L31:
            r0 = r5
            r1 = 1
            r0.jcAnnotatedTypeInit = r1
        L36:
            r0 = r5
            java.lang.Class<?> r0 = r0.jcAnnotatedTypeClass
            r1 = r6
            java.lang.Class r1 = r1.getClass()
            if (r0 != r1) goto L43
            r0 = 1
            return r0
        L43:
            r0 = 0
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m83x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleEqualsAndHashCode.f588x2486df07
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult[] r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleEqualsAndHashCode.f588x2486df07 = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType() {
            int[] r0 = lombok.javac.handlers.HandleEqualsAndHashCode.$SWITCH_TABLE$lombok$core$configuration$CallSuperType
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
            lombok.javac.handlers.HandleEqualsAndHashCode.$SWITCH_TABLE$lombok$core$configuration$CallSuperType = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$javax$lang$model$type$TypeKind() {
            int[] r0 = lombok.javac.handlers.HandleEqualsAndHashCode.$SWITCH_TABLE$javax$lang$model$type$TypeKind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            javax.lang.model.type.TypeKind[] r0 = javax.lang.model.type.TypeKind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 12
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L2a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2a
            goto L2b
        L2a:
        L2b:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BYTE     // Catch: java.lang.NoSuchFieldError -> L37
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37
            goto L38
        L37:
        L38:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.CHAR     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DECLARED     // Catch: java.lang.NoSuchFieldError -> L53
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
            r2 = 13
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
            goto L54
        L53:
        L54:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L61
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            goto L62
        L61:
        L62:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.ERROR     // Catch: java.lang.NoSuchFieldError -> L6f
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
            r2 = 14
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6f
            goto L70
        L6f:
        L70:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.EXECUTABLE     // Catch: java.lang.NoSuchFieldError -> L7d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
            r2 = 18
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            goto L7e
        L7d:
        L7e:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.FLOAT     // Catch: java.lang.NoSuchFieldError -> L8b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8b
            goto L8c
        L8b:
        L8c:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.INT     // Catch: java.lang.NoSuchFieldError -> L98
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L98
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L98
            goto L99
        L98:
        L99:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.LONG     // Catch: java.lang.NoSuchFieldError -> La5
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            goto La6
        La5:
        La6:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.NONE     // Catch: java.lang.NoSuchFieldError -> Lb3
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb3
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb3
            goto Lb4
        Lb3:
        Lb4:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.NULL     // Catch: java.lang.NoSuchFieldError -> Lc1
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
            r2 = 11
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            goto Lc2
        Lc1:
        Lc2:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.OTHER     // Catch: java.lang.NoSuchFieldError -> Lcf
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcf
            r2 = 19
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcf
            goto Ld0
        Lcf:
        Ld0:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.PACKAGE     // Catch: java.lang.NoSuchFieldError -> Ldd
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldd
            r2 = 17
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldd
            goto Lde
        Ldd:
        Lde:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.SHORT     // Catch: java.lang.NoSuchFieldError -> Lea
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lea
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lea
            goto Leb
        Lea:
        Leb:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.TYPEVAR     // Catch: java.lang.NoSuchFieldError -> Lf8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf8
            r2 = 15
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf8
            goto Lf9
        Lf8:
        Lf9:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.VOID     // Catch: java.lang.NoSuchFieldError -> L106
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L106
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L106
            goto L107
        L106:
        L107:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.WILDCARD     // Catch: java.lang.NoSuchFieldError -> L114
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
            r2 = 16
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            goto L115
        L114:
        L115:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleEqualsAndHashCode.$SWITCH_TABLE$javax$lang$model$type$TypeKind = r1
            return r0
    }
}
