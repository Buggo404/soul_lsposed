package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Type.SCL.lombok */
public final class Type {
    public static final int VOID = 0;
    public static final int BOOLEAN = 1;
    public static final int CHAR = 2;
    public static final int BYTE = 3;
    public static final int SHORT = 4;
    public static final int INT = 5;
    public static final int FLOAT = 6;
    public static final int LONG = 7;
    public static final int DOUBLE = 8;
    public static final int ARRAY = 9;
    public static final int OBJECT = 10;
    public static final int METHOD = 11;
    private static final int INTERNAL = 12;
    private static final java.lang.String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
    public static final org.objectweb.asm.Type VOID_TYPE = null;
    public static final org.objectweb.asm.Type BOOLEAN_TYPE = null;
    public static final org.objectweb.asm.Type CHAR_TYPE = null;
    public static final org.objectweb.asm.Type BYTE_TYPE = null;
    public static final org.objectweb.asm.Type SHORT_TYPE = null;
    public static final org.objectweb.asm.Type INT_TYPE = null;
    public static final org.objectweb.asm.Type FLOAT_TYPE = null;
    public static final org.objectweb.asm.Type LONG_TYPE = null;
    public static final org.objectweb.asm.Type DOUBLE_TYPE = null;
    private final int sort;
    private final java.lang.String valueBuffer;
    private final int valueBegin;
    private final int valueEnd;

    private Type(int r4, java.lang.String r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.sort = r1
            r0 = r3
            r1 = r5
            r0.valueBuffer = r1
            r0 = r3
            r1 = r6
            r0.valueBegin = r1
            r0 = r3
            r1 = r7
            r0.valueEnd = r1
            return
    }

    public static org.objectweb.asm.Type getType(java.lang.String r4) {
            r0 = r4
            r1 = 0
            r2 = r4
            int r2 = r2.length()
            org.objectweb.asm.Type r0 = getTypeInternal(r0, r1, r2)
            return r0
    }

