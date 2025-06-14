package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/ModuleOpenNode.SCL.lombok */
public class ModuleOpenNode {
    public java.lang.String packaze;
    public int access;
    public java.util.List<java.lang.String> modules;

    public ModuleOpenNode(java.lang.String r4, int r5, java.util.List<java.lang.String> r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.packaze = r1
            r0 = r3
            r1 = r5
            r0.access = r1
            r0 = r3
            r1 = r6
            r0.modules = r1
            return
    }

    public void accept(org.objectweb.asm.ModuleVisitor r7) {
            r6 = this;
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.packaze
            r2 = r6
            int r2 = r2.access
            r3 = r6
            java.util.List<java.lang.String> r3 = r3.modules
            if (r3 != 0) goto L14
            r3 = 0
            goto L24
        L14:
            r3 = r6
            java.util.List<java.lang.String> r3 = r3.modules
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
        L24:
            r0.visitOpen(r1, r2, r3)
            return
    }
}
