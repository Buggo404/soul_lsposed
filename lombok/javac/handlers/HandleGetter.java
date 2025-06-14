package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleGetter.SCL.lombok */
public class HandleGetter extends lombok.javac.JavacAnnotationHandler<lombok.Getter> {
    private static final java.lang.String GETTER_NODE_NOT_SUPPORTED_ERR = "@Getter is only supported on a class, an enum, or a field.";

    /* renamed from: AR */
    private static final java.lang.String f589AR = "java.util.concurrent.atomic.AtomicReference";
    private static final com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> NIL_EXPRESSION = null;
    public static final java.util.Map<lombok.javac.JavacTreeMaker.TypeTag, java.lang.String> TYPE_MAP = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f590x2486df07;

    static {
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            lombok.javac.handlers.HandleGetter.NIL_EXPRESSION = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            java.lang.String r2 = "Integer"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_DOUBLE
            java.lang.String r2 = "Double"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_FLOAT
            java.lang.String r2 = "Float"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_SHORT
            java.lang.String r2 = "Short"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BYTE
            java.lang.String r2 = "Byte"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_LONG
            java.lang.String r2 = "Long"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOOLEAN
            java.lang.String r2 = "Boolean"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_CHAR
            java.lang.String r2 = "Character"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.javac.handlers.HandleGetter.TYPE_MAP = r0
            return
    }

    public HandleGetter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void generateGetterForType(lombok.javac.JavacNode r8, lombok.javac.JavacNode r9, lombok.AccessLevel r10, boolean r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto Lf
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L1d
            r0 = r9
            java.lang.String r1 = "@Getter is only supported on a class, an enum, or a field."
            r0.addError(r1)
            return
        L1d:
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L4e
        L29:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r13
            boolean r0 = fieldQualifiesForGetterGeneration(r0)
            if (r0 == 0) goto L4e
            r0 = r7
            r1 = r13
            r2 = r9
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r2 = (com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition) r2
            r3 = r10
            r4 = 0
            r5 = r12
            r0.generateGetterForField(r1, r2, r3, r4, r5)
        L4e:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L29
            return
    }

    public static boolean fieldQualifiesForGetterGeneration(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L25
            r0 = 0
            return r0
        L25:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
            r0 = 0
            return r0
        L37:
            r0 = 1
            return r0
    }

