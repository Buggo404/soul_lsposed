package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleToString.SCL.lombok */
public class HandleToString extends lombok.javac.JavacAnnotationHandler<lombok.ToString> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType;

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f594x2486df07;

    public HandleToString() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.ToString> r10, com.sun.tools.javac.tree.JCTree.JCAnnotation r11, lombok.javac.JavacNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.TO_STRING_FLAG_USAGE
            java.lang.String r2 = "@ToString"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r12
            java.lang.Class<lombok.ToString> r1 = lombok.ToString.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.ToString r0 = (lombok.ToString) r0
            r13 = r0
            r0 = r12
            lombok.javac.JavacAST r0 = r0.getAst()
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
            if (r0 != 0) goto L3a
            return
        L3a:
            r0 = r13
            boolean r0 = r0.callSuper()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r16 = r0
            r0 = r10
            java.lang.String r1 = "callSuper"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L52
            r0 = 0
            r16 = r0
        L52:
            r0 = r12
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.TO_STRING_DO_NOT_USE_GETTERS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r17 = r0
            r0 = r10
            java.lang.String r1 = "doNotUseGetters"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L6f
            r0 = r17
            if (r0 != 0) goto L79
        L6f:
            r0 = r13
            boolean r0 = r0.doNotUseGetters()
            goto L7e
        L79:
            r0 = r17
            boolean r0 = r0.booleanValue()
        L7e:
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L8b
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
            goto L8e
        L8b:
            lombok.core.handlers.HandlerUtil$FieldAccess r0 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
        L8e:
            r19 = r0
            r0 = r12
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r10
            java.lang.String r2 = "includeFieldNames"
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r3 = lombok.ConfigurationKeys.TO_STRING_INCLUDE_FIELD_NAMES
            boolean r0 = r0.getBooleanAnnotationValue(r1, r2, r3)
            r20 = r0
            r0 = r9
            r1 = r12
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r12
            r3 = r15
            r4 = r20
            r5 = r16
            r6 = 1
            r7 = r19
            r0.generateToString(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void generateToStringForType(lombok.javac.JavacNode r10, lombok.javac.JavacNode r11) {
            r9 = this;
            java.lang.Class<lombok.ToString> r0 = lombok.ToString.class
            r1 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            java.lang.Class<lombok.ToString> r0 = lombok.ToString.class
            lombok.core.AnnotationValues r0 = lombok.core.AnnotationValues.m57of(r0)
            r12 = r0
            r0 = r10
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r12
            java.lang.String r2 = "includeFieldNames"
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r3 = lombok.ConfigurationKeys.TO_STRING_INCLUDE_FIELD_NAMES
            boolean r0 = r0.getBooleanAnnotationValue(r1, r2, r3)
            r13 = r0
            r0 = r10
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r12
            java.lang.String r2 = "onlyExplicitlyIncluded"
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r3 = lombok.ConfigurationKeys.TO_STRING_ONLY_EXPLICITLY_INCLUDED
            boolean r0 = r0.getBooleanAnnotationValue(r1, r2, r3)
            r14 = r0
            r0 = r10
            lombok.javac.JavacAST r0 = r0.getAst()
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

    public void generateToString(lombok.javac.JavacNode r8, lombok.javac.JavacNode r9, java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.javac.JavacNode, lombok.ToString.Include>> r10, boolean r11, java.lang.Boolean r12, boolean r13, lombok.core.handlers.HandlerUtil.FieldAccess r14) {
            r7 = this;
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto Le
            r0 = r9
            java.lang.String r1 = "@ToString is only supported on a class or enum."
            r0.addError(r1)
            return
        Le:
            int[] r0 = m88x2486df07()
            java.lang.String r1 = "toString"
            r2 = r8
            r3 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r1, r2, r3)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L38;
                case 2: goto Lc0;
                case 3: goto Lc3;
                default: goto Lc3;
            }
        L38:
            r0 = r12
            if (r0 != 0) goto La6
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isDirectDescendantOfObject(r0)
            if (r0 == 0) goto L4d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12 = r0
            goto La6
        L4d:
            r0 = r8
            lombok.javac.JavacAST r0 = r0.getAst()
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
            java.lang.String r1 = "Generating toString implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@ToString(callSuper=false)' to your type."
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
            r4 = r14
            r5 = r9
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createToString(r0, r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r8
            r1 = r15
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            goto Lce
        Lc0:
            goto Lce
        Lc3:
            r0 = r13
            if (r0 == 0) goto Lce
            r0 = r9
            java.lang.String r1 = "Not generating toString(): A method with that name already exists"
            r0.addWarning(r1)
        Lce:
            return
    }

    static com.sun.tools.javac.tree.JCTree.JCMethodDecl createToString(lombok.javac.JavacNode r10, java.util.Collection<lombok.core.handlers.InclusionExclusionUtils.Included<lombok.javac.JavacNode, lombok.ToString.Include>> r11, boolean r12, boolean r13, lombok.core.handlers.HandlerUtil.FieldAccess r14, lombok.javac.JavacNode r15) {
            r0 = r10
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r16 = r0
            r0 = r16
            r1 = r10
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r17 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r18 = r0
            r0 = r10
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L43
            r0 = r18
            r1 = r16
            r2 = r10
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r18 = r0
        L43:
            r0 = r16
            r1 = 1
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r19 = r0
            r0 = r10
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "String"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r20 = r0
            r0 = 1
            r21 = r0
            r0 = r10
            java.lang.String r0 = getTypeName(r0)
            r22 = r0
            r0 = r10
            boolean r0 = r0.isEnumType()
            r23 = r0
            java.lang.String r0 = ", "
            r24 = r0
            java.lang.String r0 = ")"
            r25 = r0
            r0 = r13
            if (r0 == 0) goto L82
            java.lang.String r0 = "(super="
            r26 = r0
            goto L106
        L82:
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9e
            r0 = r23
            if (r0 == 0) goto L96
            java.lang.String r0 = ""
            goto L99
        L96:
            java.lang.String r0 = "()"
        L99:
            r26 = r0
            goto L106
        L9e:
            r0 = r12
            if (r0 == 0) goto L101
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r27 = r0
            r0 = r27
            java.lang.annotation.Annotation r0 = r0.getInc()
            if (r0 != 0) goto Lc0
            java.lang.String r0 = ""
            goto Lcd
        Lc0:
            r0 = r27
            java.lang.annotation.Annotation r0 = r0.getInc()
            lombok.ToString$Include r0 = (lombok.ToString.Include) r0
            java.lang.String r0 = r0.name()
        Lcd:
            r28 = r0
            r0 = r28
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le4
            r0 = r27
            java.lang.Object r0 = r0.getNode()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.String r0 = r0.getName()
            r28 = r0
        Le4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "("
            r1.<init>(r2)
            r1 = r28
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r26 = r0
            goto L106
        L101:
            java.lang.String r0 = "("
            r26 = r0
        L106:
            r0 = r23
            if (r0 != 0) goto L129
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r22
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r2 = r26
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r27 = r0
            goto L18b
        L129:
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r22
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = "."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3)
            r3 = r16
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r16
            r6 = r16
            r7 = r10
            java.lang.String r8 = "this"
            com.sun.tools.javac.util.Name r7 = r7.toName(r8)
            com.sun.tools.javac.tree.JCTree$JCIdent r6 = r6.Ident(r7)
            r7 = r10
            java.lang.String r8 = "name"
            com.sun.tools.javac.util.Name r7 = r7.toName(r8)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r5 = r5.Select(r6, r7)
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r3 = r3.Apply(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
            r0 = r26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18b
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r16
            r4 = r26
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
        L18b:
            r0 = r13
            if (r0 == 0) goto L1c4
            r0 = r16
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r16
            r3 = r16
            r4 = r10
            java.lang.String r5 = "super"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r10
            java.lang.String r5 = "toString"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r28 = r0
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
            r0 = 0
            r21 = r0
        L1c4:
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L327
        L1cf:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r28 = r0
            r0 = r28
            java.lang.Object r0 = r0.getNode()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r32 = r0
            r0 = r32
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L1fc
            r0 = r16
            r1 = r32
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createMethodAccessor(r0, r1)
            r31 = r0
            goto L207
        L1fc:
            r0 = r16
            r1 = r32
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r0, r1, r2)
            r31 = r0
        L207:
            r0 = r32
            r1 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.getFieldType(r0, r1)
            r33 = r0
            r0 = r33
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            r0 = r33
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L230
            r0 = r33
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L230
            r0 = 1
            goto L231
        L230:
            r0 = 0
        L231:
            r34 = r0
            r0 = r34
            if (r0 != 0) goto L244
            r0 = r33
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L244
            r0 = 1
            goto L245
        L244:
            r0 = 0
        L245:
            r35 = r0
            r0 = r34
            if (r0 != 0) goto L251
            r0 = r35
            if (r0 == 0) goto L28b
        L251:
            r0 = r10
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
            r6 = r35
            if (r6 == 0) goto L26f
            java.lang.String r6 = "deepToString"
            goto L271
        L26f:
            java.lang.String r6 = "toString"
        L271:
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r36 = r0
            r0 = r16
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r36
            r3 = r31
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r30 = r0
            goto L28f
        L28b:
            r0 = r31
            r30 = r0
        L28f:
            r0 = r21
            if (r0 == 0) goto L2a8
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r30
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
            r0 = 0
            r21 = r0
            goto L327
        L2a8:
            r0 = r12
            if (r0 == 0) goto L306
            r0 = r28
            java.lang.annotation.Annotation r0 = r0.getInc()
            if (r0 != 0) goto L2ba
            java.lang.String r0 = ""
            goto L2c7
        L2ba:
            r0 = r28
            java.lang.annotation.Annotation r0 = r0.getInc()
            lombok.ToString$Include r0 = (lombok.ToString.Include) r0
            java.lang.String r0 = r0.name()
        L2c7:
            r36 = r0
            r0 = r36
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d8
            r0 = r32
            java.lang.String r0 = r0.getName()
            r36 = r0
        L2d8:
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r6 = r24
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.<init>(r6)
            r5 = r36
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
            goto L319
        L306:
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r16
            r4 = r24
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
        L319:
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r30
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
        L327:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1cf
            r0 = r21
            if (r0 != 0) goto L349
            r0 = r16
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r27
            r3 = r16
            r4 = r25
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r27 = r0
        L349:
            r0 = r16
            r1 = r27
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r28 = r0
            r0 = r16
            r1 = 0
            r2 = r28
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r29 = r0
            r0 = r16
            r1 = r19
            r2 = r10
            java.lang.String r3 = "toString"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r20
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r29
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r30 = r0
            r0 = r10
            r1 = r30
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r30
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public static java.lang.String getTypeName(lombok.javac.JavacNode r4) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            goto L34
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.getName()
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
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
        L34:
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L48
            r0 = r6
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
        L48:
            r0 = r5
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$configuration$CallSuperType() {
            int[] r0 = lombok.javac.handlers.HandleToString.$SWITCH_TABLE$lombok$core$configuration$CallSuperType
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
            lombok.javac.handlers.HandleToString.$SWITCH_TABLE$lombok$core$configuration$CallSuperType = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m88x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleToString.f594x2486df07
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
            lombok.javac.handlers.HandleToString.f594x2486df07 = r1
            return r0
    }
}
