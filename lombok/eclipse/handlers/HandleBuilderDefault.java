package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-1025)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleBuilderDefault.SCL.lombok */
public class HandleBuilderDefault extends lombok.eclipse.EclipseAnnotationHandler<lombok.Builder.Default> {
    public HandleBuilderDefault() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Builder.Default> r4, org.eclipse.jdt.internal.compiler.ast.Annotation r5, lombok.eclipse.EclipseNode r6) {
            r3 = this;
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r7 = r0
            r0 = r7
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L15
            return
        L15:
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r8 = r0
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L43
            java.lang.String r0 = "lombok.experimental.Builder"
            r1 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L43
            java.lang.Class<lombok.experimental.SuperBuilder> r0 = lombok.experimental.SuperBuilder.class
            r1 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L43
            r0 = r6
            java.lang.String r1 = "@Builder.Default requires @Builder or @SuperBuilder on the class for it to mean anything."
            r0.addWarning(r1)
        L43:
            return
    }
}
