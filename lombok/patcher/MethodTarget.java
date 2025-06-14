package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/MethodTarget.SCL.lombok */
public final class MethodTarget implements lombok.patcher.TargetMatcher {
    private final java.lang.String classSpec;
    private final java.lang.String methodName;
    private final java.lang.String returnSpec;
    private final java.util.List<java.lang.String> parameterSpec;
    private boolean hasDescription;
    private static final java.lang.String JVM_TYPE_SPEC = "\\[*(?:[BCDFIJSZ]|L[^;]+;)";
    private static final java.util.regex.Pattern PARAM_SPEC = null;
    private static final java.util.regex.Pattern COMPLETE_SPEC = null;
    private static final java.util.regex.Pattern BRACE_PAIRS = null;

    static {
            java.lang.String r0 = "\\[*(?:[BCDFIJSZ]|L[^;]+;)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.patcher.MethodTarget.PARAM_SPEC = r0
            java.lang.String r0 = "^\\(((?:\\[*(?:[BCDFIJSZ]|L[^;]+;))*)\\)(V|\\[*(?:[BCDFIJSZ]|L[^;]+;))$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.patcher.MethodTarget.COMPLETE_SPEC = r0
            java.lang.String r0 = "^(?:\\[\\])*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.patcher.MethodTarget.BRACE_PAIRS = r0
            return
    }

    @Override // lombok.patcher.TargetMatcher
    public java.lang.String describe() {
            r6 = this;
            r0 = r6
            java.lang.String r0 = r0.classSpec
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r7 = r0
            r0 = r6
            java.lang.String r0 = r0.classSpec
            r1 = 36
            int r0 = r0.lastIndexOf(r1)
            r8 = r0
            r0 = r6
            java.lang.String r0 = r0.classSpec
            r1 = 47
            int r0 = r0.lastIndexOf(r1)
            r9 = r0
            r0 = r7
            r1 = r8
            if (r0 <= r1) goto L27
            r0 = r7
            goto L28
        L27:
            r0 = r8
        L28:
            r10 = r0
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L33
            r0 = r9
            r10 = r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r10
            r3 = -1
            if (r2 != r3) goto L44
            r2 = r6
            java.lang.String r2 = r2.classSpec
            goto L4f
        L44:
            r2 = r6
            java.lang.String r2 = r2.classSpec
            r3 = r10
            r4 = 1
            int r3 = r3 + r4
            java.lang.String r2 = r2.substring(r3)
        L4f:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.methodName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getClassSpec() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.classSpec
            return r0
    }

