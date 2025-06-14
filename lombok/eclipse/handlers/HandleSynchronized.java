package lombok.eclipse.handlers;

@lombok.eclipse.DeferUntilPostDiet
@lombok.core.HandlerPriority(1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleSynchronized.SCL.lombok */
public class HandleSynchronized extends lombok.eclipse.EclipseAnnotationHandler<lombok.Synchronized> {
    private static final char[] INSTANCE_LOCK_NAME = null;
    private static final char[] STATIC_LOCK_NAME = null;

    static {
            java.lang.String r0 = "$lock"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSynchronized.INSTANCE_LOCK_NAME = r0
            java.lang.String r0 = "$LOCK"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSynchronized.STATIC_LOCK_NAME = r0
            return
    }

    public HandleSynchronized() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void preHandle(lombok.core.AnnotationValues<lombok.Synchronized> r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10, lombok.eclipse.EclipseNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L24
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L24
            r0 = r12
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto L25
        L24:
            return
        L25:
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.isAbstract()
            if (r0 == 0) goto L38
            return
        L38:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = 1
            boolean[] r3 = new boolean[r3]
            r4 = r3
            r5 = 0
            r6 = r13
            boolean r6 = r6.isStatic()
            r4[r5] = r6
            r4 = 0
            char[] r0 = r0.createLockField(r1, r2, r3, r4)
            return
    }

    public char[] createLockField(lombok.core.AnnotationValues<lombok.Synchronized> r10, lombok.eclipse.EclipseNode r11, boolean[] r12, boolean r13) {
            r9 = this;
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Synchronized r0 = (lombok.Synchronized) r0
            java.lang.String r0 = r0.value()
            char[] r0 = r0.toCharArray()
            r14 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r14
            int r0 = r0.length
            if (r0 != 0) goto L37
            r0 = 1
            r16 = r0
            r0 = r12
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L32
            char[] r0 = lombok.eclipse.handlers.HandleSynchronized.STATIC_LOCK_NAME
            goto L35
        L32:
            char[] r0 = lombok.eclipse.handlers.HandleSynchronized.INSTANCE_LOCK_NAME
        L35:
            r14 = r0
        L37:
            r0 = r11
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.upToTypeNode(r0)
            r17 = r0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            r18 = r0
            r0 = r17
            if (r0 == 0) goto Lec
            r0 = r17
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto Lec
            r0 = r17
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r19 = r0
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 == 0) goto Lec
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = r0
            r23 = r1
            int r0 = r0.length
            r22 = r0
            r0 = 0
            r21 = r0
            goto Le5
        L75:
            r0 = r23
            r1 = r21
            r0 = r0[r1]
            r20 = r0
            r0 = r20
            char[] r0 = r0.name
            r24 = r0
            r0 = r24
            if (r0 != 0) goto L8b
            goto Le2
        L8b:
            r0 = r24
            r1 = r14
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Le2
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getGeneratedBy(r0)
            if (r0 != 0) goto La3
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto La6
        La3:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        La6:
            r18 = r0
            r0 = r20
            boolean r0 = r0.isStatic()
            r25 = r0
            r0 = r25
            if (r0 != 0) goto Lda
            r0 = r12
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto Lda
            r0 = r13
            if (r0 == 0) goto Ld8
            r0 = r11
            java.lang.String r1 = "The field %s is non-static and thus cannot be used on this static method"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = new java.lang.String
            r6 = r5
            r7 = r14
            r6.<init>(r7)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
        Ld8:
            r0 = 0
            return r0
        Lda:
            r0 = r12
            r1 = 0
            r2 = r25
            r0[r1] = r2
            goto Lec
        Le2:
            int r21 = r21 + 1
        Le5:
            r0 = r21
            r1 = r22
            if (r0 < r1) goto L75
        Lec:
            r0 = r18
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L1c5
            r0 = r16
            if (r0 != 0) goto L119
            r0 = r13
            if (r0 == 0) goto L117
            r0 = r11
            java.lang.String r1 = "The field %s does not exist"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = new java.lang.String
            r6 = r5
            r7 = r14
            r6.<init>(r7)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
        L117:
            r0 = 0
            return r0
        L119:
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r14
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            r19 = r0
            r0 = r19
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r19
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            if (r1 == 0) goto L141
            r1 = 8
            goto L142
        L141:
            r1 = 0
        L142:
            r2 = 16
            r1 = r1 | r2
            r2 = 2
            r1 = r1 | r2
            r0.modifiers = r1
            org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r20
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "0"
            char[] r4 = r4.toCharArray()
            r5 = r15
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r4 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r4, r5)
            r2[r3] = r4
            r0.dimensions = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r4 = 3
            long[] r4 = new long[r4]
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r4 = 3
            long[] r4 = new long[r4]
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            r1 = r20
            r0.initialization = r1
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r19
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectField(r0, r1)
        L1c5:
            r0 = r14
            return r0
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Synchronized> r12, org.eclipse.jdt.internal.compiler.ast.Annotation r13, lombok.eclipse.EclipseNode r14) {
            r11 = this;
            r0 = r14
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SYNCHRONIZED_FLAG_USAGE
            java.lang.String r2 = "@Synchronized"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r13
            int r0 = r0.sourceStart
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            r0 = r13
            int r0 = r0.sourceStart
            r1 = 2
            int r0 = r0 - r1
            r16 = r0
            r0 = r15
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r16
            long r1 = (long) r1
            long r0 = r0 | r1
            r17 = r0
            r0 = r14
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L49
            r0 = r19
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L49
            r0 = r19
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto L50
        L49:
            r0 = r14
            java.lang.String r1 = "@Synchronized is legal only on methods."
            r0.addError(r1)
            return
        L50:
            r0 = r19
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r20 = r0
            r0 = r20
            boolean r0 = r0.isAbstract()
            if (r0 == 0) goto L69
            r0 = r14
            java.lang.String r1 = "@Synchronized is legal only on concrete methods."
            r0.addError(r1)
            return
        L69:
            r0 = r14
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.upToTypeNode(r0)
            r21 = r0
            r0 = r21
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L7e
            r0 = r14
            java.lang.String r1 = "@Synchronized is legal only on methods in classes and enums."
            r0.addError(r1)
            return
        L7e:
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = r0
            r2 = 0
            r3 = r20
            boolean r3 = r3.isStatic()
            r1[r2] = r3
            r22 = r0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r22
            r4 = 1
            char[] r0 = r0.createLockField(r1, r2, r3, r4)
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L9c
            return
        L9c:
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            if (r0 != 0) goto La5
            return
        La5:
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r24 = r0
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r24
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = r1.statements
            r0.statements = r1
            r0 = r24
            r1 = r20
            int r1 = r1.bodyEnd
            r0.sourceEnd = r1
            r0 = r24
            r1 = r20
            int r1 = r1.bodyStart
            r0.sourceStart = r1
            r0 = r22
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L106
            r0 = r21
            r1 = r23
            char[][] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getQualifiedInnerName(r0, r1)
            r26 = r0
            r0 = r26
            int r0 = r0.length
            long[] r0 = new long[r0]
            r27 = r0
            r0 = r27
            r1 = r17
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r26
            r3 = r27
            r4 = r15
            r5 = r16
            r1.<init>(r2, r3, r4, r5)
            r25 = r0
            goto L131
        L106:
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r23
            r3 = r17
            r1.<init>(r2, r3)
            r25 = r0
            org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r1 = r0
            r2 = r15
            r3 = r16
            r1.<init>(r2, r3)
            r26 = r0
            r0 = r26
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = (org.eclipse.jdt.internal.compiler.ast.FieldReference) r0
            r1 = r26
            r0.receiver = r1
        L131:
            r0 = r25
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r20
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement r4 = new org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement
            r5 = r4
            r6 = r25
            r7 = r24
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r0.statements = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r0 = r0[r1]
            r1 = r20
            int r1 = r1.bodyEnd
            r0.sourceEnd = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r0 = r0[r1]
            r1 = r20
            int r1 = r1.bodyStart
            r0.sourceStart = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r0 = r0[r1]
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            r0.rebuild()
            return
    }
}
