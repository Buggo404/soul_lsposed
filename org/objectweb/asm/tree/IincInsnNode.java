package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/IincInsnNode.SCL.lombok */
public class IincInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int var;
    public int incr;

    public IincInsnNode(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = 132(0x84, float:1.85E-43)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.var = r1
            r0 = r3
            r1 = r5
            r0.incr = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 10
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.var
            r2 = r4
            int r2 = r2.incr
            r0.visitIincInsn(r1, r2)
            r0 = r4
            r1 = r5
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r6) {
            r5 = this;
            org.objectweb.asm.tree.IincInsnNode r0 = new org.objectweb.asm.tree.IincInsnNode
            r1 = r0
            r2 = r5
            int r2 = r2.var
            r3 = r5
            int r3 = r3.incr
            r1.<init>(r2, r3)
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
