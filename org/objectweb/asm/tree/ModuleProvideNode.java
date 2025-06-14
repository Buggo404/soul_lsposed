package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/ModuleProvideNode.SCL.lombok */
public class ModuleProvideNode {
    public java.lang.String service;
    public java.util.List<java.lang.String> providers;

    public ModuleProvideNode(java.lang.String r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.service = r1
            r0 = r3
            r1 = r5
            r0.providers = r1
            return
    }

    public void accept(org.objectweb.asm.ModuleVisitor r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.service
            r2 = r5
            java.util.List<java.lang.String> r2 = r2.providers
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.visitProvide(r1, r2)
            return
    }
}
