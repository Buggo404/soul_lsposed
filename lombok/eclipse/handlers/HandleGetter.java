package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleGetter.SCL.lombok */
public class HandleGetter extends lombok.eclipse.EclipseAnnotationHandler<lombok.Getter> {
    private static final org.eclipse.jdt.internal.compiler.ast.Annotation[] EMPTY_ANNOTATIONS_ARRAY = null;
    private static final java.lang.String GETTER_NODE_NOT_SUPPORTED_ERR = "@Getter is only supported on a class, an enum, or a field.";

    /* renamed from: AR */
    private static final char[][] f575AR = null;
    public static final java.util.Map<java.lang.String, char[][]> TYPE_MAP = null;
    private static char[] valueName;
    private static char[] actualValueName;
    private static final int PARENTHESIZED = 2097152;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f576xb87c1847;

    static {
            r0 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            lombok.eclipse.handlers.HandleGetter.EMPTY_ANNOTATIONS_ARRAY = r0
            java.lang.String r0 = "java.util.concurrent.atomic.AtomicReference"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleGetter.f575AR = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "int"
            java.lang.String r2 = "java.lang.Integer"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "double"
            java.lang.String r2 = "java.lang.Double"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "float"
            java.lang.String r2 = "java.lang.Float"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "short"
            java.lang.String r2 = "java.lang.Short"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "byte"
            java.lang.String r2 = "java.lang.Byte"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "long"
            java.lang.String r2 = "java.lang.Long"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "java.lang.Boolean"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "char"
            java.lang.String r2 = "java.lang.Character"
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.eclipse.handlers.HandleGetter.TYPE_MAP = r0
            java.lang.String r0 = "value"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleGetter.valueName = r0
            java.lang.String r0 = "actualValue"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleGetter.actualValueName = r0
            return
    }