    public void generateGetterForField(lombok.javac.JavacNode r9, com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r10, lombok.AccessLevel r11, boolean r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r13) {
            r8 = this;
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
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
            r5 = r12
            r6 = r13
            r0.createGetterForField(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Getter> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.GETTER_FLAG_USAGE
            java.lang.String r2 = "@Getter"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            java.util.Collection r0 = r0.upFromAnnotationToFields()
            r12 = r0
            r0 = r11
            java.lang.Class<lombok.Getter> r1 = lombok.Getter.class
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
            lombok.Getter r0 = (lombok.Getter) r0
            r14 = r0
            r0 = r14
            lombok.AccessLevel r0 = r0.value()
            r15 = r0
            r0 = r14
            boolean r0 = r0.lazy()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L4e
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.GETTER_LAZY_FLAG_USAGE
            java.lang.String r2 = "@Getter(lazy=true)"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
        L4e:
            r0 = r15
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L63
            r0 = r16
            if (r0 == 0) goto L62
            r0 = r11
            java.lang.String r1 = "'lazy' does not work with AccessLevel.NONE."
            r0.addWarning(r1)
        L62:
            return
        L63:
            r0 = r13
            if (r0 != 0) goto L69
            return
        L69:
            r0 = r10
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@Getter(onMethod"
            r3 = r11
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r17 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r13
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto La9;
                case 3: goto L98;
                default: goto Lc1;
            }
        L98:
            r0 = r8
            r1 = r15
            r2 = r12
            r3 = r11
            r4 = 1
            r5 = r16
            r6 = r17
            r0.createGetterForFields(r1, r2, r3, r4, r5, r6)
            goto Lc1
        La9:
            r0 = r16
            if (r0 == 0) goto Lb5
            r0 = r11
            java.lang.String r1 = "'lazy' is not supported for @Getter on a type."
            r0.addError(r1)
        Lb5:
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = r15
            r4 = 0
            r5 = r17
            r0.generateGetterForType(r1, r2, r3, r4, r5)
        Lc1:
            return
    }

    public void createGetterForFields(lombok.AccessLevel r9, java.util.Collection<lombok.javac.JavacNode> r10, lombok.javac.JavacNode r11, boolean r12, boolean r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14) {
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
            r0.createGetterForField(r1, r2, r3, r4, r5, r6)
        L25:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createGetterForField(lombok.AccessLevel r11, lombok.javac.JavacNode r12, lombok.javac.JavacNode r13, boolean r14, boolean r15, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r16) {
            r10 = this;
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L11
            r0 = r13
            java.lang.String r1 = "@Getter is only supported on a class, an enum, or a field."
            r0.addError(r1)
            return
        L11:
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L72
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L41
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
        L41:
            r0 = r13
            java.lang.String r1 = "'lazy' requires the field to be private and final."
            r0.addError(r1)
            return
        L49:
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 128(0x80, double:6.32E-322)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L62
            r0 = r13
            java.lang.String r1 = "'lazy' is not supported on transient fields."
            r0.addError(r1)
            return
        L62:
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto L72
            r0 = r13
            java.lang.String r1 = "'lazy' requires field initialization."
            r0.addError(r1)
            return
        L72:
            r0 = r12
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r18 = r0
            r0 = r12
            r1 = r18
            java.lang.String r0 = lombok.javac.handlers.JavacHandlerUtil.toGetterName(r0, r1)
            r19 = r0
            r0 = r19
            if (r0 != 0) goto L8d
            r0 = r13
            java.lang.String r1 = "Not generating getter for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L8d:
            r0 = r12
            r1 = r18
            java.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.toAllGetterNames(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L113
        L9d:
            r0 = r21
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            int[] r0 = m84x2486df07()
            r1 = r20
            r2 = r12
            r3 = 0
            r4 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L113;
                case 2: goto Ld4;
                case 3: goto Ld5;
                default: goto L113;
            }
        Ld4:
            return
        Ld5:
            r0 = r14
            if (r0 == 0) goto L112
            java.lang.String r0 = ""
            r22 = r0
            r0 = r20
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lfa
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r20
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r22 = r0
        Lfa:
            r0 = r13
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
        L112:
            return
        L113:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9d
            r0 = r11
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            long r0 = (long) r0
            r1 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 & r2
            long r0 = r0 | r1
            r20 = r0
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r1 = r10
            r2 = r20
            r3 = r12
            r4 = r12
            lombok.javac.JavacTreeMaker r4 = r4.getTreeMaker()
            r5 = r13
            r6 = r15
            r7 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = r1.createGetter(r2, r3, r4, r5, r6, r7)
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createGetter(long r11, lombok.javac.JavacNode r13, lombok.javac.JavacTreeMaker r14, lombok.javac.JavacNode r15, boolean r16, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r17) {
            r10 = this;
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r18 = r0
            r0 = r14
            r1 = r10
            r2 = r14
            r3 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.copyType(r2, r3)
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r19 = r0
            r0 = r13
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r0)
            r20 = r0
            r0 = r13
            r1 = r13
            r2 = r20
            java.lang.String r1 = lombok.javac.handlers.JavacHandlerUtil.toGetterName(r1, r2)
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            r0 = r13
            r1 = r20
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.shouldMakeFinal(r0, r1)
            r22 = r0
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = r16
            if (r0 == 0) goto Lab
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.inNetbeansEditor(r0)
            if (r0 != 0) goto Lab
            r0 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            r24 = r0
            r0 = r24
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodInvocation
            if (r0 == 0) goto L8e
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            com.sun.tools.javac.util.List r0 = r0.args
            r27 = r0
            r0 = r27
            int r0 = r0.length()
            int[] r0 = new int[r0]
            r25 = r0
            r0 = 0
            r28 = r0
            goto L86
        L71:
            r0 = r25
            r1 = r28
            r2 = r27
            r3 = r28
            java.lang.Object r2 = r2.get(r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = (com.sun.tools.javac.tree.JCTree.JCExpression) r2
            int r2 = r2.pos
            r0[r1] = r2
            int r28 = r28 + 1
        L86:
            r0 = r28
            r1 = r25
            int r1 = r1.length
            if (r0 < r1) goto L71
        L8e:
            r0 = r10
            r1 = r14
            r2 = r13
            r3 = r15
            com.sun.tools.javac.util.List r0 = r0.createLazyGetterBody(r1, r2, r3)
            r23 = r0
            r0 = r13
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.generateSuppressWarnings()
            r26 = r0
            goto Lb4
        Lab:
            r0 = r10
            r1 = r14
            r2 = r13
            com.sun.tools.javac.util.List r0 = r0.createSimpleGetterBody(r1, r2)
            r23 = r0
        Lb4:
            r0 = r14
            r1 = 0
            r2 = r23
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r27 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r28 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r29 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r30 = r0
            r0 = 0
            r31 = r0
            r0 = r13
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r0)
            r32 = r0
            r0 = r13
            com.sun.tools.javac.util.List r0 = findDelegatesAndRemoveFromField(r0)
            r33 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r1 = r32
            com.sun.tools.javac.util.List r0 = r0.appendList(r1)
            r34 = r0
            r0 = r13
            boolean r0 = r0.isFinal()
            if (r0 == 0) goto L112
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L132
            r0 = r34
            r1 = r14
            r2 = r13
            java.lang.String r3 = "org.checkerframework.dataflow.qual.Pure"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r34 = r0
            goto L132
        L112:
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L132
            r0 = r34
            r1 = r14
            r2 = r13
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r34 = r0
        L132:
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isFieldDeprecated(r0)
            if (r0 == 0) goto L156
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
        L156:
            r0 = r22
            if (r0 == 0) goto L161
            r0 = r11
            r1 = 16
            long r0 = r0 | r1
            r11 = r0
        L161:
            r0 = r14
            r1 = r14
            r2 = r11
            r3 = r34
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r21
            r3 = r19
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r27
            r8 = r31
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r35 = r0
            r0 = r24
            if (r0 == 0) goto L192
            r0 = r24
            r1 = 0
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
        L192:
            r0 = r25
            if (r0 == 0) goto L1c0
            r0 = 0
            r36 = r0
            goto L1b8
        L19d:
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            com.sun.tools.javac.util.List r0 = r0.args
            r1 = r36
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r1 = r25
            r2 = r36
            r1 = r1[r2]
            r0.pos = r1
            int r36 = r36 + 1
        L1b8:
            r0 = r36
            r1 = r25
            int r1 = r1.length
            if (r0 < r1) goto L19d
        L1c0:
            r0 = r35
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r35
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r33
            com.sun.tools.javac.util.List r1 = r1.appendList(r2)
            r0.annotations = r1
            r0 = r26
            if (r0 == 0) goto L22e
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r36 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r13
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_SUPPRESSWARNINGS_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L204
            r0 = r36
            r1 = r14
            java.lang.String r2 = "all"
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L204:
            r0 = r36
            r1 = r14
            java.lang.String r2 = "unchecked"
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r35
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r13
            r2 = r15
            java.lang.String r3 = "java.lang.SuppressWarnings"
            r4 = r14
            r5 = 0
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r36
            com.sun.tools.javac.util.List r7 = r7.toList()
            com.sun.tools.javac.tree.JCTree$JCNewArray r4 = r4.NewArray(r5, r6, r7)
            lombok.javac.handlers.JavacHandlerUtil.addAnnotation(r0, r1, r2, r3, r4)
        L22e:
            r0 = r13
            r1 = r35
            lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r2 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.GETTER
            lombok.javac.handlers.JavacHandlerUtil.copyJavadoc(r0, r1, r2)
            r0 = r35
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findDelegatesAndRemoveFromField(lombok.javac.JavacNode r4) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r5 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r6 = r0
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L3a
        L1b:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r7 = r0
            java.lang.Class<lombok.experimental.Delegate> r0 = lombok.experimental.Delegate.class
            r1 = r4
            r2 = r7
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 == 0) goto L3a
            r0 = r6
            r1 = r7
            com.sun.tools.javac.util.List r0 = r0.append(r1)
            r6 = r0
        L3a:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L97
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L7e
        L62:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r8 = r0
            r0 = r6
            r1 = r8
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L7e
            r0 = r7
            r1 = r8
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L7e:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L62
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.toList()
            r0.annotations = r1
            r0 = r4
            r0.rebuild()
        L97:
            r0 = r6
            return r0
    }

    public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> createSimpleGetterBody(lombok.javac.JavacTreeMaker r6, lombok.javac.JavacNode r7) {
            r5 = this;
            r0 = r6
            r1 = r6
            r2 = r7
            lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
    }

    public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> createLazyGetterBody(lombok.javac.JavacTreeMaker r12, lombok.javac.JavacNode r13, lombok.javac.JavacNode r14) {
            r11 = this;
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r16 = r0
            r0 = r11
            r1 = r12
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.copyType(r1, r2)
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            r1 = 0
            r0.type = r1
            r0 = 0
            r19 = r0
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L70
            java.util.Map<lombok.javac.JavacTreeMaker$TypeTag, java.lang.String> r0 = lombok.javac.handlers.HandleGetter.TYPE_MAP
            r1 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L70
            r0 = 1
            r19 = r0
            r0 = r16
            r1 = r13
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            r5 = r20
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            r0.vartype = r1
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r20
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r18 = r0
        L70:
            r0 = r18
            if (r0 != 0) goto L7e
            r0 = r11
            r1 = r12
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.copyType(r1, r2)
            r18 = r0
        L7e:
            r0 = r13
            java.lang.String r1 = "value"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r20 = r0
            r0 = r13
            java.lang.String r1 = "actualValue"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Object"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r22 = r0
            r0 = r15
            r1 = r12
            r2 = r12
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r20
            r4 = r22
            r5 = r11
            r6 = r13
            r7 = r12
            r8 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r9 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r7 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r7, r8, r9)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r5 = r5.callGet(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r12
            r1 = r12
            r2 = r12
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r11
            r4 = r13
            r5 = r12
            r6 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r7 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r5 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r5, r6, r7)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r3 = r3.callGet(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r24 = r0
            r0 = r23
            r1 = r24
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r24
            r1 = r12
            r2 = r12
            r3 = 16
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r21
            r4 = r17
            r5 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.init
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            if (r0 == 0) goto L134
            r0 = r12
            r1 = r12
            r2 = r12
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            r4 = r21
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r25 = r0
            r0 = r24
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L134:
            r0 = r19
            if (r0 != 0) goto L184
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r12
            r3 = r21
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r25 = r0
            r0 = r12
            r1 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r0, r1, r2)
            r26 = r0
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r12
            r4 = r21
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r27 = r0
            r0 = r12
            r1 = r12
            r2 = r12
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r27
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r28 = r0
            r0 = r24
            r1 = r28
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L184:
            r0 = r11
            r1 = r13
            r2 = r12
            r3 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r4 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r2, r3, r4)
            r3 = r12
            r4 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.callSet(r1, r2, r3)
            r25 = r0
            r0 = r24
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r12
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r25 = r0
            r0 = r12
            r1 = r25
            r2 = r12
            r3 = 0
            r4 = r24
            com.sun.tools.javac.util.List r4 = r4.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.Block(r3, r4)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            r26 = r0
            r0 = r23
            r1 = r26
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r12
            r1 = r12
            r2 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r1, r2, r3)
            r2 = r12
            r3 = 0
            r4 = r23
            com.sun.tools.javac.util.List r4 = r4.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.Block(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCSynchronized r0 = r0.Synchronized(r1, r2)
            r22 = r0
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r12
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r23 = r0
            r0 = r12
            r1 = r23
            r2 = r12
            r3 = 0
            r4 = r22
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4)
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.Block(r3, r4)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            r24 = r0
            r0 = r15
            r1 = r24
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            if (r0 == 0) goto L238
            r0 = r15
            r1 = r12
            r2 = r12
            r3 = r18
            r4 = r12
            r5 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            com.sun.tools.javac.tree.JCTree$JCTypeCast r2 = r2.TypeCast(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L238:
            r0 = r19
            if (r0 != 0) goto L284
            r0 = r12
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r12
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            r4 = r13
            lombok.core.handlers.HandlerUtil$FieldAccess r5 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.createFieldAccessor(r3, r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r22 = r0
            r0 = r12
            r1 = r22
            r2 = r12
            lombok.javac.JavacTreeMaker$TypeTag r3 = lombok.javac.Javac.CTC_BOT
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3, r4)
            r3 = r12
            r4 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r23 = r0
            r0 = r12
            r1 = r18
            r2 = r12
            r3 = r23
            com.sun.tools.javac.tree.JCTree$JCParens r2 = r2.Parens(r3)
            com.sun.tools.javac.tree.JCTree$JCTypeCast r0 = r0.TypeCast(r1, r2)
            r24 = r0
            r0 = r15
            r1 = r12
            r2 = r24
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L284:
            r0 = r16
            r1 = r12
            r2 = r13
            java.lang.String r3 = "java.util.concurrent.atomic.AtomicReference"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r2, r3)
            r3 = r13
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "Object"
            r5[r6] = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCTypeApply r1 = r1.TypeApply(r2, r3)
            r2 = r14
            com.sun.tools.javac.tree.JCTree r1 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r0.vartype = r1
            r0 = r16
            r1 = r12
            r2 = 0
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression> r3 = lombok.javac.handlers.HandleGetter.NIL_EXPRESSION
            r4 = r11
            r5 = r12
            r6 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.copyType(r5, r6)
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = lombok.javac.handlers.HandleGetter.NIL_EXPRESSION
            r6 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r1 = r1.NewClass(r2, r3, r4, r5, r6)
            r2 = r14
            com.sun.tools.javac.tree.JCTree r1 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r0.init = r1
            r0 = r15
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodInvocation callGet(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r10 = r0
            r0 = r10
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression> r1 = lombok.javac.handlers.HandleGetter.NIL_EXPRESSION
            r2 = r10
            r3 = r9
            r4 = r8
            java.lang.String r5 = "get"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression> r3 = lombok.javac.handlers.HandleGetter.NIL_EXPRESSION
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCStatement callSet(lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.tree.JCTree.JCExpression r11) {
            r8 = this;
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r12
            r1 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression> r2 = lombok.javac.handlers.HandleGetter.NIL_EXPRESSION
            r3 = r12
            r4 = r10
            r5 = r9
            java.lang.String r6 = "set"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = r3.Select(r4, r5)
            r4 = r11
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression copyType(lombok.javac.JavacTreeMaker r4, com.sun.tools.javac.tree.JCTree.JCVariableDecl r5) {
            r3 = this;
            r0 = r5
            com.sun.tools.javac.code.Type r0 = r0.type
            if (r0 == 0) goto L12
            r0 = r4
            r1 = r5
            com.sun.tools.javac.code.Type r1 = r1.type
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.Type(r1)
            goto L16
        L12:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
        L16:
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleGetter.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.handlers.HandleGetter.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m84x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleGetter.f590x2486df07
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
            lombok.javac.handlers.HandleGetter.f590x2486df07 = r1
            return r0
    }
}
