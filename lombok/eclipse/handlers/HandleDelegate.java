package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleDelegate.SCL.lombok */
public class HandleDelegate extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.Delegate> {
    public HandleDelegate() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.Delegate> r5, org.eclipse.jdt.internal.compiler.ast.Annotation r6, lombok.eclipse.EclipseNode r7) {
            r4 = this;
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.DELEGATE_FLAG_USAGE
            java.lang.String r2 = "@Delegate"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            return
    }
}
