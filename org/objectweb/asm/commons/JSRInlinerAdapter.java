package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/JSRInlinerAdapter.SCL.lombok */
public class JSRInlinerAdapter extends org.objectweb.asm.tree.MethodNode implements org.objectweb.asm.Opcodes {
    private final java.util.BitSet mainSubroutineInsns;
    private final java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> subroutinesInsns;
    final java.util.BitSet sharedSubroutineInsns;

    /* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/JSRInlinerAdapter$Instantiation.SCL.lombok */
    private class Instantiation extends java.util.AbstractMap<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> {
        final org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation parent;
        final java.util.BitSet subroutineInsns;
        final java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> clonedLabels;
        final org.objectweb.asm.tree.LabelNode returnLabel;
        final /* synthetic */ org.objectweb.asm.commons.JSRInlinerAdapter this$0;

        Instantiation(org.objectweb.asm.commons.JSRInlinerAdapter r6, org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation r7, java.util.BitSet r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.this$0 = r1
                r0 = r5
                r0.<init>()
                r0 = r7
                r9 = r0
            Lc:
                r0 = r9
                if (r0 == 0) goto L3f
                r0 = r9
                java.util.BitSet r0 = r0.subroutineInsns
                r1 = r8
                if (r0 != r1) goto L35
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "Recursive invocation of "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r8
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L35:
                r0 = r9
                org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.parent
                r9 = r0
                goto Lc
            L3f:
                r0 = r5
                r1 = r7
                r0.parent = r1
                r0 = r5
                r1 = r8
                r0.subroutineInsns = r1
                r0 = r5
                r1 = r7
                if (r1 != 0) goto L52
                r1 = 0
                goto L59
            L52:
                org.objectweb.asm.tree.LabelNode r1 = new org.objectweb.asm.tree.LabelNode
                r2 = r1
                r2.<init>()
            L59:
                r0.returnLabel = r1
                r0 = r5
                java.util.HashMap r1 = new java.util.HashMap
                r2 = r1
                r2.<init>()
                r0.clonedLabels = r1
                r0 = 0
                r9 = r0
                r0 = 0
                r10 = r0
            L6d:
                r0 = r10
                r1 = r6
                org.objectweb.asm.tree.InsnList r1 = r1.instructions
                int r1 = r1.size()
                if (r0 >= r1) goto Lc7
                r0 = r6
                org.objectweb.asm.tree.InsnList r0 = r0.instructions
                r1 = r10
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
                r11 = r0
                r0 = r11
                int r0 = r0.getType()
                r1 = 8
                if (r0 != r1) goto Lb4
                r0 = r11
                org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
                r12 = r0
                r0 = r9
                if (r0 != 0) goto La3
                org.objectweb.asm.tree.LabelNode r0 = new org.objectweb.asm.tree.LabelNode
                r1 = r0
                r1.<init>()
                r9 = r0
            La3:
                r0 = r5
                java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r0 = r0.clonedLabels
                r1 = r12
                r2 = r9
                java.lang.Object r0 = r0.put(r1, r2)
                goto Lc1
            Lb4:
                r0 = r5
                r1 = r10
                org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.findOwner(r1)
                r1 = r5
                if (r0 != r1) goto Lc1
                r0 = 0
                r9 = r0
            Lc1:
                int r10 = r10 + 1
                goto L6d
            Lc7:
                return
        }

        org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation findOwner(int r4) {
                r3 = this;
                r0 = r3
                java.util.BitSet r0 = r0.subroutineInsns
                r1 = r4
                boolean r0 = r0.get(r1)
                if (r0 != 0) goto Ld
                r0 = 0
                return r0
            Ld:
                r0 = r3
                org.objectweb.asm.commons.JSRInlinerAdapter r0 = r0.this$0
                java.util.BitSet r0 = r0.sharedSubroutineInsns
                r1 = r4
                boolean r0 = r0.get(r1)
                if (r0 != 0) goto L1d
                r0 = r3
                return r0
            L1d:
                r0 = r3
                r5 = r0
                r0 = r3
                org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.parent
                r6 = r0
            L24:
                r0 = r6
                if (r0 == 0) goto L3d
                r0 = r6
                java.util.BitSet r0 = r0.subroutineInsns
                r1 = r4
                boolean r0 = r0.get(r1)
                if (r0 == 0) goto L35
                r0 = r6
                r5 = r0
            L35:
                r0 = r6
                org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.parent
                r6 = r0
                goto L24
            L3d:
                r0 = r5
                return r0
        }

