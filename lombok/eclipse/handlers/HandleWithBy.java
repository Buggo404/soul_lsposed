package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleWithBy.SCL.lombok */
public class HandleWithBy extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.WithBy> {
    private static final char[][] NAME_JUF_FUNCTION = null;
    private static final char[][] NAME_JUF_OP = null;
    private static final char[][] NAME_JUF_DOUBLEOP = null;
    private static final char[][] NAME_JUF_INTOP = null;
    private static final char[][] NAME_JUF_LONGOP = null;
    private static final char[] NAME_CHAR = null;
    private static final char[] NAME_SHORT = null;
    private static final char[] NAME_BYTE = null;
    private static final char[] NAME_INT = null;
    private static final char[] NAME_LONG = null;
    private static final char[] NAME_DOUBLE = null;
    private static final char[] NAME_FLOAT = null;
    private static final char[] NAME_BOOLEAN = null;
    private static final char[][] NAME_JAVA_LANG_BOOLEAN = null;
    private static final char[] NAME_APPLY = null;
    private static final char[] NAME_APPLY_AS_INT = null;
    private static final char[] NAME_APPLY_AS_LONG = null;
    private static final char[] NAME_APPLY_AS_DOUBLE = null;
    private static final char[] NAME_TRANSFORMER = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f582xb87c1847;

