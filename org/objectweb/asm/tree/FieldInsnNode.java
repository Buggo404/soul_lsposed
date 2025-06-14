package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/FieldInsnNode.SCL.lombok */
public class FieldInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String owner;
    public java.lang.String name;
    public java.lang.String desc;

    public FieldInsnNode(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
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
            r0 = 4
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r7) {
            r6 = this;
            r0 = r7
            r1 = r6
            int r1 = r1.opcode
            r2 = r6
            java.lang.String r2 = r2.owner
            r3 = r6
            java.lang.String r3 = r3.name
            r4 = r6
            java.lang.String r4 = r4.desc
            r0.visitFieldInsn(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r8) {
            r7 = this;
            org.objectweb.asm.tree.FieldInsnNode r0 = new org.objectweb.asm.tree.FieldInsnNode
            r1 = r0
            r2 = r7
            int r2 = r2.opcode
            r3 = r7
            java.lang.String r3 = r3.owner
            r4 = r7
            java.lang.String r4 = r4.name
            r5 = r7
            java.lang.String r5 = r5.desc
            r1.<init>(r2, r3, r4, r5)
            r1 = r7
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
