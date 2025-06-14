package lombok.javac.handlers;

@lombok.core.HandlerPriority(32768)
@lombok.core.AlreadyHandledAnnotations
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleBuilderDefaultRemove.SCL.lombok */
public class HandleBuilderDefaultRemove extends lombok.javac.JavacAnnotationHandler<lombok.Builder.Default> {
    public HandleBuilderDefaultRemove() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Builder.Default> r4, com.sun.tools.javac.tree.JCTree.JCAnnotation r5, lombok.javac.JavacNode r6) {
            r3 = this;
            r0 = r6
            java.lang.Class<lombok.Builder$Default> r1 = lombok.Builder.Default.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r6
            java.lang.Class<lombok.Builder> r1 = lombok.Builder.class
            java.lang.String r1 = r1.getName()
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            return
    }
}
