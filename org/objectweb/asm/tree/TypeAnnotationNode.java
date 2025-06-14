package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/TypeAnnotationNode.SCL.lombok */
public class TypeAnnotationNode extends org.objectweb.asm.tree.AnnotationNode {
    public int typeRef;
    public org.objectweb.asm.TypePath typePath;

    public TypeAnnotationNode(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.TypeAnnotationNode> r1 = org.objectweb.asm.tree.TypeAnnotationNode.class
            if (r0 == r1) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1a:
            return
    }

    public TypeAnnotationNode(int r5, int r6, org.objectweb.asm.TypePath r7, java.lang.String r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r8
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.typeRef = r1
            r0 = r4
            r1 = r7
            r0.typePath = r1
            return
    }
}
