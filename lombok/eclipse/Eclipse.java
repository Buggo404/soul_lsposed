package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/Eclipse.SCL.lombok */
public class Eclipse {
    private static final org.eclipse.jdt.internal.compiler.ast.Annotation[] EMPTY_ANNOTATIONS_ARRAY = null;
    public static final int ECLIPSE_DO_NOT_TOUCH_FLAG = 8388608;
    public static final int AccRecord = 16777216;
    public static final int IsCanonicalConstructor = 512;
    public static final int IsImplicit = 1024;
    public static final int HasTypeAnnotations = 1048576;
    private static final java.util.regex.Pattern SPLIT_AT_DOT = null;
    private static long latestEcjCompilerVersionConstantCached;
    private static int ecjCompilerVersionCached;
    private static boolean caseStatementInit;
    private static java.lang.reflect.Field caseStatementConstantExpressions;

    static {
            r0 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            lombok.eclipse.Eclipse.EMPTY_ANNOTATIONS_ARRAY = r0
            java.lang.String r0 = "\\."
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.eclipse.Eclipse.SPLIT_AT_DOT = r0
            r0 = 0
            lombok.eclipse.Eclipse.latestEcjCompilerVersionConstantCached = r0
            r0 = -1
            lombok.eclipse.Eclipse.ecjCompilerVersionCached = r0
            r0 = 0
            lombok.eclipse.Eclipse.caseStatementInit = r0
            r0 = 0
            lombok.eclipse.Eclipse.caseStatementConstantExpressions = r0
            return
    }

    private Eclipse() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String toQualifiedName(char[][] r6) {
            r0 = r6
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L14
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            r3 = 0
            r2 = r2[r3]
            r1.<init>(r2)
            return r0
        L14:
            r0 = r6
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L2d
        L20:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r7
            r1 = r8
            int r1 = r1.length
            int r0 = r0 + r1
            r7 = r0
            int r9 = r9 + 1
        L2d:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L20
            r0 = r7
            char[] r0 = new char[r0]
            r8 = r0
            r0 = r6
            r1 = 0
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            r3 = 0
            r4 = r9
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 1
            r11 = r0
            goto L70
        L4e:
            r0 = r8
            r1 = r10
            int r10 = r10 + 1
            r2 = 46
            r0[r1] = r2
            r0 = r6
            r1 = r11
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            r3 = r10
            r4 = r9
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r9
            int r1 = r1.length
            int r0 = r0 + r1
            r10 = r0
            int r11 = r11 + 1
        L70:
            r0 = r11
            r1 = r6
            int r1 = r1.length
            if (r0 < r1) goto L4e
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            return r0
    }

