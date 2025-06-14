package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/SourceValue.SCL.lombok */
public class SourceValue implements org.objectweb.asm.tree.analysis.Value {
    public final int size;
    public final java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> insns;

    public SourceValue(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            org.objectweb.asm.tree.analysis.SmallSet r2 = new org.objectweb.asm.tree.analysis.SmallSet
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    public SourceValue(int r6, org.objectweb.asm.tree.AbstractInsnNode r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.size = r1
            r0 = r5
            org.objectweb.asm.tree.analysis.SmallSet r1 = new org.objectweb.asm.tree.analysis.SmallSet
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.insns = r1
            return
    }

    public SourceValue(int r4, java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.size = r1
            r0 = r3
            r1 = r5
            r0.insns = r1
            return
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.size
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.tree.analysis.SourceValue
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            org.objectweb.asm.tree.analysis.SourceValue r0 = (org.objectweb.asm.tree.analysis.SourceValue) r0
            r5 = r0
            r0 = r3
            int r0 = r0.size
            r1 = r5
            int r1 = r1.size
            if (r0 != r1) goto L2d
            r0 = r3
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r0.insns
            r1 = r5
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r1.insns
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r0.insns
            int r0 = r0.hashCode()
            return r0
    }
}
