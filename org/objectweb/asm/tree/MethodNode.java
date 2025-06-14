package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/MethodNode.SCL.lombok */
public class MethodNode extends org.objectweb.asm.MethodVisitor {
    public int access;
    public java.lang.String name;
    public java.lang.String desc;
    public java.lang.String signature;
    public java.util.List<java.lang.String> exceptions;
    public java.util.List<org.objectweb.asm.tree.ParameterNode> parameters;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.Attribute> attrs;
    public java.lang.Object annotationDefault;
    public int visibleAnnotableParameterCount;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode>[] visibleParameterAnnotations;
    public int invisibleAnnotableParameterCount;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode>[] invisibleParameterAnnotations;
    public org.objectweb.asm.tree.InsnList instructions;
    public java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> tryCatchBlocks;
    public int maxStack;
    public int maxLocals;
    public java.util.List<org.objectweb.asm.tree.LocalVariableNode> localVariables;
    public java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
    public java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
    private boolean visited;


    public MethodNode() {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.MethodNode> r1 = org.objectweb.asm.tree.MethodNode.class
            if (r0 == r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            return
    }

    public MethodNode(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            org.objectweb.asm.tree.InsnList r1 = new org.objectweb.asm.tree.InsnList
            r2 = r1
            r2.<init>()
            r0.instructions = r1
            return
    }

    public MethodNode(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r8 = this;
            r0 = r8
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.MethodNode> r1 = org.objectweb.asm.tree.MethodNode.class
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            return
    }

    public MethodNode(int r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String[] r11) {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.<init>(r1)
            r0 = r5
            r1 = r7
            r0.access = r1
            r0 = r5
            r1 = r8
            r0.name = r1
            r0 = r5
            r1 = r9
            r0.desc = r1
            r0 = r5
            r1 = r10
            r0.signature = r1
            r0 = r5
            r1 = r11
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.exceptions = r1
            r0 = r7
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L38
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.localVariables = r1
        L38:
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.tryCatchBlocks = r1
            r0 = r5
            org.objectweb.asm.tree.InsnList r1 = new org.objectweb.asm.tree.InsnList
            r2 = r1
            r2.<init>()
            r0.instructions = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(java.lang.String r7, int r8) {
            r6 = this;
            r0 = r6
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            if (r0 != 0) goto L13
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.parameters = r1
        L13:
            r0 = r6
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            org.objectweb.asm.tree.ParameterNode r1 = new org.objectweb.asm.tree.ParameterNode
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
            r7 = this;
            org.objectweb.asm.tree.AnnotationNode r0 = new org.objectweb.asm.tree.AnnotationNode
            r1 = r0
            org.objectweb.asm.tree.MethodNode$1 r2 = new org.objectweb.asm.tree.MethodNode$1
            r3 = r2
            r4 = r7
            r5 = 0
            r3.<init>(r4, r5)
            r1.<init>(r2)
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            org.objectweb.asm.tree.AnnotationNode r0 = new org.objectweb.asm.tree.AnnotationNode
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L1c
            r0 = r4
            r1 = r4
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r1 = r1.visibleAnnotations
            r2 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleAnnotations = r1
            goto L28
        L1c:
            r0 = r4
            r1 = r4
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r1 = r1.invisibleAnnotations
            r2 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleAnnotations = r1
        L28:
            r0 = r7
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            org.objectweb.asm.tree.TypeAnnotationNode r0 = new org.objectweb.asm.tree.TypeAnnotationNode
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L21
            r0 = r6
            r1 = r6
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.visibleTypeAnnotations
            r2 = r11
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleTypeAnnotations = r1
            goto L2e
        L21:
            r0 = r6
            r1 = r6
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.invisibleTypeAnnotations
            r2 = r11
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleTypeAnnotations = r1
        L2e:
            r0 = r11
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAnnotableParameterCount(int r4, boolean r5) {
            r3 = this;
            r0 = r5
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = r4
            r0.visibleAnnotableParameterCount = r1
            goto L11
        Lc:
            r0 = r3
            r1 = r4
            r0.invisibleAnnotableParameterCount = r1
        L11:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r6, java.lang.String r7, boolean r8) {
            r5 = this;
            org.objectweb.asm.tree.AnnotationNode r0 = new org.objectweb.asm.tree.AnnotationNode
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L3c
            r0 = r5
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.visibleParameterAnnotations
            if (r0 != 0) goto L28
            r0 = r5
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            int r0 = r0.length
            r10 = r0
            r0 = r5
            r1 = r10
            java.util.List[] r1 = new java.util.List[r1]
            r0.visibleParameterAnnotations = r1
        L28:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.visibleParameterAnnotations
            r1 = r6
            r2 = r5
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r2 = r2.visibleParameterAnnotations
            r3 = r6
            r2 = r2[r3]
            r3 = r9
            java.util.List r2 = org.objectweb.asm.tree.Util.add(r2, r3)
            r0[r1] = r2
            goto L67
        L3c:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.invisibleParameterAnnotations
            if (r0 != 0) goto L56
            r0 = r5
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            int r0 = r0.length
            r10 = r0
            r0 = r5
            r1 = r10
            java.util.List[] r1 = new java.util.List[r1]
            r0.invisibleParameterAnnotations = r1
        L56:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.invisibleParameterAnnotations
            r1 = r6
            r2 = r5
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r2 = r2.invisibleParameterAnnotations
            r3 = r6
            r2 = r2[r3]
            r3 = r9
            java.util.List r2 = org.objectweb.asm.tree.Util.add(r2, r3)
            r0[r1] = r2
        L67:
            r0 = r9
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            java.util.List<org.objectweb.asm.Attribute> r1 = r1.attrs
            r2 = r5
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.attrs = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
            r1 = this;
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int r11, int r12, java.lang.Object[] r13, int r14, java.lang.Object[] r15) {
            r10 = this;
            r0 = r10
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.FrameNode r1 = new org.objectweb.asm.tree.FrameNode
            r2 = r1
            r3 = r11
            r4 = r12
            r5 = r13
            if (r5 != 0) goto L12
            r5 = 0
            goto L17
        L12:
            r5 = r10
            r6 = r13
            java.lang.Object[] r5 = r5.getLabelNodes(r6)
        L17:
            r6 = r14
            r7 = r15
            if (r7 != 0) goto L22
            r7 = 0
            goto L28
        L22:
            r7 = r10
            r8 = r15
            java.lang.Object[] r7 = r7.getLabelNodes(r8)
        L28:
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r6) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.InsnNode r1 = new org.objectweb.asm.tree.InsnNode
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.IntInsnNode r1 = new org.objectweb.asm.tree.IntInsnNode
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.VarInsnNode r1 = new org.objectweb.asm.tree.VarInsnNode
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r7, java.lang.String r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.TypeInsnNode r1 = new org.objectweb.asm.tree.TypeInsnNode
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.FieldInsnNode r1 = new org.objectweb.asm.tree.FieldInsnNode
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            r9 = this;
            r0 = r9
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L1d
            r0 = r10
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
        L1d:
            r0 = r10
            r1 = -257(0xfffffffffffffeff, float:NaN)
            r0 = r0 & r1
            r15 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.MethodInsnNode r1 = new org.objectweb.asm.tree.MethodInsnNode
            r2 = r1
            r3 = r15
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r9, java.lang.String r10, org.objectweb.asm.Handle r11, java.lang.Object... r12) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.InvokeDynamicInsnNode r1 = new org.objectweb.asm.tree.InvokeDynamicInsnNode
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r8, org.objectweb.asm.Label r9) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.JumpInsnNode r1 = new org.objectweb.asm.tree.JumpInsnNode
            r2 = r1
            r3 = r8
            r4 = r7
            r5 = r9
            org.objectweb.asm.tree.LabelNode r4 = r4.getLabelNode(r5)
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r4
            r2 = r5
            org.objectweb.asm.tree.LabelNode r1 = r1.getLabelNode(r2)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r6) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.LdcInsnNode r1 = new org.objectweb.asm.tree.LdcInsnNode
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.IincInsnNode r1 = new org.objectweb.asm.tree.IincInsnNode
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r10, int r11, org.objectweb.asm.Label r12, org.objectweb.asm.Label... r13) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.TableSwitchInsnNode r1 = new org.objectweb.asm.tree.TableSwitchInsnNode
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r9
            r6 = r12
            org.objectweb.asm.tree.LabelNode r5 = r5.getLabelNode(r6)
            r6 = r9
            r7 = r13
            org.objectweb.asm.tree.LabelNode[] r6 = r6.getLabelNodes(r7)
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r9, int[] r10, org.objectweb.asm.Label[] r11) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.LookupSwitchInsnNode r1 = new org.objectweb.asm.tree.LookupSwitchInsnNode
            r2 = r1
            r3 = r8
            r4 = r9
            org.objectweb.asm.tree.LabelNode r3 = r3.getLabelNode(r4)
            r4 = r10
            r5 = r8
            r6 = r11
            org.objectweb.asm.tree.LabelNode[] r5 = r5.getLabelNodes(r6)
            r2.<init>(r3, r4, r5)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r7, int r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.MultiANewArrayInsnNode r1 = new org.objectweb.asm.tree.MultiANewArrayInsnNode
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.getLast()
            r11 = r0
        L9:
            r0 = r11
            int r0 = r0.getOpcode()
            r1 = -1
            if (r0 != r1) goto L1c
            r0 = r11
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.getPrevious()
            r11 = r0
            goto L9
        L1c:
            org.objectweb.asm.tree.TypeAnnotationNode r0 = new org.objectweb.asm.tree.TypeAnnotationNode
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L3f
            r0 = r11
            r1 = r11
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.visibleTypeAnnotations
            r2 = r12
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleTypeAnnotations = r1
            goto L4e
        L3f:
            r0 = r11
            r1 = r11
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.invisibleTypeAnnotations
            r2 = r12
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleTypeAnnotations = r1
        L4e:
            r0 = r12
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label r10, java.lang.String r11) {
            r7 = this;
            org.objectweb.asm.tree.TryCatchBlockNode r0 = new org.objectweb.asm.tree.TryCatchBlockNode
            r1 = r0
            r2 = r7
            r3 = r8
            org.objectweb.asm.tree.LabelNode r2 = r2.getLabelNode(r3)
            r3 = r7
            r4 = r9
            org.objectweb.asm.tree.LabelNode r3 = r3.getLabelNode(r4)
            r4 = r7
            r5 = r10
            org.objectweb.asm.tree.LabelNode r4 = r4.getLabelNode(r5)
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r12 = r0
            r0 = r7
            r1 = r7
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r1 = r1.tryCatchBlocks
            r2 = r12
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.tryCatchBlocks = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            r1 = r7
            r2 = 16776960(0xffff00, float:2.3509528E-38)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 >> r2
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r11 = r0
            org.objectweb.asm.tree.TypeAnnotationNode r0 = new org.objectweb.asm.tree.TypeAnnotationNode
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L39
            r0 = r11
            r1 = r11
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.visibleTypeAnnotations
            r2 = r12
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleTypeAnnotations = r1
            goto L48
        L39:
            r0 = r11
            r1 = r11
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.invisibleTypeAnnotations
            r2 = r12
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleTypeAnnotations = r1
        L48:
            r0 = r12
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r10, java.lang.String r11, java.lang.String r12, org.objectweb.asm.Label r13, org.objectweb.asm.Label r14, int r15) {
            r9 = this;
            org.objectweb.asm.tree.LocalVariableNode r0 = new org.objectweb.asm.tree.LocalVariableNode
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = r13
            org.objectweb.asm.tree.LabelNode r5 = r5.getLabelNode(r6)
            r6 = r9
            r7 = r14
            org.objectweb.asm.tree.LabelNode r6 = r6.getLabelNode(r7)
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r16 = r0
            r0 = r9
            r1 = r9
            java.util.List<org.objectweb.asm.tree.LocalVariableNode> r1 = r1.localVariables
            r2 = r16
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.localVariables = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int r10, org.objectweb.asm.TypePath r11, org.objectweb.asm.Label[] r12, org.objectweb.asm.Label[] r13, int[] r14, java.lang.String r15, boolean r16) {
            r9 = this;
            org.objectweb.asm.tree.LocalVariableAnnotationNode r0 = new org.objectweb.asm.tree.LocalVariableAnnotationNode
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r9
            r5 = r12
            org.objectweb.asm.tree.LabelNode[] r4 = r4.getLabelNodes(r5)
            r5 = r9
            r6 = r13
            org.objectweb.asm.tree.LabelNode[] r5 = r5.getLabelNodes(r6)
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r16
            if (r0 == 0) goto L2f
            r0 = r9
            r1 = r9
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r1 = r1.visibleLocalVariableAnnotations
            r2 = r17
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleLocalVariableAnnotations = r1
            goto L3c
        L2f:
            r0 = r9
            r1 = r9
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r1 = r1.invisibleLocalVariableAnnotations
            r2 = r17
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleLocalVariableAnnotations = r1
        L3c:
            r0 = r17
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int r8, org.objectweb.asm.Label r9) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            org.objectweb.asm.tree.LineNumberNode r1 = new org.objectweb.asm.tree.LineNumberNode
            r2 = r1
            r3 = r8
            r4 = r7
            r5 = r9
            org.objectweb.asm.tree.LabelNode r4 = r4.getLabelNode(r5)
            r2.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.maxStack = r1
            r0 = r3
            r1 = r5
            r0.maxLocals = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    protected org.objectweb.asm.tree.LabelNode getLabelNode(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r5
            java.lang.Object r0 = r0.info
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LabelNode
            if (r0 != 0) goto L15
            r0 = r5
            org.objectweb.asm.tree.LabelNode r1 = new org.objectweb.asm.tree.LabelNode
            r2 = r1
            r2.<init>()
            r0.info = r1
        L15:
            r0 = r5
            java.lang.Object r0 = r0.info
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            return r0
    }

    private org.objectweb.asm.tree.LabelNode[] getLabelNodes(org.objectweb.asm.Label[] r7) {
            r6 = this;
            r0 = r7
            int r0 = r0.length
            org.objectweb.asm.tree.LabelNode[] r0 = new org.objectweb.asm.tree.LabelNode[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            int r0 = r0.length
            r10 = r0
        Lc:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L22
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r7
            r4 = r9
            r3 = r3[r4]
            org.objectweb.asm.tree.LabelNode r2 = r2.getLabelNode(r3)
            r0[r1] = r2
            int r9 = r9 + 1
            goto Lc
        L22:
            r0 = r8
            return r0
    }

    private java.lang.Object[] getLabelNodes(java.lang.Object[] r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            int r0 = r0.length
            r8 = r0
        Lc:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L35
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof org.objectweb.asm.Label
            if (r0 == 0) goto L2a
            r0 = r4
            r1 = r9
            org.objectweb.asm.Label r1 = (org.objectweb.asm.Label) r1
            org.objectweb.asm.tree.LabelNode r0 = r0.getLabelNode(r1)
            r9 = r0
        L2a:
            r0 = r6
            r1 = r7
            r2 = r9
            r0[r1] = r2
            int r7 = r7 + 1
            goto Lc
        L35:
            r0 = r6
            return r0
    }

    public void check(int r5) {
            r4 = this;
            r0 = r5
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 != r1) goto L1a6
            r0 = r4
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            if (r0 == 0) goto L22
            r0 = r4
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L22:
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L3d
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L3d:
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L58
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L58
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L58:
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            if (r0 == 0) goto Lb9
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r6 = r0
        L6b:
            r0 = r6
            if (r0 < 0) goto Lb9
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r7 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L98
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L98
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L98:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto Lb3
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb3
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        Lb3:
            int r6 = r6 + (-1)
            goto L6b
        Lb9:
            r0 = r4
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r6 = r0
        Lc3:
            r0 = r6
            if (r0 < 0) goto L170
            r0 = r4
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto Leb
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Leb
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        Leb:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L106
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L106
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L106:
            r0 = r7
            boolean r0 = r0 instanceof org.objectweb.asm.tree.MethodInsnNode
            if (r0 == 0) goto L135
            r0 = r7
            org.objectweb.asm.tree.MethodInsnNode r0 = (org.objectweb.asm.tree.MethodInsnNode) r0
            boolean r0 = r0.itf
            r8 = r0
            r0 = r8
            r1 = r7
            int r1 = r1.opcode
            r2 = 185(0xb9, float:2.59E-43)
            if (r1 != r2) goto L126
            r1 = 1
            goto L127
        L126:
            r1 = 0
        L127:
            if (r0 == r1) goto L132
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L132:
            goto L16a
        L135:
            r0 = r7
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LdcInsnNode
            if (r0 == 0) goto L16a
            r0 = r7
            org.objectweb.asm.tree.LdcInsnNode r0 = (org.objectweb.asm.tree.LdcInsnNode) r0
            java.lang.Object r0 = r0.cst
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 != 0) goto L162
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L16a
            r0 = r8
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            int r0 = r0.getSort()
            r1 = 11
            if (r0 != r1) goto L16a
        L162:
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L16a:
            int r6 = r6 + (-1)
            goto Lc3
        L170:
            r0 = r4
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.visibleLocalVariableAnnotations
            if (r0 == 0) goto L18b
            r0 = r4
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.visibleLocalVariableAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18b
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L18b:
            r0 = r4
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.invisibleLocalVariableAnnotations
            if (r0 == 0) goto L1a6
            r0 = r4
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.invisibleLocalVariableAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1a6
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L1a6:
            r0 = r5
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L1ea
            r0 = r4
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r6 = r0
        L1b7:
            r0 = r6
            if (r0 < 0) goto L1ea
            r0 = r4
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LdcInsnNode
            if (r0 == 0) goto L1e4
            r0 = r7
            org.objectweb.asm.tree.LdcInsnNode r0 = (org.objectweb.asm.tree.LdcInsnNode) r0
            java.lang.Object r0 = r0.cst
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L1e4
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L1e4:
            int r6 = r6 + (-1)
            goto L1b7
        L1ea:
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r8) {
            r7 = this;
            r0 = r7
            java.util.List<java.lang.String> r0 = r0.exceptions
            if (r0 != 0) goto Lb
            r0 = 0
            goto L1b
        Lb:
            r0 = r7
            java.util.List<java.lang.String> r0 = r0.exceptions
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L1b:
            r9 = r0
            r0 = r8
            r1 = r7
            int r1 = r1.access
            r2 = r7
            java.lang.String r2 = r2.name
            r3 = r7
            java.lang.String r3 = r3.desc
            r4 = r7
            java.lang.String r4 = r4.signature
            r5 = r9
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L3b
            r0 = r7
            r1 = r10
            r0.accept(r1)
        L3b:
            return
    }

    public void accept(org.objectweb.asm.MethodVisitor r8) {
            r7 = this;
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            if (r0 == 0) goto L2f
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            int r0 = r0.size()
            r10 = r0
        L13:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L2f
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ParameterNode> r0 = r0.parameters
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.ParameterNode r0 = (org.objectweb.asm.tree.ParameterNode) r0
            r1 = r8
            r0.accept(r1)
            int r9 = r9 + 1
            goto L13
        L2f:
            r0 = r7
            java.lang.Object r0 = r0.annotationDefault
            if (r0 == 0) goto L4c
            r0 = r8
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotationDefault()
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r7
            java.lang.Object r2 = r2.annotationDefault
            org.objectweb.asm.tree.AnnotationNode.accept(r0, r1, r2)
            r0 = r9
            if (r0 == 0) goto L4c
            r0 = r9
            r0.visitEnd()
        L4c:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            if (r0 == 0) goto L88
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            int r0 = r0.size()
            r10 = r0
        L5f:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L88
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = r11
            java.lang.String r2 = r2.desc
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L5f
        L88:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            if (r0 == 0) goto Lc4
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            int r0 = r0.size()
            r10 = r0
        L9b:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto Lc4
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = r11
            java.lang.String r2 = r2.desc
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L9b
        Lc4:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L10a
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r10 = r0
        Ld7:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L10a
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
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r9 = r9 + 1
            goto Ld7
        L10a:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L150
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r10 = r0
        L11d:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L150
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
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L11d
        L150:
            r0 = r7
            int r0 = r0.visibleAnnotableParameterCount
            if (r0 <= 0) goto L160
            r0 = r8
            r1 = r7
            int r1 = r1.visibleAnnotableParameterCount
            r2 = 1
            r0.visitAnnotableParameterCount(r1, r2)
        L160:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.visibleParameterAnnotations
            if (r0 == 0) goto L1c1
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.visibleParameterAnnotations
            int r0 = r0.length
            r10 = r0
        L16f:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L1c1
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.visibleParameterAnnotations
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L184
            goto L1bb
        L184:
            r0 = 0
            r12 = r0
            r0 = r11
            int r0 = r0.size()
            r13 = r0
        L190:
            r0 = r12
            r1 = r13
            if (r0 >= r1) goto L1bb
            r0 = r11
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r14
            java.lang.String r3 = r3.desc
            r4 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitParameterAnnotation(r2, r3, r4)
            r0.accept(r1)
            int r12 = r12 + 1
            goto L190
        L1bb:
            int r9 = r9 + 1
            goto L16f
        L1c1:
            r0 = r7
            int r0 = r0.invisibleAnnotableParameterCount
            if (r0 <= 0) goto L1d1
            r0 = r8
            r1 = r7
            int r1 = r1.invisibleAnnotableParameterCount
            r2 = 0
            r0.visitAnnotableParameterCount(r1, r2)
        L1d1:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.invisibleParameterAnnotations
            if (r0 == 0) goto L232
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.invisibleParameterAnnotations
            int r0 = r0.length
            r10 = r0
        L1e0:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L232
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] r0 = r0.invisibleParameterAnnotations
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1f5
            goto L22c
        L1f5:
            r0 = 0
            r12 = r0
            r0 = r11
            int r0 = r0.size()
            r13 = r0
        L201:
            r0 = r12
            r1 = r13
            if (r0 >= r1) goto L22c
            r0 = r11
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r14
            java.lang.String r3 = r3.desc
            r4 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitParameterAnnotation(r2, r3, r4)
            r0.accept(r1)
            int r12 = r12 + 1
            goto L201
        L22c:
            int r9 = r9 + 1
            goto L1e0
        L232:
            r0 = r7
            boolean r0 = r0.visited
            if (r0 == 0) goto L240
            r0 = r7
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r0.resetLabels()
        L240:
            r0 = r7
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            if (r0 == 0) goto L26f
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            int r0 = r0.size()
            r10 = r0
        L253:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L26f
            r0 = r8
            r1 = r7
            java.util.List<org.objectweb.asm.Attribute> r1 = r1.attrs
            r2 = r9
            java.lang.Object r1 = r1.get(r2)
            org.objectweb.asm.Attribute r1 = (org.objectweb.asm.Attribute) r1
            r0.visitAttribute(r1)
            int r9 = r9 + 1
            goto L253
        L26f:
            r0 = r7
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            int r0 = r0.size()
            if (r0 <= 0) goto L365
            r0 = r8
            r0.visitCode()
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            if (r0 == 0) goto L2bd
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            int r0 = r0.size()
            r10 = r0
        L290:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L2bd
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r1 = r9
            r0.updateIndex(r1)
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r1 = r8
            r0.accept(r1)
            int r9 = r9 + 1
            goto L290
        L2bd:
            r0 = r7
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            r1 = r8
            r0.accept(r1)
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableNode> r0 = r0.localVariables
            if (r0 == 0) goto L2f4
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableNode> r0 = r0.localVariables
            int r0 = r0.size()
            r10 = r0
        L2d8:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L2f4
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableNode> r0 = r0.localVariables
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.LocalVariableNode r0 = (org.objectweb.asm.tree.LocalVariableNode) r0
            r1 = r8
            r0.accept(r1)
            int r9 = r9 + 1
            goto L2d8
        L2f4:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.visibleLocalVariableAnnotations
            if (r0 == 0) goto L324
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.visibleLocalVariableAnnotations
            int r0 = r0.size()
            r10 = r0
        L307:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L324
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.visibleLocalVariableAnnotations
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.LocalVariableAnnotationNode r0 = (org.objectweb.asm.tree.LocalVariableAnnotationNode) r0
            r1 = r8
            r2 = 1
            r0.accept(r1, r2)
            int r9 = r9 + 1
            goto L307
        L324:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.invisibleLocalVariableAnnotations
            if (r0 == 0) goto L354
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.invisibleLocalVariableAnnotations
            int r0 = r0.size()
            r10 = r0
        L337:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L354
            r0 = r7
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> r0 = r0.invisibleLocalVariableAnnotations
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.LocalVariableAnnotationNode r0 = (org.objectweb.asm.tree.LocalVariableAnnotationNode) r0
            r1 = r8
            r2 = 0
            r0.accept(r1, r2)
            int r9 = r9 + 1
            goto L337
        L354:
            r0 = r8
            r1 = r7
            int r1 = r1.maxStack
            r2 = r7
            int r2 = r2.maxLocals
            r0.visitMaxs(r1, r2)
            r0 = r7
            r1 = 1
            r0.visited = r1
        L365:
            r0 = r8
            r0.visitEnd()
            return
    }
}
