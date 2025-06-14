package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/LookupSwitchInsnNode.SCL.lombok */
public class LookupSwitchInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public org.objectweb.asm.tree.LabelNode dflt;
    public java.util.List<java.lang.Integer> keys;
    public java.util.List<org.objectweb.asm.tree.LabelNode> labels;

    public LookupSwitchInsnNode(org.objectweb.asm.tree.LabelNode r4, int[] r5, org.objectweb.asm.tree.LabelNode[] r6) {
            r3 = this;
            r0 = r3
            r1 = 171(0xab, float:2.4E-43)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.dflt = r1
            r0 = r3
            r1 = r5
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.keys = r1
            r0 = r3
            r1 = r6
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.labels = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 12
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r6) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.Integer> r0 = r0.keys
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            int r0 = r0.length
            r9 = r0
        L12:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L31
            r0 = r7
            r1 = r8
            r2 = r5
            java.util.List<java.lang.Integer> r2 = r2.keys
            r3 = r8
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r8 = r8 + 1
            goto L12
        L31:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            int r0 = r0.size()
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            int r0 = r0.length
            r10 = r0
        L45:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L67
            r0 = r8
            r1 = r9
            r2 = r5
            java.util.List<org.objectweb.asm.tree.LabelNode> r2 = r2.labels
            r3 = r9
            java.lang.Object r2 = r2.get(r3)
            org.objectweb.asm.tree.LabelNode r2 = (org.objectweb.asm.tree.LabelNode) r2
            org.objectweb.asm.Label r2 = r2.getLabel()
            r0[r1] = r2
            int r9 = r9 + 1
            goto L45
        L67:
            r0 = r6
            r1 = r5
            org.objectweb.asm.tree.LabelNode r1 = r1.dflt
            org.objectweb.asm.Label r1 = r1.getLabel()
            r2 = r7
            r3 = r8
            r0.visitLookupSwitchInsn(r1, r2, r3)
            r0 = r5
            r1 = r6
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r8) {
            r7 = this;
            org.objectweb.asm.tree.LookupSwitchInsnNode r0 = new org.objectweb.asm.tree.LookupSwitchInsnNode
            r1 = r0
            r2 = r7
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt
            r3 = r8
            org.objectweb.asm.tree.LabelNode r2 = clone(r2, r3)
            r3 = 0
            r4 = r7
            java.util.List<org.objectweb.asm.tree.LabelNode> r4 = r4.labels
            r5 = r8
            org.objectweb.asm.tree.LabelNode[] r4 = clone(r4, r5)
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            java.util.List<java.lang.Integer> r0 = r0.keys
            r1 = r7
            java.util.List<java.lang.Integer> r1 = r1.keys
            boolean r0 = r0.addAll(r1)
            r0 = r9
            r1 = r7
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
