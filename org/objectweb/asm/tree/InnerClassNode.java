package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/InnerClassNode.SCL.lombok */
public class InnerClassNode {
    public java.lang.String name;
    public java.lang.String outerName;
    public java.lang.String innerName;
    public int access;

    public InnerClassNode(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.outerName = r1
            r0 = r3
            r1 = r6
            r0.innerName = r1
            r0 = r3
            r1 = r7
            r0.access = r1
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r7) {
            r6 = this;
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.name
            r2 = r6
            java.lang.String r2 = r2.outerName
            r3 = r6
            java.lang.String r3 = r3.innerName
            r4 = r6
            int r4 = r4.access
            r0.visitInnerClass(r1, r2, r3, r4)
            return
    }
}
