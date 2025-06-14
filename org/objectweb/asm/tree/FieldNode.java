package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/FieldNode.SCL.lombok */
public class FieldNode extends org.objectweb.asm.FieldVisitor {
    public int access;
    public java.lang.String name;
    public java.lang.String desc;
    public java.lang.String signature;
    public java.lang.Object value;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.Attribute> attrs;

    public FieldNode(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object r13) {
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
            java.lang.Class<org.objectweb.asm.tree.FieldNode> r1 = org.objectweb.asm.tree.FieldNode.class
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            return
    }

    public FieldNode(int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.access = r1
            r0 = r3
            r1 = r6
            r0.name = r1
            r0 = r3
            r1 = r7
            r0.desc = r1
            r0 = r3
            r1 = r8
            r0.signature = r1
            r0 = r3
            r1 = r9
            r0.value = r1
            return
    }

    @Override // org.objectweb.asm.FieldVisitor
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

    @Override // org.objectweb.asm.FieldVisitor
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

    @Override // org.objectweb.asm.FieldVisitor
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

    @Override // org.objectweb.asm.FieldVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    public void check(int r4) {
            r3 = this;
            r0 = r4
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 != r1) goto L3c
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L21
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L21:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L3c
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L3c:
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r8) {
            r7 = this;
            r0 = r8
            r1 = r7
            int r1 = r1.access
            r2 = r7
            java.lang.String r2 = r2.name
            r3 = r7
            java.lang.String r3 = r3.desc
            r4 = r7
            java.lang.String r4 = r4.signature
            r5 = r7
            java.lang.Object r5 = r5.value
            org.objectweb.asm.FieldVisitor r0 = r0.visitField(r1, r2, r3, r4, r5)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1e
            return
        L1e:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            if (r0 == 0) goto L5c
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            int r0 = r0.size()
            r11 = r0
        L32:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L5c
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r12
            java.lang.String r2 = r2.desc
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            int r10 = r10 + 1
            goto L32
        L5c:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            if (r0 == 0) goto L9a
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            int r0 = r0.size()
            r11 = r0
        L70:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L9a
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r12
            java.lang.String r2 = r2.desc
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            int r10 = r10 + 1
            goto L70
        L9a:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto Le2
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r11 = r0
        Lae:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto Le2
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r12
            int r2 = r2.typeRef
            r3 = r12
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r12
            java.lang.String r4 = r4.desc
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r10 = r10 + 1
            goto Lae
        Le2:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L12a
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r11 = r0
        Lf6:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L12a
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r12
            int r2 = r2.typeRef
            r3 = r12
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r12
            java.lang.String r4 = r4.desc
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r10 = r10 + 1
            goto Lf6
        L12a:
            r0 = r7
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            if (r0 == 0) goto L15b
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            int r0 = r0.size()
            r11 = r0
        L13e:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L15b
            r0 = r9
            r1 = r7
            java.util.List<org.objectweb.asm.Attribute> r1 = r1.attrs
            r2 = r10
            java.lang.Object r1 = r1.get(r2)
            org.objectweb.asm.Attribute r1 = (org.objectweb.asm.Attribute) r1
            r0.visitAttribute(r1)
            int r10 = r10 + 1
            goto L13e
        L15b:
            r0 = r9
            r0.visitEnd()
            return
    }
}
