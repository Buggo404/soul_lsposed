package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/MultiANewArrayInsnNode.SCL.lombok */
public class MultiANewArrayInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String desc;
    public int dims;

    public MultiANewArrayInsnNode(java.lang.String r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = 197(0xc5, float:2.76E-43)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.desc = r1
            r0 = r3
            r1 = r5
            r0.dims = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 13
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.desc
            r2 = r4
            int r2 = r2.dims
            r0.visitMultiANewArrayInsn(r1, r2)
            r0 = r4
            r1 = r5
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r6) {
            r5 = this;
            org.objectweb.asm.tree.MultiANewArrayInsnNode r0 = new org.objectweb.asm.tree.MultiANewArrayInsnNode
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.desc
            r3 = r5
            int r3 = r3.dims
            r1.<init>(r2, r3)
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
