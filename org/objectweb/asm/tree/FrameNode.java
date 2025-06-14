package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/FrameNode.SCL.lombok */
public class FrameNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int type;
    public java.util.List<java.lang.Object> local;
    public java.util.List<java.lang.Object> stack;

    private FrameNode() {
            r3 = this;
            r0 = r3
            r1 = -1
            r0.<init>(r1)
            return
    }

    public FrameNode(int r5, int r6, java.lang.Object[] r7, int r8, java.lang.Object[] r9) {
            r4 = this;
            r0 = r4
            r1 = -1
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.type = r1
            r0 = r5
            switch(r0) {
                case -1: goto L30;
                case 0: goto L30;
                case 1: goto L47;
                case 2: goto L53;
                case 3: goto L5e;
                case 4: goto L61;
                default: goto L6e;
            }
        L30:
            r0 = r4
            r1 = r6
            r2 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1, r2)
            r0.local = r1
            r0 = r4
            r1 = r8
            r2 = r9
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1, r2)
            r0.stack = r1
            goto L76
        L47:
            r0 = r4
            r1 = r6
            r2 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1, r2)
            r0.local = r1
            goto L76
        L53:
            r0 = r4
            r1 = r6
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.local = r1
            goto L76
        L5e:
            goto L76
        L61:
            r0 = r4
            r1 = 1
            r2 = r9
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1, r2)
            r0.stack = r1
            goto L76
        L6e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L76:
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 14
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r8) {
            r7 = this;
            r0 = r7
            int r0 = r0.type
            switch(r0) {
                case -1: goto L2c;
                case 0: goto L2c;
                case 1: goto L57;
                case 2: goto L74;
                case 3: goto L8b;
                case 4: goto L9a;
                default: goto Laf;
            }
        L2c:
            r0 = r8
            r1 = r7
            int r1 = r1.type
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.local
            int r2 = r2.size()
            r3 = r7
            java.util.List<java.lang.Object> r3 = r3.local
            java.lang.Object[] r3 = asArray(r3)
            r4 = r7
            java.util.List<java.lang.Object> r4 = r4.stack
            int r4 = r4.size()
            r5 = r7
            java.util.List<java.lang.Object> r5 = r5.stack
            java.lang.Object[] r5 = asArray(r5)
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto Lb7
        L57:
            r0 = r8
            r1 = r7
            int r1 = r1.type
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.local
            int r2 = r2.size()
            r3 = r7
            java.util.List<java.lang.Object> r3 = r3.local
            java.lang.Object[] r3 = asArray(r3)
            r4 = 0
            r5 = 0
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto Lb7
        L74:
            r0 = r8
            r1 = r7
            int r1 = r1.type
            r2 = r7
            java.util.List<java.lang.Object> r2 = r2.local
            int r2 = r2.size()
            r3 = 0
            r4 = 0
            r5 = 0
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto Lb7
        L8b:
            r0 = r8
            r1 = r7
            int r1 = r1.type
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto Lb7
        L9a:
            r0 = r8
            r1 = r7
            int r1 = r1.type
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = r7
            java.util.List<java.lang.Object> r5 = r5.stack
            java.lang.Object[] r5 = asArray(r5)
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto Lb7
        Laf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lb7:
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r5) {
            r4 = this;
            org.objectweb.asm.tree.FrameNode r0 = new org.objectweb.asm.tree.FrameNode
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.type
            r0.type = r1
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.local
            if (r0 == 0) goto L65
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.local = r1
            r0 = 0
            r7 = r0
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.local
            int r0 = r0.size()
            r8 = r0
        L2f:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L65
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.local
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LabelNode
            if (r0 == 0) goto L53
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
        L53:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.local
            r1 = r9
            boolean r0 = r0.add(r1)
            int r7 = r7 + 1
            goto L2f
        L65:
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stack
            if (r0 == 0) goto Lba
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.stack = r1
            r0 = 0
            r7 = r0
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stack
            int r0 = r0.size()
            r8 = r0
        L84:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto Lba
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LabelNode
            if (r0 == 0) goto La8
            r0 = r5
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
        La8:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stack
            r1 = r9
            boolean r0 = r0.add(r1)
            int r7 = r7 + 1
            goto L84
        Lba:
            r0 = r6
            return r0
    }

    private static java.lang.Object[] asArray(java.util.List<java.lang.Object> r4) {
            r0 = r4
            int r0 = r0.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r7 = r0
        Lf:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r4
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LabelNode
            if (r0 == 0) goto L2f
            r0 = r8
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            org.objectweb.asm.Label r0 = r0.getLabel()
            r8 = r0
        L2f:
            r0 = r5
            r1 = r6
            r2 = r8
            r0[r1] = r2
            int r6 = r6 + 1
            goto Lf
        L3a:
            r0 = r5
            return r0
    }
}
