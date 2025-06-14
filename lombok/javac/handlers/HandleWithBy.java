package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleWithBy.SCL.lombok */
public class HandleWithBy extends lombok.javac.JavacAnnotationHandler<lombok.experimental.WithBy> {
    private static final lombok.core.LombokImmutableList<java.lang.String> NAME_JUF_FUNCTION = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> NAME_JUF_OP = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> NAME_JUF_DOUBLEOP = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> NAME_JUF_INTOP = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> NAME_JUF_LONGOP = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f596x2486df07;

    static {
            java.lang.String r0 = "java"
            java.lang.String r1 = "util"
            java.lang.String r2 = "function"
            java.lang.String r3 = "Function"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m63of(r0, r1, r2, r3)
            lombok.javac.handlers.HandleWithBy.NAME_JUF_FUNCTION = r0
            java.lang.String r0 = "java"
            java.lang.String r1 = "util"
            java.lang.String r2 = "function"
            java.lang.String r3 = "UnaryOperator"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m63of(r0, r1, r2, r3)
            lombok.javac.handlers.HandleWithBy.NAME_JUF_OP = r0
            java.lang.String r0 = "java"
            java.lang.String r1 = "util"
            java.lang.String r2 = "function"
            java.lang.String r3 = "DoubleUnaryOperator"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m63of(r0, r1, r2, r3)
            lombok.javac.handlers.HandleWithBy.NAME_JUF_DOUBLEOP = r0
            java.lang.String r0 = "java"
            java.lang.String r1 = "util"
            java.lang.String r2 = "function"
            java.lang.String r3 = "IntUnaryOperator"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m63of(r0, r1, r2, r3)
            lombok.javac.handlers.HandleWithBy.NAME_JUF_INTOP = r0
            java.lang.String r0 = "java"
            java.lang.String r1 = "util"
            java.lang.String r2 = "function"
            java.lang.String r3 = "LongUnaryOperator"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m63of(r0, r1, r2, r3)
            lombok.javac.handlers.HandleWithBy.NAME_JUF_LONGOP = r0
            return
    }

