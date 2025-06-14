package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleHelper.SCL.lombok */
public class HandleHelper extends lombok.javac.JavacAnnotationHandler<lombok.experimental.Helper> {


    public HandleHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> getStatementsFromJcNode(com.sun.tools.javac.tree.JCTree r3) {
            r2 = this;
            r0 = r3
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto Lf
            r0 = r3
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            com.sun.tools.javac.util.List r0 = r0.stats
            return r0
        Lf:
            r0 = r3
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCCase
            if (r0 == 0) goto L1e
            r0 = r3
            com.sun.tools.javac.tree.JCTree$JCCase r0 = (com.sun.tools.javac.tree.JCTree.JCCase) r0
            com.sun.tools.javac.util.List r0 = r0.stats
            return r0
        L1e:
            r0 = 0
            return r0
    }

    private void setStatementsOfJcNode(com.sun.tools.javac.tree.JCTree r7, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r8) {
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L12
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            r1 = r8
            r0.stats = r1
            goto L3f
        L12:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCCase
            if (r0 == 0) goto L24
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCCase r0 = (com.sun.tools.javac.tree.JCTree.JCCase) r0
            r1 = r8
            r0.stats = r1
            goto L3f
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Can't set statements on node type: "
            r3.<init>(r4)
            r3 = r7
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3f:
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.Helper> r10, com.sun.tools.javac.tree.JCTree.JCAnnotation r11, lombok.javac.JavacNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.HELPER_FLAG_USAGE
            java.lang.String r2 = "@Helper"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r12
            java.lang.Class<lombok.experimental.Helper> r1 = lombok.experimental.Helper.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L21
            r0 = 0
            goto L29
        L21:
            r0 = r13
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
        L29:
            r14 = r0
            r0 = r9
            r1 = r14
            if (r1 != 0) goto L35
            r1 = 0
            goto L3d
        L35:
            r1 = r14
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
        L3d:
            com.sun.tools.javac.util.List r0 = r0.getStatementsFromJcNode(r1)
            r15 = r0
            r0 = r13
            if (r0 == 0) goto L57
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L57
            r0 = r15
            if (r0 != 0) goto L5e
        L57:
            r0 = r12
            java.lang.String r1 = "@Helper is legal only on method-local classes."
            r0.addError(r1)
            return
        L5e:
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r16 = r0
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L81
        L72:
            r0 = r17
            java.lang.Object r0 = r0.next()
            r1 = r16
            if (r0 != r1) goto L81
            goto L8b
        L81:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L72
        L8b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r13
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto Le7
        La1:
            r0 = r20
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r19 = r0
            r0 = r19
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 == r1) goto Lbb
            goto Le7
        Lbb:
            r0 = r19
            java.lang.String r0 = r0.getName()
            r21 = r0
            r0 = r21
            if (r0 == 0) goto Le7
            r0 = r21
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le7
            r0 = r21
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 60
            if (r0 != r1) goto Ldd
            goto Le7
        Ldd:
            r0 = r18
            r1 = r21
            boolean r0 = r0.add(r1)
        Le7:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La1
            r0 = r18
            java.util.Collections.sort(r0)
            r0 = r18
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r19 = r0
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "$"
            r2.<init>(r3)
            r2 = r16
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r20 = r0
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r21 = r0
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r22 = r0
            lombok.javac.handlers.HandleHelper$1 r0 = new lombok.javac.handlers.HandleHelper$1
            r1 = r0
            r2 = r9
            r3 = r19
            r4 = r22
            r5 = r20
            r6 = r12
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r23 = r0
            goto L156
        L141:
            r0 = r17
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r24 = r0
            r0 = r24
            r1 = r23
            r2 = 0
            java.lang.Object r0 = r0.accept(r1, r2)
        L156:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L141
            r0 = r21
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto L16e
            r0 = r12
            java.lang.String r1 = "No methods of this helper class are ever used."
            r0.addWarning(r1)
            return
        L16e:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L1f3
        L184:
            r0 = r27
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r26 = r0
            r0 = r24
            r1 = r26
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r25
            if (r0 != 0) goto L1f3
            r0 = r26
            r1 = r16
            if (r0 == r1) goto L1a7
            goto L1f3
        L1a7:
            r0 = 1
            r25 = r0
            r0 = r22
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r22
            r4 = r16
            com.sun.tools.javac.util.Name r4 = r4.name
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r28 = r0
            r0 = r22
            r1 = r16
            com.sun.tools.javac.util.Name r1 = r1.name
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r29 = r0
            r0 = r22
            r1 = r22
            r2 = 16
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r20
            r3 = r29
            r4 = r28
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r30 = r0
            r0 = r30
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r24
            r1 = r30
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1f3:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L184
            r0 = r9
            r1 = r14
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r2 = r24
            com.sun.tools.javac.util.List r2 = r2.toList()
            r0.setStatementsOfJcNode(r1, r2)
            return
    }
}
