package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/RecordComponentWriter.SCL.lombok */
final class RecordComponentWriter extends org.objectweb.asm.RecordComponentVisitor {
    private final org.objectweb.asm.SymbolTable symbolTable;
    private final int nameIndex;
    private final int descriptorIndex;
    private int signatureIndex;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.Attribute firstAttribute;

    RecordComponentWriter(org.objectweb.asm.SymbolTable r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.symbolTable = r1
            r0 = r4
            r1 = r5
            r2 = r6
            int r1 = r1.addConstantUtf8(r2)
            r0.nameIndex = r1
            r0 = r4
            r1 = r5
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
            r0.descriptorIndex = r1
            r0 = r8
            if (r0 == 0) goto L2c
            r0 = r4
            r1 = r5
            r2 = r8
            int r1 = r1.addConstantUtf8(r2)
            r0.signatureIndex = r1
        L2c:
            return
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r6, boolean r7) {
            r5 = this;
            r0 = r7
            if (r0 == 0) goto L16
            r0 = r5
            r1 = r5
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            r3 = r5
            org.objectweb.asm.AnnotationWriter r3 = r3.lastRuntimeVisibleAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastRuntimeVisibleAnnotation = r2
            return r0
        L16:
            r0 = r5
            r1 = r5
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            r3 = r5
            org.objectweb.asm.AnnotationWriter r3 = r3.lastRuntimeInvisibleAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastRuntimeInvisibleAnnotation = r2
            return r0
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r8, org.objectweb.asm.TypePath r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto L19
            r0 = r7
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r7
            org.objectweb.asm.AnnotationWriter r5 = r5.lastRuntimeVisibleTypeAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3, r4, r5)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastRuntimeVisibleTypeAnnotation = r2
            return r0
        L19:
            r0 = r7
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r7
            org.objectweb.asm.AnnotationWriter r5 = r5.lastRuntimeInvisibleTypeAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3, r4, r5)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastRuntimeInvisibleTypeAnnotation = r2
            return r0
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r0.nextAttribute = r1
            r0 = r3
            r1 = r4
            r0.firstAttribute = r1
            return
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    int computeRecordComponentInfoSize() {
            r6 = this;
            r0 = 6
            r7 = r0
            r0 = r7
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = 0
            r3 = r6
            int r3 = r3.signatureIndex
            int r1 = org.objectweb.asm.Attribute.computeAttributesSize(r1, r2, r3)
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = r6
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeVisibleAnnotation
            r2 = r6
            org.objectweb.asm.AnnotationWriter r2 = r2.lastRuntimeInvisibleAnnotation
            r3 = r6
            org.objectweb.asm.AnnotationWriter r3 = r3.lastRuntimeVisibleTypeAnnotation
            r4 = r6
            org.objectweb.asm.AnnotationWriter r4 = r4.lastRuntimeInvisibleTypeAnnotation
            int r1 = org.objectweb.asm.AnnotationWriter.computeAnnotationsSize(r1, r2, r3, r4)
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L3d
            r0 = r7
            r1 = r6
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
            r7 = r0
        L3d:
            r0 = r7
            return r0
    }

    void putRecordComponentInfo(org.objectweb.asm.ByteVector r8) {
            r7 = this;
            r0 = r8
            r1 = r7
            int r1 = r1.nameIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            int r1 = r1.descriptorIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r9 = r0
            r0 = r7
            int r0 = r0.signatureIndex
            if (r0 == 0) goto L1c
            int r9 = r9 + 1
        L1c:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleAnnotation
            if (r0 == 0) goto L26
            int r9 = r9 + 1
        L26:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleAnnotation
            if (r0 == 0) goto L30
            int r9 = r9 + 1
        L30:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L3a
            int r9 = r9 + 1
        L3a:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L44
            int r9 = r9 + 1
        L44:
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L55
            r0 = r9
            r1 = r7
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            int r1 = r1.getAttributeCount()
            int r0 = r0 + r1
            r9 = r0
        L55:
            r0 = r8
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = 0
            r2 = r7
            int r2 = r2.signatureIndex
            r3 = r8
            org.objectweb.asm.Attribute.putAttributes(r0, r1, r2, r3)
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeVisibleAnnotation
            r2 = r7
            org.objectweb.asm.AnnotationWriter r2 = r2.lastRuntimeInvisibleAnnotation
            r3 = r7
            org.objectweb.asm.AnnotationWriter r3 = r3.lastRuntimeVisibleTypeAnnotation
            r4 = r7
            org.objectweb.asm.AnnotationWriter r4 = r4.lastRuntimeInvisibleTypeAnnotation
            r5 = r8
            org.objectweb.asm.AnnotationWriter.putAnnotations(r0, r1, r2, r3, r4, r5)
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L93
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r0.putAttributes(r1, r2)
        L93:
            return
    }

    final void collectAttributePrototypes(org.objectweb.asm.Attribute.Set r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r0.addAttributes(r1)
            return
    }
}
