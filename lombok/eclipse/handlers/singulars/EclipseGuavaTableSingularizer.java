package lombok.eclipse.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/singulars/EclipseGuavaTableSingularizer.SCL.lombok */
public class EclipseGuavaTableSingularizer extends lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer {
    private static final lombok.core.LombokImmutableList<java.lang.String> SUFFIXES = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> SUPPORTED_TYPES = null;

    static {
            java.lang.String r0 = "rowKey"
            java.lang.String r1 = "columnKey"
            java.lang.String r2 = "value"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m62of(r0, r1, r2)
            lombok.eclipse.handlers.singulars.EclipseGuavaTableSingularizer.SUFFIXES = r0
            java.lang.String r0 = "com.google.common.collect.ImmutableTable"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m60of(r0)
            lombok.eclipse.handlers.singulars.EclipseGuavaTableSingularizer.SUPPORTED_TYPES = r0
            return
    }

    public EclipseGuavaTableSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes() {
            r2 = this;
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.eclipse.handlers.singulars.EclipseGuavaTableSingularizer.SUPPORTED_TYPES
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer
    protected lombok.core.LombokImmutableList<java.lang.String> getArgumentSuffixes() {
            r2 = this;
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.eclipse.handlers.singulars.EclipseGuavaTableSingularizer.SUFFIXES
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer
    protected java.lang.String getAddMethodName() {
            r2 = this;
            java.lang.String r0 = "put"
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer
    protected java.lang.String getAddAllTypeName() {
            r2 = this;
            java.lang.String r0 = "com.google.common.collect.Table"
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ java.util.List generateFields(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.generateFields(r1, r2)
            return r0
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r11, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r12, boolean r13, lombok.eclipse.EclipseNode r14, boolean r15, lombok.eclipse.handlers.EclipseSingularsRecipes.TypeReferenceMaker r16, lombok.eclipse.handlers.EclipseSingularsRecipes.StatementMaker r17, lombok.AccessLevel r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            super.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // lombok.eclipse.handlers.singulars.EclipseGuavaSingularizer, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer
    public /* bridge */ /* synthetic */ void appendBuildCode(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r8, lombok.eclipse.EclipseNode r9, java.util.List r10, char[] r11, java.lang.String r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.appendBuildCode(r1, r2, r3, r4, r5)
            return
    }
}