    public HandleWithBy() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void generateWithByForType(lombok.javac.JavacNode r6, lombok.javac.JavacNode r7, lombok.AccessLevel r8, boolean r9) {
            r5 = this;
            r0 = r9
            if (r0 == 0) goto Lf
            java.lang.Class<lombok.experimental.WithBy> r0 = lombok.experimental.WithBy.class
            r1 = r6
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = 0
            r10 = r0
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L25
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r10 = r0
        L25:
            r0 = r10
            if (r0 != 0) goto L2e
            r0 = 0
            goto L36
        L2e:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
        L36:
            r11 = r0
            r0 = r11
            r1 = 25088(0x6200, double:1.2395E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            r13 = r0
            r0 = r10
            if (r0 == 0) goto L54
            r0 = r13
            if (r0 == 0) goto L5b
        L54:
            r0 = r7
            java.lang.String r1 = "@WithBy is only supported on a class or a field."
            r0.addError(r1)
            return
        L5b:
            r0 = r6
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto Ldc
        L67:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r14 = r0
            r0 = r14
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L81
            goto Ldc
        L81:
            r0 = r14
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r16 = r0
            r0 = r16
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L9e
            goto Ldc
        L9e:
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb2
            goto Ldc
        Lb2:
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lce
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto Lce
            goto Ldc
        Lce:
            r0 = r5
            r1 = r14
            r2 = r7
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r2 = (com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition) r2
            r3 = r8
            r0.generateWithByForField(r1, r2, r3)
        Ldc:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L67
            return
    }

    public void generateWithByForField(lombok.javac.JavacNode r8, com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9, lombok.AccessLevel r10) {
            r7 = this;
            java.lang.Class<lombok.experimental.WithBy> r0 = lombok.experimental.WithBy.class
            r1 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            r0 = r7
            r1 = r10
            r2 = r8
            r3 = r8
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r0.createWithByForField(r1, r2, r3, r4, r5)
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.WithBy> r8, com.sun.tools.javac.tree.JCTree.JCAnnotation r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.WITHBY_FLAG_USAGE
            java.lang.String r2 = "@WithBy"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r10
            java.lang.Class<lombok.experimental.WithBy> r1 = lombok.experimental.WithBy.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r10
            java.lang.String r1 = "lombok.AccessLevel"
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.WithBy r0 = (lombok.experimental.WithBy) r0
            lombok.AccessLevel r0 = r0.value()
            r12 = r0
            r0 = r12
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L39
            r0 = r11
            if (r0 != 0) goto L3a
        L39:
            return
        L3a:
            r0 = r9
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@WithBy(onMethod"
            r3 = r10
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r13 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r11
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L79;
                case 3: goto L68;
                default: goto L92;
            }
        L68:
            r0 = r7
            r1 = r12
            r2 = r10
            java.util.Collection r2 = r2.upFromAnnotationToFields()
            r3 = r10
            r4 = 1
            r5 = r13
            r0.createWithByForFields(r1, r2, r3, r4, r5)
            goto L92
        L79:
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L88
            r0 = r10
            java.lang.String r1 = "'onMethod' is not supported for @WithBy on a type."
            r0.addError(r1)
        L88:
            r0 = r7
            r1 = r11
            r2 = r10
            r3 = r12
            r4 = 0
            r0.generateWithByForType(r1, r2, r3, r4)
        L92:
            return
    }

    public void createWithByForFields(lombok.AccessLevel r8, java.util.Collection<lombok.javac.JavacNode> r9, lombok.javac.JavacNode r10, boolean r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12) {
            r7 = this;
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L23
        Lb:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r13
            r3 = r10
            r4 = r11
            r5 = r12
            r0.createWithByForField(r1, r2, r3, r4, r5)
        L23:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createWithByForField(lombok.AccessLevel r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12, boolean r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14) {
            r9 = this;
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L34
            r0 = r15
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L34
            r0 = r15
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r16 = r0
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L48
            r0 = r11
            java.lang.String r1 = "@WithBy is only supported on a class or a field."
            r0.addError(r1)
            return
        L48:
            r0 = r11
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r17 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r18 = r0
            r0 = r11
            r1 = r17
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toWithByName(r0, r1)
            r19 = r0
            r0 = r19
            if (r0 != 0) goto L6c
            r0 = r11
            java.lang.String r1 = "Not generating a withXBy method for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L6c:
            r0 = r18
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L9f
            r0 = r13
            if (r0 == 0) goto L9e
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r19
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: WithBy methods cannot be generated for static fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
        L9e:
            return
        L9f:
            r0 = r18
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lda
            r0 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto Lda
            r0 = r13
            if (r0 == 0) goto Ld9
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r19
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: WithBy methods cannot be generated for final, initialized fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
        Ld9:
            return
        Lda:
            r0 = r18
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L10c
            r0 = r13
            if (r0 == 0) goto L10b
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r19
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: WithBy methods cannot be generated for fields starting with $."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
        L10b:
            return
        L10c:
            r0 = r11
            r1 = r17
            java.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.toAllWithByNames(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L18f
        L11c:
            r0 = r21
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            int[] r0 = m91x2486df07()
            r1 = r20
            r2 = r11
            r3 = 0
            r4 = 1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L18f;
                case 2: goto L150;
                case 3: goto L151;
                default: goto L18f;
            }
        L150:
            return
        L151:
            r0 = r13
            if (r0 == 0) goto L18e
            java.lang.String r0 = ""
            r22 = r0
            r0 = r20
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L176
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r20
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r22 = r0
        L176:
            r0 = r11
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r19
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r22
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        L18e:
            return
        L18f:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11c
            r0 = r10
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            long r0 = (long) r0
            r20 = r0
            r0 = r9
            r1 = r20
            r2 = r11
            r3 = r11
            lombok.javac.JavacTreeMaker r3 = r3.getTreeMaker()
            r4 = r12
            r5 = r14
            r6 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createWithBy(r1, r2, r3, r4, r5, r6)
            r22 = r0
            r0 = r22
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r15
            r1 = r22
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createWithBy(long r11, lombok.javac.JavacNode r13, lombok.javac.JavacTreeMaker r14, lombok.javac.JavacNode r15, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r16, boolean r17) {
            r10 = this;
            r0 = r13
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toWithByName(r0)
            r18 = r0
            r0 = r18
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r19 = r0
            r0 = r13
            r1 = r18
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r20 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r0)
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r23 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 1
            r28 = r0
            java.lang.String r0 = "apply"
            r29 = r0
            r0 = r19
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L100
            r0 = r19
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree) r0
            javax.lang.model.type.TypeKind r0 = r0.getPrimitiveTypeKind()
            r30 = r0
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.CHAR
            if (r0 != r1) goto L71
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_CHAR
            r26 = r0
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_INTOP
            r25 = r0
            goto L100
        L71:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.SHORT
            if (r0 != r1) goto L86
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_SHORT
            r26 = r0
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_INTOP
            r25 = r0
            goto L100
        L86:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BYTE
            if (r0 != r1) goto L9b
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BYTE
            r26 = r0
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_INTOP
            r25 = r0
            goto L100
        L9b:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.INT
            if (r0 != r1) goto Lab
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_INTOP
            r25 = r0
            goto L100
        Lab:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.LONG
            if (r0 != r1) goto Lbb
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_LONGOP
            r25 = r0
            goto L100
        Lbb:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.FLOAT
            if (r0 != r1) goto Ld0
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_DOUBLEOP
            r25 = r0
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_FLOAT
            r26 = r0
            goto L100
        Ld0:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DOUBLE
            if (r0 != r1) goto Le0
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_DOUBLEOP
            r25 = r0
            goto L100
        Le0:
            r0 = r30
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BOOLEAN
            if (r0 != r1) goto L100
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_OP
            r25 = r0
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Boolean"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r27 = r0
            r0 = 0
            r28 = r0
        L100:
            r0 = r25
            if (r0 != 0) goto L118
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.HandleWithBy.NAME_JUF_FUNCTION
            r25 = r0
            r0 = r14
            r1 = r19
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r27 = r0
        L118:
            r0 = r25
            lombok.core.LombokImmutableList<java.lang.String> r1 = lombok.javac.handlers.HandleWithBy.NAME_JUF_INTOP
            if (r0 != r1) goto L125
            java.lang.String r0 = "applyAsInt"
            r29 = r0
        L125:
            r0 = r25
            lombok.core.LombokImmutableList<java.lang.String> r1 = lombok.javac.handlers.HandleWithBy.NAME_JUF_LONGOP
            if (r0 != r1) goto L132
            java.lang.String r0 = "applyAsLong"
            r29 = r0
        L132:
            r0 = r25
            lombok.core.LombokImmutableList<java.lang.String> r1 = lombok.javac.handlers.HandleWithBy.NAME_JUF_DOUBLEOP
            if (r0 != r1) goto L13f
            java.lang.String r0 = "applyAsDouble"
            r29 = r0
        L13f:
            r0 = r13
            r1 = r25
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1)
            r30 = r0
            r0 = r27
            if (r0 == 0) goto L192
            r0 = r28
            if (r0 == 0) goto L192
            r0 = r27
            r31 = r0
            r0 = r14
            r1 = r27
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r32 = r0
            r0 = r14
            r1 = r14
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.SUPER
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = r31
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r33 = r0
            r0 = r14
            r1 = r14
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.EXTENDS
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = r32
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r34 = r0
            r0 = r14
            r1 = r30
            r2 = r33
            r3 = r34
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r30 = r0
        L192:
            r0 = r27
            if (r0 == 0) goto L1aa
            r0 = r28
            if (r0 != 0) goto L1aa
            r0 = r14
            r1 = r30
            r2 = r27
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r30 = r0
        L1aa:
            r0 = r13
            java.lang.String r1 = "transformer"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r31 = r0
            r0 = r14
            r1 = r14
            r2 = r23
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r31
            r3 = r30
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r32 = r0
            r0 = r17
            if (r0 != 0) goto L301
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r0)
            r34 = r0
            r0 = r34
            if (r0 != 0) goto L1e1
            r0 = 0
            return r0
        L1e1:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r35 = r0
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r37 = r0
            goto L2c6
        L1fc:
            r0 = r37
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r36 = r0
            r0 = r36
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L216
            goto L2c6
        L216:
            r0 = r36
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r38 = r0
            r0 = r38
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L233
            goto L2c6
        L233:
            r0 = r38
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r39 = r0
            r0 = r39
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24b
            goto L2c6
        L24b:
            r0 = r39
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L261
            r0 = r38
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto L261
            goto L2c6
        L261:
            r0 = r36
            java.lang.Object r0 = r0.get()
            r1 = r13
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L2b6
            r0 = r14
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r14
            r3 = r14
            r4 = r31
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            r5 = r29
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r14
            r4 = r36
            lombok.core.handlers.HandlerUtil$FieldAccess r5 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r3, r4, r5)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r41 = r0
            r0 = r26
            if (r0 == 0) goto L2ab
            r0 = r14
            r1 = r14
            r2 = r26
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r1 = r1.TypeIdent(r2)
            r2 = r41
            com.sun.tools.javac.tree.JCTree$JCTypeCast r0 = r0.TypeCast(r1, r2)
            r41 = r0
        L2ab:
            r0 = r35
            r1 = r41
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L2c6
        L2b6:
            r0 = r35
            r1 = r14
            r2 = r36
            lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L2c6:
            r0 = r37
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1fc
            r0 = r14
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r34
            r4 = r35
            com.sun.tools.javac.util.List r4 = r4.toList()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r36 = r0
            r0 = r14
            r1 = r36
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r37 = r0
            r0 = r33
            r1 = r37
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            r1 = 0
            r2 = r33
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r22 = r0
        L301:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r33 = r0
            r0 = r32
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r34 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r35 = r0
            r0 = 0
            r36 = r0
            r0 = r16
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r37 = r0
            r0 = r15
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            r38 = r0
            r0 = r38
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L342
            r0 = r37
            r1 = r14
            r2 = r15
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r37 = r0
        L342:
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isFieldDeprecated(r0)
            if (r0 == 0) goto L366
            r0 = r37
            r1 = r14
            r2 = r13
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Deprecated"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r37 = r0
        L366:
            r0 = r17
            if (r0 == 0) goto L371
            r0 = r11
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 | r1
            r11 = r0
        L371:
            r0 = r13
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r39 = r0
            r0 = r13
            r1 = r39
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.shouldMakeFinal(r0, r1)
            r40 = r0
            r0 = r40
            if (r0 == 0) goto L38a
            r0 = r11
            r1 = 16
            long r0 = r0 | r1
            r11 = r0
        L38a:
            r0 = r15
            r1 = r32
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r14
            r1 = r14
            r2 = r11
            r3 = r37
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r20
            r3 = r21
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r22
            r8 = r36
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r41 = r0
            r0 = r13
            r1 = r41
            lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r2 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.WITH_BY
            lombok.javac.handlers.JavacHandlerUtil.copyJavadoc(r0, r1, r2)
            r0 = r15
            r1 = r41
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r41
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleWithBy.$SWITCH_TABLE$lombok$core$AST$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.AST$Kind[] r0 = lombok.core.AST.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.INITIALIZER     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL     // Catch: java.lang.NoSuchFieldError -> L60
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            goto L61
        L60:
        L61:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L6d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            goto L6e
        L6d:
        L6e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.NoSuchFieldError -> L7b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            goto L7c
        L7b:
        L7c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE_USE     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleWithBy.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m91x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleWithBy.f596x2486df07
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
            lombok.javac.handlers.HandleWithBy.f596x2486df07 = r1
            return r0
    }
}
