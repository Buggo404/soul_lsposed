package lombok.javac.handlers;

@lombok.core.HandlerPriority(-512)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleJacksonized.SCL.lombok */
public class HandleJacksonized extends lombok.javac.JavacAnnotationHandler<lombok.extern.jackson.Jacksonized> {
    public HandleJacksonized() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.extern.jackson.Jacksonized> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.JACKSONIZED_FLAG_USAGE
            java.lang.String r2 = "@Jacksonized"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r12 = r0
            r0 = r11
            java.lang.Class<lombok.extern.jackson.Jacksonized> r1 = lombok.extern.jackson.Jacksonized.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L30
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            goto L34
        L30:
            r0 = r12
            r13 = r0
        L34:
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r14 = r0
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r12
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1)
            r15 = r0
            java.lang.Class<lombok.experimental.SuperBuilder> r0 = lombok.experimental.SuperBuilder.class
            r1 = r12
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1)
            r16 = r0
            r0 = r15
            if (r0 != 0) goto L61
            r0 = r16
            if (r0 != 0) goto L61
            r0 = r11
            java.lang.String r1 = "@Jacksonized requires @Builder or @SuperBuilder for it to mean anything."
            r0.addWarning(r1)
            return
        L61:
            r0 = r15
            if (r0 == 0) goto L72
            r0 = r16
            if (r0 == 0) goto L72
            r0 = r11
            java.lang.String r1 = "@Jacksonized cannot process both @Builder and @SuperBuilder on the same class."
            r0.addError(r1)
            return
        L72:
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            r0 = 1
            goto L88
        L87:
            r0 = 0
        L88:
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L96
            r0 = r11
            java.lang.String r1 = "Builders on abstract classes cannot be @Jacksonized (the builder would never be used)."
            r0.addError(r1)
            return
        L96:
            r0 = r15
            if (r0 == 0) goto La5
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r15
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r0, r1)
            goto La6
        La5:
            r0 = 0
        La6:
            r18 = r0
            r0 = r16
            if (r0 == 0) goto Lb7
            java.lang.Class<lombok.experimental.SuperBuilder> r0 = lombok.experimental.SuperBuilder.class
            r1 = r16
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r0, r1)
            goto Lb8
        Lb7:
            r0 = 0
        Lb8:
            r19 = r0
            r0 = r18
            if (r0 == 0) goto Lcf
            r0 = r18
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            java.lang.String r0 = r0.setterPrefix()
            goto Ldc
        Lcf:
            r0 = r19
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.SuperBuilder r0 = (lombok.experimental.SuperBuilder) r0
            java.lang.String r0 = r0.setterPrefix()
        Ldc:
            r20 = r0
            r0 = r18
            if (r0 == 0) goto Lf3
            r0 = r18
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            java.lang.String r0 = r0.buildMethodName()
            goto L100
        Lf3:
            r0 = r19
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.SuperBuilder r0 = (lombok.experimental.SuperBuilder) r0
            java.lang.String r0 = r0.buildMethodName()
        L100:
            r21 = r0
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r22 = r0
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r18
            r5 = r22
            java.lang.String r0 = r0.getBuilderClassName(r1, r2, r3, r4, r5)
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r14
            com.sun.tools.javac.util.List r0 = r0.getMembers()
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L156
        L128:
            r0 = r26
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r25 = r0
            r0 = r25
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L156
            r0 = r25
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.getSimpleName()
            r1 = r23
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L156
            r0 = r25
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r24 = r0
            goto L160
        L156:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L128
        L160:
            r0 = r24
            if (r0 != 0) goto L16c
            r0 = r11
            java.lang.String r1 = "Could not find @(Super)Builder's generated builder class for @Jacksonized processing. If there are other compiler errors, fix them first."
            r0.addError(r1)
            return
        L16c:
            java.lang.String r0 = "com.fasterxml.jackson.databind.annotation.JsonDeserialize"
            r1 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L17d
            r0 = r11
            java.lang.String r1 = "@JsonDeserialize already exists on class. Either delete @JsonDeserialize, or remove @Jacksonized and manually configure Jackson."
            r0.addError(r1)
            return
        L17d:
            r0 = r12
            java.lang.String r1 = "com"
            java.lang.String r2 = "fasterxml"
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "jackson"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "databind"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "annotation"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "JsonDeserialize"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r25 = r0
            r0 = r22
            r1 = r13
            r2 = r11
            r3 = r23
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r26 = r0
            r0 = r22
            r1 = r26
            r2 = r12
            java.lang.String r3 = "class"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r27 = r0
            r0 = r22
            r1 = r22
            r2 = r11
            java.lang.String r3 = "builder"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r27
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r28 = r0
            r0 = r22
            r1 = r25
            r2 = r28
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r29 = r0
            r0 = r29
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r29
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.annotations = r1
            r0 = r13
            com.sun.tools.javac.util.List r0 = findJacksonAnnotationsOnClass(r0)
            r30 = r0
            r0 = r30
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
            r31 = r0
            r0 = r31
            java.util.Iterator r0 = r0.iterator()
            r33 = r0
            goto L22c
        L219:
            r0 = r33
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r32 = r0
            r0 = r32
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
        L22c:
            r0 = r33
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L219
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r31
            com.sun.tools.javac.util.List r1 = r1.appendList(r2)
            r0.annotations = r1
            r0 = r12
            java.lang.String r1 = "com"
            java.lang.String r2 = "fasterxml"
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "jackson"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "databind"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "annotation"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "JsonPOJOBuilder"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r32 = r0
            r0 = r22
            r1 = r22
            r2 = r11
            java.lang.String r3 = "withPrefix"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r22
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r33 = r0
            r0 = r22
            r1 = r22
            r2 = r11
            java.lang.String r3 = "buildMethodName"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r22
            r3 = r21
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r34 = r0
            r0 = r22
            r1 = r32
            r2 = r33
            r3 = r34
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r35 = r0
            r0 = r35
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r35
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.annotations = r1
            r0 = r16
            if (r0 == 0) goto L2e6
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            long r1 = r1.flags
            r2 = -3
            long r1 = r1 & r2
            r0.flags = r1
        L2e6:
            return
    }

    private java.lang.String getBuilderClassName(lombok.javac.JavacNode r6, lombok.javac.JavacNode r7, com.sun.tools.javac.tree.JCTree.JCClassDecl r8, lombok.core.AnnotationValues<lombok.Builder> r9, lombok.javac.JavacTreeMaker r10) {
            r5 = this;
            r0 = r9
            if (r0 == 0) goto L15
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            java.lang.String r0 = r0.builderClassName()
            goto L16
        L15:
            r0 = 0
        L16:
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L25
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb6
        L25:
            r0 = r6
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.String> r1 = lombok.ConfigurationKeys.BUILDER_CLASS_NAME
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L41
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L46
        L41:
            java.lang.String r0 = "*Builder"
            r11 = r0
        L46:
            r0 = r7
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L5a
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r12 = r0
            r0 = r12
            if (r0 == 0) goto La1
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.getName()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La1
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            r14 = r0
            r0 = r12
            com.sun.tools.javac.util.List r0 = r0.typarams
            r15 = r0
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L93
            r0 = r10
            r1 = r14
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r14 = r0
        L93:
            r0 = r6
            r1 = r8
            r2 = r14
            r3 = r15
            java.lang.String r0 = lombok.javac.handlers.HandleBuilder.returnTypeToBuilderClassName(r0, r1, r2, r3)
            r13 = r0
            goto Laa
        La1:
            r0 = r8
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r13 = r0
        Laa:
            r0 = r11
            java.lang.String r1 = "*"
            r2 = r13
            java.lang.String r0 = r0.replace(r1, r2)
            r11 = r0
        Lb6:
            r0 = r9
            if (r0 != 0) goto Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r11
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "Impl"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
        Ld2:
            r0 = r11
            return r0
    }

    private static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findJacksonAnnotationsOnClass(lombok.javac.JavacNode r4) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L6b
        L13:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L6b
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r8 = r0
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.JACKSON_COPY_TO_BUILDER_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L61
        L3d:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            r1 = r4
            r2 = r8
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 == 0) goto L61
            r0 = r5
            r1 = r8
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L6b
        L61:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3d
        L6b:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }
}
