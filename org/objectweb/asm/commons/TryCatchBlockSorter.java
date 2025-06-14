package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/TryCatchBlockSorter.SCL.lombok */
public class TryCatchBlockSorter extends org.objectweb.asm.tree.MethodNode {


    public TryCatchBlockSorter(org.objectweb.asm.MethodVisitor r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
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
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.commons.TryCatchBlockSorter> r1 = org.objectweb.asm.commons.TryCatchBlockSorter.class
            if (r0 == r1) goto L20
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L20:
            return
    }

    protected TryCatchBlockSorter(int r9, org.objectweb.asm.MethodVisitor r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r8
            r1 = r10
            r0.f626mv = r1
            return
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
            r5 = this;
            r0 = r5
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            org.objectweb.asm.commons.TryCatchBlockSorter$1 r1 = new org.objectweb.asm.commons.TryCatchBlockSorter$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            java.util.Collections.sort(r0, r1)
            r0 = 0
            r6 = r0
        L11:
            r0 = r6
            r1 = r5
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r1 = r1.tryCatchBlocks
            int r1 = r1.size()
            if (r0 >= r1) goto L35
            r0 = r5
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r1 = r6
            r0.updateIndex(r1)
            int r6 = r6 + 1
            goto L11
        L35:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L44
            r0 = r5
            r1 = r5
            org.objectweb.asm.MethodVisitor r1 = r1.f626mv
            r0.accept(r1)
        L44:
            return
    }
}