    static {
            java.lang.String r0 = "java.util.function.Function"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleWithBy.NAME_JUF_FUNCTION = r0
            java.lang.String r0 = "java.util.function.UnaryOperator"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleWithBy.NAME_JUF_OP = r0
            java.lang.String r0 = "java.util.function.DoubleUnaryOperator"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleWithBy.NAME_JUF_DOUBLEOP = r0
            java.lang.String r0 = "java.util.function.IntUnaryOperator"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleWithBy.NAME_JUF_INTOP = r0
            java.lang.String r0 = "java.util.function.LongUnaryOperator"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleWithBy.NAME_JUF_LONGOP = r0
            r0 = 4
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 99
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 104(0x68, float:1.46E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_CHAR = r0
            r0 = 5
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 104(0x68, float:1.46E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_SHORT = r0
            r0 = 4
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_BYTE = r0
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 105(0x69, float:1.47E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_INT = r0
            r0 = 4
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 103(0x67, float:1.44E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_LONG = r0
            r0 = 6
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 100
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 117(0x75, float:1.64E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_DOUBLE = r0
            r0 = 5
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_FLOAT = r0
            r0 = 7
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_BOOLEAN = r0
            java.lang.String r0 = "java.lang.Boolean"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.HandleWithBy.NAME_JAVA_LANG_BOOLEAN = r0
            r0 = 5
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_APPLY = r0
            r0 = 10
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 65
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 73
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_APPLY_AS_INT = r0
            r0 = 11
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 65
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 76
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 103(0x67, float:1.44E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_APPLY_AS_LONG = r0
            r0 = 13
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 65
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 68
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 117(0x75, float:1.64E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_APPLY_AS_DOUBLE = r0
            r0 = 11
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 109(0x6d, float:1.53E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleWithBy.NAME_TRANSFORMER = r0
            return
    }

    public HandleWithBy() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean generateWithByForType(lombok.eclipse.EclipseNode r6, lombok.eclipse.EclipseNode r7, lombok.AccessLevel r8, boolean r9) {
            r5 = this;
            r0 = r9
            if (r0 == 0) goto L10
            java.lang.Class<lombok.experimental.WithBy> r0 = lombok.experimental.WithBy.class
            r1 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            r10 = r0
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L26
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r10 = r0
        L26:
            r0 = r10
            if (r0 != 0) goto L2f
            r0 = 0
            goto L34
        L2f:
            r0 = r10
            int r0 = r0.modifiers
        L34:
            r11 = r0
            r0 = r11
            r1 = 25088(0x6200, float:3.5156E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L50
            r0 = r12
            if (r0 == 0) goto L58
        L50:
            r0 = r7
            java.lang.String r1 = "@WithBy is only supported on a class or a field."
            r0.addError(r1)
            r0 = 0
            return r0
        L58:
            r0 = r6
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Lb1
        L64:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L7e
            goto Lb1
        L7e:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r15 = r0
            r0 = r15
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            if (r0 != 0) goto L93
            goto Lb1
        L93:
            r0 = r15
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto La9
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto La9
            goto Lb1
        La9:
            r0 = r5
            r1 = r13
            r2 = r7
            r3 = r8
            r0.generateWithByForField(r1, r2, r3)
        Lb1:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L64
            r0 = 1
            return r0
    }

    public void generateWithByForField(lombok.eclipse.EclipseNode r8, lombok.eclipse.EclipseNode r9, lombok.AccessLevel r10) {
            r7 = this;
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L2e
        Lc:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r11 = r0
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L2e
            java.lang.Class<lombok.experimental.WithBy> r0 = lombok.experimental.WithBy.class
            r1 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L2e
            return
        L2e:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            java.util.List r0 = java.util.Collections.emptyList()
            r11 = r0
            r0 = r7
            r1 = r10
            r2 = r8
            r3 = r9
            r4 = 0
            r5 = r11
            r0.createWithByForField(r1, r2, r3, r4, r5)
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.WithBy> r8, org.eclipse.jdt.internal.compiler.ast.Annotation r9, lombok.eclipse.EclipseNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.WITHBY_FLAG_USAGE
            java.lang.String r2 = "@WithBy"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r11 = r0
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.WithBy r0 = (lombok.experimental.WithBy) r0
            lombok.AccessLevel r0 = r0.value()
            r12 = r0
            r0 = r12
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 == r1) goto L2d
            r0 = r11
            if (r0 != 0) goto L2e
        L2d:
            return
        L2e:
            r0 = r9
            java.lang.String r1 = "onMethod"
            java.lang.String r2 = "@WithBy(onMethod"
            r3 = r10
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
            r13 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r11
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L6d;
                case 3: goto L5c;
                default: goto L89;
            }
        L5c:
            r0 = r7
            r1 = r12
            r2 = r10
            java.util.Collection r2 = r2.upFromAnnotationToFields()
            r3 = r10
            r4 = 1
            r5 = r13
            r0.createWithByForFields(r1, r2, r3, r4, r5)
            goto L89
        L6d:
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7e
            r0 = r10
            java.lang.String r1 = "'onMethod' is not supported for @WithBy on a type."
            r0.addError(r1)
        L7e:
            r0 = r7
            r1 = r11
            r2 = r10
            r3 = r12
            r4 = 0
            boolean r0 = r0.generateWithByForType(r1, r2, r3, r4)
        L89:
            return
    }

    public void createWithByForFields(lombok.AccessLevel r8, java.util.Collection<lombok.eclipse.EclipseNode> r9, lombok.eclipse.EclipseNode r10, boolean r11, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r12) {
            r7 = this;
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L23
        Lb:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r13
            r3 = r10
            r4 = r11
            r5 = r12
            r0.createWithByForField(r1, r2, r3, r4, r5)
        L23:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
    }

    public void createWithByForField(lombok.AccessLevel r10, lombok.eclipse.EclipseNode r11, lombok.eclipse.EclipseNode r12, boolean r13, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r14) {
            r9 = this;
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r15 = r0
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L1a
            r0 = r12
            java.lang.String r1 = "@WithBy is only supported on a class or a field."
            r0.addError(r1)
            return
        L1a:
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L49
            r0 = r16
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L49
            r0 = r16
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            r17 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r18 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r19 = r0
            r0 = r19
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isBoolean(r0)
            r20 = r0
            r0 = r11
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r21 = r0
            r0 = r11
            r1 = r20
            r2 = r21
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toWithByName(r0, r1, r2)
            r22 = r0
            r0 = r22
            if (r0 != 0) goto L85
            r0 = r11
            java.lang.String r1 = "Not generating a withXBy method for this field: It does not fit your @Accessors prefix list."
            r0.addWarning(r1)
            return
        L85:
            r0 = r18
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lad
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r22
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for static fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        Lad:
            r0 = r18
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Ldd
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto Ldd
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r22
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for final, initialized fields."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        Ldd:
            r0 = r18
            char[] r0 = r0.name
            if (r0 == 0) goto L117
            r0 = r18
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 <= 0) goto L117
            r0 = r18
            char[] r0 = r0.name
            r1 = 0
            char r0 = r0[r1]
            r1 = 36
            if (r0 != r1) goto L117
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Not generating "
            r2.<init>(r3)
            r2 = r22
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for this field: With methods cannot be generated for fields starting with $."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        L117:
            r0 = r11
            r1 = r20
            r2 = r21
            java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toAllWithByNames(r0, r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L19f
        L129:
            r0 = r24
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            int[] r0 = m78xb87c1847()
            r1 = r23
            r2 = r11
            r3 = 0
            r4 = 1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3, r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19f;
                case 2: goto L160;
                case 3: goto L161;
                default: goto L19f;
            }
        L160:
            return
        L161:
            r0 = r13
            if (r0 == 0) goto L19e
            java.lang.String r0 = ""
            r25 = r0
            r0 = r23
            r1 = r22
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L186
            java.lang.String r0 = " (%s)"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r25 = r0
        L186:
            r0 = r11
            java.lang.String r1 = "Not generating %s(): A method with that name already exists%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r22
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r25
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addWarning(r1)
        L19e:
            return
        L19f:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L129
            r0 = r10
            int r0 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r0)
            r23 = r0
            r0 = r9
            r1 = r11
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r2 = r11
            r3 = r22
            r4 = r23
            r5 = r12
            r6 = r14
            r7 = r17
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createWithBy(r1, r2, r3, r4, r5, r6, r7)
            r24 = r0
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r24
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createWithBy(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r9, lombok.eclipse.EclipseNode r10, java.lang.String r11, int r12, lombok.eclipse.EclipseNode r13, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r14, boolean r15) {
            r8 = this;
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r16 = r0
            r0 = r11
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r10
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r17 = r0
            r0 = r16
            int r0 = r0.sourceStart
            r18 = r0
            r0 = r16
            int r0 = r0.sourceEnd
            r19 = r0
            r0 = r18
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r19
            long r1 = (long) r1
            long r0 = r0 | r1
            r20 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r9
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r22 = r0
            r0 = r10
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r0)
            r23 = r0
            r0 = r15
            if (r0 == 0) goto L53
            r0 = r12
            r1 = 16778240(0x1000400, float:2.3512757E-38)
            r0 = r0 | r1
            r12 = r0
        L53:
            r0 = r10
            r1 = r23
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.shouldMakeFinal(r0, r1)
            if (r0 == 0) goto L63
            r0 = r12
            r1 = 16
            r0 = r0 | r1
            r12 = r0
        L63:
            r0 = r22
            r1 = r12
            r0.modifiers = r1
            r0 = r22
            r1 = r10
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.returnType = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            if (r0 != 0) goto L7f
            r0 = 0
            return r0
        L7f:
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isFieldDeprecated(r0)
            if (r0 == 0) goto L9a
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateDeprecatedAnnotation(r3)
            r1[r2] = r3
            r24 = r0
        L9a:
            r0 = r10
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto Lb5
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r16
            java.lang.String r4 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r3, r4)
            r1[r2] = r3
            r25 = r0
        Lb5:
            r0 = 0
            r26 = r0
            r0 = -1
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = 1
            r29 = r0
            char[] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_APPLY
            r30 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L192
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r31 = r0
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_CHAR
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Lf4
            r0 = 2
            r27 = r0
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_INTOP
            r26 = r0
            goto L192
        Lf4:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_SHORT
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L10a
            r0 = 4
            r27 = r0
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_INTOP
            r26 = r0
            goto L192
        L10a:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_BYTE
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L120
            r0 = 3
            r27 = r0
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_INTOP
            r26 = r0
            goto L192
        L120:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_INT
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L133
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_INTOP
            r26 = r0
            goto L192
        L133:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_LONG
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L146
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_LONGOP
            r26 = r0
            goto L192
        L146:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_FLOAT
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L15d
            r0 = 9
            r27 = r0
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_DOUBLEOP
            r26 = r0
            goto L192
        L15d:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_DOUBLE
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L170
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_DOUBLEOP
            r26 = r0
            goto L192
        L170:
            r0 = r31
            char[] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_BOOLEAN
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L192
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_OP
            r26 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.HandleWithBy.NAME_JAVA_LANG_BOOLEAN
            r3 = 3
            long[] r3 = new long[r3]
            r1.<init>(r2, r3)
            r28 = r0
            r0 = 0
            r29 = r0
        L192:
            r0 = r26
            char[][] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_INTOP
            if (r0 != r1) goto L19f
            char[] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_APPLY_AS_INT
            r30 = r0
        L19f:
            r0 = r26
            char[][] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_LONGOP
            if (r0 != r1) goto L1ac
            char[] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_APPLY_AS_LONG
            r30 = r0
        L1ac:
            r0 = r26
            char[][] r1 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_DOUBLEOP
            if (r0 != r1) goto L1b9
            char[] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_APPLY_AS_DOUBLE
            r30 = r0
        L1b9:
            r0 = r26
            if (r0 != 0) goto L1cf
            char[][] r0 = lombok.eclipse.handlers.HandleWithBy.NAME_JUF_FUNCTION
            r26 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r28 = r0
        L1cf:
            r0 = r22
            r1 = r16
            r2 = 3
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r25
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r24
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = 0
            r31 = r0
            r0 = r28
            if (r0 == 0) goto L264
            r0 = r29
            if (r0 == 0) goto L264
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r1 = r0
            r2 = 2
            r1.<init>(r2)
            r32 = r0
            r0 = r32
            r1 = r28
            r0.bound = r1
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r33 = r0
            r0 = r33
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1, r2)
            r0.bound = r1
            r0 = r26
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r34 = r0
            r0 = r34
            r1 = r26
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r2]
            r3 = r2
            r4 = 0
            r5 = r32
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r33
            r3[r4] = r5
            r0[r1] = r2
            r0 = r26
            int r0 = r0.length
            long[] r0 = new long[r0]
            r35 = r0
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r26
            r3 = r34
            r4 = 0
            r5 = r35
            r1.<init>(r2, r3, r4, r5)
            r31 = r0
        L264:
            r0 = r28
            if (r0 == 0) goto L29e
            r0 = r29
            if (r0 != 0) goto L29e
            r0 = r26
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r32 = r0
            r0 = r32
            r1 = r26
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r2]
            r3 = r2
            r4 = 0
            r5 = r28
            r3[r4] = r5
            r0[r1] = r2
            r0 = r26
            int r0 = r0.length
            long[] r0 = new long[r0]
            r33 = r0
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r26
            r3 = r32
            r4 = 0
            r5 = r33
            r1.<init>(r2, r3, r4, r5)
            r31 = r0
        L29e:
            r0 = r28
            if (r0 != 0) goto L2b7
            r0 = r26
            int r0 = r0.length
            long[] r0 = new long[r0]
            r32 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r26
            r3 = r32
            r1.<init>(r2, r3)
            r31 = r0
        L2b7:
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleWithBy.NAME_TRANSFORMER
            r3 = r20
            r4 = r31
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r32 = r0
            r0 = r32
            r1 = r18
            r0.sourceStart = r1
            r0 = r32
            r1 = r19
            r0.sourceEnd = r1
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            r4 = r32
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r1 = r11
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r22
            r1 = 0
            r0.binding = r1
            r0 = r22
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r22
            r1 = 0
            r0.typeParameters = r1
            r0 = r22
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r15
            if (r0 != 0) goto L4cf
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r35 = r0
            goto L41c
        L32d:
            r0 = r35
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r34 = r0
            r0 = r34
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L347
            goto L41c
        L347:
            r0 = r34
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r36 = r0
            r0 = r36
            char[] r0 = r0.name
            if (r0 == 0) goto L371
            r0 = r36
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 <= 0) goto L371
            r0 = r36
            char[] r0 = r0.name
            r1 = 0
            char r0 = r0[r1]
            r1 = 36
            if (r0 != r1) goto L371
            goto L41c
        L371:
            r0 = r36
            int r0 = r0.modifiers
            long r0 = (long) r0
            r37 = r0
            r0 = r37
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L387
            goto L41c
        L387:
            r0 = r37
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L39d
            r0 = r36
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L39d
            goto L41c
        L39d:
            r0 = r34
            java.lang.Object r0 = r0.get()
            r1 = r10
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L40a
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r39 = r0
            r0 = r39
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.HandleWithBy.NAME_TRANSFORMER
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r39
            r1 = r30
            r0.selector = r1
            r0 = r39
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r34
            lombok.core.handlers.HandlerUtil$FieldAccess r5 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r6 = r16
            org.eclipse.jdt.internal.compiler.ast.Expression r4 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r4, r5, r6)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r27
            r1 = -1
            if (r0 == r1) goto L3fd
            r0 = r33
            r1 = r39
            r2 = r27
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r2, r3)
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.CastExpression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeCastExpression(r1, r2, r3)
            boolean r0 = r0.add(r1)
            goto L41c
        L3fd:
            r0 = r33
            r1 = r39
            boolean r0 = r0.add(r1)
            goto L41c
        L40a:
            r0 = r33
            r1 = r34
            lombok.core.handlers.HandlerUtil$FieldAccess r2 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r3 = r16
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createFieldAccessor(r1, r2, r3)
            boolean r0 = r0.add(r1)
        L41c:
            r0 = r35
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L32d
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r34 = r0
            r0 = r34
            r1 = r33
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
            r0.arguments = r1
            r0 = r34
            r1 = r10
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r34
            r3 = r18
            r4 = r19
            r1.<init>(r2, r3, r4)
            r35 = r0
            r0 = r22
            r1 = r22
            r2 = r22
            r3 = r16
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r22
            r1 = r22
            r2 = r22
            r3 = r16
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 5
            r1.<init>(r2)
            r36 = r0
            r0 = r10
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L4b2
            r0 = r17
            r1 = r13
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2)
            r37 = r0
            r0 = r37
            if (r0 == 0) goto L4b2
            r0 = r36
            r1 = r37
            boolean r0 = r0.add(r1)
        L4b2:
            r0 = r36
            r1 = r35
            boolean r0 = r0.add(r1)
            r0 = r22
            r1 = r36
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
        L4cf:
            r0 = r13
            r1 = r32
            r2 = r22
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1, r2)
            r0 = r10
            r1 = r22
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r22
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r16
            r2.<init>(r3)
            r2 = r9
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r10
            r1 = r22
            lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r2 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.WITH_BY
            lombok.eclipse.handlers.EclipseHandlerUtil.copyJavadoc(r0, r1, r2)
            r0 = r22
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleWithBy.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleWithBy.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m78xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleWithBy.f582xb87c1847
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
            lombok.eclipse.handlers.HandleWithBy.f582xb87c1847 = r1
            return r0
    }
}
