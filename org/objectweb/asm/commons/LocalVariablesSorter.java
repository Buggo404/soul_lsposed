package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/LocalVariablesSorter.SCL.lombok */
public class LocalVariablesSorter extends org.objectweb.asm.MethodVisitor {
    private static final org.objectweb.asm.Type OBJECT_TYPE = null;
    private int[] remappedVariableIndices;
    private java.lang.Object[] remappedLocalTypes;
    protected final int firstLocal;
    protected int nextLocal;

    public LocalVariablesSorter(int r7, java.lang.String r8, org.objectweb.asm.MethodVisitor r9) {
            r6 = this;
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.commons.LocalVariablesSorter> r1 = org.objectweb.asm.commons.LocalVariablesSorter.class
            if (r0 == r1) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1a:
            return
    }

    protected LocalVariablesSorter(int r5, int r6, java.lang.String r7, org.objectweb.asm.MethodVisitor r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r8
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 40
            int[] r1 = new int[r1]
            r0.remappedVariableIndices = r1
            r0 = r4
            r1 = 20
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.remappedLocalTypes = r1
            r0 = r4
            r1 = 8
            r2 = r6
            r1 = r1 & r2
            if (r1 != 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            r0.nextLocal = r1
            r0 = r7
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L36:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L58
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r4
            r1 = r0
            int r1 = r1.nextLocal
            r2 = r12
            int r2 = r2.getSize()
            int r1 = r1 + r2
            r0.nextLocal = r1
            int r11 = r11 + 1
            goto L36
        L58:
            r0 = r4
            r1 = r4
            int r1 = r1.nextLocal
            r0.firstLocal = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r7, int r8) {
            r6 = this;
            r0 = r7
            switch(r0) {
                case 21: goto L79;
                case 22: goto L64;
                case 23: goto L72;
                case 24: goto L6b;
                case 25: goto L80;
                case 54: goto L79;
                case 55: goto L64;
                case 56: goto L72;
                case 57: goto L6b;
                case 58: goto L80;
                case 169: goto L80;
                default: goto L87;
            }
        L64:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            r9 = r0
            goto La2
        L6b:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            r9 = r0
            goto La2
        L72:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            r9 = r0
            goto La2
        L79:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            r9 = r0
            goto La2
        L80:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.LocalVariablesSorter.OBJECT_TYPE
            r9 = r0
            goto La2
        L87:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid opcode "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        La2:
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r9
            int r2 = r2.remap(r3, r4)
            super.visitVarInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r6
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.INT_TYPE
            int r1 = r1.remap(r2, r3)
            r2 = r7
            super.visitIincInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            int r2 = r2.nextLocal
            super.visitMaxs(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.objectweb.asm.Label r12, org.objectweb.asm.Label r13, int r14) {
            r8 = this;
            r0 = r8
            r1 = r14
            r2 = r10
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getType(r2)
            int r0 = r0.remap(r1, r2)
            r15 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r15
            super.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int r10, org.objectweb.asm.TypePath r11, org.objectweb.asm.Label[] r12, org.objectweb.asm.Label[] r13, int[] r14, java.lang.String r15, boolean r16) {
            r9 = this;
            r0 = r15
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            r17 = r0
            r0 = r14
            int r0 = r0.length
            int[] r0 = new int[r0]
            r18 = r0
            r0 = 0
            r19 = r0
        L11:
            r0 = r19
            r1 = r18
            int r1 = r1.length
            if (r0 >= r1) goto L2f
            r0 = r18
            r1 = r19
            r2 = r9
            r3 = r14
            r4 = r19
            r3 = r3[r4]
            r4 = r17
            int r2 = r2.remap(r3, r4)
            r0[r1] = r2
            int r19 = r19 + 1
            goto L11
        L2f:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r18
            r6 = r15
            r7 = r16
            org.objectweb.asm.AnnotationVisitor r0 = super.visitLocalVariableAnnotation(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int r8, int r9, java.lang.Object[] r10, int r11, java.lang.Object[] r12) {
            r7 = this;
            r0 = r8
            r1 = -1
            if (r0 == r1) goto Lf
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r7
            java.lang.Object[] r0 = r0.remappedLocalTypes
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r13 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.remappedLocalTypes
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = r13
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            java.lang.Object[] r1 = r1.remappedLocalTypes
            r0.updateNewLocals(r1)
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
        L35:
            r0 = r15
            r1 = r9
            if (r0 >= r1) goto Lce
            r0 = r10
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            if (r0 == r1) goto Lae
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.LocalVariablesSorter.OBJECT_TYPE
            r17 = r0
            r0 = r16
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            if (r0 != r1) goto L5e
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            r17 = r0
            goto La0
        L5e:
            r0 = r16
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            if (r0 != r1) goto L6e
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            r17 = r0
            goto La0
        L6e:
            r0 = r16
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 != r1) goto L7e
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            r17 = r0
            goto La0
        L7e:
            r0 = r16
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L8e
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            r17 = r0
            goto La0
        L8e:
            r0 = r16
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto La0
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            r17 = r0
        La0:
            r0 = r7
            r1 = r7
            r2 = r14
            r3 = r17
            int r1 = r1.remap(r2, r3)
            r2 = r16
            r0.setFrameLocal(r1, r2)
        Lae:
            r0 = r14
            r1 = r16
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.LONG
            if (r1 == r2) goto Lc0
            r1 = r16
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.DOUBLE
            if (r1 != r2) goto Lc4
        Lc0:
            r1 = 2
            goto Lc5
        Lc4:
            r1 = 1
        Lc5:
            int r0 = r0 + r1
            r14 = r0
            int r15 = r15 + 1
            goto L35
        Lce:
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
        Ld7:
            r0 = r14
            r1 = r7
            java.lang.Object[] r1 = r1.remappedLocalTypes
            int r1 = r1.length
            if (r0 >= r1) goto L134
            r0 = r7
            java.lang.Object[] r0 = r0.remappedLocalTypes
            r1 = r14
            r0 = r0[r1]
            r17 = r0
            r0 = r14
            r1 = r17
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.LONG
            if (r1 == r2) goto Lfc
            r1 = r17
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.DOUBLE
            if (r1 != r2) goto L100
        Lfc:
            r1 = 2
            goto L101
        L100:
            r1 = 1
        L101:
            int r0 = r0 + r1
            r14 = r0
            r0 = r17
            if (r0 == 0) goto L124
            r0 = r17
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            if (r0 == r1) goto L124
            r0 = r7
            java.lang.Object[] r0 = r0.remappedLocalTypes
            r1 = r15
            int r15 = r15 + 1
            r2 = r17
            r0[r1] = r2
            r0 = r15
            r16 = r0
            goto L131
        L124:
            r0 = r7
            java.lang.Object[] r0 = r0.remappedLocalTypes
            r1 = r15
            int r15 = r15 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.TOP
            r0[r1] = r2
        L131:
            goto Ld7
        L134:
            r0 = r7
            r1 = r8
            r2 = r16
            r3 = r7
            java.lang.Object[] r3 = r3.remappedLocalTypes
            r4 = r11
            r5 = r12
            super.visitFrame(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r13
            r0.remappedLocalTypes = r1
            return
    }

    public int newLocal(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.getSort()
            switch(r0) {
                case 1: goto L3c;
                case 2: goto L3c;
                case 3: goto L3c;
                case 4: goto L3c;
                case 5: goto L3c;
                case 6: goto L43;
                case 7: goto L4a;
                case 8: goto L51;
                case 9: goto L58;
                case 10: goto L60;
                default: goto L68;
            }
        L3c:
            java.lang.Integer r0 = org.objectweb.asm.Opcodes.INTEGER
            r6 = r0
            goto L70
        L43:
            java.lang.Integer r0 = org.objectweb.asm.Opcodes.FLOAT
            r6 = r0
            goto L70
        L4a:
            java.lang.Integer r0 = org.objectweb.asm.Opcodes.LONG
            r6 = r0
            goto L70
        L51:
            java.lang.Integer r0 = org.objectweb.asm.Opcodes.DOUBLE
            r6 = r0
            goto L70
        L58:
            r0 = r5
            java.lang.String r0 = r0.getDescriptor()
            r6 = r0
            goto L70
        L60:
            r0 = r5
            java.lang.String r0 = r0.getInternalName()
            r6 = r0
            goto L70
        L68:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L70:
            r0 = r4
            r1 = r5
            int r0 = r0.newLocalMapping(r1)
            r7 = r0
            r0 = r4
            r1 = r7
            r2 = r5
            r0.setLocalType(r1, r2)
            r0 = r4
            r1 = r7
            r2 = r6
            r0.setFrameLocal(r1, r2)
            r0 = r7
            return r0
    }

    protected void updateNewLocals(java.lang.Object[] r2) {
            r1 = this;
            return
    }

    protected void setLocalType(int r2, org.objectweb.asm.Type r3) {
            r1 = this;
            return
    }

    private void setFrameLocal(int r7, java.lang.Object r8) {
            r6 = this;
            r0 = r6
            java.lang.Object[] r0 = r0.remappedLocalTypes
            int r0 = r0.length
            r9 = r0
            r0 = r7
            r1 = r9
            if (r0 < r1) goto L2b
            r0 = 2
            r1 = r9
            int r0 = r0 * r1
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r10 = r0
            r0 = r6
            java.lang.Object[] r0 = r0.remappedLocalTypes
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.remappedLocalTypes = r1
        L2b:
            r0 = r6
            java.lang.Object[] r0 = r0.remappedLocalTypes
            r1 = r7
            r2 = r8
            r0[r1] = r2
            return
    }

    private int remap(int r7, org.objectweb.asm.Type r8) {
            r6 = this;
            r0 = r7
            r1 = r8
            int r1 = r1.getSize()
            int r0 = r0 + r1
            r1 = r6
            int r1 = r1.firstLocal
            if (r0 > r1) goto Lf
            r0 = r7
            return r0
        Lf:
            r0 = 2
            r1 = r7
            int r0 = r0 * r1
            r1 = r8
            int r1 = r1.getSize()
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r6
            int[] r0 = r0.remappedVariableIndices
            int r0 = r0.length
            r10 = r0
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L48
            r0 = 2
            r1 = r10
            int r0 = r0 * r1
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r11 = r0
            r0 = r6
            int[] r0 = r0.remappedVariableIndices
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r10
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r11
            r0.remappedVariableIndices = r1
        L48:
            r0 = r6
            int[] r0 = r0.remappedVariableIndices
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L70
            r0 = r6
            r1 = r8
            int r0 = r0.newLocalMapping(r1)
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = r8
            r0.setLocalType(r1, r2)
            r0 = r6
            int[] r0 = r0.remappedVariableIndices
            r1 = r9
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            r0[r1] = r2
            goto L73
        L70:
            int r11 = r11 + (-1)
        L73:
            r0 = r11
            return r0
    }

    protected int newLocalMapping(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.nextLocal
            r6 = r0
            r0 = r4
            r1 = r0
            int r1 = r1.nextLocal
            r2 = r5
            int r2 = r2.getSize()
            int r1 = r1 + r2
            r0.nextLocal = r1
            r0 = r6
            return r0
    }

    static {
            java.lang.String r0 = "java/lang/Object"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.commons.LocalVariablesSorter.OBJECT_TYPE = r0
            return
    }
}
