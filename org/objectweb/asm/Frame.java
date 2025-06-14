package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Frame.SCL.lombok */
class Frame {
    static final int SAME_FRAME = 0;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int RESERVED = 128;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    static final int CHOP_FRAME = 248;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int APPEND_FRAME = 252;
    static final int FULL_FRAME = 255;
    static final int ITEM_TOP = 0;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_UNINITIALIZED = 8;
    private static final int ITEM_ASM_BOOLEAN = 9;
    private static final int ITEM_ASM_BYTE = 10;
    private static final int ITEM_ASM_CHAR = 11;
    private static final int ITEM_ASM_SHORT = 12;
    private static final int DIM_SIZE = 6;
    private static final int KIND_SIZE = 4;
    private static final int FLAGS_SIZE = 2;
    private static final int VALUE_SIZE = 20;
    private static final int DIM_SHIFT = 26;
    private static final int KIND_SHIFT = 22;
    private static final int FLAGS_SHIFT = 20;
    private static final int DIM_MASK = -67108864;
    private static final int KIND_MASK = 62914560;
    private static final int VALUE_MASK = 1048575;
    private static final int ARRAY_OF = 67108864;
    private static final int ELEMENT_OF = -67108864;
    private static final int CONSTANT_KIND = 4194304;
    private static final int REFERENCE_KIND = 8388608;
    private static final int UNINITIALIZED_KIND = 12582912;
    private static final int LOCAL_KIND = 16777216;
    private static final int STACK_KIND = 20971520;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int TOP = 4194304;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    private static final int SHORT = 4194316;
    private static final int INTEGER = 4194305;
    private static final int FLOAT = 4194306;
    private static final int LONG = 4194308;
    private static final int DOUBLE = 4194307;
    private static final int NULL = 4194309;
    private static final int UNINITIALIZED_THIS = 4194310;
    org.objectweb.asm.Label owner;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    private int initializationCount;
    private int[] initializations;

    Frame(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.owner = r1
            return
    }

    final void copyFrom(org.objectweb.asm.Frame r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int[] r1 = r1.inputLocals
            r0.inputLocals = r1
            r0 = r3
            r1 = r4
            int[] r1 = r1.inputStack
            r0.inputStack = r1
            r0 = r3
            r1 = 0
            r0.outputStackStart = r1
            r0 = r3
            r1 = r4
            int[] r1 = r1.outputLocals
            r0.outputLocals = r1
            r0 = r3
            r1 = r4
            int[] r1 = r1.outputStack
            r0.outputStack = r1
            r0 = r3
            r1 = r4
            short r1 = r1.outputStackTop
            r0.outputStackTop = r1
            r0 = r3
            r1 = r4
            int r1 = r1.initializationCount
            r0.initializationCount = r1
            r0 = r3
            r1 = r4
            int[] r1 = r1.initializations
            r0.initializations = r1
            return
    }

    static int getAbstractTypeFromApiFormat(org.objectweb.asm.SymbolTable r5, java.lang.Object r6) {
            r0 = r6
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L12
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r6
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0 = r0 | r1
            return r0
        L12:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L2b
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            java.lang.String r0 = r0.getDescriptor()
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = 0
            int r0 = getAbstractTypeFromDescriptor(r0, r1, r2)
            return r0
        L2b:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r5
            java.lang.String r2 = ""
            r3 = r6
            org.objectweb.asm.Label r3 = (org.objectweb.asm.Label) r3
            int r3 = r3.bytecodeOffset
            int r1 = r1.addUninitializedType(r2, r3)
            r0 = r0 | r1
            return r0
    }

    static int getAbstractTypeFromInternalName(org.objectweb.asm.SymbolTable r4, java.lang.String r5) {
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r4
            r2 = r5
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            return r0
    }

