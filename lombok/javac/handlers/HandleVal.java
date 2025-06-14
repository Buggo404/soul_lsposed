package lombok.javac.handlers;

@lombok.core.HandlerPriority(65636)
@lombok.javac.ResolutionResetNeeded
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleVal.SCL.lombok */
public class HandleVal extends lombok.javac.JavacASTAdapter {
    public HandleVal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    /* renamed from: eq */
    private static boolean m89eq(java.lang.String r5, java.lang.String r6) {
            r0 = r5
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "lombok."
            r2.<init>(r3)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "lombok.experimental."
            r2.<init>(r3)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            r0 = 0
            return r0
        L38:
            r0 = 1
            return r0
    }

    @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
    public void endVisitLocal(lombok.javac.JavacNode r7, com.sun.tools.javac.tree.JCTree.JCVariableDecl r8) {
            r6 = this;
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r9 = r0
            r0 = r9
            if (r0 != 0) goto La
            return
        La:
            r0 = r9
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r7
            r1 = r9
            lombok.core.LombokNode r0 = r0.getNodeFor(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r10
            java.lang.String r1 = "val"
            boolean r0 = m89eq(r0, r1)
            if (r0 != 0) goto L2f
            r0 = r10
            java.lang.String r1 = "var"
            boolean r0 = m89eq(r0, r1)
            if (r0 != 0) goto L2f
            return
        L2f:
            java.lang.Class<lombok.val> r0 = lombok.val.class
            r1 = r7
            r2 = r9
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.typeMatches(r0, r1, r2)
            r12 = r0
            java.lang.Class<lombok.var> r0 = lombok.var.class
            r1 = r7
            r2 = r9
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.typeMatches(r0, r1, r2)
            r13 = r0
            r0 = r12
            if (r0 != 0) goto L4c
            r0 = r13
            if (r0 != 0) goto L4c
            return
        L4c:
            r0 = r12
            if (r0 == 0) goto L5a
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.VAL_FLAG_USAGE
            java.lang.String r2 = "val"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
        L5a:
            r0 = r13
            if (r0 == 0) goto L68
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.VAR_FLAG_USAGE
            java.lang.String r2 = "var"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
        L68:
            r0 = r7
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r14 = r0
            r0 = r12
            if (r0 == 0) goto L8b
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCForLoop
            if (r0 == 0) goto L8b
            r0 = r7
            java.lang.String r1 = "'val' is not allowed in old-style for loops"
            r0.addError(r1)
            return
        L8b:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCForLoop
            if (r0 == 0) goto La9
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCForLoop r0 = (com.sun.tools.javac.tree.JCTree.JCForLoop) r0
            com.sun.tools.javac.util.List r0 = r0.getInitializer()
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto La9
            r0 = r7
            java.lang.String r1 = "'var' is not allowed in old-style for loops if there is more than 1 initializer"
            r0.addError(r1)
            return
        La9:
            r0 = 0
            r15 = r0
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto Ld2
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCEnhancedForLoop
            if (r0 == 0) goto Ld2
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCEnhancedForLoop r0 = (com.sun.tools.javac.tree.JCTree.JCEnhancedForLoop) r0
            r16 = r0
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.var
            r1 = r8
            if (r0 != r1) goto Ld2
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.expr
            r15 = r0
        Ld2:
            r0 = r10
            r16 = r0
            r0 = r15
            if (r0 != 0) goto Lfd
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto Lfd
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' on a local variable requires an initializer expression"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lfd:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewArray
            if (r0 == 0) goto L12f
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = (com.sun.tools.javac.tree.JCTree.JCNewArray) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            if (r0 != 0) goto L12f
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' is not compatible with array initializer expressions. Use the full form (new int[] { ... } instead of just { ... })"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L12f:
            r0 = r7
            boolean r0 = r0.shouldDeleteLombokAnnotations()
            if (r0 == 0) goto L151
            r0 = r7
            java.lang.Class<lombok.val> r1 = lombok.val.class
            java.lang.String r1 = r1.getName()
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r7
            java.lang.Class<lombok.experimental.var> r1 = lombok.experimental.var.class
            java.lang.String r1 = r1.getName()
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r7
            java.lang.Class<lombok.var> r1 = lombok.var.class
            java.lang.String r1 = r1.getName()
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
        L151:
            r0 = r12
            if (r0 == 0) goto L165
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 16
            long r1 = r1 | r2
            r0.flags = r1
        L165:
            r0 = r7
            boolean r0 = r0.shouldDeleteLombokAnnotations()
            if (r0 != 0) goto L1a9
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r17 = r0
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            if (r1 != 0) goto L19a
            r1 = r17
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            goto L1a6
        L19a:
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r17
            com.sun.tools.javac.util.List r1 = r1.append(r2)
        L1a6:
            r0.annotations = r1
        L1a9:
            r0 = r7
            int r0 = r0.getSourceVersion()
            r1 = 10
            if (r0 < r1) goto L1bf
            r0 = r8
            r1 = 0
            r0.vartype = r1
            r0 = r7
            lombok.javac.JavacAST r0 = r0.getAst()
            r0.setChanged()
            return
        L1bf:
            boolean r0 = lombok.javac.JavacResolution.platformHasTargetTyping()
            if (r0 == 0) goto L1df
            r0 = r8
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.javac.JavacTreeMaker r1 = r1.getTreeMaker()
            r2 = r7
            lombok.javac.JavacAST r2 = r2.getAst()
            java.lang.String r3 = "___Lombok_VAL_Attrib__"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r0.vartype = r1
            goto L1ea
        L1df:
            r0 = r8
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.JavacResolution.createJavaLangObject(r1)
            r0.vartype = r1
        L1ea:
            r0 = r15
            if (r0 != 0) goto L2e6
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            if (r0 != 0) goto L271
            r0 = r13
            if (r0 == 0) goto L21b
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCLiteral     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            if (r0 == 0) goto L21b
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = (com.sun.tools.javac.tree.JCTree.JCLiteral) r0     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.Object r0 = r0.value     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            if (r0 != 0) goto L21b
            r0 = r7
            java.lang.String r1 = "variable initializer is 'null'"
            r0.addError(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
        L21b:
            lombok.javac.JavacResolution r0 = new lombok.javac.JavacResolution     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1 = r0
            r2 = r7
            com.sun.tools.javac.util.Context r2 = r2.getContext()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r18 = r0
            r0 = r18
            r1 = r7
            java.util.Map r0 = r0.resolveMethodMember(r1)     // Catch: java.lang.RuntimeException -> L242 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.init     // Catch: java.lang.RuntimeException -> L242 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.RuntimeException -> L242 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.RuntimeException -> L242 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L242 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r17 = r0
            goto L320
        L242:
            r19 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r1
            java.lang.String r3 = "Exception while resolving: "
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r2 = "("
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r7
            java.lang.String r2 = r2.getFileName()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.println(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0 = r19
            throw r0     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
        L271:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r17 = r0
            r0 = r17
            boolean r0 = r0.isErroneous()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            if (r0 == 0) goto L320
            lombok.javac.JavacResolution r0 = new lombok.javac.JavacResolution     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1 = r0
            r2 = r7
            com.sun.tools.javac.util.Context r2 = r2.getContext()     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r18 = r0
            r0 = r8
            r1 = r7
            com.sun.tools.javac.util.Context r1 = r1.getContext()     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Symtab r1 = com.sun.tools.javac.code.Symtab.instance(r1)     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r1 = r1.unknownType     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.type = r1     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0 = r18
            r1 = r7
            java.util.Map r0 = r0.resolveMethodMember(r1)     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.init     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L2b7 java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r17 = r0
            goto L320
        L2b7:
            r18 = move-exception
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r1
            java.lang.String r3 = "Exception while resolving: "
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r2 = "("
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r7
            java.lang.String r2 = r2.getFileName()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.println(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0 = r18
            throw r0     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
        L2e6:
            r0 = r15
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            if (r0 != 0) goto L319
            lombok.javac.JavacResolution r0 = new lombok.javac.JavacResolution     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1 = r0
            r2 = r7
            com.sun.tools.javac.util.Context r2 = r2.getContext()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r18 = r0
            r0 = r18
            r1 = r7
            lombok.core.LombokNode r1 = r1.directUp()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.util.Map r0 = r0.resolveMethodMember(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r1 = r15
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r17 = r0
            goto L320
        L319:
            r0 = r15
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r17 = r0
        L320:
            r0 = r15
            if (r0 == 0) goto L350
            r0 = r17
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.code.Type r0 = lombok.javac.JavacResolution.ifTypeIsIterableToComponent(r0, r1)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r19 = r0
            r0 = r19
            if (r0 != 0) goto L341
            r0 = r7
            lombok.javac.JavacAST r0 = r0.getAst()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.JavacResolution.createJavaLangObject(r0)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r18 = r0
            goto L35c
        L341:
            r0 = r19
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.JavacResolution.typeToJCTree(r0, r1, r2)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r18 = r0
            goto L35c
        L350:
            r0 = r17
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.JavacResolution.typeToJCTree(r0, r1, r2)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r18 = r0
        L35c:
            r0 = r18
            if (r0 == 0) goto L36a
            r0 = r8
            r1 = r18
            r0.vartype = r1     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            goto L375
        L36a:
            r0 = r8
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.JavacResolution.createJavaLangObject(r1)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.vartype = r1     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
        L375:
            r0 = r7
            lombok.javac.JavacAST r0 = r0.getAst()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.setChanged()     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L37f java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            goto L3d2
        L37f:
            r18 = move-exception
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r1
            java.lang.String r3 = "Cannot use '"
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r2 = "' here because initializer expression does not have a representable type: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r2 = r18
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.addError(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0 = r8
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.JavacResolution.createJavaLangObject(r1)     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            r0.vartype = r1     // Catch: java.lang.RuntimeException -> L3b3 java.lang.Throwable -> L3c3
            goto L3d2
        L3b3:
            r18 = move-exception
            r0 = r8
            r1 = r7
            lombok.javac.JavacAST r1 = r1.getAst()     // Catch: java.lang.Throwable -> L3c3
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.JavacResolution.createJavaLangObject(r1)     // Catch: java.lang.Throwable -> L3c3
            r0.vartype = r1     // Catch: java.lang.Throwable -> L3c3
            r0 = r18
            throw r0     // Catch: java.lang.Throwable -> L3c3
        L3c3:
            r20 = move-exception
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r20
            throw r0
        L3d2:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            return
    }
}
