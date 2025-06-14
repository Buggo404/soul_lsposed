package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/LocalVariableNode.SCL.lombok */
public class LocalVariableNode {
    public java.lang.String name;
    public java.lang.String desc;
    public java.lang.String signature;
    public org.objectweb.asm.tree.LabelNode start;
    public org.objectweb.asm.tree.LabelNode end;
    public int index;

    public LocalVariableNode(java.lang.String r4, java.lang.String r5, java.lang.String r6, org.objectweb.asm.tree.LabelNode r7, org.objectweb.asm.tree.LabelNode r8, int r9) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.desc = r1
            r0 = r3
            r1 = r6
            r0.signature = r1
            r0 = r3
            r1 = r7
            r0.start = r1
            r0 = r3
            r1 = r8
            r0.end = r1
            r0 = r3
            r1 = r9
            r0.index = r1
            return
    }

    public void accept(org.objectweb.asm.MethodVisitor r9) {
            r8 = this;
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.name
            r2 = r8
            java.lang.String r2 = r2.desc
            r3 = r8
            java.lang.String r3 = r3.signature
            r4 = r8
            org.objectweb.asm.tree.LabelNode r4 = r4.start
            org.objectweb.asm.Label r4 = r4.getLabel()
            r5 = r8
            org.objectweb.asm.tree.LabelNode r5 = r5.end
            org.objectweb.asm.Label r5 = r5.getLabel()
            r6 = r8
            int r6 = r6.index
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            return
    }
}
