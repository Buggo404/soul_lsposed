package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleWith.SCL.lombok */
public class HandleWith extends lombok.eclipse.EclipseAnnotationHandler<lombok.With> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f581xb87c1847;

    public HandleWith() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean generateWithForType(lombok.eclipse.EclipseNode r6, lombok.eclipse.EclipseNode r7, lombok.AccessLevel r8, boolean r9) {
            r5 = this;
            r0 = r9
            if (r0 == 0) goto L10
            java.lang.Class<lombok.With> r0 = lombok.With.class
            r1 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            r10 = r0
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L26
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r10 = r0
        L26:
            r0 = r10
            if (r0 != 0) goto L2f
            r0 = 0
            goto L34
        L2f:
            r0 = r10
            int r0 = r0.modifiers
        L34:
            r11 = r0
            r0 = r11
            r1 = 25088(0x6200, float:3.5156E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L50
            r0 = r12
            if (r0 == 0) goto L58
        L50:
            r0 = r7
            java.lang.String r1 = "@With is only supported on a class or a field."
            r0.addError(r1)
            r0 = 0
            return r0
        L58:
            r0 = r6
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Lb1
        L64:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L7e
            goto Lb1
        L7e:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r15 = r0
            r0 = r15
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            if (r0 != 0) goto L93
            goto Lb1
        L93:
            r0 = r15
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto La9
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto La9
            goto Lb1
        La9:
            r0 = r5
            r1 = r13
            r2 = r7
            r3 = r8
            r0.generateWithForField(r1, r2, r3)
        Lb1:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L64
            r0 = 1
            return r0
    }

    public void generateWithForField(lombok.eclipse.EclipseNode r9, lombok.eclipse.EclipseNode r10, lombok.AccessLevel r11) {
            r8 = this;
            r0 = r9
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L2e
        Lc:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L2e
            java.lang.Class<lombok.With> r0 = lombok.With.class
            r1 = r12
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L2e
            return
        L2e:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            java.util.List r0 = java.util.Collections.emptyList()
            r12 = r0
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = 0
            r5 = r12
            r6 = r12
            r0.createWithForField(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.With> r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10, lombok.eclipse.EclipseNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.WITH_FLAG_USAGE
            java.lang.String r2 = "@With"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.With r0 = (lombok.With) r0
            lombok.AccessLevel r0 = r0.value()
            r13 = r0
            r0 = r13
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L2d
            r0 = r12
            if (r0 != 0) goto L2e
        L2d:
            return
        L2e:
            r0 = r10
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@With(onMethod"
            r3 = r11
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r14 = r0
            r0 = r10
            java.lang.String r1 = "onParam"
            java.lang.String r2 = "@With(onParam"
            r3 = r11
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r15 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r12
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L7b;
                case 3: goto L68;
                default: goto La6;
            }
        L68:
            r0 = r8
            r1 = r13
            r2 = r11
            java.util.Collection r2 = r2.upFromAnnotationToFields()
            r3 = r11
            r4 = 1
            r5 = r14
            r6 = r15
            r0.createWithForFields(r1, r2, r3, r4, r5, r6)
            goto La6
        L7b:
            r0 = r14
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8b
            r0 = r11
            java.lang.String r1 = "'onMethod' is not supported for @With on a type."
            r0.addError(r1)
        L8b:
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9b
            r0 = r11
            java.lang.String r1 = "'onParam' is not supported for @With on a type."
            r0.addError(r1)
        L9b:
            r0 = r8
            r1 = r12
            r2 = r11
            r3 = r13
            r4 = 0
            boolean r0 = r0.generateWithForType(r1, r2, r3, r4)
        La6:
            return
    }

    public void createWithForFields(lombok.AccessLevel r9, java.util.Collection<lombok.eclipse.EclipseNode> r10, lombok.eclipse.EclipseNode r11, boolean r12, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r13, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r14) {
            r8 = this;
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto L25
        Lb:
            r0 = r16
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
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

    public void createWithForField(lombok.AccessLevel r11, lombok.eclipse.EclipseNode r12, lombok.eclipse.EclipseNode r13, boolean r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r15, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r16) {
            r10 = this;
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r17 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L1a
            r0 = r13
            java.lang.String r1 = "@With is only supported on a class or a field."
            r0.addError(r1)
            return
        L1a:
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L49
            r0 = r18
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L49
            r0 = r18
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            r19 = r0
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r21 = r0
            r0 = r21
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isBoolean(r0)
            r22 = r0
            r0 = r12
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r23 = r0
            r0 = r12
            r1 = r22
            r2 = r23
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toWithName(r0, r1, r2)
            r24 = r0
            r0 = r24
            if (r0 != 0) goto L84
            r0 = r12
            java.lang.String r1 = "Not generating a with method for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L84:
            r0 = r20
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lab
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r24
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for static fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        Lab:
            r0 = r20
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Lda
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto Lda
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r24
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for final, initialized fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        Lda:
            r0 = r20
            char[] r0 = r0.name
            if (r0 == 0) goto L113
            r0 = r20
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 <= 0) goto L113
            r0 = r20
            char[] r0 = r0.name
            r1 = 0
            char r0 = r0[r1]
            r1 = 36
            if (r0 != r1) goto L113
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r24
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for fields starting with $."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        L113:
            r0 = r12
            r1 = r22
            r2 = r23
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toAllWithNames(r0, r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L19b
        L125:
            r0 = r26
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r25 = r0
            int[] r0 = m77xb87c1847()
            r1 = r25
            r2 = r12
            r3 = 0
            r4 = 1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19b;
                case 2: goto L15c;
                case 3: goto L15d;
                default: goto L19b;
            }
        L15c:
            return
        L15d:
            r0 = r14
            if (r0 == 0) goto L19a
            java.lang.String r0 = ""
            r27 = r0
            r0 = r25
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L182
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r25
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r27 = r0
        L182:
            r0 = r12
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r24
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r27
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        L19a:
            return
        L19b:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L125
            r0 = r11
            int r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r0)
            r25 = r0
            r0 = r10
            r1 = r12
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r2 = r12
            r3 = r24
            r4 = r25
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r19
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createWith(r1, r2, r3, r4, r5, r6, r7, r8)
            r26 = r0
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r26
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createWith(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r10, lombok.eclipse.EclipseNode r11, java.lang.String r12, int r13, lombok.eclipse.EclipseNode r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r15, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r16, boolean r17) {
            r9 = this;
            r0 = r14
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r18 = r0
            r0 = r12
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r19 = r0
            r0 = r18
            int r0 = r0.sourceStart
            r20 = r0
            r0 = r18
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
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r10
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r24 = r0
            r0 = r11
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r25 = r0
            r0 = r17
            if (r0 == 0) goto L53
            r0 = r13
            r1 = 16778240(0x1000400, float:2.3512757E-38)
            r0 = r0 | r1
            r13 = r0
        L53:
            r0 = r11
            r1 = r25
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.shouldMakeFinal(r0, r1)
            if (r0 == 0) goto L63
            r0 = r13
            r1 = 16
            r0 = r0 | r1
            r13 = r0
        L63:
            r0 = r24
            r1 = r13
            r0.modifiers = r1
            r0 = r24
            r1 = r11
            r2 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.returnType = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            if (r0 != 0) goto L7f
            r0 = 0
            return r0
        L7f:
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isFieldDeprecated(r0)
            if (r0 == 0) goto L9a
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r18
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateDeprecatedAnnotation(r3)
            r1[r2] = r3
            r26 = r0
        L9a:
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto Lb5
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r18
            java.lang.String r4 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r3, r4)
            r1[r2] = r3
            r27 = r0
        Lb5:
            r0 = r24
            r1 = r18
            r2 = 3
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r27
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r26
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            r2 = r19
            char[] r2 = r2.name
            r3 = r22
            r4 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = r4.type
            r5 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r4, r5)
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r28 = r0
            r0 = r28
            r1 = r20
            r0.sourceStart = r1
            r0 = r28
            r1 = r21
            r0.sourceEnd = r1
            r0 = r24
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            r4 = r28
            r2[r3] = r4
            r0.arguments = r1
            r0 = r24
            r1 = r12
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r24
            r1 = 0
            r0.binding = r1
            r0 = r24
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r24
            r1 = 0
            r0.typeParameters = r1
            r0 = r24
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r0)
            r29 = r0
            r0 = r17
            if (r0 != 0) goto L2fc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r30 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r32 = r0
            goto L20b
        L164:
            r0 = r32
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r31 = r0
            r0 = r31
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L17e
            goto L20b
        L17e:
            r0 = r31
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r33 = r0
            r0 = r33
            char[] r0 = r0.name
            if (r0 == 0) goto L1a8
            r0 = r33
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 <= 0) goto L1a8
            r0 = r33
            char[] r0 = r0.name
            r1 = 0
            char r0 = r0[r1]
            r1 = 36
            if (r0 != r1) goto L1a8
            goto L20b
        L1a8:
            r0 = r33
            int r0 = r0.modifiers
            long r0 = (long) r0
            r34 = r0
            r0 = r34
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1be
            goto L20b
        L1be:
            r0 = r34
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1d4
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L1d4
            goto L20b
        L1d4:
            r0 = r31
            java.lang.Object r0 = r0.get()
            r1 = r11
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L1f9
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r19
            char[] r3 = r3.name
            r4 = r22
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto L20b
        L1f9:
            r0 = r30
            r1 = r31
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r3 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r1, r2, r3)
            boolean r0 = r0.add(r1)
        L20b:
            r0 = r32
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L164
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r31 = r0
            r0 = r31
            r1 = r30
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
            r0.arguments = r1
            r0 = r31
            r1 = r11
            r2 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r11
            lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r4 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r2, r3, r4)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r19
            char[] r5 = r5.name
            r6 = r22
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r32 = r0
            org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r33 = r0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r32
            r3 = r33
            r4 = r31
            r1.<init>(r2, r3, r4)
            r34 = r0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r34
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4)
            r35 = r0
            r0 = r24
            r1 = r24
            r2 = r24
            r3 = r18
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r24
            r1 = r24
            r2 = r24
            r3 = r18
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 5
            r1.<init>(r2)
            r36 = r0
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L2df
            r0 = r19
            r1 = r14
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2)
            r37 = r0
            r0 = r37
            if (r0 == 0) goto L2df
            r0 = r36
            r1 = r37
            boolean r0 = r0.add(r1)
        L2df:
            r0 = r36
            r1 = r35
            boolean r0 = r0.add(r1)
            r0 = r24
            r1 = r36
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
        L2fc:
            r0 = r28
            r1 = r18
            r2 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r29
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r16
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r11
            r1 = r24
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r24
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r18
            r2.<init>(r3)
            r2 = r10
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r11
            r1 = r24
            lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r2 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.WITH
            lombok.eclipse.handlers.EclipseHandlerUtil.copyJavadoc(r0, r1, r2)
            r0 = r24
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleWith.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleWith.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m77xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleWith.f581xb87c1847
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
            lombok.eclipse.handlers.HandleWith.f581xb87c1847 = r1
            return r0
    }
}
