package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/RecordComponentNode.SCL.lombok */
public class RecordComponentNode extends org.objectweb.asm.RecordComponentVisitor {
    public java.lang.String name;
    public java.lang.String descriptor;
    public java.lang.String signature;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.Attribute> attrs;

    public RecordComponentNode(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.RecordComponentNode> r1 = org.objectweb.asm.tree.RecordComponentNode.class
            if (r0 == r1) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1a:
            return
    }

    public RecordComponentNode(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.name = r1
            r0 = r3
            r1 = r6
            r0.descriptor = r1
            r0 = r3
            r1 = r7
            r0.signature = r1
            return
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
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

    @Override // org.objectweb.asm.RecordComponentVisitor
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

    @Override // org.objectweb.asm.RecordComponentVisitor
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

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    public void check(int r4) {
            r3 = this;
            r0 = r4
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 >= r1) goto Le
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        Le:
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r8) {
            r7 = this;
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.name
            r2 = r7
            java.lang.String r2 = r2.descriptor
            r3 = r7
            java.lang.String r3 = r3.signature
            org.objectweb.asm.RecordComponentVisitor r0 = r0.visitRecordComponent(r1, r2, r3)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L16
            return
        L16:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            if (r0 == 0) goto L54
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            int r0 = r0.size()
            r11 = r0
        L2a:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L54
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
            goto L2a
        L54:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            if (r0 == 0) goto L92
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            int r0 = r0.size()
            r11 = r0
        L68:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L92
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
            goto L68
        L92:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto Lda
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r11 = r0
        La6:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto Lda
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
            goto La6
        Lda:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L122
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r11 = r0
        Lee:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L122
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
            goto Lee
        L122:
            r0 = r7
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            if (r0 == 0) goto L153
            r0 = 0
            r10 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            int r0 = r0.size()
            r11 = r0
        L136:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L153
            r0 = r9
            r1 = r7
            java.util.List<org.objectweb.asm.Attribute> r1 = r1.attrs
            r2 = r10
            java.lang.Object r1 = r1.get(r2)
            org.objectweb.asm.Attribute r1 = (org.objectweb.asm.Attribute) r1
            r0.visitAttribute(r1)
            int r10 = r10 + 1
            goto L136
        L153:
            r0 = r9
            r0.visitEnd()
            return
    }
}
