package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/ParameterNode.SCL.lombok */
public class ParameterNode {
    public java.lang.String name;
    public int access;

    public ParameterNode(java.lang.String r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.access = r1
            return
    }

    public void accept(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.name
            r2 = r4
            int r2 = r2.access
            r0.visitParameter(r1, r2)
            return
    }
}
