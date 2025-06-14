package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseHandlerUtil.SCL.lombok */
public class EclipseHandlerUtil {
    private static final org.eclipse.jdt.internal.compiler.ast.Annotation[] EMPTY_ANNOTATIONS_ARRAY = null;
    private static final int MODIFIERS_INDICATING_STATIC = 16904;
    private static final char[] OBJECT_SIG = null;
    static final char[] ALL = null;
    static final char[] UNCHECKED = null;
    private static final char[] JUSTIFICATION = null;
    private static final char[] GENERATED_CODE = null;
    private static final char[] LOMBOK = null;
    private static final char[][] JAVAX_ANNOTATION_GENERATED = null;
    private static final char[][] LOMBOK_GENERATED = null;
    private static final char[][] EDU_UMD_CS_FINDBUGS_ANNOTATIONS_SUPPRESSFBWARNINGS = null;
    private static final java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.CastExpression> castExpressionConstructor = null;
    private static final boolean castExpressionConstructorIsTypeRefBased = false;
    private static final java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.IntLiteral> intLiteralConstructor = null;
    private static final java.lang.reflect.Method intLiteralFactoryMethod = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$AccessLevel;



    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseHandlerUtil$CopyJavadoc.SCL.lombok */
    public enum CopyJavadoc extends java.lang.Enum<lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc> {
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc VERBATIM = null;
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc GETTER = null;
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc SETTER = null;
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc WITH = null;
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc WITH_BY = null;
        private static final /* synthetic */ lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc[] ENUM$VALUES = null;






        static {
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$1 r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$1
                r1 = r0
                java.lang.String r2 = "VERBATIM"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.VERBATIM = r0
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$2 r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$2
                r1 = r0
                java.lang.String r2 = "GETTER"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.GETTER = r0
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$3 r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$3
                r1 = r0
                java.lang.String r2 = "SETTER"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.SETTER = r0
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$4 r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$4
                r1 = r0
                java.lang.String r2 = "WITH"
                r3 = 3
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.WITH = r0
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$5 r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc$5
                r1 = r0
                java.lang.String r2 = "WITH_BY"
                r3 = 4
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.WITH_BY = r0
                r0 = 5
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc[] r0 = new lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc[r0]
                r1 = r0
                r2 = 0
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r3 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.VERBATIM
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r3 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.GETTER
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r3 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.SETTER
                r1[r2] = r3
                r1 = r0
                r2 = 3
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r3 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.WITH
                r1[r2] = r3
                r1 = r0
                r2 = 4
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r3 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.WITH_BY
                r1[r2] = r3
                lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.ENUM$VALUES = r0
                return
        }

