package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/AbstractInsnNode.SCL.lombok */
public abstract class AbstractInsnNode {
    public static final int INSN = 0;
    public static final int INT_INSN = 1;
    public static final int VAR_INSN = 2;
    public static final int TYPE_INSN = 3;
    public static final int FIELD_INSN = 4;
    public static final int METHOD_INSN = 5;
    public static final int INVOKE_DYNAMIC_INSN = 6;
    public static final int JUMP_INSN = 7;
    public static final int LABEL = 8;
    public static final int LDC_INSN = 9;
    public static final int IINC_INSN = 10;
    public static final int TABLESWITCH_INSN = 11;
    public static final int LOOKUPSWITCH_INSN = 12;
    public static final int MULTIANEWARRAY_INSN = 13;
    public static final int FRAME = 14;
    public static final int LINE = 15;
    protected int opcode;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    org.objectweb.asm.tree.AbstractInsnNode previousInsn;
    org.objectweb.asm.tree.AbstractInsnNode nextInsn;
    int index;

    protected AbstractInsnNode(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.opcode = r1
            r0 = r3
            r1 = -1
            r0.index = r1
            return
    }

    public int getOpcode() {
            r2 = this;
            r0 = r2
            int r0 = r0.opcode
            return r0
    }

    public abstract int getType();

    public org.objectweb.asm.tree.AbstractInsnNode getPrevious() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
            return r0
    }

    public org.objectweb.asm.tree.AbstractInsnNode getNext() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            return r0
    }

    public abstract void accept(org.objectweb.asm.MethodVisitor r1);

    protected final void acceptAnnotations(org.objectweb.asm.MethodVisitor r8) {
            r7 = this;
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L46
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r10 = r0
        L13:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L46
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = r11
            int r2 = r2.typeRef
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r11
            java.lang.String r4 = r4.desc
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitInsnAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L13
        L46:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L8c
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r10 = r0
        L59:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L8c
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = r11
            int r2 = r2.typeRef
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r11
            java.lang.String r4 = r4.desc
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitInsnAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L59
        L8c:
            return
    }

    public abstract org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r1);

    static org.objectweb.asm.tree.LabelNode clone(org.objectweb.asm.tree.LabelNode r3, java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r4) {
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            return r0
    }

    static org.objectweb.asm.tree.LabelNode[] clone(java.util.List<org.objectweb.asm.tree.LabelNode> r6, java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r7) {
            r0 = r6
            int r0 = r0.size()
            org.objectweb.asm.tree.LabelNode[] r0 = new org.objectweb.asm.tree.LabelNode[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            int r0 = r0.length
            r10 = r0
        L10:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L2f
            r0 = r8
            r1 = r9
            r2 = r7
            r3 = r6
            r4 = r9
            java.lang.Object r3 = r3.get(r4)
            java.lang.Object r2 = r2.get(r3)
            org.objectweb.asm.tree.LabelNode r2 = (org.objectweb.asm.tree.LabelNode) r2
            r0[r1] = r2
            int r9 = r9 + 1
            goto L10
        L2f:
            r0 = r8
            return r0
    }

    protected final org.objectweb.asm.tree.AbstractInsnNode cloneAnnotations(org.objectweb.asm.tree.AbstractInsnNode r7) {
            r6 = this;
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L63
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.visibleTypeAnnotations = r1
            r0 = 0
            r8 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r9 = r0
        L1e:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L63
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r10 = r0
            org.objectweb.asm.tree.TypeAnnotationNode r0 = new org.objectweb.asm.tree.TypeAnnotationNode
            r1 = r0
            r2 = r10
            int r2 = r2.typeRef
            r3 = r10
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r10
            java.lang.String r4 = r4.desc
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r10
            r1 = r11
            r0.accept(r1)
            r0 = r6
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r11
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L63:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto Lc6
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.invisibleTypeAnnotations = r1
            r0 = 0
            r8 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r9 = r0
        L81:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto Lc6
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r10 = r0
            org.objectweb.asm.tree.TypeAnnotationNode r0 = new org.objectweb.asm.tree.TypeAnnotationNode
            r1 = r0
            r2 = r10
            int r2 = r2.typeRef
            r3 = r10
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r10
            java.lang.String r4 = r4.desc
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r10
            r1 = r11
            r0.accept(r1)
            r0 = r6
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r11
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L81
        Lc6:
            r0 = r6
            return r0
    }
}
