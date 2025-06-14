package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/InvokeDynamicInsnNode.SCL.lombok */
public class InvokeDynamicInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String name;
    public java.lang.String desc;
    public org.objectweb.asm.Handle bsm;
    public java.lang.Object[] bsmArgs;

    public InvokeDynamicInsnNode(java.lang.String r4, java.lang.String r5, org.objectweb.asm.Handle r6, java.lang.Object... r7) {
            r3 = this;
            r0 = r3
            r1 = 186(0xba, float:2.6E-43)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.desc = r1
            r0 = r3
            r1 = r6
            r0.bsm = r1
            r0 = r3
            r1 = r7
            r0.bsmArgs = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 6
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r7) {
            r6 = this;
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.name
            r2 = r6
            java.lang.String r2 = r2.desc
            r3 = r6
            org.objectweb.asm.Handle r3 = r3.bsm
            r4 = r6
            java.lang.Object[] r4 = r4.bsmArgs
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r8) {
            r7 = this;
            org.objectweb.asm.tree.InvokeDynamicInsnNode r0 = new org.objectweb.asm.tree.InvokeDynamicInsnNode
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.name
            r3 = r7
            java.lang.String r3 = r3.desc
            r4 = r7
            org.objectweb.asm.Handle r4 = r4.bsm
            r5 = r7
            java.lang.Object[] r5 = r5.bsmArgs
            r1.<init>(r2, r3, r4, r5)
            r1 = r7
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
