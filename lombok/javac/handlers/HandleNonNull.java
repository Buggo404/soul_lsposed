package lombok.javac.handlers;

@lombok.core.HandlerPriority(512)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleNonNull.SCL.lombok */
public class HandleNonNull extends lombok.javac.JavacAnnotationHandler<lombok.NonNull> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    public HandleNonNull() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl createRecordArgslessConstructor(lombok.javac.JavacNode r11, lombok.javac.JavacNode r12, com.sun.tools.javac.tree.JCTree.JCMethodDecl r13) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r11
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L57
        L1b:
            r0 = r17
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r16 = r0
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L57
            r0 = r16
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r18 = r0
            r0 = r18
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L57
            r0 = r15
            r1 = r18
            boolean r0 = r0.add(r1)
        L57:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = 0
            r17 = r0
            goto Lab
        L70:
            r0 = r15
            r1 = r17
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r18 = r0
            r0 = r14
            r1 = 8606711808(0x201000000, double:4.252280628E-314)
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.mods
            com.sun.tools.javac.util.List r2 = r2.annotations
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r19 = r0
            r0 = r16
            r1 = r14
            r2 = r19
            r3 = r18
            com.sun.tools.javac.util.Name r3 = r3.name
            r4 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.vartype
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            int r17 = r17 + 1
        Lab:
            r0 = r17
            r1 = r15
            int r1 = r1.size()
            if (r0 < r1) goto L70
            r0 = r14
            lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
            int r1 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r1)
            long r1 = (long) r1
            r2 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r1 = r1 | r2
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r17 = r0
            r0 = r14
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r18 = r0
            r0 = r13
            if (r0 != 0) goto L103
            r0 = r14
            r1 = r17
            r2 = r11
            java.lang.String r3 = "<init>"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r16
            com.sun.tools.javac.util.List r5 = r5.toList()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r18
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r19 = r0
            r0 = r19
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
        L103:
            r0 = r13
            r1 = r17
            r0.mods = r1
            r0 = r13
            r1 = r18
            r0.body = r1
            r0 = r13
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r13 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r11
            r2 = r11
            r3 = r13
            com.sun.tools.javac.tree.JCTree r3 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r11
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            lombok.javac.handlers.JavacHandlerUtil.addSuppressWarningsAll(r0, r1, r2, r3)
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r11
            r2 = r11
            r3 = r13
            com.sun.tools.javac.tree.JCTree r3 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r11
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            lombok.javac.handlers.JavacHandlerUtil.addGenerated(r0, r1, r2, r3)
            r0 = r13
            return r0
    }

    private com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCMethodDecl> addCompactConstructorIfNeeded(lombok.javac.JavacNode r7, lombok.javac.JavacNode r8) {
            r6 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L12
            r0 = r7
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 != 0) goto L14
        L12:
            r0 = r9
            return r0
        L14:
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L30
            r0 = r9
            return r0
        L30:
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Lbe
        L43:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto Lbe
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r15 = r0
            r0 = r15
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "<init>"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto Lbe
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L9a
            r0 = r15
            r12 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            long r1 = r1.flags
            r2 = -68719476737(0xffffffefffffffff, double:NaN)
            long r1 = r1 & r2
            r0.flags = r1
            r0 = 1
            r11 = r0
            goto Lbe
        L9a:
            r0 = r7
            r1 = r15
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isTolerate(r0, r1)
            if (r0 != 0) goto Lbe
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbe
            r0 = 0
            r11 = r0
            r0 = r9
            r1 = r15
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r9 = r0
        Lbe:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L43
            r0 = r11
            if (r0 == 0) goto Lf5
            r0 = r12
            if (r0 == 0) goto Ldf
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createRecordArgslessConstructor(r1, r2, r3)
            r13 = r0
            goto Lee
        Ldf:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createRecordArgslessConstructor(r1, r2, r3)
            r13 = r0
            r0 = r7
            r1 = r13
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        Lee:
            r0 = r9
            r1 = r13
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r9 = r0
        Lf5:
            r0 = r9
            return r0
    }

    private void addNullCheckIfNeeded(com.sun.tools.javac.tree.JCTree.JCMethodDecl r5, lombok.javac.JavacNode r6, lombok.javac.JavacNode r7) {
            r4 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = lombok.javac.handlers.JavacHandlerUtil.generateNullCheck(r0, r1, r2)
            r1 = r7
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1f
            r0 = r7
            java.lang.String r1 = "@NonNull is meaningless on a primitive."
            r0.addWarning(r1)
            return
        L1f:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            r9 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()
            r10 = r0
            r0 = r9
            r11 = r0
            r0 = 0
            r12 = r0
            goto La3
        L38:
            r0 = r11
            r1 = r12
            int r12 = r12 + 1
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r13 = r0
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isConstructorCall(r0)
            if (r0 == 0) goto L52
            goto La3
        L52:
            r0 = r13
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTry
            if (r0 == 0) goto L6d
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCTry r0 = (com.sun.tools.javac.tree.JCTree.JCTry) r0
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            r11 = r0
            r0 = 0
            r12 = r0
            goto La3
        L6d:
            r0 = r13
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCSynchronized
            if (r0 == 0) goto L88
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCSynchronized r0 = (com.sun.tools.javac.tree.JCTree.JCSynchronized) r0
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            r11 = r0
            r0 = 0
            r12 = r0
            goto La3
        L88:
            r0 = r4
            r1 = r13
            java.lang.String r0 = r0.returnVarNameIfNullCheck(r1)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L98
            goto Lad
        L98:
            r0 = r14
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La3
            return
        La3:
            r0 = r11
            int r0 = r0.size()
            r1 = r12
            if (r0 > r1) goto L38
        Lad:
            r0 = r9
            r11 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r12 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Lf5
        Lc0:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r13 = r0
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isConstructorCall(r0)
            if (r0 != 0) goto Le5
            r0 = r13
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isGenerated(r0)
            if (r0 == 0) goto Lff
            r0 = r4
            r1 = r13
            boolean r0 = r0.isNullCheck(r1)
            if (r0 == 0) goto Lff
        Le5:
            r0 = r11
            com.sun.tools.javac.util.List r0 = r0.tail
            r11 = r0
            r0 = r12
            r1 = r13
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r12 = r0
        Lf5:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc0
        Lff:
            r0 = r11
            r1 = r8
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r13 = r0
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L127
        L112:
            r0 = r15
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r14 = r0
            r0 = r13
            r1 = r14
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r13 = r0
        L127:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L112
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            r1 = r13
            r0.stats = r1
            r0 = r7
            lombok.javac.JavacAST r0 = r0.getAst()
            r0.setChanged()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.NonNull> r6, com.sun.tools.javac.tree.JCTree.JCAnnotation r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r8
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.NON_NULL_FLAG_USAGE
            java.lang.String r2 = "@NonNull"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L9e
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()     // Catch: java.lang.Exception -> L3a
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0     // Catch: java.lang.Exception -> L3a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L3a
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0     // Catch: java.lang.Exception -> L3a
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype     // Catch: java.lang.Exception -> L3a
            boolean r0 = lombok.javac.Javac.isPrimitive(r0)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L3b
            r0 = r8
            java.lang.String r1 = "@NonNull is meaningless on a primitive."
            r0.addWarning(r1)     // Catch: java.lang.Exception -> L3a
            goto L3b
        L3a:
        L3b:
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r9 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L9d
            r0 = r5
            r1 = r8
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r8
            com.sun.tools.javac.util.List r0 = r0.addCompactConstructorIfNeeded(r1, r2)
            r10 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L93
        L79:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r11 = r0
            r0 = r5
            r1 = r11
            r2 = r8
            lombok.core.LombokNode r2 = r2.m66up()
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r8
            r0.addNullCheckIfNeeded(r1, r2, r3)
        L93:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L79
        L9d:
            return
        L9e:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r8
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 7: goto Lcc;
                case 8: goto Lee;
                case 9: goto Lee;
                case 10: goto Ld8;
                default: goto Lee;
            }
        Lcc:
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            goto Lef
        Ld8:
            r0 = r8
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            goto Lef
        Lee:
            return
        Lef:
            r0 = r10
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT
            if (r0 == r1) goto Lfb
            return
        Lfb:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()     // Catch: java.lang.Exception -> L10e
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0     // Catch: java.lang.Exception -> L10e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L10e
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0     // Catch: java.lang.Exception -> L10e
            r9 = r0
            goto L110
        L10e:
            return
        L110:
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            if (r0 != 0) goto L119
            return
        L119:
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2251799830462464(0x8000001000000, double:1.1125369375426468E-308)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12b
            return
        L12b:
            r0 = r5
            r1 = r9
            r2 = r10
            r3 = r8
            r0.addNullCheckIfNeeded(r1, r2, r3)
            return
    }

    public boolean isNullCheck(com.sun.tools.javac.tree.JCTree.JCStatement r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.returnVarNameIfNullCheck(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public java.lang.String returnVarNameIfNullCheck(com.sun.tools.javac.tree.JCTree.JCStatement r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIf
            r5 = r0
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCExpressionStatement
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L1b
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssert
            if (r0 != 0) goto L1b
            r0 = r6
            if (r0 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r6
            if (r0 == 0) goto Lc6
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.expr
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssign
            if (r0 == 0) goto L3a
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.rhs
            r7 = r0
        L3a:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodInvocation
            if (r0 != 0) goto L44
            r0 = 0
            return r0
        L44:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            r8 = r0
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L6a
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r10 = r0
            goto L7c
        L6a:
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L7c
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r10 = r0
        L7c:
            r0 = r10
            if (r0 == 0) goto L97
            r0 = r10
            java.lang.String r1 = "checkNotNull"
            boolean r0 = r0.contentEquals(r1)
            if (r0 != 0) goto L99
            r0 = r10
            java.lang.String r1 = "requireNonNull"
            boolean r0 = r0.contentEquals(r1)
            if (r0 != 0) goto L99
        L97:
            r0 = 0
            return r0
        L99:
            r0 = r8
            com.sun.tools.javac.util.List r0 = r0.args
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
            r0 = 0
            return r0
        La6:
            r0 = r8
            com.sun.tools.javac.util.List r0 = r0.args
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 != 0) goto Lbd
            r0 = 0
            return r0
        Lbd:
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            java.lang.String r0 = r0.toString()
            return r0
        Lc6:
            r0 = r5
            if (r0 == 0) goto L104
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCIf r0 = (com.sun.tools.javac.tree.JCTree.JCIf) r0
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.thenpart
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto Lfa
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            com.sun.tools.javac.util.List r0 = r0.stats
            r8 = r0
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto Lef
            r0 = 0
            return r0
        Lef:
            r0 = r8
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r7 = r0
        Lfa:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCThrow
            if (r0 != 0) goto L104
            r0 = 0
            return r0
        L104:
            r0 = r5
            if (r0 == 0) goto L112
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCIf r0 = (com.sun.tools.javac.tree.JCTree.JCIf) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cond
            goto L119
        L112:
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCAssert r0 = (com.sun.tools.javac.tree.JCTree.JCAssert) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cond
        L119:
            r7 = r0
            goto L128
        L11e:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCParens r0 = (com.sun.tools.javac.tree.JCTree.JCParens) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.expr
            r7 = r0
        L128:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 != 0) goto L11e
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBinary
            if (r0 != 0) goto L13a
            r0 = 0
            return r0
        L13a:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = (com.sun.tools.javac.tree.JCTree.JCBinary) r0
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L155
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_EQUAL
            r1 = r8
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L165
            r0 = 0
            return r0
        L155:
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_NOT_EQUAL
            r1 = r8
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L165
            r0 = 0
            return r0
        L165:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 != 0) goto L172
            r0 = 0
            return r0
        L172:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.rhs
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCLiteral
            if (r0 != 0) goto L17f
            r0 = 0
            return r0
        L17f:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BOT
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.rhs
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L192
            r0 = 0
            return r0
        L192:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleNonNull.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.handlers.HandleNonNull.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
