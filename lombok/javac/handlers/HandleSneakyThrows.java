package lombok.javac.handlers;

@lombok.core.HandlerPriority(1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleSneakyThrows.SCL.lombok */
public class HandleSneakyThrows extends lombok.javac.JavacAnnotationHandler<lombok.SneakyThrows> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    public HandleSneakyThrows() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.SneakyThrows> r6, com.sun.tools.javac.tree.JCTree.JCAnnotation r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r8
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SNEAKY_THROWS_FLAG_USAGE
            java.lang.String r2 = "@SneakyThrows"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r8
            java.lang.Class<lombok.SneakyThrows> r1 = lombok.SneakyThrows.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r6
            java.lang.String r1 = "value"
            java.util.List r0 = r0.getRawExpressions(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
            java.lang.String r0 = "java.lang.Throwable"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r9 = r0
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L6d
        L3d:
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L63
            r0 = r11
            r1 = 0
            r2 = r11
            int r2 = r2.length()
            r3 = 6
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r11 = r0
        L63:
            r0 = r10
            r1 = r11
            boolean r0 = r0.add(r1)
        L6d:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3d
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r11
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 5: goto La0;
                default: goto Lb2;
            }
        La0:
            r0 = r5
            r1 = r8
            r2 = r11
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r2 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r2
            r3 = r10
            r0.handleMethod(r1, r2, r3)
            goto Lb8
        Lb2:
            r0 = r8
            java.lang.String r1 = "@SneakyThrows is legal only on methods and constructors."
            r0.addError(r1)
        Lb8:
            return
    }

    public void handleMethod(lombok.javac.JavacNode r7, com.sun.tools.javac.tree.JCTree.JCMethodDecl r8, java.util.Collection<java.lang.String> r9) {
            r6 = this;
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            r0 = r7
            java.lang.String r1 = "@SneakyThrows can only be used on concrete methods."
            r0.addError(r1)
            return
        L20:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            if (r0 == 0) goto L34
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
        L34:
            r0 = r6
            r1 = r10
            r2 = r7
            r3 = 0
            r0.generateEmptyBlockWarning(r1, r2, r3)
            return
        L3d:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r11 = r0
            r0 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isConstructorCall(r0)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L66
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            com.sun.tools.javac.util.List r0 = r0.tail
            goto L6d
        L66:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
        L6d:
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7c
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L85
        L7c:
            r0 = r6
            r1 = r10
            r2 = r7
            r3 = 1
            r0.generateEmptyBlockWarning(r1, r2, r3)
            return
        L85:
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto Lac
        L90:
            r0 = r15
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r6
            r1 = r10
            r2 = r13
            r3 = r14
            r4 = r7
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.buildTryCatchBlock(r1, r2, r3, r4)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r13 = r0
        Lac:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L90
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            r1 = r12
            if (r1 == 0) goto Lcc
            r1 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            r2 = r13
            com.sun.tools.javac.util.List r1 = r1.appendList(r2)
            goto Lce
        Lcc:
            r1 = r13
        Lce:
            r0.stats = r1
            r0 = r10
            r0.rebuild()
            return
    }

    public void generateEmptyBlockWarning(lombok.javac.JavacNode r4, lombok.javac.JavacNode r5, boolean r6) {
            r3 = this;
            r0 = r6
            if (r0 == 0) goto Ld
            r0 = r5
            java.lang.String r1 = "Calls to sibling / super constructors are always excluded from @SneakyThrows; @SneakyThrows has been ignored because there is no other code in this constructor."
            r0.addWarning(r1)
            goto L13
        Ld:
            r0 = r5
            java.lang.String r1 = "This method or constructor is empty; @SneakyThrows has been ignored."
            r0.addWarning(r1)
        L13:
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCStatement buildTryCatchBlock(lombok.javac.JavacNode r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r13, java.lang.String r14, lombok.javac.JavacNode r15) {
            r11 = this;
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r16 = r0
            r0 = r16
            r1 = 0
            r2 = r13
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            r17 = r0
            r0 = r12
            r1 = r14
            java.lang.String r2 = "\\."
            java.lang.String[] r1 = r1.split(r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1)
            r18 = r0
            r0 = r16
            r1 = r16
            r2 = 8589934608(0x200000010, double:4.24399159E-314)
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r12
            java.lang.String r3 = "$ex"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r18
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r19 = r0
            r0 = r12
            java.lang.String r1 = "lombok"
            java.lang.String r2 = "Lombok"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "sneakyThrow"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r20 = r0
            r0 = r16
            r1 = 0
            r2 = r16
            r3 = r16
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r20
            r6 = r16
            r7 = r12
            java.lang.String r8 = "$ex"
            com.sun.tools.javac.util.Name r7 = r7.toName(r8)
            com.sun.tools.javac.tree.JCTree$JCIdent r6 = r6.Ident(r7)
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.of(r6)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r3 = r3.Apply(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCThrow r2 = r2.Throw(r3)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r21 = r0
            r0 = r16
            r1 = r17
            r2 = r16
            r3 = r19
            r4 = r21
            com.sun.tools.javac.tree.JCTree$JCCatch r2 = r2.Catch(r3, r4)
            r3 = r15
            com.sun.tools.javac.tree.JCTree r2 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCCatch r2 = (com.sun.tools.javac.tree.JCTree.JCCatch) r2
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCTry r0 = r0.Try(r1, r2, r3)
            r22 = r0
            r0 = r12
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.inNetbeansEditor(r0)
            if (r0 == 0) goto Lec
            r0 = r12
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r23 = r0
            r0 = r13
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            int r0 = r0.pos
            r24 = r0
            r0 = r13
            java.lang.Object r0 = r0.last()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r0 = r0.pos()
            r1 = r23
            int r0 = lombok.javac.Javac.getEndPosition(r0, r1)
            r25 = r0
            r0 = r17
            r1 = r24
            r0.pos = r1
            r0 = r22
            r1 = r24
            r0.pos = r1
            r0 = r17
            r1 = r25
            r2 = r23
            lombok.javac.Javac.storeEnd(r0, r1, r2)
            r0 = r22
            r1 = r25
            r2 = r23
            lombok.javac.Javac.storeEnd(r0, r1, r2)
        Lec:
            r0 = r22
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleSneakyThrows.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.handlers.HandleSneakyThrows.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
