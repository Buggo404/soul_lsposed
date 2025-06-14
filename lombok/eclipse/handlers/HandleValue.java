package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-512)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleValue.SCL.lombok */
public class HandleValue extends lombok.eclipse.EclipseAnnotationHandler<lombok.Value> {
    private lombok.eclipse.handlers.HandleFieldDefaults handleFieldDefaults;
    private lombok.eclipse.handlers.HandleGetter handleGetter;
    private lombok.eclipse.handlers.HandleEqualsAndHashCode handleEqualsAndHashCode;
    private lombok.eclipse.handlers.HandleToString handleToString;
    private lombok.eclipse.handlers.HandleConstructor handleConstructor;

    public HandleValue() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.eclipse.handlers.HandleFieldDefaults r1 = new lombok.eclipse.handlers.HandleFieldDefaults
            r2 = r1
            r2.<init>()
            r0.handleFieldDefaults = r1
            r0 = r4
            lombok.eclipse.handlers.HandleGetter r1 = new lombok.eclipse.handlers.HandleGetter
            r2 = r1
            r2.<init>()
            r0.handleGetter = r1
            r0 = r4
            lombok.eclipse.handlers.HandleEqualsAndHashCode r1 = new lombok.eclipse.handlers.HandleEqualsAndHashCode
            r2 = r1
            r2.<init>()
            r0.handleEqualsAndHashCode = r1
            r0 = r4
            lombok.eclipse.handlers.HandleToString r1 = new lombok.eclipse.handlers.HandleToString
            r2 = r1
            r2.<init>()
            r0.handleToString = r1
            r0 = r4
            lombok.eclipse.handlers.HandleConstructor r1 = new lombok.eclipse.handlers.HandleConstructor
            r2 = r1
            r2.<init>()
            r0.handleConstructor = r1
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Value> r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10, lombok.eclipse.EclipseNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.VALUE_FLAG_USAGE
            java.lang.String r2 = "@Value"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Value r0 = (lombok.Value) r0
            r12 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto L2a
            r0 = r11
            java.lang.String r1 = "@Value is only supported on a class."
            r0.addError(r1)
            return
        L2a:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r14 = r0
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r13
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L5a
            r0 = r14
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L5a
            r0 = r14
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r13
            r0.rebuild()
        L5a:
            r0 = r8
            lombok.eclipse.handlers.HandleFieldDefaults r0 = r0.handleFieldDefaults
            r1 = r13
            r2 = r11
            lombok.AccessLevel r3 = lombok.AccessLevel.PRIVATE
            r4 = 1
            r5 = 1
            boolean r0 = r0.generateFieldDefaultsForType(r1, r2, r3, r4, r5)
            r0 = r8
            lombok.eclipse.handlers.HandleGetter r0 = r0.handleGetter
            r1 = r13
            r2 = r11
            lombok.AccessLevel r3 = lombok.AccessLevel.PUBLIC
            r4 = 1
            java.util.List r5 = java.util.Collections.emptyList()
            boolean r0 = r0.generateGetterForType(r1, r2, r3, r4, r5)
            r0 = r8
            lombok.eclipse.handlers.HandleEqualsAndHashCode r0 = r0.handleEqualsAndHashCode
            r1 = r13
            r2 = r11
            r0.generateEqualsAndHashCodeForType(r1, r2)
            r0 = r8
            lombok.eclipse.handlers.HandleToString r0 = r0.handleToString
            r1 = r13
            r2 = r11
            r0.generateToStringForType(r1, r2)
            r0 = r8
            lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r13
            lombok.AccessLevel r2 = lombok.AccessLevel.PUBLIC
            r3 = r12
            java.lang.String r3 = r3.staticConstructor()
            lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r4 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.YES
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = r11
            r0.generateAllArgsConstructor(r1, r2, r3, r4, r5, r6)
            r0 = r8
            lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r13
            r2 = r11
            r0.generateExtraNoArgsConstructor(r1, r2)
            return
    }
}
