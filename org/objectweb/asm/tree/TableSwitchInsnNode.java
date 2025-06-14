package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/TableSwitchInsnNode.SCL.lombok */
public class TableSwitchInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int min;
    public int max;
    public org.objectweb.asm.tree.LabelNode dflt;
    public java.util.List<org.objectweb.asm.tree.LabelNode> labels;

    public TableSwitchInsnNode(int r4, int r5, org.objectweb.asm.tree.LabelNode r6, org.objectweb.asm.tree.LabelNode... r7) {
            r3 = this;
            r0 = r3
            r1 = 170(0xaa, float:2.38E-43)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.min = r1
            r0 = r3
            r1 = r5
            r0.max = r1
            r0 = r3
            r1 = r6
            r0.dflt = r1
            r0 = r3
            r1 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.labels = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 11
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r7) {
            r6 = this;
            r0 = r6
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            int r0 = r0.size()
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            int r0 = r0.length
            r10 = r0
        L13:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L32
            r0 = r8
            r1 = r9
            r2 = r6
            java.util.List<org.objectweb.asm.tree.LabelNode> r2 = r2.labels
            r3 = r9
            java.lang.Object r2 = r2.get(r3)
            org.objectweb.asm.tree.LabelNode r2 = (org.objectweb.asm.tree.LabelNode) r2
            org.objectweb.asm.Label r2 = r2.getLabel()
            r0[r1] = r2
            int r9 = r9 + 1
            goto L13
        L32:
            r0 = r7
            r1 = r6
            int r1 = r1.min
            r2 = r6
            int r2 = r2.max
            r3 = r6
            org.objectweb.asm.tree.LabelNode r3 = r3.dflt
            org.objectweb.asm.Label r3 = r3.getLabel()
            r4 = r8
            r0.visitTableSwitchInsn(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r9) {
            r8 = this;
            org.objectweb.asm.tree.TableSwitchInsnNode r0 = new org.objectweb.asm.tree.TableSwitchInsnNode
            r1 = r0
            r2 = r8
            int r2 = r2.min
            r3 = r8
            int r3 = r3.max
            r4 = r8
            org.objectweb.asm.tree.LabelNode r4 = r4.dflt
            r5 = r9
            org.objectweb.asm.tree.LabelNode r4 = clone(r4, r5)
            r5 = r8
            java.util.List<org.objectweb.asm.tree.LabelNode> r5 = r5.labels
            r6 = r9
            org.objectweb.asm.tree.LabelNode[] r5 = clone(r5, r6)
            r1.<init>(r2, r3, r4, r5)
            r1 = r8
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
