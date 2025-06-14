package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/PrettyPrinter.SCL.lombok */
public class PrettyPrinter extends com.sun.tools.javac.tree.JCTree.Visitor {
    private static final java.lang.String LINE_SEP = null;
    private static final java.util.Map<lombok.javac.JavacTreeMaker.TreeTag, java.lang.String> OPERATORS = null;
    private final java.io.Writer out;
    private final com.sun.tools.javac.tree.JCTree.JCCompilationUnit compilationUnit;
    private com.sun.tools.javac.util.List<lombok.javac.CommentInfo> comments;
    private final int[] textBlockStarts;
    private final lombok.delombok.FormatPreferences formatPreferences;
    private final java.util.Map<com.sun.tools.javac.tree.JCTree, java.lang.String> docComments;
    private final com.sun.tools.javac.tree.DocCommentTable docTable;
    private int indent;
    private boolean needsAlign;
    private boolean needsNewLine;
    private boolean onNewLine;
    private boolean needsSpace;
    private boolean aligned;
    private com.sun.tools.javac.util.Name __INIT__;
    private com.sun.tools.javac.util.Name __VALUE__;
    private com.sun.tools.javac.util.Name currentTypeName;
    private boolean innermostArrayBracketsAreVarargs;
    private long flagMod;
    private static final long DEFAULT = 8796093022208L;
    private static final int PREFIX = 14;
    private static final java.lang.reflect.Method getExtendsClause = null;
    private static final java.lang.reflect.Method getEndPosition = null;
    private static final java.lang.reflect.Method storeEnd = null;
    private static final java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.reflect.Field>> reflectionCache = null;
    private boolean jcAnnotatedTypeInit;
    private java.lang.Class<?> jcAnnotatedTypeClass;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$javac$CommentInfo$StartConnection;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$javac$CommentInfo$EndConnection;
    private static /* synthetic */ int[] $SWITCH_TABLE$com$sun$source$tree$Tree$Kind;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/PrettyPrinter$UncheckedIOException.SCL.lombok */
    public static final class UncheckedIOException extends java.lang.RuntimeException {
        UncheckedIOException(java.io.IOException r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                java.lang.String r1 = toMsg(r1)
                r0.<init>(r1)
                r0 = r3
                r1 = r4
                java.lang.StackTraceElement[] r1 = r1.getStackTrace()
                r0.setStackTrace(r1)
                return
        }

        private static java.lang.String toMsg(java.lang.Throwable r4) {
                r0 = r4
                java.lang.String r0 = r0.getMessage()
                r5 = r0
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getSimpleName()
                r6 = r0
                r0 = r5
                if (r0 == 0) goto L18
                r0 = r5
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
            L18:
                r0 = r6
                return r0
            L1a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r6
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.<init>(r2)
                java.lang.String r1 = ": "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            lombok.delombok.PrettyPrinter.LINE_SEP = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "POS"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "+"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "NEG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "-"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "NOT"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "!"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "COMPL"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "~"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "PREINC"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "++"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "PREDEC"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "--"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "POSTINC"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "++"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "POSTDEC"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "--"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "NULLCHK"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "<*nullchk*>"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "OR"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "||"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "AND"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "&&"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "EQ"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "=="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "NE"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "!="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "LT"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "<"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "GT"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = ">"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "LE"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "<="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "GE"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = ">="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "BITOR"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "|"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "BITXOR"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "^"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "BITAND"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "&"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "SL"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "<<"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "SR"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = ">>"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "USR"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = ">>>"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "PLUS"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "+"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "MINUS"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "-"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "MUL"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "*"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "DIV"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "/"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "MOD"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "%"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "BITOR_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "|="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "BITXOR_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "^="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "BITAND_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "&="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "SL_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "<<="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "SR_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = ">>="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "USR_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = ">>>="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "PLUS_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "+="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "MINUS_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "-="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "MUL_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "*="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "DIV_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "/="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "MOD_ASG"
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r1)
            java.lang.String r2 = "%="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            lombok.delombok.PrettyPrinter.OPERATORS = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCClassDecl> r0 = com.sun.tools.javac.tree.JCTree.JCClassDecl.class
            java.lang.String r1 = "getExtendsClause"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.delombok.PrettyPrinter.getExtendsClause = r0
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 8
            if (r0 >= r1) goto L27f
            java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r0 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
            java.lang.String r1 = "getEndPosition"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r3[r4] = r5
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.delombok.PrettyPrinter.getEndPosition = r0
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
            lombok.delombok.PrettyPrinter.storeEnd = r0
            goto L2f3
        L27f:
            java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r0 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
            java.lang.String r1 = "getEndPosition"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "com.sun.tools.javac.tree.EndPosTable"
            r3[r4] = r5
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            lombok.delombok.PrettyPrinter.getEndPosition = r0
            java.lang.String r0 = "com.sun.tools.javac.tree.EndPosTable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L29f
            r8 = r0
            goto L2a5
        L29f:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L2a5:
            r0 = r8
            java.lang.String r1 = "storeEnd"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L2c0
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2c0
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L2c0
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2c0
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L2c0
            r7 = r0
            goto L2ef
        L2c0:
            java.lang.String r0 = "com.sun.tools.javac.parser.JavacParser$AbstractEndPosTable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchMethodException -> L2e3 java.lang.ClassNotFoundException -> L2e9
            r8 = r0
            r0 = r8
            java.lang.String r1 = "storeEnd"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L2e3 java.lang.ClassNotFoundException -> L2e9
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2e3 java.lang.ClassNotFoundException -> L2e9
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L2e3 java.lang.ClassNotFoundException -> L2e9
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2e3 java.lang.ClassNotFoundException -> L2e9
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L2e3 java.lang.ClassNotFoundException -> L2e9
            r7 = r0
            goto L2ef
        L2e3:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L2e9:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = sneakyThrow(r0)
            throw r0
        L2ef:
            r0 = r7
            lombok.delombok.PrettyPrinter.storeEnd = r0
        L2f3:
            java.lang.reflect.Method r0 = lombok.delombok.PrettyPrinter.getEndPosition
            java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
            java.lang.reflect.Method r0 = lombok.delombok.PrettyPrinter.storeEnd
            java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            lombok.delombok.PrettyPrinter.reflectionCache = r0
            return
    }

