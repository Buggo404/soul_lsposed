package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/InsnNode.SCL.lombok */
public class InsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public InsnNode(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.opcode
            r0.visitInsn(r1)
            r0 = r3
            r1 = r4
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r5) {
            r4 = this;
            org.objectweb.asm.tree.InsnNode r0 = new org.objectweb.asm.tree.InsnNode
            r1 = r0
            r2 = r4
            int r2 = r2.opcode
            r1.<init>(r2)
            r1 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
