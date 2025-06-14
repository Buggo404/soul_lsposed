package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/MethodVisitor.SCL.lombok */
public abstract class MethodVisitor {
    private static final java.lang.String REQUIRES_ASM5 = "This feature requires ASM5";
    protected final int api;

    /* renamed from: mv */
    protected org.objectweb.asm.MethodVisitor f626mv;

    protected MethodVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    protected MethodVisitor(int r6, org.objectweb.asm.MethodVisitor r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 == r1) goto L49
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported api "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L49:
            r0 = r6
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 != r1) goto L53
            r0 = r5
            org.objectweb.asm.Constants.checkAsmExperimental(r0)
        L53:
            r0 = r5
            r1 = r6
            r0.api = r1
            r0 = r5
            r1 = r7
            r0.f626mv = r1
            return
    }

    public org.objectweb.asm.MethodVisitor getDelegate() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            return r0
    }

    public void visitParameter(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L23
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitParameter(r1, r2)
        L23:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto Lf
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotationDefault()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L11
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotation(r1, r2)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L27
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitTypeAnnotation(r1, r2, r3, r4)
            return r0
        L27:
            r0 = 0
            return r0
    }

    public void visitAnnotableParameterCount(int r5, boolean r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitAnnotableParameterCount(r1, r2)
        L10:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r6, java.lang.String r7, boolean r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L12
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = r7
            r3 = r8
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitParameterAnnotation(r1, r2, r3)
            return r0
        L12:
            r0 = 0
            return r0
    }

    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitAttribute(r1)
        Lf:
            return
    }

    public void visitCode() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r0.visitCode()
        Le:
            return
    }

    public void visitFrame(int r8, int r9, java.lang.Object[] r10, int r11, java.lang.Object[] r12) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L15
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.visitFrame(r1, r2, r3, r4, r5)
        L15:
            return
    }

    public void visitInsn(int r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitInsn(r1)
        Lf:
            return
    }

    public void visitIntInsn(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitIntInsn(r1, r2)
        L10:
            return
    }

    public void visitVarInsn(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitVarInsn(r1, r2)
        L10:
            return
    }

    public void visitTypeInsn(int r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitTypeInsn(r1, r2)
        L10:
            return
    }

    public void visitFieldInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L13
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitFieldInsn(r1, r2, r3, r4)
        L13:
            return
    }

    @java.lang.Deprecated
    public void visitMethodInsn(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r9
            r1 = r8
            int r1 = r1.api
            r2 = 327680(0x50000, float:4.59177E-40)
            if (r1 >= r2) goto L10
            r1 = 256(0x100, float:3.59E-43)
            goto L11
        L10:
            r1 = 0
        L11:
            r0 = r0 | r1
            r13 = r0
            r0 = r8
            r1 = r13
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = 185(0xb9, float:2.59E-43)
            if (r5 != r6) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = 0
        L27:
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void visitMethodInsn(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L36
            r0 = r8
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L36
            r0 = r12
            r1 = r8
            r2 = 185(0xb9, float:2.59E-43)
            if (r1 != r2) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r0 == r1) goto L2c
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "INVOKESPECIAL/STATIC on interfaces requires ASM5"
            r1.<init>(r2)
            throw r0
        L2c:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.visitMethodInsn(r1, r2, r3, r4)
            return
        L36:
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L4f
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r8
            r2 = -257(0xfffffffffffffeff, float:NaN)
            r1 = r1 & r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        L4f:
            return
    }

    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L26
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
        L26:
            return
    }

    public void visitJumpInsn(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitJumpInsn(r1, r2)
        L10:
            return
    }

    public void visitLabel(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLabel(r1)
        Lf:
            return
    }

    public void visitLdcInsn(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L2d
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 != 0) goto L23
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L2d
            r0 = r5
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            int r0 = r0.getSort()
            r1 = 11
            if (r0 != r1) goto L2d
        L23:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r4
            int r0 = r0.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L47
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L47
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM7"
            r1.<init>(r2)
            throw r0
        L47:
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L56
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r0.visitLdcInsn(r1)
        L56:
            return
    }

    public void visitIincInsn(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitIincInsn(r1, r2)
        L10:
            return
    }

    public void visitTableSwitchInsn(int r7, int r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label... r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L13
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitTableSwitchInsn(r1, r2, r3, r4)
        L13:
            return
    }

    public void visitLookupSwitchInsn(org.objectweb.asm.Label r6, int[] r7, org.objectweb.asm.Label[] r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L11
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitLookupSwitchInsn(r1, r2, r3)
        L11:
            return
    }

    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitMultiANewArrayInsn(r1, r2)
        L10:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L27
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitInsnAnnotation(r1, r2, r3, r4)
            return r0
        L27:
            r0 = 0
            return r0
    }

    public void visitTryCatchBlock(org.objectweb.asm.Label r7, org.objectweb.asm.Label r8, org.objectweb.asm.Label r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L13
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitTryCatchBlock(r1, r2, r3, r4)
        L13:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L27
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitTryCatchAnnotation(r1, r2, r3, r4)
            return r0
        L27:
            r0 = 0
            return r0
    }

    public void visitLocalVariable(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.objectweb.asm.Label r12, org.objectweb.asm.Label r13, int r14) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L17
            r0 = r8
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
        L17:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int r10, org.objectweb.asm.TypePath r11, org.objectweb.asm.Label[] r12, org.objectweb.asm.Label[] r13, int[] r14, java.lang.String r15, boolean r16) {
            r9 = this;
            r0 = r9
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r9
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L2d
            r0 = r9
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitLocalVariableAnnotation(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L2d:
            r0 = 0
            return r0
    }

    public void visitLineNumber(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitLineNumber(r1, r2)
        L10:
            return
    }

    public void visitMaxs(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitMaxs(r1, r2)
        L10:
            return
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r0.visitEnd()
        Le:
            return
    }
}
