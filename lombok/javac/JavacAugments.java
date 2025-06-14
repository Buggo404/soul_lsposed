package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacAugments.SCL.lombok */
public final class JavacAugments {
    public static final lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree, java.lang.Boolean> JCTree_handled = null;
    public static final lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> JCTree_generatedNode = null;
    public static final lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree.JCImport, java.lang.Boolean> JCImport_deletable = null;

    static {
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r0 = com.sun.tools.javac.tree.JCTree.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "lombok$handled"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.javac.JavacAugments.JCTree_handled = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r0 = com.sun.tools.javac.tree.JCTree.class
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r1 = com.sun.tools.javac.tree.JCTree.class
            java.lang.String r2 = "lombok$generatedNode"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.circularSafeAugment(r0, r1, r2)
            lombok.javac.JavacAugments.JCTree_generatedNode = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCImport> r0 = com.sun.tools.javac.tree.JCTree.JCImport.class
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.String r2 = "lombok$deletable"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.circularSafeAugment(r0, r1, r2)
            lombok.javac.JavacAugments.JCImport_deletable = r0
            return
    }

    private JavacAugments() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
