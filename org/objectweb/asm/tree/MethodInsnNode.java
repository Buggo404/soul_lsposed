package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/MethodInsnNode.SCL.lombok */
public class MethodInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String owner;
    public java.lang.String name;
    public java.lang.String desc;
    public boolean itf;

    public MethodInsnNode(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = 185(0xb9, float:2.59E-43)
            if (r5 != r6) goto L11
            r5 = 1
            goto L12
        L11:
            r5 = 0
        L12:
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public MethodInsnNode(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.owner = r1
            r0 = r3
            r1 = r6
            r0.name = r1
            r0 = r3
            r1 = r7
            r0.desc = r1
            r0 = r3
            r1 = r8
            r0.itf = r1
            return
    }

    public void setOpcode(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.opcode = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 5
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r8) {
            r7 = this;
            r0 = r8
            r1 = r7
            int r1 = r1.opcode
            r2 = r7
            java.lang.String r2 = r2.owner
            r3 = r7
            java.lang.String r3 = r3.name
            r4 = r7
            java.lang.String r4 = r4.desc
            r5 = r7
            boolean r5 = r5.itf
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r8
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r9) {
            r8 = this;
            org.objectweb.asm.tree.MethodInsnNode r0 = new org.objectweb.asm.tree.MethodInsnNode
            r1 = r0
            r2 = r8
            int r2 = r2.opcode
            r3 = r8
            java.lang.String r3 = r3.owner
            r4 = r8
            java.lang.String r4 = r4.name
            r5 = r8
            java.lang.String r5 = r5.desc
            r6 = r8
            boolean r6 = r6.itf
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r8
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
