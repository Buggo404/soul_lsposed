package lombok.javac.handlers;

@lombok.core.HandlerPriority(65536)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleAccessors.SCL.lombok */
public class HandleAccessors extends lombok.javac.JavacAnnotationHandler<lombok.experimental.Accessors> {
    public HandleAccessors() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.Accessors> r5, com.sun.tools.javac.tree.JCTree.JCAnnotation r6, lombok.javac.JavacNode r7) {
            r4 = this;
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.ACCESSORS_FLAG_USAGE
            java.lang.String r2 = "@Accessors"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r7
            java.lang.Class<lombok.experimental.Accessors> r1 = lombok.experimental.Accessors.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r5
            boolean r0 = r0.isMarking()
            if (r0 == 0) goto L1c
            r0 = r7
            java.lang.String r1 = "Accessors on its own does nothing. Set at least one parameter"
            r0.addWarning(r1)
        L1c:
            return
    }
}
