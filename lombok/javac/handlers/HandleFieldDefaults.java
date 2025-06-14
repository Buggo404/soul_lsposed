package lombok.javac.handlers;

@lombok.core.HandlerPriority(-2048)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleFieldDefaults.SCL.lombok */
public class HandleFieldDefaults extends lombok.javac.JavacASTAdapter {
    public HandleFieldDefaults() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean generateFieldDefaultsForType(lombok.javac.JavacNode r6, lombok.javac.JavacNode r7, lombok.AccessLevel r8, boolean r9, boolean r10) {
            r5 = this;
            r0 = r10
            if (r0 == 0) goto L10
            java.lang.Class<lombok.experimental.FieldDefaults> r0 = lombok.experimental.FieldDefaults.class
            r1 = r6
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r6
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L1f
            r0 = r7
            java.lang.String r1 = "@FieldDefaults is only supported on a class or an enum."
            r0.addError(r1)
            r0 = 0
            return r0
        L1f:
            r0 = r6
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L6b
        L2b:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L45
            goto L6b
        L45:
            r0 = r11
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r13 = r0
            r0 = r13
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L62
            goto L6b
        L62:
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = r9
            r0.setFieldDefaultsForField(r1, r2, r3)
        L6b:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2b
            r0 = 1
            return r0
    }

    public void setFieldDefaultsForField(lombok.javac.JavacNode r7, lombok.AccessLevel r8, boolean r9) {
            r6 = this;
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L51
            r0 = r8
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L51
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 7
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            java.lang.Class<lombok.experimental.PackagePrivate> r0 = lombok.experimental.PackagePrivate.class
            r1 = r7
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotationAndDeleteIfNeccessary(r0, r1)
            if (r0 != 0) goto L51
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = r8
            int r2 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r2)
            long r2 = (long) r2
            long r1 = r1 | r2
            r0.flags = r1
        L51:
            r0 = r9
            if (r0 == 0) goto L90
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L90
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r7
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotationAndDeleteIfNeccessary(r0, r1)
            if (r0 != 0) goto L90
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L90
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 16
            long r1 = r1 | r2
            r0.flags = r1
        L90:
            r0 = r7
            r0.rebuild()
            return
    }

    @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
    public void visitType(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCClassDecl r9) {
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
            goto Le7
        L1a:
            r0 = r16
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r15 = r0
            r0 = r15
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L34
            goto Le7
        L34:
            r0 = r15
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r17 = r0
            r0 = r17
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L4d
            goto Le7
        L4d:
            r0 = r18
            java.lang.String r0 = r0.toString()
            r19 = r0
            r0 = r19
            java.lang.String r1 = "FieldDefaults"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6b
            r0 = r19
            java.lang.String r1 = "lombok.experimental.FieldDefaults"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6b
            goto Le7
        L6b:
            java.lang.Class<lombok.experimental.FieldDefaults> r0 = lombok.experimental.FieldDefaults.class
            r1 = r15
            r2 = r18
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 != 0) goto L7a
            goto Le7
        L7a:
            r0 = r15
            r11 = r0
            java.lang.Class<lombok.experimental.FieldDefaults> r0 = lombok.experimental.FieldDefaults.class
            r1 = r15
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r0, r1)
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
            if (r0 != 0) goto Lba
            r0 = r13
            if (r0 != 0) goto Lba
            r0 = r15
            java.lang.String r1 = "This does nothing; provide either level or makeFinal or both."
            r0.addError(r1)
        Lba:
            r0 = r12
            if (r0 == 0) goto Ld6
            r0 = r14
            lombok.AccessLevel r0 = r0.level()
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto Ld6
            r0 = r15
            java.lang.String r1 = "AccessLevel.NONE doesn't mean anything here. Pick another value."
            r0.addError(r1)
            r0 = 0
            r12 = r0
        Ld6:
            r0 = r15
            java.lang.Class<lombok.experimental.FieldDefaults> r1 = lombok.experimental.FieldDefaults.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r15
            java.lang.String r1 = "lombok.AccessLevel"
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            goto Lf1
        Le7:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
        Lf1:
            r0 = r14
            if (r0 != 0) goto L107
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8704(0x2200, double:4.3003E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L107
            return
        L107:
            r0 = r12
            if (r0 == 0) goto L110
            r0 = 0
            goto L120
        L110:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.FIELD_DEFAULTS_PRIVATE_EVERYWHERE
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L120:
            r15 = r0
            r0 = r13
            if (r0 == 0) goto L12b
            r0 = 0
            goto L13b
        L12b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.FIELD_DEFAULTS_FINAL_EVERYWHERE
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L13b:
            r16 = r0
            r0 = r15
            if (r0 != 0) goto L14c
            r0 = r16
            if (r0 != 0) goto L14c
            r0 = r10
            if (r0 != 0) goto L14c
            return
        L14c:
            r0 = r10
            if (r0 != 0) goto L158
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L158
            return
        L158:
            r0 = r10
            if (r0 == 0) goto L16b
            r0 = r12
            if (r0 == 0) goto L16b
            r0 = r14
            lombok.AccessLevel r0 = r0.level()
            goto L177
        L16b:
            r0 = r15
            if (r0 == 0) goto L176
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            goto L177
        L176:
            r0 = 0
        L177:
            r17 = r0
            r0 = r10
            if (r0 == 0) goto L18c
            r0 = r13
            if (r0 == 0) goto L18c
            r0 = r14
            boolean r0 = r0.makeFinal()
            goto L18e
        L18c:
            r0 = r16
        L18e:
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
