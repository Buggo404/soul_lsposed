package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/LineNumberNode.SCL.lombok */
public class LineNumberNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int line;
    public org.objectweb.asm.tree.LabelNode start;

    public LineNumberNode(int r4, org.objectweb.asm.tree.LabelNode r5) {
            r3 = this;
            r0 = r3
            r1 = -1
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.line = r1
            r0 = r3
            r1 = r5
            r0.start = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 15
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.line
            r2 = r4
            org.objectweb.asm.tree.LabelNode r2 = r2.start
            org.objectweb.asm.Label r2 = r2.getLabel()
            r0.visitLineNumber(r1, r2)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r7) {
            r6 = this;
            org.objectweb.asm.tree.LineNumberNode r0 = new org.objectweb.asm.tree.LineNumberNode
            r1 = r0
            r2 = r6
            int r2 = r2.line
            r3 = r6
            org.objectweb.asm.tree.LabelNode r3 = r3.start
            r4 = r7
            org.objectweb.asm.tree.LabelNode r3 = clone(r3, r4)
            r1.<init>(r2, r3)
            return r0
    }
}
