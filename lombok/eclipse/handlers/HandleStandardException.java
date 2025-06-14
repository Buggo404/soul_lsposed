package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleStandardException.SCL.lombok */
public class HandleStandardException extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.StandardException> {
    private static final char[][] JAVA_BEANS_CONSTRUCTORPROPERTIES = null;
    private static final char[] MESSAGE = null;
    private static final char[] CAUSE = null;
    private static final char[] GET_MESSAGE = null;
    private static final char[] INIT_CAUSE = null;

    static {
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "java"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "beans"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "ConstructorProperties"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            lombok.eclipse.handlers.HandleStandardException.JAVA_BEANS_CONSTRUCTORPROPERTIES = r0
            java.lang.String r0 = "message"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleStandardException.MESSAGE = r0
            java.lang.String r0 = "cause"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleStandardException.CAUSE = r0
            java.lang.String r0 = "getMessage"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleStandardException.GET_MESSAGE = r0
            java.lang.String r0 = "initCause"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleStandardException.INIT_CAUSE = r0
            return
    }

    public HandleStandardException() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.StandardException> r6, org.eclipse.jdt.internal.compiler.ast.Annotation r7, lombok.eclipse.EclipseNode r8) {
            r5 = this;
            r0 = r8
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.STANDARD_EXCEPTION_FLAG_USAGE
            java.lang.String r2 = "@StandardException"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto L21
            r0 = r8
            java.lang.String r1 = "@StandardException is only supported on a class"
            r0.addError(r1)
            return
        L21:
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r10 = r0
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.superclass
            if (r0 != 0) goto L3a
            r0 = r8
            java.lang.String r1 = "@StandardException requires that you extend a Throwable type"
            r0.addError(r1)
            return
        L3a:
            r0 = r6
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.StandardException r0 = (lombok.experimental.StandardException) r0
            lombok.AccessLevel r0 = r0.access()
            r11 = r0
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateNoArgsConstructor(r1, r2, r3)
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateMsgOnlyConstructor(r1, r2, r3)
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateCauseOnlyConstructor(r1, r2, r3)
            r0 = r5
            r1 = r9
            r2 = r11
            r3 = r8
            r0.generateFullConstructor(r1, r2, r3)
            return
    }

    private void generateNoArgsConstructor(lombok.eclipse.EclipseNode r10, lombok.AccessLevel r11, lombok.eclipse.EclipseNode r12) {
            r9 = this;
            r0 = r10
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto Lf
            return
        Lf:
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceStart
            r13 = r0
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceEnd
            r14 = r0
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r1 = r0
            r2 = 3
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r5 = r4
            r6 = r13
            r7 = r14
            r5.<init>(r6, r7)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r5 = r4
            r6 = r13
            r7 = r14
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r11
            r1 = r10
            r2 = 0
            r3 = 0
            r4 = r12
            r5 = r15
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = createConstructor(r0, r1, r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r10
            r1 = r16
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void generateMsgOnlyConstructor(lombok.eclipse.EclipseNode r11, lombok.AccessLevel r12, lombok.eclipse.EclipseNode r13) {
            r10 = this;
            r0 = r11
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L14
            return
        L14:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceEnd
            r15 = r0
            r0 = r14
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r15
            long r1 = (long) r1
            long r0 = r0 | r1
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r1 = r0
            r2 = 3
            r1.<init>(r2)
            r18 = r0
            r0 = r18
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleStandardException.MESSAGE
            r7 = r16
            r5.<init>(r6, r7)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r5 = r4
            r6 = r14
            r7 = r15
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r12
            r1 = r11
            r2 = 1
            r3 = 0
            r4 = r13
            r5 = r18
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = createConstructor(r0, r1, r2, r3, r4, r5, r6)
            r19 = r0
            r0 = r11
            r1 = r19
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void generateCauseOnlyConstructor(lombok.eclipse.EclipseNode r11, lombok.AccessLevel r12, lombok.eclipse.EclipseNode r13) {
            r10 = this;
            r0 = r11
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r2[r3] = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L14
            return
        L14:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceEnd
            r15 = r0
            r0 = r14
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r15
            long r1 = (long) r1
            long r0 = r0 | r1
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r1 = r0
            r2 = 3
            r1.<init>(r2)
            r18 = r0
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r5 = r16
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            r4 = 29
            r1.<init>(r2, r3, r4)
            r19 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r14
            r0.sourceStart = r1
            r0 = r20
            r1 = r15
            r0.sourceEnd = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r4 = r16
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r20
            char[] r1 = lombok.eclipse.handlers.HandleStandardException.GET_MESSAGE
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r19
            r3 = r20
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r5 = r4
            r6 = r14
            r7 = r15
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            r21 = r0
            r0 = r18
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r21
            r2[r3] = r4
            r2 = r1
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r7 = r16
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r12
            r1 = r11
            r2 = 0
            r3 = 1
            r4 = r13
            r5 = r18
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = createConstructor(r0, r1, r2, r3, r4, r5, r6)
            r22 = r0
            r0 = r11
            r1 = r22
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void generateFullConstructor(lombok.eclipse.EclipseNode r11, lombok.AccessLevel r12, lombok.eclipse.EclipseNode r13) {
            r10 = this;
            r0 = r11
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r2[r3] = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = hasConstructor(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L19
            return
        L19:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            int r0 = r0.sourceEnd
            r15 = r0
            r0 = r14
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r15
            long r1 = (long) r1
            long r0 = r0 | r1
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r1 = r0
            r2 = 2
            r1.<init>(r2)
            r18 = r0
            r0 = r18
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleStandardException.MESSAGE
            r7 = r16
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r5 = r16
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            r4 = 29
            r1.<init>(r2, r3, r4)
            r19 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r14
            r0.sourceStart = r1
            r0 = r20
            r1 = r15
            r0.sourceEnd = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.SuperReference r1 = new org.eclipse.jdt.internal.compiler.ast.SuperReference
            r2 = r1
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r20
            char[] r1 = lombok.eclipse.handlers.HandleStandardException.INIT_CAUSE
            r0.selector = r1
            r0 = r20
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r7 = r16
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r19
            r3 = r20
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            r21 = r0
            r0 = r12
            r1 = r11
            r2 = 1
            r3 = 1
            r4 = r13
            r5 = r18
            r6 = r21
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = createConstructor(r0, r1, r2, r3, r4, r5, r6)
            r22 = r0
            r0 = r11
            r1 = r22
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult hasConstructor(lombok.eclipse.EclipseNode r4, java.lang.Class<?>... r5) {
            r0 = r4
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.upToTypeNode(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L77
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L77
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto L77
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L70
        L32:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L6d
            r0 = r7
            int r0 = r0.bits
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L4d
            goto L6d
        L4d:
            r0 = r4
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            r2 = r5
            boolean r0 = paramsMatch(r0, r1, r2)
            if (r0 != 0) goto L5c
            goto L6d
        L5c:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getGeneratedBy(r0)
            if (r0 != 0) goto L69
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L6c
        L69:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L6c:
            return r0
        L6d:
            int r8 = r8 + 1
        L70:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L32
        L77:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    private static boolean paramsMatch(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.Argument[] r6, java.lang.Class<?>[] r7) {
            r0 = r6
            if (r0 != 0) goto L11
            r0 = r7
            if (r0 == 0) goto Lf
            r0 = r7
            int r0 = r0.length
            if (r0 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
        L11:
            r0 = r7
            if (r0 != 0) goto L1e
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
        L1e:
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            if (r0 == r1) goto L27
            r0 = 0
            return r0
        L27:
            r0 = 0
            r8 = r0
            goto L41
        L2c:
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            r1 = r5
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 != 0) goto L3e
            r0 = 0
            return r0
        L3e:
            int r8 = r8 + 1
        L41:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 < r1) goto L2c
            r0 = 1
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] createConstructorProperties(org.eclipse.jdt.internal.compiler.ast.ASTNode r9, boolean r10, boolean r11) {
            r0 = r10
            if (r0 != 0) goto La
            r0 = r11
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r9
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r9
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = r12
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r13
            long r1 = (long) r1
            long r0 = r0 | r1
            r14 = r0
            r0 = 3
            long[] r0 = new long[r0]
            r16 = r0
            r0 = r16
            r1 = r14
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.HandleStandardException.JAVA_BEANS_CONSTRUCTORPROPERTIES
            r3 = r16
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            r1 = r0
            r2 = r17
            r3 = r12
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r18
            r1 = r13
            r0.declarationSourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r12
            r0.sourceStart = r1
            r0 = r19
            r1 = r13
            r0.sourceEnd = r1
            r0 = r19
            r1 = r10
            if (r1 == 0) goto L78
            r1 = r11
            if (r1 == 0) goto L78
            r1 = 2
            goto L79
        L78:
            r1 = 1
        L79:
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r0.expressions = r1
            r0 = 0
            r20 = r0
            r0 = r10
            if (r0 == 0) goto Lac
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r2 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleStandardException.MESSAGE
            r5 = r12
            r6 = r13
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r20
            r0 = r0[r1]
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            int r20 = r20 + 1
        Lac:
            r0 = r11
            if (r0 == 0) goto Ld6
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r2 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r5 = r12
            r6 = r13
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r20
            r0 = r0[r1]
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            int r20 = r20 + 1
        Ld6:
            r0 = r18
            r1 = r19
            r0.memberValue = r1
            r0 = r18
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.memberValue
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r18
            r1[r2] = r3
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration createConstructor(lombok.AccessLevel r9, lombok.eclipse.EclipseNode r10, boolean r11, boolean r12, lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r14, org.eclipse.jdt.internal.compiler.ast.Statement r15) {
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r16 = r0
            r0 = r10
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r17 = r0
            r0 = r16
            int r0 = r0.sourceStart
            r18 = r0
            r0 = r16
            int r0 = r0.sourceEnd
            r19 = r0
            r0 = r18
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r19
            long r1 = (long) r1
            long r0 = r0 | r1
            r20 = r0
            r0 = r11
            if (r0 != 0) goto L35
            r0 = r12
            if (r0 == 0) goto L3c
        L35:
            r0 = r10
            boolean r0 = isLocalType(r0)
            if (r0 == 0) goto L42
        L3c:
            r0 = 0
            r22 = r0
            goto L70
        L42:
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_ADD_CONSTRUCTOR_PROPERTIES
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L5e
            r0 = r23
            boolean r0 = r0.booleanValue()
            goto L6e
        L5e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r10
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_SUPPRESS_CONSTRUCTOR_PROPERTIES
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L6e:
            r22 = r0
        L70:
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            r1 = r0
            r2 = r10
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r23 = r0
            r0 = r23
            r1 = r9
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r23
            r1 = r17
            char[] r1 = r1.name
            r0.selector = r1
            r0 = r23
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r23
            r1 = 0
            r0.typeParameters = r1
            r0 = r23
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r23
            r1 = r23
            r2 = r23
            r3 = r18
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r23
            r1 = r23
            r2 = r23
            r3 = r19
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = r23
            r1 = 0
            r0.arguments = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r11
            if (r0 == 0) goto L128
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_STRING
            r3 = 3
            long[] r3 = new long[r3]
            r4 = r3
            r5 = 0
            r6 = r20
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r20
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r20
            r4[r5] = r6
            r1.<init>(r2, r3)
            r25 = r0
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleStandardException.MESSAGE
            r3 = r20
            r4 = r25
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r26 = r0
            r0 = r24
            r1 = r26
            boolean r0 = r0.add(r1)
        L128:
            r0 = r12
            if (r0 == 0) goto L166
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_THROWABLE
            r3 = 3
            long[] r3 = new long[r3]
            r4 = r3
            r5 = 0
            r6 = r20
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r20
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r20
            r4[r5] = r6
            r1.<init>(r2, r3)
            r25 = r0
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleStandardException.CAUSE
            r3 = r20
            r4 = r25
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r26 = r0
            r0 = r24
            r1 = r26
            boolean r0 = r0.add(r1)
        L166:
            r0 = r14
            r1 = r18
            r0.sourceStart = r1
            r0 = r14
            r1 = r19
            r0.sourceEnd = r1
            r0 = r23
            r1 = r14
            r0.constructorCall = r1
            r0 = r23
            r1 = r15
            if (r1 == 0) goto L18e
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r15
            r2[r3] = r4
            goto L18f
        L18e:
            r1 = 0
        L18f:
            r0.statements = r1
            r0 = r23
            r1 = r24
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a2
            r1 = 0
            goto L1b0
        L1a2:
            r1 = r24
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument[] r2 = new org.eclipse.jdt.internal.compiler.ast.Argument[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = (org.eclipse.jdt.internal.compiler.ast.Argument[]) r1
        L1b0:
            r0.arguments = r1
            r0 = 0
            r25 = r0
            r0 = r22
            if (r0 == 0) goto L1c4
            r0 = r16
            r1 = r11
            r2 = r12
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = createConstructorProperties(r0, r1, r2)
            r25 = r0
        L1c4:
            r0 = r23
            r1 = r16
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r25
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r23
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r16
            r2.<init>(r3)
            r2 = r17
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r23
            return r0
    }

    public static boolean isLocalType(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L26
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            boolean r0 = isLocalType(r0)
            return r0
        L26:
            r0 = 1
            return r0
    }
}
