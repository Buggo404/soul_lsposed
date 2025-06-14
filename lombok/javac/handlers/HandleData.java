package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleData.SCL.lombok */
public class HandleData extends lombok.javac.JavacAnnotationHandler<lombok.Data> {
    private lombok.javac.handlers.HandleConstructor handleConstructor;
    private lombok.javac.handlers.HandleGetter handleGetter;
    private lombok.javac.handlers.HandleSetter handleSetter;
    private lombok.javac.handlers.HandleEqualsAndHashCode handleEqualsAndHashCode;
    private lombok.javac.handlers.HandleToString handleToString;

    public HandleData() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.javac.handlers.HandleConstructor r1 = new lombok.javac.handlers.HandleConstructor
            r2 = r1
            r2.<init>()
            r0.handleConstructor = r1
            r0 = r4
            lombok.javac.handlers.HandleGetter r1 = new lombok.javac.handlers.HandleGetter
            r2 = r1
            r2.<init>()
            r0.handleGetter = r1
            r0 = r4
            lombok.javac.handlers.HandleSetter r1 = new lombok.javac.handlers.HandleSetter
            r2 = r1
            r2.<init>()
            r0.handleSetter = r1
            r0 = r4
            lombok.javac.handlers.HandleEqualsAndHashCode r1 = new lombok.javac.handlers.HandleEqualsAndHashCode
            r2 = r1
            r2.<init>()
            r0.handleEqualsAndHashCode = r1
            r0 = r4
            lombok.javac.handlers.HandleToString r1 = new lombok.javac.handlers.HandleToString
            r2 = r1
            r2.<init>()
            r0.handleToString = r1
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Data> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.DATA_FLAG_USAGE
            java.lang.String r2 = "@Data"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r11
            java.lang.Class<lombok.Data> r1 = lombok.Data.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r12 = r0
            r0 = r12
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto L27
            r0 = r11
            java.lang.String r1 = "@Data is only supported on a class."
            r0.addError(r1)
            return
        L27:
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Data r0 = (lombok.Data) r0
            java.lang.String r0 = r0.staticConstructor()
            r13 = r0
            r0 = r8
            lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r12
            lombok.AccessLevel r2 = lombok.AccessLevel.PUBLIC
            r3 = r13
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r4 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.YES
            r5 = r11
            r0.generateRequiredArgsConstructor(r1, r2, r3, r4, r5)
            r0 = r8
            lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r12
            r2 = r11
            r0.generateExtraNoArgsConstructor(r1, r2)
            r0 = r8
            lombok.javac.handlers.HandleGetter r0 = r0.handleGetter
            r1 = r12
            r2 = r11
            lombok.AccessLevel r3 = lombok.AccessLevel.PUBLIC
            r4 = 1
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r0.generateGetterForType(r1, r2, r3, r4, r5)
            r0 = r8
            lombok.javac.handlers.HandleSetter r0 = r0.handleSetter
            r1 = r12
            r2 = r11
            lombok.AccessLevel r3 = lombok.AccessLevel.PUBLIC
            r4 = 1
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r0.generateSetterForType(r1, r2, r3, r4, r5, r6)
            r0 = r8
            lombok.javac.handlers.HandleEqualsAndHashCode r0 = r0.handleEqualsAndHashCode
            r1 = r12
            r2 = r11
            r0.generateEqualsAndHashCodeForType(r1, r2)
            r0 = r8
            lombok.javac.handlers.HandleToString r0 = r0.handleToString
            r1 = r12
            r2 = r11
            r0.generateToStringForType(r1, r2)
            return
    }
}
