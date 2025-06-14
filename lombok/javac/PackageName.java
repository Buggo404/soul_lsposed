package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/PackageName.SCL.lombok */
public class PackageName {
    private static final java.lang.reflect.Method packageNameMethod = null;

    static {
            java.lang.reflect.Method r0 = getPackageNameMethod()
            lombok.javac.PackageName.packageNameMethod = r0
            return
    }

    public PackageName() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.reflect.Method getPackageNameMethod() {
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = com.sun.tools.javac.tree.JCTree.JCCompilationUnit.class
            java.lang.String r1 = "getPackageName"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lc
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static java.lang.String getPackageName(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r2) {
            r0 = r2
            com.sun.tools.javac.tree.JCTree r0 = getPackageNode(r0)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L10
            r0 = r3
            java.lang.String r0 = r0.toString()
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree getPackageNode(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4) {
            java.lang.reflect.Method r0 = lombok.javac.PackageName.packageNameMethod
            if (r0 == 0) goto L2a
            java.lang.reflect.Method r0 = lombok.javac.PackageName.packageNameMethod     // Catch: java.lang.Exception -> L29
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L29
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L29
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess     // Catch: java.lang.Exception -> L29
            if (r0 != 0) goto L20
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L27
        L20:
            r0 = r5
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0     // Catch: java.lang.Exception -> L29
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
        L2a:
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.pid
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L3e
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.pid
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L45
        L3e:
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.pid
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }
}
