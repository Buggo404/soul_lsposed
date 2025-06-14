package lombok.javac.handlers;

@lombok.core.HandlerPriority(-512)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleValue.SCL.lombok */
public class HandleValue extends lombok.javac.JavacAnnotationHandler<lombok.Value> {
    private lombok.javac.handlers.HandleFieldDefaults handleFieldDefaults;
    private lombok.javac.handlers.HandleConstructor handleConstructor;
    private lombok.javac.handlers.HandleGetter handleGetter;
    private lombok.javac.handlers.HandleEqualsAndHashCode handleEqualsAndHashCode;
    private lombok.javac.handlers.HandleToString handleToString;

    public HandleValue() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.javac.handlers.HandleFieldDefaults r1 = new lombok.javac.handlers.HandleFieldDefaults
            r2 = r1
            r2.<init>()
            r0.handleFieldDefaults = r1
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
    public void handle(lombok.core.AnnotationValues<lombok.Value> r8, com.sun.tools.javac.tree.JCTree.JCAnnotation r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.VALUE_FLAG_USAGE
            java.lang.String r2 = "@Value"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r10
            java.lang.Class<lombok.Value> r1 = lombok.Value.class
            java.lang.String r2 = "lombok.experimental.Value"
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1, r2)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 == 0) goto L26
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L35
            r0 = r10
            java.lang.String r1 = "@Value is only supported on a class."
            r0.addError(r1)
            return
        L35:
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Value r0 = (lombok.Value) r0
            java.lang.String r0 = r0.staticConstructor()
            r13 = r0
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotationAndDeleteIfNeccessary(r0, r1)
            if (r0 != 0) goto L75
            r0 = r11
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r14 = r0
            r0 = r14
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L75
            r0 = r14
            r1 = r0
            long r1 = r1.flags
            r2 = 16
            long r1 = r1 | r2
            r0.flags = r1
        L75:
            r0 = r7
            lombok.javac.handlers.HandleFieldDefaults r0 = r0.handleFieldDefaults
            r1 = r11
            r2 = r10
            lombok.AccessLevel r3 = lombok.AccessLevel.PRIVATE
            r4 = 1
            r5 = 1
            boolean r0 = r0.generateFieldDefaultsForType(r1, r2, r3, r4, r5)
            r0 = r7
            lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r11
            lombok.AccessLevel r2 = lombok.AccessLevel.PUBLIC
            r3 = r13
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r4 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.YES
            r5 = r10
            r0.generateAllArgsConstructor(r1, r2, r3, r4, r5)
            r0 = r7
            lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r11
            r2 = r10
            r0.generateExtraNoArgsConstructor(r1, r2)
            r0 = r7
            lombok.javac.handlers.HandleGetter r0 = r0.handleGetter
            r1 = r11
            r2 = r10
            lombok.AccessLevel r3 = lombok.AccessLevel.PUBLIC
            r4 = 1
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r0.generateGetterForType(r1, r2, r3, r4, r5)
            r0 = r7
            lombok.javac.handlers.HandleEqualsAndHashCode r0 = r0.handleEqualsAndHashCode
            r1 = r11
            r2 = r10
            r0.generateEqualsAndHashCodeForType(r1, r2)
            r0 = r7
            lombok.javac.handlers.HandleToString r0 = r0.handleToString
            r1 = r11
            r2 = r10
            r0.generateToStringForType(r1, r2)
            return
    }
}
