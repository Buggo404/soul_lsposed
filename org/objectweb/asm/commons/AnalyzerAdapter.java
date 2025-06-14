package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/AnalyzerAdapter.SCL.lombok */
public class AnalyzerAdapter extends org.objectweb.asm.MethodVisitor {
    public java.util.List<java.lang.Object> locals;
    public java.util.List<java.lang.Object> stack;
    private java.util.List<org.objectweb.asm.Label> labels;
    public java.util.Map<java.lang.Object, java.lang.Object> uninitializedTypes;
    private int maxStack;
    private int maxLocals;
    private java.lang.String owner;

    public AnalyzerAdapter(java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, org.objectweb.asm.MethodVisitor r13) {
            r8 = this;
            r0 = r8
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.commons.AnalyzerAdapter> r1 = org.objectweb.asm.commons.AnalyzerAdapter.class
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            return
    }

    protected AnalyzerAdapter(int r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9, org.objectweb.asm.MethodVisitor r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r10
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.owner = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.locals = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.stack = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.uninitializedTypes = r1
            r0 = r7
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L59
            java.lang.String r0 = "<init>"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            boolean r0 = r0.add(r1)
            goto L59
        L4e:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r6
            boolean r0 = r0.add(r1)
        L59:
            r0 = r9
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r13 = r0
        L68:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L13c
            r0 = r11
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            int r0 = r0.getSort()
            switch(r0) {
                case 1: goto Lb0;
                case 2: goto Lb0;
                case 3: goto Lb0;
                case 4: goto Lb0;
                case 5: goto Lb0;
                case 6: goto Lc0;
                case 7: goto Ld0;
                case 8: goto Led;
                case 9: goto L10a;
                case 10: goto L11c;
                default: goto L12e;
            }
        Lb0:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            boolean r0 = r0.add(r1)
            goto L136
        Lc0:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            boolean r0 = r0.add(r1)
            goto L136
        Ld0:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            boolean r0 = r0.add(r1)
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            boolean r0 = r0.add(r1)
            goto L136
        Led:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            boolean r0 = r0.add(r1)
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            boolean r0 = r0.add(r1)
            goto L136
        L10a:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r14
            java.lang.String r1 = r1.getDescriptor()
            boolean r0 = r0.add(r1)
            goto L136
        L11c:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r14
            java.lang.String r1 = r1.getInternalName()
            boolean r0 = r0.add(r1)
            goto L136
        L12e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L136:
            int r13 = r13 + 1
            goto L68
        L13c:
            r0 = r4
            r1 = r4
            java.util.List<java.lang.Object> r1 = r1.locals
            int r1 = r1.size()
            r0.maxLocals = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int r8, int r9, java.lang.Object[] r10, int r11, java.lang.Object[] r12) {
            r7 = this;
            r0 = r8
            r1 = -1
            if (r0 == r1) goto Lf
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "AnalyzerAdapter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.visitFrame(r1, r2, r3, r4, r5)
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.locals
            if (r0 == 0) goto L36
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.locals
            r0.clear()
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.stack
            r0.clear()
            goto L4c
        L36:
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.locals = r1
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.stack = r1
        L4c:
            r0 = r9
            r1 = r10
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.locals
            visitFrameTypes(r0, r1, r2)
            r0 = r11
            r1 = r12
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.stack
            visitFrameTypes(r0, r1, r2)
            r0 = r7
            r1 = r7
            int r1 = r1.maxLocals
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.locals
            int r2 = r2.size()
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            r0 = r7
            r1 = r7
            int r1 = r1.maxStack
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.stack
            int r2 = r2.size()
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxStack = r1
            return
    }

