package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/LabelNode.SCL.lombok */
public class LabelNode extends org.objectweb.asm.tree.AbstractInsnNode {
    private org.objectweb.asm.Label value;

    public LabelNode() {
            r3 = this;
            r0 = r3
            r1 = -1
            r0.<init>(r1)
            return
    }

    public LabelNode(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            r1 = -1
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.value = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 8
            return r0
    }

    public org.objectweb.asm.Label getLabel() {
            r4 = this;
            r0 = r4
            org.objectweb.asm.Label r0 = r0.value
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.Label r1 = new org.objectweb.asm.Label
            r2 = r1
            r2.<init>()
            r0.value = r1
        L12:
            r0 = r4
            org.objectweb.asm.Label r0 = r0.value
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.objectweb.asm.Label r1 = r1.getLabel()
            r0.visitLabel(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AbstractInsnNode r0 = (org.objectweb.asm.tree.AbstractInsnNode) r0
            return r0
    }

    public void resetLabel() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.value = r1
            return
    }
}
