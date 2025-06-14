package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/Javac.SCL.lombok */
public class Javac {
    private static final java.util.regex.Pattern VERSION_PARSER = null;
    private static final java.util.regex.Pattern SOURCE_PARSER = null;
    private static final java.util.concurrent.atomic.AtomicInteger compilerVersion = null;
    public static final long RECORD = 2305843009213693952L;
    public static final long COMPACT_RECORD_CONSTRUCTOR = 2251799813685248L;
    public static final long UNINITIALIZED_FIELD = 2251799813685248L;
    public static final long GENERATED_MEMBER = 16777216;
    public static final long SEALED = 4611686018427387904L;
    public static final long NON_SEALED = Long.MIN_VALUE;
    private static final java.lang.Class<?> DOCCOMMENTTABLE_CLASS = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_BOOLEAN = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_INT = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_DOUBLE = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_FLOAT = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_SHORT = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_BYTE = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_LONG = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_CHAR = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_VOID = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_NONE = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_BOT = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_ERROR = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_UNKNOWN = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_UNDETVAR = null;
    public static final lombok.javac.JavacTreeMaker.TypeTag CTC_CLASS = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_NOT_EQUAL = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_LESS_THAN = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_GREATER_THAN = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_LESS_OR_EQUAL = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_GREATER_OR_EQUAL = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_POS = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_NEG = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_NOT = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_COMPL = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_BITXOR = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_UNSIGNED_SHIFT_RIGHT = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_MUL = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_DIV = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_PLUS = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_MINUS = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_EQUAL = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_PREINC = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_PREDEC = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_POSTINC = null;
    public static final lombok.javac.JavacTreeMaker.TreeTag CTC_POSTDEC = null;
    private static final java.lang.reflect.Method getExtendsClause = null;
    private static final java.lang.reflect.Method getEndPosition = null;
    private static final java.lang.reflect.Method storeEnd = null;
    private static final java.lang.Class<?> JC_VOID_TYPE = null;
    private static final java.lang.Class<?> JC_NO_TYPE = null;
    private static final java.lang.reflect.Field symtabVoidType = null;
    private static final java.lang.reflect.Field JCCOMPILATIONUNIT_ENDPOSITIONS = null;
    private static final java.lang.reflect.Field JCCOMPILATIONUNIT_DOCCOMMENTS = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/Javac$JCNoType.SCL.lombok */
    private static class JCNoType extends com.sun.tools.javac.code.Type implements javax.lang.model.type.NoType {
        public JCNoType(int r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 0
                r0.<init>(r1, r2)
                return
        }

