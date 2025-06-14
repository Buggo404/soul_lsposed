package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/FieldWriter.SCL.lombok */
final class FieldWriter extends org.objectweb.asm.FieldVisitor {
    private final org.objectweb.asm.SymbolTable symbolTable;
    private final int accessFlags;
    private final int nameIndex;
    private final int descriptorIndex;
    private int signatureIndex;
    private int constantValueIndex;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.Attribute firstAttribute;

    FieldWriter(org.objectweb.asm.SymbolTable r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.symbolTable = r1
            r0 = r4
            r1 = r6
            r0.accessFlags = r1
            r0 = r4
            r1 = r5
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
            r0.nameIndex = r1
            r0 = r4
            r1 = r5
            r2 = r8
            int r1 = r1.addConstantUtf8(r2)
            r0.descriptorIndex = r1
            r0 = r9
            if (r0 == 0) goto L32
            r0 = r4
            r1 = r5
            r2 = r9
            int r1 = r1.addConstantUtf8(r2)
            r0.signatureIndex = r1
        L32:
            r0 = r10
            if (r0 == 0) goto L44
            r0 = r4
            r1 = r5
            r2 = r10
            org.objectweb.asm.Symbol r1 = r1.addConstant(r2)
            int r1 = r1.index
            r0.constantValueIndex = r1
        L44:
            return
    }

    @Override // org.objectweb.asm.FieldVisitor
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

    @Override // org.objectweb.asm.FieldVisitor
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

    @Override // org.objectweb.asm.FieldVisitor
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

    @Override // org.objectweb.asm.FieldVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    int computeFieldInfoSize() {
            r6 = this;
            r0 = 8
            r7 = r0
            r0 = r6
            int r0 = r0.constantValueIndex
            if (r0 == 0) goto L17
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "ConstantValue"
            int r0 = r0.addConstantUtf8(r1)
            int r7 = r7 + 8
        L17:
            r0 = r7
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            int r2 = r2.accessFlags
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
            if (r0 == 0) goto L54
            r0 = r7
            r1 = r6
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
            r7 = r0
        L54:
            r0 = r7
            return r0
    }

    void putFieldInfo(org.objectweb.asm.ByteVector r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L1c
            r0 = 4096(0x1000, float:5.74E-42)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r10 = r0
            r0 = r8
            r1 = r7
            int r1 = r1.accessFlags
            r2 = r10
            r3 = -1
            r2 = r2 ^ r3
            r1 = r1 & r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            int r1 = r1.nameIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            int r1 = r1.descriptorIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r11 = r0
            r0 = r7
            int r0 = r0.constantValueIndex
            if (r0 == 0) goto L46
            int r11 = r11 + 1
        L46:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L58
            r0 = r9
            if (r0 == 0) goto L58
            int r11 = r11 + 1
        L58:
            r0 = r7
            int r0 = r0.signatureIndex
            if (r0 == 0) goto L62
            int r11 = r11 + 1
        L62:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L6f
            int r11 = r11 + 1
        L6f:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleAnnotation
            if (r0 == 0) goto L79
            int r11 = r11 + 1
        L79:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleAnnotation
            if (r0 == 0) goto L83
            int r11 = r11 + 1
        L83:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L8d
            int r11 = r11 + 1
        L8d:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L97
            int r11 = r11 + 1
        L97:
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto Laa
            r0 = r11
            r1 = r7
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            int r1 = r1.getAttributeCount()
            int r0 = r0 + r1
            r11 = r0
        Laa:
            r0 = r8
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            int r0 = r0.constantValueIndex
            if (r0 == 0) goto Ld1
            r0 = r8
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "ConstantValue"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.constantValueIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        Ld1:
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            int r1 = r1.accessFlags
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
            if (r0 == 0) goto L10c
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r0.putAttributes(r1, r2)
        L10c:
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