        CopyJavadoc(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public abstract java.lang.String apply(lombok.eclipse.EclipseNode r1);

        private static java.lang.String applySetter(lombok.eclipse.EclipseNode r3, java.lang.String r4) {
                r0 = r3
                java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getDocComment(r0)
                r5 = r0
                r0 = r5
                r1 = r4
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.getJavadocSection(r0, r1)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L26
                r0 = r5
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.stripSectionsFromJavadoc(r0)
                lombok.core.handlers.HandlerUtil$JavadocTag r1 = lombok.core.handlers.HandlerUtil.JavadocTag.RETURN
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.stripLinesWithTagFromJavadoc(r0, r1)
                r6 = r0
            L26:
                r0 = r3
                r1 = r3
                lombok.core.AnnotationValues r1 = lombok.eclipse.handlers.EclipseHandlerUtil.getAccessorsForField(r1)
                boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.shouldReturnThis(r0, r1)
                if (r0 == 0) goto L38
                r0 = r6
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.addReturnsThisIfNeeded(r0)
                goto L39
            L38:
                r0 = r6
            L39:
                return r0
        }

        public static lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc[] values() {
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc[] r2 = new lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc valueOf(java.lang.String r3) {
                java.lang.Class<lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r0 = (lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc) r0
                return r0
        }

        /* synthetic */ CopyJavadoc(java.lang.String r5, int r6, lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ java.lang.String access$3(lombok.eclipse.EclipseNode r3, java.lang.String r4) {
                r0 = r3
                r1 = r4
                java.lang.String r0 = applySetter(r0, r1)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseHandlerUtil$EclipseReflectiveMembers.SCL.lombok */
    static class EclipseReflectiveMembers {
        public static final java.lang.reflect.Field STRING_LITERAL__LINE_NUMBER = null;
        public static final java.lang.reflect.Field ANNOTATION__MEMBER_VALUE_PAIR_NAME = null;
        public static final java.lang.reflect.Field TYPE_REFERENCE__ANNOTATIONS = null;
        public static final java.lang.Class<?> INTERSECTION_BINDING1 = null;
        public static final java.lang.Class<?> INTERSECTION_BINDING2 = null;
        public static final java.lang.reflect.Field INTERSECTION_BINDING_TYPES1 = null;
        public static final java.lang.reflect.Field INTERSECTION_BINDING_TYPES2 = null;
        public static final java.lang.reflect.Field TYPE_DECLARATION_RECORD_COMPONENTS = null;
        public static final java.lang.Class<?> COMPILATION_UNIT = null;
        public static final java.lang.reflect.Method COMPILATION_UNIT_ORIGINAL_FROM_CLONE = null;

        static {
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.StringLiteral> r0 = org.eclipse.jdt.internal.compiler.ast.StringLiteral.class
                java.lang.String r1 = "lineNumber"
                java.lang.reflect.Field r0 = getField(r0, r1)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.STRING_LITERAL__LINE_NUMBER = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Annotation> r0 = org.eclipse.jdt.internal.compiler.ast.Annotation.class
                java.lang.String r1 = "memberValuePairName"
                java.lang.reflect.Field r0 = getField(r0, r1)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.ANNOTATION__MEMBER_VALUE_PAIR_NAME = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TypeReference> r0 = org.eclipse.jdt.internal.compiler.ast.TypeReference.class
                java.lang.String r1 = "annotations"
                java.lang.reflect.Field r0 = getField(r0, r1)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_REFERENCE__ANNOTATIONS = r0
                java.lang.String r0 = "org.eclipse.jdt.internal.compiler.lookup.IntersectionTypeBinding18"
                java.lang.Class r0 = getClass(r0)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING1 = r0
                java.lang.String r0 = "org.eclipse.jdt.internal.compiler.lookup.IntersectionCastTypeBinding"
                java.lang.Class r0 = getClass(r0)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING2 = r0
                java.lang.Class<?> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING1
                if (r0 != 0) goto L38
                r0 = 0
                goto L40
            L38:
                java.lang.Class<?> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING1
                java.lang.String r1 = "intersectingTypes"
                java.lang.reflect.Field r0 = getField(r0, r1)
            L40:
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING_TYPES1 = r0
                java.lang.Class<?> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING2
                if (r0 != 0) goto L4d
                r0 = 0
                goto L55
            L4d:
                java.lang.Class<?> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING2
                java.lang.String r1 = "intersectingTypes"
                java.lang.reflect.Field r0 = getField(r0, r1)
            L55:
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING_TYPES2 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TypeDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.TypeDeclaration.class
                java.lang.String r1 = "recordComponents"
                java.lang.reflect.Field r0 = getField(r0, r1)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_DECLARATION_RECORD_COMPONENTS = r0
                java.lang.String r0 = "org.eclipse.jdt.internal.core.CompilationUnit"
                java.lang.Class r0 = getClass(r0)
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.COMPILATION_UNIT = r0
                java.lang.Class<?> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.COMPILATION_UNIT
                if (r0 != 0) goto L74
                r0 = 0
                goto L80
            L74:
                java.lang.Class<?> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.COMPILATION_UNIT
                java.lang.String r1 = "originalFromClone"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
            L80:
                lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.COMPILATION_UNIT_ORIGINAL_FROM_CLONE = r0
                return
        }

        EclipseReflectiveMembers() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static int reflectInt(java.lang.reflect.Field r4, java.lang.Object r5) {
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> Lc
                java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.IllegalAccessException -> Lc
                int r0 = r0.intValue()     // Catch: java.lang.IllegalAccessException -> Lc
                return r0
            Lc:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                throw r0
        }

        public static void reflectSet(java.lang.reflect.Field r4, java.lang.Object r5, java.lang.Object r6) {
                r0 = r4
                r1 = r5
                r2 = r6
                r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L9
                goto L13
            L9:
                r7 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                throw r0
            L13:
                return
        }

        public static java.lang.Object reflect(java.lang.reflect.Field r4, java.lang.Object r5) {
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L6
                return r0
            L6:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                throw r0
        }

        private static java.lang.Class<?> getClass(java.lang.String r2) {
                r0 = r2
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0 = 0
                return r0
        }

        private static java.lang.reflect.Field getField(java.lang.Class<?> r3, java.lang.String r4) {
                r0 = r3
                r1 = r4
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L6
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseHandlerUtil$GetterMethod.SCL.lombok */
    private static class GetterMethod {
        private final char[] name;
        private final org.eclipse.jdt.internal.compiler.ast.TypeReference type;

        GetterMethod(char[] r4, org.eclipse.jdt.internal.compiler.ast.TypeReference r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.type = r1
                return
        }

        static /* synthetic */ org.eclipse.jdt.internal.compiler.ast.TypeReference access$0(lombok.eclipse.handlers.EclipseHandlerUtil.GetterMethod r2) {
                r0 = r2
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
                return r0
        }

        static /* synthetic */ char[] access$1(lombok.eclipse.handlers.EclipseHandlerUtil.GetterMethod r2) {
                r0 = r2
                char[] r0 = r0.name
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseHandlerUtil$MemberExistsResult.SCL.lombok */
    public enum MemberExistsResult extends java.lang.Enum<lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult> {
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult NOT_EXISTS = null;
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult EXISTS_BY_LOMBOK = null;
        public static final lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult EXISTS_BY_USER = null;
        private static final /* synthetic */ lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult[] ENUM$VALUES = null;

        static {
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult
                r1 = r0
                java.lang.String r2 = "NOT_EXISTS"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS = r0
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult
                r1 = r0
                java.lang.String r2 = "EXISTS_BY_LOMBOK"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK = r0
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult
                r1 = r0
                java.lang.String r2 = "EXISTS_BY_USER"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER = r0
                r0 = 3
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r0 = new lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult[r0]
                r1 = r0
                r2 = 0
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r3 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r3 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r3 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER
                r1[r2] = r3
                lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.ENUM$VALUES = r0
                return
        }

        MemberExistsResult(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult[] values() {
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r2 = new lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult valueOf(java.lang.String r3) {
                java.lang.Class<lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = (lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult) r0
                return r0
        }
    }

    static {
            r0 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            lombok.eclipse.handlers.EclipseHandlerUtil.EMPTY_ANNOTATIONS_ARRAY = r0
            java.lang.String r0 = "Ljava/lang/Object;"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.EclipseHandlerUtil.OBJECT_SIG = r0
            java.lang.String r0 = "all"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.EclipseHandlerUtil.ALL = r0
            java.lang.String r0 = "unchecked"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.EclipseHandlerUtil.UNCHECKED = r0
            java.lang.String r0 = "justification"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.EclipseHandlerUtil.JUSTIFICATION = r0
            java.lang.String r0 = "generated code"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.EclipseHandlerUtil.GENERATED_CODE = r0
            java.lang.String r0 = "lombok"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.EclipseHandlerUtil.LOMBOK = r0
            java.lang.String r0 = "javax.annotation.Generated"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.EclipseHandlerUtil.JAVAX_ANNOTATION_GENERATED = r0
            java.lang.String r0 = "lombok.Generated"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.EclipseHandlerUtil.LOMBOK_GENERATED = r0
            java.lang.String r0 = "edu.umd.cs.findbugs.annotations.SuppressFBWarnings"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            lombok.eclipse.handlers.EclipseHandlerUtil.EDU_UMD_CS_FINDBUGS_ANNOTATIONS_SUPPRESSFBWARNINGS = r0
            r0 = 0
            r5 = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.CastExpression> r0 = org.eclipse.jdt.internal.compiler.ast.CastExpression.class
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L76
        L60:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = 2
            if (r0 == r1) goto L71
            goto L73
        L71:
            r0 = r6
            r5 = r0
        L73:
            int r7 = r7 + 1
        L76:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L60
            r0 = r5
            r6 = r0
            r0 = r6
            lombok.eclipse.handlers.EclipseHandlerUtil.castExpressionConstructor = r0
            java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.CastExpression> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.castExpressionConstructor
            java.lang.Class[] r0 = r0.getParameterTypes()
            r1 = 1
            r0 = r0[r1]
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TypeReference> r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.class
            if (r0 != r1) goto L92
            r0 = 1
            goto L93
        L92:
            r0 = 0
        L93:
            lombok.eclipse.handlers.EclipseHandlerUtil.castExpressionConstructorIsTypeRefBased = r0
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            java.lang.Class<char[]> r3 = char[].class
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r2] = r3
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.IntLiteral> r0 = org.eclipse.jdt.internal.compiler.ast.IntLiteral.class
            r1 = r5
            java.lang.reflect.Constructor r0 = lombok.permit.Permit.getConstructor(r0, r1)     // Catch: java.lang.Throwable -> Lba
            r6 = r0
            goto Lbb
        Lba:
        Lbb:
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.IntLiteral> r0 = org.eclipse.jdt.internal.compiler.ast.IntLiteral.class
            java.lang.String r1 = "buildIntLiteral"
            r2 = r5
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc7
            r7 = r0
            goto Lc8
        Lc7:
        Lc8:
            r0 = r6
            lombok.eclipse.handlers.EclipseHandlerUtil.intLiteralConstructor = r0
            r0 = r7
            lombok.eclipse.handlers.EclipseHandlerUtil.intLiteralFactoryMethod = r0
            return
    }

    private EclipseHandlerUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void error(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r7, java.lang.String r8, java.lang.Throwable r9) {
            r0 = r8
            r1 = r9
            lombok.core.debug.ProblemReporter.error(r0, r1)
            r0 = r7
            if (r0 == 0) goto L2a
            r0 = r7
            char[] r0 = r0.getFileName()
            r1 = r7
            org.eclipse.jdt.internal.compiler.CompilationResult r1 = r1.compilationResult
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r8
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = " - See error log."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5 = 0
            lombok.eclipse.EclipseAST.addProblemToCompilationResult(r0, r1, r2, r3, r4, r5)
        L2a:
            return
    }

    public static void warning(java.lang.String r3, java.lang.Throwable r4) {
            r0 = r3
            r1 = r4
            lombok.core.debug.ProblemReporter.warning(r0, r1)
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.ASTNode getGeneratedBy(org.eclipse.jdt.internal.compiler.ast.ASTNode r3) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            return r0
    }

    public static boolean isGenerated(org.eclipse.jdt.internal.compiler.ast.ASTNode r2) {
            r0 = r2
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = getGeneratedBy(r0)
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static <T extends org.eclipse.jdt.internal.compiler.ast.ASTNode> T setGeneratedBy(T r4, org.eclipse.jdt.internal.compiler.ast.ASTNode r5) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
            r1 = r4
            r2 = r5
            r0.set(r1, r2)
            r0 = r4
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation generateDeprecatedAnnotation(org.eclipse.jdt.internal.compiler.ast.ASTNode r10) {
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = 3
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 4
            char[] r5 = new char[r5]
            r6 = r5
            r7 = 0
            r8 = 106(0x6a, float:1.49E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 1
            r8 = 97
            r6[r7] = r8
            r6 = r5
            r7 = 2
            r8 = 118(0x76, float:1.65E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 3
            r8 = 97
            r6[r7] = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 4
            char[] r5 = new char[r5]
            r6 = r5
            r7 = 0
            r8 = 108(0x6c, float:1.51E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 1
            r8 = 97
            r6[r7] = r8
            r6 = r5
            r7 = 2
            r8 = 110(0x6e, float:1.54E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 3
            r8 = 103(0x67, float:1.44E-43)
            r6[r7] = r8
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 10
            char[] r5 = new char[r5]
            r6 = r5
            r7 = 0
            r8 = 68
            r6[r7] = r8
            r6 = r5
            r7 = 1
            r8 = 101(0x65, float:1.42E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 2
            r8 = 112(0x70, float:1.57E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 3
            r8 = 114(0x72, float:1.6E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 4
            r8 = 101(0x65, float:1.42E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 5
            r8 = 99
            r6[r7] = r8
            r6 = r5
            r7 = 6
            r8 = 97
            r6[r7] = r8
            r6 = r5
            r7 = 7
            r8 = 116(0x74, float:1.63E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 8
            r8 = 101(0x65, float:1.42E-43)
            r6[r7] = r8
            r6 = r5
            r7 = 9
            r8 = 100
            r6[r7] = r8
            r3[r4] = r5
            r3 = r10
            r4 = 3
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            r2 = r11
            r3 = r10
            int r3 = r3.sourceStart
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            r1 = 1
            r0.sourceStart = r1
            r0 = r12
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r12
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation generateNamedAnnotation(org.eclipse.jdt.internal.compiler.ast.ASTNode r6, java.lang.String r7) {
            r0 = r7
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            r8 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r8
            r3 = r6
            r4 = r8
            int r4 = r4.length
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r9
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            r2 = r9
            r3 = r6
            int r3 = r3.sourceStart
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r10
            r1 = 1
            r0.sourceStart = r1
            r0 = r10
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r10
            return r0
    }

    public static boolean isFieldDeprecated(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r5 = r0
            r0 = r5
            int r0 = r0.modifiers
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L21
            r0 = 1
            return r0
        L21:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L2a
            r0 = 0
            return r0
        L2a:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L51
        L39:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            r1 = r4
            r2 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L4e
            r0 = 1
            return r0
        L4e:
            int r7 = r7 + 1
        L51:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L39
            r0 = 0
            return r0
    }

    public static lombok.core.configuration.CheckerFrameworkVersion getCheckerFrameworkVersion(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CheckerFrameworkVersion> r1 = lombok.ConfigurationKeys.CHECKER_FRAMEWORK
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.CheckerFrameworkVersion r0 = (lombok.core.configuration.CheckerFrameworkVersion) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L16
            r0 = r4
            goto L19
        L16:
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.core.configuration.CheckerFrameworkVersion.NONE
        L19:
            return r0
    }

    public static boolean typeMatches(java.lang.Class<?> r4, lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = r5
            r2 = r6
            boolean r0 = typeMatches(r0, r1, r2)
            return r0
    }

    public static boolean typeMatches(java.lang.String r5, lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.TypeReference r7) {
            r0 = r7
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r7
            char[][] r0 = r0.getTypeName()
        Lc:
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L16
            r0 = r8
            int r0 = r0.length
            if (r0 != 0) goto L18
        L16:
            r0 = 0
            return r0
        L18:
            r0 = r8
            r1 = r8
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r1 = r5
            r2 = 36
            int r1 = r1.lastIndexOf(r2)
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r9
            int r0 = r0.length
            r1 = r5
            int r1 = r1.length()
            r2 = r10
            int r1 = r1 - r2
            if (r0 == r1) goto L42
            r0 = 0
            return r0
        L42:
            r0 = 0
            r11 = r0
            goto L5e
        L48:
            r0 = r9
            r1 = r11
            char r0 = r0[r1]
            r1 = r5
            r2 = r11
            r3 = r10
            int r2 = r2 + r3
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L5b
            r0 = 0
            return r0
        L5b:
            int r11 = r11 + 1
        L5e:
            r0 = r11
            r1 = r9
            int r1 = r1.length
            if (r0 < r1) goto L48
            r0 = r8
            java.lang.String r0 = lombok.eclipse.Eclipse.toQualifiedName(r0)
            r11 = r0
            r0 = r6
            lombok.core.TypeResolver r0 = r0.getImportListAsTypeResolver()
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r5
            r3 = r11
            boolean r0 = r0.typeMatches(r1, r2, r3)
            return r0
    }

    public static void sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(lombok.eclipse.EclipseNode r5, lombok.eclipse.EclipseNode r6) {
            r0 = 0
            r7 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L82
        Le:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r8 = r0
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L26
            goto L82
        L26:
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.INVALID_ON_BUILDERS
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L78
        L33:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r10
            r1 = r8
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L78
            r0 = r7
            if (r0 != 0) goto L54
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
        L54:
            r0 = r10
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r12 = r0
            r0 = r7
            r1 = r12
            r2 = -1
            if (r1 != r2) goto L69
            r1 = r10
            goto L72
        L69:
            r1 = r10
            r2 = r12
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)
        L72:
            boolean r0 = r0.add(r1)
        L78:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L33
        L82:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = r7
            if (r0 != 0) goto L94
            r0 = 0
            goto L9a
        L94:
            r0 = r7
            int r0 = r0.size()
        L9a:
            r8 = r0
            r0 = r8
            if (r0 != 0) goto La0
            return
        La0:
            r0 = r8
            r1 = 1
            if (r0 != r1) goto Lca
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "@"
            r2.<init>(r3)
            r2 = r7
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not allowed on builder classes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto Lfe
        Lde:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r9
            java.lang.String r1 = "@"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        Lfe:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lde
            r0 = r9
            r1 = r9
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            r0.setLength(r1)
            r0 = r6
            r1 = r9
            java.lang.String r2 = " are not allowed on builder classes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation copyAnnotation(org.eclipse.jdt.internal.compiler.ast.Annotation r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11) {
            r0 = r11
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r11
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            if (r0 == 0) goto L45
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r3 = r12
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r14
            r2 = r14
            r3 = r13
            r4 = r3; r3 = r2; r2 = r4; 
            r3.statementEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.declarationSourceEnd = r1
            r0 = r14
            r1 = r10
            copyMemberValuePairName(r0, r1)
            r0 = r14
            return r0
        L45:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            if (r0 == 0) goto L8f
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            r1 = r0
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r3 = r12
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r14
            r2 = r14
            r3 = r13
            r4 = r3; r3 = r2; r2 = r4; 
            r3.statementEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.declarationSourceEnd = r1
            r0 = r14
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r1 = (org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation) r1
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.memberValue
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = copyAnnotationMemberValue(r1)
            r0.memberValue = r1
            r0 = r14
            r1 = r10
            copyMemberValuePairName(r0, r1)
            r0 = r14
            return r0
        L8f:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NormalAnnotation
            if (r0 == 0) goto L12f
            org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.NormalAnnotation
            r1 = r0
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r3 = r12
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r14
            r2 = r14
            r3 = r13
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.declarationSourceEnd = r1
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r0 = (org.eclipse.jdt.internal.compiler.ast.NormalAnnotation) r0
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r15 = r0
            r0 = r15
            if (r0 != 0) goto Ld8
            r0 = r14
            r1 = 0
            r0.memberValuePairs = r1
            goto L126
        Ld8:
            r0 = r14
            r1 = r15
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r1 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair[r1]
            r0.memberValuePairs = r1
            r0 = 0
            r16 = r0
            goto L11e
        Le9:
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair r2 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair
            r3 = r2
            r4 = r15
            r5 = r16
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = r15
            r6 = r16
            r5 = r5[r6]
            int r5 = r5.sourceStart
            r6 = r15
            r7 = r16
            r6 = r6[r7]
            int r6 = r6.sourceEnd
            r7 = r15
            r8 = r16
            r7 = r7[r8]
            org.eclipse.jdt.internal.compiler.ast.Expression r7 = r7.value
            org.eclipse.jdt.internal.compiler.ast.Expression r7 = copyAnnotationMemberValue(r7)
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            int r16 = r16 + 1
        L11e:
            r0 = r16
            r1 = r15
            int r1 = r1.length
            if (r0 < r1) goto Le9
        L126:
            r0 = r14
            r1 = r10
            copyMemberValuePairName(r0, r1)
            r0 = r14
            return r0
        L12f:
            r0 = r10
            return r0
    }

    private static void copyMemberValuePairName(org.eclipse.jdt.internal.compiler.ast.Annotation r5, org.eclipse.jdt.internal.compiler.ast.Annotation r6) {
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.ANNOTATION__MEMBER_VALUE_PAIR_NAME
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.ANNOTATION__MEMBER_VALUE_PAIR_NAME     // Catch: java.lang.Exception -> L18
            r1 = r5
            java.lang.reflect.Field r2 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.ANNOTATION__MEMBER_VALUE_PAIR_NAME     // Catch: java.lang.Exception -> L18
            r3 = r6
            java.lang.Object r2 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflect(r2, r3)     // Catch: java.lang.Exception -> L18
            lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectSet(r0, r1, r2)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
        L19:
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.Expression copyAnnotationMemberValue(org.eclipse.jdt.internal.compiler.ast.Expression r3) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = copyAnnotationMemberValue0(r0)
            r4 = r0
            r0 = r4
            r1 = r3
            org.eclipse.jdt.internal.compiler.impl.Constant r1 = r1.constant
            r0.constant = r1
            r0 = r4
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.Expression copyAnnotationMemberValue0(org.eclipse.jdt.internal.compiler.ast.Expression r8) {
            r0 = r8
            int r0 = r0.sourceStart
            r9 = r0
            r0 = r8
            int r0 = r0.sourceEnd
            r10 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            if (r0 == 0) goto L1b
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
            return r0
        L1b:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            if (r0 == 0) goto L2c
            org.eclipse.jdt.internal.compiler.ast.TrueLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
            return r0
        L2c:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NullLiteral
            if (r0 == 0) goto L3d
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
            return r0
        L3d:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.CharLiteral
            if (r0 == 0) goto L55
            org.eclipse.jdt.internal.compiler.ast.CharLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.CharLiteral
            r1 = r0
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r2 = (org.eclipse.jdt.internal.compiler.ast.Literal) r2
            char[] r2 = r2.source()
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
        L55:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.DoubleLiteral
            if (r0 == 0) goto L6d
            org.eclipse.jdt.internal.compiler.ast.DoubleLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.DoubleLiteral
            r1 = r0
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r2 = (org.eclipse.jdt.internal.compiler.ast.Literal) r2
            char[] r2 = r2.source()
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
        L6d:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FloatLiteral
            if (r0 == 0) goto L85
            org.eclipse.jdt.internal.compiler.ast.FloatLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FloatLiteral
            r1 = r0
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r2 = (org.eclipse.jdt.internal.compiler.ast.Literal) r2
            char[] r2 = r2.source()
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
        L85:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.IntLiteral
            if (r0 == 0) goto L99
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r0 = (org.eclipse.jdt.internal.compiler.ast.Literal) r0
            char[] r0 = r0.source()
            r1 = r9
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = org.eclipse.jdt.internal.compiler.ast.IntLiteral.buildIntLiteral(r0, r1, r2)
            return r0
        L99:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LongLiteral
            if (r0 == 0) goto Lad
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r0 = (org.eclipse.jdt.internal.compiler.ast.Literal) r0
            char[] r0 = r0.source()
            r1 = r9
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.LongLiteral r0 = org.eclipse.jdt.internal.compiler.ast.LongLiteral.buildLongLiteral(r0, r1, r2)
            return r0
        Lad:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.StringLiteral
            if (r0 == 0) goto Lce
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r2 = (org.eclipse.jdt.internal.compiler.ast.Literal) r2
            char[] r2 = r2.source()
            r3 = r9
            r4 = r10
            java.lang.reflect.Field r5 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.STRING_LITERAL__LINE_NUMBER
            r6 = r8
            int r5 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectInt(r5, r6)
            r6 = 1
            int r5 = r5 + r6
            r1.<init>(r2, r3, r4, r5)
            return r0
        Lce:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ExtendedStringLiteral
            if (r0 == 0) goto L111
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.Literal r2 = (org.eclipse.jdt.internal.compiler.ast.Literal) r2
            char[] r2 = r2.source()
            r3 = r9
            r4 = r10
            java.lang.reflect.Field r5 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.STRING_LITERAL__LINE_NUMBER
            r6 = r8
            int r5 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectInt(r5, r6)
            r6 = 1
            int r5 = r5 + r6
            r1.<init>(r2, r3, r4, r5)
            r11 = r0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = 0
            char[] r2 = new char[r2]
            r3 = r9
            r4 = r10
            java.lang.reflect.Field r5 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.STRING_LITERAL__LINE_NUMBER
            r6 = r8
            int r5 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectInt(r5, r6)
            r6 = 1
            int r5 = r5 + r6
            r1.<init>(r2, r3, r4, r5)
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.ExtendedStringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.ExtendedStringLiteral
            r1 = r0
            r2 = r11
            r3 = r12
            r1.<init>(r2, r3)
            return r0
        L111:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation
            if (r0 == 0) goto L176
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation r0 = (org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation) r0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.literals
            r11 = r0
            r0 = r11
            int r0 = r0.length
            if (r0 != 0) goto L133
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = 0
            char[] r2 = new char[r2]
            r3 = r9
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
        L133:
            r0 = r11
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L140
            r0 = r11
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = copyAnnotationMemberValue0(r0)
            return r0
        L140:
            org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation
            r1 = r0
            r2 = r11
            r3 = 0
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r2 = (org.eclipse.jdt.internal.compiler.ast.StringLiteral) r2
            r3 = r11
            r4 = 1
            r3 = r3[r4]
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r3 = (org.eclipse.jdt.internal.compiler.ast.StringLiteral) r3
            r1.<init>(r2, r3)
            r12 = r0
            r0 = 2
            r13 = r0
            goto L16c
        L15b:
            r0 = r12
            r1 = r11
            r2 = r13
            r1 = r1[r2]
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r1 = (org.eclipse.jdt.internal.compiler.ast.StringLiteral) r1
            org.eclipse.jdt.internal.compiler.ast.StringLiteralConcatenation r0 = r0.extendsWith(r1)
            r12 = r0
            int r13 = r13 + 1
        L16c:
            r0 = r13
            r1 = r11
            int r1 = r1.length
            if (r0 < r1) goto L15b
            r0 = r12
            return r0
        L176:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            if (r0 == 0) goto L192
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleNameReference) r0
            r11 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r11
            char[] r2 = r2.token
            r3 = r8
            long r3 = lombok.eclipse.Eclipse.pos(r3)
            r1.<init>(r2, r3)
            return r0
        L192:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            if (r0 == 0) goto L1b5
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference) r0
            r11 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r11
            char[][] r2 = r2.tokens
            r3 = r8
            r4 = r11
            char[][] r4 = r4.tokens
            int r4 = r4.length
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            return r0
        L1b5:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            if (r0 == 0) goto L1cf
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = new org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            r1 = r0
            r2 = r10
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r3 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r3
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.type
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = copyType(r3)
            r1.<init>(r2, r3)
            return r0
        L1cf:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto L239
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r9
            r0.sourceStart = r1
            r0 = r11
            r1 = r10
            r0.sourceEnd = r1
            r0 = r11
            r1 = r8
            int r1 = r1.bits
            r0.bits = r1
            r0 = r11
            r1 = r8
            int r1 = r1.implicitConversion
            r0.implicitConversion = r1
            r0 = r11
            r1 = r10
            r0.statementEnd = r1
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayInitializer) r0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L237
            r0 = r12
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            goto L229
        L219:
            r0 = r13
            r1 = r14
            r2 = r12
            r3 = r14
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = copyAnnotationMemberValue(r2)
            r0[r1] = r2
            int r14 = r14 + 1
        L229:
            r0 = r14
            r1 = r12
            int r1 = r1.length
            if (r0 < r1) goto L219
            r0 = r11
            r1 = r13
            r0.expressions = r1
        L237:
            r0 = r11
            return r0
        L239:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            if (r0 == 0) goto L27c
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = (org.eclipse.jdt.internal.compiler.ast.BinaryExpression) r0
            r11 = r0
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.left
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = copyAnnotationMemberValue(r1)
            r0.left = r1
            r0 = r12
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.right
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = copyAnnotationMemberValue(r1)
            r0.right = r1
            r0 = r12
            r1 = r9
            r0.sourceStart = r1
            r0 = r12
            r1 = r10
            r0.sourceEnd = r1
            r0 = r12
            r1 = r10
            r0.statementEnd = r1
            r0 = r12
            return r0
        L27c:
            r0 = r8
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeParameter[] copyTypeParams(org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r5, org.eclipse.jdt.internal.compiler.ast.ASTNode r6) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter[r0]
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r5
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto Lf2
        L1b:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r13
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r13
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = r1.annotations
            r0.annotations = r1
            r0 = r13
            r1 = r9
            int r1 = r1.bits
            r0.bits = r1
            r0 = r13
            r1 = r9
            int r1 = r1.modifiers
            r0.modifiers = r1
            r0 = r13
            r1 = r9
            char[] r1 = r1.name
            r0.name = r1
            r0 = r13
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = copyType(r1, r2)
            r0.type = r1
            r0 = r13
            r1 = r9
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r13
            r1 = r9
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r13
            r1 = r9
            int r1 = r1.declarationEnd
            r0.declarationEnd = r1
            r0 = r13
            r1 = r9
            int r1 = r1.declarationSourceStart
            r0.declarationSourceStart = r1
            r0 = r13
            r1 = r9
            int r1 = r1.declarationSourceEnd
            r0.declarationSourceEnd = r1
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.bounds
            if (r0 == 0) goto Le7
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.bounds
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.bounds
            r1 = r0
            r19 = r1
            int r0 = r0.length
            r18 = r0
            r0 = 0
            r17 = r0
            goto Ld9
        Lc1:
            r0 = r19
            r1 = r17
            r0 = r0[r1]
            r16 = r0
            r0 = r14
            r1 = r15
            int r15 = r15 + 1
            r2 = r16
            r3 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r0[r1] = r2
            int r17 = r17 + 1
        Ld9:
            r0 = r17
            r1 = r18
            if (r0 < r1) goto Lc1
            r0 = r13
            r1 = r14
            r0.bounds = r1
        Le7:
            r0 = r7
            r1 = r8
            int r8 = r8 + 1
            r2 = r13
            r0[r1] = r2
            int r10 = r10 + 1
        Lf2:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L1b
            r0 = r7
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] getTypeUseAnnotations(org.eclipse.jdt.internal.compiler.ast.TypeReference r4) {
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_REFERENCE__ANNOTATIONS     // Catch: java.lang.Exception -> Le
            r1 = r4
            java.lang.Object r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflect(r0, r1)     // Catch: java.lang.Exception -> Le
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[][]) r0     // Catch: java.lang.Exception -> Le
            r5 = r0
            goto L11
        Le:
            r0 = 0
            return r0
        L11:
            r0 = r5
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = r5
            r1 = r5
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = r6
        L28:
            return r0
    }

    public static void removeTypeUseAnnotations(org.eclipse.jdt.internal.compiler.ast.TypeReference r4) {
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_REFERENCE__ANNOTATIONS     // Catch: java.lang.Exception -> Lb
            r1 = r4
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectSet(r0, r1, r2)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
        Lc:
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference namePlusTypeParamsToTypeReference(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r8, long r9) {
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r11 = r0
            r0 = r11
            int r0 = r0.modifiers
            r1 = 16904(0x4208, float:2.3688E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r12 = r0
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r11
            char[] r1 = r1.name
            r2 = r12
            r3 = r8
            r4 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference namePlusTypeParamsToTypeReference(lombok.eclipse.EclipseNode r7, char[] r8, boolean r9, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r10, long r11) {
            r0 = r10
            if (r0 == 0) goto L56
            r0 = r10
            int r0 = r0.length
            if (r0 <= 0) goto L56
            r0 = r10
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r10
            r1 = r0
            r18 = r1
            int r0 = r0.length
            r17 = r0
            r0 = 0
            r16 = r0
            goto L44
        L20:
            r0 = r18
            r1 = r16
            r0 = r0[r1]
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r15
            char[] r2 = r2.name
            r3 = r11
            r1.<init>(r2, r3)
            r19 = r0
            r0 = r13
            r1 = r14
            int r14 = r14 + 1
            r2 = r19
            r0[r1] = r2
            int r16 = r16 + 1
        L44:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto L20
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = generateParameterizedTypeReference(r0, r1, r2, r3, r4)
            return r0
        L56:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = generateTypeReference(r0, r1, r2, r3)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference[] copyTypes(org.eclipse.jdt.internal.compiler.ast.TypeReference[] r3) {
            r0 = r3
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = copyTypes(r0, r1)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference[] copyTypes(org.eclipse.jdt.internal.compiler.ast.TypeReference[] r5, org.eclipse.jdt.internal.compiler.ast.ASTNode r6) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r5
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L31
        L1b:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r7
            r1 = r8
            int r8 = r8 + 1
            r2 = r9
            r3 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r0[r1] = r2
            int r10 = r10 + 1
        L31:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L1b
            r0 = r7
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference copyType(org.eclipse.jdt.internal.compiler.ast.TypeReference r3) {
            r0 = r3
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = copyType(r0, r1)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference copyType(org.eclipse.jdt.internal.compiler.ast.TypeReference r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11) {
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            if (r0 == 0) goto Lc0
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference) r0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            if (r0 == 0) goto L93
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            r1 = r0
            r18 = r1
            int r0 = r0.length
            r17 = r0
            r0 = 0
            r16 = r0
            goto L8c
        L31:
            r0 = r18
            r1 = r16
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L48
            r0 = r13
            r1 = r14
            int r14 = r14 + 1
            r2 = 0
            r0[r1] = r2
            goto L89
        L48:
            r0 = r15
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r15
            r1 = r0
            r24 = r1
            int r0 = r0.length
            r23 = r0
            r0 = 0
            r22 = r0
            goto L79
        L61:
            r0 = r24
            r1 = r22
            r0 = r0[r1]
            r21 = r0
            r0 = r19
            r1 = r20
            int r20 = r20 + 1
            r2 = r21
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r0[r1] = r2
            int r22 = r22 + 1
        L79:
            r0 = r22
            r1 = r23
            if (r0 < r1) goto L61
            r0 = r13
            r1 = r14
            int r14 = r14 + 1
            r2 = r19
            r0[r1] = r2
        L89:
            int r16 = r16 + 1
        L8c:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto L31
        L93:
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r12
            char[][] r2 = r2.tokens
            r3 = r13
            r4 = r12
            int r4 = r4.dimensions()
            r5 = r12
            long[] r5 = r5.sourcePositions
            long[] r5 = copy(r5)
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            r0 = r10
            r1 = r14
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto Lbd
            r0 = r14
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lbd:
            r0 = r14
            return r0
        Lc0:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference
            if (r0 == 0) goto Lf4
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference) r0
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference
            r1 = r0
            r2 = r12
            char[][] r2 = r2.tokens
            r3 = r12
            int r3 = r3.dimensions()
            r4 = r12
            long[] r4 = r4.sourcePositions
            long[] r4 = copy(r4)
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r10
            r1 = r13
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto Lf2
            r0 = r13
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lf2:
            r0 = r13
            return r0
        Lf4:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L124
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r12
            char[][] r2 = r2.tokens
            r3 = r12
            long[] r3 = r3.sourcePositions
            long[] r3 = copy(r3)
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r10
            r1 = r13
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto L122
            r0 = r13
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        L122:
            r0 = r13
            return r0
        L124:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            if (r0 == 0) goto L1b7
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference) r0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            if (r0 == 0) goto L183
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            r1 = r0
            r18 = r1
            int r0 = r0.length
            r17 = r0
            r0 = 0
            r16 = r0
            goto L17c
        L155:
            r0 = r18
            r1 = r16
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L16c
            r0 = r13
            r1 = r14
            int r14 = r14 + 1
            r2 = 0
            r0[r1] = r2
            goto L179
        L16c:
            r0 = r13
            r1 = r14
            int r14 = r14 + 1
            r2 = r15
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = copyType(r2, r3)
            r0[r1] = r2
        L179:
            int r16 = r16 + 1
        L17c:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto L155
        L183:
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            r1 = r0
            r2 = r12
            char[] r2 = r2.token
            r3 = r13
            r4 = r12
            int r4 = r4.dimensions()
            r5 = r12
            int r5 = r5.sourceStart
            long r5 = (long) r5
            r6 = 32
            long r5 = r5 << r6
            r6 = r12
            int r6 = r6.sourceEnd
            long r6 = (long) r6
            long r5 = r5 | r6
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            r0 = r10
            r1 = r14
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto L1b4
            r0 = r14
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        L1b4:
            r0 = r14
            return r0
        L1b7:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference
            if (r0 == 0) goto L1f2
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference) r0
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference
            r1 = r0
            r2 = r12
            char[] r2 = r2.token
            r3 = r12
            int r3 = r3.dimensions()
            r4 = r12
            int r4 = r4.sourceStart
            long r4 = (long) r4
            r5 = 32
            long r4 = r4 << r5
            r5 = r12
            int r5 = r5.sourceEnd
            long r5 = (long) r5
            long r4 = r4 | r5
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r10
            r1 = r13
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto L1f0
            r0 = r13
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        L1f0:
            r0 = r13
            return r0
        L1f2:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Wildcard
            if (r0 == 0) goto L23e
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = (org.eclipse.jdt.internal.compiler.ast.Wildcard) r0
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r1 = r0
            r2 = r12
            int r2 = r2.kind
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            r1 = r12
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r13
            r1 = r12
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.bound
            if (r0 == 0) goto L22d
            r0 = r13
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.bound
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = copyType(r1, r2)
            r0.bound = r1
        L22d:
            r0 = r10
            r1 = r13
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto L23c
            r0 = r13
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        L23c:
            r0 = r13
            return r0
        L23e:
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L275
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r12
            char[] r2 = r2.token
            r3 = r12
            int r3 = r3.sourceStart
            long r3 = (long) r3
            r4 = 32
            long r3 = r3 << r4
            r4 = r12
            int r4 = r4.sourceEnd
            long r4 = (long) r4
            long r3 = r3 | r4
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r10
            r1 = r13
            copyTypeAnns(r0, r1)
            r0 = r11
            if (r0 == 0) goto L273
            r0 = r13
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        L273:
            r0 = r13
            return r0
        L275:
            r0 = r10
            return r0
    }

    private static void copyTypeAnns(org.eclipse.jdt.internal.compiler.ast.TypeReference r6, org.eclipse.jdt.internal.compiler.ast.TypeReference r7) {
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_REFERENCE__ANNOTATIONS     // Catch: java.lang.Exception -> Le
            r1 = r6
            java.lang.Object r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflect(r0, r1)     // Catch: java.lang.Exception -> Le
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[][]) r0     // Catch: java.lang.Exception -> Le
            r8 = r0
            goto L10
        Le:
            return
        L10:
            r0 = r8
            if (r0 != 0) goto L1d
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_REFERENCE__ANNOTATIONS
            r1 = r7
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectSet(r0, r1, r2)
            return
        L1d:
            r0 = r8
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r9 = r0
            r0 = 0
            r10 = r0
            goto L6a
        L29:
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            if (r0 == 0) goto L67
            r0 = r9
            r1 = r10
            r2 = r8
            r3 = r10
            r2 = r2[r3]
            int r2 = r2.length
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r0[r1] = r2
            r0 = 0
            r11 = r0
            goto L5d
        L42:
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            r1 = r11
            r2 = r8
            r3 = r10
            r2 = r2[r3]
            r3 = r11
            r2 = r2[r3]
            r3 = r8
            r4 = r10
            r3 = r3[r4]
            r4 = r11
            r3 = r3[r4]
            org.eclipse.jdt.internal.compiler.ast.Annotation r2 = copyAnnotation(r2, r3)
            r0[r1] = r2
            int r11 = r11 + 1
        L5d:
            r0 = r11
            r1 = r8
            r2 = r10
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 < r1) goto L42
        L67:
            int r10 = r10 + 1
        L6a:
            r0 = r10
            r1 = r8
            int r1 = r1.length
            if (r0 < r1) goto L29
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_REFERENCE__ANNOTATIONS
            r1 = r7
            r2 = r9
            lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflectSet(r0, r1, r2)
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] copyAnnotations(org.eclipse.jdt.internal.compiler.ast.ASTNode r4, org.eclipse.jdt.internal.compiler.ast.Annotation[]... r5) {
            r0 = 0
            r6 = r0
            r0 = r5
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L53
        Lf:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L50
            r0 = r7
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L49
        L26:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r6
            if (r0 != 0) goto L39
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
        L39:
            r0 = r6
            r1 = r11
            r2 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = copyAnnotation(r1, r2)
            boolean r0 = r0.add(r1)
            int r12 = r12 + 1
        L49:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L26
        L50:
            int r8 = r8 + 1
        L53:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto Lf
            r0 = r6
            if (r0 != 0) goto L62
            r0 = 0
            goto L6f
        L62:
            r0 = r6
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r0
        L6f:
            return r0
    }

    public static boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r3, lombok.eclipse.EclipseNode r4) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r4
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L68;
                case 5: goto L40;
                case 6: goto L68;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L68;
            }
        L40:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L5f
        L4b:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            r0 = r3
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L5f
            r0 = 1
            return r0
        L5f:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4b
        L68:
            r0 = 0
            return r0
    }

    public static boolean hasAnnotation(java.lang.String r3, lombok.eclipse.EclipseNode r4) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r4
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L68;
                case 5: goto L40;
                case 6: goto L68;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L68;
            }
        L40:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L5f
        L4b:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            r0 = r3
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L5f
            r0 = 1
            return r0
        L5f:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4b
        L68:
            r0 = 0
            return r0
    }

    public static lombok.eclipse.EclipseNode findInnerClass(lombok.eclipse.EclipseNode r3, java.lang.String r4) {
            r0 = r4
            char[] r0 = r0.toCharArray()
            r5 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L40
        L11:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L29
            goto L40
        L29:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r8 = r0
            r0 = r8
            char[] r0 = r0.name
            r1 = r5
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L40
            r0 = r6
            return r0
        L40:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r0 = 0
            return r0
    }

    public static lombok.eclipse.EclipseNode findAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r3, lombok.eclipse.EclipseNode r4) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r4
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L68;
                case 5: goto L40;
                case 6: goto L68;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L68;
            }
        L40:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L5f
        L4b:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            r0 = r3
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L5f
            r0 = r5
            return r0
        L5f:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4b
        L68:
            r0 = 0
            return r0
    }

    public static java.lang.String scanForNearestAnnotation(lombok.eclipse.EclipseNode r4, java.lang.String... r5) {
            goto L72
        L3:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L61
        Le:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L25
            goto L61
        L25:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r8 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r9 = r0
            r0 = r5
            r1 = r0
            r13 = r1
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r11 = r0
            goto L5a
        L42:
            r0 = r13
            r1 = r11
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r4
            r2 = r9
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L57
            r0 = r10
            return r0
        L57:
            int r11 = r11 + 1
        L5a:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L42
        L61:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r4 = r0
        L72:
            r0 = r4
            if (r0 != 0) goto L3
            r0 = 0
            return r0
    }

    public static boolean hasNonNullAnnotations(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L5c
        Lb:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L22
            goto L5c
        L22:
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r7 = r0
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.NONNULL_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L52
        L37:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r4
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L52
            r0 = 1
            return r0
        L52:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L37
        L5c:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
    }

    public static boolean hasNonNullAnnotations(lombok.eclipse.EclipseNode r4, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r5) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L5d
        L10:
            r0 = r7
            java.lang.Object r0 = r0.next()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5d
            r0 = r8
            char[][] r0 = r0.getTypeName()
            if (r0 == 0) goto L5d
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.NONNULL_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L53
        L3a:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            r1 = r4
            r2 = r8
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L53
            r0 = 1
            return r0
        L53:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3a
        L5d:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
            r0 = 0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] findCopyableAnnotations(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r0
            r5 = r0
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EMPTY_ANNOTATIONS_ARRAY
            return r0
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.util.List<lombok.core.configuration.TypeName>> r1 = lombok.ConfigurationKeys.COPYABLE_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.util.List r0 = (java.util.List) r0
            r7 = r0
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto Ldc
        L39:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            if (r0 == 0) goto Ld9
            r0 = r12
            char[][] r0 = r0.getTypeName()
            if (r0 == 0) goto Ld9
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L90
        L62:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.TypeName r0 = (lombok.core.configuration.TypeName) r0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L90
            r0 = r14
            java.lang.String r0 = r0.toString()
            r1 = r4
            r2 = r12
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L90
            r0 = r6
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = 1
            r13 = r0
            goto L9a
        L90:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L62
        L9a:
            r0 = r13
            if (r0 != 0) goto Ld9
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.BASE_COPYABLE_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto Lcf
        Lac:
            r0 = r15
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r14
            r1 = r4
            r2 = r12
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto Lcf
            r0 = r6
            r1 = r8
            boolean r0 = r0.add(r1)
            goto Ld9
        Lcf:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lac
        Ld9:
            int r9 = r9 + 1
        Ldc:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L39
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.EMPTY_ANNOTATIONS_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] findCopyableToSetterAnnotations(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            java.util.List<java.lang.String> r1 = lombok.core.handlers.HandlerUtil.COPY_TO_SETTER_ANNOTATIONS
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = findAnnotationsInList(r0, r1)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] findCopyableToBuilderSingularSetterAnnotations(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            java.util.List<java.lang.String> r1 = lombok.core.handlers.HandlerUtil.COPY_TO_BUILDER_SINGULAR_SETTER_ANNOTATIONS
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = findAnnotationsInList(r0, r1)
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.Annotation[] findAnnotationsInList(lombok.eclipse.EclipseNode r4, java.util.List<java.lang.String> r5) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EMPTY_ANNOTATIONS_ARRAY
            return r0
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L81
        L2b:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L7e
            r0 = r12
            char[][] r0 = r0.getTypeName()
            if (r0 == 0) goto L7e
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L74
        L51:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            r1 = r4
            r2 = r12
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L74
            r0 = r7
            r1 = r8
            boolean r0 = r0.add(r1)
            goto L7e
        L74:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L51
        L7e:
            int r9 = r9 + 1
        L81:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L2b
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.EMPTY_ANNOTATIONS_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r0
            return r0
    }

    public static boolean annotationTypeMatches(java.lang.Class<? extends java.lang.annotation.Annotation> r4, lombok.eclipse.EclipseNode r5) {
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            r1 = r5
            r2 = r5
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r2 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r2
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = typeMatches(r0, r1, r2)
            return r0
    }

    public static boolean annotationTypeMatches(java.lang.String r4, lombok.eclipse.EclipseNode r5) {
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            r1 = r5
            r2 = r5
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r2 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r2
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = typeMatches(r0, r1, r2)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference cloneSelfType(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = cloneSelfType(r0, r1)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference cloneSelfType(lombok.eclipse.EclipseNode r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9) {
            r0 = r9
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r9
            int r0 = r0.sourceStart
        Lc:
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r9
            int r0 = r0.sourceEnd
        L19:
            r11 = r0
            r0 = r10
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r11
            long r1 = (long) r1
            long r0 = r0 | r1
            r12 = r0
            r0 = r8
            r14 = r0
            r0 = 0
            r15 = r0
            goto L37
        L2d:
            r0 = r14
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r14 = r0
        L37:
            r0 = r14
            if (r0 == 0) goto L47
            r0 = r14
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L2d
        L47:
            r0 = r14
            if (r0 == 0) goto Lec
            r0 = r14
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto Lec
            r0 = r14
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r16 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            if (r0 == 0) goto Le3
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            int r0 = r0.length
            if (r0 <= 0) goto Le3
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r0
            r22 = r1
            int r0 = r0.length
            r21 = r0
            r0 = 0
            r20 = r0
            goto Lce
        L91:
            r0 = r22
            r1 = r20
            r0 = r0[r1]
            r19 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r19
            char[] r2 = r2.name
            r3 = r19
            int r3 = r3.sourceStart
            long r3 = (long) r3
            r4 = 32
            long r3 = r3 << r4
            r4 = r19
            int r4 = r4.sourceEnd
            long r4 = (long) r4
            long r3 = r3 | r4
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r9
            if (r0 == 0) goto Lc1
            r0 = r23
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lc1:
            r0 = r17
            r1 = r18
            int r18 = r18 + 1
            r2 = r23
            r0[r1] = r2
            int r20 = r20 + 1
        Lce:
            r0 = r20
            r1 = r21
            if (r0 < r1) goto L91
            r0 = r14
            r1 = r17
            r2 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = generateParameterizedTypeReference(r0, r1, r2)
            r15 = r0
            goto Lec
        Le3:
            r0 = r14
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = generateTypeReference(r0, r1)
            r15 = r0
        Lec:
            r0 = r15
            if (r0 == 0) goto Lfc
            r0 = r9
            if (r0 == 0) goto Lfc
            r0 = r15
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lfc:
            r0 = r15
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference generateParameterizedTypeReference(lombok.eclipse.EclipseNode r8, org.eclipse.jdt.internal.compiler.ast.TypeReference[] r9, long r10) {
            r0 = r8
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r12 = r0
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r12
            char[] r1 = r1.name
            char[][] r0 = getQualifiedInnerName(r0, r1)
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L30
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            r1 = r0
            r2 = r13
            r3 = 0
            r2 = r2[r3]
            r3 = r9
            r4 = 0
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            return r0
        L30:
            r0 = r13
            int r0 = r0.length
            r14 = r0
            r0 = r14
            long[] r0 = new long[r0]
            r15 = r0
            r0 = 0
            r16 = r0
            goto L4a
        L41:
            r0 = r15
            r1 = r16
            r2 = r10
            r0[r1] = r2
            int r16 = r16 + 1
        L4a:
            r0 = r16
            r1 = r14
            if (r0 < r1) goto L41
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r16 = r0
            r0 = r16
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            r2 = r9
            r0[r1] = r2
            r0 = r12
            int r0 = r0.modifiers
            r1 = 16904(0x4208, float:2.3688E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L70
            r0 = 1
            goto L71
        L70:
            r0 = 0
        L71:
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L8a
            r0 = r16
            r1 = r14
            r2 = 2
            int r1 = r1 - r2
            r2 = r8
            lombok.core.LombokNode r2 = r2.m66up()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            r3 = r10
            boolean r0 = fillOuterTypeParams(r0, r1, r2, r3)
        L8a:
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r13
            r3 = r16
            r4 = 0
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference generateParameterizedTypeReference(lombok.eclipse.EclipseNode r8, char[] r9, boolean r10, org.eclipse.jdt.internal.compiler.ast.TypeReference[] r11, long r12) {
            r0 = r8
            r1 = r9
            char[][] r0 = getQualifiedInnerName(r0, r1)
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L1e
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            r1 = r0
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r3 = r11
            r4 = 0
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            return r0
        L1e:
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = r15
            long[] r0 = new long[r0]
            r16 = r0
            r0 = 0
            r17 = r0
            goto L39
        L2f:
            r0 = r16
            r1 = r17
            r2 = r12
            r0[r1] = r2
            int r17 = r17 + 1
        L39:
            r0 = r17
            r1 = r15
            if (r0 < r1) goto L2f
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r17 = r0
            r0 = r17
            r1 = r15
            r2 = 1
            int r1 = r1 - r2
            r2 = r11
            r0[r1] = r2
            r0 = r10
            if (r0 == 0) goto L60
            r0 = r17
            r1 = r15
            r2 = 2
            int r1 = r1 - r2
            r2 = r8
            r3 = r12
            boolean r0 = fillOuterTypeParams(r0, r1, r2, r3)
        L60:
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r14
            r3 = r17
            r4 = 0
            r5 = r16
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private static boolean fillOuterTypeParams(org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r8, int r9, lombok.eclipse.EclipseNode r10, long r11) {
            r0 = r9
            if (r0 < 0) goto L12
            r0 = r10
            if (r0 == 0) goto L12
            r0 = r10
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 != 0) goto L14
        L12:
            r0 = 0
            return r0
        L14:
            r0 = 0
            r13 = r0
            r0 = r10
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r14 = r0
            r0 = r14
            int r0 = r0.modifiers
            r1 = 16896(0x4200, float:2.3676E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = 0
            return r0
        L2e:
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L76
            r0 = r15
            int r0 = r0.length
            if (r0 <= 0) goto L76
            r0 = r15
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r16 = r0
            r0 = 0
            r17 = r0
            goto L66
        L4e:
            r0 = r16
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r15
            r5 = r17
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = r11
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r17 = r17 + 1
        L66:
            r0 = r17
            r1 = r15
            int r1 = r1.length
            if (r0 < r1) goto L4e
            r0 = r8
            r1 = r9
            r2 = r16
            r0[r1] = r2
            r0 = 1
            r13 = r0
        L76:
            r0 = r14
            int r0 = r0.modifiers
            r1 = 16904(0x4208, float:2.3688E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L85
            r0 = r13
            return r0
        L85:
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            r2 = r10
            lombok.core.LombokNode r2 = r2.m66up()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            r3 = r11
            boolean r0 = fillOuterTypeParams(r0, r1, r2, r3)
            r16 = r0
            r0 = r16
            if (r0 != 0) goto La2
            r0 = r13
            if (r0 != 0) goto La2
            r0 = 0
            return r0
        La2:
            r0 = 1
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.NameReference generateNameReference(lombok.eclipse.EclipseNode r7, long r8) {
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r7
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            char[] r1 = r1.name
            char[][] r0 = getQualifiedInnerName(r0, r1)
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L27
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r10
            r3 = 0
            r2 = r2[r3]
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L27:
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = r11
            long[] r0 = new long[r0]
            r12 = r0
            r0 = 0
            r13 = r0
            goto L40
        L37:
            r0 = r12
            r1 = r13
            r2 = r8
            r0[r1] = r2
            int r13 = r13 + 1
        L40:
            r0 = r13
            r1 = r11
            if (r0 < r1) goto L37
            r0 = r8
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r13 = r0
            r0 = r8
            int r0 = (int) r0
            r14 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.NameReference generateNameReference(lombok.eclipse.EclipseNode r7, char[] r8, long r9) {
            r0 = r7
            r1 = r8
            char[][] r0 = getQualifiedInnerName(r0, r1)
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L1b
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r11
            r3 = 0
            r2 = r2[r3]
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        L1b:
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = r12
            long[] r0 = new long[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            goto L35
        L2c:
            r0 = r13
            r1 = r14
            r2 = r9
            r0[r1] = r2
            int r14 = r14 + 1
        L35:
            r0 = r14
            r1 = r12
            if (r0 < r1) goto L2c
            r0 = r9
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r14 = r0
            r0 = r9
            int r0 = (int) r0
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference generateTypeReference(lombok.eclipse.EclipseNode r7, long r8) {
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r10 = r0
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r10
            char[] r1 = r1.name
            char[][] r0 = getQualifiedInnerName(r0, r1)
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L2c
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r11
            r3 = 0
            r2 = r2[r3]
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L2c:
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = r12
            long[] r0 = new long[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            goto L46
        L3d:
            r0 = r13
            r1 = r14
            r2 = r8
            r0[r1] = r2
            int r14 = r14 + 1
        L46:
            r0 = r14
            r1 = r12
            if (r0 < r1) goto L3d
            r0 = r10
            int r0 = r0.modifiers
            r1 = 16904(0x4208, float:2.3688E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L73
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            if (r0 == 0) goto L73
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L73
            r0 = 1
            goto L74
        L73:
            r0 = 0
        L74:
            r14 = r0
            r0 = r14
            if (r0 == 0) goto Lab
            r0 = r11
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r15 = r0
            r0 = r15
            r1 = r15
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            r2 = r7
            lombok.core.LombokNode r2 = r2.m66up()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            r3 = r8
            boolean r0 = fillOuterTypeParams(r0, r1, r2, r3)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lab
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r11
            r3 = r15
            r4 = 0
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            return r0
        Lab:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r11
            r3 = r13
            r1.<init>(r2, r3)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference generateTypeReference(lombok.eclipse.EclipseNode r7, char[] r8, boolean r9, long r10) {
            r0 = r7
            r1 = r8
            char[][] r0 = getQualifiedInnerName(r0, r1)
            r12 = r0
            r0 = r12
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L1b
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r12
            r3 = 0
            r2 = r2[r3]
            r3 = r10
            r1.<init>(r2, r3)
            return r0
        L1b:
            r0 = r12
            int r0 = r0.length
            r13 = r0
            r0 = r13
            long[] r0 = new long[r0]
            r14 = r0
            r0 = 0
            r15 = r0
            goto L35
        L2c:
            r0 = r14
            r1 = r15
            r2 = r10
            r0[r1] = r2
            int r15 = r15 + 1
        L35:
            r0 = r15
            r1 = r13
            if (r0 < r1) goto L2c
            r0 = r9
            if (r0 == 0) goto L74
            r0 = r7
            if (r0 == 0) goto L74
            r0 = r7
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L74
            r0 = r12
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r15 = r0
            r0 = r15
            r1 = r12
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            r2 = r7
            r3 = r10
            boolean r0 = fillOuterTypeParams(r0, r1, r2, r3)
            if (r0 == 0) goto L74
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r12
            r3 = r15
            r4 = 0
            r5 = r14
            r1.<init>(r2, r3, r4, r5)
            return r0
        L74:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r12
            r3 = r14
            r1.<init>(r2, r3)
            return r0
    }

    public static char[][] getQualifiedInnerName(lombok.eclipse.EclipseNode r5, char[] r6) {
            r0 = 0
            r7 = r0
            r0 = r5
            r8 = r0
            goto L2f
        L7:
            r0 = r8
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r9 = r0
            r0 = r9
            char[] r0 = r0.name
            if (r0 == 0) goto L47
            r0 = r9
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 != 0) goto L24
            goto L47
        L24:
            int r7 = r7 + 1
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r8 = r0
        L2f:
            r0 = r8
            if (r0 == 0) goto L47
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L47
            r0 = r8
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 != 0) goto L7
        L47:
            r0 = r7
            if (r0 != 0) goto L54
            r0 = 1
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            r1[r2] = r3
            return r0
        L54:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r9 = r0
            r0 = r9
            r1 = r7
            r2 = r6
            r0[r1] = r2
            r0 = r5
            r8 = r0
            goto L83
        L66:
            r0 = r8
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r10 = r0
            r0 = r9
            int r7 = r7 + (-1)
            r1 = r7
            r2 = r10
            char[] r2 = r2.name
            r0[r1] = r2
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r8 = r0
        L83:
            r0 = r7
            if (r0 > 0) goto L66
            r0 = r9
            return r0
    }

    private static int compare(char[] r4, char[] r5) {
            r0 = r4
            if (r0 != 0) goto Le
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            goto Ld
        Lc:
            r0 = -1
        Ld:
            return r0
        Le:
            r0 = r5
            if (r0 != 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = r4
            int r0 = r0.length
            r1 = r5
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            r6 = r0
            r0 = 0
            r7 = r0
            goto L3a
        L21:
            r0 = r4
            r1 = r7
            char r0 = r0[r1]
            r1 = r5
            r2 = r7
            char r1 = r1[r2]
            if (r0 >= r1) goto L2c
            r0 = -1
            return r0
        L2c:
            r0 = r4
            r1 = r7
            char r0 = r0[r1]
            r1 = r5
            r2 = r7
            char r1 = r1[r2]
            if (r0 <= r1) goto L37
            r0 = 1
            return r0
        L37:
            int r7 = r7 + 1
        L3a:
            r0 = r7
            r1 = r6
            if (r0 < r1) goto L21
            r0 = r4
            int r0 = r0.length
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L4a
            r0 = -1
            goto L56
        L4a:
            r0 = r4
            int r0 = r0.length
            r1 = r5
            int r1 = r1.length
            if (r0 <= r1) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference makeType(org.eclipse.jdt.internal.compiler.lookup.TypeBinding r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9, boolean r10) {
            r0 = 0
            r11 = r0
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<?> r1 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING1
            if (r0 != r1) goto L1a
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING_TYPES1
            r1 = r8
            java.lang.Object r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflect(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r11 = r0
            goto L2f
        L1a:
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<?> r1 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING2
            if (r0 != r1) goto L2f
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.INTERSECTION_BINDING_TYPES2
            r1 = r8
            java.lang.Object r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.reflect(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r11 = r0
        L2f:
            r0 = r11
            if (r0 == 0) goto Lf4
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r11
            r1 = r0
            r17 = r1
            int r0 = r0.length
            r16 = r0
            r0 = 0
            r15 = r0
            goto Lea
        L46:
            r0 = r17
            r1 = r15
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.TypeBinding
            if (r0 == 0) goto Le7
            r0 = r14
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding) r0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r18
            boolean r0 = r0.isArrayType()
            if (r0 == 0) goto L6e
            r0 = 100
            r19 = r0
            goto L9f
        L6e:
            r0 = r18
            boolean r0 = r0.isClass()
            if (r0 == 0) goto L7d
            r0 = 50
            r19 = r0
            goto L9f
        L7d:
            r0 = r18
            boolean r0 = r0.isTypeVariable()
            if (r0 == 0) goto L8c
            r0 = 20
            r19 = r0
            goto L9f
        L8c:
            r0 = r18
            boolean r0 = r0.isWildcard()
            if (r0 == 0) goto L9b
            r0 = 15
            r19 = r0
            goto L9f
        L9b:
            r0 = 10
            r19 = r0
        L9f:
            r0 = r19
            r1 = 50
            if (r0 != r1) goto Lb7
            r0 = r18
            char[] r0 = r0.signature()
            char[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.OBJECT_SIG
            int r0 = compare(r0, r1)
            if (r0 != 0) goto Lb7
            r0 = 1
            r19 = r0
        Lb7:
            r0 = r13
            r1 = r19
            if (r0 <= r1) goto Lc1
            goto Le7
        Lc1:
            r0 = r13
            r1 = r19
            if (r0 >= r1) goto Ld3
            r0 = r18
            r12 = r0
            r0 = r19
            r13 = r0
            goto Le7
        Ld3:
            r0 = r12
            char[] r0 = r0.signature()
            r1 = r18
            char[] r1 = r1.signature()
            int r0 = compare(r0, r1)
            if (r0 <= 0) goto Le7
            r0 = r18
            r12 = r0
        Le7:
            int r15 = r15 + 1
        Lea:
            r0 = r15
            r1 = r16
            if (r0 < r1) goto L46
            r0 = r12
            r8 = r0
        Lf4:
            r0 = r8
            int r0 = r0.dimensions()
            r12 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.leafComponentType()
            r8 = r0
            r0 = 0
            r13 = r0
            r0 = r8
            int r0 = r0.id
            switch(r0) {
                case 2: goto L178;
                case 3: goto L158;
                case 4: goto L150;
                case 5: goto L170;
                case 6: goto L180;
                case 7: goto L148;
                case 8: goto L160;
                case 9: goto L168;
                case 10: goto L140;
                case 11: goto L18a;
                case 12: goto L188;
                default: goto L18a;
            }
        L140:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.INT
            r13 = r0
            goto L18a
        L148:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.LONG
            r13 = r0
            goto L18a
        L150:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.SHORT
            r13 = r0
            goto L18a
        L158:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.BYTE
            r13 = r0
            goto L18a
        L160:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.DOUBLE
            r13 = r0
            goto L18a
        L168:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.FLOAT
            r13 = r0
            goto L18a
        L170:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.BOOLEAN
            r13 = r0
            goto L18a
        L178:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.CHAR
            r13 = r0
            goto L18a
        L180:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.VOID
            r13 = r0
            goto L18a
        L188:
            r0 = 0
            return r0
        L18a:
            r0 = r13
            if (r0 == 0) goto L1c8
            r0 = r12
            if (r0 <= 0) goto L1af
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference
            r1 = r0
            r2 = r13
            r3 = r12
            r4 = r9
            long r4 = lombok.eclipse.Eclipse.pos(r4)
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            return r0
        L1af:
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r13
            r3 = r9
            long r3 = lombok.eclipse.Eclipse.pos(r3)
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            return r0
        L1c8:
            r0 = r8
            boolean r0 = r0.isAnonymousType()
            if (r0 == 0) goto L221
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding) r0
            r14 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.superInterfaces()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L1e7
            r0 = r15
            int r0 = r0.length
            if (r0 != 0) goto L1f5
        L1e7:
            r0 = 1
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = new org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[r0]
            r1 = r0
            r2 = 0
            r3 = r14
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r3 = r3.superclass()
            r1[r2] = r3
            r15 = r0
        L1f5:
            r0 = r15
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto L217
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r3 = r9
            r4 = 3
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r16
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r16
            return r0
        L217:
            r0 = r15
            r1 = 0
            r0 = r0[r1]
            r1 = r9
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = makeType(r0, r1, r2)
            return r0
        L221:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.CaptureBinding
            if (r0 == 0) goto L235
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.CaptureBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.CaptureBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.WildcardBinding r0 = r0.wildcard
            r1 = r9
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = makeType(r0, r1, r2)
            return r0
        L235:
            r0 = r8
            boolean r0 = r0.isUnboundWildcard()
            if (r0 == 0) goto L281
            r0 = r10
            if (r0 != 0) goto L25b
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r3 = r9
            r4 = 3
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            return r0
        L25b:
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r9
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r14
            r1 = r9
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r14
            return r0
        L281:
            r0 = r8
            boolean r0 = r0.isWildcard()
            if (r0 == 0) goto L36d
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.WildcardBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.WildcardBinding) r0
            r14 = r0
            r0 = r14
            int r0 = r0.boundKind
            r1 = 1
            if (r0 != r1) goto L310
            r0 = r10
            if (r0 != 0) goto L2db
            r0 = r14
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.bound
            r15 = r0
            r0 = r15
            int r0 = r0.id
            r1 = 1
            if (r0 != r1) goto L2af
            r0 = 1
            goto L2b0
        L2af:
            r0 = 0
        L2b0:
            r16 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.otherBounds
            r17 = r0
            r0 = r16
            if (r0 == 0) goto L2d3
            r0 = r17
            if (r0 == 0) goto L2d3
            r0 = r17
            int r0 = r0.length
            if (r0 <= 0) goto L2d3
            r0 = r17
            r1 = 0
            r0 = r0[r1]
            r1 = r9
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = makeType(r0, r1, r2)
            return r0
        L2d3:
            r0 = r15
            r1 = r9
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = makeType(r0, r1, r2)
            return r0
        L2db:
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            r1 = r14
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.bound
            r2 = r9
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = makeType(r1, r2, r3)
            r0.bound = r1
            r0 = r15
            r1 = r9
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r15
            r1 = r9
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r15
            return r0
        L310:
            r0 = r10
            if (r0 == 0) goto L352
            r0 = r14
            int r0 = r0.boundKind
            r1 = 2
            if (r0 != r1) goto L352
            org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r1 = r0
            r2 = 2
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            r1 = r14
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.bound
            r2 = r9
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = makeType(r1, r2, r3)
            r0.bound = r1
            r0 = r15
            r1 = r9
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r15
            r1 = r9
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r15
            return r0
        L352:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r3 = r9
            r4 = 3
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r15
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            return r0
        L36d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.RawTypeBinding
            if (r0 != 0) goto L403
            r0 = r8
            r15 = r0
        L380:
            r0 = r15
            boolean r0 = r0.isLocalType()
            if (r0 != 0) goto L39c
            r0 = r15
            boolean r0 = r0.isMemberType()
            if (r0 == 0) goto L39c
            r0 = r15
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.enclosingType()
            if (r0 == 0) goto L39c
            r0 = 0
            goto L39d
        L39c:
            r0 = 1
        L39d:
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r15
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding
            if (r0 == 0) goto L3e7
            r0 = r15
            org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding) r0
            r18 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.arguments
            if (r0 == 0) goto L3e7
            r0 = r18
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.arguments
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r17 = r0
            r0 = 0
            r19 = r0
            goto L3df
        L3ca:
            r0 = r17
            r1 = r19
            r2 = r18
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r2 = r2.arguments
            r3 = r19
            r2 = r2[r3]
            r3 = r9
            r4 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = makeType(r2, r3, r4)
            r0[r1] = r2
            int r19 = r19 + 1
        L3df:
            r0 = r19
            r1 = r17
            int r1 = r1.length
            if (r0 < r1) goto L3ca
        L3e7:
            r0 = r14
            r1 = r17
            boolean r0 = r0.add(r1)
            r0 = r16
            if (r0 == 0) goto L3f9
            goto L403
        L3f9:
            r0 = r15
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.enclosingType()
            r15 = r0
            goto L380
        L403:
            r0 = r8
            boolean r0 = r0.isTypeVariable()
            if (r0 == 0) goto L41a
            r0 = 1
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            char[] r3 = r3.shortReadableName()
            r1[r2] = r3
            r15 = r0
            goto L4c7
        L41a:
            r0 = r8
            boolean r0 = r0.isLocalType()
            if (r0 == 0) goto L431
            r0 = 1
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            char[] r3 = r3.sourceName()
            r1[r2] = r3
            r15 = r0
            goto L4c7
        L431:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r8
            char[] r2 = r2.qualifiedPackageName()
            r1.<init>(r2)
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r16 = r0
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r8
            char[] r2 = r2.qualifiedSourceName()
            r1.<init>(r2)
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r17 = r0
            r0 = r16
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L46e
            r0 = r16
            r1 = 0
            r0 = r0[r1]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L46e
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r16 = r0
        L46e:
            r0 = r16
            int r0 = r0.length
            r1 = r17
            int r1 = r1.length
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r15 = r0
            r0 = 0
            r18 = r0
            goto L490
        L480:
            r0 = r15
            r1 = r18
            r2 = r16
            r3 = r18
            r2 = r2[r3]
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r18 = r18 + 1
        L490:
            r0 = r18
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto L480
            goto L4af
        L49b:
            r0 = r15
            r1 = r18
            r2 = r17
            r3 = r18
            r4 = r16
            int r4 = r4.length
            int r3 = r3 - r4
            r2 = r2[r3]
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r18 = r18 + 1
        L4af:
            r0 = r18
            r1 = r16
            int r1 = r1.length
            r2 = r17
            int r2 = r2.length
            int r1 = r1 + r2
            if (r0 < r1) goto L49b
            goto L4c7
        L4be:
            r0 = r14
            r1 = 0
            boolean r0 = r0.add(r1)
        L4c7:
            r0 = r14
            int r0 = r0.size()
            r1 = r15
            int r1 = r1.length
            if (r0 < r1) goto L4be
            r0 = r14
            java.util.Collections.reverse(r0)
            r0 = 0
            r16 = r0
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L4ff
        L4e8:
            r0 = r18
            java.lang.Object r0 = r0.next()
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference[]) r0
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L4ff
            r0 = 1
            r16 = r0
            goto L509
        L4ff:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4e8
        L509:
            r0 = r16
            if (r0 == 0) goto L56d
            r0 = r15
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L545
            r0 = r14
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference[][]) r0
            r17 = r0
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r15
            r3 = r17
            r4 = r12
            r5 = r9
            r6 = r15
            int r6 = r6.length
            long[] r5 = lombok.eclipse.Eclipse.poss(r5, r6)
            r1.<init>(r2, r3, r4, r5)
            r18 = r0
            r0 = r18
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r18
            return r0
        L545:
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            r1 = r0
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            r3 = r14
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r3 = (org.eclipse.jdt.internal.compiler.ast.TypeReference[]) r3
            r4 = r12
            r5 = r9
            long r5 = lombok.eclipse.Eclipse.pos(r5)
            r1.<init>(r2, r3, r4, r5)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            return r0
        L56d:
            r0 = r12
            if (r0 <= 0) goto L5b4
            r0 = r15
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L597
            org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference
            r1 = r0
            r2 = r15
            r3 = r12
            r4 = r9
            r5 = r15
            int r5 = r5.length
            long[] r4 = lombok.eclipse.Eclipse.poss(r4, r5)
            r1.<init>(r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            return r0
        L597:
            org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference
            r1 = r0
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            r3 = r12
            r4 = r9
            long r4 = lombok.eclipse.Eclipse.pos(r4)
            r1.<init>(r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            return r0
        L5b4:
            r0 = r15
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L5d7
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r15
            r3 = r9
            r4 = r15
            int r4 = r4.length
            long[] r3 = lombok.eclipse.Eclipse.poss(r3, r4)
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            return r0
        L5d7:
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            r3 = r9
            long r3 = lombok.eclipse.Eclipse.pos(r3)
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            return r0
    }

    public static <A extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<A> createAnnotation(java.lang.Class<A> r14, lombok.eclipse.EclipseNode r15) {
            r0 = r15
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r16 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs()
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L126
            r0 = r18
            r1 = r0
            r22 = r1
            int r0 = r0.length
            r21 = r0
            r0 = 0
            r20 = r0
            goto L11f
        L29:
            r0 = r22
            r1 = r20
            r0 = r0[r1]
            r19 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = r19
            char[] r0 = r0.name
            r27 = r0
            r0 = r27
            if (r0 == 0) goto L60
            r0 = r27
            int r0 = r0.length
            if (r0 != 0) goto L66
        L60:
            java.lang.String r0 = "value"
            goto L72
        L66:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r19
            char[] r2 = r2.name
            r1.<init>(r2)
        L72:
            r28 = r0
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r29 = r0
            r0 = r29
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto L90
            r0 = r29
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayInitializer) r0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r26 = r0
            goto La0
        L90:
            r0 = r29
            if (r0 == 0) goto La0
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r1 = r0
            r2 = 0
            r3 = r29
            r1[r2] = r3
            r26 = r0
        La0:
            r0 = r26
            if (r0 == 0) goto Lfa
            r0 = r26
            r1 = r0
            r33 = r1
            int r0 = r0.length
            r32 = r0
            r0 = 0
            r31 = r0
            goto Lf3
        Lb3:
            r0 = r33
            r1 = r31
            r0 = r0[r1]
            r30 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r34 = r0
            r0 = r30
            r1 = 0
            r2 = r34
            java.lang.StringBuffer r0 = r0.print(r1, r2)
            r0 = r23
            r1 = r34
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r24
            r1 = r30
            boolean r0 = r0.add(r1)
            r0 = r25
            r1 = r30
            java.lang.Object r1 = lombok.eclipse.Eclipse.calculateValue(r1)
            boolean r0 = r0.add(r1)
            int r31 = r31 + 1
        Lf3:
            r0 = r31
            r1 = r32
            if (r0 < r1) goto Lb3
        Lfa:
            r0 = r26
            r30 = r0
            r0 = r17
            r1 = r28
            lombok.eclipse.handlers.EclipseHandlerUtil$1 r2 = new lombok.eclipse.handlers.EclipseHandlerUtil$1
            r3 = r2
            r4 = r15
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = 1
            r9 = r29
            r10 = r30
            r11 = r16
            r12 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r0.put(r1, r2)
            int r20 = r20 + 1
        L11f:
            r0 = r20
            r1 = r21
            if (r0 < r1) goto L29
        L126:
            r0 = r14
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r1 = r0
            r22 = r1
            int r0 = r0.length
            r21 = r0
            r0 = 0
            r20 = r0
            goto L188
        L136:
            r0 = r22
            r1 = r20
            r0 = r0[r1]
            r19 = r0
            r0 = r19
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto L14b
            goto L185
        L14b:
            r0 = r19
            java.lang.String r0 = r0.getName()
            r23 = r0
            r0 = r17
            r1 = r23
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L185
            r0 = r17
            r1 = r23
            lombok.eclipse.handlers.EclipseHandlerUtil$2 r2 = new lombok.eclipse.handlers.EclipseHandlerUtil$2
            r3 = r2
            r4 = r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r5
            r6.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r6
            r7.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = r7
            r8.<init>()
            r8 = 0
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.put(r1, r2)
        L185:
            int r20 = r20 + 1
        L188:
            r0 = r20
            r1 = r21
            if (r0 < r1) goto L136
            lombok.core.AnnotationValues r0 = new lombok.core.AnnotationValues
            r1 = r0
            r2 = r14
            r3 = r17
            r4 = r15
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static int toEclipseModifier(lombok.AccessLevel r3) {
            int[] r0 = $SWITCH_TABLE$lombok$AccessLevel()
            r1 = r3
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L30;
                case 3: goto L34;
                case 4: goto L30;
                case 5: goto L36;
                case 6: goto L36;
                default: goto L32;
            }
        L30:
            r0 = 0
            return r0
        L32:
            r0 = 1
            return r0
        L34:
            r0 = 4
            return r0
        L36:
            r0 = 2
            return r0
    }

    static void registerCreatedLazyGetter(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r4, char[] r5, org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
            r0 = r6
            boolean r0 = isBoolean(r0)
            if (r0 == 0) goto L12
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.FieldDeclaration, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.FieldDeclaration_booleanLazyGetter
            r1 = r4
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
        L12:
            return
    }

    public static boolean isBoolean(org.eclipse.jdt.internal.compiler.ast.TypeReference r3) {
            r0 = r3
            char[][] r0 = r0.getTypeName()
            java.lang.String r1 = "boolean"
            boolean r0 = lombok.eclipse.Eclipse.nameEquals(r0, r1)
            if (r0 == 0) goto L16
            r0 = r3
            int r0 = r0.dimensions()
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static lombok.eclipse.handlers.EclipseHandlerUtil.GetterMethod findGetter(lombok.eclipse.EclipseNode r5) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r6 = r0
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.FieldDeclaration, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.FieldDeclaration_booleanLazyGetter
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L2a
            r0 = r8
            boolean r0 = isBoolean(r0)
            if (r0 != 0) goto L2a
            r0 = 0
            goto L2b
        L2a:
            r0 = 1
        L2b:
            r9 = r0
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r10 = r0
            r0 = r5
            r1 = r9
            java.util.List r0 = toAllGetterNames(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto Le6
        L46:
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r10
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Ldc
        L5f:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 == r1) goto L79
            goto Ldc
        L79:
            r0 = r13
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto L87
            goto Ldc
        L87:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r15 = r0
            r0 = r11
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r15
            char[] r3 = r3.selector
            r2.<init>(r3)
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto La8
            goto Ldc
        La8:
            r0 = r15
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lb6
            goto Ldc
        Lb6:
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            if (r0 == 0) goto Lca
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            int r0 = r0.length
            if (r0 <= 0) goto Lca
            goto Ldc
        Lca:
            lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod
            r1 = r0
            r2 = r15
            char[] r2 = r2.selector
            r3 = r15
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.returnType
            r1.<init>(r2, r3)
            return r0
        Ldc:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5f
        Le6:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L46
            r0 = 0
            r11 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L143
        Lff:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L143
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r12
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L143
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r12
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r14 = r0
            r0 = r14
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            lombok.AccessLevel r0 = r0.value()
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L140
            r0 = 0
            return r0
        L140:
            r0 = 1
            r11 = r0
        L143:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lff
            r0 = r11
            if (r0 != 0) goto L1db
            r0 = r5
            boolean r0 = lombok.eclipse.handlers.HandleGetter.fieldQualifiesForGetterGeneration(r0)
            if (r0 == 0) goto L1db
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L1db
            r0 = r12
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L1d1
        L174:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L199
            java.lang.Class<lombok.Data> r0 = lombok.Data.class
            r1 = r13
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L199
            r0 = 1
            r11 = r0
        L199:
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L1d1
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r13
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L1d1
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r13
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r15 = r0
            r0 = r15
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            lombok.AccessLevel r0 = r0.value()
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L1ce
            r0 = 0
            return r0
        L1ce:
            r0 = 1
            r11 = r0
        L1d1:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L174
        L1db:
            r0 = r11
            if (r0 == 0) goto L1fd
            r0 = r5
            r1 = r9
            java.lang.String r0 = toGetterName(r0, r1)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L1ef
            r0 = 0
            return r0
        L1ef:
            lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod r0 = new lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod
            r1 = r0
            r2 = r12
            char[] r2 = r2.toCharArray()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L1fd:
            r0 = 0
            return r0
    }

    static boolean lookForGetter(lombok.eclipse.EclipseNode r3, lombok.core.handlers.HandlerUtil.FieldAccess r4) {
            r0 = r4
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            if (r0 != r1) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L59
        L1d:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L34
            goto L59
        L34:
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L59
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            boolean r0 = r0.lazy()
            if (r0 == 0) goto L59
            r0 = 1
            return r0
        L59:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1d
            r0 = 0
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.TypeReference getFieldType(lombok.eclipse.EclipseNode r3, lombok.core.handlers.HandlerUtil.FieldAccess r4) {
            r0 = r3
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L15
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            return r0
        L15:
            r0 = r3
            r1 = r4
            boolean r0 = lookForGetter(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r3
            lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod r0 = findGetter(r0)
            goto L27
        L26:
            r0 = 0
        L27:
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L37
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            return r0
        L37:
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.GetterMethod.access$0(r0)
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Expression createFieldAccessor(lombok.eclipse.EclipseNode r7, lombok.core.handlers.HandlerUtil.FieldAccess r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9) {
            r0 = r9
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r9
            int r0 = r0.sourceStart
        Lc:
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r9
            int r0 = r0.sourceEnd
        L19:
            r11 = r0
            r0 = r10
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r11
            long r1 = (long) r1
            long r0 = r0 | r1
            r12 = r0
            r0 = r7
            r1 = r8
            boolean r0 = lookForGetter(r0, r1)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L39
            r0 = r7
            lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod r0 = findGetter(r0)
            goto L3a
        L39:
            r0 = 0
        L3a:
            r15 = r0
            r0 = r15
            if (r0 != 0) goto Le1
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r16
            char[] r2 = r2.name
            r3 = r12
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r16
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lba
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L9a
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L9a
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r18
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r3
            char[] r3 = r3.name
            r4 = r12
            r2.<init>(r3, r4)
            r0.receiver = r1
            goto Lc9
        L9a:
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getName()
            char[] r2 = r2.toCharArray()
            r3 = r12
            r1.<init>(r2, r3)
            r19 = r0
            r0 = r9
            if (r0 == 0) goto Lb7
            r0 = r19
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lb7:
            r0 = r19
            return r0
        Lba:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4)
            r0.receiver = r1
        Lc9:
            r0 = r9
            if (r0 == 0) goto Lde
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lde:
            r0 = r17
            return r0
        Le1:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r16
            r1 = r10
            r0.sourceStart = r1
            r0 = r16
            r1 = r16
            r2 = r11
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r16
            r1 = r15
            char[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.GetterMethod.access$1(r1)
            r0.selector = r1
            r0 = r16
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Expression createFieldAccessor(lombok.eclipse.EclipseNode r7, lombok.core.handlers.HandlerUtil.FieldAccess r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9, char[] r10) {
            r0 = r9
            int r0 = r0.sourceStart
            r11 = r0
            r0 = r9
            int r0 = r0.sourceEnd
            r12 = r0
            r0 = r11
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r12
            long r1 = (long) r1
            long r0 = r0 | r1
            r13 = r0
            r0 = r7
            r1 = r8
            boolean r0 = lookForGetter(r0, r1)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L2b
            r0 = r7
            lombok.eclipse.handlers.EclipseHandlerUtil$GetterMethod r0 = findGetter(r0)
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L73
            r0 = 2
            char[] r0 = new char[r0]
            r18 = r0
            r0 = r18
            r1 = 0
            r2 = r10
            r0[r1] = r2
            r0 = r18
            r1 = 1
            r2 = r7
            java.lang.String r2 = r2.getName()
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            r0 = 2
            long[] r0 = new long[r0]
            r1 = r0
            r2 = 0
            r3 = r13
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r13
            r1[r2] = r3
            r19 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r18
            r3 = r19
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            return r0
        L73:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            r1 = r11
            r0.sourceStart = r1
            r0 = r17
            r1 = r17
            r2 = r12
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r10
            r4 = r13
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r17
            r1 = r16
            char[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.GetterMethod.access$1(r1)
            r0.selector = r1
            r0 = r17
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Expression createMethodAccessor(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8) {
            r0 = r8
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r8
            int r0 = r0.sourceStart
        Lc:
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r8
            int r0 = r0.sourceEnd
        L19:
            r10 = r0
            r0 = r9
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r10
            long r1 = (long) r1
            long r0 = r0 | r1
            r11 = r0
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r13 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r14
            r1 = r9
            r0.sourceStart = r1
            r0 = r14
            r1 = r14
            r2 = r10
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r13
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L75
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            goto Lb1
        L75:
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto Lb1
            r0 = r15
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto Lb1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r15
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r3
            char[] r3 = r3.name
            r4 = r11
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        Lb1:
            r0 = r14
            r1 = r13
            char[] r1 = r1.selector
            r0.selector = r1
            r0 = r14
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Expression createMethodAccessor(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8, char[] r9) {
            r0 = r8
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r8
            int r0 = r0.sourceStart
        Lc:
            r10 = r0
            r0 = r8
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r8
            int r0 = r0.sourceEnd
        L19:
            r11 = r0
            r0 = r10
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r11
            long r1 = (long) r1
            long r0 = r0 | r1
            r12 = r0
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r14 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            r1 = r10
            r0.sourceStart = r1
            r0 = r15
            r1 = r15
            r2 = r11
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r9
            r4 = r12
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            r1 = r14
            char[] r1 = r1.selector
            r0.selector = r1
            r0 = r15
            return r0
    }

    public static java.util.List<java.lang.String> toAllGetterNames(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllGetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllGetterNames(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllGetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toGetterName(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toGetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toGetterName(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toGetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllSetterNames(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllSetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllSetterNames(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllSetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toSetterName(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toSetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toSetterName(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toSetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithNames(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithNames(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithByNames(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithByNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithByNames(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithByNames(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithName(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithName(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithByName(lombok.eclipse.EclipseNode r5, boolean r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithByName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithByName(lombok.eclipse.EclipseNode r5, boolean r6, lombok.core.AnnotationValues<lombok.experimental.Accessors> r7) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r7
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r6
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithByName(r0, r1, r2, r3)
            return r0
    }

    public static boolean shouldMakeFinal(lombok.eclipse.EclipseNode r3, lombok.core.AnnotationValues<lombok.experimental.Accessors> r4) {
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r4
            r1 = r3
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            boolean r0 = lombok.core.handlers.HandlerUtil.shouldMakeFinal0(r0, r1)
            return r0
    }

    public static boolean shouldReturnThis(lombok.eclipse.EclipseNode r3, lombok.core.AnnotationValues<lombok.experimental.Accessors> r4) {
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r4
            r1 = r3
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            boolean r0 = lombok.core.handlers.HandlerUtil.shouldReturnThis0(r0, r1)
            return r0
    }

    public static boolean filterField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r3) {
            r0 = r3
            r1 = 1
            boolean r0 = filterField(r0, r1)
            return r0
    }

    public static boolean filterField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r3, boolean r4) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            if (r0 == 0) goto L19
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = (org.eclipse.jdt.internal.compiler.ast.AllocationExpression) r0
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = r0.enumConstant
            if (r0 == 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            if (r0 != 0) goto L22
            r0 = 0
            return r0
        L22:
            r0 = r3
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 <= 0) goto L37
            r0 = r3
            char[] r0 = r0.name
            r1 = 0
            char r0 = r0[r1]
            r1 = 36
            if (r0 != r1) goto L37
            r0 = 0
            return r0
        L37:
            r0 = r4
            if (r0 == 0) goto L47
            r0 = r3
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L47
            r0 = 0
            return r0
        L47:
            r0 = 1
            return r0
    }

    public static char[] removePrefixFromField(lombok.eclipse.EclipseNode r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L49
        Ld:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L49
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L52
            r0 = r7
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            java.lang.String[] r0 = r0.prefix()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4 = r0
            goto L52
        L49:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
        L52:
            r0 = r4
            if (r0 != 0) goto Lc0
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            goto Lbc
        L61:
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto Laa
        L6d:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto Laa
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r8 = r0
            r0 = r8
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto Lc0
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            java.lang.String[] r0 = r0.prefix()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4 = r0
            goto Lc0
        Laa:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6d
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
        Lbc:
            r0 = r5
            if (r0 != 0) goto L61
        Lc0:
            r0 = r4
            if (r0 != 0) goto Ld2
            r0 = r3
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.util.List<java.lang.String>> r1 = lombok.ConfigurationKeys.ACCESSORS_PREFIX
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.util.List r0 = (java.util.List) r0
            r4 = r0
        Ld2:
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf2
            r0 = r3
            java.lang.String r0 = r0.getName()
            r1 = r4
            java.lang.CharSequence r0 = lombok.core.handlers.HandlerUtil.removePrefix(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto Lf2
            r0 = r5
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            return r0
        Lf2:
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            char[] r0 = r0.name
            return r0
    }

    public static lombok.core.AnnotationValues<lombok.experimental.Accessors> getAccessorsForField(lombok.eclipse.EclipseNode r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L2c
        Ld:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L2c
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r4 = r0
            goto L35
        L2c:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
        L35:
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
            goto L8c
        L40:
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L7a
        L4c:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L7a
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r8 = r0
            r0 = r4
            if (r0 != 0) goto L73
            r0 = r8
            goto L79
        L73:
            r0 = r4
            r1 = r8
            lombok.core.AnnotationValues r0 = r0.integrate(r1)
        L79:
            r4 = r0
        L7a:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r5 = r0
        L8c:
            r0 = r5
            if (r0 != 0) goto L40
            r0 = r4
            if (r0 != 0) goto L9e
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r3
            lombok.core.AnnotationValues r0 = lombok.core.AnnotationValues.m58of(r0, r1)
            goto L9f
        L9e:
            r0 = r4
        L9f:
            return r0
    }

    public static lombok.eclipse.EclipseNode upToTypeNode(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            if (r0 != 0) goto L17
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "node"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r4 = r0
        L17:
            r0 = r4
            if (r0 == 0) goto L25
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto Lf
        L25:
            r0 = r4
            return r0
    }

    public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult fieldExists(java.lang.String r3, lombok.eclipse.EclipseNode r4) {
            r0 = r4
            lombok.eclipse.EclipseNode r0 = upToTypeNode(r0)
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L78
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L78
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 == 0) goto L78
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L71
        L34:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            char[] r0 = r0.name
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L4a
            goto L6e
        L4a:
            r0 = r5
            if (r0 != 0) goto L53
            r0 = r3
            char[] r0 = r0.toCharArray()
            r5 = r0
        L53:
            r0 = r11
            r1 = r5
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L6e
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = getGeneratedBy(r0)
            if (r0 != 0) goto L6a
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L6d
        L6a:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L6d:
            return r0
        L6e:
            int r8 = r8 + 1
        L71:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L34
        L78:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult methodExists(java.lang.String r5, lombok.eclipse.EclipseNode r6, int r7) {
            r0 = r5
            r1 = r6
            r2 = 1
            r3 = r7
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = methodExists(r0, r1, r2, r3)
            return r0
    }

    public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult methodExists(java.lang.String r5, lombok.eclipse.EclipseNode r6, boolean r7, int r8) {
            goto Lb
        L3:
            r0 = r6
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
        Lb:
            r0 = r6
            if (r0 == 0) goto L19
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L3
        L19:
            r0 = r6
            if (r0 == 0) goto L114
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L114
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r9 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto L114
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r13 = r1
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r11 = r0
            goto L10d
        L49:
            r0 = r13
            r1 = r11
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L10a
            r0 = r10
            char[] r0 = r0.selector
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L67
            goto L10a
        L67:
            r0 = r7
            if (r0 == 0) goto L7b
            r0 = r5
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            boolean r0 = r0.equals(r1)
            goto L88
        L7b:
            r0 = r5
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            boolean r0 = r0.equalsIgnoreCase(r1)
        L88:
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L10a
            r0 = r8
            r1 = -1
            if (r0 <= r1) goto Lec
            r0 = 0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            if (r0 == 0) goto Ldd
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            int r0 = r0.length
            if (r0 <= 0) goto Ldd
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            int r0 = r0.length
            r16 = r0
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            int r0 = r0.bits
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            if (r0 == 0) goto Ld9
            int r16 = r16 + (-1)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r17 = r0
            goto Ldd
        Ld9:
            r0 = r16
            r17 = r0
        Ldd:
            r0 = r8
            r1 = r16
            if (r0 < r1) goto L10a
            r0 = r8
            r1 = r17
            if (r0 <= r1) goto Lec
            goto L10a
        Lec:
            r0 = r6
            r1 = r10
            boolean r0 = isTolerate(r0, r1)
            if (r0 == 0) goto Lf8
            goto L10a
        Lf8:
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = getGeneratedBy(r0)
            if (r0 != 0) goto L106
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L109
        L106:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L109:
            return r0
        L10a:
            int r11 = r11 + 1
        L10d:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L49
        L114:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    public static boolean isTolerate(lombok.eclipse.EclipseNode r4, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r5) {
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 == 0) goto L34
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L2e
        L16:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            java.lang.Class<lombok.experimental.Tolerate> r0 = lombok.experimental.Tolerate.class
            r1 = r4
            r2 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L2b
            r0 = 1
            return r0
        L2b:
            int r7 = r7 + 1
        L2e:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L16
        L34:
            r0 = 0
            return r0
    }

    public static lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult constructorExists(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.eclipse.EclipseNode r0 = upToTypeNode(r0)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L73
            r0 = r3
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L73
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r4 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto L73
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L6d
        L31:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 != 0) goto L40
            goto L6a
        L40:
            r0 = r5
            int r0 = r0.bits
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L4e
            goto L6a
        L4e:
            r0 = r3
            r1 = r5
            boolean r0 = isTolerate(r0, r1)
            if (r0 == 0) goto L59
            goto L6a
        L59:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = getGeneratedBy(r0)
            if (r0 != 0) goto L66
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L69
        L66:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L69:
            return r0
        L6a:
            int r6 = r6 + 1
        L6d:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L31
        L73:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    public static lombok.eclipse.EclipseNode injectFieldAndMarkGenerated(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r6) {
            r0 = r6
            r1 = r5
            r2 = r6
            r3 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addSuppressWarningsAll(r1, r2, r3)
            r0.annotations = r1
            r0 = r6
            r1 = r5
            r2 = r6
            r3 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addGenerated(r1, r2, r3)
            r0.annotations = r1
            r0 = r5
            r1 = r6
            lombok.eclipse.EclipseNode r0 = injectField(r0, r1)
            return r0
    }

    public static lombok.eclipse.EclipseNode injectField(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r8) {
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r9 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 != 0) goto L21
            r0 = r9
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r1 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[r1]
            r0.fields = r1
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = 0
            r2 = r8
            r0[r1] = r2
            goto L86
        L21:
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            int r0 = r0.length
            r10 = r0
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[r0]
            r11 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r10
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = 0
            r12 = r0
            goto L63
        L41:
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            boolean r0 = isEnumConstant(r0)
            if (r0 != 0) goto L60
            r0 = r13
            boolean r0 = isGenerated(r0)
            if (r0 != 0) goto L60
            r0 = r13
            boolean r0 = isRecordField(r0)
            if (r0 == 0) goto L69
        L60:
            int r12 = r12 + 1
        L63:
            r0 = r12
            r1 = r10
            if (r0 < r1) goto L41
        L69:
            r0 = r11
            r1 = r12
            r2 = r11
            r3 = r12
            r4 = 1
            int r3 = r3 + r4
            r4 = r10
            r5 = r12
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r11
            r1 = r12
            r2 = r8
            r0[r1] = r2
            r0 = r9
            r1 = r11
            r0.fields = r1
        L86:
            r0 = r8
            boolean r0 = isEnumConstant(r0)
            if (r0 != 0) goto L97
            r0 = r8
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto La2
        L97:
            r0 = r9
            boolean r0 = lombok.eclipse.Eclipse.hasClinit(r0)
            if (r0 != 0) goto La2
            r0 = r9
            r0.addClinit()
        La2:
            r0 = r7
            r1 = r8
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.FIELD
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    public static boolean isEnumConstant(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r3) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            if (r0 == 0) goto L1a
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = (org.eclipse.jdt.internal.compiler.ast.AllocationExpression) r0
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = r0.enumConstant
            r1 = r3
            if (r0 != r1) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public static lombok.eclipse.EclipseNode injectMethod(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r8) {
            r0 = r8
            r1 = r7
            r2 = r8
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addSuppressWarningsAll(r1, r2, r3)
            r0.annotations = r1
            r0 = r8
            r1 = r7
            r2 = r8
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addGenerated(r1, r2, r3)
            r0.annotations = r1
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r9 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 != 0) goto L3b
            r0 = r9
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r1 = new org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[r1]
            r0.methods = r1
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = 0
            r2 = r8
            r0[r1] = r2
            goto Lee
        L3b:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto Lc7
            r0 = 0
            r10 = r0
            goto Lbe
        L47:
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r10
            r0 = r0[r1]
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto Lbb
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r10
            r0 = r0[r1]
            int r0 = r0.bits
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lbb
            r0 = r7
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r1 = r1.methods
            r2 = r10
            r1 = r1[r2]
            lombok.core.LombokNode r0 = r0.getNodeFor(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r11 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = new org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[r0]
            r12 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = 0
            r2 = r12
            r3 = 0
            r4 = r10
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = r12
            r3 = r10
            r4 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r4 = r4.methods
            int r4 = r4.length
            r5 = r10
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = r12
            r0.methods = r1
            r0 = r11
            if (r0 == 0) goto Lc7
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r1 = r11
            r0.removeChild(r1)
            goto Lc7
        Lbb:
            int r10 = r10 + 1
        Lbe:
            r0 = r10
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r1 = r1.methods
            int r1 = r1.length
            if (r0 < r1) goto L47
        Lc7:
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = new org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[r0]
            r10 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r4 = r4.methods
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r1 = r1.methods
            int r1 = r1.length
            r2 = r8
            r0[r1] = r2
            r0 = r9
            r1 = r10
            r0.methods = r1
        Lee:
            r0 = r7
            r1 = r8
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.METHOD
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    public static lombok.eclipse.EclipseNode injectType(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r7) {
            r0 = r7
            r1 = r6
            r2 = r7
            r3 = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addSuppressWarningsAll(r1, r2, r3)
            r0.annotations = r1
            r0 = r7
            r1 = r6
            r2 = r7
            r3 = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r3 = r3.annotations
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addGenerated(r1, r2, r3)
            r0.annotations = r1
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r8 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r0 = r0.memberTypes
            if (r0 != 0) goto L38
            r0 = r8
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            r0.memberTypes = r1
            goto L5f
        L38:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r0 = r0.memberTypes
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[r0]
            r9 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r0 = r0.memberTypes
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r4 = r4.memberTypes
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration[] r1 = r1.memberTypes
            int r1 = r1.length
            r2 = r7
            r0[r1] = r2
            r0 = r8
            r1 = r9
            r0.memberTypes = r1
        L5f:
            r0 = r6
            r1 = r7
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.TYPE
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] addSuppressWarningsAll(lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, org.eclipse.jdt.internal.compiler.ast.Annotation[] r15) {
            r0 = r15
            r16 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r13
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_SUPPRESSWARNINGS_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            r0 = r14
            r1 = r16
            char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_SUPPRESSWARNINGS
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r3 = new org.eclipse.jdt.internal.compiler.ast.ASTNode[r3]
            r4 = r3
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r6 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r7 = r6
            char[] r8 = lombok.eclipse.handlers.EclipseHandlerUtil.ALL
            r9 = 0
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11)
            r4[r5] = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = addAnnotation(r0, r1, r2, r3)
            r16 = r0
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r13
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_FINDBUGS_SUPPRESSWARNINGS_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L72
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair r0 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.EclipseHandlerUtil.JUSTIFICATION
            r3 = 0
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r5 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r6 = r5
            char[] r7 = lombok.eclipse.handlers.EclipseHandlerUtil.GENERATED_CODE
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10)
            r1.<init>(r2, r3, r4, r5)
            r17 = r0
            r0 = r14
            r1 = r16
            char[][] r2 = lombok.eclipse.handlers.EclipseHandlerUtil.EDU_UMD_CS_FINDBUGS_ANNOTATIONS_SUPPRESSFBWARNINGS
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r3 = new org.eclipse.jdt.internal.compiler.ast.ASTNode[r3]
            r4 = r3
            r5 = 0
            r6 = r17
            r4[r5] = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = addAnnotation(r0, r1, r2, r3)
            r16 = r0
        L72:
            r0 = r16
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] addGenerated(lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, org.eclipse.jdt.internal.compiler.ast.Annotation[] r15) {
            r0 = r15
            r16 = r0
            r0 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.shouldAddGenerated(r0)
            if (r0 == 0) goto L26
            r0 = r14
            r1 = r16
            char[][] r2 = lombok.eclipse.handlers.EclipseHandlerUtil.JAVAX_ANNOTATION_GENERATED
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r3 = new org.eclipse.jdt.internal.compiler.ast.ASTNode[r3]
            r4 = r3
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r6 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r7 = r6
            char[] r8 = lombok.eclipse.handlers.EclipseHandlerUtil.LOMBOK
            r9 = 0
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11)
            r4[r5] = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = addAnnotation(r0, r1, r2, r3)
            r16 = r0
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r13
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_LOMBOK_GENERATED_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            r0 = r14
            r1 = r16
            char[][] r2 = lombok.eclipse.handlers.EclipseHandlerUtil.LOMBOK_GENERATED
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = addAnnotation(r0, r1, r2)
            r16 = r0
        L42:
            r0 = r16
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Annotation[] addAnnotation(org.eclipse.jdt.internal.compiler.ast.ASTNode r5, org.eclipse.jdt.internal.compiler.ast.Annotation[] r6, char[][] r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = addAnnotation(r0, r1, r2, r3)
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Annotation[] addAnnotation(org.eclipse.jdt.internal.compiler.ast.ASTNode r6, org.eclipse.jdt.internal.compiler.ast.Annotation[] r7, char[][] r8, org.eclipse.jdt.internal.compiler.ast.ASTNode... r9) {
            r0 = r8
            r1 = r8
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L71
            r0 = r7
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L6a
        L19:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L43
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r15 = r0
            r0 = r15
            r1 = r8
            boolean r0 = java.util.Arrays.deepEquals(r0, r1)
            if (r0 == 0) goto L43
            r0 = r7
            return r0
        L43:
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L67
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r15 = r0
            r0 = r15
            r1 = r10
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L67
            r0 = r7
            return r0
        L67:
            int r12 = r12 + 1
        L6a:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L19
        L71:
            r0 = r6
            int r0 = r0.sourceStart
            r11 = r0
            r0 = r6
            int r0 = r0.sourceEnd
            r12 = r0
            r0 = r6
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = generateQualifiedTypeRef(r0, r1)
            r13 = r0
            r0 = r9
            if (r0 == 0) goto Ld7
            r0 = r9
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto Ld7
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Expression
            if (r0 == 0) goto Ld7
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            r1 = r0
            r2 = r13
            r3 = r11
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r15
            r1 = r12
            r0.declarationSourceEnd = r1
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r1 = r11
            r0.sourceStart = r1
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r1 = r12
            r0.sourceEnd = r1
            r0 = r15
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = (org.eclipse.jdt.internal.compiler.ast.Expression) r1
            r0.memberValue = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.memberValue
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            r14 = r0
            goto L192
        Ld7:
            r0 = r9
            if (r0 == 0) goto L17a
            r0 = r9
            int r0 = r0.length
            r1 = 1
            if (r0 < r1) goto L17a
            r0 = r9
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MemberValuePair> r1 = org.eclipse.jdt.internal.compiler.ast.MemberValuePair.class
            boolean r0 = arrayHasOnlyElementsOfType(r0, r1)
            if (r0 == 0) goto L17a
            org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.NormalAnnotation
            r1 = r0
            r2 = r13
            r3 = r11
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r15
            r1 = r12
            r0.declarationSourceEnd = r1
            r0 = r15
            r1 = r9
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r1 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair[r1]
            r0.memberValuePairs = r1
            r0 = 0
            r16 = r0
            goto L133
        L10f:
            r0 = r9
            r1 = r16
            r0 = r0[r1]
            r1 = r11
            r0.sourceStart = r1
            r0 = r9
            r1 = r16
            r0 = r0[r1]
            r1 = r12
            r0.sourceEnd = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r1 = r16
            r2 = r9
            r3 = r16
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair r2 = (org.eclipse.jdt.internal.compiler.ast.MemberValuePair) r2
            r0[r1] = r2
            int r16 = r16 + 1
        L133:
            r0 = r16
            r1 = r9
            int r1 = r1.length
            if (r0 < r1) goto L10f
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r1 = 0
            r0 = r0[r1]
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r1 = r11
            r0.sourceStart = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r1 = r12
            r0.sourceEnd = r1
            r0 = r15
            r14 = r0
            goto L192
        L17a:
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            r2 = r13
            r3 = r11
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r15
            r1 = r12
            r0.declarationSourceEnd = r1
            r0 = r15
            r14 = r0
        L192:
            r0 = r14
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r7
            if (r0 != 0) goto L1a7
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r14
            r1[r2] = r3
            return r0
        L1a7:
            r0 = r7
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r15 = r0
            r0 = r7
            r1 = 0
            r2 = r15
            r3 = 0
            r4 = r7
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r15
            r1 = r7
            int r1 = r1.length
            r2 = r14
            r0[r1] = r2
            r0 = r15
            return r0
    }

    public static void addCheckerFrameworkReturnsReceiver(org.eclipse.jdt.internal.compiler.ast.TypeReference r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8, lombok.core.configuration.CheckerFrameworkVersion r9) {
            r0 = r9
            boolean r0 = r0.generateReturnsReceiver()
            if (r0 == 0) goto L2f
            r0 = r8
            java.lang.String r1 = "org.checkerframework.common.returnsreceiver.qual.This"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = generateNamedAnnotation(r0, r1)
            r10 = r0
            r0 = r7
            int r0 = r0.getAnnotatableLevels()
            r11 = r0
            r0 = r7
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r11
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            r0[r1] = r2
        L2f:
            return
    }

    private static boolean arrayHasOnlyElementsOfType(java.lang.Object[] r3, java.lang.Class<?> r4) {
            r0 = r3
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L1e
        Lc:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.isInstance(r1)
            if (r0 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            int r6 = r6 + 1
        L1e:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto Lc
            r0 = 1
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Statement generateNullCheck(org.eclipse.jdt.internal.compiler.ast.TypeReference r8, char[] r9, lombok.eclipse.EclipseNode r10, java.lang.String r11) {
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullCheckExceptionType> r1 = lombok.ConfigurationKeys.NON_NULL_EXCEPTION_TYPE
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullCheckExceptionType r0 = (lombok.core.configuration.NullCheckExceptionType) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L19
            lombok.core.configuration.NullCheckExceptionType r0 = lombok.core.configuration.NullCheckExceptionType.NULL_POINTER_EXCEPTION
            r12 = r0
        L19:
            r0 = r10
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r13 = r0
            r0 = r13
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r13
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
            r0 = r8
            if (r0 == 0) goto L49
            r0 = r8
            boolean r0 = lombok.eclipse.Eclipse.isPrimitive(r0)
            if (r0 == 0) goto L49
            r0 = 0
            return r0
        L49:
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r9
            r3 = r16
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r18
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = r12
            java.lang.String r3 = new java.lang.String
            r4 = r3
            r5 = r9
            r4.<init>(r5)
            r4 = r11
            java.lang.String r2 = r2.toExceptionMessage(r3, r4)
            char[] r2 = r2.toCharArray()
            r3 = r14
            r4 = r15
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r19 = r0
            r0 = r19
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r12
            lombok.core.LombokImmutableList r0 = r0.getMethod()
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L135
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r21
            r1 = r14
            r0.sourceStart = r1
            r0 = r21
            r1 = r15
            r0.sourceEnd = r1
            r0 = r21
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r20
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            char[] r0 = new char[r0]
            r22 = r0
            r0 = 0
            r23 = r0
            goto Ld6
        Lc1:
            r0 = r22
            r1 = r23
            r2 = r20
            r3 = r23
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r23 = r23 + 1
        Ld6:
            r0 = r23
            r1 = r20
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            if (r0 < r1) goto Lc1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            r3 = r22
            r4 = r20
            int r4 = r4.size()
            r5 = 1
            int r4 = r4 - r5
            long[] r4 = new long[r4]
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r21
            r1 = r20
            r2 = r20
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r21
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r18
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r19
            r2[r3] = r4
            r0.arguments = r1
            r0 = r21
            return r0
        L135:
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r21
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r14
            r3 = r15
            r1.<init>(r2, r3)
            r22 = r0
            r0 = r22
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r12
            lombok.core.configuration.NullCheckExceptionType r1 = lombok.core.configuration.NullCheckExceptionType.ASSERTION
            if (r0 != r1) goto L168
            r0 = 29
            goto L16a
        L168:
            r0 = 18
        L16a:
            r23 = r0
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r18
            r3 = r22
            r4 = r23
            r1.<init>(r2, r3, r4)
            r24 = r0
            r0 = r24
            r1 = r14
            r0.sourceStart = r1
            r0 = r24
            r1 = r24
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.statementEnd = r1
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r12
            lombok.core.configuration.NullCheckExceptionType r1 = lombok.core.configuration.NullCheckExceptionType.ASSERTION
            if (r0 != r1) goto L1b9
            org.eclipse.jdt.internal.compiler.ast.AssertStatement r0 = new org.eclipse.jdt.internal.compiler.ast.AssertStatement
            r1 = r0
            r2 = r19
            r3 = r24
            r4 = r14
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r25
            return r0
        L1b9:
            r0 = r12
            java.lang.String r0 = r0.getExceptionType()
            r25 = r0
            r0 = 1
            r26 = r0
            r0 = 0
            r27 = r0
            goto L1db
        L1c9:
            r0 = r25
            r1 = r27
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 != r1) goto L1d8
            int r26 = r26 + 1
        L1d8:
            int r27 = r27 + 1
        L1db:
            r0 = r27
            r1 = r25
            int r1 = r1.length()
            if (r0 < r1) goto L1c9
            r0 = r26
            long[] r0 = new long[r0]
            r27 = r0
            r0 = r27
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            r3 = r25
            char[][] r3 = lombok.eclipse.Eclipse.fromQualifiedName(r3)
            r4 = r27
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r21
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r19
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.ThrowStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ThrowStatement
            r1 = r0
            r2 = r21
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r29 = r0
            r0 = r29
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r28
            r2[r3] = r4
            r0.statements = r1
            r0 = r29
            r1 = r14
            r0.sourceStart = r1
            r0 = r29
            r1 = r15
            r0.sourceEnd = r1
            r0 = r29
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r24
            r3 = r29
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r30 = r0
            r0 = r30
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r30
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Statement generateNullCheck(org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r5, lombok.eclipse.EclipseNode r6, java.lang.String r7) {
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r5
            char[] r1 = r1.name
            r2 = r6
            r3 = r7
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = generateNullCheck(r0, r1, r2, r3)
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation makeMarkerAnnotation(char[][] r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8) {
            r0 = r8
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r8
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r9 = r0
            r0 = r7
            int r0 = r0.length
            long[] r0 = new long[r0]
            r11 = r0
            r0 = r11
            r1 = r9
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            r2 = r12
            r3 = r9
            r4 = 32
            long r3 = r3 >> r4
            int r3 = (int) r3
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            r1 = r13
            r2 = r13
            r3 = r9
            int r3 = (int) r3
            r4 = r3; r3 = r2; r2 = r4; 
            r3.statementEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.sourceEnd = r3
            r0.declarationSourceEnd = r1
            r0 = r13
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r13
            return r0
    }

    public static java.util.List<java.lang.Integer> createListOfNonExistentFields(java.util.List<java.lang.String> r4, lombok.eclipse.EclipseNode r5, boolean r6, boolean r7) {
            r0 = r4
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r8 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L97
        L16:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            goto La1
        L2e:
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L3c
            goto L97
        L3c:
            r0 = r6
            if (r0 == 0) goto L65
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L54
            goto L97
        L54:
            r0 = r9
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L65
            goto L97
        L65:
            r0 = r7
            if (r0 == 0) goto L7e
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.modifiers
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L7e
            goto L97
        L7e:
            r0 = r4
            r1 = r9
            java.lang.String r1 = r1.getName()
            int r0 = r0.indexOf(r1)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 <= r1) goto L97
            r0 = r8
            r1 = r11
            r2 = 1
            r0[r1] = r2
        L97:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16
        La1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 0
            r10 = r0
            goto Lc8
        Lb0:
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            if (r0 != 0) goto Lc5
            r0 = r9
            r1 = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        Lc5:
            int r10 = r10 + 1
        Lc8:
            r0 = r10
            r1 = r4
            int r1 = r1.size()
            if (r0 < r1) goto Lb0
            r0 = r9
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.CastExpression makeCastExpression(org.eclipse.jdt.internal.compiler.ast.Expression r7, org.eclipse.jdt.internal.compiler.ast.TypeReference r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9) {
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.castExpressionConstructorIsTypeRefBased     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            if (r0 == 0) goto L1f
            java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.CastExpression> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.castExpressionConstructor     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r2 = r1
            r3 = 1
            r4 = r8
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            org.eclipse.jdt.internal.compiler.ast.CastExpression r0 = (org.eclipse.jdt.internal.compiler.ast.CastExpression) r0     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r10 = r0
            goto Lef
        L1f:
            r0 = r8
            r11 = r0
            r0 = r8
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.SingleTypeReference> r1 = org.eclipse.jdt.internal.compiler.ast.SingleTypeReference.class
            if (r0 != r1) goto L75
            r0 = r8
            boolean r0 = lombok.eclipse.Eclipse.isPrimitive(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            if (r0 != 0) goto L75
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r1 = r0
            r2 = r12
            char[] r2 = r2.token     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r11 = r0
            r0 = r11
            r1 = r11
            int r1 = r1.bits     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r2 = -4
            r1 = r1 & r2
            r2 = 4
            r1 = r1 | r2
            r0.bits = r1     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r0 = r11
            r1 = r12
            int r1 = r1.sourceStart     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r0.sourceStart = r1     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r0 = r11
            r1 = r12
            int r1 = r1.sourceEnd     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r0.sourceEnd = r1     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r0 = r11
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            goto Lba
        L75:
            r0 = r8
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference> r1 = org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference.class
            if (r0 != r1) goto Lba
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r1 = r0
            r2 = r12
            char[][] r2 = r2.tokens     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r3 = r12
            long[] r3 = r3.sourcePositions     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            long[] r3 = copy(r3)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r4 = r12
            int r4 = r4.sourceStart     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r5 = r12
            int r5 = r5.sourceEnd     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r11 = r0
            r0 = r11
            r1 = r11
            int r1 = r1.bits     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r2 = -4
            r1 = r1 & r2
            r2 = 4
            r1 = r1 | r2
            r0.bits = r1     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r0 = r11
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
        Lba:
            java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.CastExpression> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.castExpressionConstructor     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            org.eclipse.jdt.internal.compiler.ast.CastExpression r0 = (org.eclipse.jdt.internal.compiler.ast.CastExpression) r0     // Catch: java.lang.reflect.InvocationTargetException -> Ld4 java.lang.IllegalAccessException -> Ldf java.lang.InstantiationException -> Le7
            r10 = r0
            goto Lef
        Ld4:
            r11 = move-exception
            r0 = r11
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        Ldf:
            r11 = move-exception
            r0 = r11
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        Le7:
            r11 = move-exception
            r0 = r11
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        Lef:
            r0 = r10
            r1 = r9
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r10
            r1 = r9
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r10
            r1 = r9
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            r0 = r10
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r10
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.IntLiteral makeIntLiteral(char[] r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8) {
            r0 = r8
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r8
            int r0 = r0.sourceStart
        Lc:
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r8
            int r0 = r0.sourceEnd
        L19:
            r10 = r0
            java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.IntLiteral> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.intLiteralConstructor
            if (r0 == 0) goto L44
            java.lang.reflect.Constructor<org.eclipse.jdt.internal.compiler.ast.IntLiteral> r0 = lombok.eclipse.handlers.EclipseHandlerUtil.intLiteralConstructor
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.Object r0 = lombok.permit.Permit.newInstanceSneaky(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = (org.eclipse.jdt.internal.compiler.ast.IntLiteral) r0
            r11 = r0
            goto L66
        L44:
            java.lang.reflect.Method r0 = lombok.eclipse.handlers.EclipseHandlerUtil.intLiteralFactoryMethod
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = (org.eclipse.jdt.internal.compiler.ast.IntLiteral) r0
            r11 = r0
        L66:
            r0 = r8
            if (r0 == 0) goto L71
            r0 = r11
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
        L71:
            r0 = r11
            return r0
    }

    private static boolean isAllValidOnXCharacters(char[] r3) {
            r0 = r3
            if (r0 == 0) goto L9
            r0 = r3
            int r0 = r0.length
            if (r0 != 0) goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = r3
            r1 = r0
            r7 = r1
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r5 = r0
            goto L38
        L16:
            r0 = r7
            r1 = r5
            char r0 = r0[r1]
            r4 = r0
            r0 = r4
            r1 = 95
            if (r0 == r1) goto L35
            r0 = r4
            r1 = 88
            if (r0 == r1) goto L35
            r0 = r4
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == r1) goto L35
            r0 = r4
            r1 = 36
            if (r0 == r1) goto L35
            r0 = 0
            return r0
        L35:
            int r5 = r5 + 1
        L38:
            r0 = r5
            r1 = r6
            if (r0 < r1) goto L16
            r0 = 1
            return r0
    }

    public static void addError(java.lang.String r5, lombok.eclipse.EclipseNode r6) {
            r0 = r6
            int r0 = r0.getLatestJavaSpecSupported()
            r1 = 8
            if (r0 >= r1) goto L27
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The correct format is "
            r2.<init>(r3)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "_={@SomeAnnotation, @SomeOtherAnnotation})"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            goto L42
        L27:
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The correct format is "
            r2.<init>(r3)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "=@__({@SomeAnnotation, @SomeOtherAnnotation}))"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
        L42:
            return
    }

    public static java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> unboxAndRemoveAnnotationParameter(org.eclipse.jdt.internal.compiler.ast.Annotation r7, java.lang.String r8, java.lang.String r9, lombok.eclipse.EclipseNode r10) {
            java.lang.String r0 = "value"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Lombok cannot unbox 'value' from SingleMemberAnnotation at this time."
            r1.<init>(r2)
            throw r0
        L15:
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.NormalAnnotation> r0 = org.eclipse.jdt.internal.compiler.ast.NormalAnnotation.class
            r1 = r7
            java.lang.Class r1 = r1.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L26:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r0 = (org.eclipse.jdt.internal.compiler.ast.NormalAnnotation) r0
            r11 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L3c
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L3c:
            r0 = r8
            char[] r0 = r0.toCharArray()
            r13 = r0
            r0 = 0
            r14 = r0
            goto L269
        L48:
            r0 = r12
            r1 = r14
            r0 = r0[r1]
            char[] r0 = r0.name
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L5a
            goto L266
        L5a:
            r0 = r16
            int r0 = r0.length
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto L66
            goto L266
        L66:
            r0 = 0
            r17 = r0
            goto L7f
        L6c:
            r0 = r16
            r1 = r17
            char r0 = r0[r1]
            r1 = r13
            r2 = r17
            char r1 = r1[r2]
            if (r0 == r1) goto L7c
            goto L266
        L7c:
            int r17 = r17 + 1
        L7f:
            r0 = r17
            r1 = r13
            int r1 = r1.length
            if (r0 < r1) goto L6c
            r0 = r16
            int r0 = r0.length
            r1 = r13
            int r1 = r1.length
            if (r0 <= r1) goto L94
            r0 = 1
            goto L95
        L94:
            r0 = 0
        L95:
            r15 = r0
            r0 = r13
            int r0 = r0.length
            r17 = r0
            goto Laf
        L9f:
            r0 = r16
            r1 = r17
            char r0 = r0[r1]
            r1 = 95
            if (r0 == r1) goto Lac
            goto L266
        Lac:
            int r17 = r17 + 1
        Laf:
            r0 = r17
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto L9f
            r0 = r12
            r1 = r14
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r17 = r0
            r0 = r12
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = new org.eclipse.jdt.internal.compiler.ast.MemberValuePair[r0]
            r18 = r0
            r0 = r14
            if (r0 <= 0) goto Ldb
            r0 = r12
            r1 = 0
            r2 = r18
            r3 = 0
            r4 = r14
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        Ldb:
            r0 = r14
            r1 = r12
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto Lfa
            r0 = r12
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            r2 = r18
            r3 = r14
            r4 = r12
            int r4 = r4.length
            r5 = r14
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        Lfa:
            r0 = r11
            r1 = r18
            r0.memberValuePairs = r1
            r0 = 0
            r19 = r0
            r0 = r17
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto L121
            r0 = r15
            if (r0 != 0) goto L11a
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L11a:
            r0 = r17
            r19 = r0
            goto L1db
        L121:
            r0 = r17
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Annotation
            if (r0 != 0) goto L132
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L132:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L1c6
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            boolean r0 = isAllValidOnXCharacters(r0)
            if (r0 == 0) goto L1c6
            r0 = r20
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            if (r0 == 0) goto L161
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L161:
            r0 = r20
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NormalAnnotation
            if (r0 == 0) goto L1a8
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r0 = (org.eclipse.jdt.internal.compiler.ast.NormalAnnotation) r0
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L17e
            r0 = r21
            int r0 = r0.length
            if (r0 != 0) goto L182
        L17e:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L182:
            r0 = r21
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L1db
            java.lang.String r0 = "value"
            char[] r0 = r0.toCharArray()
            r1 = r21
            r2 = 0
            r1 = r1[r2]
            char[] r1 = r1.name
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L1db
            r0 = r21
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            r19 = r0
            goto L1db
        L1a8:
            r0 = r20
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            if (r0 == 0) goto L1bd
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = (org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation) r0
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.memberValue
            r19 = r0
            goto L1db
        L1bd:
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1c6:
            r0 = r15
            if (r0 == 0) goto L1d2
            r0 = r20
            r19 = r0
            goto L1db
        L1d2:
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1db:
            r0 = r19
            if (r0 != 0) goto L1e9
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1e9:
            r0 = r19
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Annotation
            if (r0 == 0) goto L1fa
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L1fa:
            r0 = r19
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto L25d
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayInitializer) r0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r20 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r20
            if (r0 == 0) goto L25a
            r0 = r20
            r1 = r0
            r25 = r1
            int r0 = r0.length
            r24 = r0
            r0 = 0
            r23 = r0
            goto L253
        L228:
            r0 = r25
            r1 = r23
            r0 = r0[r1]
            r22 = r0
            r0 = r22
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Annotation
            if (r0 == 0) goto L247
            r0 = r21
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.Annotation r1 = (org.eclipse.jdt.internal.compiler.ast.Annotation) r1
            boolean r0 = r0.add(r1)
            goto L250
        L247:
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L250:
            int r23 = r23 + 1
        L253:
            r0 = r23
            r1 = r24
            if (r0 < r1) goto L228
        L25a:
            r0 = r21
            return r0
        L25d:
            r0 = r9
            r1 = r10
            addError(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L266:
            int r14 = r14 + 1
        L269:
            r0 = r14
            r1 = r12
            int r1 = r1.length
            if (r0 < r1) goto L48
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.NameReference createNameReference(java.lang.String r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r0 = r4
            r1 = r3
            char[][] r1 = lombok.eclipse.Eclipse.fromQualifiedName(r1)
            org.eclipse.jdt.internal.compiler.ast.NameReference r0 = generateQualifiedNameRef(r0, r1)
            return r0
    }

    private static long[] copy(long[] r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto Lf
        L8:
            r0 = r2
            java.lang.Object r0 = r0.clone()
            long[] r0 = (long[]) r0
        Lf:
            return r0
    }

    public static <T> T[] concat(T[] r6, T[] r7, java.lang.Class<T> r8) {
            r0 = r6
            if (r0 != 0) goto L6
            r0 = r7
            return r0
        L6:
            r0 = r7
            if (r0 != 0) goto Lc
            r0 = r6
            return r0
        Lc:
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L13
            r0 = r7
            return r0
        L13:
            r0 = r7
            int r0 = r0.length
            if (r0 != 0) goto L1a
            r0 = r6
            return r0
        L1a:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            r2 = r7
            int r2 = r2.length
            int r1 = r1 + r2
            java.lang.Object[] r0 = newArray(r0, r1)
            r9 = r0
            r0 = r6
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r6
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r2 = r9
            r3 = r6
            int r3 = r3.length
            r4 = r7
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            return r0
    }

    private static <T> T[] newArray(java.lang.Class<T> r3, int r4) {
            r0 = r3
            r1 = r4
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static boolean isDirectDescendantOfObject(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 != 0) goto L15
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "not a type node"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r5 = r0
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.superclass
            if (r0 != 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.superclass
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Object"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            r0 = r6
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            r0 = 0
            return r0
        L44:
            r0 = 1
            return r0
    }

    public static void createRelevantNullableAnnotation(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getNullableAnnotation()
            r3 = r7
            boolean r3 = r3.isTypeUse()
            applyAnnotationToMethodDecl(r0, r1, r2, r3)
            return
    }

    public static void createRelevantNonNullAnnotation(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r6) {
            r0 = r5
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getNonNullAnnotation()
            r3 = r7
            boolean r3 = r3.isTypeUse()
            applyAnnotationToMethodDecl(r0, r1, r2, r3)
            return
    }

    public static void createRelevantNullableAnnotation(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.Argument r7, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r8) {
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.String r3 = r3.getNullableAnnotation()
            r4 = r9
            boolean r4 = r4.isTypeUse()
            applyAnnotationToVarDecl(r0, r1, r2, r3, r4)
            return
    }

    public static void createRelevantNullableAnnotation(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.Argument r7, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r8, java.util.List<lombok.core.configuration.NullAnnotationLibrary> r9) {
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L1f
            r0 = r9
            r1 = r10
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L20
        L1f:
            return
        L20:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            java.lang.String r3 = r3.getNullableAnnotation()
            r4 = r10
            boolean r4 = r4.isTypeUse()
            applyAnnotationToVarDecl(r0, r1, r2, r3, r4)
            return
    }

    public static void createRelevantNonNullAnnotation(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.Argument r7, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r8) {
            r0 = r6
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.String r3 = r3.getNonNullAnnotation()
            r4 = r9
            boolean r4 = r4.isTypeUse()
            applyAnnotationToVarDecl(r0, r1, r2, r3, r4)
            return
    }

    private static void applyAnnotationToMethodDecl(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r8, java.lang.String r9, boolean r10) {
            r0 = r9
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            r11 = r0
            r0 = 0
            r12 = r0
            goto L1f
        Le:
            r0 = r9
            r1 = r12
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 != r1) goto L1c
            int r11 = r11 + 1
        L1c:
            int r12 = r12 + 1
        L1f:
            r0 = r12
            r1 = r9
            int r1 = r1.length()
            if (r0 < r1) goto Le
            r0 = r11
            long[] r0 = new long[r0]
            r12 = r0
            r0 = r12
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r3 = r2
            r4 = r9
            char[][] r4 = lombok.eclipse.Eclipse.fromQualifiedName(r4)
            r5 = r12
            r3.<init>(r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r10
            if (r0 == 0) goto L62
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            if (r0 == 0) goto L62
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r1 = 2
            if (r0 >= r1) goto La3
        L62:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L76
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r14 = r0
            goto L90
        L76:
            r0 = r14
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r15 = r0
            r0 = r14
            r1 = 0
            r2 = r15
            r3 = 0
            r4 = r14
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r15
            r14 = r0
        L90:
            r0 = r14
            r1 = r14
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r13
            r0[r1] = r2
            r0 = r8
            r1 = r14
            r0.annotations = r1
            goto L119
        La3:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r14 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            if (r0 != 0) goto Lc3
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
        Lc3:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 != 0) goto Ldf
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r15 = r0
            goto Lf9
        Ldf:
            r0 = r15
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r16 = r0
            r0 = r15
            r1 = 0
            r2 = r16
            r3 = 1
            r4 = r15
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r16
            r15 = r0
        Lf9:
            r0 = r15
            r1 = 0
            r2 = r13
            r0[r1] = r2
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            r2 = r15
            r0[r1] = r2
            r0 = r8
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
        L119:
            return
    }

    private static void applyAnnotationToVarDecl(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.Argument r8, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r9, java.lang.String r10, boolean r11) {
            r0 = r10
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            r12 = r0
            r0 = 0
            r13 = r0
            goto L1f
        Le:
            r0 = r10
            r1 = r13
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 != r1) goto L1c
            int r12 = r12 + 1
        L1c:
            int r13 = r13 + 1
        L1f:
            r0 = r13
            r1 = r10
            int r1 = r1.length()
            if (r0 < r1) goto Le
            r0 = r12
            long[] r0 = new long[r0]
            r13 = r0
            r0 = r13
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r3 = r2
            r4 = r10
            char[][] r4 = lombok.eclipse.Eclipse.fromQualifiedName(r4)
            r5 = r13
            r3.<init>(r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r11
            if (r0 == 0) goto L5c
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r1 = 2
            if (r0 >= r1) goto L9d
        L5c:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L70
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r15 = r0
            goto L8a
        L70:
            r0 = r15
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r16 = r0
            r0 = r15
            r1 = 0
            r2 = r16
            r3 = 0
            r4 = r15
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r16
            r15 = r0
        L8a:
            r0 = r15
            r1 = r15
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r14
            r0[r1] = r2
            r0 = r8
            r1 = r15
            r0.annotations = r1
            goto L12e
        L9d:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r15 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            if (r0 != 0) goto Lbd
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
        Lbd:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r15
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            if (r0 != 0) goto Ld9
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r16 = r0
            goto Lf3
        Ld9:
            r0 = r16
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r17 = r0
            r0 = r16
            r1 = 0
            r2 = r17
            r3 = 1
            r4 = r16
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r17
            r16 = r0
        Lf3:
            r0 = r16
            r1 = 0
            r2 = r14
            r0[r1] = r2
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r15
            r2 = 1
            int r1 = r1 - r2
            r2 = r16
            r0[r1] = r2
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r8
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r9
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
        L12e:
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.NameReference generateQualifiedNameRef(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, char[]... r8) {
            r0 = r7
            int r0 = r0.sourceStart
            r9 = r0
            r0 = r7
            int r0 = r0.sourceEnd
            r10 = r0
            r0 = r9
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r10
            long r1 = (long) r1
            long r0 = r0 | r1
            r11 = r0
            r0 = r8
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L2d
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r8
            r3 = r8
            int r3 = r3.length
            long[] r3 = new long[r3]
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            goto L3b
        L2d:
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r8
            r3 = 0
            r2 = r2[r3]
            r3 = r11
            r1.<init>(r2, r3)
            r13 = r0
        L3b:
            r0 = r13
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r13
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference generateQualifiedTypeRef(org.eclipse.jdt.internal.compiler.ast.ASTNode r6, char[]... r7) {
            r0 = r6
            int r0 = r0.sourceStart
            r8 = r0
            r0 = r6
            int r0 = r0.sourceEnd
            r9 = r0
            r0 = r8
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r9
            long r1 = (long) r1
            long r0 = r0 | r1
            r10 = r0
            r0 = r6
            r1 = r7
            int r1 = r1.length
            long[] r0 = lombok.eclipse.Eclipse.poss(r0, r1)
            r13 = r0
            r0 = r7
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L31
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r7
            r3 = r13
            r1.<init>(r2, r3)
            r12 = r0
            goto L3f
        L31:
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r7
            r3 = 0
            r2 = r2[r3]
            r3 = r10
            r1.<init>(r2, r3)
            r12 = r0
        L3f:
            r0 = r12
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = setGeneratedBy(r0, r1)
            r0 = r12
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.TypeReference createTypeReference(java.lang.String r3, org.eclipse.jdt.internal.compiler.ast.ASTNode r4) {
            r0 = r4
            r1 = r3
            char[][] r1 = lombok.eclipse.Eclipse.fromQualifiedName(r1)
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = generateQualifiedTypeRef(r0, r1)
            return r0
    }

    public static boolean isClass(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            r1 = 16802304(0x1006200, double:8.301441E-317)
            boolean r0 = isTypeAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isClassOrEnum(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            r1 = 16785920(0x1002200, double:8.2933464E-317)
            boolean r0 = isTypeAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isClassEnumOrRecord(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            r1 = 8704(0x2200, double:4.3003E-320)
            boolean r0 = isTypeAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isRecord(lombok.eclipse.EclipseNode r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r4 = r0
        L14:
            r0 = r4
            if (r0 != 0) goto L1c
            r0 = 0
            goto L20
        L1c:
            r0 = r4
            int r0 = r0.modifiers
        L20:
            r5 = r0
            r0 = r5
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = 1
            return r0
        L2b:
            r0 = 0
            return r0
    }

    public static boolean isRecordField(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L1d
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            int r0 = r0.modifiers
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L1d
            r0 = 1
            return r0
        L1d:
            r0 = 0
            return r0
    }

    public static boolean isRecordField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r3) {
            r0 = r3
            int r0 = r0.modifiers
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    static boolean isTypeAndDoesNotHaveFlags(lombok.eclipse.EclipseNode r5, long r6) {
            r0 = 0
            r8 = r0
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L14
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r8 = r0
        L14:
            r0 = r8
            if (r0 != 0) goto L1c
            r0 = 0
            goto L20
        L1c:
            r0 = r8
            int r0 = r0.modifiers
        L20:
            r9 = r0
            r0 = r9
            long r0 = (long) r0
            r1 = r6
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            r0 = 1
            return r0
        L2e:
            r0 = 0
            return r0
    }

    public static boolean isStaticAllowed(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            boolean r0 = r0.isStatic()
            if (r0 != 0) goto L27
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            if (r0 == 0) goto L27
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 == r1) goto L27
            r0 = r3
            boolean r0 = isRecord(r0)
            if (r0 != 0) goto L27
            r0 = 0
            return r0
        L27:
            r0 = 1
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration[] getRecordComponents(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3) {
            r0 = r3
            if (r0 == 0) goto Lf
            r0 = r3
            int r0 = r0.modifiers
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            java.lang.reflect.Field r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.TYPE_DECLARATION_RECORD_COMPONENTS     // Catch: java.lang.Exception -> L1c
            r1 = r3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1c
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration[] r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration[]) r0     // Catch: java.lang.Exception -> L1c
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[][] getRecordFieldAnnotations(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r5) {
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r6 = r0
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration[] r0 = getRecordComponents(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L4e
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            goto L44
        L23:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = r9
            r0 = r0[r1]
            int r0 = r0.modifiers
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L41
            r0 = r6
            r1 = r9
            r2 = r7
            r3 = r8
            int r8 = r8 + 1
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = r2.annotations
            r0[r1] = r2
        L41:
            int r9 = r9 + 1
        L44:
            r0 = r9
            r1 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r1 = r1.fields
            int r1 = r1.length
            if (r0 < r1) goto L23
        L4e:
            r0 = r6
            return r0
    }

    public static java.lang.String getDocComment(lombok.eclipse.EclipseNode r4) {
            r0 = r4
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            char[] r0 = r0.getSource()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            if (r0 == 0) goto L75
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r6 = r0
            r0 = r4
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            char[] r0 = r0.getSource()
            r1 = r6
            int r1 = r1.declarationSourceStart
            r2 = r6
            int r2 = r2.declarationSourceEnd
            char[] r0 = org.eclipse.jdt.core.compiler.CharOperation.subarray(r0, r1, r2)
            r7 = r0
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            java.lang.String r1 = "/**"
            int r0 = r0.indexOf(r1)
            r9 = r0
            r0 = r8
            java.lang.String r1 = "*/"
            int r0 = r0.indexOf(r1)
            r10 = r0
            r0 = r9
            r1 = -1
            if (r0 == r1) goto L75
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L75
            r0 = r8
            r1 = r9
            r2 = 3
            int r1 = r1 + r2
            r2 = r10
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r1 = "(?m)^\\s*\\* ?"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r0 = r0.trim()
            return r0
        L75:
            r0 = 0
            return r0
    }

    public static void setDocComment(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r5, lombok.eclipse.EclipseNode r6, java.lang.String r7) {
            r0 = r5
            r1 = r6
            lombok.eclipse.EclipseNode r1 = upToTypeNode(r1)
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            r2 = r6
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r3 = r7
            setDocComment(r0, r1, r2, r3)
            return
    }

    public static void setDocComment(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r10, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r11, org.eclipse.jdt.internal.compiler.ast.ASTNode r12, java.lang.String r13) {
            r0 = r13
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r10
            org.eclipse.jdt.internal.compiler.CompilationResult r0 = r0.compilationResult
            org.eclipse.jdt.internal.compiler.env.ICompilationUnit r0 = r0.compilationUnit
            r14 = r0
            r0 = r14
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<?> r1 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.COMPILATION_UNIT
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            java.lang.reflect.Method r0 = lombok.eclipse.handlers.EclipseHandlerUtil.EclipseReflectiveMembers.COMPILATION_UNIT_ORIGINAL_FROM_CLONE     // Catch: java.lang.Throwable -> L30
            r1 = r14
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L30
            org.eclipse.jdt.internal.compiler.env.ICompilationUnit r0 = (org.eclipse.jdt.internal.compiler.env.ICompilationUnit) r0     // Catch: java.lang.Throwable -> L30
            r14 = r0
            goto L31
        L30:
        L31:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.env.ICompilationUnit, java.util.Map<java.lang.String, java.lang.String>> r0 = lombok.eclipse.EcjAugments.CompilationUnit_javadoc
            r1 = r14
            java.util.HashMap r2 = new java.util.HashMap
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.setIfAbsent(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            r15 = r0
            r0 = r12
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L84
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            r16 = r0
            r0 = r11
            r1 = r16
            java.lang.String r0 = getSignature(r0, r1)
            r17 = r0
            r0 = r15
            r1 = r17
            java.lang.String r2 = "/**%n%s%n */"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r13
            java.lang.String r7 = "$\\r?\\n"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = "(?m)^"
            java.lang.String r8 = " * "
            java.lang.String r6 = r6.replaceAll(r7, r8)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Object r0 = r0.put(r1, r2)
        L84:
            return
    }

    public static java.lang.String getSignature(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r3
            char[] r1 = r1.name
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            char[] r1 = r1.selector
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5e
            r0 = r6
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L57
        L40:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r5
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r8 = r8 + 1
        L57:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L40
        L5e:
            r0 = r5
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void copyJavadoc(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.ASTNode r7, lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc r8) {
            r0 = r6
            r1 = r7
            r2 = r6
            lombok.eclipse.EclipseNode r2 = upToTypeNode(r2)
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            r3 = r8
            r4 = 0
            copyJavadoc(r0, r1, r2, r3, r4)
            return
    }

    public static void copyJavadoc(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.ASTNode r7, lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc r8, boolean r9) {
            r0 = r6
            r1 = r7
            r2 = r6
            lombok.eclipse.EclipseNode r2 = upToTypeNode(r2)
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            r3 = r8
            r4 = r9
            copyJavadoc(r0, r1, r2, r3, r4)
            return
    }

    public static void copyJavadoc(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.ASTNode r7, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r8, lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            copyJavadoc(r0, r1, r2, r3, r4)
            return
    }

    public static void copyJavadoc(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.ASTNode r6, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r7, lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc r8, boolean r9) {
            r0 = r8
            if (r0 != 0) goto L8
            lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r0 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.VERBATIM
            r8 = r0
        L8:
            r0 = r5
            lombok.core.LombokNode r0 = r0.top()     // Catch: java.lang.Exception -> L36
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Exception -> L36
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L36
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0     // Catch: java.lang.Exception -> L36
            r10 = r0
            r0 = r8
            r1 = r5
            java.lang.String r0 = r0.apply(r1)     // Catch: java.lang.Exception -> L36
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L2a
            r0 = r11
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.addReturnsThisIfNeeded(r0)     // Catch: java.lang.Exception -> L36
            r11 = r0
        L2a:
            r0 = r10
            r1 = r7
            r2 = r6
            r3 = r11
            setDocComment(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L36
            goto L37
        L36:
        L37:
            return
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.EclipseHandlerUtil.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$AccessLevel() {
            int[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.$SWITCH_TABLE$lombok$AccessLevel
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.AccessLevel[] r0 = lombok.AccessLevel.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.MODULE     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE     // Catch: java.lang.NoSuchFieldError -> L2a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2a
            goto L2b
        L2a:
        L2b:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PACKAGE     // Catch: java.lang.NoSuchFieldError -> L37
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37
            goto L38
        L37:
        L38:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PRIVATE     // Catch: java.lang.NoSuchFieldError -> L44
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
            goto L45
        L44:
        L45:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PROTECTED     // Catch: java.lang.NoSuchFieldError -> L51
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            goto L52
        L51:
        L52:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC     // Catch: java.lang.NoSuchFieldError -> L5e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5e
            goto L5f
        L5e:
        L5f:
            r0 = r4
            r1 = r0
            lombok.eclipse.handlers.EclipseHandlerUtil.$SWITCH_TABLE$lombok$AccessLevel = r1
            return r0
    }
}
