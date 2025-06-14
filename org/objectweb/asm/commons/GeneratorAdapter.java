package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/GeneratorAdapter.SCL.lombok */
public class GeneratorAdapter extends org.objectweb.asm.commons.LocalVariablesSorter {
    private static final java.lang.String CLASS_DESCRIPTOR = "Ljava/lang/Class;";
    private static final org.objectweb.asm.Type BYTE_TYPE = null;
    private static final org.objectweb.asm.Type BOOLEAN_TYPE = null;
    private static final org.objectweb.asm.Type SHORT_TYPE = null;
    private static final org.objectweb.asm.Type CHARACTER_TYPE = null;
    private static final org.objectweb.asm.Type INTEGER_TYPE = null;
    private static final org.objectweb.asm.Type FLOAT_TYPE = null;
    private static final org.objectweb.asm.Type LONG_TYPE = null;
    private static final org.objectweb.asm.Type DOUBLE_TYPE = null;
    private static final org.objectweb.asm.Type NUMBER_TYPE = null;
    private static final org.objectweb.asm.Type OBJECT_TYPE = null;
    private static final org.objectweb.asm.commons.Method BOOLEAN_VALUE = null;
    private static final org.objectweb.asm.commons.Method CHAR_VALUE = null;
    private static final org.objectweb.asm.commons.Method INT_VALUE = null;
    private static final org.objectweb.asm.commons.Method FLOAT_VALUE = null;
    private static final org.objectweb.asm.commons.Method LONG_VALUE = null;
    private static final org.objectweb.asm.commons.Method DOUBLE_VALUE = null;
    public static final int ADD = 96;
    public static final int SUB = 100;
    public static final int MUL = 104;
    public static final int DIV = 108;
    public static final int REM = 112;
    public static final int NEG = 116;
    public static final int SHL = 120;
    public static final int SHR = 122;
    public static final int USHR = 124;
    public static final int AND = 126;

    /* renamed from: OR */
    public static final int f630OR = 128;
    public static final int XOR = 130;

    /* renamed from: EQ */
    public static final int f631EQ = 153;

    /* renamed from: NE */
    public static final int f632NE = 154;

    /* renamed from: LT */
    public static final int f633LT = 155;

    /* renamed from: GE */
    public static final int f634GE = 156;

    /* renamed from: GT */
    public static final int f635GT = 157;

    /* renamed from: LE */
    public static final int f636LE = 158;
    private final int access;
    private final java.lang.String name;
    private final org.objectweb.asm.Type returnType;
    private final org.objectweb.asm.Type[] argumentTypes;
    private final java.util.List<org.objectweb.asm.Type> localTypes;

    public GeneratorAdapter(org.objectweb.asm.MethodVisitor r8, int r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r0 = r7
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.commons.GeneratorAdapter> r1 = org.objectweb.asm.commons.GeneratorAdapter.class
            if (r0 == r1) goto L1c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1c:
            return
    }

    protected GeneratorAdapter(int r7, org.objectweb.asm.MethodVisitor r8, int r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r11
            r4 = r8
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.localTypes = r1
            r0 = r6
            r1 = r9
            r0.access = r1
            r0 = r6
            r1 = r10
            r0.name = r1
            r0 = r6
            r1 = r11
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getReturnType(r1)
            r0.returnType = r1
            r0 = r6
            r1 = r11
            org.objectweb.asm.Type[] r1 = org.objectweb.asm.Type.getArgumentTypes(r1)
            r0.argumentTypes = r1
            return
    }

    public GeneratorAdapter(int r7, org.objectweb.asm.commons.Method r8, org.objectweb.asm.MethodVisitor r9) {
            r6 = this;
            r0 = r6
            r1 = r9
            r2 = r7
            r3 = r8
            java.lang.String r3 = r3.getName()
            r4 = r8
            java.lang.String r4 = r4.getDescriptor()
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public GeneratorAdapter(int r11, org.objectweb.asm.commons.Method r12, java.lang.String r13, org.objectweb.asm.Type[] r14, org.objectweb.asm.ClassVisitor r15) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r15
            r4 = r11
            r5 = r12
            java.lang.String r5 = r5.getName()
            r6 = r12
            java.lang.String r6 = r6.getDescriptor()
            r7 = r13
            r8 = r14
            if (r8 != 0) goto L18
            r8 = 0
            goto L1d
        L18:
            r8 = r14
            java.lang.String[] r8 = getInternalNames(r8)
        L1d:
            org.objectweb.asm.MethodVisitor r3 = r3.visitMethod(r4, r5, r6, r7, r8)
            r0.<init>(r1, r2, r3)
            return
    }

