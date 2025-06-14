package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacImportList.SCL.lombok */
public class JavacImportList implements lombok.core.ImportList {
    private final java.lang.String pkgStr;
    private final com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> defs;

    public JavacImportList(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            java.lang.String r1 = lombok.javac.PackageName.getPackageName(r1)
            r0.pkgStr = r1
            r0 = r3
            r1 = r4
            com.sun.tools.javac.util.List r1 = r1.defs
            r0.defs = r1
            return
    }

    @Override // lombok.core.ImportList
    public java.lang.String getFullyQualifiedNameForSimpleName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.getFullyQualifiedNameForSimpleNameNoAliasing(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Le
            r0 = 0
            goto L12
        Le:
            r0 = r5
            java.lang.String r0 = lombok.core.LombokInternalAliasing.processAliases(r0)
        L12:
            return r0
    }

    @Override // lombok.core.ImportList
    public java.lang.String getFullyQualifiedNameForSimpleNameNoAliasing(java.lang.String r4) {
            r3 = this;
            r0 = r3
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L4f
        Lb:
            r0 = r6
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 != 0) goto L1f
            goto L4f
        L1f:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.qualid
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L33
            goto L4f
        L33:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r8
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4f
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        L4f:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
    }

    @Override // lombok.core.ImportList
    public boolean hasStarImport(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.pkgStr
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r0 = r0.pkgStr
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            java.lang.String r0 = "java.lang"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            r0 = r3
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L91
        L2a:
            r0 = r6
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 != 0) goto L3e
            goto L91
        L3e:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            boolean r0 = r0.staticImport
            if (r0 == 0) goto L4b
            goto L91
        L4b:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.qualid
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L5f
            goto L91
        L5f:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r8 = r0
            java.lang.String r0 = "*"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L79
            goto L91
        L79:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r4
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L91
            r0 = 1
            return r0
        L91:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2a
            r0 = 0
            return r0
    }

    @Override // lombok.core.ImportList
    public java.util.Collection<java.lang.String> applyNameToStarImports(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            java.lang.String r0 = r0.pkgStr
            if (r0 == 0) goto L3d
            r0 = r5
            r1 = r5
            java.lang.String r1 = r1.pkgStr
            java.lang.String r0 = r0.topLevelName(r1)
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.pkgStr
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L3d:
            r0 = r5
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto Ld4
        L49:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 != 0) goto L60
            goto Ld4
        L60:
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            boolean r0 = r0.staticImport
            if (r0 == 0) goto L6e
            goto Ld4
        L6e:
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.qualid
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L83
            goto Ld4
        L83:
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r12 = r0
            java.lang.String r0 = "*"
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9d
            goto Ld4
        L9d:
            r0 = r5
            r1 = r11
            java.lang.String r0 = r0.topLevelName(r1)
            r13 = r0
            r0 = r13
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld4
            r0 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r3
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.selected
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        Ld4:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L49
            r0 = r8
            return r0
    }

    private java.lang.String topLevelName(com.sun.tools.javac.tree.JCTree r3) {
            r2 = this;
            goto Lb
        L3:
            r0 = r3
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            r3 = r0
        Lb:
            r0 = r3
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L3
            r0 = r3
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String topLevelName(java.lang.String r5) {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "."
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto Le
            r0 = r5
            return r0
        Le:
            r0 = r5
            r1 = 0
            r2 = r6
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    @Override // lombok.core.ImportList
    public java.lang.String applyUnqualifiedNameToPackage(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.pkgStr
            if (r0 != 0) goto L9
            r0 = r5
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.String r2 = r2.pkgStr
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
