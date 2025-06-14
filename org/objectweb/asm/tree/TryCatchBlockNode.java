package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/TryCatchBlockNode.SCL.lombok */
public class TryCatchBlockNode {
    public org.objectweb.asm.tree.LabelNode start;
    public org.objectweb.asm.tree.LabelNode end;
    public org.objectweb.asm.tree.LabelNode handler;
    public java.lang.String type;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;

    public TryCatchBlockNode(org.objectweb.asm.tree.LabelNode r4, org.objectweb.asm.tree.LabelNode r5, org.objectweb.asm.tree.LabelNode r6, java.lang.String r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.start = r1
            r0 = r3
            r1 = r5
            r0.end = r1
            r0 = r3
            r1 = r6
            r0.handler = r1
            r0 = r3
            r1 = r7
            r0.type = r1
            return
    }

    public void updateIndex(int r5) {
            r4 = this;
            r0 = 1107296256(0x42000000, float:32.0)
            r1 = r5
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r6 = r0
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L39
            r0 = 0
            r7 = r0
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r8 = r0
        L1c:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L39
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r1 = r6
            r0.typeRef = r1
            int r7 = r7 + 1
            goto L1c
        L39:
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L6a
            r0 = 0
            r7 = r0
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r8 = r0
        L4d:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L6a
            r0 = r4
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r1 = r6
            r0.typeRef = r1
            int r7 = r7 + 1
            goto L4d
        L6a:
            return
    }

    public void accept(org.objectweb.asm.MethodVisitor r8) {
            r7 = this;
            r0 = r8
            r1 = r7
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            org.objectweb.asm.Label r1 = r1.getLabel()
            r2 = r7
            org.objectweb.asm.tree.LabelNode r2 = r2.end
            org.objectweb.asm.Label r2 = r2.getLabel()
            r3 = r7
            org.objectweb.asm.tree.LabelNode r3 = r3.handler
            if (r3 != 0) goto L1a
            r3 = 0
            goto L21
        L1a:
            r3 = r7
            org.objectweb.asm.tree.LabelNode r3 = r3.handler
            org.objectweb.asm.Label r3 = r3.getLabel()
        L21:
            r4 = r7
            java.lang.String r4 = r4.type
            r0.visitTryCatchBlock(r1, r2, r3, r4)
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L6e
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r10 = r0
        L3b:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L6e
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
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTryCatchAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L3b
        L6e:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto Lb4
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r10 = r0
        L81:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto Lb4
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
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTryCatchAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r9 = r9 + 1
            goto L81
        Lb4:
            return
    }
}
