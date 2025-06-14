package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-4096)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleUtilityClass.SCL.lombok */
public class HandleUtilityClass extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.UtilityClass> {
    private static final char[][] JAVA_LANG_UNSUPPORTED_OPERATION_EXCEPTION = null;
    private static final char[] UNSUPPORTED_MESSAGE = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    static {
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            char[] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA
            r1[r2] = r3
            r1 = r0
            r2 = 1
            char[] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.LANG
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "UnsupportedOperationException"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            lombok.eclipse.handlers.HandleUtilityClass.JAVA_LANG_UNSUPPORTED_OPERATION_EXCEPTION = r0
            java.lang.String r0 = "This is a utility class and cannot be instantiated"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleUtilityClass.UNSUPPORTED_MESSAGE = r0
            return
    }

    public HandleUtilityClass() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.UtilityClass> r5, org.eclipse.jdt.internal.compiler.ast.Annotation r6, lombok.eclipse.EclipseNode r7) {
            r4 = this;
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.UTILITY_CLASS_FLAG_USAGE
            java.lang.String r2 = "@UtilityClass"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r8 = r0
            r0 = r8
            r1 = r7
            boolean r0 = checkLegality(r0, r1)
            if (r0 != 0) goto L1c
            return
        L1c:
            r0 = r4
            r1 = r7
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            r2 = r7
            r0.changeModifiersAndGenerateConstructor(r1, r2)
            return
    }

    private static boolean checkLegality(lombok.eclipse.EclipseNode r3, lombok.eclipse.EclipseNode r4) {
            r0 = r3
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto Lf
            r0 = r4
            java.lang.String r1 = "@UtilityClass is only supported on a class."
            r0.addError(r1)
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r5 = r0
        L11:
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r5
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L6a;
                case 2: goto L3c;
                default: goto L6c;
            }
        L3c:
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            r1 = 25096(0x6208, float:3.5167E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L50
            goto L11
        L50:
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L62
            r0 = 1
            return r0
        L62:
            r0 = r4
            java.lang.String r1 = "@UtilityClass automatically makes the class static, however, this class cannot be made static."
            r0.addError(r1)
            r0 = 0
            return r0
        L6a:
            r0 = 1
            return r0
        L6c:
            r0 = r4
            java.lang.String r1 = "@UtilityClass cannot be placed on a method local or anonymous inner class, or any class nested in such a class."
            r0.addError(r1)
            r0 = 0
            return r0
    }

    private void changeModifiersAndGenerateConstructor(lombok.eclipse.EclipseNode r5, lombok.eclipse.EclipseNode r6) {
            r4 = this;
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = 1
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L32
            r0 = 0
            r9 = r0
        L32:
            r0 = r9
            if (r0 == 0) goto L65
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L65
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r12 = r0
            r0 = r12
            int r0 = r0.modifiers
            r1 = 8704(0x2200, float:1.2197E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L65
            r0 = 0
            r9 = r0
        L65:
            r0 = r9
            if (r0 == 0) goto L75
            r0 = r7
            r1 = r0
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
        L75:
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L149
        L81:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto Lbf
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r14 = r0
            r0 = r14
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L149
            r0 = 1
            r10 = r0
            r0 = r14
            r1 = r0
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
            goto L149
        Lbf:
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L12c
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L107
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            r15 = r0
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getGeneratedBy(r0)
            if (r0 != 0) goto L149
            r0 = r15
            int r0 = r0.bits
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L149
            r0 = r12
            java.lang.String r1 = "@UtilityClasses cannot have declared constructors."
            r0.addError(r1)
            r0 = 0
            r8 = r0
            goto L149
        L107:
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L11e
            r0 = r14
            r1 = r0
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
            goto L149
        L11e:
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Clinit
            if (r0 == 0) goto L149
            r0 = 1
            r11 = r0
            goto L149
        L12c:
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L149
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r1 = r0
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
        L149:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L81
            r0 = r8
            if (r0 == 0) goto L15e
            r0 = r4
            r1 = r5
            r2 = r6
            r0.createPrivateDefaultConstructor(r1, r2)
        L15e:
            r0 = r10
            if (r0 == 0) goto L16c
            r0 = r11
            if (r0 != 0) goto L16c
            r0 = r7
            r0.addClinit()
        L16c:
            return
    }

    private void createPrivateDefaultConstructor(lombok.eclipse.EclipseNode r12, lombok.eclipse.EclipseNode r13) {
            r11 = this;
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r14 = r0
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            r1 = r0
            r2 = r12
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            r1 = 2
            r0.modifiers = r1
            r0 = r16
            r1 = r15
            char[] r1 = r1.name
            r0.selector = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r1 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.constructorCall = r1
            r0 = r16
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r16
            r1 = 0
            r0.typeParameters = r1
            r0 = r16
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r16
            r1 = 0
            r0.arguments = r1
            char[][] r0 = lombok.eclipse.handlers.HandleUtilityClass.JAVA_LANG_UNSUPPORTED_OPERATION_EXCEPTION
            int r0 = r0.length
            long[] r0 = new long[r0]
            r17 = r0
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.HandleUtilityClass.JAVA_LANG_UNSUPPORTED_OPERATION_EXCEPTION
            r4 = r17
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r18
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleUtilityClass.UNSUPPORTED_MESSAGE
            r7 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.ThrowStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ThrowStatement
            r1 = r0
            r2 = r18
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r19 = r0
            r0 = r16
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r19
            r2[r3] = r4
            r0.statements = r1
            r0 = r16
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            r2 = r15
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r12
            r1 = r16
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleUtilityClass.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleUtilityClass.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
