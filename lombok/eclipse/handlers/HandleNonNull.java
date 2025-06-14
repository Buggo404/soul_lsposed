package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(512)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleNonNull.SCL.lombok */
public class HandleNonNull extends lombok.eclipse.EclipseAnnotationHandler<lombok.NonNull> {
    private static final char[] REQUIRE_NON_NULL = null;
    private static final char[] CHECK_NOT_NULL = null;
    public static final lombok.eclipse.handlers.HandleNonNull INSTANCE = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    static {
            java.lang.String r0 = "requireNonNull"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleNonNull.REQUIRE_NON_NULL = r0
            java.lang.String r0 = "checkNotNull"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleNonNull.CHECK_NOT_NULL = r0
            lombok.eclipse.handlers.HandleNonNull r0 = new lombok.eclipse.handlers.HandleNonNull
            r1 = r0
            r1.<init>()
            lombok.eclipse.handlers.HandleNonNull.INSTANCE = r0
            return
    }

    public HandleNonNull() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void fix(lombok.eclipse.EclipseNode r6) {
            r5 = this;
            r0 = r6
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L68
        Lb:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r7 = r0
            r0 = r7
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT
            if (r0 == r1) goto L22
            goto L68
        L22:
            r0 = r7
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L5e
        L2e:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L5e
            java.lang.Class<lombok.NonNull> r0 = lombok.NonNull.class
            r1 = r9
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L5e
            r0 = r5
            r1 = r9
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r1
            r2 = r9
            r3 = 1
            r0.handle0(r1, r2, r3)
        L5e:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2e
        L68:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    private java.util.List<org.eclipse.jdt.internal.compiler.ast.FieldDeclaration> getRecordComponents(lombok.eclipse.EclipseNode r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L46
        L14:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L46
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r8 = r0
            r0 = r8
            int r0 = r0.modifiers
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L46
            r0 = r5
            r1 = r8
            boolean r0 = r0.add(r1)
        L46:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r5
            return r0
    }

    private lombok.eclipse.EclipseNode addCompactConstructorIfNeeded(lombok.eclipse.EclipseNode r11, lombok.eclipse.EclipseNode r12) {
            r10 = this;
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r11
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L12b
        L14:
            r0 = r17
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r16 = r0
            r0 = r16
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 != 0) goto L2e
            goto L12b
        L2e:
            r0 = r16
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            r18 = r0
            r0 = r18
            int r0 = r0.bits
            r1 = 512(0x200, float:7.175E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L5d
            r0 = r18
            int r0 = r0.bits
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L56
            r0 = r16
            r13 = r0
            goto L12b
        L56:
            r0 = r16
            r14 = r0
            goto L12b
        L5d:
            r0 = r15
            if (r0 != 0) goto L69
            r0 = r10
            r1 = r11
            java.util.List r0 = r0.getRecordComponents(r1)
            r15 = r0
        L69:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            if (r0 != 0) goto L75
            r0 = 0
            goto L7b
        L75:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            int r0 = r0.length
        L7b:
            r19 = r0
            r0 = r15
            int r0 = r0.size()
            r20 = r0
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L91
            r0 = 1
            goto L92
        L91:
            r0 = 0
        L92:
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L124
            r0 = 0
            r22 = r0
            goto L11d
        L9f:
            r0 = r15
            r1 = r22
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r23 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r22
            r0 = r0[r1]
            if (r0 != 0) goto Lbf
            r0 = 0
            goto Lca
        Lbf:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r22
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
        Lca:
            r24 = r0
            r0 = r23
            char[][] r0 = getRawTypeName(r0)
            r25 = r0
            r0 = r24
            char[][] r0 = getRawTypeName(r0)
            r26 = r0
            r0 = r25
            if (r0 == 0) goto Led
            r0 = r26
            if (r0 == 0) goto Led
            r0 = r25
            int r0 = r0.length
            r1 = r26
            int r1 = r1.length
            if (r0 == r1) goto Lf3
        Led:
            r0 = 0
            r21 = r0
            goto L124
        Lf3:
            r0 = 0
            r27 = r0
            goto L112
        Lf9:
            r0 = r25
            r1 = r27
            r0 = r0[r1]
            r1 = r26
            r2 = r27
            r1 = r1[r2]
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L10f
            r0 = 0
            r21 = r0
            goto L124
        L10f:
            int r27 = r27 + 1
        L112:
            r0 = r27
            r1 = r25
            int r1 = r1.length
            if (r0 < r1) goto Lf9
            int r22 = r22 + 1
        L11d:
            r0 = r22
            r1 = r19
            if (r0 < r1) goto L9f
        L124:
            r0 = r21
            if (r0 == 0) goto L12b
            r0 = 0
            return r0
        L12b:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r14
            if (r0 == 0) goto L13d
            r0 = r14
            return r0
        L13d:
            r0 = -1
            r16 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r17 = r0
            r0 = r13
            if (r0 == 0) goto L1aa
            r0 = -1
            r18 = r0
            r0 = 0
            r19 = r0
            goto L16c
        L156:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r19
            r0 = r0[r1]
            r1 = r13
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L169
            r0 = r19
            r18 = r0
        L169:
            int r19 = r19 + 1
        L16c:
            r0 = r19
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r1 = r1.methods
            int r1 = r1.length
            if (r0 < r1) goto L156
            r0 = r18
            r1 = -1
            if (r0 == r1) goto L1aa
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r18
            r2 = 1
            int r1 = r1 + r2
            r2 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r2 = r2.methods
            r3 = r18
            r4 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r4 = r4.methods
            int r4 = r4.length
            r5 = r18
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r16 = r0
            r0 = r11
            r1 = r13
            r0.removeChild(r1)
        L1aa:
            r0 = r16
            r1 = -1
            if (r0 != r1) goto L1da
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = new org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[r0]
            r18 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            int r0 = r0.length
            r16 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = 0
            r2 = r18
            r3 = 0
            r4 = r16
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r17
            r1 = r18
            r0.methods = r1
        L1da:
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            r1 = r0
            r2 = r11
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r18 = r0
            r0 = r18
            r1 = 1
            r0.modifiers = r1
            r0 = r18
            r1 = -2139094528(0xffffffff80800200, float:-1.1755661E-38)
            r0.bits = r1
            r0 = r18
            r1 = r17
            char[] r1 = r1.name
            r0.selector = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r1 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.constructorCall = r1
            r0 = r15
            if (r0 != 0) goto L223
            r0 = r10
            r1 = r11
            java.util.List r0 = r0.getRecordComponents(r1)
            r15 = r0
        L223:
            r0 = r18
            r1 = r15
            int r1 = r1.size()
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r0.arguments = r1
            r0 = r18
            r1 = r15
            int r1 = r1.size()
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
            r0 = r18
            r1 = 512(0x200, float:7.175E-43)
            r0.bits = r1
            r0 = 0
            r19 = r0
            goto L2d1
        L24f:
            r0 = r15
            r1 = r19
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r20 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r19
            org.eclipse.jdt.internal.compiler.ast.Argument r2 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r3 = r2
            r4 = r20
            char[] r4 = r4.name
            r5 = r20
            int r5 = r5.sourceStart
            long r5 = (long) r5
            r6 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r19
            r0 = r0[r1]
            r1 = -1073741820(0xffffffffc0000004, float:-2.000001)
            r0.bits = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r20
            char[] r2 = r2.name
            r3 = 0
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r20
            char[] r2 = r2.name
            r3 = 0
            r1.<init>(r2, r3)
            r22 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r19
            org.eclipse.jdt.internal.compiler.ast.Assignment r2 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r3 = r2
            r4 = r21
            r5 = r22
            r6 = r20
            int r6 = r6.sourceEnd
            r3.<init>(r4, r5, r6)
            r0[r1] = r2
            int r19 = r19 + 1
        L2d1:
            r0 = r19
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            int r1 = r1.length
            if (r0 < r1) goto L24f
            r0 = r18
            r1 = r12
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = 0
            r19 = r0
            goto L340
        L2ef:
            r0 = r15
            r1 = r19
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r20 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r19
            r0 = r0[r1]
            r1 = r20
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r19
            r0 = r0[r1]
            r1 = r20
            int r1 = r1.sourceStart
            r0.sourceEnd = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r19
            r0 = r0[r1]
            r1 = r20
            int r1 = r1.sourceStart
            r0.declarationSourceEnd = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r19
            r0 = r0[r1]
            r1 = r20
            int r1 = r1.sourceStart
            r0.declarationEnd = r1
            int r19 = r19 + 1
        L340:
            r0 = r19
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            int r1 = r1.length
            if (r0 < r1) goto L2ef
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r16
            r2 = r18
            r0[r1] = r2
            r0 = r18
            r1 = r11
            r2 = r18
            r3 = r18
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.addSuppressWarningsAll(r1, r2, r3)
            r0.annotations = r1
            r0 = r18
            r1 = r11
            r2 = r18
            r3 = r18
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.addGenerated(r1, r2, r3)
            r0.annotations = r1
            r0 = r11
            r1 = r18
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.METHOD
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    private static char[][] getRawTypeName(org.eclipse.jdt.internal.compiler.ast.TypeReference r5) {
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto Lf
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            return r0
        Lf:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L25
            r0 = 1
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = r5
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r3 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r3
            char[] r3 = r3.token
            r1[r2] = r3
            return r0
        L25:
            r0 = 0
            return r0
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.NonNull> r6, org.eclipse.jdt.internal.compiler.ast.Annotation r7, lombok.eclipse.EclipseNode r8) {
            r5 = this;
            r0 = r8
            boolean r0 = r0.isCompleteParse()
            if (r0 != 0) goto L4a
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L41
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L41
            r0 = r9
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isRecord(r0)
            if (r0 == 0) goto L41
            r0 = r5
            r1 = r9
            r2 = r8
            lombok.eclipse.EclipseNode r0 = r0.addCompactConstructorIfNeeded(r1, r2)
        L41:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.ASTNode_handled
            r1 = r7
            java.lang.Object r0 = r0.clear(r1)
            return
        L4a:
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = 0
            r0.handle0(r1, r2, r3)
            return
    }

    private lombok.eclipse.EclipseNode findCompactConstructor(lombok.eclipse.EclipseNode r4) {
            r3 = this;
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L45
        Lb:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 != 0) goto L22
            goto L45
        L22:
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            r7 = r0
            r0 = r7
            int r0 = r0.bits
            r1 = 512(0x200, float:7.175E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L45
            r0 = r7
            int r0 = r0.bits
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L45
            r0 = r5
            return r0
        L45:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
    }

    private void handle0(org.eclipse.jdt.internal.compiler.ast.Annotation r6, lombok.eclipse.EclipseNode r7, boolean r8) {
            r5 = this;
            r0 = r7
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.NON_NULL_FLAG_USAGE
            java.lang.String r2 = "@NonNull"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L77
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r10 = r0
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()     // Catch: java.lang.Exception -> L4b
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L4b
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r0     // Catch: java.lang.Exception -> L4b
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type     // Catch: java.lang.Exception -> L4b
            boolean r0 = lombok.eclipse.Eclipse.isPrimitive(r0)     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4c
            r0 = r7
            java.lang.String r1 = "@NonNull is meaningless on a primitive."
            r0.addWarning(r1)     // Catch: java.lang.Exception -> L4b
            return
        L4b:
        L4c:
            r0 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isRecord(r0)
            if (r0 == 0) goto L76
            r0 = r5
            r1 = r10
            lombok.eclipse.EclipseNode r0 = r0.findCompactConstructor(r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L76
            r0 = r5
            r1 = r11
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r1
            r2 = r9
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r2
            r3 = r7
            r0.addNullCheckIfNeeded(r1, r2, r3)
        L76:
            return
        L77:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r7
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 7: goto La8;
                case 8: goto L11d;
                case 9: goto L11d;
                case 10: goto Lb4;
                default: goto L11d;
            }
        La8:
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r10 = r0
            goto L11e
        Lb4:
            r0 = r7
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeReference
            if (r0 == 0) goto L10a
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.EclipseAST.getTopLevelTypeReferenceAnnotations(r0)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto Le2
            return
        Le2:
            r0 = r15
            r1 = r0
            r19 = r1
            int r0 = r0.length
            r18 = r0
            r0 = 0
            r17 = r0
            goto L103
        Lf0:
            r0 = r19
            r1 = r17
            r0 = r0[r1]
            r16 = r0
            r0 = r6
            r1 = r16
            if (r0 != r1) goto L100
            r0 = 1
            r13 = r0
        L100:
            int r17 = r17 + 1
        L103:
            r0 = r17
            r1 = r18
            if (r0 < r1) goto Lf0
        L10a:
            r0 = r13
            if (r0 != 0) goto L110
            return
        L110:
            r0 = r12
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r10 = r0
            goto L11e
        L11d:
            return
        L11e:
            r0 = r10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L13b
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = (org.eclipse.jdt.internal.compiler.ast.Argument) r0     // Catch: java.lang.Exception -> L13b
            r9 = r0
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()     // Catch: java.lang.Exception -> L13b
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Exception -> L13b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L13b
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0     // Catch: java.lang.Exception -> L13b
            r11 = r0
            goto L13d
        L13b:
            return
        L13d:
            r0 = r8
            if (r0 != 0) goto L14a
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r0)
            if (r0 == 0) goto L14a
            return
        L14a:
            r0 = r11
            boolean r0 = r0.isAbstract()
            if (r0 == 0) goto L153
            return
        L153:
            r0 = r5
            r1 = r11
            r2 = r9
            r3 = r7
            r0.addNullCheckIfNeeded(r1, r2, r3)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r0.rebuild()
            return
    }

    private void addNullCheckIfNeeded(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r8, org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r9, lombok.eclipse.EclipseNode r10) {
            r7 = this;
            r0 = r9
            r1 = r10
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L15
            r0 = r10
            java.lang.String r1 = "@NonNull is meaningless on a primitive."
            r0.addWarning(r1)
            return
        L15:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            if (r0 != 0) goto L2c
            r0 = r8
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r11
            r2[r3] = r4
            r0.statements = r1
            goto L11b
        L2c:
            r0 = r9
            char[] r0 = r0.name
            r12 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r13 = r0
            r0 = 0
            r14 = r0
            goto L99
        L3e:
            r0 = r13
            r1 = r14
            int r14 = r14 + 1
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TryStatement
            if (r0 == 0) goto L63
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.TryStatement r0 = (org.eclipse.jdt.internal.compiler.ast.TryStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.tryBlock
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r13 = r0
            r0 = 0
            r14 = r0
            goto L99
        L63:
            r0 = r15
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement
            if (r0 == 0) goto L7e
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement r0 = (org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.block
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r13 = r0
            r0 = 0
            r14 = r0
            goto L99
        L7e:
            r0 = r7
            r1 = r15
            char[] r0 = r0.returnVarNameIfNullCheck(r1)
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L8e
            goto La6
        L8e:
            r0 = r16
            r1 = r12
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L99
            return
        L99:
            r0 = r13
            if (r0 == 0) goto La6
            r0 = r13
            int r0 = r0.length
            r1 = r14
            if (r0 > r1) goto L3e
        La6:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r0
            r18 = r1
            int r0 = r0.length
            r17 = r0
            r0 = 0
            r16 = r0
            goto Le3
        Lc5:
            r0 = r18
            r1 = r16
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r0)
            if (r0 == 0) goto Lea
            r0 = r7
            r1 = r15
            boolean r0 = r0.isNullCheck(r1)
            if (r0 == 0) goto Lea
            int r14 = r14 + 1
            int r16 = r16 + 1
        Le3:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto Lc5
        Lea:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = r14
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r14
            r2 = r13
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            r4 = r8
            org.eclipse.jdt.internal.compiler.ast.Statement[] r4 = r4.statements
            int r4 = r4.length
            r5 = r14
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r13
            r1 = r14
            r2 = r11
            r0[r1] = r2
            r0 = r8
            r1 = r13
            r0.statements = r1
        L11b:
            return
    }

    public boolean isNullCheck(org.eclipse.jdt.internal.compiler.ast.Statement r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            char[] r0 = r0.returnVarNameIfNullCheck(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public char[] returnVarNameIfNullCheck(org.eclipse.jdt.internal.compiler.ast.Statement r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.IfStatement
            r5 = r0
            r0 = r4
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Expression
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L1b
            r0 = r4
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AssertStatement
            if (r0 != 0) goto L1b
            r0 = r6
            if (r0 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r6
            if (r0 == 0) goto L95
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = (org.eclipse.jdt.internal.compiler.ast.Expression) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Assignment
            if (r0 == 0) goto L37
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = (org.eclipse.jdt.internal.compiler.ast.Assignment) r0
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.expression
            r7 = r0
        L37:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MessageSend
            if (r0 != 0) goto L41
            r0 = 0
            return r0
        L41:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = (org.eclipse.jdt.internal.compiler.ast.MessageSend) r0
            r8 = r0
            r0 = r8
            char[] r0 = r0.selector
            char[] r1 = lombok.eclipse.handlers.HandleNonNull.CHECK_NOT_NULL
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L66
            r0 = r8
            char[] r0 = r0.selector
            char[] r1 = lombok.eclipse.handlers.HandleNonNull.REQUIRE_NON_NULL
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L66
            r0 = 0
            return r0
        L66:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            if (r0 == 0) goto L77
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            int r0 = r0.length
            if (r0 != 0) goto L79
        L77:
            r0 = 0
            return r0
        L79:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            if (r0 != 0) goto L8c
            r0 = 0
            return r0
        L8c:
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleNameReference) r0
            char[] r0 = r0.token
            return r0
        L95:
            r0 = r5
            if (r0 == 0) goto Ld1
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = (org.eclipse.jdt.internal.compiler.ast.IfStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = r0.thenStatement
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Block
            if (r0 == 0) goto Lc7
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Block r0 = (org.eclipse.jdt.internal.compiler.ast.Block) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lbf
            r0 = r8
            int r0 = r0.length
            if (r0 != 0) goto Lc1
        Lbf:
            r0 = 0
            return r0
        Lc1:
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            r7 = r0
        Lc7:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ThrowStatement
            if (r0 != 0) goto Ld1
            r0 = 0
            return r0
        Ld1:
            r0 = r5
            if (r0 == 0) goto Ldf
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = (org.eclipse.jdt.internal.compiler.ast.IfStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.condition
            goto Le6
        Ldf:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.AssertStatement r0 = (org.eclipse.jdt.internal.compiler.ast.AssertStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.assertExpression
        Le6:
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.EqualExpression
            if (r0 != 0) goto Lf2
            r0 = 0
            return r0
        Lf2:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = (org.eclipse.jdt.internal.compiler.ast.EqualExpression) r0
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.operatorToString()
            r9 = r0
            r0 = r5
            if (r0 == 0) goto L111
            java.lang.String r0 = "=="
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11e
            r0 = 0
            return r0
        L111:
            java.lang.String r0 = "!="
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11e
            r0 = 0
            return r0
        L11e:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.left
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            if (r0 != 0) goto L12b
            r0 = 0
            return r0
        L12b:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.right
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NullLiteral
            if (r0 != 0) goto L138
            r0 = 0
            return r0
        L138:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.left
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleNameReference) r0
            char[] r0 = r0.token
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleNonNull.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleNonNull.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }
}
