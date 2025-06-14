package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/CodeSizeEvaluator.SCL.lombok */
public class CodeSizeEvaluator extends org.objectweb.asm.MethodVisitor implements org.objectweb.asm.Opcodes {
    private int minSize;
    private int maxSize;

    public CodeSizeEvaluator(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    protected CodeSizeEvaluator(int r5, org.objectweb.asm.MethodVisitor r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public int getMinSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.minSize
            return r0
    }

    public int getMaxSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxSize
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 1
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 1
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r4
            r1 = r5
            super.visitInsn(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r5, int r6) {
            r4 = this;
            r0 = r5
            r1 = 17
            if (r0 != r1) goto L1d
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L31
        L1d:
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 2
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 2
            int r1 = r1 + r2
            r0.maxSize = r1
        L31:
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitIntInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r5, int r6) {
            r4 = this;
            r0 = r6
            r1 = 4
            if (r0 >= r1) goto L23
            r0 = r5
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 == r1) goto L23
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 1
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 1
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L55
        L23:
            r0 = r6
            r1 = 256(0x100, float:3.59E-43)
            if (r0 < r1) goto L41
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 4
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 4
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L55
        L41:
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 2
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 2
            int r1 = r1 + r2
            r0.maxSize = r1
        L55:
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitVarInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitTypeInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r6
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitFieldInsn(r1, r2, r3, r4)
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
            r0 = r8
            r1 = -257(0xfffffffffffffeff, float:NaN)
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L43
            r0 = r7
            r1 = r0
            int r1 = r1.minSize
            r2 = 5
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r7
            r1 = r0
            int r1 = r1.maxSize
            r2 = 5
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L57
        L43:
            r0 = r7
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r7
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
        L57:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.minSize
            r2 = 5
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r6
            r1 = r0
            int r1 = r1.maxSize
            r2 = 5
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r5
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L18
            r0 = r5
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L25
        L18:
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 5
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L30
        L25:
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 8
            int r1 = r1 + r2
            r0.maxSize = r1
        L30:
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitJumpInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L20
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 != 0) goto L20
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L37
            r0 = r5
            org.objectweb.asm.ConstantDynamic r0 = (org.objectweb.asm.ConstantDynamic) r0
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L37
        L20:
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L4b
        L37:
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 2
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
        L4b:
            r0 = r4
            r1 = r5
            super.visitLdcInsn(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r5, int r6) {
            r4 = this;
            r0 = r5
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L13
            r0 = r6
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L13
            r0 = r6
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r0 >= r1) goto L2c
        L13:
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 6
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 6
            int r1 = r1 + r2
            r0.maxSize = r1
            goto L40
        L2c:
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 3
            int r1 = r1 + r2
            r0.maxSize = r1
        L40:
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitIincInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r7, int r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label... r10) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.minSize
            r2 = 13
            r3 = r10
            int r3 = r3.length
            r4 = 4
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r6
            r1 = r0
            int r1 = r1.maxSize
            r2 = 16
            r3 = r10
            int r3 = r3.length
            r4 = 4
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitTableSwitchInsn(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r7, int[] r8, org.objectweb.asm.Label[] r9) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.minSize
            r2 = 9
            r3 = r8
            int r3 = r3.length
            r4 = 8
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r6
            r1 = r0
            int r1 = r1.maxSize
            r2 = 12
            r3 = r8
            int r3 = r3.length
            r4 = 8
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            super.visitLookupSwitchInsn(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.minSize
            r2 = 4
            int r1 = r1 + r2
            r0.minSize = r1
            r0 = r4
            r1 = r0
            int r1 = r1.maxSize
            r2 = 4
            int r1 = r1 + r2
            r0.maxSize = r1
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitMultiANewArrayInsn(r1, r2)
            return
    }
}
