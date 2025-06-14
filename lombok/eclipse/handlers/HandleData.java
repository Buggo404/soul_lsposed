package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleData.SCL.lombok */
public class HandleData extends lombok.eclipse.EclipseAnnotationHandler<lombok.Data> {
    private lombok.eclipse.handlers.HandleGetter handleGetter;
    private lombok.eclipse.handlers.HandleSetter handleSetter;
    private lombok.eclipse.handlers.HandleEqualsAndHashCode handleEqualsAndHashCode;
    private lombok.eclipse.handlers.HandleToString handleToString;
    private lombok.eclipse.handlers.HandleConstructor handleConstructor;

    public HandleData() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.eclipse.handlers.HandleGetter r1 = new lombok.eclipse.handlers.HandleGetter
            r2 = r1
            r2.<init>()
            r0.handleGetter = r1
            r0 = r4
            lombok.eclipse.handlers.HandleSetter r1 = new lombok.eclipse.handlers.HandleSetter
            r2 = r1
            r2.<init>()
            r0.handleSetter = r1
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
    public void handle(lombok.core.AnnotationValues<lombok.Data> r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10, lombok.eclipse.EclipseNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.DATA_FLAG_USAGE
            java.lang.String r2 = "@Data"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Data r0 = (lombok.Data) r0
            r12 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto L2a
            r0 = r11
            java.lang.String r1 = "@Data is only supported on a class."
            r0.addError(r1)
            return
        L2a:
            r0 = r8
            lombok.eclipse.handlers.HandleGetter r0 = r0.handleGetter
            r1 = r13
            r2 = r11
            lombok.AccessLevel r3 = lombok.AccessLevel.PUBLIC
            r4 = 1
            java.util.List r5 = java.util.Collections.emptyList()
            boolean r0 = r0.generateGetterForType(r1, r2, r3, r4, r5)
            r0 = r8
            lombok.eclipse.handlers.HandleSetter r0 = r0.handleSetter
            r1 = r13
            r2 = r11
            lombok.AccessLevel r3 = lombok.AccessLevel.PUBLIC
            r4 = 1
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            boolean r0 = r0.generateSetterForType(r1, r2, r3, r4, r5, r6)
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
            r0.generateRequiredArgsConstructor(r1, r2, r3, r4, r5, r6)
            r0 = r8
            lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r13
            r2 = r11
            r0.generateExtraNoArgsConstructor(r1, r2)
            return
    }
}