    public static char[][] fromQualifiedName(java.lang.String r5) {
            java.util.regex.Pattern r0 = lombok.eclipse.Eclipse.SPLIT_AT_DOT
            r1 = r5
            java.lang.String[] r0 = r0.split(r1)
            r6 = r0
            r0 = r6
            int r0 = r0.length
            char[] r0 = new char[r0]
            r7 = r0
            r0 = 0
            r8 = r0
            goto L1f
        L13:
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r8 = r8 + 1
        L1f:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 < r1) goto L13
            r0 = r7
            return r0
    }

    public static long pos(org.eclipse.jdt.internal.compiler.ast.ASTNode r7) {
            r0 = r7
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r7
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            long r0 = r0 | r1
            return r0
    }

    public static long[] poss(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, int r8) {
            r0 = r7
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r7
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            long r0 = r0 | r1
            r9 = r0
            r0 = r8
            long[] r0 = new long[r0]
            r11 = r0
            r0 = r11
            r1 = r9
            java.util.Arrays.fill(r0, r1)
            r0 = r11
            return r0
    }

    public static boolean nameEquals(char[][] r4, java.lang.String r5) {
            r0 = 0
            r6 = r0
            r0 = r5
            int r0 = r0.length()
            r7 = r0
            r0 = 0
            r8 = r0
            goto L5b
        Ld:
            r0 = r4
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r8
            if (r0 <= 0) goto L2e
            r0 = r6
            r1 = r7
            if (r0 != r1) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 == r1) goto L2e
            r0 = 0
            return r0
        L2e:
            r0 = 0
            r10 = r0
            goto L50
        L34:
            r0 = r6
            r1 = r7
            if (r0 != r1) goto L3b
            r0 = 0
            return r0
        L3b:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = r9
            r2 = r10
            char r1 = r1[r2]
            if (r0 == r1) goto L4d
            r0 = 0
            return r0
        L4d:
            int r10 = r10 + 1
        L50:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 < r1) goto L34
            int r8 = r8 + 1
        L5b:
            r0 = r8
            r1 = r4
            int r1 = r1.length
            if (r0 < r1) goto Ld
            r0 = 1
            return r0
    }

    public static boolean hasClinit(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r7 = r1
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r5 = r0
            goto L28
        L17:
            r0 = r7
            r1 = r5
            r0 = r0[r1]
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Clinit
            if (r0 == 0) goto L25
            r0 = 1
            return r0
        L25:
            int r5 = r5 + 1
        L28:
            r0 = r5
            r1 = r6
            if (r0 < r1) goto L17
            r0 = 0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] findAnnotations(org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r6, java.util.regex.Pattern r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.Eclipse.EMPTY_ANNOTATIONS_ARRAY
            return r0
        L13:
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L6b
        L23:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L68
            r0 = r13
            char[][] r0 = r0.getTypeName()
            if (r0 == 0) goto L68
            r0 = r13
            char[][] r0 = r0.getTypeName()
            r14 = r0
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r14
            r3 = r14
            int r3 = r3.length
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            r1.<init>(r2)
            r15 = r0
            r0 = r7
            r1 = r15
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L68
            r0 = r8
            r1 = r9
            boolean r0 = r0.add(r1)
        L68:
            int r10 = r10 + 1
        L6b:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L23
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.Eclipse.EMPTY_ANNOTATIONS_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r0
            return r0
    }

    public static boolean isPrimitive(org.eclipse.jdt.internal.compiler.ast.TypeReference r2) {
            r0 = r2
            int r0 = r0.dimensions()
            if (r0 <= 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r2
            char[][] r0 = r0.getTypeName()
            java.lang.String r0 = toQualifiedName(r0)
            boolean r0 = lombok.core.JavaIdentifiers.isPrimitive(r0)
            return r0
    }

    public static java.lang.Object calculateValue(org.eclipse.jdt.internal.compiler.ast.Expression r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Literal
            if (r0 == 0) goto Lae
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Literal r0 = (org.eclipse.jdt.internal.compiler.ast.Literal) r0
            r0.computeConstant()
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            int r0 = r0.typeID()
            switch(r0) {
                case 2: goto L6d;
                case 3: goto L57;
                case 4: goto L62;
                case 5: goto L8e;
                case 6: goto Lac;
                case 7: goto L99;
                case 8: goto L83;
                case 9: goto L78;
                case 10: goto L4c;
                case 11: goto La4;
                default: goto Lac;
            }
        L4c:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L57:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L62:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            short r0 = r0.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L6d:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            char r0 = r0.charValue()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L78:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L83:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            double r0 = r0.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L8e:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L99:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        La4:
            r0 = r6
            org.eclipse.jdt.internal.compiler.impl.Constant r0 = r0.constant
            java.lang.String r0 = r0.stringValue()
            return r0
        Lac:
            r0 = 0
            return r0
        Lae:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            if (r0 == 0) goto Lca
            lombok.core.ClassLiteral r0 = new lombok.core.ClassLiteral
            r1 = r0
            r2 = r6
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r2 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r2
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            char[][] r2 = r2.getTypeName()
            java.lang.String r2 = toQualifiedName(r2)
            r1.<init>(r2)
            return r0
        Lca:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            if (r0 == 0) goto Le7
            lombok.core.FieldSelect r0 = new lombok.core.FieldSelect
            r1 = r0
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r6
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = (org.eclipse.jdt.internal.compiler.ast.SingleNameReference) r4
            char[] r4 = r4.token
            r3.<init>(r4)
            r1.<init>(r2)
            return r0
        Le7:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            if (r0 == 0) goto L118
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference) r0
            char[][] r0 = r0.tokens
            java.lang.String r0 = toQualifiedName(r0)
            r7 = r0
            r0 = r7
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r8 = r0
            lombok.core.FieldSelect r0 = new lombok.core.FieldSelect
            r1 = r0
            r2 = r8
            r3 = -1
            if (r2 != r3) goto L10d
            r2 = r7
            goto L114
        L10d:
            r2 = r7
            r3 = r8
            r4 = 1
            int r3 = r3 + r4
            java.lang.String r2 = r2.substring(r3)
        L114:
            r1.<init>(r2)
            return r0
        L118:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            if (r0 == 0) goto L1ae
            java.lang.String r0 = "-"
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r1 = (org.eclipse.jdt.internal.compiler.ast.UnaryExpression) r1
            java.lang.String r1 = r1.operatorToString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ae
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = (org.eclipse.jdt.internal.compiler.ast.UnaryExpression) r0
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.expression
            java.lang.Object r0 = calculateValue(r0)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L14d
            r0 = r7
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = -r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L14d:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L160
            r0 = r7
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            int r0 = -r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L160:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 == 0) goto L173
            r0 = r7
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            int r0 = -r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L173:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto L186
            r0 = r7
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = -r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L186:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L199
            r0 = r7
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = -r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L199:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L1ac
            r0 = r7
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            double r0 = -r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L1ac:
            r0 = 0
            return r0
        L1ae:
            r0 = 0
            return r0
    }

    public static long getLatestEcjCompilerVersionConstant() {
            long r0 = lombok.eclipse.Eclipse.latestEcjCompilerVersionConstantCached
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            long r0 = lombok.eclipse.Eclipse.latestEcjCompilerVersionConstantCached
            return r0
        Lc:
            r0 = 0
            r5 = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants> r0 = org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L7c
        L1e:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = "JDK"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L79
            r0 = r6
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = "JDK"
            int r1 = r1.length()     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L78
            r10 = r0
            r0 = r10
            java.lang.String r1 = "1_"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L57
            r0 = r10
            java.lang.String r1 = "1_"
            int r1 = r1.length()     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L78
            r10 = r0
        L57:
            r0 = r10
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L78
            r11 = r0
            r0 = r11
            r1 = r5
            if (r0 <= r1) goto L79
            r0 = r11
            r5 = r0
            r0 = r6
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L78
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> L78
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L78
            lombok.eclipse.Eclipse.latestEcjCompilerVersionConstantCached = r0     // Catch: java.lang.Exception -> L78
            goto L79
        L78:
        L79:
            int r7 = r7 + 1
        L7c:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L1e
            r0 = r5
            r1 = 6
            if (r0 <= r1) goto L93
            boolean r0 = ecjSupportsJava7Features()
            if (r0 != 0) goto L93
            r0 = 3276800(0x320000, double:1.6189543E-317)
            lombok.eclipse.Eclipse.latestEcjCompilerVersionConstantCached = r0
        L93:
            long r0 = lombok.eclipse.Eclipse.latestEcjCompilerVersionConstantCached
            return r0
    }

    public static int getEcjCompilerVersion() {
            int r0 = lombok.eclipse.Eclipse.ecjCompilerVersionCached
            if (r0 < 0) goto La
            int r0 = lombok.eclipse.Eclipse.ecjCompilerVersionCached
            return r0
        La:
            java.lang.Class<org.eclipse.jdt.internal.compiler.impl.CompilerOptions> r0 = org.eclipse.jdt.internal.compiler.impl.CompilerOptions.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r1 = r0
            r6 = r1
            int r0 = r0.length
            r5 = r0
            r0 = 0
            r4 = r0
            goto L6e
        L19:
            r0 = r6
            r1 = r4
            r0 = r0[r1]
            r3 = r0
            r0 = r3
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L6a
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "VERSION_1_"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L41
            r0 = r7
            java.lang.String r1 = "VERSION_1_"
            int r1 = r1.length()     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L6a
            r8 = r0
            goto L59
        L41:
            r0 = r7
            java.lang.String r1 = "VERSION_"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L6b
            r0 = r7
            java.lang.String r1 = "VERSION_"
            int r1 = r1.length()     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L6a
            r8 = r0
        L59:
            int r0 = lombok.eclipse.Eclipse.ecjCompilerVersionCached     // Catch: java.lang.Exception -> L6a
            r1 = r8
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L6a
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Exception -> L6a
            lombok.eclipse.Eclipse.ecjCompilerVersionCached = r0     // Catch: java.lang.Exception -> L6a
            goto L6b
        L6a:
        L6b:
            int r4 = r4 + 1
        L6e:
            r0 = r4
            r1 = r5
            if (r0 < r1) goto L19
            int r0 = lombok.eclipse.Eclipse.ecjCompilerVersionCached
            r1 = 5
            if (r0 >= r1) goto L7e
            r0 = 5
            lombok.eclipse.Eclipse.ecjCompilerVersionCached = r0
        L7e:
            boolean r0 = ecjSupportsJava7Features()
            if (r0 != 0) goto L8f
            r0 = 6
            int r1 = lombok.eclipse.Eclipse.ecjCompilerVersionCached
            int r0 = java.lang.Math.min(r0, r1)
            lombok.eclipse.Eclipse.ecjCompilerVersionCached = r0
        L8f:
            int r0 = lombok.eclipse.Eclipse.ecjCompilerVersionCached
            return r0
    }

    private static boolean ecjSupportsJava7Features() {
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TryStatement> r0 = org.eclipse.jdt.internal.compiler.ast.TryStatement.class
            java.lang.String r1 = "resources"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.CaseStatement createCaseStatement(org.eclipse.jdt.internal.compiler.ast.Expression r7) {
            org.eclipse.jdt.internal.compiler.ast.CaseStatement r0 = new org.eclipse.jdt.internal.compiler.ast.CaseStatement
            r1 = r0
            r2 = r7
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L11
            r0 = r8
            return r0
        L11:
            boolean r0 = lombok.eclipse.Eclipse.caseStatementInit
            if (r0 != 0) goto L32
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.CaseStatement> r0 = org.eclipse.jdt.internal.compiler.ast.CaseStatement.class
            java.lang.String r1 = "constantExpressions"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            lombok.eclipse.Eclipse.caseStatementConstantExpressions = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            java.lang.reflect.Field r0 = lombok.eclipse.Eclipse.caseStatementConstantExpressions     // Catch: java.lang.NoSuchFieldException -> L2d
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            goto L2e
        L2d:
        L2e:
            r0 = 1
            lombok.eclipse.Eclipse.caseStatementInit = r0
        L32:
            java.lang.reflect.Field r0 = lombok.eclipse.Eclipse.caseStatementConstantExpressions
            if (r0 == 0) goto L4f
            java.lang.reflect.Field r0 = lombok.eclipse.Eclipse.caseStatementConstantExpressions     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalAccessException -> L4e
            r1 = r8
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalAccessException -> L4e
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalAccessException -> L4e
            r0.set(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalAccessException -> L4e
            goto L4f
        L4a:
            goto L4f
        L4e:
        L4f:
            r0 = r8
            return r0
    }
}
