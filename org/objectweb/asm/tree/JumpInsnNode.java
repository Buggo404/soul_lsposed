package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/JumpInsnNode.SCL.lombok */
public class JumpInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public org.objectweb.asm.tree.LabelNode label;

    public JumpInsnNode(int r4, org.objectweb.asm.tree.LabelNode r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.label = r1
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
            r0 = 7
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.opcode
            r2 = r4
            org.objectweb.asm.tree.LabelNode r2 = r2.label
            org.objectweb.asm.Label r2 = r2.getLabel()
            r0.visitJumpInsn(r1, r2)
            r0 = r4
            r1 = r5
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r7) {
            r6 = this;
            org.objectweb.asm.tree.JumpInsnNode r0 = new org.objectweb.asm.tree.JumpInsnNode
            r1 = r0
            r2 = r6
            int r2 = r2.opcode
            r3 = r6
            org.objectweb.asm.tree.LabelNode r3 = r3.label
            r4 = r7
            org.objectweb.asm.tree.LabelNode r3 = clone(r3, r4)
            r1.<init>(r2, r3)
            r1 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
