package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacGuavaMapSingularizer.SCL.lombok */
public class JavacGuavaMapSingularizer extends lombok.javac.handlers.singulars.JavacGuavaSingularizer {
    private static final lombok.core.LombokImmutableList<java.lang.String> SUFFIXES = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> SUPPORTED_TYPES = null;

    static {
            java.lang.String r0 = "key"
            java.lang.String r1 = "value"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m61of(r0, r1)
            lombok.javac.handlers.singulars.JavacGuavaMapSingularizer.SUFFIXES = r0
            java.lang.String r0 = "com.google.common.collect.ImmutableMap"
            java.lang.String r1 = "com.google.common.collect.ImmutableBiMap"
            java.lang.String r2 = "com.google.common.collect.ImmutableSortedMap"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m62of(r0, r1, r2)
            lombok.javac.handlers.singulars.JavacGuavaMapSingularizer.SUPPORTED_TYPES = r0
            return
    }

    public JavacGuavaMapSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes() {
            r2 = this;
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.singulars.JavacGuavaMapSingularizer.SUPPORTED_TYPES
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacGuavaSingularizer
    protected lombok.core.LombokImmutableList<java.lang.String> getArgumentSuffixes() {
            r2 = this;
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.javac.handlers.singulars.JavacGuavaMapSingularizer.SUFFIXES
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getAddMethodName() {
            r2 = this;
            java.lang.String r0 = "put"
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacGuavaSingularizer
    protected java.lang.String getAddAllTypeName() {
            r2 = this;
            java.lang.String r0 = "java.util.Map"
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacGuavaSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List generateFields(lombok.javac.handlers.JavacSingularsRecipes.SingularData r6, lombok.javac.JavacNode r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.util.List r0 = super.generateFields(r1, r2, r3)
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacGuavaSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r12, lombok.javac.handlers.JavacSingularsRecipes.SingularData r13, boolean r14, lombok.javac.JavacNode r15, lombok.javac.JavacNode r16, boolean r17, lombok.javac.handlers.JavacSingularsRecipes.ExpressionMaker r18, lombok.javac.handlers.JavacSingularsRecipes.StatementMaker r19, lombok.AccessLevel r20) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            super.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // lombok.javac.handlers.singulars.JavacGuavaSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ void appendBuildCode(lombok.javac.handlers.JavacSingularsRecipes.SingularData r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11, com.sun.tools.javac.util.ListBuffer r12, com.sun.tools.javac.util.Name r13, java.lang.String r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            super.appendBuildCode(r1, r2, r3, r4, r5, r6)
            return
    }
}
