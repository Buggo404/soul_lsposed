package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/TypeResolver.SCL.lombok */
public class TypeResolver {
    private lombok.core.ImportList imports;

    public TypeResolver(lombok.core.ImportList r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.imports = r1
            return
    }

    public boolean typeMatches(lombok.core.LombokNode<?, ?, ?> r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            lombok.core.TypeLibrary r2 = lombok.core.TypeLibrary.createLibraryForSingleType(r2)
            r3 = r8
            java.lang.String r0 = r0.typeRefToFullyQualifiedName(r1, r2, r3)
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String typeRefToFullyQualifiedName(lombok.core.LombokNode<?, ?, ?> r6, lombok.core.TypeLibrary r7, java.lang.String r8) {
            r5 = this;
            r0 = r7
            r1 = r8
            java.util.List r0 = r0.toQualifieds(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L16
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
        L16:
            r0 = 0
            return r0
        L18:
            r0 = r9
            r1 = r8
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L28
            r0 = r8
            java.lang.String r0 = lombok.core.LombokInternalAliasing.processAliases(r0)
            return r0
        L28:
            r0 = r8
            r1 = 46
            int r0 = r0.indexOf(r1)
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L3c
            r0 = r8
            int r0 = r0.length()
            r10 = r0
        L3c:
            r0 = r8
            r1 = 0
            r2 = r10
            java.lang.String r0 = r0.substring(r1, r2)
            r11 = r0
            r0 = r5
            lombok.core.ImportList r0 = r0.imports
            r1 = r11
            java.lang.String r0 = r0.getFullyQualifiedNameForSimpleNameNoAliasing(r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r12
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r8
            r2 = r10
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13 = r0
            r0 = r9
            r1 = r13
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L83
            r0 = r13
            java.lang.String r0 = lombok.core.LombokInternalAliasing.processAliases(r0)
            return r0
        L83:
            r0 = 0
            return r0
        L85:
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L1db
        L91:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            r1 = 0
            r2 = r13
            int r2 = r2.length()
            r3 = r8
            int r3 = r3.length()
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r15 = r0
            r0 = r5
            lombok.core.ImportList r0 = r0.imports
            r1 = r15
            boolean r0 = r0.hasStarImport(r1)
            if (r0 != 0) goto Lc2
            goto L1db
        Lc2:
            r0 = r6
            r16 = r0
            goto L1d0
        Lc8:
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto Le2
            r0 = r11
            r1 = r16
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le2
            r0 = 0
            return r0
        Le2:
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT
            if (r0 == r1) goto Lf8
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL
            if (r0 != r1) goto L176
        Lf8:
            r0 = r16
            lombok.core.LombokNode r0 = r0.directUp()
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L107
            goto L1d5
        L107:
            r0 = r17
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT
            if (r0 == r1) goto L128
            r0 = r17
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.INITIALIZER
            if (r0 == r1) goto L128
            r0 = r17
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L16f
        L128:
            r0 = r17
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r19 = r0
            goto L165
        L135:
            r0 = r19
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r18 = r0
            r0 = r18
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L15b
            r0 = r11
            r1 = r18
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15b
            r0 = 0
            return r0
        L15b:
            r0 = r18
            r1 = r16
            if (r0 != r1) goto L165
            goto L16f
        L165:
            r0 = r19
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L135
        L16f:
            r0 = r17
            r16 = r0
            goto L1d0
        L176:
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L18c
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L1c9
        L18c:
            r0 = r16
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L1bf
        L199:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r17 = r0
            r0 = r17
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L1bf
            r0 = r11
            r1 = r17
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1bf
            r0 = 0
            return r0
        L1bf:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L199
        L1c9:
            r0 = r16
            lombok.core.LombokNode r0 = r0.directUp()
            r16 = r0
        L1d0:
            r0 = r16
            if (r0 != 0) goto Lc8
        L1d5:
            r0 = r13
            java.lang.String r0 = lombok.core.LombokInternalAliasing.processAliases(r0)
            return r0
        L1db:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L91
            r0 = 0
            return r0
    }
}