    public static org.objectweb.asm.Type getType(java.lang.Class<?> r3) {
            r0 = r3
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L72
            r0 = r3
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L12
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            return r0
        L12:
            r0 = r3
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L1d
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.VOID_TYPE
            return r0
        L1d:
            r0 = r3
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L28
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BOOLEAN_TYPE
            return r0
        L28:
            r0 = r3
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L33
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BYTE_TYPE
            return r0
        L33:
            r0 = r3
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L3e
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.CHAR_TYPE
            return r0
        L3e:
            r0 = r3
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L49
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.SHORT_TYPE
            return r0
        L49:
            r0 = r3
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L54
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            return r0
        L54:
            r0 = r3
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L5f
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            return r0
        L5f:
            r0 = r3
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L6a
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            return r0
        L6a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L72:
            r0 = r3
            java.lang.String r0 = getDescriptor(r0)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static org.objectweb.asm.Type getType(java.lang.reflect.Constructor<?> r2) {
            r0 = r2
            java.lang.String r0 = getConstructorDescriptor(r0)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static org.objectweb.asm.Type getType(java.lang.reflect.Method r2) {
            r0 = r2
            java.lang.String r0 = getMethodDescriptor(r0)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public org.objectweb.asm.Type getElementType() {
            r4 = this;
            r0 = r4
            int r0 = r0.getDimensions()
            r5 = r0
            r0 = r4
            java.lang.String r0 = r0.valueBuffer
            r1 = r4
            int r1 = r1.valueBegin
            r2 = r5
            int r1 = r1 + r2
            r2 = r4
            int r2 = r2.valueEnd
            org.objectweb.asm.Type r0 = getTypeInternal(r0, r1, r2)
            return r0
    }

    public static org.objectweb.asm.Type getObjectType(java.lang.String r7) {
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = r7
            r3 = 0
            char r2 = r2.charAt(r3)
            r3 = 91
            if (r2 != r3) goto L13
            r2 = 9
            goto L15
        L13:
            r2 = 12
        L15:
            r3 = r7
            r4 = 0
            r5 = r7
            int r5 = r5.length()
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.objectweb.asm.Type getMethodType(java.lang.String r7) {
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 11
            r3 = r7
            r4 = 0
            r5 = r7
            int r5 = r5.length()
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.objectweb.asm.Type getMethodType(org.objectweb.asm.Type r3, org.objectweb.asm.Type... r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = getMethodDescriptor(r0, r1)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            org.objectweb.asm.Type[] r0 = getArgumentTypes(r0)
            return r0
    }

    public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.String r6) {
            r0 = 0
            r7 = r0
            r0 = 1
            r8 = r0
        L4:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = 41
            if (r0 == r1) goto L41
        Le:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L1e
            int r8 = r8 + 1
            goto Le
        L1e:
            r0 = r6
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L3b
            r0 = r6
            r1 = 59
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r9 = r0
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r8 = r0
        L3b:
            int r7 = r7 + 1
            goto L4
        L41:
            r0 = r7
            org.objectweb.asm.Type[] r0 = new org.objectweb.asm.Type[r0]
            r9 = r0
            r0 = 1
            r8 = r0
            r0 = 0
            r10 = r0
        L4b:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = 41
            if (r0 == r1) goto L98
            r0 = r8
            r11 = r0
        L58:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L68
            int r8 = r8 + 1
            goto L58
        L68:
            r0 = r6
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L87
            r0 = r6
            r1 = 59
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r12 = r0
            r0 = r8
            r1 = r12
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r8 = r0
        L87:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r6
            r3 = r11
            r4 = r8
            org.objectweb.asm.Type r2 = getTypeInternal(r2, r3, r4)
            r0[r1] = r2
            goto L4b
        L98:
            r0 = r9
            return r0
    }

    public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.reflect.Method r5) {
            r0 = r5
            java.lang.Class[] r0 = r0.getParameterTypes()
            r6 = r0
            r0 = r6
            int r0 = r0.length
            org.objectweb.asm.Type[] r0 = new org.objectweb.asm.Type[r0]
            r7 = r0
            r0 = r6
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
        L10:
            r0 = r8
            if (r0 < 0) goto L23
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            org.objectweb.asm.Type r2 = getType(r2)
            r0[r1] = r2
            int r8 = r8 + (-1)
            goto L10
        L23:
            r0 = r7
            return r0
    }

    public org.objectweb.asm.Type getReturnType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            org.objectweb.asm.Type r0 = getReturnType(r0)
            return r0
    }

    public static org.objectweb.asm.Type getReturnType(java.lang.String r4) {
            r0 = r4
            r1 = r4
            int r1 = getReturnTypeOffset(r1)
            r2 = r4
            int r2 = r2.length()
            org.objectweb.asm.Type r0 = getTypeInternal(r0, r1, r2)
            return r0
    }

    public static org.objectweb.asm.Type getReturnType(java.lang.reflect.Method r2) {
            r0 = r2
            java.lang.Class r0 = r0.getReturnType()
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    static int getReturnTypeOffset(java.lang.String r4) {
            r0 = 1
            r5 = r0
        L2:
            r0 = r4
            r1 = r5
            char r0 = r0.charAt(r1)
            r1 = 41
            if (r0 == r1) goto L3c
        Lc:
            r0 = r4
            r1 = r5
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L1c
            int r5 = r5 + 1
            goto Lc
        L1c:
            r0 = r4
            r1 = r5
            int r5 = r5 + 1
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L2
            r0 = r4
            r1 = 59
            r2 = r5
            int r0 = r0.indexOf(r1, r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
            goto L2
        L3c:
            r0 = r5
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    private static org.objectweb.asm.Type getTypeInternal(java.lang.String r8, int r9, int r10) {
            r0 = r8
            r1 = r9
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 40: goto Lb2;
                case 66: goto L7c;
                case 67: goto L78;
                case 68: goto L90;
                case 70: goto L88;
                case 73: goto L84;
                case 74: goto L8c;
                case 76: goto La1;
                case 83: goto L80;
                case 86: goto L70;
                case 90: goto L74;
                case 91: goto L94;
                default: goto Lbf;
            }
        L70:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.VOID_TYPE
            return r0
        L74:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BOOLEAN_TYPE
            return r0
        L78:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.CHAR_TYPE
            return r0
        L7c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BYTE_TYPE
            return r0
        L80:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.SHORT_TYPE
            return r0
        L84:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            return r0
        L88:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            return r0
        L8c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            return r0
        L90:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            return r0
        L94:
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 9
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            return r0
        La1:
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 10
            r3 = r8
            r4 = r9
            r5 = 1
            int r4 = r4 + r5
            r5 = r10
            r6 = 1
            int r5 = r5 - r6
            r1.<init>(r2, r3, r4, r5)
            return r0
        Lb2:
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 11
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            return r0
        Lbf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid descriptor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public java.lang.String getClassName() {
            r4 = this;
            r0 = r4
            int r0 = r0.sort
            switch(r0) {
                case 0: goto L48;
                case 1: goto L4b;
                case 2: goto L4e;
                case 3: goto L52;
                case 4: goto L56;
                case 5: goto L5a;
                case 6: goto L5e;
                case 7: goto L62;
                case 8: goto L66;
                case 9: goto L6a;
                case 10: goto L95;
                case 11: goto Lac;
                case 12: goto L95;
                default: goto Lac;
            }
        L48:
            java.lang.String r0 = "void"
            return r0
        L4b:
            java.lang.String r0 = "boolean"
            return r0
        L4e:
            java.lang.String r0 = "char"
            return r0
        L52:
            java.lang.String r0 = "byte"
            return r0
        L56:
            java.lang.String r0 = "short"
            return r0
        L5a:
            java.lang.String r0 = "int"
            return r0
        L5e:
            java.lang.String r0 = "float"
            return r0
        L62:
            java.lang.String r0 = "long"
            return r0
        L66:
            java.lang.String r0 = "double"
            return r0
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            org.objectweb.asm.Type r2 = r2.getElementType()
            java.lang.String r2 = r2.getClassName()
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            int r0 = r0.getDimensions()
            r6 = r0
        L7e:
            r0 = r6
            if (r0 <= 0) goto L90
            r0 = r5
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + (-1)
            goto L7e
        L90:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
        L95:
            r0 = r4
            java.lang.String r0 = r0.valueBuffer
            r1 = r4
            int r1 = r1.valueBegin
            r2 = r4
            int r2 = r2.valueEnd
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        Lac:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    public java.lang.String getInternalName() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.valueBuffer
            r1 = r4
            int r1 = r1.valueBegin
            r2 = r4
            int r2 = r2.valueEnd
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static java.lang.String getInternalName(java.lang.Class<?> r4) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public java.lang.String getDescriptor() {
            r5 = this;
            r0 = r5
            int r0 = r0.sort
            r1 = 10
            if (r0 != r1) goto L1d
            r0 = r5
            java.lang.String r0 = r0.valueBuffer
            r1 = r5
            int r1 = r1.valueBegin
            r2 = 1
            int r1 = r1 - r2
            r2 = r5
            int r2 = r2.valueEnd
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L1d:
            r0 = r5
            int r0 = r0.sort
            r1 = 12
            if (r0 != r1) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.String r1 = r1.valueBuffer
            r2 = r5
            int r2 = r2.valueBegin
            r3 = r5
            int r3 = r3.valueEnd
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4d:
            r0 = r5
            java.lang.String r0 = r0.valueBuffer
            r1 = r5
            int r1 = r1.valueBegin
            r2 = r5
            int r2 = r2.valueEnd
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static java.lang.String getDescriptor(java.lang.Class<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            r1 = r4
            appendDescriptor(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getConstructorDescriptor(java.lang.reflect.Constructor<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.lang.Class[] r0 = r0.getParameterTypes()
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1d:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L36
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r4
            appendDescriptor(r0, r1)
            int r8 = r8 + 1
            goto L1d
        L36:
            r0 = r4
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getMethodDescriptor(org.objectweb.asm.Type r3, org.objectweb.asm.Type... r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L18:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L31
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r5
            r0.appendDescriptor(r1)
            int r8 = r8 + 1
            goto L18
        L31:
            r0 = r5
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r5
            r0.appendDescriptor(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getMethodDescriptor(java.lang.reflect.Method r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.lang.Class[] r0 = r0.getParameterTypes()
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1d:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L36
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r4
            appendDescriptor(r0, r1)
            int r8 = r8 + 1
            goto L1d
        L36:
            r0 = r4
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.lang.Class r0 = r0.getReturnType()
            r1 = r4
            appendDescriptor(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void appendDescriptor(java.lang.StringBuilder r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.sort
            r1 = 10
            if (r0 != r1) goto L21
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.valueBuffer
            r2 = r6
            int r2 = r2.valueBegin
            r3 = 1
            int r2 = r2 - r3
            r3 = r6
            int r3 = r3.valueEnd
            r4 = 1
            int r3 = r3 + r4
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            goto L59
        L21:
            r0 = r6
            int r0 = r0.sort
            r1 = 12
            if (r0 != r1) goto L48
            r0 = r7
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.valueBuffer
            r2 = r6
            int r2 = r2.valueBegin
            r3 = r6
            int r3 = r3.valueEnd
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L59
        L48:
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.valueBuffer
            r2 = r6
            int r2 = r2.valueBegin
            r3 = r6
            int r3 = r3.valueEnd
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
        L59:
            return
    }

    private static void appendDescriptor(java.lang.Class<?> r3, java.lang.StringBuilder r4) {
            r0 = r3
            r5 = r0
        L2:
            r0 = r5
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L18
            r0 = r4
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.Class r0 = r0.getComponentType()
            r5 = r0
            goto L2
        L18:
            r0 = r5
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto La5
            r0 = r5
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L2c
            r0 = 73
            r6 = r0
            goto L9c
        L2c:
            r0 = r5
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L39
            r0 = 86
            r6 = r0
            goto L9c
        L39:
            r0 = r5
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L46
            r0 = 90
            r6 = r0
            goto L9c
        L46:
            r0 = r5
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L53
            r0 = 66
            r6 = r0
            goto L9c
        L53:
            r0 = r5
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L60
            r0 = 67
            r6 = r0
            goto L9c
        L60:
            r0 = r5
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L6d
            r0 = 83
            r6 = r0
            goto L9c
        L6d:
            r0 = r5
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L7a
            r0 = 68
            r6 = r0
            goto L9c
        L7a:
            r0 = r5
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L87
            r0 = 70
            r6 = r0
            goto L9c
        L87:
            r0 = r5
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L94
            r0 = 74
            r6 = r0
            goto L9c
        L94:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L9c:
            r0 = r4
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lb8
        La5:
            r0 = r4
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.String r1 = getInternalName(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb8:
            return
    }

    public int getSort() {
            r3 = this;
            r0 = r3
            int r0 = r0.sort
            r1 = 12
            if (r0 != r1) goto Le
            r0 = 10
            goto L12
        Le:
            r0 = r3
            int r0 = r0.sort
        L12:
            return r0
    }

    public int getDimensions() {
            r4 = this;
            r0 = 1
            r5 = r0
        L2:
            r0 = r4
            java.lang.String r0 = r0.valueBuffer
            r1 = r4
            int r1 = r1.valueBegin
            r2 = r5
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L1a
            int r5 = r5 + 1
            goto L2
        L1a:
            r0 = r5
            return r0
    }

    public int getSize() {
            r3 = this;
            r0 = r3
            int r0 = r0.sort
            switch(r0) {
                case 0: goto L48;
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4c;
                case 8: goto L4c;
                case 9: goto L4a;
                case 10: goto L4a;
                case 11: goto L4e;
                case 12: goto L4a;
                default: goto L4e;
            }
        L48:
            r0 = 0
            return r0
        L4a:
            r0 = 1
            return r0
        L4c:
            r0 = 2
            return r0
        L4e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    public int getArgumentsAndReturnSizes() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            int r0 = getArgumentsAndReturnSizes(r0)
            return r0
    }

    public static int getArgumentsAndReturnSizes(java.lang.String r4) {
            r0 = 1
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
        La:
            r0 = r7
            r1 = 41
            if (r0 == r1) goto L60
            r0 = r7
            r1 = 74
            if (r0 == r1) goto L1c
            r0 = r7
            r1 = 68
            if (r0 != r1) goto L25
        L1c:
            int r6 = r6 + 1
            int r5 = r5 + 2
            goto L57
        L25:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L35
            int r6 = r6 + 1
            goto L25
        L35:
            r0 = r4
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L54
            r0 = r4
            r1 = 59
            r2 = r6
            int r0 = r0.indexOf(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6 = r0
        L54:
            int r5 = r5 + 1
        L57:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            goto La
        L60:
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 86
            if (r0 != r1) goto L72
            r0 = r5
            r1 = 2
            int r0 = r0 << r1
            return r0
        L72:
            r0 = r7
            r1 = 74
            if (r0 == r1) goto L7e
            r0 = r7
            r1 = 68
            if (r0 != r1) goto L82
        L7e:
            r0 = 2
            goto L83
        L82:
            r0 = 1
        L83:
            r8 = r0
            r0 = r5
            r1 = 2
            int r0 = r0 << r1
            r1 = r8
            r0 = r0 | r1
            return r0
    }

    public int getOpcode(int r4) {
            r3 = this;
            r0 = r4
            r1 = 46
            if (r0 == r1) goto Lc
            r0 = r4
            r1 = 79
            if (r0 != r1) goto L84
        Lc:
            r0 = r3
            int r0 = r0.sort
            switch(r0) {
                case 0: goto L74;
                case 1: goto L54;
                case 2: goto L58;
                case 3: goto L54;
                case 4: goto L5d;
                case 5: goto L62;
                case 6: goto L64;
                case 7: goto L68;
                case 8: goto L6c;
                case 9: goto L70;
                case 10: goto L70;
                case 11: goto L74;
                case 12: goto L70;
                default: goto L7c;
            }
        L54:
            r0 = r4
            r1 = 5
            int r0 = r0 + r1
            return r0
        L58:
            r0 = r4
            r1 = 6
            int r0 = r0 + r1
            return r0
        L5d:
            r0 = r4
            r1 = 7
            int r0 = r0 + r1
            return r0
        L62:
            r0 = r4
            return r0
        L64:
            r0 = r4
            r1 = 2
            int r0 = r0 + r1
            return r0
        L68:
            r0 = r4
            r1 = 1
            int r0 = r0 + r1
            return r0
        L6c:
            r0 = r4
            r1 = 3
            int r0 = r0 + r1
            return r0
        L70:
            r0 = r4
            r1 = 4
            int r0 = r0 + r1
            return r0
        L74:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
        L7c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L84:
            r0 = r3
            int r0 = r0.sort
            switch(r0) {
                case 0: goto Lcc;
                case 1: goto Ldf;
                case 2: goto Ldf;
                case 3: goto Ldf;
                case 4: goto Ldf;
                case 5: goto Ldf;
                case 6: goto Le1;
                case 7: goto Le5;
                case 8: goto Le9;
                case 9: goto Led;
                case 10: goto Led;
                case 11: goto L10c;
                case 12: goto Led;
                default: goto L114;
            }
        Lcc:
            r0 = r4
            r1 = 172(0xac, float:2.41E-43)
            if (r0 == r1) goto Ldb
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
        Ldb:
            r0 = 177(0xb1, float:2.48E-43)
            return r0
        Ldf:
            r0 = r4
            return r0
        Le1:
            r0 = r4
            r1 = 2
            int r0 = r0 + r1
            return r0
        Le5:
            r0 = r4
            r1 = 1
            int r0 = r0 + r1
            return r0
        Le9:
            r0 = r4
            r1 = 3
            int r0 = r0 + r1
            return r0
        Led:
            r0 = r4
            r1 = 21
            if (r0 == r1) goto L108
            r0 = r4
            r1 = 54
            if (r0 == r1) goto L108
            r0 = r4
            r1 = 172(0xac, float:2.41E-43)
            if (r0 == r1) goto L108
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
        L108:
            r0 = r4
            r1 = 4
            int r0 = r0 + r1
            return r0
        L10c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
        L114:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r5
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            r6 = r0
            r0 = r4
            int r0 = r0.sort
            r1 = 12
            if (r0 != r1) goto L23
            r0 = 10
            goto L27
        L23:
            r0 = r4
            int r0 = r0.sort
        L27:
            r1 = r6
            int r1 = r1.sort
            r2 = 12
            if (r1 != r2) goto L35
            r1 = 10
            goto L39
        L35:
            r1 = r6
            int r1 = r1.sort
        L39:
            if (r0 == r1) goto L3e
            r0 = 0
            return r0
        L3e:
            r0 = r4
            int r0 = r0.valueBegin
            r7 = r0
            r0 = r4
            int r0 = r0.valueEnd
            r8 = r0
            r0 = r6
            int r0 = r0.valueBegin
            r9 = r0
            r0 = r6
            int r0 = r0.valueEnd
            r10 = r0
            r0 = r8
            r1 = r7
            int r0 = r0 - r1
            r1 = r10
            r2 = r9
            int r1 = r1 - r2
            if (r0 == r1) goto L63
            r0 = 0
            return r0
        L63:
            r0 = r7
            r11 = r0
            r0 = r9
            r12 = r0
        L6a:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L91
            r0 = r4
            java.lang.String r0 = r0.valueBuffer
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = r6
            java.lang.String r1 = r1.valueBuffer
            r2 = r12
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L88
            r0 = 0
            return r0
        L88:
            int r11 = r11 + 1
            int r12 = r12 + 1
            goto L6a
        L91:
            r0 = 1
            return r0
    }

    public int hashCode() {
            r5 = this;
            r0 = 13
            r1 = r5
            int r1 = r1.sort
            r2 = 12
            if (r1 != r2) goto L10
            r1 = 10
            goto L14
        L10:
            r1 = r5
            int r1 = r1.sort
        L14:
            int r0 = r0 * r1
            r6 = r0
            r0 = r5
            int r0 = r0.sort
            r1 = 9
            if (r0 < r1) goto L42
            r0 = r5
            int r0 = r0.valueBegin
            r7 = r0
            r0 = r5
            int r0 = r0.valueEnd
            r8 = r0
        L29:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L42
            r0 = 17
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.valueBuffer
            r3 = r7
            char r2 = r2.charAt(r3)
            int r1 = r1 + r2
            int r0 = r0 * r1
            r6 = r0
            int r7 = r7 + 1
            goto L29
        L42:
            r0 = r6
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    static {
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 0
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 0
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.VOID_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 1
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 1
            r5 = 2
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.BOOLEAN_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 2
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 2
            r5 = 3
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.CHAR_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 3
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 3
            r5 = 4
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.BYTE_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 4
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 4
            r5 = 5
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.SHORT_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 5
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 5
            r5 = 6
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.INT_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 6
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 6
            r5 = 7
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.FLOAT_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 7
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 7
            r5 = 8
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.LONG_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 8
            java.lang.String r3 = "VZCBSIFJD"
            r4 = 8
            r5 = 9
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.DOUBLE_TYPE = r0
            return
    }
}
