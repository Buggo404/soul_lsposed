package lombok.javac.handlers;

@lombok.core.HandlerPriority(32768)
@lombok.core.AlreadyHandledAnnotations
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleSuperBuilderRemove.SCL.lombok */
public class HandleSuperBuilderRemove extends lombok.javac.JavacAnnotationHandler<lombok.experimental.SuperBuilder> {
    public HandleSuperBuilderRemove() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.SuperBuilder> r4, com.sun.tools.javac.tree.JCTree.JCAnnotation r5, lombok.javac.JavacNode r6) {
            r3 = this;
            r0 = r6
            java.lang.Class<lombok.experimental.SuperBuilder> r1 = lombok.experimental.SuperBuilder.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            return
    }
}