    private static java.lang.String[] getInternalNames(org.objectweb.asm.Type[] r5) {
            r0 = r5
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r6 = r0
            r0 = 0
            r7 = r0
        L8:
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L1d
            r0 = r6
            r1 = r7
            r2 = r5
            r3 = r7
            r2 = r2[r3]
            java.lang.String r2 = r2.getInternalName()
            r0[r1] = r2
            int r7 = r7 + 1
            goto L8
        L1d:
            r0 = r6
            return r0
    }

    public int getAccess() {
            r2 = this;
            r0 = r2
            int r0 = r0.access
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    public org.objectweb.asm.Type getReturnType() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Type r0 = r0.returnType
            return r0
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Type[] r0 = r0.argumentTypes
            java.lang.Object r0 = r0.clone()
            org.objectweb.asm.Type[] r0 = (org.objectweb.asm.Type[]) r0
            return r0
    }

    public void push(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            r0.push(r1)
            return
    }

    public void push(int r5) {
            r4 = this;
            r0 = r5
            r1 = -1
            if (r0 < r1) goto L17
            r0 = r5
            r1 = 5
            if (r0 > r1) goto L17
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 3
            r2 = r5
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L56
        L17:
            r0 = r5
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r1) goto L30
            r0 = r5
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L30
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 16
            r2 = r5
            r0.visitIntInsn(r1, r2)
            goto L56
        L30:
            r0 = r5
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L4b
            r0 = r5
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 > r1) goto L4b
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 17
            r2 = r5
            r0.visitIntInsn(r1, r2)
            goto L56
        L4b:
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.visitLdcInsn(r1)
        L56:
            return
    }

    public void push(long r6) {
            r5 = this;
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
        Lc:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 9
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L26
        L1b:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.visitLdcInsn(r1)
        L26:
            return
    }

    public void push(float r6) {
            r5 = this;
            r0 = r6
            int r0 = java.lang.Float.floatToIntBits(r0)
            r7 = r0
            r0 = r7
            long r0 = (long) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = r7
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto L18
            r0 = r7
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L27
        L18:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 11
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L32
        L27:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.visitLdcInsn(r1)
        L32:
            return
    }

    public void push(double r6) {
            r5 = this;
            r0 = r6
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = r8
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
        L13:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 14
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L2d
        L22:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.visitLdcInsn(r1)
        L2d:
            return
    }

    public void push(java.lang.String r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 1
            r0.visitInsn(r1)
            goto L17
        Lf:
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
        L17:
            return
    }

    public void push(org.objectweb.asm.Type r7) {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 1
            r0.visitInsn(r1)
            goto Le0
        Lf:
            r0 = r7
            int r0 = r0.getSort()
            switch(r0) {
                case 1: goto L40;
                case 2: goto L53;
                case 3: goto L66;
                case 4: goto L79;
                case 5: goto L8c;
                case 6: goto L9f;
                case 7: goto Lb2;
                case 8: goto Lc5;
                default: goto Ld8;
            }
        L40:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Boolean"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        L53:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Character"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        L66:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Byte"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        L79:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Short"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        L8c:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Integer"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        L9f:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Float"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        Lb2:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Long"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        Lc5:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Double"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Le0
        Ld8:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r0.visitLdcInsn(r1)
        Le0:
            return
    }

    public void push(org.objectweb.asm.Handle r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 1
            r0.visitInsn(r1)
            goto L17
        Lf:
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
        L17:
            return
    }

    public void push(org.objectweb.asm.ConstantDynamic r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 1
            r0.visitInsn(r1)
            goto L17
        Lf:
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
        L17:
            return
    }

    private int getArgIndex(int r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.access
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r6 = r0
            r0 = 0
            r7 = r0
        L12:
            r0 = r7
            r1 = r5
            if (r0 >= r1) goto L29
            r0 = r6
            r1 = r4
            org.objectweb.asm.Type[] r1 = r1.argumentTypes
            r2 = r7
            r1 = r1[r2]
            int r1 = r1.getSize()
            int r0 = r0 + r1
            r6 = r0
            int r7 = r7 + 1
            goto L12
        L29:
            r0 = r6
            return r0
    }

    private void loadInsn(org.objectweb.asm.Type r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 21
            int r1 = r1.getOpcode(r2)
            r2 = r6
            r0.visitVarInsn(r1, r2)
            return
    }

    private void storeInsn(org.objectweb.asm.Type r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 54
            int r1 = r1.getOpcode(r2)
            r2 = r6
            r0.visitVarInsn(r1, r2)
            return
    }

    public void loadThis() {
            r4 = this;
            r0 = r4
            int r0 = r0.access
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "no 'this' pointer within static method"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 25
            r2 = 0
            r0.visitVarInsn(r1, r2)
            return
    }

    public void loadArg(int r6) {
            r5 = this;
            r0 = r5
            r1 = r5
            org.objectweb.asm.Type[] r1 = r1.argumentTypes
            r2 = r6
            r1 = r1[r2]
            r2 = r5
            r3 = r6
            int r2 = r2.getArgIndex(r3)
            r0.loadInsn(r1, r2)
            return
    }

    public void loadArgs(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.getArgIndex(r1)
            r7 = r0
            r0 = 0
            r8 = r0
        L9:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L2f
            r0 = r4
            org.objectweb.asm.Type[] r0 = r0.argumentTypes
            r1 = r5
            r2 = r8
            int r1 = r1 + r2
            r0 = r0[r1]
            r9 = r0
            r0 = r4
            r1 = r9
            r2 = r7
            r0.loadInsn(r1, r2)
            r0 = r7
            r1 = r9
            int r1 = r1.getSize()
            int r0 = r0 + r1
            r7 = r0
            int r8 = r8 + 1
            goto L9
        L2f:
            return
    }

    public void loadArgs() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r4
            org.objectweb.asm.Type[] r2 = r2.argumentTypes
            int r2 = r2.length
            r0.loadArgs(r1, r2)
            return
    }

    public void loadArgArray() {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.Type[] r1 = r1.argumentTypes
            int r1 = r1.length
            r0.push(r1)
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.commons.GeneratorAdapter.OBJECT_TYPE
            r0.newArray(r1)
            r0 = 0
            r5 = r0
        L12:
            r0 = r5
            r1 = r4
            org.objectweb.asm.Type[] r1 = r1.argumentTypes
            int r1 = r1.length
            if (r0 >= r1) goto L40
            r0 = r4
            r0.dup()
            r0 = r4
            r1 = r5
            r0.push(r1)
            r0 = r4
            r1 = r5
            r0.loadArg(r1)
            r0 = r4
            r1 = r4
            org.objectweb.asm.Type[] r1 = r1.argumentTypes
            r2 = r5
            r1 = r1[r2]
            r0.box(r1)
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.commons.GeneratorAdapter.OBJECT_TYPE
            r0.arrayStore(r1)
            int r5 = r5 + 1
            goto L12
        L40:
            return
    }

    public void storeArg(int r6) {
            r5 = this;
            r0 = r5
            r1 = r5
            org.objectweb.asm.Type[] r1 = r1.argumentTypes
            r2 = r6
            r1 = r1[r2]
            r2 = r5
            r3 = r6
            int r2 = r2.getArgIndex(r3)
            r0.storeInsn(r1, r2)
            return
    }

    public org.objectweb.asm.Type getLocalType(int r5) {
            r4 = this;
            r0 = r4
            java.util.List<org.objectweb.asm.Type> r0 = r0.localTypes
            r1 = r5
            r2 = r4
            int r2 = r2.firstLocal
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            return r0
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter
    protected void setLocalType(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.firstLocal
            int r0 = r0 - r1
            r7 = r0
        L7:
            r0 = r4
            java.util.List<org.objectweb.asm.Type> r0 = r0.localTypes
            int r0 = r0.size()
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            if (r0 >= r1) goto L24
            r0 = r4
            java.util.List<org.objectweb.asm.Type> r0 = r0.localTypes
            r1 = 0
            boolean r0 = r0.add(r1)
            goto L7
        L24:
            r0 = r4
            java.util.List<org.objectweb.asm.Type> r0 = r0.localTypes
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.set(r1, r2)
            return
    }

    public void loadLocal(int r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            org.objectweb.asm.Type r1 = r1.getLocalType(r2)
            r2 = r5
            r0.loadInsn(r1, r2)
            return
    }

    public void loadLocal(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.setLocalType(r1, r2)
            r0 = r4
            r1 = r6
            r2 = r5
            r0.loadInsn(r1, r2)
            return
    }

    public void storeLocal(int r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            org.objectweb.asm.Type r1 = r1.getLocalType(r2)
            r2 = r5
            r0.storeInsn(r1, r2)
            return
    }

    public void storeLocal(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.setLocalType(r1, r2)
            r0 = r4
            r1 = r6
            r2 = r5
            r0.storeInsn(r1, r2)
            return
    }

    public void arrayLoad(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 46
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void arrayStore(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 79
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void pop() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 87
            r0.visitInsn(r1)
            return
    }

    public void pop2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 88
            r0.visitInsn(r1)
            return
    }

    public void dup() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 89
            r0.visitInsn(r1)
            return
    }

    public void dup2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 92
            r0.visitInsn(r1)
            return
    }

    public void dupX1() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 90
            r0.visitInsn(r1)
            return
    }

    public void dupX2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 91
            r0.visitInsn(r1)
            return
    }

    public void dup2X1() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 93
            r0.visitInsn(r1)
            return
    }

    public void dup2X2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 94
            r0.visitInsn(r1)
            return
    }

    public void swap() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 95
            r0.visitInsn(r1)
            return
    }

    public void swap(org.objectweb.asm.Type r4, org.objectweb.asm.Type r5) {
            r3 = this;
            r0 = r5
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L22
            r0 = r4
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L17
            r0 = r3
            r0.swap()
            goto L3d
        L17:
            r0 = r3
            r0.dupX2()
            r0 = r3
            r0.pop()
            goto L3d
        L22:
            r0 = r4
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L35
            r0 = r3
            r0.dup2X1()
            r0 = r3
            r0.pop2()
            goto L3d
        L35:
            r0 = r3
            r0.dup2X2()
            r0 = r3
            r0.pop2()
        L3d:
            return
    }

    public void math(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = r5
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void not() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 4
            r0.visitInsn(r1)
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 130(0x82, float:1.82E-43)
            r0.visitInsn(r1)
            return
    }

    public void iinc(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitIincInsn(r1, r2)
            return
    }

    public void cast(org.objectweb.asm.Type r6, org.objectweb.asm.Type r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L56
            r0 = r6
            int r0 = r0.getSort()
            r1 = 1
            if (r0 < r1) goto L27
            r0 = r6
            int r0 = r0.getSort()
            r1 = 8
            if (r0 > r1) goto L27
            r0 = r7
            int r0 = r0.getSort()
            r1 = 1
            if (r0 < r1) goto L27
            r0 = r7
            int r0 = r0.getSort()
            r1 = 8
            if (r0 <= r1) goto L4d
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Cannot cast from "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " to "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L4d:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = r7
            org.objectweb.asm.commons.InstructionAdapter.cast(r0, r1, r2)
        L56:
            return
    }

    private static org.objectweb.asm.Type getBoxedType(org.objectweb.asm.Type r2) {
            r0 = r2
            int r0 = r0.getSort()
            switch(r0) {
                case 1: goto L38;
                case 2: goto L40;
                case 3: goto L34;
                case 4: goto L3c;
                case 5: goto L44;
                case 6: goto L48;
                case 7: goto L4c;
                case 8: goto L50;
                default: goto L54;
            }
        L34:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.BYTE_TYPE
            return r0
        L38:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.BOOLEAN_TYPE
            return r0
        L3c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.SHORT_TYPE
            return r0
        L40:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.CHARACTER_TYPE
            return r0
        L44:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.INTEGER_TYPE
            return r0
        L48:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.FLOAT_TYPE
            return r0
        L4c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.LONG_TYPE
            return r0
        L50:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.DOUBLE_TYPE
            return r0
        L54:
            r0 = r2
            return r0
    }

    public void box(org.objectweb.asm.Type r12) {
            r11 = this;
            r0 = r12
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L12
            r0 = r12
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L13
        L12:
            return
        L13:
            r0 = r12
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            if (r0 != r1) goto L25
            r0 = r11
            r1 = 0
            java.lang.String r1 = (java.lang.String) r1
            r0.push(r1)
            goto L68
        L25:
            r0 = r12
            org.objectweb.asm.Type r0 = getBoxedType(r0)
            r13 = r0
            r0 = r11
            r1 = r13
            r0.newInstance(r1)
            r0 = r12
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L46
            r0 = r11
            r0.dupX2()
            r0 = r11
            r0.dupX2()
            r0 = r11
            r0.pop()
            goto L4e
        L46:
            r0 = r11
            r0.dupX1()
            r0 = r11
            r0.swap()
        L4e:
            r0 = r11
            r1 = r13
            org.objectweb.asm.commons.Method r2 = new org.objectweb.asm.commons.Method
            r3 = r2
            java.lang.String r4 = "<init>"
            org.objectweb.asm.Type r5 = org.objectweb.asm.Type.VOID_TYPE
            r6 = 1
            org.objectweb.asm.Type[] r6 = new org.objectweb.asm.Type[r6]
            r7 = r6
            r8 = 0
            r9 = r12
            r7[r8] = r9
            r3.<init>(r4, r5, r6)
            r0.invokeConstructor(r1, r2)
        L68:
            return
    }

    public void valueOf(org.objectweb.asm.Type r12) {
            r11 = this;
            r0 = r12
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L12
            r0 = r12
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L13
        L12:
            return
        L13:
            r0 = r12
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            if (r0 != r1) goto L25
            r0 = r11
            r1 = 0
            java.lang.String r1 = (java.lang.String) r1
            r0.push(r1)
            goto L42
        L25:
            r0 = r12
            org.objectweb.asm.Type r0 = getBoxedType(r0)
            r13 = r0
            r0 = r11
            r1 = r13
            org.objectweb.asm.commons.Method r2 = new org.objectweb.asm.commons.Method
            r3 = r2
            java.lang.String r4 = "valueOf"
            r5 = r13
            r6 = 1
            org.objectweb.asm.Type[] r6 = new org.objectweb.asm.Type[r6]
            r7 = r6
            r8 = 0
            r9 = r12
            r7[r8] = r9
            r3.<init>(r4, r5, r6)
            r0.invokeStatic(r1, r2)
        L42:
            return
    }

    public void unbox(org.objectweb.asm.Type r5) {
            r4 = this;
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.NUMBER_TYPE
            r6 = r0
            r0 = r5
            int r0 = r0.getSort()
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L48;
                case 2: goto L3d;
                case 3: goto L68;
                case 4: goto L68;
                case 5: goto L68;
                case 6: goto L5a;
                case 7: goto L61;
                case 8: goto L53;
                default: goto L6f;
            }
        L3c:
            return
        L3d:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.CHARACTER_TYPE
            r6 = r0
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.GeneratorAdapter.CHAR_VALUE
            r7 = r0
            goto L71
        L48:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.GeneratorAdapter.BOOLEAN_TYPE
            r6 = r0
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.GeneratorAdapter.BOOLEAN_VALUE
            r7 = r0
            goto L71
        L53:
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.GeneratorAdapter.DOUBLE_VALUE
            r7 = r0
            goto L71
        L5a:
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.GeneratorAdapter.FLOAT_VALUE
            r7 = r0
            goto L71
        L61:
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.GeneratorAdapter.LONG_VALUE
            r7 = r0
            goto L71
        L68:
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.GeneratorAdapter.INT_VALUE
            r7 = r0
            goto L71
        L6f:
            r0 = 0
            r7 = r0
        L71:
            r0 = r7
            if (r0 != 0) goto L7d
            r0 = r4
            r1 = r5
            r0.checkCast(r1)
            goto L88
        L7d:
            r0 = r4
            r1 = r6
            r0.checkCast(r1)
            r0 = r4
            r1 = r6
            r2 = r7
            r0.invokeVirtual(r1, r2)
        L88:
            return
    }

    public org.objectweb.asm.Label newLabel() {
            r3 = this;
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            return r0
    }

    public void mark(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLabel(r1)
            return
    }

    public org.objectweb.asm.Label mark() {
            r3 = this;
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLabel(r1)
            r0 = r4
            return r0
    }

    public void ifCmp(org.objectweb.asm.Type r6, int r7, org.objectweb.asm.Label r8) {
            r5 = this;
            r0 = r6
            int r0 = r0.getSort()
            switch(r0) {
                case 6: goto L56;
                case 7: goto L28;
                case 8: goto L35;
                case 9: goto L77;
                case 10: goto L77;
                default: goto Lb9;
            }
        L28:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 148(0x94, float:2.07E-43)
            r0.visitInsn(r1)
            goto L13b
        L35:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = 156(0x9c, float:2.19E-43)
            if (r1 == r2) goto L47
            r1 = r7
            r2 = 157(0x9d, float:2.2E-43)
            if (r1 != r2) goto L4d
        L47:
            r1 = 151(0x97, float:2.12E-43)
            goto L50
        L4d:
            r1 = 152(0x98, float:2.13E-43)
        L50:
            r0.visitInsn(r1)
            goto L13b
        L56:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = 156(0x9c, float:2.19E-43)
            if (r1 == r2) goto L68
            r1 = r7
            r2 = 157(0x9d, float:2.2E-43)
            if (r1 != r2) goto L6e
        L68:
            r1 = 149(0x95, float:2.09E-43)
            goto L71
        L6e:
            r1 = 150(0x96, float:2.1E-43)
        L71:
            r0.visitInsn(r1)
            goto L13b
        L77:
            r0 = r7
            r1 = 153(0x99, float:2.14E-43)
            if (r0 != r1) goto L8a
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 165(0xa5, float:2.31E-43)
            r2 = r8
            r0.visitJumpInsn(r1, r2)
            return
        L8a:
            r0 = r7
            r1 = 154(0x9a, float:2.16E-43)
            if (r0 != r1) goto L9d
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 166(0xa6, float:2.33E-43)
            r2 = r8
            r0.visitJumpInsn(r1, r2)
            return
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Bad comparison for type "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lb9:
            r0 = -1
            r9 = r0
            r0 = r7
            switch(r0) {
                case 153: goto Le4;
                case 154: goto Lec;
                case 155: goto Lfc;
                case 156: goto Lf4;
                case 157: goto L10c;
                case 158: goto L104;
                default: goto L114;
            }
        Le4:
            r0 = 159(0x9f, float:2.23E-43)
            r9 = r0
            goto L130
        Lec:
            r0 = 160(0xa0, float:2.24E-43)
            r9 = r0
            goto L130
        Lf4:
            r0 = 162(0xa2, float:2.27E-43)
            r9 = r0
            goto L130
        Lfc:
            r0 = 161(0xa1, float:2.26E-43)
            r9 = r0
            goto L130
        L104:
            r0 = 164(0xa4, float:2.3E-43)
            r9 = r0
            goto L130
        L10c:
            r0 = 163(0xa3, float:2.28E-43)
            r9 = r0
            goto L130
        L114:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Bad comparison mode "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L130:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r9
            r2 = r8
            r0.visitJumpInsn(r1, r2)
            return
        L13b:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifICmp(int r6, org.objectweb.asm.Label r7) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r2 = r6
            r3 = r7
            r0.ifCmp(r1, r2, r3)
            return
    }

    public void ifZCmp(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifNull(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 198(0xc6, float:2.77E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifNonNull(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 199(0xc7, float:2.79E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void goTo(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 167(0xa7, float:2.34E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ret(int r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 169(0xa9, float:2.37E-43)
            r2 = r5
            r0.visitVarInsn(r1, r2)
            return
    }

    public void tableSwitch(int[] r7, org.objectweb.asm.commons.TableSwitchGenerator r8) {
            r6 = this;
            r0 = r7
            int r0 = r0.length
            if (r0 != 0) goto La
            r0 = 0
            r9 = r0
            goto L1c
        La:
            r0 = r7
            int r0 = r0.length
            float r0 = (float) r0
            r1 = r7
            r2 = r7
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r2 = r7
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            float r1 = (float) r1
            float r0 = r0 / r1
            r9 = r0
        L1c:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r0.tableSwitch(r1, r2, r3)
            return
    }

    public void tableSwitch(int[] r7, org.objectweb.asm.commons.TableSwitchGenerator r8, boolean r9) {
            r6 = this;
            r0 = 1
            r10 = r0
        L3:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L28
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r1 = r7
            r2 = r10
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            if (r0 >= r1) goto L22
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "keys must be sorted in ascending order"
            r1.<init>(r2)
            throw r0
        L22:
            int r10 = r10 + 1
            goto L3
        L28:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.newLabel()
            r10 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.newLabel()
            r11 = r0
            r0 = r7
            int r0 = r0.length
            if (r0 <= 0) goto L117
            r0 = r7
            int r0 = r0.length
            r12 = r0
            r0 = r9
            if (r0 == 0) goto Lc6
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            r13 = r0
            r0 = r7
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            r1 = r13
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r15 = r0
            r0 = r15
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r16 = r0
            r0 = r16
            r1 = r10
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r17 = r0
        L68:
            r0 = r17
            r1 = r12
            if (r0 >= r1) goto L83
            r0 = r16
            r1 = r7
            r2 = r17
            r1 = r1[r2]
            r2 = r13
            int r1 = r1 - r2
            r2 = r6
            org.objectweb.asm.Label r2 = r2.newLabel()
            r0[r1] = r2
            int r17 = r17 + 1
            goto L68
        L83:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = r16
            r0.visitTableSwitchInsn(r1, r2, r3, r4)
            r0 = 0
            r17 = r0
        L95:
            r0 = r17
            r1 = r15
            if (r0 >= r1) goto Lc3
            r0 = r16
            r1 = r17
            r0 = r0[r1]
            r18 = r0
            r0 = r18
            r1 = r10
            if (r0 == r1) goto Lbd
            r0 = r6
            r1 = r18
            r0.mark(r1)
            r0 = r8
            r1 = r17
            r2 = r13
            int r1 = r1 + r2
            r2 = r11
            r0.generateCase(r1, r2)
        Lbd:
            int r17 = r17 + 1
            goto L95
        Lc3:
            goto L117
        Lc6:
            r0 = r12
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r13 = r0
            r0 = 0
            r14 = r0
        Ld0:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto Le6
            r0 = r13
            r1 = r14
            r2 = r6
            org.objectweb.asm.Label r2 = r2.newLabel()
            r0[r1] = r2
            int r14 = r14 + 1
            goto Ld0
        Le6:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r10
            r2 = r7
            r3 = r13
            r0.visitLookupSwitchInsn(r1, r2, r3)
            r0 = 0
            r14 = r0
        Lf5:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L117
            r0 = r6
            r1 = r13
            r2 = r14
            r1 = r1[r2]
            r0.mark(r1)
            r0 = r8
            r1 = r7
            r2 = r14
            r1 = r1[r2]
            r2 = r11
            r0.generateCase(r1, r2)
            int r14 = r14 + 1
            goto Lf5
        L117:
            r0 = r6
            r1 = r10
            r0.mark(r1)
            r0 = r8
            r0.generateDefault()
            r0 = r6
            r1 = r11
            r0.mark(r1)
            return
    }

    public void returnValue() {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            org.objectweb.asm.Type r1 = r1.returnType
            r2 = 172(0xac, float:2.41E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    private void fieldInsn(int r7, org.objectweb.asm.Type r8, java.lang.String r9, org.objectweb.asm.Type r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            java.lang.String r2 = r2.getInternalName()
            r3 = r9
            r4 = r10
            java.lang.String r4 = r4.getDescriptor()
            r0.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    public void getStatic(org.objectweb.asm.Type r7, java.lang.String r8, org.objectweb.asm.Type r9) {
            r6 = this;
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.fieldInsn(r1, r2, r3, r4)
            return
    }

    public void putStatic(org.objectweb.asm.Type r7, java.lang.String r8, org.objectweb.asm.Type r9) {
            r6 = this;
            r0 = r6
            r1 = 179(0xb3, float:2.51E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.fieldInsn(r1, r2, r3, r4)
            return
    }

    public void getField(org.objectweb.asm.Type r7, java.lang.String r8, org.objectweb.asm.Type r9) {
            r6 = this;
            r0 = r6
            r1 = 180(0xb4, float:2.52E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.fieldInsn(r1, r2, r3, r4)
            return
    }

    public void putField(org.objectweb.asm.Type r7, java.lang.String r8, org.objectweb.asm.Type r9) {
            r6 = this;
            r0 = r6
            r1 = 181(0xb5, float:2.54E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.fieldInsn(r1, r2, r3, r4)
            return
    }

    private void invokeInsn(int r8, org.objectweb.asm.Type r9, org.objectweb.asm.commons.Method r10, boolean r11) {
            r7 = this;
            r0 = r9
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L10
            r0 = r9
            java.lang.String r0 = r0.getDescriptor()
            goto L14
        L10:
            r0 = r9
            java.lang.String r0 = r0.getInternalName()
        L14:
            r12 = r0
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r8
            r2 = r12
            r3 = r10
            java.lang.String r3 = r3.getName()
            r4 = r10
            java.lang.String r4 = r4.getDescriptor()
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void invokeVirtual(org.objectweb.asm.Type r7, org.objectweb.asm.commons.Method r8) {
            r6 = this;
            r0 = r6
            r1 = 182(0xb6, float:2.55E-43)
            r2 = r7
            r3 = r8
            r4 = 0
            r0.invokeInsn(r1, r2, r3, r4)
            return
    }

    public void invokeConstructor(org.objectweb.asm.Type r7, org.objectweb.asm.commons.Method r8) {
            r6 = this;
            r0 = r6
            r1 = 183(0xb7, float:2.56E-43)
            r2 = r7
            r3 = r8
            r4 = 0
            r0.invokeInsn(r1, r2, r3, r4)
            return
    }

    public void invokeStatic(org.objectweb.asm.Type r7, org.objectweb.asm.commons.Method r8) {
            r6 = this;
            r0 = r6
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r7
            r3 = r8
            r4 = 0
            r0.invokeInsn(r1, r2, r3, r4)
            return
    }

    public void invokeInterface(org.objectweb.asm.Type r7, org.objectweb.asm.commons.Method r8) {
            r6 = this;
            r0 = r6
            r1 = 185(0xb9, float:2.59E-43)
            r2 = r7
            r3 = r8
            r4 = 1
            r0.invokeInsn(r1, r2, r3, r4)
            return
    }

    public void invokeDynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    private void typeInsn(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            java.lang.String r2 = r2.getInternalName()
            r0.visitTypeInsn(r1, r2)
            return
    }

    public void newInstance(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            r1 = 187(0xbb, float:2.62E-43)
            r2 = r5
            r0.typeInsn(r1, r2)
            return
    }

    public void newArray(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            org.objectweb.asm.commons.InstructionAdapter.newarray(r0, r1)
            return
    }

    public void arrayLength() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 190(0xbe, float:2.66E-43)
            r0.visitInsn(r1)
            return
    }

    public void throwException() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 191(0xbf, float:2.68E-43)
            r0.visitInsn(r1)
            return
    }

    public void throwException(org.objectweb.asm.Type r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.newInstance(r1)
            r0 = r4
            r0.dup()
            r0 = r4
            r1 = r6
            r0.push(r1)
            r0 = r4
            r1 = r5
            java.lang.String r2 = "void <init> (String)"
            org.objectweb.asm.commons.Method r2 = org.objectweb.asm.commons.Method.getMethod(r2)
            r0.invokeConstructor(r1, r2)
            r0 = r4
            r0.throwException()
            return
    }

    public void checkCast(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.commons.GeneratorAdapter.OBJECT_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            r0 = r4
            r1 = 192(0xc0, float:2.69E-43)
            r2 = r5
            r0.typeInsn(r1, r2)
        L12:
            return
    }

    public void instanceOf(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            r1 = 193(0xc1, float:2.7E-43)
            r2 = r5
            r0.typeInsn(r1, r2)
            return
    }

    public void monitorEnter() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 194(0xc2, float:2.72E-43)
            r0.visitInsn(r1)
            return
    }

    public void monitorExit() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 195(0xc3, float:2.73E-43)
            r0.visitInsn(r1)
            return
    }

    public void endMethod() {
            r4 = this;
            r0 = r4
            int r0 = r0.access
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L14
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 0
            r2 = 0
            r0.visitMaxs(r1, r2)
        L14:
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r0.visitEnd()
            return
    }

    public void catchException(org.objectweb.asm.Label r7, org.objectweb.asm.Label r8, org.objectweb.asm.Type r9) {
            r6 = this;
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L1c
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = 0
            r0.visitTryCatchBlock(r1, r2, r3, r4)
            goto L2b
        L1c:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r9
            java.lang.String r4 = r4.getInternalName()
            r0.visitTryCatchBlock(r1, r2, r3, r4)
        L2b:
            r0 = r6
            r1 = r10
            r0.mark(r1)
            return
    }

    static {
            java.lang.String r0 = "java/lang/Byte"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.BYTE_TYPE = r0
            java.lang.String r0 = "java/lang/Boolean"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.BOOLEAN_TYPE = r0
            java.lang.String r0 = "java/lang/Short"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.SHORT_TYPE = r0
            java.lang.String r0 = "java/lang/Character"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.CHARACTER_TYPE = r0
            java.lang.String r0 = "java/lang/Integer"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.INTEGER_TYPE = r0
            java.lang.String r0 = "java/lang/Float"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.FLOAT_TYPE = r0
            java.lang.String r0 = "java/lang/Long"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.LONG_TYPE = r0
            java.lang.String r0 = "java/lang/Double"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.DOUBLE_TYPE = r0
            java.lang.String r0 = "java/lang/Number"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.NUMBER_TYPE = r0
            java.lang.String r0 = "java/lang/Object"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.GeneratorAdapter.OBJECT_TYPE = r0
            java.lang.String r0 = "boolean booleanValue()"
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.Method.getMethod(r0)
            org.objectweb.asm.commons.GeneratorAdapter.BOOLEAN_VALUE = r0
            java.lang.String r0 = "char charValue()"
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.Method.getMethod(r0)
            org.objectweb.asm.commons.GeneratorAdapter.CHAR_VALUE = r0
            java.lang.String r0 = "int intValue()"
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.Method.getMethod(r0)
            org.objectweb.asm.commons.GeneratorAdapter.INT_VALUE = r0
            java.lang.String r0 = "float floatValue()"
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.Method.getMethod(r0)
            org.objectweb.asm.commons.GeneratorAdapter.FLOAT_VALUE = r0
            java.lang.String r0 = "long longValue()"
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.Method.getMethod(r0)
            org.objectweb.asm.commons.GeneratorAdapter.LONG_VALUE = r0
            java.lang.String r0 = "double doubleValue()"
            org.objectweb.asm.commons.Method r0 = org.objectweb.asm.commons.Method.getMethod(r0)
            org.objectweb.asm.commons.GeneratorAdapter.DOUBLE_VALUE = r0
            return
    }
}