    public PrettyPrinter(java.io.Writer r5, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r6, com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r7, int[] r8, lombok.delombok.FormatPreferences r9) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.indent = r1
            r0 = r4
            r1 = 1
            r0.onNewLine = r1
            r0 = r4
            r1 = 0
            r0.innermostArrayBracketsAreVarargs = r1
            r0 = r4
            r1 = -1
            r0.flagMod = r1
            r0 = r4
            r1 = 0
            r0.jcAnnotatedTypeInit = r1
            r0 = r4
            r1 = 0
            r0.jcAnnotatedTypeClass = r1
            r0 = r4
            r1 = r5
            r0.out = r1
            r0 = r4
            r1 = r7
            r0.comments = r1
            r0 = r4
            r1 = r8
            r0.textBlockStarts = r1
            r0 = r4
            r1 = r6
            r0.compilationUnit = r1
            r0 = r4
            r1 = r9
            r0.formatPreferences = r1
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = r0.compilationUnit
            java.lang.Object r0 = lombok.javac.Javac.getDocComments(r0)
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L61
            r0 = r4
            r1 = r10
            java.util.Map r1 = (java.util.Map) r1
            r0.docComments = r1
            r0 = r4
            r1 = 0
            r0.docTable = r1
            goto L84
        L61:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.DocCommentTable
            if (r0 == 0) goto L7a
            r0 = r4
            r1 = 0
            r0.docComments = r1
            r0 = r4
            r1 = r10
            com.sun.tools.javac.tree.DocCommentTable r1 = (com.sun.tools.javac.tree.DocCommentTable) r1
            r0.docTable = r1
            goto L84
        L7a:
            r0 = r4
            r1 = 0
            r0.docComments = r1
            r0 = r4
            r1 = 0
            r0.docTable = r1
        L84:
            return
    }

    private int endPos(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = r1.compilationUnit
            int r0 = lombok.javac.Javac.getEndPosition(r0, r1)
            return r0
    }

    private void align() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.onNewLine
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
            r5 = r0
            goto L1e
        Ld:
            r0 = r4
            java.io.Writer r0 = r0.out     // Catch: java.io.IOException -> L29
            r1 = r4
            lombok.delombok.FormatPreferences r1 = r1.formatPreferences     // Catch: java.io.IOException -> L29
            java.lang.String r1 = r1.indent()     // Catch: java.io.IOException -> L29
            r0.write(r1)     // Catch: java.io.IOException -> L29
            int r5 = r5 + 1
        L1e:
            r0 = r5
            r1 = r4
            int r1 = r1.indent     // Catch: java.io.IOException -> L29
            if (r0 < r1) goto Ld
            goto L33
        L29:
            r5 = move-exception
            lombok.delombok.PrettyPrinter$UncheckedIOException r0 = new lombok.delombok.PrettyPrinter$UncheckedIOException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r4
            r1 = 0
            r0.onNewLine = r1
            r0 = r4
            r1 = 1
            r0.aligned = r1
            r0 = r4
            r1 = 0
            r0.needsAlign = r1
            return
    }

    private void print(com.sun.tools.javac.tree.JCTree r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = r4
            java.lang.String r1 = "/*missing*/"
            r0.print(r1)
            return
        Lc:
            r0 = r4
            r1 = r5
            r0.consumeComments(r1)
            r0 = r5
            r1 = r4
            r0.accept(r1)
            r0 = r4
            r1 = r4
            r2 = r5
            int r1 = r1.endPos(r2)
            r0.consumeTrailingComments(r1)
            return
    }

    private void print(com.sun.tools.javac.util.List<? extends com.sun.tools.javac.tree.JCTree> r4, java.lang.String r5) {
            r3 = this;
            r0 = 1
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L59
        Le:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r3
            r1 = r8
            boolean r0 = r0.suppress(r1)
            if (r0 == 0) goto L26
            goto L59
        L26:
            r0 = r6
            if (r0 != 0) goto L4d
            r0 = r5
            if (r0 == 0) goto L4d
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4d
            java.lang.String r0 = "\n"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            r0 = r3
            r1 = r7
            r0.println(r1)
            goto L4d
        L48:
            r0 = r3
            r1 = r5
            r0.print(r1)
        L4d:
            r0 = 0
            r6 = r0
            r0 = r3
            r1 = r8
            r0.print(r1)
            r0 = r8
            r7 = r0
        L59:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            return
    }

    private boolean suppress(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L22
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            r5 = r0
            r0 = -1
            r1 = r5
            int r1 = r1.pos
            if (r0 != r1) goto L20
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.stats
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
        L22:
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCExpressionStatement
            if (r0 == 0) goto L80
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.expr
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodInvocation
            if (r0 == 0) goto L80
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.typeargs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L51
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.args
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L53
        L51:
            r0 = 0
            return r0
        L53:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 != 0) goto L5f
            r0 = 0
            return r0
        L5f:
            r0 = r4
            int r0 = r0.pos
            r1 = r5
            int r1 = r1.pos
            if (r0 == r1) goto L6c
            r0 = 0
            return r0
        L6c:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "super"
            boolean r0 = r0.equals(r1)
            return r0
        L80:
            r0 = 0
            return r0
    }

    private void print(java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            boolean r0 = r0.needsAlign
            r6 = r0
            r0 = r4
            boolean r0 = r0.needsNewLine
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.onNewLine
            if (r0 != 0) goto L17
            r0 = r4
            r0.println()
        L17:
            r0 = r6
            if (r0 == 0) goto L26
            r0 = r4
            boolean r0 = r0.aligned
            if (r0 != 0) goto L26
            r0 = r4
            r0.align()
        L26:
            r0 = r4
            boolean r0 = r0.needsSpace     // Catch: java.io.IOException -> L54
            if (r0 == 0) goto L44
            r0 = r4
            boolean r0 = r0.onNewLine     // Catch: java.io.IOException -> L54
            if (r0 != 0) goto L44
            r0 = r4
            boolean r0 = r0.aligned     // Catch: java.io.IOException -> L54
            if (r0 != 0) goto L44
            r0 = r4
            java.io.Writer r0 = r0.out     // Catch: java.io.IOException -> L54
            r1 = 32
            r0.write(r1)     // Catch: java.io.IOException -> L54
        L44:
            r0 = r4
            java.io.Writer r0 = r0.out     // Catch: java.io.IOException -> L54
            r1 = r5
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L54
            r0.write(r1)     // Catch: java.io.IOException -> L54
            goto L5e
        L54:
            r7 = move-exception
            lombok.delombok.PrettyPrinter$UncheckedIOException r0 = new lombok.delombok.PrettyPrinter$UncheckedIOException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r4
            r1 = 0
            r0.needsSpace = r1
            r0 = r4
            r1 = 0
            r0.onNewLine = r1
            r0 = r4
            r1 = 0
            r0.aligned = r1
            return
    }

    private void println() {
            r4 = this;
            r0 = r4
            java.io.Writer r0 = r0.out     // Catch: java.io.IOException -> Ld
            java.lang.String r1 = lombok.delombok.PrettyPrinter.LINE_SEP     // Catch: java.io.IOException -> Ld
            r0.write(r1)     // Catch: java.io.IOException -> Ld
            goto L17
        Ld:
            r5 = move-exception
            lombok.delombok.PrettyPrinter$UncheckedIOException r0 = new lombok.delombok.PrettyPrinter$UncheckedIOException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r4
            r1 = 1
            r0.onNewLine = r1
            r0 = r4
            r1 = 0
            r0.aligned = r1
            r0 = r4
            r1 = 0
            r0.needsNewLine = r1
            return
    }

    private void println(com.sun.tools.javac.tree.JCTree r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto Lf
            r0 = r4
            r1 = r5
            int r0 = r0.endPos(r1)
            r6 = r0
            r0 = r4
            r1 = r6
            r0.consumeTrailingComments(r1)
        Lf:
            r0 = r4
            java.io.Writer r0 = r0.out     // Catch: java.io.IOException -> L1c
            java.lang.String r1 = lombok.delombok.PrettyPrinter.LINE_SEP     // Catch: java.io.IOException -> L1c
            r0.write(r1)     // Catch: java.io.IOException -> L1c
            goto L26
        L1c:
            r6 = move-exception
            lombok.delombok.PrettyPrinter$UncheckedIOException r0 = new lombok.delombok.PrettyPrinter$UncheckedIOException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r4
            r1 = 1
            r0.onNewLine = r1
            r0 = r4
            r1 = 0
            r0.aligned = r1
            r0 = r4
            r1 = 0
            r0.needsNewLine = r1
            return
    }

    private void println(java.lang.CharSequence r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.print(r1)
            r0 = r3
            r0.println()
            return
    }

    private void println(java.lang.CharSequence r4, com.sun.tools.javac.tree.JCTree r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.print(r1)
            r0 = r3
            r1 = r5
            r0.println(r1)
            return
    }

    private void aPrint(java.lang.CharSequence r4) {
            r3 = this;
            r0 = r3
            r0.align()
            r0 = r3
            r1 = r4
            r0.print(r1)
            return
    }

    private void aPrintln(java.lang.CharSequence r4) {
            r3 = this;
            r0 = r3
            r0.align()
            r0 = r3
            r1 = r4
            r0.print(r1)
            r0 = r3
            r0.println()
            return
    }

    private void aPrintln(java.lang.CharSequence r4, com.sun.tools.javac.tree.JCTree r5) {
            r3 = this;
            r0 = r3
            r0.align()
            r0 = r3
            r1 = r4
            r0.print(r1)
            r0 = r3
            r1 = r5
            r0.println(r1)
            return
    }

    private void consumeComments(int r4) {
            r3 = this;
            r0 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r0 = r0.comments
            java.lang.Object r0 = r0.head
            lombok.javac.CommentInfo r0 = (lombok.javac.CommentInfo) r0
            r5 = r0
            goto L29
        Le:
            r0 = r3
            r1 = r5
            r0.printComment(r1)
            r0 = r3
            r1 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r1 = r1.comments
            com.sun.tools.javac.util.List r1 = r1.tail
            r0.comments = r1
            r0 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r0 = r0.comments
            java.lang.Object r0 = r0.head
            lombok.javac.CommentInfo r0 = (lombok.javac.CommentInfo) r0
            r5 = r0
        L29:
            r0 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r0 = r0.comments
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L3b
            r0 = r5
            int r0 = r0.pos
            r1 = r4
            if (r0 < r1) goto Le
        L3b:
            return
    }

    private void consumeComments(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.pos
            r0.consumeComments(r1)
            return
    }

    private void consumeTrailingComments(int r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.onNewLine
            r5 = r0
            r0 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r0 = r0.comments
            java.lang.Object r0 = r0.head
            lombok.javac.CommentInfo r0 = (lombok.javac.CommentInfo) r0
            r6 = r0
            r0 = 0
            r7 = r0
            goto L47
        L16:
            r0 = r6
            int r0 = r0.endPos
            r4 = r0
            r0 = r3
            r1 = r6
            r0.printComment(r1)
            r0 = r6
            lombok.javac.CommentInfo$EndConnection r0 = r0.end
            lombok.javac.CommentInfo$EndConnection r1 = lombok.javac.CommentInfo.EndConnection.ON_NEXT_LINE
            if (r0 != r1) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r7 = r0
            r0 = r3
            r1 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r1 = r1.comments
            com.sun.tools.javac.util.List r1 = r1.tail
            r0.comments = r1
            r0 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r0 = r0.comments
            java.lang.Object r0 = r0.head
            lombok.javac.CommentInfo r0 = (lombok.javac.CommentInfo) r0
            r6 = r0
        L47:
            r0 = r3
            com.sun.tools.javac.util.List<lombok.javac.CommentInfo> r0 = r0.comments
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L72
            r0 = r6
            int r0 = r0.prevEndPos
            r1 = r4
            if (r0 != r1) goto L72
            r0 = r7
            if (r0 != 0) goto L72
            r0 = r6
            lombok.javac.CommentInfo$StartConnection r0 = r0.start
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.ON_NEXT_LINE
            if (r0 == r1) goto L72
            r0 = r6
            lombok.javac.CommentInfo$StartConnection r0 = r0.start
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.START_OF_LINE
            if (r0 != r1) goto L16
        L72:
            r0 = r3
            boolean r0 = r0.onNewLine
            if (r0 != 0) goto L81
            r0 = r5
            if (r0 == 0) goto L81
            r0 = r3
            r0.println()
        L81:
            return
    }

    private java.lang.String getJavadocFor(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r3
            java.util.Map<com.sun.tools.javac.tree.JCTree, java.lang.String> r0 = r0.docComments
            if (r0 == 0) goto L15
            r0 = r3
            java.util.Map<com.sun.tools.javac.tree.JCTree, java.lang.String> r0 = r0.docComments
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L15:
            r0 = r3
            com.sun.tools.javac.tree.DocCommentTable r0 = r0.docTable
            if (r0 == 0) goto L27
            r0 = r3
            com.sun.tools.javac.tree.DocCommentTable r0 = r0.docTable
            r1 = r4
            java.lang.String r0 = r0.getCommentText(r1)
            return r0
        L27:
            r0 = 0
            return r0
    }

    private int dims(com.sun.tools.javac.tree.JCTree.JCExpression r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L15
            r0 = 1
            r1 = r5
            r2 = r6
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r2 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r2
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.elemtype
            int r1 = r1.dims(r2)
            int r0 = r0 + r1
            return r0
        L15:
            r0 = r5
            r1 = r6
            boolean r0 = r0.isJcAnnotatedType(r1)
            if (r0 == 0) goto L3f
            r0 = r5
            r1 = r6
            java.lang.String r2 = "underlyingType"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L3f
            r0 = 1
            r1 = r5
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r2 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r2
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.elemtype
            int r1 = r1.dims(r2)
            int r0 = r0 + r1
            return r0
        L3f:
            r0 = 0
            return r0
    }

    private void printComment(lombok.javac.CommentInfo r4) {
            r3 = this;
            int[] r0 = $SWITCH_TABLE$lombok$javac$CommentInfo$StartConnection()
            r1 = r4
            lombok.javac.CommentInfo$StartConnection r1 = r1.start
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L38;
                case 2: goto L45;
                case 3: goto L28;
                case 4: goto L30;
                default: goto L65;
            }
        L28:
            r0 = r3
            r1 = 0
            r0.needsSpace = r1
            goto L65
        L30:
            r0 = r3
            r1 = 1
            r0.needsSpace = r1
            goto L65
        L38:
            r0 = r3
            r1 = 1
            r0.needsNewLine = r1
            r0 = r3
            r1 = 0
            r0.needsAlign = r1
            goto L65
        L45:
            r0 = r3
            boolean r0 = r0.onNewLine
            if (r0 != 0) goto L59
            r0 = r3
            r1 = 1
            r0.needsNewLine = r1
            r0 = r3
            r1 = 1
            r0.needsAlign = r1
            goto L65
        L59:
            r0 = r3
            boolean r0 = r0.aligned
            if (r0 != 0) goto L65
            r0 = r3
            r1 = 1
            r0.needsAlign = r1
        L65:
            r0 = r3
            boolean r0 = r0.onNewLine
            if (r0 == 0) goto L82
            r0 = r3
            boolean r0 = r0.aligned
            if (r0 != 0) goto L82
            r0 = r4
            lombok.javac.CommentInfo$StartConnection r0 = r0.start
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.START_OF_LINE
            if (r0 == r1) goto L82
            r0 = r3
            r1 = 1
            r0.needsAlign = r1
        L82:
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.content
            r0.print(r1)
            int[] r0 = $SWITCH_TABLE$lombok$javac$CommentInfo$EndConnection()
            r1 = r4
            lombok.javac.CommentInfo$EndConnection r1 = r1.end
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lcc;
                case 2: goto Lc4;
                case 3: goto Lb0;
                default: goto Lcc;
            }
        Lb0:
            r0 = r3
            boolean r0 = r0.aligned
            if (r0 != 0) goto Lcc
            r0 = r3
            r1 = 1
            r0.needsNewLine = r1
            r0 = r3
            r1 = 1
            r0.needsAlign = r1
            goto Lcc
        Lc4:
            r0 = r3
            r1 = 1
            r0.needsSpace = r1
            goto Lcc
        Lcc:
            return
    }

    private void printDocComment(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.getJavadocFor(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lb
            return
        Lb:
            r0 = r3
            java.lang.String r1 = "/**"
            r0.aPrintln(r1)
            r0 = 1
            r6 = r0
            r0 = r5
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L6f
        L27:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L42
            r0 = r7
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L42
            r0 = 0
            r6 = r0
            goto L6c
        L42:
            r0 = 0
            r6 = r0
            r0 = r3
            java.lang.String r1 = " *"
            r0.aPrint(r1)
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L66
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L66
            r0 = r3
            java.lang.String r1 = " "
            r0.print(r1)
        L66:
            r0 = r3
            r1 = r7
            r0.println(r1)
        L6c:
            int r8 = r8 + 1
        L6f:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L27
            r0 = r3
            java.lang.String r1 = " */"
            r0.aPrintln(r1)
            return
    }

    private com.sun.tools.javac.util.Name name_init(com.sun.tools.javac.util.Name r7) {
            r6 = this;
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.__INIT__
            if (r0 != 0) goto L1b
            r0 = r6
            r1 = r7
            com.sun.tools.javac.util.Name$Table r1 = r1.table
            java.lang.String r2 = "<init>"
            char[] r2 = r2.toCharArray()
            r3 = 0
            r4 = 6
            com.sun.tools.javac.util.Name r1 = r1.fromChars(r2, r3, r4)
            r0.__INIT__ = r1
        L1b:
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.__INIT__
            return r0
    }

    private com.sun.tools.javac.util.Name name_value(com.sun.tools.javac.util.Name r7) {
            r6 = this;
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.__VALUE__
            if (r0 != 0) goto L1a
            r0 = r6
            r1 = r7
            com.sun.tools.javac.util.Name$Table r1 = r1.table
            java.lang.String r2 = "value"
            char[] r2 = r2.toCharArray()
            r3 = 0
            r4 = 5
            com.sun.tools.javac.util.Name r1 = r1.fromChars(r2, r3, r4)
            r0.__VALUE__ = r1
        L1a:
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.__VALUE__
            return r0
    }

    public void visitTopLevel(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.printDocComment(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.PackageName.getPackageNode(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L27
            r0 = r4
            r1 = r5
            r0.consumeComments(r1)
            r0 = r4
            java.lang.String r1 = "package "
            r0.aPrint(r1)
            r0 = r4
            r1 = r6
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r6
            r0.println(r1, r2)
        L27:
            r0 = 1
            r7 = r0
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L5c
        L35:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 != 0) goto L4c
            goto L5c
        L4c:
            r0 = r7
            if (r0 == 0) goto L54
            r0 = r4
            r0.println()
        L54:
            r0 = 0
            r7 = r0
            r0 = r4
            r1 = r8
            r0.print(r1)
        L5c:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L35
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L8f
        L72:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 == 0) goto L89
            goto L8f
        L89:
            r0 = r4
            r1 = r8
            r0.print(r1)
        L8f:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L72
            r0 = r4
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.consumeComments(r1)
            return
    }

    public void visitImport(com.sun.tools.javac.tree.JCTree.JCImport r5) {
            r4 = this;
            r0 = r5
            com.sun.tools.javac.tree.JCTree r0 = r0.qualid
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L66
            r0 = r5
            com.sun.tools.javac.tree.JCTree r0 = r0.qualid
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.name
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto L66
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "*"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L66
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L66
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "experimental"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L66
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L66
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "lombok"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L66
            return
        L66:
            r0 = r4
            java.lang.String r1 = "import "
            r0.aPrint(r1)
            r0 = r5
            boolean r0 = r0.staticImport
            if (r0 == 0) goto L7b
            r0 = r4
            java.lang.String r1 = "static "
            r0.print(r1)
        L7b:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree r1 = r1.qualid
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitClassDef(com.sun.tools.javac.tree.JCTree.JCClassDecl r6) {
            r5 = this;
            r0 = r5
            r0.println()
            r0 = r5
            r1 = r6
            r0.printDocComment(r1)
            r0 = r5
            r0.align()
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            r0.print(r1)
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 512(0x200, double:2.53E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L43
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            r8 = r0
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            r9 = r0
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L70
            r0 = 1
            goto L71
        L70:
            r0 = 0
        L71:
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L81
            r0 = r5
            java.lang.String r1 = "@interface "
            r0.print(r1)
            goto Lb4
        L81:
            r0 = r7
            if (r0 == 0) goto L8f
            r0 = r5
            java.lang.String r1 = "interface "
            r0.print(r1)
            goto Lb4
        L8f:
            r0 = r9
            if (r0 == 0) goto L9e
            r0 = r5
            java.lang.String r1 = "enum "
            r0.print(r1)
            goto Lb4
        L9e:
            r0 = r10
            if (r0 == 0) goto Lad
            r0 = r5
            java.lang.String r1 = "record "
            r0.print(r1)
            goto Lb4
        Lad:
            r0 = r5
            java.lang.String r1 = "class "
            r0.print(r1)
        Lb4:
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.util.Name r0 = r0.currentTypeName
            r11 = r0
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.currentTypeName = r1
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.typarams
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto Leb
            r0 = r5
            java.lang.String r1 = "<"
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.typarams
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r5
            java.lang.String r1 = ">"
            r0.print(r1)
        Leb:
            r0 = r10
            if (r0 == 0) goto Lf8
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.defs
            r0.printRecordConstructor(r1)
        Lf8:
            r0 = r6
            com.sun.tools.javac.tree.JCTree r0 = getExtendsClause(r0)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L110
            r0 = r5
            java.lang.String r1 = " extends "
            r0.print(r1)
            r0 = r5
            r1 = r12
            r0.print(r1)
        L110:
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.implementing
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L136
            r0 = r5
            r1 = r7
            if (r1 == 0) goto L125
            java.lang.String r1 = " extends "
            goto L128
        L125:
            java.lang.String r1 = " implements "
        L128:
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.implementing
            java.lang.String r2 = ", "
            r0.print(r1, r2)
        L136:
            r0 = r5
            r1 = r6
            java.lang.String r2 = "permitting"
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L15e
            r0 = r5
            java.lang.String r1 = " permits "
            r0.print(r1)
            r0 = r5
            r1 = r13
            java.lang.String r2 = ", "
            r0.print(r1, r2)
        L15e:
            r0 = r5
            java.lang.String r1 = " {"
            r0.println(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.defs
            r2 = r9
            r3 = r7
            r0.printClassMembers(r1, r2, r3)
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.endPos(r2)
            r0.consumeComments(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r5
            java.lang.String r1 = "}"
            r2 = r6
            r0.aPrintln(r1, r2)
            r0 = r5
            r1 = r11
            r0.currentTypeName = r1
            return
    }

    private void printRecordConstructor(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r6) {
            r5 = this;
            r0 = 1
            r7 = r0
            r0 = r5
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L5b
        L12:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L5b
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16777216(0x1000000, double:8.289046E-317)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5b
            r0 = r7
            if (r0 != 0) goto L46
            r0 = r5
            java.lang.String r1 = ", "
            r0.print(r1)
        L46:
            r0 = 0
            r7 = r0
            r0 = r5
            r1 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = 0
            r0.printAnnotations(r1, r2)
            r0 = r5
            r1 = r10
            r0.printVarDef0(r1)
        L5b:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r5
            java.lang.String r1 = ")"
            r0.print(r1)
            return
    }

    private void printClassMembers(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r6, boolean r7, boolean r8) {
            r5 = this;
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto Lb
            r0 = 3
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r10 = r0
            r0 = r7
            r11 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L1bd
        L1a:
            r0 = r13
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r12 = r0
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L4b
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L4b
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4b
            goto L1bd
        L4b:
            r0 = r7
            if (r0 == 0) goto L6f
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L6f
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
            r0 = 1
            goto L70
        L6f:
            r0 = 0
        L70:
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L90
            r0 = r11
            if (r0 == 0) goto L90
            r0 = 0
            r11 = r0
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L89
            r0 = r5
            r0.align()
        L89:
            r0 = r5
            java.lang.String r1 = ";"
            r0.println(r1)
        L90:
            r0 = r14
            if (r0 == 0) goto L102
            r0 = r9
            if (r0 == 0) goto La6
            r0 = r9
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r1 = com.sun.tools.javac.tree.JCTree.JCVariableDecl.class
            if (r0 == r1) goto La6
            r0 = r5
            r0.println()
        La6:
            r0 = r10
            switch(r0) {
                case 1: goto Lc0;
                case 2: goto Lca;
                default: goto Ld5;
            }
        Lc0:
            r0 = r5
            java.lang.String r1 = ", "
            r0.print(r1)
            goto Ld5
        Lca:
            r0 = r5
            java.lang.String r1 = ","
            r0.println(r1)
            r0 = r5
            r0.align()
        Ld5:
            r0 = r5
            r1 = r12
            r0.print(r1)
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            r15 = r0
            r0 = r15
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewClass
            if (r0 == 0) goto Lfc
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = (com.sun.tools.javac.tree.JCTree.JCNewClass) r0
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.def
            if (r0 == 0) goto Lfc
            r0 = 2
            goto Lfd
        Lfc:
            r0 = 1
        Lfd:
            r10 = r0
            goto L1b6
        L102:
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L146
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16777216(0x1000000, double:8.289046E-317)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L121
            goto L1bd
        L121:
            r0 = r9
            if (r0 == 0) goto L132
            r0 = r9
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r1 = com.sun.tools.javac.tree.JCTree.JCVariableDecl.class
            if (r0 == r1) goto L132
            r0 = r5
            r0.println()
        L132:
            r0 = r8
            if (r0 == 0) goto L13d
            r0 = r5
            r1 = -26
            r0.flagMod = r1
        L13d:
            r0 = r5
            r1 = r12
            r0.print(r1)
            goto L1b6
        L146:
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L182
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L165
            goto L1bd
        L165:
            r0 = r9
            if (r0 == 0) goto L16e
            r0 = r5
            r0.println()
        L16e:
            r0 = r8
            if (r0 == 0) goto L179
            r0 = r5
            r1 = -1026(0xfffffffffffffbfe, double:NaN)
            r0.flagMod = r1
        L179:
            r0 = r5
            r1 = r12
            r0.print(r1)
            goto L1b6
        L182:
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L1a7
            r0 = r9
            if (r0 == 0) goto L193
            r0 = r5
            r0.println()
        L193:
            r0 = r8
            if (r0 == 0) goto L19e
            r0 = r5
            r1 = -10
            r0.flagMod = r1
        L19e:
            r0 = r5
            r1 = r12
            r0.print(r1)
            goto L1b6
        L1a7:
            r0 = r9
            if (r0 == 0) goto L1b0
            r0 = r5
            r0.println()
        L1b0:
            r0 = r5
            r1 = r12
            r0.print(r1)
        L1b6:
            r0 = r12
            java.lang.Class r0 = r0.getClass()
            r9 = r0
        L1bd:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
            r0 = r11
            if (r0 == 0) goto L1e0
            r0 = 0
            r11 = r0
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L1d9
            r0 = r5
            r0.align()
        L1d9:
            r0 = r5
            java.lang.String r1 = ";"
            r0.println(r1)
        L1e0:
            return
    }

    public void visitTypeParameter(com.sun.tools.javac.tree.JCTree.JCTypeParameter r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "annotations"
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            r0 = r5
            r1 = r7
            java.lang.String r2 = " "
            r0.print(r1, r2)
            r0 = r5
            java.lang.String r1 = " "
            r0.print(r1)
        L25:
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.bounds
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L49
            r0 = r5
            java.lang.String r1 = " extends "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.bounds
            java.lang.String r2 = " & "
            r0.print(r1, r2)
        L49:
            r0 = r5
            r1 = r6
            r0.consumeComments(r1)
            return
    }

    public void visitVarDef(com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.printDocComment(r1)
            r0 = r5
            r0.align()
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1f
            r0 = r5
            r1 = r6
            r0.printEnumMember(r1)
            return
        L1f:
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = 1
            r0.printAnnotations(r1, r2)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            r0.printModifierKeywords(r1)
            r0 = r5
            r1 = r6
            r0.printVarDef0(r1)
            r0 = r5
            java.lang.String r1 = ";"
            r2 = r6
            r0.println(r1, r2)
            return
    }

    private void printVarDefInline(com.sun.tools.javac.tree.JCTree.JCVariableDecl r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = 0
            r0.printAnnotations(r1, r2)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            r0.printModifierKeywords(r1)
            r0 = r4
            r1 = r5
            r0.printVarDef0(r1)
            return
    }

    private void printVarDef0(com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
            r5 = this;
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 17179869184(0x400000000, double:8.4879831639E-314)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r7 = r0
            r0 = r5
            r1 = r7
            r0.innermostArrayBracketsAreVarargs = r1     // Catch: java.lang.Throwable -> L42
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L2d
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype     // Catch: java.lang.Throwable -> L42
            int r0 = r0.pos     // Catch: java.lang.Throwable -> L42
            r1 = -1
            if (r0 != r1) goto L37
        L2d:
            r0 = r5
            java.lang.String r1 = "var"
            r0.print(r1)     // Catch: java.lang.Throwable -> L42
            goto L4a
        L37:
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype     // Catch: java.lang.Throwable -> L42
            r0.print(r1)     // Catch: java.lang.Throwable -> L42
            goto L4a
        L42:
            r8 = move-exception
            r0 = r5
            r1 = 0
            r0.innermostArrayBracketsAreVarargs = r1
            r0 = r8
            throw r0
        L4a:
            r0 = r5
            r1 = 0
            r0.innermostArrayBracketsAreVarargs = r1
            r0 = r5
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto L74
            r0 = r5
            java.lang.String r1 = " = "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.init
            r0.print(r1)
        L74:
            return
    }

    private void printEnumMember(com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = 1
            r0.printAnnotations(r1, r2)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewClass
            if (r0 == 0) goto L99
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = (com.sun.tools.javac.tree.JCTree.JCNewClass) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.args
            if (r0 == 0) goto L50
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.args
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L50
            r0 = r5
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r5
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.args
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r5
            java.lang.String r1 = ")"
            r0.print(r1)
        L50:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.def
            if (r0 == 0) goto L99
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.def
            com.sun.tools.javac.util.List r0 = r0.defs
            if (r0 == 0) goto L99
            r0 = r5
            java.lang.String r1 = " {"
            r0.println(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r5
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = r1.def
            com.sun.tools.javac.util.List r1 = r1.defs
            r2 = 0
            r3 = 0
            r0.printClassMembers(r1, r2, r3)
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.endPos(r2)
            r0.consumeComments(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r5
            java.lang.String r1 = "}"
            r0.aPrint(r1)
        L99:
            return
    }

    public void visitTypeApply(com.sun.tools.javac.tree.JCTree.JCTypeApply r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.clazz
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "<"
            r0.print(r1)
            r0 = r4
            boolean r0 = r0.innermostArrayBracketsAreVarargs
            r6 = r0
            r0 = r4
            r1 = 0
            r0.innermostArrayBracketsAreVarargs = r1
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.arguments
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r4
            r1 = r6
            r0.innermostArrayBracketsAreVarargs = r1
            r0 = r4
            java.lang.String r1 = ">"
            r0.print(r1)
            return
    }

    public void visitWildcard(com.sun.tools.javac.tree.JCTree.JCWildcard r4) {
            r3 = this;
            int[] r0 = $SWITCH_TABLE$com$sun$source$tree$Tree$Kind()
            r1 = r4
            com.sun.source.tree.Tree$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 88: goto L24;
                case 89: goto L2c;
                case 90: goto L3c;
                default: goto L24;
            }
        L24:
            r0 = r3
            java.lang.String r1 = "?"
            r0.print(r1)
            return
        L2c:
            r0 = r3
            java.lang.String r1 = "? extends "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree r1 = r1.inner
            r0.print(r1)
            return
        L3c:
            r0 = r3
            java.lang.String r1 = "? super "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree r1 = r1.inner
            r0.print(r1)
            return
    }

    public void visitLiteral(com.sun.tools.javac.tree.JCTree.JCLiteral r6) {
            r5 = this;
            r0 = r6
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            r7 = r0
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_INT
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r6
            java.lang.Object r2 = r2.value
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            goto L14a
        L27:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_LONG
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4f
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r6
            java.lang.Object r2 = r2.value
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "L"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            goto L14a
        L4f:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_FLOAT
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L77
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r6
            java.lang.Object r2 = r2.value
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "F"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            goto L14a
        L77:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_DOUBLE
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L99
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r6
            java.lang.Object r2 = r2.value
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            goto L14a
        L99:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_CHAR
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lce
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2 = r6
            java.lang.Object r2 = r2.value
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            char r2 = (char) r2
            java.lang.String r2 = quoteChar(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            goto L14a
        Lce:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BOOLEAN
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf6
            r0 = r5
            r1 = r6
            java.lang.Object r1 = r1.value
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != r2) goto Led
            java.lang.String r1 = "true"
            goto Lf0
        Led:
            java.lang.String r1 = "false"
        Lf0:
            r0.print(r1)
            goto L14a
        Lf6:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BOT
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10a
            r0 = r5
            java.lang.String r1 = "null"
            r0.print(r1)
            goto L14a
        L10a:
            r0 = r5
            int[] r0 = r0.textBlockStarts
            r1 = r6
            int r1 = r1.pos
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 >= 0) goto L13f
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "\""
            r2.<init>(r3)
            r2 = r6
            java.lang.Object r2 = r2.value
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = quoteChars(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            goto L14a
        L13f:
            r0 = r5
            r1 = r6
            java.lang.Object r1 = r1.value
            java.lang.String r1 = r1.toString()
            r0.printTextBlock(r1)
        L14a:
            return
    }

    private void printTextBlock(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "\"\"\""
            r0.println(r1)
            r0 = r4
            r1 = 1
            r0.needsAlign = r1
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
            goto L80
        L26:
            r0 = r5
            r1 = r8
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 32
            if (r0 == r1) goto L3e
            r0 = r9
            r1 = 9
            if (r0 == r1) goto L3e
            r0 = 0
            r7 = r0
        L3e:
            r0 = r9
            r1 = 10
            if (r0 != r1) goto L59
            r0 = r4
            r1 = r6
            r0.println(r1)
            r0 = r6
            r1 = 0
            r0.setLength(r1)
            r0 = r4
            r1 = 1
            r0.needsAlign = r1
            r0 = 1
            r7 = r0
            goto L7d
        L59:
            r0 = r9
            r1 = 9
            if (r0 != r1) goto L6f
            r0 = r7
            if (r0 == 0) goto L6f
            r0 = r6
            java.lang.String r1 = "\t"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L7d
        L6f:
            r0 = r6
            r1 = r5
            r2 = r8
            char r1 = r1.charAt(r2)
            java.lang.String r1 = quoteChar(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
        L7d:
            int r8 = r8 + 1
        L80:
            r0 = r8
            r1 = r5
            int r1 = r1.length()
            if (r0 < r1) goto L26
            r0 = r4
            r1 = r6
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "\"\"\""
            r0.print(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            return
    }

    public void visitMethodDef(com.sun.tools.javac.tree.JCTree.JCMethodDecl r6) {
            r5 = this;
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r5
            r2 = r6
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.util.Name r1 = r1.name_init(r2)
            if (r0 != r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2a
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2a
            return
        L2a:
            r0 = r5
            r1 = r6
            r0.printDocComment(r1)
            r0 = r5
            r0.align()
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            r0.print(r1)
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.typarams
            if (r0 == 0) goto L64
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.typarams
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L64
            r0 = r5
            java.lang.String r1 = "<"
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.typarams
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r5
            java.lang.String r1 = "> "
            r0.print(r1)
        L64:
            r0 = r7
            if (r0 == 0) goto L80
            r0 = r5
            r1 = r5
            com.sun.tools.javac.util.Name r1 = r1.currentTypeName
            if (r1 != 0) goto L76
            java.lang.String r1 = "<init>"
            goto L7a
        L76:
            r1 = r5
            com.sun.tools.javac.util.Name r1 = r1.currentTypeName
        L7a:
            r0.print(r1)
            goto L97
        L80:
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.restype
            r0.print(r1)
            r0 = r5
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
        L97:
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto Laf
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Laf
            r0 = 1
            r8 = r0
        Laf:
            r0 = 1
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L117
            r0 = r5
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "recvparam"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Ld9
            r0 = r5
            r1 = r10
            r0.printVarDefInline(r1)
            r0 = 0
            r9 = r0
        Ld9:
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.params
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L106
        Le5:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r11 = r0
            r0 = r9
            if (r0 != 0) goto Lfd
            r0 = r5
            java.lang.String r1 = ", "
            r0.print(r1)
        Lfd:
            r0 = 0
            r9 = r0
            r0 = r5
            r1 = r11
            r0.printVarDefInline(r1)
        L106:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le5
            r0 = r5
            java.lang.String r1 = ")"
            r0.print(r1)
        L117:
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.thrown
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L133
            r0 = r5
            java.lang.String r1 = " throws "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.thrown
            java.lang.String r2 = ", "
            r0.print(r1, r2)
        L133:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.defaultValue
            if (r0 == 0) goto L149
            r0 = r5
            java.lang.String r1 = " default "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.defaultValue
            r0.print(r1)
        L149:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            if (r0 == 0) goto L162
            r0 = r5
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = r1.body
            r0.print(r1)
            goto L16a
        L162:
            r0 = r5
            java.lang.String r1 = ";"
            r2 = r6
            r0.println(r1, r2)
        L16a:
            return
    }

    public void visitSkip(com.sun.tools.javac.tree.JCTree.JCSkip r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.onNewLine
            if (r0 == 0) goto L12
            r0 = r3
            boolean r0 = r0.aligned
            if (r0 != 0) goto L12
            r0 = r3
            r0.align()
        L12:
            r0 = r3
            java.lang.String r1 = ";"
            r0.println(r1)
            return
    }

    public void visitAnnotation(com.sun.tools.javac.tree.JCTree.JCAnnotation r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "@"
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree r1 = r1.annotationType
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return
        L1a:
            r0 = r4
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = 0
            r6 = r0
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto L7f
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssign
            if (r0 == 0) goto L7f
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L5c
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            goto L5d
        L5c:
            r0 = 0
        L5d:
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L7f
            r0 = r8
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r4
            r2 = r8
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.util.Name r1 = r1.name_value(r2)
            if (r0 != r1) goto L7f
            r0 = r4
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.rhs
            r0.print(r1)
            r0 = 1
            r6 = r0
        L7f:
            r0 = r6
            if (r0 != 0) goto L8e
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.args
            java.lang.String r2 = ", "
            r0.print(r1, r2)
        L8e:
            r0 = r4
            java.lang.String r1 = ")"
            r0.print(r1)
            return
    }

    public void visitTypeArray(com.sun.tools.javac.tree.JCTree.JCArrayTypeTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.printTypeArray0(r1)
            return
    }

    public void visitNewArray(com.sun.tools.javac.tree.JCTree.JCNewArray r5) {
            r4 = this;
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L62
            r0 = r4
            java.lang.String r1 = "new "
            r0.print(r1)
            goto L20
        L15:
            int r7 = r7 + 1
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r6 = r0
        L20:
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 != 0) goto L15
            r0 = r4
            r1 = r6
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.dims
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L58
        L38:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r8 = r0
            r0 = r4
            java.lang.String r1 = "["
            r0.print(r1)
            r0 = r4
            r1 = r8
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "]"
            r0.print(r1)
        L58:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L38
        L62:
            r0 = 0
            r8 = r0
            goto L72
        L68:
            r0 = r4
            java.lang.String r1 = "[]"
            r0.print(r1)
            int r8 = r8 + 1
        L72:
            r0 = r8
            r1 = r7
            if (r0 < r1) goto L68
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.elems
            if (r0 == 0) goto La3
            r0 = r6
            if (r0 == 0) goto L8a
            r0 = r4
            java.lang.String r1 = "[] "
            r0.print(r1)
        L8a:
            r0 = r4
            java.lang.String r1 = "{"
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.elems
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r4
            java.lang.String r1 = "}"
            r0.print(r1)
        La3:
            return
    }

    public void visitNewClass(com.sun.tools.javac.tree.JCTree.JCNewClass r5) {
            r4 = this;
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.encl
            if (r0 == 0) goto L16
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.encl
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "."
            r0.print(r1)
        L16:
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L46
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            java.lang.Object r0 = r0.head
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCUnary
            if (r0 == 0) goto L46
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.args
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "<*nullchk*>"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L64
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.args
            java.lang.Object r1 = r1.head
            com.sun.tools.javac.tree.JCTree$JCUnary r1 = (com.sun.tools.javac.tree.JCTree.JCUnary) r1
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.arg
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "."
            r0.print(r1)
        L64:
            r0 = r4
            java.lang.String r1 = "new "
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.typeargs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
            r0 = r4
            java.lang.String r1 = "<"
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.typeargs
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r4
            java.lang.String r1 = ">"
            r0.print(r1)
        L8c:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.clazz
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r6
            if (r0 == 0) goto Lb0
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.args
            com.sun.tools.javac.util.List r1 = r1.tail
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            goto Lbb
        Lb0:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.args
            java.lang.String r2 = ", "
            r0.print(r1, r2)
        Lbb:
            r0 = r4
            java.lang.String r1 = ")"
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.def
            if (r0 == 0) goto L108
            r0 = r4
            com.sun.tools.javac.util.Name r0 = r0.currentTypeName
            r7 = r0
            r0 = r4
            r1 = 0
            r0.currentTypeName = r1
            r0 = r4
            java.lang.String r1 = " {"
            r0.println(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = r1.def
            com.sun.tools.javac.util.List r1 = r1.defs
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r4
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            r0 = r4
            r1 = r7
            r0.currentTypeName = r1
        L108:
            return
    }

    public void visitIndexed(com.sun.tools.javac.tree.JCTree.JCArrayAccess r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.indexed
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = "["
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.index
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = "]"
            r0.print(r1)
            return
    }

    public void visitTypeIdent(com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree r4) {
            r3 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            r5 = r0
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BYTE
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            r0 = r3
            java.lang.String r1 = "byte"
            r0.print(r1)
            goto Lc0
        L19:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_CHAR
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            r0 = r3
            java.lang.String r1 = "char"
            r0.print(r1)
            goto Lc0
        L2d:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_SHORT
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            r0 = r3
            java.lang.String r1 = "short"
            r0.print(r1)
            goto Lc0
        L41:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_INT
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L55
            r0 = r3
            java.lang.String r1 = "int"
            r0.print(r1)
            goto Lc0
        L55:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_LONG
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            r0 = r3
            java.lang.String r1 = "long"
            r0.print(r1)
            goto Lc0
        L69:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_FLOAT
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            r0 = r3
            java.lang.String r1 = "float"
            r0.print(r1)
            goto Lc0
        L7d:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_DOUBLE
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L91
            r0 = r3
            java.lang.String r1 = "double"
            r0.print(r1)
            goto Lc0
        L91:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BOOLEAN
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La5
            r0 = r3
            java.lang.String r1 = "boolean"
            r0.print(r1)
            goto Lc0
        La5:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_VOID
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb9
            r0 = r3
            java.lang.String r1 = "void"
            r0.print(r1)
            goto Lc0
        Lb9:
            r0 = r3
            java.lang.String r1 = "error"
            r0.print(r1)
        Lc0:
            return
    }

    public void visitLabelled(com.sun.tools.javac.tree.JCTree.JCLabeledStatement r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.Name r1 = r1.label
            r0.aPrint(r1)
            r0 = r4
            java.lang.String r1 = ":"
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.body
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCSkip
            if (r0 != 0) goto L21
            r0 = r4
            r1 = r5
            boolean r0 = r0.suppress(r1)
            if (r0 == 0) goto L2c
        L21:
            r0 = r4
            java.lang.String r1 = " ;"
            r2 = r5
            r0.println(r1, r2)
            goto L55
        L2c:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.body
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L48
            r0 = r4
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            r0.print(r1)
            goto L55
        L48:
            r0 = r4
            r1 = r5
            r0.println(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            r0.print(r1)
        L55:
            return
    }

    public void visitModifiers(com.sun.tools.javac.tree.JCTree.JCModifiers r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = 1
            r0.printAnnotations(r1, r2)
            r0 = r4
            r1 = r5
            r0.printModifierKeywords(r1)
            return
    }

    private void printAnnotations(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r4, boolean r5) {
            r3 = this;
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L2f
        L9:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r6 = r0
            r0 = r3
            r1 = r6
            r0.print(r1)
            r0 = r5
            if (r0 == 0) goto L28
            r0 = r3
            r0.println()
            r0 = r3
            r0.align()
            goto L2f
        L28:
            r0 = r3
            java.lang.String r1 = " "
            r0.print(r1)
        L2f:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9
            return
    }

    private void printModifierKeywords(com.sun.tools.javac.tree.JCTree.JCModifiers r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.flagMod
            r1 = r6
            long r1 = r1.flags
            long r0 = r0 & r1
            r7 = r0
            r0 = r5
            r1 = -1
            r0.flagMod = r1
            r0 = r7
            r1 = 4096(0x1000, double:2.0237E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L22
            r0 = r5
            java.lang.String r1 = "/* synthetic */ "
            r0.print(r1)
        L22:
            r0 = r7
            r1 = 1
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            r0 = r5
            java.lang.String r1 = "public "
            r0.print(r1)
        L31:
            r0 = r7
            r1 = 2
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L42
            r0 = r5
            java.lang.String r1 = "private "
            r0.print(r1)
        L42:
            r0 = r7
            r1 = 4
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L53
            r0 = r5
            java.lang.String r1 = "protected "
            r0.print(r1)
        L53:
            r0 = r7
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L64
            r0 = r5
            java.lang.String r1 = "static "
            r0.print(r1)
        L64:
            r0 = r7
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L75
            r0 = r5
            java.lang.String r1 = "final "
            r0.print(r1)
        L75:
            r0 = r7
            r1 = 32
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L86
            r0 = r5
            java.lang.String r1 = "synchronized "
            r0.print(r1)
        L86:
            r0 = r7
            r1 = 64
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L97
            r0 = r5
            java.lang.String r1 = "volatile "
            r0.print(r1)
        L97:
            r0 = r7
            r1 = 128(0x80, double:6.32E-322)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La8
            r0 = r5
            java.lang.String r1 = "transient "
            r0.print(r1)
        La8:
            r0 = r7
            r1 = 256(0x100, double:1.265E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb9
            r0 = r5
            java.lang.String r1 = "native "
            r0.print(r1)
        Lb9:
            r0 = r7
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lca
            r0 = r5
            java.lang.String r1 = "abstract "
            r0.print(r1)
        Lca:
            r0 = r7
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ldb
            r0 = r5
            java.lang.String r1 = "sealed "
            r0.print(r1)
        Ldb:
            r0 = r7
            r1 = -9223372036854775808
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lec
            r0 = r5
            java.lang.String r1 = "non-sealed "
            r0.print(r1)
        Lec:
            r0 = r7
            r1 = 2048(0x800, double:1.0118E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lfd
            r0 = r5
            java.lang.String r1 = "strictfp "
            r0.print(r1)
        Lfd:
            r0 = r7
            r1 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L118
            r0 = r7
            r1 = 512(0x200, double:2.53E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L118
            r0 = r5
            java.lang.String r1 = "default "
            r0.print(r1)
        L118:
            return
    }

    public void visitSelect(com.sun.tools.javac.tree.JCTree.JCFieldAccess r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.selected
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = "."
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            return
    }

    public void visitIdent(com.sun.tools.javac.tree.JCTree.JCIdent r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            return
    }

    public void visitApply(com.sun.tools.javac.tree.JCTree.JCMethodInvocation r5) {
            r4 = this;
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.typeargs
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto L69
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L47
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r6 = r0
            r0 = r4
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.selected
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ".<"
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.typeargs
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r4
            java.lang.String r1 = ">"
            r0.print(r1)
            r0 = r4
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            goto L71
        L47:
            r0 = r4
            java.lang.String r1 = "<"
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.typeargs
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r4
            java.lang.String r1 = ">"
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.meth
            r0.print(r1)
            goto L71
        L69:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.meth
            r0.print(r1)
        L71:
            r0 = r4
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.args
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r4
            java.lang.String r1 = ")"
            r0.print(r1)
            return
    }

    public void visitAssert(com.sun.tools.javac.tree.JCTree.JCAssert r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "assert "
            r0.aPrint(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.detail
            if (r0 == 0) goto L25
            r0 = r4
            java.lang.String r1 = " : "
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.detail
            r0.print(r1)
        L25:
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitAssign(com.sun.tools.javac.tree.JCTree.JCAssign r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.lhs
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = " = "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.rhs
            r0.print(r1)
            return
    }

    public void visitAssignop(com.sun.tools.javac.tree.JCTree.JCAssignOp r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.lhs
            r0.print(r1)
            r0 = r6
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            java.lang.String r0 = operator(r0)
            r7 = r0
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = " "
            r2.<init>(r3)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.rhs
            r0.print(r1)
            return
    }

    public void visitUnary(com.sun.tools.javac.tree.JCTree.JCUnary r4) {
            r3 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            java.lang.String r0 = operator(r0)
            r5 = r0
            r0 = r4
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            int r0 = r0.getOperatorPrecedenceLevel()
            r1 = 14
            if (r0 != r1) goto L24
            r0 = r3
            r1 = r5
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.arg
            r0.print(r1)
            goto L31
        L24:
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.arg
            r0.print(r1)
            r0 = r3
            r1 = r5
            r0.print(r1)
        L31:
            return
    }

    public void visitBinary(com.sun.tools.javac.tree.JCTree.JCBinary r4) {
            r3 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.JavacTreeMaker.TreeTag.treeTag(r0)
            java.lang.String r0 = operator(r0)
            r5 = r0
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.lhs
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r3
            r1 = r5
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.rhs
            r0.print(r1)
            return
    }

    public void visitTypeTest(com.sun.tools.javac.tree.JCTree.JCInstanceOf r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
            r0 = r5
            java.lang.String r1 = " instanceof "
            r0.print(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "clazz"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2d
            r0 = r5
            r1 = r6
            java.lang.String r2 = "pattern"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
        L2d:
            r0 = r5
            r1 = r7
            r0.print(r1)
            return
    }

    public void visitTypeCast(com.sun.tools.javac.tree.JCTree.JCTypeCast r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree r1 = r1.clazz
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = ") "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
            return
    }

    public void visitBlock(com.sun.tools.javac.tree.JCTree.JCBlock r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.pos
            r1 = -1
            if (r0 != r1) goto L13
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.stats
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            return
        L13:
            r0 = r5
            boolean r0 = r0.onNewLine
            if (r0 == 0) goto L1e
            r0 = r5
            r0.align()
        L1e:
            r0 = r6
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
            r0 = r5
            java.lang.String r1 = "static "
            r0.print(r1)
        L32:
            r0 = r5
            java.lang.String r1 = "{"
            r0.println(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.stats
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.endPos(r2)
            r0.consumeComments(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r5
            java.lang.String r1 = "}"
            r2 = r6
            r0.aPrintln(r1, r2)
            return
    }

    public void visitBreak(com.sun.tools.javac.tree.JCTree.JCBreak r6) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "break"
            r0.aPrint(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "value"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r5
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r5
            r1 = r7
            r0.print(r1)
            goto L44
        L27:
            r0 = r5
            r1 = r6
            java.lang.String r2 = "label"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.Name r0 = (com.sun.tools.javac.util.Name) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L44
            r0 = r5
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r5
            r1 = r8
            r0.print(r1)
        L44:
            r0 = r5
            java.lang.String r1 = ";"
            r2 = r6
            r0.println(r1, r2)
            return
    }

    public void visitContinue(com.sun.tools.javac.tree.JCTree.JCContinue r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "continue"
            r0.aPrint(r1)
            r0 = r5
            com.sun.tools.javac.util.Name r0 = r0.label
            if (r0 == 0) goto L1d
            r0 = r4
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.Name r1 = r1.label
            r0.print(r1)
        L1d:
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitConditional(com.sun.tools.javac.tree.JCTree.JCConditional r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = " ? "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.truepart
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = " : "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.falsepart
            r0.print(r1)
            return
    }

    public void visitParens(com.sun.tools.javac.tree.JCTree.JCParens r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = ")"
            r0.print(r1)
            return
    }

    public void visitReturn(com.sun.tools.javac.tree.JCTree.JCReturn r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "return"
            r0.aPrint(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.expr
            if (r0 == 0) goto L1d
            r0 = r4
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
        L1d:
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitThrow(com.sun.tools.javac.tree.JCTree.JCThrow r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "throw "
            r0.aPrint(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitWhileLoop(com.sun.tools.javac.tree.JCTree.JCWhileLoop r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "while "
            r0.aPrint(r1)
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cond
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 == 0) goto L1c
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            goto L32
        L1c:
            r0 = r3
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = ")"
            r0.print(r1)
        L32:
            r0 = r3
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            r0.print(r1)
            return
    }

    public void visitForLoop(com.sun.tools.javac.tree.JCTree.JCForLoop r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "for ("
            r0.aPrint(r1)
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.init
            boolean r0 = r0.nonEmpty()
            if (r0 == 0) goto Lee
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.init
            java.lang.Object r0 = r0.head
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto Lb3
            r0 = 1
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.init
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto La6
        L2e:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r9 = r0
            r0 = r5
            if (r0 == 0) goto L58
            r0 = r3
            r1 = r9
            r0.printVarDefInline(r1)
            r0 = r3
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            int r0 = r0.dims(r1)
            r6 = r0
            goto La4
        L58:
            r0 = r3
            java.lang.String r1 = ", "
            r0.print(r1)
            r0 = r3
            r1 = r9
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            r0 = r3
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            int r0 = r0.dims(r1)
            r1 = r6
            int r0 = r0 - r1
            r10 = r0
            r0 = 0
            r11 = r0
            goto L85
        L7b:
            r0 = r3
            java.lang.String r1 = "[]"
            r0.print(r1)
            int r11 = r11 + 1
        L85:
            r0 = r11
            r1 = r10
            if (r0 < r1) goto L7b
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto La4
            r0 = r3
            java.lang.String r1 = " = "
            r0.print(r1)
            r0 = r3
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.init
            r0.print(r1)
        La4:
            r0 = 0
            r5 = r0
        La6:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2e
            goto Lee
        Lb3:
            r0 = 1
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.init
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto Le4
        Lc1:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto Ld7
            r0 = r3
            java.lang.String r1 = ", "
            r0.print(r1)
        Ld7:
            r0 = 0
            r5 = r0
            r0 = r3
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r1
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
        Le4:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc1
        Lee:
            r0 = r3
            java.lang.String r1 = "; "
            r0.print(r1)
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cond
            if (r0 == 0) goto L104
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
        L104:
            r0 = r3
            java.lang.String r1 = "; "
            r0.print(r1)
            r0 = 1
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.step
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L139
        L119:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L12f
            r0 = r3
            java.lang.String r1 = ", "
            r0.print(r1)
        L12f:
            r0 = 0
            r5 = r0
            r0 = r3
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
        L139:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L119
            r0 = r3
            java.lang.String r1 = ") "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            r0.print(r1)
            return
    }

    public void visitForeachLoop(com.sun.tools.javac.tree.JCTree.JCEnhancedForLoop r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "for ("
            r0.aPrint(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.var
            r0.printVarDefInline(r1)
            r0 = r3
            java.lang.String r1 = " : "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = ") "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            r0.print(r1)
            return
    }

    public void visitIf(com.sun.tools.javac.tree.JCTree.JCIf r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "if "
            r0.aPrint(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cond
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 == 0) goto L1c
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            goto L32
        L1c:
            r0 = r4
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ")"
            r0.print(r1)
        L32:
            r0 = r4
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.thenpart
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L8b
            r0 = r4
            java.lang.String r1 = "{"
            r0.println(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.thenpart
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = (com.sun.tools.javac.tree.JCTree.JCBlock) r1
            com.sun.tools.javac.util.List r1 = r1.stats
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.elsepart
            if (r0 != 0) goto L81
            r0 = r4
            java.lang.String r1 = "}"
            r2 = r5
            r0.aPrintln(r1, r2)
            goto L93
        L81:
            r0 = r4
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            goto L93
        L8b:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.thenpart
            r0.print(r1)
        L93:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.elsepart
            if (r0 == 0) goto La9
            r0 = r4
            java.lang.String r1 = " else "
            r0.aPrint(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.elsepart
            r0.print(r1)
        La9:
            return
    }

    public void visitExec(com.sun.tools.javac.tree.JCTree.JCExpressionStatement r5) {
            r4 = this;
            r0 = r4
            r0.align()
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.expr
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitDoLoop(com.sun.tools.javac.tree.JCTree.JCDoWhileLoop r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "do "
            r0.aPrint(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.body
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L47
            r0 = r4
            java.lang.String r1 = "{"
            r0.println(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = (com.sun.tools.javac.tree.JCTree.JCBlock) r1
            com.sun.tools.javac.util.List r1 = r1.stats
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r4
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            goto L4f
        L47:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.body
            r0.print(r1)
        L4f:
            r0 = r4
            java.lang.String r1 = " while "
            r0.print(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cond
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 == 0) goto L6b
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            goto L81
        L6b:
            r0 = r4
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.cond
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ")"
            r0.print(r1)
        L81:
            r0 = r4
            java.lang.String r1 = ";"
            r2 = r5
            r0.println(r1, r2)
            return
    }

    public void visitSynchronized(com.sun.tools.javac.tree.JCTree.JCSynchronized r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "synchronized "
            r0.aPrint(r1)
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lock
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 == 0) goto L1c
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.lock
            r0.print(r1)
            goto L32
        L1c:
            r0 = r3
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.lock
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = ")"
            r0.print(r1)
        L32:
            r0 = r3
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = r1.body
            r0.print(r1)
            return
    }

    public void visitCase(com.sun.tools.javac.tree.JCTree.JCCase r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r2 = "labels"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1e
            r0 = r6
            r1 = r7
            java.lang.String r2 = "pats"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r8 = r0
        L1e:
            r0 = r8
            if (r0 != 0) goto L3e
            r0 = r6
            r1 = r7
            java.lang.String r2 = "pat"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L39
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            goto L3d
        L39:
            r0 = r9
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
        L3d:
            r8 = r0
        L3e:
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L63
            r0 = r8
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L6d
            r0 = r8
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$JCDefaultCaseLabel"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L6d
        L63:
            r0 = r6
            java.lang.String r1 = "default"
            r0.aPrint(r1)
            goto L7c
        L6d:
            r0 = r6
            java.lang.String r1 = "case "
            r0.aPrint(r1)
            r0 = r6
            r1 = r8
            java.lang.String r2 = ", "
            r0.print(r1, r2)
        L7c:
            r0 = r6
            r1 = r7
            java.lang.String r2 = "caseKind"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            java.lang.Enum r0 = (java.lang.Enum) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L148
            r0 = r9
            java.lang.String r0 = r0.name()
            java.lang.String r1 = "RULE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L148
            r0 = r6
            java.lang.String r1 = " -> "
            r0.print(r1)
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.stats
            java.lang.Object r0 = r0.head
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBreak
            if (r0 == 0) goto Ldf
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.stats
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = (com.sun.tools.javac.tree.JCTree.JCBreak) r0
            r10 = r0
            r0 = r6
            r1 = r6
            r2 = r10
            java.lang.String r3 = "value"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = ";"
            r0.print(r1)
            r0 = r6
            r1 = 1
            r0.needsNewLine = r1
            r0 = r6
            r1 = 1
            r0.needsAlign = r1
            goto L16e
        Ldf:
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.stats
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$JCYield"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L125
            r0 = r6
            r1 = r6
            r2 = r7
            com.sun.tools.javac.util.List r2 = r2.stats
            java.lang.Object r2 = r2.head
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            java.lang.String r3 = "value"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = ";"
            r0.print(r1)
            r0 = r6
            r1 = 1
            r0.needsNewLine = r1
            r0 = r6
            r1 = 1
            r0.needsAlign = r1
            goto L16e
        L125:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.stats
            java.lang.Object r1 = r1.head
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.stats
            java.lang.Object r0 = r0.head
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L16e
            r0 = r6
            r1 = 0
            r0.needsNewLine = r1
            goto L16e
        L148:
            r0 = r6
            java.lang.String r1 = ": "
            r0.println(r1)
            r0 = r6
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r6
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.stats
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r6
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
        L16e:
            return
    }

    public void visitCatch(com.sun.tools.javac.tree.JCTree.JCCatch r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = " catch ("
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.param
            r0.print(r1)
            r0 = r3
            java.lang.String r1 = ") "
            r0.print(r1)
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = r1.body
            r0.print(r1)
            return
    }

    public void visitSwitch(com.sun.tools.javac.tree.JCTree.JCSwitch r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "switch "
            r0.aPrint(r1)
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selector
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 == 0) goto L1c
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.selector
            r0.print(r1)
            goto L32
        L1c:
            r0 = r4
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.selector
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ")"
            r0.print(r1)
        L32:
            r0 = r4
            java.lang.String r1 = " {"
            r0.println(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.cases
            java.lang.Object r1 = r1.head
            com.sun.tools.javac.tree.JCTree$JCCase r1 = (com.sun.tools.javac.tree.JCTree.JCCase) r1
            boolean r0 = r0.isCaseRuleStyle(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L56
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
        L56:
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = r1.cases
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r6
            if (r0 == 0) goto L6f
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
        L6f:
            r0 = r4
            java.lang.String r1 = "}"
            r2 = r5
            r0.aPrintln(r1, r2)
            return
    }

    void printSwitchExpression(com.sun.tools.javac.tree.JCTree r6) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "switch "
            r0.aPrint(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "selector"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCParens
            if (r0 == 0) goto L23
            r0 = r5
            r1 = r7
            r0.print(r1)
            goto L36
        L23:
            r0 = r5
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r5
            r1 = r7
            r0.print(r1)
            r0 = r5
            java.lang.String r1 = ")"
            r0.print(r1)
        L36:
            r0 = r5
            java.lang.String r1 = " {"
            r0.println(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "cases"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r8 = r0
            r0 = r5
            r1 = r8
            java.lang.Object r1 = r1.head
            com.sun.tools.javac.tree.JCTree$JCCase r1 = (com.sun.tools.javac.tree.JCTree.JCCase) r1
            boolean r0 = r0.isCaseRuleStyle(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L66
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
        L66:
            r0 = r5
            r1 = r8
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r9
            if (r0 == 0) goto L7d
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
        L7d:
            r0 = r5
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            return
    }

    void printYieldExpression(com.sun.tools.javac.tree.JCTree r6) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "yield "
            r0.aPrint(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "value"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r7 = r0
            r0 = r5
            r1 = r7
            r0.print(r1)
            r0 = r5
            java.lang.String r1 = ";"
            r2 = r6
            r0.println(r1, r2)
            return
    }

    void printBindingPattern(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r2 = "var"
            r3 = r7
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r6
            r1 = r6
            r2 = r8
            java.lang.String r3 = "vartype"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r6
            r1 = r6
            r2 = r8
            java.lang.String r3 = "name"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.util.Name r1 = (com.sun.tools.javac.util.Name) r1
            r0.print(r1)
            return
    }

    void printDefaultCase(com.sun.tools.javac.tree.JCTree r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "default"
            r0.print(r1)
            return
    }

    void printGuardPattern(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "patt"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = " && "
            r0.print(r1)
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "expr"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r0.print(r1)
            return
    }

    void printParenthesizedPattern(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "pattern"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = ")"
            r0.print(r1)
            return
    }

    void printConstantCaseLabel(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "expr"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            return
    }

    void printPatternCaseLabel(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "pat"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            r0 = r6
            r1 = r7
            java.lang.String r2 = "guard"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L2d
            r0 = r6
            java.lang.String r1 = " when "
            r0.print(r1)
            r0 = r6
            r1 = r8
            r0.print(r1)
        L2d:
            return
    }

    void printRecordPattern(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "deconstructor"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "nested"
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.util.List r1 = (com.sun.tools.javac.util.List) r1
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r6
            java.lang.String r1 = ")"
            r0.print(r1)
            r0 = r6
            r1 = r7
            java.lang.String r2 = "var"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L53
            r0 = r6
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r6
            r1 = r8
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
        L53:
            return
    }

    public void visitTry(com.sun.tools.javac.tree.JCTree.JCTry r6) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "try "
            r0.aPrint(r1)
            r0 = r5
            r1 = r6
            java.lang.String r2 = "resources"
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r7 = r0
            r0 = r7
            int r0 = r0.length()
            r8 = r0
            r0 = r8
            switch(r0) {
                case 0: goto L34;
                case 1: goto L37;
                default: goto L77;
            }
        L34:
            goto Lf8
        L37:
            r0 = r5
            java.lang.String r1 = "("
            r0.print(r1)
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L67
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r5
            r1 = -17
            r0.flagMod = r1
            r0 = r5
            r1 = r10
            r0.printVarDefInline(r1)
            goto L6d
        L67:
            r0 = r5
            r1 = r9
            r0.print(r1)
        L6d:
            r0 = r5
            java.lang.String r1 = ") "
            r0.print(r1)
            goto Lf8
        L77:
            r0 = r5
            java.lang.String r1 = "("
            r0.println(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto Le4
        L94:
            r0 = r12
            java.lang.Object r0 = r0.next()
            r11 = r0
            r0 = r5
            r0.align()
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto Lbc
            r0 = r5
            r1 = -17
            r0.flagMod = r1
            r0 = r5
            r1 = r11
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            r0.printVarDefInline(r1)
            goto Lc5
        Lbc:
            r0 = r5
            r1 = r11
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
        Lc5:
            int r10 = r10 + 1
            r0 = r10
            r1 = r8
            if (r0 != r1) goto Ld8
            r0 = r5
            java.lang.String r1 = ") "
            r0.print(r1)
            goto Le4
        Ld8:
            r0 = r5
            java.lang.String r1 = ";"
            r2 = r11
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r0.println(r1, r2)
        Le4:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L94
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
        Lf8:
            r0 = r5
            java.lang.String r1 = "{"
            r0.println(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L12a
        L118:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r9 = r0
            r0 = r5
            r1 = r9
            r0.print(r1)
        L12a:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L118
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r5
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.catchers
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L163
        L151:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCCatch r0 = (com.sun.tools.javac.tree.JCTree.JCCatch) r0
            r9 = r0
            r0 = r5
            r1 = r9
            r0.printCatch(r1)
        L163:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L151
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.finalizer
            if (r0 == 0) goto L1c1
            r0 = r5
            java.lang.String r1 = " finally {"
            r0.println(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.finalizer
            com.sun.tools.javac.util.List r0 = r0.stats
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L1a6
        L194:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r9 = r0
            r0 = r5
            r1 = r9
            r0.print(r1)
        L1a6:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L194
            r0 = r5
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r5
            java.lang.String r1 = "}"
            r0.aPrint(r1)
        L1c1:
            r0 = r5
            r1 = r6
            r0.println(r1)
            return
    }

    private void printCatch(com.sun.tools.javac.tree.JCTree.JCCatch r5) {
            r4 = this;
            r0 = r4
            java.lang.String r1 = " catch ("
            r0.print(r1)
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.param
            r0.printVarDefInline(r1)
            r0 = r4
            java.lang.String r1 = ") {"
            r0.println(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L3d
        L2e:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r6 = r0
            r0 = r4
            r1 = r6
            r0.print(r1)
        L3d:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2e
            r0 = r4
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r4
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            return
    }

    public void visitErroneous(com.sun.tools.javac.tree.JCTree.JCErroneous r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "(ERROR)"
            r0.print(r1)
            return
    }

    private static java.lang.String operator(lombok.javac.JavacTreeMaker.TreeTag r3) {
            java.util.Map<lombok.javac.JavacTreeMaker$TreeTag, java.lang.String> r0 = lombok.delombok.PrettyPrinter.OPERATORS
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L15
            java.lang.String r0 = "(?op?)"
            return r0
        L15:
            r0 = r4
            return r0
    }

    private static java.lang.String quoteChars(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = 0
            r6 = r0
            goto L1d
        Ld:
            r0 = r5
            r1 = r4
            r2 = r6
            char r1 = r1.charAt(r2)
            java.lang.String r1 = quoteChar(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
        L1d:
            r0 = r6
            r1 = r4
            int r1 = r1.length()
            if (r0 < r1) goto Ld
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String quoteChar(char r6) {
            r0 = r6
            switch(r0) {
                case 8: goto L4c;
                case 9: goto L5c;
                case 10: goto L54;
                case 12: goto L50;
                case 13: goto L58;
                case 34: goto L64;
                case 39: goto L60;
                case 92: goto L68;
                default: goto L6c;
            }
        L4c:
            java.lang.String r0 = "\\b"
            return r0
        L50:
            java.lang.String r0 = "\\f"
            return r0
        L54:
            java.lang.String r0 = "\\n"
            return r0
        L58:
            java.lang.String r0 = "\\r"
            return r0
        L5c:
            java.lang.String r0 = "\\t"
            return r0
        L60:
            java.lang.String r0 = "\\'"
            return r0
        L64:
            java.lang.String r0 = "\\\""
            return r0
        L68:
            java.lang.String r0 = "\\\\"
            return r0
        L6c:
            r0 = r6
            r1 = 32
            if (r0 >= r1) goto L84
            java.lang.String r0 = "\\%03o"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
        L84:
            r0 = r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
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
            java.lang.reflect.Method r0 = lombok.delombok.PrettyPrinter.getExtendsClause
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            return r0
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

    private <T> T readObject(com.sun.tools.javac.tree.JCTree r6, java.lang.String r7, T r8) {
            r5 = this;
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r9 = r0
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.reflect.Field>> r0 = lombok.delombok.PrettyPrinter.reflectionCache
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L2f
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.reflect.Field>> r0 = lombok.delombok.PrettyPrinter.reflectionCache
            r1 = r9
            java.util.HashMap r2 = new java.util.HashMap
            r3 = r2
            r3.<init>()
            r3 = r2
            r10 = r3
            java.lang.Object r0 = r0.put(r1, r2)
        L2f:
            r0 = r10
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L5a
            r0 = r9
            r1 = r7
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L4c
            r11 = r0
            goto L4f
        L4c:
            r0 = r8
            return r0
        L4f:
            r0 = r10
            r1 = r7
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
        L5a:
            r0 = r11
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L61
            return r0
        L61:
            r0 = r8
            return r0
    }

    public void visitTypeBoundKind(com.sun.tools.javac.tree.JCTree.TypeBoundKind r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.sun.tools.javac.code.BoundKind r1 = r1.kind
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.print(r1)
            return
    }

    public void visitTree(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "$JCTypeUnion"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L2c
            r0 = r6
            r1 = r7
            java.lang.String r2 = "alternatives"
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r9 = r0
            r0 = r6
            r1 = r9
            java.lang.String r2 = " | "
            r0.print(r1, r2)
            goto L156
        L2c:
            r0 = r8
            java.lang.String r1 = "$JCTypeIntersection"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L4e
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "bounds"
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.util.List r1 = (com.sun.tools.javac.util.List) r1
            java.lang.String r2 = " & "
            r0.print(r1, r2)
            goto L156
        L4e:
            r0 = r8
            java.lang.String r1 = "$JCMemberReference"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L60
            r0 = r6
            r1 = r7
            r0.printMemberReference0(r1)
            goto L156
        L60:
            r0 = r8
            java.lang.String r1 = "$JCLambda"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L72
            r0 = r6
            r1 = r7
            r0.printLambda0(r1)
            goto L156
        L72:
            r0 = r8
            java.lang.String r1 = "$JCAnnotatedType"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L84
            r0 = r6
            r1 = r7
            r0.printAnnotatedType0(r1)
            goto L156
        L84:
            r0 = r8
            java.lang.String r1 = "$JCPackageDecl"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L156
            r0 = r8
            java.lang.String r1 = "$JCSwitchExpression"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto La0
            r0 = r6
            r1 = r7
            r0.printSwitchExpression(r1)
            goto L156
        La0:
            r0 = r8
            java.lang.String r1 = "$JCYield"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lb2
            r0 = r6
            r1 = r7
            r0.printYieldExpression(r1)
            goto L156
        Lb2:
            r0 = r8
            java.lang.String r1 = "$JCBindingPattern"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lc4
            r0 = r6
            r1 = r7
            r0.printBindingPattern(r1)
            goto L156
        Lc4:
            r0 = r8
            java.lang.String r1 = "$JCDefaultCaseLabel"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Ld6
            r0 = r6
            r1 = r7
            r0.printDefaultCase(r1)
            goto L156
        Ld6:
            r0 = r8
            java.lang.String r1 = "$JCGuardPattern"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Le8
            r0 = r6
            r1 = r7
            r0.printGuardPattern(r1)
            goto L156
        Le8:
            r0 = r8
            java.lang.String r1 = "$JCParenthesizedPattern"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lfa
            r0 = r6
            r1 = r7
            r0.printParenthesizedPattern(r1)
            goto L156
        Lfa:
            r0 = r8
            java.lang.String r1 = "$JCConstantCaseLabel"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L10c
            r0 = r6
            r1 = r7
            r0.printConstantCaseLabel(r1)
            goto L156
        L10c:
            r0 = r8
            java.lang.String r1 = "$JCPatternCaseLabel"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L11e
            r0 = r6
            r1 = r7
            r0.printPatternCaseLabel(r1)
            goto L156
        L11e:
            r0 = r8
            java.lang.String r1 = "$JCRecordPattern"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L130
            r0 = r6
            r1 = r7
            r0.printRecordPattern(r1)
            goto L156
        L130:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unhandled tree type: "
            r3.<init>(r4)
            r3 = r7
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L156:
            return
    }

    private boolean isCaseRuleStyle(com.sun.tools.javac.tree.JCTree.JCCase r6) {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            r1 = r6
            java.lang.String r2 = "caseKind"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            java.lang.Enum r0 = (java.lang.Enum) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L26
            r0 = r7
            java.lang.String r0 = r0.name()
            java.lang.String r1 = "RULE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    private boolean isJcAnnotatedType(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            boolean r0 = r0.jcAnnotatedTypeInit
            if (r0 == 0) goto L1c
            r0 = r3
            java.lang.Class<?> r0 = r0.jcAnnotatedTypeClass
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            if (r0 != r1) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
        L1c:
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$JCAnnotatedType"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L3a
            r0 = r3
            r1 = r5
            r0.jcAnnotatedTypeClass = r1
            r0 = r3
            r1 = 1
            r0.jcAnnotatedTypeInit = r1
            r0 = 1
            return r0
        L3a:
            r0 = 0
            return r0
    }

    private void printMemberReference0(com.sun.tools.javac.tree.JCTree r8) {
            r7 = this;
            r0 = r7
            r1 = r7
            r2 = r8
            java.lang.String r3 = "expr"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.print(r1)
            r0 = r7
            java.lang.String r1 = "::"
            r0.print(r1)
            r0 = r7
            r1 = r8
            java.lang.String r2 = "typeargs"
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L45
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L45
            r0 = r7
            java.lang.String r1 = "<"
            r0.print(r1)
            r0 = r7
            r1 = r9
            java.lang.String r2 = ", "
            r0.print(r1, r2)
            r0 = r7
            java.lang.String r1 = ">"
            r0.print(r1)
        L45:
            r0 = r7
            r1 = r7
            r2 = r8
            java.lang.String r3 = "mode"
            java.lang.Object r4 = new java.lang.Object
            r5 = r4
            r5.<init>()
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "INVOKE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            r1 = r7
            r2 = r8
            java.lang.String r3 = "name"
            r4 = 0
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L73
        L70:
            java.lang.String r1 = "new"
        L73:
            r0.print(r1)
            return
    }

    private void printLambda0(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r2 = "params"
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r8
            int r0 = r0.size()
            r10 = r0
            r0 = r6
            r1 = r7
            java.lang.String r2 = "paramKind"
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Exception -> L33
            r4 = r3
            r4.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = r0.readObject(r1, r2, r3)     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "EXPLICIT"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L33
            r9 = r0
            goto L34
        L33:
        L34:
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L42
            r0 = r9
            if (r0 != 0) goto L42
            r0 = 0
            goto L43
        L42:
            r0 = 1
        L43:
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L51
            r0 = r6
            java.lang.String r1 = "("
            r0.print(r1)
        L51:
            r0 = r9
            if (r0 == 0) goto L8f
            r0 = 1
            r12 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L82
        L61:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r13 = r0
            r0 = r12
            if (r0 != 0) goto L79
            r0 = r6
            java.lang.String r1 = ", "
            r0.print(r1)
        L79:
            r0 = 0
            r12 = r0
            r0 = r6
            r1 = r13
            r0.printVarDefInline(r1)
        L82:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L61
            goto Lc7
        L8f:
            java.lang.String r0 = ""
            r12 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Lbd
        L9d:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r13 = r0
            r0 = r6
            r1 = r12
            r0.print(r1)
            r0 = r6
            r1 = r13
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            java.lang.String r0 = ", "
            r12 = r0
        Lbd:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9d
        Lc7:
            r0 = r11
            if (r0 == 0) goto Ld3
            r0 = r6
            java.lang.String r1 = ")"
            r0.print(r1)
        Ld3:
            r0 = r6
            java.lang.String r1 = " -> "
            r0.print(r1)
            r0 = r6
            r1 = r7
            java.lang.String r2 = "body"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto L124
            r0 = r6
            java.lang.String r1 = "{"
            r0.println(r1)
            r0 = r6
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 + r2
            r0.indent = r1
            r0 = r6
            r1 = r12
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = (com.sun.tools.javac.tree.JCTree.JCBlock) r1
            com.sun.tools.javac.util.List r1 = r1.stats
            java.lang.String r2 = ""
            r0.print(r1, r2)
            r0 = r6
            r1 = r0
            int r1 = r1.indent
            r2 = 1
            int r1 = r1 - r2
            r0.indent = r1
            r0 = r6
            java.lang.String r1 = "}"
            r0.aPrint(r1)
            goto L12a
        L124:
            r0 = r6
            r1 = r12
            r0.print(r1)
        L12a:
            return
    }

    private void printAnnotatedType0(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r2 = "underlyingType"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L50
            r0 = r6
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r1
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.selected
            r0.print(r1)
            r0 = r6
            java.lang.String r1 = "."
            r0.print(r1)
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "annotations"
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.util.List r1 = (com.sun.tools.javac.util.List) r1
            java.lang.String r2 = " "
            r0.print(r1, r2)
            r0 = r6
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r6
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r1
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.print(r1)
            goto L80
        L50:
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L5f
            r0 = r6
            r1 = r7
            r0.printTypeArray0(r1)
            goto L80
        L5f:
            r0 = r6
            r1 = r6
            r2 = r7
            java.lang.String r3 = "annotations"
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.util.List r1 = (com.sun.tools.javac.util.List) r1
            java.lang.String r2 = " "
            r0.print(r1, r2)
            r0 = r6
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r6
            r1 = r8
            r0.print(r1)
        L80:
            return
    }

    private void printTypeArray0(com.sun.tools.javac.tree.JCTree r7) {
            r6 = this;
            r0 = r7
            r8 = r0
            r0 = 0
            r9 = r0
        L4:
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L19
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r8 = r0
            int r9 = r9 + 1
            goto L4
        L19:
            r0 = r6
            r1 = r8
            boolean r0 = r0.isJcAnnotatedType(r1)
            if (r0 == 0) goto L46
            r0 = r6
            r1 = r8
            java.lang.String r2 = "underlyingType"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L46
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r8 = r0
            int r9 = r9 + 1
            goto L4
        L46:
            r0 = r6
            r1 = r8
            r0.print(r1)
            r0 = r7
            r8 = r0
        L4d:
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L7a
            int r9 = r9 + (-1)
            r0 = r6
            r1 = r9
            if (r1 != 0) goto L69
            r1 = r6
            boolean r1 = r1.innermostArrayBracketsAreVarargs
            if (r1 == 0) goto L69
            java.lang.String r1 = "..."
            goto L6c
        L69:
            java.lang.String r1 = "[]"
        L6c:
            r0.print(r1)
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r8 = r0
            goto L4d
        L7a:
            r0 = r6
            r1 = r8
            boolean r0 = r0.isJcAnnotatedType(r1)
            if (r0 == 0) goto Le2
            r0 = r6
            r1 = r8
            java.lang.String r2 = "underlyingType"
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto Le2
            int r9 = r9 + (-1)
            r0 = r6
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r6
            r1 = r6
            r2 = r8
            java.lang.String r3 = "annotations"
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            java.lang.Object r1 = r1.readObject(r2, r3, r4)
            com.sun.tools.javac.util.List r1 = (com.sun.tools.javac.util.List) r1
            java.lang.String r2 = " "
            r0.print(r1, r2)
            r0 = r6
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r6
            r1 = r9
            if (r1 != 0) goto Ld0
            r1 = r6
            boolean r1 = r1.innermostArrayBracketsAreVarargs
            if (r1 == 0) goto Ld0
            java.lang.String r1 = "..."
            goto Ld3
        Ld0:
            java.lang.String r1 = "[]"
        Ld3:
            r0.print(r1)
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r8 = r0
            goto L4d
        Le2:
            return
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$javac$CommentInfo$StartConnection() {
            int[] r0 = lombok.delombok.PrettyPrinter.$SWITCH_TABLE$lombok$javac$CommentInfo$StartConnection
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.javac.CommentInfo$StartConnection[] r0 = lombok.javac.CommentInfo.StartConnection.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.AFTER_PREVIOUS     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.DIRECT_AFTER_PREVIOUS     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.ON_NEXT_LINE     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            lombok.javac.CommentInfo$StartConnection r1 = lombok.javac.CommentInfo.StartConnection.START_OF_LINE     // Catch: java.lang.NoSuchFieldError -> L43
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            goto L44
        L43:
        L44:
            r0 = r4
            r1 = r0
            lombok.delombok.PrettyPrinter.$SWITCH_TABLE$lombok$javac$CommentInfo$StartConnection = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$javac$CommentInfo$EndConnection() {
            int[] r0 = lombok.delombok.PrettyPrinter.$SWITCH_TABLE$lombok$javac$CommentInfo$EndConnection
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.javac.CommentInfo$EndConnection[] r0 = lombok.javac.CommentInfo.EndConnection.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.javac.CommentInfo$EndConnection r1 = lombok.javac.CommentInfo.EndConnection.AFTER_COMMENT     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.javac.CommentInfo$EndConnection r1 = lombok.javac.CommentInfo.EndConnection.DIRECT_AFTER_COMMENT     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.javac.CommentInfo$EndConnection r1 = lombok.javac.CommentInfo.EndConnection.ON_NEXT_LINE     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.delombok.PrettyPrinter.$SWITCH_TABLE$lombok$javac$CommentInfo$EndConnection = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$com$sun$source$tree$Tree$Kind() {
            int[] r0 = lombok.delombok.PrettyPrinter.$SWITCH_TABLE$com$sun$source$tree$Tree$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            com.sun.source.tree.Tree$Kind[] r0 = com.sun.source.tree.Tree.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.AND     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 64
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.AND_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 77
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ARRAY_ACCESS     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ARRAY_TYPE     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ASSERT     // Catch: java.lang.NoSuchFieldError -> L5f
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5f
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5f
            goto L60
        L5f:
        L60:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L6c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            goto L6d
        L6c:
        L6d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BITWISE_COMPLEMENT     // Catch: java.lang.NoSuchFieldError -> L7a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7a
            r2 = 48
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7a
            goto L7b
        L7a:
        L7b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BLOCK     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BOOLEAN_LITERAL     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 84
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BREAK     // Catch: java.lang.NoSuchFieldError -> La4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La4
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La4
            goto La5
        La4:
        La5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CASE     // Catch: java.lang.NoSuchFieldError -> Lb2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb2
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb2
            goto Lb3
        Lb2:
        Lb3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CATCH     // Catch: java.lang.NoSuchFieldError -> Lc0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            goto Lc1
        Lc0:
        Lc1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CHAR_LITERAL     // Catch: java.lang.NoSuchFieldError -> Lce
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lce
            r2 = 85
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lce
            goto Lcf
        Lce:
        Lcf:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CLASS     // Catch: java.lang.NoSuchFieldError -> Ldc
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldc
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldc
            goto Ldd
        Ldc:
        Ldd:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> Lea
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lea
            r2 = 11
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lea
            goto Leb
        Lea:
        Leb:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONDITIONAL_AND     // Catch: java.lang.NoSuchFieldError -> Lf8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf8
            r2 = 67
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf8
            goto Lf9
        Lf8:
        Lf9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONDITIONAL_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> L106
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L106
            r2 = 12
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L106
            goto L107
        L106:
        L107:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONDITIONAL_OR     // Catch: java.lang.NoSuchFieldError -> L114
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
            r2 = 68
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            goto L115
        L114:
        L115:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONTINUE     // Catch: java.lang.NoSuchFieldError -> L122
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L122
            r2 = 13
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L122
            goto L123
        L122:
        L123:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DIVIDE     // Catch: java.lang.NoSuchFieldError -> L130
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L130
            r2 = 51
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L130
            goto L131
        L130:
        L131:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DIVIDE_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L13e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L13e
            r2 = 70
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L13e
            goto L13f
        L13e:
        L13f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DOUBLE_LITERAL     // Catch: java.lang.NoSuchFieldError -> L14c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L14c
            r2 = 83
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L14c
            goto L14d
        L14c:
        L14d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DO_WHILE_LOOP     // Catch: java.lang.NoSuchFieldError -> L15a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15a
            r2 = 14
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15a
            goto L15b
        L15a:
        L15b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EMPTY_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L168
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L168
            r2 = 32
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L168
            goto L169
        L168:
        L169:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ENHANCED_FOR_LOOP     // Catch: java.lang.NoSuchFieldError -> L176
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L176
            r2 = 15
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L176
            goto L177
        L176:
        L177:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EQUAL_TO     // Catch: java.lang.NoSuchFieldError -> L184
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L184
            r2 = 62
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L184
            goto L185
        L184:
        L185:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ERRONEOUS     // Catch: java.lang.NoSuchFieldError -> L192
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L192
            r2 = 91
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L192
            goto L193
        L192:
        L193:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXPRESSION_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L1a0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1a0
            r2 = 16
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1a0
            goto L1a1
        L1a0:
        L1a1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXTENDS_WILDCARD     // Catch: java.lang.NoSuchFieldError -> L1ae
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ae
            r2 = 89
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ae
            goto L1af
        L1ae:
        L1af:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.FLOAT_LITERAL     // Catch: java.lang.NoSuchFieldError -> L1bc
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1bc
            r2 = 82
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1bc
            goto L1bd
        L1bc:
        L1bd:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.FOR_LOOP     // Catch: java.lang.NoSuchFieldError -> L1ca
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ca
            r2 = 18
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ca
            goto L1cb
        L1ca:
        L1cb:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.GREATER_THAN     // Catch: java.lang.NoSuchFieldError -> L1d8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d8
            r2 = 59
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d8
            goto L1d9
        L1d8:
        L1d9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.GREATER_THAN_EQUAL     // Catch: java.lang.NoSuchFieldError -> L1e6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1e6
            r2 = 61
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1e6
            goto L1e7
        L1e6:
        L1e7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.IDENTIFIER     // Catch: java.lang.NoSuchFieldError -> L1f4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f4
            r2 = 19
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1f4
            goto L1f5
        L1f4:
        L1f5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.IF     // Catch: java.lang.NoSuchFieldError -> L202
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L202
            r2 = 20
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L202
            goto L203
        L202:
        L203:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.IMPORT     // Catch: java.lang.NoSuchFieldError -> L210
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L210
            r2 = 21
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L210
            goto L211
        L210:
        L211:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.INSTANCE_OF     // Catch: java.lang.NoSuchFieldError -> L21e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L21e
            r2 = 22
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L21e
            goto L21f
        L21e:
        L21f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.INT_LITERAL     // Catch: java.lang.NoSuchFieldError -> L22c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22c
            r2 = 80
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22c
            goto L22d
        L22c:
        L22d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LABELED_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L23a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L23a
            r2 = 23
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L23a
            goto L23b
        L23a:
        L23b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LEFT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L248
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L248
            r2 = 55
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L248
            goto L249
        L248:
        L249:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LEFT_SHIFT_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L256
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L256
            r2 = 74
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L256
            goto L257
        L256:
        L257:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LESS_THAN     // Catch: java.lang.NoSuchFieldError -> L264
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L264
            r2 = 58
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L264
            goto L265
        L264:
        L265:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LESS_THAN_EQUAL     // Catch: java.lang.NoSuchFieldError -> L272
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L272
            r2 = 60
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L272
            goto L273
        L272:
        L273:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LOGICAL_COMPLEMENT     // Catch: java.lang.NoSuchFieldError -> L280
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L280
            r2 = 49
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L280
            goto L281
        L280:
        L281:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LONG_LITERAL     // Catch: java.lang.NoSuchFieldError -> L28e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28e
            r2 = 81
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28e
            goto L28f
        L28e:
        L28f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MEMBER_SELECT     // Catch: java.lang.NoSuchFieldError -> L29c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29c
            r2 = 17
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29c
            goto L29d
        L29c:
        L29d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L2aa
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2aa
            r2 = 24
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2aa
            goto L2ab
        L2aa:
        L2ab:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.METHOD_INVOCATION     // Catch: java.lang.NoSuchFieldError -> L2b8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b8
            r2 = 25
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b8
            goto L2b9
        L2b8:
        L2b9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MINUS     // Catch: java.lang.NoSuchFieldError -> L2c6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2c6
            r2 = 54
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2c6
            goto L2c7
        L2c6:
        L2c7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MINUS_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L2d4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2d4
            r2 = 73
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2d4
            goto L2d5
        L2d4:
        L2d5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MODIFIERS     // Catch: java.lang.NoSuchFieldError -> L2e2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e2
            r2 = 26
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e2
            goto L2e3
        L2e2:
        L2e3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MULTIPLY     // Catch: java.lang.NoSuchFieldError -> L2f0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f0
            r2 = 50
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f0
            goto L2f1
        L2f0:
        L2f1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MULTIPLY_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L2fe
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2fe
            r2 = 69
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2fe
            goto L2ff
        L2fe:
        L2ff:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NEW_ARRAY     // Catch: java.lang.NoSuchFieldError -> L30c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L30c
            r2 = 27
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L30c
            goto L30d
        L30c:
        L30d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NEW_CLASS     // Catch: java.lang.NoSuchFieldError -> L31a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L31a
            r2 = 28
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L31a
            goto L31b
        L31a:
        L31b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NOT_EQUAL_TO     // Catch: java.lang.NoSuchFieldError -> L328
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L328
            r2 = 63
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L328
            goto L329
        L328:
        L329:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NULL_LITERAL     // Catch: java.lang.NoSuchFieldError -> L336
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L336
            r2 = 87
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L336
            goto L337
        L336:
        L337:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.OR     // Catch: java.lang.NoSuchFieldError -> L344
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L344
            r2 = 66
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L344
            goto L345
        L344:
        L345:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.OR_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L352
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L352
            r2 = 79
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L352
            goto L353
        L352:
        L353:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.OTHER     // Catch: java.lang.NoSuchFieldError -> L360
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L360
            r2 = 92
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L360
            goto L361
        L360:
        L361:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PARAMETERIZED_TYPE     // Catch: java.lang.NoSuchFieldError -> L36e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36e
            r2 = 37
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36e
            goto L36f
        L36e:
        L36f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PARENTHESIZED     // Catch: java.lang.NoSuchFieldError -> L37c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37c
            r2 = 29
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37c
            goto L37d
        L37c:
        L37d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PLUS     // Catch: java.lang.NoSuchFieldError -> L38a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38a
            r2 = 53
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38a
            goto L38b
        L38a:
        L38b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PLUS_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L398
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L398
            r2 = 72
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L398
            goto L399
        L398:
        L399:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.POSTFIX_DECREMENT     // Catch: java.lang.NoSuchFieldError -> L3a6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a6
            r2 = 43
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a6
            goto L3a7
        L3a6:
        L3a7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.POSTFIX_INCREMENT     // Catch: java.lang.NoSuchFieldError -> L3b4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b4
            r2 = 42
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b4
            goto L3b5
        L3b4:
        L3b5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PREFIX_DECREMENT     // Catch: java.lang.NoSuchFieldError -> L3c2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c2
            r2 = 45
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c2
            goto L3c3
        L3c2:
        L3c3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PREFIX_INCREMENT     // Catch: java.lang.NoSuchFieldError -> L3d0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d0
            r2 = 44
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d0
            goto L3d1
        L3d0:
        L3d1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PRIMITIVE_TYPE     // Catch: java.lang.NoSuchFieldError -> L3de
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3de
            r2 = 30
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3de
            goto L3df
        L3de:
        L3df:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.REMAINDER     // Catch: java.lang.NoSuchFieldError -> L3ec
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3ec
            r2 = 52
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3ec
            goto L3ed
        L3ec:
        L3ed:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.REMAINDER_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L3fa
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3fa
            r2 = 71
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3fa
            goto L3fb
        L3fa:
        L3fb:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.RETURN     // Catch: java.lang.NoSuchFieldError -> L408
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L408
            r2 = 31
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L408
            goto L409
        L408:
        L409:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.RIGHT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L416
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L416
            r2 = 56
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L416
            goto L417
        L416:
        L417:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.RIGHT_SHIFT_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L424
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L424
            r2 = 75
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L424
            goto L425
        L424:
        L425:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.STRING_LITERAL     // Catch: java.lang.NoSuchFieldError -> L432
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L432
            r2 = 86
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L432
            goto L433
        L432:
        L433:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SUPER_WILDCARD     // Catch: java.lang.NoSuchFieldError -> L440
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L440
            r2 = 90
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L440
            goto L441
        L440:
        L441:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SWITCH     // Catch: java.lang.NoSuchFieldError -> L44e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44e
            r2 = 33
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44e
            goto L44f
        L44e:
        L44f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SYNCHRONIZED     // Catch: java.lang.NoSuchFieldError -> L45c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45c
            r2 = 34
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45c
            goto L45d
        L45c:
        L45d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.THROW     // Catch: java.lang.NoSuchFieldError -> L46a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46a
            r2 = 35
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46a
            goto L46b
        L46a:
        L46b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.TRY     // Catch: java.lang.NoSuchFieldError -> L478
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L478
            r2 = 36
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L478
            goto L479
        L478:
        L479:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.TYPE_CAST     // Catch: java.lang.NoSuchFieldError -> L486
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L486
            r2 = 38
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L486
            goto L487
        L486:
        L487:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.TYPE_PARAMETER     // Catch: java.lang.NoSuchFieldError -> L494
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L494
            r2 = 39
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L494
            goto L495
        L494:
        L495:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNARY_MINUS     // Catch: java.lang.NoSuchFieldError -> L4a2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4a2
            r2 = 47
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4a2
            goto L4a3
        L4a2:
        L4a3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNARY_PLUS     // Catch: java.lang.NoSuchFieldError -> L4b0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4b0
            r2 = 46
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4b0
            goto L4b1
        L4b0:
        L4b1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNBOUNDED_WILDCARD     // Catch: java.lang.NoSuchFieldError -> L4be
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4be
            r2 = 88
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4be
            goto L4bf
        L4be:
        L4bf:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNSIGNED_RIGHT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L4cc
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4cc
            r2 = 57
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4cc
            goto L4cd
        L4cc:
        L4cd:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L4da
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4da
            r2 = 76
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4da
            goto L4db
        L4da:
        L4db:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.VARIABLE     // Catch: java.lang.NoSuchFieldError -> L4e8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e8
            r2 = 40
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4e8
            goto L4e9
        L4e8:
        L4e9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.WHILE_LOOP     // Catch: java.lang.NoSuchFieldError -> L4f6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4f6
            r2 = 41
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4f6
            goto L4f7
        L4f6:
        L4f7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.XOR     // Catch: java.lang.NoSuchFieldError -> L504
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L504
            r2 = 65
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L504
            goto L505
        L504:
        L505:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.XOR_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L512
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L512
            r2 = 78
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L512
            goto L513
        L512:
        L513:
            r0 = r4
            r1 = r0
            lombok.delombok.PrettyPrinter.$SWITCH_TABLE$com$sun$source$tree$Tree$Kind = r1
            return r0
    }
}
