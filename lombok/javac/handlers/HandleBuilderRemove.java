package lombok.javac.handlers;

@lombok.core.HandlerPriority(32768)
@lombok.core.AlreadyHandledAnnotations
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleBuilderRemove.SCL.lombok */
public class HandleBuilderRemove extends lombok.javac.JavacAnnotationHandler<lombok.Builder> {
    public HandleBuilderRemove() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Builder> r5, com.sun.tools.javac.tree.JCTree.JCAnnotation r6, lombok.javac.JavacNode r7) {
            r4 = this;
            r0 = r7
            java.lang.Class<lombok.Builder> r1 = lombok.Builder.class
            java.lang.String r2 = "lombok.experimental.Builder"
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1, r2)
            return
    }
}
