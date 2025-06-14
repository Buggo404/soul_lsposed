package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacJavaUtilSetSingularizer.SCL.lombok */
public class JavacJavaUtilSetSingularizer extends lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer {
    public JavacJavaUtilSetSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes() {
            r4 = this;
            java.lang.String r0 = "java.util.Set"
            java.lang.String r1 = "java.util.SortedSet"
            java.lang.String r2 = "java.util.NavigableSet"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m62of(r0, r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    protected java.lang.String getEmptyMaker(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "SortedSet"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "java.util.Collections.emptySortedSet"
            return r0
        Lc:
            r0 = r4
            java.lang.String r1 = "NavigableSet"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = "java.util.Collections.emptyNavigableSet"
            return r0
        L18:
            java.lang.String r0 = "java.util.Collections.emptySet"
            return r0
    }

    @Override // lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public void appendBuildCode(lombok.javac.handlers.JavacSingularsRecipes.SingularData r14, lombok.javac.JavacNode r15, lombok.javac.JavacNode r16, com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> r17, com.sun.tools.javac.util.Name r18, java.lang.String r19) {
            r13 = this;
            r0 = r15
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r20 = r0
            r0 = r14
            java.lang.String r0 = r0.getTargetFqn()
            java.lang.String r1 = "java.util.Set"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            r0 = r17
            r1 = r13
            r2 = r20
            r3 = r14
            r4 = r15
            r5 = 0
            java.lang.String r6 = "emptySet"
            java.lang.String r7 = "singleton"
            java.lang.String r8 = "LinkedHashSet"
            r9 = r16
            r10 = r19
            com.sun.tools.javac.util.List r1 = r1.createJavaUtilSetMapInitialCapacitySwitchStatements(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
            goto L44
        L2d:
            r0 = r17
            r1 = r13
            r2 = r20
            r3 = r14
            r4 = r15
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 1
            java.lang.String r9 = "TreeSet"
            r10 = r16
            r11 = r19
            com.sun.tools.javac.util.List r1 = r1.createJavaUtilSimpleCreationAndFillStatements(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
        L44:
            return
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List generateFields(lombok.javac.handlers.JavacSingularsRecipes.SingularData r6, lombok.javac.JavacNode r7, lombok.javac.JavacNode r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.util.List r0 = super.generateFields(r1, r2, r3)
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
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

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List listFieldsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listFieldsToBeGenerated(r1, r2)
            return r0
    }

    @Override // lombok.javac.handlers.singulars.JavacJavaUtilListSetSingularizer, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer
    public /* bridge */ /* synthetic */ java.util.List listMethodsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.List r0 = super.listMethodsToBeGenerated(r1, r2)
            return r0
    }
}