        public javax.lang.model.type.TypeKind getKind() {
                r6 = this;
                r0 = r6
                int r0 = r0.tag
                lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_VOID
                java.lang.Object r1 = r1.value
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r0 != r1) goto L17
                javax.lang.model.type.TypeKind r0 = javax.lang.model.type.TypeKind.VOID
                return r0
            L17:
                r0 = r6
                int r0 = r0.tag
                lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_NONE
                java.lang.Object r1 = r1.value
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r0 != r1) goto L2e
                javax.lang.model.type.TypeKind r0 = javax.lang.model.type.TypeKind.NONE
                return r0
            L2e:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                java.lang.String r4 = "Unexpected tag: "
                r3.<init>(r4)
                r3 = r6
                int r3 = r3.tag
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        public <R, P> R accept(javax.lang.model.type.TypeVisitor<R, P> r5, P r6) {
                r4 = this;
                r0 = r5
                r1 = r4
                r2 = r6
                java.lang.Object r0 = r0.visitNoType(r1, r2)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/Javac$JavadocOps_8.SCL.lombok */
    private static class JavadocOps_8 {


        private JavadocOps_8() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static java.lang.String getJavadoc(java.lang.Object r3, com.sun.tools.javac.tree.JCTree r4) {
                r0 = r3
                com.sun.tools.javac.tree.DocCommentTable r0 = (com.sun.tools.javac.tree.DocCommentTable) r0
                r5 = r0
                r0 = r5
                r1 = r4
                com.sun.tools.javac.parser.Tokens$Comment r0 = r0.getComment(r1)
                r6 = r0
                r0 = r6
                if (r0 != 0) goto L13
                r0 = 0
                return r0
            L13:
                r0 = r6
                java.lang.String r0 = r0.getText()
                return r0
        }

        public static boolean validateJavadoc(java.lang.Object r3, com.sun.tools.javac.tree.JCTree r4) {
                r0 = r3
                com.sun.tools.javac.tree.DocCommentTable r0 = (com.sun.tools.javac.tree.DocCommentTable) r0
                r5 = r0
                r0 = r5
                r1 = r4
                com.sun.tools.javac.parser.Tokens$Comment r0 = r0.getComment(r1)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L26
                r0 = r6
                java.lang.String r0 = r0.getText()
                if (r0 == 0) goto L26
                r0 = r6
                r1 = 0
                int r0 = r0.getSourcePos(r1)
                if (r0 >= 0) goto L26
                r0 = 0
                return r0
            L26:
                r0 = 1
                return r0
        }

        static void setJavadoc(java.lang.Object r4, com.sun.tools.javac.tree.JCTree r5, java.lang.String r6) {
                r0 = r4
                com.sun.tools.javac.tree.DocCommentTable r0 = (com.sun.tools.javac.tree.DocCommentTable) r0
                r7 = r0
                r0 = r6
                r1 = r5
                com.sun.tools.javac.parser.Tokens$Comment r0 = createJavadocComment(r0, r1)
                r8 = r0
                r0 = r7
                r1 = r5
                r2 = r8
                r0.putComment(r1, r2)
                return
        }

        private static com.sun.tools.javac.parser.Tokens.Comment createJavadocComment(java.lang.String r5, com.sun.tools.javac.tree.JCTree r6) {
                lombok.javac.Javac$JavadocOps_8$1 r0 = new lombok.javac.Javac$JavadocOps_8$1
                r1 = r0
                r2 = r5
                r3 = r6
                r1.<init>(r2, r3)
                return r0
        }
    }

    static {
            java.lang.String r0 = "^(\\d{1,6})\\.?(\\d{1,6})?.*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.javac.Javac.VERSION_PARSER = r0
            java.lang.String r0 = "^JDK(\\d{1,6})_?(\\d{1,6})?.*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.javac.Javac.SOURCE_PARSER = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = r0
            r2 = -1
            r1.<init>(r2)
            lombok.javac.Javac.compilerVersion = r0
            r0 = 0
            r7 = r0
            java.lang.String r0 = "com.sun.tools.javac.tree.DocCommentTable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            goto L27
        L26:
        L27:
            r0 = r7
            lombok.javac.Javac.DOCCOMMENTTABLE_CLASS = r0
            java.lang.String r0 = "BOOLEAN"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_BOOLEAN = r0
            java.lang.String r0 = "INT"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_INT = r0
            java.lang.String r0 = "DOUBLE"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_DOUBLE = r0
            java.lang.String r0 = "FLOAT"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_FLOAT = r0
            java.lang.String r0 = "SHORT"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_SHORT = r0
            java.lang.String r0 = "BYTE"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_BYTE = r0
            java.lang.String r0 = "LONG"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_LONG = r0
            java.lang.String r0 = "CHAR"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_CHAR = r0
            java.lang.String r0 = "VOID"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_VOID = r0
            java.lang.String r0 = "NONE"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_NONE = r0
            java.lang.String r0 = "BOT"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_BOT = r0
            java.lang.String r0 = "ERROR"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_ERROR = r0
            java.lang.String r0 = "UNKNOWN"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_UNKNOWN = r0
            java.lang.String r0 = "UNDETVAR"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_UNDETVAR = r0
            java.lang.String r0 = "CLASS"
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            lombok.javac.Javac.CTC_CLASS = r0
            java.lang.String r0 = "NE"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_NOT_EQUAL = r0
            java.lang.String r0 = "LT"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_LESS_THAN = r0
            java.lang.String r0 = "GT"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_GREATER_THAN = r0
            java.lang.String r0 = "LE"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_LESS_OR_EQUAL = r0
            java.lang.String r0 = "GE"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_GREATER_OR_EQUAL = r0
            java.lang.String r0 = "POS"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_POS = r0
            java.lang.String r0 = "NEG"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_NEG = r0
            java.lang.String r0 = "NOT"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_NOT = r0
            java.lang.String r0 = "COMPL"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_COMPL = r0
            java.lang.String r0 = "BITXOR"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_BITXOR = r0
            java.lang.String r0 = "USR"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_UNSIGNED_SHIFT_RIGHT = r0
            java.lang.String r0 = "MUL"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_MUL = r0
            java.lang.String r0 = "DIV"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_DIV = r0
            java.lang.String r0 = "PLUS"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_PLUS = r0
            java.lang.String r0 = "MINUS"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_MINUS = r0
            java.lang.String r0 = "EQ"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_EQUAL = r0
            java.lang.String r0 = "PREINC"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_PREINC = r0
            java.lang.String r0 = "PREDEC"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_PREDEC = r0
            java.lang.String r0 = "POSTINC"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_POSTINC = r0
            java.lang.String r0 = "POSTDEC"
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            lombok.javac.Javac.CTC_POSTDEC = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCClassDecl> r0 = com.sun.tools.javac.tree.JCTree.JCClassDecl.class
            java.lang.String r1 = "getExtendsClause"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.javac.Javac.getExtendsClause = r0
            int r0 = getJavaCompilerVersion()
            r1 = 8
            if (r0 >= r1) goto L190
            java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r0 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
            java.lang.String r1 = "getEndPosition"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r3[r4] = r5
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.javac.Javac.getEndPosition = r0
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.String r1 = "put"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r3[r4] = r5
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.javac.Javac.storeEnd = r0
            goto L204
        L190:
            java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r0 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
            java.lang.String r1 = "getEndPosition"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "com.sun.tools.javac.tree.EndPosTable"
            r3[r4] = r5
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.javac.Javac.getEndPosition = r0
            java.lang.String r0 = "com.sun.tools.javac.tree.EndPosTable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1b0
            r8 = r0
            goto L1b6
        L1b0:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L1b6:
            r0 = r8
            java.lang.String r1 = "storeEnd"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1d1
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L1d1
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L1d1
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L1d1
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1d1
            r7 = r0
            goto L200
        L1d1:
            java.lang.String r0 = "com.sun.tools.javac.parser.JavacParser$AbstractEndPosTable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchMethodException -> L1f4 java.lang.ClassNotFoundException -> L1fa
            r8 = r0
            r0 = r8
            java.lang.String r1 = "storeEnd"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1f4 java.lang.ClassNotFoundException -> L1fa
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L1f4 java.lang.ClassNotFoundException -> L1fa
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L1f4 java.lang.ClassNotFoundException -> L1fa
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L1f4 java.lang.ClassNotFoundException -> L1fa
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1f4 java.lang.ClassNotFoundException -> L1fa
            r7 = r0
            goto L200
        L1f4:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L1fa:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L200:
            r0 = r7
            lombok.javac.Javac.storeEnd = r0
        L204:
            java.lang.reflect.Method r0 = lombok.javac.Javac.getEndPosition
            java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
            java.lang.reflect.Method r0 = lombok.javac.Javac.storeEnd
            java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
            r0 = 0
            r7 = r0
            java.lang.String r0 = "com.sun.tools.javac.code.Type$JCVoidType"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L21e
            r7 = r0
            goto L21f
        L21e:
        L21f:
            r0 = r7
            lombok.javac.Javac.JC_VOID_TYPE = r0
            r0 = 0
            r7 = r0
            java.lang.String r0 = "com.sun.tools.javac.code.Type$JCNoType"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L22f
            r7 = r0
            goto L230
        L22f:
        L230:
            r0 = r7
            lombok.javac.Javac.JC_NO_TYPE = r0
            java.lang.Class<com.sun.tools.javac.code.Symtab> r0 = com.sun.tools.javac.code.Symtab.class
            java.lang.String r1 = "voidType"
            java.lang.reflect.Field r0 = getFieldIfExists(r0, r1)
            lombok.javac.Javac.symtabVoidType = r0
            r0 = 0
            r7 = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = com.sun.tools.javac.tree.JCTree.JCCompilationUnit.class
            java.lang.String r1 = "endPositions"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L24f
            r7 = r0
            goto L250
        L24f:
        L250:
            r0 = r7
            lombok.javac.Javac.JCCOMPILATIONUNIT_ENDPOSITIONS = r0
            r0 = 0
            r7 = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = com.sun.tools.javac.tree.JCTree.JCCompilationUnit.class
            java.lang.String r1 = "docComments"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L263
            r7 = r0
            goto L264
        L263:
        L264:
            r0 = r7
            lombok.javac.Javac.JCCOMPILATIONUNIT_DOCCOMMENTS = r0
            return
    }

    private Javac() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int getJavaCompilerVersion() {
            java.util.concurrent.atomic.AtomicInteger r0 = lombok.javac.Javac.compilerVersion
            int r0 = r0.get()
            r4 = r0
            r0 = r4
            r1 = -1
            if (r0 == r1) goto Le
            r0 = r4
            return r0
        Le:
            java.util.regex.Pattern r0 = lombok.javac.Javac.VERSION_PARSER
            java.lang.String r1 = com.sun.tools.javac.main.JavaCompiler.version()
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.matches()
            if (r0 == 0) goto L46
            r0 = r5
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r6 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L3b
            r0 = r5
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r7 = r0
            r0 = r7
            int r0 = setVersion(r0)
            return r0
        L3b:
            r0 = r6
            r1 = 9
            if (r0 < r1) goto L46
            r0 = r6
            int r0 = setVersion(r0)
            return r0
        L46:
            com.sun.tools.javac.code.Source[] r0 = com.sun.tools.javac.code.Source.values()
            com.sun.tools.javac.code.Source[] r1 = com.sun.tools.javac.code.Source.values()
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            java.lang.String r0 = r0.name()
            r5 = r0
            java.util.regex.Pattern r0 = lombok.javac.Javac.SOURCE_PARSER
            r1 = r5
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r6 = r0
            r0 = r6
            boolean r0 = r0.matches()
            if (r0 == 0) goto L8c
            r0 = r6
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L81
            r0 = r6
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r8 = r0
            r0 = r8
            int r0 = setVersion(r0)
            return r0
        L81:
            r0 = r7
            r1 = 9
            if (r0 < r1) goto L8c
            r0 = r7
            int r0 = setVersion(r0)
            return r0
        L8c:
            r0 = 6
            int r0 = setVersion(r0)
            return r0
    }

    private static int setVersion(int r3) {
            java.util.concurrent.atomic.AtomicInteger r0 = lombok.javac.Javac.compilerVersion
            r1 = r3
            r0.set(r1)
            r0 = r3
            return r0
    }

    public static boolean instanceOfDocCommentTable(java.lang.Object r3) {
            java.lang.Class<?> r0 = lombok.javac.Javac.DOCCOMMENTTABLE_CLASS
            if (r0 == 0) goto L12
            java.lang.Class<?> r0 = lombok.javac.Javac.DOCCOMMENTTABLE_CLASS
            r1 = r3
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean isPrimitive(com.sun.tools.javac.tree.JCTree.JCExpression r2) {
            r0 = r2
            java.lang.String r0 = r0.toString()
            boolean r0 = lombok.core.JavaIdentifiers.isPrimitive(r0)
            return r0
    }

    public static java.lang.Object calculateGuess(com.sun.tools.javac.tree.JCTree.JCExpression r7) {
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCLiteral
            if (r0 == 0) goto L31
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = (com.sun.tools.javac.tree.JCTree.JCLiteral) r0
            r8 = r0
            r0 = r8
            com.sun.source.tree.Tree$Kind r0 = r0.getKind()
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BOOLEAN_LITERAL
            if (r0 != r1) goto L2c
            r0 = r8
            java.lang.Object r0 = r0.value
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            r0 = r8
            java.lang.Object r0 = r0.value
            return r0
        L31:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 != 0) goto L3f
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L7f
        L3f:
            r0 = r7
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r8
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L62
            lombok.core.ClassLiteral r0 = new lombok.core.ClassLiteral
            r1 = r0
            r2 = r8
            r3 = 0
            r4 = r8
            int r4 = r4.length()
            r5 = 6
            int r4 = r4 - r5
            java.lang.String r2 = r2.substring(r3, r4)
            r1.<init>(r2)
            return r0
        L62:
            r0 = r8
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r9 = r0
            r0 = r9
            r1 = -1
            if (r0 <= r1) goto L76
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r8 = r0
        L76:
            lombok.core.FieldSelect r0 = new lombok.core.FieldSelect
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            return r0
        L7f:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Method getMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class<?>... r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L7
            return r0
        L7:
            r7 = move-exception
            r0 = r7
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
    }

    private static java.lang.reflect.Method getMethod(java.lang.Class<?> r5, java.lang.String r6, java.lang.String... r7) {
            r0 = r7
            int r0 = r0.length     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            r8 = r0
            r0 = 0
            r9 = r0
            goto L1a
        Lc:
            r0 = r8
            r1 = r9
            r2 = r7
            r3 = r9
            r2 = r2[r3]     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            r0[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            int r9 = r9 + 1
        L1a:
            r0 = r9
            r1 = r7
            int r1 = r1.length     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            if (r0 < r1) goto Lc
            r0 = r5
            r1 = r6
            r2 = r8
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.ClassNotFoundException -> L2e
            return r0
        L28:
            r8 = move-exception
            r0 = r8
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L2e:
            r8 = move-exception
            r0 = r8
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
    }

    public static com.sun.tools.javac.tree.JCTree getExtendsClause(com.sun.tools.javac.tree.JCTree.JCClassDecl r4) {
            java.lang.reflect.Method r0 = lombok.javac.Javac.getExtendsClause     // Catch: java.lang.IllegalAccessException -> Lf java.lang.reflect.InvocationTargetException -> L15
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> Lf java.lang.reflect.InvocationTargetException -> L15
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lf java.lang.reflect.InvocationTargetException -> L15
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0     // Catch: java.lang.IllegalAccessException -> Lf java.lang.reflect.InvocationTargetException -> L15
            return r0
        Lf:
            r5 = move-exception
            r0 = r5
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L15:
            r5 = move-exception
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
    }

    public static java.lang.Object getDocComments(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r3) {
            java.lang.reflect.Field r0 = lombok.javac.Javac.JCCOMPILATIONUNIT_DOCCOMMENTS     // Catch: java.lang.IllegalAccessException -> L8
            r1 = r3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L8
            return r0
        L8:
            r4 = move-exception
            r0 = r4
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
    }

    public static java.lang.String getDocComment(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r3, com.sun.tools.javac.tree.JCTree r4) {
            r0 = r3
            java.lang.Object r0 = getDocComments(r0)
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L1a
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1a:
            r0 = r5
            boolean r0 = instanceOfDocCommentTable(r0)
            if (r0 == 0) goto L27
            r0 = r5
            r1 = r4
            java.lang.String r0 = lombok.javac.Javac.JavadocOps_8.getJavadoc(r0, r1)
            return r0
        L27:
            r0 = 0
            return r0
    }

    public static boolean validateDocComment(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r3, com.sun.tools.javac.tree.JCTree r4) {
            r0 = r3
            java.lang.Object r0 = getDocComments(r0)
            r5 = r0
            r0 = r5
            boolean r0 = instanceOfDocCommentTable(r0)
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = r5
            r1 = r4
            boolean r0 = lombok.javac.Javac.JavadocOps_8.validateJavadoc(r0, r1)
            return r0
    }

    public static void setDocComment(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4, com.sun.tools.javac.tree.JCTree r5, java.lang.String r6) {
            r0 = r6
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r4
            java.lang.Object r0 = getDocComments(r0)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L1e
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            return
        L1e:
            r0 = r7
            boolean r0 = instanceOfDocCommentTable(r0)
            if (r0 == 0) goto L2c
            r0 = r7
            r1 = r5
            r2 = r6
            lombok.javac.Javac.JavadocOps_8.setJavadoc(r0, r1, r2)
            return
        L2c:
            return
    }

    public static boolean isFieldDeprecated(com.sun.tools.javac.tree.JCTree r5) {
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            if (r0 == 0) goto L6b
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L6b
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.tree.JCTree r0 = r0.getAnnotationType()
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "Deprecated"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
            r0 = r9
            java.lang.String r1 = ".Deprecated"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L69
            r0 = 0
            return r0
        L69:
            r0 = 1
            return r0
        L6b:
            r0 = 0
            return r0
    }

    public static void initDocComments(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r5) {
            java.lang.reflect.Field r0 = lombok.javac.Javac.JCCOMPILATIONUNIT_DOCCOMMENTS     // Catch: java.lang.IllegalArgumentException -> L11 java.lang.IllegalAccessException -> L15
            r1 = r5
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalArgumentException -> L11 java.lang.IllegalAccessException -> L15
            r3 = r2
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L11 java.lang.IllegalAccessException -> L15
            r0.set(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L11 java.lang.IllegalAccessException -> L15
            goto L1b
        L11:
            goto L1b
        L15:
            r6 = move-exception
            r0 = r6
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L1b:
            return
    }

    public static int getEndPosition(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r7, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r8) {
            java.lang.reflect.Field r0 = lombok.javac.Javac.JCCOMPILATIONUNIT_ENDPOSITIONS     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            r1 = r8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            r9 = r0
            java.lang.reflect.Method r0 = lombok.javac.Javac.getEndPosition     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            r1 = r7
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            int r0 = r0.intValue()     // Catch: java.lang.IllegalAccessException -> L1e java.lang.reflect.InvocationTargetException -> L24
            return r0
        L1e:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L24:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
    }

    public static void storeEnd(com.sun.tools.javac.tree.JCTree r7, int r8, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r9) {
            java.lang.reflect.Field r0 = lombok.javac.Javac.JCCOMPILATIONUNIT_ENDPOSITIONS     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            r1 = r9
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            r10 = r0
            r0 = r10
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.reflect.Method r0 = lombok.javac.Javac.storeEnd     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            r1 = r10
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            r3 = r2
            r4 = 1
            r5 = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L2d
            goto L36
        L27:
            r10 = move-exception
            r0 = r10
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L2d:
            r10 = move-exception
            r0 = r10
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L36:
            return
    }

    private static java.lang.reflect.Field getFieldIfExists(java.lang.Class<?> r3, java.lang.String r4) {
            r0 = r3
            java.lang.String r1 = "voidType"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static com.sun.tools.javac.code.Type createVoidType(com.sun.tools.javac.code.Symtab r4, lombok.javac.JavacTreeMaker.TypeTag r5) {
            java.lang.reflect.Field r0 = lombok.javac.Javac.symtabVoidType
            if (r0 == 0) goto L12
            java.lang.reflect.Field r0 = lombok.javac.Javac.symtabVoidType     // Catch: java.lang.IllegalAccessException -> L11
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L11
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: java.lang.IllegalAccessException -> L11
            return r0
        L11:
        L12:
            int r0 = getJavaCompilerVersion()
            r1 = 8
            if (r0 >= r1) goto L2c
            lombok.javac.Javac$JCNoType r0 = new lombok.javac.Javac$JCNoType
            r1 = r0
            r2 = r5
            java.lang.Object r2 = r2.value
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.<init>(r2)
            return r0
        L2c:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_VOID     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            r1 = r5
            boolean r0 = r0.equals(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            if (r0 == 0) goto L4b
            java.lang.Class<?> r0 = lombok.javac.Javac.JC_VOID_TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            return r0
        L4b:
            java.lang.Class<?> r0 = lombok.javac.Javac.JC_NO_TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.NoSuchMethodException -> L69 java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L75
            return r0
        L60:
            r6 = move-exception
            r0 = r6
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L69:
            r6 = move-exception
            r0 = r6
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L6f:
            r6 = move-exception
            r0 = r6
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L75:
            r6 = move-exception
            r0 = r6
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
    }

    static java.lang.RuntimeException sneakyThrow(java.lang.Throwable r4) {
            r0 = r4
            if (r0 != 0) goto Lf
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "t"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r4
            sneakyThrow0(r0)
            r0 = 0
            return r0
    }

    private static <T extends java.lang.Throwable> void sneakyThrow0(java.lang.Throwable r2) throws java.lang.Throwable {
            r0 = r2
            throw r0
    }
}
