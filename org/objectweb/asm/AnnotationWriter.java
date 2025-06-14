package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/AnnotationWriter.SCL.lombok */
final class AnnotationWriter extends org.objectweb.asm.AnnotationVisitor {
    private final org.objectweb.asm.SymbolTable symbolTable;
    private final boolean useNamedValues;
    private final org.objectweb.asm.ByteVector annotation;
    private final int numElementValuePairsOffset;
    private int numElementValuePairs;
    private final org.objectweb.asm.AnnotationWriter previousAnnotation;
    private org.objectweb.asm.AnnotationWriter nextAnnotation;

    AnnotationWriter(org.objectweb.asm.SymbolTable r5, boolean r6, org.objectweb.asm.ByteVector r7, org.objectweb.asm.AnnotationWriter r8) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.symbolTable = r1
            r0 = r4
            r1 = r6
            r0.useNamedValues = r1
            r0 = r4
            r1 = r7
            r0.annotation = r1
            r0 = r4
            r1 = r7
            int r1 = r1.length
            if (r1 != 0) goto L21
            r1 = -1
            goto L27
        L21:
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
        L27:
            r0.numElementValuePairsOffset = r1
            r0 = r4
            r1 = r8
            r0.previousAnnotation = r1
            r0 = r8
            if (r0 == 0) goto L3b
            r0 = r8
            r1 = r4
            r0.nextAnnotation = r1
        L3b:
            return
    }

    static org.objectweb.asm.AnnotationWriter create(org.objectweb.asm.SymbolTable r7, java.lang.String r8, org.objectweb.asm.AnnotationWriter r9) {
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r7
            r2 = r8
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r7
            r3 = 1
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    static org.objectweb.asm.AnnotationWriter create(org.objectweb.asm.SymbolTable r7, int r8, org.objectweb.asm.TypePath r9, java.lang.String r10, org.objectweb.asm.AnnotationWriter r11) {
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r8
            r1 = r12
            org.objectweb.asm.TypeReference.putTarget(r0, r1)
            r0 = r9
            r1 = r12
            org.objectweb.asm.TypePath.put(r0, r1)
            r0 = r12
            r1 = r7
            r2 = r10
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r7
            r3 = 1
            r4 = r12
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String r7, java.lang.Object r8) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.numElementValuePairs
            r2 = 1
            int r1 = r1 + r2
            r0.numElementValuePairs = r1
            r0 = r6
            boolean r0 = r0.useNamedValues
            if (r0 == 0) goto L21
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L40
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 115(0x73, float:1.61E-43)
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            int r2 = r2.addConstantUtf8(r3)
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L3a6
        L40:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L65
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 66
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L3a6
        L65:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L94
            r0 = r8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 90
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r9
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L3a6
        L94:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto Lb9
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 67
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L3a6
        Lb9:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 == 0) goto Lde
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 83
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            java.lang.Short r3 = (java.lang.Short) r3
            short r3 = r3.shortValue()
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L3a6
        Lde:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L100
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 99
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            org.objectweb.asm.Type r3 = (org.objectweb.asm.Type) r3
            java.lang.String r3 = r3.getDescriptor()
            int r2 = r2.addConstantUtf8(r3)
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L3a6
        L100:
            r0 = r8
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L150
            r0 = r8
            byte[] r0 = (byte[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L123:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L14d
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 66
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L123
        L14d:
            goto L3a6
        L150:
            r0 = r8
            boolean r0 = r0 instanceof boolean[]
            if (r0 == 0) goto L1a8
            r0 = r8
            boolean[] r0 = (boolean[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L173:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L1a5
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 90
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            if (r3 == 0) goto L194
            r3 = 1
            goto L195
        L194:
            r3 = 0
        L195:
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L173
        L1a5:
            goto L3a6
        L1a8:
            r0 = r8
            boolean r0 = r0 instanceof short[]
            if (r0 == 0) goto L1f8
            r0 = r8
            short[] r0 = (short[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L1cb:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L1f5
            r0 = r10
            r1 = r12
            short r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 83
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L1cb
        L1f5:
            goto L3a6
        L1f8:
            r0 = r8
            boolean r0 = r0 instanceof char[]
            if (r0 == 0) goto L248
            r0 = r8
            char[] r0 = (char[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L21b:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L245
            r0 = r10
            r1 = r12
            char r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 67
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L21b
        L245:
            goto L3a6
        L248:
            r0 = r8
            boolean r0 = r0 instanceof int[]
            if (r0 == 0) goto L298
            r0 = r8
            int[] r0 = (int[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L26b:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L295
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 73
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantInteger(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L26b
        L295:
            goto L3a6
        L298:
            r0 = r8
            boolean r0 = r0 instanceof long[]
            if (r0 == 0) goto L2e8
            r0 = r8
            long[] r0 = (long[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L2bb:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L2e5
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 74
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantLong(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L2bb
        L2e5:
            goto L3a6
        L2e8:
            r0 = r8
            boolean r0 = r0 instanceof float[]
            if (r0 == 0) goto L338
            r0 = r8
            float[] r0 = (float[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L30b:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L335
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 70
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantFloat(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L30b
        L335:
            goto L3a6
        L338:
            r0 = r8
            boolean r0 = r0 instanceof double[]
            if (r0 == 0) goto L388
            r0 = r8
            double[] r0 = (double[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L35b:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L385
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 68
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r13
            org.objectweb.asm.Symbol r2 = r2.addConstantDouble(r3)
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            int r12 = r12 + 1
            goto L35b
        L385:
            goto L3a6
        L388:
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            org.objectweb.asm.Symbol r0 = r0.addConstant(r1)
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.annotation
            java.lang.String r1 = ".s.IFJDCS"
            r2 = r9
            int r2 = r2.tag
            char r1 = r1.charAt(r2)
            r2 = r9
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
        L3a6:
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r0
            int r1 = r1.numElementValuePairs
            r2 = 1
            int r1 = r1 + r2
            r0.numElementValuePairs = r1
            r0 = r5
            boolean r0 = r0.useNamedValues
            if (r0 == 0) goto L21
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = r5
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 101(0x65, float:1.42E-43)
            r2 = r5
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r7
            int r2 = r2.addConstantUtf8(r3)
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r1 = r5
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = r7
            r1 = r0
            int r1 = r1.numElementValuePairs
            r2 = 1
            int r1 = r1 + r2
            r0.numElementValuePairs = r1
            r0 = r7
            boolean r0 = r0.useNamedValues
            if (r0 == 0) goto L21
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 64
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r9
            int r2 = r2.addConstantUtf8(r3)
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = 1
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.annotation
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r8) {
            r7 = this;
            r0 = r7
            r1 = r0
            int r1 = r1.numElementValuePairs
            r2 = 1
            int r1 = r1 + r2
            r0.numElementValuePairs = r1
            r0 = r7
            boolean r0 = r0.useNamedValues
            if (r0 == 0) goto L21
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.annotation
            r1 = 91
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = 0
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.annotation
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
            r5 = this;
            r0 = r5
            int r0 = r0.numElementValuePairsOffset
            r1 = -1
            if (r0 == r1) goto L2b
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.annotation
            byte[] r0 = r0.data
            r6 = r0
            r0 = r6
            r1 = r5
            int r1 = r1.numElementValuePairsOffset
            r2 = r5
            int r2 = r2.numElementValuePairs
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r5
            int r1 = r1.numElementValuePairsOffset
            r2 = 1
            int r1 = r1 + r2
            r2 = r5
            int r2 = r2.numElementValuePairs
            byte r2 = (byte) r2
            r0[r1] = r2
        L2b:
            return
    }

    int computeAnnotationsSize(java.lang.String r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto Ld
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            int r0 = r0.addConstantUtf8(r1)
        Ld:
            r0 = 8
            r5 = r0
            r0 = r3
            r6 = r0
        L12:
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r5
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.annotation
            int r1 = r1.length
            int r0 = r0 + r1
            r5 = r0
            r0 = r6
            org.objectweb.asm.AnnotationWriter r0 = r0.previousAnnotation
            r6 = r0
            goto L12
        L28:
            r0 = r5
            return r0
    }

    static int computeAnnotationsSize(org.objectweb.asm.AnnotationWriter r4, org.objectweb.asm.AnnotationWriter r5, org.objectweb.asm.AnnotationWriter r6, org.objectweb.asm.AnnotationWriter r7) {
            r0 = 0
            r8 = r0
            r0 = r4
            if (r0 == 0) goto L12
            r0 = r8
            r1 = r4
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L12:
            r0 = r5
            if (r0 == 0) goto L21
            r0 = r8
            r1 = r5
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L21:
            r0 = r6
            if (r0 == 0) goto L30
            r0 = r8
            r1 = r6
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L30:
            r0 = r7
            if (r0 == 0) goto L3f
            r0 = r8
            r1 = r7
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L3f:
            r0 = r8
            return r0
    }

    void putAnnotations(int r6, org.objectweb.asm.ByteVector r7) {
            r5 = this;
            r0 = 2
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r5
            r10 = r0
            r0 = 0
            r11 = r0
        Lb:
            r0 = r10
            if (r0 == 0) goto L31
            r0 = r10
            r0.visitEnd()
            r0 = r8
            r1 = r10
            org.objectweb.asm.ByteVector r1 = r1.annotation
            int r1 = r1.length
            int r0 = r0 + r1
            r8 = r0
            int r9 = r9 + 1
            r0 = r10
            r11 = r0
            r0 = r10
            org.objectweb.asm.AnnotationWriter r0 = r0.previousAnnotation
            r10 = r0
            goto Lb
        L31:
            r0 = r7
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r7
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r11
            r10 = r0
        L48:
            r0 = r10
            if (r0 == 0) goto L6d
            r0 = r7
            r1 = r10
            org.objectweb.asm.ByteVector r1 = r1.annotation
            byte[] r1 = r1.data
            r2 = 0
            r3 = r10
            org.objectweb.asm.ByteVector r3 = r3.annotation
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r10
            org.objectweb.asm.AnnotationWriter r0 = r0.nextAnnotation
            r10 = r0
            goto L48
        L6d:
            return
    }

    static void putAnnotations(org.objectweb.asm.SymbolTable r4, org.objectweb.asm.AnnotationWriter r5, org.objectweb.asm.AnnotationWriter r6, org.objectweb.asm.AnnotationWriter r7, org.objectweb.asm.AnnotationWriter r8, org.objectweb.asm.ByteVector r9) {
            r0 = r5
            if (r0 == 0) goto L10
            r0 = r5
            r1 = r4
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r2 = r9
            r0.putAnnotations(r1, r2)
        L10:
            r0 = r6
            if (r0 == 0) goto L20
            r0 = r6
            r1 = r4
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r2 = r9
            r0.putAnnotations(r1, r2)
        L20:
            r0 = r7
            if (r0 == 0) goto L30
            r0 = r7
            r1 = r4
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r2 = r9
            r0.putAnnotations(r1, r2)
        L30:
            r0 = r8
            if (r0 == 0) goto L42
            r0 = r8
            r1 = r4
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r2 = r9
            r0.putAnnotations(r1, r2)
        L42:
            return
    }

    static int computeParameterAnnotationsSize(java.lang.String r4, org.objectweb.asm.AnnotationWriter[] r5, int r6) {
            r0 = 7
            r1 = 2
            r2 = r6
            int r1 = r1 * r2
            int r0 = r0 + r1
            r7 = r0
            r0 = 0
            r8 = r0
        La:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L31
            r0 = r5
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r7
            r1 = r9
            if (r1 != 0) goto L20
            r1 = 0
            goto L29
        L20:
            r1 = r9
            r2 = r4
            int r1 = r1.computeAnnotationsSize(r2)
            r2 = 8
            int r1 = r1 - r2
        L29:
            int r0 = r0 + r1
            r7 = r0
            int r8 = r8 + 1
            goto La
        L31:
            r0 = r7
            return r0
    }

    static void putParameterAnnotations(int r5, org.objectweb.asm.AnnotationWriter[] r6, int r7, org.objectweb.asm.ByteVector r8) {
            r0 = 1
            r1 = 2
            r2 = r7
            int r1 = r1 * r2
            int r0 = r0 + r1
            r9 = r0
            r0 = 0
            r10 = r0
        La:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L33
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r9
            r1 = r11
            if (r1 != 0) goto L21
            r1 = 0
            goto L2a
        L21:
            r1 = r11
            r2 = 0
            int r1 = r1.computeAnnotationsSize(r2)
            r2 = 8
            int r1 = r1 - r2
        L2a:
            int r0 = r0 + r1
            r9 = r0
            int r10 = r10 + 1
            goto La
        L33:
            r0 = r8
            r1 = r5
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r8
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = 0
            r10 = r0
        L49:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto Lac
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
        L5b:
            r0 = r11
            if (r0 == 0) goto L76
            r0 = r11
            r0.visitEnd()
            int r13 = r13 + 1
            r0 = r11
            r12 = r0
            r0 = r11
            org.objectweb.asm.AnnotationWriter r0 = r0.previousAnnotation
            r11 = r0
            goto L5b
        L76:
            r0 = r8
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r12
            r11 = r0
        L81:
            r0 = r11
            if (r0 == 0) goto La6
            r0 = r8
            r1 = r11
            org.objectweb.asm.ByteVector r1 = r1.annotation
            byte[] r1 = r1.data
            r2 = 0
            r3 = r11
            org.objectweb.asm.ByteVector r3 = r3.annotation
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r11
            org.objectweb.asm.AnnotationWriter r0 = r0.nextAnnotation
            r11 = r0
            goto L81
        La6:
            int r10 = r10 + 1
            goto L49
        Lac:
            return
    }
}
