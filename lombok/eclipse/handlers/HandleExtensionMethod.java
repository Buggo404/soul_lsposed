package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(66560)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleExtensionMethod.SCL.lombok */
public class HandleExtensionMethod extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.ExtensionMethod> {
    public HandleExtensionMethod() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.ExtensionMethod> r5, org.eclipse.jdt.internal.compiler.ast.Annotation r6, lombok.eclipse.EclipseNode r7) {
            r4 = this;
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.EXTENSION_METHOD_FLAG_USAGE
            java.lang.String r2 = "@ExtensionMethod"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = 0
            r8 = r0
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L2a
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r8 = r0
        L2a:
            r0 = r8
            if (r0 != 0) goto L33
            r0 = 0
            goto L38
        L33:
            r0 = r8
            int r0 = r0.modifiers
        L38:
            r10 = r0
            r0 = r10
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            r11 = r0
            r0 = r8
            if (r0 == 0) goto L54
            r0 = r11
            if (r0 == 0) goto L5b
        L54:
            r0 = r7
            java.lang.String r1 = "@ExtensionMethod is legal only on classes and enums and interfaces."
            r0.addError(r1)
            return
        L5b:
            r0 = r5
            java.lang.String r1 = "value"
            java.util.List r0 = r0.getActualExpressions(r1)
            r12 = r0
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7b
            r0 = r7
            java.lang.String r1 = "@ExtensionMethod has no effect since no extension types were specified."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
            return
        L7b:
            return
    }
}
