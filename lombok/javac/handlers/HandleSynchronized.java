package lombok.javac.handlers;

@lombok.core.HandlerPriority(1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleSynchronized.SCL.lombok */
public class HandleSynchronized extends lombok.javac.JavacAnnotationHandler<lombok.Synchronized> {
    private static final java.lang.String INSTANCE_LOCK_NAME = "$lock";
    private static final java.lang.String STATIC_LOCK_NAME = "$LOCK";

    public HandleSynchronized() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Synchronized> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SYNCHRONIZED_FLAG_USAGE
            java.lang.String r2 = "@Synchronized"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.inNetbeansEditor(r0)
            if (r0 == 0) goto L11
            return
        L11:
            r0 = r11
            java.lang.Class<lombok.Synchronized> r1 = lombok.Synchronized.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L3b
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L3b
            r0 = r12
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 != 0) goto L42
        L3b:
            r0 = r11
            java.lang.String r1 = "@Synchronized is legal only on methods."
            r0.addError(r1)
            return
        L42:
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r13 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L64
            r0 = r11
            java.lang.String r1 = "@Synchronized is legal only on concrete methods."
            r0.addError(r1)
            return
        L64:
            r0 = r11
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.upToTypeNode(r0)
            r14 = r0
            r0 = r14
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L79
            r0 = r11
            java.lang.String r1 = "@Synchronized is legal only on methods in classes and enums."
            r0.addError(r1)
            return
        L79:
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = r0
            r2 = 0
            r3 = r13
            com.sun.tools.javac.tree.JCTree$JCModifiers r3 = r3.mods
            long r3 = r3.flags
            r4 = 8
            long r3 = r3 & r4
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L93
            r3 = 1
            goto L94
        L93:
            r3 = 0
        L94:
            r1[r2] = r3
            r15 = r0
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Synchronized r0 = (lombok.Synchronized) r0
            java.lang.String r0 = r0.value()
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            int r0 = r0.length()
            if (r0 != 0) goto Lc3
            r0 = 1
            r17 = r0
            r0 = r15
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "$LOCK"
            goto Lc1
        Lbf:
            java.lang.String r0 = "$lock"
        Lc1:
            r16 = r0
        Lc3:
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r10
            int r1 = r1.pos
            lombok.javac.JavacTreeMaker r0 = r0.m80at(r1)
            r18 = r0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            r19 = r0
            r0 = r14
            if (r0 == 0) goto L182
            r0 = r14
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L182
            r0 = r14
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L178
        Lf9:
            r0 = r21
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r20 = r0
            r0 = r20
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L178
            r0 = r20
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r16
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L178
            r0 = r20
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r0)
            if (r0 != 0) goto L12b
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L12e
        L12b:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L12e:
            r19 = r0
            r0 = r20
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L148
            r0 = 1
            goto L149
        L148:
            r0 = 0
        L149:
            r22 = r0
            r0 = r15
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L172
            r0 = r22
            if (r0 != 0) goto L172
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The field "
            r2.<init>(r3)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is non-static and this cannot be used on this static method"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L172:
            r0 = r15
            r1 = 0
            r2 = r22
            r0[r1] = r2
        L178:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf9
        L182:
            r0 = r19
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L224
            r0 = r17
            if (r0 != 0) goto L1aa
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The field "
            r2.<init>(r3)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " does not exist."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L1aa:
            r0 = r12
            r1 = r10
            int r1 = r1.pos
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Object"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1, r2)
            r20 = r0
            r0 = r18
            r1 = r12
            r2 = r10
            int r2 = r2.pos
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "Object"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2, r3)
            r2 = r18
            lombok.javac.JavacTreeMaker$TypeTag r3 = lombok.javac.Javac.CTC_INT
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3, r4)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = r0.NewArray(r1, r2, r3)
            r21 = r0
            r0 = r18
            r1 = r18
            r2 = 18
            r3 = r15
            r4 = 0
            r3 = r3[r4]
            if (r3 == 0) goto L1f9
            r3 = 8
            goto L1fa
        L1f9:
            r3 = 0
        L1fa:
            r2 = r2 | r3
            long r2 = (long) r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r12
            r3 = r16
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r20
            r4 = r21
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r22 = r0
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r1 = r22
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
        L224:
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            if (r0 != 0) goto L22d
            return
        L22d:
            r0 = r15
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L24b
            r0 = r18
            r1 = r14
            r2 = r12
            r3 = r16
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r20 = r0
            goto L266
        L24b:
            r0 = r18
            r1 = r18
            r2 = r12
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r12
            r3 = r16
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r20 = r0
        L266:
            r0 = r20
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r13
            r1 = r18
            r2 = 0
            r3 = r18
            r4 = r20
            r5 = r13
            com.sun.tools.javac.tree.JCTree$JCBlock r5 = r5.body
            com.sun.tools.javac.tree.JCTree$JCSynchronized r3 = r3.Synchronized(r4, r5)
            r4 = r11
            com.sun.tools.javac.tree.JCTree r3 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCStatement r3 = (com.sun.tools.javac.tree.JCTree.JCStatement) r3
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = r1.Block(r2, r3)
            r2 = r11
            com.sun.tools.javac.tree.JCTree r1 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = (com.sun.tools.javac.tree.JCTree.JCBlock) r1
            r0.body = r1
            r0 = r12
            r0.rebuild()
            return
    }
}
