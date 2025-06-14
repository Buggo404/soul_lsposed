package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Edge.SCL.lombok */
final class Edge {
    static final int JUMP = 0;
    static final int EXCEPTION = Integer.MAX_VALUE;
    final int info;
    final org.objectweb.asm.Label successor;
    org.objectweb.asm.Edge nextEdge;

    Edge(int r4, org.objectweb.asm.Label r5, org.objectweb.asm.Edge r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.info = r1
            r0 = r3
            r1 = r5
            r0.successor = r1
            r0 = r3
            r1 = r6
            r0.nextEdge = r1
            return
    }
}
