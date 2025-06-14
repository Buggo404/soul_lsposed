package lombok.javac.handlers;

@lombok.core.HandlerPriority(-4096)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleUtilityClass.SCL.lombok */
public class HandleUtilityClass extends lombok.javac.JavacAnnotationHandler<lombok.experimental.UtilityClass> {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    public HandleUtilityClass() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.UtilityClass> r5, com.sun.tools.javac.tree.JCTree.JCAnnotation r6, lombok.javac.JavacNode r7) {
            r4 = this;
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.UTILITY_CLASS_FLAG_USAGE
            java.lang.String r2 = "@UtilityClass"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r7
            java.lang.Class<lombok.experimental.UtilityClass> r1 = lombok.experimental.UtilityClass.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            r0 = r8
            r1 = r7
            boolean r0 = checkLegality(r0, r1)
            if (r0 != 0) goto L22
            return
        L22:
            r0 = r4
            r1 = r7
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r7
            r0.changeModifiersAndGenerateConstructor(r1, r2)
            return
    }

    private static boolean checkLegality(lombok.javac.JavacNode r5, lombok.javac.JavacNode r6) {
            r0 = r5
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto Lf
            r0 = r6
            java.lang.String r1 = "@UtilityClass is only supported on a class."
            r0.addError(r1)
            r0 = 0
            return r0
        Lf:
            r0 = r5
            r7 = r0
        L11:
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r7 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r7
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L71;
                case 2: goto L3c;
                default: goto L73;
            }
        L3c:
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r8 = r0
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 25096(0x6208, double:1.2399E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L57
            goto L11
        L57:
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L69
            r0 = 1
            return r0
        L69:
            r0 = r6
            java.lang.String r1 = "@UtilityClass automatically makes the class static, however, this class cannot be made static."
            r0.addError(r1)
            r0 = 0
            return r0
        L71:
            r0 = 1
            return r0
        L73:
            r0 = r6
            java.lang.String r1 = "@UtilityClass cannot be placed on a method local or anonymous inner class, or any class nested in such a class."
            r0.addError(r1)
            r0 = 0
            return r0
    }

    private void changeModifiersAndGenerateConstructor(lombok.javac.JavacNode r7, lombok.javac.JavacNode r8) {
            r6 = this;
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 16
            long r1 = r1 | r2
            r0.flags = r1
            r0 = 1
            r11 = r0
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L30
            r0 = 0
            r11 = r0
        L30:
            r0 = r11
            if (r0 == 0) goto L68
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L68
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r12 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8704(0x2200, double:4.3003E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            r0 = 0
            r11 = r0
        L68:
            r0 = r11
            if (r0 == 0) goto L7c
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 | r2
            r0.flags = r1
        L7c:
            r0 = r7
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L167
        L88:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r12 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto Lbc
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r14 = r0
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 | r2
            r0.flags = r1
            goto L167
        Lbc:
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L117
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r14 = r0
            r0 = r14
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "<init>"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L104
            r0 = r14
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r0)
            if (r0 != 0) goto L104
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L104
            r0 = r12
            java.lang.String r1 = "@UtilityClasses cannot have declared constructors."
            r0.addError(r1)
            r0 = 0
            r10 = r0
            goto L167
        L104:
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 | r2
            r0.flags = r1
            goto L167
        L117:
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L167
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r14 = r0
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r0
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 | r2
            r0.flags = r1
            r0 = r14
            com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L167
            r0 = r15
            com.sun.tools.javac.code.Type r0 = r0.type
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ClassType
            if (r0 == 0) goto L161
            r0 = r15
            com.sun.tools.javac.code.Type r0 = r0.type
            com.sun.tools.javac.code.Type$ClassType r0 = (com.sun.tools.javac.code.Type.ClassType) r0
            com.sun.tools.javac.code.Type$JCNoType r1 = com.sun.tools.javac.code.Type.noType
            r0.setEnclosingType(r1)
        L161:
            r0 = r15
            r1 = 0
            r0.erasure_field = r1
        L167:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L88
            r0 = r10
            if (r0 == 0) goto L17b
            r0 = r6
            r1 = r7
            r0.createPrivateDefaultConstructor(r1)
        L17b:
            return
    }

    private void createPrivateDefaultConstructor(lombok.javac.JavacNode r11) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r12
            r1 = 2
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r13 = r0
            r0 = r11
            java.lang.String r1 = "<init>"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r14 = r0
            r0 = r12
            r1 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            com.sun.tools.javac.util.List r2 = r2.createThrowStatement(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r15 = r0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r15
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r16 = r0
            r0 = r16
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r17 = r0
            r0 = r11
            r1 = r17
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> createThrowStatement(lombok.javac.JavacNode r8, lombok.javac.JavacTreeMaker r9) {
            r7 = this;
            r0 = r8
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "UnsupportedOperationException"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r10 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r11 = r0
            r0 = r9
            java.lang.String r1 = "This is a utility class and cannot be instantiated"
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r12 = r0
            r0 = r9
            r1 = 0
            r2 = r11
            r3 = r10
            r4 = r12
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4)
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r9
            r1 = r13
            com.sun.tools.javac.tree.JCTree$JCThrow r0 = r0.Throw(r1)
            r14 = r0
            r0 = r14
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleUtilityClass.$SWITCH_TABLE$lombok$core$AST$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.AST$Kind[] r0 = lombok.core.AST.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.INITIALIZER     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL     // Catch: java.lang.NoSuchFieldError -> L60
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            goto L61
        L60:
        L61:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L6d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            goto L6e
        L6d:
        L6e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.NoSuchFieldError -> L7b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            goto L7c
        L7b:
        L7c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE_USE     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleUtilityClass.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
