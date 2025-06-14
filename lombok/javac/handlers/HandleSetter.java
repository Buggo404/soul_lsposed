package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleSetter.SCL.lombok */
public class HandleSetter extends lombok.javac.JavacAnnotationHandler<lombok.Setter> {
    private static final java.lang.String SETTER_NODE_NOT_SUPPORTED_ERR = "@Setter is only supported on a class or a field.";
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f592x2486df07;

    public HandleSetter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void generateSetterForType(lombok.javac.JavacNode r8, lombok.javac.JavacNode r9, lombok.AccessLevel r10, boolean r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto Lf
            java.lang.Class<lombok.Setter> r0 = lombok.Setter.class
            r1 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto L1d
            r0 = r9
            java.lang.String r1 = "@Setter is only supported on a class or a field."
            r0.addError(r1)
            return
        L1d:
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L94
        L29:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r14 = r0
            r0 = r14
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L43
            goto L94
        L43:
            r0 = r14
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r16 = r0
            r0 = r16
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L60
            goto L94
        L60:
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L74
            goto L94
        L74:
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L88
            goto L94
        L88:
            r0 = r7
            r1 = r14
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r0.generateSetterForField(r1, r2, r3, r4, r5)
        L94:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L29
            return
    }

    public void generateSetterForField(lombok.javac.JavacNode r9, lombok.javac.JavacNode r10, lombok.AccessLevel r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13) {
            r8 = this;
            java.lang.Class<lombok.Setter> r0 = lombok.Setter.class
            r1 = r9
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = 0
            r5 = r12
            r6 = r13
            r0.createSetterForField(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Setter> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SETTER_FLAG_USAGE
            java.lang.String r2 = "@Setter"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            java.util.Collection r0 = r0.upFromAnnotationToFields()
            r12 = r0
            r0 = r11
            java.lang.Class<lombok.Setter> r1 = lombok.Setter.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r11
            java.lang.String r1 = "lombok.AccessLevel"
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Setter r0 = (lombok.Setter) r0
            lombok.AccessLevel r0 = r0.value()
            r14 = r0
            r0 = r14
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L3f
            r0 = r13
            if (r0 != 0) goto L40
        L3f:
            return
        L40:
            r0 = r10
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@Setter(onMethod"
            r3 = r11
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r15 = r0
            r0 = r10
            java.lang.String r1 = "onParam"
            java.lang.String r2 = "@Setter(onParam"
            r3 = r11
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r16 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r13
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L89;
                case 3: goto L78;
                default: goto L97;
            }
        L78:
            r0 = r8
            r1 = r14
            r2 = r12
            r3 = r11
            r4 = 1
            r5 = r15
            r6 = r16
            r0.createSetterForFields(r1, r2, r3, r4, r5, r6)
            goto L97
        L89:
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = r14
            r4 = 0
            r5 = r15
            r6 = r16
            r0.generateSetterForType(r1, r2, r3, r4, r5, r6)
        L97:
            return
    }

    public void createSetterForFields(lombok.AccessLevel r9, java.util.Collection<lombok.javac.JavacNode> r10, lombok.javac.JavacNode r11, boolean r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14) {
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
            r0.createSetterForField(r1, r2, r3, r4, r5, r6)
        L25:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createSetterForField(lombok.AccessLevel r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11, boolean r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14) {
            r8 = this;
            r0 = r10
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L11
            r0 = r10
            java.lang.String r1 = "@Setter is only supported on a class or a field."
            r0.addError(r1)
            return
        L11:
            r0 = r10
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r15 = r0
            r0 = r10
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r16 = r0
            r0 = r10
            r1 = r15
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toSetterName(r0, r1)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L34
            r0 = r10
            java.lang.String r1 = "Not generating setter for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L34:
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4c
            r0 = r10
            java.lang.String r1 = "Not generating setter for this field: Setters cannot be generated for final fields."
            r0.addWarning(r1)
            return
        L4c:
            r0 = r10
            r1 = r15
            java.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.toAllSetterNames(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r19 = r0
            goto Lcf
        L5c:
            r0 = r19
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r18 = r0
            int[] r0 = m86x2486df07()
            r1 = r18
            r2 = r10
            r3 = 0
            r4 = 1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lcf;
                case 2: goto L90;
                case 3: goto L91;
                default: goto Lcf;
            }
        L90:
            return
        L91:
            r0 = r12
            if (r0 == 0) goto Lce
            java.lang.String r0 = ""
            r20 = r0
            r0 = r18
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r18
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r20 = r0
        Lb6:
            r0 = r10
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r17
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r20
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        Lce:
            return
        Lcf:
            r0 = r19
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5c
            r0 = r9
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            long r0 = (long) r0
            r1 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 & r2
            long r0 = r0 | r1
            r18 = r0
            r0 = r18
            r1 = r10
            r2 = r10
            lombok.javac.JavacTreeMaker r2 = r2.getTreeMaker()
            r3 = r11
            r4 = r13
            r5 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createSetter(r0, r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r1 = r20
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl createSetter(long r13, lombok.javac.JavacNode r15, lombok.javac.JavacTreeMaker r16, lombok.javac.JavacNode r17, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r18, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r19) {
            r0 = r15
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r20 = r0
            r0 = r15
            r1 = r20
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toSetterName(r0, r1)
            r21 = r0
            r0 = r15
            r1 = r20
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.shouldReturnThis(r0, r1)
            r22 = r0
            r0 = r13
            r1 = 0
            r2 = r15
            r3 = r16
            r4 = r21
            r5 = 0
            r6 = 0
            r7 = r22
            r8 = r17
            r9 = r18
            r10 = r19
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r23 = r0
            r0 = r23
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl createSetter(long r14, boolean r16, lombok.javac.JavacNode r17, lombok.javac.JavacTreeMaker r18, java.lang.String r19, com.sun.tools.javac.util.Name r20, com.sun.tools.javac.util.Name r21, boolean r22, lombok.javac.JavacNode r23, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r24, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r25) {
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r22
            if (r0 == 0) goto L33
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r0)
            r26 = r0
            r0 = r26
            r1 = r18
            r2 = r17
            r3 = r23
            lombok.core.configuration.CheckerFrameworkVersion r3 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2, r3)
            r26 = r0
            r0 = r18
            r1 = r18
            r2 = r17
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r27 = r0
        L33:
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r26
            r8 = r27
            r9 = r23
            r10 = r24
            r11 = r25
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl createSetterWithRecv(long r15, boolean r17, lombok.javac.JavacNode r18, lombok.javac.JavacTreeMaker r19, java.lang.String r20, com.sun.tools.javac.util.Name r21, com.sun.tools.javac.util.Name r22, boolean r23, lombok.javac.JavacNode r24, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r25, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r26, com.sun.tools.javac.tree.JCTree.JCVariableDecl r27) {
            r0 = 0
            r28 = r0
            r0 = 0
            r29 = r0
            r0 = r23
            if (r0 == 0) goto L33
            r0 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r0)
            r28 = r0
            r0 = r28
            r1 = r19
            r2 = r18
            r3 = r24
            lombok.core.configuration.CheckerFrameworkVersion r3 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2, r3)
            r28 = r0
            r0 = r19
            r1 = r19
            r2 = r18
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r29 = r0
        L33:
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r28
            r8 = r29
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createSetterWithRecv(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r30 = r0
            r0 = r30
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl createSetter(long r15, boolean r17, lombok.javac.JavacNode r18, lombok.javac.JavacTreeMaker r19, java.lang.String r20, com.sun.tools.javac.util.Name r21, com.sun.tools.javac.util.Name r22, com.sun.tools.javac.tree.JCTree.JCExpression r23, com.sun.tools.javac.tree.JCTree.JCStatement r24, lombok.javac.JavacNode r25, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r26, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r27) {
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createSetterWithRecv(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl createSetterWithRecv(long r11, boolean r13, lombok.javac.JavacNode r14, lombok.javac.JavacTreeMaker r15, java.lang.String r16, com.sun.tools.javac.util.Name r17, com.sun.tools.javac.util.Name r18, com.sun.tools.javac.tree.JCTree.JCExpression r19, com.sun.tools.javac.tree.JCTree.JCStatement r20, lombok.javac.JavacNode r21, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r22, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r23, com.sun.tools.javac.tree.JCTree.JCVariableDecl r24) {
            r0 = r16
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            r0 = r14
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r25 = r0
            r0 = r17
            if (r0 != 0) goto L1c
            r0 = r25
            com.sun.tools.javac.util.Name r0 = r0.name
            r17 = r0
        L1c:
            r0 = r15
            r1 = r14
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r0, r1, r2)
            r26 = r0
            r0 = r15
            r1 = r26
            r2 = r15
            r3 = r17
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r27 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = r14
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r0)
            r29 = r0
            r0 = r14
            r1 = r16
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r30 = r0
            r0 = r23
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r1 = r29
            com.sun.tools.javac.util.List r0 = r0.appendList(r1)
            r31 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r14
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r32 = r0
            r0 = r15
            r1 = r25
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r21
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r34 = r0
            r0 = r15
            r1 = r15
            r2 = r32
            r3 = r31
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r17
            r3 = r34
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r35 = r0
            r0 = r14
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 != 0) goto La9
            r0 = r14
            r1 = r23
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasNonNullAnnotations(r0, r1)
            if (r0 != 0) goto La9
            r0 = r28
            r1 = r15
            r2 = r27
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto Ld4
        La9:
            r0 = r15
            r1 = r25
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r17
            r3 = r21
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = lombok.javac.handlers.JavacHandlerUtil.generateNullCheck(r0, r1, r2, r3, r4)
            r36 = r0
            r0 = r36
            if (r0 == 0) goto Lc7
            r0 = r28
            r1 = r36
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Lc7:
            r0 = r28
            r1 = r15
            r2 = r27
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Ld4:
            r0 = r18
            if (r0 == 0) goto L100
            r0 = r15
            r1 = r15
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r15
            lombok.javac.JavacTreeMaker$TypeTag r3 = lombok.javac.Javac.CTC_BOOLEAN
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r36 = r0
            r0 = r28
            r1 = r15
            r2 = r36
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L100:
            r0 = r19
            if (r0 != 0) goto L119
            r0 = r15
            r1 = r14
            com.sun.tools.javac.code.Symtab r1 = r1.getSymbolTable()
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_VOID
            com.sun.tools.javac.code.Type r1 = lombok.javac.Javac.createVoidType(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.Type(r1)
            r19 = r0
            r0 = 0
            r20 = r0
        L119:
            r0 = r20
            if (r0 == 0) goto L126
            r0 = r28
            r1 = r20
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L126:
            r0 = r15
            r1 = 0
            r2 = r28
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r36 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r37 = r0
            r0 = r35
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r38 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r39 = r0
            r0 = 0
            r40 = r0
            r0 = r22
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r1 = r14
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.findCopyableToSetterAnnotations(r1)
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.mergeAnnotations(r0, r1)
            r41 = r0
            r0 = r14
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isFieldDeprecated(r0)
            if (r0 != 0) goto L160
            r0 = r13
            if (r0 == 0) goto L17d
        L160:
            r0 = r41
            r1 = r15
            r2 = r14
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
            r41 = r0
        L17d:
            r0 = r14
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r42 = r0
            r0 = r14
            r1 = r42
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.shouldMakeFinal(r0, r1)
            if (r0 == 0) goto L192
            r0 = r11
            r1 = 16
            long r0 = r0 | r1
            r11 = r0
        L192:
            r0 = r24
            if (r0 == 0) goto L1c1
            r0 = r15
            boolean r0 = r0.hasMethodDefWithRecvParam()
            if (r0 == 0) goto L1c1
            r0 = r15
            r1 = r15
            r2 = r11
            r3 = r41
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r30
            r3 = r19
            r4 = r37
            r5 = r24
            r6 = r38
            r7 = r39
            r8 = r36
            r9 = r40
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDefWithRecvParam(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r43 = r0
            goto L1de
        L1c1:
            r0 = r15
            r1 = r15
            r2 = r11
            r3 = r41
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r30
            r3 = r19
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r36
            r8 = r40
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r43 = r0
        L1de:
            r0 = r20
            if (r0 == 0) goto L1ea
            r0 = r21
            r1 = r43
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L1ea:
            r0 = r43
            r1 = r21
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r44 = r0
            r0 = r14
            r1 = r44
            lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r2 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.SETTER
            r3 = r20
            if (r3 == 0) goto L205
            r3 = 1
            goto L206
        L205:
            r3 = 0
        L206:
            lombok.javac.handlers.JavacHandlerUtil.copyJavadoc(r0, r1, r2, r3)
            r0 = r44
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleSetter.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.handlers.HandleSetter.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m86x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleSetter.f592x2486df07
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
            lombok.javac.handlers.HandleSetter.f592x2486df07 = r1
            return r0
    }
}
