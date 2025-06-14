package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-2048)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleFieldDefaults.SCL.lombok */
public class HandleFieldDefaults extends lombok.eclipse.EclipseASTAdapter {
    private static final char[] FIELD_DEFAULTS = null;

    static {
            java.lang.String r0 = "FieldDefaults"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleFieldDefaults.FIELD_DEFAULTS = r0
            return
    }

    public HandleFieldDefaults() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean generateFieldDefaultsForType(lombok.eclipse.EclipseNode r7, lombok.eclipse.EclipseNode r8, lombok.AccessLevel r9, boolean r10, boolean r11) {
            r6 = this;
            r0 = r11
            if (r0 == 0) goto L10
            java.lang.Class<lombok.experimental.FieldDefaults> r0 = lombok.experimental.FieldDefaults.class
            r1 = r7
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r7
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L1f
            r0 = r8
            java.lang.String r1 = "@FieldDefaults is only supported on a class or an enum."
            r0.addError(r1)
            r0 = 0
            return r0
        L1f:
            r0 = r7
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L7f
        L2b:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L45
            goto L7f
        L45:
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r14 = r0
            r0 = r14
            r1 = 0
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0, r1)
            if (r0 != 0) goto L5b
            goto L7f
        L5b:
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            java.lang.Class r0 = r0.getClass()
            r15 = r0
            r0 = r15
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.FieldDeclaration> r1 = org.eclipse.jdt.internal.compiler.ast.FieldDeclaration.class
            if (r0 != r1) goto L7f
            r0 = r6
            r1 = r12
            r2 = r8
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r3 = r9
            r4 = r10
            r0.setFieldDefaultsForField(r1, r2, r3, r4)
        L7f:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2b
            r0 = 1
            return r0
    }

    public void setFieldDefaultsForField(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.ASTNode r6, lombok.AccessLevel r7, boolean r8) {
            r4 = this;
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L41
            r0 = r7
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L41
            r0 = r9
            int r0 = r0.modifiers
            r1 = 7
            r0 = r0 & r1
            if (r0 != 0) goto L41
            java.lang.Class<lombok.experimental.PackagePrivate> r0 = lombok.experimental.PackagePrivate.class
            r1 = r5
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L41
            r0 = r9
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L41
            r0 = r9
            r1 = r0
            int r1 = r1.modifiers
            r2 = r7
            int r2 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r2)
            r1 = r1 | r2
            r0.modifiers = r1
        L41:
            r0 = r8
            if (r0 == 0) goto L71
            r0 = r9
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L71
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r5
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L71
            r0 = r9
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L71
            r0 = r9
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
        L71:
            r0 = r5
            r0.rebuild()
            return
    }

    @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
    public void visitType(lombok.eclipse.EclipseNode r8, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r9) {
            r7 = this;
            r0 = 0
            r10 = r0
            r0 = r8
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto Lfa
        L1a:
            r0 = r16
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r15 = r0
            r0 = r15
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L34
            goto Lfa
        L34:
            r0 = r15
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r17 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L4d
            goto Lfa
        L4d:
            r0 = r18
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L6d
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r19 = r0
            r0 = r19
            char[] r1 = lombok.eclipse.handlers.HandleFieldDefaults.FIELD_DEFAULTS
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L8c
            goto Lfa
        L6d:
            r0 = r18
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto Lfa
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r19 = r0
            r0 = r19
            java.lang.String r1 = "lombok.experimental.FieldDefaults"
            boolean r0 = lombok.eclipse.Eclipse.nameEquals(r0, r1)
            if (r0 != 0) goto L8c
            goto Lfa
        L8c:
            java.lang.Class<lombok.experimental.FieldDefaults> r0 = lombok.experimental.FieldDefaults.class
            r1 = r15
            r2 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 != 0) goto L9b
            goto Lfa
        L9b:
            r0 = r15
            r11 = r0
            java.lang.Class<lombok.experimental.FieldDefaults> r0 = lombok.experimental.FieldDefaults.class
            r1 = r15
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "level"
            boolean r0 = r0.isExplicit(r1)
            r12 = r0
            r0 = r10
            java.lang.String r1 = "makeFinal"
            boolean r0 = r0.isExplicit(r1)
            r13 = r0
            r0 = r15
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.FIELD_DEFAULTS_FLAG_USAGE
            java.lang.String r2 = "@FieldDefaults"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.FieldDefaults r0 = (lombok.experimental.FieldDefaults) r0
            r14 = r0
            r0 = r12
            if (r0 != 0) goto Ldb
            r0 = r13
            if (r0 != 0) goto Ldb
            r0 = r15
            java.lang.String r1 = "This does nothing; provide either level or makeFinal or both."
            r0.addError(r1)
        Ldb:
            r0 = r12
            if (r0 == 0) goto L104
            r0 = r14
            lombok.AccessLevel r0 = r0.level()
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L104
            r0 = r15
            java.lang.String r1 = "AccessLevel.NONE doesn't mean anything here. Pick another value."
            r0.addError(r1)
            r0 = 0
            r12 = r0
            goto L104
        Lfa:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
        L104:
            r0 = r14
            if (r0 != 0) goto L115
            r0 = r9
            int r0 = r0.modifiers
            r1 = 8704(0x2200, float:1.2197E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L115
            return
        L115:
            r0 = r12
            if (r0 == 0) goto L11e
            r0 = 0
            goto L12e
        L11e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.FIELD_DEFAULTS_PRIVATE_EVERYWHERE
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L12e:
            r15 = r0
            r0 = r13
            if (r0 == 0) goto L139
            r0 = 0
            goto L149
        L139:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.FIELD_DEFAULTS_FINAL_EVERYWHERE
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L149:
            r16 = r0
            r0 = r15
            if (r0 != 0) goto L15a
            r0 = r16
            if (r0 != 0) goto L15a
            r0 = r10
            if (r0 != 0) goto L15a
            return
        L15a:
            r0 = r10
            if (r0 != 0) goto L166
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L166
            return
        L166:
            r0 = r10
            if (r0 == 0) goto L179
            r0 = r12
            if (r0 == 0) goto L179
            r0 = r14
            lombok.AccessLevel r0 = r0.level()
            goto L185
        L179:
            r0 = r15
            if (r0 == 0) goto L184
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            goto L185
        L184:
            r0 = 0
        L185:
            r17 = r0
            r0 = r10
            if (r0 == 0) goto L19a
            r0 = r13
            if (r0 == 0) goto L19a
            r0 = r14
            boolean r0 = r0.makeFinal()
            goto L19c
        L19a:
            r0 = r16
        L19c:
            r18 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r17
            r4 = r18
            r5 = 0
            boolean r0 = r0.generateFieldDefaultsForType(r1, r2, r3, r4, r5)
            return
    }
}
