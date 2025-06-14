package lombok.javac.handlers;

@lombok.core.HandlerPriority(-1025)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleBuilderDefault.SCL.lombok */
public class HandleBuilderDefault extends lombok.javac.JavacAnnotationHandler<lombok.Builder.Default> {
    public HandleBuilderDefault() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Builder.Default> r6, com.sun.tools.javac.tree.JCTree.JCAnnotation r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L15
            return
        L15:
            r0 = r9
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L49
            java.lang.String r0 = "lombok.experimental.Builder"
            r1 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L49
            java.lang.Class<lombok.experimental.SuperBuilder> r0 = lombok.experimental.SuperBuilder.class
            r1 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L49
            r0 = r8
            java.lang.String r1 = "@Builder.Default requires @Builder or @SuperBuilder on the class for it to mean anything."
            r0.addWarning(r1)
            r0 = r8
            java.lang.Class<lombok.Builder$Default> r1 = lombok.Builder.Default.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
        L49:
            r0 = r7
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto Lb6
            r0 = r7
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r11 = r0
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto Lb6
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "Builder"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto Lb6
            r0 = r11
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "Default"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto Lb6
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r8
            lombok.javac.JavacTreeMaker r1 = r1.getTreeMaker()
            r2 = r8
            java.lang.String r3 = "lombok"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.selected
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = (com.sun.tools.javac.tree.JCTree.JCIdent) r2
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r12 = r0
            r0 = r12
            r1 = r8
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r11
            r1 = r12
            r0.selected = r1
        Lb6:
            return
    }
}
