package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/Hook.SCL.lombok */
public class Hook {
    private final java.lang.String className;
    private final java.lang.String methodName;
    private final java.lang.String returnType;
    private final java.util.List<java.lang.String> parameterTypes;
    private static final java.util.Map<java.lang.String, java.lang.String> PRIMITIVES = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "int"
            java.lang.String r2 = "I"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "long"
            java.lang.String r2 = "J"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "short"
            java.lang.String r2 = "S"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "byte"
            java.lang.String r2 = "B"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "char"
            java.lang.String r2 = "C"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "double"
            java.lang.String r2 = "D"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "float"
            java.lang.String r2 = "F"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "void"
            java.lang.String r2 = "V"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "Z"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.patcher.Hook.PRIMITIVES = r0
            return
    }

    public Hook(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String... r8) {
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
            if (r0 != 0) goto L2e
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "returnType"
            r1.<init>(r2)
            throw r0
        L2e:
            r0 = r8
            if (r0 != 0) goto L3d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "parameterTypes"
            r1.<init>(r2)
            throw r0
        L3d:
            r0 = r4
            r1 = r5
            r0.className = r1
            r0 = r4
            r1 = r6
            r0.methodName = r1
            r0 = r4
            r1 = r7
            r0.returnType = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            r1 = r0
            r13 = r1
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r11 = r0
            goto L77
        L63:
            r0 = r13
            r1 = r11
            r0 = r0[r1]
            r10 = r0
            r0 = r9
            r1 = r10
            boolean r0 = r0.add(r1)
            int r11 = r11 + 1
        L77:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L63
            r0 = r4
            r1 = r9
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.parameterTypes = r1
            return
    }

    public boolean isConstructor() {
            r3 = this;
            java.lang.String r0 = "<init>"
            r1 = r3
            java.lang.String r1 = r1.methodName
            boolean r0 = r0.equals(r1)
            return r0
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }

    public java.lang.String getMethodName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.methodName
            return r0
    }

    public java.lang.String getReturnType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.returnType
            return r0
    }

    public java.util.List<java.lang.String> getParameterTypes() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.parameterTypes
            return r0
    }

    public java.lang.String getClassSpec() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            java.lang.String r0 = convertType(r0)
            return r0
    }

    public java.lang.String getMethodDescriptor() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.parameterTypes
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L2f
        L1c:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r4
            r1 = r5
            java.lang.String r1 = toSpec(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
        L2f:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c
            r0 = r4
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.returnType
            java.lang.String r1 = toSpec(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String toSpec(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            goto L1e
        Lb:
            r0 = r5
            r1 = 0
            r2 = r5
            int r2 = r2.length()
            r3 = 2
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r5 = r0
            r0 = r6
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
        L1e:
            r0 = r5
            java.lang.String r1 = "[]"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto Lb
            java.util.Map<java.lang.String, java.lang.String> r0 = lombok.patcher.Hook.PRIMITIVES
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L43
            r0 = r6
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
        L43:
            r0 = r6
            java.lang.String r1 = "L"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.String r1 = convertType(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String convertType(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L35
        L19:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r4
            int r0 = r0.length()
            if (r0 <= 0) goto L2c
            r0 = r4
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
        L2c:
            r0 = r4
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
        L35:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L19
            r0 = r4
            java.lang.String r0 = r0.toString()
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
            java.lang.String r1 = r1.className
            if (r1 != 0) goto L11
            r1 = 0
            goto L18
        L11:
            r1 = r3
            java.lang.String r1 = r1.className
            int r1 = r1.hashCode()
        L18:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.methodName
            if (r1 != 0) goto L29
            r1 = 0
            goto L30
        L29:
            r1 = r3
            java.lang.String r1 = r1.methodName
            int r1 = r1.hashCode()
        L30:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.util.List<java.lang.String> r1 = r1.parameterTypes
            if (r1 != 0) goto L41
            r1 = 0
            goto L4a
        L41:
            r1 = r3
            java.util.List<java.lang.String> r1 = r1.parameterTypes
            int r1 = r1.hashCode()
        L4a:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.returnType
            if (r1 != 0) goto L5b
            r1 = 0
            goto L62
        L5b:
            r1 = r3
            java.lang.String r1 = r1.returnType
            int r1 = r1.hashCode()
        L62:
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
            lombok.patcher.Hook r0 = (lombok.patcher.Hook) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.className
            if (r0 != 0) goto L2f
            r0 = r5
            java.lang.String r0 = r0.className
            if (r0 == 0) goto L3f
            r0 = 0
            return r0
        L2f:
            r0 = r3
            java.lang.String r0 = r0.className
            r1 = r5
            java.lang.String r1 = r1.className
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            r0 = 0
            return r0
        L3f:
            r0 = r3
            java.lang.String r0 = r0.methodName
            if (r0 != 0) goto L4f
            r0 = r5
            java.lang.String r0 = r0.methodName
            if (r0 == 0) goto L5f
            r0 = 0
            return r0
        L4f:
            r0 = r3
            java.lang.String r0 = r0.methodName
            r1 = r5
            java.lang.String r1 = r1.methodName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            r0 = 0
            return r0
        L5f:
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.parameterTypes
            if (r0 != 0) goto L6f
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.parameterTypes
            if (r0 == 0) goto L81
            r0 = 0
            return r0
        L6f:
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.parameterTypes
            r1 = r5
            java.util.List<java.lang.String> r1 = r1.parameterTypes
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L81
            r0 = 0
            return r0
        L81:
            r0 = r3
            java.lang.String r0 = r0.returnType
            if (r0 != 0) goto L91
            r0 = r5
            java.lang.String r0 = r0.returnType
            if (r0 == 0) goto La1
            r0 = 0
            return r0
        L91:
            r0 = r3
            java.lang.String r0 = r0.returnType
            r1 = r5
            java.lang.String r1 = r1.returnType
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La1
            r0 = 0
            return r0
        La1:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Hook [className="
            r1.<init>(r2)
            r1 = r4
            java.lang.String r1 = r1.className
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", methodName="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.methodName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", returnType="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.returnType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", parameterTypes="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.util.List<java.lang.String> r1 = r1.parameterTypes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
