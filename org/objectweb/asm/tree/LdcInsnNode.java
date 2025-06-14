package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/LdcInsnNode.SCL.lombok */
public class LdcInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.Object cst;

    public LdcInsnNode(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = 18
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.cst = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 9
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.Object r1 = r1.cst
            r0.visitLdcInsn(r1)
            r0 = r3
            r1 = r4
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r5) {
            r4 = this;
            org.objectweb.asm.tree.LdcInsnNode r0 = new org.objectweb.asm.tree.LdcInsnNode
            r1 = r0
            r2 = r4
            java.lang.Object r2 = r2.cst
            r1.<init>(r2)
            r1 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
