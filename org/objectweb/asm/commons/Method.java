package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/Method.SCL.lombok */
public class Method {
    private final java.lang.String name;
    private final java.lang.String descriptor;
    private static final java.util.Map<java.lang.String, java.lang.String> PRIMITIVE_TYPE_DESCRIPTORS = null;

    public Method(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.descriptor = r1
            return
    }

    public Method(java.lang.String r6, org.objectweb.asm.Type r7, org.objectweb.asm.Type[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r2 = org.objectweb.asm.Type.getMethodDescriptor(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.reflect.Method r5) {
            org.objectweb.asm.commons.Method r0 = new org.objectweb.asm.commons.Method
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            java.lang.String r3 = org.objectweb.asm.Type.getMethodDescriptor(r3)
            r1.<init>(r2, r3)
            return r0
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.reflect.Constructor<?> r5) {
            org.objectweb.asm.commons.Method r0 = new org.objectweb.asm.commons.Method
            r1 = r0
            java.lang.String r2 = "<init>"
            r3 = r5
            java.lang.String r3 = org.objectweb.asm.Type.getConstructorDescriptor(r3)
            r1.<init>(r2, r3)
            return r0
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.String r3) {
            r0 = r3
            r1 = 0
            org.objectweb.asm.commons.Method r0 = getMethod(r0, r1)
            return r0
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.String r5, boolean r6) {
            r0 = r5
            r1 = 32
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r5
            r1 = 40
            r2 = r7
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r5
            r1 = 41
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r9 = r0
            r0 = r7
            r1 = -1
            if (r0 == r1) goto L29
            r0 = r8
            if (r0 == 0) goto L29
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            r0 = r5
            r1 = 0
            r2 = r7
            java.lang.String r0 = r0.substring(r1, r2)
            r10 = r0
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = r8
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r0 = r0.trim()
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
        L59:
            r0 = r5
            r1 = 44
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r13 = r0
            r0 = r13
            r1 = -1
            if (r0 != r1) goto L7b
            r0 = r5
            r1 = r8
            r2 = r9
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r0 = r0.trim()
            r1 = r6
            java.lang.String r0 = getDescriptorInternal(r0, r1)
            r14 = r0
            goto L90
        L7b:
            r0 = r5
            r1 = r8
            r2 = r13
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r0 = r0.trim()
            r1 = r6
            java.lang.String r0 = getDescriptorInternal(r0, r1)
            r14 = r0
            r0 = r13
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
        L90:
            r0 = r12
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            r1 = -1
            if (r0 != r1) goto L59
            r0 = r12
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            r2 = r6
            java.lang.String r1 = getDescriptorInternal(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            org.objectweb.asm.commons.Method r0 = new org.objectweb.asm.commons.Method
            r1 = r0
            r2 = r11
            r3 = r12
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            return r0
    }

    private static java.lang.String getDescriptorInternal(java.lang.String r6, boolean r7) {
            java.lang.String r0 = ""
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            r0 = r6
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
        L15:
            r0 = r6
            java.lang.String r1 = "[]"
            r2 = r9
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r1 = r0
            r9 = r1
            if (r0 <= 0) goto L2d
            r0 = r8
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L15
        L2d:
            r0 = r6
            r1 = 0
            r2 = r6
            int r2 = r2.length()
            r3 = r8
            int r3 = r3.length()
            r4 = 2
            int r3 = r3 * r4
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r10 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = org.objectweb.asm.commons.Method.PRIMITIVE_TYPE_DESCRIPTORS
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L5d
            r0 = r8
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L98
        L5d:
            r0 = r8
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = 46
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L83
            r0 = r7
            if (r0 != 0) goto L79
            r0 = r8
            java.lang.String r1 = "java/lang/"
            java.lang.StringBuilder r0 = r0.append(r1)
        L79:
            r0 = r8
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L91
        L83:
            r0 = r8
            r1 = r10
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
        L91:
            r0 = r8
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
        L98:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    public java.lang.String getDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.descriptor
            return r0
    }

    public org.objectweb.asm.Type getReturnType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.descriptor
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            return r0
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.descriptor
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.name
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.descriptor
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.commons.Method
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            org.objectweb.asm.commons.Method r0 = (org.objectweb.asm.commons.Method) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.name
            r1 = r5
            java.lang.String r1 = r1.name
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = r3
            java.lang.String r0 = r0.descriptor
            r1 = r5
            java.lang.String r1 = r1.descriptor
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.name
            int r0 = r0.hashCode()
            r1 = r3
            java.lang.String r1 = r1.descriptor
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "void"
            java.lang.String r2 = "V"
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
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "Z"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            org.objectweb.asm.commons.Method.PRIMITIVE_TYPE_DESCRIPTORS = r0
            return
    }
}
