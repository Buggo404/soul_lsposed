package lombok.eclipse.handlers;

@lombok.eclipse.DeferUntilPostDiet
@lombok.core.HandlerPriority(1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleSneakyThrows.SCL.lombok */
public class HandleSneakyThrows extends lombok.eclipse.EclipseAnnotationHandler<lombok.SneakyThrows> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleSneakyThrows$DeclaredException.SCL.lombok */
    private static class DeclaredException {
        final java.lang.String exceptionName;
        final org.eclipse.jdt.internal.compiler.ast.ASTNode node;

        DeclaredException(java.lang.String r4, org.eclipse.jdt.internal.compiler.ast.ASTNode r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.exceptionName = r1
                r0 = r3
                r1 = r5
                r0.node = r1
                return
        }
    }

    public HandleSneakyThrows() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.SneakyThrows> r8, org.eclipse.jdt.internal.compiler.ast.Annotation r9, lombok.eclipse.EclipseNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SNEAKY_THROWS_FLAG_USAGE
            java.lang.String r2 = "@SneakyThrows"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r8
            java.lang.String r1 = "value"
            java.util.List r0 = r0.getRawExpressions(r1)
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L2b
            r0 = r13
            int r0 = r0.length
            if (r0 != 0) goto L40
        L2b:
            r0 = r12
            lombok.eclipse.handlers.HandleSneakyThrows$DeclaredException r1 = new lombok.eclipse.handlers.HandleSneakyThrows$DeclaredException
            r2 = r1
            java.lang.String r3 = "java.lang.Throwable"
            r4 = r9
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto Ld4
        L40:
            r0 = r13
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto L5e
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayInitializer) r0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r15 = r0
            goto L69
        L5e:
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r1 = r0
            r2 = 0
            r3 = r14
            r1[r2] = r3
            r15 = r0
        L69:
            r0 = r11
            int r0 = r0.size()
            r1 = r15
            int r1 = r1.length
            if (r0 == r1) goto L7c
            r0 = r10
            java.lang.String r1 = "LOMBOK BUG: The number of exception classes in the annotation isn't the same pre- and post- guessing."
            r0.addError(r1)
        L7c:
            r0 = 0
            r16 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Lca
        L8b:
            r0 = r18
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            r0 = r17
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lb1
            r0 = r17
            r1 = 0
            r2 = r17
            int r2 = r2.length()
            r3 = 6
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r17 = r0
        Lb1:
            r0 = r12
            lombok.eclipse.handlers.HandleSneakyThrows$DeclaredException r1 = new lombok.eclipse.handlers.HandleSneakyThrows$DeclaredException
            r2 = r1
            r3 = r17
            r4 = r15
            r5 = r16
            int r16 = r16 + 1
            r4 = r4[r5]
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
        Lca:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L8b
        Ld4:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r14 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r14
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 5: goto Lfc;
                default: goto L10e;
            }
        Lfc:
            r0 = r7
            r1 = r10
            r2 = r14
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r2
            r3 = r12
            r0.handleMethod(r1, r2, r3)
            goto L114
        L10e:
            r0 = r10
            java.lang.String r1 = "@SneakyThrows is legal only on methods and constructors."
            r0.addError(r1)
        L114:
            return
    }

    public void handleMethod(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r11, java.util.List<lombok.eclipse.handlers.HandleSneakyThrows.DeclaredException> r12) {
            r9 = this;
            r0 = r11
            boolean r0 = r0.isAbstract()
            if (r0 == 0) goto Le
            r0 = r10
            java.lang.String r1 = "@SneakyThrows can only be used on concrete methods."
            r0.addError(r1)
            return
        Le:
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            if (r0 == 0) goto L1d
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            int r0 = r0.length
            if (r0 != 0) goto L61
        L1d:
            r0 = 0
            r13 = r0
            r0 = r11
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L4c
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = r0.constructorCall
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L49
            r0 = r14
            boolean r0 = r0.isImplicitSuper()
            if (r0 != 0) goto L49
            r0 = r14
            boolean r0 = r0.isImplicitThis()
            if (r0 != 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            r13 = r0
        L4c:
            r0 = r13
            if (r0 == 0) goto L5a
            r0 = r10
            java.lang.String r1 = "Calls to sibling / super constructors are always excluded from @SneakyThrows; @SneakyThrows has been ignored because there is no other code in this constructor."
            r0.addWarning(r1)
            goto L60
        L5a:
            r0 = r10
            java.lang.String r1 = "This method or constructor is empty; @SneakyThrows has been ignored."
            r0.addWarning(r1)
        L60:
            return
        L61:
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r13 = r0
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L95
        L72:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleSneakyThrows$DeclaredException r0 = (lombok.eclipse.handlers.HandleSneakyThrows.DeclaredException) r0
            r14 = r0
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r1 = r0
            r2 = 0
            r3 = r9
            r4 = r13
            r5 = r14
            r6 = r14
            org.eclipse.jdt.internal.compiler.ast.ASTNode r6 = r6.node
            r7 = r11
            org.eclipse.jdt.internal.compiler.ast.Statement r3 = r3.buildTryCatchBlock(r4, r5, r6, r7)
            r1[r2] = r3
            r13 = r0
        L95:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L72
            r0 = r11
            r1 = r13
            r0.statements = r1
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r0.rebuild()
            return
    }

    public org.eclipse.jdt.internal.compiler.ast.Statement buildTryCatchBlock(org.eclipse.jdt.internal.compiler.ast.Statement[] r9, lombok.eclipse.handlers.HandleSneakyThrows.DeclaredException r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r12) {
            r8 = this;
            r0 = r12
            int r0 = r0.bodyStart
            r13 = r0
            r0 = r12
            int r0 = r0.bodyEnd
            r14 = r0
            r0 = r14
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r14
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            long r0 = r0 | r1
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.TryStatement r0 = new org.eclipse.jdt.internal.compiler.ast.TryStatement
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Block r1 = new org.eclipse.jdt.internal.compiler.ast.Block
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.tryBlock = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r13
            r0.sourceStart = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r14
            r0.sourceEnd = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            r1 = r9
            r0.statements = r1
            r0 = r10
            java.lang.String r0 = r0.exceptionName
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 != r1) goto L8b
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.exceptionName
            char[] r2 = r2.toCharArray()
            r3 = r15
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r18
            r1 = r14
            r0.statementEnd = r1
            goto Ldb
        L8b:
            r0 = r10
            java.lang.String r0 = r0.exceptionName
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r19 = r0
            r0 = r19
            int r0 = r0.length
            char[] r0 = new char[r0]
            r20 = r0
            r0 = r19
            int r0 = r0.length
            long[] r0 = new long[r0]
            r21 = r0
            r0 = r21
            r1 = r15
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r22 = r0
            goto Lc6
        Lb3:
            r0 = r20
            r1 = r22
            r2 = r19
            r3 = r22
            r2 = r2[r3]
            java.lang.String r2 = r2.trim()
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r22 = r22 + 1
        Lc6:
            r0 = r22
            r1 = r19
            int r1 = r1.length
            if (r0 < r1) goto Lb3
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r20
            r3 = r21
            r1.<init>(r2, r3)
            r18 = r0
        Ldb:
            r0 = r18
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            java.lang.String r2 = "$ex"
            char[] r2 = r2.toCharArray()
            r3 = r15
            r4 = r18
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r19 = r0
            r0 = r19
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r19
            r1 = r19
            r2 = r19
            r3 = r14
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationEnd = r3
            r0.declarationSourceEnd = r1
            r0 = r19
            r1 = r19
            r2 = r19
            r3 = r14
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.modifiersSourceStart = r3
            r0.declarationSourceStart = r1
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            r4 = r19
            r2[r3] = r4
            r0.catchArguments = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            r3 = 2
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "lombok"
            char[] r6 = r6.toCharArray()
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "Lombok"
            char[] r6 = r6.toCharArray()
            r4[r5] = r6
            r4 = 2
            long[] r4 = new long[r4]
            r5 = r14
            r6 = r14
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r14
            r0.statementEnd = r1
            r0 = r20
            java.lang.String r1 = "sneakyThrow"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            java.lang.String r2 = "$ex"
            char[] r2 = r2.toCharArray()
            r3 = r15
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r21
            r1 = r14
            r0.statementEnd = r1
            r0 = r20
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r21
            r2[r3] = r4
            r0.arguments = r1
            r0 = r20
            r1 = -2
            r0.nameSourcePosition = r1
            r0 = r20
            r1 = r14
            r0.sourceStart = r1
            r0 = r20
            r1 = r20
            r2 = r14
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.ThrowStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ThrowStatement
            r1 = r0
            r2 = r20
            r3 = r14
            r4 = r14
            r1.<init>(r2, r3, r4)
            r22 = r0
            r0 = r22
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r23 = r0
            r0 = r23
            r1 = r14
            r0.sourceStart = r1
            r0 = r23
            r1 = r14
            r0.sourceEnd = r1
            r0 = r23
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r23
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r22
            r2[r3] = r4
            r0.statements = r1
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Block[] r1 = new org.eclipse.jdt.internal.compiler.ast.Block[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            r2[r3] = r4
            r0.catchBlocks = r1
            r0 = r17
            r1 = r12
            int r1 = r1.bodyStart
            r0.sourceStart = r1
            r0 = r17
            r1 = r12
            int r1 = r1.bodyEnd
            r0.sourceEnd = r1
            r0 = r17
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleSneakyThrows.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleSneakyThrows.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
