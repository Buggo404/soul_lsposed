package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseImportList.SCL.lombok */
public class EclipseImportList implements lombok.core.ImportList {
    private org.eclipse.jdt.internal.compiler.ast.ImportReference[] imports;
    private org.eclipse.jdt.internal.compiler.ast.ImportReference pkg;

    public EclipseImportList(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference r1 = r1.currentPackage
            r0.pkg = r1
            r0 = r3
            r1 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r1 = r1.imports
            r0.imports = r1
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
    public java.lang.String getFullyQualifiedNameForSimpleNameNoAliasing(java.lang.String r5) {
            r4 = this;
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
            if (r0 == 0) goto L85
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L7f
        L16:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            int r0 = r0.bits
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            goto L7c
        L28:
            r0 = r6
            char[][] r0 = r0.tokens
            r10 = r0
            r0 = r10
            int r0 = r0.length
            if (r0 != 0) goto L3a
            r0 = 0
            char[] r0 = new char[r0]
            goto L42
        L3a:
            r0 = r10
            r1 = r10
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
        L42:
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = r12
            r1 = r5
            int r1 = r1.length()
            if (r0 == r1) goto L55
            goto L7c
        L55:
            r0 = 0
            r13 = r0
            goto L6f
        L5b:
            r0 = r11
            r1 = r13
            char r0 = r0[r1]
            r1 = r5
            r2 = r13
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L6c
            goto L7c
        L6c:
            int r13 = r13 + 1
        L6f:
            r0 = r13
            r1 = r12
            if (r0 < r1) goto L5b
            r0 = r10
            java.lang.String r0 = lombok.eclipse.Eclipse.toQualifiedName(r0)
            return r0
        L7c:
            int r7 = r7 + 1
        L7f:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L16
        L85:
            r0 = 0
            return r0
    }

    @Override // lombok.core.ImportList
    public boolean hasStarImport(java.lang.String r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.eclipse.jdt.internal.compiler.ast.ImportReference r1 = r1.pkg
            boolean r0 = isEqual(r0, r1)
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            java.lang.String r0 = "java.lang"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
            if (r0 == 0) goto L5d
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L57
        L2e:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            int r0 = r0.bits
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L40
            goto L54
        L40:
            r0 = r5
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L4a
            goto L54
        L4a:
            r0 = r4
            r1 = r5
            boolean r0 = isEqual(r0, r1)
            if (r0 == 0) goto L54
            r0 = 1
            return r0
        L54:
            int r6 = r6 + 1
        L57:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L2e
        L5d:
            r0 = 0
            return r0
    }

    private static boolean isEqual(java.lang.String r4, org.eclipse.jdt.internal.compiler.ast.ImportReference r5) {
            r0 = r5
            if (r0 == 0) goto L13
            r0 = r5
            char[][] r0 = r0.tokens
            if (r0 == 0) goto L13
            r0 = r5
            char[][] r0 = r0.tokens
            int r0 = r0.length
            if (r0 != 0) goto L18
        L13:
            r0 = r4
            boolean r0 = r0.isEmpty()
            return r0
        L18:
            r0 = 0
            r6 = r0
            r0 = r4
            int r0 = r0.length()
            r7 = r0
            r0 = 0
            r8 = r0
            goto L77
        L25:
            r0 = r8
            if (r0 == 0) goto L40
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L31
            r0 = 0
            return r0
        L31:
            r0 = r4
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 == r1) goto L40
            r0 = 0
            return r0
        L40:
            r0 = 0
            r9 = r0
            goto L67
        L46:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L4d
            r0 = 0
            return r0
        L4d:
            r0 = r4
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = r5
            char[][] r1 = r1.tokens
            r2 = r8
            r1 = r1[r2]
            r2 = r9
            char r1 = r1[r2]
            if (r0 == r1) goto L64
            r0 = 0
            return r0
        L64:
            int r9 = r9 + 1
        L67:
            r0 = r9
            r1 = r5
            char[][] r1 = r1.tokens
            r2 = r8
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 < r1) goto L46
            int r8 = r8 + 1
        L77:
            r0 = r8
            r1 = r5
            char[][] r1 = r1.tokens
            int r1 = r1.length
            if (r0 < r1) goto L25
            r0 = 1
            return r0
    }

    @Override // lombok.core.ImportList
    public java.util.Collection<java.lang.String> applyNameToStarImports(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r8 = r0
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            if (r0 == 0) goto L8e
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            char[][] r0 = r0.tokens
            if (r0 == 0) goto L8e
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            char[][] r0 = r0.tokens
            int r0 = r0.length
            if (r0 == 0) goto L8e
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            char[][] r0 = r0.tokens
            r1 = 0
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = r6
            int r0 = r0.length()
            r1 = r10
            if (r0 != r1) goto L8e
            r0 = 0
            r12 = r0
            goto L56
        L42:
            r0 = r6
            r1 = r12
            char r0 = r0.charAt(r1)
            r1 = r9
            r2 = r12
            char r1 = r1[r2]
            if (r0 == r1) goto L53
            r0 = 0
            r11 = r0
        L53:
            int r12 = r12 + 1
        L56:
            r0 = r11
            if (r0 == 0) goto L62
            r0 = r12
            r1 = r10
            if (r0 < r1) goto L42
        L62:
            r0 = r11
            if (r0 == 0) goto L8e
            r0 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference r3 = r3.pkg
            char[][] r3 = r3.tokens
            java.lang.String r3 = lombok.eclipse.Eclipse.toQualifiedName(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L8e:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
            if (r0 == 0) goto L175
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L16e
        La5:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            int r0 = r0.bits
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 != 0) goto Lba
            goto L16b
        Lba:
            r0 = r9
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto Lc5
            goto L16b
        Lc5:
            r0 = r9
            char[][] r0 = r0.tokens
            if (r0 == 0) goto L16b
            r0 = r9
            char[][] r0 = r0.tokens
            int r0 = r0.length
            if (r0 != 0) goto Ld9
            goto L16b
        Ld9:
            r0 = r9
            char[][] r0 = r0.tokens
            r1 = 0
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r1 = r6
            int r1 = r1.length()
            if (r0 == r1) goto Lef
            goto L16b
        Lef:
            r0 = 0
            r14 = r0
            goto L109
        Lf5:
            r0 = r6
            r1 = r14
            char r0 = r0.charAt(r1)
            r1 = r13
            r2 = r14
            char r1 = r1[r2]
            if (r0 == r1) goto L106
            goto L16b
        L106:
            int r14 = r14 + 1
        L109:
            r0 = r14
            r1 = r13
            int r1 = r1.length
            if (r0 < r1) goto Lf5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r9
            char[][] r2 = r2.tokens
            java.lang.String r2 = lombok.eclipse.Eclipse.toQualifiedName(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L143
            r0 = r14
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r8 = r0
            goto L16b
        L143:
            r0 = r8
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L162
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r14
            boolean r0 = r0.add(r1)
            goto L16b
        L162:
            r0 = r8
            r1 = r14
            boolean r0 = r0.add(r1)
        L16b:
            int r10 = r10 + 1
        L16e:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto La5
        L175:
            r0 = r8
            return r0
    }

    @Override // lombok.core.ImportList
    public java.lang.String applyUnqualifiedNameToPackage(java.lang.String r5) {
            r4 = this;
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            if (r0 == 0) goto L1c
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            char[][] r0 = r0.tokens
            if (r0 == 0) goto L1c
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.pkg
            char[][] r0 = r0.tokens
            int r0 = r0.length
            if (r0 != 0) goto L1e
        L1c:
            r0 = r5
            return r0
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.ImportReference r2 = r2.pkg
            char[][] r2 = r2.tokens
            java.lang.String r2 = lombok.eclipse.Eclipse.toQualifiedName(r2)
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
