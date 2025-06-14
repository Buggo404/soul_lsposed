package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleSetter.SCL.lombok */
public class HandleSetter extends lombok.eclipse.EclipseAnnotationHandler<lombok.Setter> {
    private static final java.lang.String SETTER_NODE_NOT_SUPPORTED_ERR = "@Setter is only supported on a class or a field.";
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f578xb87c1847;

    public HandleSetter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean generateSetterForType(lombok.eclipse.EclipseNode r8, lombok.eclipse.EclipseNode r9, lombok.AccessLevel r10, boolean r11, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r12, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r13) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto L10
            java.lang.Class<lombok.Setter> r0 = lombok.Setter.class
            r1 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto L1f
            r0 = r9
            java.lang.String r1 = "@Setter is only supported on a class or a field."
            r0.addError(r1)
            r0 = 0
            return r0
        L1f:
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L74
        L2b:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r14 = r0
            r0 = r14
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L45
            goto L74
        L45:
            r0 = r14
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r16 = r0
            r0 = r16
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            if (r0 != 0) goto L5a
            goto L74
        L5a:
            r0 = r16
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L68
            goto L74
        L68:
            r0 = r7
            r1 = r14
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r0.generateSetterForField(r1, r2, r3, r4, r5)
        L74:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2b
            r0 = 1
            return r0
    }

    public void generateSetterForField(lombok.eclipse.EclipseNode r9, lombok.eclipse.EclipseNode r10, lombok.AccessLevel r11, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r12, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r13) {
            r8 = this;
            java.lang.Class<lombok.Setter> r0 = lombok.Setter.class
            r1 = r9
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
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

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Setter> r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10, lombok.eclipse.EclipseNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SETTER_FLAG_USAGE
            java.lang.String r2 = "@Setter"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Setter r0 = (lombok.Setter) r0
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
            java.lang.String r2 = "@Setter(onMethod"
            r3 = r11
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r14 = r0
            r0 = r10
            java.lang.String r1 = "onParam"
            java.lang.String r2 = "@Setter(onParam"
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
                default: goto L8a;
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
            r0.createSetterForFields(r1, r2, r3, r4, r5, r6)
            goto L8a
        L7b:
            r0 = r8
            r1 = r12
            r2 = r11
            r3 = r13
            r4 = 0
            r5 = r14
            r6 = r15
            boolean r0 = r0.generateSetterForType(r1, r2, r3, r4, r5, r6)
        L8a:
            return
    }

    public void createSetterForFields(lombok.AccessLevel r9, java.util.Collection<lombok.eclipse.EclipseNode> r10, lombok.eclipse.EclipseNode r11, boolean r12, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r13, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r14) {
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
            r0.createSetterForField(r1, r2, r3, r4, r5, r6)
        L25:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createSetterForField(lombok.AccessLevel r13, lombok.eclipse.EclipseNode r14, lombok.eclipse.EclipseNode r15, boolean r16, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r17, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r18) {
            r12 = this;
            r0 = r15
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r19 = r0
            r0 = r14
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L1a
            r0 = r15
            java.lang.String r1 = "@Setter is only supported on a class or a field."
            r0.addError(r1)
            return
        L1a:
            r0 = r14
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r21 = r0
            r0 = r21
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isBoolean(r0)
            r22 = r0
            r0 = r14
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r23 = r0
            r0 = r14
            r1 = r22
            r2 = r23
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toSetterName(r0, r1, r2)
            r24 = r0
            r0 = r14
            r1 = r23
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.shouldReturnThis(r0, r1)
            r25 = r0
            r0 = r24
            if (r0 != 0) goto L5a
            r0 = r14
            java.lang.String r1 = "Not generating setter for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L5a:
            r0 = r13
            int r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r0)
            r1 = r20
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 & r2
            r0 = r0 | r1
            r26 = r0
            r0 = r14
            r1 = r22
            r2 = r23
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toAllSetterNames(r0, r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r28 = r0
            goto Led
        L7b:
            r0 = r28
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r27 = r0
            int[] r0 = m74xb87c1847()
            r1 = r27
            r2 = r14
            r3 = 0
            r4 = 1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Led;
                case 2: goto Lb0;
                case 3: goto Lb1;
                default: goto Led;
            }
        Lb0:
            return
        Lb1:
            r0 = r16
            if (r0 == 0) goto Lec
            java.lang.String r0 = ""
            r29 = r0
            r0 = r27
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r27
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r29 = r0
        Ld4:
            r0 = r14
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r24
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r29
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        Lec:
            return
        Led:
            r0 = r28
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7b
            r0 = r14
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r1 = 0
            r2 = r14
            r3 = r24
            r4 = 0
            r5 = 0
            r6 = r25
            r7 = r26
            r8 = r15
            r9 = r17
            r10 = r18
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r27 = r0
            r0 = r14
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r27
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    static org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createSetter(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r13, boolean r14, lombok.eclipse.EclipseNode r15, java.lang.String r16, char[] r17, char[] r18, boolean r19, int r20, lombok.eclipse.EclipseNode r21, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r22, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r23) {
            r0 = r21
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r24 = r0
            r0 = r24
            int r0 = r0.sourceStart
            r25 = r0
            r0 = r24
            int r0 = r0.sourceEnd
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = r19
            if (r0 == 0) goto L53
            r0 = r15
            r1 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r0, r1)
            r27 = r0
            r0 = r27
            r1 = r24
            r2 = r21
            lombok.core.configuration.CheckerFrameworkVersion r2 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r2)
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r1 = r0
            r2 = r25
            r3 = r26
            r1.<init>(r2, r3)
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r29
            r3 = r25
            r4 = r26
            r1.<init>(r2, r3, r4)
            r28 = r0
        L53:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r27
            r7 = r28
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r29 = r0
            r0 = r29
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createSetter(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r9, boolean r10, lombok.eclipse.EclipseNode r11, java.lang.String r12, char[] r13, char[] r14, org.eclipse.jdt.internal.compiler.ast.TypeReference r15, org.eclipse.jdt.internal.compiler.ast.Statement r16, int r17, lombok.eclipse.EclipseNode r18, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r19, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r20) {
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r21 = r0
            r0 = r13
            if (r0 != 0) goto L15
            r0 = r21
            char[] r0 = r0.name
            r13 = r0
        L15:
            r0 = r18
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r22 = r0
            r0 = r22
            int r0 = r0.sourceStart
            r23 = r0
            r0 = r22
            int r0 = r0.sourceEnd
            r24 = r0
            r0 = r23
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r24
            long r1 = (long) r1
            long r0 = r0 | r1
            r25 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r9
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r27 = r0
            r0 = r11
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r28 = r0
            r0 = r11
            r1 = r28
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.shouldMakeFinal(r0, r1)
            if (r0 == 0) goto L5c
            r0 = r17
            r1 = 16
            r0 = r0 | r1
            r17 = r0
        L5c:
            r0 = r27
            r1 = r17
            r0.modifiers = r1
            r0 = r15
            if (r0 == 0) goto L72
            r0 = r27
            r1 = r15
            r0.returnType = r1
            goto L91
        L72:
            r0 = r27
            r1 = 6
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.returnType = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r23
            r0.sourceStart = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r24
            r0.sourceEnd = r1
        L91:
            r0 = 0
            r29 = r0
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isFieldDeprecated(r0)
            if (r0 != 0) goto L9f
            r0 = r10
            if (r0 == 0) goto Lad
        L9f:
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r22
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateDeprecatedAnnotation(r3)
            r1[r2] = r3
            r29 = r0
        Lad:
            r0 = r27
            r1 = r22
            r2 = 3
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
            r5 = r29
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableToSetterAnnotations(r5)
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            r2 = r13
            r3 = r25
            r4 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = r4.type
            r5 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r4, r5)
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r30 = r0
            r0 = r30
            r1 = r23
            r0.sourceStart = r1
            r0 = r30
            r1 = r24
            r0.sourceEnd = r1
            r0 = r27
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            r4 = r30
            r2[r3] = r4
            r0.arguments = r1
            r0 = r27
            r1 = r12
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r27
            r1 = 0
            r0.binding = r1
            r0 = r27
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r27
            r1 = 0
            r0.typeParameters = r1
            r0 = r27
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r2 = r22
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
            r31 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r13
            r3 = r25
            r1.<init>(r2, r3)
            r32 = r0
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r31
            r3 = r32
            r4 = r25
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r33 = r0
            r0 = r33
            r1 = r23
            r0.sourceStart = r1
            r0 = r33
            r1 = r33
            r2 = r24
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r27
            r1 = r27
            r2 = r27
            r3 = r22
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r27
            r1 = r27
            r2 = r27
            r3 = r22
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r0)
            r34 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 5
            r1.<init>(r2)
            r35 = r0
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 != 0) goto L1ca
            r0 = r11
            r1 = r20
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0, r1)
            if (r0 != 0) goto L1ca
            r0 = r35
            r1 = r33
            boolean r0 = r0.add(r1)
            goto L1f2
        L1ca:
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r13
            r2 = r18
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2, r3)
            r36 = r0
            r0 = r36
            if (r0 == 0) goto L1e8
            r0 = r35
            r1 = r36
            boolean r0 = r0.add(r1)
        L1e8:
            r0 = r35
            r1 = r33
            boolean r0 = r0.add(r1)
        L1f2:
            r0 = r14
            if (r0 == 0) goto L21e
            r0 = r35
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r14
            r6 = r25
            r4.<init>(r5, r6)
            org.eclipse.jdt.internal.compiler.ast.TrueLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            r5 = r4
            r6 = r23
            r7 = r24
            r5.<init>(r6, r7)
            r5 = r24
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        L21e:
            r0 = r15
            if (r0 == 0) goto L232
            r0 = r16
            if (r0 == 0) goto L232
            r0 = r35
            r1 = r16
            boolean r0 = r0.add(r1)
        L232:
            r0 = r27
            r1 = r35
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r30
            r1 = r22
            r2 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r34
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r20
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 == 0) goto L28b
            r0 = r30
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r27
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
        L28b:
            r0 = r15
            if (r0 == 0) goto L29c
            r0 = r16
            if (r0 == 0) goto L29c
            r0 = r18
            r1 = r27
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L29c:
            r0 = r27
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r22
            r2.<init>(r3)
            r2 = r9
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r11
            r1 = r27
            lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r2 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.SETTER
            r3 = r16
            if (r3 == 0) goto L2bd
            r3 = 1
            goto L2be
        L2bd:
            r3 = 0
        L2be:
            lombok.eclipse.handlers.EclipseHandlerUtil.copyJavadoc(r0, r1, r2, r3)
            r0 = r27
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleSetter.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleSetter.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m74xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleSetter.f578xb87c1847
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
            lombok.eclipse.handlers.HandleSetter.f578xb87c1847 = r1
            return r0
    }
}
