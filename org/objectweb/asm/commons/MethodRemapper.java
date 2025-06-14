package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/MethodRemapper.SCL.lombok */
public class MethodRemapper extends org.objectweb.asm.MethodVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;

    public MethodRemapper(org.objectweb.asm.MethodVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r5 = this;
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    protected MethodRemapper(int r5, org.objectweb.asm.MethodVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.remapper = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
            r4 = this;
            r0 = r4
            org.objectweb.asm.AnnotationVisitor r0 = super.visitAnnotationDefault()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = r5
            goto L13
        Ld:
            r0 = r4
            r1 = 0
            r2 = r5
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L13:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapDesc(r2)
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = super.visitAnnotation(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L16
            r0 = r7
            goto L1c
        L16:
            r0 = r4
            r1 = r5
            r2 = r7
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L1c:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r6
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r9
            java.lang.String r3 = r3.mapDesc(r4)
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = super.visitTypeAnnotation(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1c
            r0 = r11
            goto L23
        L1c:
            r0 = r6
            r1 = r9
            r2 = r11
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L23:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r6, java.lang.String r7, boolean r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r7
            java.lang.String r2 = r2.mapDesc(r3)
            r3 = r8
            org.objectweb.asm.AnnotationVisitor r0 = super.visitParameterAnnotation(r1, r2, r3)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1a
            r0 = r9
            goto L21
        L1a:
            r0 = r5
            r1 = r7
            r2 = r9
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L21:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int r10, int r11, java.lang.Object[] r12, int r13, java.lang.Object[] r14) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r9
            r4 = r11
            r5 = r12
            java.lang.Object[] r3 = r3.remapFrameTypes(r4, r5)
            r4 = r13
            r5 = r9
            r6 = r13
            r7 = r14
            java.lang.Object[] r5 = r5.remapFrameTypes(r6, r7)
            super.visitFrame(r1, r2, r3, r4, r5)
            return
    }

    private java.lang.Object[] remapFrameTypes(int r7, java.lang.Object[] r8) {
            r6 = this;
            r0 = r8
            if (r0 != 0) goto L6
            r0 = r8
            return r0
        L6:
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        Lb:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L44
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L3e
            r0 = r9
            if (r0 != 0) goto L2c
            r0 = r7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9 = r0
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L2c:
            r0 = r9
            r1 = r10
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r8
            r4 = r10
            r3 = r3[r4]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = r2.mapType(r3)
            r0[r1] = r2
        L3e:
            int r10 = r10 + 1
            goto Lb
        L44:
            r0 = r9
            if (r0 != 0) goto L4c
            r0 = r8
            goto L4d
        L4c:
            r0 = r9
        L4d:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r8
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r10
            java.lang.String r2 = r2.mapType(r3)
            r3 = r8
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r3 = r3.mapFieldName(r4, r5, r6)
            r4 = r8
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r5 = r12
            java.lang.String r4 = r4.mapDesc(r5)
            super.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            r8 = this;
            r0 = r8
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L1d
            r0 = r9
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
        L1d:
            r0 = r8
            r1 = r9
            r2 = r8
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r10
            java.lang.String r2 = r2.mapType(r3)
            r3 = r8
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r3 = r3.mapMethodName(r4, r5, r6)
            r4 = r8
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r5 = r12
            java.lang.String r4 = r4.mapMethodDesc(r5)
            r5 = r13
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r10
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r11 = r0
            r0 = 0
            r12 = r0
        Lb:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L2a
            r0 = r11
            r1 = r12
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r10
            r4 = r12
            r3 = r3[r4]
            java.lang.Object r2 = r2.mapValue(r3)
            r0[r1] = r2
            int r12 = r12 + 1
            goto Lb
        L2a:
            r0 = r6
            r1 = r6
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r7
            r3 = r8
            java.lang.String r1 = r1.mapInvokeDynamicMethodName(r2, r3)
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r8
            java.lang.String r2 = r2.mapMethodDesc(r3)
            r3 = r6
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r9
            java.lang.Object r3 = r3.mapValue(r4)
            org.objectweb.asm.Handle r3 = (org.objectweb.asm.Handle) r3
            r4 = r11
            super.visitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r7
            java.lang.String r2 = r2.mapType(r3)
            super.visitTypeInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.Object r1 = r1.mapValue(r2)
            super.visitLdcInsn(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapDesc(r2)
            r2 = r6
            super.visitMultiANewArrayInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r6
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r9
            java.lang.String r3 = r3.mapDesc(r4)
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = super.visitInsnAnnotation(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1c
            r0 = r11
            goto L23
        L1c:
            r0 = r6
            r1 = r9
            r2 = r11
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L23:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label r10, java.lang.String r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            if (r4 != 0) goto Ld
            r4 = 0
            goto L16
        Ld:
            r4 = r7
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r5 = r11
            java.lang.String r4 = r4.mapType(r5)
        L16:
            super.visitTryCatchBlock(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r6
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r9
            java.lang.String r3 = r3.mapDesc(r4)
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = super.visitTryCatchAnnotation(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1c
            r0 = r11
            goto L23
        L1c:
            r0 = r6
            r1 = r9
            r2 = r11
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L23:
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.objectweb.asm.Label r12, org.objectweb.asm.Label r13, int r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r8
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r10
            java.lang.String r2 = r2.mapDesc(r3)
            r3 = r8
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r11
            r5 = 1
            java.lang.String r3 = r3.mapSignature(r4, r5)
            r4 = r12
            r5 = r13
            r6 = r14
            super.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int r10, org.objectweb.asm.TypePath r11, org.objectweb.asm.Label[] r12, org.objectweb.asm.Label[] r13, int[] r14, java.lang.String r15, boolean r16) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r9
            org.objectweb.asm.commons.Remapper r6 = r6.remapper
            r7 = r15
            java.lang.String r6 = r6.mapDesc(r7)
            r7 = r16
            org.objectweb.asm.AnnotationVisitor r0 = super.visitLocalVariableAnnotation(r1, r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L22
            r0 = r17
            goto L2a
        L22:
            r0 = r9
            r1 = r15
            r2 = r17
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L2a:
            return r0
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(org.objectweb.asm.AnnotationVisitor r8) {
            r7 = this;
            org.objectweb.asm.commons.AnnotationRemapper r0 = new org.objectweb.asm.commons.AnnotationRemapper
            r1 = r0
            r2 = r7
            int r2 = r2.api
            r3 = 0
            r4 = r8
            r5 = r7
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String r8, org.objectweb.asm.AnnotationVisitor r9) {
            r7 = this;
            org.objectweb.asm.commons.AnnotationRemapper r0 = new org.objectweb.asm.commons.AnnotationRemapper
            r1 = r0
            r2 = r7
            int r2 = r2.api
            r3 = r8
            r4 = r9
            r5 = r7
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r1.<init>(r2, r3, r4, r5)
            r1 = r7
            r2 = r9
            org.objectweb.asm.AnnotationVisitor r1 = r1.createAnnotationRemapper(r2)
            org.objectweb.asm.AnnotationVisitor r0 = r0.orDeprecatedValue(r1)
            return r0
    }
}
