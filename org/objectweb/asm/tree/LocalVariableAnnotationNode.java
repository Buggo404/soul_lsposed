package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/LocalVariableAnnotationNode.SCL.lombok */
public class LocalVariableAnnotationNode extends org.objectweb.asm.tree.TypeAnnotationNode {
    public java.util.List<org.objectweb.asm.tree.LabelNode> start;
    public java.util.List<org.objectweb.asm.tree.LabelNode> end;
    public java.util.List<java.lang.Integer> index;

    public LocalVariableAnnotationNode(int r10, org.objectweb.asm.TypePath r11, org.objectweb.asm.tree.LabelNode[] r12, org.objectweb.asm.tree.LabelNode[] r13, int[] r14, java.lang.String r15) {
            r9 = this;
            r0 = r9
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public LocalVariableAnnotationNode(int r7, int r8, org.objectweb.asm.TypePath r9, org.objectweb.asm.tree.LabelNode[] r10, org.objectweb.asm.tree.LabelNode[] r11, int[] r12, java.lang.String r13) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r13
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.start = r1
            r0 = r6
            r1 = r11
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.end = r1
            r0 = r6
            r1 = r12
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.index = r1
            return
    }

    public void accept(org.objectweb.asm.MethodVisitor r11, boolean r12) {
            r10 = this;
            r0 = r10
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.start
            int r0 = r0.size()
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r13 = r0
            r0 = r10
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.end
            int r0 = r0.size()
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r14 = r0
            r0 = r10
            java.util.List<java.lang.Integer> r0 = r0.index
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r13
            int r0 = r0.length
            r17 = r0
        L2f:
            r0 = r16
            r1 = r17
            if (r0 >= r1) goto L7d
            r0 = r13
            r1 = r16
            r2 = r10
            java.util.List<org.objectweb.asm.tree.LabelNode> r2 = r2.start
            r3 = r16
            java.lang.Object r2 = r2.get(r3)
            org.objectweb.asm.tree.LabelNode r2 = (org.objectweb.asm.tree.LabelNode) r2
            org.objectweb.asm.Label r2 = r2.getLabel()
            r0[r1] = r2
            r0 = r14
            r1 = r16
            r2 = r10
            java.util.List<org.objectweb.asm.tree.LabelNode> r2 = r2.end
            r3 = r16
            java.lang.Object r2 = r2.get(r3)
            org.objectweb.asm.tree.LabelNode r2 = (org.objectweb.asm.tree.LabelNode) r2
            org.objectweb.asm.Label r2 = r2.getLabel()
            r0[r1] = r2
            r0 = r15
            r1 = r16
            r2 = r10
            java.util.List<java.lang.Integer> r2 = r2.index
            r3 = r16
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r16 = r16 + 1
            goto L2f
        L7d:
            r0 = r10
            r1 = r11
            r2 = r10
            int r2 = r2.typeRef
            r3 = r10
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r10
            java.lang.String r7 = r7.desc
            r8 = r12
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitLocalVariableAnnotation(r2, r3, r4, r5, r6, r7, r8)
            r0.accept(r1)
            return
    }
}