    private static int getAbstractTypeFromDescriptor(org.objectweb.asm.SymbolTable r5, java.lang.String r6, int r7) {
            r0 = r6
            r1 = r7
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L7e;
                case 67: goto L7e;
                case 68: goto L87;
                case 69: goto L197;
                case 70: goto L81;
                case 71: goto L197;
                case 72: goto L197;
                case 73: goto L7e;
                case 74: goto L84;
                case 75: goto L197;
                case 76: goto L8a;
                case 77: goto L197;
                case 78: goto L197;
                case 79: goto L197;
                case 80: goto L197;
                case 81: goto L197;
                case 82: goto L197;
                case 83: goto L7e;
                case 84: goto L197;
                case 85: goto L197;
                case 86: goto L7c;
                case 87: goto L197;
                case 88: goto L197;
                case 89: goto L197;
                case 90: goto L7e;
                case 91: goto La1;
                default: goto L197;
            }
        L7c:
            r0 = 0
            return r0
        L7e:
            r0 = 4194305(0x400001, float:5.877473E-39)
            return r0
        L81:
            r0 = 4194306(0x400002, float:5.877475E-39)
            return r0
        L84:
            r0 = 4194308(0x400004, float:5.877477E-39)
            return r0
        L87:
            r0 = 4194307(0x400003, float:5.877476E-39)
            return r0
        L8a:
            r0 = r6
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r8 = r0
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r5
            r2 = r8
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            return r0
        La1:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        La6:
            r0 = r6
            r1 = r9
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto Lb7
            int r9 = r9 + 1
            goto La6
        Lb7:
            r0 = r6
            r1 = r9
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L13e;
                case 67: goto L137;
                case 68: goto L161;
                case 69: goto L184;
                case 70: goto L153;
                case 71: goto L184;
                case 72: goto L184;
                case 73: goto L14c;
                case 74: goto L15a;
                case 75: goto L184;
                case 76: goto L168;
                case 77: goto L184;
                case 78: goto L184;
                case 79: goto L184;
                case 80: goto L184;
                case 81: goto L184;
                case 82: goto L184;
                case 83: goto L145;
                case 84: goto L184;
                case 85: goto L184;
                case 86: goto L184;
                case 87: goto L184;
                case 88: goto L184;
                case 89: goto L184;
                case 90: goto L130;
                default: goto L184;
            }
        L130:
            r0 = 4194313(0x400009, float:5.877484E-39)
            r10 = r0
            goto L18c
        L137:
            r0 = 4194315(0x40000b, float:5.877487E-39)
            r10 = r0
            goto L18c
        L13e:
            r0 = 4194314(0x40000a, float:5.877486E-39)
            r10 = r0
            goto L18c
        L145:
            r0 = 4194316(0x40000c, float:5.877489E-39)
            r10 = r0
            goto L18c
        L14c:
            r0 = 4194305(0x400001, float:5.877473E-39)
            r10 = r0
            goto L18c
        L153:
            r0 = 4194306(0x400002, float:5.877475E-39)
            r10 = r0
            goto L18c
        L15a:
            r0 = 4194308(0x400004, float:5.877477E-39)
            r10 = r0
            goto L18c
        L161:
            r0 = 4194307(0x400003, float:5.877476E-39)
            r10 = r0
            goto L18c
        L168:
            r0 = r6
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r8 = r0
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r5
            r2 = r8
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            r10 = r0
            goto L18c
        L184:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L18c:
            r0 = r9
            r1 = r7
            int r0 = r0 - r1
            r1 = 26
            int r0 = r0 << r1
            r1 = r10
            r0 = r0 | r1
            return r0
        L197:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
    }

    final void setInputFrameFromDescriptor(org.objectweb.asm.SymbolTable r7, int r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r10
            int[] r1 = new int[r1]
            r0.inputLocals = r1
            r0 = r6
            r1 = 0
            int[] r1 = new int[r1]
            r0.inputStack = r1
            r0 = 0
            r11 = r0
            r0 = r8
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L44
            r0 = r8
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L38
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r11
            int r11 = r11 + 1
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r7
            r4 = r7
            java.lang.String r4 = r4.getClassName()
            int r3 = r3.addType(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L44
        L38:
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r11
            int r11 = r11 + 1
            r2 = 4194310(0x400006, float:5.87748E-39)
            r0[r1] = r2
        L44:
            r0 = r9
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r12 = r0
            r0 = r12
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
        L52:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L98
            r0 = r12
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r7
            r1 = r15
            java.lang.String r1 = r1.getDescriptor()
            r2 = 0
            int r0 = getAbstractTypeFromDescriptor(r0, r1, r2)
            r16 = r0
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r11
            int r11 = r11 + 1
            r2 = r16
            r0[r1] = r2
            r0 = r16
            r1 = 4194308(0x400004, float:5.877477E-39)
            if (r0 == r1) goto L86
            r0 = r16
            r1 = 4194307(0x400003, float:5.877476E-39)
            if (r0 != r1) goto L92
        L86:
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r11
            int r11 = r11 + 1
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0[r1] = r2
        L92:
            int r14 = r14 + 1
            goto L52
        L98:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto Lae
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r11
            int r11 = r11 + 1
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0[r1] = r2
            goto L98
        Lae:
            return
    }

    final void setInputFrameFromApiFormat(org.objectweb.asm.SymbolTable r7, int r8, java.lang.Object[] r9, int r10, java.lang.Object[] r11) {
            r6 = this;
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
        L6:
            r0 = r13
            r1 = r8
            if (r0 >= r1) goto L44
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r12
            int r12 = r12 + 1
            r2 = r7
            r3 = r9
            r4 = r13
            r3 = r3[r4]
            int r2 = getAbstractTypeFromApiFormat(r2, r3)
            r0[r1] = r2
            r0 = r9
            r1 = r13
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto L32
            r0 = r9
            r1 = r13
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L3e
        L32:
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r12
            int r12 = r12 + 1
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0[r1] = r2
        L3e:
            int r13 = r13 + 1
            goto L6
        L44:
            r0 = r12
            r1 = r6
            int[] r1 = r1.inputLocals
            int r1 = r1.length
            if (r0 >= r1) goto L5d
            r0 = r6
            int[] r0 = r0.inputLocals
            r1 = r12
            int r12 = r12 + 1
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0[r1] = r2
            goto L44
        L5d:
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
        L63:
            r0 = r14
            r1 = r10
            if (r0 >= r1) goto L89
            r0 = r11
            r1 = r14
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto L80
            r0 = r11
            r1 = r14
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L83
        L80:
            int r13 = r13 + 1
        L83:
            int r14 = r14 + 1
            goto L63
        L89:
            r0 = r6
            r1 = r10
            r2 = r13
            int r1 = r1 + r2
            int[] r1 = new int[r1]
            r0.inputStack = r1
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
        L9a:
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto Ldc
            r0 = r6
            int[] r0 = r0.inputStack
            r1 = r14
            int r14 = r14 + 1
            r2 = r7
            r3 = r11
            r4 = r15
            r3 = r3[r4]
            int r2 = getAbstractTypeFromApiFormat(r2, r3)
            r0[r1] = r2
            r0 = r11
            r1 = r15
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto Lca
            r0 = r11
            r1 = r15
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto Ld6
        Lca:
            r0 = r6
            int[] r0 = r0.inputStack
            r1 = r14
            int r14 = r14 + 1
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0[r1] = r2
        Ld6:
            int r15 = r15 + 1
            goto L9a
        Ldc:
            r0 = r6
            r1 = 0
            r0.outputStackTop = r1
            r0 = r6
            r1 = 0
            r0.initializationCount = r1
            return
    }

    final int getInputStackSize() {
            r2 = this;
            r0 = r2
            int[] r0 = r0.inputStack
            int r0 = r0.length
            return r0
    }

    private int getLocal(int r6) {
            r5 = this;
            r0 = r5
            int[] r0 = r0.outputLocals
            if (r0 == 0) goto L10
            r0 = r6
            r1 = r5
            int[] r1 = r1.outputLocals
            int r1 = r1.length
            if (r0 < r1) goto L15
        L10:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r6
            r0 = r0 | r1
            return r0
        L15:
            r0 = r5
            int[] r0 = r0.outputLocals
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2c
            r0 = r5
            int[] r0 = r0.outputLocals
            r1 = r6
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r6
            r2 = r2 | r3
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            r7 = r0
        L2c:
            r0 = r7
            return r0
    }

    private void setLocal(int r7, int r8) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.outputLocals
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 10
            int[] r1 = new int[r1]
            r0.outputLocals = r1
        Lf:
            r0 = r6
            int[] r0 = r0.outputLocals
            int r0 = r0.length
            r9 = r0
            r0 = r7
            r1 = r9
            if (r0 < r1) goto L39
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r9
            int r1 = r1 * r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r10 = r0
            r0 = r6
            int[] r0 = r0.outputLocals
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.outputLocals = r1
        L39:
            r0 = r6
            int[] r0 = r0.outputLocals
            r1 = r7
            r2 = r8
            r0[r1] = r2
            return
    }

    private void push(int r7) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.outputStack
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 10
            int[] r1 = new int[r1]
            r0.outputStack = r1
        Lf:
            r0 = r6
            int[] r0 = r0.outputStack
            int r0 = r0.length
            r8 = r0
            r0 = r6
            short r0 = r0.outputStackTop
            r1 = r8
            if (r0 < r1) goto L3c
            r0 = r6
            short r0 = r0.outputStackTop
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r8
            int r1 = r1 * r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r9 = r0
            r0 = r6
            int[] r0 = r0.outputStack
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.outputStack = r1
        L3c:
            r0 = r6
            int[] r0 = r0.outputStack
            r1 = r6
            r2 = r1
            short r2 = r2.outputStackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            short r3 = (short) r3
            r2.outputStackTop = r3
            r2 = r7
            r0[r1] = r2
            r0 = r6
            short r0 = r0.outputStackStart
            r1 = r6
            short r1 = r1.outputStackTop
            int r0 = r0 + r1
            short r0 = (short) r0
            r9 = r0
            r0 = r9
            r1 = r6
            org.objectweb.asm.Label r1 = r1.owner
            short r1 = r1.outputStackMax
            if (r0 <= r1) goto L6c
            r0 = r6
            org.objectweb.asm.Label r0 = r0.owner
            r1 = r9
            r0.outputStackMax = r1
        L6c:
            return
    }

    private void push(org.objectweb.asm.SymbolTable r5, java.lang.String r6) {
            r4 = this;
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 != r1) goto L11
            r0 = r6
            int r0 = org.objectweb.asm.Type.getReturnTypeOffset(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = getAbstractTypeFromDescriptor(r0, r1, r2)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3a
            r0 = r4
            r1 = r8
            r0.push(r1)
            r0 = r8
            r1 = 4194308(0x400004, float:5.877477E-39)
            if (r0 == r1) goto L34
            r0 = r8
            r1 = 4194307(0x400003, float:5.877476E-39)
            if (r0 != r1) goto L3a
        L34:
            r0 = r4
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
        L3a:
            return
    }

    private int pop() {
            r5 = this;
            r0 = r5
            short r0 = r0.outputStackTop
            if (r0 <= 0) goto L19
            r0 = r5
            int[] r0 = r0.outputStack
            r1 = r5
            r2 = r1
            short r2 = r2.outputStackTop
            r3 = 1
            int r2 = r2 - r3
            short r2 = (short) r2
            r3 = r2; r2 = r1; r1 = r3; 
            r2.outputStackTop = r3
            r0 = r0[r1]
            return r0
        L19:
            r0 = 20971520(0x1400000, float:3.526483E-38)
            r1 = r5
            r2 = r1
            short r2 = r2.outputStackStart
            r3 = 1
            int r2 = r2 - r3
            short r2 = (short) r2
            r3 = r2; r2 = r1; r1 = r3; 
            r2.outputStackStart = r3
            int r1 = -r1
            r0 = r0 | r1
            return r0
    }

    private void pop(int r6) {
            r5 = this;
            r0 = r5
            short r0 = r0.outputStackTop
            r1 = r6
            if (r0 < r1) goto L16
            r0 = r5
            r1 = r0
            short r1 = r1.outputStackTop
            r2 = r6
            int r1 = r1 - r2
            short r1 = (short) r1
            r0.outputStackTop = r1
            goto L2b
        L16:
            r0 = r5
            r1 = r0
            short r1 = r1.outputStackStart
            r2 = r6
            r3 = r5
            short r3 = r3.outputStackTop
            int r2 = r2 - r3
            int r1 = r1 - r2
            short r1 = (short) r1
            r0.outputStackStart = r1
            r0 = r5
            r1 = 0
            r0.outputStackTop = r1
        L2b:
            return
    }

    private void pop(java.lang.String r5) {
            r4 = this;
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r6 = r0
            r0 = r6
            r1 = 40
            if (r0 != r1) goto L1b
            r0 = r4
            r1 = r5
            int r1 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r1)
            r2 = 2
            int r1 = r1 >> r2
            r2 = 1
            int r1 = r1 - r2
            r0.pop(r1)
            goto L34
        L1b:
            r0 = r6
            r1 = 74
            if (r0 == r1) goto L27
            r0 = r6
            r1 = 68
            if (r0 != r1) goto L2f
        L27:
            r0 = r4
            r1 = 2
            r0.pop(r1)
            goto L34
        L2f:
            r0 = r4
            r1 = 1
            r0.pop(r1)
        L34:
            return
    }

    private void addInitializedType(int r7) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.initializations
            if (r0 != 0) goto Le
            r0 = r6
            r1 = 2
            int[] r1 = new int[r1]
            r0.initializations = r1
        Le:
            r0 = r6
            int[] r0 = r0.initializations
            int r0 = r0.length
            r8 = r0
            r0 = r6
            int r0 = r0.initializationCount
            r1 = r8
            if (r0 < r1) goto L3b
            r0 = r6
            int r0 = r0.initializationCount
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r8
            int r1 = r1 * r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r9 = r0
            r0 = r6
            int[] r0 = r0.initializations
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.initializations = r1
        L3b:
            r0 = r6
            int[] r0 = r0.initializations
            r1 = r6
            r2 = r1
            int r2 = r2.initializationCount
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.initializationCount = r3
            r2 = r7
            r0[r1] = r2
            return
    }

    private int getInitializedType(org.objectweb.asm.SymbolTable r7, int r8) {
            r6 = this;
            r0 = r8
            r1 = 4194310(0x400006, float:5.87748E-39)
            if (r0 == r1) goto L10
            r0 = r8
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r0 = r0 & r1
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 != r1) goto L97
        L10:
            r0 = 0
            r9 = r0
        L12:
            r0 = r9
            r1 = r6
            int r1 = r1.initializationCount
            if (r0 >= r1) goto L97
            r0 = r6
            int[] r0 = r0.initializations
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r11 = r0
            r0 = r10
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r12 = r0
            r0 = r10
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            r13 = r0
            r0 = r12
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L4d
            r0 = r11
            r1 = r6
            int[] r1 = r1.inputLocals
            r2 = r13
            r1 = r1[r2]
            int r0 = r0 + r1
            r10 = r0
            goto L66
        L4d:
            r0 = r12
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r0 != r1) goto L66
            r0 = r11
            r1 = r6
            int[] r1 = r1.inputStack
            r2 = r6
            int[] r2 = r2.inputStack
            int r2 = r2.length
            r3 = r13
            int r2 = r2 - r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r10 = r0
        L66:
            r0 = r8
            r1 = r10
            if (r0 != r1) goto L91
            r0 = r8
            r1 = 4194310(0x400006, float:5.87748E-39)
            if (r0 != r1) goto L7e
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r7
            r2 = r7
            java.lang.String r2 = r2.getClassName()
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            return r0
        L7e:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r7
            r2 = r7
            r3 = r8
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r4
            org.objectweb.asm.Symbol r2 = r2.getType(r3)
            java.lang.String r2 = r2.value
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            return r0
        L91:
            int r9 = r9 + 1
            goto L12
        L97:
            r0 = r8
            return r0
    }

    void execute(int r7, int r8, org.objectweb.asm.Symbol r9, org.objectweb.asm.SymbolTable r10) {
            r6 = this;
            r0 = r7
            switch(r0) {
                case 0: goto L330;
                case 1: goto L333;
                case 2: goto L33c;
                case 3: goto L33c;
                case 4: goto L33c;
                case 5: goto L33c;
                case 6: goto L33c;
                case 7: goto L33c;
                case 8: goto L33c;
                case 9: goto L345;
                case 10: goto L345;
                case 11: goto L354;
                case 12: goto L354;
                case 13: goto L354;
                case 14: goto L35d;
                case 15: goto L35d;
                case 16: goto L33c;
                case 17: goto L33c;
                case 18: goto L36c;
                case 19: goto L905;
                case 20: goto L905;
                case 21: goto L33c;
                case 22: goto L345;
                case 23: goto L354;
                case 24: goto L35d;
                case 25: goto L449;
                case 26: goto L905;
                case 27: goto L905;
                case 28: goto L905;
                case 29: goto L905;
                case 30: goto L905;
                case 31: goto L905;
                case 32: goto L905;
                case 33: goto L905;
                case 34: goto L905;
                case 35: goto L905;
                case 36: goto L905;
                case 37: goto L905;
                case 38: goto L905;
                case 39: goto L905;
                case 40: goto L905;
                case 41: goto L905;
                case 42: goto L905;
                case 43: goto L905;
                case 44: goto L905;
                case 45: goto L905;
                case 46: goto L693;
                case 47: goto L455;
                case 48: goto L6b5;
                case 49: goto L469;
                case 50: goto L47d;
                case 51: goto L693;
                case 52: goto L693;
                case 53: goto L693;
                case 54: goto L4a0;
                case 55: goto L4f7;
                case 56: goto L4a0;
                case 57: goto L4f7;
                case 58: goto L4a0;
                case 59: goto L905;
                case 60: goto L905;
                case 61: goto L905;
                case 62: goto L905;
                case 63: goto L905;
                case 64: goto L905;
                case 65: goto L905;
                case 66: goto L905;
                case 67: goto L905;
                case 68: goto L905;
                case 69: goto L905;
                case 70: goto L905;
                case 71: goto L905;
                case 72: goto L905;
                case 73: goto L905;
                case 74: goto L905;
                case 75: goto L905;
                case 76: goto L905;
                case 77: goto L905;
                case 78: goto L905;
                case 79: goto L55c;
                case 80: goto L564;
                case 81: goto L55c;
                case 82: goto L564;
                case 83: goto L55c;
                case 84: goto L55c;
                case 85: goto L55c;
                case 86: goto L55c;
                case 87: goto L56c;
                case 88: goto L574;
                case 89: goto L57c;
                case 90: goto L591;
                case 91: goto L5b2;
                case 92: goto L5df;
                case 93: goto L606;
                case 94: goto L639;
                case 95: goto L678;
                case 96: goto L693;
                case 97: goto L6a1;
                case 98: goto L6b5;
                case 99: goto L6c3;
                case 100: goto L693;
                case 101: goto L6a1;
                case 102: goto L6b5;
                case 103: goto L6c3;
                case 104: goto L693;
                case 105: goto L6a1;
                case 106: goto L6b5;
                case 107: goto L6c3;
                case 108: goto L693;
                case 109: goto L6a1;
                case 110: goto L6b5;
                case 111: goto L6c3;
                case 112: goto L693;
                case 113: goto L6a1;
                case 114: goto L6b5;
                case 115: goto L6c3;
                case 116: goto L330;
                case 117: goto L330;
                case 118: goto L330;
                case 119: goto L330;
                case 120: goto L693;
                case 121: goto L6d7;
                case 122: goto L693;
                case 123: goto L6d7;
                case 124: goto L693;
                case 125: goto L6d7;
                case 126: goto L693;
                case 127: goto L6a1;
                case 128: goto L693;
                case 129: goto L6a1;
                case 130: goto L693;
                case 131: goto L6a1;
                case 132: goto L6eb;
                case 133: goto L6f5;
                case 134: goto L709;
                case 135: goto L717;
                case 136: goto L693;
                case 137: goto L6b5;
                case 138: goto L469;
                case 139: goto L72b;
                case 140: goto L6f5;
                case 141: goto L717;
                case 142: goto L693;
                case 143: goto L455;
                case 144: goto L6b5;
                case 145: goto L330;
                case 146: goto L330;
                case 147: goto L330;
                case 148: goto L739;
                case 149: goto L693;
                case 150: goto L693;
                case 151: goto L739;
                case 152: goto L739;
                case 153: goto L56c;
                case 154: goto L56c;
                case 155: goto L56c;
                case 156: goto L56c;
                case 157: goto L56c;
                case 158: goto L56c;
                case 159: goto L574;
                case 160: goto L574;
                case 161: goto L574;
                case 162: goto L574;
                case 163: goto L574;
                case 164: goto L574;
                case 165: goto L574;
                case 166: goto L574;
                case 167: goto L330;
                case 168: goto L747;
                case 169: goto L747;
                case 170: goto L56c;
                case 171: goto L56c;
                case 172: goto L56c;
                case 173: goto L574;
                case 174: goto L56c;
                case 175: goto L574;
                case 176: goto L56c;
                case 177: goto L330;
                case 178: goto L752;
                case 179: goto L75f;
                case 180: goto L76a;
                case 181: goto L77c;
                case 182: goto L78c;
                case 183: goto L78c;
                case 184: goto L78c;
                case 185: goto L78c;
                case 186: goto L7c8;
                case 187: goto L7dd;
                case 188: goto L7f1;
                case 189: goto L87c;
                case 190: goto L72b;
                case 191: goto L56c;
                case 192: goto L8c1;
                case 193: goto L72b;
                case 194: goto L56c;
                case 195: goto L56c;
                case 196: goto L905;
                case 197: goto L8f3;
                case 198: goto L56c;
                case 199: goto L56c;
                default: goto L905;
            }
        L330:
            goto L90d
        L333:
            r0 = r6
            r1 = 4194309(0x400005, float:5.877479E-39)
            r0.push(r1)
            goto L90d
        L33c:
            r0 = r6
            r1 = 4194305(0x400001, float:5.877473E-39)
            r0.push(r1)
            goto L90d
        L345:
            r0 = r6
            r1 = 4194308(0x400004, float:5.877477E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L354:
            r0 = r6
            r1 = 4194306(0x400002, float:5.877475E-39)
            r0.push(r1)
            goto L90d
        L35d:
            r0 = r6
            r1 = 4194307(0x400003, float:5.877476E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L36c:
            r0 = r9
            int r0 = r0.tag
            switch(r0) {
                case 3: goto L3bc;
                case 4: goto L3d4;
                case 5: goto L3c5;
                case 6: goto L3dd;
                case 7: goto L3ec;
                case 8: goto L3fe;
                case 9: goto L441;
                case 10: goto L441;
                case 11: goto L441;
                case 12: goto L441;
                case 13: goto L441;
                case 14: goto L441;
                case 15: goto L422;
                case 16: goto L410;
                case 17: goto L434;
                default: goto L441;
            }
        L3bc:
            r0 = r6
            r1 = 4194305(0x400001, float:5.877473E-39)
            r0.push(r1)
            goto L90d
        L3c5:
            r0 = r6
            r1 = 4194308(0x400004, float:5.877477E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L3d4:
            r0 = r6
            r1 = 4194306(0x400002, float:5.877475E-39)
            r0.push(r1)
            goto L90d
        L3dd:
            r0 = r6
            r1 = 4194307(0x400003, float:5.877476E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L3ec:
            r0 = r6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r10
            java.lang.String r3 = "java/lang/Class"
            int r2 = r2.addType(r3)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L3fe:
            r0 = r6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r10
            java.lang.String r3 = "java/lang/String"
            int r2 = r2.addType(r3)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L410:
            r0 = r6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r10
            java.lang.String r3 = "java/lang/invoke/MethodType"
            int r2 = r2.addType(r3)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L422:
            r0 = r6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r10
            java.lang.String r3 = "java/lang/invoke/MethodHandle"
            int r2 = r2.addType(r3)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L434:
            r0 = r6
            r1 = r10
            r2 = r9
            java.lang.String r2 = r2.value
            r0.push(r1, r2)
            goto L90d
        L441:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L449:
            r0 = r6
            r1 = r6
            r2 = r8
            int r1 = r1.getLocal(r2)
            r0.push(r1)
            goto L90d
        L455:
            r0 = r6
            r1 = 2
            r0.pop(r1)
            r0 = r6
            r1 = 4194308(0x400004, float:5.877477E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L469:
            r0 = r6
            r1 = 2
            r0.pop(r1)
            r0 = r6
            r1 = 4194307(0x400003, float:5.877476E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L47d:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = 4194309(0x400005, float:5.877479E-39)
            if (r1 != r2) goto L495
            r1 = r11
            goto L49a
        L495:
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r2 = r11
            int r1 = r1 + r2
        L49a:
            r0.push(r1)
            goto L90d
        L4a0:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r11
            r0.setLocal(r1, r2)
            r0 = r8
            if (r0 <= 0) goto L90d
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.getLocal(r1)
            r15 = r0
            r0 = r15
            r1 = 4194308(0x400004, float:5.877477E-39)
            if (r0 == r1) goto L4c8
            r0 = r15
            r1 = 4194307(0x400003, float:5.877476E-39)
            if (r0 != r1) goto L4d4
        L4c8:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0.setLocal(r1, r2)
            goto L4f4
        L4d4:
            r0 = r15
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 == r1) goto L4e8
            r0 = r15
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r0 != r1) goto L4f4
        L4e8:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = r15
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r3
            r0.setLocal(r1, r2)
        L4f4:
            goto L90d
        L4f7:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r11
            r0.setLocal(r1, r2)
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0.setLocal(r1, r2)
            r0 = r8
            if (r0 <= 0) goto L90d
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.getLocal(r1)
            r15 = r0
            r0 = r15
            r1 = 4194308(0x400004, float:5.877477E-39)
            if (r0 == r1) goto L52d
            r0 = r15
            r1 = 4194307(0x400003, float:5.877476E-39)
            if (r0 != r1) goto L539
        L52d:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0.setLocal(r1, r2)
            goto L559
        L539:
            r0 = r15
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 == r1) goto L54d
            r0 = r15
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r0 != r1) goto L559
        L54d:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = r15
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r3
            r0.setLocal(r1, r2)
        L559:
            goto L90d
        L55c:
            r0 = r6
            r1 = 3
            r0.pop(r1)
            goto L90d
        L564:
            r0 = r6
            r1 = 4
            r0.pop(r1)
            goto L90d
        L56c:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            goto L90d
        L574:
            r0 = r6
            r1 = 2
            r0.pop(r1)
            goto L90d
        L57c:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            goto L90d
        L591:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            int r0 = r0.pop()
            r12 = r0
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            goto L90d
        L5b2:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            int r0 = r0.pop()
            r12 = r0
            r0 = r6
            int r0 = r0.pop()
            r13 = r0
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r13
            r0.push(r1)
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            goto L90d
        L5df:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            int r0 = r0.pop()
            r12 = r0
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            goto L90d
        L606:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            int r0 = r0.pop()
            r12 = r0
            r0 = r6
            int r0 = r0.pop()
            r13 = r0
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r13
            r0.push(r1)
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            goto L90d
        L639:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            int r0 = r0.pop()
            r12 = r0
            r0 = r6
            int r0 = r0.pop()
            r13 = r0
            r0 = r6
            int r0 = r0.pop()
            r14 = r0
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r14
            r0.push(r1)
            r0 = r6
            r1 = r13
            r0.push(r1)
            r0 = r6
            r1 = r12
            r0.push(r1)
            r0 = r6
            r1 = r11
            r0.push(r1)
            goto L90d
        L678:
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r6
            int r0 = r0.pop()
            r12 = r0
            r0 = r6
            r1 = r11
            r0.push(r1)
            r0 = r6
            r1 = r12
            r0.push(r1)
            goto L90d
        L693:
            r0 = r6
            r1 = 2
            r0.pop(r1)
            r0 = r6
            r1 = 4194305(0x400001, float:5.877473E-39)
            r0.push(r1)
            goto L90d
        L6a1:
            r0 = r6
            r1 = 4
            r0.pop(r1)
            r0 = r6
            r1 = 4194308(0x400004, float:5.877477E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L6b5:
            r0 = r6
            r1 = 2
            r0.pop(r1)
            r0 = r6
            r1 = 4194306(0x400002, float:5.877475E-39)
            r0.push(r1)
            goto L90d
        L6c3:
            r0 = r6
            r1 = 4
            r0.pop(r1)
            r0 = r6
            r1 = 4194307(0x400003, float:5.877476E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L6d7:
            r0 = r6
            r1 = 3
            r0.pop(r1)
            r0 = r6
            r1 = 4194308(0x400004, float:5.877477E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L6eb:
            r0 = r6
            r1 = r8
            r2 = 4194305(0x400001, float:5.877473E-39)
            r0.setLocal(r1, r2)
            goto L90d
        L6f5:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            r1 = 4194308(0x400004, float:5.877477E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L709:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            r1 = 4194306(0x400002, float:5.877475E-39)
            r0.push(r1)
            goto L90d
        L717:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            r1 = 4194307(0x400003, float:5.877476E-39)
            r0.push(r1)
            r0 = r6
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.push(r1)
            goto L90d
        L72b:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            r1 = 4194305(0x400001, float:5.877473E-39)
            r0.push(r1)
            goto L90d
        L739:
            r0 = r6
            r1 = 4
            r0.pop(r1)
            r0 = r6
            r1 = 4194305(0x400001, float:5.877473E-39)
            r0.push(r1)
            goto L90d
        L747:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "JSR/RET are not supported with computeFrames option"
            r1.<init>(r2)
            throw r0
        L752:
            r0 = r6
            r1 = r10
            r2 = r9
            java.lang.String r2 = r2.value
            r0.push(r1, r2)
            goto L90d
        L75f:
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.value
            r0.pop(r1)
            goto L90d
        L76a:
            r0 = r6
            r1 = 1
            r0.pop(r1)
            r0 = r6
            r1 = r10
            r2 = r9
            java.lang.String r2 = r2.value
            r0.push(r1, r2)
            goto L90d
        L77c:
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.value
            r0.pop(r1)
            r0 = r6
            int r0 = r0.pop()
            goto L90d
        L78c:
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.value
            r0.pop(r1)
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L7bb
            r0 = r6
            int r0 = r0.pop()
            r11 = r0
            r0 = r7
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L7bb
            r0 = r9
            java.lang.String r0 = r0.name
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 60
            if (r0 != r1) goto L7bb
            r0 = r6
            r1 = r11
            r0.addInitializedType(r1)
        L7bb:
            r0 = r6
            r1 = r10
            r2 = r9
            java.lang.String r2 = r2.value
            r0.push(r1, r2)
            goto L90d
        L7c8:
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.value
            r0.pop(r1)
            r0 = r6
            r1 = r10
            r2 = r9
            java.lang.String r2 = r2.value
            r0.push(r1, r2)
            goto L90d
        L7dd:
            r0 = r6
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r10
            r3 = r9
            java.lang.String r3 = r3.value
            r4 = r8
            int r2 = r2.addUninitializedType(r3, r4)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L7f1:
            r0 = r6
            int r0 = r0.pop()
            r0 = r8
            switch(r0) {
                case 4: goto L824;
                case 5: goto L82e;
                case 6: goto L856;
                case 7: goto L860;
                case 8: goto L838;
                case 9: goto L842;
                case 10: goto L84c;
                case 11: goto L86a;
                default: goto L874;
            }
        L824:
            r0 = r6
            r1 = 71303177(0x4400009, float:2.2569508E-36)
            r0.push(r1)
            goto L90d
        L82e:
            r0 = r6
            r1 = 71303179(0x440000b, float:2.2569511E-36)
            r0.push(r1)
            goto L90d
        L838:
            r0 = r6
            r1 = 71303178(0x440000a, float:2.256951E-36)
            r0.push(r1)
            goto L90d
        L842:
            r0 = r6
            r1 = 71303180(0x440000c, float:2.2569513E-36)
            r0.push(r1)
            goto L90d
        L84c:
            r0 = r6
            r1 = 71303169(0x4400001, float:2.2569493E-36)
            r0.push(r1)
            goto L90d
        L856:
            r0 = r6
            r1 = 71303170(0x4400002, float:2.2569495E-36)
            r0.push(r1)
            goto L90d
        L860:
            r0 = r6
            r1 = 71303171(0x4400003, float:2.2569497E-36)
            r0.push(r1)
            goto L90d
        L86a:
            r0 = r6
            r1 = 71303172(0x4400004, float:2.2569499E-36)
            r0.push(r1)
            goto L90d
        L874:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L87c:
            r0 = r9
            java.lang.String r0 = r0.value
            r15 = r0
            r0 = r6
            int r0 = r0.pop()
            r0 = r15
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L8af
            r0 = r6
            r1 = r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = 91
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r15
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.push(r1, r2)
            goto L90d
        L8af:
            r0 = r6
            r1 = 75497472(0x4800000, float:3.0092655E-36)
            r2 = r10
            r3 = r15
            int r2 = r2.addType(r3)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L8c1:
            r0 = r9
            java.lang.String r0 = r0.value
            r16 = r0
            r0 = r6
            int r0 = r0.pop()
            r0 = r16
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L8e2
            r0 = r6
            r1 = r10
            r2 = r16
            r0.push(r1, r2)
            goto L90d
        L8e2:
            r0 = r6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r10
            r3 = r16
            int r2 = r2.addType(r3)
            r1 = r1 | r2
            r0.push(r1)
            goto L90d
        L8f3:
            r0 = r6
            r1 = r8
            r0.pop(r1)
            r0 = r6
            r1 = r10
            r2 = r9
            java.lang.String r2 = r2.value
            r0.push(r1, r2)
            goto L90d
        L905:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L90d:
            return
    }

    private int getConcreteOutputType(int r7, int r8) {
            r6 = this;
            r0 = r7
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r9 = r0
            r0 = r7
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r10 = r0
            r0 = r10
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L3b
            r0 = r9
            r1 = r6
            int[] r1 = r1.inputLocals
            r2 = r7
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r11 = r0
            r0 = r7
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L38
            r0 = r11
            r1 = 4194308(0x400004, float:5.877477E-39)
            if (r0 == r1) goto L34
            r0 = r11
            r1 = 4194307(0x400003, float:5.877476E-39)
            if (r0 != r1) goto L38
        L34:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r11 = r0
        L38:
            r0 = r11
            return r0
        L3b:
            r0 = r10
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r0 != r1) goto L6d
            r0 = r9
            r1 = r6
            int[] r1 = r1.inputStack
            r2 = r8
            r3 = r7
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r4
            int r2 = r2 - r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r11 = r0
            r0 = r7
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L6a
            r0 = r11
            r1 = 4194308(0x400004, float:5.877477E-39)
            if (r0 == r1) goto L66
            r0 = r11
            r1 = 4194307(0x400003, float:5.877476E-39)
            if (r0 != r1) goto L6a
        L66:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r11 = r0
        L6a:
            r0 = r11
            return r0
        L6d:
            r0 = r7
            return r0
    }

    final boolean merge(org.objectweb.asm.SymbolTable r8, org.objectweb.asm.Frame r9, int r10) {
            r7 = this;
            r0 = 0
            r11 = r0
            r0 = r7
            int[] r0 = r0.inputLocals
            int r0 = r0.length
            r12 = r0
            r0 = r7
            int[] r0 = r0.inputStack
            int r0 = r0.length
            r13 = r0
            r0 = r9
            int[] r0 = r0.inputLocals
            if (r0 != 0) goto L23
            r0 = r9
            r1 = r12
            int[] r1 = new int[r1]
            r0.inputLocals = r1
            r0 = 1
            r11 = r0
        L23:
            r0 = 0
            r14 = r0
        L26:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L95
            r0 = r7
            int[] r0 = r0.outputLocals
            if (r0 == 0) goto L65
            r0 = r14
            r1 = r7
            int[] r1 = r1.outputLocals
            int r1 = r1.length
            if (r0 >= r1) goto L65
            r0 = r7
            int[] r0 = r0.outputLocals
            r1 = r14
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L58
            r0 = r7
            int[] r0 = r0.inputLocals
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            goto L62
        L58:
            r0 = r7
            r1 = r16
            r2 = r13
            int r0 = r0.getConcreteOutputType(r1, r2)
            r15 = r0
        L62:
            goto L6e
        L65:
            r0 = r7
            int[] r0 = r0.inputLocals
            r1 = r14
            r0 = r0[r1]
            r15 = r0
        L6e:
            r0 = r7
            int[] r0 = r0.initializations
            if (r0 == 0) goto L7e
            r0 = r7
            r1 = r8
            r2 = r15
            int r0 = r0.getInitializedType(r1, r2)
            r15 = r0
        L7e:
            r0 = r11
            r1 = r8
            r2 = r15
            r3 = r9
            int[] r3 = r3.inputLocals
            r4 = r14
            boolean r1 = merge(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r14 = r14 + 1
            goto L26
        L95:
            r0 = r10
            if (r0 <= 0) goto Le2
            r0 = 0
            r14 = r0
        L9c:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto Lbf
            r0 = r11
            r1 = r8
            r2 = r7
            int[] r2 = r2.inputLocals
            r3 = r14
            r2 = r2[r3]
            r3 = r9
            int[] r3 = r3.inputLocals
            r4 = r14
            boolean r1 = merge(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r14 = r14 + 1
            goto L9c
        Lbf:
            r0 = r9
            int[] r0 = r0.inputStack
            if (r0 != 0) goto Ld0
            r0 = r9
            r1 = 1
            int[] r1 = new int[r1]
            r0.inputStack = r1
            r0 = 1
            r11 = r0
        Ld0:
            r0 = r11
            r1 = r8
            r2 = r10
            r3 = r9
            int[] r3 = r3.inputStack
            r4 = 0
            boolean r1 = merge(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            r0 = r11
            return r0
        Le2:
            r0 = r7
            int[] r0 = r0.inputStack
            int r0 = r0.length
            r1 = r7
            short r1 = r1.outputStackStart
            int r0 = r0 + r1
            r14 = r0
            r0 = r9
            int[] r0 = r0.inputStack
            if (r0 != 0) goto L105
            r0 = r9
            r1 = r14
            r2 = r7
            short r2 = r2.outputStackTop
            int r1 = r1 + r2
            int[] r1 = new int[r1]
            r0.inputStack = r1
            r0 = 1
            r11 = r0
        L105:
            r0 = 0
            r15 = r0
        L108:
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto L13f
            r0 = r7
            int[] r0 = r0.inputStack
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r7
            int[] r0 = r0.initializations
            if (r0 == 0) goto L128
            r0 = r7
            r1 = r8
            r2 = r16
            int r0 = r0.getInitializedType(r1, r2)
            r16 = r0
        L128:
            r0 = r11
            r1 = r8
            r2 = r16
            r3 = r9
            int[] r3 = r3.inputStack
            r4 = r15
            boolean r1 = merge(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r15 = r15 + 1
            goto L108
        L13f:
            r0 = 0
            r15 = r0
        L142:
            r0 = r15
            r1 = r7
            short r1 = r1.outputStackTop
            if (r0 >= r1) goto L188
            r0 = r7
            int[] r0 = r0.outputStack
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r7
            r1 = r16
            r2 = r13
            int r0 = r0.getConcreteOutputType(r1, r2)
            r17 = r0
            r0 = r7
            int[] r0 = r0.initializations
            if (r0 == 0) goto L16e
            r0 = r7
            r1 = r8
            r2 = r17
            int r0 = r0.getInitializedType(r1, r2)
            r17 = r0
        L16e:
            r0 = r11
            r1 = r8
            r2 = r17
            r3 = r9
            int[] r3 = r3.inputStack
            r4 = r14
            r5 = r15
            int r4 = r4 + r5
            boolean r1 = merge(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r15 = r15 + 1
            goto L142
        L188:
            r0 = r11
            return r0
    }

    private static boolean merge(org.objectweb.asm.SymbolTable r6, int r7, int[] r8, int r9) {
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r7
            if (r0 != r1) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r7
            r11 = r0
            r0 = r7
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r1
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L27
            r0 = r10
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L23
            r0 = 0
            return r0
        L23:
            r0 = 4194309(0x400005, float:5.877479E-39)
            r11 = r0
        L27:
            r0 = r10
            if (r0 != 0) goto L33
            r0 = r8
            r1 = r9
            r2 = r11
            r0[r1] = r2
            r0 = 1
            return r0
        L33:
            r0 = r10
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            if (r0 != 0) goto L45
            r0 = r10
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 != r1) goto L109
        L45:
            r0 = r11
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L4e
            r0 = 0
            return r0
        L4e:
            r0 = r11
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r0 = r0 & r1
            r1 = r10
            r2 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r2
            if (r0 != r1) goto L9f
            r0 = r10
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 != r1) goto L83
            r0 = r11
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 | r1
            r1 = r6
            r2 = r11
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            r3 = r10
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r4
            int r1 = r1.addMergedType(r2, r3)
            r0 = r0 | r1
            r12 = r0
            goto L132
        L83:
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r11
            r2 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r1 & r2
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 | r1
            r1 = r6
            java.lang.String r2 = "java/lang/Object"
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            r12 = r0
            goto L132
        L9f:
            r0 = r11
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            if (r0 != 0) goto Lb1
            r0 = r11
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 != r1) goto L102
        Lb1:
            r0 = r11
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            if (r0 == 0) goto Lce
            r0 = r11
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 == r1) goto Lce
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r13
            int r0 = r0 + r1
            r13 = r0
        Lce:
            r0 = r10
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r14 = r0
            r0 = r14
            if (r0 == 0) goto Leb
            r0 = r10
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 == r1) goto Leb
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r14
            int r0 = r0 + r1
            r14 = r0
        Leb:
            r0 = r13
            r1 = r14
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 | r1
            r1 = r6
            java.lang.String r2 = "java/lang/Object"
            int r1 = r1.addType(r2)
            r0 = r0 | r1
            r12 = r0
            goto L132
        L102:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r12 = r0
            goto L132
        L109:
            r0 = r10
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L12e
            r0 = r11
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            if (r0 != 0) goto L122
            r0 = r11
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 != r1) goto L127
        L122:
            r0 = r11
            goto L129
        L127:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L129:
            r12 = r0
            goto L132
        L12e:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r12 = r0
        L132:
            r0 = r12
            r1 = r10
            if (r0 == r1) goto L140
            r0 = r8
            r1 = r9
            r2 = r12
            r0[r1] = r2
            r0 = 1
            return r0
        L140:
            r0 = 0
            return r0
    }

    final void accept(org.objectweb.asm.MethodWriter r6) {
            r5 = this;
            r0 = r5
            int[] r0 = r0.inputLocals
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        Ld:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = 4194308(0x400004, float:5.877477E-39)
            if (r1 == r2) goto L2a
            r1 = r11
            r2 = 4194307(0x400003, float:5.877476E-39)
            if (r1 != r2) goto L2e
        L2a:
            r1 = 2
            goto L2f
        L2e:
            r1 = 1
        L2f:
            int r0 = r0 + r1
            r10 = r0
            r0 = r11
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r0 != r1) goto L3f
            int r9 = r9 + 1
            goto L49
        L3f:
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            r0 = 0
            r9 = r0
        L49:
            goto Ld
        L4c:
            r0 = r5
            int[] r0 = r0.inputStack
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r10 = r0
        L58:
            r0 = r10
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L85
            r0 = r11
            r1 = r10
            r0 = r0[r1]
            r13 = r0
            r0 = r10
            r1 = r13
            r2 = 4194308(0x400004, float:5.877477E-39)
            if (r1 == r2) goto L77
            r1 = r13
            r2 = 4194307(0x400003, float:5.877476E-39)
            if (r1 != r2) goto L7b
        L77:
            r1 = 2
            goto L7c
        L7b:
            r1 = 1
        L7c:
            int r0 = r0 + r1
            r10 = r0
            int r12 = r12 + 1
            goto L58
        L85:
            r0 = r6
            r1 = r5
            org.objectweb.asm.Label r1 = r1.owner
            int r1 = r1.bytecodeOffset
            r2 = r8
            r3 = r12
            int r0 = r0.visitFrameStart(r1, r2, r3)
            r13 = r0
            r0 = 0
            r10 = r0
        L98:
            r0 = r8
            int r8 = r8 + (-1)
            if (r0 <= 0) goto Lcb
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r14 = r0
            r0 = r10
            r1 = r14
            r2 = 4194308(0x400004, float:5.877477E-39)
            if (r1 == r2) goto Lb5
            r1 = r14
            r2 = 4194307(0x400003, float:5.877476E-39)
            if (r1 != r2) goto Lb9
        Lb5:
            r1 = 2
            goto Lba
        Lb9:
            r1 = 1
        Lba:
            int r0 = r0 + r1
            r10 = r0
            r0 = r6
            r1 = r13
            int r13 = r13 + 1
            r2 = r14
            r0.visitAbstractType(r1, r2)
            goto L98
        Lcb:
            r0 = 0
            r10 = r0
        Lce:
            r0 = r12
            int r12 = r12 + (-1)
            if (r0 <= 0) goto L103
            r0 = r11
            r1 = r10
            r0 = r0[r1]
            r14 = r0
            r0 = r10
            r1 = r14
            r2 = 4194308(0x400004, float:5.877477E-39)
            if (r1 == r2) goto Led
            r1 = r14
            r2 = 4194307(0x400003, float:5.877476E-39)
            if (r1 != r2) goto Lf1
        Led:
            r1 = 2
            goto Lf2
        Lf1:
            r1 = 1
        Lf2:
            int r0 = r0 + r1
            r10 = r0
            r0 = r6
            r1 = r13
            int r13 = r13 + 1
            r2 = r14
            r0.visitAbstractType(r1, r2)
            goto Lce
        L103:
            r0 = r6
            r0.visitFrameEnd()
            return
    }

    static void putAbstractType(org.objectweb.asm.SymbolTable r5, int r6, org.objectweb.asm.ByteVector r7) {
            r0 = r6
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r1 = 26
            int r0 = r0 >> r1
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L81
            r0 = r6
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            r9 = r0
            r0 = r6
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            switch(r0) {
                case 4194304: goto L38;
                case 8388608: goto L42;
                case 12582912: goto L5f;
                default: goto L76;
            }
        L38:
            r0 = r7
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L7e
        L42:
            r0 = r7
            r1 = 7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            r2 = r5
            r3 = r9
            org.objectweb.asm.Symbol r2 = r2.getType(r3)
            java.lang.String r2 = r2.value
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L7e
        L5f:
            r0 = r7
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            r2 = r9
            org.objectweb.asm.Symbol r1 = r1.getType(r2)
            long r1 = r1.data
            int r1 = (int) r1
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L7e
        L76:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L7e:
            goto L17a
        L81:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
        L8a:
            r0 = r8
            int r8 = r8 + (-1)
            if (r0 <= 0) goto L9c
            r0 = r9
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8a
        L9c:
            r0 = r6
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r0 = r0 & r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 != r1) goto Lc3
            r0 = r9
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            org.objectweb.asm.Symbol r1 = r1.getType(r2)
            java.lang.String r1 = r1.value
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        Lc3:
            r0 = r6
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            switch(r0) {
                case 1: goto L130;
                case 2: goto L13b;
                case 3: goto L151;
                case 4: goto L146;
                case 5: goto L15c;
                case 6: goto L15c;
                case 7: goto L15c;
                case 8: goto L15c;
                case 9: goto L104;
                case 10: goto L10f;
                case 11: goto L11a;
                case 12: goto L125;
                default: goto L15c;
            }
        L104:
            r0 = r9
            r1 = 90
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L10f:
            r0 = r9
            r1 = 66
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L11a:
            r0 = r9
            r1 = 67
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L125:
            r0 = r9
            r1 = 83
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L130:
            r0 = r9
            r1 = 73
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L13b:
            r0 = r9
            r1 = 70
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L146:
            r0 = r9
            r1 = 74
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L151:
            r0 = r9
            r1 = 68
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L164
        L15c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L164:
            r0 = r7
            r1 = 7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            r2 = r9
            java.lang.String r2 = r2.toString()
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L17a:
            return
    }
}