    public HandleGetter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean generateGetterForType(lombok.eclipse.EclipseNode r8, lombok.eclipse.EclipseNode r9, lombok.AccessLevel r10, boolean r11, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r12) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto L10
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L1f
            r0 = r9
            java.lang.String r1 = "@Getter is only supported on a class, an enum, or a field."
            r0.addError(r1)
            r0 = 0
            return r0
        L1f:
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L50
        L2b:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            boolean r0 = fieldQualifiesForGetterGeneration(r0)
            if (r0 == 0) goto L50
            r0 = r7
            r1 = r13
            r2 = r9
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r3 = r10
            r4 = 0
            r5 = r12
            r0.generateGetterForField(r1, r2, r3, r4, r5)
        L50:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2b
            r0 = 1
            return r0
    }

    public static boolean fieldQualifiesForGetterGeneration(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r4 = r0
            r0 = r4
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            return r0
    }

    public void generateGetterForField(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11, lombok.AccessLevel r12, boolean r13, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r14) {
            r9 = this;
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto La
            return
        La:
            r0 = r9
            r1 = r12
            r2 = r10
            r3 = r10
            r4 = r11
            r5 = 0
            r6 = r13
            r7 = r14
            r0.createGetterForField(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Getter> r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11, lombok.eclipse.EclipseNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.GETTER_FLAG_USAGE
            java.lang.String r2 = "@Getter"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            r14 = r0
            r0 = r14
            lombok.AccessLevel r0 = r0.value()
            r15 = r0
            r0 = r14
            boolean r0 = r0.lazy()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L3b
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.GETTER_LAZY_FLAG_USAGE
            java.lang.String r2 = "@Getter(lazy=true)"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
        L3b:
            r0 = r15
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L4f
            r0 = r16
            if (r0 == 0) goto L4e
            r0 = r12
            java.lang.String r1 = "'lazy' does not work with AccessLevel.NONE."
            r0.addWarning(r1)
        L4e:
            return
        L4f:
            r0 = r13
            if (r0 != 0) goto L55
            return
        L55:
            r0 = r11
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@Getter(onMethod"
            r3 = r12
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r17 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r13
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L9e;
                case 3: goto L84;
                default: goto Lb7;
            }
        L84:
            r0 = r9
            r1 = r15
            r2 = r12
            java.util.Collection r2 = r2.upFromAnnotationToFields()
            r3 = r12
            r4 = r12
            java.lang.Object r4 = r4.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r4 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r4
            r5 = 1
            r6 = r16
            r7 = r17
            r0.createGetterForFields(r1, r2, r3, r4, r5, r6, r7)
            goto Lb7
        L9e:
            r0 = r16
            if (r0 == 0) goto Laa
            r0 = r12
            java.lang.String r1 = "'lazy' is not supported for @Getter on a type."
            r0.addError(r1)
        Laa:
            r0 = r9
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = 0
            r5 = r17
            boolean r0 = r0.generateGetterForType(r1, r2, r3, r4, r5)
        Lb7:
            return
    }

    public void createGetterForFields(lombok.AccessLevel r10, java.util.Collection<lombok.eclipse.EclipseNode> r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r13, boolean r14, boolean r15, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r16) {
            r9 = this;
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L27
        Lb:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r17 = r0
            r0 = r9
            r1 = r10
            r2 = r17
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.createGetterForField(r1, r2, r3, r4, r5, r6, r7)
        L27:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createGetterForField(lombok.AccessLevel r10, lombok.eclipse.EclipseNode r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r13, boolean r14, boolean r15, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r16) {
            r9 = this;
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L11
            r0 = r12
            java.lang.String r1 = "@Getter is only supported on a class, an enum, or a field."
            r0.addError(r1)
            return
        L11:
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L60
            r0 = r17
            int r0 = r0.modifiers
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L34
            r0 = r17
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L3c
        L34:
            r0 = r12
            java.lang.String r1 = "'lazy' requires the field to be private and final."
            r0.addError(r1)
            return
        L3c:
            r0 = r17
            int r0 = r0.modifiers
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L50
            r0 = r12
            java.lang.String r1 = "'lazy' is not supported on transient fields."
            r0.addError(r1)
            return
        L50:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 != 0) goto L60
            r0 = r12
            java.lang.String r1 = "'lazy' requires field initialization."
            r0.addError(r1)
            return
        L60:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r18 = r0
            r0 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isBoolean(r0)
            r19 = r0
            r0 = r11
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r20 = r0
            r0 = r11
            r1 = r19
            r2 = r20
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toGetterName(r0, r1, r2)
            r21 = r0
            r0 = r21
            if (r0 != 0) goto L90
            r0 = r12
            java.lang.String r1 = "Not generating getter for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L90:
            r0 = r10
            int r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r0)
            r1 = r17
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 & r2
            r0 = r0 | r1
            r22 = r0
            r0 = r11
            r1 = r19
            r2 = r20
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toAllGetterNames(r0, r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L127
        Lb1:
            r0 = r24
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            int[] r0 = m72xb87c1847()
            r1 = r23
            r2 = r11
            r3 = 0
            r4 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L127;
                case 2: goto Le8;
                case 3: goto Le9;
                default: goto L127;
            }
        Le8:
            return
        Le9:
            r0 = r14
            if (r0 == 0) goto L126
            java.lang.String r0 = ""
            r25 = r0
            r0 = r23
            r1 = r21
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10e
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r25 = r0
        L10e:
            r0 = r12
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r21
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r25
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        L126:
            return
        L127:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb1
            r0 = r9
            r1 = r11
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r2 = r11
            r3 = r21
            r4 = r22
            r5 = r13
            r6 = r15
            r7 = r16
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createGetter(r1, r2, r3, r4, r5, r6, r7)
            r23 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r23
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] findDelegatesAndMarkAsHandled(lombok.eclipse.EclipseNode r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L3e
        L13:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            java.lang.Class<lombok.experimental.Delegate> r0 = lombok.experimental.Delegate.class
            r1 = r5
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L3e
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r7 = r0
            r0 = r7
            lombok.eclipse.agent.PatchDelegate.markHandled(r0)
            r0 = r4
            r1 = r7
            boolean r0 = r0.add(r1)
        L3e:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.HandleGetter.EMPTY_ANNOTATIONS_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r0
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createGetter(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r10, lombok.eclipse.EclipseNode r11, java.lang.String r12, int r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, boolean r15, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r16) {
            r9 = this;
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r17 = r0
            r0 = 0
            r19 = r0
            r0 = r15
            if (r0 == 0) goto L28
            r0 = r9
            r1 = r14
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.createLazyGetterBody(r1, r2)
            r18 = r0
            r0 = 1
            r19 = r0
            goto L31
        L28:
            r0 = r9
            r1 = r14
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.createSimpleGetterBody(r1, r2)
            r18 = r0
        L31:
            r0 = r11
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r20 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r10
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r21 = r0
            r0 = r11
            r1 = r20
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.shouldMakeFinal(r0, r1)
            if (r0 == 0) goto L54
            r0 = r13
            r1 = 16
            r0 = r0 | r1
            r13 = r0
        L54:
            r0 = r21
            r1 = r13
            r0.modifiers = r1
            r0 = r21
            r1 = r17
            r0.returnType = r1
            r0 = r21
            r1 = 0
            r0.annotations = r1
            r0 = r21
            r1 = 0
            r0.arguments = r1
            r0 = r21
            r1 = r12
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r21
            r1 = 0
            r0.binding = r1
            r0 = r21
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r21
            r1 = 0
            r0.typeParameters = r1
            r0 = r21
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r21
            r1 = r21
            r2 = r21
            r3 = r14
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r21
            r1 = r21
            r2 = r21
            r3 = r14
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = r21
            r1 = r18
            r0.statements = r1
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r1 = r21
            char[] r1 = r1.selector
            r2 = r17
            lombok.eclipse.handlers.EclipseHandlerUtil.registerCreatedLazyGetter(r0, r1, r2)
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isFieldDeprecated(r0)
            if (r0 == 0) goto Lf5
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r14
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateDeprecatedAnnotation(r3)
            r1[r2] = r3
            r22 = r0
        Lf5:
            r0 = r11
            boolean r0 = r0.isFinal()
            if (r0 == 0) goto L11a
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L135
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r14
            java.lang.String r4 = "org.checkerframework.dataflow.qual.Pure"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r3, r4)
            r1[r2] = r3
            r23 = r0
            goto L135
        L11a:
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L135
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r14
            java.lang.String r4 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r3, r4)
            r1[r2] = r3
            r23 = r0
        L135:
            r0 = r21
            r1 = r14
            r2 = 5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r16
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = findDelegatesAndMarkAsHandled(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r23
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r22
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r19
            if (r0 == 0) goto L1ef
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 2
            r1.<init>(r2)
            r22 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r11
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_SUPPRESSWARNINGS_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a3
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r1 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.EclipseHandlerUtil.ALL
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L1a3:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r1 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.EclipseHandlerUtil.UNCHECKED
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r23
            r1 = r22
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
            r0.expressions = r1
            r0 = r21
            r1 = r14
            r2 = r21
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_SUPPRESSWARNINGS
            r4 = 1
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r4 = new org.eclipse.jdt.internal.compiler.ast.ASTNode[r4]
            r5 = r4
            r6 = 0
            r7 = r23
            r5[r6] = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.addAnnotation(r1, r2, r3, r4)
            r0.annotations = r1
        L1ef:
            r0 = r21
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            r2 = r10
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r11
            r1 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r2 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.GETTER
            lombok.eclipse.handlers.EclipseHandlerUtil.copyJavadoc(r0, r1, r2)
            r0 = r21
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.Statement[] createSimpleGetterBody(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, lombok.eclipse.EclipseNode r8) {
            r6 = this;
            r0 = r8
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r9 = r0
            r0 = r8
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
            r10 = r0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r10
            r3 = r9
            int r3 = r3.sourceStart
            r4 = r9
            int r4 = r4.sourceEnd
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r1 = r0
            r2 = 0
            r3 = r11
            r1[r2] = r3
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.Statement[] createLazyGetterBody(org.eclipse.jdt.internal.compiler.ast.ASTNode r11, lombok.eclipse.EclipseNode r12) {
            r10 = this;
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r13 = r0
            r0 = r11
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r11
            int r0 = r0.sourceEnd
            r15 = r0
            r0 = r14
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r15
            long r1 = (long) r1
            long r0 = r0 | r1
            r16 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L7a
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference
            if (r0 != 0) goto L7a
            java.util.Map<java.lang.String, char[][]> r0 = lombok.eclipse.handlers.HandleGetter.TYPE_MAP
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.type
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r3 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r3
            char[] r3 = r3.token
            r2.<init>(r3)
            java.lang.Object r0 = r0.get(r1)
            char[][] r0 = (char[][]) r0
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L7a
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r21
            r3 = r11
            r4 = 3
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r19 = r0
            r0 = 1
            r20 = r0
        L7a:
            r0 = r19
            if (r0 != 0) goto L89
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r19 = r0
        L89:
            r0 = r19
            r1 = r14
            r0.sourceStart = r1
            r0 = r19
            r1 = r19
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = 3
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r21 = r0
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleGetter.valueName
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4)
            r22 = r0
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r4 = r11
            r5 = 3
            long[] r4 = lombok.eclipse.Eclipse.poss(r4, r5)
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r14
            r0.sourceStart = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r23
            r1 = r14
            r0.sourceStart = r1
            r0 = r23
            r1 = r23
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r23
            r1 = 3
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 103(0x67, float:1.44E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 101(0x65, float:1.42E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 116(0x74, float:1.63E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r23
            r1 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r1, r2, r3)
            r0.receiver = r1
            r0 = r22
            r1 = r23
            r0.initialization = r1
            r0 = r21
            r1 = 0
            r2 = r22
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.valueName
            r5 = r16
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r23 = r0
            r0 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
            r24 = r0
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r25 = r0
            r0 = r25
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            r1 = r14
            r0.sourceStart = r1
            r0 = r26
            r1 = r26
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r26
            r1 = 3
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 103(0x67, float:1.44E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 101(0x65, float:1.42E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 116(0x74, float:1.63E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r26
            r1 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r1, r2, r3)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.valueName
            r5 = r16
            r3.<init>(r4, r5)
            r3 = r26
            r4 = r15
            r1.<init>(r2, r3, r4)
            r27 = r0
            r0 = r27
            r1 = r14
            r0.sourceStart = r1
            r0 = r27
            r1 = r27
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r2 = r27
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.valueName
            r5 = r16
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r26 = r0
            r0 = r26
            r1 = r14
            r0.sourceStart = r1
            r0 = r26
            r1 = r26
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r27 = r0
            r0 = r27
            r1 = 3
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleGetter.actualValueName
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r18
            r0.type = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r14
            r0.sourceStart = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r28
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.initialization
            r0.initialization = r1
            r0 = r28
            r1 = 16
            r0.modifiers = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 0
            r2 = r28
            r0[r1] = r2
            r0 = r20
            if (r0 == 0) goto L2cd
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.valueName
            r5 = r16
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            char[] r5 = lombok.eclipse.handlers.HandleGetter.actualValueName
            r6 = r16
            r4.<init>(r5, r6)
            r4 = r15
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r14
            r0.sourceStart = r1
            r0 = r28
            r1 = r28
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 1
            r2 = r28
            r0[r1] = r2
        L2cd:
            r0 = r20
            if (r0 != 0) goto L375
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.actualValueName
            r5 = r16
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r14
            r0.sourceStart = r1
            r0 = r28
            r1 = r28
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r0, r1, r2)
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r28
            r3 = r29
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleGetter.actualValueName
            r7 = r16
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            r30 = r0
            r0 = r30
            r1 = r14
            r0.sourceStart = r1
            r0 = r30
            r1 = r30
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.valueName
            r5 = r16
            r3.<init>(r4, r5)
            r3 = r30
            r4 = r15
            r1.<init>(r2, r3, r4)
            r31 = r0
            r0 = r31
            r1 = r14
            r0.sourceStart = r1
            r0 = r31
            r1 = r31
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 1
            r2 = r31
            r0[r1] = r2
        L375:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = r28
            r1 = r14
            r0.sourceStart = r1
            r0 = r28
            r1 = r28
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r28
            r1 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r1, r2, r3)
            r0.receiver = r1
            r0 = r28
            r1 = 3
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 115(0x73, float:1.61E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 101(0x65, float:1.42E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 116(0x74, float:1.63E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r28
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleGetter.valueName
            r7 = r16
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 2
            r2 = r28
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r26
            r3 = r27
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            r28 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = 1
            r2 = r28
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement r0 = new org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement
            r1 = r0
            r2 = r24
            r3 = r25
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            r26 = r0
            r0 = r23
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r26
            r2[r3] = r4
            r0.statements = r1
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r22
            r3 = r23
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            r27 = r0
            r0 = r21
            r1 = 1
            r2 = r27
            r0[r1] = r2
            r0 = r20
            if (r0 == 0) goto L451
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleGetter.valueName
            r3 = r16
            r1.<init>(r2, r3)
            r1 = r19
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.CastExpression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeCastExpression(r0, r1, r2)
            r22 = r0
            r0 = r21
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r2 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r3 = r2
            r4 = r22
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6)
            r0[r1] = r2
        L451:
            r0 = r20
            if (r0 != 0) goto L4e6
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            char[] r4 = lombok.eclipse.handlers.HandleGetter.valueName
            r5 = r16
            r3.<init>(r4, r5)
            r3 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r4 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r3, r4, r5)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r22 = r0
            r0 = r22
            r1 = r14
            r0.sourceStart = r1
            r0 = r22
            r1 = r22
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r22
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleGetter.valueName
            r7 = r16
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            r23 = r0
            r0 = r23
            r1 = r14
            r0.sourceStart = r1
            r0 = r23
            r1 = r23
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r23
            r1 = r0
            int r1 = r1.bits
            r2 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r23
            r1 = r19
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.CastExpression r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeCastExpression(r0, r1, r2)
            r24 = r0
            r0 = r21
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r2 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r3 = r2
            r4 = r24
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6)
            r0[r1] = r2
        L4e6:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r3 = r11
            r4 = 3
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r22 = r0
            r0 = 5
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r23 = r0
            r0 = r23
            r1 = 4
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r2]
            r3 = r2
            r4 = 0
            r5 = r22
            r3[r4] = r5
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.HandleGetter.f575AR
            r3 = r23
            r4 = 0
            r5 = r11
            r6 = 5
            long[] r5 = lombok.eclipse.Eclipse.poss(r5, r6)
            r1.<init>(r2, r3, r4, r5)
            r24 = r0
            r0 = r24
            r1 = -1
            r0.sourceStart = r1
            r0 = r24
            r1 = -2
            r0.sourceEnd = r1
            r0 = r13
            r1 = r24
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r25
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.initialization
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r25
            r1 = r25
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = r2.initialization
            int r2 = r2.sourceEnd
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r25
            r1 = r24
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1, r2)
            r0.type = r1
            r0 = r13
            r1 = r25
            r0.initialization = r1
            r0 = r21
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleGetter.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleGetter.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m72xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleGetter.f576xb87c1847
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.eclipse.handlers.HandleGetter.f576xb87c1847 = r1
            return r0
    }
}
