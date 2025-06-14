package lombok.eclipse.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/singulars/EclipseJavaUtilSingularizer.SCL.lombok */
abstract class EclipseJavaUtilSingularizer extends lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer {
    protected static final char[][] JAVA_UTIL_ARRAYLIST = null;
    protected static final char[][] JAVA_UTIL_LIST = null;
    protected static final char[][] JAVA_UTIL_MAP = null;
    protected static final char[][] JAVA_UTIL_MAP_ENTRY = null;
    protected static final char[][] JAVA_UTIL_COLLECTIONS = null;
    protected final lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer guavaListSetSingularizer;
    protected final lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer guavaMapSingularizer;

    static {
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 106(0x6a, float:1.49E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 118(0x76, float:1.65E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 97
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 117(0x75, float:1.64E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 9
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 65
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 114(0x72, float:1.6E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 114(0x72, float:1.6E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 121(0x79, float:1.7E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 76
            r4[r5] = r6
            r4 = r3
            r5 = 6
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 7
            r6 = 115(0x73, float:1.61E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 8
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_ARRAYLIST = r0
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 106(0x6a, float:1.49E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 118(0x76, float:1.65E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 97
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 117(0x75, float:1.64E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 76
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 115(0x73, float:1.61E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_LIST = r0
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 106(0x6a, float:1.49E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 118(0x76, float:1.65E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 97
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 117(0x75, float:1.64E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 3
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 77
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 112(0x70, float:1.57E-43)
            r4[r5] = r6
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_MAP = r0
            r0 = 4
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 106(0x6a, float:1.49E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 118(0x76, float:1.65E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 97
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 117(0x75, float:1.64E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 3
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 77
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 112(0x70, float:1.57E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 5
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 69
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 110(0x6e, float:1.54E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 114(0x72, float:1.6E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 121(0x79, float:1.7E-43)
            r4[r5] = r6
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_MAP_ENTRY = r0
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 106(0x6a, float:1.49E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 97
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 118(0x76, float:1.65E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 97
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 117(0x75, float:1.64E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 11
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 67
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 108(0x6c, float:1.51E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 101(0x65, float:1.42E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 99
            r4[r5] = r6
            r4 = r3
            r5 = 6
            r6 = 116(0x74, float:1.63E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 7
            r6 = 105(0x69, float:1.47E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 8
            r6 = 111(0x6f, float:1.56E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 9
            r6 = 110(0x6e, float:1.54E-43)
            r4[r5] = r6
            r4 = r3
            r5 = 10
            r6 = 115(0x73, float:1.61E-43)
            r4[r5] = r6
            r1[r2] = r3
            lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_COLLECTIONS = r0
            return
    }

    EclipseJavaUtilSingularizer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.eclipse.handlers.singulars.EclipseGuavaSetListSingularizer r1 = new lombok.eclipse.handlers.singulars.EclipseGuavaSetListSingularizer
            r2 = r1
            r2.<init>()
            r0.guavaListSetSingularizer = r1
            r0 = r4
            lombok.eclipse.handlers.singulars.EclipseGuavaMapSingularizer r1 = new lombok.eclipse.handlers.singulars.EclipseGuavaMapSingularizer
            r2 = r1
            r2.<init>()
            r0.guavaMapSingularizer = r1
            return
    }

    protected boolean useGuavaInstead(lombok.eclipse.EclipseNode r5) {
            r4 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r5
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.SINGULAR_USE_GUAVA
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            return r0
    }

    protected java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> createJavaUtilSetMapInitialCapacitySwitchStatements(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r12, lombok.eclipse.EclipseNode r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r14
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r12
            char[] r4 = r4.getPluralName()
            r3.<init>(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "$key"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            goto L34
        L30:
            r0 = r12
            char[] r0 = r0.getPluralName()
        L34:
            r20 = r0
            r0 = r15
            if (r0 == 0) goto La9
            r0 = r19
            r1 = 1
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 48
            r2[r3] = r4
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r1 = lombok.eclipse.Eclipse.createCaseStatement(r1)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_COLLECTIONS
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r21
            r1 = r15
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r12
            char[] r5 = r5.getPluralName()
            r6 = 0
            r4.<init>(r5, r6)
            r4 = r21
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.BreakStatement r1 = new org.eclipse.jdt.internal.compiler.ast.BreakStatement
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        La9:
            r0 = r16
            if (r0 == 0) goto L211
            r0 = r19
            r1 = 1
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 49
            r2[r3] = r4
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r1 = lombok.eclipse.Eclipse.createCaseStatement(r1)
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r20
            r3 = 0
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = r21
            r0.receiver = r1
            r0 = r22
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
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = 1
            char[] r4 = new char[r4]
            r5 = r4
            r6 = 0
            r7 = 48
            r5[r6] = r7
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r4 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r4, r5)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r14
            if (r0 == 0) goto L1a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r12
            char[] r4 = r4.getPluralName()
            r3.<init>(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "$value"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r24 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r24
            r3 = 0
            r1.<init>(r2, r3)
            r25 = r0
            r0 = r25
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            r1 = r25
            r0.receiver = r1
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
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = 1
            char[] r4 = new char[r4]
            r5 = r4
            r6 = 0
            r7 = 48
            r5[r6] = r7
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r4 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r4, r5)
            r2[r3] = r4
            r0.arguments = r1
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r1 = r0
            r2 = 0
            r3 = r22
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r26
            r1[r2] = r3
            r23 = r0
            goto L1b3
        L1a8:
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r1 = r0
            r2 = 0
            r3 = r22
            r1[r2] = r3
            r23 = r0
        L1b3:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_COLLECTIONS
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            r0 = r24
            r1 = r16
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r24
            r1 = r23
            r0.arguments = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r4 = r3
            r5 = r12
            char[] r5 = r5.getPluralName()
            r6 = 0
            r4.<init>(r5, r6)
            r4 = r24
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.BreakStatement r1 = new org.eclipse.jdt.internal.compiler.ast.BreakStatement
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        L211:
            r0 = r19
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r1 = lombok.eclipse.Eclipse.createCaseStatement(r1)
            boolean r0 = r0.add(r1)
            r0 = r19
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = 0
            r6 = 1
            r7 = r15
            if (r7 != 0) goto L22e
            r7 = 1
            goto L22f
        L22e:
            r7 = 0
        L22f:
            r8 = r17
            r9 = r18
            java.util.List r1 = r1.createJavaUtilSimpleCreationAndFillStatements(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r0.addAll(r1)
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r0 = new org.eclipse.jdt.internal.compiler.ast.SwitchStatement
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r21
            r1 = r19
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r21
            r1 = r11
            r2 = r13
            r3 = r20
            r4 = 1
            r5 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.getSize(r2, r3, r4, r5)
            r0.expression = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r12
            java.lang.String r2 = r2.getTargetFqn()
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r22 = r0
            r0 = r11
            r1 = r14
            if (r1 == 0) goto L283
            r1 = 2
            goto L284
        L283:
            r1 = 1
        L284:
            r2 = 0
            r3 = r13
            r4 = r22
            r5 = r12
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r12
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r23 = r0
            r0 = r23
            r1 = r22
            r0.type = r1
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r1 = r0
            r2 = 0
            r3 = r23
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r21
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    protected java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> createJavaUtilSimpleCreationAndFillStatements(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r11, lombok.eclipse.EclipseNode r12, boolean r13, boolean r14, boolean r15, boolean r16, java.lang.String r17, java.lang.String r18) {
            r10 = this;
            r0 = r13
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r11
            char[] r4 = r4.getPluralName()
            r3.<init>(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "$key"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            goto L2b
        L27:
            r0 = r11
            char[] r0 = r0.getPluralName()
        L2b:
            r19 = r0
            r0 = 0
            r21 = r0
            r0 = r15
            if (r0 == 0) goto Lfe
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r10
            r3 = r12
            r4 = r19
            r5 = r16
            r6 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = r2.getSize(r3, r4, r5, r6)
            java.lang.String r3 = "0x40000000"
            char[] r3 = r3.toCharArray()
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r3 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r3, r4)
            r4 = 4
            r1.<init>(r2, r3, r4)
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            java.lang.String r2 = "MAX_VALUE"
            char[] r2 = r2.toCharArray()
            r3 = 0
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_INTEGER
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = 1
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 49
            r3[r4] = r5
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r2 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r2, r3)
            r3 = r10
            r4 = r12
            r5 = r19
            r6 = r16
            r7 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = r3.getSize(r4, r5, r6, r7)
            r4 = 14
            r1.<init>(r2, r3, r4)
            r24 = r0
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r10
            r3 = r12
            r4 = r19
            r5 = r16
            r6 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = r2.getSize(r3, r4, r5, r6)
            r3 = 1
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 51
            r4[r5] = r6
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r3 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r3, r4)
            r4 = 13
            r1.<init>(r2, r3, r4)
            r25 = r0
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r25
            r3 = 1
            char[] r3 = new char[r3]
            r4 = r3
            r5 = 0
            r6 = 51
            r4[r5] = r6
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r3 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r3, r4)
            r4 = 9
            r1.<init>(r2, r3, r4)
            r26 = r0
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            r2 = r24
            r3 = r26
            r4 = 14
            r1.<init>(r2, r3, r4)
            r27 = r0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r1 = r0
            r2 = r22
            r3 = r27
            r4 = r23
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r1 = r0
            r2 = 0
            r3 = r28
            r1[r2] = r3
            r21 = r0
        Lfe:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = 3
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            char[] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA
            r3[r4] = r5
            r3 = r2
            r4 = 1
            char[] r5 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.UTIL
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r17
            char[] r5 = r5.toCharArray()
            r3[r4] = r5
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r22 = r0
            r0 = r10
            r1 = r13
            if (r1 == 0) goto L12b
            r1 = 2
            goto L12c
        L12b:
            r1 = 1
        L12c:
            r2 = 0
            r3 = r12
            r4 = r22
            r5 = r11
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r23
            r1 = r22
            r0.type = r1
            r0 = r23
            r1 = r21
            r0.arguments = r1
            r0 = r14
            if (r0 == 0) goto L1a3
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            r2 = r11
            java.lang.String r2 = r2.getTargetFqn()
            char[][] r2 = lombok.eclipse.Eclipse.fromQualifiedName(r2)
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r10
            r1 = r13
            if (r1 == 0) goto L171
            r1 = 2
            goto L172
        L171:
            r1 = 1
        L172:
            r2 = 0
            r3 = r12
            r4 = r24
            r5 = r11
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r24 = r0
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r11
            char[] r2 = r2.getPluralName()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = r24
            r0.type = r1
            r0 = r25
            r1 = r23
            r0.initialization = r1
            r0 = r25
            r20 = r0
            goto L1bb
        L1a3:
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r11
            char[] r4 = r4.getPluralName()
            r5 = 0
            r3.<init>(r4, r5)
            r3 = r23
            r4 = 0
            r1.<init>(r2, r3, r4)
            r20 = r0
        L1bb:
            r0 = r13
            if (r0 == 0) goto L35c
            r0 = 2
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 36
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 105(0x69, float:1.47E-43)
            r1[r2] = r3
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r23
            r1 = 3
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 112(0x70, float:1.57E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 117(0x75, float:1.64E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 116(0x74, float:1.63E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r11
            char[] r3 = r3.getPluralName()
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r19
            r3 = 0
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = new java.lang.String
            r5 = r4
            r6 = r11
            char[] r6 = r6.getPluralName()
            r5.<init>(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = "$value"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            char[] r2 = r2.toCharArray()
            r3 = 0
            r1.<init>(r2, r3)
            r25 = r0
            r0 = r25
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            r1 = r24
            r0.receiver = r1
            r0 = r26
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            r6 = r22
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
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
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r27
            r1 = r25
            r0.receiver = r1
            r0 = r27
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            r6 = r22
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r27
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
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r26
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r27
            r2[r3] = r4
            r0.arguments = r1
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r22
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = 10
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r28
            r1 = 1
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 48
            r2[r3] = r4
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r1, r2)
            r0.initialization = r1
            org.eclipse.jdt.internal.compiler.ast.BinaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.BinaryExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r22
            r5 = 0
            r3.<init>(r4, r5)
            r3 = r10
            r4 = r12
            r5 = r19
            r6 = r16
            r7 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression r3 = r3.getSize(r4, r5, r6, r7)
            r4 = 4
            r1.<init>(r2, r3, r4)
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.PostfixExpression r0 = new org.eclipse.jdt.internal.compiler.ast.PostfixExpression
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r22
            r5 = 0
            r3.<init>(r4, r5)
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r3 = org.eclipse.jdt.internal.compiler.ast.IntLiteral.One
            r4 = 14
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r30 = r0
            org.eclipse.jdt.internal.compiler.ast.ForStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ForStatement
            r1 = r0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            r3 = r2
            r4 = 0
            r5 = r28
            r3[r4] = r5
            r3 = r29
            r4 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r4 = new org.eclipse.jdt.internal.compiler.ast.Statement[r4]
            r5 = r4
            r6 = 0
            r7 = r30
            r5[r6] = r7
            r5 = r23
            r6 = 1
            r7 = 0
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r21 = r0
            goto L3c5
        L35c:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = 6
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 97
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 100
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = 100
            r2[r3] = r4
            r2 = r1
            r3 = 3
            r4 = 65
            r2[r3] = r4
            r2 = r1
            r3 = 4
            r4 = 108(0x6c, float:1.51E-43)
            r2[r3] = r4
            r2 = r1
            r3 = 5
            r4 = 108(0x6c, float:1.51E-43)
            r2[r3] = r4
            r0.selector = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r11
            char[] r3 = r3.getPluralName()
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r19
            r3 = 0
            r1.<init>(r2, r3)
            r23 = r0
            r0 = r23
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            r2[r3] = r4
            r0.arguments = r1
            r0 = r22
            r21 = r0
        L3c5:
            r0 = r16
            if (r0 == 0) goto L405
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r19
            r3 = 0
            r1.<init>(r2, r3)
            r22 = r0
            r0 = r22
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Reference r1 = getBuilderReference(r1)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r22
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 29
            r1.<init>(r2, r3, r4)
            r23 = r0
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r23
            r3 = r21
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r21 = r0
        L405:
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r11
            char[] r2 = r2.getPluralName()
            r3 = 0
            r1.<init>(r2, r3)
            r23 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r24
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r23
            r2[r3] = r4
            r0.arguments = r1
            r0 = r24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "unmodifiable"
            r2.<init>(r3)
            r2 = r11
            java.lang.String r2 = r2.getTargetSimpleType()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r2 = r1
            char[][] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_COLLECTIONS
            long[] r4 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r11
            char[] r4 = r4.getPluralName()
            r5 = 0
            r3.<init>(r4, r5)
            r3 = r24
            r4 = 0
            r1.<init>(r2, r3, r4)
            r22 = r0
            r0 = 3
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r1 = r0
            r2 = 0
            r3 = r20
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r21
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r22
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    protected org.eclipse.jdt.internal.compiler.ast.Statement createConstructBuilderVarIfNeeded(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r9, lombok.eclipse.EclipseNode r10, boolean r11) {
            r8 = this;
            r0 = r11
            if (r0 == 0) goto L46
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r9
            char[] r2 = r2.getPluralName()
            r1.<init>(r2)
            r14 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r14
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "$key"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r14
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "$value"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r13 = r0
            goto L4f
        L46:
            r0 = r9
            char[] r0 = r0.getPluralName()
            r12 = r0
            r0 = 0
            r13 = r0
        L4f:
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r12
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r14
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r12
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_ARRAYLIST
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r8
            r1 = 1
            r2 = 0
            r3 = r10
            r4 = r16
            r5 = r9
            java.util.List r5 = r5.getTypeArgs()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r16
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r14
            r3 = r17
            r4 = 0
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r11
            if (r0 == 0) goto L17f
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r13
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.JAVA_UTIL_ARRAYLIST
            long[] r3 = lombok.eclipse.handlers.singulars.EclipseJavaUtilSingularizer.NULL_POSS
            r1.<init>(r2, r3)
            r20 = r0
            r0 = r9
            java.util.List r0 = r0.getTypeArgs()
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L12b
            r0 = r21
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L12b
            r0 = r21
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r21 = r0
            goto L130
        L12b:
            java.util.List r0 = java.util.Collections.emptyList()
            r21 = r0
        L130:
            r0 = r8
            r1 = 1
            r2 = 0
            r3 = r10
            r4 = r20
            r5 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.addTypeArgs(r1, r2, r3, r4, r5)
            r20 = r0
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r20
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r14
            r3 = r17
            r4 = 0
            r1.<init>(r2, r3, r4)
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r23 = r0
            r0 = r23
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r18
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r22
            r2[r3] = r4
            r0.statements = r1
            r0 = r23
            r19 = r0
            goto L183
        L17f:
            r0 = r18
            r19 = r0
        L183:
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r15
            r3 = r19
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
