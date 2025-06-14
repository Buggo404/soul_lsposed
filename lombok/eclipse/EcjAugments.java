package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EcjAugments.SCL.lombok */
public final class EcjAugments {
    public static final lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.FieldDeclaration, java.lang.Boolean> FieldDeclaration_booleanLazyGetter = null;
    public static final lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, java.lang.Boolean> ASTNode_handled = null;
    public static final lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> ASTNode_generatedBy = null;
    public static final lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.Annotation, java.lang.Boolean> Annotation_applied = null;
    public static final lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.env.ICompilationUnit, java.util.Map<java.lang.String, java.lang.String>> CompilationUnit_javadoc = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EcjAugments$EclipseAugments.SCL.lombok */
    public static final class EclipseAugments {
        public static final lombok.core.FieldAugment<org.eclipse.jdt.internal.core.CompilationUnit, java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<org.eclipse.jdt.internal.core.SourceMethod>>> CompilationUnit_delegateMethods = null;

        static {
                java.lang.Class<org.eclipse.jdt.internal.core.CompilationUnit> r0 = org.eclipse.jdt.internal.core.CompilationUnit.class
                java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
                java.lang.String r2 = "$delegateMethods"
                lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
                lombok.eclipse.EcjAugments.EclipseAugments.CompilationUnit_delegateMethods = r0
                return
        }

        private EclipseAugments() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.FieldDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.FieldDeclaration.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "lombok$booleanLazyGetter"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.eclipse.EcjAugments.FieldDeclaration_booleanLazyGetter = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = org.eclipse.jdt.internal.compiler.ast.ASTNode.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "lombok$handled"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.eclipse.EcjAugments.ASTNode_handled = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = org.eclipse.jdt.internal.compiler.ast.ASTNode.class
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.ASTNode> r1 = org.eclipse.jdt.internal.compiler.ast.ASTNode.class
            java.lang.String r2 = "$generatedBy"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.eclipse.EcjAugments.ASTNode_generatedBy = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Annotation> r0 = org.eclipse.jdt.internal.compiler.ast.Annotation.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "lombok$applied"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.eclipse.EcjAugments.Annotation_applied = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.env.ICompilationUnit> r0 = org.eclipse.jdt.internal.compiler.env.ICompilationUnit.class
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.String r2 = "$javadoc"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.eclipse.EcjAugments.CompilationUnit_javadoc = r0
            return
    }

    private EcjAugments() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
