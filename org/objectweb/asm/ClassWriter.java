package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/ClassWriter.SCL.lombok */
public class ClassWriter extends org.objectweb.asm.ClassVisitor {
    public static final int COMPUTE_MAXS = 1;
    public static final int COMPUTE_FRAMES = 2;
    private final int flags;
    private int version;
    private final org.objectweb.asm.SymbolTable symbolTable;
    private int accessFlags;
    private int thisClass;
    private int superClass;
    private int interfaceCount;
    private int[] interfaces;
    private org.objectweb.asm.FieldWriter firstField;
    private org.objectweb.asm.FieldWriter lastField;
    private org.objectweb.asm.MethodWriter firstMethod;
    private org.objectweb.asm.MethodWriter lastMethod;
    private int numberOfInnerClasses;
    private org.objectweb.asm.ByteVector innerClasses;
    private int enclosingClassIndex;
    private int enclosingMethodIndex;
    private int signatureIndex;
    private int sourceFileIndex;
    private org.objectweb.asm.ByteVector debugExtension;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.ModuleWriter moduleWriter;
    private int nestHostClassIndex;
    private int numberOfNestMemberClasses;
    private org.objectweb.asm.ByteVector nestMemberClasses;
    private int numberOfPermittedSubclasses;
    private org.objectweb.asm.ByteVector permittedSubclasses;
    private org.objectweb.asm.RecordComponentWriter firstRecordComponent;
    private org.objectweb.asm.RecordComponentWriter lastRecordComponent;
    private org.objectweb.asm.Attribute firstAttribute;
    private int compute;