    public java.lang.String getMethodName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.methodName
            return r0
    }

    public java.lang.String getReturnSpec() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.returnSpec
            return r0
    }

    public java.util.List<java.lang.String> getParameterSpec() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.parameterSpec
            return r0
    }

    public boolean isHasDescription() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.hasDescription
            return r0
    }

    public MethodTarget(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public MethodTarget(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String... r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 1
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public java.lang.Boolean returnTypeIsVoid() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.hasDescription
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r0 = r0.returnSpec
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L14:
            r0 = 0
            return r0
    }

    private MethodTarget(java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, java.lang.String[] r9) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto L12
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "classSpec"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r6
            if (r0 != 0) goto L20
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "methodName"
            r1.<init>(r2)
            throw r0
        L20:
            r0 = r7
            if (r0 == 0) goto L33
            r0 = r8
            if (r0 != 0) goto L33
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "returnSpec"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r7
            if (r0 == 0) goto L46
            r0 = r9
            if (r0 != 0) goto L46
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "parameterSpecs"
            r1.<init>(r2)
            throw r0
        L46:
            r0 = r6
            java.lang.String r1 = "["
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L58
            r0 = r6
            java.lang.String r1 = "."
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L62
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Your method name contained dots or braces. Perhaps you switched return type and method name around?"
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r4
            r1 = r7
            r0.hasDescription = r1
            r0 = r4
            r1 = r5
            r0.classSpec = r1
            r0 = r4
            r1 = r6
            r0.methodName = r1
            r0 = r4
            r1 = r8
            r0.returnSpec = r1
            r0 = r4
            r1 = r9
            if (r1 != 0) goto L81
            r1 = 0
            goto L89
        L81:
            r1 = r9
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        L89:
            r0.parameterSpec = r1
            return
    }

    public static java.util.List<java.lang.String> decomposeFullDesc(java.lang.String r6) {
            java.util.regex.Pattern r0 = lombok.patcher.MethodTarget.COMPLETE_SPEC
            r1 = r6
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0.matches()
            if (r0 != 0) goto L27
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "This isn't a valid spec: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L27:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 2
            java.lang.String r1 = r1.group(r2)
            boolean r0 = r0.add(r1)
            java.util.regex.Pattern r0 = lombok.patcher.MethodTarget.PARAM_SPEC
            r1 = r7
            r2 = 1
            java.lang.String r1 = r1.group(r2)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r9 = r0
            goto L56
        L4a:
            r0 = r8
            r1 = r9
            r2 = 0
            java.lang.String r1 = r1.group(r2)
            boolean r0 = r0.add(r1)
        L56:
            r0 = r9
            boolean r0 = r0.find()
            if (r0 != 0) goto L4a
            r0 = r8
            return r0
    }

    public boolean classMatches(java.lang.String r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.classSpec
            boolean r0 = typeMatches(r0, r1)
            return r0
    }

    @Override // lombok.patcher.TargetMatcher
    public java.util.Collection<java.lang.String> getAffectedClasses() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.classSpec
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    @Override // lombok.patcher.TargetMatcher
    public boolean matches(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = r5
            r1 = r3
            java.lang.String r1 = r1.methodName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r3
            r1 = r4
            boolean r0 = r0.classMatches(r1)
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = r3
            r1 = r6
            boolean r0 = r0.descriptorMatch(r1)
            return r0
    }

    private boolean descriptorMatch(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.returnSpec
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            java.util.List r0 = decomposeFullDesc(r0)
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r3
            java.lang.String r1 = r1.returnSpec
            boolean r0 = typeSpecMatch(r0, r1)
            if (r0 != 0) goto L28
            r0 = 0
            return r0
        L28:
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.parameterSpec
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L4f
        L35:
            r0 = r5
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r6
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = typeSpecMatch(r0, r1)
            if (r0 != 0) goto L4f
            r0 = 0
            return r0
        L4f:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L61
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L35
        L61:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L75
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L75
            r0 = 1
            return r0
        L75:
            r0 = 0
            return r0
    }

    public static boolean typeSpecMatch(java.lang.String r5, java.lang.String r6) {
            r0 = r5
            java.lang.String r1 = "V"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            r0 = r6
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            return r0
        L10:
            r0 = 0
            r7 = r0
            goto L25
        L15:
            r0 = r5
            r1 = r7
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 == r1) goto L22
            goto L2d
        L22:
            int r7 = r7 + 1
        L25:
            r0 = r7
            r1 = r5
            int r1 = r1.length()
            if (r0 < r1) goto L15
        L2d:
            r0 = r5
            r1 = r7
            java.lang.String r0 = r0.substring(r1)
            r5 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 * r1
            r7 = r0
            r0 = r6
            int r0 = r0.length()
            r1 = r7
            int r0 = r0 - r1
            r8 = r0
            r0 = r8
            if (r0 >= 0) goto L44
            r0 = 0
            return r0
        L44:
            r0 = r6
            r1 = r8
            java.lang.String r0 = r0.substring(r1)
            r9 = r0
            java.util.regex.Pattern r0 = lombok.patcher.MethodTarget.BRACE_PAIRS
            r1 = r9
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L5b
            r0 = 0
            return r0
        L5b:
            r0 = r6
            r1 = 0
            r2 = r8
            java.lang.String r0 = r0.substring(r1, r2)
            r6 = r0
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto Lb8;
                case 67: goto Lbf;
                case 68: goto Lc6;
                case 70: goto Lcd;
                case 73: goto Ld4;
                case 74: goto Ldb;
                case 76: goto Lf2;
                case 83: goto Le2;
                case 90: goto Lea;
                default: goto L102;
            }
        Lb8:
            r0 = r6
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            return r0
        Lbf:
            r0 = r6
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            return r0
        Lc6:
            r0 = r6
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            return r0
        Lcd:
            r0 = r6
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            return r0
        Ld4:
            r0 = r6
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            return r0
        Ldb:
            r0 = r6
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            return r0
        Le2:
            r0 = r6
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            return r0
        Lea:
            r0 = r6
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            return r0
        Lf2:
            r0 = r5
            r1 = 1
            r2 = r5
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = r6
            boolean r0 = typeMatches(r0, r1)
            return r0
        L102:
            r0 = 0
            return r0
    }

    public static boolean typeMatches(java.lang.String r4, java.lang.String r5) {
            r0 = r4
            java.lang.String r1 = "/"
            java.lang.String r2 = "."
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = r5
            boolean r0 = r0.equals(r1)
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.classSpec
            if (r1 != 0) goto L11
            r1 = 0
            goto L18
        L11:
            r1 = r3
            java.lang.String r1 = r1.classSpec
            int r1 = r1.hashCode()
        L18:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            boolean r1 = r1.hasDescription
            if (r1 == 0) goto L2b
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L2e
        L2b:
            r1 = 1237(0x4d5, float:1.733E-42)
        L2e:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.methodName
            if (r1 != 0) goto L3f
            r1 = 0
            goto L46
        L3f:
            r1 = r3
            java.lang.String r1 = r1.methodName
            int r1 = r1.hashCode()
        L46:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.util.List<java.lang.String> r1 = r1.parameterSpec
            if (r1 != 0) goto L57
            r1 = 0
            goto L60
        L57:
            r1 = r3
            java.util.List<java.lang.String> r1 = r1.parameterSpec
            int r1 = r1.hashCode()
        L60:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.returnSpec
            if (r1 != 0) goto L71
            r1 = 0
            goto L78
        L71:
            r1 = r3
            java.lang.String r1 = r1.returnSpec
            int r1 = r1.hashCode()
        L78:
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            if (r0 == r1) goto L1a
            r0 = 0
            return r0
        L1a:
            r0 = r4
            lombok.patcher.MethodTarget r0 = (lombok.patcher.MethodTarget) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.classSpec
            if (r0 != 0) goto L2f
            r0 = r5
            java.lang.String r0 = r0.classSpec
            if (r0 == 0) goto L3f
            r0 = 0
            return r0
        L2f:
            r0 = r3
            java.lang.String r0 = r0.classSpec
            r1 = r5
            java.lang.String r1 = r1.classSpec
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            r0 = 0
            return r0
        L3f:
            r0 = r3
            boolean r0 = r0.hasDescription
            r1 = r5
            boolean r1 = r1.hasDescription
            if (r0 == r1) goto L4c
            r0 = 0
            return r0
        L4c:
            r0 = r3
            java.lang.String r0 = r0.methodName
            if (r0 != 0) goto L5c
            r0 = r5
            java.lang.String r0 = r0.methodName
            if (r0 == 0) goto L6c
            r0 = 0
            return r0
        L5c:
            r0 = r3
            java.lang.String r0 = r0.methodName
            r1 = r5
            java.lang.String r1 = r1.methodName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            r0 = 0
            return r0
        L6c:
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.parameterSpec
            if (r0 != 0) goto L7c
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.parameterSpec
            if (r0 == 0) goto L8e
            r0 = 0
            return r0
        L7c:
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.parameterSpec
            r1 = r5
            java.util.List<java.lang.String> r1 = r1.parameterSpec
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8e
            r0 = 0
            return r0
        L8e:
            r0 = r3
            java.lang.String r0 = r0.returnSpec
            if (r0 != 0) goto L9e
            r0 = r5
            java.lang.String r0 = r0.returnSpec
            if (r0 == 0) goto Lae
            r0 = 0
            return r0
        L9e:
            r0 = r3
            java.lang.String r0 = r0.returnSpec
            r1 = r5
            java.lang.String r1 = r1.returnSpec
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lae
            r0 = 0
            return r0
        Lae:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "MethodTarget[classSpec="
            r1.<init>(r2)
            r1 = r4
            java.lang.String r1 = r1.classSpec
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", methodName="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.methodName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", returnSpec="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.returnSpec
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", parameterSpec="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.util.List<java.lang.String> r1 = r1.parameterSpec
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", hasDescription="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            boolean r1 = r1.hasDescription
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
