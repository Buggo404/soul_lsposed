package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/Subroutine.SCL.lombok */
final class Subroutine {
    final org.objectweb.asm.tree.LabelNode start;
    final boolean[] localsUsed;
    final java.util.List<org.objectweb.asm.tree.JumpInsnNode> callers;

    Subroutine(org.objectweb.asm.tree.LabelNode r5, int r6, org.objectweb.asm.tree.JumpInsnNode r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.start = r1
            r0 = r4
            r1 = r6
            boolean[] r1 = new boolean[r1]
            r0.localsUsed = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.callers = r1
            r0 = r4
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r0 = r0.callers
            r1 = r7
            boolean r0 = r0.add(r1)
            return
    }

    Subroutine(org.objectweb.asm.tree.analysis.Subroutine r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            r0.start = r1
            r0 = r5
            r1 = r6
            boolean[] r1 = r1.localsUsed
            java.lang.Object r1 = r1.clone()
            boolean[] r1 = (boolean[]) r1
            r0.localsUsed = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r3 = r3.callers
            r2.<init>(r3)
            r0.callers = r1
            return
    }

    public boolean merge(org.objectweb.asm.tree.analysis.Subroutine r5) {
            r4 = this;
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
        L4:
            r0 = r7
            r1 = r4
            boolean[] r1 = r1.localsUsed
            int r1 = r1.length
            if (r0 >= r1) goto L2e
            r0 = r5
            boolean[] r0 = r0.localsUsed
            r1 = r7
            r0 = r0[r1]
            if (r0 == 0) goto L28
            r0 = r4
            boolean[] r0 = r0.localsUsed
            r1 = r7
            r0 = r0[r1]
            if (r0 != 0) goto L28
            r0 = r4
            boolean[] r0 = r0.localsUsed
            r1 = r7
            r2 = 1
            r0[r1] = r2
            r0 = 1
            r6 = r0
        L28:
            int r7 = r7 + 1
            goto L4
        L2e:
            r0 = r5
            org.objectweb.asm.tree.LabelNode r0 = r0.start
            r1 = r4
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            if (r0 != r1) goto L79
            r0 = 0
            r7 = r0
        L3b:
            r0 = r7
            r1 = r5
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r1 = r1.callers
            int r1 = r1.size()
            if (r0 >= r1) goto L79
            r0 = r5
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r0 = r0.callers
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0
            r8 = r0
            r0 = r4
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r0 = r0.callers
            r1 = r8
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L73
            r0 = r4
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r0 = r0.callers
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = 1
            r6 = r0
        L73:
            int r7 = r7 + 1
            goto L3b
        L79:
            r0 = r6
            return r0
    }
}
