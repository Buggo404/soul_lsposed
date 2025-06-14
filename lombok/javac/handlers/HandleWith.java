package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleWith.SCL.lombok */
public class HandleWith extends lombok.javac.JavacAnnotationHandler<lombok.With> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f595x2486df07;

    public HandleWith() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void generateWithForType(lombok.javac.JavacNode r6, lombok.javac.JavacNode r7, lombok.AccessLevel r8, boolean r9) {
            r5 = this;
            r0 = r9
            if (r0 == 0) goto Lf
            java.lang.Class<lombok.With> r0 = lombok.With.class
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
            java.lang.String r1 = "@With is only supported on a class or a field."
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
            r0.generateWithForField(r1, r2, r3)
        Ldc:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L67
            return
    }

    public void generateWithForField(lombok.javac.JavacNode r9, com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r10, lombok.AccessLevel r11) {
            r8 = this;
            java.lang.Class<lombok.With> r0 = lombok.With.class
            r1 = r9
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r9
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r0.createWithForField(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.With> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.WITH_FLAG_USAGE
            java.lang.String r2 = "@With"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            java.util.Collection r0 = r0.upFromAnnotationToFields()
            r12 = r0
            r0 = r11
            java.lang.Class<lombok.With> r1 = lombok.With.class
            java.lang.String r2 = "lombok.experimental.Wither"
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1, r2)
            r0 = r11
            java.lang.String r1 = "lombok.AccessLevel"
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.With r0 = (lombok.With) r0
            lombok.AccessLevel r0 = r0.value()
            r14 = r0
            r0 = r14
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L41
            r0 = r13
            if (r0 != 0) goto L42
        L41:
            return
        L42:
            r0 = r10
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@With(onMethod"
            r3 = r11
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r15 = r0
            r0 = r10
            java.lang.String r1 = "onParam"
            java.lang.String r2 = "@With(onParam"
            r3 = r11
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r16 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r13
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L8d;
                case 3: goto L7c;
                default: goto Lb3;
            }
        L7c:
            r0 = r8
            r1 = r14
            r2 = r12
            r3 = r11
            r4 = 1
            r5 = r15
            r6 = r16
            r0.createWithForFields(r1, r2, r3, r4, r5, r6)
            goto Lb3
        L8d:
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9b
            r0 = r11
            java.lang.String r1 = "'onMethod' is not supported for @With on a type."
            r0.addError(r1)
        L9b:
            r0 = r16
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La9
            r0 = r11
            java.lang.String r1 = "'onParam' is not supported for @With on a type."
            r0.addError(r1)
        La9:
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = r14
            r4 = 0
            r0.generateWithForType(r1, r2, r3, r4)
        Lb3:
            return
    }

    public void createWithForFields(lombok.AccessLevel r9, java.util.Collection<lombok.javac.JavacNode> r10, lombok.javac.JavacNode r11, boolean r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14) {
            r8 = this;
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto L25
        Lb:
            r0 = r16
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r15 = r0
            r0 = r8
            r1 = r9
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.createWithForField(r1, r2, r3, r4, r5, r6)
        L25:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createWithForField(lombok.AccessLevel r11, lombok.javac.JavacNode r12, lombok.javac.JavacNode r13, boolean r14, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r15, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r16) {
            r10 = this;
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L34
            r0 = r17
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L34
            r0 = r17
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
            r18 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L48
            r0 = r12
            java.lang.String r1 = "@With is only supported on a class or a field."
            r0.addError(r1)
            return
        L48:
            r0 = r12
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r19 = r0
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r20 = r0
            r0 = r12
            r1 = r19
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toWithName(r0, r1)
            r21 = r0
            r0 = r21
            if (r0 != 0) goto L6c
            r0 = r12
            java.lang.String r1 = "Not generating a withX method for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L6c:
            r0 = r20
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L9f
            r0 = r14
            if (r0 == 0) goto L9e
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r21
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for static fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
        L9e:
            return
        L9f:
            r0 = r20
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lda
            r0 = r20
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto Lda
            r0 = r14
            if (r0 == 0) goto Ld9
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r21
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for final, initialized fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
        Ld9:
            return
        Lda:
            r0 = r20
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L10c
            r0 = r14
            if (r0 == 0) goto L10b
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r21
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for fields starting with $."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
        L10b:
            return
        L10c:
            r0 = r12
            r1 = r19
            java.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.toAllWithNames(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r23 = r0
            goto L18f
        L11c:
            r0 = r23
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            int[] r0 = m90x2486df07()
            r1 = r22
            r2 = r12
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
            r0 = r14
            if (r0 == 0) goto L18e
            java.lang.String r0 = ""
            r24 = r0
            r0 = r22
            r1 = r21
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L176
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r22
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r24 = r0
        L176:
            r0 = r12
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r21
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r24
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        L18e:
            return
        L18f:
            r0 = r23
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11c
            r0 = r11
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            long r0 = (long) r0
            r22 = r0
            r0 = r10
            r1 = r22
            r2 = r12
            r3 = r12
            lombok.javac.JavacTreeMaker r3 = r3.getTreeMaker()
            r4 = r13
            r5 = r15
            r6 = r16
            r7 = r18
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createWith(r1, r2, r3, r4, r5, r6, r7)
            r24 = r0
            r0 = r12
            r1 = r24
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r24
            r1 = r13
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r17
            r1 = r24
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createWith(long r11, lombok.javac.JavacNode r13, lombok.javac.JavacTreeMaker r14, lombok.javac.JavacNode r15, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r16, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r17, boolean r18) {
            r10 = this;
            r0 = r13
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toWithName(r0)
            r19 = r0
            r0 = r19
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r20 = r0
            r0 = r13
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r0)
            r21 = r0
            r0 = r13
            r1 = r19
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r22 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r0)
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r25 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r1 = r21
            com.sun.tools.javac.util.List r0 = r0.appendList(r1)
            r27 = r0
            r0 = r14
            r1 = r20
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r28 = r0
            r0 = r14
            r1 = r14
            r2 = r25
            r3 = r27
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r20
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r28
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r29 = r0
            r0 = r18
            if (r0 != 0) goto L1cd
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r30 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r0)
            r31 = r0
            r0 = r31
            if (r0 != 0) goto L86
            r0 = 0
            return r0
        L86:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r32 = r0
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r34 = r0
            goto L135
        La1:
            r0 = r34
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r33 = r0
            r0 = r33
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lbb
            goto L135
        Lbb:
            r0 = r33
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r35 = r0
            r0 = r35
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Ld8
            goto L135
        Ld8:
            r0 = r35
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r36 = r0
            r0 = r36
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf0
            goto L135
        Lf0:
            r0 = r36
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L106
            r0 = r35
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto L106
            goto L135
        L106:
            r0 = r33
            java.lang.Object r0 = r0.get()
            r1 = r13
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L125
            r0 = r32
            r1 = r14
            r2 = r20
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L135
        L125:
            r0 = r32
            r1 = r14
            r2 = r33
            lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L135:
            r0 = r34
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La1
            r0 = r14
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r31
            r4 = r32
            com.sun.tools.javac.util.List r4 = r4.toList()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r33 = r0
            r0 = r14
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r14
            r3 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r4 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r2, r3, r4)
            r3 = r14
            r4 = r20
            com.sun.tools.javac.util.Name r4 = r4.name
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r34 = r0
            r0 = r14
            r1 = r34
            r2 = r14
            r3 = r13
            java.lang.String r4 = "this"
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r33
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r35 = r0
            r0 = r14
            r1 = r35
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r36 = r0
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 != 0) goto L1a1
            r0 = r30
            r1 = r36
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L1c0
        L1a1:
            r0 = r14
            r1 = r13
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = lombok.javac.handlers.JavacHandlerUtil.generateNullCheck(r0, r1, r2)
            r37 = r0
            r0 = r37
            if (r0 == 0) goto L1b8
            r0 = r30
            r1 = r37
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1b8:
            r0 = r30
            r1 = r36
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1c0:
            r0 = r14
            r1 = 0
            r2 = r30
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r24 = r0
        L1cd:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r30 = r0
            r0 = r29
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r31 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r32 = r0
            r0 = 0
            r33 = r0
            r0 = r16
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r34 = r0
            r0 = r15
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            r35 = r0
            r0 = r35
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L20e
            r0 = r34
            r1 = r14
            r2 = r15
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r34 = r0
        L20e:
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isFieldDeprecated(r0)
            if (r0 == 0) goto L232
            r0 = r34
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
            r34 = r0
        L232:
            r0 = r18
            if (r0 == 0) goto L23d
            r0 = r11
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 | r1
            r11 = r0
        L23d:
            r0 = r13
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r36 = r0
            r0 = r13
            r1 = r36
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.shouldMakeFinal(r0, r1)
            r37 = r0
            r0 = r37
            if (r0 == 0) goto L256
            r0 = r11
            r1 = 16
            long r0 = r0 | r1
            r11 = r0
        L256:
            r0 = r14
            r1 = r14
            r2 = r11
            r3 = r34
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r22
            r3 = r23
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r24
            r8 = r33
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r38 = r0
            r0 = r13
            r1 = r38
            lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r2 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.WITH
            lombok.javac.handlers.JavacHandlerUtil.copyJavadoc(r0, r1, r2)
            r0 = r38
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleWith.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.handlers.HandleWith.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m90x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleWith.f595x2486df07
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
            lombok.javac.handlers.HandleWith.f595x2486df07 = r1
            return r0
    }
}