    private static void visitFrameTypes(int r3, java.lang.Object[] r4, java.util.List<java.lang.Object> r5) {
            r0 = 0
            r6 = r0
        L2:
            r0 = r6
            r1 = r3
            if (r0 >= r1) goto L35
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r5
            r1 = r7
            boolean r0 = r0.add(r1)
            r0 = r7
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto L25
            r0 = r7
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L2f
        L25:
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            boolean r0 = r0.add(r1)
        L2f:
            int r6 = r6 + 1
            goto L2
        L35:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            super.visitInsn(r1)
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            r0.execute(r1, r2, r3)
            r0 = r6
            r1 = 172(0xac, float:2.41E-43)
            if (r0 < r1) goto L1a
            r0 = r6
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 <= r1) goto L21
        L1a:
            r0 = r6
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 != r1) goto L2b
        L21:
            r0 = r5
            r1 = 0
            r0.locals = r1
            r0 = r5
            r1 = 0
            r0.stack = r1
        L2b:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitIntInsn(r1, r2)
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.execute(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitVarInsn(r1, r2)
            r0 = r6
            r1 = 22
            if (r0 == r1) goto L1e
            r0 = r6
            r1 = 24
            if (r0 == r1) goto L1e
            r0 = r6
            r1 = 55
            if (r0 == r1) goto L1e
            r0 = r6
            r1 = 57
            if (r0 != r1) goto L22
        L1e:
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            r8 = r0
            r0 = r5
            r1 = r5
            int r1 = r1.maxLocals
            r2 = r7
            r3 = r8
            if (r3 == 0) goto L32
            r3 = 2
            goto L33
        L32:
            r3 = 1
        L33:
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.execute(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r6, java.lang.String r7) {
            r5 = this;
            r0 = r6
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L6a
            r0 = r5
            java.util.List<org.objectweb.asm.Label> r0 = r0.labels
            if (r0 != 0) goto L3c
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 3
            r2.<init>(r3)
            r0.labels = r1
            r0 = r5
            java.util.List<org.objectweb.asm.Label> r0 = r0.labels
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L3c
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r8
            r0.visitLabel(r1)
        L3c:
            r0 = r5
            java.util.List<org.objectweb.asm.Label> r0 = r0.labels
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L46:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L6a
            r0 = r8
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.Label r0 = (org.objectweb.asm.Label) r0
            r9 = r0
            r0 = r5
            java.util.Map<java.lang.Object, java.lang.Object> r0 = r0.uninitializedTypes
            r1 = r9
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            goto L46
        L6a:
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitTypeInsn(r1, r2)
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r7
            r0.execute(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitFieldInsn(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r10
            r0.execute(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L1d
            r0 = r8
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
        L1d:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = -257(0xfffffffffffffeff, float:NaN)
            r0 = r0 & r1
            r13 = r0
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.locals
            if (r0 != 0) goto L3c
            r0 = r7
            r1 = 0
            r0.labels = r1
            return
        L3c:
            r0 = r7
            r1 = r11
            r0.pop(r1)
            r0 = r13
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto Le9
            r0 = r7
            java.lang.Object r0 = r0.pop()
            r14 = r0
            r0 = r13
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto Le9
            r0 = r10
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le9
            r0 = r14
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            if (r0 != r1) goto L72
            r0 = r7
            java.lang.String r0 = r0.owner
            r15 = r0
            goto L7f
        L72:
            r0 = r7
            java.util.Map<java.lang.Object, java.lang.Object> r0 = r0.uninitializedTypes
            r1 = r14
            java.lang.Object r0 = r0.get(r1)
            r15 = r0
        L7f:
            r0 = 0
            r16 = r0
        L82:
            r0 = r16
            r1 = r7
            java.util.List<java.lang.Object> r1 = r1.locals
            int r1 = r1.size()
            if (r0 >= r1) goto Lb4
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r16
            java.lang.Object r0 = r0.get(r1)
            r1 = r14
            if (r0 != r1) goto Lae
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r16
            r2 = r15
            java.lang.Object r0 = r0.set(r1, r2)
        Lae:
            int r16 = r16 + 1
            goto L82
        Lb4:
            r0 = 0
            r16 = r0
        Lb7:
            r0 = r16
            r1 = r7
            java.util.List<java.lang.Object> r1 = r1.stack
            int r1 = r1.size()
            if (r0 >= r1) goto Le9
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r16
            java.lang.Object r0 = r0.get(r1)
            r1 = r14
            if (r0 != r1) goto Le3
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r16
            r2 = r15
            java.lang.Object r0 = r0.set(r1, r2)
        Le3:
            int r16 = r16 + 1
            goto Lb7
        Le9:
            r0 = r7
            r1 = r11
            r0.pushDescriptor(r1)
            r0 = r7
            r1 = 0
            r0.labels = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitInvokeDynamicInsn(r1, r2, r3, r4)
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.locals
            if (r0 != 0) goto L16
            r0 = r6
            r1 = 0
            r0.labels = r1
            return
        L16:
            r0 = r6
            r1 = r8
            r0.pop(r1)
            r0 = r6
            r1 = r8
            r0.pushDescriptor(r1)
            r0 = r6
            r1 = 0
            r0.labels = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r6, org.objectweb.asm.Label r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitJumpInsn(r1, r2)
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            r0.execute(r1, r2, r3)
            r0 = r6
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 != r1) goto L1e
            r0 = r5
            r1 = 0
            r0.locals = r1
            r0 = r5
            r1 = 0
            r0.stack = r1
        L1e:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            super.visitLabel(r1)
            r0 = r5
            java.util.List<org.objectweb.asm.Label> r0 = r0.labels
            if (r0 != 0) goto L18
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 3
            r2.<init>(r3)
            r0.labels = r1
        L18:
            r0 = r5
            java.util.List<org.objectweb.asm.Label> r0 = r0.labels
            r1 = r6
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.visitLdcInsn(r1)
            r0 = r3
            java.util.List<java.lang.Object> r0 = r0.locals
            if (r0 != 0) goto L12
            r0 = r3
            r1 = 0
            r0.labels = r1
            return
        L12:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L23
            r0 = r3
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            r0.push(r1)
            goto Le3
        L23:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto L3b
            r0 = r3
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r3
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto Le3
        L3b:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L4c
            r0 = r3
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            r0.push(r1)
            goto Le3
        L4c:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L64
            r0 = r3
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            r0.push(r1)
            r0 = r3
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto Le3
        L64:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L75
            r0 = r3
            java.lang.String r1 = "java/lang/String"
            r0.push(r1)
            goto Le3
        L75:
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto Lb5
            r0 = r4
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            int r0 = r0.getSort()
            r5 = r0
            r0 = r5
            r1 = 10
            if (r0 == r1) goto L90
            r0 = r5
            r1 = 9
            if (r0 != r1) goto L9a
        L90:
            r0 = r3
            java.lang.String r1 = "java/lang/Class"
            r0.push(r1)
            goto Lb2
        L9a:
            r0 = r5
            r1 = 11
            if (r0 != r1) goto Laa
            r0 = r3
            java.lang.String r1 = "java/lang/invoke/MethodType"
            r0.push(r1)
            goto Lb2
        Laa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lb2:
            goto Le3
        Lb5:
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 == 0) goto Lc6
            r0 = r3
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            r0.push(r1)
            goto Le3
        Lc6:
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto Ldb
            r0 = r3
            r1 = r4
            org.objectweb.asm.ConstantDynamic r1 = (org.objectweb.asm.ConstantDynamic) r1
            java.lang.String r1 = r1.getDescriptor()
            r0.pushDescriptor(r1)
            goto Le3
        Ldb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Le3:
            r0 = r3
            r1 = 0
            r0.labels = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitIincInsn(r1, r2)
            r0 = r5
            r1 = r5
            int r1 = r1.maxLocals
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            r0 = r5
            r1 = 132(0x84, float:1.85E-43)
            r2 = r6
            r3 = 0
            r0.execute(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r7, int r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label... r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitTableSwitchInsn(r1, r2, r3, r4)
            r0 = r6
            r1 = 170(0xaa, float:2.38E-43)
            r2 = 0
            r3 = 0
            r0.execute(r1, r2, r3)
            r0 = r6
            r1 = 0
            r0.locals = r1
            r0 = r6
            r1 = 0
            r0.stack = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r6, int[] r7, org.objectweb.asm.Label[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.visitLookupSwitchInsn(r1, r2, r3)
            r0 = r5
            r1 = 171(0xab, float:2.4E-43)
            r2 = 0
            r3 = 0
            r0.execute(r1, r2, r3)
            r0 = r5
            r1 = 0
            r0.locals = r1
            r0 = r5
            r1 = 0
            r0.stack = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitMultiANewArrayInsn(r1, r2)
            r0 = r5
            r1 = 197(0xc5, float:2.76E-43)
            r2 = r7
            r3 = r6
            r0.execute(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.objectweb.asm.Label r12, org.objectweb.asm.Label r13, int r14) {
            r8 = this;
            r0 = r10
            r1 = 0
            char r0 = r0.charAt(r1)
            r15 = r0
            r0 = r8
            r1 = r8
            int r1 = r1.maxLocals
            r2 = r14
            r3 = r15
            r4 = 74
            if (r3 == r4) goto L1c
            r3 = r15
            r4 = 68
            if (r3 != r4) goto L20
        L1c:
            r3 = 2
            goto L21
        L20:
            r3 = 1
        L21:
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            super.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L2e
            r0 = r4
            r1 = r4
            int r1 = r1.maxStack
            r2 = r5
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxStack = r1
            r0 = r4
            r1 = r4
            int r1 = r1.maxLocals
            r2 = r6
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            int r1 = r1.maxStack
            r2 = r4
            int r2 = r2.maxLocals
            r0.visitMaxs(r1, r2)
        L2e:
            return
    }

    private java.lang.Object get(int r6) {
            r5 = this;
            r0 = r5
            r1 = r5
            int r1 = r1.maxLocals
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            r0 = r6
            r1 = r5
            java.util.List<java.lang.Object> r1 = r1.locals
            int r1 = r1.size()
            if (r0 >= r1) goto L28
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            goto L2b
        L28:
            java.lang.Integer r0 = org.objectweb.asm.Opcodes.TOP
        L2b:
            return r0
    }

    private void set(int r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            int r1 = r1.maxLocals
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
        Le:
            r0 = r6
            r1 = r5
            java.util.List<java.lang.Object> r1 = r1.locals
            int r1 = r1.size()
            if (r0 < r1) goto L2b
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.locals
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            boolean r0 = r0.add(r1)
            goto Le
        L2b:
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.locals
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.set(r1, r2)
            return
    }

    private void push(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r5
            boolean r0 = r0.add(r1)
            r0 = r4
            r1 = r4
            int r1 = r1.maxStack
            r2 = r4
            java.util.List<java.lang.Object> r2 = r2.stack
            int r2 = r2.size()
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxStack = r1
            return
    }

    private void pushDescriptor(java.lang.String r7) {
            r6 = this;
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 != r1) goto L14
            r0 = r7
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            java.lang.String r0 = r0.getDescriptor()
            goto L15
        L14:
            r0 = r7
        L15:
            r8 = r0
            r0 = r8
            r1 = 0
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L91;
                case 67: goto L91;
                case 68: goto Lb0;
                case 69: goto Ld9;
                case 70: goto L99;
                case 71: goto Ld9;
                case 72: goto Ld9;
                case 73: goto L91;
                case 74: goto La1;
                case 75: goto Ld9;
                case 76: goto Lc7;
                case 77: goto Ld9;
                case 78: goto Ld9;
                case 79: goto Ld9;
                case 80: goto Ld9;
                case 81: goto Ld9;
                case 82: goto Ld9;
                case 83: goto L91;
                case 84: goto Ld9;
                case 85: goto Ld9;
                case 86: goto L90;
                case 87: goto Ld9;
                case 88: goto Ld9;
                case 89: goto Ld9;
                case 90: goto L91;
                case 91: goto Lbf;
                default: goto Ld9;
            }
        L90:
            return
        L91:
            r0 = r6
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            r0.push(r1)
            return
        L99:
            r0 = r6
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            r0.push(r1)
            return
        La1:
            r0 = r6
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r6
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            return
        Lb0:
            r0 = r6
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            r0.push(r1)
            r0 = r6
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            return
        Lbf:
            r0 = r6
            r1 = r8
            r0.push(r1)
            goto Le1
        Lc7:
            r0 = r6
            r1 = r8
            r2 = 1
            r3 = r8
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            r0.push(r1)
            goto Le1
        Ld9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Le1:
            return
    }

    private java.lang.Object pop() {
            r4 = this;
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r4
            java.util.List<java.lang.Object> r1 = r1.stack
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }

    private void pop(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<java.lang.Object> r0 = r0.stack
            int r0 = r0.size()
            r5 = r0
            r0 = r5
            r1 = r4
            int r0 = r0 - r1
            r6 = r0
            r0 = r5
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        L13:
            r0 = r7
            r1 = r6
            if (r0 < r1) goto L2b
            r0 = r3
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r7
            java.lang.Object r0 = r0.remove(r1)
            int r7 = r7 + (-1)
            goto L13
        L2b:
            return
    }

    private void pop(java.lang.String r4) {
            r3 = this;
            r0 = r4
            r1 = 0
            char r0 = r0.charAt(r1)
            r5 = r0
            r0 = r5
            r1 = 40
            if (r0 != r1) goto L44
            r0 = 0
            r6 = r0
            r0 = r4
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L20:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L3c
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r6
            r1 = r11
            int r1 = r1.getSize()
            int r0 = r0 + r1
            r6 = r0
            int r10 = r10 + 1
            goto L20
        L3c:
            r0 = r3
            r1 = r6
            r0.pop(r1)
            goto L5d
        L44:
            r0 = r5
            r1 = 74
            if (r0 == r1) goto L50
            r0 = r5
            r1 = 68
            if (r0 != r1) goto L58
        L50:
            r0 = r3
            r1 = 2
            r0.pop(r1)
            goto L5d
        L58:
            r0 = r3
            r1 = 1
            r0.pop(r1)
        L5d:
            return
    }

    private void execute(int r6, int r7, java.lang.String r8) {
            r5 = this;
            r0 = r6
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 == r1) goto Le
            r0 = r6
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto L19
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "JSR/RET are not supported"
            r1.<init>(r2)
            throw r0
        L19:
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.locals
            if (r0 != 0) goto L26
            r0 = r5
            r1 = 0
            r0.labels = r1
            return
        L26:
            r0 = r6
            switch(r0) {
                case 0: goto L354;
                case 1: goto L357;
                case 2: goto L361;
                case 3: goto L361;
                case 4: goto L361;
                case 5: goto L361;
                case 6: goto L361;
                case 7: goto L361;
                case 8: goto L361;
                case 9: goto L36b;
                case 10: goto L36b;
                case 11: goto L37c;
                case 12: goto L37c;
                case 13: goto L37c;
                case 14: goto L386;
                case 15: goto L386;
                case 16: goto L361;
                case 17: goto L361;
                case 18: goto L7b7;
                case 19: goto L7b7;
                case 20: goto L7b7;
                case 21: goto L397;
                case 22: goto L3a3;
                case 23: goto L397;
                case 24: goto L3a3;
                case 25: goto L397;
                case 26: goto L7b7;
                case 27: goto L7b7;
                case 28: goto L7b7;
                case 29: goto L7b7;
                case 30: goto L7b7;
                case 31: goto L7b7;
                case 32: goto L7b7;
                case 33: goto L7b7;
                case 34: goto L7b7;
                case 35: goto L7b7;
                case 36: goto L7b7;
                case 37: goto L7b7;
                case 38: goto L7b7;
                case 39: goto L7b7;
                case 40: goto L7b7;
                case 41: goto L7b7;
                case 42: goto L7b7;
                case 43: goto L7b7;
                case 44: goto L7b7;
                case 45: goto L7b7;
                case 46: goto L5d4;
                case 47: goto L3b6;
                case 48: goto L5f9;
                case 49: goto L3cc;
                case 50: goto L3e2;
                case 51: goto L5d4;
                case 52: goto L5d4;
                case 53: goto L5d4;
                case 54: goto L420;
                case 55: goto L457;
                case 56: goto L420;
                case 57: goto L457;
                case 58: goto L420;
                case 59: goto L7b7;
                case 60: goto L7b7;
                case 61: goto L7b7;
                case 62: goto L7b7;
                case 63: goto L7b7;
                case 64: goto L7b7;
                case 65: goto L7b7;
                case 66: goto L7b7;
                case 67: goto L7b7;
                case 68: goto L7b7;
                case 69: goto L7b7;
                case 70: goto L7b7;
                case 71: goto L7b7;
                case 72: goto L7b7;
                case 73: goto L7b7;
                case 74: goto L7b7;
                case 75: goto L7b7;
                case 76: goto L7b7;
                case 77: goto L7b7;
                case 78: goto L7b7;
                case 79: goto L49d;
                case 80: goto L4a5;
                case 81: goto L49d;
                case 82: goto L4a5;
                case 83: goto L49d;
                case 84: goto L49d;
                case 85: goto L49d;
                case 86: goto L49d;
                case 87: goto L4ad;
                case 88: goto L4b5;
                case 89: goto L4bd;
                case 90: goto L4d2;
                case 91: goto L4f3;
                case 92: goto L520;
                case 93: goto L547;
                case 94: goto L57a;
                case 95: goto L5b9;
                case 96: goto L5d4;
                case 97: goto L5e3;
                case 98: goto L5f9;
                case 99: goto L608;
                case 100: goto L5d4;
                case 101: goto L5e3;
                case 102: goto L5f9;
                case 103: goto L608;
                case 104: goto L5d4;
                case 105: goto L5e3;
                case 106: goto L5f9;
                case 107: goto L608;
                case 108: goto L5d4;
                case 109: goto L5e3;
                case 110: goto L5f9;
                case 111: goto L608;
                case 112: goto L5d4;
                case 113: goto L5e3;
                case 114: goto L5f9;
                case 115: goto L608;
                case 116: goto L354;
                case 117: goto L354;
                case 118: goto L354;
                case 119: goto L354;
                case 120: goto L5d4;
                case 121: goto L61e;
                case 122: goto L5d4;
                case 123: goto L61e;
                case 124: goto L5d4;
                case 125: goto L61e;
                case 126: goto L5d4;
                case 127: goto L5e3;
                case 128: goto L5d4;
                case 129: goto L5e3;
                case 130: goto L5d4;
                case 131: goto L5e3;
                case 132: goto L634;
                case 133: goto L63f;
                case 134: goto L655;
                case 135: goto L664;
                case 136: goto L5d4;
                case 137: goto L5f9;
                case 138: goto L3cc;
                case 139: goto L67a;
                case 140: goto L63f;
                case 141: goto L664;
                case 142: goto L5d4;
                case 143: goto L3b6;
                case 144: goto L5f9;
                case 145: goto L354;
                case 146: goto L354;
                case 147: goto L354;
                case 148: goto L689;
                case 149: goto L5d4;
                case 150: goto L5d4;
                case 151: goto L689;
                case 152: goto L689;
                case 153: goto L4ad;
                case 154: goto L4ad;
                case 155: goto L4ad;
                case 156: goto L4ad;
                case 157: goto L4ad;
                case 158: goto L4ad;
                case 159: goto L4b5;
                case 160: goto L4b5;
                case 161: goto L4b5;
                case 162: goto L4b5;
                case 163: goto L4b5;
                case 164: goto L4b5;
                case 165: goto L4b5;
                case 166: goto L4b5;
                case 167: goto L354;
                case 168: goto L7b7;
                case 169: goto L7b7;
                case 170: goto L4ad;
                case 171: goto L4ad;
                case 172: goto L4ad;
                case 173: goto L4b5;
                case 174: goto L4ad;
                case 175: goto L4b5;
                case 176: goto L4ad;
                case 177: goto L354;
                case 178: goto L698;
                case 179: goto L6a0;
                case 180: goto L6a8;
                case 181: goto L6b5;
                case 182: goto L7b7;
                case 183: goto L7b7;
                case 184: goto L7b7;
                case 185: goto L7b7;
                case 186: goto L7b7;
                case 187: goto L6c2;
                case 188: goto L6d3;
                case 189: goto L774;
                case 190: goto L67a;
                case 191: goto L4ad;
                case 192: goto L797;
                case 193: goto L67a;
                case 194: goto L4ad;
                case 195: goto L4ad;
                case 196: goto L7b7;
                case 197: goto L7aa;
                case 198: goto L4ad;
                case 199: goto L4ad;
                default: goto L7b7;
            }
        L354:
            goto L7d3
        L357:
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.NULL
            r0.push(r1)
            goto L7d3
        L361:
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            r0.push(r1)
            goto L7d3
        L36b:
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L37c:
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            r0.push(r1)
            goto L7d3
        L386:
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L397:
            r0 = r5
            r1 = r5
            r2 = r7
            java.lang.Object r1 = r1.get(r2)
            r0.push(r1)
            goto L7d3
        L3a3:
            r0 = r5
            r1 = r5
            r2 = r7
            java.lang.Object r1 = r1.get(r2)
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L3b6:
            r0 = r5
            r1 = 2
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L3cc:
            r0 = r5
            r1 = 2
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L3e2:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L405
            r0 = r5
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            r0.pushDescriptor(r1)
            goto L7d3
        L405:
            r0 = r9
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.NULL
            if (r0 != r1) goto L416
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L416:
            r0 = r5
            java.lang.String r1 = "java/lang/Object"
            r0.push(r1)
            goto L7d3
        L420:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            r1 = r7
            r2 = r9
            r0.set(r1, r2)
            r0 = r7
            if (r0 <= 0) goto L7d3
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            r10 = r0
            r0 = r10
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto L44a
            r0 = r10
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L7d3
        L44a:
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.TOP
            r0.set(r1, r2)
            goto L7d3
        L457:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            r1 = r7
            r2 = r9
            r0.set(r1, r2)
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.TOP
            r0.set(r1, r2)
            r0 = r7
            if (r0 <= 0) goto L7d3
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            r10 = r0
            r0 = r10
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto L490
            r0 = r10
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L7d3
        L490:
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.TOP
            r0.set(r1, r2)
            goto L7d3
        L49d:
            r0 = r5
            r1 = 3
            r0.pop(r1)
            goto L7d3
        L4a5:
            r0 = r5
            r1 = 4
            r0.pop(r1)
            goto L7d3
        L4ad:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            goto L7d3
        L4b5:
            r0 = r5
            r1 = 2
            r0.pop(r1)
            goto L7d3
        L4bd:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L4d2:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r10 = r0
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L4f3:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r10 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r11 = r0
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r11
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L520:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r10 = r0
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L547:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r10 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r11 = r0
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r11
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L57a:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r10 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r11 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r12 = r0
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r12
            r0.push(r1)
            r0 = r5
            r1 = r11
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            goto L7d3
        L5b9:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r10 = r0
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            goto L7d3
        L5d4:
            r0 = r5
            r1 = 2
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            r0.push(r1)
            goto L7d3
        L5e3:
            r0 = r5
            r1 = 4
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L5f9:
            r0 = r5
            r1 = 2
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            r0.push(r1)
            goto L7d3
        L608:
            r0 = r5
            r1 = 4
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L61e:
            r0 = r5
            r1 = 3
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L634:
            r0 = r5
            r1 = r7
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.INTEGER
            r0.set(r1, r2)
            goto L7d3
        L63f:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L655:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.FLOAT
            r0.push(r1)
            goto L7d3
        L664:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            r0.push(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.TOP
            r0.push(r1)
            goto L7d3
        L67a:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            r0.push(r1)
            goto L7d3
        L689:
            r0 = r5
            r1 = 4
            r0.pop(r1)
            r0 = r5
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.INTEGER
            r0.push(r1)
            goto L7d3
        L698:
            r0 = r5
            r1 = r8
            r0.pushDescriptor(r1)
            goto L7d3
        L6a0:
            r0 = r5
            r1 = r8
            r0.pop(r1)
            goto L7d3
        L6a8:
            r0 = r5
            r1 = 1
            r0.pop(r1)
            r0 = r5
            r1 = r8
            r0.pushDescriptor(r1)
            goto L7d3
        L6b5:
            r0 = r5
            r1 = r8
            r0.pop(r1)
            r0 = r5
            java.lang.Object r0 = r0.pop()
            goto L7d3
        L6c2:
            r0 = r5
            r1 = r5
            java.util.List<org.objectweb.asm.Label> r1 = r1.labels
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            r0.push(r1)
            goto L7d3
        L6d3:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r0 = r7
            switch(r0) {
                case 4: goto L708;
                case 5: goto L712;
                case 6: goto L73a;
                case 7: goto L744;
                case 8: goto L71c;
                case 9: goto L726;
                case 10: goto L730;
                case 11: goto L74e;
                default: goto L758;
            }
        L708:
            r0 = r5
            java.lang.String r1 = "[Z"
            r0.pushDescriptor(r1)
            goto L7d3
        L712:
            r0 = r5
            java.lang.String r1 = "[C"
            r0.pushDescriptor(r1)
            goto L7d3
        L71c:
            r0 = r5
            java.lang.String r1 = "[B"
            r0.pushDescriptor(r1)
            goto L7d3
        L726:
            r0 = r5
            java.lang.String r1 = "[S"
            r0.pushDescriptor(r1)
            goto L7d3
        L730:
            r0 = r5
            java.lang.String r1 = "[I"
            r0.pushDescriptor(r1)
            goto L7d3
        L73a:
            r0 = r5
            java.lang.String r1 = "[F"
            r0.pushDescriptor(r1)
            goto L7d3
        L744:
            r0 = r5
            java.lang.String r1 = "[D"
            r0.pushDescriptor(r1)
            goto L7d3
        L74e:
            r0 = r5
            java.lang.String r1 = "[J"
            r0.pushDescriptor(r1)
            goto L7d3
        L758:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid array type "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L774:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getObjectType(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.pushDescriptor(r1)
            goto L7d3
        L797:
            r0 = r5
            java.lang.Object r0 = r0.pop()
            r0 = r5
            r1 = r8
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            java.lang.String r1 = r1.getDescriptor()
            r0.pushDescriptor(r1)
            goto L7d3
        L7aa:
            r0 = r5
            r1 = r7
            r0.pop(r1)
            r0 = r5
            r1 = r8
            r0.pushDescriptor(r1)
            goto L7d3
        L7b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid opcode "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L7d3:
            r0 = r5
            r1 = 0
            r0.labels = r1
            return
    }
}
