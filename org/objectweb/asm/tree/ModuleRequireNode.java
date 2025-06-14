package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/ModuleRequireNode.SCL.lombok */
public class ModuleRequireNode {
    public java.lang.String module;
    public int access;
    public java.lang.String version;

    public ModuleRequireNode(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.module = r1
            r0 = r3
            r1 = r5
            r0.access = r1
            r0 = r3
            r1 = r6
            r0.version = r1
            return
    }

    public void accept(org.objectweb.asm.ModuleVisitor r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.module
            r2 = r5
            int r2 = r2.access
            r3 = r5
            java.lang.String r3 = r3.version
            r0.visitRequire(r1, r2, r3)
            return
    }
}
