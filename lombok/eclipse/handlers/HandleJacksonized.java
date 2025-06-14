package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-512)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleJacksonized.SCL.lombok */
public class HandleJacksonized extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.jackson.Jacksonized> {
    private static final char[][] JSON_POJO_BUILDER_ANNOTATION = null;
    private static final char[][] JSON_DESERIALIZE_ANNOTATION = null;
    private static final org.eclipse.jdt.internal.compiler.ast.Annotation[] EMPTY_ANNOTATIONS_ARRAY = null;

    static {
            java.lang.String r0 = "com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleJacksonized.JSON_POJO_BUILDER_ANNOTATION = r0
            java.lang.String r0 = "com.fasterxml.jackson.databind.annotation.JsonDeserialize"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleJacksonized.JSON_DESERIALIZE_ANNOTATION = r0
            r0 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            lombok.eclipse.handlers.HandleJacksonized.EMPTY_ANNOTATIONS_ARRAY = r0
            return
    }

    public HandleJacksonized() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.extern.jackson.Jacksonized> r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11, lombok.eclipse.EclipseNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.JACKSONIZED_FLAG_USAGE
            java.lang.String r2 = "@Jacksonized"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L2a
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r14 = r0
            goto L2e
        L2a:
            r0 = r13
            r14 = r0
        L2e:
            r0 = r14
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r15 = r0
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r13
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findAnnotation(r0, r1)
            r16 = r0
            java.lang.Class<lombok.experimental.SuperBuilder> r0 = lombok.experimental.SuperBuilder.class
            r1 = r13
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findAnnotation(r0, r1)
            r17 = r0
            r0 = r16
            if (r0 != 0) goto L5b
            r0 = r17
            if (r0 != 0) goto L5b
            r0 = r12
            java.lang.String r1 = "@Jacksonized requires @Builder or @SuperBuilder for it to mean anything."
            r0.addWarning(r1)
            return
        L5b:
            r0 = r16
            if (r0 == 0) goto L6c
            r0 = r17
            if (r0 == 0) goto L6c
            r0 = r12
            java.lang.String r1 = "@Jacksonized cannot process both @Builder and @SuperBuilder on the same class."
            r0.addError(r1)
            return
        L6c:
            r0 = r15
            int r0 = r0.modifiers
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L7c
            r0 = 1
            goto L7d
        L7c:
            r0 = 0
        L7d:
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L8b
            r0 = r12
            java.lang.String r1 = "Builders on abstract classes cannot be @Jacksonized (the builder would never be used)."
            r0.addError(r1)
            return
        L8b:
            r0 = r16
            if (r0 == 0) goto L9a
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r16
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            goto L9b
        L9a:
            r0 = 0
        L9b:
            r19 = r0
            r0 = r17
            if (r0 == 0) goto Lac
            java.lang.Class<lombok.experimental.SuperBuilder> r0 = lombok.experimental.SuperBuilder.class
            r1 = r17
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            goto Lad
        Lac:
            r0 = 0
        Lad:
            r20 = r0
            r0 = r19
            if (r0 == 0) goto Lc4
            r0 = r19
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            java.lang.String r0 = r0.setterPrefix()
            goto Ld1
        Lc4:
            r0 = r20
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.SuperBuilder r0 = (lombok.experimental.SuperBuilder) r0
            java.lang.String r0 = r0.setterPrefix()
        Ld1:
            r21 = r0
            r0 = r19
            if (r0 == 0) goto Le8
            r0 = r19
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            java.lang.String r0 = r0.buildMethodName()
            goto Lf5
        Le8:
            r0 = r20
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.SuperBuilder r0 = (lombok.experimental.SuperBuilder) r0
            java.lang.String r0 = r0.buildMethodName()
        Lf5:
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r19
            java.lang.String r0 = r0.getBuilderClassName(r1, r2, r3, r4, r5)
            r25 = r0
            r0 = r14
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L157
        L118:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r28 = r0
            r0 = r28
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L157
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            char[] r0 = r0.name
            r1 = r25
            char[] r1 = r1.toCharArray()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L157
            r0 = r26
            r23 = r0
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r24 = r0
            goto L161
        L157:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L118
        L161:
            r0 = r24
            if (r0 != 0) goto L16d
            r0 = r12
            java.lang.String r1 = "Could not find @(Super)Builder's generated builder class for @Jacksonized processing. If there are other compiler errors, fix them first."
            r0.addError(r1)
            return
        L16d:
            java.lang.String r0 = "com.fasterxml.jackson.databind.annotation.JsonDeserialize"
            r1 = r14
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L17e
            r0 = r12
            java.lang.String r1 = "@JsonDeserialize already exists on class. Either delete @JsonDeserialize, or remove @Jacksonized and manually configure Jackson."
            r0.addError(r1)
            return
        L17e:
            r0 = r11
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r11
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r26 = r0
            r0 = r23
            r1 = 0
            r2 = r26
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r28 = r0
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = new org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            r1 = r0
            r2 = r15
            int r2 = r2.sourceEnd
            r3 = r28
            r1.<init>(r2, r3)
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair r0 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair
            r1 = r0
            java.lang.String r2 = "builder"
            char[] r2 = r2.toCharArray()
            r3 = r15
            int r3 = r3.sourceStart
            r4 = r15
            int r4 = r4.sourceEnd
            r5 = r29
            r1.<init>(r2, r3, r4, r5)
            r30 = r0
            r0 = r15
            r1 = r15
            r2 = r15
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            char[][] r3 = lombok.eclipse.handlers.HandleJacksonized.JSON_DESERIALIZE_ANNOTATION
            r4 = 1
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r4 = new org.eclipse.jdt.internal.compiler.ast.ASTNode[r4]
            r5 = r4
            r6 = 0
            r7 = r30
            r5[r6] = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.addAnnotation(r1, r2, r3, r4)
            r0.annotations = r1
            r0 = r15
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = findJacksonAnnotationsOnClass(r0, r1)
            r31 = r0
            r0 = r24
            r1 = r24
            r2 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r24
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = r5.annotations
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r31
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r21
            char[] r2 = r2.toCharArray()
            r3 = r24
            int r3 = r3.sourceStart
            r4 = r24
            int r4 = r4.sourceEnd
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r32 = r0
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair r0 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair
            r1 = r0
            java.lang.String r2 = "withPrefix"
            char[] r2 = r2.toCharArray()
            r3 = r24
            int r3 = r3.sourceStart
            r4 = r24
            int r4 = r4.sourceEnd
            r5 = r32
            r1.<init>(r2, r3, r4, r5)
            r33 = r0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r22
            char[] r2 = r2.toCharArray()
            r3 = r24
            int r3 = r3.sourceStart
            r4 = r24
            int r4 = r4.sourceEnd
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r34 = r0
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair r0 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair
            r1 = r0
            java.lang.String r2 = "buildMethodName"
            char[] r2 = r2.toCharArray()
            r3 = r24
            int r3 = r3.sourceStart
            r4 = r24
            int r4 = r4.sourceEnd
            r5 = r34
            r1.<init>(r2, r3, r4, r5)
            r35 = r0
            r0 = r24
            r1 = r24
            r2 = r24
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            char[][] r3 = lombok.eclipse.handlers.HandleJacksonized.JSON_POJO_BUILDER_ANNOTATION
            r4 = 2
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r4 = new org.eclipse.jdt.internal.compiler.ast.ASTNode[r4]
            r5 = r4
            r6 = 0
            r7 = r33
            r5[r6] = r7
            r5 = r4
            r6 = 1
            r7 = r35
            r5[r6] = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.addAnnotation(r1, r2, r3, r4)
            r0.annotations = r1
            r0 = r17
            if (r0 == 0) goto L299
            r0 = r24
            r1 = r24
            int r1 = r1.modifiers
            r2 = -3
            r1 = r1 & r2
            r0.modifiers = r1
        L299:
            return
    }

    private java.lang.String getBuilderClassName(org.eclipse.jdt.internal.compiler.ast.Annotation r7, lombok.eclipse.EclipseNode r8, lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r10, lombok.core.AnnotationValues<lombok.Builder> r11) {
            r6 = this;
            r0 = r11
            if (r0 == 0) goto L15
            r0 = r11
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            java.lang.String r0 = r0.builderClassName()
            goto L16
        L15:
            r0 = 0
        L16:
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L25
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8c
        L25:
            r0 = r8
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.String> r1 = lombok.ConfigurationKeys.BUILDER_CLASS_NAME
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L41
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L46
        L41:
            java.lang.String r0 = "*Builder"
            r12 = r0
        L46:
            r0 = r9
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L5a
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L72
            r0 = r8
            r1 = r13
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            char[] r0 = lombok.eclipse.handlers.HandleBuilder.returnTypeToBuilderClassName(r0, r1, r2)
            r14 = r0
            goto L79
        L72:
            r0 = r10
            char[] r0 = r0.name
            r14 = r0
        L79:
            r0 = r12
            java.lang.String r1 = "*"
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r14
            r3.<init>(r4)
            java.lang.String r0 = r0.replace(r1, r2)
            r12 = r0
        L8c:
            r0 = r11
            if (r0 != 0) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r12
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "Impl"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12 = r0
        La8:
            r0 = r12
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.Annotation[] findJacksonAnnotationsOnClass(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r4, lombok.eclipse.EclipseNode r5) {
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto Lb
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.HandleJacksonized.EMPTY_ANNOTATIONS_ARRAY
            return r0
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L78
        L23:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L75
            r0 = r11
            char[][] r0 = r0.getTypeName()
            if (r0 == 0) goto L75
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.JACKSON_COPY_TO_BUILDER_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L6b
        L49:
            r0 = r13
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r12
            r1 = r5
            r2 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 == 0) goto L6b
            r0 = r6
            r1 = r7
            boolean r0 = r0.add(r1)
            goto L75
        L6b:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L49
        L75:
            int r8 = r8 + 1
        L78:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L23
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.HandleJacksonized.EMPTY_ANNOTATIONS_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r0
            return r0
    }
}