        org.objectweb.asm.tree.LabelNode getClonedLabelForJumpInsn(org.objectweb.asm.tree.LabelNode r5) {
                r4 = this;
                r0 = r4
                r1 = r4
                org.objectweb.asm.commons.JSRInlinerAdapter r1 = r1.this$0
                org.objectweb.asm.tree.InsnList r1 = r1.instructions
                r2 = r5
                int r1 = r1.indexOf(r2)
                org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.findOwner(r1)
                java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r0 = r0.clonedLabels
                r1 = r5
                java.lang.Object r0 = r0.get(r1)
                org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
                return r0
        }

        org.objectweb.asm.tree.LabelNode getClonedLabel(org.objectweb.asm.tree.LabelNode r4) {
                r3 = this;
                r0 = r3
                java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r0 = r0.clonedLabels
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode>> entrySet() {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public org.objectweb.asm.tree.LabelNode get(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.objectweb.asm.tree.LabelNode r1 = (org.objectweb.asm.tree.LabelNode) r1
                org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabelForJumpInsn(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.objectweb.asm.tree.LabelNode r0 = r0.get(r1)
                return r0
        }
    }

    public JSRInlinerAdapter(org.objectweb.asm.MethodVisitor r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
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
            java.lang.Class<org.objectweb.asm.commons.JSRInlinerAdapter> r1 = org.objectweb.asm.commons.JSRInlinerAdapter.class
            if (r0 == r1) goto L20
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L20:
            return
    }

    protected JSRInlinerAdapter(int r9, org.objectweb.asm.MethodVisitor r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
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
            java.util.BitSet r1 = new java.util.BitSet
            r2 = r1
            r2.<init>()
            r0.mainSubroutineInsns = r1
            r0 = r8
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.subroutinesInsns = r1
            r0 = r8
            java.util.BitSet r1 = new java.util.BitSet
            r2 = r1
            r2.<init>()
            r0.sharedSubroutineInsns = r1
            r0 = r8
            r1 = r10
            r0.f626mv = r1
            return
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r6, org.objectweb.asm.Label r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitJumpInsn(r1, r2)
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.getLast()
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0
            org.objectweb.asm.tree.LabelNode r0 = r0.label
            r8 = r0
            r0 = r6
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L3a
            r0 = r5
            java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> r0 = r0.subroutinesInsns
            r1 = r8
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L3a
            r0 = r5
            java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> r0 = r0.subroutinesInsns
            r1 = r8
            java.util.BitSet r2 = new java.util.BitSet
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
        L3a:
            return
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
            r3 = this;
            r0 = r3
            java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> r0 = r0.subroutinesInsns
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            r0 = r3
            r0.findSubroutinesInsns()
            r0 = r3
            r0.emitCode()
        L14:
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            if (r0 == 0) goto L23
            r0 = r3
            r1 = r3
            org.objectweb.asm.MethodVisitor r1 = r1.f626mv
            r0.accept(r1)
        L23:
            return
    }

    private void findSubroutinesInsns() {
            r5 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            r1 = 0
            r2 = r5
            java.util.BitSet r2 = r2.mainSubroutineInsns
            r3 = r6
            r0.findSubroutineInsns(r1, r2, r3)
            r0 = r5
            java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> r0 = r0.subroutinesInsns
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L21:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5d
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getKey()
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r9 = r0
            r0 = r8
            java.lang.Object r0 = r0.getValue()
            java.util.BitSet r0 = (java.util.BitSet) r0
            r10 = r0
            r0 = r5
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r2 = r9
            int r1 = r1.indexOf(r2)
            r2 = r10
            r3 = r6
            r0.findSubroutineInsns(r1, r2, r3)
            goto L21
        L5d:
            return
    }

    private void findSubroutineInsns(int r6, java.util.BitSet r7, java.util.BitSet r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
        L7:
            r0 = 0
            r9 = r0
            r0 = r5
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L15:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L85
            r0 = r10
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r11 = r0
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r11
            org.objectweb.asm.tree.LabelNode r1 = r1.handler
            int r0 = r0.indexOf(r1)
            r12 = r0
            r0 = r7
            r1 = r12
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L45
            goto L15
        L45:
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r11
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            int r0 = r0.indexOf(r1)
            r13 = r0
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r11
            org.objectweb.asm.tree.LabelNode r1 = r1.end
            int r0 = r0.indexOf(r1)
            r14 = r0
            r0 = r7
            r1 = r13
            int r0 = r0.nextSetBit(r1)
            r15 = r0
            r0 = r15
            r1 = r13
            if (r0 < r1) goto L82
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto L82
            r0 = r5
            r1 = r12
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
            r0 = 1
            r9 = r0
        L82:
            goto L15
        L85:
            r0 = r9
            if (r0 != 0) goto L8b
            return
        L8b:
            goto L7
    }

    private void findReachableInsns(int r6, java.util.BitSet r7, java.util.BitSet r8) {
            r5 = this;
            r0 = r6
            r9 = r0
        L3:
            r0 = r9
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            int r1 = r1.size()
            if (r0 >= r1) goto L1ab
            r0 = r7
            r1 = r9
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L19
            return
        L19:
            r0 = r7
            r1 = r9
            r0.set(r1)
            r0 = r8
            r1 = r9
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L31
            r0 = r5
            java.util.BitSet r0 = r0.sharedSubroutineInsns
            r1 = r9
            r0.set(r1)
        L31:
            r0 = r8
            r1 = r9
            r0.set(r1)
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r9
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
            r10 = r0
            r0 = r10
            int r0 = r0.getType()
            r1 = 7
            if (r0 != r1) goto L73
            r0 = r10
            int r0 = r0.getOpcode()
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 == r1) goto L73
            r0 = r10
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0
            r11 = r0
            r0 = r5
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r2 = r11
            org.objectweb.asm.tree.LabelNode r2 = r2.label
            int r1 = r1.indexOf(r2)
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
            goto L124
        L73:
            r0 = r10
            int r0 = r0.getType()
            r1 = 11
            if (r0 != r1) goto Lcd
            r0 = r10
            org.objectweb.asm.tree.TableSwitchInsnNode r0 = (org.objectweb.asm.tree.TableSwitchInsnNode) r0
            r11 = r0
            r0 = r5
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r2 = r11
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt
            int r1 = r1.indexOf(r2)
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
            r0 = r11
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        La2:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lca
            r0 = r12
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r13 = r0
            r0 = r5
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r2 = r13
            int r1 = r1.indexOf(r2)
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
            goto La2
        Lca:
            goto L124
        Lcd:
            r0 = r10
            int r0 = r0.getType()
            r1 = 12
            if (r0 != r1) goto L124
            r0 = r10
            org.objectweb.asm.tree.LookupSwitchInsnNode r0 = (org.objectweb.asm.tree.LookupSwitchInsnNode) r0
            r11 = r0
            r0 = r5
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r2 = r11
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt
            int r1 = r1.indexOf(r2)
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
            r0 = r11
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        Lfc:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L124
            r0 = r12
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r13 = r0
            r0 = r5
            r1 = r5
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r2 = r13
            int r1 = r1.indexOf(r2)
            r2 = r7
            r3 = r8
            r0.findReachableInsns(r1, r2, r3)
            goto Lfc
        L124:
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r9
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
            int r0 = r0.getOpcode()
            switch(r0) {
                case 167: goto L1a4;
                case 168: goto L1a5;
                case 169: goto L1a4;
                case 170: goto L1a4;
                case 171: goto L1a4;
                case 172: goto L1a4;
                case 173: goto L1a4;
                case 174: goto L1a4;
                case 175: goto L1a4;
                case 176: goto L1a4;
                case 177: goto L1a4;
                case 178: goto L1a5;
                case 179: goto L1a5;
                case 180: goto L1a5;
                case 181: goto L1a5;
                case 182: goto L1a5;
                case 183: goto L1a5;
                case 184: goto L1a5;
                case 185: goto L1a5;
                case 186: goto L1a5;
                case 187: goto L1a5;
                case 188: goto L1a5;
                case 189: goto L1a5;
                case 190: goto L1a5;
                case 191: goto L1a4;
                default: goto L1a5;
            }
        L1a4:
            return
        L1a5:
            int r9 = r9 + 1
            goto L3
        L1ab:
            return
    }

    private void emitCode() {
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r1 = new org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation
            r2 = r1
            r3 = r7
            r4 = 0
            r5 = r7
            java.util.BitSet r5 = r5.mainSubroutineInsns
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            org.objectweb.asm.tree.InsnList r0 = new org.objectweb.asm.tree.InsnList
            r1 = r0
            r1.<init>()
            r9 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
        L33:
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L51
            r0 = r8
            java.lang.Object r0 = r0.removeFirst()
            org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = (org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation) r0
            r12 = r0
            r0 = r7
            r1 = r12
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.emitInstantiation(r1, r2, r3, r4, r5)
            goto L33
        L51:
            r0 = r7
            r1 = r9
            r0.instructions = r1
            r0 = r7
            r1 = r10
            r0.tryCatchBlocks = r1
            r0 = r7
            r1 = r11
            r0.localVariables = r1
            return
    }

    private void emitInstantiation(org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation r11, java.util.List<org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation> r12, org.objectweb.asm.tree.InsnList r13, java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r14, java.util.List<org.objectweb.asm.tree.LocalVariableNode> r15) {
            r10 = this;
            r0 = 0
            r16 = r0
            r0 = 0
            r17 = r0
        L6:
            r0 = r17
            r1 = r10
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            int r1 = r1.size()
            if (r0 >= r1) goto L13f
            r0 = r10
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r17
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
            r18 = r0
            r0 = r18
            int r0 = r0.getType()
            r1 = 8
            if (r0 != r1) goto L4a
            r0 = r18
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r19 = r0
            r0 = r11
            r1 = r19
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabel(r1)
            r20 = r0
            r0 = r20
            r1 = r16
            if (r0 == r1) goto L47
            r0 = r13
            r1 = r20
            r0.add(r1)
            r0 = r20
            r16 = r0
        L47:
            goto L139
        L4a:
            r0 = r11
            r1 = r17
            org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.findOwner(r1)
            r1 = r11
            if (r0 != r1) goto L139
            r0 = r18
            int r0 = r0.getOpcode()
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto Lc3
            r0 = 0
            r19 = r0
            r0 = r11
            r20 = r0
        L65:
            r0 = r20
            if (r0 == 0) goto L88
            r0 = r20
            java.util.BitSet r0 = r0.subroutineInsns
            r1 = r17
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L7e
            r0 = r20
            org.objectweb.asm.tree.LabelNode r0 = r0.returnLabel
            r19 = r0
        L7e:
            r0 = r20
            org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = r0.parent
            r20 = r0
            goto L65
        L88:
            r0 = r19
            if (r0 != 0) goto Lb0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Instruction #"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r17
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is a RET not owned by any subroutine"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lb0:
            r0 = r13
            org.objectweb.asm.tree.JumpInsnNode r1 = new org.objectweb.asm.tree.JumpInsnNode
            r2 = r1
            r3 = 167(0xa7, float:2.34E-43)
            r4 = r19
            r2.<init>(r3, r4)
            r0.add(r1)
            goto L139
        Lc3:
            r0 = r18
            int r0 = r0.getOpcode()
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L12f
            r0 = r18
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0
            org.objectweb.asm.tree.LabelNode r0 = r0.label
            r19 = r0
            r0 = r10
            java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> r0 = r0.subroutinesInsns
            r1 = r19
            java.lang.Object r0 = r0.get(r1)
            java.util.BitSet r0 = (java.util.BitSet) r0
            r20 = r0
            org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation r0 = new org.objectweb.asm.commons.JSRInlinerAdapter$Instantiation
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r20
            r1.<init>(r2, r3, r4)
            r21 = r0
            r0 = r21
            r1 = r19
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabelForJumpInsn(r1)
            r22 = r0
            r0 = r13
            org.objectweb.asm.tree.InsnNode r1 = new org.objectweb.asm.tree.InsnNode
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.add(r1)
            r0 = r13
            org.objectweb.asm.tree.JumpInsnNode r1 = new org.objectweb.asm.tree.JumpInsnNode
            r2 = r1
            r3 = 167(0xa7, float:2.34E-43)
            r4 = r22
            r2.<init>(r3, r4)
            r0.add(r1)
            r0 = r13
            r1 = r21
            org.objectweb.asm.tree.LabelNode r1 = r1.returnLabel
            r0.add(r1)
            r0 = r12
            r1 = r21
            boolean r0 = r0.add(r1)
            goto L139
        L12f:
            r0 = r13
            r1 = r18
            r2 = r11
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.clone(r2)
            r0.add(r1)
        L139:
            int r17 = r17 + 1
            goto L6
        L13f:
            r0 = r10
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
        L14a:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1bf
            r0 = r17
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r18 = r0
            r0 = r11
            r1 = r18
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabel(r1)
            r19 = r0
            r0 = r11
            r1 = r18
            org.objectweb.asm.tree.LabelNode r1 = r1.end
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabel(r1)
            r20 = r0
            r0 = r19
            r1 = r20
            if (r0 == r1) goto L1bc
            r0 = r11
            r1 = r18
            org.objectweb.asm.tree.LabelNode r1 = r1.handler
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabelForJumpInsn(r1)
            r21 = r0
            r0 = r19
            if (r0 == 0) goto L197
            r0 = r20
            if (r0 == 0) goto L197
            r0 = r21
            if (r0 != 0) goto L1a2
        L197:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Internal error!"
            r1.<init>(r2)
            throw r0
        L1a2:
            r0 = r14
            org.objectweb.asm.tree.TryCatchBlockNode r1 = new org.objectweb.asm.tree.TryCatchBlockNode
            r2 = r1
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r18
            java.lang.String r6 = r6.type
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L1bc:
            goto L14a
        L1bf:
            r0 = r10
            java.util.List<org.objectweb.asm.tree.LocalVariableNode> r0 = r0.localVariables
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
        L1ca:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L227
            r0 = r17
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.LocalVariableNode r0 = (org.objectweb.asm.tree.LocalVariableNode) r0
            r18 = r0
            r0 = r11
            r1 = r18
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabel(r1)
            r19 = r0
            r0 = r11
            r1 = r18
            org.objectweb.asm.tree.LabelNode r1 = r1.end
            org.objectweb.asm.tree.LabelNode r0 = r0.getClonedLabel(r1)
            r20 = r0
            r0 = r19
            r1 = r20
            if (r0 == r1) goto L224
            r0 = r15
            org.objectweb.asm.tree.LocalVariableNode r1 = new org.objectweb.asm.tree.LocalVariableNode
            r2 = r1
            r3 = r18
            java.lang.String r3 = r3.name
            r4 = r18
            java.lang.String r4 = r4.desc
            r5 = r18
            java.lang.String r5 = r5.signature
            r6 = r19
            r7 = r20
            r8 = r18
            int r8 = r8.index
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r0 = r0.add(r1)
        L224:
            goto L1ca
        L227:
            return
    }
}