    public ClassWriter(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public ClassWriter(org.objectweb.asm.ClassReader r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r6
            r1 = r8
            r0.flags = r1
            r0 = r6
            r1 = r7
            if (r1 != 0) goto L1b
            org.objectweb.asm.SymbolTable r1 = new org.objectweb.asm.SymbolTable
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            goto L24
        L1b:
            org.objectweb.asm.SymbolTable r1 = new org.objectweb.asm.SymbolTable
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
        L24:
            r0.symbolTable = r1
            r0 = r8
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L35
            r0 = r6
            r1 = 4
            r0.compute = r1
            goto L48
        L35:
            r0 = r8
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L43
            r0 = r6
            r1 = 1
            r0.compute = r1
            goto L48
        L43:
            r0 = r6
            r1 = 0
            r0.compute = r1
        L48:
            return
    }

    public boolean hasFlags(int r4) {
            r3 = this;
            r0 = r3
            int r0 = r0.flags
            r1 = r4
            r0 = r0 & r1
            r1 = r4
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visit(int r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r0.version = r1
            r0 = r6
            r1 = r8
            r0.accessFlags = r1
            r0 = r6
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            r3 = r9
            int r1 = r1.setMajorVersionAndClassName(r2, r3)
            r0.thisClass = r1
            r0 = r10
            if (r0 == 0) goto L2c
            r0 = r6
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r10
            int r1 = r1.addConstantUtf8(r2)
            r0.signatureIndex = r1
        L2c:
            r0 = r6
            r1 = r11
            if (r1 != 0) goto L36
            r1 = 0
            goto L42
        L36:
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r11
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
        L42:
            r0.superClass = r1
            r0 = r12
            if (r0 == 0) goto L89
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto L89
            r0 = r6
            r1 = r12
            int r1 = r1.length
            r0.interfaceCount = r1
            r0 = r6
            r1 = r6
            int r1 = r1.interfaceCount
            int[] r1 = new int[r1]
            r0.interfaces = r1
            r0 = 0
            r13 = r0
        L64:
            r0 = r13
            r1 = r6
            int r1 = r1.interfaceCount
            if (r0 >= r1) goto L89
            r0 = r6
            int[] r0 = r0.interfaces
            r1 = r13
            r2 = r6
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r12
            r4 = r13
            r3 = r3[r4]
            org.objectweb.asm.Symbol r2 = r2.addConstantClass(r3)
            int r2 = r2.index
            r0[r1] = r2
            int r13 = r13 + 1
            goto L64
        L89:
            r0 = r6
            int r0 = r0.compute
            r1 = 1
            if (r0 != r1) goto L9f
            r0 = r7
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 51
            if (r0 < r1) goto L9f
            r0 = r6
            r1 = 2
            r0.compute = r1
        L9f:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitSource(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = r7
            if (r0 == 0) goto L10
            r0 = r6
            r1 = r6
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
            r0.sourceFileIndex = r1
        L10:
            r0 = r8
            if (r0 == 0) goto L26
            r0 = r6
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r2 = r8
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            org.objectweb.asm.ByteVector r1 = r1.encodeUtf8(r2, r3, r4)
            r0.debugExtension = r1
        L26:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.ModuleVisitor visitModule(java.lang.String r10, int r11, java.lang.String r12) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.ModuleWriter r1 = new org.objectweb.asm.ModuleWriter
            r2 = r1
            r3 = r9
            org.objectweb.asm.SymbolTable r3 = r3.symbolTable
            r4 = r9
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r5 = r10
            org.objectweb.asm.Symbol r4 = r4.addConstantModule(r5)
            int r4 = r4.index
            r5 = r11
            r6 = r12
            if (r6 != 0) goto L1d
            r6 = 0
            goto L25
        L1d:
            r6 = r9
            org.objectweb.asm.SymbolTable r6 = r6.symbolTable
            r7 = r12
            int r6 = r6.addConstantUtf8(r7)
        L25:
            r2.<init>(r3, r4, r5, r6)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.moduleWriter = r2
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitNestHost(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            r0.nestHostClassIndex = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitOuterClass(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            r0.enclosingClassIndex = r1
            r0 = r7
            if (r0 == 0) goto L24
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r5
            r1 = r5
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            r3 = r8
            int r1 = r1.addConstantNameAndType(r2, r3)
            r0.enclosingMethodIndex = r1
        L24:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r6, boolean r7) {
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

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r8, org.objectweb.asm.TypePath r9, java.lang.String r10, boolean r11) {
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

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitAttribute(org.objectweb.asm.Attribute r4) {
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

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitNestMember(java.lang.String r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.nestMemberClasses
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.nestMemberClasses = r1
        L12:
            r0 = r4
            r1 = r0
            int r1 = r1.numberOfNestMemberClasses
            r2 = 1
            int r1 = r1 + r2
            r0.numberOfNestMemberClasses = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.nestMemberClasses
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitPermittedSubclass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.permittedSubclasses
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.permittedSubclasses = r1
        L12:
            r0 = r4
            r1 = r0
            int r1 = r1.numberOfPermittedSubclasses
            r2 = 1
            int r1 = r1 + r2
            r0.numberOfPermittedSubclasses = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.permittedSubclasses
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitInnerClass(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.innerClasses = r1
        L12:
            r0 = r4
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            r9 = r0
            r0 = r9
            int r0 = r0.info
            if (r0 != 0) goto L81
            r0 = r4
            r1 = r0
            int r1 = r1.numberOfInnerClasses
            r2 = 1
            int r1 = r1 + r2
            r0.numberOfInnerClasses = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            r1 = r9
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            r1 = r6
            if (r1 != 0) goto L47
            r1 = 0
            goto L52
        L47:
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
        L52:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            r1 = r7
            if (r1 != 0) goto L62
            r1 = 0
            goto L6a
        L62:
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
        L6a:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r4
            int r1 = r1.numberOfInnerClasses
            r0.info = r1
        L81:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            org.objectweb.asm.RecordComponentWriter r0 = new org.objectweb.asm.RecordComponentWriter
            r1 = r0
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r11 = r0
            r0 = r7
            org.objectweb.asm.RecordComponentWriter r0 = r0.firstRecordComponent
            if (r0 != 0) goto L20
            r0 = r7
            r1 = r11
            r0.firstRecordComponent = r1
            goto L29
        L20:
            r0 = r7
            org.objectweb.asm.RecordComponentWriter r0 = r0.lastRecordComponent
            r1 = r11
            r0.delegate = r1
        L29:
            r0 = r7
            r1 = r11
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastRecordComponent = r2
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.FieldVisitor visitField(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Object r14) {
            r9 = this;
            org.objectweb.asm.FieldWriter r0 = new org.objectweb.asm.FieldWriter
            r1 = r0
            r2 = r9
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r15 = r0
            r0 = r9
            org.objectweb.asm.FieldWriter r0 = r0.firstField
            if (r0 != 0) goto L24
            r0 = r9
            r1 = r15
            r0.firstField = r1
            goto L2d
        L24:
            r0 = r9
            org.objectweb.asm.FieldWriter r0 = r0.lastField
            r1 = r15
            r0.f625fv = r1
        L2d:
            r0 = r9
            r1 = r15
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastField = r2
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.MethodVisitor visitMethod(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
            r10 = this;
            org.objectweb.asm.MethodWriter r0 = new org.objectweb.asm.MethodWriter
            r1 = r0
            r2 = r10
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r10
            int r8 = r8.compute
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r16 = r0
            r0 = r10
            org.objectweb.asm.MethodWriter r0 = r0.firstMethod
            if (r0 != 0) goto L28
            r0 = r10
            r1 = r16
            r0.firstMethod = r1
            goto L31
        L28:
            r0 = r10
            org.objectweb.asm.MethodWriter r0 = r0.lastMethod
            r1 = r16
            r0.f626mv = r1
        L31:
            r0 = r10
            r1 = r16
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastMethod = r2
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitEnd() {
            r1 = this;
            return
    }

    public byte[] toByteArray() {
            r7 = this;
            r0 = 24
            r1 = 2
            r2 = r7
            int r2 = r2.interfaceCount
            int r1 = r1 * r2
            int r0 = r0 + r1
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            org.objectweb.asm.FieldWriter r0 = r0.firstField
            r10 = r0
        L11:
            r0 = r10
            if (r0 == 0) goto L2a
            int r9 = r9 + 1
            r0 = r8
            r1 = r10
            int r1 = r1.computeFieldInfoSize()
            int r0 = r0 + r1
            r8 = r0
            r0 = r10
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            org.objectweb.asm.FieldWriter r0 = (org.objectweb.asm.FieldWriter) r0
            r10 = r0
            goto L11
        L2a:
            r0 = 0
            r11 = r0
            r0 = r7
            org.objectweb.asm.MethodWriter r0 = r0.firstMethod
            r12 = r0
        L33:
            r0 = r12
            if (r0 == 0) goto L50
            int r11 = r11 + 1
            r0 = r8
            r1 = r12
            int r1 = r1.computeMethodInfoSize()
            int r0 = r0 + r1
            r8 = r0
            r0 = r12
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r12 = r0
            goto L33
        L50:
            r0 = 0
            r13 = r0
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            if (r0 == 0) goto L75
            int r13 = r13 + 1
            r0 = r8
            r1 = 8
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.innerClasses
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "InnerClasses"
            int r0 = r0.addConstantUtf8(r1)
        L75:
            r0 = r7
            int r0 = r0.enclosingClassIndex
            if (r0 == 0) goto L8d
            int r13 = r13 + 1
            int r8 = r8 + 10
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "EnclosingMethod"
            int r0 = r0.addConstantUtf8(r1)
        L8d:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto Lb5
            r0 = r7
            int r0 = r0.version
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 >= r1) goto Lb5
            int r13 = r13 + 1
            int r8 = r8 + 6
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Synthetic"
            int r0 = r0.addConstantUtf8(r1)
        Lb5:
            r0 = r7
            int r0 = r0.signatureIndex
            if (r0 == 0) goto Lcd
            int r13 = r13 + 1
            int r8 = r8 + 8
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Signature"
            int r0 = r0.addConstantUtf8(r1)
        Lcd:
            r0 = r7
            int r0 = r0.sourceFileIndex
            if (r0 == 0) goto Le5
            int r13 = r13 + 1
            int r8 = r8 + 8
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "SourceFile"
            int r0 = r0.addConstantUtf8(r1)
        Le5:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.debugExtension
            if (r0 == 0) goto L107
            int r13 = r13 + 1
            r0 = r8
            r1 = 6
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.debugExtension
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "SourceDebugExtension"
            int r0 = r0.addConstantUtf8(r1)
        L107:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L123
            int r13 = r13 + 1
            int r8 = r8 + 6
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Deprecated"
            int r0 = r0.addConstantUtf8(r1)
        L123:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleAnnotation
            if (r0 == 0) goto L13a
            int r13 = r13 + 1
            r0 = r8
            r1 = r7
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeVisibleAnnotation
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L13a:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleAnnotation
            if (r0 == 0) goto L151
            int r13 = r13 + 1
            r0 = r8
            r1 = r7
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeInvisibleAnnotation
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L151:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L168
            int r13 = r13 + 1
            r0 = r8
            r1 = r7
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeVisibleTypeAnnotation
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L168:
            r0 = r7
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L17f
            int r13 = r13 + 1
            r0 = r8
            r1 = r7
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeInvisibleTypeAnnotation
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L17f:
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.computeBootstrapMethodsSize()
            if (r0 <= 0) goto L196
            int r13 = r13 + 1
            r0 = r8
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            int r1 = r1.computeBootstrapMethodsSize()
            int r0 = r0 + r1
            r8 = r0
        L196:
            r0 = r7
            org.objectweb.asm.ModuleWriter r0 = r0.moduleWriter
            if (r0 == 0) goto L1b3
            r0 = r13
            r1 = r7
            org.objectweb.asm.ModuleWriter r1 = r1.moduleWriter
            int r1 = r1.getAttributeCount()
            int r0 = r0 + r1
            r13 = r0
            r0 = r8
            r1 = r7
            org.objectweb.asm.ModuleWriter r1 = r1.moduleWriter
            int r1 = r1.computeAttributesSize()
            int r0 = r0 + r1
            r8 = r0
        L1b3:
            r0 = r7
            int r0 = r0.nestHostClassIndex
            if (r0 == 0) goto L1cb
            int r13 = r13 + 1
            int r8 = r8 + 8
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "NestHost"
            int r0 = r0.addConstantUtf8(r1)
        L1cb:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.nestMemberClasses
            if (r0 == 0) goto L1ed
            int r13 = r13 + 1
            r0 = r8
            r1 = 8
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.nestMemberClasses
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "NestMembers"
            int r0 = r0.addConstantUtf8(r1)
        L1ed:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.permittedSubclasses
            if (r0 == 0) goto L20f
            int r13 = r13 + 1
            r0 = r8
            r1 = 8
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.permittedSubclasses
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "PermittedSubclasses"
            int r0 = r0.addConstantUtf8(r1)
        L20f:
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L227
            r0 = r7
            org.objectweb.asm.RecordComponentWriter r0 = r0.firstRecordComponent
            if (r0 == 0) goto L262
        L227:
            r0 = r7
            org.objectweb.asm.RecordComponentWriter r0 = r0.firstRecordComponent
            r16 = r0
        L22d:
            r0 = r16
            if (r0 == 0) goto L24c
            int r14 = r14 + 1
            r0 = r15
            r1 = r16
            int r1 = r1.computeRecordComponentInfoSize()
            int r0 = r0 + r1
            r15 = r0
            r0 = r16
            org.objectweb.asm.RecordComponentVisitor r0 = r0.delegate
            org.objectweb.asm.RecordComponentWriter r0 = (org.objectweb.asm.RecordComponentWriter) r0
            r16 = r0
            goto L22d
        L24c:
            int r13 = r13 + 1
            r0 = r8
            r1 = 8
            r2 = r15
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Record"
            int r0 = r0.addConstantUtf8(r1)
        L262:
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L283
            r0 = r13
            r1 = r7
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            int r1 = r1.getAttributeCount()
            int r0 = r0 + r1
            r13 = r0
            r0 = r8
            r1 = r7
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
            r8 = r0
        L283:
            r0 = r8
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            int r1 = r1.getConstantPoolLength()
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getConstantPoolCount()
            r16 = r0
            r0 = r16
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 <= r1) goto L2ae
            org.objectweb.asm.ClassTooLargeException r0 = new org.objectweb.asm.ClassTooLargeException
            r1 = r0
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            java.lang.String r2 = r2.getClassName()
            r3 = r16
            r1.<init>(r2, r3)
            throw r0
        L2ae:
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r17 = r0
            r0 = r17
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.version
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r17
            r0.putConstantPool(r1)
            r0 = r7
            int r0 = r0.version
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 >= r1) goto L2e3
            r0 = 4096(0x1000, float:5.74E-42)
            goto L2e4
        L2e3:
            r0 = 0
        L2e4:
            r18 = r0
            r0 = r17
            r1 = r7
            int r1 = r1.accessFlags
            r2 = r18
            r3 = -1
            r2 = r2 ^ r3
            r1 = r1 & r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            int r1 = r1.thisClass
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            int r1 = r1.superClass
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r17
            r1 = r7
            int r1 = r1.interfaceCount
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r19 = r0
        L310:
            r0 = r19
            r1 = r7
            int r1 = r1.interfaceCount
            if (r0 >= r1) goto L32c
            r0 = r17
            r1 = r7
            int[] r1 = r1.interfaces
            r2 = r19
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r19 = r19 + 1
            goto L310
        L32c:
            r0 = r17
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            org.objectweb.asm.FieldWriter r0 = r0.firstField
            r10 = r0
        L338:
            r0 = r10
            if (r0 == 0) goto L34d
            r0 = r10
            r1 = r17
            r0.putFieldInfo(r1)
            r0 = r10
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            org.objectweb.asm.FieldWriter r0 = (org.objectweb.asm.FieldWriter) r0
            r10 = r0
            goto L338
        L34d:
            r0 = r17
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r7
            org.objectweb.asm.MethodWriter r0 = r0.firstMethod
            r12 = r0
        L361:
            r0 = r12
            if (r0 == 0) goto L38e
            r0 = r19
            r1 = r12
            boolean r1 = r1.hasFrames()
            r0 = r0 | r1
            r19 = r0
            r0 = r20
            r1 = r12
            boolean r1 = r1.hasAsmInstructions()
            r0 = r0 | r1
            r20 = r0
            r0 = r12
            r1 = r17
            r0.putMethodInfo(r1)
            r0 = r12
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r12 = r0
            goto L361
        L38e:
            r0 = r17
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.innerClasses
            if (r0 == 0) goto L3d2
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "InnerClasses"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.innerClasses
            int r1 = r1.length
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.numberOfInnerClasses
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.innerClasses
            byte[] r1 = r1.data
            r2 = 0
            r3 = r7
            org.objectweb.asm.ByteVector r3 = r3.innerClasses
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L3d2:
            r0 = r7
            int r0 = r0.enclosingClassIndex
            if (r0 == 0) goto L3fb
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "EnclosingMethod"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 4
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.enclosingClassIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            int r1 = r1.enclosingMethodIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L3fb:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L426
            r0 = r7
            int r0 = r0.version
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 >= r1) goto L426
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Synthetic"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L426:
            r0 = r7
            int r0 = r0.signatureIndex
            if (r0 == 0) goto L448
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Signature"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.signatureIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L448:
            r0 = r7
            int r0 = r0.sourceFileIndex
            if (r0 == 0) goto L46a
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "SourceFile"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.sourceFileIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L46a:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.debugExtension
            if (r0 == 0) goto L49c
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.debugExtension
            int r0 = r0.length
            r21 = r0
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "SourceDebugExtension"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r21
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.debugExtension
            byte[] r1 = r1.data
            r2 = 0
            r3 = r21
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L49c:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L4bb
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Deprecated"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L4bb:
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
            r5 = r17
            org.objectweb.asm.AnnotationWriter.putAnnotations(r0, r1, r2, r3, r4, r5)
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r17
            r0.putBootstrapMethods(r1)
            r0 = r7
            org.objectweb.asm.ModuleWriter r0 = r0.moduleWriter
            if (r0 == 0) goto L4ed
            r0 = r7
            org.objectweb.asm.ModuleWriter r0 = r0.moduleWriter
            r1 = r17
            r0.putAttributes(r1)
        L4ed:
            r0 = r7
            int r0 = r0.nestHostClassIndex
            if (r0 == 0) goto L50f
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "NestHost"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.nestHostClassIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L50f:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.nestMemberClasses
            if (r0 == 0) goto L54b
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "NestMembers"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.nestMemberClasses
            int r1 = r1.length
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.numberOfNestMemberClasses
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.nestMemberClasses
            byte[] r1 = r1.data
            r2 = 0
            r3 = r7
            org.objectweb.asm.ByteVector r3 = r3.nestMemberClasses
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L54b:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.permittedSubclasses
            if (r0 == 0) goto L587
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "PermittedSubclasses"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.permittedSubclasses
            int r1 = r1.length
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r7
            int r1 = r1.numberOfPermittedSubclasses
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.permittedSubclasses
            byte[] r1 = r1.data
            r2 = 0
            r3 = r7
            org.objectweb.asm.ByteVector r3 = r3.permittedSubclasses
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L587:
            r0 = r7
            int r0 = r0.accessFlags
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L599
            r0 = r7
            org.objectweb.asm.RecordComponentWriter r0 = r0.firstRecordComponent
            if (r0 == 0) goto L5d4
        L599:
            r0 = r17
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Record"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r15
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r7
            org.objectweb.asm.RecordComponentWriter r0 = r0.firstRecordComponent
            r21 = r0
        L5bb:
            r0 = r21
            if (r0 == 0) goto L5d4
            r0 = r21
            r1 = r17
            r0.putRecordComponentInfo(r1)
            r0 = r21
            org.objectweb.asm.RecordComponentVisitor r0 = r0.delegate
            org.objectweb.asm.RecordComponentWriter r0 = (org.objectweb.asm.RecordComponentWriter) r0
            r21 = r0
            goto L5bb
        L5d4:
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L5e8
            r0 = r7
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r17
            r0.putAttributes(r1, r2)
        L5e8:
            r0 = r20
            if (r0 == 0) goto L5f9
            r0 = r7
            r1 = r17
            byte[] r1 = r1.data
            r2 = r19
            byte[] r0 = r0.replaceAsmInstructions(r1, r2)
            return r0
        L5f9:
            r0 = r17
            byte[] r0 = r0.data
            return r0
    }

    private byte[] replaceAsmInstructions(byte[] r7, boolean r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.Attribute[] r0 = r0.getAttributePrototypes()
            r9 = r0
            r0 = r6
            r1 = 0
            r0.firstField = r1
            r0 = r6
            r1 = 0
            r0.lastField = r1
            r0 = r6
            r1 = 0
            r0.firstMethod = r1
            r0 = r6
            r1 = 0
            r0.lastMethod = r1
            r0 = r6
            r1 = 0
            r0.lastRuntimeVisibleAnnotation = r1
            r0 = r6
            r1 = 0
            r0.lastRuntimeInvisibleAnnotation = r1
            r0 = r6
            r1 = 0
            r0.lastRuntimeVisibleTypeAnnotation = r1
            r0 = r6
            r1 = 0
            r0.lastRuntimeInvisibleTypeAnnotation = r1
            r0 = r6
            r1 = 0
            r0.moduleWriter = r1
            r0 = r6
            r1 = 0
            r0.nestHostClassIndex = r1
            r0 = r6
            r1 = 0
            r0.numberOfNestMemberClasses = r1
            r0 = r6
            r1 = 0
            r0.nestMemberClasses = r1
            r0 = r6
            r1 = 0
            r0.numberOfPermittedSubclasses = r1
            r0 = r6
            r1 = 0
            r0.permittedSubclasses = r1
            r0 = r6
            r1 = 0
            r0.firstRecordComponent = r1
            r0 = r6
            r1 = 0
            r0.lastRecordComponent = r1
            r0 = r6
            r1 = 0
            r0.firstAttribute = r1
            r0 = r6
            r1 = r8
            if (r1 == 0) goto L63
            r1 = 3
            goto L64
        L63:
            r1 = 0
        L64:
            r0.compute = r1
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r7
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r1 = r6
            r2 = r9
            r3 = r8
            if (r3 == 0) goto L7c
            r3 = 8
            goto L7d
        L7c:
            r3 = 0
        L7d:
            r4 = 256(0x100, float:3.59E-43)
            r3 = r3 | r4
            r0.accept(r1, r2, r3)
            r0 = r6
            byte[] r0 = r0.toByteArray()
            return r0
    }

    private org.objectweb.asm.Attribute[] getAttributePrototypes() {
            r3 = this;
            org.objectweb.asm.Attribute$Set r0 = new org.objectweb.asm.Attribute$Set
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r0.addAttributes(r1)
            r0 = r3
            org.objectweb.asm.FieldWriter r0 = r0.firstField
            r5 = r0
        L15:
            r0 = r5
            if (r0 == 0) goto L29
            r0 = r5
            r1 = r4
            r0.collectAttributePrototypes(r1)
            r0 = r5
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            org.objectweb.asm.FieldWriter r0 = (org.objectweb.asm.FieldWriter) r0
            r5 = r0
            goto L15
        L29:
            r0 = r3
            org.objectweb.asm.MethodWriter r0 = r0.firstMethod
            r6 = r0
        L2e:
            r0 = r6
            if (r0 == 0) goto L42
            r0 = r6
            r1 = r4
            r0.collectAttributePrototypes(r1)
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r6 = r0
            goto L2e
        L42:
            r0 = r3
            org.objectweb.asm.RecordComponentWriter r0 = r0.firstRecordComponent
            r7 = r0
        L48:
            r0 = r7
            if (r0 == 0) goto L60
            r0 = r7
            r1 = r4
            r0.collectAttributePrototypes(r1)
            r0 = r7
            org.objectweb.asm.RecordComponentVisitor r0 = r0.delegate
            org.objectweb.asm.RecordComponentWriter r0 = (org.objectweb.asm.RecordComponentWriter) r0
            r7 = r0
            goto L48
        L60:
            r0 = r4
            org.objectweb.asm.Attribute[] r0 = r0.toArray()
            return r0
    }

    public int newConst(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            org.objectweb.asm.Symbol r0 = r0.addConstant(r1)
            int r0 = r0.index
            return r0
    }

    public int newUTF8(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            int r0 = r0.addConstantUtf8(r1)
            return r0
    }

    public int newClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            int r0 = r0.index
            return r0
    }

    public int newMethodType(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            org.objectweb.asm.Symbol r0 = r0.addConstantMethodType(r1)
            int r0 = r0.index
            return r0
    }

    public int newModule(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            org.objectweb.asm.Symbol r0 = r0.addConstantModule(r1)
            int r0 = r0.index
            return r0
    }

    public int newPackage(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            org.objectweb.asm.Symbol r0 = r0.addConstantPackage(r1)
            int r0 = r0.index
            return r0
    }

    @java.lang.Deprecated
    public int newHandle(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = 9
            if (r5 != r6) goto L10
            r5 = 1
            goto L11
        L10:
            r5 = 0
        L11:
            int r0 = r0.newHandle(r1, r2, r3, r4, r5)
            return r0
    }

    public int newHandle(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.Symbol r0 = r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            int r0 = r0.index
            return r0
    }

    public int newConstantDynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Symbol r0 = r0.addConstantDynamic(r1, r2, r3, r4)
            int r0 = r0.index
            return r0
    }

    public int newInvokeDynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Symbol r0 = r0.addConstantInvokeDynamic(r1, r2, r3, r4)
            int r0 = r0.index
            return r0
    }

    public int newField(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r6
            r2 = r7
            r3 = r8
            org.objectweb.asm.Symbol r0 = r0.addConstantFieldref(r1, r2, r3)
            int r0 = r0.index
            return r0
    }

    public int newMethod(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Symbol r0 = r0.addConstantMethodref(r1, r2, r3, r4)
            int r0 = r0.index
            return r0
    }

    public int newNameType(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r5
            r2 = r6
            int r0 = r0.addConstantNameAndType(r1, r2)
            return r0
    }

    protected java.lang.String getCommonSuperClass(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r8 = r0
            r0 = r6
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 0
            r2 = r8
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L17
            r9 = r0
            goto L24
        L17:
            r10 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r1 = r0
            r2 = r6
            r3 = r10
            r1.<init>(r2, r3)
            throw r0
        L24:
            r0 = r7
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L36
            r1 = 0
            r2 = r8
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L36
            r10 = r0
            goto L43
        L36:
            r11 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r1 = r0
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3)
            throw r0
        L43:
            r0 = r9
            r1 = r10
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L4f
            r0 = r6
            return r0
        L4f:
            r0 = r10
            r1 = r9
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L5b
            r0 = r7
            return r0
        L5b:
            r0 = r9
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L6b
            r0 = r10
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L6f
        L6b:
            java.lang.String r0 = "java/lang/Object"
            return r0
        L6f:
            r0 = r9
            java.lang.Class r0 = r0.getSuperclass()
            r9 = r0
            r0 = r9
            r1 = r10
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L6f
            r0 = r9
            java.lang.String r0 = r0.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    protected java.lang.ClassLoader getClassLoader() {
            r2 = this;
            r0 = r2
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }
}
